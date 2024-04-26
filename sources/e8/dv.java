package e8;

import android.view.View;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.l9;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.zh;
import d7.e;
import f7.j0;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import r7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dv implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14333a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14334b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14335c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14336d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f14337e;

    /* renamed from: f  reason: collision with root package name */
    public Object f14338f;

    public dv(ki kiVar, yi yiVar, wl wlVar, l9 l9Var, p8 p8Var) {
        this.f14338f = new AtomicBoolean(false);
        this.f14333a = kiVar;
        this.f14334b = yiVar;
        this.f14335c = wlVar;
        this.f14336d = l9Var;
        this.f14337e = p8Var;
    }

    public void B() {
        if (((AtomicBoolean) this.f14338f).get()) {
            ((ki) this.f14333a).I0(ji.f15149a);
        }
    }

    public void J() {
        if (((AtomicBoolean) this.f14338f).get()) {
            ((yi) this.f14334b).O();
            ((wl) this.f14335c).K0();
        }
    }

    public dv a(long j10, TimeUnit timeUnit) {
        Object obj = this.f14338f;
        return new dv((k20) obj, this.f14333a, (String) this.f14334b, (p50) this.f14335c, (List) this.f14336d, yh.e((p50) this.f14337e, j10, timeUnit, ((k20) obj).f15224b));
    }

    public <O2> dv b(oh<O, O2> ohVar) {
        return c(ohVar, ((k20) this.f14338f).f15223a);
    }

    public <O2> dv c(oh<O, O2> ohVar, Executor executor) {
        return new dv((k20) this.f14338f, this.f14333a, (String) this.f14334b, (p50) this.f14335c, (List) this.f14336d, yh.j((p50) this.f14337e, ohVar, executor));
    }

    public <T extends Throwable> dv d(Class<T> cls, oh<T, O> ohVar) {
        k20 k20 = (k20) this.f14338f;
        return new dv(k20, this.f14333a, (String) this.f14334b, (p50) this.f14335c, (List) this.f14336d, yh.k((p50) this.f14337e, cls, ohVar, k20.f15223a));
    }

    public hf<E, O> e() {
        String str;
        Object obj = this.f14333a;
        Object obj2 = this.f14334b;
        if (((String) obj2) == null) {
            ((n20) ((k20) this.f14338f)).getClass();
            str = ((Cif) obj).f7092a;
        } else {
            str = (String) obj2;
        }
        hf<E, O> hfVar = new hf<>(obj, str, (p50) this.f14337e);
        ((k20) this.f14338f).f15225c.d0(hfVar);
        m mVar = new m(this, (hf) hfVar);
        o50 o50 = h9.f14886f;
        ((p50) this.f14335c).a(mVar, o50);
        hfVar.a(new j0((Future) hfVar, (zh) new p9(this, (hf) hfVar)), o50);
        return hfVar;
    }

    public <O2> dv f(gf<O, O2> gfVar) {
        return c(new w3((gf) gfVar), ((k20) this.f14338f).f15223a);
    }

    public <O2> dv g(p50<O2> p50) {
        return c(new qo(p50, 2), h9.f14886f);
    }

    public synchronized void t(View view) {
        if (((AtomicBoolean) this.f14338f).compareAndSet(false, true)) {
            ((p8) this.f14337e).O();
            ((l9) this.f14336d).K0(view);
        }
    }

    public dv(k20 k20, Object obj, String str, p50 p50, List list, p50 p502) {
        this.f14338f = k20;
        this.f14333a = obj;
        this.f14334b = str;
        this.f14335c = p50;
        this.f14336d = list;
        this.f14337e = p502;
    }

    public /* synthetic */ dv(k20 k20, Object obj, p50 p50, List list, p50 p502) {
        this(k20, obj, (String) null, p50, list, p502);
    }
}
