package com.google.android.gms.internal.gtm;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final /* synthetic */ class zzfl implements Runnable {
    public final /* synthetic */ zzfp zza;
    public final /* synthetic */ zzfd zzb;
    public final /* synthetic */ JobParameters zzc;

    public /* synthetic */ zzfl(zzfp zzfp, zzfd zzfd, JobParameters jobParameters) {
        this.zza = zzfp;
        this.zzb = zzfd;
        this.zzc = jobParameters;
    }

    public final void run() {
        this.zza.zzd(this.zzb, this.zzc);
    }
}
