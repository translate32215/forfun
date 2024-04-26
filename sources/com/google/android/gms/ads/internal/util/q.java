package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.tm;
import com.google.android.gms.internal.ads.ze;
import e8.di;
import e8.p50;
import e8.vy;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5711a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5712b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5713c;

    public q(Context context, WebSettings webSettings) {
        this.f5712b = context;
        this.f5713c = webSettings;
    }

    private final Object a() {
        Context context = (Context) this.f5712b;
        WebSettings webSettings = (WebSettings) this.f5713c;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }

    public final Object call() {
        switch (this.f5711a) {
            case 0:
                a();
                return Boolean.TRUE;
            case 1:
                return (String) ((p6) this.f5713c).a("getAppInstanceId", (Context) this.f5712b);
            case 2:
                di diVar = (di) this.f5712b;
                diVar.getClass();
                return new l5((Bundle) ((p50) this.f5713c).get(), diVar.f14279b, diVar.f14280c, diVar.f14281d, diVar.f14282e, diVar.f14283f, (String) diVar.f14284g.get().get(), diVar.f14285h, (ze) null, (String) null);
            case 3:
                return ((tm) this.f5713c).f8207b.c((Context) this.f5712b);
            default:
                return new vy((String) ((p50) this.f5712b).get(), (String) ((p50) this.f5713c).get());
        }
    }

    public q(p6 p6Var, Context context) {
        this.f5713c = p6Var;
        this.f5712b = context;
    }

    public q(tm tmVar, Context context) {
        this.f5713c = tmVar;
        this.f5712b = context;
    }

    public q(di diVar, p50 p50) {
        this.f5712b = diVar;
        this.f5713c = p50;
    }

    public q(p50 p50, p50 p502) {
        this.f5712b = p50;
        this.f5713c = p502;
    }
}
