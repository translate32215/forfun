package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import com.google.android.material.chip.a;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import l.c;
import l9.h;
import o0.c0;
import p0.c;
import p9.d;
import s9.f;
import s9.i;
import s9.m;

public class Chip extends g implements a.C0094a, m, h<Chip> {
    public static final Rect E = new Rect();
    public static final int[] F = {16842913};
    public static final int[] G = {16842911};
    public boolean A;
    public final Rect B = new Rect();
    public final RectF C = new RectF();
    public final c D = new a();

    /* renamed from: e  reason: collision with root package name */
    public a f9071e;

    /* renamed from: f  reason: collision with root package name */
    public InsetDrawable f9072f;

    /* renamed from: g  reason: collision with root package name */
    public RippleDrawable f9073g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f9074h;

    /* renamed from: i  reason: collision with root package name */
    public h.a<Chip> f9075i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9076r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9077s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9078t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9079u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9080v;

    /* renamed from: w  reason: collision with root package name */
    public int f9081w;

    /* renamed from: x  reason: collision with root package name */
    public int f9082x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f9083y;

    /* renamed from: z  reason: collision with root package name */
    public final b f9084z;

    public class a extends c {
        public a() {
            super(2);
        }

        public void c(int i10) {
        }

        public void d(Typeface typeface, boolean z10) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            a aVar = chip.f9071e;
            if (aVar.T0) {
                charSequence = aVar.O;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends v0.a {
        public b(Chip chip) {
            super(chip);
        }

        public void m(List<Integer> list) {
            boolean z10 = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.E;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                a aVar = chip2.f9071e;
                if (aVar != null && aVar.f9097a0) {
                    z10 = true;
                }
                if (z10 && chip2.f9074h != null) {
                    list.add(1);
                }
            }
        }

        public boolean p(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.g();
            }
            return false;
        }

