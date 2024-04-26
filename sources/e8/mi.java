package e8;

import com.google.android.gms.internal.ads.av;
import com.google.android.gms.internal.ads.ee;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.qy;
import com.google.android.gms.internal.ads.rx;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class mi implements j9, lk, ee {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15524a;

    /* renamed from: b  reason: collision with root package name */
    public final zh0 f15525b;

    public mi(zh0 zh0, int i10) {
        this.f15524a = i10;
        if (i10 == 1) {
            this.f15525b = zh0;
        } else if (i10 == 2) {
            this.f15525b = zh0;
        } else if (i10 == 3) {
            this.f15525b = zh0;
        } else if (i10 == 4) {
            this.f15525b = zh0;
        } else if (i10 != 5) {
            this.f15525b = zh0;
        } else {
            this.f15525b = zh0;
        }
    }

    public void F(Object obj) {
        ((pi) obj).j0(this.f15525b);
    }

    public void g(Object obj) {
        switch (this.f15524a) {
            case 1:
                ((ov) obj).g(this.f15525b);
                return;
            case 2:
                ((qy) obj).B0(this.f15525b);
                return;
            case 3:
                ((rx) obj).h0(this.f15525b.f17753a);
                return;
            case 4:
                ((av) obj).U4(this.f15525b);
                return;
            default:
                ((av) obj).Y1(this.f15525b.f17753a);
                return;
        }
    }
}
