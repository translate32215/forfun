package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l9.o;
import l9.u;
import q9.b;
import s9.f;
import s9.i;
import u8.g;

/* compiled from: ChipDrawable */
public class a extends f implements Drawable.Callback, o.b {
    public static final int[] W0 = {16842910};
    public static final ShapeDrawable X0 = new ShapeDrawable(new OvalShape());
    public final o A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public ColorStateList H;
    public boolean H0;
    public ColorStateList I;
    public int I0;
    public float J;
    public int J0 = 255;
    public float K = -1.0f;
    public ColorFilter K0;
    public ColorStateList L;
    public PorterDuffColorFilter L0;
    public float M;
    public ColorStateList M0;
    public ColorStateList N;
    public PorterDuff.Mode N0 = PorterDuff.Mode.SRC_IN;
    public CharSequence O;
    public int[] O0;
    public boolean P;
    public boolean P0;
    public Drawable Q;
    public ColorStateList Q0;
    public ColorStateList R;
    public WeakReference<C0094a> R0 = new WeakReference<>((Object) null);
    public float S;
    public TextUtils.TruncateAt S0;
    public boolean T0;
    public int U0;
    public boolean V0;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f9097a0;

    /* renamed from: b0  reason: collision with root package name */
    public Drawable f9098b0;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f9099c0;

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f9100d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f9101e0;

    /* renamed from: f0  reason: collision with root package name */
    public CharSequence f9102f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f9103g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9104h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f9105i0;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f9106j0;

    /* renamed from: k0  reason: collision with root package name */
    public g f9107k0;

    /* renamed from: l0  reason: collision with root package name */
    public g f9108l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f9109m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f9110n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f9111o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f9112p0;

    /* renamed from: q0  reason: collision with root package name */
    public float f9113q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f9114r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f9115s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f9116t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Context f9117u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Paint f9118v0 = new Paint(1);

    /* renamed from: w0  reason: collision with root package name */
    public final Paint.FontMetrics f9119w0 = new Paint.FontMetrics();

    /* renamed from: x0  reason: collision with root package name */
    public final RectF f9120x0 = new RectF();

    /* renamed from: y0  reason: collision with root package name */
    public final PointF f9121y0 = new PointF();

