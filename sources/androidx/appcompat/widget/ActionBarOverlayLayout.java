package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import com.startapp.startappsdk.R;
import f.y;
import java.util.WeakHashMap;
import o0.c0;
import o0.o;
import o0.o0;
import o0.p;
import o0.q;
import o0.r;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements i0, q, o, p {
    public static final int[] N = {R.attr.actionBarSize, 16842841};
    public final Rect A = new Rect();
    public final Rect B = new Rect();
    public o0 C;
    public o0 D;
    public o0 E;
    public o0 F;
    public d G;
    public OverScroller H;
    public ViewPropertyAnimator I;
    public final AnimatorListenerAdapter J;
    public final Runnable K;
    public final Runnable L;
    public final r M;

    /* renamed from: a  reason: collision with root package name */
    public int f645a;

    /* renamed from: b  reason: collision with root package name */
    public int f646b = 0;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f647c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f648d;

    /* renamed from: e  reason: collision with root package name */
    public j0 f649e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f650f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f651g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f652h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f653i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f654r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f655s;

    /* renamed from: t  reason: collision with root package name */
    public int f656t;

    /* renamed from: u  reason: collision with root package name */
    public int f657u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f658v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public final Rect f659w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public final Rect f660x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final Rect f661y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    public final Rect f662z = new Rect();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.I = null;
            actionBarOverlayLayout.f655s = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.I = null;
            actionBarOverlayLayout.f655s = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.I = actionBarOverlayLayout.f648d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.J);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.I = actionBarOverlayLayout.f648d.animate().translationY((float) (-ActionBarOverlayLayout.this.f648d.getHeight())).setListener(ActionBarOverlayLayout.this.J);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o0 o0Var = o0.f22596b;
        this.C = o0Var;
        this.D = o0Var;
        this.E = o0Var;
        this.F = o0Var;
        this.J = new a();
        this.K = new b();
        this.L = new c();
        r(context);
        this.M = new r();
    }

    public void a(Menu menu, i.a aVar) {
        s();
        this.f649e.a(menu, aVar);
    }

    public boolean b() {
        s();
        return this.f649e.b();
    }

    public void c() {
        s();
        this.f649e.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        s();
        return this.f649e.d();
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f650f != null && !this.f651g) {
            if (this.f648d.getVisibility() == 0) {
                i10 = (int) (this.f648d.getTranslationY() + ((float) this.f648d.getBottom()) + 0.5f);
            } else {
                i10 = 0;
            }
            this.f650f.setBounds(0, i10, getWidth(), this.f650f.getIntrinsicHeight() + i10);
            this.f650f.draw(canvas);
        }
    }

    public boolean e() {
        s();
        return this.f649e.e();
    }

    public boolean f() {
        s();
        return this.f649e.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        s();
        boolean p10 = p(this.f648d, rect, true, true, false, true);
        this.f661y.set(rect);
        n1.a(this, this.f661y, this.f658v);
        if (!this.f662z.equals(this.f661y)) {
            this.f662z.set(this.f661y);
            p10 = true;
        }
        if (!this.f659w.equals(this.f658v)) {
            this.f659w.set(this.f658v);
            p10 = true;
        }
        if (p10) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        s();
        return this.f649e.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f648d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.M.a();
    }

    public CharSequence getTitle() {
        s();
        return this.f649e.getTitle();
    }

    public void h(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public void k(int i10) {
        s();
        if (i10 == 2) {
            this.f649e.v();
        } else if (i10 == 5) {
            this.f649e.w();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public void l() {
        s();
        this.f649e.h();
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        o0 l10 = o0.l(windowInsets, this);
        boolean p10 = p(this.f648d, new Rect(l10.d(), l10.f(), l10.e(), l10.c()), true, true, false, true);
        Rect rect = this.f658v;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (Build.VERSION.SDK_INT >= 21) {
            c0.i.b(this, l10, rect);
        }
        Rect rect2 = this.f658v;
        o0 l11 = l10.f22597a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.C = l11;
        boolean z10 = true;
        if (!this.D.equals(l11)) {
            this.D = this.C;
            p10 = true;
        }
        if (!this.f659w.equals(this.f658v)) {
            this.f659w.set(this.f658v);
        } else {
            z10 = p10;
        }
        if (z10) {
            requestLayout();
        }
        return l10.f22597a.a().a().f22597a.b().j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        c0.A(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        o0.e eVar;
        s();
        measureChildWithMargins(this.f648d, i10, 0, i11, 0);
        e eVar2 = (e) this.f648d.getLayoutParams();
        int max = Math.max(0, this.f648d.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max2 = Math.max(0, this.f648d.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f648d.getMeasuredState());
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        boolean z10 = (c0.d.g(this) & 256) != 0;
        if (z10) {
            i12 = this.f645a;
            if (this.f653i && this.f648d.getTabContainer() != null) {
                i12 += this.f645a;
            }
        } else {
            i12 = this.f648d.getVisibility() != 8 ? this.f648d.getMeasuredHeight() : 0;
        }
        this.f660x.set(this.f658v);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 21) {
            this.E = this.C;
        } else {
            this.A.set(this.f661y);
        }
        if (!this.f652h && !z10) {
            Rect rect = this.f660x;
            rect.top += i12;
            rect.bottom += 0;
            if (i13 >= 21) {
                this.E = this.E.f22597a.l(0, i12, 0, 0);
            }
        } else if (i13 >= 21) {
            g0.b b10 = g0.b.b(this.E.d(), this.E.f() + i12, this.E.e(), this.E.c() + 0);
            o0 o0Var = this.E;
            if (i13 >= 30) {
                eVar = new o0.d(o0Var);
            } else if (i13 >= 29) {
                eVar = new o0.c(o0Var);
            } else if (i13 >= 20) {
                eVar = new o0.b(o0Var);
            } else {
                eVar = new o0.e(o0Var);
            }
            eVar.d(b10);
            this.E = eVar.b();
        } else {
            Rect rect2 = this.A;
            rect2.top += i12;
            rect2.bottom += 0;
        }
        p(this.f647c, this.f660x, true, true, true, true);
        if (i13 >= 21 && !this.F.equals(this.E)) {
            o0 o0Var2 = this.E;
            this.F = o0Var2;
            c0.e(this.f647c, o0Var2);
        } else if (i13 < 21 && !this.B.equals(this.A)) {
            this.B.set(this.A);
            this.f647c.a(this.A);
        }
        measureChildWithMargins(this.f647c, i10, 0, i11, 0);
        e eVar3 = (e) this.f647c.getLayoutParams();
        int max3 = Math.max(max, this.f647c.getMeasuredWidth() + eVar3.leftMargin + eVar3.rightMargin);
        int max4 = Math.max(max2, this.f647c.getMeasuredHeight() + eVar3.topMargin + eVar3.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f647c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.f654r || !z10) {
            return false;
        }
        this.H.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.H.getFinalY() > this.f648d.getHeight()) {
            z11 = true;
        }
        if (z11) {
            q();
            this.L.run();
        } else {
            q();
            this.K.run();
        }
        this.f655s = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f656t + i11;
        this.f656t = i14;
        setActionBarHideOffset(i14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (f.y) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            o0.r r1 = r0.M
            r1.f22632a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f656t = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.G
            if (r1 == 0) goto L_0x001d
            f.y r1 = (f.y) r1
            j.h r2 = r1.f18005t
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f18005t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f648d.getVisibility() != 0) {
            return false;
        }
        return this.f654r;
    }

    public void onStopNestedScroll(View view) {
        if (this.f654r && !this.f655s) {
            if (this.f656t <= this.f648d.getHeight()) {
                q();
                postDelayed(this.K, 600);
            } else {
                q();
                postDelayed(this.L, 600);
            }
        }
        d dVar = this.G;
        if (dVar != null) {
            dVar.getClass();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.f657u ^ i10;
        this.f657u = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.G;
        if (dVar != null) {
            ((y) dVar).f18001p = !z11;
            if (z10 || !z11) {
                y yVar = (y) dVar;
                if (yVar.f18002q) {
                    yVar.f18002q = false;
                    yVar.w(true);
                }
            } else {
                y yVar2 = (y) dVar;
                if (!yVar2.f18002q) {
                    yVar2.f18002q = true;
                    yVar2.w(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.G != null) {
            c0.A(this);
        }
    }

    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f646b = i10;
        d dVar = this.G;
        if (dVar != null) {
            ((y) dVar).f18000o = i10;
        }
    }

    public final boolean p(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar = (e) view.getLayoutParams();
        if (!z10 || eVar.leftMargin == (i13 = rect.left)) {
            z14 = false;
        } else {
            eVar.leftMargin = i13;
            z14 = true;
        }
        if (z11 && eVar.topMargin != (i12 = rect.top)) {
            eVar.topMargin = i12;
            z14 = true;
        }
        if (z13 && eVar.rightMargin != (i11 = rect.right)) {
            eVar.rightMargin = i11;
            z14 = true;
        }
        if (!z12 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z14;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    public void q() {
        removeCallbacks(this.K);
        removeCallbacks(this.L);
        ViewPropertyAnimator viewPropertyAnimator = this.I;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(N);
        boolean z10 = false;
        this.f645a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f650f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.f651g = z10;
        this.H = new OverScroller(context);
    }

    public void s() {
        j0 j0Var;
        if (this.f647c == null) {
            this.f647c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f648d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof j0) {
                j0Var = (j0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                j0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder a10 = android.support.v4.media.a.a("Can't make a decor toolbar out of ");
                a10.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a10.toString());
            }
            this.f649e = j0Var;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f648d.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f648d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.G = dVar;
        if (getWindowToken() != null) {
            ((y) this.G).f18000o = this.f646b;
            int i10 = this.f657u;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                c0.A(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f653i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f654r) {
            this.f654r = z10;
            if (!z10) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        s();
        this.f649e.setIcon(i10);
    }

    public void setLogo(int i10) {
        s();
        this.f649e.r(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f652h = z10;
        this.f651g = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f649e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f649e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f649e.setIcon(drawable);
    }
}
