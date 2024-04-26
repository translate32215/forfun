package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import o0.x;
import s0.m;

/* compiled from: AppCompatToggleButton */
public class h0 extends ToggleButton implements x, m {

    /* renamed from: a  reason: collision with root package name */
    public final e f930a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f931b;

    /* renamed from: c  reason: collision with root package name */
    public n f932c;

    public h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        b1.a(this, getContext());
        e eVar = new e(this);
        this.f930a = eVar;
        eVar.d(attributeSet, 16842827);
        e0 e0Var = new e0(this);
        this.f931b = e0Var;
        e0Var.g(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private n getEmojiTextViewHelper() {
        if (this.f932c == null) {
            this.f932c = new n(this);
        }
        return this.f932c;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f930a;
        if (eVar != null) {
            eVar.a();
        }
        e0 e0Var = this.f931b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f930a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f930a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f931b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f931b.e();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1025b.f28196a.b(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f930a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f930a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f931b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f931b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().f1025b.f28196a.c(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1025b.f28196a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f930a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f930a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f931b.m(colorStateList);
        this.f931b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f931b.n(mode);
        this.f931b.b();
    }
}
