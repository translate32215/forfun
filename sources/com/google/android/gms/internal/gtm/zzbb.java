package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n7.q;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbb extends q {
    public final Map zza = new HashMap();

    public final String toString() {
        return q.zza(this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzc(q qVar) {
        zzbb zzbb = (zzbb) qVar;
        i.h(zzbb);
        zzbb.zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        i.e(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        i.f(str, "Name can not be empty or \"&\"");
        this.zza.put(str, str2);
    }
}
