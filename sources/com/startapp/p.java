package com.startapp;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import vb.a;

/* compiled from: Sta */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final y7 f11544a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f11545b;

    /* renamed from: c  reason: collision with root package name */
    public final List<hc> f11546c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, hc> f11547d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final String f11548e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11549f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11550g;

    /* renamed from: h  reason: collision with root package name */
    public final a f11551h;

    public p(y7 y7Var, WebView webView, String str, List<hc> list, String str2, String str3, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f11546c = arrayList;
        this.f11544a = y7Var;
        this.f11545b = webView;
        this.f11548e = str;
        this.f11551h = aVar;
        if (list != null) {
            arrayList.addAll(list);
            for (hc put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f11547d.put(uuid, put);
            }
        }
        this.f11550g = str2;
        this.f11549f = str3;
    }

    public a a() {
        return this.f11551h;
    }

    public Map<String, hc> b() {
        return Collections.unmodifiableMap(this.f11547d);
    }

    public String c() {
        return this.f11548e;
    }

    public WebView d() {
        return this.f11545b;
    }
}
