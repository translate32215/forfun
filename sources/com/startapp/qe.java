package com.startapp;

import android.webkit.WebView;

/* compiled from: Sta */
public class qe implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f11634a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11635b;

    public qe(WebView webView, String str) {
        this.f11634a = webView;
        this.f11635b = str;
    }

    public void run() {
        this.f11634a.loadUrl(this.f11635b);
    }
}
