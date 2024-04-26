package e8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.y6;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class g7 {
    public int A;
    public String B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public int f14710a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14711b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14712c;

    /* renamed from: d  reason: collision with root package name */
    public int f14713d;

    /* renamed from: e  reason: collision with root package name */
    public int f14714e;

    /* renamed from: f  reason: collision with root package name */
    public int f14715f;

    /* renamed from: g  reason: collision with root package name */
    public String f14716g;

    /* renamed from: h  reason: collision with root package name */
    public int f14717h;

    /* renamed from: i  reason: collision with root package name */
    public int f14718i;

    /* renamed from: j  reason: collision with root package name */
    public int f14719j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14720k;

    /* renamed from: l  reason: collision with root package name */
    public int f14721l;

    /* renamed from: m  reason: collision with root package name */
    public double f14722m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14723n;

    /* renamed from: o  reason: collision with root package name */
    public String f14724o;

    /* renamed from: p  reason: collision with root package name */
    public String f14725p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14726q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f14727r;

    /* renamed from: s  reason: collision with root package name */
    public String f14728s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14729t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f14730u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f14731v;

    /* renamed from: w  reason: collision with root package name */
    public String f14732w;

    /* renamed from: x  reason: collision with root package name */
    public String f14733x;

    /* renamed from: y  reason: collision with root package name */
    public float f14734y;

    /* renamed from: z  reason: collision with root package name */
    public int f14735z;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6 A[Catch:{ Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g7(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r6.b(r7)
            r6.c(r7)
            r6.d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = a(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r6.f14726q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = a(r0, r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r6.f14727r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f14728s = r2
            e8.ti0 r2 = e8.ti0.f16763j
            e8.y8 r2 = r2.f16764a
            boolean r2 = e8.y8.k()
            r6.f14729t = r2
            boolean r2 = z7.f.a(r7)
            r6.f14730u = r2
            boolean r2 = z7.f.d(r7)
            r6.f14731v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f14732w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = a(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L_0x005d
            goto L_0x008f
        L_0x005d:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L_0x0062
            goto L_0x008f
        L_0x0062:
            b8.b r3 = b8.c.a(r7)     // Catch:{ NameNotFoundException -> 0x008f }
            java.lang.String r5 = r0.packageName     // Catch:{ NameNotFoundException -> 0x008f }
            android.content.pm.PackageInfo r3 = r3.b(r5, r4)     // Catch:{ NameNotFoundException -> 0x008f }
            if (r3 == 0) goto L_0x008f
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x008f }
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x008f }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x008f }
            int r4 = r4.length()     // Catch:{ NameNotFoundException -> 0x008f }
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x008f }
            r5.<init>(r4)     // Catch:{ NameNotFoundException -> 0x008f }
            r5.append(r3)     // Catch:{ NameNotFoundException -> 0x008f }
            r5.append(r1)     // Catch:{ NameNotFoundException -> 0x008f }
            r5.append(r0)     // Catch:{ NameNotFoundException -> 0x008f }
            java.lang.String r0 = r5.toString()     // Catch:{ NameNotFoundException -> 0x008f }
            goto L_0x0090
        L_0x008f:
            r0 = r2
        L_0x0090:
            r6.f14733x = r0
            b8.b r0 = b8.c.a(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.Context r0 = r0.f3657a     // Catch:{ Exception -> 0x00c7 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x00c7 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00c8
            int r3 = r0.versionCode     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00c7 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00c7 }
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c7 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00c7 }
            r5.append(r3)     // Catch:{ Exception -> 0x00c7 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c7 }
            r5.append(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c8
        L_0x00c7:
        L_0x00c8:
            r6.B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto L_0x00d1
            return
        L_0x00d1:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto L_0x00d8
            return
        L_0x00d8:
            float r0 = r7.density
            r6.f14734y = r0
            int r0 = r7.widthPixels
            r6.f14735z = r0
            int r7 = r7.heightPixels
            r6.A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.g7.<init>(android.content.Context):void");
    }

    public static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f14710a = audioManager.getMode();
                this.f14711b = audioManager.isMusicActive();
                this.f14712c = audioManager.isSpeakerphoneOn();
                this.f14713d = audioManager.getStreamVolume(3);
                this.f14714e = audioManager.getRingerMode();
                this.f14715f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                y6 y6Var = l.B.f13190g;
                a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f14710a = -2;
        this.f14711b = false;
        this.f14712c = false;
        this.f14713d = 0;
        this.f14714e = 2;
        this.f14715f = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0051  */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f14716g = r2
            boolean r2 = z7.h.f()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            e8.l<java.lang.Boolean> r2 = e8.t.G4
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0031
            r2 = 0
            goto L_0x0035
        L_0x0031:
            int r2 = r0.getNetworkType()
        L_0x0035:
            r5.f14718i = r2
            int r0 = r0.getPhoneType()
            r5.f14719j = r0
            r0 = -2
            r5.f14717h = r0
            r5.f14720k = r3
            r0 = -1
            r5.f14721l = r0
            d7.l r2 = d7.l.B
            com.google.android.gms.ads.internal.util.p r2 = r2.f13186c
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.p.G(r6, r2)
            if (r6 == 0) goto L_0x0070
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L_0x0068
            int r0 = r6.getType()
            r5.f14717h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f14721l = r6
            goto L_0x006a
        L_0x0068:
            r5.f14717h = r0
        L_0x006a:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f14720k = r6
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.g7.c(android.content.Context):void");
    }

    public final void d(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f14722m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z10 = true;
            }
            this.f14723n = z10;
            return;
        }
        this.f14722m = -1.0d;
        this.f14723n = false;
    }

    public final h7 e() {
        return new h7(this.f14710a, this.f14726q, this.f14727r, this.f14716g, this.f14728s, this.f14729t, this.f14730u, this.f14731v, this.f14711b, this.f14712c, this.f14732w, this.f14733x, this.B, this.f14713d, this.f14717h, this.f14718i, this.f14719j, this.f14714e, this.f14715f, this.f14734y, this.f14735z, this.A, this.f14722m, this.f14723n, this.f14720k, this.f14721l, this.f14724o, this.C, this.f14725p);
    }

    public g7(Context context, h7 h7Var) {
        b(context);
        c(context);
        d(context);
        this.f14724o = Build.FINGERPRINT;
        this.f14725p = Build.DEVICE;
        this.C = p.c(context);
        this.f14726q = h7Var.f14864a;
        this.f14727r = h7Var.f14865b;
        this.f14728s = h7Var.f14866c;
        this.f14729t = h7Var.f14867d;
        this.f14730u = h7Var.f14868e;
        this.f14731v = h7Var.f14869f;
        this.f14732w = h7Var.f14870g;
        this.f14733x = h7Var.f14871h;
        this.B = h7Var.f14872i;
        this.f14734y = h7Var.f14875l;
        this.f14735z = h7Var.f14876m;
        this.A = h7Var.f14877n;
    }
}
