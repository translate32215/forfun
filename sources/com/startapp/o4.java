package com.startapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.c2;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
public class o4 {

    /* renamed from: a  reason: collision with root package name */
    public final l4 f11491a;

    /* renamed from: b  reason: collision with root package name */
    public final r3 f11492b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f11493c;

    /* renamed from: d  reason: collision with root package name */
    public final d3<Integer> f11494d;

    /* renamed from: e  reason: collision with root package name */
    public final c2 f11495e;

    /* renamed from: f  reason: collision with root package name */
    public final c3<i4, k4, n4, t4> f11496f;

    /* renamed from: g  reason: collision with root package name */
    public final d3<AnalyticsConfig> f11497g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Pair<k4, Long>> f11498h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicLong f11499i = new AtomicLong();

    /* renamed from: j  reason: collision with root package name */
    public final d3<Void> f11500j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f11501k = new b();

    /* renamed from: l  reason: collision with root package name */
    public final d3<Void> f11502l = new c();

    /* renamed from: m  reason: collision with root package name */
    public final n4 f11503m = new d();

    /* renamed from: n  reason: collision with root package name */
    public final b3<i4, Void> f11504n = new g();

    /* compiled from: Sta */
    public class a implements d3<Void> {
        public a() {
        }

        public Object call() {
            try {
                o4 o4Var = o4.this;
                o4Var.f11492b.execute(new q4(o4Var));
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            try {
                o4.this.b();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Sta */
    public class c implements d3<Void> {
        public c() {
        }

        public Object call() {
            try {
                o4.this.a(0);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Sta */
    public class d implements n4 {
        public d() {
        }

        public void a(i4 i4Var, int i10) {
            try {
                o4 o4Var = o4.this;
                o4Var.getClass();
                o4Var.f11492b.execute(new p4(o4Var, i4Var, i10, System.currentTimeMillis()));
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Sta */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i4 f11509a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k4 f11510b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n4 f11511c;

        public e(i4 i4Var, k4 k4Var, n4 n4Var) {
            this.f11509a = i4Var;
            this.f11510b = k4Var;
            this.f11511c = n4Var;
        }

        public void run() {
            int i10;
            o4 o4Var = o4.this;
            i4 i4Var = this.f11509a;
            k4 k4Var = this.f11510b;
            n4 n4Var = this.f11511c;
            o4Var.getClass();
            try {
                i10 = o4Var.f11491a.a(i4Var, k4Var) ? 2 : 3;
                if (n4Var == null) {
                    return;
                }
            } catch (Throwable unused) {
                if (n4Var != null) {
                    i10 = 0;
                } else {
                    return;
                }
            }
            n4Var.a(i4Var, i10);
        }
    }

    /* compiled from: Sta */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i4 f11513a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k4 f11514b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n4 f11515c;

        public f(long j10, i4 i4Var, k4 k4Var, n4 n4Var) {
            this.f11513a = i4Var;
            this.f11514b = k4Var;
            this.f11515c = n4Var;
        }

        public void run() {
            o4.this.a(this.f11513a, this.f11514b, this.f11515c);
        }
    }

    /* compiled from: Sta */
    public class g implements b3<i4, Void> {
        public g() {
        }

        public Object a(Object obj) {
            i4 i4Var = (i4) obj;
            if (i4Var == null) {
                return null;
            }
            try {
                o4.this.a(i4Var);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public o4(l4 l4Var, r3 r3Var, Executor executor, d3<Integer> d3Var, c2 c2Var, c3<i4, k4, n4, t4> c3Var, d3<AnalyticsConfig> d3Var2) {
        this.f11491a = l4Var;
        this.f11492b = r3Var;
        this.f11493c = executor;
        this.f11494d = d3Var;
        this.f11495e = c2Var;
        this.f11496f = c3Var;
        this.f11497g = d3Var2;
    }

    /* JADX INFO: finally extract failed */
    public void a(i4 i4Var) {
        k4 a10 = a(i4Var.f10534a);
        long uptimeMillis = (this.f11499i.get() + a10.f10786f) - SystemClock.uptimeMillis();
        if (uptimeMillis > 0) {
            a(uptimeMillis);
            return;
        }
        l4 l4Var = this.f11491a;
        long currentTimeMillis = System.currentTimeMillis();
        l4Var.getClass();
        long j10 = i4Var.f10535b;
        l4.a(j10, currentTimeMillis);
        SQLiteDatabase a11 = l4Var.a();
        a11.beginTransaction();
        try {
            int a12 = l4.a(a11, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(currentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(a12 + 1));
            a11.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
            a11.setTransactionSuccessful();
            a11.endTransaction();
            a(i4Var, a10, this.f11503m);
        } catch (Throwable th) {
            a11.endTransaction();
            throw th;
        }
    }

    public void b() {
        this.f11492b.a(this.f11501k);
        if (!this.f11495e.a()) {
            AnalyticsConfig call = this.f11497g.call();
            long j10 = 300000;
            if (call != null) {
                j10 = Math.max(300000, wb.e(call.f()));
            }
            a(j10);
            return;
        }
        Integer call2 = this.f11494d.call();
        int i10 = 1;
        int max = call2 != null ? Math.max(1, call2.intValue()) : 1;
        AnalyticsConfig call3 = this.f11497g.call();
        if (call3 != null) {
            i10 = Math.max(1, call3.g());
        }
        try {
            this.f11491a.a(this.f11504n, i10, max);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        ConnectivityManager connectivityManager;
        if (this.f11499i.compareAndSet(0, SystemClock.uptimeMillis())) {
            l4 l4Var = this.f11491a;
            d3<Void> d3Var = this.f11502l;
            synchronized (l4Var) {
                l4Var.f10811c.add(d3Var);
            }
            c2 c2Var = this.f11495e;
            d3<Void> d3Var2 = this.f11500j;
            synchronized (c2Var.f10230c) {
                if (!c2Var.f10230c.contains(d3Var2)) {
                    c2Var.f10230c.add(d3Var2);
                }
            }
            c2 c2Var2 = this.f11495e;
            if (!c2Var2.f10231d.getAndSet(true)) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 21 && (connectivityManager = (ConnectivityManager) c2Var2.f10228a.getSystemService("connectivity")) != null) {
                        connectivityManager.addDefaultNetworkActiveListener(new b2(c2Var2));
                        ConnectivityHelperMetadata call = c2Var2.f10229b.call();
                        c2.a aVar = null;
                        ConnectivityHelperMetadata.Transport a10 = call != null ? call.a() : null;
                        if (a10 != null) {
                            if (i10 >= 24 && wb.a(i10, a10.a())) {
                                aVar = new b(c2Var2.f10228a, connectivityManager);
                            } else if (wb.a(i10, a10.b())) {
                                aVar = new v(c2Var2.f10228a, connectivityManager);
                            }
                            if (aVar != null) {
                                aVar.b();
                                c2Var2.f10232e = aVar;
                            }
                        }
                    }
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
            this.f11492b.execute(new q4(this));
        }
    }

    public final k4 a(j4 j4Var) {
        k4 k4Var;
        Map<String, AnalyticsCategoryConfig> d10;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f11498h) {
            Pair pair = this.f11498h.get(j4Var.f10602a);
            k4Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (k4) pair.first;
        }
        if (k4Var != null) {
            return k4Var;
        }
        AnalyticsConfig call = this.f11497g.call();
        if (!(call == null || (d10 = call.d()) == null || (analyticsCategoryConfig = d10.get(j4Var.f10602a)) == null)) {
            k4Var = new k4(j4Var.f10603b, analyticsCategoryConfig);
        }
        if (k4Var == null) {
            k4Var = j4Var.f10603b;
        }
        synchronized (this.f11498h) {
            this.f11498h.put(j4Var.f10602a, new Pair(k4Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return k4Var;
    }

    public void a(i4 i4Var, n4 n4Var) {
        AnalyticsConfig call = this.f11497g.call();
        if (call != null && !call.dns) {
            k4 a10 = a(i4Var.f10534a);
            if (Math.random() < a10.f10781a) {
                if (a10.f10784d) {
                    this.f11492b.execute(new e(i4Var, a10, (n4) null));
                } else if (this.f11495e.a()) {
                    long uptimeMillis = (this.f11499i.get() + a10.f10786f) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0) {
                        this.f11492b.a(new f(uptimeMillis, i4Var, a10, (n4) null), uptimeMillis);
                    } else {
                        a(i4Var, a10, (n4) null);
                    }
                }
            }
        }
    }

    public void a(long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        this.f11492b.a(this.f11501k, j10);
    }

    /* JADX INFO: finally extract failed */
    public void a(i4 i4Var, int i10, long j10) {
        if (i10 == 1) {
            l4 l4Var = this.f11491a;
            l4Var.getClass();
            long j11 = i4Var.f10535b;
            l4.a(j11, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j10));
            l4Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j11)});
            a(0);
            return;
        }
        AnalyticsConfig call = this.f11497g.call();
        int max = call != null ? Math.max(1, call.g()) : 1;
        l4 l4Var2 = this.f11491a;
        l4Var2.getClass();
        long j12 = i4Var.f10535b;
        l4.a(j12, j10);
        SQLiteDatabase a10 = l4Var2.a();
        a10.beginTransaction();
        try {
            if (l4.a(a10, j12) >= max) {
                a10.delete("events", "rowid = ?", new String[]{String.valueOf(j12)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j10));
                a10.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j12)});
            }
            a10.setTransactionSuccessful();
            a10.endTransaction();
            AnalyticsConfig call2 = this.f11497g.call();
            long j13 = 1000;
            if (call2 != null) {
                j13 = Math.max(1000, call2.h());
            }
            a(j13);
        } catch (Throwable th) {
            a10.endTransaction();
            throw th;
        }
    }

    public void a(i4 i4Var, k4 k4Var, n4 n4Var) {
        Runnable a10 = this.f11496f.a(i4Var, k4Var, n4Var);
        if (a10 != null) {
            this.f11493c.execute(a10);
        } else if (n4Var != null) {
            n4Var.a(i4Var, 0);
        }
    }
}
