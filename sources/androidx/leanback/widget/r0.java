package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Presenter */
public abstract class r0 implements k {

    /* compiled from: Presenter */
    public static class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final View f2509a;

        public a(View view) {
            this.f2509a = view;
        }

        public final Object a(Class<?> cls) {
            return null;
        }
    }

    public static void b(View view) {
        if (view != null && view.hasTransientState()) {
            view.animate().cancel();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i10 = 0;
                while (view.hasTransientState() && i10 < childCount) {
                    b(viewGroup.getChildAt(i10));
                    i10++;
                }
            }
        }
    }

    public final Object a(Class<?> cls) {
        return null;
    }

    public abstract void c(a aVar, Object obj);

    public abstract a d(ViewGroup viewGroup);

    public abstract void e(a aVar);

    public void f(a aVar) {
    }

    public void g(a aVar) {
        b(aVar.f2509a);
    }
}
