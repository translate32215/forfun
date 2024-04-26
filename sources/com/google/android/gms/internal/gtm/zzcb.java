package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzcb implements Runnable {
    public final /* synthetic */ zzcd zza;
    public final /* synthetic */ zzfa zzb;

    public zzcb(zzcd zzcd, zzfa zzfa, byte[] bArr) {
        this.zza = zzcd;
        this.zzb = zzfa;
    }

    public final void run() {
        if (!this.zza.zza.zzg()) {
            this.zza.zza.zzE("Connected to service after a timeout");
            zzce.zzi(this.zza.zza, this.zzb);
        }
    }
}
