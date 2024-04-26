package com.google.android.gms.internal.gtm;

import z7.b;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfb {
    public double zza = 60.0d;
    public long zzb;
    public final Object zzc = new Object();
    public final String zzd = "tracking";
    public final b zze;

    public zzfb(int i10, long j10, String str, b bVar) {
        this.zze = bVar;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long b10 = this.zze.b();
            double d10 = this.zza;
            if (d10 < 60.0d) {
                double d11 = (double) (b10 - this.zzb);
                Double.isNaN(d11);
                double d12 = d11 / 2000.0d;
                if (d12 > 0.0d) {
                    d10 = Math.min(60.0d, d10 + d12);
                    this.zza = d10;
                }
            }
            this.zzb = b10;
            if (d10 >= 1.0d) {
                this.zza = d10 - 4.0d;
                return true;
            }
            String str = this.zzd;
            zzfc.zze("Excessive " + str + " detected; call ignored.");
            return false;
        }
    }
}
