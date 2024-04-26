package e8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.cw;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.kb;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.nv;
import com.google.android.gms.internal.ads.o8;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.ub;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.wc;
import com.google.android.gms.internal.ads.y6;
import com.startapp.b4;
import d7.l;
import f7.d0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gf implements ta0<tg0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14770a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<qe> f14771b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<f9> f14772c;

    /* renamed from: d  reason: collision with root package name */
    public final ab0<JSONObject> f14773d;

    /* renamed from: e  reason: collision with root package name */
    public final ab0<String> f14774e;

    public gf(ab0 ab0, ab0 ab02, ab0 ab03, ab0 ab04, int i10) {
        this.f14770a = i10;
        switch (i10) {
            case 1:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 2:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 3:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 4:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 5:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 6:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 7:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case b4.f10106f:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 9:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 10:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 11:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 12:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 13:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 14:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 15:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 16:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 17:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            case 18:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
            default:
                this.f14771b = ab0;
                this.f14772c = ab02;
                this.f14773d = ab03;
                this.f14774e = ab04;
                return;
        }
    }

    public static gf a(ab0<qe> ab0, ab0<f9> ab02, ab0<JSONObject> ab03, ab0<String> ab04) {
        return new gf(ab0, ab02, ab03, ab04, 0);
    }

    public static gf b(ab0<yi> ab0, ab0<qe> ab02, ab0<ScheduledExecutorService> ab03, ab0<Executor> ab04) {
        return new gf(ab0, ab02, ab03, ab04, 2);
    }

    public static gf c(ab0<o50> ab0, ab0<o50> ab02, ab0<nr> ab03, ab0<cs> ab04) {
        return new gf(ab0, ab02, ab03, ab04, 7);
    }

    public static gf d(ab0<Context> ab0, ab0<di> ab02, ab0<xs> ab03, ab0<vs> ab04) {
        return new gf(ab0, ab02, ab03, ab04, 8);
    }

    public static <AdT, AdapterT, ListenerT extends kj> gf e(ab0<n20> ab0, ab0<o50> ab02, ab0<ub<AdapterT, ListenerT>> ab03, ab0<vb<AdT, AdapterT, ListenerT>> ab04) {
        return new gf(ab0, ab02, ab03, ab04, 14);
    }

    public static gf f(ab0<dt> ab0, ab0<e30> ab02, ab0<qe> ab03, ab0<re> ab04) {
        return new gf(ab0, ab02, ab03, ab04, 18);
    }

    public final Object get() {
        Set set;
        switch (this.f14770a) {
            case 0:
                qe qeVar = this.f14771b.get();
                String str = this.f14774e.get();
                boolean equals = "native".equals(str);
                p pVar = l.B.f13186c;
                return new tg0(p.K(), this.f14772c.get(), str, this.f14773d.get(), equals);
            case 1:
                return new ug((zg) this.f14771b.get(), (g1) this.f14772c.get(), (Runnable) this.f14773d.get(), (Executor) this.f14774e.get());
            case 2:
                return new bi((yi) this.f14771b.get(), (qe) this.f14772c.get(), (ScheduledExecutorService) this.f14773d.get(), (Executor) this.f14774e.get());
            case 3:
                return new hf((Executor) this.f14772c.get(), new o8((Context) this.f14773d.get(), (tg0) this.f14771b.get()), (b) this.f14774e.get());
            case 4:
                return new ap((Context) this.f14771b.get(), (jn) this.f14772c.get(), (tn) this.f14773d.get(), (fn) this.f14774e.get());
            case 5:
                return new zu((n20) this.f14771b.get(), (o50) this.f14772c.get(), (wc) this.f14774e.get(), (qc) this.f14773d.get());
            case 6:
                String str2 = (String) this.f14771b.get();
                Context context = (Context) this.f14772c.get();
                Executor executor = (Executor) this.f14773d.get();
                Map map = (Map) this.f14774e.get();
                if (((Boolean) ti0.f16763j.f16769f.a(t.f16695z2)).booleanValue()) {
                    nv nvVar = new nv(new th0(context));
                    synchronized (nvVar) {
                        if (nvVar.f7660c) {
                            try {
                                cw.a aVar = nvVar.f7659b;
                                if (aVar.f5971c) {
                                    aVar.n();
                                    aVar.f5971c = false;
                                }
                                cw.F((cw) aVar.f5970b, str2);
                            } catch (NullPointerException e10) {
                                y6 y6Var = l.B.f13190g;
                                a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AdMobClearcutLogger.modify");
                            }
                        }
                    }
                    set = Collections.singleton(new ul(new kb(nvVar, map), executor));
                } else {
                    set = Collections.emptySet();
                }
                jc0.b(set, "Cannot return null from a non-@Nullable @Provides method");
                return set;
            case 7:
                return new dr((o50) this.f14771b.get(), (o50) this.f14772c.get(), (nr) this.f14773d.get(), ua0.a(this.f14774e));
            case b4.f10106f:
                return new rb((Context) this.f14771b.get(), (di) this.f14772c.get(), (xs) this.f14773d.get(), (vs) this.f14774e.get());
            case 9:
                return new vt((mf) this.f14771b.get(), (Context) this.f14772c.get(), (Executor) this.f14773d.get(), (cb) this.f14774e.get());
            case 10:
                return new au((Context) this.f14771b.get(), this.f14772c.get(), (pg) this.f14773d.get(), (Executor) this.f14774e.get());
            case 11:
                return new bu((Context) this.f14771b.get(), (Executor) this.f14772c.get(), (rm) this.f14773d.get(), (oe) this.f14774e.get());
            case 12:
                return new au((Context) this.f14771b.get(), this.f14772c.get(), (rm) this.f14773d.get(), (Executor) this.f14774e.get());
            case 13:
                return new hu((zm) this.f14771b.get(), (o50) this.f14772c.get(), (ko) this.f14773d.get(), (ve) this.f14774e.get());
            case 14:
                return new zu((n20) this.f14771b.get(), (o50) this.f14772c.get(), (ub) this.f14773d.get(), (vb) this.f14774e.get());
            case 15:
                return new vt((n20) this.f14771b.get(), (o50) this.f14772c.get(), (n) this.f14773d.get(), (ev) this.f14774e.get());
            case 16:
                return new fx((o50) this.f14771b.get(), (ViewGroup) this.f14772c.get(), (Context) this.f14773d.get(), (Set) this.f14774e.get());
            case 17:
                return new jx((o50) this.f14771b.get(), (w00) this.f14772c.get(), (PackageInfo) this.f14773d.get(), (d0) this.f14774e.get());
            default:
                return new c10((dt) this.f14771b.get(), (e30) this.f14772c.get(), (qe) this.f14773d.get(), (re) this.f14774e.get());
        }
    }
}
