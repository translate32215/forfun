package t2;

import android.net.Uri;
import android.widget.FrameLayout;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import java.io.File;
import java.util.ArrayList;
import mb.a;
import mb.d;
import org.json.JSONObject;

public class v implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f25589a;

    public v(h hVar) {
        this.f25589a = hVar;
    }

    public void a(g gVar) {
        if (this.f25589a.b(gVar)) {
            h hVar = this.f25589a;
            hVar.getClass();
            int optInt = gVar.f4485b.optInt("id");
            t1 t1Var = new t1(hVar.G, gVar, optInt, hVar);
            JSONObject jSONObject = t1Var.f25581s.f4485b;
            t1Var.f25580r = jSONObject.optString("ad_session_id");
            t1Var.f25572b = jSONObject.optInt("x");
            t1Var.f25573c = jSONObject.optInt("y");
            t1Var.f25574d = jSONObject.optInt("width");
            t1Var.f25575e = jSONObject.optInt("height");
            t1Var.f25579i = jSONObject.optString("filepath");
            t1Var.f25576f = jSONObject.optBoolean("dpi");
            t1Var.f25577g = jSONObject.optBoolean("invert_y");
            t1Var.f25578h = jSONObject.optBoolean("wrap_content");
            t1Var.setImageURI(Uri.fromFile(new File(t1Var.f25579i)));
            if (t1Var.f25576f) {
                float f10 = (((float) t1Var.f25575e) * f.d().i().f()) / ((float) t1Var.getDrawable().getIntrinsicHeight());
                t1Var.f25575e = (int) (((float) t1Var.getDrawable().getIntrinsicHeight()) * f10);
                int intrinsicWidth = (int) (((float) t1Var.getDrawable().getIntrinsicWidth()) * f10);
                t1Var.f25574d = intrinsicWidth;
                t1Var.f25572b -= intrinsicWidth;
                t1Var.f25573c = t1Var.f25577g ? t1Var.f25573c + t1Var.f25575e : t1Var.f25573c - t1Var.f25575e;
            }
            t1Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = t1Var.f25578h ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(t1Var.f25574d, t1Var.f25575e);
            layoutParams.setMargins(t1Var.f25572b, t1Var.f25573c, 0, 0);
            layoutParams.gravity = 0;
            t1Var.f25582t.addView(t1Var, layoutParams);
            ArrayList<f0> arrayList = t1Var.f25582t.A;
            q1 q1Var = new q1(t1Var);
            f.a("ImageView.set_visible", q1Var);
            arrayList.add(q1Var);
            ArrayList<f0> arrayList2 = t1Var.f25582t.A;
            r1 r1Var = new r1(t1Var);
            f.a("ImageView.set_bounds", r1Var);
            arrayList2.add(r1Var);
            ArrayList<f0> arrayList3 = t1Var.f25582t.A;
            s1 s1Var = new s1(t1Var);
            f.a("ImageView.set_image", s1Var);
            arrayList3.add(s1Var);
            t1Var.f25582t.B.add("ImageView.set_visible");
            t1Var.f25582t.B.add("ImageView.set_bounds");
            t1Var.f25582t.B.add("ImageView.set_image");
            hVar.f4507e.put(Integer.valueOf(optInt), t1Var);
            hVar.f4509g.put(Integer.valueOf(optInt), t1Var);
            d dVar = d.OTHER;
            a aVar = hVar.F;
            if (aVar != null) {
                try {
                    aVar.a(t1Var, dVar, (String) null);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
