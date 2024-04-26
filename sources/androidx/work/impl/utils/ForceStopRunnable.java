package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import g2.e;
import h2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k2.b;
import o2.j;
import o2.k;
import o2.l;

public class ForceStopRunnable implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public static final String f3323c = e.e("ForceStopRunnable");

    /* renamed from: d  reason: collision with root package name */
    public static final long f3324d = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    public final Context f3325a;

    /* renamed from: b  reason: collision with root package name */
    public final h f3326b;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public static final String f3327a = e.e("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                e c10 = e.c();
                String str = f3327a;
                if (((e.a) c10).f18409b <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.b(context);
            }
        }
    }

    public ForceStopRunnable(Context context, h hVar) {
        this.f3325a = context.getApplicationContext();
        this.f3326b = hVar;
    }

    public static PendingIntent a(Context context, int i10) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i10);
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a10 = a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f3324d;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, a10);
        } else {
            alarmManager.set(0, currentTimeMillis, a10);
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        boolean z10;
        List<JobInfo> e10;
        e.c().a(f3323c, "Performing cleanup operations.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f3325a;
            String str = b.f19881f;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (!(jobScheduler == null || (e10 = b.e(context, jobScheduler)) == null || e10.isEmpty())) {
                for (JobInfo next : e10) {
                    PersistableBundle extras = next.getExtras();
                    if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        b.a(jobScheduler, next.getId());
                    }
                }
            }
        }
        WorkDatabase workDatabase = this.f3326b.f18830c;
        k n10 = workDatabase.n();
        workDatabase.c();
        try {
            l lVar = (l) n10;
            List<j> c10 = lVar.c();
            boolean z11 = !((ArrayList) c10).isEmpty();
            if (z11) {
                Iterator it = ((ArrayList) c10).iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    lVar.n(d.ENQUEUED, jVar.f22864a);
                    lVar.j(jVar.f22864a, -1);
                }
            }
            workDatabase.j();
            workDatabase.g();
            if (this.f3326b.f18834g.a().getBoolean("reschedule_needed", false)) {
                e.c().a(f3323c, "Rescheduling Workers.", new Throwable[0]);
                this.f3326b.e();
                this.f3326b.f18834g.a().edit().putBoolean("reschedule_needed", false).apply();
            } else {
                if (a(this.f3325a, 536870912) == null) {
                    b(this.f3325a);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    e.c().a(f3323c, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    this.f3326b.e();
                } else if (z11) {
                    e.c().a(f3323c, "Found unfinished work, scheduling it.", new Throwable[0]);
                    h hVar = this.f3326b;
                    h2.e.a(hVar.f18829b, hVar.f18830c, hVar.f18832e);
                }
            }
            h hVar2 = this.f3326b;
            hVar2.getClass();
            synchronized (h.f18827l) {
                hVar2.f18835h = true;
                BroadcastReceiver.PendingResult pendingResult = hVar2.f18836i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    hVar2.f18836i = null;
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
