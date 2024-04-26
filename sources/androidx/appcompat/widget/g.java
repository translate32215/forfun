package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.startapp.startappsdk.R;
import g.a;
import o0.x;
import s0.l;
import s0.m;

/* compiled from: AppCompatCheckBox */
public class g extends CheckBox implements l, x, m {

    /* renamed from: a  reason: collision with root package name */
    public final j f905a;

    /* renamed from: b  reason: collision with root package name */
    public final e f906b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f907c;

    /* renamed from: d  reason: collision with root package name */
    public n f908d;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private n getEmojiTextViewHelper() {
        if (this.f908d == null) {
            this.f908d = new n(this);
        }
        return this.f908d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f906b;
        if (eVar != null) {
            eVar.a();
        }
        e0 e0Var = this.f907c;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f906b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f906b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f905a;
        if (jVar != null) {
            return jVar.f961b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f905a;
        if (jVar != null) {
            return jVar.f962c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f907c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f907c.e();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1025b.f28196a.b(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f906b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f906b;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f905a;
        if (jVar == null) {
            return;
        }
        if (jVar.f965f) {
            jVar.f965f = false;
            return;
        }
        jVar.f965f = true;
        jVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f907c;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f907c;
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
        e eVar = this.f906b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f906b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f905a;
        if (jVar != null) {
            jVar.f961b = colorStateList;
            jVar.f963d = true;
            jVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f905a;
        if (jVar != null) {
            jVar.f962c = mode;
            jVar.f964e = true;
            jVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f907c.m(colorStateList);
        this.f907c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f907c.n(mode);
        this.f907c.b();
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(d1.a(context), attributeSet, i10);
        b1.a(this, getContext());
        j jVar = new j(this);
        this.f905a = jVar;
        jVar.b(attributeSet, i10);
        e eVar = new e(this);
        this.f906b = eVar;
        eVar.d(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f907c = e0Var;
        e0Var.g(attributeSet, i10);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(a.b(getContext(), i10));
    }
}
