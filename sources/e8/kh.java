package e8;

import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.re;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kh implements ta0<re> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15287a;

    /* renamed from: b  reason: collision with root package name */
    public final j8 f15288b;

    public kh(j8 j8Var, int i10) {
        this.f15287a = i10;
        if (i10 != 1) {
            this.f15288b = j8Var;
        } else {
            this.f15288b = j8Var;
        }
    }

    public static kh a(j8 j8Var) {
        return new kh(j8Var, 0);
    }

    public static kh b(j8 j8Var) {
        return new kh(j8Var, 1);
    }

    public static t00 c(j8 j8Var) {
        t00 t00 = (t00) j8Var.f7134b;
        jc0.b(t00, "Cannot return null from a non-@Nullable @Provides method");
        return t00;
    }

    public final Object get() {
        switch (this.f15287a) {
            case 0:
                re reVar = (re) ((t00) this.f15288b.f7134b).f16701b.f7135c;
                jc0.b(reVar, "Cannot return null from a non-@Nullable @Provides method");
                return reVar;
            default:
                return c(this.f15288b);
        }
    }
}
