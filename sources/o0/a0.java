package o0;

import android.text.TextUtils;
import android.view.View;
import o0.c0;

/* compiled from: ViewCompat */
public class a0 extends c0.b<CharSequence> {
    public a0(int i10, Class cls, int i11, int i12) {
        super(i10, cls, i11, i12);
    }

    public Object b(View view) {
        return c0.m.b(view);
    }

    public void c(View view, Object obj) {
        c0.m.h(view, (CharSequence) obj);
    }

    public boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
