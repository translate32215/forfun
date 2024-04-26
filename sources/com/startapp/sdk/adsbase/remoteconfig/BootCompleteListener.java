package com.startapp.sdk.adsbase.remoteconfig;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.ha;
import com.startapp.j0;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class BootCompleteListener extends BroadcastReceiver {
    @SuppressLint({"UnsafeProtectedBroadcastReceiver"})
    public void onReceive(Context context, Intent intent) {
        Object obj = StartAppSDKInternal.D;
        Context a10 = j0.a(context);
        if (a10 != null) {
            context = a10;
        }
        StartAppSDKInternal.d.f12173a.f(context);
        ComponentLocator.a(context).g().execute(new ha(context));
    }
}
