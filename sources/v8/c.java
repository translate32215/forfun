package v8;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b8.a;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import o0.c0;
import o0.e;
import o0.o0;

/* compiled from: HeaderScrollingViewBehavior */
public abstract class c extends d<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f26620c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f26621d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f26622e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f26623f;

    public c() {
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        AppBarLayout w10;
        o0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (w10 = ((AppBarLayout.ScrollingViewBehavior) this).w(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (c0.d.b(w10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.c() + lastWindowInsets.f();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.s(view, i10, i11, View.MeasureSpec.makeMeasureSpec((size + w10.getTotalScrollRange()) - w10.getMeasuredHeight(), i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout w10 = ((AppBarLayout.ScrollingViewBehavior) this).w(coordinatorLayout.d(view));
        if (w10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f26620c;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, w10.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((w10.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            o0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                if (c0.d.b(coordinatorLayout) && !c0.d.b(view)) {
                    rect.left = lastWindowInsets.d() + rect.left;
                    rect.right -= lastWindowInsets.e();
                }
            }
            Rect rect2 = this.f26621d;
            int i11 = fVar.f1355c;
            e.b(i11 == 0 ? 8388659 : i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int v10 = v(w10);
            view.layout(rect2.left, rect2.top - v10, rect2.right, rect2.bottom - v10);
            this.f26622e = rect2.top - w10.getBottom();
            return;
        }
        coordinatorLayout.r(view, i10);
        this.f26622e = 0;
    }

    public final int v(View view) {
        int i10;
        if (this.f26623f == 0) {
            return 0;
        }
        float f10 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1353a;
            int v10 = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).v() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + v10 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f10 = 1.0f + (((float) v10) / ((float) i10));
            }
        }
        int i11 = this.f26623f;
        return a.c((int) (f10 * ((float) i11)), 0, i11);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
