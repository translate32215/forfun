package com.startapp.sdk.adsbase.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.i4;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager;
import com.startapp.z2;

/* compiled from: Sta */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f12292a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager.c f12293b;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ((b) i.this.f12293b).f12248a.f12253c = false;
        }
    }

    public i(Context context, DiskAdCacheManager.c cVar) {
        this.f12292a = context;
        this.f12293b = cVar;
    }

    public void run() {
        try {
            z2.a(this.f12292a, "startapp_ads");
            new Handler(Looper.getMainLooper()).post(new a());
        } catch (Throwable th) {
            i4.a(th);
        }
    }
}
