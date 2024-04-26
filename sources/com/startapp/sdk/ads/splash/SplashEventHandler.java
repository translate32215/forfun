package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.a6;
import com.startapp.ea;
import com.startapp.i4;
import com.startapp.j0;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
public class SplashEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11887a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Activity> f11888b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11889c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11890d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11891e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11892f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11893g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11894h;

    /* renamed from: i  reason: collision with root package name */
    public SplashState f11895i;

    /* renamed from: j  reason: collision with root package name */
    public SplashHtml f11896j;

    /* renamed from: k  reason: collision with root package name */
    public final BroadcastReceiver f11897k;

    /* compiled from: Sta */
    public enum SplashState {
        LOADING,
        RECEIVED,
        DISPLAYED,
        HIDDEN,
        DO_NOT_DISPLAY
    }

    /* compiled from: Sta */
    public class a implements ea {
        public a() {
        }

        public void a() {
            SplashEventHandler.this.b();
        }
    }

    /* compiled from: Sta */
    public class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            SplashEventHandler.this.f11892f = true;
        }
    }

    public SplashEventHandler(Activity activity) {
        this.f11889c = false;
        this.f11890d = true;
        this.f11891e = false;
        this.f11892f = false;
        this.f11893g = false;
        this.f11894h = false;
        this.f11895i = SplashState.LOADING;
        this.f11896j = null;
        this.f11897k = new b();
        this.f11887a = j0.b(activity);
        this.f11888b = new WeakReference<>(activity);
    }

    public void a(Runnable runnable, CacheKey cacheKey) {
        AdRulesResult a10 = AdaptMetaData.f12230a.a().a(AdPreferences.Placement.INAPP_SPLASH, (String) null);
        if (a10.b()) {
            a(runnable);
            return;
        }
        this.f11895i = SplashState.DO_NOT_DISPLAY;
        if (cacheKey != null) {
            com.startapp.sdk.adsbase.a.a(com.startapp.sdk.adsbase.a.a(d.f12250h.a(cacheKey)), (String) null, 0, a10.a());
        }
        c();
    }

    public void b() {
        if (!this.f11891e) {
            this.f11891e = true;
            a6.a(this.f11887a).a(new Intent("com.startapp.android.splashHidden"));
        }
        try {
            a6.a(this.f11887a).a(this.f11897k);
        } catch (Throwable th) {
            i4.a(th);
        }
        Activity activity = (Activity) this.f11888b.get();
        if (activity != null && !activity.isFinishing()) {
            try {
                activity.finish();
            } catch (Throwable th2) {
                i4.a(th2);
            }
        }
    }

    public final void c() {
        SplashHtml splashHtml = this.f11896j;
        a aVar = new a();
        if (splashHtml == null) {
            b();
            return;
        }
        splashHtml.callback = aVar;
        splashHtml.a();
    }

    public void d() {
        this.f11889c = true;
    }

    public void a() {
        this.f11895i = SplashState.DO_NOT_DISPLAY;
        a((Runnable) null);
    }

    public final void a(Runnable runnable) {
        if (!this.f11889c) {
            return;
        }
        if (this.f11894h || runnable == null) {
            SplashState splashState = this.f11895i;
            if (splashState == SplashState.RECEIVED && runnable != null) {
                this.f11890d = false;
                runnable.run();
            } else if (splashState != SplashState.LOADING) {
                c();
            }
        }
    }

    public SplashEventHandler(Activity activity, SplashHtml splashHtml) {
        this(activity);
        this.f11896j = splashHtml;
    }
}
