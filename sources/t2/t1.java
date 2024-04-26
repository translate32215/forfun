package t2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.i;
import com.adcolony.sdk.o;
import com.adcolony.sdk.r0;
import org.json.JSONObject;

@SuppressLint({"AppCompatCustomView"})
public class t1 extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public int f25571a;

    /* renamed from: b  reason: collision with root package name */
    public int f25572b;

    /* renamed from: c  reason: collision with root package name */
    public int f25573c;

    /* renamed from: d  reason: collision with root package name */
    public int f25574d;

    /* renamed from: e  reason: collision with root package name */
    public int f25575e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25576f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25577g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25578h;

    /* renamed from: i  reason: collision with root package name */
    public String f25579i;

    /* renamed from: r  reason: collision with root package name */
    public String f25580r;

    /* renamed from: s  reason: collision with root package name */
    public g f25581s;

    /* renamed from: t  reason: collision with root package name */
    public h f25582t;

    public t1(Context context, g gVar, int i10, h hVar) {
        super(context);
        this.f25571a = i10;
        this.f25581s = gVar;
        this.f25582t = hVar;
    }

    public static boolean a(t1 t1Var, g gVar) {
        t1Var.getClass();
        JSONObject jSONObject = gVar.f4485b;
        return jSONObject.optInt("id") == t1Var.f25571a && jSONObject.optInt("container_id") == t1Var.f25582t.f4512r && jSONObject.optString("ad_session_id").equals(t1Var.f25582t.f4514t);
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
        r0.j(jSONObject, "view_id", this.f25571a);
        r0.e(jSONObject, "ad_session_id", this.f25580r);
        r0.j(jSONObject, "container_x", this.f25572b + x10);
        r0.j(jSONObject, "container_y", this.f25573c + y10);
        r0.j(jSONObject, "view_x", x10);
        r0.j(jSONObject, "view_y", y10);
        r0.j(jSONObject, "id", this.f25582t.getId());
        if (action != 0) {
            int i10 = y10;
            if (action == 1) {
                if (!this.f25582t.C) {
                    d10.f4669m = g10.f4528d.get(this.f25580r);
                }
                if (x10 <= 0 || x10 >= this.f25574d || i10 <= 0 || i10 >= this.f25575e) {
                    new g("AdContainer.on_touch_cancelled", this.f25582t.f4513s, jSONObject).b();
                    return true;
                }
                new g("AdContainer.on_touch_ended", this.f25582t.f4513s, jSONObject).b();
                return true;
            } else if (action == 2) {
                new g("AdContainer.on_touch_moved", this.f25582t.f4513s, jSONObject).b();
                return true;
            } else if (action == 3) {
                new g("AdContainer.on_touch_cancelled", this.f25582t.f4513s, jSONObject).b();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                r0.j(jSONObject, "container_x", ((int) motionEvent2.getX(action2)) + this.f25572b);
                r0.j(jSONObject, "container_y", ((int) motionEvent2.getY(action2)) + this.f25573c);
                r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action2));
                r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action2));
                new g("AdContainer.on_touch_began", this.f25582t.f4513s, jSONObject).b();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x11 = (int) motionEvent2.getX(action3);
                int y11 = (int) motionEvent2.getY(action3);
                r0.j(jSONObject, "container_x", ((int) motionEvent2.getX(action3)) + this.f25572b);
                r0.j(jSONObject, "container_y", ((int) motionEvent2.getY(action3)) + this.f25573c);
                r0.j(jSONObject, "view_x", (int) motionEvent2.getX(action3));
                r0.j(jSONObject, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f25582t.C) {
                    d10.f4669m = g10.f4528d.get(this.f25580r);
                }
                if (x11 <= 0 || x11 >= this.f25574d || y11 <= 0 || y11 >= this.f25575e) {
                    new g("AdContainer.on_touch_cancelled", this.f25582t.f4513s, jSONObject).b();
                    return true;
                }
                new g("AdContainer.on_touch_ended", this.f25582t.f4513s, jSONObject).b();
                return true;
            }
        } else {
            new g("AdContainer.on_touch_began", this.f25582t.f4513s, jSONObject).b();
            return true;
        }
    }
}
