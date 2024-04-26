package e8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fb0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14554a = true;

    public fb0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f14554a = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f14554a = false;
        }
    }
}
