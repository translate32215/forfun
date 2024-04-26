package com.adcolony.sdk;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adcolony.sdk.q0;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;
import p.f;
import t2.b;

public class o0 extends q0.g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0 f4703b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var) {
        super((o0) null);
        this.f4703b = q0Var;
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        q0.g(this.f4703b, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
            try {
                return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(this.f4703b.f4723f.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException unused) {
                f.a(0, 0, b.a("UTF-8 not supported."), true);
            }
        }
        return null;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri uri;
        if (!this.f4703b.J || !webResourceRequest.isForMainFrame()) {
            return false;
        }
        String s10 = this.f4703b.s();
        if (s10 == null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = Uri.parse(s10);
        }
        j0.f(new Intent("android.intent.action.VIEW", uri));
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "url", uri.toString());
        r0.e(jSONObject, "ad_session_id", this.f4703b.f4722e);
        new g("WebView.redirect_detected", this.f4703b.S.f4513s, jSONObject).b();
        g0 r10 = f.d().r();
        r10.b(this.f4703b.f4722e);
        r10.d(this.f4703b.f4722e);
        return true;
    }
}
