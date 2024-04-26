package e8;

import android.os.RemoteException;
import androidx.activity.k;
import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.e6;
import com.google.android.gms.internal.ads.e9;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.g6;
import com.google.android.gms.internal.ads.k6;
import com.google.android.gms.internal.ads.m5;
import com.google.android.gms.internal.ads.m6;
import com.google.android.gms.internal.ads.p5;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.t5;
import java.util.concurrent.atomic.AtomicReference;
import k7.a;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e00 extends a implements li, pi, wi, pj, e9, zz {

    /* renamed from: a  reason: collision with root package name */
    public final i10 f14344a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<a> f14345b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<g6> f14346c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<e6> f14347d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<t5> f14348e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<k6> f14349f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<p5> f14350g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<cz> f14351h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    public e00 f14352i = null;

    public e00(i10 i10) {
        this.f14344a = i10;
    }

    public final void C() {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 != null) {
                e00 = e002;
            } else {
                e00.f14344a.a();
                k.d(e00.f14347d, j00.f15082a);
                k.d(e00.f14348e, m00.f15444a);
                return;
            }
        }
    }

    public final void F() {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 != null) {
                e00 = e002;
            } else {
                k.d(e00.f14347d, i00.f14967a);
                k.d(e00.f14348e, k00.f15209a);
                return;
            }
        }
    }

    public final void J() {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 != null) {
                e00 = e002;
            } else {
                k.d(e00.f14348e, l00.f15348a);
                return;
            }
        }
    }

    public final void d0() {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 != null) {
                e00 = e002;
            } else {
                k.d(e00.f14348e, f00.f14524a);
                return;
            }
        }
    }

    public final void g(zh0 zh0) {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 != null) {
                e00 = e002;
            } else {
                k.d(e00.f14347d, new qi(zh0, 6));
                k.d(e00.f14347d, new qi(zh0, 5));
                return;
            }
        }
    }

    public final void g0() {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 != null) {
                e00 = e002;
            } else {
                k.d(e00.f14348e, g00.f14696a);
                return;
            }
        }
    }

    public final void j0(zh0 zh0) {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 == null) {
                break;
            }
            e00 = e002;
        }
        int i10 = zh0.f17753a;
        g6 g6Var = e00.f14346c.get();
        if (g6Var != null) {
            try {
                g6Var.J5(zh0);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        g6 g6Var2 = e00.f14346c.get();
        if (g6Var2 != null) {
            try {
                g6Var2.x2(i10);
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
        t5 t5Var = e00.f14348e.get();
        if (t5Var != null) {
            try {
                t5Var.F2(i10);
            } catch (RemoteException e12) {
                e.F("#007 Could not call remote method.", e12);
            }
        }
    }

    public final void l(fx fxVar) {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 != null) {
                e00 = e002;
            } else {
                k.d(e00.f14351h, new ik(fxVar, 2));
                return;
            }
        }
    }

    public final void m(zz zzVar) {
        this.f14352i = (e00) zzVar;
    }

    public final void t(m5 m5Var, String str, String str2) {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 == null) {
                break;
            }
            e00 = e002;
        }
        k.d(e00.f14347d, new ri(m5Var));
        k6 k6Var = e00.f14349f.get();
        if (k6Var != null) {
            try {
                k6Var.m4(new m6(m5Var.o(), m5Var.q0()), str, str2);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        k.d(e00.f14348e, new t7(m5Var, 1));
        p5 p5Var = e00.f14350g.get();
        if (p5Var != null) {
            try {
                p5Var.r4(m5Var, str, str2);
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
    }

    public final void v() {
        e00 e00 = this;
        while (true) {
            e00 e002 = e00.f14352i;
            if (e002 == null) {
                break;
            }
            e00 = e002;
        }
        g6 g6Var = e00.f14346c.get();
        if (g6Var != null) {
            try {
                g6Var.M1();
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        t5 t5Var = e00.f14348e.get();
        if (t5Var != null) {
            try {
                t5Var.e5();
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
    }

    public final void w() {
        e00 e00 = this.f14352i;
        if (e00 != null) {
            e00.w();
        } else {
            k.d(this.f14345b, h00.f14840a);
        }
    }
}
