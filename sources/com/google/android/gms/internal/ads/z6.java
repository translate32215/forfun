package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import e8.q7;
import f7.d0;
import javax.annotation.concurrent.GuardedBy;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class z6 {

    /* renamed from: a  reason: collision with root package name */
    public long f8671a = -1;

    /* renamed from: b  reason: collision with root package name */
    public long f8672b = -1;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public int f8673c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f8674d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f8675e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final Object f8676f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final String f8677g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f8678h;
    @GuardedBy("lock")

    /* renamed from: i  reason: collision with root package name */
    public int f8679i = 0;
    @GuardedBy("lock")

    /* renamed from: j  reason: collision with root package name */
    public int f8680j = 0;

    public z6(String str, d0 d0Var) {
        this.f8677g = str;
        this.f8678h = d0Var;
    }

    public static boolean b(Context context) {
        Context c10 = q7.c(context);
        int identifier = c10.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            e.J("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == c10.getPackageManager().getActivityInfo(new ComponentName(c10.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            e.J("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            e.K("Fail to fetch AdActivity theme");
            e.J("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(e8.fi0 r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f8676f
            monitor-enter(r0)
            f7.d0 r1 = r10.f8678h     // Catch:{ all -> 0x0075 }
            long r1 = r1.l()     // Catch:{ all -> 0x0075 }
            d7.l r3 = d7.l.B     // Catch:{ all -> 0x0075 }
            z7.b r3 = r3.f13193j     // Catch:{ all -> 0x0075 }
            long r3 = r3.b()     // Catch:{ all -> 0x0075 }
            long r5 = r10.f8672b     // Catch:{ all -> 0x0075 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            e8.l<java.lang.Long> r5 = e8.t.f16675w0     // Catch:{ all -> 0x0075 }
            e8.ti0 r6 = e8.ti0.f16763j     // Catch:{ all -> 0x0075 }
            com.google.android.gms.internal.ads.e r6 = r6.f16769f     // Catch:{ all -> 0x0075 }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ all -> 0x0075 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0075 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0075 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f8674d = r1     // Catch:{ all -> 0x0075 }
            goto L_0x003b
        L_0x0033:
            f7.d0 r1 = r10.f8678h     // Catch:{ all -> 0x0075 }
            int r1 = r1.i()     // Catch:{ all -> 0x0075 }
            r10.f8674d = r1     // Catch:{ all -> 0x0075 }
        L_0x003b:
            r10.f8672b = r12     // Catch:{ all -> 0x0075 }
            r10.f8671a = r12     // Catch:{ all -> 0x0075 }
            goto L_0x0042
        L_0x0040:
            r10.f8671a = r12     // Catch:{ all -> 0x0075 }
        L_0x0042:
            r12 = 1
            if (r11 == 0) goto L_0x0054
            android.os.Bundle r11 = r11.f14633c     // Catch:{ all -> 0x0075 }
            if (r11 == 0) goto L_0x0054
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0075 }
            if (r11 != r12) goto L_0x0054
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0054:
            int r11 = r10.f8673c     // Catch:{ all -> 0x0075 }
            int r11 = r11 + r12
            r10.f8673c = r11     // Catch:{ all -> 0x0075 }
            int r11 = r10.f8674d     // Catch:{ all -> 0x0075 }
            int r11 = r11 + r12
            r10.f8674d = r11     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x006a
            r11 = 0
            r10.f8675e = r11     // Catch:{ all -> 0x0075 }
            f7.d0 r11 = r10.f8678h     // Catch:{ all -> 0x0075 }
            r11.p(r3)     // Catch:{ all -> 0x0075 }
            goto L_0x0073
        L_0x006a:
            f7.d0 r11 = r10.f8678h     // Catch:{ all -> 0x0075 }
            long r11 = r11.d()     // Catch:{ all -> 0x0075 }
            long r3 = r3 - r11
            r10.f8675e = r3     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0075 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z6.a(e8.fi0, long):void");
    }
}
