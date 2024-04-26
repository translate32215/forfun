package p;

import a.a;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import c0.g;
import c0.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CustomTabsIntent */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f23737a;

    /* compiled from: CustomTabsIntent */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f23738a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f23739b = true;

        public a(g gVar) {
            a.C0000a aVar;
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f23738a = intent;
            if (gVar != null) {
                intent.setPackage(((ComponentName) gVar.f23743d).getPackageName());
            }
            Bundle bundle = new Bundle();
            if (gVar == null) {
                aVar = null;
            } else {
                aVar = (a.C0000a) ((a.a) gVar.f23742c);
                aVar.getClass();
            }
            if (Build.VERSION.SDK_INT >= 18) {
                g.b(bundle, "android.support.customtabs.extra.SESSION", aVar);
            } else {
                if (!h.f3950b) {
                    try {
                        Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                        h.f3949a = method;
                        method.setAccessible(true);
                    } catch (NoSuchMethodException e10) {
                        Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e10);
                    }
                    h.f3950b = true;
                }
                Method method2 = h.f3949a;
                if (method2 != null) {
                    try {
                        method2.invoke(bundle, new Object[]{"android.support.customtabs.extra.SESSION", aVar});
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                        Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e11);
                        h.f3949a = null;
                    }
                }
            }
            this.f23738a.putExtras(bundle);
        }

        public d a() {
            this.f23738a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f23739b);
            return new d(this.f23738a, (Bundle) null);
        }
    }

    public d(Intent intent, Bundle bundle) {
        this.f23737a = intent;
    }
}
