package com.startapp.sdk.ads.video;

import android.content.Context;
import android.util.Base64;
import com.startapp.i4;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.j;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import com.startapp.z2;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

/* compiled from: Sta */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11994a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j.b f11995b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.a f11996c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f11997d;

    public e(h hVar, String str, j.b bVar, d.a aVar) {
        this.f11997d = hVar;
        this.f11994a = str;
        this.f11995b = bVar;
        this.f11996c = aVar;
    }

    public void run() {
        String str;
        h hVar = this.f11997d;
        Context context = hVar.f12004b;
        String str2 = this.f11994a;
        j.b bVar = this.f11995b;
        d.a aVar = this.f11996c;
        if (hVar.f12003a == null) {
            LinkedList<CachedVideoAd> linkedList = (LinkedList) z2.a(context, "CachedAds", LinkedList.class);
            hVar.f12003a = linkedList;
            if (linkedList == null) {
                hVar.f12003a = new LinkedList<>();
            }
            if (hVar.a(AdsCommonMetaData.f12098h.G().b())) {
                z2.b(context, "CachedAds", hVar.f12003a);
            }
        }
        try {
            URL url = new URL(str2);
            String str3 = url.getHost() + url.getPath().replace("/", "_");
            try {
                String substring = str3.substring(0, str3.lastIndexOf(46));
                str = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(substring.getBytes()), 0).replaceAll("[^a-zA-Z0-9]+", "_") + str3.substring(str3.lastIndexOf(46));
            } catch (NoSuchAlgorithmException e10) {
                i4.a((Throwable) e10);
                str = str3;
            }
            new j(context, url, str, new f(hVar, bVar, new CachedVideoAd(str), context), new g(hVar, aVar)).a();
        } catch (MalformedURLException e11) {
            if (bVar != null) {
                bVar.a((String) null);
            }
            i4.a((Throwable) e11);
        }
    }
}
