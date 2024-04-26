package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n7.q;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzba extends q {
    public final Map zza = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            hashMap.put("metric".concat(String.valueOf(entry.getKey())), entry.getValue());
        }
        return q.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(q qVar) {
        ((zzba) qVar).zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }
}
