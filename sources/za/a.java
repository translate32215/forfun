package za;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import d0.a;
import ra.c;

/* compiled from: DataCollectionConfigStorage */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f28775a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f28776b;

    /* renamed from: c  reason: collision with root package name */
    public final c f28777c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28778d;

    public a(Context context, String str, c cVar) {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            Object obj = d0.a.f12940a;
            context = i10 >= 24 ? a.e.a(context) : null;
        }
        this.f28775a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f28776b = sharedPreferences;
        this.f28777c = cVar;
        boolean z11 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z10 = z11;
        }
        this.f28778d = z10;
    }
}
