package e8;

import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.mv;
import com.google.android.gms.internal.ads.pv;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.yv;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class fk implements j9, mv {

    /* renamed from: a  reason: collision with root package name */
    public final t00 f14650a;

    public fk(t00 t00, int i10) {
        if (i10 != 1) {
            this.f14650a = t00;
        } else {
            this.f14650a = t00;
        }
    }

    public void F(Object obj) {
        ((ek) obj).C0(this.f14650a);
    }

    public void d(cw.a aVar) {
        t00 t00 = this.f14650a;
        pv.b bVar = (pv.b) aVar.r().w();
        yv.a aVar2 = (yv.a) aVar.r().A().w();
        String str = ((re) t00.f16701b.f7135c).f8030b;
        if (aVar2.f5971c) {
            aVar2.n();
            aVar2.f5971c = false;
        }
        yv.y((yv) aVar2.f5970b, str);
        if (bVar.f5971c) {
            bVar.n();
            bVar.f5971c = false;
        }
        pv.z((pv) bVar.f5970b, (yv) ((aq) aVar2.j()));
        aVar.o(bVar);
    }
}
