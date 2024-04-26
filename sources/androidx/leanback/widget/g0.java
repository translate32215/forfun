package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: NonOverlappingLinearLayoutWithForeground */
public class g0 extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f2394a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2395b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2396c;

    public g0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2394a;
        if (drawable != null) {
            if (this.f2395b) {
                this.f2395b = false;
                Rect rect = this.f2396c;
                rect.set(0, 0, getRight() - getLeft(), getBottom() - getTop());
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2394a;
        if (drawable != null && drawable.isStateful()) {
            this.f2394a.setState(getDrawableState());
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2394a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f2395b = z10 | this.f2395b;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2394a;
    }

    public g0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2396c = new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23 || Build.VERSION.SDK_INT < 23) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    if (i11 >= 23) {
                        setForeground(drawable);
                    }
                } else if (this.f2394a != drawable) {
                    this.f2394a = drawable;
                    this.f2395b = true;
                    setWillNotDraw(false);
                    this.f2394a.setCallback(this);
                    if (this.f2394a.isStateful()) {
                        this.f2394a.setState(getDrawableState());
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
