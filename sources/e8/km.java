package e8;

import android.view.View;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class km implements ta0<View> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15308a;

    /* renamed from: b  reason: collision with root package name */
    public final gf0 f15309b;

    public km(gf0 gf0, int i10) {
        this.f15308a = i10;
        if (i10 != 1) {
            this.f15309b = gf0;
        } else {
            this.f15309b = gf0;
        }
    }

    public static km a(gf0 gf0) {
        return new km(gf0, 0);
    }

    public static km b(gf0 gf0) {
        return new km(gf0, 1);
    }

    public final Object get() {
        switch (this.f15308a) {
            case 0:
                t7 t7Var = (t7) this.f15309b.f14777c;
                if (t7Var == null) {
                    return null;
                }
                return t7Var.getWebView();
            default:
                t7 t7Var2 = (t7) this.f15309b.f14777c;
                if (t7Var2 != null) {
                    return t7Var2.getWebView();
                }
                return null;
        }
    }
}
