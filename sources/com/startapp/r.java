package com.startapp;

import android.content.DialogInterface;
import android.webkit.WebView;

/* compiled from: Sta */
public class r implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f11636a;

    public r(WebView webView) {
        this.f11636a = webView;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f11636a.stopLoading();
    }
}
