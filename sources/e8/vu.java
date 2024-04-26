package e8;

import android.content.Context;
import androidx.activity.k;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.yh;
import d7.g;
import d7.l;
import l0.e;
import z3.i;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vu implements t9 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17166a;

    /* renamed from: b  reason: collision with root package name */
    public final cb f17167b;

    /* renamed from: c  reason: collision with root package name */
    public final w00 f17168c;

    /* renamed from: d  reason: collision with root package name */
    public final f9 f17169d;

    /* renamed from: e  reason: collision with root package name */
    public final qe f17170e;

    /* renamed from: f  reason: collision with root package name */
    public final p50<ip> f17171f;

    /* renamed from: g  reason: collision with root package name */
    public final t7 f17172g;

    public vu(Context context, cb cbVar, w00 w00, f9 f9Var, qe qeVar, p50 p50, t7 t7Var, k kVar) {
        this.f17166a = context;
        this.f17167b = cbVar;
        this.f17168c = w00;
        this.f17169d = f9Var;
        this.f17170e = qeVar;
        this.f17171f = p50;
        this.f17172g = t7Var;
    }

    public final void a(boolean z10, Context context) {
        t7 t7Var;
        t7 t7Var2;
        ip ipVar = (ip) yh.l(this.f17171f);
        try {
            qe qeVar = this.f17170e;
            if (!this.f17172g.q0()) {
                t7Var2 = this.f17172g;
            } else {
                if (!((Boolean) ti0.f16763j.f16769f.a(t.f16633p0)).booleanValue()) {
                    t7Var2 = this.f17172g;
                } else {
                    t7 a10 = this.f17167b.a(this.f17168c.f17191e, (qe) null, (re) null);
                    a10.r("/reward", new l2((o3) ipVar.l()));
                    wp wpVar = new wp();
                    wpVar.b(this.f17166a, a10.getView());
                    ipVar.h().b(a10, true);
                    ((s7) a10.H()).f8095g = new gf0(wpVar, a10);
                    ((s7) a10.H()).f8096h = new ic(a10, 1);
                    te teVar = qeVar.f7965r;
                    a10.m0(teVar.f8194b, teVar.f8193a, (String) null);
                    t7Var = a10;
                    t7Var.H0(true);
                    p pVar = l.B.f13186c;
                    boolean n10 = p.n(this.f17166a);
                    qe qeVar2 = this.f17170e;
                    g gVar = new g(false, n10, z10, qeVar2.J, qeVar2.K);
                    i iVar = l.B.f13185b;
                    qm i10 = ipVar.i();
                    qe qeVar3 = this.f17170e;
                    int i11 = qeVar3.L;
                    f9 f9Var = this.f17169d;
                    String str = qeVar3.A;
                    te teVar2 = qeVar3.f7965r;
                    Context context2 = context;
                    i.b(context2, new AdOverlayInfoParcel(i10, t7Var, i11, f9Var, str, gVar, teVar2.f8194b, teVar2.f8193a), true);
                }
            }
            t7Var = t7Var2;
            t7Var.H0(true);
            p pVar2 = l.B.f13186c;
            boolean n102 = p.n(this.f17166a);
            qe qeVar22 = this.f17170e;
            g gVar2 = new g(false, n102, z10, qeVar22.J, qeVar22.K);
            i iVar2 = l.B.f13185b;
            qm i102 = ipVar.i();
            qe qeVar32 = this.f17170e;
            int i112 = qeVar32.L;
            f9 f9Var2 = this.f17169d;
            String str2 = qeVar32.A;
            te teVar22 = qeVar32.f7965r;
            Context context22 = context;
            i.b(context22, new AdOverlayInfoParcel(i102, t7Var, i112, f9Var2, str2, gVar2, teVar22.f8194b, teVar22.f8193a), true);
        } catch (ec e10) {
            e.C("", e10);
        }
    }
}
