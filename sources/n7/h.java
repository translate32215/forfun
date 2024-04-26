package n7;

import android.text.TextUtils;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzft;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public class h extends zzbu {

    /* renamed from: a  reason: collision with root package name */
    public final Map f22359a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f22360b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final zzfb f22361c;

    /* renamed from: d  reason: collision with root package name */
    public final z f22362d;

    /* renamed from: e  reason: collision with root package name */
    public b f22363e;

    /* renamed from: f  reason: collision with root package name */
    public zzft f22364f;

    public h(zzbx zzbx, String str, zzfb zzfb) {
        super(zzbx);
        HashMap hashMap = new HashMap();
        this.f22359a = hashMap;
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f22361c = new zzfb(60, 2000, "tracking", zzC());
        this.f22362d = new z(this, zzbx);
    }

    public static void s(Map map, Map map2) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String u10 = u(entry);
                if (u10 != null) {
                    map2.put(u10, (String) entry.getValue());
                }
            }
        }
    }

    public static String u(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (!str.startsWith("&") || str.length() < 2) {
            return null;
        }
        return ((String) entry.getKey()).substring(1);
    }

    public void i(Map<String, String> map) {
        long b10 = zzC().b();
        zzp().getClass();
        boolean z10 = zzp().f22354i;
        HashMap hashMap = new HashMap();
        s(this.f22359a, hashMap);
        s(map, hashMap);
        String str = (String) this.f22359a.get("useSecure");
        int i10 = 1;
        boolean z11 = str == null || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1") || (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0"));
        for (Map.Entry entry : this.f22360b.entrySet()) {
            String u10 = u(entry);
            if (u10 != null && !hashMap.containsKey(u10)) {
                hashMap.put(u10, (String) entry.getValue());
            }
        }
        this.f22360b.clear();
        String str2 = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str2)) {
            zzz().zzc(hashMap, "Missing hit type parameter");
            return;
        }
        String str3 = (String) hashMap.get("tid");
        if (!TextUtils.isEmpty(str3)) {
            synchronized (this) {
                if ("screenview".equalsIgnoreCase(str2) || "pageview".equalsIgnoreCase(str2) || "appview".equalsIgnoreCase(str2) || TextUtils.isEmpty(str2)) {
                    String str4 = (String) this.f22359a.get("&a");
                    i.h(str4);
                    int parseInt = Integer.parseInt(str4) + 1;
                    if (parseInt < Integer.MAX_VALUE) {
                        i10 = parseInt;
                    }
                    this.f22359a.put("&a", Integer.toString(i10));
                }
            }
            zzq().f22394c.submit(new y(this, hashMap, false, str2, b10, z10, z11, str3));
            return;
        }
        zzz().zzc(hashMap, "Missing tracking id parameter");
    }

    public void o(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f22359a.put(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(com.google.android.gms.internal.gtm.zzft r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Loading Tracker config values"
            r6.zzN(r0)
            r6.f22364f = r7
            java.lang.String r0 = r7.zza
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "&tid"
            r6.o(r1, r0)
            java.lang.String r1 = "trackingId loaded"
            r6.zzO(r1, r0)
        L_0x0015:
            double r0 = r7.zzb
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            java.lang.String r0 = java.lang.Double.toString(r0)
            java.lang.String r1 = "&sf"
            r6.o(r1, r0)
            java.lang.String r1 = "Sample frequency loaded"
            r6.zzO(r1, r0)
        L_0x002b:
            int r0 = r7.zzc
            if (r0 < 0) goto L_0x0044
            long r1 = (long) r0
            n7.z r3 = r6.f22362d
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r4
            r3.f22406c = r1
            r3.i()
            java.lang.String r1 = "Session timeout loaded"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.zzO(r1, r0)
        L_0x0044:
            int r0 = r7.zzd
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0060
            if (r3 == r0) goto L_0x004f
            r0 = 0
            goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            n7.z r4 = r6.f22362d
            r4.f22404a = r0
            r4.i()
            java.lang.String r4 = "Auto activity tracking loaded"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.zzO(r4, r0)
        L_0x0060:
            int r0 = r7.zze
            if (r0 == r1) goto L_0x007b
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = "&aip"
            java.lang.String r4 = "1"
            r6.o(r1, r4)
        L_0x006d:
            if (r3 == r0) goto L_0x0071
            r0 = 0
            goto L_0x0072
        L_0x0071:
            r0 = 1
        L_0x0072:
            java.lang.String r1 = "Anonymize ip loaded"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.zzO(r1, r0)
        L_0x007b:
            int r7 = r7.zzf
            if (r7 != r3) goto L_0x0081
            r7 = 1
            goto L_0x0082
        L_0x0081:
            r7 = 0
        L_0x0082:
            monitor-enter(r6)
            n7.b r0 = r6.f22363e     // Catch:{ all -> 0x00b3 }
            if (r0 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r2 = 1
        L_0x0089:
            if (r2 != r7) goto L_0x008d
            monitor-exit(r6)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b2
        L_0x008d:
            if (r7 == 0) goto L_0x00a7
            android.content.Context r7 = r6.zzo()     // Catch:{ all -> 0x00b3 }
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ all -> 0x00b3 }
            n7.b r1 = new n7.b     // Catch:{ all -> 0x00b3 }
            r1.<init>(r6, r0, r7)     // Catch:{ all -> 0x00b3 }
            r6.f22363e = r1     // Catch:{ all -> 0x00b3 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)     // Catch:{ all -> 0x00b3 }
            java.lang.String r7 = "Uncaught exceptions will be reported to Google Analytics"
            r6.zzN(r7)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b1
        L_0x00a7:
            java.lang.Thread$UncaughtExceptionHandler r7 = r0.f22345a     // Catch:{ all -> 0x00b3 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r7)     // Catch:{ all -> 0x00b3 }
            java.lang.String r7 = "Uncaught exceptions will not be reported to Google Analytics"
            r6.zzN(r7)     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r6)     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            return
        L_0x00b3:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b3 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.h.t(com.google.android.gms.internal.gtm.zzft):void");
    }

    public final void zzd() {
        this.f22362d.zzW();
        String zza = zzB().zza();
        if (zza != null) {
            o("&an", zza);
        }
        String zzb = zzB().zzb();
        if (zzb != null) {
            o("&av", zzb);
        }
    }
}
