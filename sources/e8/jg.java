package e8;

import com.google.android.gms.internal.ads.d9;
import java.util.Collections;
import java.util.Set;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jg implements ta0<mj> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15142a;

    /* renamed from: b  reason: collision with root package name */
    public final g f15143b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<Set<ul<pj>>> f15144c;

    public jg(g gVar, ab0 ab0, int i10) {
        this.f15142a = i10;
        if (i10 == 1) {
            this.f15143b = gVar;
            this.f15144c = ab0;
        } else if (i10 != 2) {
            this.f15143b = gVar;
            this.f15144c = ab0;
        } else {
            this.f15143b = gVar;
            this.f15144c = ab0;
        }
    }

    public final Object get() {
        switch (this.f15142a) {
            case 0:
                mj v10 = this.f15143b.v(this.f15144c.get());
                jc0.b(v10, "Cannot return null from a non-@Nullable @Provides method");
                return v10;
            case 1:
                Set singleton = Collections.singleton(new ul((wg) this.f15144c.get(), h9.f14886f));
                jc0.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
                return singleton;
            default:
                return new ul(new gg((d9) this.f15144c.get()), h9.f14886f);
        }
    }
}
