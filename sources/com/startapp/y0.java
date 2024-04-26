package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import androidx.activity.e;
import androidx.activity.result.d;
import com.startapp.c2;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Sta */
public abstract class y0 {

    /* renamed from: g0  reason: collision with root package name */
    public static final Collection<Integer> f12836g0;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K = "android";
    public int L;
    public int M;
    public float N;
    public Boolean O;
    public int P = 3;
    public String Q;
    public String R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public String X;
    public String Y;
    public final int Z;

    /* renamed from: a  reason: collision with root package name */
    public String f12837a;

    /* renamed from: a0  reason: collision with root package name */
    public Long f12838a0;

    /* renamed from: b  reason: collision with root package name */
    public String f12839b;

    /* renamed from: b0  reason: collision with root package name */
    public Integer f12840b0;

    /* renamed from: c  reason: collision with root package name */
    public String f12841c = "4.10.5";

    /* renamed from: c0  reason: collision with root package name */
    public Boolean f12842c0;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f12843d = new TreeMap();

    /* renamed from: d0  reason: collision with root package name */
    public Boolean f12844d0;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, ?> f12845e;

    /* renamed from: e0  reason: collision with root package name */
    public Boolean f12846e0;

    /* renamed from: f  reason: collision with root package name */
    public String f12847f;

    /* renamed from: f0  reason: collision with root package name */
    public Boolean f12848f0;

    /* renamed from: g  reason: collision with root package name */
    public t f12849g;

    /* renamed from: h  reason: collision with root package name */
    public String f12850h;

    /* renamed from: i  reason: collision with root package name */
    public String f12851i;

    /* renamed from: j  reason: collision with root package name */
    public String f12852j;

    /* renamed from: k  reason: collision with root package name */
    public String f12853k;

    /* renamed from: l  reason: collision with root package name */
    public String f12854l;

    /* renamed from: m  reason: collision with root package name */
    public String f12855m;

    /* renamed from: n  reason: collision with root package name */
    public String f12856n;

    /* renamed from: o  reason: collision with root package name */
    public String f12857o;

    /* renamed from: p  reason: collision with root package name */
    public String f12858p;

    /* renamed from: q  reason: collision with root package name */
    public Boolean f12859q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f12860r;

    /* renamed from: s  reason: collision with root package name */
    public String f12861s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12862t;

    /* renamed from: u  reason: collision with root package name */
    public int f12863u;

    /* renamed from: v  reason: collision with root package name */
    public String f12864v;

    /* renamed from: w  reason: collision with root package name */
    public String f12865w;

    /* renamed from: x  reason: collision with root package name */
    public String f12866x;

    /* renamed from: y  reason: collision with root package name */
    public String f12867y;

