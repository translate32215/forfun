package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import g.a;
import o0.x;
import s0.i;
import s0.k;
import s0.m;

/* compiled from: AppCompatCheckedTextView */
public class h extends CheckedTextView implements k, x, m {

    /* renamed from: a  reason: collision with root package name */
    public final i f926a;

    /* renamed from: b  reason: collision with root package name */
    public final e f927b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f928c;

    /* renamed from: d  reason: collision with root package name */
    public n f929d;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065 A[SYNTHETIC, Splitter:B:11:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087 A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5 A[Catch:{ all -> 0x00cf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            android.content.Context r11 = androidx.appcompat.widget.d1.a(r11)
            r0 = 2130968775(0x7f0400c7, float:1.7546213E38)
            r10.<init>(r11, r12, r0)
            android.content.Context r11 = r10.getContext()
            androidx.appcompat.widget.b1.a(r10, r11)
            androidx.appcompat.widget.e0 r11 = new androidx.appcompat.widget.e0
            r11.<init>(r10)
            r10.f928c = r11
            r11.g(r12, r0)
            r11.b()
            androidx.appcompat.widget.e r11 = new androidx.appcompat.widget.e
            r11.<init>(r10)
            r10.f927b = r11
            r11.d(r12, r0)
            androidx.appcompat.widget.i r11 = new androidx.appcompat.widget.i
            r11.<init>(r10)
            r10.f926a = r11
            android.content.Context r1 = r10.getContext()
            int[] r4 = e.l.f13512l
            r9 = 0
            androidx.appcompat.widget.g1 r1 = androidx.appcompat.widget.g1.r(r1, r12, r4, r0, r9)
            android.content.Context r3 = r10.getContext()
            android.content.res.TypedArray r6 = r1.f924b
            r8 = 0
            r7 = 2130968775(0x7f0400c7, float:1.7546213E38)
            r2 = r10
            r5 = r12
            o0.c0.B(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1
            boolean r3 = r1.p(r2)     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x0062
            int r3 = r1.m(r2, r9)     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x0062
            android.content.Context r4 = r10.getContext()     // Catch:{ NotFoundException -> 0x0062 }
            android.graphics.drawable.Drawable r3 = g.a.b(r4, r3)     // Catch:{ NotFoundException -> 0x0062 }
            r10.setCheckMarkDrawable((android.graphics.drawable.Drawable) r3)     // Catch:{ NotFoundException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 != 0) goto L_0x007e
            boolean r2 = r1.p(r9)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x007e
            int r2 = r1.m(r9, r9)     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x007e
            android.widget.CheckedTextView r3 = r11.f935a     // Catch:{ all -> 0x00cf }
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x00cf }
            android.graphics.drawable.Drawable r2 = g.a.b(r4, r2)     // Catch:{ all -> 0x00cf }
            r3.setCheckMarkDrawable(r2)     // Catch:{ all -> 0x00cf }
        L_0x007e:
            r2 = 2
            boolean r3 = r1.p(r2)     // Catch:{ all -> 0x00cf }
            r4 = 21
            if (r3 == 0) goto L_0x009e
            android.widget.CheckedTextView r3 = r11.f935a     // Catch:{ all -> 0x00cf }
            android.content.res.ColorStateList r2 = r1.c(r2)     // Catch:{ all -> 0x00cf }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00cf }
            if (r5 < r4) goto L_0x0095
            r3.setCheckMarkTintList(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x009e
        L_0x0095:
            boolean r5 = r3 instanceof s0.k     // Catch:{ all -> 0x00cf }
            if (r5 == 0) goto L_0x009e
            s0.k r3 = (s0.k) r3     // Catch:{ all -> 0x00cf }
            r3.setSupportCheckMarkTintList(r2)     // Catch:{ all -> 0x00cf }
        L_0x009e:
            r2 = 3
            boolean r3 = r1.p(r2)     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x00c2
            android.widget.CheckedTextView r11 = r11.f935a     // Catch:{ all -> 0x00cf }
            r3 = -1
            int r2 = r1.j(r2, r3)     // Catch:{ all -> 0x00cf }
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.k0.c(r2, r3)     // Catch:{ all -> 0x00cf }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00cf }
            if (r3 < r4) goto L_0x00b9
            r11.setCheckMarkTintMode(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x00c2
        L_0x00b9:
            boolean r3 = r11 instanceof s0.k     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x00c2
            s0.k r11 = (s0.k) r11     // Catch:{ all -> 0x00cf }
            r11.setSupportCheckMarkTintMode(r2)     // Catch:{ all -> 0x00cf }
        L_0x00c2:
            android.content.res.TypedArray r11 = r1.f924b
            r11.recycle()
            androidx.appcompat.widget.n r11 = r10.getEmojiTextViewHelper()
            r11.a(r12, r0)
            return
        L_0x00cf:
            r11 = move-exception
            android.content.res.TypedArray r12 = r1.f924b
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private n getEmojiTextViewHelper() {
        if (this.f929d == null) {
            this.f929d = new n(this);
        }
        return this.f929d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.f928c;
        if (e0Var != null) {
            e0Var.b();
        }
        e eVar = this.f927b;
        if (eVar != null) {
            eVar.a();
        }
        i iVar = this.f926a;
        if (iVar != null) {
            iVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.i(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f927b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f927b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        i iVar = this.f926a;
        if (iVar != null) {
            return iVar.f936b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i iVar = this.f926a;
        if (iVar != null) {
            return iVar.f937c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f928c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f928c.e();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p.h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1025b.f28196a.b(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f927b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f927b;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i iVar = this.f926a;
        if (iVar == null) {
            return;
        }
        if (iVar.f940f) {
            iVar.f940f = false;
            return;
        }
        iVar.f940f = true;
        iVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f928c;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f928c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f927b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f927b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i iVar = this.f926a;
        if (iVar != null) {
            iVar.f936b = colorStateList;
            iVar.f938d = true;
            iVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i iVar = this.f926a;
        if (iVar != null) {
            iVar.f937c = mode;
            iVar.f939e = true;
            iVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f928c.m(colorStateList);
        this.f928c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f928c.n(mode);
        this.f928c.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e0 e0Var = this.f928c;
        if (e0Var != null) {
            e0Var.h(context, i10);
        }
    }

    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(a.b(getContext(), i10));
    }
}
