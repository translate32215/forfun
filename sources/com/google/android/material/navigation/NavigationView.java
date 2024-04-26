package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.widget.g1;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.startapp.startappsdk.R;
import j.g;
import java.util.WeakHashMap;
import l9.i;
import l9.j;
import l9.m;
import o0.c0;
import o0.o0;
import q.d;
import s9.f;
import s9.i;
import s9.j;

public class NavigationView extends m {
    public static final int[] A = {16842912};
    public static final int[] B = {-16842910};

    /* renamed from: f  reason: collision with root package name */
    public final i f9366f;

    /* renamed from: g  reason: collision with root package name */
    public final j f9367g;

    /* renamed from: h  reason: collision with root package name */
    public a f9368h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9369i;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f9370r = new int[2];

    /* renamed from: s  reason: collision with root package name */
    public MenuInflater f9371s;

    /* renamed from: t  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f9372t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9373u = true;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9374v = true;

    /* renamed from: w  reason: collision with root package name */
    public int f9375w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f9376x = 0;

    /* renamed from: y  reason: collision with root package name */
    public Path f9377y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f9378z = new RectF();

    public interface a {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = 2132083558(0x7f150366, float:1.9807262E38)
            r9 = 2130969489(0x7f040391, float:1.7547661E38)
            r1 = r17
            android.content.Context r1 = w9.a.a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            l9.j r10 = new l9.j
            r10.<init>()
            r0.f9367g = r10
            r11 = 2
            int[] r1 = new int[r11]
            r0.f9370r = r1
            r12 = 1
            r0.f9373u = r12
            r0.f9374v = r12
            r13 = 0
            r0.f9375w = r13
            r0.f9376x = r13
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f9378z = r1
            android.content.Context r14 = r16.getContext()
            l9.i r15 = new l9.i
            r15.<init>(r14)
            r0.f9366f = r15
            int[] r3 = t8.a.C
            int[] r6 = new int[r13]
            r5 = 2132083558(0x7f150366, float:1.9807262E38)
            r4 = 2130969489(0x7f040391, float:1.7547661E38)
            r1 = r14
            r2 = r18
            androidx.appcompat.widget.g1 r1 = l9.r.e(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.p(r12)
            if (r2 == 0) goto L_0x0059
            android.graphics.drawable.Drawable r2 = r1.g(r12)
            o0.c0.d.q(r0, r2)
        L_0x0059:
            r2 = 7
            int r2 = r1.f(r2, r13)
            r0.f9376x = r2
            int r2 = r1.j(r13, r13)
            r0.f9375w = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            if (r2 == 0) goto L_0x0074
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x00a5
        L_0x0074:
            s9.i$b r2 = s9.i.c(r14, r7, r9, r8)
            s9.i r2 = r2.a()
            android.graphics.drawable.Drawable r3 = r16.getBackground()
            s9.f r4 = new s9.f
            r4.<init>((s9.i) r2)
            boolean r2 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x0096
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r2 = r3.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.r(r2)
        L_0x0096:
            s9.f$b r2 = r4.f25079a
            i9.a r3 = new i9.a
            r3.<init>(r14)
            r2.f25099b = r3
            r4.z()
            o0.c0.d.q(r0, r4)
        L_0x00a5:
            r2 = 8
            boolean r3 = r1.p(r2)
            if (r3 == 0) goto L_0x00b5
            int r2 = r1.f(r2, r13)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00b5:
            boolean r2 = r1.a(r11, r13)
            r0.setFitsSystemWindows(r2)
            r2 = 3
            int r2 = r1.f(r2, r13)
            r0.f9369i = r2
            r2 = 30
            boolean r3 = r1.p(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00d1
            android.content.res.ColorStateList r2 = r1.c(r2)
            goto L_0x00d2
        L_0x00d1:
            r2 = r4
        L_0x00d2:
            r3 = 33
            boolean r5 = r1.p(r3)
            if (r5 == 0) goto L_0x00df
            int r3 = r1.m(r3, r13)
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00eb
            if (r2 != 0) goto L_0x00eb
            android.content.res.ColorStateList r2 = r0.b(r5)
        L_0x00eb:
            r6 = 14
            boolean r7 = r1.p(r6)
            if (r7 == 0) goto L_0x00f8
            android.content.res.ColorStateList r5 = r1.c(r6)
            goto L_0x00fc
        L_0x00f8:
            android.content.res.ColorStateList r5 = r0.b(r5)
        L_0x00fc:
            r6 = 24
            boolean r7 = r1.p(r6)
            if (r7 == 0) goto L_0x0109
            int r6 = r1.m(r6, r13)
            goto L_0x010a
        L_0x0109:
            r6 = 0
        L_0x010a:
            r7 = 13
            boolean r8 = r1.p(r7)
            if (r8 == 0) goto L_0x0119
            int r7 = r1.f(r7, r13)
            r0.setItemIconSize(r7)
        L_0x0119:
            r7 = 25
            boolean r8 = r1.p(r7)
            if (r8 == 0) goto L_0x0126
            android.content.res.ColorStateList r7 = r1.c(r7)
            goto L_0x0127
        L_0x0126:
            r7 = r4
        L_0x0127:
            if (r6 != 0) goto L_0x0132
            if (r7 != 0) goto L_0x0132
            r7 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.b(r7)
        L_0x0132:
            r8 = 10
            android.graphics.drawable.Drawable r8 = r1.g(r8)
            if (r8 != 0) goto L_0x017e
            r9 = 17
            boolean r9 = r1.p(r9)
            if (r9 != 0) goto L_0x014d
            r9 = 18
            boolean r9 = r1.p(r9)
            if (r9 == 0) goto L_0x014b
            goto L_0x014d
        L_0x014b:
            r9 = 0
            goto L_0x014e
        L_0x014d:
            r9 = 1
        L_0x014e:
            if (r9 == 0) goto L_0x017e
            android.content.Context r8 = r16.getContext()
            r9 = 19
            android.content.res.ColorStateList r8 = p9.c.b(r8, r1, r9)
            android.graphics.drawable.Drawable r8 = r0.c(r1, r8)
            r9 = 16
            android.content.res.ColorStateList r9 = p9.c.b(r14, r1, r9)
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 21
            if (r11 < r12) goto L_0x017e
            if (r9 == 0) goto L_0x017e
            android.graphics.drawable.Drawable r11 = r0.c(r1, r4)
            android.graphics.drawable.RippleDrawable r12 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = q9.b.c(r9)
            r12.<init>(r9, r4, r11)
            r10.f21136u = r12
            r10.g(r13)
        L_0x017e:
            r4 = 11
            boolean r9 = r1.p(r4)
            if (r9 == 0) goto L_0x018d
            int r4 = r1.f(r4, r13)
            r0.setItemHorizontalPadding(r4)
        L_0x018d:
            r4 = 26
            boolean r9 = r1.p(r4)
            if (r9 == 0) goto L_0x019c
            int r4 = r1.f(r4, r13)
            r0.setItemVerticalPadding(r4)
        L_0x019c:
            r4 = 6
            int r4 = r1.f(r4, r13)
            r0.setDividerInsetStart(r4)
            r4 = 5
            int r4 = r1.f(r4, r13)
            r0.setDividerInsetEnd(r4)
            r4 = 32
            int r4 = r1.f(r4, r13)
            r0.setSubheaderInsetStart(r4)
            r4 = 31
            int r4 = r1.f(r4, r13)
            r0.setSubheaderInsetEnd(r4)
            r4 = 34
            boolean r9 = r0.f9373u
            boolean r4 = r1.a(r4, r9)
            r0.setTopInsetScrimEnabled(r4)
            r4 = 4
            boolean r9 = r0.f9374v
            boolean r4 = r1.a(r4, r9)
            r0.setBottomInsetScrimEnabled(r4)
            r4 = 12
            int r4 = r1.f(r4, r13)
            r9 = 15
            r11 = 1
            int r9 = r1.j(r9, r11)
            r0.setItemMaxLines(r9)
            com.google.android.material.navigation.a r9 = new com.google.android.material.navigation.a
            r9.<init>(r0)
            r15.f541e = r9
            r10.f21127d = r11
            r10.c(r14, r15)
            if (r3 == 0) goto L_0x01f6
            r10.f21130g = r3
            r10.g(r13)
        L_0x01f6:
            r10.f21131h = r2
            r10.g(r13)
            r10.f21134s = r5
            r10.g(r13)
            int r2 = r16.getOverScrollMode()
            r10.H = r2
            com.google.android.material.internal.NavigationMenuView r3 = r10.f21124a
            if (r3 == 0) goto L_0x020d
            r3.setOverScrollMode(r2)
        L_0x020d:
            if (r6 == 0) goto L_0x0214
            r10.f21132i = r6
            r10.g(r13)
        L_0x0214:
            r10.f21133r = r7
            r10.g(r13)
            r10.f21135t = r8
            r10.g(r13)
            r10.b(r4)
            android.content.Context r2 = r15.f537a
            r15.b(r10, r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f21124a
            if (r2 != 0) goto L_0x026c
            android.view.LayoutInflater r2 = r10.f21129f
            r3 = 2131623990(0x7f0e0036, float:1.8875147E38)
            android.view.View r2 = r2.inflate(r3, r0, r13)
            com.google.android.material.internal.NavigationMenuView r2 = (com.google.android.material.internal.NavigationMenuView) r2
            r10.f21124a = r2
            l9.j$h r3 = new l9.j$h
            com.google.android.material.internal.NavigationMenuView r4 = r10.f21124a
            r3.<init>(r4)
            r2.setAccessibilityDelegateCompat(r3)
            l9.j$c r2 = r10.f21128e
            if (r2 != 0) goto L_0x024c
            l9.j$c r2 = new l9.j$c
            r2.<init>()
            r10.f21128e = r2
        L_0x024c:
            int r2 = r10.H
            r3 = -1
            if (r2 == r3) goto L_0x0256
            com.google.android.material.internal.NavigationMenuView r3 = r10.f21124a
            r3.setOverScrollMode(r2)
        L_0x0256:
            android.view.LayoutInflater r2 = r10.f21129f
            r3 = 2131623987(0x7f0e0033, float:1.887514E38)
            com.google.android.material.internal.NavigationMenuView r4 = r10.f21124a
            android.view.View r2 = r2.inflate(r3, r4, r13)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r10.f21125b = r2
            com.google.android.material.internal.NavigationMenuView r2 = r10.f21124a
            l9.j$c r3 = r10.f21128e
            r2.setAdapter(r3)
        L_0x026c:
            com.google.android.material.internal.NavigationMenuView r2 = r10.f21124a
            r0.addView(r2)
            r2 = 27
            boolean r3 = r1.p(r2)
            if (r3 == 0) goto L_0x028e
            int r2 = r1.m(r2, r13)
            r3 = 1
            r10.f(r3)
            android.view.MenuInflater r3 = r16.getMenuInflater()
            r3.inflate(r2, r15)
            r10.f(r13)
            r10.g(r13)
        L_0x028e:
            r2 = 9
            boolean r3 = r1.p(r2)
            if (r3 == 0) goto L_0x02b0
            int r2 = r1.m(r2, r13)
            android.view.LayoutInflater r3 = r10.f21129f
            android.widget.LinearLayout r4 = r10.f21125b
            android.view.View r2 = r3.inflate(r2, r4, r13)
            android.widget.LinearLayout r3 = r10.f21125b
            r3.addView(r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f21124a
            int r3 = r2.getPaddingBottom()
            r2.setPadding(r13, r13, r13, r3)
        L_0x02b0:
            android.content.res.TypedArray r1 = r1.f924b
            r1.recycle()
            n9.g r1 = new n9.g
            r1.<init>(r0)
            r0.f9372t = r1
            android.view.ViewTreeObserver r1 = r16.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r0.f9372t
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f9371s == null) {
            this.f9371s = new g(getContext());
        }
        return this.f9371s;
    }

    public void a(o0 o0Var) {
        j jVar = this.f9367g;
        jVar.getClass();
        int f10 = o0Var.f();
        if (jVar.F != f10) {
            jVar.F = f10;
            jVar.m();
        }
        NavigationMenuView navigationMenuView = jVar.f21124a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, o0Var.c());
        c0.e(jVar.f21125b, o0Var);
    }

    public final ColorStateList b(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList a10 = g.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = a10.getDefaultColor();
        int[] iArr = B;
        return new ColorStateList(new int[][]{iArr, A, FrameLayout.EMPTY_STATE_SET}, new int[]{a10.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final Drawable c(g1 g1Var, ColorStateList colorStateList) {
        f fVar = new f(s9.i.a(getContext(), g1Var.m(17, 0), g1Var.m(18, 0)).a());
        fVar.r(colorStateList);
        return new InsetDrawable(fVar, g1Var.f(22, 0), g1Var.f(23, 0), g1Var.f(21, 0), g1Var.f(20, 0));
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f9377y == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f9377y);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.f9367g.f21128e.f21144e;
    }

    public int getDividerInsetEnd() {
        return this.f9367g.A;
    }

    public int getDividerInsetStart() {
        return this.f9367g.f21141z;
    }

    public int getHeaderCount() {
        return this.f9367g.f21125b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f9367g.f21135t;
    }

    public int getItemHorizontalPadding() {
        return this.f9367g.f21137v;
    }

    public int getItemIconPadding() {
        return this.f9367g.f21139x;
    }

    public ColorStateList getItemIconTintList() {
        return this.f9367g.f21134s;
    }

    public int getItemMaxLines() {
        return this.f9367g.E;
    }

    public ColorStateList getItemTextColor() {
        return this.f9367g.f21133r;
    }

    public int getItemVerticalPadding() {
        return this.f9367g.f21138w;
    }

    public Menu getMenu() {
        return this.f9366f;
    }

    public int getSubheaderInsetEnd() {
        this.f9367g.getClass();
        return 0;
    }

    public int getSubheaderInsetStart() {
        return this.f9367g.B;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f) {
            d.d(this, (f) background);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f9372t);
    }

    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f9369i), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f9369i, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f25915a);
        this.f9366f.v(bVar.f9379c);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f9379c = bundle;
        this.f9366f.x(bundle);
        return bVar;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!(getParent() instanceof DrawerLayout) || this.f9376x <= 0 || !(getBackground() instanceof f)) {
            this.f9377y = null;
            this.f9378z.setEmpty();
            return;
        }
        f fVar = (f) getBackground();
        s9.i iVar = fVar.f25079a.f25098a;
        iVar.getClass();
        i.b bVar = new i.b(iVar);
        int i14 = this.f9375w;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (Gravity.getAbsoluteGravity(i14, c0.e.d(this)) == 3) {
            bVar.g((float) this.f9376x);
            bVar.e((float) this.f9376x);
        } else {
            bVar.f((float) this.f9376x);
            bVar.d((float) this.f9376x);
        }
        fVar.f25079a.f25098a = bVar.a();
        fVar.invalidateSelf();
        if (this.f9377y == null) {
            this.f9377y = new Path();
        }
        this.f9377y.reset();
        this.f9378z.set(0.0f, 0.0f, (float) i10, (float) i11);
        s9.j jVar = j.a.f25157a;
        f.b bVar2 = fVar.f25079a;
        jVar.a(bVar2.f25098a, bVar2.f25108k, this.f9378z, this.f9377y);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f9374v = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem findItem = this.f9366f.findItem(i10);
        if (findItem != null) {
            this.f9367g.f21128e.m((androidx.appcompat.view.menu.g) findItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        l9.j jVar = this.f9367g;
        jVar.A = i10;
        jVar.g(false);
    }

    public void setDividerInsetStart(int i10) {
        l9.j jVar = this.f9367g;
        jVar.f21141z = i10;
        jVar.g(false);
    }

    public void setElevation(float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f10);
        }
        d.c(this, f10);
    }

    public void setItemBackground(Drawable drawable) {
        l9.j jVar = this.f9367g;
        jVar.f21135t = drawable;
        jVar.g(false);
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(d0.a.c(getContext(), i10));
    }

    public void setItemHorizontalPadding(int i10) {
        l9.j jVar = this.f9367g;
        jVar.f21137v = i10;
        jVar.g(false);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        l9.j jVar = this.f9367g;
        jVar.f21137v = getResources().getDimensionPixelSize(i10);
        jVar.g(false);
    }

    public void setItemIconPadding(int i10) {
        l9.j jVar = this.f9367g;
        jVar.f21139x = i10;
        jVar.g(false);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f9367g.b(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(int i10) {
        l9.j jVar = this.f9367g;
        if (jVar.f21140y != i10) {
            jVar.f21140y = i10;
            jVar.C = true;
            jVar.g(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        l9.j jVar = this.f9367g;
        jVar.f21134s = colorStateList;
        jVar.g(false);
    }

    public void setItemMaxLines(int i10) {
        l9.j jVar = this.f9367g;
        jVar.E = i10;
        jVar.g(false);
    }

    public void setItemTextAppearance(int i10) {
        l9.j jVar = this.f9367g;
        jVar.f21132i = i10;
        jVar.g(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        l9.j jVar = this.f9367g;
        jVar.f21133r = colorStateList;
        jVar.g(false);
    }

    public void setItemVerticalPadding(int i10) {
        l9.j jVar = this.f9367g;
        jVar.f21138w = i10;
        jVar.g(false);
    }

    public void setItemVerticalPaddingResource(int i10) {
        l9.j jVar = this.f9367g;
        jVar.f21138w = getResources().getDimensionPixelSize(i10);
        jVar.g(false);
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.f9368h = aVar;
    }

    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        l9.j jVar = this.f9367g;
        if (jVar != null) {
            jVar.H = i10;
            NavigationMenuView navigationMenuView = jVar.f21124a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        l9.j jVar = this.f9367g;
        jVar.B = i10;
        jVar.g(false);
    }

    public void setSubheaderInsetStart(int i10) {
        l9.j jVar = this.f9367g;
        jVar.B = i10;
        jVar.g(false);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f9373u = z10;
    }

    public static class b extends u0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f9379c;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new b[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9379c = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeBundle(this.f9379c);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f9366f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f9367g.f21128e.m((androidx.appcompat.view.menu.g) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
