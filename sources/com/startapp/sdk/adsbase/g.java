package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.startapp.e;
import com.startapp.f5;
import com.startapp.l2;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.c;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.wb;
import java.util.Map;

/* compiled from: Sta */
public class g extends l2 {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z10;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        startAppSDKInternal.getClass();
        boolean z11 = true;
        if (activity.getClass().getName().equals(wb.c((Context) activity))) {
            startAppSDKInternal.f12157y = true;
        }
        startAppSDKInternal.f12150r = bundle;
        Map<Activity, Integer> map = wb.f12765a;
        c cVar = c.a.f12243a;
        boolean equals = activity.getClass().getName().equals(wb.c((Context) activity));
        if (bundle == null) {
            String[] split = c.class.getName().split("\\.");
            if (split.length < 3) {
                z10 = false;
            } else {
                z10 = activity.getClass().getName().startsWith(split[0] + "." + split[1] + "." + split[2]);
            }
            if (!z10 && !equals) {
                cVar.f12241d++;
                if (cVar.f12238a && AdsCommonMetaData.f12098h.I()) {
                    if (cVar.f12239b == null) {
                        cVar.f12239b = new AutoInterstitialPreferences();
                    }
                    boolean z12 = cVar.f12240c <= 0 || System.currentTimeMillis() >= cVar.f12240c + ((long) (cVar.f12239b.getSecondsBetweenAds() * 1000));
                    int i10 = cVar.f12241d;
                    boolean z13 = i10 <= 0 || i10 >= cVar.f12239b.getActivitiesBetweenAds();
                    if (!z12 || !z13) {
                        z11 = false;
                    }
                    if (z11) {
                        if (cVar.f12242e == null) {
                            cVar.f12242e = new StartAppAd(activity);
                        }
                        cVar.f12242e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new f5(cVar));
                    }
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        if (startAppSDKInternal.a(activity)) {
            startAppSDKInternal.f12156x = false;
        }
        if (startAppSDKInternal.f12141i.size() == 0) {
            startAppSDKInternal.f12136d = false;
        }
    }

    public void onActivityPaused(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        startAppSDKInternal.getClass();
        startAppSDKInternal.f12139g = System.currentTimeMillis();
        startAppSDKInternal.f12144l = null;
    }

    public void onActivityResumed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        if (startAppSDKInternal.f12134b && startAppSDKInternal.f12137e) {
            startAppSDKInternal.f12137e = false;
            d dVar = d.f12250h;
            if (!dVar.f12254d) {
                synchronized (dVar.f12251a) {
                    for (h b10 : dVar.f12251a.values()) {
                        b10.b();
                    }
                }
            }
        }
        if (startAppSDKInternal.f12145m) {
            startAppSDKInternal.f12145m = false;
            SimpleTokenUtils.f(activity);
        }
        startAppSDKInternal.f12144l = activity;
    }

