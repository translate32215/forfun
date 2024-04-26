package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.Collections;
import n7.v;
import y7.a;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzce extends zzbu {
    public final zzcd zza = new zzcd(this);
    public final zzcy zzb;
    public final zzfq zzc;
    public zzfa zzd;

    public zzce(zzbx zzbx) {
        super(zzbx);
        this.zzc = new zzfq(zzbx.zzr());
        this.zzb = new zzca(this, zzbx);
    }

    public static /* synthetic */ void zzb(zzce zzce, ComponentName componentName) {
        v.b();
        if (zzce.zzd != null) {
            zzce.zzd = null;
            zzce.zzO("Disconnected from device AnalyticsService", componentName);
            zzce.zzs().zzk();
        }
    }

    public static /* synthetic */ void zzi(zzce zzce, zzfa zzfa) {
        v.b();
        zzce.zzd = zzfa;
        zzce.zzj();
        zzce.zzs().zzj();
    }

    public final void zzc() {
        v.b();
        zzV();
        try {
            a.b().c(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    public final void zzd() {
    }

    public final boolean zzf() {
        v.b();
        zzV();
        if (this.zzd != null) {
            return true;
        }
        zzfa zza2 = this.zza.zza();
        if (zza2 == null) {
            return false;
        }
        this.zzd = zza2;
        zzj();
        return true;
    }

    public final boolean zzg() {
        v.b();
        zzV();
        return this.zzd != null;
    }

    public final boolean zzh(zzez zzez) {
        String str;
        if (zzez != null) {
            v.b();
            zzV();
            zzfa zzfa = this.zzd;
            if (zzfa == null) {
                return false;
            }
            if (zzez.zzh()) {
                zzw();
                str = zzcv.zzi();
            } else {
                zzw();
                str = zzcv.zzk();
            }
            try {
                zzfa.zzf(zzez.zzg(), zzez.zzd(), str, Collections.emptyList());
                zzj();
                return true;
            } catch (RemoteException unused) {
                zzN("Failed to send hits to AnalyticsService");
                return false;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void zzj() {
        this.zzc.zzb();
        zzcy zzcy = this.zzb;
        zzw();
        zzcy.zzg(((Long) zzew.zzK.zzb()).longValue());
    }
}
