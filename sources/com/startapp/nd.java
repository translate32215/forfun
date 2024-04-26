package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.enums.WifiStates;
import java.lang.reflect.Method;

/* compiled from: Sta */
public class nd {

    /* renamed from: h  reason: collision with root package name */
    private static final String f10911h = "nd";

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f10912i = false;

    /* renamed from: j  reason: collision with root package name */
    public static final int f10913j = -1;

    /* renamed from: a  reason: collision with root package name */
    private WifiStates f10914a;

    /* renamed from: b  reason: collision with root package name */
    private ConnectivityManager f10915b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10916c = false;

    /* renamed from: d  reason: collision with root package name */
    private Context f10917d;

    /* renamed from: e  reason: collision with root package name */
    private String f10918e = "";

    /* renamed from: f  reason: collision with root package name */
    private boolean f10919f;

    /* renamed from: g  reason: collision with root package name */
    private Method f10920g;

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10921a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.AnonymizationLevel[] r0 = com.startapp.networkTest.enums.AnonymizationLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10921a = r0
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Full     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10921a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Anonymized     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10921a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.None     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.nd.a.<clinit>():void");
        }
    }

    public nd(Context context) {
        this.f10917d = context.getApplicationContext();
        this.f10915b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10914a = WifiStates.Unknown;
        a();
    }

    private String a(String str) {
        int i10;
        if (str.length() == 0 || (i10 = a.f10921a[a5.b().WIFIINFO_BSSID_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i10 != 2) {
            return "";
        }
        if (str.length() != 17) {
            return "xx:xx:xx:xx:xx:xx";
        }
        return str.substring(0, 9) + "xx:xx:xx";
    }

    private void a() {
    }

    private String b(String str) {
        return (str.length() == 0 || a.f10921a[a5.b().WIFIINFO_SSID_RECORDTYPE().ordinal()] == 1) ? str : "";
    }

    public WifiInfo c() {
        WifiInfo wifiInfo = new WifiInfo();
        wifiInfo.MissingPermission = true;
        try {
            this.f10917d.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE");
            return wifiInfo;
        } catch (Throwable th) {
            x2.a(th);
            return wifiInfo;
        }
    }

    public long d() {
        if (this.f10918e.length() == 0) {
            c();
        }
        if (this.f10918e.length() == 0) {
            return -1;
        }
        return eb.a(this.f10918e);
    }

    public long e() {
        String str = this.f10918e;
        if (str == null || str.length() == 0) {
            c();
        }
        String str2 = this.f10918e;
        if (str2 == null || str2.length() == 0) {
            return -1;
        }
        return eb.b(this.f10918e);
    }

    public void f() {
    }

    public void g() {
    }

    private int[] b() {
        int[] iArr = {-1, 0};
        if (this.f10919f) {
            return iArr;
        }
        String[] a10 = v9.a("/proc/net/wireless");
        if (a10.length == 0) {
            this.f10919f = true;
            return iArr;
        }
        if (a10.length > 2) {
            int i10 = 2;
            while (i10 < a10.length) {
                String[] a11 = la.a(a10[i10].trim().split(" "));
                if (a11.length <= 4 || !a11[0].equals("wlan0:")) {
                    i10++;
                } else {
                    try {
                        return new int[]{Integer.parseInt(a11[2].replace(".", "")), Integer.parseInt(a11[3].replace(".", ""))};
                    } catch (NumberFormatException unused) {
                        return iArr;
                    }
                }
            }
        }
        return iArr;
    }
}
