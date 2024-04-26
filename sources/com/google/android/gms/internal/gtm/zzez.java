package com.google.android.gms.internal.gtm;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class zzez {
    public final Map zza;
    public final List zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final boolean zzf;
    public final String zzg;

    public zzez(zzbt zzbt, Map map, long j10, boolean z10) {
        this(zzbt, map, j10, z10, 0, 0, (List) null);
    }

    public static zzez zze(zzbt zzbt, zzez zzez, Map map) {
        return new zzez(zzbt, map, zzez.zzd, zzez.zzf, zzez.zzc, zzez.zze, zzez.zzb);
    }

    public static String zzj(zzbt zzbt, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            zzbt.zzS("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    public static String zzk(zzbt zzbt, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        String substring = obj2.substring(0, 8192);
        zzbt.zzS("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    public static boolean zzl(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String toString() {
        StringBuilder a10 = a.a("ht=");
        a10.append(this.zzd);
        if (this.zzc != 0) {
            a10.append(", dbId=");
            a10.append(this.zzc);
        }
        if (this.zze != 0) {
            a10.append(", appUID=");
            a10.append(this.zze);
        }
        ArrayList arrayList = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) arrayList.get(i10);
            a10.append(", ");
            a10.append(str);
            a10.append("=");
            a10.append((String) this.zza.get(str));
        }
        return a10.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzfu.zza(zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final String zzf() {
        return zzi("_m", "");
    }

    public final Map zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final String zzi(String str, String str2) {
        i.e(str);
        i.b(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.zza.get(str);
        return str3 != null ? str3 : str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzez(com.google.android.gms.internal.gtm.zzbt r2, java.util.Map r3, long r4, boolean r6, long r7, int r9, java.util.List r10) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "null reference"
            if (r2 == 0) goto L_0x00ed
            if (r3 == 0) goto L_0x00e7
            r1.zzd = r4
            r1.zzf = r6
            r1.zzc = r7
            r1.zze = r9
            if (r10 == 0) goto L_0x0015
            r4 = r10
            goto L_0x0019
        L_0x0015:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0019:
            r1.zzb = r4
            r4 = 0
            if (r10 == 0) goto L_0x003f
            java.util.Iterator r5 = r10.iterator()
        L_0x0022:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x003f
            java.lang.Object r6 = r5.next()
            com.google.android.gms.internal.gtm.zzcr r6 = (com.google.android.gms.internal.gtm.zzcr) r6
            java.lang.String r7 = r6.zza()
            java.lang.String r8 = "appendVersion"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0022
            java.lang.String r5 = r6.zzb()
            goto L_0x0040
        L_0x003f:
            r5 = r4
        L_0x0040:
            r6 = 1
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r6 != r7) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = r5
        L_0x0049:
            r1.zzg = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r5 = r3.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0058:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0084
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r7 = zzl(r7)
            if (r7 == 0) goto L_0x0058
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = zzj(r2, r7)
            if (r7 == 0) goto L_0x0058
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = zzk(r2, r6)
            r4.put(r7, r6)
            goto L_0x0058
        L_0x0084:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x008c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            boolean r6 = zzl(r6)
            if (r6 != 0) goto L_0x008c
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = zzj(r2, r6)
            if (r6 == 0) goto L_0x008c
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = zzk(r2, r5)
            r4.put(r6, r5)
            goto L_0x008c
        L_0x00b8:
            java.lang.String r2 = r1.zzg
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00e0
            java.lang.String r2 = r1.zzg
            java.lang.String r3 = "_v"
            com.google.android.gms.internal.gtm.zzfu.zzg(r4, r3, r2)
            java.lang.String r2 = r1.zzg
            java.lang.String r3 = "ma4.0.0"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = r1.zzg
            java.lang.String r3 = "ma4.0.1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00e0
        L_0x00db:
            java.lang.String r2 = "adid"
            r4.remove(r2)
        L_0x00e0:
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r4)
            r1.zza = r2
            return
        L_0x00e7:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        L_0x00ed:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            goto L_0x00f4
        L_0x00f3:
            throw r2
        L_0x00f4:
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzez.<init>(com.google.android.gms.internal.gtm.zzbt, java.util.Map, long, boolean, long, int, java.util.List):void");
    }
}
