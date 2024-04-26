package t2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.i;
import com.adcolony.sdk.o;
import com.adcolony.sdk.r0;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
public class e1 extends EditText {

    /* renamed from: a  reason: collision with root package name */
    public int f25455a;

    /* renamed from: b  reason: collision with root package name */
    public int f25456b;

    /* renamed from: c  reason: collision with root package name */
    public int f25457c;

    /* renamed from: d  reason: collision with root package name */
    public int f25458d;

    /* renamed from: e  reason: collision with root package name */
    public int f25459e;

    /* renamed from: f  reason: collision with root package name */
    public int f25460f;

    /* renamed from: g  reason: collision with root package name */
    public int f25461g;

    /* renamed from: h  reason: collision with root package name */
    public int f25462h;

    /* renamed from: i  reason: collision with root package name */
    public int f25463i;

    /* renamed from: r  reason: collision with root package name */
    public int f25464r;

    /* renamed from: s  reason: collision with root package name */
    public String f25465s;

    /* renamed from: t  reason: collision with root package name */
    public String f25466t;

    /* renamed from: u  reason: collision with root package name */
    public String f25467u;

    /* renamed from: v  reason: collision with root package name */
    public String f25468v;

    /* renamed from: w  reason: collision with root package name */
    public h f25469w;

    /* renamed from: x  reason: collision with root package name */
    public g f25470x;

    public e1(Context context, g gVar, int i10, h hVar) {
        super(context);
        this.f25455a = i10;
        this.f25470x = gVar;
        this.f25469w = hVar;
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

    public boolean b(g gVar) {
        JSONObject jSONObject = gVar.f4485b;
        return jSONObject.optInt("id") == this.f25455a && jSONObject.optInt("container_id") == this.f25469w.f4512r && jSONObject.optString("ad_session_id").equals(this.f25469w.f4514t);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        o d10 = f.d();
        i g10 = d10.g();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        JSONObject jSONObject = new JSONObject();
        r0.j(jSONObject, "view_id", this.f25455a);
        r0.e(jSONObject, "ad_session_id", this.f25465s);
        r0.j(jSONObject, "container_x", this.f25456b + x10);
        r0.j(jSONObject, "container_y", this.f25457c + y10);
        r0.j(jSONObject, "view_x", x10);
        r0.j(jSONObject, "view_y", y10);
        r0.j(jSONObject, "id", this.f25469w.f4512r);
        if (action == 0) {
            new g("AdContainer.on_touch_began", this.f25469w.f4513s, jSONObject).b();
        } else if (action == 1) {
            if (!this.f25469w.C) {
                d10.f4669m = g10.f4528d.get(this.f25465s);
            }
            new g("AdContainer.on_touch_ended", this.f25469w.f4513s, jSONObject).b();
        } else if (action == 2) {
            new g("AdContainer.on_touch_moved", this.f25469w.f4513s, jSONObject).b();
        } else if (action == 3) {
            new g("AdContainer.on_touch_cancelled", this.f25469w.f4513s, jSONObject).b();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            r0.j(jSONObject, "container_x", ((int) motionEvent2.getX(action2)) + this.f25456b);
            r0.j(jSONObject, "container_y", ((int) motionEvent2.getY(action2)) + this.f25457c);
            r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action2));
            r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action2));
            new g("AdContainer.on_touch_began", this.f25469w.f4513s, jSONObject).b();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            r0.j(jSONObject, "container_x", ((int) motionEvent2.getX(action3)) + this.f25456b);
            r0.j(jSONObject, "container_y", ((int) motionEvent2.getY(action3)) + this.f25457c);
            r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action3));
            r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f25469w.C) {
                d10.f4669m = g10.f4528d.get(this.f25465s);
            }
            new g("AdContainer.on_touch_ended", this.f25469w.f4513s, jSONObject).b();
        }
        return true;
    }
}
