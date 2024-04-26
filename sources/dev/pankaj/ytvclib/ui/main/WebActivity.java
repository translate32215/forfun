package dev.pankaj.ytvclib.ui.main;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import ce.i;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.data.model.Stream;
import kd.o;
import tc.g;
import ud.k;

/* compiled from: WebActivity.kt */
public final class WebActivity extends vc.a<g> {
    public static final /* synthetic */ int J = 0;
    public dev.pankaj.ytvclib.utils.b I;

    /* compiled from: WebActivity.kt */
    public final class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public View f13459a;

        /* renamed from: b  reason: collision with root package name */
        public WebChromeClient.CustomViewCallback f13460b;

        /* renamed from: c  reason: collision with root package name */
        public int f13461c;

        /* renamed from: d  reason: collision with root package name */
        public int f13462d;

        public a() {
        }

        public Bitmap getDefaultVideoPoster() {
            if (this.f13459a == null) {
                return null;
            }
            return BitmapFactory.decodeResource(WebActivity.this.getApplicationContext().getResources(), 2130837573);
        }

        public void onHideCustomView() {
            ((FrameLayout) WebActivity.this.getWindow().getDecorView()).removeView(this.f13459a);
            this.f13459a = null;
            WebActivity.this.getWindow().getDecorView().setSystemUiVisibility(this.f13462d);
            WebActivity.this.setRequestedOrientation(this.f13461c);
            WebChromeClient.CustomViewCallback customViewCallback = this.f13460b;
            k.c(customViewCallback);
            customViewCallback.onCustomViewHidden();
            this.f13460b = null;
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            k.f(view, "paramView");
            k.f(customViewCallback, "paramCustomViewCallback");
            if (this.f13459a != null) {
                onHideCustomView();
                return;
            }
            this.f13459a = view;
            this.f13462d = WebActivity.this.getWindow().getDecorView().getSystemUiVisibility();
            this.f13461c = WebActivity.this.getRequestedOrientation();
            this.f13460b = customViewCallback;
            ((FrameLayout) WebActivity.this.getWindow().getDecorView()).addView(this.f13459a, new FrameLayout.LayoutParams(-1, -1));
            WebActivity.this.getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

    /* compiled from: WebActivity.kt */
    public final class b extends WebViewClient {
        public b(WebActivity webActivity) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return str == null || (!i.h(str, "http://", false, 2) && !i.h(str, "https://", false, 2));
        }
    }

    /* compiled from: WebActivity.kt */
    public static final class c implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebView f13464a;

        public c(WebView webView) {
            this.f13464a = webView;
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            k.f(view, "v");
            k.f(keyEvent, "event");
            if (i10 != 4 || keyEvent.getAction() != 1 || !this.f13464a.canGoBack()) {
                return false;
            }
            this.f13464a.goBack();
            return true;
        }
    }

    public WebActivity() {
        super(R.layout.activity_web);
    }

    public void onBackPressed() {
        dev.pankaj.ytvclib.utils.b bVar = this.I;
        if (bVar != null) {
            bVar.g();
            this.f329g.b();
            return;
        }
        k.l("adUtil");
        throw null;
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    public void onCreate(Bundle bundle) {
        o oVar;
        this.I = dev.pankaj.ytvclib.utils.b.f13468i.a(this, this.D);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(128);
        getWindow().getDecorView().setSystemUiVisibility(6);
        super.onCreate(bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new androidx.activity.c(this), 5000);
        WebView webView = ((g) L()).f25901x;
        webView.setWebViewClient(new b(this));
        webView.setWebChromeClient(new a());
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setOnKeyListener(new c(webView));
        WebSettings settings = ((g) L()).f25901x.getSettings();
        boolean z10 = true;
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportZoom(false);
        settings.setSupportMultipleWindows(true);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setDomStorageEnabled(true);
        Stream stream = (Stream) getIntent().getParcelableExtra("stream");
        if (stream == null) {
            oVar = null;
        } else {
            k.f(k.j("url ", stream), "msg");
            if (stream.getUserAgent().length() <= 0) {
                z10 = false;
            }
            if (z10) {
                ((g) L()).f25901x.getSettings().setUserAgentString(stream.getUserAgent());
            }
            ((g) L()).f25901x.loadUrl(stream.getUrl(), stream.getHeaders());
            oVar = o.f20627a;
        }
        if (oVar == null) {
            String string = getString(R.string.error_message);
            k.e(string, "getString(R.string.error_message)");
            k.f(this, "<this>");
            k.f(string, "text");
            Toast.makeText(this, string, 0).show();
        }
    }

    public void onDestroy() {
        ((g) L()).f25901x.destroy();
        super.onDestroy();
    }

    public void onPause() {
        ((g) L()).f25901x.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        ((g) L()).f25901x.onResume();
    }
}
