package com.startapp;

import android.content.Context;
import android.webkit.WebSettings;

/* compiled from: Sta */
public class tb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f12625a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ub f12626b;

    public tb(ub ubVar, Context context) {
        this.f12626b = ubVar;
        this.f12625a = context;
    }

    public void run() {
        try {
            this.f12626b.f12678a = WebSettings.getDefaultUserAgent(this.f12625a);
        } catch (Throwable th) {
            i4.a(th);
        }
    }
}
