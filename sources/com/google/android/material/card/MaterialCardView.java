package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import com.startapp.startappsdk.R;
import e.d;
import l9.r;
import p9.c;
import s9.f;
import s9.i;
import s9.m;

public class MaterialCardView extends r.a implements Checkable, m {

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f9063w = {16842911};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f9064x = {16842912};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f9065y = {R.attr.state_dragged};

    /* renamed from: r  reason: collision with root package name */
    public final b9.a f9066r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9067s = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9068t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9069u = false;

    /* renamed from: v  reason: collision with root package name */
    public a f9070v;

    public interface a {
        void a(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(w9.a.a(context, attributeSet, R.attr.materialCardViewStyle, 2132083809), attributeSet, R.attr.materialCardViewStyle);
        TypedArray d10 = r.d(getContext(), attributeSet, t8.a.f25853t, R.attr.materialCardViewStyle, 2132083809, new int[0]);
        b9.a aVar = new b9.a(this, attributeSet, R.attr.materialCardViewStyle, 2132083809);
        this.f9066r = aVar;
        aVar.f3664c.r(super.getCardBackgroundColor());
        aVar.f3663b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        aVar.m();
        ColorStateList a10 = c.a(aVar.f3662a.getContext(), d10, 11);
        aVar.f3675n = a10;
        if (a10 == null) {
            aVar.f3675n = ColorStateList.valueOf(-1);
        }
        aVar.f3669h = d10.getDimensionPixelSize(12, 0);
        boolean z10 = d10.getBoolean(0, false);
        aVar.f3681t = z10;
        aVar.f3662a.setLongClickable(z10);
        aVar.f3673l = c.a(aVar.f3662a.getContext(), d10, 6);
        aVar.i(c.c(aVar.f3662a.getContext(), d10, 2));
        aVar.f3667f = d10.getDimensionPixelSize(5, 0);
        aVar.f3666e = d10.getDimensionPixelSize(4, 0);
        aVar.f3668g = d10.getInteger(3, 8388661);
        ColorStateList a11 = c.a(aVar.f3662a.getContext(), d10, 7);
        aVar.f3672k = a11;
        if (a11 == null) {
            aVar.f3672k = ColorStateList.valueOf(d.g(aVar.f3662a, R.attr.colorControlHighlight));
        }
        ColorStateList a12 = c.a(aVar.f3662a.getContext(), d10, 1);
        aVar.f3665d.r(a12 == null ? ColorStateList.valueOf(0) : a12);
        aVar.o();
        aVar.f3664c.q(aVar.f3662a.getCardElevation());
        aVar.p();
        aVar.f3662a.setBackgroundInternal(aVar.g(aVar.f3664c));
        Drawable f10 = aVar.f3662a.isClickable() ? aVar.f() : aVar.f3665d;
        aVar.f3670i = f10;
        aVar.f3662a.setForeground(aVar.g(f10));
        d10.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f9066r.f3664c.getBounds());
        return rectF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r8.f9066r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto L_0x002a
            b9.a r0 = r8.f9066r
            android.graphics.drawable.Drawable r1 = r0.f3676o
            if (r1 == 0) goto L_0x002a
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r1.bottom
            android.graphics.drawable.Drawable r3 = r0.f3676o
            int r4 = r1.left
            int r5 = r1.top
            int r6 = r1.right
            int r7 = r2 + -1
            r3.setBounds(r4, r5, r6, r7)
            android.graphics.drawable.Drawable r0 = r0.f3676o
            int r3 = r1.left
            int r4 = r1.top
            int r1 = r1.right
            r0.setBounds(r3, r4, r1, r2)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.f():void");
    }

    public boolean g() {
        b9.a aVar = this.f9066r;
        return aVar != null && aVar.f3681t;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f9066r.f3664c.f25079a.f25101d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f9066r.f3665d.f25079a.f25101d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f9066r.f3671j;
    }

    public int getCheckedIconGravity() {
        return this.f9066r.f3668g;
    }

    public int getCheckedIconMargin() {
        return this.f9066r.f3666e;
    }

    public int getCheckedIconSize() {
        return this.f9066r.f3667f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f9066r.f3673l;
    }

    public int getContentPaddingBottom() {
        return this.f9066r.f3663b.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f9066r.f3663b.left;
    }

    public int getContentPaddingRight() {
        return this.f9066r.f3663b.right;
    }

    public int getContentPaddingTop() {
        return this.f9066r.f3663b.top;
    }

    public float getProgress() {
        return this.f9066r.f3664c.f25079a.f25108k;
    }

