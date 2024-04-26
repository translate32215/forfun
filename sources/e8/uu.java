package e8;

import android.content.Context;
import c8.b;
import com.google.android.gms.internal.ads.ac;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.vc;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.y5;
import com.google.android.gms.internal.ads.za;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uu implements vb<za, ue, zb> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16994a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f16995b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f16996c;

    /* renamed from: d  reason: collision with root package name */
    public final kp f16997d;

    public uu(Context context, Executor executor, kp kpVar, int i10) {
        this.f16994a = i10;
        if (i10 != 1) {
            this.f16995b = context;
            this.f16996c = executor;
            this.f16997d = kpVar;
            return;
        }
        this.f16995b = context;
        this.f16996c = executor;
        this.f16997d = kpVar;
    }

    public static void c(t00 t00, qe qeVar, mt<ue, ac> mtVar) {
        try {
            ue ueVar = (ue) mtVar.f15550b;
            fi0 fi0 = ((w00) t00.f16700a.f8042b).f17190d;
            String jSONObject = qeVar.f7968u.toString();
            ueVar.getClass();
            ueVar.f8245a.d2(fi0, jSONObject);
        } catch (Exception e10) {
            String valueOf = String.valueOf(mtVar.f15549a);
            e.D(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e10);
        } catch (Throwable th) {
            throw new b10(th);
        }
    }

    public final Object a(t00 t00, qe qeVar, mt mtVar) {
        switch (this.f16994a) {
            case 0:
                ip e10 = this.f16997d.e(new j8(t00, qeVar, mtVar.f15549a), new jp(new tu(mtVar)));
                e10.a().J0(new cj((ue) mtVar.f15550b), this.f16996c);
                ((zb) mtVar.f15551c).t6(e10.m());
                return e10.k();
            default:
                ip e11 = this.f16997d.e(new j8(t00, qeVar, mtVar.f15549a), new jp(new fu(mtVar, 1)));
                e11.a().J0(new cj((ue) mtVar.f15550b), this.f16996c);
                dj b10 = e11.b();
                ki c10 = e11.c();
                uj j10 = e11.j();
                am l10 = e11.l();
                ac acVar = (ac) mtVar.f15551c;
                vc vcVar = new vc(j10, c10, b10, l10);
                synchronized (acVar) {
                    acVar.f5946a = vcVar;
                }
                return e11.k();
        }
    }

    public final void b(t00 t00, qe qeVar, mt mtVar) {
        switch (this.f16994a) {
            case 0:
                try {
                    w00 w00 = (w00) t00.f16700a.f8042b;
                    if (w00.f17201o.f16946b == 3) {
                        ue ueVar = (ue) mtVar.f15550b;
                        Context context = this.f16995b;
                        fi0 fi0 = w00.f17190d;
                        String jSONObject = qeVar.f7968u.toString();
                        y2 y2Var = (y2) mtVar.f15551c;
                        ueVar.getClass();
                        ueVar.f8245a.b5(new b(context), fi0, jSONObject, y2Var);
                        return;
                    }
                    ue ueVar2 = (ue) mtVar.f15550b;
                    Context context2 = this.f16995b;
                    fi0 fi02 = w00.f17190d;
                    String jSONObject2 = qeVar.f7968u.toString();
                    y2 y2Var2 = (y2) mtVar.f15551c;
                    ueVar2.getClass();
                    ueVar2.f8245a.m6(new b(context2), fi02, jSONObject2, y2Var2);
                    return;
                } catch (Exception e10) {
                    String valueOf = String.valueOf(mtVar.f15549a);
                    e.D(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e10);
                    return;
                } catch (Throwable th) {
                    throw new b10(th);
                }
            default:
                ue ueVar3 = (ue) mtVar.f15550b;
                ueVar3.getClass();
                try {
                    if (!ueVar3.f8245a.isInitialized()) {
                        mr mrVar = new mr(this, t00, qeVar, mtVar);
                        ac acVar = (ac) mtVar.f15551c;
                        synchronized (acVar) {
                            acVar.f5948c = mrVar;
                        }
                        ue ueVar4 = (ue) mtVar.f15550b;
                        Context context3 = this.f16995b;
                        fi0 fi03 = ((w00) t00.f16700a.f8042b).f17190d;
                        y5 y5Var = (y5) mtVar.f15551c;
                        String jSONObject3 = qeVar.f7968u.toString();
                        ueVar4.getClass();
                        try {
                            ueVar4.f8245a.U0(new b(context3), fi03, (String) null, y5Var, jSONObject3);
                            return;
                        } catch (Throwable th2) {
                            throw new b10(th2);
                        }
                    } else {
                        c(t00, qeVar, mtVar);
                        return;
                    }
                } finally {
                    b10 b10 = new b10(th2);
                }
        }
    }
}
