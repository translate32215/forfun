package com.startapp;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: Sta */
public final class q6 {
    public static void a(Context context, WebView webView, r6 r6Var) {
        if (r6Var == null) {
            r6Var = new r6(context);
        }
        boolean z10 = true;
        n6.a(webView, "mraid.SUPPORTED_FEATURES.CALENDAR", r6Var.f11663b.contains("calendar") && a0.a(r6Var.f11662a, "android.permission.WRITE_CALENDAR"));
        n6.a(webView, "mraid.SUPPORTED_FEATURES.INLINEVIDEO", r6Var.f11663b.contains("inlineVideo"));
        n6.a(webView, "mraid.SUPPORTED_FEATURES.SMS", r6Var.f11663b.contains("sms") && a0.a(r6Var.f11662a, "android.permission.SEND_SMS"));
        n6.a(webView, "mraid.SUPPORTED_FEATURES.STOREPICTURE", r6Var.f11663b.contains("storePicture"));
        if (!r6Var.f11663b.contains("tel") || !a0.a(r6Var.f11662a, "android.permission.CALL_PHONE")) {
            z10 = false;
        }
        n6.a(webView, "mraid.SUPPORTED_FEATURES.TEL", z10);
    }
}
