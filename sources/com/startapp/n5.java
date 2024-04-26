package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class n5 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10899a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10900b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f10901c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f10902d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f10903e;

    /* renamed from: f  reason: collision with root package name */
    public Context f10904f;

    /* renamed from: g  reason: collision with root package name */
    public TrackingParams f10905g;

    public n5(Context context, Runnable runnable, TrackingParams trackingParams, boolean z10) {
        this(context, runnable, trackingParams);
        this.f10900b = z10;
    }

    @JavascriptInterface
    public void closeAd() {
        if (!this.f10899a) {
            this.f10899a = true;
            this.f10901c.run();
        }
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        Runnable runnable = this.f10903e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (this.f10900b) {
            Map<Activity, Integer> map = wb.f12765a;
            a.a(this.f10904f, str, (String) null);
            return;
        }
        a.b(this.f10904f, str, (String) null);
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            a.a(this.f10904f, str, this.f10905g);
        }
        Intent a10 = wb.a(this.f10904f, str2);
        if (!(a10 == null || str3 == null)) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    a10.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (a10 != null) {
            try {
                this.f10904f.startActivity(a10);
            } catch (Throwable th) {
                i4.a(th);
            }
        }
        Runnable runnable = this.f10902d;
        if (runnable != null) {
            runnable.run();
        }
    }

    public n5(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f10899a = false;
        this.f10900b = true;
        this.f10901c = null;
        this.f10902d = null;
        this.f10903e = null;
        this.f10901c = runnable;
        this.f10904f = context;
        this.f10905g = trackingParams;
    }

    public n5(Context context, Runnable runnable, Runnable runnable2, TrackingParams trackingParams) {
        this(context, runnable, trackingParams);
        this.f10902d = runnable2;
    }
}
