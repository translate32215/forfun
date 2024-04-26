package com.startapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.wb;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
public class ld {

    /* renamed from: a  reason: collision with root package name */
    public final md f10820a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<WeakReference<WebView>> f10821b = new LinkedList();

    /* compiled from: Sta */
    public class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f10822a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f10823b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WebView f10824c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ wb.a f10825d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AtomicLong f10826e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f10827f;

        /* renamed from: com.startapp.ld$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0117a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f10829a;

            public C0117a(long j10) {
                this.f10829a = j10;
            }

            public void run() {
                if (a.this.f10823b.compareAndSet(false, true)) {
                    a aVar = a.this;
                    ld.this.a(aVar.f10824c);
                    a aVar2 = a.this;
                    aVar2.f10825d.a(false, aVar2.f10826e.get(), this.f10829a, true);
                }
            }
        }

        /* compiled from: Sta */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10831a;

            public b(String str) {
                this.f10831a = str;
            }

            public void run() {
                if (a.this.f10823b.compareAndSet(false, true)) {
                    a aVar = a.this;
                    ld.this.a(aVar.f10824c);
                    a.this.f10825d.a(3, String.valueOf(this.f10831a));
                }
            }
        }

        public a(Handler handler, AtomicBoolean atomicBoolean, WebView webView, wb.a aVar, AtomicLong atomicLong, int i10) {
            this.f10822a = handler;
            this.f10823b = atomicBoolean;
            this.f10824c = webView;
            this.f10825d = aVar;
            this.f10826e = atomicLong;
            this.f10827f = i10;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            long a10 = wb.a();
            this.f10822a.removeCallbacksAndMessages((Object) null);
            this.f10822a.postDelayed(new C0117a(a10), (long) this.f10827f);
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            this.f10822a.removeCallbacksAndMessages((Object) null);
            this.f10822a.post(new b(str));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || wb.b(webView.getContext(), str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f10833a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WebView f10834b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ wb.a f10835c;

        public b(AtomicBoolean atomicBoolean, WebView webView, wb.a aVar) {
            this.f10833a = atomicBoolean;
            this.f10834b = webView;
            this.f10835c = aVar;
        }

        public void run() {
            if (this.f10833a.compareAndSet(false, true)) {
                ld.this.a(this.f10834b);
                this.f10835c.a(2, "Unknown error");
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f10837a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WebView f10838b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ wb.a f10839c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AtomicLong f10840d;

        public c(AtomicBoolean atomicBoolean, WebView webView, wb.a aVar, AtomicLong atomicLong) {
            this.f10837a = atomicBoolean;
            this.f10838b = webView;
            this.f10839c = aVar;
            this.f10840d = atomicLong;
        }

        public void run() {
            if (this.f10837a.compareAndSet(false, true)) {
                ld.this.a(this.f10838b);
                this.f10839c.a(false, this.f10840d.get(), wb.a(), false);
            }
        }
    }

    public ld(Context context, md mdVar) {
        this.f10820a = mdVar;
    }

    public void a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl("about:blank");
        if (this.f10821b.size() < 3) {
            this.f10821b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void a(String str, wb.a aVar) {
        int i10;
        String str2 = str;
        wb.a aVar2 = aVar;
        if ("true".equals(wb.a(str2, "@doNotRender@", "@doNotRender@"))) {
            aVar.a(true, 0, 0, false);
            return;
        }
        WebView webView = null;
        while (webView == null) {
            try {
                if (this.f10821b.size() <= 0) {
                    break;
                }
                WeakReference poll = this.f10821b.poll();
                if (poll != null) {
                    webView = (WebView) poll.get();
                }
            } catch (Throwable th) {
                i4.a(th);
                aVar2.a(1, "WebView instantiation Error");
                return;
            }
        }
        if (webView == null) {
            webView = this.f10820a.b();
        }
        WebView webView2 = webView;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Handler handler = new Handler(Looper.getMainLooper());
        AtomicLong atomicLong = new AtomicLong();
        if (AdsConstants.f12104f.booleanValue()) {
            webView2.getSettings().setBlockNetworkImage(false);
            webView2.getSettings().setLoadsImagesAutomatically(true);
            webView2.getSettings().setJavaScriptEnabled(true);
            i10 = 25000;
        } else {
            i10 = 0;
        }
        webView2.setWebChromeClient(new WebChromeClient());
        a aVar3 = r1;
        AtomicLong atomicLong2 = atomicLong;
        a aVar4 = new a(handler, atomicBoolean, webView2, aVar, atomicLong, i10);
        webView2.setWebViewClient(aVar3);
        atomicLong2.set(wb.a());
        if (!wb.a(webView2, str2)) {
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(new b(atomicBoolean, webView2, aVar2));
            return;
        }
        handler.postDelayed(new c(atomicBoolean, webView2, aVar, atomicLong2), 25000);
    }
}
