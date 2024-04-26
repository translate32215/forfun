package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.l;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.yc;
import com.google.android.gms.internal.ads.yh;
import java.util.concurrent.Executor;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vt implements lt<qf> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17161a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17162b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17163c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17164d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f17165e;

    public vt(mf mfVar, Context context, Executor executor, cb cbVar) {
        this.f17163c = context;
        this.f17162b = mfVar;
        this.f17165e = executor;
        this.f17164d = cbVar;
    }

    public final boolean a(t00 t00, qe qeVar) {
        te teVar;
        switch (this.f17161a) {
            case 0:
                te teVar2 = qeVar.f7965r;
                return (teVar2 == null || teVar2.f8193a == null) ? false : true;
            default:
                if (((n) this.f17162b) == null || (teVar = qeVar.f7965r) == null || teVar.f8193a == null) {
                    return false;
                }
                return true;
        }
    }

    public final p50 b(t00 t00, qe qeVar) {
        switch (this.f17161a) {
            case 0:
                return yh.j(yh.h(null), new ih(this, t00, qeVar), (Executor) this.f17165e);
            default:
                d7 d7Var = new d7();
                yc ycVar = new yc();
                wz wzVar = new wz(this, d7Var, t00, qeVar, ycVar);
                synchronized (ycVar) {
                    ycVar.f8598a = wzVar;
                }
                te teVar = qeVar.f7965r;
                l lVar = new l(ycVar, teVar.f8194b, teVar.f8193a);
                dv h10 = ((n20) this.f17164d).c(Cif.CUSTOM_RENDER_SYN).h(new wy((ff) new c(this, lVar)), (o50) this.f17163c);
                return ((k20) h10.f14338f).b(Cif.CUSTOM_RENDER_ACK, h10.e()).g(d7Var).e();
        }
    }

    public vt(n20 n20, o50 o50, n nVar, ev evVar) {
        this.f17164d = n20;
        this.f17163c = o50;
        this.f17162b = nVar;
        this.f17165e = evVar;
    }
}
