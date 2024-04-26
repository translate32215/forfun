package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import com.google.android.material.internal.b;
import java.util.WeakHashMap;
import m0.c;
import m0.d;
import o0.c0;
import p9.f;

/* compiled from: CollapsingTextHelper */
public final class a {

    /* renamed from: g0  reason: collision with root package name */
    public static final boolean f9317g0 = (Build.VERSION.SDK_INT < 18);
    public p9.a A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public boolean E;
    public Bitmap F;
    public Paint G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public int M;
    public int[] N;
    public boolean O;
    public final TextPaint P;
    public final TextPaint Q;
    public TimeInterpolator R;
    public TimeInterpolator S;
    public float T;
    public float U;
    public float V;
    public ColorStateList W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f9318a;

    /* renamed from: a0  reason: collision with root package name */
    public StaticLayout f9319a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9320b;

    /* renamed from: b0  reason: collision with root package name */
    public float f9321b0;

    /* renamed from: c  reason: collision with root package name */
    public float f9322c;

    /* renamed from: c0  reason: collision with root package name */
    public float f9323c0;

    /* renamed from: d  reason: collision with root package name */
    public float f9324d;

    /* renamed from: d0  reason: collision with root package name */
    public float f9325d0;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f9326e;

    /* renamed from: e0  reason: collision with root package name */
    public CharSequence f9327e0;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f9328f;

    /* renamed from: f0  reason: collision with root package name */
    public int f9329f0 = b.f9350m;

    /* renamed from: g  reason: collision with root package name */
    public final RectF f9330g;

    /* renamed from: h  reason: collision with root package name */
    public int f9331h = 16;

    /* renamed from: i  reason: collision with root package name */
    public int f9332i = 16;

    /* renamed from: j  reason: collision with root package name */
    public float f9333j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f9334k = 15.0f;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f9335l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f9336m;

    /* renamed from: n  reason: collision with root package name */
    public float f9337n;

    /* renamed from: o  reason: collision with root package name */
    public float f9338o;

    /* renamed from: p  reason: collision with root package name */
    public float f9339p;

    /* renamed from: q  reason: collision with root package name */
    public float f9340q;

    /* renamed from: r  reason: collision with root package name */
    public float f9341r;

    /* renamed from: s  reason: collision with root package name */
    public float f9342s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f9343t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f9344u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f9345v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f9346w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f9347x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f9348y;

    /* renamed from: z  reason: collision with root package name */
    public Typeface f9349z;

