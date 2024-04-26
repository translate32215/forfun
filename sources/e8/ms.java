package e8;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import java.util.regex.Pattern;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ms implements oi, zi, tk, wh0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15540a;

    /* renamed from: b  reason: collision with root package name */
    public final d10 f15541b;

    /* renamed from: c  reason: collision with root package name */
    public final t00 f15542c;

    /* renamed from: d  reason: collision with root package name */
    public final qe f15543d;

    /* renamed from: e  reason: collision with root package name */
    public final dt f15544e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f15545f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15546g = ((Boolean) ti0.f16763j.f16769f.a(t.Z3)).booleanValue();

    /* renamed from: h  reason: collision with root package name */
    public final t20 f15547h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15548i;

    public ms(Context context, d10 d10, t00 t00, qe qeVar, dt dtVar, t20 t20, String str) {
        this.f15540a = context;
        this.f15541b = d10;
        this.f15542c = t00;
        this.f15543d = qeVar;
        this.f15544e = dtVar;
        this.f15547h = t20;
        this.f15548i = str;
    }

    public final void B(um umVar) {
        if (this.f15546g) {
            u20 t10 = t("ifts");
            t10.f16842a.put("reason", "exception");
            if (!TextUtils.isEmpty(umVar.getMessage())) {
                t10.f16842a.put("msg", umVar.getMessage());
            }
            this.f15547h.a(t10);
        }
    }

    public final void J(zh0 zh0) {
        zh0 zh02;
        if (this.f15546g) {
            int i10 = zh0.f17753a;
            String str = zh0.f17754b;
            if (zh0.f17755c.equals("com.google.android.gms.ads") && (zh02 = zh0.f17756d) != null && !zh02.f17755c.equals("com.google.android.gms.ads")) {
                zh0 zh03 = zh0.f17756d;
                i10 = zh03.f17753a;
                str = zh03.f17754b;
            }
            String a10 = this.f15541b.a(str);
            u20 t10 = t("ifts");
            t10.f16842a.put("reason", "adapter");
            if (i10 >= 0) {
                t10.f16842a.put("arec", String.valueOf(i10));
            }
            if (a10 != null) {
                t10.f16842a.put("areec", a10);
            }
            this.f15547h.a(t10);
        }
    }

    public final void O() {
        if (m() || this.f15543d.f7949d0) {
            g(t("impression"));
        }
    }

    public final void U() {
        if (this.f15546g) {
            t20 t20 = this.f15547h;
            u20 t10 = t("ifts");
            t10.f16842a.put("reason", "blocked");
            t20.a(t10);
        }
    }

    public final void a() {
        if (m()) {
            this.f15547h.a(t("adapter_shown"));
        }
    }

    public final void g(u20 u20) {
        if (this.f15543d.f7949d0) {
            ft ftVar = new ft(l.B.f13193j.b(), ((re) this.f15542c.f16701b.f7135c).f8030b, this.f15547h.b(u20), 2);
            dt dtVar = this.f15544e;
            dtVar.i(new c(dtVar, ftVar));
            return;
        }
        this.f15547h.a(u20);
    }

    public final void l() {
        if (m()) {
            this.f15547h.a(t("adapter_impression"));
        }
    }

    public final boolean m() {
        if (this.f15545f == null) {
            synchronized (this) {
                if (this.f15545f == null) {
                    String str = (String) ti0.f16763j.f16769f.a(t.T0);
                    p pVar = l.B.f13186c;
                    String o10 = p.o(this.f15540a);
                    boolean z10 = false;
                    if (str != null) {
                        try {
                            z10 = Pattern.matches(str, o10);
                        } catch (RuntimeException e10) {
                            y6 y6Var = l.B.f13190g;
                            a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f15545f = Boolean.valueOf(z10);
                }
            }
        }
        return this.f15545f.booleanValue();
    }

    public final void n() {
        if (this.f15543d.f7949d0) {
            g(t("click"));
        }
    }

    public final u20 t(String str) {
        u20 c10 = u20.c(str);
        c10.a(this.f15542c, (x8) null);
        c10.f16842a.put("aai", this.f15543d.f7969v);
        c10.f16842a.put("request_id", this.f15548i);
        if (!this.f15543d.f7966s.isEmpty()) {
            c10.f16842a.put("ancn", this.f15543d.f7966s.get(0));
        }
        if (this.f15543d.f7949d0) {
            p pVar = l.B.f13186c;
            c10.f16842a.put("device_connectivity", p.t(this.f15540a) ? "online" : "offline");
            c10.f16842a.put("event_timestamp", String.valueOf(l.B.f13193j.b()));
            c10.f16842a.put("offline_ad", "1");
        }
        return c10;
    }
}
