package p2;

import android.content.ComponentName;
import android.content.Context;
import g2.e;

/* compiled from: PackageManagerHelper */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23788a = e.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            e c10 = e.c();
            String str3 = f23788a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z10) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c10.a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            e c11 = e.c();
            String str4 = f23788a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z10) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c11.a(str4, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
