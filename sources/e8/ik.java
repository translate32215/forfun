package e8;

import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.ee;
import com.google.android.gms.internal.ads.fx;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ik implements lk, ee {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15055a;

    /* renamed from: b  reason: collision with root package name */
    public final fx f15056b;

    public ik(fx fxVar, int i10) {
        this.f15055a = i10;
        if (i10 == 1) {
            this.f15056b = fxVar;
        } else if (i10 != 2) {
            this.f15056b = fxVar;
        } else {
            this.f15056b = fxVar;
        }
    }

    public final void g(Object obj) {
        switch (this.f15055a) {
            case 0:
                ((e00) obj).l(this.f15056b);
                return;
            case 1:
                ((cz) obj).I1(this.f15056b);
                return;
            default:
                ((cz) obj).I1(this.f15056b);
                return;
        }
    }
}
