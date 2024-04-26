package e8;

import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.be;
import com.google.android.gms.internal.ads.ce;
import com.google.android.gms.internal.ads.eh;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.he;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.ie;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.ye;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zd;
import com.google.android.gms.internal.ads.ze;
import com.google.android.gms.internal.ads.zh;
import e.h;
import e8.ah;
import e8.fi;
import f7.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uz<R extends fi<AdT>, AdT extends ah> implements yz<R, vz<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    public final l10 f17006a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f17007b;

    /* renamed from: c  reason: collision with root package name */
    public zh<Void> f17008c = new be();

    public uz(l10 l10, Executor executor) {
        this.f17006a = l10;
        this.f17007b = executor;
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [e8.p50, com.google.android.gms.internal.ads.gh, e8.l50] */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.eh, com.google.android.gms.internal.ads.gh, java.lang.Runnable, e8.p50<e8.vz<AdT>>] */
    /* JADX WARNING: type inference failed for: r1v19, types: [e8.p50, com.google.android.gms.internal.ads.gh, e8.l50] */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.eh, com.google.android.gms.internal.ads.gh, java.lang.Runnable] */
    public final p50<vz<AdT>> a(je jeVar, a00<R> a00) {
        p50 p50;
        p50 p502;
        wz wzVar = new wz(this.f17006a, jeVar.f7150b, (a00) a00, this.f17007b);
        he heVar = (he) wzVar.f17422e;
        if (heVar != null) {
            p50 = yh.h(heVar);
        } else {
            if (!((Boolean) a1.f13652a.b()).booleanValue()) {
                he heVar2 = new he((l5) null, wzVar.a(), (ge) null);
                wzVar.f17422e = heVar2;
                p502 = yh.h(heVar2);
            } else {
                mh a10 = ((fi) wzVar.f17420c.C((b00) wzVar.f17419b).d(new zd(((ye) ((l10) wzVar.f17418a)).f8605b.f8703g)).b()).a();
                ze zeVar = ((ye) ((l10) wzVar.f17418a)).f8605b;
                dv b10 = a10.f15514c.b(Cif.GET_CACHE_KEY, a10.f15520i.b());
                hf e10 = b10.c(new nh(a10, zeVar), ((k20) b10.f14338f).f15223a).e();
                qh qhVar = new qh(a10);
                e10.a(new j0((Future) e10, (zh) qhVar), a10.f15521j);
                ? t10 = l50.v(e10).t(new ie(wzVar), (Executor) wzVar.f17421d);
                ? ehVar = new eh(t10, wr.class, new ge(wzVar));
                t10.a(ehVar, h.d((Executor) wzVar.f17421d, ehVar));
                p502 = ehVar;
            }
            p50 = yh.i(p502, xz.f17539a, (Executor) wzVar.f17421d);
        }
        ? u10 = l50.v(p50).u(new ih(this, jeVar, (a00) a00), this.f17007b);
        ce ceVar = new ce();
        Executor executor = this.f17007b;
        ? ehVar2 = new eh(u10, Exception.class, ceVar);
        u10.a(ehVar2, h.d(executor, ehVar2));
        return ehVar2;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }
}
