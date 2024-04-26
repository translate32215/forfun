package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import p9.c;
import s9.f;
import s9.i;
import s9.j;
import s9.m;

public class ShapeableImageView extends AppCompatImageView implements m {
    public int A;
    public int B;
    public boolean C = false;

    /* renamed from: d  reason: collision with root package name */
    public final j f9293d = j.a.f25157a;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f9294e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f9295f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f9296g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f9297h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f9298i = new Path();

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f9299r;

    /* renamed from: s  reason: collision with root package name */
    public f f9300s;

    /* renamed from: t  reason: collision with root package name */
    public i f9301t;

    /* renamed from: u  reason: collision with root package name */
    public float f9302u;

    /* renamed from: v  reason: collision with root package name */
    public Path f9303v;

    /* renamed from: w  reason: collision with root package name */
    public int f9304w;

    /* renamed from: x  reason: collision with root package name */
    public int f9305x;

    /* renamed from: y  reason: collision with root package name */
    public int f9306y;

    /* renamed from: z  reason: collision with root package name */
    public int f9307z;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f9308a = new Rect();

        public a() {
        }

        public void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.f9301t != null) {
                if (shapeableImageView.f9300s == null) {
                    shapeableImageView.f9300s = new f(ShapeableImageView.this.f9301t);
                }
                ShapeableImageView.this.f9294e.round(this.f9308a);
                ShapeableImageView.this.f9300s.setBounds(this.f9308a);
                ShapeableImageView.this.f9300s.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(w9.a.a(context, attributeSet, 0, 2132083865), attributeSet, 0);
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f9297h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f9294e = new RectF();
        this.f9295f = new RectF();
        this.f9303v = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, t8.a.H, 0, 2132083865);
        this.f9299r = c.a(context2, obtainStyledAttributes, 9);
        this.f9302u = (float) obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f9304w = dimensionPixelSize;
        this.f9305x = dimensionPixelSize;
        this.f9306y = dimensionPixelSize;
        this.f9307z = dimensionPixelSize;
        this.f9304w = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f9305x = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f9306y = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f9307z = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.A = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.B = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f9296g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f9301t = i.c(context2, attributeSet, 0, 2132083865).a();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a());
        }
    }

    public final boolean c() {
        return (this.A == Integer.MIN_VALUE && this.B == Integer.MIN_VALUE) ? false : true;
    }

    public final boolean d() {
        return getLayoutDirection() == 1;
    }

    public final void e(int i10, int i11) {
        this.f9294e.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i10 - getPaddingRight()), (float) (i11 - getPaddingBottom()));
        this.f9293d.a(this.f9301t, 1.0f, this.f9294e, this.f9298i);
        this.f9303v.rewind();
        this.f9303v.addPath(this.f9298i);
        this.f9295f.set(0.0f, 0.0f, (float) i10, (float) i11);
        this.f9303v.addRect(this.f9295f, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f9307z;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.B;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return d() ? this.f9304w : this.f9306y;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (c()) {
            if (d() && (i11 = this.B) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!d() && (i10 = this.A) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f9304w;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (c()) {
            if (d() && (i11 = this.A) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!d() && (i10 = this.B) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f9306y;
    }

    public final int getContentPaddingStart() {
        int i10 = this.A;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return d() ? this.f9306y : this.f9304w;
    }

    public int getContentPaddingTop() {
        return this.f9305x;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public i getShapeAppearanceModel() {
        return this.f9301t;
    }

    public ColorStateList getStrokeColor() {
        return this.f9299r;
    }

    public float getStrokeWidth() {
        return this.f9302u;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f9303v, this.f9297h);
        if (this.f9299r != null) {
            this.f9296g.setStrokeWidth(this.f9302u);
            int colorForState = this.f9299r.getColorForState(getDrawableState(), this.f9299r.getDefaultColor());
            if (this.f9302u > 0.0f && colorForState != 0) {
                this.f9296g.setColor(colorForState);
                canvas.drawPath(this.f9298i, this.f9296g);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.C) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 <= 19 || isLayoutDirectionResolved()) {
                this.C = true;
                if (i12 < 21 || (!isPaddingRelative() && !c())) {
                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                } else {
                    setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
                }
            }
        }
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        e(i10, i11);
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    public void setShapeAppearanceModel(i iVar) {
        this.f9301t = iVar;
        f fVar = this.f9300s;
        if (fVar != null) {
            fVar.f25079a.f25098a = iVar;
            fVar.invalidateSelf();
        }
        e(getWidth(), getHeight());
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9299r = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(g.a.a(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f9302u != f10) {
            this.f9302u = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i10));
    }
}
