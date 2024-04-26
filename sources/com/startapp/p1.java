package com.startapp;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.e;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
public abstract class p1 {

    /* renamed from: a  reason: collision with root package name */
    public h f11558a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f11559b = null;

    /* renamed from: c  reason: collision with root package name */
    public Long f11560c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11561d = false;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            p1.this.c();
        }
    }

    public p1(h hVar) {
        this.f11558a = hVar;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        this.f11560c = null;
        this.f11561d = false;
        h hVar = this.f11558a;
        if (hVar.f12285m < MetaData.f12393k.K()) {
            hVar.f12285m++;
            hVar.a((StartAppAd) null, (AdEventListener) null, true, false);
            return;
        }
        h.b bVar = hVar.f12288p;
        if (bVar != null) {
            ((e) bVar).a(hVar);
        }
    }

    public void d() {
        if (!this.f11561d) {
            if (this.f11560c == null) {
                this.f11560c = Long.valueOf(System.currentTimeMillis());
            }
            if (a()) {
                if (this.f11559b == null) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    this.f11559b = new Handler(myLooper);
                }
                long b10 = b();
                if (b10 >= 0) {
                    this.f11561d = true;
                    this.f11559b.postDelayed(new a(), b10);
                }
            }
        }
    }

    public void e() {
        Handler handler = this.f11559b;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.f11560c = null;
        this.f11561d = false;
    }
}
