package androidx.leanback.widget;

import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.leanback.widget.c1;

/* compiled from: ShadowHelper */
public final class b1 {
    public static Object a(View view, float f10, float f11, int i10) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        ViewOutlineProvider viewOutlineProvider = c1.f2332a;
        if (i10 > 0) {
            u0.a(view, true, i10);
        } else {
            view.setOutlineProvider(c1.f2332a);
        }
        c1.b bVar = new c1.b();
        bVar.f2333a = view;
        bVar.f2334b = f10;
        bVar.f2335c = f11;
        view.setZ(f10);
        return bVar;
    }
}
