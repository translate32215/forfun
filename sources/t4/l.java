package t4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import cb.g;
import f6.i;
import l4.b;
import t4.s;
import u4.a;

public final /* synthetic */ class l implements s.b, i.a, g.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ l f25709a = new l(1);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ l f25710b = new l(2);

    public /* synthetic */ l(int i10) {
    }

    public String a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public Object apply(Object obj) {
        b bVar = s.f25725e;
        throw new a("Timed out while trying to acquire the lock.", (Throwable) obj);
    }
}
