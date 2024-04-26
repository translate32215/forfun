package com.google.android.gms.internal.ads;

import d7.l;
import e8.al;
import e8.c00;
import e8.ek;
import e8.fk;
import e8.pi;
import e8.pj;
import e8.t00;
import e8.wh0;
import e8.zh0;
import e8.zi;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jb implements pi, zi, pj, ek, al, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public final nv f7140a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public boolean f7141b = false;

    public jb(nv nvVar, @Nullable c00 c00) {
        this.f7140a = nvVar;
        nvVar.b(ov.AD_REQUEST);
        if (c00 != null) {
            nvVar.b(ov.REQUEST_IS_PREFETCH);
        }
    }

    public final void C0(t00 t00) {
        this.f7140a.a(new fk(t00, 1));
    }

    public final void F(vv vvVar) {
        nv nvVar = this.f7140a;
        synchronized (nvVar) {
            if (nvVar.f7660c) {
                try {
                    nvVar.f7659b.p(vvVar);
                } catch (NullPointerException e10) {
                    y6 y6Var = l.B.f13190g;
                    a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AdMobClearcutLogger.modify");
                }
            }
        }
        this.f7140a.b(ov.REQUEST_LOADED_FROM_CACHE);
        return;
    }

    public final synchronized void O() {
        this.f7140a.b(ov.AD_IMPRESSION);
    }

    public final void Y(vv vvVar) {
        nv nvVar = this.f7140a;
        synchronized (nvVar) {
            if (nvVar.f7660c) {
                try {
                    nvVar.f7659b.p(vvVar);
                } catch (NullPointerException e10) {
                    y6 y6Var = l.B.f13190g;
                    a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AdMobClearcutLogger.modify");
                }
            }
        }
        this.f7140a.b(ov.REQUEST_SAVED_TO_CACHE);
        return;
    }

    public final void a0() {
        this.f7140a.b(ov.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    public final void j0(zh0 zh0) {
        switch (zh0.f17753a) {
            case 1:
                this.f7140a.b(ov.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.f7140a.b(ov.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.f7140a.b(ov.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.f7140a.b(ov.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.f7140a.b(ov.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.f7140a.b(ov.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.f7140a.b(ov.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.f7140a.b(ov.AD_FAILED_TO_LOAD);
                return;
        }
    }

    public final void k0(l5 l5Var) {
    }

    public final void m(boolean z10) {
        ov ovVar;
        nv nvVar = this.f7140a;
        if (z10) {
            ovVar = ov.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
        } else {
            ovVar = ov.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
        }
        nvVar.b(ovVar);
    }

    public final synchronized void n() {
        if (!this.f7141b) {
            this.f7140a.b(ov.AD_FIRST_CLICK);
            this.f7141b = true;
            return;
        }
        this.f7140a.b(ov.AD_SUBSEQUENT_CLICK);
    }

    public final void t0(vv vvVar) {
        nv nvVar = this.f7140a;
        synchronized (nvVar) {
            if (nvVar.f7660c) {
                try {
                    nvVar.f7659b.p(vvVar);
                } catch (NullPointerException e10) {
                    y6 y6Var = l.B.f13190g;
                    a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AdMobClearcutLogger.modify");
                }
            }
        }
        this.f7140a.b(ov.REQUEST_PREFETCH_INTERCEPTED);
        return;
    }

    public final void v() {
        this.f7140a.b(ov.AD_LOADED);
    }

    public final void v0(boolean z10) {
        ov ovVar;
        nv nvVar = this.f7140a;
        if (z10) {
            ovVar = ov.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
        } else {
            ovVar = ov.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
        }
        nvVar.b(ovVar);
    }
}
