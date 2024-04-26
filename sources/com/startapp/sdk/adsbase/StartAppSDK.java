package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.i4;
import com.startapp.j4;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.t9;
import com.startapp.wb;
import j.f;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: Sta */
public class StartAppSDK {
    public static void addWrapper(Context context, String str, String str2) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        if (startAppSDKInternal.f12149q == null) {
            startAppSDKInternal.f12149q = new TreeMap();
        }
        startAppSDKInternal.f12149q.put(str, str2);
        e d10 = ComponentLocator.a(context).d();
        Map<String, String> map = startAppSDKInternal.f12149q;
        Map<Activity, Integer> map2 = wb.f12765a;
        String jSONObject = new JSONObject(map).toString();
        e.a a10 = d10.edit();
        a10.a("sharedPrefsWrappers", jSONObject);
        a10.f12335a.putString("sharedPrefsWrappers", jSONObject);
        a10.apply();
    }

    public static void enableReturnAds(boolean z10) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.a(z10);
    }

    public static SharedPreferences getExtras(Context context) {
        return ComponentLocator.a(context).E.b();
    }

    public static String getVersion() {
        return "4.10.5";
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void init(Context context, String str) {
        init(context, str, new SDKAdPreferences());
    }

    public static void setTestAdsEnabled(boolean z10) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.C = z10;
    }

    public static void setUserConsent(Context context, String str, long j10, boolean z10) {
        String str2;
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            e d10 = ComponentLocator.a(context).d();
            String string = d10.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", (String) null);
            String str3 = "1";
            if (string != null) {
                if (string.equals(z10 ? str3 : "0")) {
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            String a10 = androidx.activity.e.a(sb2, str2, "M");
            i4 i4Var = new i4(j4.f10587d);
            i4Var.f10537d = f.a("User consent: ", str);
            i4Var.f10538e = a10;
            i4Var.a();
            e.a a11 = d10.edit();
            if (!z10) {
                str3 = "0";
            }
            a11.a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str3);
            a11.f12335a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str3);
            a11.apply();
            t9.f12617d.a(context, MetaDataRequest.RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.b(context, MetaDataRequest.RequestReason.CUSTOM);
    }

    public static void inAppPurchaseMade(Context context, double d10) {
        e d11 = ComponentLocator.a(context).d();
        float f10 = d11.getFloat("inAppPurchaseAmount", 0.0f);
        e.a a10 = d11.edit();
        double d12 = (double) f10;
        Double.isNaN(d12);
        float f11 = (float) (d12 + d10);
        a10.a("inAppPurchaseAmount", Float.valueOf(f11));
        a10.f12335a.putFloat("inAppPurchaseAmount", f11);
        a10.a("payingUser", Boolean.TRUE);
        a10.f12335a.putBoolean("payingUser", true);
        a10.apply();
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.b(context, MetaDataRequest.RequestReason.IN_APP_PURCHASE);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    public static void init(Context context, String str, boolean z10) {
        init(context, (String) null, str, z10);
    }

    public static void init(Context context, String str, String str2, boolean z10) {
        init(context, str, str2, new SDKAdPreferences(), z10);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences, boolean z10) {
        init(context, (String) null, str, sDKAdPreferences, z10);
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.a(context, str, str2, sDKAdPreferences, z10);
    }
}
