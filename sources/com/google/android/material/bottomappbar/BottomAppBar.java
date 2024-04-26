package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l9.u;
import o0.c0;
import q.d;
import s9.f;
import u8.j;
import x8.b;
import x8.c;
import x8.g;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ int f8952q0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public Integer f8953g0;

    /* renamed from: h0  reason: collision with root package name */
    public Animator f8954h0;

    /* renamed from: i0  reason: collision with root package name */
    public Animator f8955i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8956j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f8957k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f8958l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f8959m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f8960n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f8961o0;

    /* renamed from: p0  reason: collision with root package name */
    public Behavior f8962p0;

    public static class a extends u0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0092a();

        /* renamed from: c  reason: collision with root package name */
        public int f8968c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8969d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a  reason: collision with other inner class name */
        public class C0092a implements Parcelable.ClassLoaderCreator<a> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new a[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeInt(this.f8968c);
            parcel.writeInt(this.f8969d ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8968c = parcel.readInt();
            this.f8969d = parcel.readInt() != 0;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return D(this.f8956j0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f27887c;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private g getTopEdgeTreatment() {
        throw null;
    }

    public static void z(BottomAppBar bottomAppBar) {
        bottomAppBar.f8959m0--;
    }

    public final FloatingActionButton A() {
        View B = B();
        if (B instanceof FloatingActionButton) {
            return (FloatingActionButton) B;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View B() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.e(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.B():android.view.View");
    }

    public int C(ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 != 1 || !z10) {
            return 0;
        }
        boolean c10 = u.c(this);
        int measuredWidth = c10 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f17857a & 8388615) == 8388611) {
                if (c10) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((c10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public final float D(int i10) {
        boolean c10 = u.c(this);
        int i11 = 1;
        if (i10 != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) + 0;
        if (c10) {
            i11 = -1;
        }
        return (float) (measuredWidth * i11);
    }

    public final boolean E() {
        FloatingActionButton A = A();
        return A != null && A.k();
    }

    public final void F() {
        getTopEdgeTreatment().f27888d = getFabTranslationX();
        B();
        if (this.f8961o0) {
            boolean E = E();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f27887c;
    }

    public int getFabAlignmentMode() {
        return this.f8956j0;
    }

    public int getFabAnimationMode() {
        return this.f8957k0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f27886b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f27885a;
    }

    public boolean getHideOnScroll() {
        return this.f8958l0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d.d(this, (f) null);
        throw null;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f8955i0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f8954h0;
            if (animator2 != null) {
                animator2.cancel();
            }
            F();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f8955i0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!E()) {
                actionMenuView.setTranslationX((float) C(actionMenuView, 0, false));
            } else {
                actionMenuView.setTranslationX((float) C(actionMenuView, this.f8956j0, this.f8961o0));
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f25915a);
        this.f8956j0 = aVar.f8968c;
        this.f8961o0 = aVar.f8969d;
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f8968c = this.f8956j0;
        aVar.f8969d = this.f8961o0;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.l((Drawable) null, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            g topEdgeTreatment = getTopEdgeTreatment();
            topEdgeTreatment.getClass();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f27887c = f10;
                throw null;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public void setElevation(float f10) {
        throw null;
    }

    public void setFabAlignmentMode(int i10) {
        int i11;
        this.f8960n0 = 0;
        boolean z10 = this.f8961o0;
        if (!c0.r(this)) {
            int i12 = this.f8960n0;
            if (i12 != 0) {
                this.f8960n0 = 0;
                getMenu().clear();
                o(i12);
            }
        } else {
            Animator animator = this.f8955i0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!E()) {
                z10 = false;
                i11 = 0;
            } else {
                i11 = i10;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
                if (Math.abs(actionMenuView.getTranslationX() - ((float) C(actionMenuView, i11, z10))) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                    ofFloat2.addListener(new x8.d(this, actionMenuView, i11, z10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150);
                    animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f8955i0 = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.f8955i0.start();
        }
        if (this.f8956j0 != i10 && c0.r(this)) {
            Animator animator2 = this.f8954h0;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f8957k0 == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(A(), "translationX", new float[]{D(i10)});
                ofFloat3.setDuration(300);
                arrayList2.add(ofFloat3);
            } else {
                FloatingActionButton A = A();
                if (A != null && !A.j()) {
                    this.f8959m0++;
                    A.i(new b(this, i10), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f8954h0 = animatorSet3;
            animatorSet3.addListener(new x8.a(this));
            this.f8954h0.start();
        }
        this.f8956j0 = i10;
    }

    public void setFabAnimationMode(int i10) {
        this.f8957k0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f27889e) {
            getTopEdgeTreatment().f27889e = f10;
            throw null;
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f27886b = f10;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f27885a = f10;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f8958l0 = z10;
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f8953g0 == null)) {
            drawable = androidx.core.graphics.drawable.a.n(drawable.mutate());
            androidx.core.graphics.drawable.a.k(drawable, this.f8953g0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f8953g0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public Behavior getBehavior() {
        if (this.f8962p0 == null) {
            this.f8962p0 = new Behavior();
        }
        return this.f8962p0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f8963e = new Rect();

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f8964f;

        /* renamed from: g  reason: collision with root package name */
        public int f8965g;

        /* renamed from: h  reason: collision with root package name */
        public final View.OnLayoutChangeListener f8966h = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (((BottomAppBar) Behavior.this.f8964f.get()) == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Behavior.this.f8963e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f8964f = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.f8952q0;
            View B = bottomAppBar.B();
            if (B == null || c0.r(B)) {
                coordinatorLayout.r(bottomAppBar, i10);
                this.f8932a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
                return false;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) B.getLayoutParams();
            fVar.f1356d = 49;
            this.f8965g = fVar.bottomMargin;
            if (B instanceof FloatingActionButton) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) B;
                if (floatingActionButton.getShowMotionSpec() == null) {
                    floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                }
                if (floatingActionButton.getHideMotionSpec() == null) {
                    floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                }
                floatingActionButton.addOnLayoutChangeListener(this.f8966h);
                floatingActionButton.d((Animator.AnimatorListener) null);
                floatingActionButton.e(new x8.f(bottomAppBar));
                floatingActionButton.f((j<? extends FloatingActionButton>) null);
            }
            bottomAppBar.F();
            throw null;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i10 == 2) {
                    return true;
                }
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
