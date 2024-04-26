package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.Locale;
import org.json.JSONObject;
import t2.f0;
import t2.g0;

@SuppressLint({"ObsoleteSdkInt"})
public class w {

    /* renamed from: a  reason: collision with root package name */
    public String f4795a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f4796b;

    /* renamed from: c  reason: collision with root package name */
    public final g0 f4797c = new g0(0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f4798d;

    /* renamed from: e  reason: collision with root package name */
    public JSONObject f4799e = new JSONObject();

    /* renamed from: f  reason: collision with root package name */
    public String f4800f = "android";

    /* renamed from: g  reason: collision with root package name */
    public String f4801g = "android_native";

    /* renamed from: h  reason: collision with root package name */
    public String f4802h = "";

    public class a implements f0 {

        /* renamed from: com.adcolony.sdk.w$a$a  reason: collision with other inner class name */
        public class C0069a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f4804a;

            public C0069a(g gVar) {
                this.f4804a = gVar;
            }

            public void run() {
                try {
                    w.this.getClass();
                    new b(this.f4804a, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                } catch (RuntimeException unused) {
                    f.d().l().e(0, 0, "Error retrieving device info, disabling AdColony.", true);
                    a.e();
                } catch (StackOverflowError unused2) {
                    f.d().l().e(0, 0, "StackOverflowError on info AsyncTask execution, disabling AdColony", true);
                    a.e();
                }
            }
        }

        public a() {
        }

        public void a(g gVar) {
            j0.h(new C0069a(gVar));
        }
    }

    public static class b extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public g f4806a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4807b;

        public b(g gVar, boolean z10) {
            this.f4806a = gVar;
            this.f4807b = z10;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            return f.d().i().b(2000);
        }

        public void onPostExecute(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (this.f4807b) {
                new g("Device.update_info", 1, jSONObject).b();
            } else {
                this.f4806a.a(jSONObject).b();
            }
        }
    }