        public void q(int i10, p0.c cVar) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.f23748a.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.f23748a.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                cVar.f23748a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                cVar.a(c.a.f23753g);
                cVar.f23748a.setEnabled(Chip.this.isEnabled());
                return;
            }
            cVar.f23748a.setContentDescription(charSequence);
            cVar.f23748a.setBoundsInParent(Chip.E);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011c, code lost:
        r4 = r1.getResourceId(0, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = 2132083811(0x7f150463, float:1.9807775E38)
            r9 = 2130968794(0x7f0400da, float:1.7546252E38)
            r1 = r18
            android.content.Context r1 = w9.a.a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.B = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.C = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.D = r1
            android.content.Context r10 = r17.getContext()
            r11 = 1
            r12 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0033
            goto L_0x0093
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0044:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0381
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0379
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0373
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x036d
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L_0x0365
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0365
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0365
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0365
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r12)
            if (r1 == r12) goto L_0x0093
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0093:
            com.google.android.material.chip.a r13 = new com.google.android.material.chip.a
            r13.<init>(r10, r7, r9, r8)
            android.content.Context r1 = r13.f9117u0
            int[] r14 = t8.a.f25840g
            r15 = 0
            int[] r6 = new int[r15]
            r5 = 2132083811(0x7f150463, float:1.9807775E38)
            r4 = 2130968794(0x7f0400da, float:1.7546252E38)
            r2 = r19
            r3 = r14
            android.content.res.TypedArray r1 = l9.r.d(r1, r2, r3, r4, r5, r6)
            r6 = 37
            boolean r2 = r1.hasValue(r6)
            r13.V0 = r2
            android.content.Context r2 = r13.f9117u0
            r3 = 24
            android.content.res.ColorStateList r2 = p9.c.a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.H
            if (r3 == r2) goto L_0x00c9
            r13.H = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00c9:
            android.content.Context r2 = r13.f9117u0
            r3 = 11
            android.content.res.ColorStateList r2 = p9.c.a(r2, r1, r3)
            r13.R(r2)
            r2 = 19
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r13.Y(r2)
            r2 = 12
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x00ed
            float r2 = r1.getDimension(r2, r3)
            r13.S(r2)
        L_0x00ed:
            android.content.Context r2 = r13.f9117u0
            r4 = 22
            android.content.res.ColorStateList r2 = p9.c.a(r2, r1, r4)
            r13.a0(r2)
            r5 = 23
            float r2 = r1.getDimension(r5, r3)
            r13.b0(r2)
            android.content.Context r2 = r13.f9117u0
            r4 = 36
            android.content.res.ColorStateList r2 = p9.c.a(r2, r1, r4)
            r13.l0(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            r13.m0(r2)
            android.content.Context r2 = r13.f9117u0
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L_0x0128
            int r4 = r1.getResourceId(r15, r15)
            if (r4 == 0) goto L_0x0128
            p9.d r6 = new p9.d
            r6.<init>(r2, r4)
            goto L_0x0129
        L_0x0128:
            r6 = 0
        L_0x0129:
            float r2 = r6.f23961k
            float r2 = r1.getDimension(r11, r2)
            r6.f23961k = r2
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 2
            if (r4 >= r5) goto L_0x013e
            android.content.Context r5 = r13.f9117u0
            android.content.res.ColorStateList r5 = p9.c.a(r5, r1, r2)
            r6.f23960j = r5
        L_0x013e:
            l9.o r5 = r13.A0
            android.content.Context r12 = r13.f9117u0
            r5.b(r6, r12)
            r5 = 3
            int r6 = r1.getInt(r5, r15)
            if (r6 == r11) goto L_0x015b
            if (r6 == r2) goto L_0x0156
            if (r6 == r5) goto L_0x0151
            goto L_0x015f
        L_0x0151:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r13.S0 = r5
            goto L_0x015f
        L_0x0156:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            r13.S0 = r5
            goto L_0x015f
        L_0x015b:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.START
            r13.S0 = r5
        L_0x015f:
            r5 = 18
            boolean r5 = r1.getBoolean(r5, r15)
            r13.X(r5)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0185
            java.lang.String r6 = "chipIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x0185
            java.lang.String r6 = "chipIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 != 0) goto L_0x0185
            r6 = 15
            boolean r6 = r1.getBoolean(r6, r15)
            r13.X(r6)
        L_0x0185:
            android.content.Context r6 = r13.f9117u0
            r12 = 14
            android.graphics.drawable.Drawable r6 = p9.c.c(r6, r1, r12)
            r13.U(r6)
            r6 = 17
            boolean r12 = r1.hasValue(r6)
            if (r12 == 0) goto L_0x01a1
            android.content.Context r12 = r13.f9117u0
            android.content.res.ColorStateList r6 = p9.c.a(r12, r1, r6)
            r13.W(r6)
        L_0x01a1:
            r6 = 16
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r1.getDimension(r6, r12)
            r13.V(r6)
            r6 = 31
            boolean r6 = r1.getBoolean(r6, r15)
            r13.i0(r6)
            if (r7 == 0) goto L_0x01d0
            java.lang.String r6 = "closeIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x01d0
            java.lang.String r6 = "closeIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 != 0) goto L_0x01d0
            r6 = 26
            boolean r6 = r1.getBoolean(r6, r15)
            r13.i0(r6)
        L_0x01d0:
            android.content.Context r6 = r13.f9117u0
            r12 = 25
            android.graphics.drawable.Drawable r6 = p9.c.c(r6, r1, r12)
            r13.c0(r6)
            android.content.Context r6 = r13.f9117u0
            r12 = 30
            android.content.res.ColorStateList r6 = p9.c.a(r6, r1, r12)
            r13.h0(r6)
            r6 = 28
            float r6 = r1.getDimension(r6, r3)
            r13.e0(r6)
            r6 = 6
            boolean r6 = r1.getBoolean(r6, r15)
            r13.N(r6)
            r6 = 10
            boolean r6 = r1.getBoolean(r6, r15)
            r13.Q(r6)
            if (r7 == 0) goto L_0x021b
            java.lang.String r6 = "checkedIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x021b
            java.lang.String r6 = "checkedIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r5, r6)
            if (r5 != 0) goto L_0x021b
            r5 = 8
            boolean r5 = r1.getBoolean(r5, r15)
            r13.Q(r5)
        L_0x021b:
            android.content.Context r5 = r13.f9117u0
            r6 = 7
            android.graphics.drawable.Drawable r5 = p9.c.c(r5, r1, r6)
            r13.O(r5)
            r5 = 9
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x0236
            android.content.Context r6 = r13.f9117u0
            android.content.res.ColorStateList r5 = p9.c.a(r6, r1, r5)
            r13.P(r5)
        L_0x0236:
            android.content.Context r5 = r13.f9117u0
            r6 = 39
            u8.g r5 = u8.g.a(r5, r1, r6)
            r13.f9107k0 = r5
            android.content.Context r5 = r13.f9117u0
            r6 = 33
            u8.g r5 = u8.g.a(r5, r1, r6)
            r13.f9108l0 = r5
            r12 = 21
            float r5 = r1.getDimension(r12, r3)
            r13.Z(r5)
            r5 = 35
            float r5 = r1.getDimension(r5, r3)
            r13.k0(r5)
            r5 = 34
            float r5 = r1.getDimension(r5, r3)
            r13.j0(r5)
            r5 = 41
            float r5 = r1.getDimension(r5, r3)
            r13.o0(r5)
            r5 = 40
            float r5 = r1.getDimension(r5, r3)
            r13.n0(r5)
            r5 = 29
            float r5 = r1.getDimension(r5, r3)
            r13.f0(r5)
            r5 = 27
            float r5 = r1.getDimension(r5, r3)
            r13.d0(r5)
            r5 = 13
            float r3 = r1.getDimension(r5, r3)
            r13.T(r3)
            r3 = 4
            r5 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r1.getDimensionPixelSize(r3, r5)
            r13.U0 = r3
            r1.recycle()
            int[] r6 = new int[r15]
            l9.r.a(r10, r7, r9, r8)
            r5 = 2132083811(0x7f150463, float:1.9807775E38)
            r16 = 2130968794(0x7f0400da, float:1.7546252E38)
            r1 = r10
            r3 = 2
            r2 = r19
            r11 = 2
            r3 = r14
            r12 = r4
            r4 = r16
            r11 = 23
            l9.r.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r15)
            r0.f9080v = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = l9.u.b(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f9082x = r2
            r1.recycle()
            r0.setChipDrawable(r13)
            float r1 = o0.c0.l(r17)
            r13.q(r1)
            int[] r6 = new int[r15]
            l9.r.a(r10, r7, r9, r8)
            r4 = 2130968794(0x7f0400da, float:1.7546252E38)
            r1 = r10
            r2 = r19
            r3 = r14
            l9.r.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            if (r12 >= r11) goto L_0x030c
            r2 = 2
            android.content.res.ColorStateList r2 = p9.c.a(r10, r1, r2)
            r0.setTextColor(r2)
        L_0x030c:
            r2 = 37
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.f9084z = r1
            r17.i()
            if (r2 != 0) goto L_0x032d
            r1 = 21
            if (r12 < r1) goto L_0x032d
            d9.a r1 = new d9.a
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x032d:
            boolean r1 = r0.f9076r
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.O
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.S0
            r0.setEllipsize(r1)
            r17.m()
            com.google.android.material.chip.a r1 = r0.f9071e
            boolean r1 = r1.T0
            if (r1 != 0) goto L_0x034c
            r1 = 1
            r0.setLines(r1)
            r0.setHorizontallyScrolling(r1)
        L_0x034c:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r17.l()
            boolean r1 = r0.f9080v
            if (r1 == 0) goto L_0x035e
            int r1 = r0.f9082x
            r0.setMinHeight(r1)
        L_0x035e:
            int r1 = o0.c0.e.d(r17)
            r0.f9081w = r1
            return
        L_0x0365:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x036d:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0373:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0379:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x0381:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.C.setEmpty();
        if (e() && this.f9074h != null) {
            a aVar = this.f9071e;
            aVar.E(aVar.getBounds(), this.C);
        }
        return this.C;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.B.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.B;
    }

