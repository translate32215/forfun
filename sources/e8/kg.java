package e8;

import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.y8;
import n2.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kg implements ta0<y8> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15279a;

    /* renamed from: b  reason: collision with root package name */
    public final g f15280b;

    public kg(g gVar, int i10) {
        this.f15279a = i10;
        if (i10 != 1) {
            this.f15280b = gVar;
        } else {
            this.f15280b = gVar;
        }
    }

    public final Object get() {
        switch (this.f15279a) {
            case 0:
                y8 y8Var = (y8) this.f15280b.f21850a;
                jc0.b(y8Var, "Cannot return null from a non-@Nullable @Provides method");
                return y8Var;
            default:
                return (t7) this.f15280b.f21853d;
        }
    }
}
