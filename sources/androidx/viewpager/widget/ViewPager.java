package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.f0;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import androidx.lifecycle.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;

public class ViewPager extends ViewGroup {

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f3169k0 = {16842931};

    /* renamed from: l0  reason: collision with root package name */
    public static final Comparator<e> f3170l0 = new a();

    /* renamed from: m0  reason: collision with root package name */
    public static final Interpolator f3171m0 = new b();
    public boolean A;
    public boolean B;
    public boolean C;
    public int D = 1;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public int N = -1;
    public VelocityTracker O;
    public int P;
    public int Q;
    public int R;
    public int S;

    /* renamed from: a  reason: collision with root package name */
    public int f3172a;

    /* renamed from: a0  reason: collision with root package name */
    public EdgeEffect f3173a0;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<e> f3174b = new ArrayList<>();

    /* renamed from: b0  reason: collision with root package name */
    public EdgeEffect f3175b0;

    /* renamed from: c  reason: collision with root package name */
    public final e f3176c = new e();

    /* renamed from: c0  reason: collision with root package name */
    public boolean f3177c0 = true;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3178d = new Rect();

    /* renamed from: d0  reason: collision with root package name */
    public boolean f3179d0;

    /* renamed from: e  reason: collision with root package name */
    public f2.a f3180e;

    /* renamed from: e0  reason: collision with root package name */
    public int f3181e0;

    /* renamed from: f  reason: collision with root package name */
    public int f3182f;

    /* renamed from: f0  reason: collision with root package name */
    public List<i> f3183f0;

    /* renamed from: g  reason: collision with root package name */
    public int f3184g = -1;

    /* renamed from: g0  reason: collision with root package name */
    public i f3185g0;

    /* renamed from: h  reason: collision with root package name */
    public Parcelable f3186h = null;

    /* renamed from: h0  reason: collision with root package name */
    public List<h> f3187h0;

    /* renamed from: i  reason: collision with root package name */
    public Scroller f3188i;

    /* renamed from: i0  reason: collision with root package name */
    public final Runnable f3189i0 = new c();

    /* renamed from: j0  reason: collision with root package name */
    public int f3190j0 = 0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3191r;

    /* renamed from: s  reason: collision with root package name */
    public j f3192s;

    /* renamed from: t  reason: collision with root package name */
    public int f3193t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f3194u;

    /* renamed from: v  reason: collision with root package name */
    public int f3195v;

    /* renamed from: w  reason: collision with root package name */
    public int f3196w;

    /* renamed from: x  reason: collision with root package name */
    public float f3197x = -3.4028235E38f;

    /* renamed from: y  reason: collision with root package name */
    public float f3198y = Float.MAX_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public int f3199z;

    public static class a implements Comparator<e> {
        public int compare(Object obj, Object obj2) {
            return ((e) obj).f3202b - ((e) obj2).f3202b;
        }
    }

    public static class b implements Interpolator {
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.q(viewPager.f3182f);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Object f3201a;

        /* renamed from: b  reason: collision with root package name */
        public int f3202b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3203c;

        /* renamed from: d  reason: collision with root package name */
        public float f3204d;

        /* renamed from: e  reason: collision with root package name */
        public float f3205e;
    }

    public class g extends o0.a {
        public g() {
        }

