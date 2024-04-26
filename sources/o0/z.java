package o0;

import android.view.View;
import o0.c0;

/* compiled from: ViewCompat */
public class z extends c0.b<Boolean> {
    public z(int i10, Class cls, int i11) {
        super(i10, cls, i11);
    }

    public Object b(View view) {
        return Boolean.valueOf(c0.m.d(view));
    }

    public void c(View view, Object obj) {
        c0.m.i(view, ((Boolean) obj).booleanValue());
    }

    public boolean f(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }
}
