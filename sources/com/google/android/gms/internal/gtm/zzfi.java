package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.i;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfi {
    public final /* synthetic */ zzfj zza;
    public final String zzb;
    public final long zzc;

    public /* synthetic */ zzfi(zzfj zzfj, String str, long j10, zzfh zzfh) {
        this.zza = zzfj;
        i.e("monitoring");
        i.a(j10 > 0);
        this.zzb = "monitoring";
        this.zzc = j10;
    }

    public final Pair zza() {
        long j10;
        long zzd = zzd();
        if (zzd == 0) {
            j10 = 0;
        } else {
            j10 = Math.abs(zzd - this.zza.zzC().b());
        }
        long j11 = this.zzc;
        if (j10 < j11) {
            return null;
        }
        if (j10 > j11 + j11) {
            zzg();
            return null;
        }
        String string = this.zza.zza.getString(zzb(), (String) null);
        long j12 = this.zza.zza.getLong(zze(), 0);
        zzg();
        if (string == null || j12 <= 0) {
            return null;
        }
        return new Pair(string, Long.valueOf(j12));
    }

    public final String zzb() {
        return this.zzb.concat(":value");
    }

    public final void zzc(String str) {
        if (zzd() == 0) {
            zzg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j10 = this.zza.zza.getLong(zze(), 0);
            if (j10 <= 0) {
                SharedPreferences.Editor edit = this.zza.zza.edit();
                edit.putString(zzb(), str);
                edit.putLong(zze(), 1);
                edit.apply();
                return;
            }
            long j11 = j10 + 1;
            SharedPreferences.Editor edit2 = this.zza.zza.edit();
            if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j11) {
                edit2.putString(zzb(), str);
            }
            edit2.putLong(zze(), j11);
            edit2.apply();
        }
    }

    public final long zzd() {
        return this.zza.zza.getLong(zzf(), 0);
    }

    public final String zze() {
        return this.zzb.concat(":count");
    }

    public final String zzf() {
        return this.zzb.concat(":start");
    }

    public final void zzg() {
        long b10 = this.zza.zzC().b();
        SharedPreferences.Editor edit = this.zza.zza.edit();
        edit.remove(zze());
        edit.remove(zzb());
        edit.putLong(zzf(), b10);
        edit.commit();
    }
}
