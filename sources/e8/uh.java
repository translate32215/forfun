package e8;

import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.m5;
import com.google.android.gms.internal.ads.x6;
import com.google.android.gms.internal.ads.z6;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uh implements li, zi, pj, ek, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f16958a;

    /* renamed from: b  reason: collision with root package name */
    public final x6 f16959b;

    public uh(b bVar, x6 x6Var) {
        this.f16958a = bVar;
        this.f16959b = x6Var;
    }

    public final void C() {
        x6 x6Var = this.f16959b;
        synchronized (x6Var.f8496d) {
            if (x6Var.f8503k != -1 && !x6Var.f8495c.isEmpty()) {
                t8 last = x6Var.f8495c.getLast();
                if (last.f16713b == -1) {
                    last.f16713b = last.f16714c.f8493a.a();
                    x6Var.f8494b.b(x6Var);
                }
            }
        }
    }

    public final void C0(t00 t00) {
        x6 x6Var = this.f16959b;
        long a10 = this.f16958a.a();
        synchronized (x6Var.f8496d) {
            x6Var.f8503k = a10;
            if (a10 != -1) {
                x6Var.f8494b.b(x6Var);
            }
        }
    }

    public final void F() {
    }

    public final void J() {
    }

    public final void O() {
        x6 x6Var = this.f16959b;
        synchronized (x6Var.f8496d) {
            if (x6Var.f8503k != -1 && x6Var.f8499g == -1) {
                x6Var.f8499g = x6Var.f8493a.a();
                x6Var.f8494b.b(x6Var);
            }
            x8 x8Var = x6Var.f8494b;
            synchronized (x8Var.f17444a) {
                z6 z6Var = x8Var.f17447d;
                synchronized (z6Var.f8676f) {
                    z6Var.f8680j++;
                }
            }
        }
    }

    public final void a(fi0 fi0) {
        x6 x6Var = this.f16959b;
        synchronized (x6Var.f8496d) {
            long a10 = x6Var.f8493a.a();
            x6Var.f8502j = a10;
            x8 x8Var = x6Var.f8494b;
            synchronized (x8Var.f17444a) {
                x8Var.f17447d.a(fi0, a10);
            }
        }
    }

    public final void d0() {
    }

    public final void g0() {
    }

    public final void k0(l5 l5Var) {
    }

    public final void n() {
        x6 x6Var = this.f16959b;
        synchronized (x6Var.f8496d) {
            if (x6Var.f8503k != -1) {
                t8 t8Var = new t8(x6Var);
                t8Var.f16712a = x6Var.f8493a.a();
                x6Var.f8495c.add(t8Var);
                x6Var.f8501i++;
                x8 x8Var = x6Var.f8494b;
                synchronized (x8Var.f17444a) {
                    z6 z6Var = x8Var.f17447d;
                    synchronized (z6Var.f8676f) {
                        z6Var.f8679i++;
                    }
                }
                x6Var.f8494b.b(x6Var);
            }
        }
    }

    public final void t(m5 m5Var, String str, String str2) {
    }

    public final void v() {
        x6 x6Var = this.f16959b;
        synchronized (x6Var.f8496d) {
            if (x6Var.f8503k != -1) {
                x6Var.f8500h = x6Var.f8493a.a();
            }
        }
    }
}
