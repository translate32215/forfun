package e8;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.yh;
import d7.g;
import d7.l;
import l0.e;
import o.a;
import z3.i;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wt implements t9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17393a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final f9 f17394b;

    /* renamed from: c  reason: collision with root package name */
    public final p50<sf> f17395c;

    /* renamed from: d  reason: collision with root package name */
    public final qe f17396d;

    /* renamed from: e  reason: collision with root package name */
    public final t7 f17397e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f17398f;

    public wt(Context context, f9 f9Var, p50 p50, qe qeVar, t7 t7Var) {
        this.f17398f = context;
        this.f17394b = f9Var;
        this.f17395c = p50;
        this.f17396d = qeVar;
        this.f17397e = t7Var;
    }

    public final void a(boolean z10, Context context) {
        int i10;
        switch (this.f17393a) {
            case 0:
                this.f17397e.H0(true);
                g gVar = new g(true, true, z10, this.f17396d.J, false);
                i iVar = l.B.f13185b;
                qm j10 = ((sf) yh.l(this.f17395c)).j();
                t7 t7Var = this.f17397e;
                int i11 = this.f17396d.L;
                if (i11 == -1) {
                    pi0 pi0 = ((w00) this.f17398f).f17196j;
                    if (pi0 != null) {
                        int i12 = pi0.f16007a;
                        if (i12 == 1) {
                            i10 = 7;
                        } else if (i12 == 2) {
                            i10 = 6;
                        }
                        f9 f9Var = this.f17394b;
                        qe qeVar = this.f17396d;
                        String str = qeVar.A;
                        te teVar = qeVar.f7965r;
                        i.b(context, new AdOverlayInfoParcel(j10, t7Var, i10, f9Var, str, gVar, teVar.f8194b, teVar.f8193a), true);
                        return;
                    }
                    e.E("Error setting app open orientation; no targeting orientation available.");
                    i11 = this.f17396d.L;
                }
                i10 = i11;
                f9 f9Var2 = this.f17394b;
                qe qeVar2 = this.f17396d;
                String str2 = qeVar2.A;
                te teVar2 = qeVar2.f7965r;
                i.b(context, new AdOverlayInfoParcel(j10, t7Var, i10, f9Var2, str2, gVar, teVar2.f8194b, teVar2.f8193a), true);
                return;
            default:
                this.f17397e.H0(true);
                p pVar = l.B.f13186c;
                g gVar2 = new g(false, p.n((Context) this.f17398f), z10, this.f17396d.J, false);
                i iVar2 = l.B.f13185b;
                qm i13 = ((jm) yh.l(this.f17395c)).i();
                t7 t7Var2 = this.f17397e;
                qe qeVar3 = this.f17396d;
                int i14 = qeVar3.L;
                f9 f9Var3 = this.f17394b;
                String str3 = qeVar3.A;
                te teVar3 = qeVar3.f7965r;
                i.b(context, new AdOverlayInfoParcel(i13, t7Var2, i14, f9Var3, str3, gVar2, teVar3.f8194b, teVar3.f8193a), true);
                return;
        }
    }

    public wt(f9 f9Var, p50 p50, qe qeVar, t7 t7Var, w00 w00) {
        this.f17394b = f9Var;
        this.f17395c = p50;
        this.f17396d = qeVar;
        this.f17397e = t7Var;
        this.f17398f = w00;
    }

    public /* synthetic */ wt(Context context, f9 f9Var, p50 p50, qe qeVar, t7 t7Var, a aVar) {
        this(context, f9Var, p50, qeVar, t7Var);
    }
}
