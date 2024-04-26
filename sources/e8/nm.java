package e8;

import com.google.android.gms.internal.ads.v9;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nm implements ta0<ul<pj>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15695a;

    /* renamed from: b  reason: collision with root package name */
    public final gf0 f15696b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<v9> f15697c;

    public nm(gf0 gf0, ab0 ab0, int i10) {
        this.f15695a = i10;
        if (i10 != 1) {
            this.f15696b = gf0;
            this.f15697c = ab0;
            return;
        }
        this.f15696b = gf0;
        this.f15697c = ab0;
    }

    public static nm a(gf0 gf0, ab0<v9> ab0) {
        return new nm(gf0, ab0, 0);
    }

    public static nm b(gf0 gf0, ab0<bi> ab0) {
        return new nm(gf0, ab0, 1);
    }

    public final Object get() {
        switch (this.f15695a) {
            case 0:
                return new ul(this.f15697c.get(), h9.f14885e);
            default:
                Set<ul<li>> p10 = this.f15696b.p((bi) this.f15697c.get());
                jc0.b(p10, "Cannot return null from a non-@Nullable @Provides method");
                return p10;
        }
    }
}
