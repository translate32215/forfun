package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import com.startapp.startappsdk.R;
import e.d;
import java.util.WeakHashMap;
import l9.u;
import o0.c0;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9381a = (Build.VERSION.SDK_INT <= 19);

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i  reason: collision with root package name */
        public final b f9382i = new b(this);

        public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f9382i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b a10 = b.a();
                    synchronized (a10.f9399a) {
                        a10.b((b.C0098b) null);
                    }
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b a11 = b.a();
                synchronized (a11.f9399a) {
                    a11.b((b.C0098b) null);
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        public boolean s(View view) {
            this.f9382i.getClass();
            return view instanceof c;
        }
    }

    public class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            } else if (i10 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
        }
    }

    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f8942f = SwipeDismissBehavior.t(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.f8943g = SwipeDismissBehavior.t(0.0f, 0.6f, 1.0f);
            swipeDismissBehavior.f8940d = 0;
        }
    }

    public static class c extends FrameLayout {

        /* renamed from: s  reason: collision with root package name */
        public static final View.OnTouchListener f9383s = new a();

        /* renamed from: a  reason: collision with root package name */
        public BaseTransientBottomBar<?> f9384a;

        /* renamed from: b  reason: collision with root package name */
        public int f9385b;

        /* renamed from: c  reason: collision with root package name */
        public final float f9386c;

        /* renamed from: d  reason: collision with root package name */
        public final float f9387d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9388e;

        /* renamed from: f  reason: collision with root package name */
        public final int f9389f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f9390g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f9391h;

        /* renamed from: i  reason: collision with root package name */
        public Rect f9392i;

        /* renamed from: r  reason: collision with root package name */
        public boolean f9393r;

        public class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(w9.a.a(context, attributeSet, 0, 0), attributeSet);
            Drawable drawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, t8.a.I);
            if (obtainStyledAttributes.hasValue(6)) {
                c0.H(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f9385b = obtainStyledAttributes.getInt(2, 0);
            this.f9386c = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(p9.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(u.d(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f9387d = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f9388e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f9389f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f9383s);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(d.k(d.g(this, R.attr.colorSurface), d.g(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                if (this.f9390g != null) {
                    drawable = androidx.core.graphics.drawable.a.n(gradientDrawable);
                    androidx.core.graphics.drawable.a.l(drawable, this.f9390g);
                } else {
                    drawable = androidx.core.graphics.drawable.a.n(gradientDrawable);
                }
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                c0.d.q(this, drawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f9384a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f9387d;
        }

        public int getAnimationMode() {
            return this.f9385b;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f9386c;
        }

        public int getMaxInlineActionWidth() {
            return this.f9389f;
        }

        public int getMaxWidth() {
            return this.f9388e;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9384a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            c0.A(this);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9384a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                b a10 = b.a();
                synchronized (a10.f9399a) {
                    a10.b((b.C0098b) null);
                }
            }
        }

        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (this.f9388e > 0 && getMeasuredWidth() > (i12 = this.f9388e)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setAnimationMode(int i10) {
            this.f9385b = i10;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f9390g == null)) {
                drawable = androidx.core.graphics.drawable.a.n(drawable.mutate());
                androidx.core.graphics.drawable.a.l(drawable, this.f9390g);
                androidx.core.graphics.drawable.a.m(drawable, this.f9391h);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f9390g = colorStateList;
            if (getBackground() != null) {
                Drawable n10 = androidx.core.graphics.drawable.a.n(getBackground().mutate());
                androidx.core.graphics.drawable.a.l(n10, colorStateList);
                androidx.core.graphics.drawable.a.m(n10, this.f9391h);
                if (n10 != getBackground()) {
                    super.setBackgroundDrawable(n10);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f9391h = mode;
            if (getBackground() != null) {
                Drawable n10 = androidx.core.graphics.drawable.a.n(getBackground().mutate());
                androidx.core.graphics.drawable.a.m(n10, mode);
                if (n10 != getBackground()) {
                    super.setBackgroundDrawable(n10);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f9393r && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f9392i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f9384a;
                if (baseTransientBottomBar != null) {
                    boolean z10 = BaseTransientBottomBar.f9381a;
                    baseTransientBottomBar.getClass();
                    throw null;
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f9383s);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        new Handler(Looper.getMainLooper(), new a());
    }
}
