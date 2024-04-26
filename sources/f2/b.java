package f2;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import o0.c0;
import o0.o0;
import o0.s;

/* compiled from: ViewPager */
public class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f18078a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPager f18079b;

    public b(ViewPager viewPager) {
        this.f18079b = viewPager;
    }

    public o0 a(View view, o0 o0Var) {
        o0 v10 = c0.v(view, o0Var);
        if (v10.h()) {
            return v10;
        }
        Rect rect = this.f18078a;
        rect.left = v10.d();
        rect.top = v10.f();
        rect.right = v10.e();
        rect.bottom = v10.c();
        int childCount = this.f18079b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            o0 e10 = c0.e(this.f18079b.getChildAt(i10), v10);
            rect.left = Math.min(e10.d(), rect.left);
            rect.top = Math.min(e10.f(), rect.top);
            rect.right = Math.min(e10.e(), rect.right);
            rect.bottom = Math.min(e10.c(), rect.bottom);
        }
        return v10.i(rect.left, rect.top, rect.right, rect.bottom);
    }
}
