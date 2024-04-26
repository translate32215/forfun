package t2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.r0;
import java.util.ArrayList;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
public class d1 extends Button {

    /* renamed from: a  reason: collision with root package name */
    public int f25425a;

    /* renamed from: b  reason: collision with root package name */
    public int f25426b;

    /* renamed from: c  reason: collision with root package name */
    public int f25427c;

    /* renamed from: d  reason: collision with root package name */
    public int f25428d;

    /* renamed from: e  reason: collision with root package name */
    public int f25429e;

    /* renamed from: f  reason: collision with root package name */
    public int f25430f;

    /* renamed from: g  reason: collision with root package name */
    public int f25431g;

    /* renamed from: h  reason: collision with root package name */
    public int f25432h;

    /* renamed from: i  reason: collision with root package name */
    public int f25433i;

    /* renamed from: r  reason: collision with root package name */
    public int f25434r;

    /* renamed from: s  reason: collision with root package name */
    public String f25435s;

    /* renamed from: t  reason: collision with root package name */
    public String f25436t;

    /* renamed from: u  reason: collision with root package name */
    public String f25437u;

    /* renamed from: v  reason: collision with root package name */
    public String f25438v;

    /* renamed from: w  reason: collision with root package name */
    public com.adcolony.sdk.h f25439w;

    /* renamed from: x  reason: collision with root package name */
    public com.adcolony.sdk.g f25440x;

