package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import g2.e;
import h2.h;
import p2.f;
import r2.b;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3269a = e.e("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f3270a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f3271b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f3272c;

        public a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3270a = intent;
            this.f3271b = context;
            this.f3272c = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f3270a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3270a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3270a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3270a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                e.c().a(ConstraintProxyUpdateReceiver.f3269a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                f.a(this.f3271b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                f.a(this.f3271b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                f.a(this.f3271b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                f.a(this.f3271b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3272c.finish();
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            e.c().a(f3269a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ((b) h.c(context).f18831d).f24500a.execute(new a(this, intent, context, goAsync));
    }
}
