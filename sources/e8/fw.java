package e8;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.y6;
import com.google.android.gms.internal.ads.yh;
import f7.h0;
import q.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fw implements dy<gw> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14685a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14686b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14687c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14688d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f14689e;

    public fw(f7 f7Var, Context context, String str, o50 o50) {
        this.f14688d = f7Var;
        this.f14687c = context;
        this.f14689e = str;
        this.f14686b = o50;
    }

    public final p50 b() {
        switch (this.f14685a) {
            case 0:
                return ((o50) this.f14686b).i(new wy(this));
            case 1:
                return ((o50) this.f14686b).i(new wy(this, (e) null));
            case 2:
                return ((o50) this.f14686b).i(new h0(this));
            default:
                return yh.i(((dy) this.f14686b).b(), new m7(this), h9.f14886f);
        }
    }

    public fw(yw ywVar, w00 w00, Context context, y6 y6Var) {
        this.f14686b = ywVar;
        this.f14688d = w00;
        this.f14687c = context;
        this.f14689e = y6Var;
    }

    public fw(o50 o50, Context context, w00 w00, ViewGroup viewGroup) {
        this.f14686b = o50;
        this.f14687c = context;
        this.f14688d = w00;
        this.f14689e = viewGroup;
    }

    public fw(o50 o50, yp ypVar, w00 w00, String str) {
        this.f14686b = o50;
        this.f14687c = ypVar;
        this.f14688d = w00;
        this.f14689e = str;
    }
}
