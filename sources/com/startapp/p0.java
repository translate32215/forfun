package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* compiled from: Sta */
public class p0 {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BannerListener f11552a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f11553b;

        public a(BannerListener bannerListener, View view, Context context) {
            this.f11552a = bannerListener;
            this.f11553b = view;
        }

        public void run() {
            try {
                this.f11552a.onReceiveAd(this.f11553b);
            } catch (Throwable th) {
                wb.a((Object) this.f11552a, th);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BannerListener f11554a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f11555b;

        public b(BannerListener bannerListener, View view, Context context) {
            this.f11554a = bannerListener;
            this.f11555b = view;
        }

        public void run() {
            try {
                this.f11554a.onFailedToReceiveAd(this.f11555b);
            } catch (Throwable th) {
                wb.a((Object) this.f11554a, th);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BannerListener f11556a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f11557b;

        public c(BannerListener bannerListener, View view, Context context) {
            this.f11556a = bannerListener;
            this.f11557b = view;
        }

        public void run() {
            try {
                this.f11556a.onClick(this.f11557b);
            } catch (Throwable th) {
                wb.a((Object) this.f11556a, th);
            }
        }
    }

    public static void a(Context context, BannerListener bannerListener, View view, String str) {
        c cVar = null;
        w2.a("onClicked", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            cVar = new c(bannerListener, view, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) cVar);
    }

    public static void b(Context context, BannerListener bannerListener, View view, String str) {
        b bVar = null;
        w2.a("onLoadFailed", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            bVar = new b(bannerListener, view, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) bVar);
    }

    public static void c(Context context, BannerListener bannerListener, View view, String str) {
        a aVar = null;
        w2.a("onLoad", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            aVar = new a(bannerListener, view, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) aVar);
    }
}
