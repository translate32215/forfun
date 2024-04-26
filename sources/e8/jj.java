package e8;

import com.google.android.gms.internal.ads.ee;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.k6;
import com.google.android.gms.internal.ads.m5;
import com.google.android.gms.internal.ads.m6;
import com.google.android.gms.internal.ads.p5;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class jj implements j9, lk, ee {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15150a;

    /* renamed from: b  reason: collision with root package name */
    public final m5 f15151b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15152c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15153d;

    public jj(m5 m5Var, String str, String str2, int i10) {
        this.f15150a = i10;
        if (i10 == 1) {
            this.f15151b = m5Var;
            this.f15152c = str;
            this.f15153d = str2;
        } else if (i10 == 2) {
            this.f15151b = m5Var;
            this.f15152c = str;
            this.f15153d = str2;
        } else if (i10 == 3) {
            this.f15151b = m5Var;
            this.f15152c = str;
            this.f15153d = str2;
        } else if (i10 != 4) {
            this.f15151b = m5Var;
            this.f15152c = str;
            this.f15153d = str2;
        } else {
            this.f15151b = m5Var;
            this.f15152c = str;
            this.f15153d = str2;
        }
    }

    public void F(Object obj) {
        ((li) obj).t(this.f15151b, this.f15152c, this.f15153d);
    }

    public void g(Object obj) {
        switch (this.f15150a) {
            case 1:
                ((e00) obj).t(this.f15151b, this.f15152c, this.f15153d);
                return;
            case 2:
                ov ovVar = (ov) obj;
                return;
            case 3:
                m5 m5Var = this.f15151b;
                ((k6) obj).m4(new m6(m5Var.o(), m5Var.q0()), this.f15152c, this.f15153d);
                return;
            default:
                ((p5) obj).r4(this.f15151b, this.f15152c, this.f15153d);
                return;
        }
    }
}
