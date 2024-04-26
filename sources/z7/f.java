package z7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f28727a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f28728b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f28729c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f28730d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f28731e;

    public static boolean a(Context context) {
        if (f28729c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z10 = true;
            }
            f28729c = Boolean.valueOf(z10);
        }
        return f28729c.booleanValue();
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f28727a == null) {
            boolean z10 = false;
            if ((Build.VERSION.SDK_INT >= 20) && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f28727a = Boolean.valueOf(z10);
        }
        return f28727a.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 24) != false) goto L_0x0013;
     */
    @android.annotation.TargetApi(26)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(android.content.Context r4) {
        /*
            boolean r0 = b(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0025
        L_0x0013:
            boolean r4 = d(r4)
            if (r4 == 0) goto L_0x0026
            boolean r4 = z7.h.d()
            if (r4 == 0) goto L_0x0025
            boolean r4 = z7.h.f()
            if (r4 == 0) goto L_0x0026
        L_0x0025:
            return r2
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.c(android.content.Context):boolean");
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        if (f28728b == null) {
            boolean z10 = false;
            if (h.c() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f28728b = Boolean.valueOf(z10);
        }
        return f28728b.booleanValue();
    }
}
