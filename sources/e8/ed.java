package e8;

import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.dp;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.q2;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ed implements ta0<ue> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14397a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14398b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<b8> f14399c;

    public ed(l2 l2Var, ab0 ab0) {
        this.f14398b = l2Var;
        this.f14399c = ab0;
    }

    public static String a(uh uhVar) {
        String str = uhVar.f16959b.f8497e;
        jc0.b(str, "Cannot return null from a non-@Nullable @Provides method");
        return str;
    }

    public final Object get() {
        switch (this.f14397a) {
            case 0:
                b8 b8Var = this.f14399c.get();
                jc0.b(b8Var, "Cannot return null from a non-@Nullable @Provides method");
                return b8Var;
            case 1:
                Set singleton = Collections.singleton(new ul((wg) this.f14399c.get(), h9.f14886f));
                jc0.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
                return singleton;
            case 2:
                return new ul((zh) this.f14399c.get(), h9.f14886f);
            case 3:
                b9 b9Var = (b9) this.f14398b;
                return a((uh) this.f14399c.get());
            case 4:
                ka kaVar = (ka) this.f14399c.get();
                jc0.b(kaVar, "Cannot return null from a non-@Nullable @Provides method");
                return kaVar;
            case 5:
                return new ul((vp) this.f14399c.get(), h9.f14885e);
            default:
                x8 x8Var = ((h10) this.f14399c.get()).f14843c;
                jc0.b(x8Var, "Cannot return null from a non-@Nullable @Provides method");
                return x8Var;
        }
    }

    public ed(q2 q2Var, ab0 ab0) {
        this.f14398b = q2Var;
        this.f14399c = ab0;
    }

    public ed(c8 c8Var, ab0 ab0) {
        this.f14398b = c8Var;
        this.f14399c = ab0;
    }

    public ed(b9 b9Var, ab0 ab0) {
        this.f14398b = b9Var;
        this.f14399c = ab0;
    }

    public ed(dp dpVar, ab0 ab0) {
        this.f14398b = dpVar;
        this.f14399c = ab0;
    }

    public ed(Cif ifVar, ab0 ab0) {
        this.f14398b = ifVar;
        this.f14399c = ab0;
    }

    public ed(eo eoVar, ab0 ab0) {
        this.f14398b = eoVar;
        this.f14399c = ab0;
    }
}
