package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import g2.e;

public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3268a = e.e("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    public void onReceive(Context context, Intent intent) {
        e.c().a(f3268a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(a.b(context));
    }
}
