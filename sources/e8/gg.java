package e8;

import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class gg implements qk {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14778a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14779b;

    public gg(t7 t7Var) {
        this.f14779b = t7Var;
    }

    public final void r0() {
        switch (this.f14778a) {
            case 0:
                d9 d9Var = (d9) this.f14779b;
                synchronized (d9Var) {
                    d9Var.f6194f = false;
                    d9Var.L0(0);
                }
                return;
            default:
                t7 t7Var = (t7) this.f14779b;
                if (t7Var.K() != null) {
                    t7Var.K().s6();
                    return;
                }
                return;
        }
    }

    public gg(d9 d9Var) {
        this.f14779b = d9Var;
    }
}
