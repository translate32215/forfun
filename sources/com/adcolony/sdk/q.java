package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.n;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p.f;
import t2.o0;

public class q {

    /* renamed from: e  reason: collision with root package name */
    public static q f4706e;

    /* renamed from: a  reason: collision with root package name */
    public n f4707a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4708b = Executors.newSingleThreadExecutor();

    /* renamed from: c  reason: collision with root package name */
    public o0 f4709c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4710d = false;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t2.a f4711a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f4712b;

        public a(t2.a aVar, long j10) {
            this.f4711a = aVar;
            this.f4712b = j10;
        }

        public void run() {
            o0 o0Var;
            t2.a aVar = this.f4711a;
            q qVar = q.this;
            if (qVar.f4710d) {
                o0Var = qVar.f4709c;
            } else {
                i0 d10 = i0.d();
                n nVar = q.this.f4707a;
                long j10 = this.f4712b;
                if (d10.f4556c) {
                    SQLiteDatabase sQLiteDatabase = d10.f4555b;
                    Executor executor = d10.f4554a;
                    o0 o0Var2 = new o0(nVar.f4610a, (t) null);
                    try {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        executor.execute(new t(nVar, sQLiteDatabase, o0Var2, countDownLatch));
                        if (j10 > 0) {
                            countDownLatch.await(j10, TimeUnit.MILLISECONDS);
                        } else {
                            countDownLatch.await();
                        }
                    } catch (InterruptedException | RejectedExecutionException e10) {
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder a10 = android.support.v4.media.a.a("ADCDbReader.calculateFeatureVectors failed with: ");
                        a10.append(e10.toString());
                        sb2.append(a10.toString());
                        f.a(0, 0, sb2.toString(), true);
                    }
                    o0Var = o0Var2;
                } else {
                    o0Var = null;
                }
            }
            aVar.a(o0Var);
        }
    }

    public static ContentValues a(JSONObject jSONObject, n.a aVar) throws JSONException, NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        for (n.b next : aVar.f4617f) {
            if (jSONObject.has(next.f4621a)) {
                Object obj = jSONObject.get(next.f4621a);
                if (obj instanceof Boolean) {
                    contentValues.put(next.f4621a, (Boolean) obj);
                } else if (obj instanceof Long) {
                    contentValues.put(next.f4621a, (Long) obj);
                } else if (obj instanceof Double) {
                    contentValues.put(next.f4621a, (Double) obj);
                } else if (obj instanceof Number) {
                    Number number = (Number) obj;
                    if (number.doubleValue() != ((double) number.longValue()) || !"INTEGER".equalsIgnoreCase(next.f4622b)) {
                        contentValues.put(next.f4621a, Double.valueOf(number.doubleValue()));
                    } else {
                        contentValues.put(next.f4621a, Long.valueOf(number.longValue()));
                    }
                } else if (obj instanceof String) {
                    contentValues.put(next.f4621a, (String) obj);
                }
            }
        }
        return contentValues;
    }

    public static q c() {
        if (f4706e == null) {
            synchronized (q.class) {
                if (f4706e == null) {
                    f4706e = new q();
                }
            }
        }
        return f4706e;
    }

    public void b(t2.a<o0> aVar, long j10) {
        if (this.f4707a == null) {
            aVar.a(null);
        } else if (this.f4710d) {
            aVar.a(this.f4709c);
        } else {
            try {
                this.f4708b.execute(new a(aVar, j10));
            } catch (RejectedExecutionException e10) {
                StringBuilder sb2 = new StringBuilder();
                StringBuilder a10 = android.support.v4.media.a.a("ADCOdtEventsListener.calculateFeatureVectors failed with: ");
                a10.append(e10.toString());
                sb2.append(a10.toString());
                f.a(0, 0, sb2.toString(), true);
            }
        }
    }
}
