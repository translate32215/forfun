package e8;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.l;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.yh;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bv implements lt<dg> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14062a;

    /* renamed from: b  reason: collision with root package name */
    public final pg f14063b;

    /* renamed from: c  reason: collision with root package name */
    public final n f14064c;

    /* renamed from: d  reason: collision with root package name */
    public final o50 f14065d;

    /* renamed from: e  reason: collision with root package name */
    public final n20 f14066e;

    public bv(Context context, pg pgVar, n20 n20, o50 o50, n nVar) {
        this.f14062a = context;
        this.f14063b = pgVar;
        this.f14066e = n20;
        this.f14065d = o50;
        this.f14064c = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f7965r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(e8.t00 r1, com.google.android.gms.internal.ads.qe r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.n r1 = r0.f14064c
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.te r1 = r2.f7965r
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f8193a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.bv.a(e8.t00, com.google.android.gms.internal.ads.qe):boolean");
    }

    public final p50<dg> b(t00 t00, qe qeVar) {
        cg b10 = this.f14063b.b(new j8(t00, qeVar, (String) null), new cv(new View(this.f14062a), av.f13753a, qeVar.f7967t.get(0)));
        be beVar = (be) b10;
        dv dvVar = new dv(beVar.H.get(), beVar.T.get(), beVar.X.get(), beVar.P0.get(), beVar.f13956k.get());
        te teVar = qeVar.f7965r;
        l lVar = new l(dvVar, teVar.f8194b, teVar.f8193a);
        c c10 = this.f14066e.c(Cif.CUSTOM_RENDER_SYN);
        p9 p9Var = new p9(this, lVar);
        dv h10 = c10.h(new wy((ff) p9Var), this.f14065d);
        return ((k20) h10.f14338f).b(Cif.CUSTOM_RENDER_ACK, h10.e()).g(yh.h(b10.h())).e();
    }
}
