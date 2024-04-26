package com.startapp;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* compiled from: Sta */
public class v6 extends WebViewClient {
    private static final String LOG_TAG = "v6";
    private static final String MRAID_JS = "mraid.js";
    private static final String MRAID_PREFIX = "mraid://";
    private l6 controller;
    private boolean isMraidInjected = false;

    static {
        Class<v6> cls = v6.class;
    }

    public v6(l6 l6Var) {
        this.controller = l6Var;
    }

    @TargetApi(11)
    private WebResourceResponse createMraidInjectionResponse() {
        StringBuilder a10 = b1.a("javascript:");
        a10.append(m6.a());
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(a10.toString().getBytes()));
    }

    public boolean invokeMraidMethod(String str) {
        Class<l6> cls = l6.class;
        String[] strArr = {"close", "resize"};
        String str2 = "useCustomClose";
        String[] strArr2 = {"createCalendarEvent", "expand", "open", "playVideo", "storePicture", str2};
        String[] strArr3 = {"setOrientationProperties", "setResizeProperties"};
        try {
            Map<String, String> a10 = t6.a(str);
            String str3 = a10.get("command");
            if (Arrays.asList(strArr).contains(str3)) {
                cls.getDeclaredMethod(str3, new Class[0]).invoke(this.controller, new Object[0]);
            } else if (Arrays.asList(strArr2).contains(str3)) {
                Method declaredMethod = cls.getDeclaredMethod(str3, new Class[]{String.class});
                char c10 = 65535;
                int hashCode = str3.hashCode();
                if (hashCode != -733616544) {
                    if (hashCode == 1614272768) {
                        if (str3.equals(str2)) {
                            c10 = 1;
                        }
                    }
                } else if (str3.equals("createCalendarEvent")) {
                    c10 = 0;
                }
                if (c10 == 0) {
                    str2 = "eventJSON";
                } else if (c10 != 1) {
                    str2 = "url";
                }
                declaredMethod.invoke(this.controller, new Object[]{a10.get(str2)});
            } else if (Arrays.asList(strArr3).contains(str3)) {
                cls.getDeclaredMethod(str3, new Class[]{Map.class}).invoke(this.controller, new Object[]{a10});
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isMraidUrl(String str) {
        return str != null && str.startsWith(MRAID_PREFIX);
    }

    public boolean matchesInjectionUrl(String str) {
        try {
            return MRAID_JS.equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
        } catch (Exception unused) {
            return false;
        }
    }

    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (this.isMraidInjected || !matchesInjectionUrl(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        this.isMraidInjected = true;
        return createMraidInjectionResponse();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || wb.b(webView.getContext(), str)) {
            return true;
        }
        if (isMraidUrl(str)) {
            return invokeMraidMethod(str);
        }
        return this.controller.open(str);
    }
}
