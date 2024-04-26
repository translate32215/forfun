package e8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pw implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16029a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16030b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16031c;

    public pw(rw rwVar, Bundle bundle) {
        this.f16030b = rwVar;
        this.f16031c = bundle;
    }

    public final void a(Object obj) {
        switch (this.f16029a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                int intValue = ((Integer) ti0.f16763j.f16769f.a(t.L2)).intValue();
                f9 f9Var = (f9) this.f16031c;
                if (f9Var != null && f9Var.f14546c >= intValue) {
                    bundle.putString("app_open_version", "2");
                }
                pi0 pi0 = (pi0) this.f16030b;
                if (pi0 != null) {
                    int i10 = pi0.f16007a;
                    if (i10 == 1) {
                        bundle.putString("avo", "p");
                        return;
                    } else if (i10 == 2) {
                        bundle.putString("avo", "l");
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                rw rwVar = (rw) this.f16030b;
                Bundle bundle2 = (Bundle) this.f16031c;
                Bundle bundle3 = (Bundle) obj;
                rwVar.getClass();
                if (((Boolean) ti0.f16763j.f16769f.a(t.W2)).booleanValue()) {
                    bundle3.putBundle("quality_signals", bundle2);
                } else {
                    if (((Boolean) ti0.f16763j.f16769f.a(t.V2)).booleanValue()) {
                        synchronized (rw.f16345g) {
                            rwVar.f16348c.a(rwVar.f16350e.f17190d);
                            bundle3.putBundle("quality_signals", rwVar.f16349d.a());
                        }
                    } else {
                        rwVar.f16348c.a(rwVar.f16350e.f17190d);
                        bundle3.putBundle("quality_signals", rwVar.f16349d.a());
                    }
                }
                bundle3.putString("seq_num", rwVar.f16346a);
                bundle3.putString("session_id", rwVar.f16351f.b() ? "" : rwVar.f16347b);
                return;
        }
    }

    public pw(pi0 pi0, f9 f9Var) {
        this.f16030b = pi0;
        this.f16031c = f9Var;
    }
}
