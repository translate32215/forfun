package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.a0;
import com.startapp.f3;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.w9;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Sta */
public class OverlayActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public f3 f11809a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11810b;

    /* renamed from: c  reason: collision with root package name */
    public int f11811c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11812d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f11813e;

    /* renamed from: f  reason: collision with root package name */
    public int f11814f = -1;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "placement"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            android.content.Intent r1 = r8.getIntent()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.a(r0)
            int r3 = r0.ordinal()
            if (r3 == 0) goto L_0x0063
            r4 = 2
            if (r3 == r4) goto L_0x005b
            r4 = 3
            if (r3 == r4) goto L_0x0053
            r4 = 4
            if (r3 == r4) goto L_0x002f
            r4 = 7
            if (r3 == r4) goto L_0x002f
            r4 = 8
            if (r3 == r4) goto L_0x0063
            com.startapp.g5 r3 = new com.startapp.g5
            r3.<init>()
            goto L_0x0078
        L_0x002f:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.wb.f12765a
            java.lang.String r3 = "videoAd"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x003f
            com.startapp.sdk.ads.video.VideoMode r3 = new com.startapp.sdk.ads.video.VideoMode
            r3.<init>()
            goto L_0x0078
        L_0x003f:
            java.lang.String r3 = "mraidAd"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x004d
            com.startapp.o6 r3 = new com.startapp.o6
            r3.<init>()
            goto L_0x0078
        L_0x004d:
            com.startapp.x7 r3 = new com.startapp.x7
            r3.<init>()
            goto L_0x0078
        L_0x0053:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.wb.f12765a
            com.startapp.sdk.ads.splash.b r3 = new com.startapp.sdk.ads.splash.b
            r3.<init>()
            goto L_0x0078
        L_0x005b:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.wb.f12765a
            com.startapp.s7 r3 = new com.startapp.s7
            r3.<init>()
            goto L_0x0078
        L_0x0063:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.wb.f12765a
            android.net.Uri r3 = r1.getData()
            if (r3 != 0) goto L_0x006e
            r0 = 0
            goto L_0x014a
        L_0x006e:
            java.lang.String r3 = r3.toString()
            com.startapp.a4 r4 = new com.startapp.a4
            r4.<init>(r3)
            r3 = r4
        L_0x0078:
            r3.f10350a = r1
            r3.f10351b = r8
            java.lang.String r4 = "position"
            java.lang.String r4 = r1.getStringExtra(r4)
            r3.f10357h = r4
            java.lang.String r4 = "tracking"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f10358i = r4
            java.lang.String r4 = "trackingClickUrl"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f10359j = r4
            java.lang.String r4 = "packageNames"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f10360k = r4
            java.lang.String r4 = "closingUrl"
            java.lang.String[] r5 = r1.getStringArrayExtra(r4)
            r3.f10354e = r5
            java.lang.String r5 = "smartRedirect"
            boolean[] r5 = r1.getBooleanArrayExtra(r5)
            r3.f10355f = r5
            java.lang.String r5 = "browserEnabled"
            boolean[] r5 = r1.getBooleanArrayExtra(r5)
            r3.f10356g = r5
            java.lang.String r5 = "adTag"
            java.lang.String r5 = r1.getStringExtra(r5)
            r3.f10365p = r5
            java.lang.String r5 = "htmlUuid"
            java.lang.String r5 = r1.getStringExtra(r5)
            if (r5 == 0) goto L_0x00e7
            java.lang.Boolean r6 = com.startapp.sdk.adsbase.AdsConstants.f12104f
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00da
            com.startapp.sdk.adsbase.cache.d r6 = com.startapp.sdk.adsbase.cache.d.f12250h
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f12252b
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.a((java.lang.String) r5)
            goto L_0x00e7
        L_0x00da:
            com.startapp.sdk.adsbase.cache.d r6 = com.startapp.sdk.adsbase.cache.d.f12250h
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f12252b
            java.lang.Object r5 = r6.remove(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.a((java.lang.String) r5)
        L_0x00e7:
            java.lang.String r5 = "isSplash"
            r1.getBooleanExtra(r5, r2)
            java.lang.String r5 = "adInfoOverride"
            java.io.Serializable r5 = r1.getSerializableExtra(r5)
            com.startapp.sdk.adsbase.adinformation.AdInformationOverrides r5 = (com.startapp.sdk.adsbase.adinformation.AdInformationOverrides) r5
            r3.f10364o = r5
            r3.f10363n = r0
            java.lang.String[] r0 = r1.getStringArrayExtra(r4)
            r3.f10354e = r0
            java.lang.String r0 = "rewardDuration"
            int r0 = r1.getIntExtra(r0, r2)
            r3.f10368s = r0
            java.lang.String r0 = "rewardedHideTimer"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r3.f10369t = r0
            boolean[] r0 = r3.f10355f
            r4 = 1
            if (r0 != 0) goto L_0x0119
            boolean[] r0 = new boolean[r4]
            r0[r2] = r4
            r3.f10355f = r0
        L_0x0119:
            boolean[] r0 = r3.f10356g
            if (r0 != 0) goto L_0x0123
            boolean[] r0 = new boolean[r4]
            r0[r2] = r4
            r3.f10356g = r0
        L_0x0123:
            java.lang.String r0 = "ad"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            com.startapp.sdk.adsbase.Ad r0 = (com.startapp.sdk.adsbase.Ad) r0
            r3.f10361l = r0
            java.lang.String r0 = "delayImpressionSeconds"
            r4 = -1
            long r6 = r1.getLongExtra(r0, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013f
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.f10366q = r0
        L_0x013f:
            java.lang.String r0 = "sendRedirectHops"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            java.lang.Boolean[] r0 = (java.lang.Boolean[]) r0
            r3.f10367r = r0
            r0 = r3
        L_0x014a:
            r8.f11809a = r0
            if (r0 != 0) goto L_0x0151
            r8.finish()
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.interstitials.OverlayActivity.a():void");
    }

    public final boolean b() {
        return this.f11810b && Build.VERSION.SDK_INT != 26;
    }

    public void finish() {
        f3 f3Var = this.f11809a;
        if (f3Var != null) {
            f3Var.h();
        }
        super.finish();
    }

    public void onBackPressed() {
        f3 f3Var = this.f11809a;
        if (f3Var == null || !f3Var.c()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (b()) {
            a();
            f3 f3Var = this.f11809a;
            if (f3Var != null) {
                f3Var.a(this.f11813e);
                this.f11809a.f();
            }
            this.f11810b = false;
        }
        f3 f3Var2 = this.f11809a;
        if (f3Var2 != null) {
            f3Var2.a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z10 = false;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        Serializable serializableExtra = getIntent().getSerializableExtra("ad");
        if (intExtra >= 0 && (serializableExtra instanceof Ad)) {
            w9 s10 = ComponentLocator.a(getApplicationContext()).s();
            AdPreferences.Placement a10 = AdPreferences.Placement.a(intExtra);
            String adId = ((Ad) serializableExtra).getAdId();
            s10.getClass();
            if (adId != null) {
                s10.f12760a.put(new w9.a(a10, -1), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        this.f11812d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle != null) {
            this.f11814f = bundle.getInt("activityLockedOrientation", -1);
            this.f11812d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.f11811c = getIntent().getIntExtra("orientation", getResources().getConfiguration().orientation);
        if (getResources().getConfiguration().orientation != this.f11811c) {
            z10 = true;
        }
        this.f11810b = z10;
        if (b()) {
            this.f11813e = bundle;
            return;
        }
        a();
        f3 f3Var = this.f11809a;
        if (f3Var != null) {
            f3Var.a(bundle);
        }
    }

    public void onDestroy() {
        if (!b()) {
            f3 f3Var = this.f11809a;
            if (f3Var != null) {
                f3Var.d();
                this.f11809a = null;
            }
            Map<Activity, Integer> map = wb.f12765a;
            wb.a((Activity) this, getResources().getConfiguration().orientation, false);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        f3 f3Var = this.f11809a;
        if (f3Var == null || f3Var.a(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void onPause() {
        super.onPause();
        if (!b()) {
            f3 f3Var = this.f11809a;
            if (f3Var != null) {
                f3Var.e();
            }
            a.b((Context) this);
        }
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        f3 f3Var;
        super.onResume();
        int i10 = this.f11814f;
        if (i10 == -1) {
            this.f11814f = wb.a((Activity) this, this.f11811c, this.f11812d);
        } else {
            int i11 = a0.f10005a;
            try {
                setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        }
        if (!b() && (f3Var = this.f11809a) != null) {
            f3Var.f();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!b()) {
            f3 f3Var = this.f11809a;
            if (f3Var != null) {
                f3Var.b(bundle);
            }
            bundle.putInt("activityLockedOrientation", this.f11814f);
            bundle.putBoolean("activityShouldLockOrientation", this.f11812d);
        }
    }

    public void onStop() {
        f3 f3Var;
        super.onStop();
        if (!b() && (f3Var = this.f11809a) != null) {
            f3Var.g();
        }
    }
}
