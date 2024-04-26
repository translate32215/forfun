package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.startapp.startappsdk.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o0.c0;
import o0.o;
import o0.o0;
import o0.p;
import o0.r;
import o0.s;

public class CoordinatorLayout extends ViewGroup implements o, p {
    public static final String B;
    public static final Class<?>[] C = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<c>>> D = new ThreadLocal<>();
    public static final Comparator<View> E;
    public static final n0.d<Rect> F = new n0.e(12);
    public final r A = new r();

    /* renamed from: a  reason: collision with root package name */
    public final List<View> f1333a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final p.g f1334b = new p.g(1);

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f1335c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<View> f1336d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1337e = new int[2];

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1338f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1339g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1340h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f1341i;

    /* renamed from: r  reason: collision with root package name */
    public View f1342r;

    /* renamed from: s  reason: collision with root package name */
    public View f1343s;

    /* renamed from: t  reason: collision with root package name */
    public g f1344t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1345u;

    /* renamed from: v  reason: collision with root package name */
    public o0 f1346v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1347w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f1348x;

    /* renamed from: y  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1349y;

    /* renamed from: z  reason: collision with root package name */
    public s f1350z;

    public class a implements s {
        public a() {
        }

        public o0 a(View view, o0 o0Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!n0.b.a(coordinatorLayout.f1346v, o0Var)) {
                coordinatorLayout.f1346v = o0Var;
                boolean z10 = true;
                boolean z11 = o0Var.f() > 0;
                coordinatorLayout.f1347w = z11;
                if (z11 || coordinatorLayout.getBackground() != null) {
                    z10 = false;
                }
                coordinatorLayout.setWillNotDraw(z10);
                if (!o0Var.h()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, String> weakHashMap = c0.f22553a;
                        if (c0.d.b(childAt) && ((f) childAt.getLayoutParams()).f1353a != null && o0Var.h()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return o0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        }

        public void l(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void n(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }

        public Parcelable o(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1349y;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1349y;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class i implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            View view = (View) obj;
            View view2 = (View) obj2;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            int i10 = Build.VERSION.SDK_INT;
            float f10 = 0.0f;
            float m10 = i10 >= 21 ? c0.i.m(view) : 0.0f;
            if (i10 >= 21) {
                f10 = c0.i.m(view2);
            }
            if (m10 > f10) {
                return -1;
            }
            return m10 < f10 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            B = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            E = r0
            goto L_0x0021
        L_0x001f:
            E = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            C = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            D = r0
            n0.e r0 = new n0.e
            r1 = 12
            r0.<init>(r1)
            F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = z.a.f28180a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1341i = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.f1341i.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.f1341i;
                iArr2[i10] = (int) (((float) iArr2[i10]) * f10);
            }
        }
        this.f1348x = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (c0.d.c(this) == 0) {
            c0.I(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) ((n0.e) F).b();
        return rect == null ? new Rect() : rect;
    }

    public final void b(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - fVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public void c(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public List<View> d(View view) {
        p.g gVar = this.f1334b;
        int i10 = ((s.i) gVar.f23741b).f24851c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((s.i) gVar.f23741b).l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((s.i) gVar.f23741b).h(i11));
            }
        }
        this.f1336d.clear();
        if (arrayList != null) {
            this.f1336d.addAll(arrayList);
        }
        return this.f1336d;
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        c cVar = ((f) view.getLayoutParams()).f1353a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1348x;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public List<View> e(View view) {
        List list = (List) ((s.i) this.f1334b.f23741b).getOrDefault(view, null);
        this.f1336d.clear();
        if (list != null) {
            this.f1336d.addAll(list);
        }
        return this.f1336d;
    }

    public void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = a0.a.f2a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = a0.a.f2a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        a0.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = a0.a.f3b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void g(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int i13;
        int i14;
        int i15 = fVar.f1355c;
        if (i15 == 0) {
            i15 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, i10);
        int i16 = fVar.f1356d;
        if ((i16 & 7) == 0) {
            i16 |= 8388611;
        }
        if ((i16 & 112) == 0) {
            i16 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i16, i10);
        int i17 = absoluteGravity & 7;
        int i18 = absoluteGravity & 112;
        int i19 = absoluteGravity2 & 7;
        int i20 = absoluteGravity2 & 112;
        if (i19 == 1) {
            i13 = rect.left + (rect.width() / 2);
        } else if (i19 != 5) {
            i13 = rect.left;
        } else {
            i13 = rect.right;
        }
        if (i20 == 16) {
            i14 = rect.top + (rect.height() / 2);
        } else if (i20 != 80) {
            i14 = rect.top;
        } else {
            i14 = rect.bottom;
        }
        if (i17 == 1) {
            i13 -= i11 / 2;
        } else if (i17 != 5) {
            i13 -= i11;
        }
        if (i18 == 16) {
            i14 -= i12 / 2;
        } else if (i18 != 80) {
            i14 -= i12;
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f1333a);
    }

    public final o0 getLastWindowInsets() {
        return this.f1346v;
    }

    public int getNestedScrollAxes() {
        return this.A.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1348x;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void h(View view, View view2, int i10, int i11) {
        r rVar = this.A;
        if (i11 == 1) {
            rVar.f22633b = i10;
        } else {
            rVar.f22632a = i10;
        }
        this.f1343s = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            boolean a10 = ((f) getChildAt(i12).getLayoutParams()).a(i11);
        }
    }

    public void i(View view, int i10) {
        r rVar = this.A;
        if (i10 == 1) {
            rVar.f22633b = 0;
        } else {
            rVar.f22632a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f1353a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                fVar.c(i10, false);
                fVar.f1368p = false;
            }
        }
        this.f1343s = null;
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int i13;
        int i14;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f1353a) != null) {
                    int[] iArr2 = this.f1337e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1337e;
                    if (i10 > 0) {
                        i13 = Math.max(i15, iArr3[0]);
                    } else {
                        i13 = Math.min(i15, iArr3[0]);
                    }
                    i15 = i13;
                    int[] iArr4 = this.f1337e;
                    if (i11 > 0) {
                        i14 = Math.max(i16, iArr4[1]);
                    } else {
                        i14 = Math.min(i16, iArr4[1]);
                    }
                    i16 = i14;
                    z10 = true;
                }
            }
        }
        iArr[0] = i15;
        iArr[1] = i16;
        if (z10) {
            q(1);
        }
    }

    public final int k(int i10) {
        int[] iArr = this.f1341i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    public f l(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1354b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.f1354b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        StringBuilder a10 = android.support.v4.media.a.a("Default behavior class ");
                        a10.append(dVar.value().getName());
                        a10.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", a10.toString(), e10);
                    }
                }
                fVar.f1354b = true;
            }
        }
        return fVar;
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int i15;
        int i16;
        int childCount = getChildCount();
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f1353a) != null) {
                    int[] iArr2 = this.f1337e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f1337e;
                    if (i12 > 0) {
                        i15 = Math.max(i17, iArr3[0]);
                    } else {
                        i15 = Math.min(i17, iArr3[0]);
                    }
                    i17 = i15;
                    if (i13 > 0) {
                        i16 = Math.max(i18, this.f1337e[1]);
                    } else {
                        i16 = Math.min(i18, this.f1337e[1]);
                    }
                    i18 = i16;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i17;
        iArr[1] = iArr[1] + i18;
        if (z10) {
            q(1);
        }
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f1338f);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1353a;
                if (cVar != null) {
                    boolean p10 = cVar.p(this, childAt, view, view2, i10, i11);
                    z10 |= p10;
                    fVar.c(i12, p10);
                } else {
                    fVar.c(i12, false);
                }
            }
        }
        return z10;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f1345u) {
            if (this.f1344t == null) {
                this.f1344t = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1344t);
        }
        if (this.f1346v == null) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (c0.d.b(this)) {
                c0.A(this);
            }
        }
        this.f1340h = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f1345u && this.f1344t != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1344t);
        }
        View view = this.f1343s;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1340h = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1347w && this.f1348x != null) {
            o0 o0Var = this.f1346v;
            int f10 = o0Var != null ? o0Var.f() : 0;
            if (f10 > 0) {
                this.f1348x.setBounds(0, 0, getWidth(), f10);
                this.f1348x.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t10 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t10;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int d10 = c0.e.d(this);
        int size = this.f1333a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f1333a.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1353a) == null || !cVar.h(this, view, d10))) {
                r(view, d10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0184, code lost:
        if (r0.i(r30, r20, r8, r21, r23, 0) == false) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.u()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003c
            android.view.View r3 = r7.getChildAt(r1)
            p.g r4 = r7.f1334b
            java.lang.Object r5 = r4.f23741b
            s.i r5 = (s.i) r5
            int r5 = r5.f24851c
            r6 = 0
        L_0x001b:
            if (r6 >= r5) goto L_0x0034
            java.lang.Object r9 = r4.f23741b
            s.i r9 = (s.i) r9
            java.lang.Object r9 = r9.l(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0031
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x0031
            r3 = 1
            goto L_0x0035
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r7.f1345u
            if (r0 == r1) goto L_0x0071
            if (r0 == 0) goto L_0x005e
            boolean r0 = r7.f1340h
            if (r0 == 0) goto L_0x005b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f1344t
            if (r0 != 0) goto L_0x0052
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r7.f1344t = r0
        L_0x0052:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f1344t
            r0.addOnPreDrawListener(r1)
        L_0x005b:
            r7.f1345u = r2
            goto L_0x0071
        L_0x005e:
            boolean r0 = r7.f1340h
            if (r0 == 0) goto L_0x006f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f1344t
            if (r0 == 0) goto L_0x006f
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f1344t
            r0.removeOnPreDrawListener(r1)
        L_0x006f:
            r7.f1345u = r8
        L_0x0071:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, java.lang.String> r3 = o0.c0.f22553a
            int r11 = o0.c0.e.d(r30)
            if (r11 != r2) goto L_0x008b
            r12 = 1
            goto L_0x008c
        L_0x008b:
            r12 = 0
        L_0x008c:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            o0.o0 r3 = r7.f1346v
            if (r3 == 0) goto L_0x00b5
            boolean r3 = o0.c0.d.b(r30)
            if (r3 == 0) goto L_0x00b5
            r19 = 1
            goto L_0x00b7
        L_0x00b5:
            r19 = 0
        L_0x00b7:
            java.util.List<android.view.View> r2 = r7.f1333a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x00c1:
            if (r3 >= r6) goto L_0x01da
            java.util.List<android.view.View> r0 = r7.f1333a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00dd
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01d1
        L_0x00dd:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f1357e
            if (r0 < 0) goto L_0x0127
            if (r13 == 0) goto L_0x0127
            int r0 = r7.k(r0)
            int r8 = r1.f1355c
            if (r8 != 0) goto L_0x00f5
            r8 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f5:
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x0102
            if (r12 == 0) goto L_0x0107
        L_0x0102:
            r2 = 5
            if (r8 != r2) goto L_0x0113
            if (r12 == 0) goto L_0x0113
        L_0x0107:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L_0x012b
        L_0x0113:
            if (r8 != r2) goto L_0x0117
            if (r12 == 0) goto L_0x011c
        L_0x0117:
            r2 = 3
            if (r8 != r2) goto L_0x0125
            if (r12 == 0) goto L_0x0125
        L_0x011c:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x012b
        L_0x0125:
            r8 = 0
            goto L_0x0129
        L_0x0127:
            r22 = r2
        L_0x0129:
            r21 = 0
        L_0x012b:
            if (r19 == 0) goto L_0x015d
            boolean r0 = o0.c0.d.b(r20)
            if (r0 != 0) goto L_0x015d
            o0.o0 r0 = r7.f1346v
            int r0 = r0.d()
            o0.o0 r2 = r7.f1346v
            int r2 = r2.e()
            int r2 = r2 + r0
            o0.o0 r0 = r7.f1346v
            int r0 = r0.f()
            o0.o0 r8 = r7.f1346v
            int r8 = r8.c()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x0161
        L_0x015d:
            r8 = r31
            r23 = r32
        L_0x0161:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1353a
            if (r0 == 0) goto L_0x0187
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.i(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x01a1
            goto L_0x0194
        L_0x0187:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x0194:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01a1:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01d1:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00c1
        L_0x01da:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f1353a;
                }
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1353a) != null) {
                    z10 |= cVar.j(this, childAt, view, f10, f11);
                }
            }
        }
        return z10;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f1338f);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f25915a);
        SparseArray<Parcelable> sparseArray = hVar.f1371c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = l(childAt).f1353a;
            if (!(id2 == -1 || cVar == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                cVar.n(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable o10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1353a;
            if (!(id2 == -1 || cVar == null || (o10 = cVar.o(this, childAt)) == null)) {
                sparseArray.append(id2, o10);
            }
        }
        hVar.f1371c = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1342r
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1342r
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1353a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f1342r
            boolean r6 = r6.r(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.f1342r
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(View view, int i10, int i11) {
        Rect a10 = a();
        f(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            a10.setEmpty();
            ((n0.e) F).a(a10);
        }
    }

    public final void q(int i10) {
        int i11;
        Rect rect;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        Rect rect2;
        int i19;
        int i20;
        int i21;
        f fVar;
        c cVar;
        int i22 = i10;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int d10 = c0.e.d(this);
        int size = this.f1333a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        int i23 = 0;
        while (i23 < size) {
            View view = this.f1333a.get(i23);
            f fVar2 = (f) view.getLayoutParams();
            if (i22 == 0 && view.getVisibility() == 8) {
                i12 = size;
                rect = a12;
                i11 = i23;
            } else {
                int i24 = 0;
                while (i24 < i23) {
                    if (fVar2.f1364l == this.f1333a.get(i24)) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.f1363k != null) {
                            Rect a13 = a();
                            Rect a14 = a();
                            Rect a15 = a();
                            f(fVar3.f1363k, a13);
                            c(view, false, a14);
                            int measuredWidth = view.getMeasuredWidth();
                            i21 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            int i25 = measuredWidth;
                            Rect rect3 = a15;
                            i20 = i23;
                            Rect rect4 = a14;
                            Rect rect5 = a13;
                            f fVar4 = fVar3;
                            i19 = i24;
                            rect2 = a12;
                            fVar = fVar2;
                            g(d10, a13, rect3, fVar3, i25, measuredHeight);
                            Rect rect6 = rect3;
                            boolean z13 = (rect6.left == rect4.left && rect6.top == rect4.top) ? false : true;
                            f fVar5 = fVar4;
                            b(fVar5, rect6, i25, measuredHeight);
                            int i26 = rect6.left - rect4.left;
                            int i27 = rect6.top - rect4.top;
                            if (i26 != 0) {
                                c0.t(view, i26);
                            }
                            if (i27 != 0) {
                                c0.u(view, i27);
                            }
                            if (z13 && (cVar = fVar5.f1353a) != null) {
                                cVar.d(this, view, fVar5.f1363k);
                            }
                            rect5.setEmpty();
                            n0.e eVar = (n0.e) F;
                            eVar.a(rect5);
                            rect4.setEmpty();
                            eVar.a(rect4);
                            rect6.setEmpty();
                            eVar.a(rect6);
                            i24 = i19 + 1;
                            fVar2 = fVar;
                            size = i21;
                            i23 = i20;
                            a12 = rect2;
                        }
                    }
                    i19 = i24;
                    i21 = size;
                    rect2 = a12;
                    i20 = i23;
                    fVar = fVar2;
                    i24 = i19 + 1;
                    fVar2 = fVar;
                    size = i21;
                    i23 = i20;
                    a12 = rect2;
                }
                int i28 = size;
                Rect rect7 = a12;
                i11 = i23;
                f fVar6 = fVar2;
                c(view, true, a11);
                if (fVar6.f1359g != 0 && !a11.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar6.f1359g, d10);
                    int i29 = absoluteGravity & 112;
                    if (i29 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i29 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i30 = absoluteGravity & 7;
                    if (i30 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i30 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar6.f1360h != 0 && view.getVisibility() == 0 && c0.r(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    f fVar7 = (f) view.getLayoutParams();
                    c cVar2 = fVar7.f1353a;
                    Rect a16 = a();
                    Rect a17 = a();
                    a17.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (cVar2 == null || !cVar2.a(this, view, a16)) {
                        a16.set(a17);
                    } else if (!a17.contains(a16)) {
                        StringBuilder a18 = android.support.v4.media.a.a("Rect should be within the child's bounds. Rect:");
                        a18.append(a16.toShortString());
                        a18.append(" | Bounds:");
                        a18.append(a17.toShortString());
                        throw new IllegalArgumentException(a18.toString());
                    }
                    a17.setEmpty();
                    n0.e eVar2 = (n0.e) F;
                    eVar2.a(a17);
                    if (a16.isEmpty()) {
                        a16.setEmpty();
                        eVar2.a(a16);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar7.f1360h, d10);
                        if ((absoluteGravity2 & 48) != 48 || (i17 = (a16.top - fVar7.topMargin) - fVar7.f1362j) >= (i18 = a10.top)) {
                            z11 = false;
                        } else {
                            x(view, i18 - i17);
                            z11 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a16.bottom) - fVar7.bottomMargin) + fVar7.f1362j) < (i16 = a10.bottom)) {
                            x(view, height - i16);
                            z11 = true;
                        }
                        if (!z11) {
                            x(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i14 = (a16.left - fVar7.leftMargin) - fVar7.f1361i) >= (i15 = a10.left)) {
                            z12 = false;
                        } else {
                            w(view, i15 - i14);
                            z12 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a16.right) - fVar7.rightMargin) + fVar7.f1361i) < (i13 = a10.right)) {
                            w(view, width - i13);
                            z12 = true;
                        }
                        if (!z12) {
                            w(view, 0);
                        }
                        a16.setEmpty();
                        eVar2.a(a16);
                    }
                }
                if (i22 != 2) {
                    rect = rect7;
                    rect.set(((f) view.getLayoutParams()).f1369q);
                    if (rect.equals(a11)) {
                        i12 = i28;
                    } else {
                        ((f) view.getLayoutParams()).f1369q.set(a11);
                    }
                } else {
                    rect = rect7;
                }
                i12 = i28;
                for (int i31 = i11 + 1; i31 < i12; i31++) {
                    View view2 = this.f1333a.get(i31);
                    f fVar8 = (f) view2.getLayoutParams();
                    c cVar3 = fVar8.f1353a;
                    if (cVar3 != null && cVar3.b(this, view2, view)) {
                        if (i22 != 0 || !fVar8.f1368p) {
                            if (i22 != 2) {
                                z10 = cVar3.d(this, view2, view);
                            } else {
                                cVar3.e(this, view2, view);
                                z10 = true;
                            }
                            if (i22 == 1) {
                                fVar8.f1368p = z10;
                            }
                        } else {
                            fVar8.f1368p = false;
                        }
                    }
                }
            }
            i23 = i11 + 1;
            size = i12;
            a12 = rect;
        }
        Rect rect8 = a12;
        a10.setEmpty();
        n0.e eVar3 = (n0.e) F;
        eVar3.a(a10);
        a11.setEmpty();
        eVar3.a(a11);
        rect8.setEmpty();
        eVar3.a(rect8);
    }

    public void r(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1363k;
        int i11 = 0;
        if (view2 == null && fVar.f1358f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a10 = a();
            Rect a11 = a();
            try {
                f(view2, a10);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i10, a10, a11, fVar2, measuredWidth, measuredHeight);
                b(fVar2, a11, measuredWidth, measuredHeight);
                view.layout(a11.left, a11.top, a11.right, a11.bottom);
            } finally {
                a10.setEmpty();
                n0.e eVar = (n0.e) F;
                eVar.a(a10);
                a11.setEmpty();
                eVar.a(a11);
            }
        } else {
            int i12 = fVar.f1357e;
            if (i12 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i13 = fVar3.f1355c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int k10 = k(i12) - measuredWidth2;
                if (i14 == 1) {
                    k10 += measuredWidth2 / 2;
                } else if (i14 == 5) {
                    k10 += measuredWidth2;
                }
                if (i15 == 16) {
                    i11 = 0 + (measuredHeight2 / 2);
                } else if (i15 == 80) {
                    i11 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(k10, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            Rect a12 = a();
            a12.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
            if (this.f1346v != null) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                if (c0.d.b(this) && !c0.d.b(view)) {
                    a12.left = this.f1346v.d() + a12.left;
                    a12.top = this.f1346v.f() + a12.top;
                    a12.right -= this.f1346v.e();
                    a12.bottom -= this.f1346v.c();
                }
            }
            Rect a13 = a();
            int i16 = fVar4.f1355c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            o0.e.b(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a12, a13, i10);
            view.layout(a13.left, a13.top, a13.right, a13.bottom);
            a12.setEmpty();
            n0.e eVar2 = (n0.e) F;
            eVar2.a(a12);
            a13.setEmpty();
            eVar2.a(a13);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f1353a;
        if (cVar == null || !cVar.m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f1339g) {
            v(false);
            this.f1339g = true;
        }
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1349y = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1348x;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1348x = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1348x.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1348x;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                androidx.core.graphics.drawable.a.j(drawable4, c0.e.d(this));
                this.f1348x.setVisible(getVisibility() == 0, false);
                this.f1348x.setCallback(this);
            }
            WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
            c0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? d0.a.c(getContext(), i10) : null);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1348x;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f1348x.setVisible(z10, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i10) {
        boolean z10;
        MotionEvent motionEvent2 = motionEvent;
        int i11 = i10;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1335c;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i12) : i12));
        }
        Comparator<View> comparator = E;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = list.get(i13);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1353a;
            if ((!z11 && !z12) || actionMasked == 0) {
                if (!z11 && cVar != null) {
                    if (i11 == 0) {
                        z11 = cVar.g(this, view, motionEvent2);
                    } else if (i11 == 1) {
                        z11 = cVar.r(this, view, motionEvent2);
                    }
                    if (z11) {
                        this.f1342r = view;
                    }
                }
                if (fVar.f1353a == null) {
                    fVar.f1365m = false;
                }
                boolean z13 = fVar.f1365m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.f1365m = z10;
                }
                z12 = z10 && !z13;
                if (z10 && !z12) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i11 == 0) {
                    cVar.g(this, view, motionEvent3);
                } else if (i11 == 1) {
                    cVar.r(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x016a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r11 = this;
            java.util.List<android.view.View> r0 = r11.f1333a
            r0.clear()
            p.g r0 = r11.f1334b
            java.lang.Object r1 = r0.f23741b
            s.i r1 = (s.i) r1
            int r1 = r1.f24851c
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r1) goto L_0x0023
            java.lang.Object r4 = r0.f23741b
            s.i r4 = (s.i) r4
            java.lang.Object r4 = r4.l(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0020
            r0.j(r4)
        L_0x0020:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0023:
            java.lang.Object r0 = r0.f23741b
            s.i r0 = (s.i) r0
            r0.clear()
            int r0 = r11.getChildCount()
            r1 = 0
        L_0x002f:
            if (r1 >= r0) goto L_0x0197
            android.view.View r3 = r11.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r11.l(r3)
            int r5 = r4.f1358f
            r6 = -1
            r7 = 0
            if (r5 != r6) goto L_0x0045
            r4.f1364l = r7
            r4.f1363k = r7
            goto L_0x00cb
        L_0x0045:
            android.view.View r5 = r4.f1363k
            if (r5 == 0) goto L_0x0076
            int r5 = r5.getId()
            int r6 = r4.f1358f
            if (r5 == r6) goto L_0x0052
            goto L_0x006f
        L_0x0052:
            android.view.View r5 = r4.f1363k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0058:
            if (r6 == r11) goto L_0x0071
            if (r6 == 0) goto L_0x006b
            if (r6 != r3) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L_0x0066
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0066:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0058
        L_0x006b:
            r4.f1364l = r7
            r4.f1363k = r7
        L_0x006f:
            r5 = 0
            goto L_0x0074
        L_0x0071:
            r4.f1364l = r5
            r5 = 1
        L_0x0074:
            if (r5 != 0) goto L_0x00cb
        L_0x0076:
            int r5 = r4.f1358f
            android.view.View r5 = r11.findViewById(r5)
            r4.f1363k = r5
            if (r5 == 0) goto L_0x00c1
            if (r5 != r11) goto L_0x0095
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x008d
            r4.f1364l = r7
            r4.f1363k = r7
            goto L_0x00cb
        L_0x008d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0095:
            android.view.ViewParent r6 = r5.getParent()
        L_0x0099:
            if (r6 == r11) goto L_0x00be
            if (r6 == 0) goto L_0x00be
            if (r6 != r3) goto L_0x00b2
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x00aa
            r4.f1364l = r7
            r4.f1363k = r7
            goto L_0x00cb
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L_0x00b9
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b9:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0099
        L_0x00be:
            r4.f1364l = r5
            goto L_0x00cb
        L_0x00c1:
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0172
            r4.f1364l = r7
            r4.f1363k = r7
        L_0x00cb:
            p.g r5 = r11.f1334b
            r5.d(r3)
            r5 = 0
        L_0x00d1:
            if (r5 >= r0) goto L_0x016e
            if (r5 != r1) goto L_0x00d7
            goto L_0x016a
        L_0x00d7:
            android.view.View r6 = r11.getChildAt(r5)
            android.view.View r8 = r4.f1364l
            if (r6 == r8) goto L_0x010e
            java.util.WeakHashMap<android.view.View, java.lang.String> r8 = o0.c0.f22553a
            int r8 = o0.c0.e.d(r11)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r9
            int r9 = r9.f1359g
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r8)
            if (r9 == 0) goto L_0x00fe
            int r10 = r4.f1360h
            int r8 = android.view.Gravity.getAbsoluteGravity(r10, r8)
            r8 = r8 & r9
            if (r8 != r9) goto L_0x00fe
            r8 = 1
            goto L_0x00ff
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            if (r8 != 0) goto L_0x010e
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r8 = r4.f1353a
            if (r8 == 0) goto L_0x010c
            boolean r8 = r8.b(r11, r3, r6)
            if (r8 == 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r8 = 0
            goto L_0x010f
        L_0x010e:
            r8 = 1
        L_0x010f:
            if (r8 == 0) goto L_0x016a
            p.g r8 = r11.f1334b
            java.lang.Object r8 = r8.f23741b
            s.i r8 = (s.i) r8
            int r8 = r8.e(r6)
            if (r8 < 0) goto L_0x011f
            r8 = 1
            goto L_0x0120
        L_0x011f:
            r8 = 0
        L_0x0120:
            if (r8 != 0) goto L_0x0127
            p.g r8 = r11.f1334b
            r8.d(r6)
        L_0x0127:
            p.g r8 = r11.f1334b
            java.lang.Object r9 = r8.f23741b
            s.i r9 = (s.i) r9
            int r9 = r9.e(r6)
            if (r9 < 0) goto L_0x0135
            r9 = 1
            goto L_0x0136
        L_0x0135:
            r9 = 0
        L_0x0136:
            if (r9 == 0) goto L_0x0162
            java.lang.Object r9 = r8.f23741b
            s.i r9 = (s.i) r9
            int r9 = r9.e(r3)
            if (r9 < 0) goto L_0x0144
            r9 = 1
            goto L_0x0145
        L_0x0144:
            r9 = 0
        L_0x0145:
            if (r9 == 0) goto L_0x0162
            java.lang.Object r9 = r8.f23741b
            s.i r9 = (s.i) r9
            java.lang.Object r9 = r9.getOrDefault(r6, r7)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x015e
            java.util.ArrayList r9 = r8.g()
            java.lang.Object r8 = r8.f23741b
            s.i r8 = (s.i) r8
            r8.put(r6, r9)
        L_0x015e:
            r9.add(r3)
            goto L_0x016a
        L_0x0162:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x016a:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x016e:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x0172:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            android.content.res.Resources r2 = r11.getResources()
            int r4 = r4.f1358f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0197:
            java.util.List<android.view.View> r0 = r11.f1333a
            p.g r1 = r11.f1334b
            java.lang.Object r3 = r1.f23742c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r3 = r1.f23743d
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            java.lang.Object r3 = r1.f23741b
            s.i r3 = (s.i) r3
            int r3 = r3.f24851c
        L_0x01af:
            if (r2 >= r3) goto L_0x01c7
            java.lang.Object r4 = r1.f23741b
            s.i r4 = (s.i) r4
            java.lang.Object r4 = r4.h(r2)
            java.lang.Object r5 = r1.f23742c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r1.f23743d
            java.util.HashSet r6 = (java.util.HashSet) r6
            r1.f(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01af
        L_0x01c7:
            java.lang.Object r1 = r1.f23742c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r11.f1333a
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f1353a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).f1365m = false;
        }
        this.f1342r = null;
        this.f1339g = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1348x;
    }

    public final void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1361i;
        if (i11 != i10) {
            c0.t(view, i10 - i11);
            fVar.f1361i = i10;
        }
    }

    public final void x(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1362j;
        if (i11 != i10) {
            c0.u(view, i10 - i11);
            fVar.f1362j = i10;
        }
    }

    public final void y() {
        if (Build.VERSION.SDK_INT >= 21) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (c0.d.b(this)) {
                if (this.f1350z == null) {
                    this.f1350z = new a();
                }
                c0.J(this, this.f1350z);
                setSystemUiVisibility(1280);
                return;
            }
            c0.J(this, (s) null);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public static class h extends u0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<Parcelable> f1371c;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new h[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1371c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f1371c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            SparseArray<Parcelable> sparseArray = this.f1371c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f1371c.keyAt(i11);
                parcelableArr[i11] = this.f1371c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1353a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1354b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1355c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1356d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1357e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1358f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1359g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1360h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1361i;

        /* renamed from: j  reason: collision with root package name */
        public int f1362j;

        /* renamed from: k  reason: collision with root package name */
        public View f1363k;

        /* renamed from: l  reason: collision with root package name */
        public View f1364l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1365m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1366n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1367o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1368p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1369q = new Rect();

        public f(int i10, int i11) {
            super(i10, i11);
        }

        public boolean a(int i10) {
            if (i10 == 0) {
                return this.f1366n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f1367o;
        }

        public void b(c cVar) {
            c cVar2 = this.f1353a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f1353a = cVar;
                this.f1354b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }

        public void c(int i10, boolean z10) {
            if (i10 == 0) {
                this.f1366n = z10;
            } else if (i10 == 1) {
                this.f1367o = z10;
            }
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.a.f28181b);
            this.f1355c = obtainStyledAttributes.getInteger(0, 0);
            this.f1358f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1356d = obtainStyledAttributes.getInteger(2, 0);
            this.f1357e = obtainStyledAttributes.getInteger(6, -1);
            this.f1359g = obtainStyledAttributes.getInt(5, 0);
            this.f1360h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1354b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.B;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.B;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.D;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.C);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e10) {
                        throw new RuntimeException(j.f.a("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f1353a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f1353a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
