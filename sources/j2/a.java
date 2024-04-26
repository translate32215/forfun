package j2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import g2.e;
import h2.h;
import o2.d;
import o2.f;

/* compiled from: Alarms */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19482a = e.e("Alarms");

    public static void a(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.c(context, str), 536870912);
        if (service != null && alarmManager != null) {
            e.c().a(f19482a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i10)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, h hVar, String str, long j10) {
        int i10;
        f fVar = (f) hVar.f18830c.l();
        d a10 = fVar.a(str);
        if (a10 != null) {
            a(context, str, a10.f22856b);
            c(context, str, a10.f22856b, j10);
            return;
        }
        synchronized (p2.e.class) {
            int i11 = 0;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
            i10 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            if (i10 != Integer.MAX_VALUE) {
                i11 = i10 + 1;
            }
            sharedPreferences.edit().putInt("next_alarm_manager_id", i11).apply();
        }
        fVar.b(new d(str, i10));
        c(context, str, i10, j10);
    }

    public static void c(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.c(context, str), 1073741824);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j10, service);
        } else {
            alarmManager.set(0, j10, service);
        }
    }
}
