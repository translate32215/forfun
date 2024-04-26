package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;
import o0.o0;
import p0.c;
import p0.g;
import v0.d;

public class DrawerLayout extends ViewGroup implements v0.c {
    public static final int[] L = {16843828};
    public static final int[] M = {16842931};
    public static final boolean N;
    public static final boolean O;
    public static boolean P;
    public d A;
    public List<d> B;
    public float C;
    public float D;
    public Drawable E;
    public Object F;
    public boolean G;
    public final ArrayList<View> H;
    public Rect I;
    public Matrix J;
    public final p0.g K = new a();

    /* renamed from: a  reason: collision with root package name */
    public final c f1465a = new c();

    /* renamed from: b  reason: collision with root package name */
    public float f1466b;

    /* renamed from: c  reason: collision with root package name */
    public int f1467c;

    /* renamed from: d  reason: collision with root package name */
    public int f1468d = -1728053248;

    /* renamed from: e  reason: collision with root package name */
    public float f1469e;

    /* renamed from: f  reason: collision with root package name */
    public Paint f1470f = new Paint();

    /* renamed from: g  reason: collision with root package name */
    public final v0.d f1471g;

    /* renamed from: h  reason: collision with root package name */
    public final v0.d f1472h;

    /* renamed from: i  reason: collision with root package name */
    public final g f1473i;

    /* renamed from: r  reason: collision with root package name */
    public final g f1474r;

    /* renamed from: s  reason: collision with root package name */
    public int f1475s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1476t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1477u = true;

    /* renamed from: v  reason: collision with root package name */
    public int f1478v = 3;

    /* renamed from: w  reason: collision with root package name */
    public int f1479w = 3;

    /* renamed from: x  reason: collision with root package name */
    public int f1480x = 3;

    /* renamed from: y  reason: collision with root package name */
    public int f1481y = 3;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1482z;

    public class a implements p0.g {
        public a() {
        }

        public boolean a(View view, g.a aVar) {
            if (!DrawerLayout.this.m(view) || DrawerLayout.this.h(view) == 2) {
                return false;
            }
            DrawerLayout.this.c(view);
            return true;
        }
    }

    public class b extends o0.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1484d = new Rect();

