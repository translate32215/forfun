package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
public class j {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f10567a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f10568b;

        public a(AdEventListener adEventListener, Ad ad2, Context context) {
            this.f10567a = adEventListener;
            this.f10568b = ad2;
        }

        public void run() {
            try {
                this.f10567a.onReceiveAd(this.f10568b);
            } catch (Throwable th) {
                wb.a((Object) this.f10567a, th);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f10569a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f10570b;

        public b(AdEventListener adEventListener, Ad ad2, Context context) {
            this.f10569a = adEventListener;
            this.f10570b = ad2;
        }

        public void run() {
            try {
                this.f10569a.onFailedToReceiveAd(this.f10570b);
            } catch (Throwable th) {
                wb.a((Object) this.f10569a, th);
            }
        }
    }

    public static void a(Context context, AdEventListener adEventListener, Ad ad2, boolean z10) {
        b bVar = null;
        if (!z10) {
            w2.a("onLoadFailed", adEventListener != null, (String) null, ad2 != null ? ad2.getErrorMessage() : null);
        }
        if (adEventListener != null) {
            bVar = new b(adEventListener, ad2, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) bVar);
    }

    public static void b(Context context, AdEventListener adEventListener, Ad ad2, boolean z10) {
        a aVar = null;
        if (!z10) {
            w2.a("onLoad", adEventListener != null, (String) null, (String) null);
        }
        if (adEventListener != null) {
            aVar = new a(adEventListener, ad2, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) aVar);
    }
}
