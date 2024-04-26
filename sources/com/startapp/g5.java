package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.f3;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Sta */
public class g5 extends f3 implements View.OnClickListener {
    public long A = 0;
    public j9 B;
    public boolean C = true;
    public boolean D = false;
    public int E = 0;
    public boolean F = false;
    public boolean G;
    public q7 H;
    public Runnable I = new a();
    public Runnable J = new b();

    /* renamed from: v  reason: collision with root package name */
    public WebView f10440v;

    /* renamed from: w  reason: collision with root package name */
    public RelativeLayout f10441w;

    /* renamed from: x  reason: collision with root package name */
    public ImageButton f10442x;

    /* renamed from: y  reason: collision with root package name */
    public Long f10443y;

    /* renamed from: z  reason: collision with root package name */
    public Long f10444z;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            g5.this.i();
            g5.this.b();
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            g5 g5Var = g5.this;
            g5Var.C = true;
            WebView webView = g5Var.f10440v;
            if (webView != null) {
                webView.setOnTouchListener((View.OnTouchListener) null);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements View.OnLongClickListener {
        public c(g5 g5Var) {
        }

        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: Sta */
    public class d implements View.OnTouchListener {
        public d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            g5.this.C = true;
            if (motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Sta */
    public class e implements Runnable {
        public e() {
        }

        public void run() {
            g5.this.b();
        }
    }

    /* compiled from: Sta */
    public class f implements Runnable {
        public f() {
        }

        public void run() {
            WebView webView = g5.this.f10440v;
            if (webView != null) {
                a0.a(webView);
            }
        }
    }

    /* compiled from: Sta */
    public class g extends WebViewClient {
        public g() {
        }

        public void onPageFinished(WebView webView, String str) {
            g5.this.a(webView);
            g5 g5Var = g5.this;
            wb.a(g5Var.f10440v, true, "gClientInterface.setMode", g5Var.f10357h);
            Object[] objArr = {"externalLinks"};
            wb.a(g5.this.f10440v, true, "enableScheme", objArr);
            g5.this.r();
            String a10 = com.startapp.sdk.adsbase.a.a(str, (String) null);
            Intent intent = new Intent("com.startapp.android.ShowDisplayBroadcastListener");
            intent.putExtra("dParam", a10);
            if (g5.this.s()) {
                a6.a(webView.getContext()).a(intent);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || wb.b(webView.getContext(), str)) {
                return true;
            }
            if (!g5.this.C) {
                i4 i4Var = new i4(j4.f10588e);
                i4Var.f10537d = "fake_click";
                i4Var.f10540g = g5.this.a();
                StringBuilder a10 = b1.a("jsTag=");
                a10.append(g5.this.F);
                i4Var.f10538e = a10.toString();
                i4Var.a();
            }
            g5 g5Var = g5.this;
            if (!g5Var.F || g5Var.C) {
                return g5Var.a(str, false);
            }
            return false;
        }
    }

    public void a(Bundle bundle) {
        a6.a((Context) this.f10351b).a(this.f10353d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle == null) {
            this.G = true;
            if (this.f10350a.hasExtra("lastLoadTime")) {
                this.f10443y = (Long) this.f10350a.getSerializableExtra("lastLoadTime");
            }
            if (this.f10350a.hasExtra("adCacheTtl")) {
                this.f10444z = (Long) this.f10350a.getSerializableExtra("adCacheTtl");
                return;
            }
            return;
        }
        if (bundle.containsKey("postrollHtml")) {
            a(bundle.getString("postrollHtml"));
        }
        if (bundle.containsKey("lastLoadTime")) {
            this.f10443y = (Long) bundle.getSerializable("lastLoadTime");
        }
        if (bundle.containsKey("adCacheTtl")) {
            this.f10444z = (Long) bundle.getSerializable("adCacheTtl");
        }
        this.D = bundle.getBoolean("videoCompletedBroadcastSent", false);
        this.E = bundle.getInt("replayNum");
    }

    public void a(WebView webView) {
    }

    public void a(RelativeLayout relativeLayout) {
    }

    public void b() {
        this.f10351b.runOnUiThread(new f3.b());
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.f12147o = false;
        j9 j9Var = this.B;
        if (j9Var != null) {
            j9Var.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        }
        this.f10351b.runOnUiThread(new f());
    }

    public boolean c() {
        i();
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.f12147o = false;
        this.B.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        return false;
    }

    public void d() {
        if (this.f10353d != null) {
            a6.a((Context) this.f10351b).a(this.f10353d);
        }
        this.f10353d = null;
        q7 q7Var = this.H;
        if (q7Var != null) {
            q7Var.a();
            this.H = null;
        }
        WebView webView = this.f10440v;
        Map<Activity, Integer> map = wb.f12765a;
        new Handler(Looper.getMainLooper()).postAtTime((Runnable) null, webView, SystemClock.uptimeMillis() + 1000);
    }

    public void e() {
        j9 j9Var = this.B;
        if (j9Var != null) {
            j9Var.a();
        }
        WebView webView = this.f10440v;
        if (webView != null) {
            a0.a(webView);
        }
    }

    public void f() {
        Ad ad2 = this.f10361l;
        if (ad2 instanceof InterstitialAd ? ((InterstitialAd) ad2).d() : false) {
            b();
            return;
        }
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f12173a.f12147o = true;
        if (this.B == null) {
            this.B = new j9(this.f10351b, this.f10358i, n(), m());
        }
        WebView webView = this.f10440v;
        if (webView == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f10351b);
            this.f10441w = relativeLayout;
            relativeLayout.setContentDescription("StartApp Ad");
            this.f10441w.setId(1475346432);
            this.f10351b.setContentView(this.f10441w);
            try {
                WebView b10 = ComponentLocator.a((Context) this.f10351b).w().b();
                this.f10440v = b10;
                b10.setBackgroundColor(-16777216);
                this.f10351b.getWindow().getDecorView().findViewById(16908290).setBackgroundColor(7829367);
                this.f10440v.setVerticalScrollBarEnabled(false);
                this.f10440v.setHorizontalScrollBarEnabled(false);
                this.f10440v.getSettings().setJavaScriptEnabled(true);
                this.f10440v.getSettings().setMediaPlaybackRequiresUserGesture(false);
                if (this.f10370u) {
                    a0.a(this.f10440v, (Paint) null);
                }
                this.f10440v.setOnLongClickListener(new c(this));
                this.f10440v.setLongClickable(false);
                this.f10440v.addJavascriptInterface(l(), "startappwall");
                q();
                b(this.f10440v);
                v();
                wb.a(this.f10440v, this.f10362m);
                this.F = "true".equals(wb.a(this.f10362m, "@jsTag@", "@jsTag@"));
                this.f10441w.addView(this.f10440v, new RelativeLayout.LayoutParams(-1, -1));
                RelativeLayout relativeLayout2 = this.f10441w;
                AdInformationObject adInformationObject = new AdInformationObject(this.f10351b, AdInformationObject.Size.LARGE, this.f10363n, this.f10364o, this.f10361l.getConsentData());
                this.f10352c = adInformationObject;
                adInformationObject.a(relativeLayout2);
            } catch (Throwable th) {
                i4.a(th);
                b();
            }
        } else {
            a0.b(webView);
            this.B.b();
        }
        this.A = SystemClock.uptimeMillis();
    }

    public void i() {
        String[] strArr = this.f10354e;
        if (strArr != null && strArr.length > 0 && strArr[0] != null) {
            com.startapp.sdk.adsbase.a.a((Context) this.f10351b, strArr[0], o());
        }
    }

    public void j() {
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f10351b);
            ImageButton imageButton = new ImageButton(this.f10351b);
            this.f10442x = imageButton;
            imageButton.setBackgroundColor(0);
            this.f10442x.setOnClickListener(this);
            int a10 = qb.a((Context) this.f10351b, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f10442x, layoutParams);
            a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f10441w.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.A) / 1000;
    }

    public n5 l() {
        Activity activity = this.f10351b;
        Runnable runnable = this.I;
        Runnable runnable2 = this.J;
        n5 n5Var = new n5((Context) activity, runnable, o(), a(0));
        n5Var.f10902d = runnable;
        n5Var.f10903e = runnable2;
        return n5Var;
    }

    public long m() {
        Long l10 = this.f10366q;
        if (l10 != null) {
            return TimeUnit.SECONDS.toMillis(l10.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f12393k.p());
    }

    public TrackingParams n() {
        return new TrackingParams(this.f10365p);
    }

    public TrackingParams o() {
        return new CloseTrackingParams(k(), this.f10365p);
    }

    public void onClick(View view) {
    }

    public boolean p() {
        return false;
    }

    public void q() {
        this.B.b();
    }

    public void r() {
        a((View) this.f10442x);
    }

    public boolean s() {
        return this.G;
    }

    public void t() {
    }

    public void u() {
        if (p() && !this.D && this.E == 0) {
            this.D = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", a());
            a6.a((Context) this.f10351b).a(intent);
            t();
        }
    }

    public void v() {
        this.f10440v.setWebViewClient(new g());
    }

    public void w() {
        try {
            if (this.f10442x != null) {
                this.f10442x.setImageDrawable(new BitmapDrawable(this.f10351b.getResources(), g1.a("iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC")));
                this.f10442x.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f10442x.setVisibility(0);
            }
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    public void b(WebView webView) {
        this.C = false;
        webView.setOnTouchListener(new d());
    }

    public void b(Bundle bundle) {
        String str = this.f10362m;
        if (str != null) {
            bundle.putString("postrollHtml", str);
        }
        Long l10 = this.f10443y;
        if (l10 != null) {
            bundle.putLong("lastLoadTime", l10.longValue());
        }
        Long l11 = this.f10444z;
        if (l11 != null) {
            bundle.putLong("adCacheTtl", l11.longValue());
        }
        bundle.putBoolean("videoCompletedBroadcastSent", this.D);
        bundle.putInt("replayNum", this.E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[SYNTHETIC, Splitter:B:11:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            com.startapp.j9 r0 = r5.B
            r1 = 0
            r0.a(r1, r1)
            com.startapp.sdk.adsbase.Ad r0 = r5.f10361l
            android.app.Activity r1 = r5.f10351b
            android.content.Context r1 = com.startapp.j0.a(r1)
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            android.app.Activity r1 = r5.f10351b
        L_0x0013:
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r2 = r5.f10363n
            boolean r1 = com.startapp.sdk.adsbase.a.a((android.content.Context) r1, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0025
            java.util.Map<android.app.Activity, java.lang.Integer> r1 = com.startapp.wb.f12765a
            boolean r0 = r0 instanceof com.startapp.sdk.ads.splash.SplashAd
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            boolean r1 = r5.b((java.lang.String) r6)
            if (r1 == 0) goto L_0x0045
            int r1 = com.startapp.sdk.adsbase.a.a((java.lang.String) r6)     // Catch:{ all -> 0x0040 }
            boolean[] r4 = r5.f10355f     // Catch:{ all -> 0x0040 }
            boolean r4 = r4[r1]     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x003c
            if (r0 != 0) goto L_0x003c
            r5.b(r6, r1, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0054
        L_0x003c:
            r5.a(r6, r1, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0054
        L_0x0040:
            r6 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r6)
            return r3
        L_0x0045:
            boolean[] r1 = r5.f10355f
            boolean r1 = r1[r3]
            if (r1 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0051
            r5.b(r6, r3, r7)
            goto L_0x0054
        L_0x0051:
            r5.a(r6, r3, r7)
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.g5.a(java.lang.String, boolean):boolean");
    }

    public boolean b(String str) {
        return !this.F && str.contains("index=");
    }

    public final void b(String str, int i10, boolean z10) {
        e eVar;
        int i11 = i10;
        boolean k10 = MetaData.f12393k.k();
        Activity activity = this.f10351b;
        String[] strArr = this.f10359j;
        boolean z11 = false;
        String[] strArr2 = i11 < strArr.length ? new String[]{strArr[i11]} : null;
        String[] strArr3 = this.f10360k;
        String str2 = i11 < strArr3.length ? strArr3[i11] : null;
        TrackingParams o10 = o();
        long z12 = AdsCommonMetaData.f12098h.z();
        long y10 = AdsCommonMetaData.f12098h.y();
        boolean a10 = a(i11);
        Boolean[] boolArr = this.f10367r;
        Boolean bool = (boolArr == null || i11 < 0 || i11 >= boolArr.length) ? null : boolArr[i11];
        if (!k10) {
            Ad ad2 = this.f10361l;
            if (ad2 instanceof InterstitialAd) {
                z11 = ((InterstitialAd) ad2).u();
            }
            if (!z11) {
                eVar = null;
                com.startapp.sdk.adsbase.a.a(activity, str, strArr2, str2, o10, z12, y10, a10, bool, z10, eVar);
            }
        }
        eVar = new e();
        com.startapp.sdk.adsbase.a.a(activity, str, strArr2, str2, o10, z12, y10, a10, bool, z10, eVar);
    }

    public final void a(String str, int i10, boolean z10) {
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", a());
        a6.a((Context) this.f10351b).a(intent);
        Context a10 = j0.a(this.f10351b);
        if (a10 == null) {
            a10 = this.f10351b;
        }
        boolean a11 = com.startapp.sdk.adsbase.a.a(a10, this.f10363n);
        Activity activity = this.f10351b;
        String[] strArr = this.f10359j;
        boolean z11 = false;
        com.startapp.sdk.adsbase.a.a((Context) activity, str, i10 < strArr.length ? new String[]{strArr[i10]} : null, o(), a(i10) && !a11, z10);
        if (!MetaData.f12393k.k()) {
            Ad ad2 = this.f10361l;
            if (ad2 instanceof InterstitialAd) {
                z11 = ((InterstitialAd) ad2).u();
            }
            if (!z11) {
                return;
            }
        }
        b();
    }

    public void a(View view) {
        AdInformationView adInformationView;
        if (MetaData.f12393k.S()) {
            q7 q7Var = new q7(this.f10440v);
            this.H = q7Var;
            if (q7Var.c()) {
                try {
                    AdInformationObject adInformationObject = this.f10352c;
                    if (!(adInformationObject == null || (adInformationView = adInformationObject.f12186b) == null)) {
                        this.H.a(adInformationView, vb.c.OTHER, (String) null);
                    }
                    if (view != null) {
                        this.H.a(view, vb.c.CLOSE_AD, (String) null);
                    }
                } catch (RuntimeException unused) {
                }
                this.H.a(this.f10440v);
                this.H.e();
                this.H.d();
                this.H.b();
            }
        }
    }
}
