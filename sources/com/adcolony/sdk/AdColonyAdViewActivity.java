package com.adcolony.sdk;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import mb.a;
import mb.h;
import ob.b;
import org.json.JSONObject;
import t2.l;

public class AdColonyAdViewActivity extends l {

    /* renamed from: r  reason: collision with root package name */
    public b f4408r;

    public AdColonyAdViewActivity() {
        b bVar;
        if (!f.f()) {
            bVar = null;
        } else {
            bVar = f.d().f4669m;
        }
        this.f4408r = bVar;
    }

    public void f() {
        ViewParent parent = this.f25501a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f25501a);
        }
        b bVar = this.f4408r;
        if (bVar.f4435s || bVar.f4437u) {
            float f10 = f.d().i().f();
            bVar.f4427c.getClass();
            bVar.f4427c.getClass();
            bVar.f4425a.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) 320) * f10), (int) (((float) 50) * f10)));
            q0 webView = bVar.getWebView();
            if (webView != null) {
                g gVar = new g("WebView.set_bounds", 0);
                JSONObject jSONObject = new JSONObject();
                r0.j(jSONObject, "x", webView.f4731v);
                r0.j(jSONObject, "y", webView.f4733x);
                r0.j(jSONObject, "width", webView.f4735z);
                r0.j(jSONObject, "height", webView.B);
                gVar.f4485b = jSONObject;
                webView.e(gVar);
                JSONObject jSONObject2 = new JSONObject();
                r0.e(jSONObject2, "ad_session_id", bVar.f4428d);
                new g("MRAID.on_close", bVar.f4425a.f4513s, jSONObject2).b();
            }
            ImageView imageView = bVar.f4432h;
            if (imageView != null) {
                bVar.f4425a.removeView(imageView);
                h hVar = bVar.f4425a;
                ImageView imageView2 = bVar.f4432h;
                a aVar = hVar.F;
                if (!(aVar == null || imageView2 == null)) {
                    try {
                        h hVar2 = (h) aVar;
                        if (!hVar2.f21785g) {
                            b e10 = hVar2.e(imageView2);
                            if (e10 != null) {
                                hVar2.f21781c.remove(e10);
                            }
                        }
                    } catch (RuntimeException unused) {
                    }
                }
            }
            bVar.addView(bVar.f4425a);
        }
        f.d().f4669m = null;
        finish();
    }

    public void onBackPressed() {
        f();
    }

    public void onCreate(Bundle bundle) {
        b bVar;
        if (!f.f() || (bVar = this.f4408r) == null) {
            f.d().f4669m = null;
            finish();
            return;
        }
        this.f25502b = bVar.getOrientation();
        super.onCreate(bundle);
        this.f4408r.a();
        this.f4408r.getListener();
    }
}
