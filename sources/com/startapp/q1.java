package com.startapp;

import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.d;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class q1 extends p1 {
    public q1(h hVar) {
        super(hVar);
    }

    public boolean a() {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f12173a;
        return startAppSDKInternal.f12135c && !startAppSDKInternal.f12138f && (!startAppSDKInternal.f12136d || (this.f11558a.f12273a == AdPreferences.Placement.INAPP_RETURN && CacheMetaData.f12244a.a().g()));
    }

    public long b() {
        d dVar = this.f11558a.f12277e;
        if (dVar == null) {
            return -1;
        }
        Long c10 = dVar.c();
        Long b10 = dVar.b();
        if (c10 == null || b10 == null) {
            return -1;
        }
        long longValue = c10.longValue() - (System.currentTimeMillis() - b10.longValue());
        if (longValue >= 0) {
            return longValue;
        }
        return 0;
    }
}
