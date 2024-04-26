package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import g2.e;
import h2.h;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3273a = e.e("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        e.c().a(f3273a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                h c10 = h.c(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                c10.getClass();
                synchronized (h.f18827l) {
                    c10.f18836i = goAsync;
                    if (c10.f18835h) {
                        goAsync.finish();
                        c10.f18836i = null;
                    }
                }
            } catch (IllegalStateException unused) {
                e.c().b(f3273a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            }
        } else {
            String str = a.f3277d;
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
        }
    }
}
