package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzcx implements Runnable {
    public final /* synthetic */ zzcy zza;

    public zzcx(zzcy zzcy) {
        this.zza = zzcy;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zza.zzb.zzd().c(this);
            return;
        }
        boolean zzh = this.zza.zzh();
        this.zza.zzd = 0;
        if (zzh) {
            this.zza.zza();
        }
    }
}