    public float getRadius() {
        return this.f9066r.f3664c.m();
    }

    public ColorStateList getRippleColor() {
        return this.f9066r.f3672k;
    }

    public i getShapeAppearanceModel() {
        return this.f9066r.f3674m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f9066r.f3675n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f9066r.f3675n;
    }

    public int getStrokeWidth() {
        return this.f9066r.f3669h;
    }

    public boolean isChecked() {
        return this.f9068t;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q.d.d(this, this.f9066r.f3664c);
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (g()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9063w);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9064x);
        }
        if (this.f9069u) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9065y);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f9066r.h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9067s) {
            if (!this.f9066r.f3680s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f9066r.f3680s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i10) {
        b9.a aVar = this.f9066r;
        aVar.f3664c.r(ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        b9.a aVar = this.f9066r;
        aVar.f3664c.q(aVar.f3662a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        f fVar = this.f9066r.f3665d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        fVar.r(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f9066r.f3681t = z10;
    }

    public void setChecked(boolean z10) {
        if (this.f9068t != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f9066r.i(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        b9.a aVar = this.f9066r;
        if (aVar.f3668g != i10) {
            aVar.f3668g = i10;
            aVar.h(aVar.f3662a.getMeasuredWidth(), aVar.f3662a.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f9066r.f3666e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f9066r.f3666e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f9066r.i(g.a.b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f9066r.f3667f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f9066r.f3667f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        b9.a aVar = this.f9066r;
        aVar.f3673l = colorStateList;
        Drawable drawable = aVar.f3671j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, colorStateList);
        }
    }

    public void setClickable(boolean z10) {
        super.setClickable(z10);
        b9.a aVar = this.f9066r;
        if (aVar != null) {
            Drawable drawable = aVar.f3670i;
            Drawable f10 = aVar.f3662a.isClickable() ? aVar.f() : aVar.f3665d;
            aVar.f3670i = f10;
            if (drawable == f10) {
                return;
            }
            if (Build.VERSION.SDK_INT < 23 || !(aVar.f3662a.getForeground() instanceof InsetDrawable)) {
                aVar.f3662a.setForeground(aVar.g(f10));
            } else {
                ((InsetDrawable) aVar.f3662a.getForeground()).setDrawable(f10);
            }
        }
    }

    public void setDragged(boolean z10) {
        if (this.f9069u != z10) {
            this.f9069u = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f9066r.n();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f9070v = aVar;
    }

    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.f9066r.n();
        this.f9066r.m();
    }

    public void setProgress(float f10) {
        b9.a aVar = this.f9066r;
        aVar.f3664c.s(f10);
        f fVar = aVar.f3665d;
        if (fVar != null) {
            fVar.s(f10);
        }
        f fVar2 = aVar.f3679r;
        if (fVar2 != null) {
            fVar2.s(f10);
        }
    }

    public void setRadius(float f10) {
        super.setRadius(f10);
        b9.a aVar = this.f9066r;
        aVar.j(aVar.f3674m.f(f10));
        aVar.f3670i.invalidateSelf();
        if (aVar.l() || aVar.k()) {
            aVar.m();
        }
        if (aVar.l()) {
            aVar.n();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        b9.a aVar = this.f9066r;
        aVar.f3672k = colorStateList;
        aVar.o();
    }

    public void setRippleColorResource(int i10) {
        b9.a aVar = this.f9066r;
        aVar.f3672k = g.a.a(getContext(), i10);
        aVar.o();
    }

    public void setShapeAppearanceModel(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(iVar.e(getBoundsAsRectF()));
        }
        this.f9066r.j(iVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        b9.a aVar = this.f9066r;
        if (i10 != aVar.f3669h) {
            aVar.f3669h = i10;
            aVar.p();
        }
        invalidate();
    }

    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.f9066r.n();
        this.f9066r.m();
    }

    public void toggle() {
        if (g() && isEnabled()) {
            this.f9068t = !this.f9068t;
            refreshDrawableState();
            f();
            b9.a aVar = this.f9066r;
            boolean z10 = this.f9068t;
            Drawable drawable = aVar.f3671j;
            if (drawable != null) {
                drawable.setAlpha(z10 ? 255 : 0);
            }
            a aVar2 = this.f9070v;
            if (aVar2 != null) {
                aVar2.a(this, this.f9068t);
            }
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        b9.a aVar = this.f9066r;
        if (aVar.f3675n != colorStateList) {
            aVar.f3675n = colorStateList;
            aVar.p();
        }
        invalidate();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f9066r.f3664c.r(colorStateList);
    }
}
