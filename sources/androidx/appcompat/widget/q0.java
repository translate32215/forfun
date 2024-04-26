package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.l;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o0.c0;
import s0.h;

/* compiled from: ListPopupWindow */
public class q0 implements k.f {
    public static Method H;
    public static Method I;
    public static Method J;
    public final e A = new e();
    public final c B = new c();
    public final Handler C;
    public final Rect D = new Rect();
    public Rect E;
    public boolean F;
    public PopupWindow G;

    /* renamed from: a  reason: collision with root package name */
    public Context f1058a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f1059b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f1060c;

    /* renamed from: d  reason: collision with root package name */
    public int f1061d = -2;

    /* renamed from: e  reason: collision with root package name */
    public int f1062e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f1063f;

    /* renamed from: g  reason: collision with root package name */
    public int f1064g;

    /* renamed from: h  reason: collision with root package name */
    public int f1065h = 1002;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1066i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1067r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1068s;

    /* renamed from: t  reason: collision with root package name */
    public int f1069t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f1070u = Integer.MAX_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public DataSetObserver f1071v;

    /* renamed from: w  reason: collision with root package name */
    public View f1072w;

    /* renamed from: x  reason: collision with root package name */
    public AdapterView.OnItemClickListener f1073x;

    /* renamed from: y  reason: collision with root package name */
    public final g f1074y = new g();

    /* renamed from: z  reason: collision with root package name */
    public final f f1075z = new f();

