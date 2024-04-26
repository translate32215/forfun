package u7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class t extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f26131a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f26132b;

    public t(d0 d0Var) {
        this.f26132b = d0Var;
    }

    public final synchronized void a() {
        Context context = this.f26131a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f26131a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            d0 d0Var = this.f26132b;
            d0Var.f26097b.f26099b.i();
            if (d0Var.f26096a.isShowing()) {
                d0Var.f26096a.dismiss();
            }
            a();
        }
    }
}
