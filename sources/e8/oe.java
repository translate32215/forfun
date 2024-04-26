package e8;

import com.google.android.gms.internal.ads.fd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oe implements ta0<l6> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15790a;

    public oe(int i10) {
        this.f15790a = i10;
    }

    public final Object get() {
        switch (this.f15790a) {
            case 0:
                return new l6();
            case 1:
                return new fd();
            case 2:
                return t.b();
            default:
                o50 o50 = h9.f14885e;
                jc0.b(o50, "Cannot return null from a non-@Nullable @Provides method");
                return o50;
        }
    }
}
