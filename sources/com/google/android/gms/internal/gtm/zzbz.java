package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbz {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public long zzd;
    public final Map zze;

    public zzbz(long j10, String str, String str2, boolean z10, long j11, Map map) {
        i.e(str);
        i.e(str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = j11;
        if (map != null) {
            this.zze = new HashMap(map);
        } else {
            this.zze = Collections.emptyMap();
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final Map zzd() {
        return this.zze;
    }

    public final void zze(long j10) {
        this.zzd = j10;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
