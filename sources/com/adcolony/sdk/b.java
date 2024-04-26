package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import mb.d;
import org.json.JSONObject;
import t2.e;
import t2.f;

public class b extends FrameLayout {
    public int A;

    /* renamed from: a  reason: collision with root package name */
    public h f4425a = f.d().g().f4525a.get(this.f4428d);

    /* renamed from: b  reason: collision with root package name */
    public f f4426b;

    /* renamed from: c  reason: collision with root package name */
    public e f4427c;

    /* renamed from: d  reason: collision with root package name */
    public String f4428d;

    /* renamed from: e  reason: collision with root package name */
    public String f4429e;

    /* renamed from: f  reason: collision with root package name */
    public String f4430f;

    /* renamed from: g  reason: collision with root package name */
    public String f4431g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f4432h;

    /* renamed from: i  reason: collision with root package name */
    public r f4433i;

    /* renamed from: r  reason: collision with root package name */
    public g f4434r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4435s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4436t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4437u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4438v;

    /* renamed from: w  reason: collision with root package name */
    public int f4439w;

    /* renamed from: x  reason: collision with root package name */
    public int f4440x;

    /* renamed from: y  reason: collision with root package name */
    public int f4441y;

    /* renamed from: z  reason: collision with root package name */
    public int f4442z;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f4443a;

        public a(b bVar, Context context) {
            this.f4443a = context;
        }

        public void onClick(View view) {
            Context context = this.f4443a;
            if (context instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) context).f();
            }
        }
    }

    public b(Context context, g gVar, f fVar) {
        super(context);
        this.f4426b = fVar;
        this.f4429e = fVar.f25471a;
        JSONObject jSONObject = gVar.f4485b;
        this.f4428d = jSONObject.optString("id");
        this.f4430f = jSONObject.optString("close_button_filepath");
        this.f4435s = jSONObject.optBoolean("trusted_demand_source");
        this.f4438v = jSONObject.optBoolean("close_button_snap_to_webview");
        this.f4442z = jSONObject.optInt("close_button_width");
        this.A = jSONObject.optInt("close_button_height");
        this.f4427c = fVar.f25472b;
        h hVar = this.f4425a;
        setLayoutParams(new FrameLayout.LayoutParams(hVar.f4510h, hVar.f4511i));
        setBackgroundColor(0);
        addView(this.f4425a);
    }

    public boolean a() {
        if (this.f4435s || this.f4437u) {
            w i10 = f.d().i();
            int h10 = i10.h();
            int g10 = i10.g();
            int i11 = this.f4440x;
            if (i11 <= 0) {
                i11 = h10;
            }
            int i12 = this.f4441y;
            if (i12 <= 0) {
                i12 = g10;
            }
            int i13 = (h10 - i11) / 2;
            int i14 = (g10 - i12) / 2;
            this.f4425a.setLayoutParams(new FrameLayout.LayoutParams(h10, g10));
            q0 webView = getWebView();
            if (webView != null) {
                g gVar = new g("WebView.set_bounds", 0);
                JSONObject jSONObject = new JSONObject();
                r0.j(jSONObject, "x", i13);
                r0.j(jSONObject, "y", i14);
                r0.j(jSONObject, "width", i11);
                r0.j(jSONObject, "height", i12);
                gVar.f4485b = jSONObject;
                webView.e(gVar);
                float f10 = i10.f();
                JSONObject jSONObject2 = new JSONObject();
                r0.j(jSONObject2, "app_orientation", j0.q(j0.t()));
                r0.j(jSONObject2, "width", (int) (((float) i11) / f10));
                r0.j(jSONObject2, "height", (int) (((float) i12) / f10));
                r0.j(jSONObject2, "x", j0.b(webView));
                r0.j(jSONObject2, "y", j0.j(webView));
                r0.e(jSONObject2, "ad_session_id", this.f4428d);
                new g("MRAID.on_size_change", this.f4425a.f4513s, jSONObject2).b();
            }
            ImageView imageView = this.f4432h;
            if (imageView != null) {
                this.f4425a.removeView(imageView);
            }
            Context context = f.f4478a;
            if (!(context == null || this.f4436t || webView == null)) {
                float f11 = f.d().i().f();
                int i15 = (int) (((float) this.f4442z) * f11);
                int i16 = (int) (((float) this.A) * f11);
                boolean z10 = this.f4438v;
                if (z10) {
                    h10 = webView.f4730u + webView.f4734y;
                }
                int i17 = z10 ? webView.f4732w : 0;
                ImageView imageView2 = new ImageView(context.getApplicationContext());
                this.f4432h = imageView2;
                imageView2.setImageURI(Uri.fromFile(new File(this.f4430f)));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
                layoutParams.setMargins(h10 - i15, i17, 0, 0);
                this.f4432h.setOnClickListener(new a(this, context));
                this.f4425a.addView(this.f4432h, layoutParams);
                this.f4425a.a(this.f4432h, d.CLOSE_AD);
            }
            if (this.f4434r != null) {
                JSONObject jSONObject3 = new JSONObject();
                r0.k(jSONObject3, "success", true);
                this.f4434r.a(jSONObject3).b();
                this.f4434r = null;
            }
            return true;
        }
        if (this.f4434r != null) {
            JSONObject jSONObject4 = new JSONObject();
            r0.k(jSONObject4, "success", false);
            this.f4434r.a(jSONObject4).b();
            this.f4434r = null;
        }
        return false;
    }

    public e getAdSize() {
        return this.f4427c;
    }

    public String getClickOverride() {
        return this.f4431g;
    }

    public h getContainer() {
        return this.f4425a;
    }

    public f getListener() {
        return this.f4426b;
    }

    public r getOmidManager() {
        return this.f4433i;
    }

    public int getOrientation() {
        return this.f4439w;
    }

    public boolean getTrustedDemandSource() {
        return this.f4435s;
    }

    public boolean getUserInteraction() {
        return this.f4437u;
    }

    public q0 getWebView() {
        h hVar = this.f4425a;
        if (hVar == null) {
            return null;
        }
        return hVar.f4505c.get(2);
    }

    public String getZoneId() {
        return this.f4429e;
    }

    public void setClickOverride(String str) {
        this.f4431g = str;
    }

    public void setExpandMessage(g gVar) {
        this.f4434r = gVar;
    }

    public void setExpandedHeight(int i10) {
        this.f4441y = (int) (f.d().i().f() * ((float) i10));
    }

    public void setExpandedWidth(int i10) {
        this.f4440x = (int) (f.d().i().f() * ((float) i10));
    }

    public void setListener(f fVar) {
        this.f4426b = fVar;
    }

    public void setNoCloseButton(boolean z10) {
        this.f4436t = this.f4435s && z10;
    }

    public void setOmidManager(r rVar) {
        this.f4433i = rVar;
    }

    public void setOrientation(int i10) {
        this.f4439w = i10;
    }

    public void setUserInteraction(boolean z10) {
        this.f4437u = z10;
    }
}
