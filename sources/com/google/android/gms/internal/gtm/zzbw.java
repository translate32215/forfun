package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbw implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzbx zza;

    public zzbw(zzbx zzbx) {
        this.zza = zzbx;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        zzfd zzn = this.zza.zzn();
        if (zzn != null) {
            zzn.zzJ("Job execution failed", th);
        }
    }
}
