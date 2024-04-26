package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import g2.e;
import r2.a;

/* compiled from: BatteryNotLowTracker */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f21830i = e.e("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    public Object a() {
        Intent registerReceiver = this.f21836b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            e.c().b(f21830i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra != 0 || intExtra2 == 1 || intExtra3 > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void g(Context context, Intent intent) {
        if (intent.getAction() != null) {
            e.c().a(f21830i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                c(Boolean.FALSE);
            }
        }
    }
}
