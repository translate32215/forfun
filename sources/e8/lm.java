package e8;

import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.ya;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lm implements ta0<Set<ul<wi>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15408a;

    /* renamed from: b  reason: collision with root package name */
    public final gf0 f15409b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<bi> f15410c;

    public lm(gf0 gf0, ab0 ab0, int i10) {
        this.f15408a = i10;
        if (i10 == 1) {
            this.f15409b = gf0;
            this.f15410c = ab0;
        } else if (i10 != 2) {
            this.f15409b = gf0;
            this.f15410c = ab0;
        } else {
            this.f15409b = gf0;
            this.f15410c = ab0;
        }
    }

    public static lm a(gf0 gf0, ab0<bi> ab0) {
        return new lm(gf0, ab0, 0);
    }

    public static lm b(gf0 gf0, ab0<Executor> ab0) {
        return new lm(gf0, ab0, 2);
    }

    public final Object get() {
        switch (this.f15408a) {
            case 0:
                Set singleton = Collections.singleton(new ul(this.f15410c.get(), h9.f14886f));
                jc0.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
                return singleton;
            case 1:
                return new ul((ya) this.f15410c.get(), h9.f14886f);
            default:
                return new ul(new gg((t7) this.f15409b.f14777c), (Executor) this.f15410c.get());
        }
    }
}
