package e8;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import java.util.Map;
import java.util.regex.Pattern;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class iq implements oi, zi, tk, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15063a;

    /* renamed from: b  reason: collision with root package name */
    public final d10 f15064b;

    /* renamed from: c  reason: collision with root package name */
    public final oq f15065c;

    /* renamed from: d  reason: collision with root package name */
    public final t00 f15066d;

    /* renamed from: e  reason: collision with root package name */
    public final qe f15067e;

    /* renamed from: f  reason: collision with root package name */
    public final dt f15068f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f15069g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15070h = ((Boolean) ti0.f16763j.f16769f.a(t.Z3)).booleanValue();

    public iq(Context context, d10 d10, oq oqVar, t00 t00, qe qeVar, dt dtVar) {
        this.f15063a = context;
        this.f15064b = d10;
        this.f15065c = oqVar;
        this.f15066d = t00;
        this.f15067e = qeVar;
        this.f15068f = dtVar;
    }

    public final void B(um umVar) {
        if (this.f15070h) {
            p9 t10 = t("ifts");
            ((Map) t10.f15880b).put("reason", "exception");
            if (!TextUtils.isEmpty(umVar.getMessage())) {
                ((Map) t10.f15880b).put("msg", umVar.getMessage());
            }
            t10.l();
        }
    }

    public final void J(zh0 zh0) {
        zh0 zh02;
        if (this.f15070h) {
            p9 t10 = t("ifts");
            ((Map) t10.f15880b).put("reason", "adapter");
            int i10 = zh0.f17753a;
            String str = zh0.f17754b;
            if (zh0.f17755c.equals("com.google.android.gms.ads") && (zh02 = zh0.f17756d) != null && !zh02.f17755c.equals("com.google.android.gms.ads")) {
                zh0 zh03 = zh0.f17756d;
                i10 = zh03.f17753a;
                str = zh03.f17754b;
            }
            if (i10 >= 0) {
                ((Map) t10.f15880b).put("arec", String.valueOf(i10));
            }
            String a10 = this.f15064b.a(str);
            if (a10 != null) {
                ((Map) t10.f15880b).put("areec", a10);
            }
            t10.l();
        }
    }

    public final void O() {
        if (m() || this.f15067e.f7949d0) {
            g(t("impression"));
        }
    }

    public final void U() {
        if (this.f15070h) {
            p9 t10 = t("ifts");
            ((Map) t10.f15880b).put("reason", "blocked");
            t10.l();
        }
    }

    public final void a() {
        if (m()) {
            t("adapter_shown").l();
        }
    }

    public final void g(p9 p9Var) {
        if (this.f15067e.f7949d0) {
            ft ftVar = new ft(l.B.f13193j.b(), ((re) this.f15066d.f16701b.f7135c).f8030b, ((oq) p9Var.f15881c).f15830a.f16512e.a((Map) p9Var.f15880b), 2);
            dt dtVar = this.f15068f;
            dtVar.i(new c(dtVar, ftVar));
            return;
        }
        p9Var.l();
    }

    public final void l() {
        if (m()) {
            t("adapter_impression").l();
        }
    }

    public final boolean m() {
        if (this.f15069g == null) {
            synchronized (this) {
                if (this.f15069g == null) {
                    String str = (String) ti0.f16763j.f16769f.a(t.T0);
                    p pVar = l.B.f13186c;
                    String o10 = p.o(this.f15063a);
                    boolean z10 = false;
                    if (str != null) {
                        try {
                            z10 = Pattern.matches(str, o10);
                        } catch (RuntimeException e10) {
                            y6 y6Var = l.B.f13190g;
                            a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f15069g = Boolean.valueOf(z10);
                }
            }
        }
        return this.f15069g.booleanValue();
    }

    public final void n() {
        if (this.f15067e.f7949d0) {
            g(t("click"));
        }
    }

    public final p9 t(String str) {
        p9 a10 = this.f15065c.a();
        a10.h((re) this.f15066d.f16701b.f7135c);
        ((Map) a10.f15880b).put("aai", this.f15067e.f7969v);
        ((Map) a10.f15880b).put("action", str);
        if (!this.f15067e.f7966s.isEmpty()) {
            ((Map) a10.f15880b).put("ancn", this.f15067e.f7966s.get(0));
        }
        if (this.f15067e.f7949d0) {
            p pVar = l.B.f13186c;
            ((Map) a10.f15880b).put("device_connectivity", p.t(this.f15063a) ? "online" : "offline");
            ((Map) a10.f15880b).put("event_timestamp", String.valueOf(l.B.f13193j.b()));
            ((Map) a10.f15880b).put("offline_ad", "1");
        }
        return a10;
    }
}