    /* compiled from: ListPopupWindow */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* compiled from: ListPopupWindow */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* compiled from: ListPopupWindow */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            l0 l0Var = q0.this.f1060c;
            if (l0Var != null) {
                l0Var.setListSelectionHidden(true);
                l0Var.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class d extends DataSetObserver {
        public d() {
        }

        public void onChanged() {
            if (q0.this.b()) {
                q0.this.S();
            }
        }

        public void onInvalidated() {
            q0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                if (q0.this.G.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && q0.this.G.getContentView() != null) {
                    q0 q0Var = q0.this;
                    q0Var.C.removeCallbacks(q0Var.f1074y);
                    q0.this.f1074y.run();
                }
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class f implements View.OnTouchListener {
        public f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = q0.this.G) != null && popupWindow.isShowing() && x10 >= 0 && x10 < q0.this.G.getWidth() && y10 >= 0 && y10 < q0.this.G.getHeight()) {
                q0 q0Var = q0.this;
                q0Var.C.postDelayed(q0Var.f1074y, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                q0 q0Var2 = q0.this;
                q0Var2.C.removeCallbacks(q0Var2.f1074y);
                return false;
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class g implements Runnable {
        public g() {
        }

        public void run() {
            l0 l0Var = q0.this.f1060c;
            if (l0Var != null && c0.q(l0Var) && q0.this.f1060c.getCount() > q0.this.f1060c.getChildCount()) {
                int childCount = q0.this.f1060c.getChildCount();
                q0 q0Var = q0.this;
                if (childCount <= q0Var.f1070u) {
                    q0Var.G.setInputMethodMode(2);
                    q0.this.S();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                H = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                I = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public q0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1058a = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13516p, i10, i11);
        this.f1063f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1064g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1066i = true;
        }
        obtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i10, i11);
        this.G = tVar;
        tVar.setInputMethodMode(1);
    }

    public void S() {
        int i10;
        int i11;
        int i12;
        l0 l0Var;
        int i13;
        if (this.f1060c == null) {
            l0 p10 = p(this.f1058a, !this.F);
            this.f1060c = p10;
            p10.setAdapter(this.f1059b);
            this.f1060c.setOnItemClickListener(this.f1073x);
            this.f1060c.setFocusable(true);
            this.f1060c.setFocusableInTouchMode(true);
            this.f1060c.setOnItemSelectedListener(new p0(this));
            this.f1060c.setOnScrollListener(this.A);
            this.G.setContentView(this.f1060c);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.G.getContentView();
        }
        Drawable background = this.G.getBackground();
        int i14 = 0;
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            int i15 = rect.top;
            i10 = rect.bottom + i15;
            if (!this.f1066i) {
                this.f1064g = -i15;
            }
        } else {
            this.D.setEmpty();
            i10 = 0;
        }
        boolean z10 = this.G.getInputMethodMode() == 2;
        View view = this.f1072w;
        int i16 = this.f1064g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = I;
            if (method != null) {
                try {
                    i11 = ((Integer) method.invoke(this.G, new Object[]{view, Integer.valueOf(i16), Boolean.valueOf(z10)})).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i11 = this.G.getMaxAvailableHeight(view, i16);
        } else {
            i11 = a.a(this.G, view, i16, z10);
        }
        if (this.f1061d == -1) {
            i12 = i11 + i10;
        } else {
            int i17 = this.f1062e;
            if (i17 == -2) {
                int i18 = this.f1058a.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.D;
                i13 = View.MeasureSpec.makeMeasureSpec(i18 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i17 != -1) {
                i13 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
            } else {
                int i19 = this.f1058a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.D;
                i13 = View.MeasureSpec.makeMeasureSpec(i19 - (rect3.left + rect3.right), 1073741824);
            }
            int a10 = this.f1060c.a(i13, i11 - 0, -1);
            i12 = a10 + (a10 > 0 ? this.f1060c.getPaddingBottom() + this.f1060c.getPaddingTop() + i10 + 0 : 0);
        }
        boolean z11 = this.G.getInputMethodMode() == 2;
        h.b(this.G, this.f1065h);
        if (!this.G.isShowing()) {
            int i20 = this.f1062e;
            if (i20 == -1) {
                i20 = -1;
            } else if (i20 == -2) {
                i20 = this.f1072w.getWidth();
            }
            int i21 = this.f1061d;
            if (i21 == -1) {
                i12 = -1;
            } else if (i21 != -2) {
                i12 = i21;
            }
            this.G.setWidth(i20);
            this.G.setHeight(i12);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = H;
                if (method2 != null) {
                    try {
                        method2.invoke(this.G, new Object[]{Boolean.TRUE});
                    } catch (Exception unused2) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            } else {
                b.b(this.G, true);
            }
            this.G.setOutsideTouchable(true);
            this.G.setTouchInterceptor(this.f1075z);
            if (this.f1068s) {
                h.a(this.G, this.f1067r);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method3 = J;
                if (method3 != null) {
                    try {
                        method3.invoke(this.G, new Object[]{this.E});
                    } catch (Exception e10) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                    }
                }
            } else {
                b.a(this.G, this.E);
            }
            PopupWindow popupWindow = this.G;
            View view2 = this.f1072w;
            int i22 = this.f1063f;
            int i23 = this.f1064g;
            int i24 = this.f1069t;
            if (Build.VERSION.SDK_INT >= 19) {
                h.a.a(popupWindow, view2, i22, i23, i24);
            } else {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                if ((Gravity.getAbsoluteGravity(i24, c0.e.d(view2)) & 7) == 5) {
                    i22 -= popupWindow.getWidth() - view2.getWidth();
                }
                popupWindow.showAsDropDown(view2, i22, i23);
            }
            this.f1060c.setSelection(-1);
            if ((!this.F || this.f1060c.isInTouchMode()) && (l0Var = this.f1060c) != null) {
                l0Var.setListSelectionHidden(true);
                l0Var.requestLayout();
            }
            if (!this.F) {
                this.C.post(this.B);
            }
        } else if (c0.q(this.f1072w)) {
            int i25 = this.f1062e;
            if (i25 == -1) {
                i25 = -1;
            } else if (i25 == -2) {
                i25 = this.f1072w.getWidth();
            }
            int i26 = this.f1061d;
            if (i26 == -1) {
                if (!z11) {
                    i12 = -1;
                }
                if (z11) {
                    this.G.setWidth(this.f1062e == -1 ? -1 : 0);
                    this.G.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.G;
                    if (this.f1062e == -1) {
                        i14 = -1;
                    }
                    popupWindow2.setWidth(i14);
                    this.G.setHeight(-1);
                }
            } else if (i26 != -2) {
                i12 = i26;
            }
            this.G.setOutsideTouchable(true);
            this.G.update(this.f1072w, this.f1063f, this.f1064g, i25 < 0 ? -1 : i25, i12 < 0 ? -1 : i12);
        }
    }

    public boolean b() {
        return this.G.isShowing();
    }

    public int c() {
        return this.f1063f;
    }

    public void dismiss() {
        this.G.dismiss();
        this.G.setContentView((View) null);
        this.f1060c = null;
        this.C.removeCallbacks(this.f1074y);
    }

    public Drawable e() {
        return this.G.getBackground();
    }

    public ListView f() {
        return this.f1060c;
    }

    public void h(Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    public void i(int i10) {
        this.f1064g = i10;
        this.f1066i = true;
    }

    public void k(int i10) {
        this.f1063f = i10;
    }

    public int m() {
        if (!this.f1066i) {
            return 0;
        }
        return this.f1064g;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1071v;
        if (dataSetObserver == null) {
            this.f1071v = new d();
        } else {
            ListAdapter listAdapter2 = this.f1059b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1059b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1071v);
        }
        l0 l0Var = this.f1060c;
        if (l0Var != null) {
            l0Var.setAdapter(this.f1059b);
        }
    }

    public l0 p(Context context, boolean z10) {
        return new l0(context, z10);
    }

    public void q(int i10) {
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            this.f1062e = rect.left + rect.right + i10;
            return;
        }
        this.f1062e = i10;
    }

    public void r(boolean z10) {
        this.F = z10;
        this.G.setFocusable(z10);
    }
}
