package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
public class w2 {
    public static void a(String str, boolean z10, String str2, String str3) {
        try {
            AdCallbacksConfig a10 = MetaData.f12393k.analytics.a();
            if (a10 != null) {
                if ((a10.a() || z10) && a10.a(str)) {
                    i4 i4Var = new i4(j4.f10587d);
                    i4Var.f10537d = "adCallback";
                    i4Var.f10542i = str;
                    i4Var.f10540g = str2;
                    i4Var.f10538e = str3;
                    i4Var.a();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
