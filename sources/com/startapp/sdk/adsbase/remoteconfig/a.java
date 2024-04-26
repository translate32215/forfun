package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.b1;
import com.startapp.b3;
import com.startapp.i4;
import com.startapp.o7;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.y3;
import java.util.Collections;
import java.util.List;

/* compiled from: Sta */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12430a;

    /* renamed from: b  reason: collision with root package name */
    public final AdPreferences f12431b;

    /* renamed from: c  reason: collision with root package name */
    public final MetaDataRequest.RequestReason f12432c;

    /* renamed from: d  reason: collision with root package name */
    public MetaData f12433d = null;

    /* renamed from: e  reason: collision with root package name */
    public BannerMetaData f12434e = null;

    /* renamed from: f  reason: collision with root package name */
    public SplashMetaData f12435f = null;

    /* renamed from: g  reason: collision with root package name */
    public CacheMetaData f12436g = null;

    /* renamed from: h  reason: collision with root package name */
    public AdInformationMetaData f12437h = null;

    /* renamed from: i  reason: collision with root package name */
    public AdsCommonMetaData f12438i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12439j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12440k = false;

    public a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason) {
        this.f12430a = context;
        this.f12431b = adPreferences;
        this.f12432c = requestReason;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|(22:34|35|36|(1:38)|42|43|44|(1:46)|50|51|52|(1:54)|58|59|60|(1:62)|66|67|68|(1:70)|74|75)|76|77) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0143 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean a() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f12430a     // Catch:{ all -> 0x014a }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.e r0 = r0.d()     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest r1 = new com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest     // Catch:{ all -> 0x014a }
            android.content.Context r2 = r5.f12430a     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason r3 = r5.f12432c     // Catch:{ all -> 0x014a }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x014a }
            android.content.Context r0 = r5.f12430a     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.model.AdPreferences r2 = r5.f12431b     // Catch:{ all -> 0x014a }
            r1.a(r0, r2)     // Catch:{ all -> 0x014a }
            android.content.Context r0 = r5.f12430a     // Catch:{ all -> 0x014a }
            com.startapp.o7$a r0 = a(r0, r1)     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x0025
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x014a }
            return r0
        L_0x0025:
            java.lang.String r0 = r0.f11522a     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x002c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x014a }
            return r0
        L_0x002c:
            java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.MetaData> r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.class
            java.lang.Object r1 = com.startapp.wb.a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = (com.startapp.sdk.adsbase.remoteconfig.MetaData) r1     // Catch:{ all -> 0x014a }
            r5.f12433d = r1     // Catch:{ all -> 0x014a }
            java.lang.String r1 = r1.h()     // Catch:{ all -> 0x014a }
            if (r1 == 0) goto L_0x0069
            android.content.Context r1 = r5.f12430a     // Catch:{ all -> 0x014a }
            com.startapp.sdk.components.ComponentLocator r1 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r1)     // Catch:{ all -> 0x014a }
            com.startapp.c0 r1 = r1.c()     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = r5.f12433d     // Catch:{ all -> 0x014a }
            java.lang.String r2 = r2.h()     // Catch:{ all -> 0x014a }
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x014a }
        L_0x0052:
            java.lang.Object r3 = r1.f10221a     // Catch:{ all -> 0x014a }
            monitor-enter(r3)     // Catch:{ all -> 0x014a }
            android.content.SharedPreferences r1 = r1.f10222b     // Catch:{ all -> 0x0066 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "31721150b470a3b9"
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r2)     // Catch:{ all -> 0x0066 }
            r1.commit()     // Catch:{ all -> 0x0066 }
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x0069:
            java.util.Map<android.app.Activity, java.lang.Integer> r1 = com.startapp.wb.f12765a     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.adsbase.AdsCommonMetaData> r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.class
            java.lang.Object r1 = com.startapp.wb.a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = (com.startapp.sdk.adsbase.AdsCommonMetaData) r1     // Catch:{ all -> 0x014a }
            r5.f12438i = r1     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.ads.banner.BannerMetaData> r1 = com.startapp.sdk.ads.banner.BannerMetaData.class
            java.lang.Object r1 = com.startapp.wb.a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.ads.banner.BannerMetaData r1 = (com.startapp.sdk.ads.banner.BannerMetaData) r1     // Catch:{ all -> 0x014a }
            r5.f12434e = r1     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.ads.splash.SplashMetaData> r1 = com.startapp.sdk.ads.splash.SplashMetaData.class
            java.lang.Object r1 = com.startapp.wb.a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.ads.splash.SplashMetaData r1 = (com.startapp.sdk.ads.splash.SplashMetaData) r1     // Catch:{ all -> 0x014a }
            r5.f12435f = r1     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.adsbase.cache.CacheMetaData> r1 = com.startapp.sdk.adsbase.cache.CacheMetaData.class
            java.lang.Object r1 = com.startapp.wb.a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r1 = (com.startapp.sdk.adsbase.cache.CacheMetaData) r1     // Catch:{ all -> 0x014a }
            r5.f12436g = r1     // Catch:{ all -> 0x014a }
            java.lang.Class<com.startapp.sdk.adsbase.adinformation.AdInformationMetaData> r1 = com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.class
            java.lang.Object r0 = com.startapp.wb.a((java.lang.String) r0, r1)     // Catch:{ all -> 0x014a }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r0 = (com.startapp.sdk.adsbase.adinformation.AdInformationMetaData) r0     // Catch:{ all -> 0x014a }
            r5.f12437h = r0     // Catch:{ all -> 0x014a }
            java.lang.Object r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f12386d
            monitor-enter(r0)
            boolean r1 = r5.f12439j     // Catch:{ all -> 0x0147 }
            if (r1 != 0) goto L_0x0143
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = r5.f12433d     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x0143
            android.content.Context r1 = r5.f12430a     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x0143
            r1 = 1
            com.startapp.sdk.adsbase.AdsCommonMetaData r2 = com.startapp.sdk.adsbase.AdsCommonMetaData.f12098h     // Catch:{ all -> 0x00c1 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = r5.f12438i     // Catch:{ all -> 0x00c1 }
            boolean r2 = com.startapp.wb.a(r2, r3)     // Catch:{ all -> 0x00c1 }
            if (r2 != 0) goto L_0x00c5
            r5.f12440k = r1     // Catch:{ all -> 0x00c1 }
            android.content.Context r2 = r5.f12430a     // Catch:{ all -> 0x00c1 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = r5.f12438i     // Catch:{ all -> 0x00c1 }
            com.startapp.sdk.adsbase.AdsCommonMetaData.a(r2, r3)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c5
        L_0x00c1:
            r2 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0147 }
        L_0x00c5:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.wb.f12765a     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.ads.banner.BannerMetaData r2 = com.startapp.sdk.ads.banner.BannerMetaData.f11748b     // Catch:{ all -> 0x00db }
            com.startapp.sdk.ads.banner.BannerMetaData r3 = r5.f12434e     // Catch:{ all -> 0x00db }
            boolean r2 = com.startapp.wb.a(r2, r3)     // Catch:{ all -> 0x00db }
            if (r2 != 0) goto L_0x00df
            r5.f12440k = r1     // Catch:{ all -> 0x00db }
            android.content.Context r2 = r5.f12430a     // Catch:{ all -> 0x00db }
            com.startapp.sdk.ads.banner.BannerMetaData r3 = r5.f12434e     // Catch:{ all -> 0x00db }
            com.startapp.sdk.ads.banner.BannerMetaData.a(r2, r3)     // Catch:{ all -> 0x00db }
            goto L_0x00df
        L_0x00db:
            r2 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0147 }
        L_0x00df:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.wb.f12765a     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.ads.splash.SplashMetaData r2 = r5.f12435f     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.ads.splash.SplashConfig r2 = r2.a()     // Catch:{ all -> 0x0147 }
            android.content.Context r3 = r5.f12430a     // Catch:{ all -> 0x0147 }
            r2.setDefaults(r3)     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.ads.splash.SplashMetaData r2 = com.startapp.sdk.ads.splash.SplashMetaData.f11907a     // Catch:{ all -> 0x0100 }
            com.startapp.sdk.ads.splash.SplashMetaData r3 = r5.f12435f     // Catch:{ all -> 0x0100 }
            boolean r2 = com.startapp.wb.a(r2, r3)     // Catch:{ all -> 0x0100 }
            if (r2 != 0) goto L_0x0104
            r5.f12440k = r1     // Catch:{ all -> 0x0100 }
            android.content.Context r2 = r5.f12430a     // Catch:{ all -> 0x0100 }
            com.startapp.sdk.ads.splash.SplashMetaData r3 = r5.f12435f     // Catch:{ all -> 0x0100 }
            com.startapp.sdk.ads.splash.SplashMetaData.a(r2, r3)     // Catch:{ all -> 0x0100 }
            goto L_0x0104
        L_0x0100:
            r2 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0147 }
        L_0x0104:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.wb.f12765a     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f12244a     // Catch:{ all -> 0x011a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r3 = r5.f12436g     // Catch:{ all -> 0x011a }
            boolean r2 = com.startapp.wb.a(r2, r3)     // Catch:{ all -> 0x011a }
            if (r2 != 0) goto L_0x011e
            r5.f12440k = r1     // Catch:{ all -> 0x011a }
            android.content.Context r2 = r5.f12430a     // Catch:{ all -> 0x011a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r3 = r5.f12436g     // Catch:{ all -> 0x011a }
            com.startapp.sdk.adsbase.cache.CacheMetaData.a(r2, r3)     // Catch:{ all -> 0x011a }
            goto L_0x011e
        L_0x011a:
            r2 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0147 }
        L_0x011e:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.wb.f12765a     // Catch:{ all -> 0x0147 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r2 = com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.f12183a     // Catch:{ all -> 0x0134 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r3 = r5.f12437h     // Catch:{ all -> 0x0134 }
            boolean r2 = com.startapp.wb.a(r2, r3)     // Catch:{ all -> 0x0134 }
            if (r2 != 0) goto L_0x0138
            r5.f12440k = r1     // Catch:{ all -> 0x0134 }
            android.content.Context r1 = r5.f12430a     // Catch:{ all -> 0x0134 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r2 = r5.f12437h     // Catch:{ all -> 0x0134 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.a(r1, r2)     // Catch:{ all -> 0x0134 }
            goto L_0x0138
        L_0x0134:
            r1 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x0147 }
        L_0x0138:
            android.content.Context r1 = r5.f12430a     // Catch:{ Exception -> 0x0143 }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = r5.f12433d     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r2.f()     // Catch:{ Exception -> 0x0143 }
            com.startapp.sdk.adsbase.remoteconfig.MetaData.a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0143 }
        L_0x0143:
            monitor-exit(r0)     // Catch:{ all -> 0x0147 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0147:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0147 }
            throw r1
        L_0x014a:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.a.a():java.lang.Boolean");
    }

    public void a(Boolean bool) {
        MetaData metaData;
        Context context;
        synchronized (MetaData.f12386d) {
            if (!this.f12439j) {
                if (!bool.booleanValue() || (metaData = this.f12433d) == null || (context = this.f12430a) == null) {
                    MetaData.a(this.f12432c);
                } else {
                    try {
                        MetaData.a(context, metaData, this.f12432c, this.f12440k);
                    } catch (Throwable th) {
                        i4.a(th);
                    }
                }
            }
        }
    }

    public static o7.a a(Context context, MetaDataRequest metaDataRequest) {
        o7.a aVar;
        List<String> list = MetaData.f12393k.metaDataHosts;
        if (list == null || list.size() < 1) {
            list = MetaData.f12389g;
        }
        for (T a10 : Collections.unmodifiableList(list)) {
            y3 k10 = ComponentLocator.a(context).k();
            StringBuilder a11 = b1.a(a10);
            a11.append(AdsConstants.f12102d);
            String sb2 = a11.toString();
            k10.getClass();
            try {
                aVar = k10.a(sb2, metaDataRequest, (b3<Throwable, Void>) null);
            } catch (Throwable th) {
                i4.a(th);
                aVar = null;
            }
            if (aVar == null) {
                if (!ComponentLocator.a(context).e().a()) {
                    break;
                }
            } else {
                return aVar;
            }
        }
        return null;
    }
}
