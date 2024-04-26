package com.google.android.gms.internal.gtm;

import android.support.v4.media.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfd extends zzbu {
    public static zzfd zza;

    public zzfd(zzbx zzbx) {
        super(zzbx);
    }

    public static zzfd zza() {
        return zza;
    }

    public static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            StringBuilder a10 = a.a(str);
            a10.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            a10.append("...");
            a10.append(str);
            a10.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d));
            return a10.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
    }

    public final void zzb(zzez zzez, String str) {
        zzR("Discarding hit. ".concat(str), zzez != null ? zzez.toString() : "no hit data");
    }

    public final void zzc(Map map, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append((String) entry.getKey());
            sb2.append('=');
            sb2.append((String) entry.getValue());
        }
        zzR("Discarding hit. ".concat(str), sb2.toString());
    }

    public final void zzd() {
        synchronized (zzfd.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i10, String str, Object obj, Object obj2, Object obj3) {
        char c10;
        if (str != null) {
            if (zzw().zzb()) {
                zzw();
                c10 = 'C';
            } else {
                zzw();
                c10 = 'c';
            }
            String str2 = "3" + "01VDIWEA?".charAt(i10) + c10 + zzbv.zza + ":" + zzbt.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            if (str2.length() > 1024) {
                str2 = str2.substring(0, 1024);
            }
            zzfj zzp = zzt().zzp();
            if (zzp != null) {
                zzp.zze().zzc(str2);
                return;
            }
            return;
        }
        throw new NullPointerException("null reference");
    }
}
