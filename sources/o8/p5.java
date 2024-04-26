package o8;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import k8.l0;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class p5 extends r5 {

    /* renamed from: d  reason: collision with root package name */
    public final AlarmManager f23393d = ((AlarmManager) this.f8864a.f8837a.getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    public k f23394e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f23395f;

    public p5(u5 u5Var) {
        super(u5Var);
    }

    public final boolean k() {
        AlarmManager alarmManager = this.f23393d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        p();
        return false;
    }

    public final void l() {
        i();
        this.f8864a.d().f8805n.a("Unscheduling upload");
        AlarmManager alarmManager = this.f23393d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        o().a();
        if (Build.VERSION.SDK_INT >= 24) {
            p();
        }
    }

    public final int m() {
        String str;
        if (this.f23395f == null) {
            String valueOf = String.valueOf(this.f8864a.f8837a.getPackageName());
            if (valueOf.length() != 0) {
                str = "measurement".concat(valueOf);
            } else {
                str = new String("measurement");
            }
            this.f23395f = Integer.valueOf(str.hashCode());
        }
        return this.f23395f.intValue();
    }

    public final PendingIntent n() {
        Context context = this.f8864a.f8837a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), l0.f20300a);
    }

    public final k o() {
        if (this.f23394e == null) {
            this.f23394e = new e5(this, (d4) this.f23413b.f23481l);
        }
        return this.f23394e;
    }

    @TargetApi(24)
    public final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f8864a.f8837a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m());
        }
    }
}
