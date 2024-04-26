package com.startapp;

import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import java.util.Map;

/* compiled from: Sta */
public class r4 extends y0 {

    /* renamed from: h0  reason: collision with root package name */
    public final i4 f11653h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f11654i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f11655j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f11656k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f11657l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f11658m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f11659n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f11660o0;

    /* renamed from: p0  reason: collision with root package name */
    public Map<String, String> f11661p0;

    public r4(i4 i4Var) {
        super(8);
        this.f11653h0 = i4Var;
    }

    public void a(m8 m8Var) throws SDKException {
        super.a(m8Var);
        i4 i4Var = this.f11653h0;
        Long l10 = i4Var.f10541h;
        String l11 = l10 != null ? l10.toString() : a.a();
        m8Var.a(a.f9999b, (Object) l11, true, true);
        m8Var.a(a.f10000c, (Object) a.a(l11), true, true);
        m8Var.a("category", (Object) i4Var.f10534a.f10602a, true, true);
        m8Var.a("value", (Object) i4Var.f10537d, false, true);
        m8Var.a("d", (Object) i4Var.f10540g, false, true);
        m8Var.a("appActivity", (Object) i4Var.f10542i, false, true);
        m8Var.a("details", (Object) i4Var.f10538e, false, true);
        m8Var.a("details_json", i4Var.f10539f, false, true);
        m8Var.a("isService", (Object) Boolean.valueOf(i4Var.f10543j), false, true);
        m8Var.a("orientation", (Object) this.f11654i0, false, true);
        m8Var.a("usedRam", (Object) this.f11655j0, false, true);
        m8Var.a("freeRam", (Object) this.f11656k0, false, true);
        m8Var.a("sessionTime", (Object) null, false, true);
        m8Var.a("cellScanRes", (Object) this.f11657l0, false, true);
        m8Var.a("sens", (Object) this.f11658m0, false, true);
        m8Var.a("bt", (Object) this.f11659n0, false, true);
        m8Var.a("packagingType", (Object) this.f11660o0, false, true);
        Pair<String, String> a10 = SimpleTokenUtils.a();
        Pair<String, String> b10 = SimpleTokenUtils.b();
        m8Var.a((String) a10.first, (Object) a10.second, false, true);
        m8Var.a((String) b10.first, (Object) b10.second, false, true);
        Map<String, String> map = this.f11661p0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                m8Var.a((String) next.getKey(), next.getValue(), false, true);
            }
        }
        m8Var.a("rcd", (Object) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033 A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r10, com.startapp.sdk.adsbase.model.AdPreferences r11) {
        /*
            r9 = this;
            super.b(r10, r11)
            android.content.res.Resources r11 = r10.getResources()
            r0 = 2
            r1 = 1
            if (r11 == 0) goto L_0x001d
            android.content.res.Configuration r11 = r11.getConfiguration()
            if (r11 == 0) goto L_0x001d
            int r11 = r11.orientation
            if (r11 != r0) goto L_0x0018
            java.lang.String r11 = "landscape"
            goto L_0x001f
        L_0x0018:
            if (r11 != r1) goto L_0x001d
            java.lang.String r11 = "portrait"
            goto L_0x001f
        L_0x001d:
            java.lang.String r11 = "undefined"
        L_0x001f:
            r9.f11654i0 = r11
            java.lang.String[] r11 = new java.lang.String[r0]
            r0 = 0
            r2 = 0
            r11[r0] = r2
            r11[r1] = r2
            java.lang.String r2 = "activity"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch:{ all -> 0x0060 }
            android.app.ActivityManager r10 = (android.app.ActivityManager) r10     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x0075
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x0060 }
            r2.<init>()     // Catch:{ all -> 0x0060 }
            r10.getMemoryInfo(r2)     // Catch:{ all -> 0x0060 }
            long r3 = r2.availMem     // Catch:{ all -> 0x0060 }
            r5 = 1048576(0x100000, double:5.180654E-318)
            long r3 = r3 / r5
            java.lang.String r10 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0060 }
            r11[r0] = r10     // Catch:{ all -> 0x0060 }
            int r10 = com.startapp.a0.f10005a     // Catch:{ all -> 0x0060 }
            long r3 = r2.totalMem     // Catch:{ all -> 0x0060 }
            java.lang.Long r10 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x0075
            long r3 = r10.longValue()     // Catch:{ all -> 0x0060 }
            long r7 = r2.availMem     // Catch:{ all -> 0x0060 }
            long r3 = r3 - r7
            long r3 = r3 / r5
            java.lang.String r10 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0060 }
            r11[r1] = r10     // Catch:{ all -> 0x0060 }
            goto L_0x0075
        L_0x0060:
            r10 = move-exception
            java.lang.Class<java.lang.SecurityException> r2 = java.lang.SecurityException.class
            boolean r2 = com.startapp.wb.a((java.lang.Throwable) r10, (java.lang.Class<? extends java.lang.Throwable>) r2)
            if (r2 != 0) goto L_0x0075
            java.lang.Class<android.os.RemoteException> r2 = android.os.RemoteException.class
            boolean r2 = com.startapp.wb.a((java.lang.Throwable) r10, (java.lang.Class<? extends java.lang.Throwable>) r2)
            if (r2 == 0) goto L_0x0072
            goto L_0x0075
        L_0x0072:
            com.startapp.i4.a((java.lang.Throwable) r10)
        L_0x0075:
            r10 = r11[r0]
            r9.f11656k0 = r10
            r10 = r11[r1]
            r9.f11655j0 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.r4.b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public String toString() {
        return this.f11653h0.toString();
    }
}
