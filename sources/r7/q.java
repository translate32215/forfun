package r7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import b8.c;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import z7.h;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24728a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public int f24729b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public int f24730c = 0;

    public q(Context context) {
        this.f24728a = context;
    }

    public final synchronized int a() {
        int i10 = this.f24730c;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f24728a.getPackageManager();
        if (c.a(this.f24728a).f3657a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!h.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f24730c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (h.d()) {
                this.f24730c = 2;
            } else {
                this.f24730c = 1;
            }
            return this.f24730c;
        }
        this.f24730c = 2;
        return 2;
    }

    public final PackageInfo b(String str) {
        try {
            return c.a(this.f24728a).f3657a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("Metadata", sb2.toString());
            return null;
        }
    }
}
