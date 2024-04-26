package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.o0;
import f.v;

public class ActionMenuView extends o0 implements e.b, j {
    public boolean A;
    public c B;
    public i.a C;
    public e.a D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public e I;

    /* renamed from: x  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f666x;

    /* renamed from: y  reason: collision with root package name */
    public Context f667y;

    /* renamed from: z  reason: collision with root package name */
    public int f668z = 0;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        public boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends o0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f669a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f670b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f671c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f672d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f673e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f674f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f669a = cVar.f669a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f669a = false;
        }
    }

    public class d implements e.a {
        public d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            boolean z10;
            e eVar2 = ActionMenuView.this.I;
            if (eVar2 != null) {
                Toolbar.a aVar = (Toolbar.a) eVar2;
                if (Toolbar.this.O.b(menuItem)) {
                    z10 = true;
                } else {
                    Toolbar.f fVar = Toolbar.this.Q;
                    z10 = fVar != null ? v.this.f17962b.onMenuItemSelected(0, menuItem) : false;
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.D;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.G = (int) (56.0f * f10);
        this.H = (int) (f10 * 4.0f);
        this.f667y = context;
    }

    public static int o(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.c();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (!cVar.f669a && z11) {
            z10 = true;
        }
        cVar.f672d = z10;
        cVar.f670b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    public boolean a(g gVar) {
        return this.f666x.r(gVar, (i) null, 0);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f666x = eVar;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f666x == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f666x = eVar;
            eVar.f541e = new d();
            c cVar = new c(context);
            this.B = cVar;
            cVar.f847u = true;
            cVar.f848v = true;
            i.a aVar = this.C;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f490e = aVar;
            this.f666x.b(cVar, this.f667y);
            c cVar2 = this.B;
            cVar2.f493h = this;
            this.f666x = cVar2.f488c;
        }
        return this.f666x;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c cVar = this.B;
        c.d dVar = cVar.f844r;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f846t) {
            return cVar.f845s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f668z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public o0.a i(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: l */
    public c h() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: m */
    public c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public boolean n(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.B;
        if (cVar != null) {
            cVar.g(false);
            if (this.B.o()) {
                this.B.m();
                this.B.p();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.B;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.E) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = n1.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f669a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + cVar.leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    n(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f669a) {
                    int i26 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f669a) {
                int i29 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = measuredWidth4 + cVar3.rightMargin + max + i29;
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        androidx.appcompat.view.menu.e eVar;
        boolean z13 = this.E;
        boolean z14 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.E = z14;
        if (z13 != z14) {
            this.F = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.E || (eVar = this.f666x) == null || size == this.F)) {
            this.F = size;
            eVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.E || childCount <= 0) {
            int i16 = i11;
            for (int i17 = 0; i17 < childCount; i17++) {
                c cVar = (c) getChildAt(i17).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i18 = size2 - paddingRight;
        int i19 = this.G;
        int i20 = i18 / i19;
        int i21 = i18 % i19;
        if (i20 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i22 = (i21 / i20) + i19;
        int childCount2 = getChildCount();
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z15 = false;
        long j10 = 0;
        while (i27 < childCount2) {
            View childAt = getChildAt(i27);
            int i28 = size3;
            int i29 = i18;
            if (childAt.getVisibility() != 8) {
                boolean z16 = childAt instanceof ActionMenuItemView;
                int i30 = i23 + 1;
                if (z16) {
                    int i31 = this.H;
                    i15 = i30;
                    z12 = false;
                    childAt.setPadding(i31, 0, i31, 0);
                } else {
                    i15 = i30;
                    z12 = false;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f674f = z12;
                cVar2.f671c = z12 ? 1 : 0;
                cVar2.f670b = z12;
                cVar2.f672d = z12;
                cVar2.leftMargin = z12;
                cVar2.rightMargin = z12;
                cVar2.f673e = z16 && ((ActionMenuItemView) childAt).c();
                int o10 = o(childAt, i22, cVar2.f669a ? 1 : i20, childMeasureSpec, paddingBottom);
                i25 = Math.max(i25, o10);
                if (cVar2.f672d) {
                    i26++;
                }
                if (cVar2.f669a) {
                    z15 = true;
                }
                i20 -= o10;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (o10 == 1) {
                    j10 |= (long) (1 << i27);
                }
                i23 = i15;
            }
            i27++;
            size3 = i28;
            i18 = i29;
        }
        int i32 = i18;
        int i33 = size3;
        boolean z17 = z15 && i23 == 2;
        boolean z18 = false;
        while (true) {
            if (i26 <= 0 || i20 <= 0) {
                i12 = i24;
                z10 = z18;
            } else {
                int i34 = Integer.MAX_VALUE;
                int i35 = 0;
                int i36 = 0;
                long j11 = 0;
                while (i35 < childCount2) {
                    int i37 = i24;
                    c cVar3 = (c) getChildAt(i35).getLayoutParams();
                    boolean z19 = z18;
                    if (cVar3.f672d) {
                        int i38 = cVar3.f670b;
                        if (i38 < i34) {
                            j11 = 1 << i35;
                            i34 = i38;
                            i36 = 1;
                        } else if (i38 == i34) {
                            i36++;
                            j11 |= 1 << i35;
                        }
                    }
                    i35++;
                    z18 = z19;
                    i24 = i37;
                }
                i12 = i24;
                z10 = z18;
                j10 |= j11;
                if (i36 > i20) {
                    break;
                }
                int i39 = i34 + 1;
                int i40 = 0;
                while (i40 < childCount2) {
                    View childAt2 = getChildAt(i40);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i41 = i26;
                    long j12 = (long) (1 << i40);
                    if ((j11 & j12) == 0) {
                        if (cVar4.f670b == i39) {
                            j10 |= j12;
                        }
                        z11 = z17;
                    } else {
                        if (!z17 || !cVar4.f673e || i20 != 1) {
                            z11 = z17;
                        } else {
                            int i42 = this.H;
                            z11 = z17;
                            childAt2.setPadding(i42 + i22, 0, i42, 0);
                        }
                        cVar4.f670b++;
                        cVar4.f674f = true;
                        i20--;
                    }
                    i40++;
                    i26 = i41;
                    z17 = z11;
                }
                i24 = i12;
                z18 = true;
            }
        }
        i12 = i24;
        z10 = z18;
        boolean z20 = !z15 && i23 == 1;
        if (i20 > 0 && j10 != 0 && (i20 < i23 - 1 || z20 || i25 > 1)) {
            float bitCount = (float) Long.bitCount(j10);
            if (!z20) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f673e) {
                    bitCount -= 0.5f;
                }
                int i43 = childCount2 - 1;
                if ((j10 & ((long) (1 << i43))) != 0 && !((c) getChildAt(i43).getLayoutParams()).f673e) {
                    bitCount -= 0.5f;
                }
            }
            int i44 = bitCount > 0.0f ? (int) (((float) (i20 * i22)) / bitCount) : 0;
            for (int i45 = 0; i45 < childCount2; i45++) {
                if ((j10 & ((long) (1 << i45))) != 0) {
                    View childAt3 = getChildAt(i45);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f671c = i44;
                        cVar5.f674f = true;
                        if (i45 == 0 && !cVar5.f673e) {
                            cVar5.leftMargin = (-i44) / 2;
                        }
                    } else if (cVar5.f669a) {
                        cVar5.f671c = i44;
                        cVar5.f674f = true;
                        cVar5.rightMargin = (-i44) / 2;
                    } else {
                        if (i45 != 0) {
                            cVar5.leftMargin = i44 / 2;
                        }
                        if (i45 != childCount2 - 1) {
                            cVar5.rightMargin = i44 / 2;
                        }
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            for (int i46 = 0; i46 < childCount2; i46++) {
                View childAt4 = getChildAt(i46);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f674f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f670b * i22) + cVar6.f671c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i14 = i32;
            i13 = i12;
        } else {
            i13 = i33;
            i14 = i32;
        }
        setMeasuredDimension(i14, i13);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.B.f852z = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.I = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c cVar = this.B;
        c.d dVar = cVar.f844r;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f846t = true;
        cVar.f845s = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.A = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f668z != i10) {
            this.f668z = i10;
            if (i10 == 0) {
                this.f667y = getContext();
            } else {
                this.f667y = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.B = cVar;
        cVar.f493h = this;
        this.f666x = cVar.f488c;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
