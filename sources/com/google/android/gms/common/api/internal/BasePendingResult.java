package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import g8.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import t7.d;
import t7.e;
import t7.h;
import t7.i;
import u7.a0;
import u7.g0;
import v7.c;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class BasePendingResult<R extends h> extends e<R> {
    public static final ThreadLocal<Boolean> zaa = new g0();
    @KeepName
    public k mResultGuardian;
    public final a<R> zab = new a<>(Looper.getMainLooper());
    public final WeakReference<d> zac = new WeakReference<>((Object) null);
    public final Object zae = new Object();
    public final CountDownLatch zaf = new CountDownLatch(1);
    public final ArrayList<e.a> zag = new ArrayList<>();
    public i<? super R> zah;
    public final AtomicReference<a0> zai = new AtomicReference<>();
    public R zaj;
    public Status zak;
    public volatile boolean zal;
    public boolean zam;
    public boolean zan;
    public c zao;
    public boolean zaq = false;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class a<R extends h> extends f {
        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                i iVar = (i) pair.first;
                h hVar = (h) pair.second;
                try {
                    iVar.a(hVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(hVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i10);
                Log.wtf("BasePendingResult", sb2.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f5741g);
            }
        }
    }

    public static void zal(h hVar) {
        if (hVar instanceof t7.f) {
            try {
                ((t7.f) hVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(hVar)), e10);
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r10);
                return;
            }
            isReady();
            com.google.android.gms.common.internal.i.k(!isReady(), "Results have already been set");
            com.google.android.gms.common.internal.i.k(!this.zal, "Result has already been consumed");
            zab(r10);
        }
    }

    public final R zaa() {
        R r10;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.i.k(!this.zal, "Result has already been consumed.");
            com.google.android.gms.common.internal.i.k(isReady(), "Result is not ready.");
            r10 = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet((Object) null) == null) {
            com.google.android.gms.common.internal.i.h(r10);
            return (h) r10;
        }
        throw null;
    }

    public final void zab(R r10) {
        this.zaj = r10;
        this.zak = r10.h();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            i<? super R> iVar = this.zah;
            if (iVar != null) {
                this.zab.removeMessages(2);
                a<R> aVar = this.zab;
                h zaa2 = zaa();
                aVar.getClass();
                aVar.sendMessage(aVar.obtainMessage(1, new Pair(iVar, zaa2)));
            } else if (this.zaj instanceof t7.f) {
                this.mResultGuardian = new k(this);
            }
        }
        ArrayList<e.a> arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(this.zak);
        }
        this.zag.clear();
    }
}
