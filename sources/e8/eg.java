package e8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.bd;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.y8;
import f7.j;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class eg extends dg {

    /* renamed from: h  reason: collision with root package name */
    public final Context f14469h;

    /* renamed from: i  reason: collision with root package name */
    public final View f14470i;

    /* renamed from: j  reason: collision with root package name */
    public final t7 f14471j;

    /* renamed from: k  reason: collision with root package name */
    public final pe f14472k;

    /* renamed from: l  reason: collision with root package name */
    public final y8 f14473l;

    /* renamed from: m  reason: collision with root package name */
    public final qn f14474m;

    /* renamed from: n  reason: collision with root package name */
    public final wl f14475n;

    /* renamed from: o  reason: collision with root package name */
    public final pa0<bd> f14476o;

    /* renamed from: p  reason: collision with root package name */
    public final Executor f14477p;

    /* renamed from: q  reason: collision with root package name */
    public li0 f14478q;

    public eg(zg zgVar, Context context, pe peVar, View view, t7 t7Var, y8 y8Var, qn qnVar, wl wlVar, pa0<bd> pa0, Executor executor) {
        super(zgVar);
        this.f14469h = context;
        this.f14470i = view;
        this.f14471j = t7Var;
        this.f14472k = peVar;
        this.f14473l = y8Var;
        this.f14474m = qnVar;
        this.f14475n = wlVar;
        this.f14476o = pa0;
        this.f14477p = executor;
    }

    public final void b() {
        this.f14477p.execute(new j(this));
        super.b();
    }

    public final hz c() {
        try {
            return this.f14473l.getVideoController();
        } catch (b10 unused) {
            return null;
        }
    }

    public final void d(ViewGroup viewGroup, li0 li0) {
        t7 t7Var;
        if (viewGroup != null && (t7Var = this.f14471j) != null) {
            t7Var.c0(wc.c(li0));
            viewGroup.setMinimumHeight(li0.f15396c);
            viewGroup.setMinimumWidth(li0.f15399f);
            this.f14478q = li0;
        }
    }

    public final pe e() {
        boolean z10;
        li0 li0 = this.f14478q;
        if (li0 != null) {
            return g7.s(li0);
        }
        qe qeVar = this.f13725b;
        if (qeVar.W) {
            Iterator<String> it = qeVar.f7942a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return new pe(this.f14470i.getWidth(), this.f14470i.getHeight(), false);
            }
        }
        return this.f13725b.f7964q.get(0);
    }

    public final View f() {
        return this.f14470i;
    }

    public final pe g() {
        return this.f14472k;
    }

    public final int h() {
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16589h4)).booleanValue() && this.f13725b.f7945b0) {
            if (!((Boolean) ti0.f16763j.f16769f.a(t.f16595i4)).booleanValue()) {
                return 0;
            }
        }
        return ((re) this.f13724a.f16701b.f7135c).f8031c;
    }

    public final void i() {
        this.f14475n.K0();
    }
}
