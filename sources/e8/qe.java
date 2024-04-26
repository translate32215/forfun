package e8;

import com.google.android.gms.ads.internal.util.p;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qe implements ta0<r8> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16145a;

    public qe(int i10) {
        this.f16145a = i10;
    }

    public final Object get() {
        switch (this.f16145a) {
            case 0:
                return new q8();
            case 1:
                p pVar = l.B.f13186c;
                String K = p.K();
                jc0.b(K, "Cannot return null from a non-@Nullable @Provides method");
                return K;
            case 2:
                return new v00();
            default:
                o50 o50 = h9.f14882b;
                jc0.b(o50, "Cannot return null from a non-@Nullable @Provides method");
                return o50;
        }
    }
}
