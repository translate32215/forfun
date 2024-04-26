package e8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q7 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public Context f16097a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Activity> f16098b = new WeakReference<>((Object) null);

    public q7(Context context) {
        super(context);
    }

    public static Context c(Context context) {
        if (context instanceof q7) {
            return ((q7) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Intent a(android.content.Intent r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f16097a     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.content.ComponentName r0 = r3.getComponent()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.content.ComponentName r0 = r3.getComponent()     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r2.f16097a     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0020
            goto L_0x0037
        L_0x0020:
            java.lang.Object r0 = r3.clone()     // Catch:{ all -> 0x0039 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = super.getPackageName()     // Catch:{ all -> 0x0039 }
            android.content.ComponentName r3 = r3.getComponent()     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = r3.getClassName()     // Catch:{ all -> 0x0039 }
            r0.setClassName(r1, r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return r0
        L_0x0037:
            monitor-exit(r2)
            return r3
        L_0x0039:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.q7.a(android.content.Intent):android.content.Intent");
    }

    public final synchronized void b(Intent intent) {
        Activity activity = (Activity) this.f16098b.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = (Intent) intent.clone();
            intent2.setFlags(intent.getFlags() & -268435457);
            activity.startActivity(intent2);
        } catch (Throwable th) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "");
            intent.addFlags(268435456);
            super.startActivity(intent);
        }
    }

    public final Context getApplicationContext() {
        return this;
    }

    public final synchronized ApplicationInfo getApplicationInfo() {
        Context context = this.f16097a;
        if (context != null) {
            return context.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    public final synchronized String getPackageName() {
        Context context = this.f16097a;
        if (context != null) {
            return context.getPackageName();
        }
        return super.getPackageName();
    }

    public final synchronized String getPackageResourcePath() {
        Context context = this.f16097a;
        if (context != null) {
            return context.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    public final synchronized void startActivity(Intent intent) {
        b(a(intent));
    }
}
