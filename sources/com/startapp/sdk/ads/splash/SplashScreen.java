package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.a0;
import com.startapp.ea;
import com.startapp.i4;
import com.startapp.j0;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class SplashScreen {

    /* renamed from: a  reason: collision with root package name */
    public Activity f11909a;

    /* renamed from: b  reason: collision with root package name */
    public SplashEventHandler f11910b;

    /* renamed from: c  reason: collision with root package name */
    public SplashConfig f11911c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<CacheKey> f11912d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public SplashHtml f11913e = null;

    /* renamed from: f  reason: collision with root package name */
    public Handler f11914f = new Handler();

    /* renamed from: g  reason: collision with root package name */
    public boolean f11915g = false;

    /* renamed from: h  reason: collision with root package name */
    public SplashStartAppAd f11916h;

    /* renamed from: i  reason: collision with root package name */
    public AdPreferences f11917i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f11918j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f11919k = new b();

    /* compiled from: Sta */
    public static class SplashStartAppAd extends StartAppAd {
        private static final long serialVersionUID = 1;

        public SplashStartAppAd(Context context) {
            super(context);
            this.placement = AdPreferences.Placement.INAPP_SPLASH;
        }

        public AdRulesResult a(String str, AdPreferences.Placement placement) {
            return new AdRulesResult(true, "");
        }
    }

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            boolean z10;
            SplashScreen splashScreen = SplashScreen.this;
            if (splashScreen.f11911c.b(splashScreen.f11909a)) {
                View view = null;
                if (splashScreen.b()) {
                    view = splashScreen.f11911c.a((Context) splashScreen.f11909a);
                } else {
                    SplashHtml splashHtml = splashScreen.f11913e;
                    if (splashHtml != null) {
                        view = splashHtml.b();
                    }
                }
                if (view != null) {
                    splashScreen.f11909a.setContentView(view, new ViewGroup.LayoutParams(-1, -1));
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    SplashScreen splashScreen2 = SplashScreen.this;
                    Context a10 = j0.a(splashScreen2.f11909a);
                    if (a10 == null) {
                        a10 = splashScreen2.f11909a;
                    }
                    SplashStartAppAd splashStartAppAd = new SplashStartAppAd(a10);
                    splashScreen2.f11916h = splashStartAppAd;
                    splashStartAppAd.loadSplash(splashScreen2.f11917i, new c(splashScreen2));
                    SplashScreen splashScreen3 = SplashScreen.this;
                    splashScreen3.f11914f.postDelayed(new d(splashScreen3), splashScreen3.f11911c.a().longValue());
                    splashScreen3.f11914f.postDelayed(new e(splashScreen3), splashScreen3.f11911c.getMinSplashTime().getIndex());
                    return;
                }
                SplashScreen.this.f11909a.finish();
                return;
            }
            throw new IllegalArgumentException(splashScreen.f11911c.getErrorMessage());
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* compiled from: Sta */
        public class a implements ea {

            /* renamed from: com.startapp.sdk.ads.splash.SplashScreen$b$a$a  reason: collision with other inner class name */
            /* compiled from: Sta */
            public class C0121a implements AdDisplayListener {
                public C0121a() {
                }

                public void adClicked(Ad ad2) {
                    SplashScreen.this.f11910b.f11892f = true;
                }

                public void adDisplayed(Ad ad2) {
                    SplashScreen.this.f11910b.f11895i = SplashEventHandler.SplashState.DISPLAYED;
                }

                public void adHidden(Ad ad2) {
                    SplashEventHandler splashEventHandler = SplashScreen.this.f11910b;
                    splashEventHandler.f11895i = SplashEventHandler.SplashState.HIDDEN;
                    splashEventHandler.b();
                }

                public void adNotDisplayed(Ad ad2) {
                }
            }

            public a() {
            }

            public void a() {
                SplashStartAppAd splashStartAppAd;
                SplashScreen splashScreen = SplashScreen.this;
                if (!splashScreen.f11915g && (splashStartAppAd = splashScreen.f11916h) != null) {
                    splashStartAppAd.showAd((AdDisplayListener) new C0121a());
                    SplashScreen splashScreen2 = SplashScreen.this;
                    if (splashScreen2.f11911c.getMaxAdDisplayTime() != SplashConfig.MaxAdDisplayTime.FOR_EVER) {
                        splashScreen2.f11914f.postDelayed(new f(splashScreen2), splashScreen2.f11911c.getMaxAdDisplayTime().getIndex());
                    }
                    SplashScreen.this.f11909a.finish();
                }
            }
        }

        public b() {
        }

        public void run() {
            SplashScreen splashScreen = SplashScreen.this;
            SplashEventHandler splashEventHandler = splashScreen.f11910b;
            SplashHtml splashHtml = splashScreen.f11913e;
            a aVar = new a();
            splashEventHandler.getClass();
            if (splashHtml == null) {
                aVar.a();
                return;
            }
            splashHtml.callback = aVar;
            splashHtml.a();
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.splash.SplashConfig$Orientation[] r0 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11924a = r0
                com.startapp.sdk.ads.splash.SplashConfig$Orientation r1 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11924a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.splash.SplashConfig$Orientation r1 = com.startapp.sdk.ads.splash.SplashConfig.Orientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.splash.SplashScreen.c.<clinit>():void");
        }
    }

    public SplashScreen(Activity activity, SplashConfig splashConfig, AdPreferences adPreferences) {
        this.f11909a = activity;
        this.f11911c = splashConfig;
        this.f11917i = adPreferences;
        try {
            a();
            this.f11910b = new SplashEventHandler(activity, this.f11913e);
        } catch (Throwable th) {
            SplashEventHandler splashEventHandler = new SplashEventHandler(activity);
            this.f11910b = splashEventHandler;
            splashEventHandler.d();
            this.f11910b.a();
            i4.a(th);
        }
    }

    public final void a() {
        SplashConfig splashConfig = this.f11911c;
        Activity activity = this.f11909a;
        if (splashConfig.getLogo() == null && splashConfig.getLogoRes() == -1 && splashConfig.getLogoByteArray() != null) {
            byte[] logoByteArray = splashConfig.getLogoByteArray();
            splashConfig.f11885a = new BitmapDrawable(activity.getResources(), BitmapFactory.decodeByteArray(logoByteArray, 0, logoByteArray.length));
        }
        if (!b()) {
            this.f11913e = this.f11911c.a(this.f11909a);
        }
    }

    public final boolean b() {
        return !this.f11911c.isHtmlSplash() || this.f11911c.b();
    }

    public final boolean c() {
        int i10 = this.f11909a.getResources().getConfiguration().orientation;
        if (this.f11911c.getOrientation() == SplashConfig.Orientation.AUTO) {
            if (i10 == 2) {
                this.f11911c.setOrientation(SplashConfig.Orientation.LANDSCAPE);
            } else {
                this.f11911c.setOrientation(SplashConfig.Orientation.PORTRAIT);
            }
        }
        int i11 = c.f11924a[this.f11911c.getOrientation().ordinal()];
        boolean z10 = true;
        if (i11 == 1) {
            if (i10 != 2) {
                z10 = false;
            }
            Activity activity = this.f11909a;
            int i12 = a0.f10005a;
            activity.setRequestedOrientation(7);
        } else if (i11 != 2) {
            return false;
        } else {
            if (i10 != 1) {
                z10 = false;
            }
            Activity activity2 = this.f11909a;
            int i13 = a0.f10005a;
            try {
                activity2.setRequestedOrientation(6);
            } catch (Throwable unused) {
            }
        }
        return z10;
    }
}
