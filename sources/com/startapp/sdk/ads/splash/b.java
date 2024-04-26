package com.startapp.sdk.ads.splash;

import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.startapp.a6;
import com.startapp.f3;
import com.startapp.sdk.ads.splash.SplashEventHandler;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;

/* compiled from: Sta */
public class b extends f3 {

    /* renamed from: v  reason: collision with root package name */
    public SplashConfig f11928v = null;

    /* renamed from: w  reason: collision with root package name */
    public SplashScreen f11929w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11930x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f11931y = false;

    public boolean a(int i10, KeyEvent keyEvent) {
        if (this.f11930x) {
            if (i10 == 25) {
                if (!this.f11931y) {
                    this.f11931y = true;
                    SplashScreen splashScreen = this.f11929w;
                    splashScreen.f11915g = true;
                    splashScreen.f11910b.f11893g = true;
                    Toast.makeText(this.f10351b, "Test Mode", 0).show();
                    return true;
                }
            } else if (i10 == 24 && this.f11931y) {
                this.f10351b.finish();
                return true;
            }
        }
        return i10 == 4;
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
        AdPreferences adPreferences;
        if (this.f11928v != null) {
            Serializable serializableExtra = this.f10350a.getSerializableExtra("AdPreference");
            if (serializableExtra != null) {
                adPreferences = (AdPreferences) serializableExtra;
            } else {
                adPreferences = new AdPreferences();
            }
            this.f11930x = this.f10350a.getBooleanExtra("testMode", false);
            SplashScreen splashScreen = new SplashScreen(this.f10351b, this.f11928v, adPreferences);
            this.f11929w = splashScreen;
            SplashEventHandler splashEventHandler = splashScreen.f11910b;
            a6.a(splashEventHandler.f11887a).a(splashEventHandler.f11897k, new IntentFilter("com.startapp.android.adInfoWasClickedBroadcastListener"));
            if (!splashScreen.c()) {
                splashScreen.f11914f.post(splashScreen.f11918j);
            } else {
                splashScreen.f11914f.postDelayed(splashScreen.f11918j, 100);
            }
        }
    }

    public void g() {
        SplashEventHandler.SplashState splashState;
        SplashScreen splashScreen = this.f11929w;
        if (splashScreen != null) {
            splashScreen.f11914f.removeCallbacks(splashScreen.f11918j);
            SplashEventHandler splashEventHandler = splashScreen.f11910b;
            SplashEventHandler.SplashState splashState2 = splashEventHandler.f11895i;
            if (splashState2 != SplashEventHandler.SplashState.DISPLAYED && splashState2 != (splashState = SplashEventHandler.SplashState.DO_NOT_DISPLAY)) {
                splashEventHandler.f11895i = splashState;
                if (splashEventHandler.f11890d) {
                    splashEventHandler.b();
                }
            }
        }
    }

    public void h() {
    }

    public void a(Bundle bundle) {
        this.f11928v = (SplashConfig) this.f10350a.getSerializableExtra("SplashConfig");
    }
}
