package g1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import androidx.leanback.widget.d1;

/* compiled from: Settings */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f18382c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18383a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18384b;

    /* renamed from: g1.a$a  reason: collision with other inner class name */
    /* compiled from: Settings */
    public static class C0141a {

        /* renamed from: a  reason: collision with root package name */
        public Resources f18385a;

        /* renamed from: b  reason: collision with root package name */
        public String f18386b;

        public C0141a(Resources resources, String str) {
            this.f18385a = resources;
            this.f18386b = str;
        }
    }

    public a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        boolean z10 = false;
        C0141a aVar = null;
        Resources resources = null;
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("android.support.v17.leanback.action.PARTNER_CUSTOMIZATION"), 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            String str2 = activityInfo.packageName;
            if (str2 != null) {
                if ((activityInfo.applicationInfo.flags & 1) != 0) {
                    try {
                        resources = packageManager.getResourcesForApplication(str2);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
            str = str2;
            if (resources != null) {
                break;
            }
        }
        aVar = resources != null ? new C0141a(resources, str) : aVar;
        Rect rect = d1.f2338r;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            this.f18383a = false;
            if (aVar != null) {
                int identifier = aVar.f18385a.getIdentifier("leanback_prefer_static_shadows", "bool", aVar.f18386b);
                this.f18383a = identifier > 0 ? aVar.f18385a.getBoolean(identifier) : false;
            }
        } else {
            this.f18383a = true;
        }
        if (i10 >= 21) {
            this.f18384b = false;
            if (aVar != null) {
                int identifier2 = aVar.f18385a.getIdentifier("leanback_outline_clipping_disabled", "bool", aVar.f18386b);
                this.f18384b = identifier2 > 0 ? aVar.f18385a.getBoolean(identifier2) : z10;
                return;
            }
            return;
        }
        this.f18384b = true;
    }

    public static a a(Context context) {
        if (f18382c == null) {
            f18382c = new a(context);
        }
        return f18382c;
    }
}
