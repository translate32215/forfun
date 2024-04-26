package k8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class o4 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile z4<Boolean> f20390a = y4.f20558a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f20391b = new Object();

    public static boolean a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(authority).length() + 91);
            sb2.append(authority);
            sb2.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb2.toString());
            return false;
        } else if (f20390a.b()) {
            return f20390a.a().booleanValue();
        } else {
            synchronized (f20391b) {
                if (f20390a.b()) {
                    boolean booleanValue = f20390a.a().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f20390a = new a5(Boolean.valueOf(z10));
                    return f20390a.a().booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z10 = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                f20390a = new a5(Boolean.valueOf(z10));
                return f20390a.a().booleanValue();
            }
        }
    }
}
