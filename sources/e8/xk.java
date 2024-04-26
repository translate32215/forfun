package e8;

import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.mv;
import com.google.android.gms.internal.ads.vv;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class xk implements j9, mv {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17497a;

    /* renamed from: b  reason: collision with root package name */
    public final vv f17498b;

    public xk(vv vvVar, int i10) {
        this.f17497a = i10;
        if (i10 == 1) {
            this.f17498b = vvVar;
        } else if (i10 != 2) {
            this.f17498b = vvVar;
        } else {
            this.f17498b = vvVar;
        }
    }

    public void F(Object obj) {
        switch (this.f17497a) {
            case 0:
                ((al) obj).Y(this.f17498b);
                return;
            default:
                ((al) obj).t0(this.f17498b);
                return;
        }
    }

    public void d(cw.a aVar) {
        aVar.p(this.f17498b);
    }
}
