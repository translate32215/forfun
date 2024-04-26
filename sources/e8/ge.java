package e8;

import com.google.android.gms.internal.ads.e8;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.k8;
import d7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ge implements ta0<a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14768a;

    /* renamed from: b  reason: collision with root package name */
    public final k8 f14769b;

    public ge(k8 k8Var, int i10) {
        this.f14768a = i10;
        if (i10 != 1) {
            this.f14769b = k8Var;
        } else {
            this.f14769b = k8Var;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [e8.g8, com.google.android.gms.internal.ads.g2] */
    public final Object get() {
        switch (this.f14768a) {
            case 0:
                ((e8) this.f14769b.f7210a).getClass();
                return new a(new wa(), new ca(), new g2((i8) new d8()), new th0(), new k6(), new l0());
            default:
                ((e8) this.f14769b.f7210a).getClass();
                return new l0();
        }
    }
}
