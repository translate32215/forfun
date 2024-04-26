package j2;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import g2.e;
import h2.d;
import o2.j;

/* compiled from: SystemAlarmScheduler */
public class b implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final String f19483b = e.e("SystemAlarmScheduler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f19484a;

    public b(Context context) {
        this.f19484a = context.getApplicationContext();
    }

    public void b(String str) {
        Context context = this.f19484a;
        String str2 = a.f3277d;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.f19484a.startService(intent);
    }

    public void d(j... jVarArr) {
        for (j jVar : jVarArr) {
            e.c().a(f19483b, String.format("Scheduling work with workSpecId %s", new Object[]{jVar.f22864a}), new Throwable[0]);
            this.f19484a.startService(a.d(this.f19484a, jVar.f22864a));
        }
    }
}
