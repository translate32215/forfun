package com.startapp;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import java.util.HashMap;

/* compiled from: Sta */
public class a4 extends f3 implements View.OnClickListener {
    public static boolean B = false;
    public String A;

    /* renamed from: v  reason: collision with root package name */
    public RelativeLayout f10022v;

    /* renamed from: w  reason: collision with root package name */
    public NavigationBarLayout f10023w;

    /* renamed from: x  reason: collision with root package name */
    public WebView f10024x;

    /* renamed from: y  reason: collision with root package name */
    public AnimatingProgressBar f10025y;

    /* renamed from: z  reason: collision with root package name */
    public FrameLayout f10026z;

    /* compiled from: Sta */
    public class a extends WebChromeClient {
        public a() {
        }

        public void onProgressChanged(WebView webView, int i10) {
            a4.this.f10025y.setProgress(i10);
        }

        public void onReceivedTitle(WebView webView, String str) {
            if (str != null && !str.equals("")) {
                a4.this.f10023w.f12545f.setText(str);
            }
        }
    }

    /* compiled from: Sta */
    public static class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public Context f10028a;

        /* renamed from: b  reason: collision with root package name */
        public a4 f10029b;

        /* renamed from: c  reason: collision with root package name */
        public NavigationBarLayout f10030c;

        /* renamed from: d  reason: collision with root package name */
        public AnimatingProgressBar f10031d;

        /* renamed from: e  reason: collision with root package name */
        public int f10032e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10033f = false;

        public b(Context context, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, a4 a4Var) {
            this.f10028a = context;
            this.f10031d = animatingProgressBar;
            this.f10030c = navigationBarLayout;
            this.f10029b = a4Var;
        }

