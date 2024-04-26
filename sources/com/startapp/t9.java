package com.startapp;

import android.app.Activity;
import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import java.util.Map;
import java.util.UUID;

/* compiled from: Sta */
public class t9 {

    /* renamed from: d  reason: collision with root package name */
    public static final t9 f12617d = new t9();

    /* renamed from: a  reason: collision with root package name */
    public String f12618a = "";

    /* renamed from: b  reason: collision with root package name */
    public long f12619b = 0;

    /* renamed from: c  reason: collision with root package name */
    public MetaDataRequest.RequestReason f12620c = MetaDataRequest.RequestReason.LAUNCH;

    public String a() {
        return this.f12618a;
    }

    public long b() {
        return this.f12619b;
    }

    public synchronized void a(Context context, MetaDataRequest.RequestReason requestReason) {
        this.f12618a = UUID.randomUUID().toString();
        this.f12619b = System.currentTimeMillis();
        this.f12620c = requestReason;
        Map<Activity, Integer> map = wb.f12765a;
        e eVar = e.f10308d;
        eVar.f10309a.clear();
        eVar.f10310b.clear();
        eVar.f10311c.clear();
        MetaData.f12393k.a(context, new AdPreferences(), requestReason, false, (c) null, true);
    }
}
