package o0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.widget.d0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o0.d;

/* compiled from: WindowInsetsCompat */
public class o0 {

    /* renamed from: b  reason: collision with root package name */
    public static final o0 f22596b;

    /* renamed from: a  reason: collision with root package name */
    public final k f22597a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* compiled from: WindowInsetsCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f22598a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f22599b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f22600c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f22601d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f22598a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f22599b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f22600c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder a10 = android.support.v4.media.a.a("Failed to get visible insets from AttachInfo ");
                a10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", a10.toString(), e10);
            }
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class d extends c {
        public d() {
        }

        public d(o0 o0Var) {
            super(o0Var);
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final o0 f22609a;

        public e() {
            this(new o0((o0) null));
        }

        public final void a() {
        }

        public o0 b() {
            a();
            return this.f22609a;
        }

        public void c(g0.b bVar) {
        }

        public void d(g0.b bVar) {
        }

        public e(o0 o0Var) {
            this.f22609a = o0Var;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f22610h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f22611i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f22612j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f22613k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f22614l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f22615c;

        /* renamed from: d  reason: collision with root package name */
        public g0.b[] f22616d;

        /* renamed from: e  reason: collision with root package name */
        public g0.b f22617e = null;

        /* renamed from: f  reason: collision with root package name */
        public o0 f22618f;

        /* renamed from: g  reason: collision with root package name */
        public g0.b f22619g;

        public f(o0 o0Var, WindowInsets windowInsets) {
            super(o0Var);
            this.f22615c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        public static void v() {
            try {
                f22611i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f22612j = cls;
                f22613k = cls.getDeclaredField("mVisibleInsets");
                f22614l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f22613k.setAccessible(true);
                f22614l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder a10 = android.support.v4.media.a.a("Failed to get visible insets. (Reflection error). ");
                a10.append(e10.getMessage());
                Log.e("WindowInsetsCompat", a10.toString(), e10);
            }
            f22610h = true;
        }

        public void d(View view) {
            g0.b u10 = u(view);
            if (u10 == null) {
                u10 = g0.b.f18354e;
            }
            w(u10);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            g0.b bVar = this.f22619g;
            g0.b bVar2 = ((f) obj).f22619g;
            if (bVar == bVar2 || (bVar != null && bVar.equals(bVar2))) {
                return true;
            }
            return false;
        }

        public g0.b f(int i10) {
            return r(i10, false);
        }

        public final g0.b j() {
            if (this.f22617e == null) {
                this.f22617e = g0.b.b(this.f22615c.getSystemWindowInsetLeft(), this.f22615c.getSystemWindowInsetTop(), this.f22615c.getSystemWindowInsetRight(), this.f22615c.getSystemWindowInsetBottom());
            }
            return this.f22617e;
        }

        public o0 l(int i10, int i11, int i12, int i13) {
            e eVar;
            o0 k10 = o0.k(this.f22615c);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30) {
                eVar = new d(k10);
            } else if (i14 >= 29) {
                eVar = new c(k10);
            } else if (i14 >= 20) {
                eVar = new b(k10);
            } else {
                eVar = new e(k10);
            }
            eVar.d(o0.g(j(), i10, i11, i12, i13));
            eVar.c(o0.g(h(), i10, i11, i12, i13));
            return eVar.b();
        }

        public boolean n() {
            return this.f22615c.isRound();
        }

        public void o(g0.b[] bVarArr) {
            this.f22616d = bVarArr;
        }

        public void p(o0 o0Var) {
            this.f22618f = o0Var;
        }

        @SuppressLint({"WrongConstant"})
        public final g0.b r(int i10, boolean z10) {
            g0.b bVar = g0.b.f18354e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = g0.b.a(bVar, s(i11, z10));
                }
            }
            return bVar;
        }

        public g0.b s(int i10, boolean z10) {
            int i11;
            d dVar;
            int i12 = 0;
            if (i10 != 1) {
                g0.b bVar = null;
                if (i10 != 2) {
                    if (i10 == 8) {
                        g0.b[] bVarArr = this.f22616d;
                        if (bVarArr != null) {
                            bVar = bVarArr[l.a(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        g0.b j10 = j();
                        g0.b t10 = t();
                        int i13 = j10.f18358d;
                        if (i13 > t10.f18358d) {
                            return g0.b.b(0, 0, 0, i13);
                        }
                        g0.b bVar2 = this.f22619g;
                        if (bVar2 == null || bVar2.equals(g0.b.f18354e) || (i11 = this.f22619g.f18358d) <= t10.f18358d) {
                            return g0.b.f18354e;
                        }
                        return g0.b.b(0, 0, 0, i11);
                    } else if (i10 == 16) {
                        return i();
                    } else {
                        if (i10 == 32) {
                            return g();
                        }
                        if (i10 == 64) {
                            return k();
                        }
                        if (i10 != 128) {
                            return g0.b.f18354e;
                        }
                        o0 o0Var = this.f22618f;
                        if (o0Var != null) {
                            dVar = o0Var.f22597a.e();
                        } else {
                            dVar = e();
                        }
                        if (dVar == null) {
                            return g0.b.f18354e;
                        }
                        int i14 = Build.VERSION.SDK_INT;
                        int d10 = i14 >= 28 ? d.a.d(dVar.f22574a) : 0;
                        int f10 = i14 >= 28 ? d.a.f(dVar.f22574a) : 0;
                        int e10 = i14 >= 28 ? d.a.e(dVar.f22574a) : 0;
                        if (i14 >= 28) {
                            i12 = d.a.c(dVar.f22574a);
                        }
                        return g0.b.b(d10, f10, e10, i12);
                    }
                } else if (z10) {
                    g0.b t11 = t();
                    g0.b h10 = h();
                    return g0.b.b(Math.max(t11.f18355a, h10.f18355a), 0, Math.max(t11.f18357c, h10.f18357c), Math.max(t11.f18358d, h10.f18358d));
                } else {
                    g0.b j11 = j();
                    o0 o0Var2 = this.f22618f;
                    if (o0Var2 != null) {
                        bVar = o0Var2.f22597a.h();
                    }
                    int i15 = j11.f18358d;
                    if (bVar != null) {
                        i15 = Math.min(i15, bVar.f18358d);
                    }
                    return g0.b.b(j11.f18355a, 0, j11.f18357c, i15);
                }
            } else if (z10) {
                return g0.b.b(0, Math.max(t().f18356b, j().f18356b), 0, 0);
            } else {
                return g0.b.b(0, j().f18356b, 0, 0);
            }
        }

        public final g0.b t() {
            o0 o0Var = this.f22618f;
            if (o0Var != null) {
                return o0Var.f22597a.h();
            }
            return g0.b.f18354e;
        }

        public final g0.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f22610h) {
                    v();
                }
                Method method = f22611i;
                if (!(method == null || f22612j == null || f22613k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f22613k.get(f22614l.get(invoke));
                        if (rect != null) {
                            return g0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        StringBuilder a10 = android.support.v4.media.a.a("Failed to get visible insets. (Reflection error). ");
                        a10.append(e10.getMessage());
                        Log.e("WindowInsetsCompat", a10.toString(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void w(g0.b bVar) {
            this.f22619g = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public g0.b f22620m = null;

        public g(o0 o0Var, WindowInsets windowInsets) {
            super(o0Var, windowInsets);
        }

        public o0 b() {
            return o0.k(this.f22615c.consumeStableInsets());
        }

        public o0 c() {
            return o0.k(this.f22615c.consumeSystemWindowInsets());
        }

        public final g0.b h() {
            if (this.f22620m == null) {
                this.f22620m = g0.b.b(this.f22615c.getStableInsetLeft(), this.f22615c.getStableInsetTop(), this.f22615c.getStableInsetRight(), this.f22615c.getStableInsetBottom());
            }
            return this.f22620m;
        }

        public boolean m() {
            return this.f22615c.isConsumed();
        }

        public void q(g0.b bVar) {
            this.f22620m = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class h extends g {
        public h(o0 o0Var, WindowInsets windowInsets) {
            super(o0Var, windowInsets);
        }

        public o0 a() {
            return o0.k(this.f22615c.consumeDisplayCutout());
        }

        public d e() {
            DisplayCutout displayCutout = this.f22615c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new d(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            WindowInsets windowInsets = this.f22615c;
            WindowInsets windowInsets2 = hVar.f22615c;
            if (windowInsets == windowInsets2 || (windowInsets != null && windowInsets.equals(windowInsets2))) {
                g0.b bVar = this.f22619g;
                g0.b bVar2 = hVar.f22619g;
                if (bVar == bVar2 || (bVar != null && bVar.equals(bVar2))) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f22615c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public g0.b f22621n = null;

        /* renamed from: o  reason: collision with root package name */
        public g0.b f22622o = null;

        /* renamed from: p  reason: collision with root package name */
        public g0.b f22623p = null;

        public i(o0 o0Var, WindowInsets windowInsets) {
            super(o0Var, windowInsets);
        }

        public g0.b g() {
            if (this.f22622o == null) {
                this.f22622o = g0.b.c(this.f22615c.getMandatorySystemGestureInsets());
            }
            return this.f22622o;
        }

        public g0.b i() {
            if (this.f22621n == null) {
                this.f22621n = g0.b.c(this.f22615c.getSystemGestureInsets());
            }
            return this.f22621n;
        }

        public g0.b k() {
            if (this.f22623p == null) {
                this.f22623p = g0.b.c(this.f22615c.getTappableElementInsets());
            }
            return this.f22623p;
        }

        public o0 l(int i10, int i11, int i12, int i13) {
            return o0.k(this.f22615c.inset(i10, i11, i12, i13));
        }

        public void q(g0.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final o0 f22624q = o0.k(WindowInsets.CONSUMED);

        public j(o0 o0Var, WindowInsets windowInsets) {
            super(o0Var, windowInsets);
        }

        public final void d(View view) {
        }

        public g0.b f(int i10) {
            return g0.b.c(this.f22615c.getInsets(m.a(i10)));
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final o0 f22625b;

        /* renamed from: a  reason: collision with root package name */
        public final o0 f22626a;

        static {
            e eVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                eVar = new d();
            } else if (i10 >= 29) {
                eVar = new c();
            } else if (i10 >= 20) {
                eVar = new b();
            } else {
                eVar = new e();
            }
            f22625b = eVar.b().f22597a.a().f22597a.b().a();
        }

        public k(o0 o0Var) {
            this.f22626a = o0Var;
        }

        public o0 a() {
            return this.f22626a;
        }

        public o0 b() {
            return this.f22626a;
        }

        public o0 c() {
            return this.f22626a;
        }

        public void d(View view) {
        }

        public d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() != kVar.n() || m() != kVar.m() || !n0.b.a(j(), kVar.j()) || !n0.b.a(h(), kVar.h()) || !n0.b.a(e(), kVar.e())) {
                return false;
            }
            return true;
        }

        public g0.b f(int i10) {
            return g0.b.f18354e;
        }

        public g0.b g() {
            return j();
        }

        public g0.b h() {
            return g0.b.f18354e;
        }

        public int hashCode() {
            return n0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public g0.b i() {
            return j();
        }

        public g0.b j() {
            return g0.b.f18354e;
        }

        public g0.b k() {
            return j();
        }

        public o0 l(int i10, int i11, int i12, int i13) {
            return f22625b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(g0.b[] bVarArr) {
        }

        public void p(o0 o0Var) {
        }

        public void q(g0.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class l {
        public static int a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(d0.a("type needs to be >= FIRST and <= LAST, type=", i10));
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class m {
        public static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets.Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f22596b = j.f22624q;
        } else {
            f22596b = k.f22625b;
        }
    }

    public o0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f22597a = new j(this, windowInsets);
        } else if (i10 >= 29) {
            this.f22597a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f22597a = new h(this, windowInsets);
        } else if (i10 >= 21) {
            this.f22597a = new g(this, windowInsets);
        } else if (i10 >= 20) {
            this.f22597a = new f(this, windowInsets);
        } else {
            this.f22597a = new k(this);
        }
    }

    public static g0.b g(g0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f18355a - i10);
        int max2 = Math.max(0, bVar.f18356b - i11);
        int max3 = Math.max(0, bVar.f18357c - i12);
        int max4 = Math.max(0, bVar.f18358d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return bVar;
        }
        return g0.b.b(max, max2, max3, max4);
    }

    public static o0 k(WindowInsets windowInsets) {
        return l(windowInsets, (View) null);
    }

    public static o0 l(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        o0 o0Var = new o0(windowInsets);
        if (view != null && c0.q(view)) {
            o0Var.f22597a.p(c0.o(view));
            o0Var.f22597a.d(view.getRootView());
        }
        return o0Var;
    }

    @Deprecated
    public o0 a() {
        return this.f22597a.c();
    }

    public g0.b b(int i10) {
        return this.f22597a.f(i10);
    }

    @Deprecated
    public int c() {
        return this.f22597a.j().f18358d;
    }

    @Deprecated
    public int d() {
        return this.f22597a.j().f18355a;
    }

    @Deprecated
    public int e() {
        return this.f22597a.j().f18357c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        return n0.b.a(this.f22597a, ((o0) obj).f22597a);
    }

    @Deprecated
    public int f() {
        return this.f22597a.j().f18356b;
    }

    public boolean h() {
        return this.f22597a.m();
    }

    public int hashCode() {
        k kVar = this.f22597a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    @Deprecated
    public o0 i(int i10, int i11, int i12, int i13) {
        e eVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            eVar = new d(this);
        } else if (i14 >= 29) {
            eVar = new c(this);
        } else if (i14 >= 20) {
            eVar = new b(this);
        } else {
            eVar = new e(this);
        }
        eVar.d(g0.b.b(i10, i11, i12, i13));
        return eVar.b();
    }

    public WindowInsets j() {
        k kVar = this.f22597a;
        if (kVar instanceof f) {
            return ((f) kVar).f22615c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat */
    public static class b extends e {

        /* renamed from: d  reason: collision with root package name */
        public static Field f22602d = null;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f22603e = false;

        /* renamed from: f  reason: collision with root package name */
        public static Constructor<WindowInsets> f22604f = null;

        /* renamed from: g  reason: collision with root package name */
        public static boolean f22605g = false;

        /* renamed from: b  reason: collision with root package name */
        public WindowInsets f22606b;

        /* renamed from: c  reason: collision with root package name */
        public g0.b f22607c;

        public b() {
            this.f22606b = e();
        }

        public static WindowInsets e() {
            if (!f22603e) {
                try {
                    f22602d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f22603e = true;
            }
            Field field = f22602d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f22605g) {
                try {
                    f22604f = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f22605g = true;
            }
            Constructor<WindowInsets> constructor = f22604f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        public o0 b() {
            a();
            o0 k10 = o0.k(this.f22606b);
            k10.f22597a.o((g0.b[]) null);
            k10.f22597a.q(this.f22607c);
            return k10;
        }

        public void c(g0.b bVar) {
            this.f22607c = bVar;
        }

        public void d(g0.b bVar) {
            WindowInsets windowInsets = this.f22606b;
            if (windowInsets != null) {
                this.f22606b = windowInsets.replaceSystemWindowInsets(bVar.f18355a, bVar.f18356b, bVar.f18357c, bVar.f18358d);
            }
        }

        public b(o0 o0Var) {
            super(o0Var);
            this.f22606b = o0Var.j();
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f22608b;

        public c() {
            this.f22608b = new WindowInsets.Builder();
        }

        public o0 b() {
            a();
            o0 k10 = o0.k(this.f22608b.build());
            k10.f22597a.o((g0.b[]) null);
            return k10;
        }

        public void c(g0.b bVar) {
            this.f22608b.setStableInsets(bVar.d());
        }

        public void d(g0.b bVar) {
            this.f22608b.setSystemWindowInsets(bVar.d());
        }

        public c(o0 o0Var) {
            super(o0Var);
            WindowInsets.Builder builder;
            WindowInsets j10 = o0Var.j();
            if (j10 != null) {
                builder = new WindowInsets.Builder(j10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f22608b = builder;
        }
    }

    public o0(o0 o0Var) {
        this.f22597a = new k(this);
    }
}
