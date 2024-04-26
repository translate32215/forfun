package e8;

import com.google.android.gms.internal.ads.v9;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mm implements ta0<Set<ul<tk>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15527a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<bi> f15528b;

    public mm(gf0 gf0, ab0 ab0, int i10) {
        this.f15527a = i10;
        if (i10 != 1) {
            this.f15528b = ab0;
        } else {
            this.f15528b = ab0;
        }
    }

    public static mm a(gf0 gf0, ab0<bi> ab0) {
        return new mm(gf0, ab0, 0);
    }

    public static mm b(gf0 gf0, ab0<v9> ab0) {
        return new mm(gf0, ab0, 1);
    }

    public final Object get() {
        switch (this.f15527a) {
            case 0:
                Set singleton = Collections.singleton(new ul(this.f15528b.get(), h9.f14886f));
                jc0.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
                return singleton;
            default:
                return new ul((v9) this.f15528b.get(), h9.f14885e);
        }
    }
}