    private d getTextAppearance() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.A0.f21170f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f9078t != z10) {
            this.f9078t = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f9077s != z10) {
            this.f9077s = z10;
            refreshDrawableState();
        }
    }

    public void a() {
        d(this.f9082x);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public boolean d(int i10) {
        this.f9082x = i10;
        if (!this.f9080v) {
            if (this.f9072f != null) {
                h();
            } else {
                j();
            }
            return false;
        }
        int max = Math.max(0, i10 - ((int) this.f9071e.J));
        int max2 = Math.max(0, i10 - this.f9071e.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i11 = max2 > 0 ? max2 / 2 : 0;
            int i12 = max > 0 ? max / 2 : 0;
            if (this.f9072f != null) {
                Rect rect = new Rect();
                this.f9072f.getPadding(rect);
                if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                    j();
                    return true;
                }
            }
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
            this.f9072f = new InsetDrawable(this.f9071e, i11, i12, i11, i12);
            j();
            return true;
        }
        if (this.f9072f != null) {
            h();
        } else {
            j();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.A
            if (r0 != 0) goto L_0x0009
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L_0x0009:
            com.google.android.material.chip.Chip$b r0 = r9.f9084z
            android.view.accessibility.AccessibilityManager r1 = r0.f26315h
            boolean r1 = r1.isEnabled()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0074
            android.view.accessibility.AccessibilityManager r1 = r0.f26315h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x001e
            goto L_0x0074
        L_0x001e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L_0x0044
            r4 = 9
            if (r1 == r4) goto L_0x0044
            r4 = 10
            if (r1 == r4) goto L_0x0034
            goto L_0x0074
        L_0x0034:
            int r1 = r0.f26320m
            if (r1 == r7) goto L_0x0074
            if (r1 != r7) goto L_0x003b
            goto L_0x0072
        L_0x003b:
            r0.f26320m = r7
            r0.s(r7, r6)
            r0.s(r1, r5)
            goto L_0x0072
        L_0x0044:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.e()
            if (r8 == 0) goto L_0x0062
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L_0x0062
            r1 = 1
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            int r4 = r0.f26320m
            if (r4 != r1) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r0.f26320m = r1
            r0.s(r1, r6)
            r0.s(r4, r5)
        L_0x0070:
            if (r1 == r7) goto L_0x0074
        L_0x0072:
            r0 = 1
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r0 != 0) goto L_0x007d
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x007e
        L_0x007d:
            r2 = 1
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.A) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f9084z;
        bVar.getClass();
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i11 = 33;
                                } else if (keyCode == 21) {
                                    i11 = 17;
                                } else if (keyCode != 22) {
                                    i11 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i12 = 0;
                                while (i10 < repeatCount && bVar.n(i11, (Rect) null)) {
                                    i10++;
                                    i12 = 1;
                                }
                                i10 = i12;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i13 = bVar.f26319l;
                    if (i13 != Integer.MIN_VALUE) {
                        bVar.p(i13, 16, (Bundle) null);
                    }
                    i10 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i10 = bVar.n(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i10 = bVar.n(1, (Rect) null);
            }
        }
        if (i10 == 0 || this.f9084z.f26319l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f9071e;
        int i10 = 0;
        if (aVar != null && a.K(aVar.f9098b0)) {
            a aVar2 = this.f9071e;
            int isEnabled = isEnabled();
            if (this.f9079u) {
                isEnabled++;
            }
            if (this.f9078t) {
                isEnabled++;
            }
            if (this.f9077s) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.f9079u) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f9078t) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f9077s) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            i10 = aVar2.g0(iArr);
        }
        if (i10 != 0) {
            invalidate();
        }
    }

    public final boolean e() {
        a aVar = this.f9071e;
        return (aVar == null || aVar.H() == null) ? false : true;
    }

    public boolean f() {
        a aVar = this.f9071e;
        return aVar != null && aVar.f9103g0;
    }

    public boolean g() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f9074h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.A) {
            this.f9084z.s(1, 1);
        }
        return z10;
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f9083y)) {
            return this.f9083y;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f9090h.f21111d) ? "android.widget.CompoundButton" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f9072f;
        return insetDrawable == null ? this.f9071e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9105i0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9106j0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.G());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f9071e;
    }

    public float getChipEndPadding() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9116t0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        a aVar = this.f9071e;
        if (aVar == null || (drawable = aVar.Q) == null) {
            return null;
        }
        return drawable instanceof h0.b ? ((h0.b) drawable).b() : drawable;
    }

    public float getChipIconSize() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.S;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.R;
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.J;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9109m0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.M;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.H();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9102f0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9115s0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9101e0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9114r0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9100d0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.S0;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.A) {
            b bVar = this.f9084z;
            if (bVar.f26319l == 1 || bVar.f26318k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public u8.g getHideMotionSpec() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9108l0;
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9111o0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9110n0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.N;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        return this.f9071e.f25079a.f25098a;
    }

    public u8.g getShowMotionSpec() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9107k0;
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9113q0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f9071e;
        if (aVar != null) {
            return aVar.f9112p0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f9072f != null) {
            this.f9072f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            j();
        }
    }

    public final void i() {
        if (e()) {
            a aVar = this.f9071e;
            if ((aVar != null && aVar.f9097a0) && this.f9074h != null) {
                c0.C(this, this.f9084z);
                this.A = true;
                return;
            }
        }
        c0.C(this, (o0.a) null);
        this.A = false;
    }

    public final void j() {
        if (q9.b.f24232a) {
            k();
            return;
        }
        this.f9071e.p0(true);
        Drawable backgroundDrawable = getBackgroundDrawable();
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(this, backgroundDrawable);
        l();
        if (getBackgroundDrawable() == this.f9072f && this.f9071e.getCallback() == null) {
            this.f9071e.setCallback(this.f9072f);
        }
    }

    public final void k() {
        this.f9073g = new RippleDrawable(q9.b.c(this.f9071e.N), getBackgroundDrawable(), (Drawable) null);
        this.f9071e.p0(false);
        RippleDrawable rippleDrawable = this.f9073g;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(this, rippleDrawable);
        l();
    }

    public final void l() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f9071e) != null) {
            int F2 = (int) (aVar.F() + aVar.f9116t0 + aVar.f9113q0);
            a aVar2 = this.f9071e;
            int C2 = (int) (aVar2.C() + aVar2.f9109m0 + aVar2.f9112p0);
            if (this.f9072f != null) {
                Rect rect = new Rect();
                this.f9072f.getPadding(rect);
                C2 += rect.left;
                F2 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.e.k(this, C2, paddingTop, F2, paddingBottom);
        }
    }

    public final void m() {
        TextPaint paint = getPaint();
        a aVar = this.f9071e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.D);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        q.d.d(this, this.f9071e);
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, F);
        }
        if (f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.A) {
            b bVar = this.f9084z;
            int i11 = bVar.f26319l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.k(i11);
            }
            if (z10) {
                bVar.n(i10, rect);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f21119c) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= chipGroup.getChildCount()) {
                        i13 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i12) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i12)) == this) {
                            break;
                        }
                        i13++;
                    }
                    i12++;
                }
                i10 = i13;
            } else {
                i10 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (!(tag instanceof Integer)) {
                i11 = -1;
            } else {
                i11 = ((Integer) tag).intValue();
            }
            c.C0207c a10 = c.C0207c.a(i11, 1, i10, 1, false, isChecked());
            if (Build.VERSION.SDK_INT >= 19) {
                accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) a10.f23768a);
            }
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f9081w != i10) {
            this.f9081w = i10;
            l();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f9077s
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f9077s
            if (r0 == 0) goto L_0x0034
            r5.g()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f9083y = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9073g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9073g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.N(z10);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.N(aVar.f9117u0.getResources().getBoolean(i10));
        }
    }

    public void setChecked(boolean z10) {
        h.a<Chip> aVar;
        a aVar2 = this.f9071e;
        if (aVar2 == null) {
            this.f9076r = z10;
        } else if (aVar2.f9103g0) {
            boolean isChecked = isChecked();
            super.setChecked(z10);
            if (isChecked != z10 && (aVar = this.f9075i) != null) {
                l9.a aVar3 = (l9.a) aVar;
                if (!z10) {
                    l9.b bVar = aVar3.f21107a;
                    if (!bVar.e(this, bVar.f21112e)) {
                        return;
                    }
                } else if (!aVar3.f21107a.a(this)) {
                    return;
                }
                aVar3.f21107a.d();
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.O(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.O(g.a.b(aVar.f9117u0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.P(g.a.a(aVar.f9117u0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.Q(aVar.f9117u0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f9071e;
        if (aVar != null && aVar.I != colorStateList) {
            aVar.I = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.R(g.a.a(aVar.f9117u0, i10));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.S(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f9071e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.R0 = new WeakReference<>((Object) null);
            }
            this.f9071e = aVar;
            aVar.T0 = false;
            aVar.getClass();
            aVar.R0 = new WeakReference<>(this);
            d(this.f9082x);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f9071e;
        if (aVar != null && aVar.f9116t0 != f10) {
            aVar.f9116t0 = f10;
            aVar.invalidateSelf();
            aVar.L();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.T(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.U(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.U(g.a.b(aVar.f9117u0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.V(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.V(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.W(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.W(g.a.a(aVar.f9117u0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.X(aVar.f9117u0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f9071e;
        if (aVar != null && aVar.J != f10) {
            aVar.J = f10;
            aVar.invalidateSelf();
            aVar.L();
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.Y(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f9071e;
        if (aVar != null && aVar.f9109m0 != f10) {
            aVar.f9109m0 = f10;
            aVar.invalidateSelf();
            aVar.L();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.Z(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.a0(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.a0(g.a.a(aVar.f9117u0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.b0(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.b0(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.c0(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f9071e;
        if (aVar != null && aVar.f9102f0 != charSequence) {
            m0.a c10 = m0.a.c();
            aVar.f9102f0 = c10.d(charSequence, c10.f21471c, true);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.d0(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.d0(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.c0(g.a.b(aVar.f9117u0, i10));
        }
        i();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.e0(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.e0(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.f0(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.f0(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.h0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.h0(g.a.a(aVar.f9117u0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f9071e;
        if (aVar != null) {
            f.b bVar = aVar.f25079a;
            if (bVar.f25112o != f10) {
                bVar.f25112o = f10;
                aVar.z();
            }
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9071e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f9071e;
                if (aVar != null) {
                    aVar.S0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f9080v = z10;
        d(this.f9082x);
    }

    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(u8.g gVar) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.f9108l0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.f9108l0 = u8.g.b(aVar.f9117u0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.j0(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.j0(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.k0(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.k0(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setInternalOnCheckedChangeListener(h.a<Chip> aVar) {
        this.f9075i = aVar;
    }

    public void setLayoutDirection(int i10) {
        if (this.f9071e != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.U0 = i10;
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9074h = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.l0(colorStateList);
        }
        if (!this.f9071e.P0) {
            k();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.l0(g.a.a(aVar.f9117u0, i10));
            if (!this.f9071e.P0) {
                k();
            }
        }
    }

    public void setShapeAppearanceModel(i iVar) {
        a aVar = this.f9071e;
        aVar.f25079a.f25098a = iVar;
        aVar.invalidateSelf();
    }

    public void setShowMotionSpec(u8.g gVar) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.f9107k0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.f9107k0 = u8.g.b(aVar.f9117u0, i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f9071e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.T0 ? null : charSequence, bufferType);
            a aVar2 = this.f9071e;
            if (aVar2 != null) {
                aVar2.m0(charSequence);
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.A0.b(dVar, aVar.f9117u0);
        }
        m();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f9071e;
        if (aVar != null && aVar.f9113q0 != f10) {
            aVar.f9113q0 = f10;
            aVar.invalidateSelf();
            aVar.L();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.n0(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f9071e;
        if (aVar != null && aVar.f9112p0 != f10) {
            aVar.f9112p0 = f10;
            aVar.invalidateSelf();
            aVar.L();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.o0(aVar.f9117u0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.i0(z10);
        }
        i();
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.Q(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.X(z10);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.A0.b(new d(aVar.f9117u0, i10), aVar.f9117u0);
        }
        m();
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f9071e;
        if (aVar != null) {
            aVar.A0.b(new d(aVar.f9117u0, i10), aVar.f9117u0);
        }
        m();
    }
}
