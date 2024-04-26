package com.google.android.gms.internal.gtm;

import z7.b;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfq {
    public final b zza;
    public long zzb;

    public zzfq(b bVar) {
        if (bVar != null) {
            this.zza = bVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void zza() {
        this.zzb = 0;
    }

    public final void zzb() {
        this.zzb = this.zza.a();
    }

    public final boolean zzc(long j10) {
        return this.zzb == 0 || this.zza.a() - this.zzb > j10;
    }

    public zzfq(b bVar, long j10) {
        if (bVar != null) {
            this.zza = bVar;
            this.zzb = j10;
            return;
        }
        throw new NullPointerException("null reference");
    }
}
