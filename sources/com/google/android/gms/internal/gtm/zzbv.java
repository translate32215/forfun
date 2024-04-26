package com.google.android.gms.internal.gtm;

import s7.e;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzbv {
    public static final String zza;
    public static final String zzb;

    static {
        String replaceAll = String.valueOf(e.f25012a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        zza = replaceAll;
        zzb = "ma".concat(String.valueOf(replaceAll));
    }
}
