package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
public class i {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdDisplayListener f10522a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f10523b;

        public a(AdDisplayListener adDisplayListener, Ad ad2, Context context) {
            this.f10522a = adDisplayListener;
            this.f10523b = ad2;
        }

        public void run() {
            try {
                this.f10522a.adNotDisplayed(this.f10523b);
            } catch (Throwable th) {
                wb.a((Object) this.f10522a, th);
            }
        }
    }

    public static void a(Context context, AdDisplayListener adDisplayListener, Ad ad2) {
        a aVar = null;
        w2.a("adNotDisplayed", adDisplayListener != null, (String) null, ad2 != null ? ad2.getErrorMessage() : null);
        if (adDisplayListener != null) {
            aVar = new a(adDisplayListener, ad2, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) aVar);
    }
}
