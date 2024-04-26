package e8;

import com.google.android.gms.internal.ads.w6;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class me implements ta0<w6> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15498a;

    public me(int i10) {
        this.f15498a = i10;
    }

    public static o50 a() {
        o50 o50 = h9.f14881a;
        jc0.b(o50, "Cannot return null from a non-@Nullable @Provides method");
        return o50;
    }

    public final Object get() {
        switch (this.f15498a) {
            case 0:
                return new w6();
            default:
                return a();
        }
    }
}
