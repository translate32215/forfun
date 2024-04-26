package e8;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.yh;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qx implements by<Bundle>, dy<by<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    public final ApplicationInfo f16211a;

    /* renamed from: b  reason: collision with root package name */
    public final PackageInfo f16212b;

    public qx(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f16211a = applicationInfo;
        this.f16212b = packageInfo;
    }

    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f16211a.packageName;
        PackageInfo packageInfo = this.f16212b;
        String str2 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16600j3)).booleanValue()) {
            PackageInfo packageInfo2 = this.f16212b;
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionName;
            }
            if (str2 != null) {
                bundle.putString("vnm", str2);
            }
        }
    }

    public final p50<by<Bundle>> b() {
        return yh.h(this);
    }
}
