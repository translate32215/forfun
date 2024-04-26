package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import b1.a;
import com.startapp.startappsdk.R;
import j.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0.c0;
import o0.o0;
import q.b;
import ud.k;

/* compiled from: FragmentContainerView.kt */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final List<View> f1573a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<View> f1574b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1575c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1576d = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        k.f(context, "context");
        k.f(context, "context");
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3345b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        k.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof p ? (p) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        o0 o0Var;
        k.f(windowInsets, "insets");
        o0 l10 = o0.l(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1575c;
        if (onApplyWindowInsetsListener != null) {
            k.c(onApplyWindowInsetsListener);
            k.f(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            k.f(this, "v");
            k.f(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            k.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            o0Var = o0.l(onApplyWindowInsets, (View) null);
        } else {
            o0Var = c0.v(this, l10);
        }
        k.e(o0Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!o0Var.h()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                c0.e(getChildAt(i10), o0Var);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        k.f(canvas, "canvas");
        if (this.f1576d) {
            for (View drawChild : this.f1573a) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        k.f(canvas, "canvas");
        k.f(view, "child");
        if (!this.f1576d || !(!this.f1573a.isEmpty()) || !this.f1573a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public void endViewTransition(View view) {
        k.f(view, "view");
        this.f1574b.remove(view);
        if (this.f1573a.remove(view)) {
            this.f1576d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends p> F getFragment() {
        p pVar;
        a0 a0Var;
        q qVar = null;
        View view = this;
        while (true) {
            if (view == null) {
                pVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            pVar = tag instanceof p ? (p) tag : null;
            if (pVar != null) {
                break;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (pVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof q) {
                    qVar = (q) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (qVar != null) {
                a0Var = qVar.F();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (pVar.I()) {
            a0Var = pVar.p();
        } else {
            throw new IllegalStateException("The Fragment " + pVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return a0Var.F(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k.f(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                k.e(childAt, "view");
                if (this.f1574b.contains(childAt)) {
                    this.f1573a.add(childAt);
                }
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeView(View view) {
        k.f(view, "view");
        if (this.f1574b.contains(view)) {
            this.f1573a.add(view);
        }
        super.removeView(view);
    }

    public void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        k.e(childAt, "view");
        if (this.f1574b.contains(childAt)) {
            this.f1573a.add(childAt);
        }
        super.removeViewAt(i10);
    }

    public void removeViewInLayout(View view) {
        k.f(view, "view");
        if (this.f1574b.contains(view)) {
            this.f1573a.add(view);
        }
        super.removeViewInLayout(view);
    }

    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            k.e(childAt, "view");
            if (this.f1574b.contains(childAt)) {
                this.f1573a.add(childAt);
            }
        }
        super.removeViews(i10, i11);
    }

    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            k.e(childAt, "view");
            if (this.f1574b.contains(childAt)) {
                this.f1573a.add(childAt);
            }
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f1576d = z10;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        k.f(onApplyWindowInsetsListener, "listener");
        this.f1575c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        k.f(view, "view");
        if (view.getParent() == this) {
            this.f1574b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context) {
        super(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, a0 a0Var) {
        super(context, attributeSet);
        View view;
        k.f(context, "context");
        k.f(attributeSet, "attrs");
        k.f(a0Var, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3345b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        p F = a0Var.F(id2);
        if (classAttribute != null && F == null) {
            if (id2 == -1) {
                throw new IllegalStateException(b.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? f.a(" with tag ", string) : ""));
            }
            p a10 = a0Var.J().a(context.getClassLoader(), classAttribute);
            k.e(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.U(context, attributeSet, (Bundle) null);
            b bVar = new b(a0Var);
            bVar.f1718p = true;
            a10.P = this;
            bVar.g(getId(), a10, string, 1);
            bVar.f();
        }
        Iterator it = ((ArrayList) a0Var.f1579c.g()).iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            p pVar = h0Var.f1694c;
            if (pVar.G == getId() && (view = pVar.Q) != null && view.getParent() == null) {
                pVar.P = this;
                h0Var.b();
            }
        }
    }
}