    /* renamed from: z  reason: collision with root package name */
    public String f12868z;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            arrayList.add(23);
        }
        if (i10 >= 26) {
            arrayList.add(22);
        }
        if (i10 >= 23) {
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(7);
            arrayList.add(8);
        }
        f12836g0 = Collections.unmodifiableCollection(arrayList);
    }

    public y0(int i10) {
        new HashMap();
        this.Z = i10;
    }

    public void a(String str) {
        this.Y = str;
    }

    public boolean a() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r0 = r0.getActiveNetworkInfo();
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c A[SYNTHETIC, Splitter:B:41:0x010c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r5, com.startapp.sdk.adsbase.model.AdPreferences r6) {
        /*
            r4 = this;
            com.startapp.t9 r0 = com.startapp.t9.f12617d
            java.lang.String r0 = r0.f12618a
            r4.Q = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r4.f12854l = r0
            java.lang.String r0 = android.os.Build.MODEL
            r4.f12853k = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r4.f12855m = r0
            if (r6 == 0) goto L_0x001e
            java.lang.String r6 = r6.getAge(r5)
            r4.f12847f = r6
        L_0x001e:
            com.startapp.sdk.components.ComponentLocator r6 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r5)
            com.startapp.y1<com.startapp.ga> r6 = r6.f12473o
            java.lang.Object r6 = r6.b()
            com.startapp.ga r6 = (com.startapp.ga) r6
            java.lang.Object r6 = r6.b()
            com.startapp.fa r6 = (com.startapp.fa) r6
            java.lang.String r6 = r6.f10386a
            r4.f12851i = r6
            int r6 = com.startapp.a0.f10005a
            r6 = 0
            r0 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x0047 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r1.versionName     // Catch:{ all -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r1 = r6
        L_0x0048:
            r4.R = r1
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x0059 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0059 }
            int r1 = r1.versionCode     // Catch:{ all -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r4.S = r1
            boolean r1 = com.startapp.a0.b((android.content.Context) r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.f12859q = r1
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "adb_enabled"
            int r1 = android.provider.Settings.Global.getInt(r1, r2, r0)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0074
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            r4.T = r1
            boolean r0 = com.startapp.q8.a(r5)     // Catch:{ all -> 0x007c }
            goto L_0x007d
        L_0x007c:
        L_0x007d:
            r4.U = r0
            boolean r0 = com.startapp.a0.c(r5)
            r4.V = r0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L_0x00ac
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.startapp.a0.a((android.content.Context) r5, (java.lang.String) r1)
            if (r1 == 0) goto L_0x00ac
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x00ac
            boolean r1 = r0.isConnected()
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r0.isRoaming()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x00ad
        L_0x00ac:
            r0 = r6
        L_0x00ad:
            r4.f12860r = r0
            boolean r0 = com.startapp.wb.f((android.content.Context) r5)
            r4.W = r0
            android.content.res.Resources r0 = r5.getResources()
            if (r0 == 0) goto L_0x00cd
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L_0x00cd
            int r1 = r0.widthPixels
            r4.L = r1
            int r1 = r0.heightPixels
            r4.M = r1
            float r0 = r0.density
            r4.N = r0
        L_0x00cd:
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r5)
            com.startapp.c6 r1 = r0.n()
            java.lang.Object r1 = r1.b()
            com.startapp.b6 r1 = (com.startapp.b6) r1
            java.lang.String r2 = r1.f10137a
            r4.f12856n = r2
            java.lang.String r1 = r1.f10138b
            r4.f12857o = r1
            com.startapp.y1<com.startapp.x4> r1 = r0.f12462d
            java.lang.Object r1 = r1.b()
            com.startapp.x4 r1 = (com.startapp.x4) r1
            java.lang.Object r1 = r1.b()
            com.startapp.w4 r1 = (com.startapp.w4) r1
            java.lang.String r1 = r1.f12742a
            r4.f12858p = r1
            com.startapp.sdk.adsbase.e r0 = r0.d()
            java.lang.String r1 = "USER_CONSENT_PERSONALIZED_ADS_SERVING"
            java.lang.String r1 = r0.getString(r1, r6)
            r4.X = r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.f12843d
            java.lang.String r2 = "sharedPrefsWrappers"
            java.lang.String r6 = r0.getString(r2, r6)
            if (r6 != 0) goto L_0x010c
            goto L_0x012b
        L_0x010c:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x012b }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x012b }
            java.util.Iterator r6 = r0.keys()     // Catch:{ JSONException -> 0x012b }
        L_0x0115:
            boolean r2 = r6.hasNext()     // Catch:{ JSONException -> 0x012b }
            if (r2 == 0) goto L_0x012b
            java.lang.Object r2 = r6.next()     // Catch:{ JSONException -> 0x012b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x012b }
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x012b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x012b }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x012b }
            goto L_0x0115
        L_0x012b:
            boolean r5 = com.startapp.wb.e((android.content.Context) r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.O = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.y0.b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public void c(Context context) {
        if (!(this.f12839b != null)) {
            c0 c10 = ComponentLocator.a(context).c();
            String str = c10.f10223c;
            if (str == null) {
                synchronized (c10.f10221a) {
                    str = c10.f10223c;
                    if (str == null) {
                        str = c10.f10222b.getString("c88d4eab540fab77", (String) null);
                    }
                }
            }
            this.f12837a = str;
            String str2 = c10.f10224d;
            if (str2 == null) {
                synchronized (c10.f10221a) {
                    str2 = c10.f10224d;
                    if (str2 == null && (str2 = c10.f10222b.getString("2696a7f502faed4b", (String) null)) == null) {
                        str2 = c10.f10222b.getString("31721150b470a3b9", (String) null);
                    }
                }
            }
            this.f12839b = str2;
        }
        this.f12850h = context.getPackageName();
    }

    public void d(Context context) {
        NetworkCapabilities networkCapabilities;
        String str = "e105";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                str = "e100";
            } else if (a0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (!(activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null)) {
                        if (!networkCapabilities.hasTransport(1)) {
                            if (networkCapabilities.hasTransport(0)) {
                                str = o7.a(context);
                            }
                        }
                    }
                    str = "e102";
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        if (typeName.toLowerCase().compareTo("WIFI".toLowerCase()) != 0) {
                            if (typeName.toLowerCase().compareTo("MOBILE".toLowerCase()) == 0) {
                                str = o7.a(context);
                            }
                        }
                    }
                    str = "e102";
                }
                str = "WIFI";
            }
        } catch (Exception unused) {
        }
        this.f12861s = str;
        String str2 = ComponentLocator.a(context).u().f11712h;
        this.H = str2;
        this.f12864v = str2;
        c2 e10 = ComponentLocator.a(context).e();
        e10.getClass();
        int i10 = -1;
        try {
            c2.a aVar = e10.f10232e;
            if (aVar != null) {
                i10 = aVar.a();
            }
        } catch (Throwable th) {
            i4.a(th);
        }
        this.f12863u = i10;
    }

    public void e(Context context) {
        na naVar = (na) ComponentLocator.a(context).t().b();
        if (naVar.a(7) == 5) {
            this.f12865w = naVar.b(8);
            this.f12866x = naVar.b(9);
            this.f12867y = naVar.b(15);
            this.f12868z = naVar.b(16);
        }
        int a10 = naVar.a(10);
        if (!(a10 == 0 || a10 == 2)) {
            this.A = naVar.b(11);
            this.B = naVar.b(12);
        }
        this.C = naVar.b(4);
        this.D = naVar.b(3);
        this.E = naVar.b(5);
        boolean z10 = true;
        this.F = naVar.b(1);
        this.G = naVar.b(2);
        this.I = naVar.b(13);
        if (naVar.a(14) != 1) {
            z10 = false;
        }
        this.f12862t = z10;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r1, com.startapp.sdk.adsbase.model.AdPreferences r2) {
        /*
            r0 = this;
            r0.c(r1)
            r0.b(r1, r2)     // Catch:{ all -> 0x0006 }
        L_0x0006:
            r0.d(r1)     // Catch:{ all -> 0x000a }
            goto L_0x000e
        L_0x000a:
            r2 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r2)
        L_0x000e:
            r0.e(r1)     // Catch:{ all -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            r2 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r2)
        L_0x0016:
            com.startapp.sdk.components.ComponentLocator r2 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r1)     // Catch:{ all -> 0x0025 }
            com.startapp.x8 r2 = r2.q()     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r2.a((java.lang.Object) r0)     // Catch:{ all -> 0x0025 }
            r0.J = r2     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r2 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r2)
        L_0x0029:
            r0.a((android.content.Context) r1)     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r2 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r2)
        L_0x0031:
            r0.b(r1)     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r1 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r1)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.y0.a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public void a(m8 m8Var) throws SDKException {
        Map<String, ?> map = this.f12845e;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                m8Var.a((String) next.getKey(), next.getValue(), false, true);
            }
        }
        m8Var.a("publisherId", (Object) this.f12837a, false, true);
        m8Var.a("productId", (Object) this.f12839b, a(), true);
        m8Var.a("os", (Object) this.K, true, true);
        m8Var.a("sdkVersion", (Object) this.f12841c, false, true);
        m8Var.a("flavor", (Object) 1023, false, true);
        Map<String, String> map2 = this.f12843d;
        if (map2 != null && !map2.isEmpty()) {
            String str = "";
            for (String next2 : this.f12843d.keySet()) {
                str = e.a(d.a(str, next2, ":"), this.f12843d.get(next2), ";");
            }
            m8Var.a("frameworksData", (Object) str.substring(0, str.length() - 1), false, false);
        }
        m8Var.a("packageId", (Object) this.f12850h, false, true);
        m8Var.a("installerPkg", (Object) this.f12851i, false, true);
        m8Var.a("age", (Object) this.f12847f, false, true);
        t tVar = this.f12849g;
        if (tVar != null) {
            m8Var.a("userAdvertisingId", (Object) tVar.f12591a, false, true);
            boolean z10 = this.f12849g.f12593c;
            if (z10) {
                m8Var.a("limat", (Object) Boolean.valueOf(z10), false, true);
            }
            m8Var.a("advertisingIdSource", (Object) this.f12849g.f12592b, false, true);
        }
        String str2 = this.f12852j;
        if (str2 != null) {
            m8Var.a("duid", (Object) str2, false, true);
        }
        m8Var.a("model", (Object) this.f12853k, false, true);
        m8Var.a("manufacturer", (Object) this.f12854l, false, true);
        m8Var.a("deviceVersion", (Object) this.f12855m, false, true);
        m8Var.a("locale", (Object) this.f12856n, false, true);
        m8Var.a("localeList", (Object) this.f12857o, false, true);
        m8Var.a("inputLangs", (Object) this.f12858p, false, true);
        m8Var.a("isp", (Object) this.f12865w, false, true);
        m8Var.a("ispName", (Object) this.f12866x, false, true);
        m8Var.a("ispCarrId", (Object) this.f12867y, false, true);
        m8Var.a("ispCarrIdName", (Object) this.f12868z, false, true);
        m8Var.a("netOper", (Object) this.A, false, true);
        m8Var.a("networkOperName", (Object) this.B, false, true);
        m8Var.a("cid", (Object) this.C, false, true);
        m8Var.a("lac", (Object) this.D, false, true);
        m8Var.a("tac", (Object) this.E, false, true);
        m8Var.a("blat", (Object) this.F, false, true);
        m8Var.a("blon", (Object) this.G, false, true);
        m8Var.a("subPublisherId", (Object) null, false, true);
        m8Var.a("subProductId", (Object) null, false, true);
        m8Var.a("retryCount", (Object) null, false, true);
        m8Var.a("roaming", (Object) this.f12860r, false, true);
        m8Var.a("grid", (Object) this.f12861s, false, true);
        if (this.f12862t) {
            m8Var.a("c5g", (Object) "1", false, false);
        }
        int i10 = this.f12863u;
        if (i10 >= 0) {
            m8Var.a("transport", (Object) String.valueOf(i10), false, false);
        }
        m8Var.a("silev", (Object) this.f12864v, false, true);
        m8Var.a("cellSignalLevel", (Object) this.H, false, true);
        m8Var.a("cellTimingAdv", (Object) this.I, false, true);
        m8Var.a("outsource", (Object) this.f12859q, false, true);
        m8Var.a("width", (Object) String.valueOf(this.L), false, true);
        m8Var.a("height", (Object) String.valueOf(this.M), false, true);
        m8Var.a("density", (Object) String.valueOf(this.N), false, true);
        m8Var.a("fgApp", (Object) this.O, false, true);
        m8Var.a("sdkId", (Object) String.valueOf(this.P), true, true);
        m8Var.a("clientSessionId", (Object) this.Q, false, true);
        m8Var.a("appVersion", (Object) this.R, false, true);
        m8Var.a("appCode", (Object) Integer.valueOf(this.S), false, true);
        m8Var.a("timeSinceBoot", (Object) Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        m8Var.a("udbg", (Object) Boolean.valueOf(this.T), false, true);
        m8Var.a("root", (Object) Boolean.valueOf(this.U), false, true);
        m8Var.a("smltr", (Object) Boolean.valueOf(this.V), false, true);
        m8Var.a("isddbg", (Object) Boolean.valueOf(this.W), false, true);
        m8Var.a("pas", (Object) this.X, false, true);
        m8Var.a("prm", (Object) this.Y, false, false);
        m8Var.a("free", (Object) this.f12838a0, false, false);
        m8Var.a("chr", (Object) this.f12842c0, false, false);
        m8Var.a("blp", (Object) this.f12840b0, false, false);
        m8Var.a("hs", (Object) this.f12844d0, false, false);
        m8Var.a("lpm", (Object) this.f12846e0, false, false);
        m8Var.a("dm", (Object) this.f12848f0, false, false);
        m8Var.a("rsc", (Object) this.J, false, true);
    }

    public void b(Context context) {
        boolean z10;
        try {
            this.f12838a0 = null;
            if (Build.VERSION.SDK_INT >= 18) {
                this.f12838a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
            }
        } catch (Throwable th) {
            i4.a(th);
        }
        boolean z11 = true;
        try {
            this.f12842c0 = null;
            this.f12840b0 = null;
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra("status")) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    if (intExtra != 2) {
                        if (intExtra != 5) {
                            z10 = false;
                            this.f12842c0 = Boolean.valueOf(z10);
                        }
                    }
                    z10 = true;
                    this.f12842c0 = Boolean.valueOf(z10);
                }
                if (registerReceiver.hasExtra("level") && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f12840b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            i4.a(th2);
        }
        try {
            this.f12844d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioManager audioManager = (AudioManager) systemService;
                if (Build.VERSION.SDK_INT >= 23) {
                    AudioDeviceInfo[] devices = audioManager.getDevices(2);
                    if (devices != null) {
                        int length = devices.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                AudioDeviceInfo audioDeviceInfo = devices[i10];
                                if (audioDeviceInfo != null && f12836g0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                                    break;
                                }
                                i10++;
                            } else {
                                break;
                            }
                        }
                        this.f12844d0 = Boolean.valueOf(z11);
                    }
                    z11 = false;
                    this.f12844d0 = Boolean.valueOf(z11);
                }
            }
        } catch (Throwable th3) {
            i4.a(th3);
        }
        try {
            this.f12846e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                PowerManager powerManager = (PowerManager) systemService2;
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f12846e0 = Boolean.valueOf(powerManager.isPowerSaveMode());
                }
            }
        } catch (Throwable th4) {
            i4.a(th4);
        }
        try {
            this.f12848f0 = null;
            int i11 = context.getResources().getConfiguration().uiMode & 48;
            if (i11 == 32) {
                this.f12848f0 = Boolean.TRUE;
            } else if (i11 == 16) {
                this.f12848f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            i4.a(th5);
        }
    }

    public void a(Context context) {
        if (!MetaData.f12393k.n()) {
            this.f12849g = ComponentLocator.a(context).a().a();
            try {
                this.f12852j = ComponentLocator.a(context).f12468j.b().a();
            } catch (Throwable th) {
                i4.a(th);
            }
            try {
                this.f12845e = ComponentLocator.a(context).E.b().getAll();
            } catch (Throwable th2) {
                i4.a(th2);
            }
        }
    }
}
