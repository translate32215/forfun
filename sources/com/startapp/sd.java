package com.startapp;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import xb.a;

/* compiled from: Sta */
public class sd extends a {
    @SuppressLint({"SetJavaScriptEnabled"})
    public sd(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
