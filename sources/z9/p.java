package z9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f28773a = Uri.parse("http://play.google.com/store/apps/details");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f28774b = {"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms", null};

    public static String a(Context context) {
        ServiceInfo serviceInfo;
        String str;
        PackageManager packageManager = context.getPackageManager();
        for (String str2 : f28774b) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(str2), 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null && (str = serviceInfo.packageName) != null) {
                return str;
            }
        }
        return packageManager.hasSystemFeature("android.software.leanback") ? "com.google.android.youtube.tv" : packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
    }
}
