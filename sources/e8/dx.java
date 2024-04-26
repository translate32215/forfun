package e8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dx implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f14340a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14341b;

    public dx(String str, boolean z10) {
        this.f14340a = str;
        this.f14341b = z10;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f14340a);
        if (this.f14341b) {
            bundle.putString("de", "1");
        }
    }
}
