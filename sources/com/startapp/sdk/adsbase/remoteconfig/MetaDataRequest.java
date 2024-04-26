package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.startapp.a;
import com.startapp.a0;
import com.startapp.e2;
import com.startapp.i4;
import com.startapp.m8;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.wb;
import com.startapp.y0;
import java.util.Map;

/* compiled from: Sta */
public class MetaDataRequest extends y0 {

    /* renamed from: h0  reason: collision with root package name */
    public final e f12400h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f12401i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f12402j0 = b();

    /* renamed from: k0  reason: collision with root package name */
    public boolean f12403k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f12404l0;

    /* renamed from: m0  reason: collision with root package name */
    public RequestReason f12405m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f12406n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f12407o0;

    /* renamed from: p0  reason: collision with root package name */
    public Integer f12408p0;

    /* renamed from: q0  reason: collision with root package name */
    public Pair<String, String> f12409q0;

    /* renamed from: r0  reason: collision with root package name */
    public Integer f12410r0;

    /* renamed from: s0  reason: collision with root package name */
    public Boolean f12411s0;

    /* renamed from: t0  reason: collision with root package name */
    public long f12412t0;

    /* compiled from: Sta */
    public enum RequestReason {
        LAUNCH(1),
        APP_IDLE(2),
        IN_APP_PURCHASE(3),
        CUSTOM(4),
        PERIODIC(5),
        PAS(6),
        CONSENT(7),
        IMPLICIT_LAUNCH(8),
        EXTRAS(9);
        
        private int index;

        /* access modifiers changed from: public */
        RequestReason(int i10) {
            this.index = i10;
        }
    }

    public MetaDataRequest(Context context, e eVar, RequestReason requestReason) {
        super(2);
        this.f12400h0 = eVar;
        this.f12401i0 = eVar.getInt("totalSessions", 0);
        this.f12404l0 = eVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f12403k0 = eVar.getBoolean("payingUser", false);
        this.f12406n0 = MetaData.t().D();
        this.f12405m0 = requestReason;
        this.f12407o0 = a(context, eVar, StartAppSDKInternal.a().b());
        f(context);
        this.f12409q0 = SimpleTokenUtils.a();
        this.f12412t0 = SimpleTokenUtils.c();
        e2 f10 = ComponentLocator.a(context).f();
        this.f12410r0 = f10.b();
        this.f12411s0 = f10.a();
        a(ComponentLocator.a(context).b().a());
    }

    public void a(m8 m8Var) throws SDKException {
        super.a(m8Var);
        m8Var.a(a.f9999b, (Object) a.a(), true, true);
        m8Var.a("totalSessions", (Object) Integer.valueOf(this.f12401i0), true, true);
        m8Var.a("daysSinceFirstSession", (Object) Integer.valueOf(this.f12402j0), true, true);
        m8Var.a("payingUser", (Object) Boolean.valueOf(this.f12403k0), true, true);
        m8Var.a("profileId", (Object) this.f12406n0, false, true);
        m8Var.a("paidAmount", (Object) Float.valueOf(this.f12404l0), true, true);
        m8Var.a("reason", (Object) this.f12405m0, true, true);
        m8Var.a("ct", (Object) this.f12410r0, false, true);
        m8Var.a("apc", (Object) this.f12411s0, false, true);
        Object obj = StartAppSDKInternal.D;
        m8Var.a("testAdsEnabled", (Object) StartAppSDKInternal.d.f12173a.C ? Boolean.TRUE : null, false, true);
        m8Var.a("apkHash", (Object) this.f12407o0, false, true);
        m8Var.a("ian", (Object) this.f12408p0, false, true);
        Pair<String, String> pair = this.f12409q0;
        m8Var.a((String) pair.first, (Object) pair.second, false, true);
        long j10 = this.f12412t0;
        if (j10 != 0) {
            m8Var.a("firstInstalledAppTS", (Object) Long.valueOf(j10), false, true);
        }
    }

    public final int b() {
        return (int) ((System.currentTimeMillis() - this.f12400h0.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
    }

    public void f(Context context) {
        SimpleTokenConfig I = MetaData.f12393k.I();
        if (I != null && I.a(context)) {
            int i10 = a0.f10005a;
            int i11 = 0;
            try {
                for (PackageInfo next : a0.a(context.getPackageManager())) {
                    if (!a0.a(next) || next.packageName.equals(Constants.f12448a)) {
                        i11++;
                    }
                }
            } catch (Throwable unused) {
            }
            if (i11 > 0) {
                this.f12408p0 = Integer.valueOf(i11);
            }
        }
    }

    public static String a(Context context, e eVar, boolean z10) {
        String str = null;
        String string = eVar.getString("shared_prefs_app_apk_hash", (String) null);
        if (!TextUtils.isEmpty(string) && !z10) {
            return string;
        }
        Map<Activity, Integer> map = wb.f12765a;
        try {
            str = a0.a("SHA-256", context);
        } catch (Throwable th) {
            i4.a(th);
        }
        e.a a10 = eVar.edit();
        a10.a("shared_prefs_app_apk_hash", str);
        a10.f12335a.putString("shared_prefs_app_apk_hash", str);
        a10.apply();
        return str;
    }
}
