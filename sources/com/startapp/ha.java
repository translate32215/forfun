package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.StartAppSDKInternal;

/* compiled from: Sta */
public class ha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f10505a;

    public ha(Context context) {
        this.f10505a = context;
    }

    public void run() {
        synchronized (StartAppSDKInternal.D) {
            StartAppSDKInternal.a(this.f10505a);
        }
    }
}
