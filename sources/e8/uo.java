package e8;

import com.google.android.gms.ads.internal.a;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import d7.l;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uo {

    /* renamed from: a  reason: collision with root package name */
    public final w00 f16977a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f16978b;

    /* renamed from: c  reason: collision with root package name */
    public final cb f16979c;

    public uo(w00 w00, Executor executor, cb cbVar) {
        this.f16977a = w00;
        this.f16978b = executor;
        this.f16979c = cbVar;
    }

    public final void a(t7 t7Var) {
        t7Var.r("/video", q2.f16073m);
        t7Var.r("/videoMeta", q2.f16074n);
        t7Var.r("/precache", new hb());
        t7Var.r("/delayPageLoaded", q2.f16077q);
        t7Var.r("/instrument", q2.f16075o);
        t7Var.r("/log", q2.f16068h);
        t7Var.r("/videoClicked", q2.f16069i);
        s7 s7Var = (s7) t7Var.H();
        synchronized (s7Var.f8092d) {
            s7Var.f8101u = true;
        }
        f3<t7> f3Var = q2.f16061a;
        t7Var.r("/click", u2.f16841a);
        if (((Boolean) ti0.f16763j.f16769f.a(t.I1)).booleanValue()) {
            t7Var.r("/getNativeAdViewSignals", q2.f16080t);
        }
        if (this.f16977a.f17189c != null) {
            s7 s7Var2 = (s7) t7Var.H();
            synchronized (s7Var2.f8092d) {
                s7Var2.f8102v = true;
            }
            t7Var.r("/open", new i3((a) null, (b6) null, (dt) null, (oq) null, (t20) null));
        } else {
            s7 s7Var3 = (s7) t7Var.H();
            synchronized (s7Var3.f8092d) {
                s7Var3.f8102v = false;
            }
        }
        if (l.B.f13207x.p(t7Var.getContext())) {
            t7Var.r("/logScionEvent", new l2(t7Var.getContext()));
        }
    }
}
