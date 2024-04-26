package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import e.l;
import g.a;
import o0.c0;
import s0.e;
import s0.n;

/* compiled from: AppCompatImageHelper */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1081a;

    /* renamed from: b  reason: collision with root package name */
    public e1 f1082b;

    /* renamed from: c  reason: collision with root package name */
    public e1 f1083c;

    /* renamed from: d  reason: collision with root package name */
    public int f1084d = 0;

    public r(ImageView imageView) {
        this.f1081a = imageView;
    }

    public void a() {
        ColorStateList colorStateList;
        Drawable drawable = this.f1081a.getDrawable();
        if (drawable != null) {
            k0.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = true;
            if (i10 <= 21 && i10 == 21) {
                if (this.f1083c == null) {
                    this.f1083c = new e1();
                }
                e1 e1Var = this.f1083c;
                PorterDuff.Mode mode = null;
                e1Var.f894a = null;
                e1Var.f897d = false;
                e1Var.f895b = null;
                e1Var.f896c = false;
                ImageView imageView = this.f1081a;
                if (i10 >= 21) {
                    colorStateList = e.a(imageView);
                } else {
                    colorStateList = imageView instanceof n ? ((n) imageView).getSupportImageTintList() : null;
                }
                if (colorStateList != null) {
                    e1Var.f897d = true;
                    e1Var.f894a = colorStateList;
                }
                ImageView imageView2 = this.f1081a;
                if (i10 >= 21) {
                    mode = e.b(imageView2);
                } else if (imageView2 instanceof n) {
                    mode = ((n) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    e1Var.f896c = true;
                    e1Var.f895b = mode;
                }
                if (e1Var.f897d || e1Var.f896c) {
                    k.f(drawable, e1Var, this.f1081a.getDrawableState());
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            e1 e1Var2 = this.f1082b;
            if (e1Var2 != null) {
                k.f(drawable, e1Var2, this.f1081a.getDrawableState());
            }
        }
    }

    public boolean b() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1081a.getBackground() instanceof RippleDrawable);
    }

    public void c(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int m10;
        Context context = this.f1081a.getContext();
        int[] iArr = l.f13506f;
        g1 r10 = g1.r(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1081a;
        c0.B(imageView, imageView.getContext(), iArr, attributeSet, r10.f924b, i10, 0);
        try {
            Drawable drawable3 = this.f1081a.getDrawable();
            if (!(drawable3 != null || (m10 = r10.m(1, -1)) == -1 || (drawable3 = a.b(this.f1081a.getContext(), m10)) == null)) {
                this.f1081a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                k0.a(drawable3);
            }
            if (r10.p(2)) {
                ImageView imageView2 = this.f1081a;
                ColorStateList c10 = r10.c(2);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 21) {
                    e.c(imageView2, c10);
                    if (!(i11 != 21 || (drawable2 = imageView2.getDrawable()) == null || e.a(imageView2) == null)) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable2);
                    }
                } else if (imageView2 instanceof n) {
                    ((n) imageView2).setSupportImageTintList(c10);
                }
            }
            if (r10.p(3)) {
                ImageView imageView3 = this.f1081a;
                PorterDuff.Mode c11 = k0.c(r10.j(3, -1), (PorterDuff.Mode) null);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 21) {
                    e.d(imageView3, c11);
                    if (!(i12 != 21 || (drawable = imageView3.getDrawable()) == null || e.a(imageView3) == null)) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView3.getDrawableState());
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                } else if (imageView3 instanceof n) {
                    ((n) imageView3).setSupportImageTintMode(c11);
                }
            }
        } finally {
            r10.f924b.recycle();
        }
    }

    public void d(int i10) {
        if (i10 != 0) {
            Drawable b10 = a.b(this.f1081a.getContext(), i10);
            if (b10 != null) {
                k0.a(b10);
            }
            this.f1081a.setImageDrawable(b10);
        } else {
            this.f1081a.setImageDrawable((Drawable) null);
        }
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (this.f1082b == null) {
            this.f1082b = new e1();
        }
        e1 e1Var = this.f1082b;
        e1Var.f894a = colorStateList;
        e1Var.f897d = true;
        a();
    }

    public void f(PorterDuff.Mode mode) {
        if (this.f1082b == null) {
            this.f1082b = new e1();
        }
        e1 e1Var = this.f1082b;
        e1Var.f895b = mode;
        e1Var.f896c = true;
        a();
    }
}
