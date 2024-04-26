package z9;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import z9.e;
import z9.l;
import z9.o;

public final class b extends a {
    public final c a(Context context, String str, l.a aVar, l.b bVar) {
        String packageName = context.getPackageName();
        Uri uri = p.f28773a;
        try {
            return new i(context, str, packageName, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName, aVar, bVar);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e10);
        }
    }

    public final e b(Activity activity, c cVar, boolean z10) throws o.a {
        Context context;
        IBinder a10 = cVar.a();
        if (activity == null) {
            throw new NullPointerException("null reference");
        } else if (a10 != null) {
            Uri uri = p.f28773a;
            try {
                context = activity.createPackageContext(p.a(activity), 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context = null;
            }
            if (context != null) {
                try {
                    IBinder a11 = o.a(context.getClassLoader().loadClass("com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer"), new n(context), new n(activity), a10, z10);
                    int i10 = e.a.f28740a;
                    if (a11 == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = a11.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    return (queryLocalInterface == null || !(queryLocalInterface instanceof e)) ? new e.a.C0290a(a11) : (e) queryLocalInterface;
                } catch (ClassNotFoundException e10) {
                    throw new o.a("Unable to find dynamic class ".concat("com.google.android.youtube.api.jar.client.RemoteEmbeddedPlayer"), e10);
                }
            } else {
                throw new o.a("Could not create remote context");
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }
}
