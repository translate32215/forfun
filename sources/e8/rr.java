package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.gb;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.wc;
import com.google.android.gms.internal.ads.zc;
import com.google.android.gms.internal.ads.zd;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rr implements ta0<pr> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16340a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Context> f16341b;

    public rr(ab0 ab0, int i10) {
        this.f16340a = i10;
        switch (i10) {
            case 1:
                this.f16341b = ab0;
                return;
            case 2:
                this.f16341b = ab0;
                return;
            case 3:
                this.f16341b = ab0;
                return;
            case 4:
                this.f16341b = ab0;
                return;
            case 5:
                this.f16341b = ab0;
                return;
            case 6:
                this.f16341b = ab0;
                return;
            case 7:
                this.f16341b = ab0;
                return;
            default:
                this.f16341b = ab0;
                return;
        }
    }

    public static rr a(ab0<rb> ab0) {
        return new rr(ab0, 1);
    }

    public static rr b(ab0<zc> ab0) {
        return new rr(ab0, 2);
    }

    public static rr c(ab0<gb> ab0) {
        return new rr(ab0, 3);
    }

    public static rr d(ab0<zd> ab0) {
        return new rr(ab0, 4);
    }

    public static rr e(ab0<c00> ab0) {
        return new rr(ab0, 6);
    }

    public final Object get() {
        switch (this.f16340a) {
            case 0:
                return new pr(this.f16341b.get());
            case 1:
                return new ws((rb) this.f16341b.get());
            case 2:
                return new wc((zc) this.f16341b.get());
            case 3:
                return new zc((gb) this.f16341b.get());
            case 4:
                return new iw((zd) this.f16341b.get());
            case 5:
                return new oe((b) this.f16341b.get());
            case 6:
                return new zx((c00) this.f16341b.get());
            default:
                return new e00((i10) this.f16341b.get());
        }
    }
}
