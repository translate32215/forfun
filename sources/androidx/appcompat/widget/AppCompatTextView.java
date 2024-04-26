package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import g.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import m0.b;
import o0.x;
import s0.b;
import s0.i;
import s0.m;

public class AppCompatTextView extends TextView implements x, m, b {

    /* renamed from: a  reason: collision with root package name */
    public final e f680a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f681b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f682c;

    /* renamed from: d  reason: collision with root package name */
    public n f683d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f684e;

    /* renamed from: f  reason: collision with root package name */
    public Future<m0.b> f685f;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private n getEmojiTextViewHelper() {
        if (this.f683d == null) {
            this.f683d = new n(this);
        }
        return this.f683d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f680a;
        if (eVar != null) {
            eVar.a();
        }
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.Y) {
            return super.getAutoSizeMaxTextSize();
        }
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            return Math.round(e0Var.f885i.f916e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.Y) {
            return super.getAutoSizeMinTextSize();
        }
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            return Math.round(e0Var.f885i.f915d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.Y) {
            return super.getAutoSizeStepGranularity();
        }
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            return Math.round(e0Var.f885i.f914c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.Y) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e0 e0Var = this.f681b;
        return e0Var != null ? e0Var.f885i.f917f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.Y) {
            e0 e0Var = this.f681b;
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f680a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f680a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f681b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f681b.e();
    }

    public CharSequence getText() {
        Future<m0.b> future = this.f685f;
        if (future != null) {
            try {
                this.f685f = null;
                i.g(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f682c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0Var.f863b;
        return textClassifier == null ? c0.a.a(c0Var.f862a) : textClassifier;
    }

    public b.a getTextMetricsParamsCompat() {
        return i.b(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f681b.i(this, onCreateInputConnection, editorInfo);
        p.h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e0 e0Var = this.f681b;
        if (e0Var != null && !s0.b.Y) {
            e0Var.f885i.a();
        }
    }

    public void onMeasure(int i10, int i11) {
        Future<m0.b> future = this.f685f;
        if (future != null) {
            try {
                this.f685f = null;
                i.g(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e0 e0Var = this.f681b;
        if (e0Var != null && !s0.b.Y && e0Var.f()) {
            this.f681b.f885i.a();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1025b.f28196a.b(z10);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (s0.b.Y) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.j(i10, i11, i12, i13);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (s0.b.Y) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.k(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (s0.b.Y) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.l(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f680a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f680a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.b();
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

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i10);
        } else {
            i.d(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i10);
        } else {
            i.e(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        i.f(this, i10);
    }

    public void setPrecomputedText(m0.b bVar) {
        i.g(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f680a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f680a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f681b.m(colorStateList);
        this.f681b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f681b.n(mode);
        this.f681b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.h(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f682c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f863b = textClassifier;
        }
    }

    public void setTextFuture(Future<m0.b> future) {
        this.f685f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 18) {
            TextDirectionHeuristic textDirectionHeuristic = aVar.f21478b;
            int i11 = 1;
            if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
                if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                    i11 = 2;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                    i11 = 3;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                    i11 = 4;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                    i11 = 5;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i11 = 6;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i11 = 7;
                }
            }
            i.b.h(this, i11);
        }
        if (i10 < 23) {
            float textScaleX = aVar.f21477a.getTextScaleX();
            getPaint().set(aVar.f21477a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.f21477a);
        i.c.e(this, aVar.f21479c);
        i.c.h(this, aVar.f21480d);
    }

    public void setTextSize(int i10, float f10) {
        boolean z10 = s0.b.Y;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        e0 e0Var = this.f681b;
        if (e0Var != null && !z10 && !e0Var.f()) {
            e0Var.f885i.f(i10, f10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r0 != null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTypeface(android.graphics.Typeface r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f684e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            if (r9 == 0) goto L_0x0050
            if (r10 <= 0) goto L_0x0050
            android.content.Context r1 = r8.getContext()
            g0.k r2 = g0.e.f18362a
            if (r1 == 0) goto L_0x0048
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 >= r3) goto L_0x0043
            g0.k r2 = g0.e.f18362a
            r2.getClass()
            long r3 = g0.k.f(r9)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0029
            r3 = r0
            goto L_0x0035
        L_0x0029:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, f0.e$c> r5 = r2.f18381a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r5.get(r3)
            f0.e$c r3 = (f0.e.c) r3
        L_0x0035:
            if (r3 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.Typeface r0 = r2.a(r1, r3, r0, r10)
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            goto L_0x0050
        L_0x0043:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r9, r10)
            goto L_0x0050
        L_0x0048:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Context cannot be null"
            r9.<init>(r10)
            throw r9
        L_0x0050:
            r1 = 1
            r8.f684e = r1
            if (r0 == 0) goto L_0x0056
            r9 = r0
        L_0x0056:
            r0 = 0
            super.setTypeface(r9, r10)     // Catch:{ all -> 0x005d }
            r8.f684e = r0
            return
        L_0x005d:
            r9 = move-exception
            r8.f684e = r0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.setTypeface(android.graphics.Typeface, int):void");
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(d1.a(context), attributeSet, i10);
        this.f684e = false;
        b1.a(this, getContext());
        e eVar = new e(this);
        this.f680a = eVar;
        eVar.d(attributeSet, i10);
        e0 e0Var = new e0(this);
        this.f681b = e0Var;
        e0Var.g(attributeSet, i10);
        e0Var.b();
        this.f682c = new c0(this);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = a.b(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b10, b11, b12, drawable);
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b10 = i10 != 0 ? a.b(context, i10) : null;
        Drawable b11 = i11 != 0 ? a.b(context, i11) : null;
        Drawable b12 = i12 != 0 ? a.b(context, i12) : null;
        if (i13 != 0) {
            drawable = a.b(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, drawable);
        e0 e0Var = this.f681b;
        if (e0Var != null) {
            e0Var.b();
        }
    }
}
