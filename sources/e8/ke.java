package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ke implements ta0<oh0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15276a;

    public ke(int i10) {
        this.f15276a = i10;
    }

    public final Object get() {
        o50 o50;
        switch (this.f15276a) {
            case 0:
                return new oh0();
            default:
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16552b3)).booleanValue()) {
                    o50 = h9.f14883c;
                } else {
                    if (((Boolean) ti0.f16763j.f16769f.a(t.f16546a3)).booleanValue()) {
                        o50 = h9.f14881a;
                    } else {
                        o50 = h9.f14885e;
                    }
                }
                jc0.b(o50, "Cannot return null from a non-@Nullable @Provides method");
                return o50;
        }
    }
}
