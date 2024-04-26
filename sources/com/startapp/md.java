package com.startapp;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebView;

/* compiled from: Sta */
public class md {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10887a;

    /* renamed from: b  reason: collision with root package name */
    public WebView f10888b;

    /* compiled from: Sta */
    public class a implements MessageQueue.IdleHandler {
        public a() {
        }

        public boolean queueIdle() {
            md mdVar = md.this;
            if (mdVar.f10888b != null) {
                return false;
            }
            try {
                mdVar.f10888b = new WebView(mdVar.f10887a);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public md(Context context) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f10887a = context;
        } else {
            this.f10887a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, (Bundle) null);
        }
        a();
    }

    public final void a() {
        MessageQueue myQueue = Looper.myQueue();
        if (myQueue != null) {
            myQueue.addIdleHandler(new a());
        }
    }

    public WebView b() {
        WebView webView = this.f10888b;
        if (webView == null) {
            return new WebView(this.f10887a);
        }
        this.f10888b = null;
        MessageQueue myQueue = Looper.myQueue();
        if (myQueue == null) {
            return webView;
        }
        myQueue.addIdleHandler(new a());
        return webView;
    }
}
