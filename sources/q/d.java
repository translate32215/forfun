package q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import i9.a;
import o0.c0;
import s9.e;
import s9.f;
import s9.h;

public class d {
    public static x3.d a(int i10) {
        if (i10 == 0) {
            return new h();
        }
        if (i10 != 1) {
            return new h();
        }
        return new s9.d();
    }

    public static e b() {
        return new e(0);
    }

    public static void c(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof f) {
            f fVar = (f) background;
            f.b bVar = fVar.f25079a;
            if (bVar.f25112o != f10) {
                bVar.f25112o = f10;
                fVar.z();
            }
        }
    }

    public static void d(View view, f fVar) {
        a aVar = fVar.f25079a.f25099b;
        if (aVar != null && aVar.f19342a) {
            float f10 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f10 += c0.l((View) parent);
            }
            f.b bVar = fVar.f25079a;
            if (bVar.f25111n != f10) {
                bVar.f25111n = f10;
                fVar.z();
            }
        }
    }
}