        public void c(View view, AccessibilityEvent accessibilityEvent) {
            f2.a aVar;
            this.f22536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            f2.a aVar2 = ViewPager.this.f3180e;
            boolean z10 = true;
            if (aVar2 == null || aVar2.c() <= 1) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f3180e) != null) {
                accessibilityEvent.setItemCount(aVar.c());
                accessibilityEvent.setFromIndex(ViewPager.this.f3182f);
                accessibilityEvent.setToIndex(ViewPager.this.f3182f);
            }
        }

        public void d(View view, p0.c cVar) {
            this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            cVar.f23748a.setClassName(ViewPager.class.getName());
            f2.a aVar = ViewPager.this.f3180e;
            cVar.f23748a.setScrollable(aVar != null && aVar.c() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.f23748a.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.f23748a.addAction(8192);
            }
        }

        public boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f3182f - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f3182f + 1);
                return true;
            }
        }
    }

    public interface h {
        void a(ViewPager viewPager, f2.a aVar, f2.a aVar2);
    }

    public interface i {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    public class j extends DataSetObserver {
        public j() {
        }

        public void onChanged() {
            ViewPager.this.e();
        }

        public void onInvalidated() {
            ViewPager.this.e();
        }
    }

    public static class k extends u0.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f3213c;

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f3214d;

        /* renamed from: e  reason: collision with root package name */
        public ClassLoader f3215e;

        public static class a implements Parcelable.ClassLoaderCreator<k> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new k[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new k(parcel, (ClassLoader) null);
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("FragmentPager.SavedState{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append(" position=");
            return v.e.a(a10, this.f3213c, "}");
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeInt(this.f3213c);
            parcel.writeParcelable(this.f3214d, i10);
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.f3213c = parcel.readInt();
            this.f3214d = parcel.readParcelable(classLoader);
            this.f3215e = classLoader;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f3188i = new Scroller(context2, f3171m0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.I = viewConfiguration.getScaledPagingTouchSlop();
        this.P = (int) (400.0f * f10);
        this.Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3173a0 = new EdgeEffect(context2);
        this.f3175b0 = new EdgeEffect(context2);
        this.R = (int) (25.0f * f10);
        this.S = (int) (2.0f * f10);
        this.G = (int) (f10 * 16.0f);
        c0.C(this, new g());
        if (c0.d.c(this) == 0) {
            c0.I(this, 1);
        }
        c0.J(this, new f2.b(this));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
        }
    }

    public e a(int i10, int i11) {
        e eVar = new e();
        eVar.f3202b = i10;
        f0 f0Var = (f0) this.f3180e;
        if (f0Var.f1669d == null) {
            f0Var.f1669d = new androidx.fragment.app.b(f0Var.f1667b);
        }
        long j10 = (long) i10;
        p G2 = f0Var.f1667b.G(f0.e(getId(), j10));
        if (G2 != null) {
            f0Var.f1669d.c(new i0.a(7, G2));
        } else {
            G2 = ad.i.this.D0.valueAt(i10);
            f0Var.f1669d.g(getId(), G2, f0.e(getId(), j10), 1);
        }
        if (G2 != f0Var.f1670e) {
            G2.n0(false);
            if (f0Var.f1668c == 1) {
                f0Var.f1669d.i(G2, o.c.STARTED);
            } else {
                G2.q0(false);
            }
        }
        eVar.f3201a = G2;
        this.f3180e.getClass();
        eVar.f3204d = 1.0f;
        if (i11 < 0 || i11 >= this.f3174b.size()) {
            this.f3174b.add(eVar);
        } else {
            this.f3174b.add(i11, eVar);
        }
        return eVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        e h10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3202b == this.f3182f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        e h10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3202b == this.f3182f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean z10 = fVar.f3206a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f3206a = z10;
        if (!this.A) {
            super.addView(view, i10, layoutParams);
        } else if (!z10) {
            fVar.f3209d = true;
            addViewInLayout(view, i10, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000a
            goto L_0x0063
        L_0x000a:
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r4 = r0.getParent()
        L_0x0010:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001d
            if (r4 != r6) goto L_0x0018
            r4 = 1
            goto L_0x001e
        L_0x0018:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0010
        L_0x001d:
            r4 = 0
        L_0x001e:
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0034:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0034
        L_0x004d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L_0x0063:
            r0 = r3
        L_0x0064:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x0095
            android.graphics.Rect r1 = r6.f3178d
            android.graphics.Rect r1 = r6.g(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3178d
            android.graphics.Rect r2 = r6.g(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008f
            if (r1 < r2) goto L_0x008f
            boolean r0 = r6.m()
            goto L_0x0093
        L_0x008f:
            boolean r0 = r3.requestFocus()
        L_0x0093:
            r2 = r0
            goto L_0x00c8
        L_0x0095:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.f3178d
            android.graphics.Rect r1 = r6.g(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3178d
            android.graphics.Rect r2 = r6.g(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b0
            if (r1 > r2) goto L_0x00b0
            boolean r0 = r6.n()
            goto L_0x0093
        L_0x00b0:
            boolean r0 = r3.requestFocus()
            goto L_0x0093
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.n()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.m()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    public boolean c(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom()) {
                    if (c(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z10 || !view.canScrollHorizontally(-i10)) {
            return false;
        }
        return true;
    }

    public boolean canScrollHorizontally(int i10) {
        if (this.f3180e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f3197x))) {
                return true;
            }
            return false;
        } else if (i10 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f3198y))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f3191r = true;
        if (this.f3188i.isFinished() || !this.f3188i.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3188i.getCurrX();
        int currY = this.f3188i.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                this.f3188i.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.k(this);
    }

    public final void d(boolean z10) {
        boolean z11 = this.f3190j0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f3188i.isFinished()) {
                this.f3188i.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3188i.getCurrX();
                int currY = this.f3188i.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.C = false;
        for (int i10 = 0; i10 < this.f3174b.size(); i10++) {
            e eVar = this.f3174b.get(i10);
            if (eVar.f3203c) {
                eVar.f3203c = false;
                z11 = true;
            }
        }
        if (!z11) {
            return;
        }
        if (z10) {
            Runnable runnable = this.f3189i0;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.m(this, runnable);
            return;
        }
        this.f3189i0.run();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x005d
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x005a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x005a
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.b(r4)
            goto L_0x005b
        L_0x002b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L_0x005a
            boolean r6 = r5.b(r2)
            goto L_0x005b
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.n()
            goto L_0x005b
        L_0x0041:
            r6 = 66
            boolean r6 = r5.b(r6)
            goto L_0x005b
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0053
            boolean r6 = r5.m()
            goto L_0x005b
        L_0x0053:
            r6 = 17
            boolean r6 = r5.b(r6)
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e h10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3202b == this.f3182f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        f2.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f3180e) != null && aVar.c() > 1)) {
            if (!this.f3173a0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.f3197x * ((float) width));
                this.f3173a0.setSize(height, width);
                z10 = false | this.f3173a0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3175b0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f3198y + 1.0f)) * ((float) width2));
                this.f3175b0.setSize(height2, width2);
                z10 |= this.f3175b0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f3173a0.finish();
            this.f3175b0.finish();
        }
        if (z10) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3194u;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void e() {
        int c10 = this.f3180e.c();
        this.f3172a = c10;
        boolean z10 = this.f3174b.size() < (this.D * 2) + 1 && this.f3174b.size() < c10;
        int i10 = this.f3182f;
        for (int i11 = 0; i11 < this.f3174b.size(); i11++) {
            f2.a aVar = this.f3180e;
            Object obj = this.f3174b.get(i11).f3201a;
            aVar.getClass();
        }
        Collections.sort(this.f3174b, f3170l0);
        if (z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                f fVar = (f) getChildAt(i12).getLayoutParams();
                if (!fVar.f3206a) {
                    fVar.f3208c = 0.0f;
                }
            }
            v(i10, false, true, 0);
            requestLayout();
        }
    }

    public final void f(int i10) {
        i iVar = this.f3185g0;
        if (iVar != null) {
            iVar.c(i10);
        }
        List<i> list = this.f3183f0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = this.f3183f0.get(i11);
                if (iVar2 != null) {
                    iVar2.c(i10);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public f2.a getAdapter() {
        return this.f3180e;
    }

    public int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f3182f;
    }

    public int getOffscreenPageLimit() {
        return this.D;
    }

    public int getPageMargin() {
        return this.f3193t;
    }

    public e h(View view) {
        for (int i10 = 0; i10 < this.f3174b.size(); i10++) {
            e eVar = this.f3174b.get(i10);
            f2.a aVar = this.f3180e;
            Object obj = eVar.f3201a;
            ((f0) aVar).getClass();
            if (((p) obj).Q == view) {
                return eVar;
            }
        }
        return null;
    }

    public final e i() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f11 = clientWidth > 0 ? ((float) this.f3193t) / ((float) clientWidth) : 0.0f;
        e eVar = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (i12 < this.f3174b.size()) {
            e eVar2 = this.f3174b.get(i12);
            if (!z10 && eVar2.f3202b != (i10 = i11 + 1)) {
                eVar2 = this.f3176c;
                eVar2.f3205e = f10 + f12 + f11;
                eVar2.f3202b = i10;
                this.f3180e.getClass();
                eVar2.f3204d = 1.0f;
                i12--;
            }
            f10 = eVar2.f3205e;
            float f13 = eVar2.f3204d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return eVar;
            }
            if (scrollX < f13 || i12 == this.f3174b.size() - 1) {
                return eVar2;
            }
            i11 = eVar2.f3202b;
            f12 = eVar2.f3204d;
            i12++;
            eVar = eVar2;
            z10 = false;
        }
        return eVar;
    }

    public e j(int i10) {
        for (int i11 = 0; i11 < this.f3174b.size(); i11++) {
            e eVar = this.f3174b.get(i11);
            if (eVar.f3202b == i10) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f3181e0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            boolean r10 = r9.f3206a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f3207b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.ViewPager$i r0 = r12.f3185g0
            if (r0 == 0) goto L_0x0072
            r0.a(r13, r14, r15)
        L_0x0072:
            java.util.List<androidx.viewpager.widget.ViewPager$i> r0 = r12.f3183f0
            if (r0 == 0) goto L_0x008c
            int r0 = r0.size()
        L_0x007a:
            if (r1 >= r0) goto L_0x008c
            java.util.List<androidx.viewpager.widget.ViewPager$i> r3 = r12.f3183f0
            java.lang.Object r3 = r3.get(r1)
            androidx.viewpager.widget.ViewPager$i r3 = (androidx.viewpager.widget.ViewPager.i) r3
            if (r3 == 0) goto L_0x0089
            r3.a(r13, r14, r15)
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x008c:
            r12.f3179d0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(int, float, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.J = motionEvent.getX(i10);
            this.N = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.O;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean m() {
        int i10 = this.f3182f;
        if (i10 <= 0) {
            return false;
        }
        this.C = false;
        v(i10 - 1, true, false, 0);
        return true;
    }

    public boolean n() {
        f2.a aVar = this.f3180e;
        if (aVar == null || this.f3182f >= aVar.c() - 1) {
            return false;
        }
        this.C = false;
        v(this.f3182f + 1, true, false, 0);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f3174b.size() != 0) {
            e i11 = i();
            int clientWidth = getClientWidth();
            int i12 = this.f3193t;
            int i13 = clientWidth + i12;
            float f10 = (float) clientWidth;
            int i14 = i11.f3202b;
            float f11 = ((((float) i10) / f10) - i11.f3205e) / (i11.f3204d + (((float) i12) / f10));
            this.f3179d0 = false;
            k(i14, f11, (int) (((float) i13) * f11));
            if (this.f3179d0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f3177c0) {
            return false;
        } else {
            this.f3179d0 = false;
            k(0, 0.0f, 0);
            if (this.f3179d0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3177c0 = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f3189i0);
        Scroller scroller = this.f3188i;
        if (scroller != null && !scroller.isFinished()) {
            this.f3188i.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f3193t
            if (r1 <= 0) goto L_0x00ac
            android.graphics.drawable.Drawable r1 = r0.f3194u
            if (r1 == 0) goto L_0x00ac
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r1 = r0.f3174b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00ac
            f2.a r1 = r0.f3180e
            if (r1 == 0) goto L_0x00ac
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f3193t
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r5 = r0.f3174b
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$e r5 = (androidx.viewpager.widget.ViewPager.e) r5
            float r7 = r5.f3205e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            int r8 = r8.size()
            int r9 = r5.f3202b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.f3174b
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            int r10 = r10.f3202b
        L_0x0045:
            if (r9 >= r10) goto L_0x00ac
        L_0x0047:
            int r11 = r5.f3202b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r5 = r0.f3174b
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$e r5 = (androidx.viewpager.widget.ViewPager.e) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.f3205e
            float r11 = r5.f3204d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0073
        L_0x0065:
            f2.a r11 = r0.f3180e
            r11.getClass()
            r11 = 1065353216(0x3f800000, float:1.0)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r11 = r11 + r7
            r7 = r11
        L_0x0073:
            int r11 = r0.f3193t
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x009b
            android.graphics.drawable.Drawable r11 = r0.f3194u
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f3195v
            int r15 = r0.f3193t
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f3196w
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f3194u
            r11 = r18
            r3.draw(r11)
            goto L_0x009f
        L_0x009b:
            r11 = r18
            r16 = r3
        L_0x009f:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.E) {
                return true;
            }
            if (this.F) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.L = x10;
            this.J = x10;
            float y10 = motionEvent.getY();
            this.M = y10;
            this.K = y10;
            this.N = motionEvent2.getPointerId(0);
            this.F = false;
            this.f3191r = true;
            this.f3188i.computeScrollOffset();
            if (this.f3190j0 != 2 || Math.abs(this.f3188i.getFinalX() - this.f3188i.getCurrX()) <= this.S) {
                d(false);
                this.E = false;
            } else {
                this.f3188i.abortAnimation();
                this.C = false;
                q(this.f3182f);
                this.E = true;
                s(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.N;
            if (i10 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i10);
                float x11 = motionEvent2.getX(findPointerIndex);
                float f10 = x11 - this.J;
                float abs = Math.abs(f10);
                float y11 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.M);
                if (f10 != 0.0f) {
                    float f11 = this.J;
                    if (!((f11 < ((float) this.H) && f10 > 0.0f) || (f11 > ((float) (getWidth() - this.H)) && f10 < 0.0f))) {
                        if (c(this, false, (int) f10, (int) x11, (int) y11)) {
                            this.J = x11;
                            this.K = y11;
                            this.F = true;
                            return false;
                        }
                    }
                }
                int i11 = this.I;
                if (abs > ((float) i11) && abs * 0.5f > abs2) {
                    this.E = true;
                    s(true);
                    setScrollState(1);
                    this.J = f10 > 0.0f ? this.L + ((float) this.I) : this.L - ((float) this.I);
                    this.K = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i11)) {
                    this.F = true;
                }
                if (this.E && p(x11)) {
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    c0.d.k(this);
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(motionEvent2);
        return this.E;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r12 = (androidx.viewpager.widget.ViewPager.f) r12
            boolean r14 = r12.f3206a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f3207b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r9 = (androidx.viewpager.widget.ViewPager.f) r9
            boolean r10 = r9.f3206a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$e r10 = r0.h(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f3205e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f3209d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f3209d = r14
            float r9 = r9.f3208c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f3195v = r5
            int r3 = r3 - r7
            r0.f3196w = r3
            r0.f3181e0 = r11
            boolean r1 = r0.f3177c0
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f3182f
            r2 = 0
            r0.u(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f3177c0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.G
            int r15 = java.lang.Math.min(r15, r1)
            r13.H = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r3 = (androidx.viewpager.widget.ViewPager.f) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f3206a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f3207b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f3199z = r15
            r13.A = r4
            int r15 = r13.f3182f
            r13.q(r15)
            r13.A = r0
            int r15 = r13.getChildCount()
        L_0x00c8:
            if (r0 >= r15) goto L_0x00f2
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ef
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r2 = (androidx.viewpager.widget.ViewPager.f) r2
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r2.f3206a
            if (r4 != 0) goto L_0x00ef
        L_0x00e0:
            float r4 = (float) r14
            float r2 = r2.f3208c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f3199z
            r1.measure(r2, r4)
        L_0x00ef:
            int r0 = r0 + 1
            goto L_0x00c8
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        e h10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i11 = 1;
        } else {
            i12 = childCount - 1;
            i11 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3202b == this.f3182f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i12 += i11;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f25915a);
        if (this.f3180e != null) {
            v(kVar.f3213c, false, true, 0);
            return;
        }
        this.f3184g = kVar.f3213c;
        this.f3186h = kVar.f3214d;
    }

    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f3213c = this.f3182f;
        f2.a aVar = this.f3180e;
        if (aVar != null) {
            aVar.getClass();
            kVar.f3214d = null;
        }
        return kVar;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f3193t;
            r(i10, i12, i14, i14);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        f2.a aVar;
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f3180e) == null || aVar.c() == 0) {
            return false;
        }
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f3188i.abortAnimation();
            this.C = false;
            q(this.f3182f);
            float x10 = motionEvent.getX();
            this.L = x10;
            this.J = x10;
            float y10 = motionEvent.getY();
            this.M = y10;
            this.K = y10;
            this.N = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.E) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.N);
                    if (findPointerIndex == -1) {
                        z10 = t();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.J);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.K);
                        if (abs > ((float) this.I) && abs > abs2) {
                            this.E = true;
                            s(true);
                            float f10 = this.L;
                            this.J = x11 - f10 > 0.0f ? f10 + ((float) this.I) : f10 - ((float) this.I);
                            this.K = y11;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.E) {
                    z10 = false | p(motionEvent.getX(motionEvent.findPointerIndex(this.N)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.J = motionEvent.getX(actionIndex);
                    this.N = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    l(motionEvent);
                    this.J = motionEvent.getX(motionEvent.findPointerIndex(this.N));
                }
            } else if (this.E) {
                u(this.f3182f, true, 0, false);
                z10 = t();
            }
        } else if (this.E) {
            VelocityTracker velocityTracker = this.O;
            velocityTracker.computeCurrentVelocity(1000, (float) this.Q);
            int xVelocity = (int) velocityTracker.getXVelocity(this.N);
            this.C = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e i10 = i();
            float f11 = (float) clientWidth;
            float f12 = ((float) this.f3193t) / f11;
            int i11 = i10.f3202b;
            float f13 = ((((float) scrollX) / f11) - i10.f3205e) / (i10.f3204d + f12);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.N)) - this.L)) <= this.R || Math.abs(xVelocity) <= this.P) {
                i11 += (int) (f13 + (i11 >= this.f3182f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i11++;
            }
            if (this.f3174b.size() > 0) {
                ArrayList<e> arrayList = this.f3174b;
                i11 = Math.max(this.f3174b.get(0).f3202b, Math.min(i11, arrayList.get(arrayList.size() - 1).f3202b));
            }
            v(i11, true, true, xVelocity);
            z10 = t();
        }
        if (z10) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(this);
        }
        return true;
    }

    public final boolean p(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.J - f10;
        this.J = f10;
        float scrollX = ((float) getScrollX()) + f11;
        float clientWidth = (float) getClientWidth();
        float f12 = this.f3197x * clientWidth;
        float f13 = this.f3198y * clientWidth;
        boolean z12 = false;
        e eVar = this.f3174b.get(0);
        ArrayList<e> arrayList = this.f3174b;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f3202b != 0) {
            f12 = eVar.f3205e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f3202b != this.f3180e.c() - 1) {
            f13 = eVar2.f3205e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f3173a0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f3175b0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.J = (scrollX - ((float) i10)) + this.J;
        scrollTo(i10, getScrollY());
        o(i10);
        return z12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r8 == r9) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f3182f
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$e r2 = r0.j(r2)
            r0.f3182f = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            f2.a r1 = r0.f3180e
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            boolean r1 = r0.C
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0021
            return
        L_0x0021:
            f2.a r1 = r0.f3180e
            r1.d(r0)
            int r1 = r0.D
            int r3 = r0.f3182f
            int r3 = r3 - r1
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            f2.a r5 = r0.f3180e
            int r5 = r5.c()
            int r6 = r5 + -1
            int r7 = r0.f3182f
            int r7 = r7 + r1
            int r1 = java.lang.Math.min(r6, r7)
            int r6 = r0.f3172a
            if (r5 != r6) goto L_0x0391
            r6 = 0
        L_0x0044:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r0.f3174b
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0060
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r7 = r0.f3174b
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$e r7 = (androidx.viewpager.widget.ViewPager.e) r7
            int r8 = r7.f3202b
            int r9 = r0.f3182f
            if (r8 < r9) goto L_0x005d
            if (r8 != r9) goto L_0x0060
            goto L_0x0061
        L_0x005d:
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0060:
            r7 = 0
        L_0x0061:
            if (r7 != 0) goto L_0x006b
            if (r5 <= 0) goto L_0x006b
            int r7 = r0.f3182f
            androidx.viewpager.widget.ViewPager$e r7 = r0.a(r7, r6)
        L_0x006b:
            if (r7 == 0) goto L_0x030f
            int r8 = r6 + -1
            if (r8 < 0) goto L_0x007a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r0.f3174b
            java.lang.Object r9 = r9.get(r8)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
            goto L_0x007b
        L_0x007a:
            r9 = 0
        L_0x007b:
            int r10 = r17.getClientWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            if (r10 > 0) goto L_0x0085
            r12 = 0
            goto L_0x0091
        L_0x0085:
            float r12 = r7.f3204d
            float r12 = r11 - r12
            int r13 = r17.getPaddingLeft()
            float r13 = (float) r13
            float r14 = (float) r10
            float r13 = r13 / r14
            float r12 = r12 + r13
        L_0x0091:
            int r13 = r0.f3182f
            r14 = 1
            int r13 = r13 - r14
            r15 = 0
        L_0x0096:
            if (r13 < 0) goto L_0x00f6
            int r16 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r16 < 0) goto L_0x00c4
            if (r13 >= r3) goto L_0x00c4
            if (r9 != 0) goto L_0x00a1
            goto L_0x00f6
        L_0x00a1:
            int r4 = r9.f3202b
            if (r13 != r4) goto L_0x00f2
            boolean r4 = r9.f3203c
            if (r4 != 0) goto L_0x00f2
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r0.f3174b
            r4.remove(r8)
            f2.a r4 = r0.f3180e
            java.lang.Object r9 = r9.f3201a
            r4.a(r0, r13, r9)
            int r8 = r8 + -1
            int r6 = r6 + -1
            if (r8 < 0) goto L_0x00f0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r0.f3174b
            java.lang.Object r4 = r4.get(r8)
            androidx.viewpager.widget.ViewPager$e r4 = (androidx.viewpager.widget.ViewPager.e) r4
            goto L_0x00f1
        L_0x00c4:
            if (r9 == 0) goto L_0x00da
            int r4 = r9.f3202b
            if (r13 != r4) goto L_0x00da
            float r4 = r9.f3204d
            float r15 = r15 + r4
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x00f0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r0.f3174b
            java.lang.Object r4 = r4.get(r8)
            androidx.viewpager.widget.ViewPager$e r4 = (androidx.viewpager.widget.ViewPager.e) r4
            goto L_0x00f1
        L_0x00da:
            int r4 = r8 + 1
            androidx.viewpager.widget.ViewPager$e r4 = r0.a(r13, r4)
            float r4 = r4.f3204d
            float r15 = r15 + r4
            int r6 = r6 + 1
            if (r8 < 0) goto L_0x00f0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r4 = r0.f3174b
            java.lang.Object r4 = r4.get(r8)
            androidx.viewpager.widget.ViewPager$e r4 = (androidx.viewpager.widget.ViewPager.e) r4
            goto L_0x00f1
        L_0x00f0:
            r4 = 0
        L_0x00f1:
            r9 = r4
        L_0x00f2:
            int r13 = r13 + -1
            r4 = 0
            goto L_0x0096
        L_0x00f6:
            float r3 = r7.f3204d
            int r4 = r6 + 1
            int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x018a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            int r8 = r8.size()
            if (r4 >= r8) goto L_0x010f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            java.lang.Object r8 = r8.get(r4)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
            goto L_0x0110
        L_0x010f:
            r8 = 0
        L_0x0110:
            if (r10 > 0) goto L_0x0114
            r9 = 0
            goto L_0x011c
        L_0x0114:
            int r9 = r17.getPaddingRight()
            float r9 = (float) r9
            float r10 = (float) r10
            float r9 = r9 / r10
            float r9 = r9 + r11
        L_0x011c:
            int r10 = r0.f3182f
            int r10 = r10 + r14
            r11 = r4
        L_0x0120:
            if (r10 >= r5) goto L_0x018a
            int r12 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x0150
            if (r10 <= r1) goto L_0x0150
            if (r8 != 0) goto L_0x012b
            goto L_0x018a
        L_0x012b:
            int r12 = r8.f3202b
            if (r10 != r12) goto L_0x0187
            boolean r12 = r8.f3203c
            if (r12 != 0) goto L_0x0187
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r12 = r0.f3174b
            r12.remove(r11)
            f2.a r12 = r0.f3180e
            java.lang.Object r8 = r8.f3201a
            r12.a(r0, r10, r8)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            int r8 = r8.size()
            if (r11 >= r8) goto L_0x0186
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            java.lang.Object r8 = r8.get(r11)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
            goto L_0x0187
        L_0x0150:
            if (r8 == 0) goto L_0x016c
            int r12 = r8.f3202b
            if (r10 != r12) goto L_0x016c
            float r8 = r8.f3204d
            float r3 = r3 + r8
            int r11 = r11 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            int r8 = r8.size()
            if (r11 >= r8) goto L_0x0186
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            java.lang.Object r8 = r8.get(r11)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
            goto L_0x0187
        L_0x016c:
            androidx.viewpager.widget.ViewPager$e r8 = r0.a(r10, r11)
            int r11 = r11 + 1
            float r8 = r8.f3204d
            float r3 = r3 + r8
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            int r8 = r8.size()
            if (r11 >= r8) goto L_0x0186
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r8 = r0.f3174b
            java.lang.Object r8 = r8.get(r11)
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
            goto L_0x0187
        L_0x0186:
            r8 = 0
        L_0x0187:
            int r10 = r10 + 1
            goto L_0x0120
        L_0x018a:
            f2.a r1 = r0.f3180e
            int r1 = r1.c()
            int r3 = r17.getClientWidth()
            if (r3 <= 0) goto L_0x019c
            int r5 = r0.f3193t
            float r5 = (float) r5
            float r3 = (float) r3
            float r5 = r5 / r3
            goto L_0x019d
        L_0x019c:
            r5 = 0
        L_0x019d:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0235
            int r8 = r2.f3202b
            int r9 = r7.f3202b
            if (r8 >= r9) goto L_0x01f2
            float r9 = r2.f3205e
            float r2 = r2.f3204d
            float r9 = r9 + r2
            float r9 = r9 + r5
            r2 = 0
        L_0x01ae:
            int r8 = r8 + r14
            int r10 = r7.f3202b
            if (r8 > r10) goto L_0x0235
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.f3174b
            int r10 = r10.size()
            if (r2 >= r10) goto L_0x0235
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.f3174b
            java.lang.Object r10 = r10.get(r2)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
        L_0x01c3:
            int r11 = r10.f3202b
            if (r8 <= r11) goto L_0x01dc
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r11 = r0.f3174b
            int r11 = r11.size()
            int r11 = r11 + -1
            if (r2 >= r11) goto L_0x01dc
            int r2 = r2 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.f3174b
            java.lang.Object r10 = r10.get(r2)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            goto L_0x01c3
        L_0x01dc:
            int r11 = r10.f3202b
            if (r8 >= r11) goto L_0x01eb
            f2.a r11 = r0.f3180e
            r11.getClass()
            float r11 = r3 + r5
            float r9 = r9 + r11
            int r8 = r8 + 1
            goto L_0x01dc
        L_0x01eb:
            r10.f3205e = r9
            float r10 = r10.f3204d
            float r10 = r10 + r5
            float r9 = r9 + r10
            goto L_0x01ae
        L_0x01f2:
            if (r8 <= r9) goto L_0x0235
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r0.f3174b
            int r9 = r9.size()
            int r9 = r9 + -1
            float r2 = r2.f3205e
        L_0x01fe:
            int r8 = r8 + -1
            int r10 = r7.f3202b
            if (r8 < r10) goto L_0x0235
            if (r9 < 0) goto L_0x0235
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.f3174b
            java.lang.Object r10 = r10.get(r9)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
        L_0x020e:
            int r11 = r10.f3202b
            if (r8 >= r11) goto L_0x021f
            if (r9 <= 0) goto L_0x021f
            int r9 = r9 + -1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r10 = r0.f3174b
            java.lang.Object r10 = r10.get(r9)
            androidx.viewpager.widget.ViewPager$e r10 = (androidx.viewpager.widget.ViewPager.e) r10
            goto L_0x020e
        L_0x021f:
            int r11 = r10.f3202b
            if (r8 <= r11) goto L_0x022e
            f2.a r11 = r0.f3180e
            r11.getClass()
            float r11 = r3 + r5
            float r2 = r2 - r11
            int r8 = r8 + -1
            goto L_0x021f
        L_0x022e:
            float r11 = r10.f3204d
            float r11 = r11 + r5
            float r2 = r2 - r11
            r10.f3205e = r2
            goto L_0x01fe
        L_0x0235:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r2 = r0.f3174b
            int r2 = r2.size()
            float r8 = r7.f3205e
            int r9 = r7.f3202b
            int r10 = r9 + -1
            if (r9 != 0) goto L_0x0245
            r11 = r8
            goto L_0x0248
        L_0x0245:
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0248:
            r0.f3197x = r11
            int r1 = r1 + -1
            if (r9 != r1) goto L_0x0253
            float r9 = r7.f3204d
            float r9 = r9 + r8
            float r9 = r9 - r3
            goto L_0x0256
        L_0x0253:
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0256:
            r0.f3198y = r9
            int r6 = r6 + -1
        L_0x025a:
            if (r6 < 0) goto L_0x0282
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r0.f3174b
            java.lang.Object r9 = r9.get(r6)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
        L_0x0264:
            int r11 = r9.f3202b
            if (r10 <= r11) goto L_0x0273
            f2.a r11 = r0.f3180e
            int r10 = r10 + -1
            r11.getClass()
            float r11 = r3 + r5
            float r8 = r8 - r11
            goto L_0x0264
        L_0x0273:
            float r12 = r9.f3204d
            float r12 = r12 + r5
            float r8 = r8 - r12
            r9.f3205e = r8
            if (r11 != 0) goto L_0x027d
            r0.f3197x = r8
        L_0x027d:
            int r6 = r6 + -1
            int r10 = r10 + -1
            goto L_0x025a
        L_0x0282:
            float r6 = r7.f3205e
            float r8 = r7.f3204d
            float r6 = r6 + r8
            float r6 = r6 + r5
            int r8 = r7.f3202b
            int r8 = r8 + r14
        L_0x028b:
            if (r4 >= r2) goto L_0x02b7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$e> r9 = r0.f3174b
            java.lang.Object r9 = r9.get(r4)
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.e) r9
        L_0x0295:
            int r10 = r9.f3202b
            if (r8 >= r10) goto L_0x02a4
            f2.a r10 = r0.f3180e
            int r8 = r8 + 1
            r10.getClass()
            float r10 = r3 + r5
            float r6 = r6 + r10
            goto L_0x0295
        L_0x02a4:
            if (r10 != r1) goto L_0x02ac
            float r10 = r9.f3204d
            float r10 = r10 + r6
            float r10 = r10 - r3
            r0.f3198y = r10
        L_0x02ac:
            r9.f3205e = r6
            float r9 = r9.f3204d
            float r9 = r9 + r5
            float r6 = r6 + r9
            int r4 = r4 + 1
            int r8 = r8 + 1
            goto L_0x028b
        L_0x02b7:
            f2.a r1 = r0.f3180e
            java.lang.Object r2 = r7.f3201a
            androidx.fragment.app.f0 r1 = (androidx.fragment.app.f0) r1
            r1.getClass()
            androidx.fragment.app.p r2 = (androidx.fragment.app.p) r2
            androidx.fragment.app.p r3 = r1.f1670e
            r4 = 0
            if (r2 == r3) goto L_0x030f
            if (r3 == 0) goto L_0x02ee
            r3.n0(r4)
            int r3 = r1.f1668c
            if (r3 != r14) goto L_0x02e8
            androidx.fragment.app.i0 r3 = r1.f1669d
            if (r3 != 0) goto L_0x02dd
            androidx.fragment.app.a0 r3 = r1.f1667b
            androidx.fragment.app.b r4 = new androidx.fragment.app.b
            r4.<init>((androidx.fragment.app.a0) r3)
            r1.f1669d = r4
        L_0x02dd:
            androidx.fragment.app.i0 r3 = r1.f1669d
            androidx.fragment.app.p r4 = r1.f1670e
            androidx.lifecycle.o$c r5 = androidx.lifecycle.o.c.STARTED
            r3.i(r4, r5)
            r4 = 0
            goto L_0x02ee
        L_0x02e8:
            androidx.fragment.app.p r3 = r1.f1670e
            r4 = 0
            r3.q0(r4)
        L_0x02ee:
            r2.n0(r14)
            int r3 = r1.f1668c
            if (r3 != r14) goto L_0x030a
            androidx.fragment.app.i0 r3 = r1.f1669d
            if (r3 != 0) goto L_0x0302
            androidx.fragment.app.a0 r3 = r1.f1667b
            androidx.fragment.app.b r5 = new androidx.fragment.app.b
            r5.<init>((androidx.fragment.app.a0) r3)
            r1.f1669d = r5
        L_0x0302:
            androidx.fragment.app.i0 r3 = r1.f1669d
            androidx.lifecycle.o$c r5 = androidx.lifecycle.o.c.RESUMED
            r3.i(r2, r5)
            goto L_0x030d
        L_0x030a:
            r2.q0(r14)
        L_0x030d:
            r1.f1670e = r2
        L_0x030f:
            f2.a r1 = r0.f3180e
            r1.b(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0319:
            if (r2 >= r1) goto L_0x0344
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            r5.getClass()
            boolean r6 = r5.f3206a
            if (r6 != 0) goto L_0x0341
            float r6 = r5.f3208c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0341
            androidx.viewpager.widget.ViewPager$e r3 = r0.h(r3)
            if (r3 == 0) goto L_0x0341
            float r6 = r3.f3204d
            r5.f3208c = r6
            int r3 = r3.f3202b
            r5.f3210e = r3
        L_0x0341:
            int r2 = r2 + 1
            goto L_0x0319
        L_0x0344:
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0390
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x0366
        L_0x0350:
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == r0) goto L_0x0361
            if (r2 == 0) goto L_0x0366
            boolean r1 = r2 instanceof android.view.View
            if (r1 != 0) goto L_0x035d
            goto L_0x0366
        L_0x035d:
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            goto L_0x0350
        L_0x0361:
            androidx.viewpager.widget.ViewPager$e r1 = r0.h(r1)
            goto L_0x0367
        L_0x0366:
            r1 = 0
        L_0x0367:
            if (r1 == 0) goto L_0x036f
            int r1 = r1.f3202b
            int r2 = r0.f3182f
            if (r1 == r2) goto L_0x0390
        L_0x036f:
            int r1 = r17.getChildCount()
            if (r4 >= r1) goto L_0x0390
            android.view.View r1 = r0.getChildAt(r4)
            androidx.viewpager.widget.ViewPager$e r2 = r0.h(r1)
            if (r2 == 0) goto L_0x038d
            int r2 = r2.f3202b
            int r3 = r0.f3182f
            if (r2 != r3) goto L_0x038d
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x038d
            goto L_0x0390
        L_0x038d:
            int r4 = r4 + 1
            goto L_0x036f
        L_0x0390:
            return
        L_0x0391:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x039e }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x039e }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x039e }
            goto L_0x03a6
        L_0x039e:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x03a6:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r3 = android.support.v4.media.a.a(r3)
            int r4 = r0.f3172a
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            f2.a r1 = r0.f3180e
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x03e6
        L_0x03e5:
            throw r2
        L_0x03e6:
            goto L_0x03e5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):void");
    }

    public final void r(int i10, int i11, int i12, int i13) {
        if (i11 <= 0 || this.f3174b.isEmpty()) {
            e j10 = j(this.f3182f);
            int min = (int) ((j10 != null ? Math.min(j10.f3205e, this.f3198y) : 0.0f) * ((float) ((i10 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                d(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f3188i.isFinished()) {
            this.f3188i.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))) * ((float) (((i10 - getPaddingLeft()) - getPaddingRight()) + i12))), getScrollY());
        }
    }

    public void removeView(View view) {
        if (this.A) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setAdapter(f2.a aVar) {
        f2.a aVar2 = this.f3180e;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f3180e.d(this);
            for (int i10 = 0; i10 < this.f3174b.size(); i10++) {
                e eVar = this.f3174b.get(i10);
                this.f3180e.a(this, eVar.f3202b, eVar.f3201a);
            }
            this.f3180e.b(this);
            this.f3174b.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((f) getChildAt(i11).getLayoutParams()).f3206a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f3182f = 0;
            scrollTo(0, 0);
        }
        f2.a aVar3 = this.f3180e;
        this.f3180e = aVar;
        this.f3172a = 0;
        if (aVar != null) {
            if (this.f3192s == null) {
                this.f3192s = new j();
            }
            synchronized (this.f3180e) {
            }
            this.C = false;
            boolean z10 = this.f3177c0;
            this.f3177c0 = true;
            this.f3172a = this.f3180e.c();
            if (this.f3184g >= 0) {
                this.f3180e.getClass();
                v(this.f3184g, false, true, 0);
                this.f3184g = -1;
                this.f3186h = null;
            } else if (!z10) {
                q(this.f3182f);
            } else {
                requestLayout();
            }
        }
        List<h> list = this.f3187h0;
        if (list != null && !list.isEmpty()) {
            int size = this.f3187h0.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f3187h0.get(i12).a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.C = false;
        v(i10, !this.f3177c0, false, 0);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to " + 1);
            i10 = 1;
        }
        if (i10 != this.D) {
            this.D = i10;
            q(this.f3182f);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f3185g0 = iVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f3193t;
        this.f3193t = i10;
        int width = getWidth();
        r(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3194u = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f3190j0 != i10) {
            this.f3190j0 = i10;
            i iVar = this.f3185g0;
            if (iVar != null) {
                iVar.b(i10);
            }
            List<i> list = this.f3183f0;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar2 = this.f3183f0.get(i11);
                    if (iVar2 != null) {
                        iVar2.b(i10);
                    }
                }
            }
        }
    }

    public final boolean t() {
        this.N = -1;
        this.E = false;
        this.F = false;
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O = null;
        }
        this.f3173a0.onRelease();
        this.f3175b0.onRelease();
        if (this.f3173a0.isFinished() || this.f3175b0.isFinished()) {
            return true;
        }
        return false;
    }

    public final void u(int i10, boolean z10, int i11, boolean z11) {
        int i12;
        int i13;
        e j10 = j(i10);
        int max = j10 != null ? (int) (Math.max(this.f3197x, Math.min(j10.f3205e, this.f3198y)) * ((float) getClientWidth())) : 0;
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f3188i;
                if (scroller != null && !scroller.isFinished()) {
                    i12 = this.f3191r ? this.f3188i.getCurrX() : this.f3188i.getStartX();
                    this.f3188i.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i12 = getScrollX();
                }
                int i14 = i12;
                int scrollY = getScrollY();
                int i15 = max - i14;
                int i16 = 0 - scrollY;
                if (i15 == 0 && i16 == 0) {
                    d(false);
                    q(this.f3182f);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i17 = clientWidth / 2;
                    float f10 = (float) clientWidth;
                    float f11 = (float) i17;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i15)) * 1.0f) / f10) - 0.5f) * 0.47123894f))) * f11) + f11;
                    int abs = Math.abs(i11);
                    if (abs > 0) {
                        i13 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        this.f3180e.getClass();
                        i13 = (int) (((((float) Math.abs(i15)) / ((f10 * 1.0f) + ((float) this.f3193t))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i13, 600);
                    this.f3191r = false;
                    this.f3188i.startScroll(i14, scrollY, i15, i16, min);
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    c0.d.k(this);
                }
            }
            if (z11) {
                f(i10);
                return;
            }
            return;
        }
        if (z11) {
            f(i10);
        }
        d(false);
        scrollTo(max, 0);
        o(max);
    }

    public void v(int i10, boolean z10, boolean z11, int i11) {
        f2.a aVar = this.f3180e;
        boolean z12 = false;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z11 || this.f3182f != i10 || this.f3174b.size() == 0) {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f3180e.c()) {
                i10 = this.f3180e.c() - 1;
            }
            int i12 = this.D;
            int i13 = this.f3182f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f3174b.size(); i14++) {
                    this.f3174b.get(i14).f3203c = true;
                }
            }
            if (this.f3182f != i10) {
                z12 = true;
            }
            if (this.f3177c0) {
                this.f3182f = i10;
                if (z12) {
                    f(i10);
                }
                requestLayout();
                return;
            }
            q(i10);
            u(i10, z10, i11, z12);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3194u;
    }

    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3206a;

        /* renamed from: b  reason: collision with root package name */
        public int f3207b;

        /* renamed from: c  reason: collision with root package name */
        public float f3208c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3209d;

        /* renamed from: e  reason: collision with root package name */
        public int f3210e;

        public f() {
            super(-1, -1);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3169k0);
            this.f3207b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(d0.a.c(getContext(), i10));
    }
}
