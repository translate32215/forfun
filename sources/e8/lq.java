package e8;

import com.google.android.gms.internal.ads.Cif;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lq implements ta0<rq> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15421a;

    public lq(int i10) {
        this.f15421a = i10;
    }

    public final Object get() {
        switch (this.f15421a) {
            case 0:
                return new rq("ttc", Cif.SIGNALS, Cif.RENDERER);
            default:
                o50 o50 = h9.f14885e;
                jc0.b(o50, "Cannot return null from a non-@Nullable @Provides method");
                return o50;
        }
    }
}