        public void onPageFinished(WebView webView, String str) {
            if (!a4.B) {
                this.f10030c.a(webView);
                int i10 = this.f10032e - 1;
                this.f10032e = i10;
                if (i10 == 0) {
                    this.f10033f = false;
                    this.f10031d.a();
                    if (this.f10031d.isShown()) {
                        this.f10031d.setVisibility(8);
                    }
                    this.f10030c.a(webView);
                }
                super.onPageFinished(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!a4.B) {
                if (this.f10033f) {
                    this.f10032e = 1;
                    this.f10031d.a();
                    this.f10030c.a(webView);
                } else {
                    this.f10032e = Math.max(this.f10032e, 1);
                }
                this.f10031d.setVisibility(0);
                this.f10030c.f12546g.setText(str);
                this.f10030c.a(webView);
                super.onPageStarted(webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            this.f10031d.a();
            super.onReceivedError(webView, i10, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView != null && str != null && !wb.b(webView.getContext(), str) && !a4.B) {
                if (!this.f10033f) {
                    this.f10033f = true;
                    this.f10031d.a();
                    this.f10032e = 0;
                }
                this.f10032e++;
                if (com.startapp.sdk.adsbase.a.c(str) && !com.startapp.sdk.adsbase.a.b(str)) {
                    return false;
                }
                this.f10032e = 1;
                com.startapp.sdk.adsbase.a.b(this.f10028a, str, (String) null);
                a4 a4Var = this.f10029b;
                if (a4Var != null) {
                    a4Var.i();
                }
            }
            return true;
        }
    }

    public a4(String str) {
        this.A = str;
    }

    public void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        a6.a((Context) this.f10351b).a(this.f10353d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        B = false;
        this.f10022v = new RelativeLayout(this.f10351b);
        String str = this.A;
        if (this.f10023w == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f10351b);
            this.f10023w = navigationBarLayout;
            navigationBarLayout.setDescendantFocusability(262144);
            navigationBarLayout.setBackgroundColor(Color.parseColor("#e9e9e9"));
            navigationBarLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, qb.a(navigationBarLayout.getContext(), 60)));
            navigationBarLayout.setId(2101);
            HashMap hashMap = new HashMap();
            hashMap.put("BACK", new f7((Bitmap) null, 14, 22, "back_.png"));
            hashMap.put("BACK_DARK", new f7((Bitmap) null, 14, 22, "back_dark.png"));
            hashMap.put("FORWARD", new f7((Bitmap) null, 14, 22, "forward_.png"));
            hashMap.put("FORWARD_DARK", new f7((Bitmap) null, 14, 22, "forward_dark.png"));
            hashMap.put("X", new f7((Bitmap) null, 23, 23, "x_dark.png"));
            hashMap.put("BROWSER", new f7((Bitmap) null, 28, 28, "browser_icon_dark.png"));
            navigationBarLayout.f12548i = hashMap;
            NavigationBarLayout navigationBarLayout2 = this.f10023w;
            navigationBarLayout2.getClass();
            Typeface typeface = Typeface.DEFAULT;
            Typeface typeface2 = typeface;
            navigationBarLayout2.f12545f = qb.a(navigationBarLayout2.getContext(), navigationBarLayout2.f12545f, typeface2, 1, 16.46f, NavigationBarLayout.f12538j, 2102);
            navigationBarLayout2.f12546g = qb.a(navigationBarLayout2.getContext(), navigationBarLayout2.f12545f, typeface2, 1, 12.12f, NavigationBarLayout.f12539k, 2107);
            navigationBarLayout2.f12545f.setText("Loading...");
            RelativeLayout relativeLayout = new RelativeLayout(navigationBarLayout2.getContext());
            navigationBarLayout2.f12540a = relativeLayout;
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            navigationBarLayout2.f12540a.addView(navigationBarLayout2.f12545f, qb.a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]));
            RelativeLayout relativeLayout2 = navigationBarLayout2.f12540a;
            TextView textView = navigationBarLayout2.f12546g;
            RelativeLayout.LayoutParams a10 = qb.a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]);
            a10.addRule(3, 2102);
            relativeLayout2.addView(textView, a10);
            for (f7 next : navigationBarLayout2.f12548i.values()) {
                Bitmap a11 = e1.a(navigationBarLayout2.getContext(), next.f10381d);
                if (a11 != null) {
                    next.f10378a = Bitmap.createScaledBitmap(a11, qb.a(navigationBarLayout2.getContext(), next.f10379b), qb.a(navigationBarLayout2.getContext(), next.f10380c), true);
                }
            }
            navigationBarLayout2.f12541b = qb.a(navigationBarLayout2.getContext(), navigationBarLayout2.f12541b, navigationBarLayout2.f12548i.get("X").f10378a, 2103);
            navigationBarLayout2.f12543d = qb.a(navigationBarLayout2.getContext(), navigationBarLayout2.f12543d, navigationBarLayout2.f12548i.get("BROWSER").f10378a, 2104);
            navigationBarLayout2.f12544e = qb.a(navigationBarLayout2.getContext(), navigationBarLayout2.f12544e, navigationBarLayout2.f12548i.get("BACK").f10378a, 2105);
            navigationBarLayout2.f12542c = qb.a(navigationBarLayout2.getContext(), navigationBarLayout2.f12542c, navigationBarLayout2.f12548i.get("FORWARD").f10378a, 2106);
            int a12 = qb.a(navigationBarLayout2.getContext(), 10);
            navigationBarLayout2.f12542c.setPadding(a12, a12, a12, a12);
            navigationBarLayout2.f12542c.setEnabled(false);
            navigationBarLayout2.f12544e.setPadding(a12, a12, a12, a12);
            navigationBarLayout2.addView(navigationBarLayout2.f12541b, qb.a(navigationBarLayout2.getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
            ImageView imageView = navigationBarLayout2.f12543d;
            RelativeLayout.LayoutParams a13 = qb.a(navigationBarLayout2.getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
            a13.addRule(0, 2103);
            navigationBarLayout2.addView(imageView, a13);
            RelativeLayout relativeLayout3 = navigationBarLayout2.f12540a;
            RelativeLayout.LayoutParams a14 = qb.a(navigationBarLayout2.getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
            a14.addRule(0, 2104);
            navigationBarLayout2.addView(relativeLayout3, a14);
            this.f10023w.setButtonsListener(this);
        }
        this.f10022v.addView(this.f10023w);
        this.f10025y = new AnimatingProgressBar(this.f10351b, (AttributeSet) null, 16842872);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f10025y.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f10025y.setBackgroundColor(-1);
        this.f10025y.setId(2108);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, qb.a((Context) this.f10351b, 4));
        layoutParams.addRule(3, 2101);
        this.f10022v.addView(this.f10025y, layoutParams);
        this.f10026z = new FrameLayout(this.f10351b);
        if (this.f10024x == null) {
            try {
                j();
                this.f10024x.loadUrl(str);
            } catch (Throwable th) {
                i4.a(th);
                this.f10023w.a();
                com.startapp.sdk.adsbase.a.b(this.f10351b, str, (String) null);
                this.f10351b.finish();
            }
        }
        this.f10026z.addView(this.f10024x);
        this.f10026z.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, 2108);
        this.f10022v.addView(this.f10026z, layoutParams2);
        if (bundle2 != null) {
            this.f10024x.restoreState(bundle2);
        }
        this.f10351b.setContentView(this.f10022v, new RelativeLayout.LayoutParams(-2, -2));
    }

    public void b(Bundle bundle) {
        this.f10024x.saveState(bundle);
    }

    public void e() {
    }

    public void f() {
    }

    public void i() {
        try {
            B = true;
            this.f10024x.stopLoading();
            this.f10024x.removeAllViews();
            this.f10024x.postInvalidate();
            a0.a(this.f10024x);
            this.f10024x.destroy();
            this.f10024x = null;
        } catch (Exception unused) {
        }
        this.f10023w.a();
        this.f10351b.finish();
    }

    public final void j() {
        WebView b10 = ComponentLocator.a((Context) this.f10351b).w().b();
        this.f10024x = b10;
        b10.getSettings().setJavaScriptEnabled(true);
        this.f10024x.getSettings().setUseWideViewPort(true);
        this.f10024x.getSettings().setLoadWithOverviewMode(true);
        this.f10024x.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f10024x.getSettings().setBuiltInZoomControls(true);
        this.f10024x.getSettings().setDisplayZoomControls(false);
        this.f10024x.setWebViewClient(new b(this.f10351b, this.f10023w, this.f10025y, this));
        this.f10024x.setWebChromeClient(new a());
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case 2103:
                i();
                return;
            case 2104:
                WebView webView = this.f10024x;
                if (webView != null) {
                    com.startapp.sdk.adsbase.a.b(this.f10351b, webView.getUrl(), (String) null);
                    i();
                    return;
                }
                return;
            case 2105:
                WebView webView2 = this.f10024x;
                if (webView2 != null && webView2.canGoBack()) {
                    this.f10025y.a();
                    this.f10024x.goBack();
                    return;
                }
                return;
            case 2106:
                WebView webView3 = this.f10024x;
                if (webView3 != null && webView3.canGoForward()) {
                    this.f10025y.a();
                    this.f10024x.goForward();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean a(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return false;
        }
        WebView webView = this.f10024x;
        if (webView == null || !webView.canGoBack()) {
            i();
            return true;
        }
        this.f10025y.a();
        this.f10024x.goBack();
        return true;
    }
}
