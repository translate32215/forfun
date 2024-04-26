package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.ma;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class rf implements uf {

    /* renamed from: a  reason: collision with root package name */
    public static final ma f8037a;

    static {
        ma.a V = ma.V();
        if (V.f5971c) {
            V.n();
            V.f5971c = false;
        }
        ma.e0((ma) V.f5970b, "E");
        f8037a = (ma) ((aq) V.j());
    }

    public final ma a() {
        return f8037a;
    }

    public final ma b(Context context) throws PackageManager.NameNotFoundException {
        return ji.c(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }
}
