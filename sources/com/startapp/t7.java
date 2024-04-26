package com.startapp;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;

/* compiled from: Sta */
public final class t7 {

    /* renamed from: a  reason: collision with root package name */
    public static qd f12614a = new qd();

    public static void a(Context context) {
        qd qdVar = f12614a;
        Context applicationContext = context.getApplicationContext();
        se.a((Object) applicationContext, "Application Context cannot be null");
        if (!qdVar.f11633a) {
            qdVar.f11633a = true;
            xe a10 = xe.a();
            a10.f12809c.getClass();
            yd ydVar = new yd();
            ue ueVar = a10.f12808b;
            Handler handler = new Handler();
            ueVar.getClass();
            a10.f12810d = new pe(handler, applicationContext, ydVar, a10);
            ae aeVar = ae.f10095d;
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(aeVar);
            }
            WindowManager windowManager = de.f10305a;
            de.f10307c = applicationContext.getResources().getDisplayMetrics().density;
            de.f10305a = (WindowManager) applicationContext.getSystemService("window");
            me.f10890b.f10891a = applicationContext.getApplicationContext();
        }
    }
}
