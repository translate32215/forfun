package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.startapp.startappsdk.R;
import e.l;
import java.util.WeakHashMap;
import o0.c0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f624a;

    /* renamed from: b  reason: collision with root package name */
    public View f625b;

    /* renamed from: c  reason: collision with root package name */
    public View f626c;

    /* renamed from: d  reason: collision with root package name */
    public View f627d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f628e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f629f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f630g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f631h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f632i;

    /* renamed from: r  reason: collision with root package name */
    public int f633r;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13501a);
        boolean z10 = false;
        this.f628e = obtainStyledAttributes.getDrawable(0);
        this.f629f = obtainStyledAttributes.getDrawable(2);
        this.f633r = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f631h = true;
            this.f630g = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f631h ? this.f628e == null && this.f629f == null : this.f630g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f628e;
        if (drawable != null && drawable.isStateful()) {
            this.f628e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f629f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f629f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f630g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f630g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f625b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f628e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f629f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f630g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f626c = findViewById(R.id.action_bar);
        this.f627d = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f624a || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f625b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i10, (measuredHeight - view.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f631h) {
            Drawable drawable2 = this.f630g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f628e != null) {
                if (this.f626c.getVisibility() == 0) {
                    this.f628e.setBounds(this.f626c.getLeft(), this.f626c.getTop(), this.f626c.getRight(), this.f626c.getBottom());
                } else {
                    View view2 = this.f627d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f628e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f628e.setBounds(this.f627d.getLeft(), this.f627d.getTop(), this.f627d.getRight(), this.f627d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f632i = z13;
            if (!z13 || (drawable = this.f629f) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f626c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i13 = this.f633r) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f626c != null) {
            int mode = View.MeasureSpec.getMode(i11);
            View view = this.f625b;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f626c)) {
                    i12 = a(this.f626c);
                } else {
                    i12 = !b(this.f627d) ? a(this.f627d) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f625b) + i12, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f628e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f628e);
        }
        this.f628e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f626c;
            if (view != null) {
                this.f628e.setBounds(view.getLeft(), this.f626c.getTop(), this.f626c.getRight(), this.f626c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f631h ? !(this.f628e == null && this.f629f == null) : this.f630g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f630g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f630g);
        }
        this.f630g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f631h && (drawable2 = this.f630g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f631h ? this.f628e == null && this.f629f == null : this.f630g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f629f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f629f);
        }
        this.f629f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f632i && (drawable2 = this.f629f) != null) {
                drawable2.setBounds(this.f625b.getLeft(), this.f625b.getTop(), this.f625b.getRight(), this.f625b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f631h ? !(this.f628e == null && this.f629f == null) : this.f630g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(w0 w0Var) {
        View view = this.f625b;
        if (view != null) {
            removeView(view);
        }
        this.f625b = w0Var;
        if (w0Var != null) {
            addView(w0Var);
            ViewGroup.LayoutParams layoutParams = w0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            w0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f624a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f628e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f629f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f630g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f628e && !this.f631h) || (drawable == this.f629f && this.f632i) || ((drawable == this.f630g && this.f631h) || super.verifyDrawable(drawable));
    }
}
