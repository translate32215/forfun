package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import com.startapp.startappsdk.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l9.r;
import l9.u;
import o0.c0;
import q.d;
import s9.f;
import s9.i;
import s9.m;

public class MaterialButton extends f implements Checkable, m {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f9028y = {16842911};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f9029z = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public final a9.a f9030d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<a> f9031e = new LinkedHashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public b f9032f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f9033g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f9034h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f9035i;

    /* renamed from: r  reason: collision with root package name */
    public int f9036r;

    /* renamed from: s  reason: collision with root package name */
    public int f9037s;

    /* renamed from: t  reason: collision with root package name */
    public int f9038t;

    /* renamed from: u  reason: collision with root package name */
    public int f9039u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9040v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9041w;

    /* renamed from: x  reason: collision with root package name */
    public int f9042x;

    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    public interface b {
    }

    public static class c extends u0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f9043c;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new c[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeInt(this.f9043c ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f9043c = parcel.readInt() != 1 ? false : true;
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(w9.a.a(context, attributeSet, R.attr.materialButtonStyle, 2132083797), attributeSet, R.attr.materialButtonStyle);
        boolean z10 = false;
        this.f9040v = false;
        this.f9041w = false;
        Context context2 = getContext();
        TypedArray d10 = r.d(context2, attributeSet, t8.a.f25849p, R.attr.materialButtonStyle, 2132083797, new int[0]);
        this.f9039u = d10.getDimensionPixelSize(12, 0);
        this.f9033g = u.d(d10.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f9034h = p9.c.a(getContext(), d10, 14);
        this.f9035i = p9.c.c(getContext(), d10, 10);
        this.f9042x = d10.getInteger(11, 1);
        this.f9036r = d10.getDimensionPixelSize(13, 0);
        a9.a aVar = new a9.a(this, i.c(context2, attributeSet, R.attr.materialButtonStyle, 2132083797).a());
        this.f9030d = aVar;
        aVar.f154c = d10.getDimensionPixelOffset(1, 0);
        aVar.f155d = d10.getDimensionPixelOffset(2, 0);
        aVar.f156e = d10.getDimensionPixelOffset(3, 0);
        aVar.f157f = d10.getDimensionPixelOffset(4, 0);
        if (d10.hasValue(8)) {
            int dimensionPixelSize = d10.getDimensionPixelSize(8, -1);
            aVar.f158g = dimensionPixelSize;
            aVar.e(aVar.f153b.f((float) dimensionPixelSize));
            aVar.f167p = true;
        }
        aVar.f159h = d10.getDimensionPixelSize(20, 0);
        aVar.f160i = u.d(d10.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f161j = p9.c.a(getContext(), d10, 6);
        aVar.f162k = p9.c.a(getContext(), d10, 19);
        aVar.f163l = p9.c.a(getContext(), d10, 16);
        aVar.f168q = d10.getBoolean(5, false);
        aVar.f170s = d10.getDimensionPixelSize(9, 0);
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int f10 = c0.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = c0.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d10.hasValue(0)) {
            aVar.f166o = true;
            setSupportBackgroundTintList(aVar.f161j);
            setSupportBackgroundTintMode(aVar.f160i);
        } else {
            aVar.g();
        }
        c0.e.k(this, f10 + aVar.f154c, paddingTop + aVar.f156e, e10 + aVar.f155d, paddingBottom + aVar.f157f);
        d10.recycle();
        setCompoundDrawablePadding(this.f9039u);
        g(this.f9035i != null ? true : z10);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        a9.a aVar = this.f9030d;
        return aVar != null && aVar.f168q;
    }

    public final boolean b() {
        int i10 = this.f9042x;
        return i10 == 3 || i10 == 4;
    }

    public final boolean c() {
        int i10 = this.f9042x;
        return i10 == 1 || i10 == 2;
    }

    public final boolean d() {
        int i10 = this.f9042x;
        return i10 == 16 || i10 == 32;
    }

    public final boolean e() {
        a9.a aVar = this.f9030d;
        return aVar != null && !aVar.f166o;
    }

    public final void f() {
        if (c()) {
            s0.i.c(this, this.f9035i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (b()) {
            s0.i.c(this, (Drawable) null, (Drawable) null, this.f9035i, (Drawable) null);
        } else if (d()) {
            s0.i.c(this, (Drawable) null, this.f9035i, (Drawable) null, (Drawable) null);
        }
    }

    public final void g(boolean z10) {
        Drawable drawable = this.f9035i;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.n(drawable).mutate();
            this.f9035i = mutate;
            androidx.core.graphics.drawable.a.l(mutate, this.f9034h);
            PorterDuff.Mode mode = this.f9033g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.m(this.f9035i, mode);
            }
            int i10 = this.f9036r;
            if (i10 == 0) {
                i10 = this.f9035i.getIntrinsicWidth();
            }
            int i11 = this.f9036r;
            if (i11 == 0) {
                i11 = this.f9035i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f9035i;
            int i12 = this.f9037s;
            int i13 = this.f9038t;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f9035i.setVisible(true, z10);
        }
        if (z10) {
            f();
            return;
        }
        Drawable[] a10 = s0.i.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((!c() || drawable3 == this.f9035i) && ((!b() || drawable5 == this.f9035i) && (!d() || drawable4 == this.f9035i))) {
            z11 = false;
        }
        if (z11) {
            f();
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f9030d.f158g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f9035i;
    }

    public int getIconGravity() {
        return this.f9042x;
    }

    public int getIconPadding() {
        return this.f9039u;
    }

    public int getIconSize() {
        return this.f9036r;
    }

    public ColorStateList getIconTint() {
        return this.f9034h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f9033g;
    }

    public int getInsetBottom() {
        return this.f9030d.f157f;
    }

    public int getInsetTop() {
        return this.f9030d.f156e;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f9030d.f163l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (e()) {
            return this.f9030d.f153b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f9030d.f162k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f9030d.f159h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f9030d.f161j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f9030d.f160i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(int i10, int i11) {
        if (this.f9035i != null && getLayout() != null) {
            if (c() || b()) {
                this.f9038t = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i12 = this.f9042x;
                boolean z10 = true;
                if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f9037s = 0;
                    g(false);
                    return;
                }
                int i13 = this.f9036r;
                if (i13 == 0) {
                    i13 = this.f9035i.getIntrinsicWidth();
                }
                int textWidth = i10 - getTextWidth();
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                int e10 = (((textWidth - c0.e.e(this)) - i13) - this.f9039u) - c0.e.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                boolean z11 = c0.e.d(this) == 1;
                if (this.f9042x != 4) {
                    z10 = false;
                }
                if (z11 != z10) {
                    e10 = -e10;
                }
                if (this.f9037s != e10) {
                    this.f9037s = e10;
                    g(false);
                }
            } else if (d()) {
                this.f9037s = 0;
                if (this.f9042x == 16) {
                    this.f9038t = 0;
                    g(false);
                    return;
                }
                int i14 = this.f9036r;
                if (i14 == 0) {
                    i14 = this.f9035i.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i14) - this.f9039u) - getPaddingBottom()) / 2;
                if (this.f9038t != textHeight) {
                    this.f9038t = textHeight;
                    g(false);
                }
            }
        }
    }

    public boolean isChecked() {
        return this.f9040v;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            d.d(this, this.f9030d.b());
        }
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f9028y);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f9029z);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a9.a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f9030d) != null) {
            int i14 = i13 - i11;
            int i15 = i12 - i10;
            Drawable drawable = aVar.f164m;
            if (drawable != null) {
                drawable.setBounds(aVar.f154c, aVar.f156e, i15 - aVar.f155d, i14 - aVar.f157f);
            }
        }
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f25915a);
        setChecked(cVar.f9043c);
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f9043c = this.f9040v;
        return cVar;
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f9035i != null) {
            if (this.f9035i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (e()) {
            a9.a aVar = this.f9030d;
            if (aVar.b() != null) {
                aVar.b().setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            a9.a aVar = this.f9030d;
            aVar.f166o = true;
            aVar.f152a.setSupportBackgroundTintList(aVar.f161j);
            aVar.f152a.setSupportBackgroundTintMode(aVar.f160i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (e()) {
            this.f9030d.f168q = z10;
        }
    }

    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f9040v != z10) {
            this.f9040v = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.f9040v;
                if (!materialButtonToggleGroup.f9050f) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (!this.f9041w) {
                this.f9041w = true;
                Iterator it = this.f9031e.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.f9040v);
                }
                this.f9041w = false;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (e()) {
            a9.a aVar = this.f9030d;
            if (!aVar.f167p || aVar.f158g != i10) {
                aVar.f158g = i10;
                aVar.f167p = true;
                aVar.e(aVar.f153b.f((float) i10));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (e()) {
            s9.f b10 = this.f9030d.b();
            f.b bVar = b10.f25079a;
            if (bVar.f25112o != f10) {
                bVar.f25112o = f10;
                b10.z();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f9035i != drawable) {
            this.f9035i = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f9042x != i10) {
            this.f9042x = i10;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f9039u != i10) {
            this.f9039u = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f9036r != i10) {
            this.f9036r = i10;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f9034h != colorStateList) {
            this.f9034h = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f9033g != mode) {
            this.f9033g = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(g.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        a9.a aVar = this.f9030d;
        aVar.f(aVar.f156e, i10);
    }

    public void setInsetTop(int i10) {
        a9.a aVar = this.f9030d;
        aVar.f(i10, aVar.f157f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f9032f = bVar;
    }

    public void setPressed(boolean z10) {
        b bVar = this.f9032f;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            a9.a aVar = this.f9030d;
            if (aVar.f163l != colorStateList) {
                aVar.f163l = colorStateList;
                boolean z10 = a9.a.f150t;
                if (z10 && (aVar.f152a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) aVar.f152a.getBackground()).setColor(q9.b.c(colorStateList));
                } else if (!z10 && (aVar.f152a.getBackground() instanceof q9.a)) {
                    ((q9.a) aVar.f152a.getBackground()).setTintList(q9.b.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (e()) {
            setRippleColor(g.a.a(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        if (e()) {
            this.f9030d.e(iVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (e()) {
            a9.a aVar = this.f9030d;
            aVar.f165n = z10;
            aVar.h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            a9.a aVar = this.f9030d;
            if (aVar.f162k != colorStateList) {
                aVar.f162k = colorStateList;
                aVar.h();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (e()) {
            setStrokeColor(g.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (e()) {
            a9.a aVar = this.f9030d;
            if (aVar.f159h != i10) {
                aVar.f159h = i10;
                aVar.h();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            a9.a aVar = this.f9030d;
            if (aVar.f161j != colorStateList) {
                aVar.f161j = colorStateList;
                if (aVar.b() != null) {
                    androidx.core.graphics.drawable.a.l(aVar.b(), aVar.f161j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            a9.a aVar = this.f9030d;
            if (aVar.f160i != mode) {
                aVar.f160i = mode;
                if (aVar.b() != null && aVar.f160i != null) {
                    androidx.core.graphics.drawable.a.m(aVar.b(), aVar.f160i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void toggle() {
        setChecked(!this.f9040v);
    }
}
