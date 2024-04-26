package e8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xx implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17531a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17532b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17533c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17534d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17535e;

    /* renamed from: f  reason: collision with root package name */
    public final int f17536f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17537g;

    public xx(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12) {
        this.f17531a = z10;
        this.f17532b = z11;
        this.f17533c = str;
        this.f17534d = z12;
        this.f17535e = i10;
        this.f17536f = i11;
        this.f17537g = i12;
    }

    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f17533c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) ti0.f16763j.f16769f.a(t.F1));
        bundle.putInt("target_api", this.f17535e);
        bundle.putInt("dv", this.f17536f);
        bundle.putInt("lv", this.f17537g);
        Bundle bundle2 = bundle.getBundle("sdk_env");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("mf", ((Boolean) w0.f17185a.b()).booleanValue());
        bundle2.putBoolean("instant_app", this.f17531a);
        bundle2.putBoolean("lite", this.f17532b);
        bundle2.putBoolean("is_privileged_process", this.f17534d);
        bundle.putBundle("sdk_env", bundle2);
        Bundle bundle3 = bundle2.getBundle("build_meta");
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        bundle3.putString("cl", "341976203");
        bundle3.putString("rapid_rc", "dev");
        bundle3.putString("rapid_rollup", "HEAD");
        bundle2.putBundle("build_meta", bundle3);
    }
}
