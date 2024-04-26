package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n7.v;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbs extends zzbu {
    public final zzcm zza;

    public zzbs(zzbx zzbx, zzby zzby) {
        super(zzbx);
        if (zzby != null) {
            this.zza = new zzcm(zzbx, zzby);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final long zza(zzbz zzbz) {
        zzV();
        if (zzbz != null) {
            v.b();
            long zzb = this.zza.zzb(zzbz, true);
            if (zzb != 0) {
                return zzb;
            }
            this.zza.zzk(zzbz);
            return 0;
        }
        throw new NullPointerException("null reference");
    }

    public final void zzc() {
        zzV();
        Context zzo = zzo();
        if (!zzfk.zza(zzo) || !zzfp.zzh(zzo)) {
            zze((zzdb) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
        zzo.startService(intent);
    }

    public final void zzd() {
        this.zza.zzW();
    }

    public final void zze(zzdb zzdb) {
        zzV();
        zzq().c(new zzbq(this, zzdb));
    }

    public final void zzh(zzez zzez) {
        if (zzez != null) {
            zzV();
            zzF("Hit delivery requested", zzez);
            zzq().c(new zzbo(this, zzez));
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void zzi() {
        v.b();
        this.zza.zzl();
    }

    public final void zzj() {
        v.b();
        this.zza.zzm();
    }

    public final void zzk() {
        zzV();
        v.b();
        zzcm zzcm = this.zza;
        v.b();
        zzcm.zzV();
        zzcm.zzN("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzZ();
    }

    public final boolean zzn() {
        zzV();
        try {
            zzq().a(new zzbr(this)).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e10) {
            zzR("syncDispatchLocalHits interrupted", e10);
            return false;
        } catch (ExecutionException e11) {
            zzJ("syncDispatchLocalHits failed", e11);
            return false;
        } catch (TimeoutException e12) {
            zzR("syncDispatchLocalHits timed out", e12);
            return false;
        }
    }
}
