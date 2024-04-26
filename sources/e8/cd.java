package e8;

import com.google.android.gms.internal.ads.ac;
import com.google.android.gms.internal.ads.c8;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.tc;
import com.google.android.gms.internal.ads.ub;
import com.google.android.gms.internal.ads.ue;
import f7.d0;
import java.util.Collections;
import java.util.Set;
import y3.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cd implements ta0<ub<ue, ac>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14117a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14118b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<gb> f14119c;

    public cd(l2 l2Var, ab0 ab0) {
        this.f14118b = l2Var;
        this.f14119c = ab0;
    }

    public static d0 a(h10 h10) {
        d0 d0Var = h10.f14842b;
        jc0.b(d0Var, "Cannot return null from a non-@Nullable @Provides method");
        return d0Var;
    }

    public final Object get() {
        switch (this.f14117a) {
            case 0:
                return new tc(this.f14119c.get());
            case 1:
                Set singleton = Collections.singleton(new ul((wg) this.f14119c.get(), h9.f14886f));
                jc0.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
                return singleton;
            case 2:
                return new ul((uh) this.f14119c.get(), h9.f14886f);
            case 3:
                on onVar = (on) this.f14119c.get();
                jc0.b(onVar, "Cannot return null from a non-@Nullable @Provides method");
                return onVar;
            default:
                l2 l2Var = (l2) this.f14118b;
                return a((h10) this.f14119c.get());
        }
    }

    public cd(c8 c8Var, ab0 ab0) {
        this.f14118b = c8Var;
        this.f14119c = ab0;
    }

    public cd(p9 p9Var, ab0 ab0) {
        this.f14118b = p9Var;
        this.f14119c = ab0;
    }

    public cd(Cif ifVar, ab0 ab0) {
        this.f14118b = ifVar;
        this.f14119c = ab0;
    }

    public cd(b bVar, ab0 ab0) {
        this.f14118b = bVar;
        this.f14119c = ab0;
    }
}
