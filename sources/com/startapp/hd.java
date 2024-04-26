package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: Sta */
public class hd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public NotDisplayedReason f10510a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f10511b;

    /* renamed from: c  reason: collision with root package name */
    public a f10512c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f10513d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<View> f10514e;

    /* renamed from: f  reason: collision with root package name */
    public final j9 f10515f;

    /* renamed from: g  reason: collision with root package name */
    public final BannerOptions f10516g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10517h = true;

    /* compiled from: Sta */
    public interface a {
    }

    public hd(View view, j9 j9Var, BannerOptions bannerOptions) {
        this.f10514e = new WeakReference<>(view);
        this.f10515f = j9Var;
        this.f10516g = bannerOptions;
    }

    public void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            j9 j9Var = this.f10515f;
            if (!(j9Var == null || (notDisplayedReason = this.f10510a) == null)) {
                j9Var.a(notDisplayedReason.toString(), this.f10511b);
            }
            this.f10513d.removeCallbacksAndMessages((Object) null);
        } catch (Throwable unused) {
        }
    }

    public boolean b() {
        j9 j9Var = this.f10515f;
        return (j9Var == null || j9Var.f10719i.get() || this.f10514e.get() == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r0 = (com.startapp.sdk.ads.nativead.NativeAdDetails.e) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            boolean r0 = r5.b()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x007b }
            r0.<init>()     // Catch:{ all -> 0x007b }
            java.lang.ref.WeakReference<android.view.View> r1 = r5.f10514e     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x007b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.banner.BannerOptions r2 = r5.f10516g     // Catch:{ all -> 0x007b }
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r1 = com.startapp.gd.a((android.view.View) r1, (com.startapp.sdk.ads.banner.BannerOptions) r2, (java.util.concurrent.atomic.AtomicReference<org.json.JSONObject>) r0)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0033
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r2 = r5.f10510a     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0029
            int r2 = r2.a()     // Catch:{ all -> 0x007b }
            int r3 = r1.a()     // Catch:{ all -> 0x007b }
            if (r2 > r3) goto L_0x0033
        L_0x0029:
            r5.f10510a = r1     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007b }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x007b }
            r5.f10511b = r0     // Catch:{ all -> 0x007b }
        L_0x0033:
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x004a
            boolean r3 = r5.f10517h     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x004a
            r5.f10517h = r0     // Catch:{ all -> 0x007b }
            com.startapp.j9 r0 = r5.f10515f     // Catch:{ all -> 0x007b }
            r0.b()     // Catch:{ all -> 0x007b }
            com.startapp.hd$a r0 = r5.f10512c     // Catch:{ all -> 0x007b }
            goto L_0x006f
        L_0x004a:
            if (r1 != 0) goto L_0x006f
            boolean r0 = r5.f10517h     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x006f
            r5.f10517h = r2     // Catch:{ all -> 0x007b }
            com.startapp.j9 r0 = r5.f10515f     // Catch:{ all -> 0x007b }
            r0.a()     // Catch:{ all -> 0x007b }
            com.startapp.hd$a r0 = r5.f10512c     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006f
            com.startapp.sdk.ads.nativead.NativeAdDetails$e r0 = (com.startapp.sdk.ads.nativead.NativeAdDetails.e) r0     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDetails r1 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDisplayListener r3 = r1.f11862j     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x006f
            boolean r4 = r1.f11857e     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x006f
            r3.adHidden(r1)     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDetails r0 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch:{ all -> 0x007b }
            boolean unused = r0.f11857e = r2     // Catch:{ all -> 0x007b }
        L_0x006f:
            android.os.Handler r0 = r5.f10513d     // Catch:{ all -> 0x007b }
            r1 = 100
            r0.postDelayed(r5, r1)     // Catch:{ all -> 0x007b }
            goto L_0x0082
        L_0x0077:
            r5.a()     // Catch:{ all -> 0x007b }
            goto L_0x0082
        L_0x007b:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r0 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.INTERNAL_ERROR
            r5.f10510a = r0
            r5.a()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.hd.run():void");
    }

    public hd(WeakReference<View> weakReference, j9 j9Var, BannerOptions bannerOptions) {
        this.f10514e = weakReference;
        this.f10515f = j9Var;
        this.f10516g = bannerOptions;
    }
}
