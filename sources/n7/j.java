package n7;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfu;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class j extends zzbt implements x {

    /* renamed from: d  reason: collision with root package name */
    public static DecimalFormat f22370d;

    /* renamed from: a  reason: collision with root package name */
    public final zzbx f22371a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22372b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f22373c;

    public j(zzbx zzbx, String str) {
        super(zzbx);
        i.e(str);
        this.f22371a = zzbx;
        this.f22372b = str;
        this.f22373c = i(str);
    }

    public static Uri i(String str) {
        i.e(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    public static String o(double d10) {
        if (f22370d == null) {
            f22370d = new DecimalFormat("0.######");
        }
        return f22370d.format(d10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0024 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map s(n7.o r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<com.google.android.gms.internal.gtm.zzbb> r1 = com.google.android.gms.internal.gtm.zzbb.class
            java.util.Map r2 = r11.f22386j
            java.lang.Object r1 = r2.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbb r1 = (com.google.android.gms.internal.gtm.zzbb) r1
            r2 = 0
            java.lang.String r4 = "1"
            r5 = 0
            if (r1 == 0) goto L_0x0077
            java.util.Map r1 = r1.zzd()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0024:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0077
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            if (r7 != 0) goto L_0x0037
            goto L_0x0065
        L_0x0037:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x0044
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x006b
            goto L_0x0065
        L_0x0044:
            boolean r8 = r7 instanceof java.lang.Double
            if (r8 == 0) goto L_0x005b
            java.lang.Double r7 = (java.lang.Double) r7
            double r8 = r7.doubleValue()
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x0065
            double r7 = r7.doubleValue()
            java.lang.String r7 = o(r7)
            goto L_0x006b
        L_0x005b:
            boolean r8 = r7 instanceof java.lang.Boolean
            if (r8 == 0) goto L_0x0067
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            if (r7 == r8) goto L_0x0065
            r7 = r4
            goto L_0x006b
        L_0x0065:
            r7 = r5
            goto L_0x006b
        L_0x0067:
            java.lang.String r7 = r7.toString()
        L_0x006b:
            if (r7 == 0) goto L_0x0024
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r0.put(r6, r7)
            goto L_0x0024
        L_0x0077:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbg> r1 = com.google.android.gms.internal.gtm.zzbg.class
            java.util.Map r6 = r11.f22386j
            java.lang.Object r1 = r6.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbg r1 = (com.google.android.gms.internal.gtm.zzbg) r1
            if (r1 == 0) goto L_0x00c4
            java.lang.String r6 = r1.zzf()
            java.lang.String r7 = "t"
            t(r0, r7, r6)
            java.lang.String r6 = r1.zze()
            java.lang.String r7 = "cid"
            t(r0, r7, r6)
            java.lang.String r6 = r1.zzg()
            java.lang.String r7 = "uid"
            t(r0, r7, r6)
            java.lang.String r6 = "sc"
            t(r0, r6, r5)
            boolean r6 = r1.zzo()
            if (r6 == 0) goto L_0x00b0
            java.lang.String r6 = "ni"
            r0.put(r6, r4)
        L_0x00b0:
            java.lang.String r6 = r1.zzd()
            java.lang.String r7 = "adid"
            t(r0, r7, r6)
            boolean r1 = r1.zzn()
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = "ate"
            r0.put(r1, r4)
        L_0x00c4:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbh> r1 = com.google.android.gms.internal.gtm.zzbh.class
            java.util.Map r4 = r11.f22386j
            java.lang.Object r1 = r4.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbh r1 = (com.google.android.gms.internal.gtm.zzbh) r1
            java.lang.String r4 = "cd"
            if (r1 == 0) goto L_0x00ee
            t(r0, r4, r5)
            int r1 = r1.zzd()
            double r6 = (double) r1
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = o(r6)
            java.lang.String r2 = "a"
            r0.put(r2, r1)
        L_0x00e9:
            java.lang.String r1 = "dr"
            t(r0, r1, r5)
        L_0x00ee:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbe> r1 = com.google.android.gms.internal.gtm.zzbe.class
            java.util.Map r2 = r11.f22386j
            java.lang.Object r1 = r2.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbe r1 = (com.google.android.gms.internal.gtm.zzbe) r1
            if (r1 == 0) goto L_0x010b
            java.lang.String r1 = "ec"
            t(r0, r1, r5)
            java.lang.String r1 = "ea"
            t(r0, r1, r5)
            java.lang.String r1 = "el"
            t(r0, r1, r5)
        L_0x010b:
            java.lang.Class<com.google.android.gms.internal.gtm.zzay> r1 = com.google.android.gms.internal.gtm.zzay.class
            java.util.Map r2 = r11.f22386j
            java.lang.Object r1 = r2.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzay r1 = (com.google.android.gms.internal.gtm.zzay) r1
            java.lang.String r2 = "cm"
            if (r1 == 0) goto L_0x0173
            java.lang.String r3 = r1.zzl()
            java.lang.String r6 = "cn"
            t(r0, r6, r3)
            java.lang.String r3 = r1.zzm()
            java.lang.String r6 = "cs"
            t(r0, r6, r3)
            java.lang.String r3 = r1.zzk()
            t(r0, r2, r3)
            java.lang.String r3 = r1.zzj()
            java.lang.String r6 = "ck"
            t(r0, r6, r3)
            java.lang.String r3 = r1.zzf()
            java.lang.String r6 = "cc"
            t(r0, r6, r3)
            java.lang.String r3 = r1.zzi()
            java.lang.String r6 = "ci"
            t(r0, r6, r3)
            java.lang.String r3 = r1.zze()
            java.lang.String r6 = "anid"
            t(r0, r6, r3)
            java.lang.String r3 = r1.zzh()
            java.lang.String r6 = "gclid"
            t(r0, r6, r3)
            java.lang.String r3 = r1.zzg()
            java.lang.String r6 = "dclid"
            t(r0, r6, r3)
            java.lang.String r1 = r1.zzd()
            java.lang.String r3 = "aclid"
            t(r0, r3, r1)
        L_0x0173:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbf> r1 = com.google.android.gms.internal.gtm.zzbf.class
            java.util.Map r3 = r11.f22386j
            java.lang.Object r1 = r3.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbf r1 = (com.google.android.gms.internal.gtm.zzbf) r1
            if (r1 == 0) goto L_0x0186
            java.lang.String r1 = "exd"
            t(r0, r1, r5)
        L_0x0186:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbi> r1 = com.google.android.gms.internal.gtm.zzbi.class
            java.util.Map r3 = r11.f22386j
            java.lang.Object r1 = r3.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbi r1 = (com.google.android.gms.internal.gtm.zzbi) r1
            if (r1 == 0) goto L_0x01a3
            java.lang.String r1 = "sn"
            t(r0, r1, r5)
            java.lang.String r1 = "sa"
            t(r0, r1, r5)
            java.lang.String r1 = "st"
            t(r0, r1, r5)
        L_0x01a3:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbj> r1 = com.google.android.gms.internal.gtm.zzbj.class
            java.util.Map r3 = r11.f22386j
            java.lang.Object r1 = r3.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbj r1 = (com.google.android.gms.internal.gtm.zzbj) r1
            if (r1 == 0) goto L_0x01c0
            java.lang.String r1 = "utv"
            t(r0, r1, r5)
            java.lang.String r1 = "utc"
            t(r0, r1, r5)
            java.lang.String r1 = "utl"
            t(r0, r1, r5)
        L_0x01c0:
            java.lang.Class<com.google.android.gms.internal.gtm.zzaz> r1 = com.google.android.gms.internal.gtm.zzaz.class
            java.util.Map r3 = r11.f22386j
            java.lang.Object r1 = r3.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzaz r1 = (com.google.android.gms.internal.gtm.zzaz) r1
            if (r1 == 0) goto L_0x0204
            java.util.Map r1 = r1.zzd()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x01da:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0204
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r5 = n7.k.a(r4, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x01da
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r5, r3)
            goto L_0x01da
        L_0x0204:
            java.lang.Class<com.google.android.gms.internal.gtm.zzba> r1 = com.google.android.gms.internal.gtm.zzba.class
            java.util.Map r3 = r11.f22386j
            java.lang.Object r1 = r3.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzba r1 = (com.google.android.gms.internal.gtm.zzba) r1
            if (r1 == 0) goto L_0x0250
            java.util.Map r1 = r1.zzd()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x021e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0250
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r4 = n7.k.a(r2, r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x021e
            java.lang.Object r3 = r3.getValue()
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            java.lang.String r3 = o(r5)
            r0.put(r4, r3)
            goto L_0x021e
        L_0x0250:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbd> r1 = com.google.android.gms.internal.gtm.zzbd.class
            java.util.Map r2 = r11.f22386j
            java.lang.Object r1 = r2.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbd r1 = (com.google.android.gms.internal.gtm.zzbd) r1
            if (r1 == 0) goto L_0x030e
            java.util.List r2 = r1.zze()
            java.util.Iterator r2 = r2.iterator()
            r3 = 1
            r4 = 1
        L_0x0268:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0283
            java.lang.Object r5 = r2.next()
            o7.b r5 = (o7.b) r5
            java.lang.String r6 = "promo"
            java.lang.String r6 = n7.k.a(r6, r4)
            java.util.Map r5 = r5.a(r6)
            r0.putAll(r5)
            int r4 = r4 + r3
            goto L_0x0268
        L_0x0283:
            java.util.List r2 = r1.zzd()
            java.util.Iterator r2 = r2.iterator()
            r4 = 1
        L_0x028c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x02a7
            java.lang.Object r5 = r2.next()
            o7.a r5 = (o7.a) r5
            java.lang.String r6 = "pr"
            java.lang.String r6 = n7.k.a(r6, r4)
            java.util.Map r5 = r5.a(r6)
            r0.putAll(r5)
            int r4 = r4 + r3
            goto L_0x028c
        L_0x02a7:
            java.util.Map r1 = r1.zzf()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L_0x02b4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x030e
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.util.List r5 = (java.util.List) r5
            java.lang.String r6 = "il"
            java.lang.String r6 = n7.k.a(r6, r2)
            java.util.Iterator r5 = r5.iterator()
            r7 = 1
        L_0x02d1:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x02f0
            java.lang.Object r8 = r5.next()
            o7.a r8 = (o7.a) r8
            java.lang.String r9 = "pi"
            java.lang.String r9 = n7.k.a(r9, r7)
            java.lang.String r9 = r6.concat(r9)
            java.util.Map r8 = r8.a(r9)
            r0.putAll(r8)
            int r7 = r7 + r3
            goto L_0x02d1
        L_0x02f0:
            java.lang.Object r5 = r4.getKey()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x030b
            java.lang.String r5 = "nm"
            java.lang.String r5 = r6.concat(r5)
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r0.put(r5, r4)
        L_0x030b:
            int r2 = r2 + 1
            goto L_0x02b4
        L_0x030e:
            java.lang.Class<com.google.android.gms.internal.gtm.zzbc> r1 = com.google.android.gms.internal.gtm.zzbc.class
            java.util.Map r2 = r11.f22386j
            java.lang.Object r1 = r2.get(r1)
            n7.q r1 = (n7.q) r1
            com.google.android.gms.internal.gtm.zzbc r1 = (com.google.android.gms.internal.gtm.zzbc) r1
            if (r1 == 0) goto L_0x0346
            java.lang.String r2 = r1.zzd()
            java.lang.String r3 = "ul"
            t(r0, r3, r2)
            int r2 = r1.zza
            int r1 = r1.zzb
            if (r2 <= 0) goto L_0x0346
            if (r1 <= 0) goto L_0x0346
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "x"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "sr"
            r0.put(r2, r1)
        L_0x0346:
            java.lang.Class<com.google.android.gms.internal.gtm.zzax> r1 = com.google.android.gms.internal.gtm.zzax.class
            java.util.Map r11 = r11.f22386j
            java.lang.Object r11 = r11.get(r1)
            n7.q r11 = (n7.q) r11
            com.google.android.gms.internal.gtm.zzax r11 = (com.google.android.gms.internal.gtm.zzax) r11
            if (r11 == 0) goto L_0x0378
            java.lang.String r1 = r11.zzf()
            java.lang.String r2 = "an"
            t(r0, r2, r1)
            java.lang.String r1 = r11.zzd()
            java.lang.String r2 = "aid"
            t(r0, r2, r1)
            java.lang.String r1 = r11.zze()
            java.lang.String r2 = "aiid"
            t(r0, r2, r1)
            java.lang.String r11 = r11.zzg()
            java.lang.String r1 = "av"
            t(r0, r1, r11)
        L_0x0378:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.j.s(n7.o):java.util.Map");
    }

    public static void t(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final void a(o oVar) {
        i.b(oVar.f22379c, "Can't deliver not submitted measurement");
        i.g("deliver should be called on worker thread");
        o oVar2 = new o(oVar);
        zzbg zzbg = (zzbg) oVar2.a(zzbg.class);
        if (TextUtils.isEmpty(zzbg.zzf())) {
            zzz().zzc(s(oVar2), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(zzbg.zze())) {
            zzz().zzc(s(oVar2), "Ignoring measurement without client id");
        } else {
            this.f22371a.zzc().getClass();
            if (zzfu.zzj(0.0d, zzbg.zze())) {
                zzF("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
                return;
            }
            Map s10 = s(oVar2);
            HashMap hashMap = (HashMap) s10;
            hashMap.put("v", "1");
            hashMap.put("_v", zzbv.zzb);
            hashMap.put("tid", this.f22372b);
            if (this.f22371a.zzc().f22354i) {
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append("=");
                    sb2.append((String) entry.getValue());
                }
                zzM("Dry run is enabled. GoogleAnalytics would have sent", sb2.toString());
                return;
            }
            HashMap hashMap2 = new HashMap();
            zzfu.zzg(hashMap2, "uid", zzbg.zzg());
            zzax zzax = (zzax) ((q) oVar.f22386j.get(zzax.class));
            if (zzax != null) {
                zzfu.zzg(hashMap2, "an", zzax.zzf());
                zzfu.zzg(hashMap2, "aid", zzax.zzd());
                zzfu.zzg(hashMap2, "av", zzax.zzg());
                zzfu.zzg(hashMap2, "aiid", zzax.zze());
            }
            hashMap.put("_s", String.valueOf(zzs().zza(new zzbz(0, zzbg.zze(), this.f22372b, !TextUtils.isEmpty(zzbg.zzd()), 0, hashMap2))));
            zzs().zzh(new zzez(zzz(), s10, oVar.f22380d, true));
        }
    }

    public final Uri d() {
        return this.f22373c;
    }
}
