package e8;

import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.j9;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class o20 implements j9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15737a;

    /* renamed from: b  reason: collision with root package name */
    public final hf f15738b;

    public o20(hf hfVar, int i10) {
        this.f15737a = i10;
        if (i10 != 1) {
            this.f15738b = hfVar;
        } else {
            this.f15738b = hfVar;
        }
    }

    public final void F(Object obj) {
        switch (this.f15737a) {
            case 0:
                hf hfVar = this.f15738b;
                ((q20) obj).y((Cif) hfVar.f6855a, hfVar.f6856b);
                return;
            default:
                hf hfVar2 = this.f15738b;
                ((q20) obj).P((Cif) hfVar2.f6855a, hfVar2.f6856b);
                return;
        }
    }
}