    /* renamed from: z0  reason: collision with root package name */
    public final Path f9122z0 = new Path();

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* compiled from: ChipDrawable */
    public interface C0094a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(i.c(context, attributeSet, i10, i11).a());
        this.f25079a.f25099b = new i9.a(context);
        z();
        this.f9117u0 = context;
        o oVar = new o(this);
        this.A0 = oVar;
        this.O = "";
        oVar.f21165a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = W0;
        setState(iArr);
        g0(iArr);
        this.T0 = true;
        if (b.f24232a) {
            X0.setTint(-1);
        }
    }

    public static boolean J(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean K(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.j(drawable, androidx.core.graphics.drawable.a.e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f9098b0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.O0);
                }
                androidx.core.graphics.drawable.a.l(drawable, this.f9100d0);
                return;
            }
            Drawable drawable2 = this.Q;
            if (drawable == drawable2 && this.Z) {
                androidx.core.graphics.drawable.a.l(drawable2, this.R);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void B(Rect rect, RectF rectF) {
        float f10;
        rectF.setEmpty();
        if (r0() || q0()) {
            float f11 = this.f9109m0 + this.f9110n0;
            float I2 = I();
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                float f12 = ((float) rect.left) + f11;
                rectF.left = f12;
                rectF.right = f12 + I2;
            } else {
                float f13 = ((float) rect.right) - f11;
                rectF.right = f13;
                rectF.left = f13 - I2;
            }
            Drawable drawable = this.H0 ? this.f9105i0 : this.Q;
            float f14 = this.S;
            if (f14 <= 0.0f && drawable != null) {
                f14 = (float) Math.ceil((double) u.b(this.f9117u0, 24));
                if (((float) drawable.getIntrinsicHeight()) <= f14) {
                    f10 = (float) drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f14;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    public float C() {
        if (!r0() && !q0()) {
            return 0.0f;
        }
        return I() + this.f9110n0 + this.f9111o0;
    }

    public final void D(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (s0()) {
            float f10 = this.f9116t0 + this.f9115s0;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                float f11 = ((float) rect.right) - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f9101e0;
            } else {
                float f12 = ((float) rect.left) + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f9101e0;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.f9101e0;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public final void E(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (s0()) {
            float f10 = this.f9116t0 + this.f9115s0 + this.f9101e0 + this.f9114r0 + this.f9113q0;
            if (androidx.core.graphics.drawable.a.e(this) == 0) {
                float f11 = (float) rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = (float) i10;
                rectF.right = ((float) i10) + f10;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public float F() {
        if (s0()) {
            return this.f9114r0 + this.f9101e0 + this.f9115s0;
        }
        return 0.0f;
    }

    public float G() {
        return this.V0 ? m() : this.K;
    }

    public Drawable H() {
        Drawable drawable = this.f9098b0;
        if (drawable != null) {
            return drawable instanceof h0.b ? ((h0.b) drawable).b() : drawable;
        }
        return null;
    }

    public final float I() {
        Drawable drawable = this.H0 ? this.f9105i0 : this.Q;
        float f10 = this.S;
        return (f10 > 0.0f || drawable == null) ? f10 : (float) drawable.getIntrinsicWidth();
    }

    public void L() {
        C0094a aVar = (C0094a) this.R0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.H
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.B0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r8.e(r1)
            int r3 = r8.B0
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r8.B0 = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r8.I
            if (r3 == 0) goto L_0x0028
            int r5 = r8.C0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r8.e(r3)
            int r5 = r8.C0
            if (r5 == r3) goto L_0x0034
            r8.C0 = r3
            r0 = 1
        L_0x0034:
            int r1 = g0.a.b(r3, r1)
            int r3 = r8.D0
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            s9.f$b r5 = r8.f25079a
            android.content.res.ColorStateList r5 = r5.f25101d
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r8.D0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.r(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r8.L
            if (r1 == 0) goto L_0x0060
            int r3 = r8.E0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r8.E0
            if (r3 == r1) goto L_0x0068
            r8.E0 = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r8.Q0
            if (r1 == 0) goto L_0x007b
            boolean r1 = q9.b.d(r9)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r8.Q0
            int r3 = r8.F0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r8.F0
            if (r3 == r1) goto L_0x0087
            r8.F0 = r1
            boolean r1 = r8.P0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            l9.o r1 = r8.A0
            p9.d r1 = r1.f21170f
            if (r1 == 0) goto L_0x0098
            android.content.res.ColorStateList r1 = r1.f23960j
            if (r1 == 0) goto L_0x0098
            int r3 = r8.G0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            int r3 = r8.G0
            if (r3 == r1) goto L_0x00a0
            r8.G0 = r1
            r0 = 1
        L_0x00a0:
            int[] r1 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r1 != 0) goto L_0x00ab
        L_0x00a9:
            r1 = 0
            goto L_0x00b8
        L_0x00ab:
            int r5 = r1.length
            r6 = 0
        L_0x00ad:
            if (r6 >= r5) goto L_0x00a9
            r7 = r1[r6]
            if (r7 != r3) goto L_0x00b5
            r1 = 1
            goto L_0x00b8
        L_0x00b5:
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00b8:
            if (r1 == 0) goto L_0x00c0
            boolean r1 = r8.f9103g0
            if (r1 == 0) goto L_0x00c0
            r1 = 1
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            boolean r3 = r8.H0
            if (r3 == r1) goto L_0x00db
            android.graphics.drawable.Drawable r3 = r8.f9105i0
            if (r3 == 0) goto L_0x00db
            float r0 = r8.C()
            r8.H0 = r1
            float r1 = r8.C()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            r0 = 1
            r1 = 1
            goto L_0x00dc
        L_0x00da:
            r0 = 1
        L_0x00db:
            r1 = 0
        L_0x00dc:
            android.content.res.ColorStateList r3 = r8.M0
            if (r3 == 0) goto L_0x00e7
            int r5 = r8.I0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00e8
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            int r5 = r8.I0
            if (r5 == r3) goto L_0x00f9
            r8.I0 = r3
            android.content.res.ColorStateList r0 = r8.M0
            android.graphics.PorterDuff$Mode r3 = r8.N0
            android.graphics.PorterDuffColorFilter r0 = h9.a.a(r8, r0, r3)
            r8.L0 = r0
            goto L_0x00fa
        L_0x00f9:
            r4 = r0
        L_0x00fa:
            android.graphics.drawable.Drawable r0 = r8.Q
            boolean r0 = K(r0)
            if (r0 == 0) goto L_0x0109
            android.graphics.drawable.Drawable r0 = r8.Q
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0109:
            android.graphics.drawable.Drawable r0 = r8.f9105i0
            boolean r0 = K(r0)
            if (r0 == 0) goto L_0x0118
            android.graphics.drawable.Drawable r0 = r8.f9105i0
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0118:
            android.graphics.drawable.Drawable r0 = r8.f9098b0
            boolean r0 = K(r0)
            if (r0 == 0) goto L_0x0135
            int r0 = r9.length
            int r3 = r10.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r2, r0, r2, r3)
            int r9 = r9.length
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r9, r3)
            android.graphics.drawable.Drawable r9 = r8.f9098b0
            boolean r9 = r9.setState(r0)
            r4 = r4 | r9
        L_0x0135:
            boolean r9 = q9.b.f24232a
            if (r9 == 0) goto L_0x0148
            android.graphics.drawable.Drawable r9 = r8.f9099c0
            boolean r9 = K(r9)
            if (r9 == 0) goto L_0x0148
            android.graphics.drawable.Drawable r9 = r8.f9099c0
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x0148:
            if (r4 == 0) goto L_0x014d
            r8.invalidateSelf()
        L_0x014d:
            if (r1 == 0) goto L_0x0152
            r8.L()
        L_0x0152:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.M(int[], int[]):boolean");
    }

    public void N(boolean z10) {
        if (this.f9103g0 != z10) {
            this.f9103g0 = z10;
            float C = C();
            if (!z10 && this.H0) {
                this.H0 = false;
            }
            float C2 = C();
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void O(Drawable drawable) {
        if (this.f9105i0 != drawable) {
            float C = C();
            this.f9105i0 = drawable;
            float C2 = C();
            t0(this.f9105i0);
            A(this.f9105i0);
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void P(ColorStateList colorStateList) {
        if (this.f9106j0 != colorStateList) {
            this.f9106j0 = colorStateList;
            if (this.f9104h0 && this.f9105i0 != null && this.f9103g0) {
                androidx.core.graphics.drawable.a.l(this.f9105i0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Q(boolean z10) {
        if (this.f9104h0 != z10) {
            boolean q02 = q0();
            this.f9104h0 = z10;
            boolean q03 = q0();
            if (q02 != q03) {
                if (q03) {
                    A(this.f9105i0);
                } else {
                    t0(this.f9105i0);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public void R(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void S(float f10) {
        if (this.K != f10) {
            this.K = f10;
            this.f25079a.f25098a = this.f25079a.f25098a.f(f10);
            invalidateSelf();
        }
    }

    public void T(float f10) {
        if (this.f9116t0 != f10) {
            this.f9116t0 = f10;
            invalidateSelf();
            L();
        }
    }

    public void U(Drawable drawable) {
        Drawable drawable2 = this.Q;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof h0.b) {
            drawable2 = ((h0.b) drawable2).b();
        }
        if (drawable2 != drawable) {
            float C = C();
            if (drawable != null) {
                drawable3 = androidx.core.graphics.drawable.a.n(drawable).mutate();
            }
            this.Q = drawable3;
            float C2 = C();
            t0(drawable2);
            if (r0()) {
                A(this.Q);
            }
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void V(float f10) {
        if (this.S != f10) {
            float C = C();
            this.S = f10;
            float C2 = C();
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void W(ColorStateList colorStateList) {
        this.Z = true;
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (r0()) {
                androidx.core.graphics.drawable.a.l(this.Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X(boolean z10) {
        if (this.P != z10) {
            boolean r02 = r0();
            this.P = z10;
            boolean r03 = r0();
            if (r02 != r03) {
                if (r03) {
                    A(this.Q);
                } else {
                    t0(this.Q);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public void Y(float f10) {
        if (this.J != f10) {
            this.J = f10;
            invalidateSelf();
            L();
        }
    }

    public void Z(float f10) {
        if (this.f9109m0 != f10) {
            this.f9109m0 = f10;
            invalidateSelf();
            L();
        }
    }

    public void a() {
        L();
        invalidateSelf();
    }

    public void a0(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.V0) {
                w(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void b0(float f10) {
        if (this.M != f10) {
            this.M = f10;
            this.f9118v0.setStrokeWidth(f10);
            if (this.V0) {
                this.f25079a.f25109l = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void c0(Drawable drawable) {
        Drawable H2 = H();
        if (H2 != drawable) {
            float F = F();
            this.f9098b0 = drawable != null ? androidx.core.graphics.drawable.a.n(drawable).mutate() : null;
            if (b.f24232a) {
                this.f9099c0 = new RippleDrawable(b.c(this.N), this.f9098b0, X0);
            }
            float F2 = F();
            t0(H2);
            if (s0()) {
                A(this.f9098b0);
            }
            invalidateSelf();
            if (F != F2) {
                L();
            }
        }
    }

    public void d0(float f10) {
        if (this.f9115s0 != f10) {
            this.f9115s0 = f10;
            invalidateSelf();
            if (s0()) {
                L();
            }
        }
    }

    public void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.J0) != 0) {
            if (i10 < 255) {
                float f10 = (float) bounds.left;
                float f11 = (float) bounds.top;
                float f12 = (float) bounds.right;
                float f13 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i17 = canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
                } else {
                    i17 = canvas.saveLayerAlpha(f10, f11, f12, f13, i10, 31);
                }
                i11 = i17;
            } else {
                i11 = 0;
            }
            if (!this.V0) {
                this.f9118v0.setColor(this.B0);
                this.f9118v0.setStyle(Paint.Style.FILL);
                this.f9120x0.set(bounds);
                canvas2.drawRoundRect(this.f9120x0, G(), G(), this.f9118v0);
            }
            if (!this.V0) {
                this.f9118v0.setColor(this.C0);
                this.f9118v0.setStyle(Paint.Style.FILL);
                Paint paint = this.f9118v0;
                ColorFilter colorFilter = this.K0;
                if (colorFilter == null) {
                    colorFilter = this.L0;
                }
                paint.setColorFilter(colorFilter);
                this.f9120x0.set(bounds);
                canvas2.drawRoundRect(this.f9120x0, G(), G(), this.f9118v0);
            }
            if (this.V0) {
                super.draw(canvas);
            }
            if (this.M > 0.0f && !this.V0) {
                this.f9118v0.setColor(this.E0);
                this.f9118v0.setStyle(Paint.Style.STROKE);
                if (!this.V0) {
                    Paint paint2 = this.f9118v0;
                    ColorFilter colorFilter2 = this.K0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.L0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f9120x0;
                float f14 = this.M / 2.0f;
                rectF.set(((float) bounds.left) + f14, ((float) bounds.top) + f14, ((float) bounds.right) - f14, ((float) bounds.bottom) - f14);
                float f15 = this.K - (this.M / 2.0f);
                canvas2.drawRoundRect(this.f9120x0, f15, f15, this.f9118v0);
            }
            this.f9118v0.setColor(this.F0);
            this.f9118v0.setStyle(Paint.Style.FILL);
            this.f9120x0.set(bounds);
            if (!this.V0) {
                canvas2.drawRoundRect(this.f9120x0, G(), G(), this.f9118v0);
                i12 = 0;
            } else {
                c(new RectF(bounds), this.f9122z0);
                i12 = 0;
                g(canvas, this.f9118v0, this.f9122z0, this.f25079a.f25098a, i());
            }
            if (r0()) {
                B(bounds, this.f9120x0);
                RectF rectF2 = this.f9120x0;
                float f16 = rectF2.left;
                float f17 = rectF2.top;
                canvas2.translate(f16, f17);
                this.Q.setBounds(i12, i12, (int) this.f9120x0.width(), (int) this.f9120x0.height());
                this.Q.draw(canvas2);
                canvas2.translate(-f16, -f17);
            }
            if (q0()) {
                B(bounds, this.f9120x0);
                RectF rectF3 = this.f9120x0;
                float f18 = rectF3.left;
                float f19 = rectF3.top;
                canvas2.translate(f18, f19);
                this.f9105i0.setBounds(i12, i12, (int) this.f9120x0.width(), (int) this.f9120x0.height());
                this.f9105i0.draw(canvas2);
                canvas2.translate(-f18, -f19);
            }
            if (!this.T0 || this.O == null) {
                i15 = i11;
                i14 = 255;
                i13 = 0;
            } else {
                PointF pointF = this.f9121y0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.O != null) {
                    float C = C() + this.f9109m0 + this.f9112p0;
                    if (androidx.core.graphics.drawable.a.e(this) == 0) {
                        pointF.x = ((float) bounds.left) + C;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - C;
                        align = Paint.Align.RIGHT;
                    }
                    this.A0.f21165a.getFontMetrics(this.f9119w0);
                    Paint.FontMetrics fontMetrics = this.f9119w0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.f9120x0;
                rectF4.setEmpty();
                if (this.O != null) {
                    float C2 = C() + this.f9109m0 + this.f9112p0;
                    float F = F() + this.f9116t0 + this.f9113q0;
                    if (androidx.core.graphics.drawable.a.e(this) == 0) {
                        rectF4.left = ((float) bounds.left) + C2;
                        rectF4.right = ((float) bounds.right) - F;
                    } else {
                        rectF4.left = ((float) bounds.left) + F;
                        rectF4.right = ((float) bounds.right) - C2;
                    }
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                o oVar = this.A0;
                if (oVar.f21170f != null) {
                    oVar.f21165a.drawableState = getState();
                    o oVar2 = this.A0;
                    oVar2.f21170f.e(this.f9117u0, oVar2.f21165a, oVar2.f21166b);
                }
                this.A0.f21165a.setTextAlign(align);
                boolean z10 = Math.round(this.A0.a(this.O.toString())) > Math.round(this.f9120x0.width());
                if (z10) {
                    i16 = canvas.save();
                    canvas2.clipRect(this.f9120x0);
                } else {
                    i16 = 0;
                }
                CharSequence charSequence = this.O;
                if (z10 && this.S0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.A0.f21165a, this.f9120x0.width(), this.S0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f9121y0;
                i13 = 0;
                float f20 = pointF2.x;
                i14 = 255;
                float f21 = pointF2.y;
                i15 = i11;
                canvas.drawText(charSequence2, 0, length, f20, f21, this.A0.f21165a);
                if (z10) {
                    canvas2.restoreToCount(i16);
                }
            }
            if (s0()) {
                D(bounds, this.f9120x0);
                RectF rectF5 = this.f9120x0;
                float f22 = rectF5.left;
                float f23 = rectF5.top;
                canvas2.translate(f22, f23);
                this.f9098b0.setBounds(i13, i13, (int) this.f9120x0.width(), (int) this.f9120x0.height());
                if (b.f24232a) {
                    this.f9099c0.setBounds(this.f9098b0.getBounds());
                    this.f9099c0.jumpToCurrentState();
                    this.f9099c0.draw(canvas2);
                } else {
                    this.f9098b0.draw(canvas2);
                }
                canvas2.translate(-f22, -f23);
            }
            if (this.J0 < i14) {
                canvas2.restoreToCount(i15);
            }
        }
    }

    public void e0(float f10) {
        if (this.f9101e0 != f10) {
            this.f9101e0 = f10;
            invalidateSelf();
            if (s0()) {
                L();
            }
        }
    }

    public void f0(float f10) {
        if (this.f9114r0 != f10) {
            this.f9114r0 = f10;
            invalidateSelf();
            if (s0()) {
                L();
            }
        }
    }

    public boolean g0(int[] iArr) {
        if (Arrays.equals(this.O0, iArr)) {
            return false;
        }
        this.O0 = iArr;
        if (s0()) {
            return M(getState(), iArr);
        }
        return false;
    }

    public int getAlpha() {
        return this.J0;
    }

    public ColorFilter getColorFilter() {
        return this.K0;
    }

    public int getIntrinsicHeight() {
        return (int) this.J;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(F() + this.A0.a(this.O.toString()) + C() + this.f9109m0 + this.f9112p0 + this.f9113q0 + this.f9116t0), this.U0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.V0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.K);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.J, this.K);
        }
        outline.setAlpha(((float) this.J0) / 255.0f);
    }

    public void h0(ColorStateList colorStateList) {
        if (this.f9100d0 != colorStateList) {
            this.f9100d0 = colorStateList;
            if (s0()) {
                androidx.core.graphics.drawable.a.l(this.f9098b0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i0(boolean z10) {
        if (this.f9097a0 != z10) {
            boolean s02 = s0();
            this.f9097a0 = z10;
            boolean s03 = s0();
            if (s02 != s03) {
                if (s03) {
                    A(this.f9098b0);
                } else {
                    t0(this.f9098b0);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f23960j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.H
            boolean r0 = J(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.I
            boolean r0 = J(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.L
            boolean r0 = J(r0)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.P0
            if (r0 == 0) goto L_0x0026
            android.content.res.ColorStateList r0 = r3.Q0
            boolean r0 = J(r0)
            if (r0 != 0) goto L_0x0066
        L_0x0026:
            l9.o r0 = r3.A0
            p9.d r0 = r0.f21170f
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f23960j
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.f9104h0
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.f9105i0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.f9103g0
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.Q
            boolean r0 = K(r0)
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.f9105i0
            boolean r0 = K(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.M0
            boolean r0 = J(r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.isStateful():boolean");
    }

    public void j0(float f10) {
        if (this.f9111o0 != f10) {
            float C = C();
            this.f9111o0 = f10;
            float C2 = C();
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void k0(float f10) {
        if (this.f9110n0 != f10) {
            float C = C();
            this.f9110n0 = f10;
            float C2 = C();
            invalidateSelf();
            if (C != C2) {
                L();
            }
        }
    }

    public void l0(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            this.Q0 = this.P0 ? b.c(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void m0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.O, charSequence)) {
            this.O = charSequence;
            this.A0.f21168d = true;
            invalidateSelf();
            L();
        }
    }

    public void n0(float f10) {
        if (this.f9113q0 != f10) {
            this.f9113q0 = f10;
            invalidateSelf();
            L();
        }
    }

    public void o0(float f10) {
        if (this.f9112p0 != f10) {
            this.f9112p0 = f10;
            invalidateSelf();
            L();
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (r0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.j(this.Q, i10);
        }
        if (q0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.j(this.f9105i0, i10);
        }
        if (s0()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.j(this.f9098b0, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (r0()) {
            onLevelChange |= this.Q.setLevel(i10);
        }
        if (q0()) {
            onLevelChange |= this.f9105i0.setLevel(i10);
        }
        if (s0()) {
            onLevelChange |= this.f9098b0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.V0) {
            super.onStateChange(iArr);
        }
        return M(iArr, this.O0);
    }

    public void p0(boolean z10) {
        if (this.P0 != z10) {
            this.P0 = z10;
            this.Q0 = z10 ? b.c(this.N) : null;
            onStateChange(getState());
        }
    }

    public final boolean q0() {
        return this.f9104h0 && this.f9105i0 != null && this.H0;
    }

    public final boolean r0() {
        return this.P && this.Q != null;
    }

    public final boolean s0() {
        return this.f9097a0 && this.f9098b0 != null;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (this.J0 != i10) {
            this.J0 = i10;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.K0 != colorFilter) {
            this.K0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.N0 != mode) {
            this.N0 = mode;
            this.L0 = h9.a.a(this, this.M0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (r0()) {
            visible |= this.Q.setVisible(z10, z11);
        }
        if (q0()) {
            visible |= this.f9105i0.setVisible(z10, z11);
        }
        if (s0()) {
            visible |= this.f9098b0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
