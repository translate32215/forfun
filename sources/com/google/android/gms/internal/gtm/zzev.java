package com.google.android.gms.internal.gtm;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzev {
    public final zzeu zza;
    public final Object zzb;
    public final Object zzc;
    public final Object zzd = new Object();

    public zzev(Object obj, Object obj2, zzeu zzeu) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zza = zzeu;
    }

    public static zzev zza(Object obj, Object obj2, zzeu zzeu) {
        return new zzev(obj, obj2, zzeu);
    }

    public final Object zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
