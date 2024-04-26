package e8;

import android.os.Bundle;
import com.google.android.gms.internal.ads.l5;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class os implements pi, pj, ek {

    /* renamed from: a  reason: collision with root package name */
    public final u20 f15839a;

    /* renamed from: b  reason: collision with root package name */
    public final t20 f15840b;

    /* renamed from: c  reason: collision with root package name */
    public final x8 f15841c;

    public os(u20 u20, t20 t20, x8 x8Var) {
        this.f15839a = u20;
        this.f15840b = t20;
        this.f15841c = x8Var;
    }

    public final void C0(t00 t00) {
        this.f15839a.a(t00, this.f15841c);
    }

    public final void j0(zh0 zh0) {
        u20 u20 = this.f15839a;
        u20.f16842a.put("action", "ftl");
        u20.f16842a.put("ftl", String.valueOf(zh0.f17753a));
        u20.f16842a.put("ed", zh0.f17755c);
        this.f15840b.a(this.f15839a);
    }

    public final void k0(l5 l5Var) {
        u20 u20 = this.f15839a;
        Bundle bundle = l5Var.f7314a;
        u20.getClass();
        if (bundle.containsKey("cnt")) {
            u20.f16842a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            u20.f16842a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void v() {
        t20 t20 = this.f15840b;
        u20 u20 = this.f15839a;
        u20.f16842a.put("action", "loaded");
        t20.a(u20);
    }
}