    public void a() {
        g0 g0Var = this.f4797c;
        synchronized (g0Var) {
            g0Var.f25480a = false;
        }
        f.c("Device.get_info", new a());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0304  */
    public org.json.JSONObject b(long r10) {
        /*
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.adcolony.sdk.o r1 = com.adcolony.sdk.f.d()
            java.lang.String r2 = r9.d()
            java.lang.String r3 = "carrier_name"
            com.adcolony.sdk.r0.e(r0, r3, r2)
            com.adcolony.sdk.o r2 = com.adcolony.sdk.f.d()
            com.adcolony.sdk.a0 r2 = r2.q()
            java.lang.String r2 = r2.f4420c
            java.lang.String r3 = "data_path"
            com.adcolony.sdk.r0.e(r0, r3, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "device_api"
            com.adcolony.sdk.r0.j(r0, r3, r2)
            int r2 = r9.h()
            java.lang.String r3 = "display_width"
            com.adcolony.sdk.r0.j(r0, r3, r2)
            int r2 = r9.g()
            java.lang.String r3 = "display_height"
            com.adcolony.sdk.r0.j(r0, r3, r2)
            int r2 = r9.h()
            java.lang.String r3 = "screen_width"
            com.adcolony.sdk.r0.j(r0, r3, r2)
            int r2 = r9.g()
            java.lang.String r3 = "screen_height"
            com.adcolony.sdk.r0.j(r0, r3, r2)
            android.content.Context r2 = com.adcolony.sdk.f.f4478a
            r3 = 0
            if (r2 != 0) goto L_0x0053
            r2 = 0
            goto L_0x006b
        L_0x0053:
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            java.lang.String r5 = "window"
            java.lang.Object r2 = r2.getSystemService(r5)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            if (r2 == 0) goto L_0x0069
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r4)
        L_0x0069:
            int r2 = r4.densityDpi
        L_0x006b:
            java.lang.String r4 = "display_dpi"
            com.adcolony.sdk.r0.j(r0, r4, r2)
            android.content.Context r2 = com.adcolony.sdk.f.f4478a
            r4 = 1
            if (r2 != 0) goto L_0x0076
            goto L_0x009c
        L_0x0076:
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r5 = r2.widthPixels
            float r5 = (float) r5
            float r6 = r2.xdpi
            float r5 = r5 / r6
            int r6 = r2.heightPixels
            float r6 = (float) r6
            float r2 = r2.ydpi
            float r6 = r6 / r2
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            double r5 = (double) r6
            double r5 = java.lang.Math.sqrt(r5)
            r7 = 4618441417868443648(0x4018000000000000, double:6.0)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x009c
            r2 = 1
            goto L_0x009d
        L_0x009c:
            r2 = 0
        L_0x009d:
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = "tablet"
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r2 = "phone"
        L_0x00a4:
            java.lang.String r5 = "device_type"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getLanguage()
            java.lang.String r5 = "locale_language_code"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getLanguage()
            java.lang.String r5 = "ln"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = r9.e()
            java.lang.String r5 = "locale_country_code"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = r9.e()
            java.lang.String r5 = "locale"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = ""
            java.lang.String r5 = "mac_address"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "manufacturer"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r5 = "device_brand"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            com.adcolony.sdk.o r2 = com.adcolony.sdk.f.d()
            com.adcolony.sdk.a0 r2 = r2.q()
            java.lang.String r2 = r2.f4419b
            java.lang.String r5 = "media_path"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            com.adcolony.sdk.o r2 = com.adcolony.sdk.f.d()
            com.adcolony.sdk.a0 r2 = r2.q()
            java.lang.String r2 = r2.f4421d
            java.lang.String r5 = "temp_storage_path"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            android.content.Context r2 = com.adcolony.sdk.f.f4478a
            if (r2 != 0) goto L_0x010b
            goto L_0x0115
        L_0x010b:
            java.lang.String r5 = "activity"
            java.lang.Object r2 = r2.getSystemService(r5)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            if (r2 != 0) goto L_0x0117
        L_0x0115:
            r2 = 0
            goto L_0x011b
        L_0x0117:
            int r2 = r2.getMemoryClass()
        L_0x011b:
            java.lang.String r5 = "memory_class"
            com.adcolony.sdk.r0.j(r0, r5, r2)
            java.lang.String r2 = "network_speed"
            r5 = 20
            com.adcolony.sdk.r0.j(r0, r2, r5)
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            long r5 = r2.totalMemory()
            long r7 = r2.freeMemory()
            long r5 = r5 - r7
            r2 = 1048576(0x100000, float:1.469368E-39)
            long r7 = (long) r2
            long r5 = r5 / r7
            java.lang.String r2 = "memory_used_mb"
            r0.put(r2, r5)     // Catch:{ JSONException -> 0x013e }
            goto L_0x016c
        L_0x013e:
            r2 = move-exception
            java.lang.String r7 = "JSON error in ADCJSON putLong(): "
            java.lang.StringBuilder r7 = android.support.v4.media.a.a(r7)
            java.lang.String r2 = r2.toString()
            r7.append(r2)
            java.lang.String r2 = " with key: memory_used_mb"
            r7.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = " and value: "
            r2.append(r8)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            p.f.a(r3, r3, r2, r4)
        L_0x016c:
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r5 = "model"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r5 = "device_model"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = r9.f4801g
            java.lang.String r5 = "sdk_type"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = "4.5.0"
            java.lang.String r5 = "sdk_version"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            com.adcolony.sdk.m r2 = r1.n()
            java.lang.String r2 = r2.a()
            java.lang.String r5 = "network_type"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "os_version"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = r9.f4800f
            java.lang.String r5 = "os_name"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = r9.f4800f
            java.lang.String r5 = "platform"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.lang.String r2 = "os.arch"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r5)
            java.lang.String r5 = "arch"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            p.g r2 = r1.o()
            java.lang.Object r2 = r2.f23743d
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r5 = "user_id"
            java.lang.String r2 = r2.optString(r5)
            java.lang.String r5 = "user_id"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            p.g r2 = r1.o()
            java.lang.Object r2 = r2.f23740a
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = "app_id"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.util.concurrent.ExecutorService r2 = com.adcolony.sdk.j0.f4565a
            android.content.Context r2 = com.adcolony.sdk.f.f4478a
            java.lang.String r5 = ""
            if (r2 != 0) goto L_0x01e2
            goto L_0x020b
        L_0x01e2:
            boolean r6 = r2 instanceof android.app.Application
            if (r6 == 0) goto L_0x01ea
            r6 = r2
            android.app.Application r6 = (android.app.Application) r6
            goto L_0x01f1
        L_0x01ea:
            r6 = r2
            android.app.Activity r6 = (android.app.Activity) r6
            android.app.Application r6 = r6.getApplication()
        L_0x01f1:
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x0206 }
            android.content.pm.ApplicationInfo r2 = r6.getApplicationInfo(r2, r3)     // Catch:{ Exception -> 0x0206 }
            java.lang.CharSequence r2 = r6.getApplicationLabel(r2)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r5 = r2.toString()
            goto L_0x020b
        L_0x0206:
            java.lang.String r2 = "Failed to retrieve application label."
            p.f.a(r3, r3, r2, r4)
        L_0x020b:
            java.lang.String r2 = "app_bundle_name"
            com.adcolony.sdk.r0.e(r0, r2, r5)
            java.lang.String r2 = com.adcolony.sdk.j0.o()
            java.lang.String r5 = "app_bundle_version"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            double r5 = r9.c()
            java.lang.String r2 = "battery_level"
            com.adcolony.sdk.r0.d(r0, r2, r5)
            android.content.Context r2 = com.adcolony.sdk.f.f4478a
            java.lang.String r5 = ""
            if (r2 != 0) goto L_0x0229
            goto L_0x0238
        L_0x0229:
            java.lang.String r6 = "phone"
            java.lang.Object r2 = r2.getSystemService(r6)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 != 0) goto L_0x0234
            goto L_0x0238
        L_0x0234:
            java.lang.String r5 = r2.getSimCountryIso()
        L_0x0238:
            java.lang.String r2 = "cell_service_country_code"
            com.adcolony.sdk.r0.e(r0, r2, r5)
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            java.lang.String r2 = r2.getID()
            java.lang.String r5 = "timezone_ietf"
            com.adcolony.sdk.r0.e(r0, r5, r2)
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            r5 = 15
            int r2 = r2.getOffset(r5)
            r5 = 60000(0xea60, float:8.4078E-41)
            int r2 = r2 / r5
            java.lang.String r6 = "timezone_gmt_m"
            com.adcolony.sdk.r0.j(r0, r6, r2)
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            boolean r6 = r2.inDaylightTime(r6)
            if (r6 != 0) goto L_0x026e
            r2 = 0
            goto L_0x0273
        L_0x026e:
            int r2 = r2.getDSTSavings()
            int r2 = r2 / r5
        L_0x0273:
            java.lang.String r5 = "timezone_dst_m"
            com.adcolony.sdk.r0.j(r0, r5, r2)
            org.json.JSONObject r2 = r9.f4799e
            java.lang.String r5 = "launch_metadata"
            com.adcolony.sdk.r0.g(r0, r5, r2)
            java.lang.String r1 = r1.f4681y
            java.lang.String r2 = "controller_version"
            com.adcolony.sdk.r0.e(r0, r2, r1)
            android.content.Context r1 = com.adcolony.sdk.f.f4478a
            r2 = 2
            if (r1 != 0) goto L_0x028c
            goto L_0x029e
        L_0x028c:
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 == r4) goto L_0x029d
            if (r1 == r2) goto L_0x029b
            goto L_0x029e
        L_0x029b:
            r2 = 1
            goto L_0x029e
        L_0x029d:
            r2 = 0
        L_0x029e:
            java.lang.String r1 = "current_orientation"
            com.adcolony.sdk.r0.j(r0, r1, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x02b6
            android.security.NetworkSecurityPolicy r2 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r2.isCleartextTrafficPermitted()
            if (r2 == 0) goto L_0x02b4
            goto L_0x02b6
        L_0x02b4:
            r2 = 0
            goto L_0x02b7
        L_0x02b6:
            r2 = 1
        L_0x02b7:
            java.lang.String r4 = "cleartext_permitted"
            com.adcolony.sdk.r0.k(r0, r4, r2)
            float r2 = r9.f()
            double r4 = (double) r2
            java.lang.String r2 = "density"
            com.adcolony.sdk.r0.d(r0, r2, r4)
            android.content.Context r2 = com.adcolony.sdk.f.f4478a
            if (r2 == 0) goto L_0x02e5
            r4 = 29
            if (r1 >= r4) goto L_0x02cf
            goto L_0x02e5
        L_0x02cf:
            android.content.res.Resources r1 = r2.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r2 = 16
            if (r1 == r2) goto L_0x02e5
            r2 = 32
            if (r1 == r2) goto L_0x02e4
            goto L_0x02e5
        L_0x02e4:
            r3 = 1
        L_0x02e5:
            java.lang.String r1 = "dark_mode"
            com.adcolony.sdk.r0.k(r0, r1, r3)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "com.android.vending"
            boolean r2 = com.adcolony.sdk.j0.p(r2)
            if (r2 == 0) goto L_0x02fc
            java.lang.String r2 = "google"
            r1.put(r2)
        L_0x02fc:
            java.lang.String r2 = "com.amazon.venezia"
            boolean r2 = com.adcolony.sdk.j0.p(r2)
            if (r2 == 0) goto L_0x0309
            java.lang.String r2 = "amazon"
            r1.put(r2)
        L_0x0309:
            java.lang.String r2 = "available_stores"
            com.adcolony.sdk.r0.f(r0, r2, r1)
            android.content.Context r1 = com.adcolony.sdk.f.f4478a
            org.json.JSONArray r1 = com.adcolony.sdk.j0.r(r1)
            java.lang.String r2 = "permissions"
            com.adcolony.sdk.r0.f(r0, r2, r1)
            t2.g0 r1 = r9.f4797c
            boolean r2 = r1.f25480a
            if (r2 != 0) goto L_0x0332
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0332
            monitor-enter(r1)
            boolean r2 = r1.f25480a     // Catch:{ all -> 0x032f }
            if (r2 != 0) goto L_0x032d
            r1.wait(r10)     // Catch:{ InterruptedException -> 0x032d }
        L_0x032d:
            monitor-exit(r1)
            goto L_0x0332
        L_0x032f:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        L_0x0332:
            java.lang.String r10 = r9.f4795a
            java.lang.String r11 = "advertiser_id"
            com.adcolony.sdk.r0.e(r0, r11, r10)
            boolean r10 = r9.f4798d
            java.lang.String r11 = "limit_tracking"
            com.adcolony.sdk.r0.k(r0, r11, r10)
            java.lang.String r10 = r9.f4795a
            if (r10 == 0) goto L_0x034c
            java.lang.String r11 = ""
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0366
        L_0x034c:
            android.content.Context r10 = com.adcolony.sdk.f.f4478a
            if (r10 != 0) goto L_0x0353
            java.lang.String r10 = ""
            goto L_0x035d
        L_0x0353:
            android.content.ContentResolver r10 = r10.getContentResolver()
            java.lang.String r11 = "android_id"
            java.lang.String r10 = android.provider.Settings.Secure.getString(r10, r11)
        L_0x035d:
            java.lang.String r10 = com.adcolony.sdk.j0.m(r10)
            java.lang.String r11 = "android_id_sha1"
            com.adcolony.sdk.r0.e(r0, r11, r10)
        L_0x0366:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.w.b(long):org.json.JSONObject");
    }

    public double c() {
        Context context = f.f4478a;
        if (context == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            double d10 = (double) intExtra;
            double d11 = (double) intExtra2;
            Double.isNaN(d10);
            Double.isNaN(d11);
            return d10 / d11;
        } catch (IllegalArgumentException unused) {
            return 0.0d;
        }
    }

    public String d() {
        Context context = f.f4478a;
        String str = "";
        if (context == null) {
            return str;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        }
        return str.length() == 0 ? "unknown" : str;
    }

    public String e() {
        return Locale.getDefault().getCountry();
    }

    public float f() {
        Context context = f.f4478a;
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public int g() {
        Context context = f.f4478a;
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public int h() {
        Context context = f.f4478a;
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }
}
