package com.google.android.gms.internal.gtm;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public abstract class zzcy {
    public static volatile Handler zza;
    public final zzbx zzb;
    public final Runnable zzc;
    public volatile long zzd;

    public zzcy(zzbx zzbx) {
        if (zzbx != null) {
            this.zzb = zzbx;
            this.zzc = new zzcx(this);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0;
        }
        return Math.abs(this.zzb.zzr().b() - this.zzd);
    }

    public final void zze(long j10) {
        if (zzh()) {
            long j11 = 0;
            if (j10 < 0) {
                zzf();
                return;
            }
            long abs = j10 - Math.abs(this.zzb.zzr().b() - this.zzd);
            if (abs >= 0) {
                j11 = abs;
            }
            zzi().removeCallbacks(this.zzc);
            if (!zzi().postDelayed(this.zzc, j11)) {
                this.zzb.zzm().zzJ("Failed to adjust delayed post. time", Long.valueOf(j11));
            }
        }
    }

    public final void zzf() {
        this.zzd = 0;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j10) {
        zzf();
        if (j10 >= 0) {
            this.zzd = this.zzb.zzr().b();
            if (!zzi().postDelayed(this.zzc, j10)) {
                this.zzb.zzm().zzJ("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }

    public final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcy.class) {
            if (zza == null) {
                zza = new zzgc(this.zzb.zza().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }
}