        public b() {
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.f22536a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View g10 = DrawerLayout.this.g();
            if (g10 == null) {
                return true;
            }
            int i10 = DrawerLayout.this.i(g10);
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            Gravity.getAbsoluteGravity(i10, c0.e.d(drawerLayout));
            return true;
        }

        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.f22536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public void d(View view, p0.c cVar) {
            if (DrawerLayout.N) {
                this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(cVar.f23748a);
                this.f22536a.onInitializeAccessibilityNodeInfo(view, obtain);
                cVar.f23750c = -1;
                cVar.f23748a.setSource(view);
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                ViewParent f10 = c0.d.f(view);
                if (f10 instanceof View) {
                    cVar.p((View) f10);
                }
                Rect rect = this.f1484d;
                obtain.getBoundsInScreen(rect);
                cVar.f23748a.setBoundsInScreen(rect);
                cVar.f23748a.setVisibleToUser(obtain.isVisibleToUser());
                cVar.f23748a.setPackageName(obtain.getPackageName());
                cVar.f23748a.setClassName(obtain.getClassName());
                cVar.f23748a.setContentDescription(obtain.getContentDescription());
                cVar.f23748a.setEnabled(obtain.isEnabled());
                cVar.f23748a.setFocused(obtain.isFocused());
                cVar.f23748a.setAccessibilityFocused(obtain.isAccessibilityFocused());
                cVar.f23748a.setSelected(obtain.isSelected());
                cVar.f23748a.addAction(obtain.getActions());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (DrawerLayout.k(childAt)) {
                        cVar.f23748a.addChild(childAt);
                    }
                }
            }
            cVar.f23748a.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            cVar.f23748a.setFocusable(false);
            cVar.f23748a.setFocused(false);
            cVar.k(c.a.f23751e);
            cVar.k(c.a.f23752f);
        }

        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.k(view)) {
                return this.f22536a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class c extends o0.a {
        public void d(View view, p0.c cVar) {
            this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            if (!DrawerLayout.k(view)) {
                cVar.p((View) null);
            }
        }
    }

    public interface d {
        void a(int i10);

        void b(View view, float f10);

        void c(View view);

        void d(View view);
    }

    public class g extends d.c {

        /* renamed from: a  reason: collision with root package name */
        public final int f1495a;

        /* renamed from: b  reason: collision with root package name */
        public v0.d f1496b;

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f1497c = new a();

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                int i10;
                View view;
                g gVar = g.this;
                int i11 = gVar.f1496b.f26341o;
                boolean z10 = gVar.f1495a == 3;
                if (z10) {
                    view = DrawerLayout.this.e(3);
                    i10 = (view != null ? -view.getWidth() : 0) + i11;
                } else {
                    view = DrawerLayout.this.e(5);
                    i10 = DrawerLayout.this.getWidth() - i11;
                }
                if (view == null) {
                    return;
                }
                if (((z10 && view.getLeft() < i10) || (!z10 && view.getLeft() > i10)) && DrawerLayout.this.h(view) == 0) {
                    gVar.f1496b.x(view, i10, view.getTop());
                    ((e) view.getLayoutParams()).f1488c = true;
                    DrawerLayout.this.invalidate();
                    gVar.l();
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (!drawerLayout.f1482z) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            drawerLayout.getChildAt(i12).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        drawerLayout.f1482z = true;
                    }
                }
            }
        }

        public g(int i10) {
            this.f1495a = i10;
        }

        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.b(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int c(View view) {
            if (DrawerLayout.this.n(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void e(int i10, int i11) {
            View view;
            if ((i10 & 1) == 1) {
                view = DrawerLayout.this.e(3);
            } else {
                view = DrawerLayout.this.e(5);
            }
            if (view != null && DrawerLayout.this.h(view) == 0) {
                this.f1496b.b(view, i11);
            }
        }

        public void f(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f1497c, 160);
        }

        public void g(View view, int i10) {
            ((e) view.getLayoutParams()).f1488c = false;
            l();
        }

        public void h(int i10) {
            DrawerLayout.this.u(i10, this.f1496b.f26346t);
        }

        public void i(View view, int i10, int i11, int i12, int i13) {
            float f10;
            int width = view.getWidth();
            if (DrawerLayout.this.b(view, 3)) {
                f10 = (float) (i10 + width);
            } else {
                f10 = (float) (DrawerLayout.this.getWidth() - i10);
            }
            float f11 = f10 / ((float) width);
            DrawerLayout.this.r(view, f11);
            view.setVisibility(f11 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void j(View view, float f10, float f11) {
            int i10;
            DrawerLayout.this.getClass();
            float f12 = ((e) view.getLayoutParams()).f1487b;
            int width = view.getWidth();
            if (DrawerLayout.this.b(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && f12 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f1496b.v(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public boolean k(View view, int i10) {
            return DrawerLayout.this.n(view) && DrawerLayout.this.b(view, this.f1495a) && DrawerLayout.this.h(view) == 0;
        }

        public final void l() {
            int i10 = 3;
            if (this.f1495a == 3) {
                i10 = 5;
            }
            View e10 = DrawerLayout.this.e(i10);
            if (e10 != null) {
                DrawerLayout.this.c(e10);
            }
        }

        public void m() {
            DrawerLayout.this.removeCallbacks(this.f1497c);
        }
    }

    static {
        boolean z10 = true;
        int i10 = Build.VERSION.SDK_INT;
        N = i10 >= 19;
        O = i10 >= 21;
        if (i10 < 29) {
            z10 = false;
        }
        P = z10;
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.drawerLayoutStyle);
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f1467c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        g gVar = new g(3);
        this.f1473i = gVar;
        g gVar2 = new g(5);
        this.f1474r = gVar2;
        v0.d j10 = v0.d.j(this, 1.0f, gVar);
        this.f1471g = j10;
        j10.f26343q = 1;
        j10.f26340n = f11;
        gVar.f1496b = j10;
        v0.d j11 = v0.d.j(this, 1.0f, gVar2);
        this.f1472h = j11;
        j11.f26343q = 2;
        j11.f26340n = f11;
        gVar2.f1496b = j11;
        setFocusableInTouchMode(true);
        c0.I(this, 1);
        c0.C(this, new b());
        setMotionEventSplittingEnabled(false);
        if (c0.d.b(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new x0.a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(L);
                try {
                    this.E = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.E = null;
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, w0.a.f26859a, R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f1466b = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f1466b = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.H = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String j(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean k(View view) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        return (c0.d.c(view) == 4 || c0.d.c(view) == 2) ? false : true;
    }

    public void a() {
        View e10 = e(8388611);
        if (e10 != null) {
            p(e10, true);
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("No drawer view found with gravity ");
        a10.append(j(8388611));
        throw new IllegalArgumentException(a10.toString());
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z10 = false;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!n(childAt)) {
                    this.H.add(childAt);
                } else if (m(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            }
            if (!z10) {
                int size = this.H.size();
                for (int i13 = 0; i13 < size; i13++) {
                    View view = this.H.get(i13);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i10, i11);
                    }
                }
            }
            this.H.clear();
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (f() != null || n(view)) {
            c0.I(view, 4);
        } else {
            c0.I(view, 1);
        }
        if (!N) {
            c0.C(view, this.f1465a);
        }
    }

    public boolean b(View view, int i10) {
        return (i(view) & i10) == i10;
    }

    public void c(View view) {
        if (n(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f1477u) {
                eVar.f1487b = 0.0f;
                eVar.f1489d = 0;
            } else {
                eVar.f1489d |= 4;
                if (b(view, 3)) {
                    this.f1471g.x(view, -view.getWidth(), view.getTop());
                } else {
                    this.f1472h.x(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((e) getChildAt(i10).getLayoutParams()).f1487b);
        }
        this.f1469e = f10;
        boolean i11 = this.f1471g.i(true);
        boolean i12 = this.f1472h.i(true);
        if (i11 || i12) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(this);
        }
    }

    public void d(boolean z10) {
        boolean z11;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (n(childAt) && (!z10 || eVar.f1488c)) {
                int width = childAt.getWidth();
                if (b(childAt, 3)) {
                    z11 = this.f1471g.x(childAt, -width, childAt.getTop());
                } else {
                    z11 = this.f1472h.x(childAt, getWidth(), childAt.getTop());
                }
                z12 |= z11;
                eVar.f1488c = false;
            }
        }
        this.f1473i.m();
        this.f1474r.m();
        if (z12) {
            invalidate();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z10;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1469e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.I == null) {
                this.I = new Rect();
            }
            childAt.getHitRect(this.I);
            if (this.I.contains((int) x10, (int) y10) && !l(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.J == null) {
                            this.J = new Matrix();
                        }
                        matrix.invert(this.J);
                        obtain.transform(this.J);
                    }
                    z10 = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z10 = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean l10 = l(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (l10) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && n(childAt) && childAt.getHeight() >= height) {
                        if (b(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i11) {
                                i11 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f1469e;
        if (f10 > 0.0f && l10) {
            int i13 = this.f1468d;
            this.f1470f.setColor((((int) (((float) ((-16777216 & i13) >>> 24)) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect((float) i10, 0.0f, (float) width, (float) getHeight(), this.f1470f);
        }
        return drawChild;
    }

    public View e(int i10) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, c0.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public View f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((e) childAt.getLayoutParams()).f1489d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (n(childAt)) {
                if (n(childAt)) {
                    if (((e) childAt.getLayoutParams()).f1487b > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.f1466b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.E;
    }

    public int h(View view) {
        if (n(view)) {
            int i10 = ((e) view.getLayoutParams()).f1486a;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            int d10 = c0.e.d(this);
            if (i10 == 3) {
                int i11 = this.f1478v;
                if (i11 != 3) {
                    return i11;
                }
                int i12 = d10 == 0 ? this.f1480x : this.f1481y;
                if (i12 != 3) {
                    return i12;
                }
            } else if (i10 == 5) {
                int i13 = this.f1479w;
                if (i13 != 3) {
                    return i13;
                }
                int i14 = d10 == 0 ? this.f1481y : this.f1480x;
                if (i14 != 3) {
                    return i14;
                }
            } else if (i10 == 8388611) {
                int i15 = this.f1480x;
                if (i15 != 3) {
                    return i15;
                }
                int i16 = d10 == 0 ? this.f1478v : this.f1479w;
                if (i16 != 3) {
                    return i16;
                }
            } else if (i10 == 8388613) {
                int i17 = this.f1481y;
                if (i17 != 3) {
                    return i17;
                }
                int i18 = d10 == 0 ? this.f1479w : this.f1478v;
                if (i18 != 3) {
                    return i18;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public int i(View view) {
        int i10 = ((e) view.getLayoutParams()).f1486a;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        return Gravity.getAbsoluteGravity(i10, c0.e.d(this));
    }

    public boolean l(View view) {
        return ((e) view.getLayoutParams()).f1486a == 0;
    }

    public boolean m(View view) {
        if (n(view)) {
            return (((e) view.getLayoutParams()).f1489d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean n(View view) {
        int i10 = ((e) view.getLayoutParams()).f1486a;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, c0.e.d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public void o(View view, float f10) {
        float f11 = ((e) view.getLayoutParams()).f1487b;
        float width = (float) view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (f11 * width));
        if (!b(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        r(view, f10);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1477u = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1477u = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.G
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.E
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.F
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.E
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.E
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        r9 = r8.f1471g.l((int) r0, (int) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054 A[LOOP:0: B:8:0x0024->B:17:0x0054, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0052 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            v0.d r1 = r8.f1471g
            boolean r1 = r1.w(r9)
            v0.d r2 = r8.f1472h
            boolean r2 = r2.w(r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x006c
            if (r0 == r2) goto L_0x0065
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x0065
            goto L_0x006a
        L_0x001e:
            v0.d r9 = r8.f1471g
            float[] r0 = r9.f26330d
            int r0 = r0.length
            r4 = 0
        L_0x0024:
            if (r4 >= r0) goto L_0x0057
            boolean r5 = r9.n(r4)
            if (r5 != 0) goto L_0x002d
            goto L_0x004f
        L_0x002d:
            float[] r5 = r9.f26332f
            r5 = r5[r4]
            float[] r6 = r9.f26330d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f26333g
            r6 = r6[r4]
            float[] r7 = r9.f26331e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r9.f26328b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            if (r5 == 0) goto L_0x0054
            r9 = 1
            goto L_0x0058
        L_0x0054:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0057:
            r9 = 0
        L_0x0058:
            if (r9 == 0) goto L_0x006a
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.f1473i
            r9.m()
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.f1474r
            r9.m()
            goto L_0x006a
        L_0x0065:
            r8.d(r2)
            r8.f1482z = r3
        L_0x006a:
            r9 = 0
            goto L_0x0094
        L_0x006c:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.C = r0
            r8.D = r9
            float r4 = r8.f1469e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0091
            v0.d r4 = r8.f1471g
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.l(r0, r9)
            if (r9 == 0) goto L_0x0091
            boolean r9 = r8.l(r9)
            if (r9 == 0) goto L_0x0091
            r9 = 1
            goto L_0x0092
        L_0x0091:
            r9 = 0
        L_0x0092:
            r8.f1482z = r3
        L_0x0094:
            if (r1 != 0) goto L_0x00bb
            if (r9 != 0) goto L_0x00bb
            int r9 = r8.getChildCount()
            r0 = 0
        L_0x009d:
            if (r0 >= r9) goto L_0x00b2
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r1 = (androidx.drawerlayout.widget.DrawerLayout.e) r1
            boolean r1 = r1.f1488c
            if (r1 == 0) goto L_0x00af
            r9 = 1
            goto L_0x00b3
        L_0x00af:
            int r0 = r0 + 1
            goto L_0x009d
        L_0x00b2:
            r9 = 0
        L_0x00b3:
            if (r9 != 0) goto L_0x00bb
            boolean r9 = r8.f1482z
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r2 = 0
        L_0x00bb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (g() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View g10 = g();
        if (g10 != null && h(g10) == 0) {
            d(false);
        }
        if (g10 != null) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        this.f1476t = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i17 = eVar.leftMargin;
                    childAt.layout(i17, eVar.topMargin, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + eVar.topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f11 = (float) measuredWidth;
                        i14 = (-measuredWidth) + ((int) (eVar.f1487b * f11));
                        f10 = ((float) (measuredWidth + i14)) / f11;
                    } else {
                        float f12 = (float) measuredWidth;
                        int i18 = i15 - ((int) (eVar.f1487b * f12));
                        f10 = ((float) (i15 - i18)) / f12;
                        i14 = i18;
                    }
                    boolean z11 = f10 != eVar.f1487b;
                    int i19 = eVar.f1486a & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = eVar.topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = i20 - eVar.bottomMargin;
                            if (i23 > i24) {
                                i21 = i24 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = eVar.topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - eVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - eVar.bottomMargin);
                    }
                    if (z11) {
                        r(childAt, f10);
                    }
                    int i27 = eVar.f1487b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
        }
        if (P && (rootWindowInsets = getRootWindowInsets()) != null) {
            g0.b i28 = o0.l(rootWindowInsets, (View) null).f22597a.i();
            v0.d dVar = this.f1471g;
            dVar.f26341o = Math.max(dVar.f26342p, i28.f18355a);
            v0.d dVar2 = this.f1472h;
            dVar2.f26341o = Math.max(dVar2.f26342p, i28.f18357c);
        }
        this.f1476t = false;
        this.f1477u = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = android.view.View.MeasureSpec.getMode(r17)
            int r2 = android.view.View.MeasureSpec.getMode(r18)
            int r3 = android.view.View.MeasureSpec.getSize(r17)
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto L_0x0018
            if (r2 == r5) goto L_0x0026
        L_0x0018:
            boolean r5 = r16.isInEditMode()
            if (r5 == 0) goto L_0x01ae
            if (r1 != 0) goto L_0x0022
            r3 = 300(0x12c, float:4.2E-43)
        L_0x0022:
            if (r2 != 0) goto L_0x0026
            r4 = 300(0x12c, float:4.2E-43)
        L_0x0026:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.F
            r2 = 0
            if (r1 == 0) goto L_0x0038
            java.util.WeakHashMap<android.view.View, java.lang.String> r1 = o0.c0.f22553a
            boolean r1 = o0.c0.d.b(r16)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            java.util.WeakHashMap<android.view.View, java.lang.String> r5 = o0.c0.f22553a
            int r5 = o0.c0.e.d(r16)
            int r6 = r16.getChildCount()
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0046:
            if (r7 >= r6) goto L_0x01ad
            android.view.View r10 = r0.getChildAt(r7)
            int r11 = r10.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x0056
            goto L_0x0107
        L_0x0056:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$e r11 = (androidx.drawerlayout.widget.DrawerLayout.e) r11
            r12 = 3
            if (r1 == 0) goto L_0x00e6
            int r13 = r11.f1486a
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r5)
            boolean r14 = o0.c0.d.b(r10)
            r15 = 21
            if (r14 == 0) goto L_0x009f
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r15) goto L_0x00e6
            java.lang.Object r14 = r0.F
            android.view.WindowInsets r14 = (android.view.WindowInsets) r14
            if (r13 != r12) goto L_0x0088
            int r12 = r14.getSystemWindowInsetLeft()
            int r13 = r14.getSystemWindowInsetTop()
            int r15 = r14.getSystemWindowInsetBottom()
            android.view.WindowInsets r14 = r14.replaceSystemWindowInsets(r12, r13, r2, r15)
            goto L_0x009b
        L_0x0088:
            r12 = 5
            if (r13 != r12) goto L_0x009b
            int r12 = r14.getSystemWindowInsetTop()
            int r13 = r14.getSystemWindowInsetRight()
            int r15 = r14.getSystemWindowInsetBottom()
            android.view.WindowInsets r14 = r14.replaceSystemWindowInsets(r2, r12, r13, r15)
        L_0x009b:
            r10.dispatchApplyWindowInsets(r14)
            goto L_0x00e6
        L_0x009f:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r15) goto L_0x00e6
            java.lang.Object r12 = r0.F
            android.view.WindowInsets r12 = (android.view.WindowInsets) r12
            r14 = 3
            if (r13 != r14) goto L_0x00bb
            int r13 = r12.getSystemWindowInsetLeft()
            int r14 = r12.getSystemWindowInsetTop()
            int r15 = r12.getSystemWindowInsetBottom()
            android.view.WindowInsets r12 = r12.replaceSystemWindowInsets(r13, r14, r2, r15)
            goto L_0x00ce
        L_0x00bb:
            r14 = 5
            if (r13 != r14) goto L_0x00ce
            int r13 = r12.getSystemWindowInsetTop()
            int r14 = r12.getSystemWindowInsetRight()
            int r15 = r12.getSystemWindowInsetBottom()
            android.view.WindowInsets r12 = r12.replaceSystemWindowInsets(r2, r13, r14, r15)
        L_0x00ce:
            int r2 = r12.getSystemWindowInsetLeft()
            r11.leftMargin = r2
            int r2 = r12.getSystemWindowInsetTop()
            r11.topMargin = r2
            int r2 = r12.getSystemWindowInsetRight()
            r11.rightMargin = r2
            int r2 = r12.getSystemWindowInsetBottom()
            r11.bottomMargin = r2
        L_0x00e6:
            boolean r2 = r0.l(r10)
            if (r2 == 0) goto L_0x010d
            int r2 = r11.leftMargin
            int r2 = r3 - r2
            int r12 = r11.rightMargin
            int r2 = r2 - r12
            r12 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r12)
            int r13 = r11.topMargin
            int r13 = r4 - r13
            int r11 = r11.bottomMargin
            int r13 = r13 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r12)
            r10.measure(r2, r11)
        L_0x0107:
            r13 = r17
            r14 = r18
            goto L_0x0184
        L_0x010d:
            boolean r2 = r0.n(r10)
            if (r2 == 0) goto L_0x0189
            boolean r2 = O
            if (r2 == 0) goto L_0x0124
            float r2 = o0.c0.l(r10)
            float r12 = r0.f1466b
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0124
            o0.c0.H(r10, r12)
        L_0x0124:
            int r2 = r0.i(r10)
            r2 = r2 & 7
            r12 = 3
            if (r2 != r12) goto L_0x012f
            r12 = 1
            goto L_0x0130
        L_0x012f:
            r12 = 0
        L_0x0130:
            if (r12 == 0) goto L_0x0134
            if (r8 != 0) goto L_0x0139
        L_0x0134:
            if (r12 != 0) goto L_0x015f
            if (r9 != 0) goto L_0x0139
            goto L_0x015f
        L_0x0139:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r3 = android.support.v4.media.a.a(r3)
            java.lang.String r2 = j(r2)
            r3.append(r2)
            java.lang.String r2 = " but this "
            r3.append(r2)
            java.lang.String r2 = "DrawerLayout"
            r3.append(r2)
            java.lang.String r2 = " already has a drawer view along that edge"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x015f:
            if (r12 == 0) goto L_0x0163
            r8 = 1
            goto L_0x0164
        L_0x0163:
            r9 = 1
        L_0x0164:
            int r2 = r0.f1467c
            int r12 = r11.leftMargin
            int r2 = r2 + r12
            int r12 = r11.rightMargin
            int r2 = r2 + r12
            int r12 = r11.width
            r13 = r17
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r13, r2, r12)
            int r12 = r11.topMargin
            int r14 = r11.bottomMargin
            int r12 = r12 + r14
            int r11 = r11.height
            r14 = r18
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r14, r12, r11)
            r10.measure(r2, r11)
        L_0x0184:
            int r7 = r7 + 1
            r2 = 0
            goto L_0x0046
        L_0x0189:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Child "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " at index "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ad:
            return
        L_0x01ae:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            goto L_0x01b7
        L_0x01b6:
            throw r1
        L_0x01b7:
            goto L_0x01b6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View e10;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f25915a);
        int i10 = fVar.f1490c;
        if (!(i10 == 0 || (e10 = e(i10)) == null)) {
            p(e10, true);
        }
        int i11 = fVar.f1491d;
        if (i11 != 3) {
            q(i11, 3);
        }
        int i12 = fVar.f1492e;
        if (i12 != 3) {
            q(i12, 5);
        }
        int i13 = fVar.f1493f;
        if (i13 != 3) {
            q(i13, 8388611);
        }
        int i14 = fVar.f1494g;
        if (i14 != 3) {
            q(i14, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i10) {
        if (!O) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.e.d(this);
            c0.e.d(this);
        }
    }

    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            e eVar = (e) getChildAt(i10).getLayoutParams();
            int i11 = eVar.f1489d;
            boolean z10 = true;
            boolean z11 = i11 == 1;
            if (i11 != 2) {
                z10 = false;
            }
            if (z11 || z10) {
                fVar.f1490c = eVar.f1486a;
            } else {
                i10++;
            }
        }
        fVar.f1491d = this.f1478v;
        fVar.f1492e = this.f1479w;
        fVar.f1493f = this.f1480x;
        fVar.f1494g = this.f1481y;
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (h(r7) != 2) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            v0.d r0 = r6.f1471g
            r0.p(r7)
            v0.d r0 = r6.f1472h
            r0.p(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.d(r2)
            r6.f1482z = r1
            goto L_0x006e
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            v0.d r3 = r6.f1471g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.l(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = r6.l(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.C
            float r0 = r0 - r3
            float r3 = r6.D
            float r7 = r7 - r3
            v0.d r3 = r6.f1471g
            int r3 = r3.f26328b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.f()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.h(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r6.d(r1)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.C = r0
            r6.D = r7
            r6.f1482z = r1
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view, boolean z10) {
        if (n(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f1477u) {
                eVar.f1487b = 1.0f;
                eVar.f1489d = 1;
                t(view, true);
                s(view);
            } else if (z10) {
                eVar.f1489d |= 2;
                if (b(view, 3)) {
                    this.f1471g.x(view, 0, view.getTop());
                } else {
                    this.f1472h.x(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                o(view, 1.0f);
                u(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void q(int i10, int i11) {
        View e10;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, c0.e.d(this));
        if (i11 == 3) {
            this.f1478v = i10;
        } else if (i11 == 5) {
            this.f1479w = i10;
        } else if (i11 == 8388611) {
            this.f1480x = i10;
        } else if (i11 == 8388613) {
            this.f1481y = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f1471g : this.f1472h).a();
        }
        if (i10 == 1) {
            View e11 = e(absoluteGravity);
            if (e11 != null) {
                c(e11);
            }
        } else if (i10 == 2 && (e10 = e(absoluteGravity)) != null) {
            p(e10, true);
        }
    }

    public void r(View view, float f10) {
        e eVar = (e) view.getLayoutParams();
        if (f10 != eVar.f1487b) {
            eVar.f1487b = f10;
            List<d> list = this.B;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.B.get(size).b(view, f10);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            d(true);
        }
    }

    public void requestLayout() {
        if (!this.f1476t) {
            super.requestLayout();
        }
    }

    public final void s(View view) {
        c.a aVar = c.a.f23758l;
        c0.x(view, aVar.a());
        if (m(view) && h(view) != 2) {
            c0.z(view, aVar, (CharSequence) null, this.K);
        }
    }

    public void setDrawerElevation(float f10) {
        this.f1466b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (n(childAt)) {
                c0.H(childAt, this.f1466b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        List<d> list;
        d dVar2 = this.A;
        if (!(dVar2 == null || dVar2 == null || (list = this.B) == null)) {
            list.remove(dVar2);
        }
        if (dVar != null) {
            if (this.B == null) {
                this.B = new ArrayList();
            }
            this.B.add(dVar);
        }
        this.A = dVar;
    }

    public void setDrawerLockMode(int i10) {
        q(i10, 3);
        q(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f1468d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.E = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.E = new ColorDrawable(i10);
        invalidate();
    }

    public final void t(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || n(childAt)) && (!z10 || childAt != view)) {
                c0.I(childAt, 4);
            } else {
                c0.I(childAt, 1);
            }
        }
    }

    public void u(int i10, View view) {
        View rootView;
        int i11 = this.f1471g.f26327a;
        int i12 = this.f1472h.f26327a;
        int i13 = 2;
        if (i11 == 1 || i12 == 1) {
            i13 = 1;
        } else if (!(i11 == 2 || i12 == 2)) {
            i13 = 0;
        }
        if (view != null && i10 == 0) {
            float f10 = ((e) view.getLayoutParams()).f1487b;
            if (f10 == 0.0f) {
                e eVar = (e) view.getLayoutParams();
                if ((eVar.f1489d & 1) == 1) {
                    eVar.f1489d = 0;
                    List<d> list = this.B;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            this.B.get(size).d(view);
                        }
                    }
                    t(view, false);
                    s(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                e eVar2 = (e) view.getLayoutParams();
                if ((eVar2.f1489d & 1) == 0) {
                    eVar2.f1489d = 1;
                    List<d> list2 = this.B;
                    if (list2 != null) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            this.B.get(size2).c(view);
                        }
                    }
                    t(view, true);
                    s(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i13 != this.f1475s) {
            this.f1475s = i13;
            List<d> list3 = this.B;
            if (list3 != null) {
                for (int size3 = list3.size() - 1; size3 >= 0; size3--) {
                    this.B.get(size3).a(i13);
                }
            }
        }
    }

    public void setStatusBarBackground(int i10) {
        this.E = i10 != 0 ? d0.a.c(getContext(), i10) : null;
        invalidate();
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1486a = 0;

        /* renamed from: b  reason: collision with root package name */
        public float f1487b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1488c;

        /* renamed from: d  reason: collision with root package name */
        public int f1489d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.f1486a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(e eVar) {
            super(eVar);
            this.f1486a = eVar.f1486a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public static class f extends u0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f1490c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1491d;

        /* renamed from: e  reason: collision with root package name */
        public int f1492e;

        /* renamed from: f  reason: collision with root package name */
        public int f1493f;

        /* renamed from: g  reason: collision with root package name */
        public int f1494g;

        public class a implements Parcelable.ClassLoaderCreator<f> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new f[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1490c = parcel.readInt();
            this.f1491d = parcel.readInt();
            this.f1492e = parcel.readInt();
            this.f1493f = parcel.readInt();
            this.f1494g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeInt(this.f1490c);
            parcel.writeInt(this.f1491d);
            parcel.writeInt(this.f1492e);
            parcel.writeInt(this.f1493f);
            parcel.writeInt(this.f1494g);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
