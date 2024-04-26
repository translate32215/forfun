package e8;

import android.content.Context;
import android.view.View;
import c8.b;
import com.google.android.gms.ads.internal.util.i;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.xc;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.y8;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;
import n2.g;
import y6.d;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class au implements vb<dg, ue, zb> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13748a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f13749b;

    /* renamed from: c  reason: collision with root package name */
    public final f9 f13750c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13751d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f13752e;

    public au(Context context, f9 f9Var, pg pgVar, Executor executor) {
        this.f13749b = context;
        this.f13750c = f9Var;
        this.f13751d = pgVar;
        this.f13752e = executor;
    }

    public final Object a(t00 t00, qe qeVar, mt mtVar) {
        switch (this.f13748a) {
            case 0:
                j8 j8Var = new j8(t00, qeVar, mtVar.f15549a);
                View a10 = ((ue) mtVar.f15550b).a();
                ue ueVar = (ue) mtVar.f15550b;
                ueVar.getClass();
                cg b10 = ((pg) this.f13751d).b(j8Var, new g(a10, (t7) null, (y8) new zt(ueVar), qeVar.f7967t.get(0)));
                ((be) b10).P0.get().K0(((ue) mtVar.f15550b).a());
                b10.a().J0(new cj((ue) mtVar.f15550b), this.f13752e);
                zb zbVar = (zb) mtVar.f15551c;
                xc f10 = b10.f();
                synchronized (zbVar) {
                    zbVar.f8692a = f10;
                }
                return b10.h();
            default:
                jm a11 = ((rm) this.f13751d).a(new j8(t00, qeVar, mtVar.f15549a), new gf0((t9) new fu(mtVar, 0)));
                a11.a().J0(new cj((ue) mtVar.f15550b), this.f13752e);
                ((zb) mtVar.f15551c).t6(a11.f());
                return a11.j();
        }
    }

    public final void b(t00 t00, qe qeVar, mt mtVar) {
        li0 li0;
        switch (this.f13748a) {
            case 0:
                li0 li02 = ((w00) t00.f16700a.f8042b).f17191e;
                if (li02.f15407v) {
                    Context context = this.f13749b;
                    int i10 = li02.f15398e;
                    int i11 = li02.f15395b;
                    d dVar = new d(i10, i11);
                    dVar.f28123d = true;
                    dVar.f28124e = i11;
                    li0 = new li0(context, dVar);
                } else {
                    li0 = g7.n(this.f13749b, qeVar.f7967t);
                }
                li0 li03 = li0;
                if (this.f13750c.f14546c < 4100000) {
                    ue ueVar = (ue) mtVar.f15550b;
                    Context context2 = this.f13749b;
                    fi0 fi0 = ((w00) t00.f16700a.f8042b).f17190d;
                    String jSONObject = qeVar.f7968u.toString();
                    y2 y2Var = (y2) mtVar.f15551c;
                    ueVar.getClass();
                    try {
                        ueVar.f8245a.A2(new b(context2), li03, fi0, jSONObject, y2Var);
                        return;
                    } catch (Throwable th) {
                        throw new b10(th);
                    }
                } else {
                    ue ueVar2 = (ue) mtVar.f15550b;
                    Context context3 = this.f13749b;
                    fi0 fi02 = ((w00) t00.f16700a.f8042b).f17190d;
                    String jSONObject2 = qeVar.f7968u.toString();
                    String a10 = i.a(qeVar.f7965r);
                    y2 y2Var2 = (y2) mtVar.f15551c;
                    ueVar2.getClass();
                    try {
                        ueVar2.f8245a.S5(new b(context3), li03, fi02, jSONObject2, a10, y2Var2);
                        return;
                    } catch (Throwable th2) {
                        throw new b10(th2);
                    }
                }
            default:
                if (this.f13750c.f14546c < 4100000) {
                    ue ueVar3 = (ue) mtVar.f15550b;
                    Context context4 = this.f13749b;
                    fi0 fi03 = ((w00) t00.f16700a.f8042b).f17190d;
                    String jSONObject3 = qeVar.f7968u.toString();
                    y2 y2Var3 = (y2) mtVar.f15551c;
                    ueVar3.getClass();
                    try {
                        ueVar3.f8245a.f2(new b(context4), fi03, jSONObject3, y2Var3);
                        return;
                    } catch (Throwable th3) {
                        throw new b10(th3);
                    }
                } else {
                    ue ueVar4 = (ue) mtVar.f15550b;
                    Context context5 = this.f13749b;
                    fi0 fi04 = ((w00) t00.f16700a.f8042b).f17190d;
                    String jSONObject4 = qeVar.f7968u.toString();
                    String a11 = i.a(qeVar.f7965r);
                    y2 y2Var4 = (y2) mtVar.f15551c;
                    ueVar4.getClass();
                    try {
                        ueVar4.f8245a.c5(new b(context5), fi04, jSONObject4, a11, y2Var4);
                        return;
                    } catch (Throwable th4) {
                        throw new b10(th4);
                    }
                }
        }
    }

    public au(Context context, f9 f9Var, rm rmVar, Executor executor) {
        this.f13749b = context;
        this.f13750c = f9Var;
        this.f13751d = rmVar;
        this.f13752e = executor;
    }
}
