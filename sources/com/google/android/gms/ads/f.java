package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.hz;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5587a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    public hz f5588b;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public a f5589c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static abstract class a {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public final void a(a aVar) {
        i.i(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f5587a) {
            this.f5589c = aVar;
            hz hzVar = this.f5588b;
            if (hzVar != null) {
                try {
                    hzVar.x3(new e8.f(aVar));
                } catch (RemoteException e10) {
                    e.C("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
        }
    }

    public final void b(hz hzVar) {
        synchronized (this.f5587a) {
            this.f5588b = hzVar;
            a aVar = this.f5589c;
            if (aVar != null) {
                a(aVar);
            }
        }
    }

    public final hz c() {
        hz hzVar;
        synchronized (this.f5587a) {
            hzVar = this.f5588b;
        }
        return hzVar;
    }
}
