package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.startapp.startappsdk.R;
import g.a;
import o0.x;
import s0.i;
import s0.m;

/* compiled from: AppCompatAutoCompleteTextView */
public class d extends AutoCompleteTextView implements x, m {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f864d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final e f865a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f866b;

    /* renamed from: c  reason: collision with root package name */
    public final m f867c;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f865a;
        if (eVar != null) {
            eVar.a();
        }
        e0 e0Var = this.f866b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.i(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f865a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f865a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f866b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f866b.e();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p.h(onCreateInputConnection, editorInfo, this);
        return this.f867c.h(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f865a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f865a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f866b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f866b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.j(this, callback));
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((z0.a) this.f867c.f1022c).f28182a.c(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f867c.f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f865a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f865a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f866b.m(colorStateList);
        this.f866b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f866b.n(mode);
        this.f866b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f866b;
        if (e0Var != null) {
            e0Var.h(context, i10);
        }
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(d1.a(context), attributeSet, i10);
        b1.a(this, getContext());
        g1 r10 = g1.r(getContext(), attributeSet, f864d, i10, 0);
        if (r10.p(0)) {
            setDropDownBackgroundDrawable(r10.g(0));
        }
        r10.f924b.recycle();
        e eVar = new e(this);
        this.f865a = eVar;
        eVar.d(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f866b = e0Var;
        e0Var.g(attributeSet, i10);
        e0Var.b();
        m mVar = new m((EditText) this);
        this.f867c = mVar;
        mVar.g(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener f10 = mVar.f(keyListener);
            if (f10 != keyListener) {
                super.setKeyListener(f10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }
}
