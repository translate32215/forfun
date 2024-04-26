package o8;

import b8.b;
import b8.c;
import com.google.android.gms.measurement.internal.l;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class m3 {

    /* renamed from: a  reason: collision with root package name */
    public final l f23338a;

    public m3(u5 u5Var) {
        this.f23338a = u5Var.f23481l;
    }

    public final boolean a() {
        try {
            b a10 = c.a(this.f23338a.f8837a);
            if (a10 == null) {
                this.f23338a.d().f8805n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a10.f3657a.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e10) {
            this.f23338a.d().f8805n.b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
