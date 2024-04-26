package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfn implements zzdb {
    public final /* synthetic */ Runnable zza;
    public final /* synthetic */ zzfp zzb;

    public zzfn(zzfp zzfp, Runnable runnable) {
        this.zzb = zzfp;
        this.zza = runnable;
    }

    public final void zza(Throwable th) {
        this.zzb.zzb.post(this.zza);
    }
}
