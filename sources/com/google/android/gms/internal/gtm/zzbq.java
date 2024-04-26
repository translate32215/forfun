package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbq implements Runnable {
    public final /* synthetic */ zzdb zza;
    public final /* synthetic */ zzbs zzb;

    public zzbq(zzbs zzbs, zzdb zzdb) {
        this.zzb = zzbs;
        this.zza = zzdb;
    }

    public final void run() {
        this.zzb.zza.zzf(this.zza);
    }
}
