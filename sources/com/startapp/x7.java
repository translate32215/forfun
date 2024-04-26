package com.startapp;

import android.os.Handler;
import android.webkit.WebView;
import com.startapp.g5;

/* compiled from: Sta */
public class x7 extends g5 {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebView f12797a;

        public a(x7 x7Var, WebView webView) {
            this.f12797a = webView;
        }

        public void run() {
            try {
                this.f12797a.setBackgroundColor(0);
            } catch (Exception unused) {
            }
        }
    }

    public void a(WebView webView) {
        new Handler().postDelayed(new a(this, webView), 1000);
    }

    public void b(WebView webView) {
        this.C = false;
        webView.setOnTouchListener(new g5.d());
        if (this.f10357h.equals("interstitial")) {
            webView.setBackgroundColor(0);
        }
    }
}
