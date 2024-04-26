package e8;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hy implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f14951a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14952b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14953c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14954d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14955e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14956f;

    public hy(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.f14951a = str;
        this.f14952b = i10;
        this.f14953c = i11;
        this.f14954d = i12;
        this.f14955e = z10;
        this.f14956f = i13;
    }

    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f14951a;
        boolean z10 = true;
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("carrier", str);
        }
        Integer valueOf = Integer.valueOf(this.f14952b);
        if (this.f14952b == -2) {
            z10 = false;
        }
        jc0.d(bundle, "cnt", valueOf, z10);
        bundle.putInt("gnt", this.f14953c);
        bundle.putInt("pt", this.f14954d);
        Bundle bundle2 = bundle.getBundle("device");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle.putBundle("device", bundle2);
        Bundle bundle3 = bundle2.getBundle("network");
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        bundle2.putBundle("network", bundle3);
        bundle3.putInt("active_network_state", this.f14956f);
        bundle3.putBoolean("active_network_metered", this.f14955e);
    }
}
