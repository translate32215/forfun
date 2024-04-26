package e8;

import com.google.android.gms.internal.ads.ae;
import com.google.android.gms.internal.ads.df;
import com.google.android.gms.internal.ads.j2;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.pc;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.yd;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zh;
import f7.j0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i5<I, O> implements oh<I, O> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14985a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final k2<O> f14986b;

    /* renamed from: c  reason: collision with root package name */
    public final j2<I> f14987c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14988d;

    /* renamed from: e  reason: collision with root package name */
    public final p50<u4> f14989e;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.pc, com.google.android.gms.internal.ads.k2<O>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.j2<I>, e8.t00] */
    /* JADX WARNING: type inference failed for: r5v0, types: [e8.lt, e8.p50<e8.u4>] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5(com.google.android.gms.internal.ads.pc r2, e8.t00 r3, com.google.android.gms.internal.ads.qe r4, e8.lt r5) {
        /*
            r1 = this;
            r0 = 1
            r1.f14985a = r0
            r1.<init>()
            r1.f14986b = r2
            r1.f14987c = r3
            r1.f14988d = r4
            r1.f14989e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.i5.<init>(com.google.android.gms.internal.ads.pc, e8.t00, com.google.android.gms.internal.ads.qe, e8.lt):void");
    }

    public final p50 a(Object obj) {
        Object obj2 = obj;
        switch (this.f14985a) {
            case 0:
                return yh.j(this.f14989e, new h5(this, obj2), h9.f14886f);
            case 1:
                pc pcVar = (pc) this.f14986b;
                t00 t00 = (t00) this.f14987c;
                qe qeVar = (qe) this.f14988d;
                Throwable th = (Throwable) obj2;
                qu quVar = pcVar.f7849h;
                re reVar = (re) t00.f16701b.f7135c;
                p50 e10 = yh.e(((lt) this.f14989e).b(t00, qeVar), (long) qeVar.M, TimeUnit.MILLISECONDS, pcVar.f7847f);
                long a10 = quVar.f16204a.a();
                String str = qeVar.f7969v;
                if (str != null) {
                    e10.a(new j0((Future) e10, (zh) new pu(quVar, a10, str, qeVar, reVar)), h9.f14886f);
                }
                return e10;
            default:
                yd ydVar = (yd) this.f14986b;
                je jeVar = (je) this.f14987c;
                ae aeVar = (ae) this.f14988d;
                a00 a00 = (a00) this.f14989e;
                vz vzVar = (vz) obj2;
                ydVar.getClass();
                if (vzVar != null) {
                    r10 r10 = vzVar.f17178a;
                    a00<R> a002 = aeVar.f5953a;
                    je jeVar2 = aeVar.f5954b;
                    fi0 fi0 = aeVar.f5955c;
                    String str2 = aeVar.f5956d;
                    Executor executor = aeVar.f5957e;
                    pi0 pi0 = aeVar.f5958f;
                    Executor executor2 = executor;
                    ae aeVar2 = new ae(a002, jeVar2, fi0, str2, executor, pi0, r10);
                    p50<O> p50 = null;
                    if (vzVar.f17180c != null) {
                        ydVar.f8602d = null;
                        ydVar.f8601c.f6208g.add(aeVar2);
                        return ydVar.c(vzVar.f17180c, jeVar, a00);
                    }
                    df<AdT> dfVar = ydVar.f8601c;
                    synchronized (dfVar) {
                        p50<s10<AdT>> p502 = dfVar.f6204c;
                        if (!(p502 == null || p502.isDone())) {
                            dfVar.f6205d = 3;
                            if (!(dfVar.f6202a.a() == null || r10 == null)) {
                                if (dfVar.f6202a.a().equals(r10)) {
                                    dfVar.f6205d = 2;
                                    p50 = yh.j(dfVar.f6203b, new w3((df) dfVar), executor2);
                                }
                            }
                        }
                    }
                    if (p50 != null) {
                        ydVar.f8602d = (fi) a00.C(jeVar.f7150b).b();
                        return yh.j(p50, new nh(ydVar, a00), ydVar.f8603e);
                    }
                    ydVar.f8601c.f6208g.add(aeVar2);
                    jeVar = new je(jeVar.f7150b, vzVar.f17179b);
                }
                p50<AdT> a11 = ydVar.f8599a.a(jeVar, a00);
                ydVar.f8602d = (fi) ydVar.f8599a.b();
                return a11;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.yd, com.google.android.gms.internal.ads.k2<O>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.j2<I>, com.google.android.gms.internal.ads.je] */
    /* JADX WARNING: type inference failed for: r5v0, types: [e8.a00, e8.p50<e8.u4>] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i5(com.google.android.gms.internal.ads.yd r2, com.google.android.gms.internal.ads.je r3, com.google.android.gms.internal.ads.ae r4, e8.a00 r5) {
        /*
            r1 = this;
            r0 = 2
            r1.f14985a = r0
            r1.<init>()
            r1.f14986b = r2
            r1.f14987c = r3
            r1.f14988d = r4
            r1.f14989e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.i5.<init>(com.google.android.gms.internal.ads.yd, com.google.android.gms.internal.ads.je, com.google.android.gms.internal.ads.ae, e8.a00):void");
    }

    public i5(p50 p50, String str, j2 j2Var, k2 k2Var) {
        this.f14989e = p50;
        this.f14988d = str;
        this.f14987c = j2Var;
        this.f14986b = k2Var;
    }
}
