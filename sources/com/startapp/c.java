package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Sta */
public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f10219a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f10220b;

    public c(d dVar, Context context) {
        this.f10220b = dVar;
        this.f10219a = context;
    }

    public void run() {
        try {
            z2.a(this.f10219a, DiskAdCacheManager.b());
            z2.a(this.f10219a, DiskAdCacheManager.a());
            CacheKey cacheKey = null;
            for (Map.Entry next : this.f10220b.f12251a.entrySet()) {
                CacheKey cacheKey2 = (CacheKey) next.getKey();
                if (cacheKey2.a() == AdPreferences.Placement.INAPP_SPLASH) {
                    cacheKey = cacheKey2;
                } else {
                    h hVar = (h) next.getValue();
                    Context context = this.f10219a;
                    AdPreferences.Placement a10 = cacheKey2.a();
                    AdPreferences adPreferences = hVar.f12276d;
                    String b10 = this.f10220b.b(cacheKey2);
                    int i10 = hVar.f12285m;
                    DiskAdCacheManager.DiskCacheKey diskCacheKey = new DiskAdCacheManager.DiskCacheKey(a10, adPreferences);
                    diskCacheKey.a(i10);
                    String b11 = DiskAdCacheManager.b();
                    if (b10 != null) {
                        z2.a(z2.b(context, b11), b10, (Serializable) diskCacheKey);
                    }
                    Context context2 = this.f10219a;
                    String b12 = this.f10220b.b(cacheKey2);
                    DiskAdCacheManager.DiskCachedAd diskCachedAd = new DiskAdCacheManager.DiskCachedAd(hVar.f12277e);
                    String a11 = DiskAdCacheManager.a();
                    if (b12 != null) {
                        try {
                            z2.a(z2.b(context2, a11), b12, (Serializable) diskCachedAd);
                        } catch (Throwable th) {
                            if (z2.a(4)) {
                                i4.a(th);
                            }
                        }
                    }
                }
            }
            if (cacheKey != null) {
                this.f10220b.f12251a.remove(cacheKey);
            }
        } catch (Throwable th2) {
            i4.a(th2);
        }
    }
}
