package e8;

import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ut implements mg {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16990a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final t7 f16991b;

    /* renamed from: c  reason: collision with root package name */
    public final qe f16992c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f16993d;

    public ut(st stVar, t7 t7Var, qe qeVar, sf sfVar) {
        this.f16991b = t7Var;
        this.f16992c = qeVar;
        this.f16993d = sfVar;
    }

    public final Object apply(Object obj) {
        switch (this.f16990a) {
            case 0:
                t7 t7Var = this.f16991b;
                qe qeVar = this.f16992c;
                sf sfVar = (sf) this.f16993d;
                if (qeVar.H) {
                    t7Var.I();
                }
                t7Var.p0();
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16621n0)).booleanValue()) {
                    t7Var.onPause();
                }
                return sfVar.h();
            case 1:
                t7 t7Var2 = this.f16991b;
                qe qeVar2 = this.f16992c;
                jm jmVar = (jm) this.f16993d;
                if (qeVar2.H) {
                    t7Var2.I();
                }
                t7Var2.p0();
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16621n0)).booleanValue()) {
                    t7Var2.onPause();
                }
                return jmVar.j();
            default:
                t7 t7Var3 = this.f16991b;
                qe qeVar3 = this.f16992c;
                ip ipVar = (ip) this.f16993d;
                if (qeVar3.H) {
                    t7Var3.I();
                }
                t7Var3.p0();
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16621n0)).booleanValue()) {
                    t7Var3.onPause();
                }
                return ipVar.k();
        }
    }

    public ut(st stVar, t7 t7Var, qe qeVar, jm jmVar) {
        this.f16991b = t7Var;
        this.f16992c = qeVar;
        this.f16993d = jmVar;
    }

    public ut(st stVar, t7 t7Var, qe qeVar, ip ipVar) {
        this.f16991b = t7Var;
        this.f16992c = qeVar;
        this.f16993d = ipVar;
    }
}
