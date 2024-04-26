package e8;

import android.net.Uri;
import androidx.activity.k;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.yh;
import e7.c;
import e7.p;
import l0.e;
import o.a;
import p.d;
import p.g;
import q.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class xr implements oh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17507a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17508b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17509c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17510d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f17511e;

    public xr(j8 j8Var, ds dsVar, l5 l5Var, oh ohVar) {
        this.f17508b = j8Var;
        this.f17509c = dsVar;
        this.f17510d = l5Var;
        this.f17511e = ohVar;
    }

    public final p50 a(Object obj) {
        switch (this.f17507a) {
            case 0:
                j8 j8Var = (j8) this.f17508b;
                wr wrVar = (wr) obj;
                j8Var.getClass();
                return yh.j(((ds) this.f17509c).y((l5) this.f17510d), (oh) this.f17511e, (o50) j8Var.f7134b);
            case 1:
                st stVar = (st) this.f17508b;
                qe qeVar = (qe) this.f17509c;
                t00 t00 = (t00) this.f17510d;
                t7 a10 = stVar.f16521d.a(stVar.f16522e.f17191e, qeVar, (re) t00.f16701b.f7135c);
                a10.z0(qeVar.Q);
                ((wp) this.f17511e).b(stVar.f16520c, a10.getView());
                d7 d7Var = new d7();
                sf e10 = ((tf) stVar.f16519b).e(new j8(t00, qeVar, (String) null), new gf0((t9) new wt(stVar.f16524g, (p50) d7Var, qeVar, a10, stVar.f16522e), a10), new uf(qeVar.U, 0));
                e10.i().b(a10, false);
                d7Var.b(e10);
                e10.d().J0(new tt(a10, 0), h9.f14886f);
                e10.i();
                te teVar = qeVar.f7965r;
                return yh.i(op.a(a10, teVar.f8194b, teVar.f8193a), new ut(stVar, a10, qeVar, e10), stVar.f16523f);
            case 2:
                bu buVar = (bu) this.f17508b;
                Uri uri = (Uri) this.f17509c;
                t00 t002 = (t00) this.f17510d;
                qe qeVar2 = (qe) this.f17511e;
                buVar.getClass();
                try {
                    d a11 = new d.a((g) null).a();
                    a11.f23737a.setData(uri);
                    c cVar = new c(a11.f23737a);
                    d7 d7Var2 = new d7();
                    jm a12 = buVar.f14059b.a(new j8(t002, qeVar2, (String) null), new gf0((t9) new fu(d7Var2)));
                    d7Var2.b(new AdOverlayInfoParcel(cVar, (wh0) null, a12.k(), (p) null, new f9(0, 0, false)));
                    buVar.f14061d.b(2, 3);
                    return yh.h(a12.j());
                } catch (Throwable th) {
                    e.C("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            case 3:
                st stVar2 = (st) this.f17508b;
                qe qeVar3 = (qe) this.f17509c;
                t00 t003 = (t00) this.f17510d;
                t7 a13 = stVar2.f16521d.a(stVar2.f16522e.f17191e, qeVar3, (re) t003.f16701b.f7135c);
                a13.z0(qeVar3.Q);
                ((wp) this.f17511e).b(stVar2.f16520c, a13.getView());
                d7 d7Var3 = new d7();
                j8 j8Var2 = new j8(t003, qeVar3, (String) null);
                wt wtVar = r6;
                wt wtVar2 = new wt(stVar2.f16520c, stVar2.f16524g, d7Var3, qeVar3, a13, (a) null);
                jm a14 = ((rm) stVar2.f16519b).a(j8Var2, new gf0((t9) wtVar, a13));
                d7Var3.b(a14);
                a14.d().J0(new eu(a13, 0), h9.f14886f);
                a14.h().b(a13, true);
                a14.h();
                te teVar2 = qeVar3.f7965r;
                return yh.i(op.a(a13, teVar2.f8194b, teVar2.f8193a), new ut(stVar2, a13, qeVar3, a14), stVar2.f16523f);
            default:
                st stVar3 = (st) this.f17508b;
                qe qeVar4 = (qe) this.f17509c;
                t00 t004 = (t00) this.f17510d;
                t7 a15 = stVar3.f16521d.a(stVar3.f16522e.f17191e, qeVar4, (re) t004.f16701b.f7135c);
                a15.z0(qeVar4.Q);
                ((wp) this.f17511e).b(stVar3.f16520c, a15.getView());
                d7 d7Var4 = new d7();
                j8 j8Var3 = new j8(t004, qeVar4, (String) null);
                st stVar4 = stVar3;
                ip e11 = ((kp) stVar3.f16519b).e(j8Var3, new jp(new vu(stVar3.f16520c, stVar3.f16521d, stVar3.f16522e, stVar3.f16524g, qeVar4, d7Var4, a15, (k) null), a15));
                d7Var4.b(e11);
                a15.r("/reward", new l2((o3) e11.l()));
                e11.d().J0(new eu(a15, 1), h9.f14886f);
                e11.h().b(a15, true);
                e11.h();
                te teVar3 = qeVar4.f7965r;
                st stVar5 = stVar4;
                return yh.i(op.a(a15, teVar3.f8194b, teVar3.f8193a), new ut(stVar5, a15, qeVar4, e11), stVar5.f16523f);
        }
    }

    public xr(st stVar, qe qeVar, t00 t00, wp wpVar) {
        this.f17508b = stVar;
        this.f17509c = qeVar;
        this.f17510d = t00;
        this.f17511e = wpVar;
    }

    public xr(st stVar, qe qeVar, t00 t00, wp wpVar, q.e eVar) {
        this.f17508b = stVar;
        this.f17509c = qeVar;
        this.f17510d = t00;
        this.f17511e = wpVar;
    }

    public xr(st stVar, qe qeVar, t00 t00, wp wpVar, f fVar) {
        this.f17508b = stVar;
        this.f17509c = qeVar;
        this.f17510d = t00;
        this.f17511e = wpVar;
    }

    public xr(bu buVar, Uri uri, t00 t00, qe qeVar) {
        this.f17508b = buVar;
        this.f17509c = uri;
        this.f17510d = t00;
        this.f17511e = qeVar;
    }
}
