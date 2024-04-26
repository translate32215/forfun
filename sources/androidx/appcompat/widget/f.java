package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.startapp.startappsdk.R;
import o0.x;
import s0.b;
import s0.i;
import s0.m;

/* compiled from: AppCompatButton */
public class f extends Button implements x, b, m {

    /* renamed from: a  reason: collision with root package name */
    public final e f898a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f899b;

    /* renamed from: c  reason: collision with root package name */
    public n f900c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private n getEmojiTextViewHelper() {
        if (this.f900c == null) {
            this.f900c = new n(this);
        }
        return this.f900c;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f898a;
        if (eVar != null) {
            eVar.a();
        }
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.Y) {
            return super.getAutoSizeMaxTextSize();
        }
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            return Math.round(e0Var.f885i.f916e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.Y) {
            return super.getAutoSizeMinTextSize();
        }
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            return Math.round(e0Var.f885i.f915d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.Y) {
            return super.getAutoSizeStepGranularity();
        }
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            return Math.round(e0Var.f885i.f914c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.Y) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e0 e0Var = this.f899b;
        return e0Var != null ? e0Var.f885i.f917f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.Y) {
            e0 e0Var = this.f899b;
            if (e0Var != null) {
                return e0Var.f885i.f912a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.i(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f898a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f898a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f899b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f899b.e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e0 e0Var = this.f899b;
        if (e0Var != null && !b.Y) {
            e0Var.f885i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e0 e0Var = this.f899b;
        if (e0Var != null && !b.Y && e0Var.f()) {
            this.f899b.f885i.a();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1025b.f28196a.b(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (b.Y) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            e0Var.j(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (b.Y) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            e0Var.k(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (b.Y) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            e0Var.l(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f898a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f898a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.j(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().f1025b.f28196a.c(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1025b.f28196a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            e0Var.f877a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f898a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f898a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f899b.m(colorStateList);
        this.f899b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f899b.n(mode);
        this.f899b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f899b;
        if (e0Var != null) {
            e0Var.h(context, i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        boolean z10 = b.Y;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        e0 e0Var = this.f899b;
        if (e0Var != null && !z10 && !e0Var.f()) {
            e0Var.f885i.f(i10, f10);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(d1.a(context), attributeSet, i10);
        b1.a(this, getContext());
        e eVar = new e(this);
        this.f898a = eVar;
        eVar.d(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f899b = e0Var;
        e0Var.g(attributeSet, i10);
        e0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
    }
}
