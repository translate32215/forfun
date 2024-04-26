package e8;

import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.y6;
import com.google.android.gms.internal.ads.yh;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ix implements dy<hw> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15075a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15076b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15077c;

    public ix(o50 o50, oe oeVar) {
        this.f15076b = o50;
        this.f15077c = oeVar;
    }

    public final p50 b() {
        switch (this.f15075a) {
            case 0:
                return ((o50) this.f15076b).i(new wy(this));
            case 1:
                return yh.j((p50) this.f15076b, jw.f15200a, (Executor) this.f15077c);
            default:
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16646r1)).booleanValue()) {
                    return yh.h(null);
                }
                return yh.i(((y6) this.f15077c).g(), qw.f16210a, (Executor) this.f15076b);
        }
    }

    public ix(p50 p50, Executor executor) {
        this.f15076b = p50;
        this.f15077c = executor;
    }

    public ix(Executor executor, y6 y6Var) {
        this.f15076b = executor;
        this.f15077c = y6Var;
    }
}
