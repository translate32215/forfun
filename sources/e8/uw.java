package e8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uw implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final double f16999a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17000b;

    public uw(double d10, boolean z10) {
        this.f16999a = d10;
        this.f17000b = z10;
    }

    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a10 = jc0.a(bundle, "device");
        bundle.putBundle("device", a10);
        Bundle bundle2 = a10.getBundle("battery");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        a10.putBundle("battery", bundle2);
        bundle2.putBoolean("is_charging", this.f17000b);
        bundle2.putDouble("battery_level", this.f16999a);
    }
}
