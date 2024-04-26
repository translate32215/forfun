package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import n7.g;
import t.f;

@Deprecated
/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfc {
    public static volatile g zza = new zzcw();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzJ(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                StringBuilder a10 = f.a(str, ":");
                a10.append((String) obj);
                str2 = a10.toString();
            } else {
                str2 = str;
            }
            Log.e((String) zzew.zzc.zzb(), str2);
        }
        g gVar = zza;
        if (gVar != null) {
            gVar.error(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzd(String str) {
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzN(str);
        } else if (zzf(0)) {
            Log.v((String) zzew.zzc.zzb(), str);
        }
        g gVar = zza;
        if (gVar != null) {
            gVar.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zze(String str) {
        zzfd zza2 = zzfd.zza();
        if (zza2 != null) {
            zza2.zzQ(str);
        } else if (zzf(2)) {
            Log.w((String) zzew.zzc.zzb(), str);
        }
        g gVar = zza;
        if (gVar != null) {
            gVar.warn(str);
        }
    }

    public static boolean zzf(int i10) {
        return zza != null && zza.getLogLevel() <= i10;
    }
}
