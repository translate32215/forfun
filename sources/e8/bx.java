package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.yh;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bx implements dy<nw> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14068a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f14069b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14070c;

    public bx(Context context, o50 o50) {
        this.f14069b = context;
        this.f14070c = o50;
    }

    public final p50 b() {
        ww wwVar;
        switch (this.f14068a) {
            case 0:
                return ((o50) this.f14070c).i(new wy(this));
            default:
                if (((String) this.f14070c) == null) {
                    wwVar = null;
                } else {
                    wwVar = new ww(this);
                }
                return yh.h(wwVar);
        }
    }

    public bx(Context context, String str) {
        this.f14069b = context;
        this.f14070c = str;
    }
}
