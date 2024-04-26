package e8;

import java.util.Collections;
import java.util.Set;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mg implements ta0<dg> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15505a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<eg> f15506b;

    public mg(g gVar, ab0 ab0, int i10) {
        this.f15505a = i10;
        if (i10 != 1) {
            this.f15506b = ab0;
        } else {
            this.f15506b = ab0;
        }
    }

    public final Object get() {
        switch (this.f15505a) {
            case 0:
                eg egVar = this.f15506b.get();
                jc0.b(egVar, "Cannot return null from a non-@Nullable @Provides method");
                return egVar;
            default:
                Set singleton = Collections.singleton(new ul((wg) this.f15506b.get(), h9.f14886f));
                jc0.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
                return singleton;
        }
    }
}
