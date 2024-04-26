package f7;

import ab.r;
import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.y6;
import e8.dt;
import e8.fw;
import e8.jx;
import e8.ow;
import e8.tw;
import e8.vw;
import e8.yq;
import java.util.concurrent.Callable;
import q.e;
import q.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class h0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18284a = 13;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18285b;

    public h0(r rVar) {
        this.f18285b = rVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Long} */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:96|97|98|99|100|(1:102)|103|104|(1:106)|107|108|196|194|94) */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ae, code lost:
        if (r5 != 5) goto L_0x01b3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0211 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0224 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0217 A[Catch:{ b10 -> 0x0224 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r15 = this;
            int r0 = r15.f18284a
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L_0x029c;
                case 1: goto L_0x025f;
                case 2: goto L_0x0253;
                case 3: goto L_0x0239;
                case 4: goto L_0x0230;
                case 5: goto L_0x01ba;
                case 6: goto L_0x0168;
                case 7: goto L_0x014b;
                case 8: goto L_0x0083;
                case 9: goto L_0x0051;
                case 10: goto L_0x002e;
                case 11: goto L_0x0018;
                case 12: goto L_0x000c;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x02a9
        L_0x000c:
            java.lang.Object r0 = r15.f18285b
            android.content.Context r0 = (android.content.Context) r0
            e8.th0 r1 = new e8.th0
            java.lang.String r2 = "GLAS"
            r1.<init>(r0, r2)
            return r1
        L_0x0018:
            java.lang.Object r0 = r15.f18285b
            e8.ow r0 = (e8.ow) r0
            e8.qy r2 = new e8.qy
            java.lang.Object r3 = r0.f15852b
            e8.mh0 r3 = (e8.mh0) r3
            java.lang.Object r0 = r0.f15854d
            android.content.Context r0 = (android.content.Context) r0
            org.json.JSONObject r0 = r3.a(r0)
            r2.<init>(r0, r1)
            return r2
        L_0x002e:
            java.lang.Object r0 = r15.f18285b
            e8.fw r0 = (e8.fw) r0
            r0.getClass()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.Object r3 = r0.f14688d
            e8.f7 r3 = (e8.f7) r3
            if (r3 == 0) goto L_0x004b
            java.lang.Object r4 = r0.f14687c
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r0 = r0.f14689e
            java.lang.String r0 = (java.lang.String) r0
            r3.a(r4, r0, r1)
        L_0x004b:
            e8.qy r0 = new e8.qy
            r0.<init>(r1, r2)
            return r0
        L_0x0051:
            java.lang.Object r0 = r15.f18285b
            e8.tw r0 = (e8.tw) r0
            r0.getClass()
            e8.l<java.lang.String> r1 = e8.t.f16666u3
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r1 = r2.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x006b
            goto L_0x0082
        L_0x006b:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007c }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x007c }
            android.content.Context r0 = r0.f16816c
            android.os.Bundle r0 = e8.tw.a(r0, r2)
            e8.ww r5 = new e8.ww
            r5.<init>((android.os.Bundle) r0)
            goto L_0x0082
        L_0x007c:
            r0 = move-exception
            java.lang.String r1 = "JSON parsing error"
            l0.e.A(r1, r0)
        L_0x0082:
            return r5
        L_0x0083:
            java.lang.Object r0 = r15.f18285b
            e8.ow r0 = (e8.ow) r0
            java.lang.Object r1 = r0.f15852b
            com.google.android.gms.internal.ads.p6 r1 = (com.google.android.gms.internal.ads.p6) r1
            java.lang.Object r3 = r0.f15854d
            android.content.Context r3 = (android.content.Context) r3
            boolean r1 = r1.p(r3)
            if (r1 != 0) goto L_0x00a2
            e8.wx r0 = new e8.wx
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0147
        L_0x00a2:
            java.lang.Object r1 = r0.f15852b
            com.google.android.gms.internal.ads.p6 r1 = (com.google.android.gms.internal.ads.p6) r1
            java.lang.Object r3 = r0.f15854d
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r1 = r1.h(r3)
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = ""
        L_0x00b2:
            r7 = r1
            java.lang.Object r1 = r0.f15852b
            com.google.android.gms.internal.ads.p6 r1 = (com.google.android.gms.internal.ads.p6) r1
            java.lang.Object r3 = r0.f15854d
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r1 = r1.i(r3)
            if (r1 != 0) goto L_0x00c3
            java.lang.String r1 = ""
        L_0x00c3:
            r8 = r1
            java.lang.Object r1 = r0.f15852b
            com.google.android.gms.internal.ads.p6 r1 = (com.google.android.gms.internal.ads.p6) r1
            java.lang.Object r3 = r0.f15854d
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r1 = r1.j(r3)
            if (r1 != 0) goto L_0x00d4
            java.lang.String r1 = ""
        L_0x00d4:
            r9 = r1
            java.lang.Object r1 = r0.f15852b
            com.google.android.gms.internal.ads.p6 r1 = (com.google.android.gms.internal.ads.p6) r1
            java.lang.Object r0 = r0.f15854d
            android.content.Context r0 = (android.content.Context) r0
            boolean r3 = r1.p(r0)
            if (r3 != 0) goto L_0x00e5
            r4 = r5
            goto L_0x0124
        L_0x00e5:
            java.lang.Object r3 = r1.f7811b
            monitor-enter(r3)
            java.lang.String r4 = r1.f7813d     // Catch:{ all -> 0x0148 }
            if (r4 == 0) goto L_0x00ee
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            goto L_0x0124
        L_0x00ee:
            boolean r0 = com.google.android.gms.internal.ads.p6.g(r0)     // Catch:{ all -> 0x0148 }
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = "getAppIdOrigin"
            java.lang.String r4 = r1.f7813d     // Catch:{ all -> 0x0148 }
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.y7> r6 = r1.f7819j     // Catch:{ all -> 0x0148 }
            monitor-enter(r6)     // Catch:{ all -> 0x0148 }
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.y7> r10 = r1.f7819j     // Catch:{ all -> 0x011a }
            java.lang.Object r10 = r10.get()     // Catch:{ all -> 0x011a }
            com.google.android.gms.internal.ads.y7 r10 = (com.google.android.gms.internal.ads.y7) r10     // Catch:{ all -> 0x011a }
            if (r10 == 0) goto L_0x0116
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.y7> r10 = r1.f7819j     // Catch:{ Exception -> 0x0113 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0113 }
            com.google.android.gms.internal.ads.y7 r10 = (com.google.android.gms.internal.ads.y7) r10     // Catch:{ Exception -> 0x0113 }
            java.lang.String r4 = r10.t1()     // Catch:{ Exception -> 0x0113 }
            monitor-exit(r6)     // Catch:{ all -> 0x011a }
            goto L_0x0117
        L_0x0113:
            r1.m(r0, r2)     // Catch:{ all -> 0x011a }
        L_0x0116:
            monitor-exit(r6)     // Catch:{ all -> 0x011a }
        L_0x0117:
            r1.f7813d = r4     // Catch:{ all -> 0x0148 }
            goto L_0x0121
        L_0x011a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x011d:
            java.lang.String r0 = "fa"
            r1.f7813d = r0     // Catch:{ all -> 0x0148 }
        L_0x0121:
            java.lang.String r4 = r1.f7813d     // Catch:{ all -> 0x0148 }
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
        L_0x0124:
            if (r4 != 0) goto L_0x012a
            java.lang.String r0 = ""
            r10 = r0
            goto L_0x012b
        L_0x012a:
            r10 = r4
        L_0x012b:
            java.lang.String r0 = "TIME_OUT"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0140
            e8.l<java.lang.Long> r0 = e8.t.W
            e8.ti0 r1 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r1 = r1.f16769f
            java.lang.Object r0 = r1.a(r0)
            r5 = r0
            java.lang.Long r5 = (java.lang.Long) r5
        L_0x0140:
            r11 = r5
            e8.wx r0 = new e8.wx
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0147:
            return r0
        L_0x0148:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            throw r0
        L_0x014b:
            java.lang.Object r0 = r15.f18285b
            e8.jx r0 = (e8.jx) r0
            e8.w00 r1 = r0.f15202b
            java.util.ArrayList<java.lang.String> r1 = r1.f17193g
            if (r1 != 0) goto L_0x0158
            e8.kx r0 = e8.lx.f15440a
            goto L_0x0167
        L_0x0158:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0161
            e8.kx r0 = e8.ox.f15855a
            goto L_0x0167
        L_0x0161:
            e8.mx r2 = new e8.mx
            r2.<init>(r0, r1)
            r0 = r2
        L_0x0167:
            return r0
        L_0x0168:
            java.lang.Object r0 = r15.f18285b
            e8.vw r0 = (e8.vw) r0
            r0.getClass()
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r7 = "android.intent.action.BATTERY_CHANGED"
            r6.<init>(r7)
            android.content.Context r0 = r0.f17175b
            android.content.Intent r0 = r0.registerReceiver(r5, r6)
            if (r0 == 0) goto L_0x01b1
            java.lang.String r5 = "status"
            int r5 = r0.getIntExtra(r5, r3)
            java.lang.String r6 = "level"
            int r6 = r0.getIntExtra(r6, r3)
            java.lang.String r7 = "scale"
            int r0 = r0.getIntExtra(r7, r3)
            double r6 = (double) r6
            double r8 = (double) r0
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r8)
            double r6 = r6 / r8
            if (r5 == r4) goto L_0x01b4
            r0 = 5
            if (r5 != r0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b1:
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            e8.uw r0 = new e8.uw
            r0.<init>(r6, r1)
            return r0
        L_0x01ba:
            java.lang.Object r0 = r15.f18285b
            e8.ow r0 = (e8.ow) r0
            r0.getClass()
            e8.l<java.lang.String> r1 = e8.t.O0
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r1 = r2.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ";"
            java.lang.String[] r1 = r1.split(r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01e0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x022a
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.f15854d     // Catch:{ b10 -> 0x0228 }
            com.google.android.gms.internal.ads.gb r4 = (com.google.android.gms.internal.ads.gb) r4     // Catch:{ b10 -> 0x0228 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ b10 -> 0x0228 }
            r6.<init>()     // Catch:{ b10 -> 0x0228 }
            com.google.android.gms.internal.ads.ue r4 = r4.b(r3, r6)     // Catch:{ b10 -> 0x0228 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ b10 -> 0x0228 }
            r6.<init>()     // Catch:{ b10 -> 0x0228 }
            com.google.android.gms.internal.ads.h4 r7 = r4.d()     // Catch:{ b10 -> 0x0211 }
            if (r7 == 0) goto L_0x0211
            java.lang.String r7 = "sdk_version"
            com.google.android.gms.internal.ads.h4 r8 = r4.d()     // Catch:{ b10 -> 0x0211 }
            java.lang.String r8 = r8.toString()     // Catch:{ b10 -> 0x0211 }
            r6.putString(r7, r8)     // Catch:{ b10 -> 0x0211 }
        L_0x0211:
            com.google.android.gms.internal.ads.h4 r7 = r4.c()     // Catch:{ b10 -> 0x0224 }
            if (r7 == 0) goto L_0x0224
            java.lang.String r7 = "adapter_version"
            com.google.android.gms.internal.ads.h4 r4 = r4.c()     // Catch:{ b10 -> 0x0224 }
            java.lang.String r4 = r4.toString()     // Catch:{ b10 -> 0x0224 }
            r6.putString(r7, r4)     // Catch:{ b10 -> 0x0224 }
        L_0x0224:
            r2.putBundle(r3, r6)     // Catch:{ b10 -> 0x0228 }
            goto L_0x01e0
        L_0x0228:
            goto L_0x01e0
        L_0x022a:
            e8.nw r0 = new e8.nw
            r0.<init>((android.os.Bundle) r2, (androidx.appcompat.widget.p) r5)
            return r0
        L_0x0230:
            java.lang.Object r0 = r15.f18285b
            e8.dt r0 = (e8.dt) r0
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()
            return r0
        L_0x0239:
            java.lang.Object r0 = r15.f18285b
            android.webkit.CookieManager r0 = (android.webkit.CookieManager) r0
            if (r0 != 0) goto L_0x0242
            java.lang.String r0 = ""
            goto L_0x0252
        L_0x0242:
            e8.l<java.lang.String> r1 = e8.t.f16645r0
            e8.ti0 r2 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r2 = r2.f16769f
            java.lang.Object r1 = r2.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r0.getCookie(r1)
        L_0x0252:
            return r0
        L_0x0253:
            java.lang.Object r0 = r15.f18285b
            e8.yq r0 = (e8.yq) r0
            com.google.android.gms.internal.ads.d7<java.lang.Boolean> r0 = r0.f17652d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.b(r1)
            return r5
        L_0x025f:
            java.lang.Object r0 = r15.f18285b
            com.google.android.gms.internal.ads.y6 r0 = (com.google.android.gms.internal.ads.y6) r0
            android.content.Context r0 = r0.f8584e
            android.content.Context r0 = e8.q7.c(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            b8.b r3 = b8.c.a(r0)     // Catch:{ NameNotFoundException -> 0x029b }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ NameNotFoundException -> 0x029b }
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x029b }
            r5 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r3.b(r0, r5)     // Catch:{ NameNotFoundException -> 0x029b }
            java.lang.String[] r3 = r0.requestedPermissions
            if (r3 == 0) goto L_0x029b
            int[] r3 = r0.requestedPermissionsFlags
            if (r3 != 0) goto L_0x0287
            goto L_0x029b
        L_0x0287:
            java.lang.String[] r3 = r0.requestedPermissions
            int r5 = r3.length
            if (r2 >= r5) goto L_0x029b
            int[] r5 = r0.requestedPermissionsFlags
            r5 = r5[r2]
            r5 = r5 & r4
            if (r5 == 0) goto L_0x0298
            r3 = r3[r2]
            r1.add(r3)
        L_0x0298:
            int r2 = r2 + 1
            goto L_0x0287
        L_0x029b:
            return r1
        L_0x029c:
            java.lang.Object r0 = r15.f18285b
            android.net.Uri r0 = (android.net.Uri) r0
            d7.l r1 = d7.l.B
            com.google.android.gms.ads.internal.util.p r1 = r1.f13186c
            java.util.Map r0 = com.google.android.gms.ads.internal.util.p.C(r0)
            return r0
        L_0x02a9:
            java.lang.Object r0 = r15.f18285b
            ab.r r0 = (ab.r) r0
            java.net.URL r1 = r0.f240a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 22
            r6.<init>(r5)
            java.lang.String r5 = "Starting download of: "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r5 = "FirebaseMessaging"
            android.util.Log.i(r5, r1)
            java.net.URL r1 = r0.f240a
            java.net.URLConnection r1 = r1.openConnection()
            int r6 = r1.getContentLength()
            r7 = 1048576(0x100000, float:1.469368E-39)
            if (r6 > r7) goto L_0x03de
            java.io.InputStream r1 = r1.getInputStream()
            r0.f242c = r1     // Catch:{ all -> 0x03d0 }
            int r6 = j8.m.f19671a     // Catch:{ all -> 0x03d0 }
            j8.l r6 = new j8.l     // Catch:{ all -> 0x03d0 }
            r6.<init>(r1)     // Catch:{ all -> 0x03d0 }
            java.util.ArrayDeque r8 = new java.util.ArrayDeque     // Catch:{ all -> 0x03d0 }
            r9 = 20
            r8.<init>(r9)     // Catch:{ all -> 0x03d0 }
            r9 = 8192(0x2000, float:1.14794E-41)
            r10 = 0
        L_0x02f4:
            r11 = 2147483639(0x7ffffff7, float:NaN)
            if (r10 >= r11) goto L_0x032f
            int r11 = r11 - r10
            int r11 = java.lang.Math.min(r9, r11)     // Catch:{ all -> 0x03d0 }
            byte[] r12 = new byte[r11]     // Catch:{ all -> 0x03d0 }
            r8.add(r12)     // Catch:{ all -> 0x03d0 }
            r13 = 0
        L_0x0304:
            if (r13 >= r11) goto L_0x0316
            int r14 = r11 - r13
            int r14 = r6.read(r12, r13, r14)     // Catch:{ all -> 0x03d0 }
            if (r14 != r3) goto L_0x0313
            byte[] r3 = j8.m.a(r8, r10)     // Catch:{ all -> 0x03d0 }
            goto L_0x0339
        L_0x0313:
            int r13 = r13 + r14
            int r10 = r10 + r14
            goto L_0x0304
        L_0x0316:
            long r11 = (long) r9     // Catch:{ all -> 0x03d0 }
            long r11 = r11 + r11
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0323
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02f4
        L_0x0323:
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x032d
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x02f4
        L_0x032d:
            int r9 = (int) r11     // Catch:{ all -> 0x03d0 }
            goto L_0x02f4
        L_0x032f:
            int r6 = r6.read()     // Catch:{ all -> 0x03d0 }
            if (r6 != r3) goto L_0x03c8
            byte[] r3 = j8.m.a(r8, r11)     // Catch:{ all -> 0x03d0 }
        L_0x0339:
            r1.close()
            boolean r1 = android.util.Log.isLoggable(r5, r4)
            if (r1 == 0) goto L_0x036b
            java.net.URL r1 = r0.f240a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 34
            r6.<init>(r4)
            java.lang.String r4 = "Downloaded "
            r6.append(r4)
            int r4 = r3.length
            r6.append(r4)
            java.lang.String r4 = " bytes from "
            r6.append(r4)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            android.util.Log.v(r5, r1)
        L_0x036b:
            int r1 = r3.length
            if (r1 > r7) goto L_0x03c0
            int r1 = r3.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r2, r1)
            if (r1 == 0) goto L_0x039d
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r5, r2)
            if (r2 == 0) goto L_0x039c
            java.net.URL r0 = r0.f240a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 31
            r3.<init>(r2)
            java.lang.String r2 = "Successfully downloaded image: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.d(r5, r0)
        L_0x039c:
            return r1
        L_0x039d:
            java.io.IOException r1 = new java.io.IOException
            java.net.URL r0 = r0.f240a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 24
            r3.<init>(r2)
            java.lang.String r2 = "Failed to decode image: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x03c0:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Image exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        L_0x03c8:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x03d0 }
            java.lang.String r2 = "input is too large to fit in a byte array"
            r0.<init>(r2)     // Catch:{ all -> 0x03d0 }
            throw r0     // Catch:{ all -> 0x03d0 }
        L_0x03d0:
            r0 = move-exception
            if (r1 == 0) goto L_0x03dd
            r1.close()     // Catch:{ all -> 0x03d7 }
            goto L_0x03dd
        L_0x03d7:
            r1 = move-exception
            j8.o r2 = j8.t.f19675a
            r2.a(r0, r1)
        L_0x03dd:
            throw r0
        L_0x03de:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Content-Length exceeds max size of 1048576"
            r0.<init>(r1)
            goto L_0x03e7
        L_0x03e6:
            throw r0
        L_0x03e7:
            goto L_0x03e6
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.h0.call():java.lang.Object");
    }

    public h0(Context context) {
        this.f18285b = context;
    }

    public h0(Uri uri) {
        this.f18285b = uri;
    }

    public h0(CookieManager cookieManager) {
        this.f18285b = cookieManager;
    }

    public h0(y6 y6Var) {
        this.f18285b = y6Var;
    }

    public h0(yq yqVar) {
        this.f18285b = yqVar;
    }

    public h0(dt dtVar) {
        this.f18285b = dtVar;
    }

    public h0(fw fwVar) {
        this.f18285b = fwVar;
    }

    public h0(ow owVar) {
        this.f18285b = owVar;
    }

    public h0(ow owVar, e eVar) {
        this.f18285b = owVar;
    }

    public h0(ow owVar, f fVar) {
        this.f18285b = owVar;
    }

    public h0(tw twVar) {
        this.f18285b = twVar;
    }

    public h0(vw vwVar) {
        this.f18285b = vwVar;
    }

    public h0(jx jxVar) {
        this.f18285b = jxVar;
    }
}
