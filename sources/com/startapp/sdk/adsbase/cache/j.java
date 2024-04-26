package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.i4;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.z2;
import java.util.List;

/* compiled from: Sta */
public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f12295a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.b f12296b;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f12297a;

        public a(List list) {
            this.f12297a = list;
        }

        public void run() {
            DiskAdCacheManager.b bVar = j.this.f12296b;
            List<DiskAdCacheManager.DiskCacheKey> list = this.f12297a;
            a aVar = (a) bVar;
            aVar.getClass();
            if (list != null) {
                try {
                    for (DiskAdCacheManager.DiskCacheKey diskCacheKey : list) {
                        if (aVar.f12247b.a(diskCacheKey.placement)) {
                            aVar.f12247b.a(aVar.f12246a, (StartAppAd) null, diskCacheKey.placement, diskCacheKey.adPreferences, (d.C0123d) null, true, diskCacheKey.a());
                        }
                    }
                } catch (Throwable th) {
                    i4.a(th);
                }
            }
            d dVar = aVar.f12247b;
            Context context = aVar.f12246a;
            dVar.f12254d = false;
            for (d.e eVar : dVar.f12255e) {
                if (dVar.a(eVar.f12265b)) {
                    dVar.a(context, eVar.f12264a, eVar.f12265b, eVar.f12266c, new c(dVar, eVar), false, 0);
                }
            }
            dVar.f12255e.clear();
        }
    }

    public j(Context context, DiskAdCacheManager.b bVar) {
        this.f12295a = context;
        this.f12296b = bVar;
    }

    public void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new a(z2.d(this.f12295a, DiskAdCacheManager.b())));
        } catch (Throwable th) {
            i4.a(th);
        }
    }
}
