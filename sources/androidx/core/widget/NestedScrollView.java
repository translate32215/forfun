package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.c0;
import o0.m;
import o0.n;
import o0.p;
import o0.r;
import p0.c;
import p0.e;
import s0.d;

public class NestedScrollView extends FrameLayout implements p, m {
    public static final float J = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final a K = new a();
    public static final int[] L = {16843130};
    public final int[] A = new int[2];
    public final int[] B = new int[2];
    public int C;
    public int D;
    public d E;
    public final r F;
    public final n G;
    public float H;
    public c I;

    /* renamed from: a  reason: collision with root package name */
    public final float f1424a;

    /* renamed from: b  reason: collision with root package name */
    public long f1425b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1426c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f1427d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f1428e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f1429f;

    /* renamed from: g  reason: collision with root package name */
    public int f1430g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1431h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1432i = false;

    /* renamed from: r  reason: collision with root package name */
    public View f1433r = null;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1434s = false;

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f1435t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1436u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1437v = true;

    /* renamed from: w  reason: collision with root package name */
    public int f1438w;

    /* renamed from: x  reason: collision with root package name */
    public int f1439x;

    /* renamed from: y  reason: collision with root package name */
    public int f1440y;

    /* renamed from: z  reason: collision with root package name */
    public int f1441z = -1;

