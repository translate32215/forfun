package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.HashMap;
import mb.a;
import mb.d;
import org.json.JSONObject;
import t2.d1;
import t2.e1;
import t2.f0;
import t2.t1;

public class h extends FrameLayout {
    public ArrayList<f0> A;
    public ArrayList<String> B;
    public boolean C;
    public boolean D;
    public boolean E;
    public a F;
    public Context G;
    public VideoView H;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, k0> f4503a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<Integer, d1> f4504b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, q0> f4505c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<Integer, e1> f4506d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<Integer, t1> f4507e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<Integer, Boolean> f4508f;

    /* renamed from: g  reason: collision with root package name */
    public HashMap<Integer, View> f4509g;

    /* renamed from: h  reason: collision with root package name */
    public int f4510h;

    /* renamed from: i  reason: collision with root package name */
    public int f4511i;

    /* renamed from: r  reason: collision with root package name */
    public int f4512r;

    /* renamed from: s  reason: collision with root package name */
    public int f4513s;

    /* renamed from: t  reason: collision with root package name */
    public String f4514t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4515u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4516v;

    /* renamed from: w  reason: collision with root package name */
    public float f4517w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    public double f4518x = 0.0d;

    /* renamed from: y  reason: collision with root package name */
    public int f4519y = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f4520z = 0;

    public h(Context context, String str) {
        super(context);
        this.G = context;
        this.f4514t = str;
        setBackgroundColor(-16777216);
    }

    public void a(View view, d dVar) {
        a aVar = this.F;
        if (aVar != null && view != null) {
            try {
                aVar.a(view, dVar, (String) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    public boolean b(g gVar) {
        JSONObject jSONObject = gVar.f4485b;
        return jSONObject.optInt("container_id") == this.f4512r && jSONObject.optString("ad_session_id").equals(this.f4514t);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        o d10 = f.d();
        i g10 = d10.g();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        JSONObject jSONObject = new JSONObject();
        r0.j(jSONObject, "view_id", -1);
        r0.e(jSONObject, "ad_session_id", this.f4514t);
        r0.j(jSONObject, "container_x", x10);
        r0.j(jSONObject, "container_y", y10);
        r0.j(jSONObject, "view_x", x10);
        r0.j(jSONObject, "view_y", y10);
        r0.j(jSONObject, "id", this.f4512r);
        if (action == 0) {
            new g("AdContainer.on_touch_began", this.f4513s, jSONObject).b();
        } else if (action == 1) {
            if (!this.C) {
                d10.f4669m = g10.f4528d.get(this.f4514t);
            }
            new g("AdContainer.on_touch_ended", this.f4513s, jSONObject).b();
        } else if (action == 2) {
            new g("AdContainer.on_touch_moved", this.f4513s, jSONObject).b();
        } else if (action == 3) {
            new g("AdContainer.on_touch_cancelled", this.f4513s, jSONObject).b();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            r0.j(jSONObject, "container_x", (int) motionEvent2.getX(action2));
            r0.j(jSONObject, "container_y", (int) motionEvent2.getY(action2));
            r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action2));
            r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action2));
            new g("AdContainer.on_touch_began", this.f4513s, jSONObject).b();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            r0.j(jSONObject, "container_x", (int) motionEvent2.getX(action3));
            r0.j(jSONObject, "container_y", (int) motionEvent2.getY(action3));
            r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action3));
            r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action3));
            r0.j(jSONObject, "x", (int) motionEvent2.getX(action3));
            r0.j(jSONObject, "y", (int) motionEvent2.getY(action3));
            if (!this.C) {
                d10.f4669m = g10.f4528d.get(this.f4514t);
            }
            new g("AdContainer.on_touch_ended", this.f4513s, jSONObject).b();
        }
        return true;
    }
}