    public void onActivityStarted(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        boolean a10 = startAppSDKInternal.a(activity);
        boolean z10 = !startAppSDKInternal.f12156x && a10 && startAppSDKInternal.f12150r == null && startAppSDKInternal.f12141i.size() == 0 && StartAppSDKInternal.E == StartAppSDKInternal.InitState.EXPLICIT;
        if (z10) {
            ComponentLocator.a((Context) activity).f().a(false, (String) null, (String) null, (String) null);
        }
        Map<Activity, Integer> map = wb.f12765a;
        if (!ComponentLocator.a((Context) activity).f().f10320d && !AdsCommonMetaData.f12098h.L() && !startAppSDKInternal.f12155w && !startAppSDKInternal.a("MoPub") && !startAppSDKInternal.a("AdMob") && !startAppSDKInternal.f12154v && z10) {
            StartAppAd.a(activity, startAppSDKInternal.f12150r, new SplashConfig(), new AdPreferences(), (SplashHideListener) null, false);
        }
        if (a10) {
            startAppSDKInternal.f12157y = false;
            startAppSDKInternal.f12156x = true;
        }
        if (startAppSDKInternal.f12136d) {
            if (MetaData.f12393k.b() && startAppSDKInternal.f12153u && !AdsCommonMetaData.f12098h.K() && !startAppSDKInternal.f12147o) {
                if (System.currentTimeMillis() - startAppSDKInternal.f12139g > AdsCommonMetaData.f12098h.x()) {
                    d c10 = d.f12250h.c(startAppSDKInternal.f12152t);
                    startAppSDKInternal.f12158z = c10;
                    if (c10 != null && c10.isReady()) {
                        AdRules b10 = AdsCommonMetaData.f12098h.b();
                        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
                        AdRulesResult a11 = b10.a(placement, (String) null);
                        if (!a11.b()) {
                            a.a(((ReturnAd) startAppSDKInternal.f12158z).trackingUrls, (String) null, 0, a11.a());
                        } else if (startAppSDKInternal.f12158z.a((String) null)) {
                            e.f10308d.a(new com.startapp.d(placement, (String) null));
                        }
                    }
                }
            }
            if (System.currentTimeMillis() - startAppSDKInternal.f12139g > MetaData.f12393k.H()) {
                startAppSDKInternal.b(activity, MetaDataRequest.RequestReason.APP_IDLE);
            }
        }
        startAppSDKInternal.f12138f = false;
        startAppSDKInternal.f12136d = false;
        if (startAppSDKInternal.f12141i.get(Integer.valueOf(activity.hashCode())) == null) {
            startAppSDKInternal.f12141i.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(new Integer(0).intValue() + 1));
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r7v0, types: [android.content.Context, java.lang.Object, android.app.Activity] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityStopped(android.content.Context r7) {
        /*
            r6 = this;
            com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.d.f12173a
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f12141i
            int r2 = r7.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0091
            int r1 = r1.intValue()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r1.intValue()
            if (r3 != 0) goto L_0x0032
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f12141i
            int r3 = r7.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.remove(r3)
            goto L_0x003f
        L_0x0032:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = r0.f12141i
            int r4 = r7.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r4, r1)
        L_0x003f:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f12141i
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0091
            boolean r1 = r0.f12138f
            if (r1 != 0) goto L_0x0050
            r0.f12136d = r2
            r0.e(r7)
        L_0x0050:
            boolean r1 = r0.f12134b
            if (r1 == 0) goto L_0x0091
            android.content.Context r1 = com.startapp.j0.a(r7)
            if (r1 == 0) goto L_0x005b
            r7 = r1
        L_0x005b:
            com.startapp.sdk.adsbase.cache.d r1 = com.startapp.sdk.adsbase.cache.d.f12250h
            boolean r3 = r0.f12138f
            r1.getClass()
            boolean r4 = r1.f12253c     // Catch:{ all -> 0x008b }
            if (r4 != 0) goto L_0x0074
            com.startapp.sdk.adsbase.cache.CacheMetaData r4 = com.startapp.sdk.adsbase.cache.CacheMetaData.f12244a     // Catch:{ all -> 0x008b }
            com.startapp.sdk.adsbase.cache.ACMConfig r4 = r4.a()     // Catch:{ all -> 0x008b }
            boolean r4 = r4.f()     // Catch:{ all -> 0x008b }
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0087
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r7)     // Catch:{ all -> 0x008b }
            java.util.concurrent.Executor r4 = r4.i()     // Catch:{ all -> 0x008b }
            com.startapp.c r5 = new com.startapp.c     // Catch:{ all -> 0x008b }
            r5.<init>(r1, r7)     // Catch:{ all -> 0x008b }
            r4.execute(r5)     // Catch:{ all -> 0x008b }
        L_0x0087:
            r1.a((boolean) r3)     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r7 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r7)
        L_0x008f:
            r0.f12137e = r2
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.g.onActivityStopped(android.app.Activity):void");
    }
}
