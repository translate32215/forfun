package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.UUID;
import n7.q;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbh extends q {
    public int zza;

    public zzbh() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        if (leastSignificantBits != 0) {
            this.zza = leastSignificantBits;
            return;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", (Object) null);
        Boolean bool = Boolean.FALSE;
        hashMap.put("interstitial", bool);
        hashMap.put("automatic", bool);
        hashMap.put("screenId", Integer.valueOf(this.zza));
        hashMap.put("referrerScreenId", 0);
        hashMap.put("referrerScreenName", (Object) null);
        hashMap.put("referrerUri", (Object) null);
        return q.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(q qVar) {
        zzbh zzbh = (zzbh) qVar;
        TextUtils.isEmpty((CharSequence) null);
        int i10 = this.zza;
        if (i10 != 0) {
            zzbh.zza = i10;
        }
        TextUtils.isEmpty((CharSequence) null);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            TextUtils.isEmpty((CharSequence) null);
        }
    }

    public final int zzd() {
        return this.zza;
    }
}