    public class a implements f0 {
        public a() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                JSONObject jSONObject = gVar.f4485b;
                d1Var.f25433i = jSONObject.optInt("x");
                d1Var.f25434r = jSONObject.optInt("y");
                d1Var.setGravity(d1Var.a(true, d1Var.f25433i) | d1Var.a(false, d1Var.f25434r));
            }
        }
    }

    public class b implements f0 {
        public b() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                if (gVar.f4485b.optBoolean("visible")) {
                    d1Var.setVisibility(0);
                } else {
                    d1Var.setVisibility(4);
                }
            }
        }
    }

    public class c implements f0 {
        public c() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                JSONObject jSONObject = gVar.f4485b;
                d1Var.f25426b = jSONObject.optInt("x");
                d1Var.f25427c = jSONObject.optInt("y");
                d1Var.f25428d = jSONObject.optInt("width");
                d1Var.f25429e = jSONObject.optInt("height");
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d1Var.getLayoutParams();
                layoutParams.setMargins(d1Var.f25426b, d1Var.f25427c, 0, 0);
                layoutParams.width = d1Var.f25428d;
                layoutParams.height = d1Var.f25429e;
                d1Var.setLayoutParams(layoutParams);
            }
        }
    }

    public class d implements f0 {
        public d() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                String optString = gVar.f4485b.optString("font_color");
                d1Var.f25436t = optString;
                d1Var.setTextColor(j0.v(optString));
            }
        }
    }

    public class e implements f0 {
        public e() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                String optString = gVar.f4485b.optString("background_color");
                d1Var.f25435s = optString;
                d1Var.setBackgroundColor(j0.v(optString));
            }
        }
    }

    public class f implements f0 {
        public f() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                int optInt = gVar.f4485b.optInt("font_family");
                d1Var.f25431g = optInt;
                if (optInt == 0) {
                    d1Var.setTypeface(Typeface.DEFAULT);
                } else if (optInt == 1) {
                    d1Var.setTypeface(Typeface.SERIF);
                } else if (optInt == 2) {
                    d1Var.setTypeface(Typeface.SANS_SERIF);
                } else if (optInt == 3) {
                    d1Var.setTypeface(Typeface.MONOSPACE);
                }
            }
        }
    }

    public class g implements f0 {
        public g() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                int optInt = gVar.f4485b.optInt("font_size");
                d1Var.f25432h = optInt;
                d1Var.setTextSize((float) optInt);
            }
        }
    }

    public class h implements f0 {
        public h() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                int optInt = gVar.f4485b.optInt("font_style");
                d1Var.f25430f = optInt;
                if (optInt == 0) {
                    d1Var.setTypeface(d1Var.getTypeface(), 0);
                } else if (optInt == 1) {
                    d1Var.setTypeface(d1Var.getTypeface(), 1);
                } else if (optInt == 2) {
                    d1Var.setTypeface(d1Var.getTypeface(), 2);
                } else if (optInt == 3) {
                    d1Var.setTypeface(d1Var.getTypeface(), 3);
                }
            }
        }
    }

    public class i implements f0 {
        public i() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                JSONObject jSONObject = new JSONObject();
                r0.e(jSONObject, "text", d1Var.getText().toString());
                gVar.a(jSONObject).b();
            }
        }
    }

    public class j implements f0 {
        public j() {
        }

        public void a(com.adcolony.sdk.g gVar) {
            if (d1.this.c(gVar)) {
                d1 d1Var = d1.this;
                d1Var.getClass();
                String optString = gVar.f4485b.optString("text");
                d1Var.f25437u = optString;
                d1Var.setText(optString);
            }
        }
    }

    public d1(Context context, com.adcolony.sdk.g gVar, int i10, com.adcolony.sdk.h hVar) {
        super(context);
        this.f25425a = i10;
        this.f25440x = gVar;
        this.f25439w = hVar;
    }

    public int a(boolean z10, int i10) {
        if (i10 == 0) {
            return z10 ? 1 : 16;
        }
        if (i10 == 1) {
            return z10 ? 8388611 : 48;
        }
        if (i10 != 2) {
            return 17;
        }
        return z10 ? 8388613 : 80;
    }

    public void b() {
        int i10;
        int i11;
        JSONObject jSONObject = this.f25440x.f4485b;
        this.f25438v = jSONObject.optString("ad_session_id");
        this.f25426b = jSONObject.optInt("x");
        this.f25427c = jSONObject.optInt("y");
        this.f25428d = jSONObject.optInt("width");
        this.f25429e = jSONObject.optInt("height");
        this.f25431g = jSONObject.optInt("font_family");
        this.f25430f = jSONObject.optInt("font_style");
        this.f25432h = jSONObject.optInt("font_size");
        this.f25435s = jSONObject.optString("background_color");
        this.f25436t = jSONObject.optString("font_color");
        this.f25437u = jSONObject.optString("text");
        this.f25433i = jSONObject.optInt("align_x");
        this.f25434r = jSONObject.optInt("align_y");
        o d10 = com.adcolony.sdk.f.d();
        if (this.f25437u.equals("")) {
            this.f25437u = "Learn More";
        }
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = jSONObject.optBoolean("wrap_content") ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(this.f25428d, this.f25429e);
        layoutParams.gravity = 0;
        setText(this.f25437u);
        setTextSize((float) this.f25432h);
        if (jSONObject.optBoolean("overlay")) {
            this.f25426b = 0;
            this.f25427c = 0;
            i11 = (int) (d10.i().f() * 6.0f);
            i10 = (int) (d10.i().f() * 6.0f);
            int f10 = (int) (d10.i().f() * 4.0f);
            setPadding(f10, f10, f10, f10);
            layoutParams.gravity = 8388693;
        } else {
            i11 = 0;
            i10 = 0;
        }
        layoutParams.setMargins(this.f25426b, this.f25427c, i11, i10);
        this.f25439w.addView(this, layoutParams);
        int i12 = this.f25431g;
        if (i12 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i12 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i12 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i12 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i13 = this.f25430f;
        if (i13 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i13 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i13 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i13 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setGravity(a(true, this.f25433i) | a(false, this.f25434r));
        if (!this.f25435s.equals("")) {
            setBackgroundColor(j0.v(this.f25435s));
        }
        if (!this.f25436t.equals("")) {
            setTextColor(j0.v(this.f25436t));
        }
        ArrayList<f0> arrayList = this.f25439w.A;
        b bVar = new b();
        com.adcolony.sdk.f.a("TextView.set_visible", bVar);
        arrayList.add(bVar);
        ArrayList<f0> arrayList2 = this.f25439w.A;
        c cVar = new c();
        com.adcolony.sdk.f.a("TextView.set_bounds", cVar);
        arrayList2.add(cVar);
        ArrayList<f0> arrayList3 = this.f25439w.A;
        d dVar = new d();
        com.adcolony.sdk.f.a("TextView.set_font_color", dVar);
        arrayList3.add(dVar);
        ArrayList<f0> arrayList4 = this.f25439w.A;
        e eVar = new e();
        com.adcolony.sdk.f.a("TextView.set_background_color", eVar);
        arrayList4.add(eVar);
        ArrayList<f0> arrayList5 = this.f25439w.A;
        f fVar = new f();
        com.adcolony.sdk.f.a("TextView.set_typeface", fVar);
        arrayList5.add(fVar);
        ArrayList<f0> arrayList6 = this.f25439w.A;
        g gVar = new g();
        com.adcolony.sdk.f.a("TextView.set_font_size", gVar);
        arrayList6.add(gVar);
        ArrayList<f0> arrayList7 = this.f25439w.A;
        h hVar = new h();
        com.adcolony.sdk.f.a("TextView.set_font_style", hVar);
        arrayList7.add(hVar);
        ArrayList<f0> arrayList8 = this.f25439w.A;
        i iVar = new i();
        com.adcolony.sdk.f.a("TextView.get_text", iVar);
        arrayList8.add(iVar);
        ArrayList<f0> arrayList9 = this.f25439w.A;
        j jVar = new j();
        com.adcolony.sdk.f.a("TextView.set_text", jVar);
        arrayList9.add(jVar);
        ArrayList<f0> arrayList10 = this.f25439w.A;
        a aVar = new a();
        com.adcolony.sdk.f.a("TextView.align", aVar);
        arrayList10.add(aVar);
        this.f25439w.B.add("TextView.set_visible");
        this.f25439w.B.add("TextView.set_bounds");
        this.f25439w.B.add("TextView.set_font_color");
        this.f25439w.B.add("TextView.set_background_color");
        this.f25439w.B.add("TextView.set_typeface");
        this.f25439w.B.add("TextView.set_font_size");
        this.f25439w.B.add("TextView.set_font_style");
        this.f25439w.B.add("TextView.get_text");
        this.f25439w.B.add("TextView.set_text");
        this.f25439w.B.add("TextView.align");
    }

    public boolean c(com.adcolony.sdk.g gVar) {
        JSONObject jSONObject = gVar.f4485b;
        return jSONObject.optInt("id") == this.f25425a && jSONObject.optInt("container_id") == this.f25439w.f4512r && jSONObject.optString("ad_session_id").equals(this.f25439w.f4514t);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        o d10 = com.adcolony.sdk.f.d();
        com.adcolony.sdk.i g10 = d10.g();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        JSONObject jSONObject = new JSONObject();
        r0.j(jSONObject, "view_id", this.f25425a);
        r0.e(jSONObject, "ad_session_id", this.f25438v);
        r0.j(jSONObject, "container_x", this.f25426b + x10);
        r0.j(jSONObject, "container_y", this.f25427c + y10);
        r0.j(jSONObject, "view_x", x10);
        r0.j(jSONObject, "view_y", y10);
        r0.j(jSONObject, "id", this.f25439w.getId());
        if (action != 0) {
            int i10 = y10;
            if (action == 1) {
                if (!this.f25439w.C) {
                    d10.f4669m = g10.f4528d.get(this.f25438v);
                }
                if (x10 <= 0 || x10 >= getWidth() || i10 <= 0 || i10 >= getHeight()) {
                    new com.adcolony.sdk.g("AdContainer.on_touch_cancelled", this.f25439w.f4513s, jSONObject).b();
                    return true;
                }
                new com.adcolony.sdk.g("AdContainer.on_touch_ended", this.f25439w.f4513s, jSONObject).b();
                return true;
            } else if (action == 2) {
                new com.adcolony.sdk.g("AdContainer.on_touch_moved", this.f25439w.f4513s, jSONObject).b();
                return true;
            } else if (action == 3) {
                new com.adcolony.sdk.g("AdContainer.on_touch_cancelled", this.f25439w.f4513s, jSONObject).b();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                r0.j(jSONObject, "container_x", ((int) motionEvent2.getX(action2)) + this.f25426b);
                r0.j(jSONObject, "container_y", ((int) motionEvent2.getY(action2)) + this.f25427c);
                r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action2));
                r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action2));
                new com.adcolony.sdk.g("AdContainer.on_touch_began", this.f25439w.f4513s, jSONObject).b();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x11 = (int) motionEvent2.getX(action3);
                int y11 = (int) motionEvent2.getY(action3);
                r0.j(jSONObject, "container_x", ((int) motionEvent2.getX(action3)) + this.f25426b);
                r0.j(jSONObject, "container_y", ((int) motionEvent2.getY(action3)) + this.f25427c);
                r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action3));
                r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f25439w.C) {
                    d10.f4669m = g10.f4528d.get(this.f25438v);
                }
                if (x11 <= 0 || x11 >= getWidth() || y11 <= 0 || y11 >= getHeight()) {
                    new com.adcolony.sdk.g("AdContainer.on_touch_cancelled", this.f25439w.f4513s, jSONObject).b();
                    return true;
                }
                new com.adcolony.sdk.g("AdContainer.on_touch_ended", this.f25439w.f4513s, jSONObject).b();
                return true;
            }
        } else {
            new com.adcolony.sdk.g("AdContainer.on_touch_began", this.f25439w.f4513s, jSONObject).b();
            return true;
        }
    }

    public d1(Context context, int i10, com.adcolony.sdk.g gVar, int i11, com.adcolony.sdk.h hVar) {
        super(context, (AttributeSet) null, i10);
        this.f25425a = i11;
        this.f25440x = gVar;
        this.f25439w = hVar;
    }
}
