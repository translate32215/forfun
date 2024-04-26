package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.v0;
import java.util.Map;

/* compiled from: Sta */
public class o6 extends g5 {
    public MraidState K = MraidState.LOADING;
    public d L;
    public r6 M;
    public s6 N;
    public TextView O;
    public ImageView P;
    public boolean Q = false;
    public boolean R = false;
    public Handler S = null;

    /* compiled from: Sta */
    public class a implements v0.a {
        public a() {
        }

        public boolean onClickEvent(String str) {
            return o6.this.a(str, true);
        }
    }

    /* compiled from: Sta */
    public class b extends WebChromeClient {
        public b(o6 o6Var) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            try {
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                    i4 i4Var = new i4(j4.f10588e);
                    i4Var.f10537d = "MraidMode.ConsoleError";
                    i4Var.f10538e = consoleMessage.message();
                    i4Var.a();
                }
            } catch (Throwable th) {
                i4.a(th);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* compiled from: Sta */
    public class c extends v6 {
        public c(l6 l6Var) {
            super(l6Var);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (o6.this.K == MraidState.LOADING) {
                wb.a(webView, true, "mraid.setPlacementType", "interstitial");
                o6 o6Var = o6.this;
                q6.a(o6Var.f10351b, webView, o6Var.M);
                o6.this.y();
                o6.this.j();
                o6 o6Var2 = o6.this;
                if (!o6Var2.Q) {
                    o6Var2.w();
                }
                o6 o6Var3 = o6.this;
                MraidState mraidState = MraidState.DEFAULT;
                o6Var3.K = mraidState;
                n6.a(mraidState, webView);
                wb.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
                o6 o6Var4 = o6.this;
                if (o6Var4.R) {
                    o6Var4.L.fireViewableChangeEvent();
                }
                o6 o6Var5 = o6.this;
                Handler handler = o6Var5.S;
                if (handler != null) {
                    handler.post(new p6(o6Var5));
                }
                o6 o6Var6 = o6.this;
                o6Var6.a((View) o6Var6.f10442x);
            }
        }
    }

    /* compiled from: Sta */
    public class d extends v0 {
        public d(v0.a aVar) {
            super(aVar);
        }

        public void close() {
            o6 o6Var = o6.this;
            MraidState mraidState = MraidState.HIDDEN;
            o6Var.K = mraidState;
            n6.a(mraidState, o6Var.f10440v);
            o6.this.I.run();
        }

        public void fireViewableChangeEvent() {
            o6 o6Var = o6.this;
            wb.a(o6Var.f10440v, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(o6Var.R));
        }

        public boolean isFeatureSupported(String str) {
            return o6.this.M.f11663b.contains(str);
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            s6 s6Var = o6.this.N;
            if (s6Var.f11699a != parseBoolean || s6Var.f11700b != s6.a(str)) {
                s6 s6Var2 = o6.this.N;
                s6Var2.f11699a = parseBoolean;
                s6Var2.f11700b = s6.a(str);
                o6 o6Var = o6.this;
                applyOrientationProperties(o6Var.f10351b, o6Var.N);
            }
        }

        public void useCustomClose(String str) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            o6 o6Var = o6.this;
            if (o6Var.Q != parseBoolean) {
                boolean unused = o6Var.Q = parseBoolean;
                if (parseBoolean) {
                    o6 o6Var2 = o6.this;
                    o6Var2.getClass();
                    try {
                        ImageButton imageButton = o6Var2.f10442x;
                        if (imageButton != null) {
                            imageButton.setVisibility(4);
                        }
                    } catch (Throwable th) {
                        i4.a(th);
                    }
                } else {
                    o6.this.w();
                }
            }
        }
    }

    public boolean b(String str) {
        return false;
    }

    public boolean c() {
        if (!x()) {
            return true;
        }
        super.c();
        return false;
    }

    public void e() {
        this.R = false;
        if (this.K == MraidState.DEFAULT) {
            this.L.fireViewableChangeEvent();
        }
        super.e();
    }

    public void f() {
        super.f();
        if (this.S == null && p()) {
            this.S = new Handler();
        }
        this.R = true;
        if (this.K == MraidState.DEFAULT) {
            this.L.fireViewableChangeEvent();
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.A) / 1000;
    }

    public void onClick(View view) {
        if (x()) {
            this.L.close();
        }
    }

    public boolean p() {
        return this.f10368s > 0;
    }

    public void v() {
        this.f10440v.setWebViewClient(new c(this.L));
        this.f10440v.setWebChromeClient(new b(this));
    }

    public final boolean x() {
        return (SystemClock.uptimeMillis() - this.A) / 1000 >= ((long) this.f10368s);
    }

    public final void y() {
        Activity activity = this.f10351b;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            n6.b(activity, i10, i11, this.f10440v);
            n6.a(activity, i10, i11, this.f10440v);
            n6.a(activity, 0, 0, i10, i11, this.f10440v);
            n6.b(activity, 0, 0, i10, i11, this.f10440v);
        } catch (Throwable th) {
            i4.a(th);
        }
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        if (this.M == null) {
            this.M = new r6(this.f10351b);
        }
        if (this.N == null) {
            this.N = new s6(true, 2);
        }
        if (this.L == null) {
            this.L = new d(new a());
        }
    }

    public void a(Configuration configuration) {
        y();
    }

    public boolean a(String str, boolean z10) {
        MraidState mraidState = MraidState.HIDDEN;
        this.K = mraidState;
        n6.a(mraidState, this.f10440v);
        try {
            return super.a(str, z10);
        } catch (Throwable th) {
            i4.a(th);
            return false;
        }
    }

    public void a(RelativeLayout relativeLayout) {
        if (p() && !this.f10369t) {
            int a10 = qb.a((Context) this.f10351b, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(this.f10351b);
            this.P = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setStroke(2, -1);
            int a11 = qb.a((Context) this.f10351b, 32);
            gradientDrawable.setSize(a11, a11);
            imageView.setImageDrawable(gradientDrawable);
            this.P.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.P, layoutParams);
            TextView textView = new TextView(this.f10351b);
            this.O = textView;
            textView.setTextColor(-1);
            this.O.setGravity(17);
            relativeLayout.addView(this.O, layoutParams);
        }
    }
}
