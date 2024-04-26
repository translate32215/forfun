package b8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import z7.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3657a;

    public b(Context context) {
        this.f3657a = context;
    }

    public ApplicationInfo a(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f3657a.getPackageManager().getApplicationInfo(str, i10);
    }

    public PackageInfo b(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f3657a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean c() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.e(this.f3657a);
        }
        if (!h.d() || (nameForUid = this.f3657a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f3657a.getPackageManager().isInstantApp(nameForUid);
    }
}