    public a(View view) {
        this.f9318a = view;
        TextPaint textPaint = new TextPaint(129);
        this.P = textPaint;
        this.Q = new TextPaint(textPaint);
        this.f9328f = new Rect();
        this.f9326e = new Rect();
        this.f9330g = new RectF();
        this.f9324d = 0.5f;
        i(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i11)) * f10) + (((float) Color.alpha(i10)) * f11)), Math.round((((float) Color.red(i11)) * f10) + (((float) Color.red(i10)) * f11)), Math.round((((float) Color.green(i11)) * f10) + (((float) Color.green(i10)) * f11)), Math.round((((float) Color.blue(i11)) * f10) + (((float) Color.blue(i10)) * f11)));
    }

    public static float h(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return u8.a.a(f10, f11, f12);
    }

    public static boolean l(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public final boolean b(CharSequence charSequence) {
        c cVar;
        View view = this.f9318a;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        boolean z10 = true;
        if (c0.e.d(view) != 1) {
            z10 = false;
        }
        if (z10) {
            cVar = d.f21484d;
        } else {
            cVar = d.f21483c;
        }
        return ((d.c) cVar).b(charSequence, 0, charSequence.length());
    }

    public final void c(float f10) {
        this.f9330g.left = h((float) this.f9326e.left, (float) this.f9328f.left, f10, this.R);
        this.f9330g.top = h(this.f9337n, this.f9338o, f10, this.R);
        this.f9330g.right = h((float) this.f9326e.right, (float) this.f9328f.right, f10, this.R);
        this.f9330g.bottom = h((float) this.f9326e.bottom, (float) this.f9328f.bottom, f10, this.R);
        this.f9341r = h(this.f9339p, this.f9340q, f10, this.R);
        this.f9342s = h(this.f9337n, this.f9338o, f10, this.R);
        q(f10);
        TimeInterpolator timeInterpolator = u8.a.f26149b;
        this.f9323c0 = 1.0f - h(0.0f, 1.0f, 1.0f - f10, timeInterpolator);
        View view = this.f9318a;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.k(view);
        this.f9325d0 = h(1.0f, 0.0f, f10, timeInterpolator);
        c0.d.k(this.f9318a);
        ColorStateList colorStateList = this.f9336m;
        ColorStateList colorStateList2 = this.f9335l;
        if (colorStateList != colorStateList2) {
            this.P.setColor(a(g(colorStateList2), f(), f10));
        } else {
            this.P.setColor(f());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f11 = this.X;
            float f12 = this.Y;
            if (f11 != f12) {
                this.P.setLetterSpacing(h(f12, f11, f10, timeInterpolator));
            } else {
                this.P.setLetterSpacing(f11);
            }
        }
        this.J = h(0.0f, this.T, f10, (TimeInterpolator) null);
        this.K = h(0.0f, this.U, f10, (TimeInterpolator) null);
        this.L = h(0.0f, this.V, f10, (TimeInterpolator) null);
        int a10 = a(g((ColorStateList) null), g(this.W), f10);
        this.M = a10;
        this.P.setShadowLayer(this.J, this.K, this.L, a10);
        c0.d.k(this.f9318a);
    }

    public final void d(float f10, boolean z10) {
        float f11;
        float f12;
        boolean z11;
        StaticLayout staticLayout;
        if (this.B != null) {
            float width = (float) this.f9328f.width();
            float width2 = (float) this.f9326e.width();
            if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
                f12 = this.f9334k;
                f11 = this.X;
                this.H = 1.0f;
                Typeface typeface = this.f9349z;
                Typeface typeface2 = this.f9343t;
                if (typeface != typeface2) {
                    this.f9349z = typeface2;
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                float f13 = this.f9333j;
                float f14 = this.Y;
                Typeface typeface3 = this.f9349z;
                Typeface typeface4 = this.f9346w;
                if (typeface3 != typeface4) {
                    this.f9349z = typeface4;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                    this.H = 1.0f;
                } else {
                    this.H = h(this.f9333j, this.f9334k, f10, this.S) / this.f9333j;
                }
                float f15 = this.f9334k / this.f9333j;
                width = (!z10 && width2 * f15 > width) ? Math.min(width / f15, width2) : width2;
                f12 = f13;
                f11 = f14;
            }
            if (width > 0.0f) {
                z11 = ((this.I > f12 ? 1 : (this.I == f12 ? 0 : -1)) != 0) || ((this.Z > f11 ? 1 : (this.Z == f11 ? 0 : -1)) != 0) || this.O || z11;
                this.I = f12;
                this.Z = f11;
                this.O = false;
            }
            if (this.C == null || z11) {
                this.P.setTextSize(this.I);
                this.P.setTypeface(this.f9349z);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.P.setLetterSpacing(this.Z);
                }
                this.P.setLinearText(this.H != 1.0f);
                boolean b10 = b(this.B);
                this.D = b10;
                try {
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    b bVar = new b(this.B, this.P, (int) width);
                    bVar.f9365l = TextUtils.TruncateAt.END;
                    bVar.f9364k = b10;
                    bVar.f9358e = alignment;
                    bVar.f9363j = false;
                    bVar.f9359f = 1;
                    bVar.f9360g = 0.0f;
                    bVar.f9361h = 1.0f;
                    bVar.f9362i = this.f9329f0;
                    staticLayout = bVar.a();
                } catch (b.a e10) {
                    Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
                    staticLayout = null;
                }
                staticLayout.getClass();
                this.f9319a0 = staticLayout;
                this.C = staticLayout.getText();
            }
        }
    }

    public float e() {
        TextPaint textPaint = this.Q;
        textPaint.setTextSize(this.f9334k);
        textPaint.setTypeface(this.f9343t);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.X);
        }
        return -this.Q.ascent();
    }

    public int f() {
        return g(this.f9336m);
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.N;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f9345v;
            if (typeface != null) {
                this.f9344u = f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f9348y;
            if (typeface2 != null) {
                this.f9347x = f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f9344u;
            if (typeface3 == null) {
                typeface3 = this.f9345v;
            }
            this.f9343t = typeface3;
            Typeface typeface4 = this.f9347x;
            if (typeface4 == null) {
                typeface4 = this.f9348y;
            }
            this.f9346w = typeface4;
            k(true);
        }
    }

    public void j() {
        this.f9320b = this.f9328f.width() > 0 && this.f9328f.height() > 0 && this.f9326e.width() > 0 && this.f9326e.height() > 0;
    }

    public void k(boolean z10) {
        StaticLayout staticLayout;
        if ((this.f9318a.getHeight() > 0 && this.f9318a.getWidth() > 0) || z10) {
            d(1.0f, z10);
            CharSequence charSequence = this.C;
            if (!(charSequence == null || (staticLayout = this.f9319a0) == null)) {
                this.f9327e0 = TextUtils.ellipsize(charSequence, this.P, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.f9327e0;
            float f10 = 0.0f;
            if (charSequence2 != null) {
                this.f9321b0 = this.P.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f9321b0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f9332i, this.D ? 1 : 0);
            int i10 = absoluteGravity & 112;
            if (i10 == 48) {
                this.f9338o = (float) this.f9328f.top;
            } else if (i10 != 80) {
                this.f9338o = ((float) this.f9328f.centerY()) - ((this.P.descent() - this.P.ascent()) / 2.0f);
            } else {
                this.f9338o = this.P.ascent() + ((float) this.f9328f.bottom);
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 == 1) {
                this.f9340q = ((float) this.f9328f.centerX()) - (this.f9321b0 / 2.0f);
            } else if (i11 != 5) {
                this.f9340q = (float) this.f9328f.left;
            } else {
                this.f9340q = ((float) this.f9328f.right) - this.f9321b0;
            }
            d(0.0f, z10);
            StaticLayout staticLayout2 = this.f9319a0;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            StaticLayout staticLayout3 = this.f9319a0;
            CharSequence charSequence3 = this.C;
            if (charSequence3 != null) {
                f10 = this.P.measureText(charSequence3, 0, charSequence3.length());
            }
            StaticLayout staticLayout4 = this.f9319a0;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f9331h, this.D ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            if (i12 == 48) {
                this.f9337n = (float) this.f9326e.top;
            } else if (i12 != 80) {
                this.f9337n = ((float) this.f9326e.centerY()) - (height / 2.0f);
            } else {
                this.f9337n = this.P.descent() + (((float) this.f9326e.bottom) - height);
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 == 1) {
                this.f9339p = ((float) this.f9326e.centerX()) - (f10 / 2.0f);
            } else if (i13 != 5) {
                this.f9339p = (float) this.f9326e.left;
            } else {
                this.f9339p = ((float) this.f9326e.right) - f10;
            }
            Bitmap bitmap = this.F;
            if (bitmap != null) {
                bitmap.recycle();
                this.F = null;
            }
            q(this.f9322c);
            c(this.f9322c);
        }
    }

    public void m(ColorStateList colorStateList) {
        if (this.f9336m != colorStateList) {
            this.f9336m = colorStateList;
            k(false);
        }
    }

    public void n(int i10) {
        if (this.f9332i != i10) {
            this.f9332i = i10;
            k(false);
        }
    }

    public final boolean o(Typeface typeface) {
        p9.a aVar = this.A;
        if (aVar != null) {
            aVar.f23950c = true;
        }
        if (this.f9345v == typeface) {
            return false;
        }
        this.f9345v = typeface;
        Typeface a10 = f.a(this.f9318a.getContext().getResources().getConfiguration(), typeface);
        this.f9344u = a10;
        if (a10 == null) {
            a10 = this.f9345v;
        }
        this.f9343t = a10;
        return true;
    }

    public void p(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f9322c) {
            this.f9322c = f10;
            c(f10);
        }
    }

    public final void q(float f10) {
        boolean z10 = false;
        d(f10, false);
        if (f9317g0 && this.H != 1.0f) {
            z10 = true;
        }
        this.E = z10;
        if (z10 && this.F == null && !this.f9326e.isEmpty() && !TextUtils.isEmpty(this.C)) {
            c(0.0f);
            int width = this.f9319a0.getWidth();
            int height = this.f9319a0.getHeight();
            if (width > 0 && height > 0) {
                this.F = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f9319a0.draw(new Canvas(this.F));
                if (this.G == null) {
                    this.G = new Paint(3);
                }
            }
        }
        View view = this.f9318a;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.k(view);
    }

    public void r(Typeface typeface) {
        boolean z10;
        boolean o10 = o(typeface);
        if (this.f9348y != typeface) {
            this.f9348y = typeface;
            Typeface a10 = f.a(this.f9318a.getContext().getResources().getConfiguration(), typeface);
            this.f9347x = a10;
            if (a10 == null) {
                a10 = this.f9348y;
            }
            this.f9346w = a10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (o10 || z10) {
            k(false);
        }
    }

    public final boolean s() {
        return false;
    }
}
