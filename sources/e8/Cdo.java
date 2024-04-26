package e8;

import com.google.android.gms.internal.ads.t7;
import s.a;

/* renamed from: e8.do  reason: invalid class name */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class Cdo implements zi {

    /* renamed from: a  reason: collision with root package name */
    public final jn f14314a;

    /* renamed from: b  reason: collision with root package name */
    public final mn f14315b;

    public Cdo(jn jnVar, mn mnVar) {
        this.f14314a = jnVar;
        this.f14315b = mnVar;
    }

    public final void O() {
        if (this.f14314a.q() != null) {
            t7 p10 = this.f14314a.p();
            t7 o10 = this.f14314a.o();
            if (p10 == null) {
                p10 = o10 != null ? o10 : null;
            }
            if (this.f14315b.a() && p10 != null) {
                p10.O("onSdkImpression", new a());
            }
        }
    }
}
