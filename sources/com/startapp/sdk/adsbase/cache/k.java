package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.i4;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.z2;

/* compiled from: Sta */
public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f12299a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12300b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AdEventListener f12301c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.a f12302d;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DiskAdCacheManager.DiskCachedAd f12303a;

        public a(DiskAdCacheManager.DiskCachedAd diskCachedAd) {
            this.f12303a = diskCachedAd;
        }

        public void run() {
            try {
                DiskAdCacheManager.DiskCachedAd diskCachedAd = this.f12303a;
                if (diskCachedAd == null) {
                    k kVar = k.this;
                    DiskAdCacheManager.a(kVar.f12299a, kVar.f12301c);
                    return;
                }
                if (diskCachedAd.a() != null) {
                    if (this.f12303a.a().isReady()) {
                        if (this.f12303a.a().d()) {
                            k kVar2 = k.this;
                            DiskAdCacheManager.a(kVar2.f12299a, kVar2.f12301c);
                            return;
                        }
                        k kVar3 = k.this;
                        DiskAdCacheManager.a(kVar3.f12299a, this.f12303a, kVar3.f12302d, kVar3.f12301c);
                        return;
                    }
                }
                k kVar4 = k.this;
                DiskAdCacheManager.a(kVar4.f12299a, kVar4.f12301c);
            } catch (Throwable th) {
                i4.a(th);
                k kVar5 = k.this;
                DiskAdCacheManager.a(kVar5.f12299a, kVar5.f12301c);
            }
        }
    }

    public k(Context context, String str, AdEventListener adEventListener, DiskAdCacheManager.a aVar) {
        this.f12299a = context;
        this.f12300b = str;
        this.f12301c = adEventListener;
        this.f12302d = aVar;
    }

    public void run() {
        Object obj;
        try {
            Context context = this.f12299a;
            String a10 = DiskAdCacheManager.a();
            String str = this.f12300b;
            obj = null;
            if (str != null) {
                obj = z2.a(z2.b(context, a10), str);
            }
        } catch (Throwable th) {
            i4.a(th);
            DiskAdCacheManager.a(this.f12299a, this.f12301c);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new a((DiskAdCacheManager.DiskCachedAd) obj));
    }
}
