package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.c;
import e.h;
import e7.k;
import e8.e00;
import e8.f00;
import e8.g00;
import e8.gk;
import e8.hk;
import e8.hz;
import e8.jk;
import e8.l00;
import e8.li;
import e8.lk;
import e8.nv;
import e8.ov;
import e8.qv;
import e8.rv;
import e8.sv;
import e8.tj;
import e8.tv;
import e8.uv;
import e8.wh0;
import e8.wi;
import e8.zh0;
import e8.zi;
import javax.annotation.Nullable;
import k7.a;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f9 extends a implements z6.a, k, li, wi, zi, tj, e9, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public final ri f6448a = new ri(this, (h) null);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public ov f6449b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public gd f6450c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public hz f6451d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public e00 f6452e;

    public static <T> void y(T t10, lk<T> lkVar) {
        if (t10 != null) {
            lkVar.g(t10);
        }
    }

    public final void C() {
        ov ovVar = this.f6449b;
        if (ovVar != null) {
            androidx.activity.k.d(ovVar.f15843a, nv.f15716a);
            androidx.activity.k.d(ovVar.f15847e, qv.f16209a);
        }
        e00 e00 = this.f6452e;
        if (e00 != null) {
            e00.C();
        }
    }

    public final void F() {
        ov ovVar = this.f6449b;
        if (ovVar != null) {
            androidx.activity.k.d(ovVar.f15843a, tv.f16813a);
            androidx.activity.k.d(ovVar.f15847e, uv.f16998a);
        }
        e00 e00 = this.f6452e;
        if (e00 != null) {
            e00.F();
        }
    }

    public final void G1() {
        hz hzVar = this.f6451d;
        if (hzVar != null) {
            hzVar.G1();
        }
    }

    public final void J() {
        ov ovVar = this.f6449b;
        if (ovVar != null) {
            androidx.activity.k.d(ovVar.f15843a, sv.f16525a);
        }
        e00 e00 = this.f6452e;
        if (e00 != null) {
            while (true) {
                e00 e002 = e00.f14352i;
                if (e002 != null) {
                    e00 = e002;
                } else {
                    androidx.activity.k.d(e00.f14348e, l00.f15348a);
                    return;
                }
            }
        }
    }

    public final void J3(c cVar) {
        hz hzVar = this.f6451d;
        if (hzVar != null) {
            hzVar.J3(cVar);
        }
    }

    public final void O() {
        ov ovVar = this.f6449b;
        if (ovVar != null) {
            androidx.activity.k.d(ovVar.f15843a, rv.f16344a);
        }
    }

    public final void a(String str, String str2) {
        ov ovVar = this.f6449b;
        if (ovVar != null) {
            ovVar.a(str, str2);
        }
    }

    public final void d0() {
        ov ovVar = this.f6449b;
        e00 e00 = this.f6452e;
        if (e00 != null) {
            while (true) {
                e00 e002 = e00.f14352i;
                if (e002 != null) {
                    e00 = e002;
                } else {
                    androidx.activity.k.d(e00.f14348e, f00.f14524a);
                    return;
                }
            }
        }
    }

    public final void g(zh0 zh0) {
        e00 e00 = this.f6452e;
        if (e00 != null) {
            e00.g(zh0);
        }
        ov ovVar = this.f6449b;
        if (ovVar != null) {
            ovVar.g(zh0);
        }
    }

    public final void g0() {
        ov ovVar = this.f6449b;
        e00 e00 = this.f6452e;
        if (e00 != null) {
            while (true) {
                e00 e002 = e00.f14352i;
                if (e002 != null) {
                    e00 = e002;
                } else {
                    androidx.activity.k.d(e00.f14348e, g00.f14696a);
                    return;
                }
            }
        }
    }

    public final void l(fx fxVar) {
        cz czVar;
        ov ovVar = this.f6449b;
        if (!(ovVar == null || (czVar = ovVar.f15845c.get()) == null)) {
            try {
                czVar.I1(fxVar);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        e00 e00 = this.f6452e;
        if (e00 != null) {
            e00.l(fxVar);
        }
    }

    public final void n() {
        y(this.f6449b, gk.f14789a);
        y(this.f6450c, hk.f14920a);
    }

    public final void o4() {
        hz hzVar = this.f6451d;
        if (hzVar != null) {
            hzVar.o4();
        }
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void t(m5 m5Var, String str, String str2) {
        ov ovVar = this.f6449b;
        e00 e00 = this.f6452e;
        if (e00 != null) {
            e00.t(m5Var, str, str2);
        }
    }

    public final void w() {
        y(this.f6452e, jk.f15154a);
    }

    public final void x0() {
        hz hzVar = this.f6451d;
        if (hzVar != null) {
            hzVar.x0();
        }
    }
}
