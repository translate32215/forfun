package e8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.gms.internal.ads.td;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gy implements dy<td> {

    /* renamed from: a  reason: collision with root package name */
    public final o50 f14832a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f14833b;

    public gy(o50 o50, Context context) {
        this.f14832a = o50;
        this.f14833b = context;
    }

    public static ResolveInfo a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    public final p50<td> b() {
        return this.f14832a.i(new wy(this));
    }
}
