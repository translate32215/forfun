package e8;

import android.content.Context;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.n2;
import com.google.android.gms.internal.ads.pc;
import com.google.android.gms.internal.ads.yh;
import d7.l;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mh<T> {

    /* renamed from: a  reason: collision with root package name */
    public final mr f15512a;

    /* renamed from: b  reason: collision with root package name */
    public final w00 f15513b;

    /* renamed from: c  reason: collision with root package name */
    public final n20 f15514c;

    /* renamed from: d  reason: collision with root package name */
    public final w3 f15515d;

    /* renamed from: e  reason: collision with root package name */
    public final pc<T> f15516e;

    /* renamed from: f  reason: collision with root package name */
    public final wk f15517f;

    /* renamed from: g  reason: collision with root package name */
    public final t00 f15518g;

    /* renamed from: h  reason: collision with root package name */
    public final j8 f15519h;

    /* renamed from: i  reason: collision with root package name */
    public final di f15520i;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f15521j;

    /* renamed from: k  reason: collision with root package name */
    public final ur f15522k;

    /* renamed from: l  reason: collision with root package name */
    public final qt f15523l;

    public mh(mr mrVar, w00 w00, n20 n20, w3 w3Var, pc<T> pcVar, wk wkVar, t00 t00, j8 j8Var, di diVar, Executor executor, ur urVar, qt qtVar) {
        this.f15512a = mrVar;
        this.f15513b = w00;
        this.f15514c = n20;
        this.f15515d = w3Var;
        this.f15516e = pcVar;
        this.f15517f = wkVar;
        this.f15518g = t00;
        this.f15519h = j8Var;
        this.f15520i = diVar;
        this.f15521j = executor;
        this.f15522k = urVar;
        this.f15523l = qtVar;
    }

    public final p50<t00> a(p50<l5> p50) {
        Cif ifVar = Cif.SERVER_TRANSACTION;
        if (this.f15518g != null) {
            return this.f15514c.c(ifVar).s(yh.h(this.f15518g)).e();
        }
        gv gvVar = l.B.f13192i;
        gvVar.getClass();
        if (((Boolean) ti0.f16763j.f16769f.a(t.Z1)).booleanValue()) {
            synchronized (gvVar.f6705b) {
                gvVar.a();
                d40 d40 = p.f5702i;
                d40.removeCallbacks(gvVar.f6704a);
                d40.postDelayed(gvVar.f6704a, ((Long) ti0.f16763j.f16769f.a(t.f16545a2)).longValue());
            }
        }
        if (this.f15513b.f17190d.A != null) {
            c c10 = this.f15514c.c(ifVar);
            mr mrVar = this.f15512a;
            mrVar.getClass();
            m2 b10 = l.B.f13199p.b((Context) mrVar.f15536a, (f9) mrVar.f15537b);
            y4<JSONObject> y4Var = x4.f17438b;
            n2 n2Var = new n2(b10.f7437a, "google.afma.response.normalize", y4Var, y4Var);
            return c10.s(yh.j(yh.j(yh.j(yh.h(""), new nh(mrVar, ((w00) mrVar.f15538c).f17190d.A), (Executor) mrVar.f15539d), new w3(n2Var), (Executor) mrVar.f15539d), new vo(mrVar), (Executor) mrVar.f15539d)).e();
        }
        dv b11 = this.f15514c.b(ifVar, p50);
        ur urVar = this.f15522k;
        urVar.getClass();
        return b11.c(new w3(urVar), ((k20) b11.f14338f).f15223a).e();
    }

    public final p50<T> b() {
        return c(a(this.f15520i.b()));
    }

    public final p50<T> c(p50<t00> p50) {
        Cif ifVar = Cif.RENDERER;
        if (((Boolean) ti0.f16763j.f16769f.a(t.S2)).booleanValue()) {
            return this.f15514c.b(ifVar, p50).b(this.f15515d).b(this.f15516e).e();
        }
        return this.f15514c.b(ifVar, p50).b(this.f15515d).b(this.f15516e).a((long) ((Integer) ti0.f16763j.f16769f.a(t.T2)).intValue(), TimeUnit.SECONDS).e();
    }
}
