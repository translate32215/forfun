package com.google.android.gms.internal.gtm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzda extends zzbu {
    public boolean zza;
    public boolean zzb;
    public final AlarmManager zzc = ((AlarmManager) zzo().getSystemService("alarm"));
    public Integer zzd;

    public zzda(zzbx zzbx) {
        super(zzbx);
    }

    public final void zza() {
        this.zzb = false;
        try {
            this.zzc.cancel(zzg());
        } catch (NullPointerException unused) {
        }
        if (Build.VERSION.SDK_INT >= 24) {
            int zzf = zzf();
            zzO("Cancelling job. JobID", Integer.valueOf(zzf));
            ((JobScheduler) zzo().getSystemService("jobscheduler")).cancel(zzf);
        }
    }

    public final void zzb() {
        zzV();
        i.k(this.zza, "Receiver not registered");
        zzw();
        long zzd2 = zzcv.zzd();
        if (zzd2 > 0) {
            zza();
            long a10 = zzC().a() + zzd2;
            this.zzb = true;
            ((Boolean) zzew.zzR.zzb()).booleanValue();
            if (Build.VERSION.SDK_INT >= 24) {
                zzN("Scheduling upload with JobScheduler");
                Context zzo = zzo();
                ComponentName componentName = new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsJobService");
                int zzf = zzf();
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                JobInfo build = new JobInfo.Builder(zzf, componentName).setMinimumLatency(zzd2).setOverrideDeadline(zzd2 + zzd2).setExtras(persistableBundle).build();
                zzO("Scheduling job. JobID", Integer.valueOf(zzf));
                zzfx.zza(zzo, build, "com.google.android.gms", "DispatchAlarm");
                return;
            }
            zzN("Scheduling upload with AlarmManager");
            this.zzc.setInexactRepeating(2, a10, zzd2, zzg());
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public final void zzd() {
        try {
            zza();
            zzw();
            if (zzcv.zzd() > 0) {
                Context zzo = zzo();
                ActivityInfo receiverInfo = zzo.getPackageManager().getReceiverInfo(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    zzN("Receiver registered for local dispatch.");
                    this.zza = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    public final int zzf() {
        if (this.zzd == null) {
            this.zzd = Integer.valueOf("analytics".concat(String.valueOf(zzo().getPackageName())).hashCode());
        }
        return this.zzd.intValue();
    }

    public final PendingIntent zzg() {
        Context zzo = zzo();
        return PendingIntent.getBroadcast(zzo, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfw.zza);
    }
}
