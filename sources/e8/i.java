package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import b8.c;
import com.google.android.gms.internal.ads.d;
import f7.y;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14964a;

    public i(Context context) {
        com.google.android.gms.common.internal.i.i(context, "Context can not be null");
        this.f14964a = context;
    }

    public final boolean a(Intent intent) {
        com.google.android.gms.common.internal.i.i(intent, "Intent can not be null");
        if (!this.f14964a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return ((Boolean) y.a(this.f14964a, new d())).booleanValue() && c.a(this.f14964a).f3657a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean c() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
