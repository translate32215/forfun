package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import z7.g;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzfu {
    public static long zza(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static zzay zzb(zzfd zzfd, String str) {
        if (zzfd == null) {
            throw new NullPointerException("null reference");
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            new HashMap();
            try {
                Map<String, String> a10 = g.a(new URI("?" + str), "UTF-8");
                zzay zzay = new zzay();
                zzay.zzp(a10.get("utm_content"));
                zzay.zzu(a10.get("utm_medium"));
                zzay.zzv(a10.get("utm_campaign"));
                zzay.zzw(a10.get("utm_source"));
                zzay.zzt(a10.get("utm_term"));
                zzay.zzs(a10.get("utm_id"));
                zzay.zzo(a10.get("anid"));
                zzay.zzr(a10.get("gclid"));
                zzay.zzq(a10.get("dclid"));
                zzay.zzn(a10.get("aclid"));
                return zzay;
            } catch (URISyntaxException e10) {
                zzfd.zzR("No valid campaign data found", e10);
                return null;
            }
        }
    }

    public static String zzc(boolean z10) {
        return true != z10 ? "0" : "1";
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry().toLowerCase(locale));
        }
        return sb2.toString();
    }

    public static MessageDigest zze(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void zzg(Map map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void zzh(Map map, String str, Map map2) {
        zzg(map, str, (String) map2.get(str));
    }

    public static boolean zzi(Context context, String str, boolean z10) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 0);
            if (receiverInfo == null || !receiverInfo.enabled || (z10 && !receiverInfo.exported)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zzj(double d10, String str) {
        int i10;
        if (d10 > 0.0d && d10 < 100.0d) {
            if (!TextUtils.isEmpty(str)) {
                i10 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i10 = ((i10 << 6) & 65535) + charAt + (charAt << 14);
                    int i11 = 266338304 & i10;
                    if (i11 != 0) {
                        i10 ^= i11 >> 21;
                    }
                }
            } else {
                i10 = 1;
            }
            if (((double) (i10 % 10000)) >= d10 * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
