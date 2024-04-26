package com.startapp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* compiled from: Sta */
public class f6 {

    /* renamed from: a  reason: collision with root package name */
    public String f10375a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10376b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10377c = true;

    public f6(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    if (obj != null) {
                        this.f10375a = obj.toString();
                        Log.i("StartAppSDK", "appId is " + this.f10375a);
                        if (applicationInfo.metaData.containsKey("com.startapp.sdk.RETURN_ADS_ENABLED")) {
                            this.f10376b = applicationInfo.metaData.getBoolean("com.startapp.sdk.RETURN_ADS_ENABLED");
                            Log.i("StartAppSDK", "returnAds enabled: " + this.f10376b);
                        }
                        if (applicationInfo.metaData.containsKey("com.startapp.sdk.SPLASH_ENABLED")) {
                            this.f10377c = applicationInfo.metaData.getBoolean("com.startapp.sdk.SPLASH_ENABLED");
                            Log.i("StartAppSDK", "splash enabled: " + this.f10377c);
                            return;
                        }
                        return;
                    }
                    Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                }
            } catch (Throwable th) {
                i4.a(th);
            }
        }
    }
}
