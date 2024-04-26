package com.adcolony.sdk;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adcolony.sdk.q0;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import p.f;
import t2.b;

public class p0 extends q0.g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0 f4705b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var) {
        super((o0) null);
        this.f4705b = q0Var;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
            try {
                return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(this.f4705b.f4723f.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException unused) {
                f.a(0, 0, b.a("UTF-8 not supported."), true);
            }
        }
        return null;
    }
}
