package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import n7.v;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfj extends zzbu {
    public SharedPreferences zza;
    public long zzb;
    public long zzc = -1;
    public final zzfi zzd;

    public zzfj(zzbx zzbx) {
        super(zzbx);
        zzw();
        this.zzd = new zzfi(this, "monitoring", ((Long) zzew.zzP.zzb()).longValue(), (zzfh) null);
    }

    public final long zza() {
        v.b();
        zzV();
        long j10 = this.zzb;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.zza.getLong("first_run", 0);
        if (j11 != 0) {
            this.zzb = j11;
            return j11;
        }
        long b10 = zzC().b();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("first_run", b10);
        if (!edit.commit()) {
            zzQ("Failed to commit first run time");
        }
        this.zzb = b10;
        return b10;
    }

    public final long zzb() {
        v.b();
        zzV();
        long j10 = this.zzc;
        if (j10 != -1) {
            return j10;
        }
        long j11 = this.zza.getLong("last_dispatch", 0);
        this.zzc = j11;
        return j11;
    }

    public final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfi zze() {
        return this.zzd;
    }

    public final zzfq zzf() {
        return new zzfq(zzC(), zza());
    }

    public final String zzg() {
        v.b();
        zzV();
        String string = this.zza.getString("installation_campaign", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void zzi() {
        v.b();
        zzV();
        long b10 = zzC().b();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("last_dispatch", b10);
        edit.apply();
        this.zzc = b10;
    }
}
