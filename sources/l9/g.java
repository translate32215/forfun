package l9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.o0;
import t8.a;

/* compiled from: ForegroundLinearLayout */
public class g extends o0 {
    public int A;
    public boolean B;
    public boolean C;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f21121x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f21122y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f21123z;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f21121x;
        if (drawable != null) {
            if (this.C) {
                this.C = false;
                Rect rect = this.f21122y;
                Rect rect2 = this.f21123z;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.B) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.A, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f21121x;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f21121x;
        if (drawable != null && drawable.isStateful()) {
            this.f21121x.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f21121x;
    }

    public int getForegroundGravity() {
        return this.A;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21121x;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.C = z10 | this.C;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.C = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f21121x;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f21121x);
            }
            this.f21121x = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.A == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.A != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.A = i10;
            if (i10 == 119 && this.f21121x != null) {
                this.f21121x.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21121x;
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21122y = new Rect();
        this.f21123z = new Rect();
        this.A = 119;
        this.B = true;
        this.C = false;
        int[] iArr = a.f25847n;
        r.a(context, attributeSet, i10, 0);
        r.b(context, attributeSet, iArr, i10, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        this.A = obtainStyledAttributes.getInt(1, this.A);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.B = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }
}
