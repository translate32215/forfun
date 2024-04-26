package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import e.l;
import o0.c0;
import o0.x;

/* compiled from: AppCompatBackgroundHelper */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f871a;

    /* renamed from: b  reason: collision with root package name */
    public final k f872b;

    /* renamed from: c  reason: collision with root package name */
    public int f873c = -1;

    /* renamed from: d  reason: collision with root package name */
    public e1 f874d;

    /* renamed from: e  reason: collision with root package name */
    public e1 f875e;

    /* renamed from: f  reason: collision with root package name */
    public e1 f876f;

    public e(View view) {
        this.f871a = view;
        this.f872b = k.a();
    }

    public void a() {
        Drawable background = this.f871a.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = true;
            if (i10 <= 21 ? i10 == 21 : this.f874d != null) {
                if (this.f876f == null) {
                    this.f876f = new e1();
                }
                e1 e1Var = this.f876f;
                PorterDuff.Mode mode = null;
                e1Var.f894a = null;
                e1Var.f897d = false;
                e1Var.f895b = null;
                e1Var.f896c = false;
                ColorStateList k10 = c0.k(this.f871a);
                if (k10 != null) {
                    e1Var.f897d = true;
                    e1Var.f894a = k10;
                }
                View view = this.f871a;
                if (i10 >= 21) {
                    mode = c0.i.h(view);
                } else if (view instanceof x) {
                    mode = ((x) view).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    e1Var.f896c = true;
                    e1Var.f895b = mode;
                }
                if (e1Var.f897d || e1Var.f896c) {
                    k.f(background, e1Var, this.f871a.getDrawableState());
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            e1 e1Var2 = this.f875e;
            if (e1Var2 != null) {
                k.f(background, e1Var2, this.f871a.getDrawableState());
                return;
            }
            e1 e1Var3 = this.f874d;
            if (e1Var3 != null) {
                k.f(background, e1Var3, this.f871a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        e1 e1Var = this.f875e;
        if (e1Var != null) {
            return e1Var.f894a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        e1 e1Var = this.f875e;
        if (e1Var != null) {
            return e1Var.f895b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i10) {
        Context context = this.f871a.getContext();
        int[] iArr = l.A;
        boolean z10 = false;
        g1 r10 = g1.r(context, attributeSet, iArr, i10, 0);
        View view = this.f871a;
        c0.B(view, view.getContext(), iArr, attributeSet, r10.f924b, i10, 0);
        try {
            if (r10.p(0)) {
                this.f873c = r10.m(0, -1);
                ColorStateList d10 = this.f872b.d(this.f871a.getContext(), this.f873c);
                if (d10 != null) {
                    g(d10);
                }
            }
            if (r10.p(1)) {
                c0.F(this.f871a, r10.c(1));
            }
            if (r10.p(2)) {
                View view2 = this.f871a;
                PorterDuff.Mode c10 = k0.c(r10.j(2, -1), (PorterDuff.Mode) null);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 21) {
                    c0.i.r(view2, c10);
                    if (i11 == 21) {
                        Drawable background = view2.getBackground();
                        if (!(c0.i.g(view2) == null && c0.i.h(view2) == null)) {
                            z10 = true;
                        }
                        if (background != null && z10) {
                            if (background.isStateful()) {
                                background.setState(view2.getDrawableState());
                            }
                            c0.d.q(view2, background);
                        }
                    }
                } else if (view2 instanceof x) {
                    ((x) view2).setSupportBackgroundTintMode(c10);
                }
            }
        } finally {
            r10.f924b.recycle();
        }
    }

    public void e() {
        this.f873c = -1;
        g((ColorStateList) null);
        a();
    }

    public void f(int i10) {
        this.f873c = i10;
        k kVar = this.f872b;
        g(kVar != null ? kVar.d(this.f871a.getContext(), i10) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f874d == null) {
                this.f874d = new e1();
            }
            e1 e1Var = this.f874d;
            e1Var.f894a = colorStateList;
            e1Var.f897d = true;
        } else {
            this.f874d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f875e == null) {
            this.f875e = new e1();
        }
        e1 e1Var = this.f875e;
        e1Var.f894a = colorStateList;
        e1Var.f897d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f875e == null) {
            this.f875e = new e1();
        }
        e1 e1Var = this.f875e;
        e1Var.f895b = mode;
        e1Var.f896c = true;
        a();
    }
}
