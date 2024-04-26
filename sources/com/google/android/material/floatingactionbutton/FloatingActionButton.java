package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l9.e;
import l9.w;
import o0.c0;
import o0.x;
import s0.n;
import s9.i;
import s9.m;
import u8.g;
import u8.j;

public class FloatingActionButton extends w implements x, n, j9.a, m, CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f9227b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f9228c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f9229d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f9230e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f9231f;

    /* renamed from: g  reason: collision with root package name */
    public int f9232g;

    /* renamed from: h  reason: collision with root package name */
    public int f9233h;

    /* renamed from: i  reason: collision with root package name */
    public int f9234i;

    /* renamed from: r  reason: collision with root package name */
    public int f9235r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9236s;

    /* renamed from: t  reason: collision with root package name */
    public d f9237t;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class b implements r9.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.f {

        /* renamed from: a  reason: collision with root package name */
        public final j<T> f9241a;

        public c(j<T> jVar) {
            this.f9241a = jVar;
        }

        public void a() {
            this.f9241a.a(FloatingActionButton.this);
        }

        public void b() {
            this.f9241a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f9241a.equals(this.f9241a);
        }

        public int hashCode() {
            return this.f9241a.hashCode();
        }
    }

    private d getImpl() {
        d dVar;
        if (this.f9237t == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                dVar = new k9.c(this, new b());
            } else {
                dVar = new d(this, new b());
            }
            this.f9237t = dVar;
        }
        return this.f9237t;
    }

    public boolean a() {
        throw null;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.f9269p == null) {
            impl.f9269p = new ArrayList<>();
        }
        impl.f9269p.add((Object) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.f9268o == null) {
            impl.f9268o = new ArrayList<>();
        }
        impl.f9268o.add(animatorListener);
    }

    public void f(j<? extends FloatingActionButton> jVar) {
        d impl = getImpl();
        c cVar = new c((j) null);
        if (impl.f9270q == null) {
            impl.f9270q = new ArrayList<>();
        }
        impl.f9270q.add(cVar);
    }

    @Deprecated
    public boolean g(Rect rect) {
        if (!c0.r(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    public ColorStateList getBackgroundTintList() {
        return this.f9227b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f9228c;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f9258e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f9259f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.f9233h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f9263j;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f9231f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f9231f;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f9254a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f9262i;
    }

    public int getSize() {
        return this.f9232g;
    }

    public int getSizeDimension() {
        return h(this.f9232g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f9229d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f9230e;
    }

    public boolean getUseCompatPadding() {
        return this.f9236s;
    }

    public final int h(int i10) {
        int i11 = this.f9233h;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        } else {
            return h(0);
        }
    }

    public void i(a aVar, boolean z10) {
        a aVar2;
        AnimatorSet animatorSet;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new a(this, aVar);
        }
        if (!impl.g()) {
            Animator animator = impl.f9261h;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.r()) {
                g gVar = impl.f9263j;
                if (gVar != null) {
                    animatorSet = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                } else {
                    animatorSet = impl.c(0.0f, 0.4f, 0.4f);
                }
                animatorSet.addListener(new b(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f9269p;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl.f9271r.b(z10 ? 8 : 4, z10);
            if (aVar2 != null) {
                aVar2.f9243a.a(aVar2.f9244b);
            }
        }
    }

    public boolean j() {
        return getImpl().g();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public boolean k() {
        return getImpl().h();
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f9229d;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f9230e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(k.c(colorForState, mode));
        }
    }

    public void m(a aVar, boolean z10) {
        a aVar2;
        AnimatorSet animatorSet;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new a(this, aVar);
        }
        if (!impl.h()) {
            Animator animator = impl.f9261h;
            if (animator != null) {
                animator.cancel();
            }
            boolean z11 = impl.f9262i == null;
            if (impl.r()) {
                if (impl.f9271r.getVisibility() != 0) {
                    float f10 = 0.0f;
                    impl.f9271r.setAlpha(0.0f);
                    impl.f9271r.setScaleY(z11 ? 0.4f : 0.0f);
                    impl.f9271r.setScaleX(z11 ? 0.4f : 0.0f);
                    if (z11) {
                        f10 = 0.4f;
                    }
                    impl.o(f10);
                }
                g gVar = impl.f9262i;
                if (gVar != null) {
                    animatorSet = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    animatorSet = impl.c(1.0f, 1.0f, 1.0f);
                }
                animatorSet.addListener(new c(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f9268o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        animatorSet.addListener(it.next());
                    }
                }
                animatorSet.start();
                return;
            }
            impl.f9271r.b(0, z10);
            impl.f9271r.setAlpha(1.0f);
            impl.f9271r.setScaleY(1.0f);
            impl.f9271r.setScaleX(1.0f);
            impl.o(1.0f);
            if (aVar2 != null) {
                aVar2.f9243a.b(aVar2.f9244b);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        impl.getClass();
        if (!(impl instanceof k9.c)) {
            ViewTreeObserver viewTreeObserver = impl.f9271r.getViewTreeObserver();
            if (impl.f9277x == null) {
                impl.f9277x = new k9.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f9277x);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f9271r.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f9277x;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f9277x = null;
        }
    }

    public void onMeasure(int i10, int i11) {
        this.f9234i = (getSizeDimension() - this.f9235r) / 2;
        getImpl().u();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof t9.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        t9.a aVar = (t9.a) parcelable;
        super.onRestoreInstanceState(aVar.f25915a);
        Bundle orDefault = aVar.f25860c.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        Bundle bundle = orDefault;
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g((Rect) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9227b != colorStateList) {
            this.f9227b = colorStateList;
            getImpl().getClass();
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f9228c != mode) {
            this.f9228c = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f9257d != f10) {
            impl.f9257d = f10;
            impl.l(f10, impl.f9258e, impl.f9259f);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f9258e != f10) {
            impl.f9258e = f10;
            impl.l(impl.f9257d, f10, impl.f9259f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f9259f != f10) {
            impl.f9259f = f10;
            impl.l(impl.f9257d, impl.f9258e, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i10 != this.f9233h) {
            this.f9233h = i10;
            requestLayout();
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f9255b) {
            getImpl().f9255b = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f9263j = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.o(impl.f9265l);
            if (this.f9229d != null) {
                l();
            }
        }
    }

    public void setImageResource(int i10) {
        throw null;
    }

    public void setMaxImageSize(int i10) {
        this.f9235r = i10;
        d impl = getImpl();
        if (impl.f9266m != i10) {
            impl.f9266m = i10;
            impl.o(impl.f9265l);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().m();
    }

    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().m();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f9256c = z10;
        impl.u();
        throw null;
    }

    public void setShapeAppearanceModel(i iVar) {
        getImpl().f9254a = iVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f9262i = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f9233h = 0;
        if (i10 != this.f9232g) {
            this.f9232g = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f9229d != colorStateList) {
            this.f9229d = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f9230e != mode) {
            this.f9230e = mode;
            l();
        }
    }

    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().n();
    }

    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().n();
    }

    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().n();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f9236s != z10) {
            this.f9236s = z10;
            getImpl().j();
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f9238a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9239b;

        public BaseBehavior() {
            this.f9239b = true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        public void c(CoordinatorLayout.f fVar) {
            if (fVar.f1360h == 0) {
                fVar.f1360h = 80;
            }
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1353a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> d10 = coordinatorLayout.d(floatingActionButton);
            int size = d10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = d10.get(i11);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1353a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i10);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f9239b && fVar.f1358f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f9238a == null) {
                this.f9238a = new Rect();
            }
            Rect rect = this.f9238a;
            e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.m((a) null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.m((a) null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.f25845l);
            this.f9239b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f9231f != colorStateList) {
            this.f9231f = colorStateList;
            getImpl().p(this.f9231f);
        }
    }
}