    public static class a extends o0.a {
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.f22536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            e.c(accessibilityEvent, nestedScrollView.getScrollX());
            e.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void d(View view, p0.c cVar) {
            int scrollRange;
            this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.f23748a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.f23748a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.a(c.a.f23755i);
                    cVar.a(c.a.f23759m);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.a(c.a.f23754h);
                    cVar.a(c.a.f23761o);
                }
            }
        }

        public boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.B(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f1442a;

        public class a implements Parcelable.Creator<d> {
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public Object[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("HorizontalScrollView.SavedState{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append(" scrollPosition=");
            return v.e.a(a10, this.f1442a, "}");
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1442a);
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f1442a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            edgeEffect = d.b.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1428e = edgeEffect;
        if (i10 >= 31) {
            edgeEffect2 = d.b.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1429f = edgeEffect2;
        this.f1424a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1427d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1438w = viewConfiguration.getScaledTouchSlop();
        this.f1439x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1440y = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.F = new r();
        this.G = new n(this);
        setNestedScrollingEnabled(true);
        c0.C(this, K);
    }

    public static int d(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.H == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.H = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.H;
    }

    public static boolean r(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !r((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public final boolean A(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float a10 = s0.d.a(edgeEffect) * ((float) getHeight());
        double log = Math.log((double) ((((float) Math.abs(-i10)) * 0.35f) / (this.f1424a * 0.015f)));
        double d10 = (double) J;
        Double.isNaN(d10);
        Double.isNaN(d10);
        double d11 = (double) (this.f1424a * 0.015f);
        Double.isNaN(d10);
        Double.isNaN(d10);
        double exp = Math.exp((d10 / (d10 - 1.0d)) * log);
        Double.isNaN(d11);
        Double.isNaN(d11);
        if (((float) (exp * d11)) < a10) {
            return true;
        }
        return false;
    }

    public final void B(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1425b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1427d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
                x(z10);
            } else {
                if (!this.f1427d.isFinished()) {
                    a();
                }
                scrollBy(i10, i11);
            }
            this.f1425b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public boolean C(int i10, int i11) {
        return this.G.j(i10, i11);
    }

    public final boolean D(MotionEvent motionEvent) {
        boolean z10;
        if (s0.d.a(this.f1428e) != 0.0f) {
            s0.d.c(this.f1428e, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z10 = true;
        } else {
            z10 = false;
        }
        if (s0.d.a(this.f1429f) == 0.0f) {
            return z10;
        }
        s0.d.c(this.f1429f, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public void E(int i10) {
        this.G.k(i10);
    }

    public final void a() {
        this.f1427d.abortAnimation();
        this.G.k(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !s(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1426c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1426c);
            g(e(this.f1426c));
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && (!s(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r14 = this;
            android.widget.OverScroller r0 = r14.f1427d
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r14.f1427d
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.f1427d
            int r0 = r0.getCurrY()
            int r1 = r14.D
            int r1 = r0 - r1
            int r2 = r14.getHeight()
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            r5 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x004a
            android.widget.EdgeEffect r6 = r14.f1428e
            float r6 = s0.d.a(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x004a
            int r4 = -r1
            float r4 = (float) r4
            float r4 = r4 * r5
            float r6 = (float) r2
            float r4 = r4 / r6
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r5
            android.widget.EdgeEffect r5 = r14.f1428e
            float r3 = s0.d.c(r5, r4, r3)
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            if (r2 == r1) goto L_0x006f
            android.widget.EdgeEffect r3 = r14.f1428e
            r3.finish()
            goto L_0x006f
        L_0x004a:
            if (r1 >= 0) goto L_0x0070
            android.widget.EdgeEffect r6 = r14.f1429f
            float r6 = s0.d.a(r6)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0070
            float r4 = (float) r1
            float r4 = r4 * r5
            float r2 = (float) r2
            float r4 = r4 / r2
            float r2 = r2 / r5
            android.widget.EdgeEffect r5 = r14.f1429f
            float r3 = s0.d.c(r5, r4, r3)
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            if (r2 == r1) goto L_0x006f
            android.widget.EdgeEffect r3 = r14.f1429f
            r3.finish()
        L_0x006f:
            int r1 = r1 - r2
        L_0x0070:
            r6 = r1
            r14.D = r0
            int[] r3 = r14.B
            r9 = 0
            r10 = 1
            r3[r10] = r9
            r1 = 0
            r4 = 0
            r5 = 1
            r0 = r14
            r2 = r6
            r0.f(r1, r2, r3, r4, r5)
            int[] r0 = r14.B
            r0 = r0[r10]
            int r11 = r6 - r0
            int r12 = r14.getScrollRange()
            if (r11 == 0) goto L_0x00bb
            int r13 = r14.getScrollY()
            r1 = 0
            int r3 = r14.getScrollX()
            r5 = 0
            r7 = 0
            r8 = 0
            r0 = r14
            r2 = r11
            r4 = r13
            r6 = r12
            r0.v(r1, r2, r3, r4, r5, r6, r7, r8)
            int r0 = r14.getScrollY()
            int r3 = r0 - r13
            int r11 = r11 - r3
            int[] r8 = r14.B
            r8[r10] = r9
            r2 = 0
            r4 = 0
            int[] r6 = r14.A
            r7 = 1
            o0.n r1 = r14.G
            r5 = r11
            r1.f(r2, r3, r4, r5, r6, r7, r8)
            int[] r0 = r14.B
            r0 = r0[r10]
            int r11 = r11 - r0
        L_0x00bb:
            if (r11 == 0) goto L_0x00f8
            int r0 = r14.getOverScrollMode()
            if (r0 == 0) goto L_0x00c7
            if (r0 != r10) goto L_0x00c8
            if (r12 <= 0) goto L_0x00c8
        L_0x00c7:
            r9 = 1
        L_0x00c8:
            if (r9 == 0) goto L_0x00f5
            if (r11 >= 0) goto L_0x00e1
            android.widget.EdgeEffect r0 = r14.f1428e
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00f5
            android.widget.EdgeEffect r0 = r14.f1428e
            android.widget.OverScroller r1 = r14.f1427d
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
            goto L_0x00f5
        L_0x00e1:
            android.widget.EdgeEffect r0 = r14.f1429f
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00f5
            android.widget.EdgeEffect r0 = r14.f1429f
            android.widget.OverScroller r1 = r14.f1427d
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
        L_0x00f5:
            r14.a()
        L_0x00f8:
            android.widget.OverScroller r0 = r14.f1427d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0106
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = o0.c0.f22553a
            o0.c0.d.k(r14)
            goto L_0x010b
        L_0x0106:
            o0.n r0 = r14.G
            r0.k(r10)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.G.a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.G.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return f(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.G.e(i10, i11, i12, i13, iArr);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f1428e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 21 || b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (i12 >= 21 && b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f1428e.setSize(width, height);
            if (this.f1428e.draw(canvas)) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                c0.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f1429f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 21 || b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (i13 >= 21 && b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f1429f.setSize(width2, height2);
            if (this.f1429f.draw(canvas)) {
                WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                c0.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public int e(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i12 - verticalFadingEdgeLength : i12;
        int i14 = rect.bottom;
        if (i14 > i13 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i13;
            }
            return Math.min(i11 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        } else if (rect.top >= scrollY || i14 >= i13) {
            return 0;
        } else {
            if (rect.height() > height) {
                i10 = 0 - (i13 - rect.bottom);
            } else {
                i10 = 0 - (scrollY - rect.top);
            }
            return Math.max(i10, -getScrollY());
        }
    }

    public boolean f(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.G.c(i10, i11, iArr, iArr2, i12);
    }

    public final void g(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f1437v) {
            B(0, i10, 250, false);
        } else {
            scrollBy(0, i10);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(View view, View view2, int i10, int i11) {
        r rVar = this.F;
        if (i11 == 1) {
            rVar.f22633b = i10;
        } else {
            rVar.f22632a = i10;
        }
        C(2, i11);
    }

    public boolean hasNestedScrollingParent() {
        return q(0);
    }

    public void i(View view, int i10) {
        r rVar = this.F;
        if (i10 == 1) {
            rVar.f22633b = 0;
        } else {
            rVar.f22632a = 0;
        }
        this.G.k(i10);
    }

    public boolean isNestedScrollingEnabled() {
        return this.G.f22594d;
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        f(i10, i11, iArr, (int[]) null, i12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f1426c
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fc
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ed
            r4 = 20
            if (r0 == r4) goto L_0x00dd
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fc
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 130(0x82, float:1.82E-43)
        L_0x0085:
            if (r5 != r3) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00c1
            android.graphics.Rect r7 = r6.f1426c
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d2
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f1426c
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d2
            int r1 = r1 - r0
            r7.top = r1
            goto L_0x00d2
        L_0x00c1:
            android.graphics.Rect r7 = r6.f1426c
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f1426c
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d2
            r7.top = r2
        L_0x00d2:
            android.graphics.Rect r7 = r6.f1426c
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.y(r5, r1, r0)
            goto L_0x00fc
        L_0x00dd:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e8
            boolean r2 = r6.b(r3)
            goto L_0x00fc
        L_0x00e8:
            boolean r2 = r6.p(r3)
            goto L_0x00fc
        L_0x00ed:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f8
            boolean r2 = r6.b(r5)
            goto L_0x00fc
        L_0x00f8:
            boolean r2 = r6.p(r5)
        L_0x00fc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.k(android.view.KeyEvent):boolean");
    }

    public void l(int i10) {
        if (getChildCount() > 0) {
            this.f1427d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            x(true);
        }
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        t(i13, i14, iArr);
    }

    public void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        t(i13, i14, (int[]) null);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1432i = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00a9
            boolean r0 = r8.f1434s
            if (r0 != 0) goto L_0x00a9
            r0 = 2
            boolean r0 = q.h.e(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = q.h.e(r9, r0)
            if (r0 == 0) goto L_0x002b
            r0 = 26
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x0070
            boolean r2 = r8.c()
            if (r2 == 0) goto L_0x0056
            boolean r9 = q.h.e(r9, r5)
            if (r9 != 0) goto L_0x0056
            r9 = 1
            goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            if (r9 == 0) goto L_0x009d
            android.widget.EdgeEffect r9 = r8.f1428e
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            s0.d.c(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f1428e
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L_0x009e
        L_0x0070:
            if (r0 <= r2) goto L_0x009c
            boolean r7 = r8.c()
            if (r7 == 0) goto L_0x0080
            boolean r9 = q.h.e(r9, r5)
            if (r9 != 0) goto L_0x0080
            r9 = 1
            goto L_0x0081
        L_0x0080:
            r9 = 0
        L_0x0081:
            if (r9 == 0) goto L_0x0099
            android.widget.EdgeEffect r9 = r8.f1429f
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            s0.d.c(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f1429f
            r9.onRelease()
            r8.invalidate()
            r1 = 1
        L_0x0099:
            r9 = r1
            r1 = r2
            goto L_0x009e
        L_0x009c:
            r1 = r0
        L_0x009d:
            r9 = 0
        L_0x009e:
            if (r1 == r3) goto L_0x00a8
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00a8:
            return r9
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r11.f1434s
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00af
            r4 = -1
            if (r0 == r1) goto L_0x0085
            if (r0 == r2) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0131
        L_0x001f:
            r11.u(r12)
            goto L_0x0131
        L_0x0024:
            int r0 = r11.f1441z
            if (r0 != r4) goto L_0x002a
            goto L_0x0131
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0131
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f1430g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f1438w
            if (r4 <= r5) goto L_0x0131
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto L_0x0131
            r11.f1434s = r1
            r11.f1430g = r0
            android.view.VelocityTracker r0 = r11.f1435t
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f1435t = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.f1435t
            r0.addMovement(r12)
            r11.C = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0131
            r12.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0131
        L_0x0085:
            r11.f1434s = r3
            r11.f1441z = r4
            r11.w()
            android.widget.OverScroller r4 = r11.f1427d
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a8
            java.util.WeakHashMap<android.view.View, java.lang.String> r12 = o0.c0.f22553a
            o0.c0.d.k(r11)
        L_0x00a8:
            o0.n r12 = r11.G
            r12.k(r3)
            goto L_0x0131
        L_0x00af:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00e3
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00e3
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00e3
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00e3
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00e3
            r4 = 1
            goto L_0x00e4
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            if (r4 != 0) goto L_0x00fc
            boolean r12 = r11.D(r12)
            if (r12 != 0) goto L_0x00f6
            android.widget.OverScroller r12 = r11.f1427d
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            r11.f1434s = r1
            r11.w()
            goto L_0x0131
        L_0x00fc:
            r11.f1430g = r0
            int r0 = r12.getPointerId(r3)
            r11.f1441z = r0
            android.view.VelocityTracker r0 = r11.f1435t
            if (r0 != 0) goto L_0x010f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f1435t = r0
            goto L_0x0112
        L_0x010f:
            r0.clear()
        L_0x0112:
            android.view.VelocityTracker r0 = r11.f1435t
            r0.addMovement(r12)
            android.widget.OverScroller r0 = r11.f1427d
            r0.computeScrollOffset()
            boolean r12 = r11.D(r12)
            if (r12 != 0) goto L_0x012c
            android.widget.OverScroller r12 = r11.f1427d
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r1 = 0
        L_0x012c:
            r11.f1434s = r1
            r11.C(r2, r3)
        L_0x0131:
            boolean r12 = r11.f1434s
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f1431h = false;
        View view = this.f1433r;
        if (view != null && r(view, this)) {
            z(this.f1433r);
        }
        this.f1433r = null;
        if (!this.f1432i) {
            if (this.E != null) {
                scrollTo(getScrollX(), this.E.f1442a);
                this.E = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d10 = d(scrollY, paddingTop, i14);
            if (d10 != scrollY) {
                scrollTo(getScrollX(), d10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1432i = true;
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1436u && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        l((int) f11);
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        f(i10, i11, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        t(i13, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.F.f22632a = i10;
        C(2, 0);
    }

    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View view;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i10);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (view != null && !(true ^ s(view, 0, getHeight()))) {
            return view.requestFocus(i10, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.E = dVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1442a = getScrollY();
        return dVar;
    }

    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.I;
        if (cVar != null) {
            f.c cVar2 = (f.c) cVar;
            AlertController.c(this, cVar2.f17858a, cVar2.f17859b);
        }
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && s(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f1426c);
            offsetDescendantRectToMyCoords(findFocus, this.f1426c);
            g(e(this.f1426c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (i10 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.F.f22632a = 0;
        E(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            r30 = this;
            r9 = r30
            r10 = r31
            android.view.VelocityTracker r0 = r9.f1435t
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f1435t = r0
        L_0x000e:
            int r0 = r31.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r9.C = r11
        L_0x0017:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r31)
            int r1 = r9.C
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L_0x02f9
            r3 = -1
            if (r0 == r13) goto L_0x025d
            if (r0 == r1) goto L_0x009c
            r1 = 3
            if (r0 == r1) goto L_0x005b
            r1 = 5
            if (r0 == r1) goto L_0x0048
            r1 = 6
            if (r0 == r1) goto L_0x0036
            goto L_0x0328
        L_0x0036:
            r30.u(r31)
            int r0 = r9.f1441z
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.f1430g = r0
            goto L_0x0328
        L_0x0048:
            int r0 = r31.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.f1430g = r1
            int r0 = r10.getPointerId(r0)
            r9.f1441z = r0
            goto L_0x0328
        L_0x005b:
            boolean r0 = r9.f1434s
            if (r0 == 0) goto L_0x0084
            int r0 = r30.getChildCount()
            if (r0 <= 0) goto L_0x0084
            android.widget.OverScroller r14 = r9.f1427d
            int r15 = r30.getScrollX()
            int r16 = r30.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r30.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x0084
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = o0.c0.f22553a
            o0.c0.d.k(r30)
        L_0x0084:
            r9.f1441z = r3
            r9.f1434s = r11
            r30.w()
            o0.n r0 = r9.G
            r0.k(r11)
            android.widget.EdgeEffect r0 = r9.f1428e
            r0.onRelease()
            android.widget.EdgeEffect r0 = r9.f1429f
            r0.onRelease()
            goto L_0x0328
        L_0x009c:
            int r0 = r9.f1441z
            int r14 = r10.findPointerIndex(r0)
            if (r14 != r3) goto L_0x00bf
            java.lang.String r0 = "Invalid pointerId="
            java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
            int r1 = r9.f1441z
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0328
        L_0x00bf:
            float r0 = r10.getY(r14)
            int r6 = (int) r0
            int r0 = r9.f1430g
            int r0 = r0 - r6
            float r1 = r10.getX(r14)
            int r3 = r30.getWidth()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r3 = (float) r0
            int r4 = r30.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            android.widget.EdgeEffect r4 = r9.f1428e
            float r4 = s0.d.a(r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00fd
            android.widget.EdgeEffect r4 = r9.f1428e
            float r3 = -r3
            float r1 = s0.d.c(r4, r3, r1)
            float r1 = -r1
            android.widget.EdgeEffect r3 = r9.f1428e
            float r3 = s0.d.a(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00fb
            android.widget.EdgeEffect r2 = r9.f1428e
            r2.onRelease()
        L_0x00fb:
            r2 = r1
            goto L_0x011e
        L_0x00fd:
            android.widget.EdgeEffect r4 = r9.f1429f
            float r4 = s0.d.a(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x011e
            android.widget.EdgeEffect r4 = r9.f1429f
            float r5 = r5 - r1
            float r1 = s0.d.c(r4, r3, r5)
            android.widget.EdgeEffect r3 = r9.f1429f
            float r3 = s0.d.a(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00fb
            android.widget.EdgeEffect r2 = r9.f1429f
            r2.onRelease()
            goto L_0x00fb
        L_0x011e:
            int r1 = r30.getHeight()
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            if (r1 == 0) goto L_0x012e
            r30.invalidate()
        L_0x012e:
            int r0 = r0 - r1
            boolean r1 = r9.f1434s
            if (r1 != 0) goto L_0x014f
            int r1 = java.lang.Math.abs(r0)
            int r2 = r9.f1438w
            if (r1 <= r2) goto L_0x014f
            android.view.ViewParent r1 = r30.getParent()
            if (r1 == 0) goto L_0x0144
            r1.requestDisallowInterceptTouchEvent(r13)
        L_0x0144:
            r9.f1434s = r13
            if (r0 <= 0) goto L_0x014c
            int r1 = r9.f1438w
            int r0 = r0 - r1
            goto L_0x014f
        L_0x014c:
            int r1 = r9.f1438w
            int r0 = r0 + r1
        L_0x014f:
            r7 = r0
            boolean r0 = r9.f1434s
            if (r0 == 0) goto L_0x0328
            r1 = 0
            int[] r3 = r9.B
            int[] r4 = r9.A
            r5 = 0
            r0 = r30
            r2 = r7
            boolean r0 = r0.f(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0171
            int[] r0 = r9.B
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.C
            int[] r1 = r9.A
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.C = r0
        L_0x0171:
            r15 = r7
            int[] r0 = r9.A
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.f1430g = r6
            int r16 = r30.getScrollY()
            int r8 = r30.getScrollRange()
            int r0 = r30.getOverScrollMode()
            if (r0 == 0) goto L_0x0190
            if (r0 != r13) goto L_0x018c
            if (r8 <= 0) goto L_0x018c
            goto L_0x0190
        L_0x018c:
            r0 = 0
            r17 = 0
            goto L_0x0193
        L_0x0190:
            r0 = 1
            r17 = 1
        L_0x0193:
            r1 = 0
            r3 = 0
            int r4 = r30.getScrollY()
            r5 = 0
            r7 = 0
            r18 = 0
            r0 = r30
            r2 = r15
            r6 = r8
            r21 = r8
            r8 = r18
            boolean r0 = r0.v(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x01b3
            boolean r0 = r9.q(r11)
            if (r0 != 0) goto L_0x01b3
            r0 = 1
            goto L_0x01b4
        L_0x01b3:
            r0 = 0
        L_0x01b4:
            int r1 = r30.getScrollY()
            int r24 = r1 - r16
            int r26 = r15 - r24
            int[] r1 = r9.B
            r1[r13] = r11
            r23 = 0
            r25 = 0
            int[] r2 = r9.A
            r28 = 0
            o0.n r3 = r9.G
            r22 = r3
            r27 = r2
            r29 = r1
            r22.f(r23, r24, r25, r26, r27, r28, r29)
            int r1 = r9.f1430g
            int[] r2 = r9.A
            r3 = r2[r13]
            int r1 = r1 - r3
            r9.f1430g = r1
            int r1 = r9.C
            r2 = r2[r13]
            int r1 = r1 + r2
            r9.C = r1
            if (r17 == 0) goto L_0x0253
            int[] r1 = r9.B
            r1 = r1[r13]
            int r15 = r15 - r1
            int r1 = r16 + r15
            if (r1 >= 0) goto L_0x0213
            android.widget.EdgeEffect r1 = r9.f1428e
            int r2 = -r15
            float r2 = (float) r2
            int r3 = r30.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = r10.getX(r14)
            int r4 = r30.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            s0.d.c(r1, r2, r3)
            android.widget.EdgeEffect r1 = r9.f1429f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x023d
            android.widget.EdgeEffect r1 = r9.f1429f
            r1.onRelease()
            goto L_0x023d
        L_0x0213:
            r2 = r21
            if (r1 <= r2) goto L_0x023d
            android.widget.EdgeEffect r1 = r9.f1429f
            float r2 = (float) r15
            int r3 = r30.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = r10.getX(r14)
            int r4 = r30.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            s0.d.c(r1, r2, r4)
            android.widget.EdgeEffect r1 = r9.f1428e
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x023d
            android.widget.EdgeEffect r1 = r9.f1428e
            r1.onRelease()
        L_0x023d:
            android.widget.EdgeEffect r1 = r9.f1428e
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x024d
            android.widget.EdgeEffect r1 = r9.f1429f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0253
        L_0x024d:
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = o0.c0.f22553a
            o0.c0.d.k(r30)
            goto L_0x0254
        L_0x0253:
            r11 = r0
        L_0x0254:
            if (r11 == 0) goto L_0x0328
            android.view.VelocityTracker r0 = r9.f1435t
            r0.clear()
            goto L_0x0328
        L_0x025d:
            android.view.VelocityTracker r0 = r9.f1435t
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.f1440y
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.f1441z
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.f1439x
            if (r1 < r4) goto L_0x02c3
            android.widget.EdgeEffect r1 = r9.f1428e
            float r1 = s0.d.a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0293
            android.widget.EdgeEffect r1 = r9.f1428e
            boolean r1 = r9.A(r1, r0)
            if (r1 == 0) goto L_0x028e
            android.widget.EdgeEffect r1 = r9.f1428e
            r1.onAbsorb(r0)
            goto L_0x02af
        L_0x028e:
            int r1 = -r0
            r9.l(r1)
            goto L_0x02af
        L_0x0293:
            android.widget.EdgeEffect r1 = r9.f1429f
            float r1 = s0.d.a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02b1
            android.widget.EdgeEffect r1 = r9.f1429f
            int r4 = -r0
            boolean r1 = r9.A(r1, r4)
            if (r1 == 0) goto L_0x02ac
            android.widget.EdgeEffect r1 = r9.f1429f
            r1.onAbsorb(r4)
            goto L_0x02af
        L_0x02ac:
            r9.l(r4)
        L_0x02af:
            r1 = 1
            goto L_0x02b2
        L_0x02b1:
            r1 = 0
        L_0x02b2:
            if (r1 != 0) goto L_0x02e2
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x02e2
            r9.dispatchNestedFling(r2, r1, r13)
            r9.l(r0)
            goto L_0x02e2
        L_0x02c3:
            android.widget.OverScroller r14 = r9.f1427d
            int r15 = r30.getScrollX()
            int r16 = r30.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r30.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x02e2
            java.util.WeakHashMap<android.view.View, java.lang.String> r0 = o0.c0.f22553a
            o0.c0.d.k(r30)
        L_0x02e2:
            r9.f1441z = r3
            r9.f1434s = r11
            r30.w()
            o0.n r0 = r9.G
            r0.k(r11)
            android.widget.EdgeEffect r0 = r9.f1428e
            r0.onRelease()
            android.widget.EdgeEffect r0 = r9.f1429f
            r0.onRelease()
            goto L_0x0328
        L_0x02f9:
            int r0 = r30.getChildCount()
            if (r0 != 0) goto L_0x0300
            return r11
        L_0x0300:
            boolean r0 = r9.f1434s
            if (r0 == 0) goto L_0x030d
            android.view.ViewParent r0 = r30.getParent()
            if (r0 == 0) goto L_0x030d
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x030d:
            android.widget.OverScroller r0 = r9.f1427d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0318
            r30.a()
        L_0x0318:
            float r0 = r31.getY()
            int r0 = (int) r0
            r9.f1430g = r0
            int r0 = r10.getPointerId(r11)
            r9.f1441z = r0
            r9.C(r1, r11)
        L_0x0328:
            android.view.VelocityTracker r0 = r9.f1435t
            if (r0 == 0) goto L_0x032f
            r0.addMovement(r12)
        L_0x032f:
            r12.recycle()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1426c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1426c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1426c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1426c;
        return y(i10, rect3.top, rect3.bottom);
    }

    public boolean q(int i10) {
        return this.G.g(i10) != null;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1431h) {
            z(view2);
        } else {
            this.f1433r = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int e10 = e(rect);
        boolean z11 = e10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, e10);
            } else {
                B(0, e10, 250, false);
            }
        }
        return z11;
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            w();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        this.f1431h = true;
        super.requestLayout();
    }

    public final boolean s(View view, int i10, int i11) {
        view.getDrawingRect(this.f1426c);
        offsetDescendantRectToMyCoords(view, this.f1426c);
        return this.f1426c.bottom + i10 >= getScrollY() && this.f1426c.top - i10 <= getScrollY() + i11;
    }

    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d10 = d(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d11 = d(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d10 != getScrollX() || d11 != getScrollY()) {
                super.scrollTo(d10, d11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1436u) {
            this.f1436u = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        this.G.i(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.I = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1437v = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i10) {
        return this.G.j(i10, 0);
    }

    public void stopNestedScroll() {
        this.G.k(0);
    }

    public final void t(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.G.d(0, scrollY2, 0, i10 - scrollY2, (int[]) null, i11, iArr);
    }

    public final void u(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1441z) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1430g = (int) motionEvent.getY(i10);
            this.f1441z = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1435t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean v(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.q(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f1427d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.v(int, int, int, int, int, int, int, int):boolean");
    }

    public final void w() {
        VelocityTracker velocityTracker = this.f1435t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1435t = null;
        }
    }

    public final void x(boolean z10) {
        if (z10) {
            C(2, 1);
        } else {
            this.G.k(1);
        }
        this.D = getScrollY();
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.k(this);
    }

    public final boolean y(int i10, int i11, int i12) {
        boolean z10;
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        int height = getHeight();
        int scrollY = getScrollY();
        int i16 = height + scrollY;
        boolean z11 = i13 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i17 = 0; i17 < size; i17++) {
            View view2 = (View) focusables.get(i17);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i14 < bottom && top < i15) {
                boolean z13 = i14 < top && bottom < i15;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (!z14) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i14 < scrollY || i15 > i16) {
            g(z11 ? i14 - scrollY : i15 - i16);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i13);
        }
        return z10;
    }

    public final void z(View view) {
        view.getDrawingRect(this.f1426c);
        offsetDescendantRectToMyCoords(view, this.f1426c);
        int e10 = e(this.f1426c);
        if (e10 != 0) {
            scrollBy(0, e10);
        }
    }

    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
