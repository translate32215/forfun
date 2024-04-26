package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.sdk.ads.video.j;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import com.startapp.z2;

/* compiled from: Sta */
public class f implements j.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j.b f11998a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CachedVideoAd f11999b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f12000c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f12001d;

    public f(h hVar, j.b bVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f12001d = hVar;
        this.f11998a = bVar;
        this.f11999b = cachedVideoAd;
        this.f12000c = context;
    }

    public void a(String str) {
        j.b bVar = this.f11998a;
        if (bVar != null) {
            bVar.a(str);
        }
        if (str != null) {
            this.f11999b.a(System.currentTimeMillis());
            this.f11999b.a(str);
            h hVar = this.f12001d;
            Context context = this.f12000c;
            CachedVideoAd cachedVideoAd = this.f11999b;
            hVar.f12003a.remove(cachedVideoAd);
            hVar.a(AdsCommonMetaData.f12098h.G().b() - 1);
            hVar.f12003a.add(cachedVideoAd);
            z2.b(context, "CachedAds", hVar.f12003a);
        }
    }
}
