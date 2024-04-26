package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.util.HashMap;
import n7.q;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbc extends q {
    public int zza;
    public int zzb;
    public String zzc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzc);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.zza));
        hashMap.put("screenHeight", Integer.valueOf(this.zzb));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return q.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(q qVar) {
        zzbc zzbc = (zzbc) qVar;
        int i10 = this.zza;
        if (i10 != 0) {
            zzbc.zza = i10;
        }
        int i11 = this.zzb;
        if (i11 != 0) {
            zzbc.zzb = i11;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbc.zzc = this.zzc;
        }
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
