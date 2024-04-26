package f;

import android.graphics.Rect;
import android.view.View;
import o0.c0;
import o0.o0;
import o0.s;

/* compiled from: AppCompatDelegateImpl */
public class m implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f17944a;

    public m(l lVar) {
        this.f17944a = lVar;
    }

    public o0 a(View view, o0 o0Var) {
        int f10 = o0Var.f();
        int a02 = this.f17944a.a0(o0Var, (Rect) null);
        if (f10 != a02) {
            o0Var = o0Var.i(o0Var.d(), a02, o0Var.e(), o0Var.c());
        }
        return c0.v(view, o0Var);
    }
}
