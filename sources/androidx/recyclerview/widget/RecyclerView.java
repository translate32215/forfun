package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.y0;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.z;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;
import o0.e0;
import p0.c;

public class RecyclerView extends ViewGroup implements o0.m {
    public static final int[] M0 = {16843830};
    public static final boolean N0;
    public static final boolean O0;
    public static final boolean P0 = true;
    public static final boolean Q0;
    public static final Class<?>[] R0;
    public static final Interpolator S0 = new c();
    public boolean A;
    public h A0;
    public boolean B;
    public final int[] B0;
    public boolean C;
    public o0.n C0;
    public int D;
    public final int[] D0;
    public boolean E;
    public final int[] E0;
    public boolean F;
    public final int[] F0;
    public boolean G;
    public final List<a0> G0;
    public int H;
    public Runnable H0;
    public boolean I;
    public boolean I0;
    public final AccessibilityManager J;
    public int J0;
    public boolean K;
    public int K0;
    public boolean L;
    public final a0.b L0;
    public int M;
    public int N;
    public i O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public EdgeEffect R;
    public EdgeEffect S;

    /* renamed from: a  reason: collision with root package name */
    public final u f2796a;

    /* renamed from: a0  reason: collision with root package name */
    public j f2797a0;

    /* renamed from: b  reason: collision with root package name */
    public final s f2798b;

    /* renamed from: b0  reason: collision with root package name */
    public int f2799b0;

    /* renamed from: c  reason: collision with root package name */
    public v f2800c;

    /* renamed from: c0  reason: collision with root package name */
    public int f2801c0;

    /* renamed from: d  reason: collision with root package name */
    public a f2802d;

    /* renamed from: d0  reason: collision with root package name */
    public VelocityTracker f2803d0;

    /* renamed from: e  reason: collision with root package name */
    public c f2804e;

    /* renamed from: e0  reason: collision with root package name */
    public int f2805e0;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f2806f;

    /* renamed from: f0  reason: collision with root package name */
    public int f2807f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2808g;

    /* renamed from: g0  reason: collision with root package name */
    public int f2809g0;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f2810h;

    /* renamed from: h0  reason: collision with root package name */
    public int f2811h0;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f2812i;

    /* renamed from: i0  reason: collision with root package name */
    public int f2813i0;

    /* renamed from: j0  reason: collision with root package name */
    public o f2814j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f2815k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f2816l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f2817m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f2818n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f2819o0;

    /* renamed from: p0  reason: collision with root package name */
    public final z f2820p0;

    /* renamed from: q0  reason: collision with root package name */
    public k f2821q0;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f2822r;

    /* renamed from: r0  reason: collision with root package name */
    public k.b f2823r0;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f2824s;

    /* renamed from: s0  reason: collision with root package name */
    public final x f2825s0;

    /* renamed from: t  reason: collision with root package name */
    public e f2826t;

    /* renamed from: t0  reason: collision with root package name */
    public q f2827t0;

    /* renamed from: u  reason: collision with root package name */
    public m f2828u;

    /* renamed from: u0  reason: collision with root package name */
    public List<q> f2829u0;

    /* renamed from: v  reason: collision with root package name */
    public t f2830v;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f2831v0;

    /* renamed from: w  reason: collision with root package name */
    public final List<t> f2832w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f2833w0;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<l> f2834x;

    /* renamed from: x0  reason: collision with root package name */
    public j.b f2835x0;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<p> f2836y;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f2837y0;

    /* renamed from: z  reason: collision with root package name */
    public p f2838z;

    /* renamed from: z0  reason: collision with root package name */
    public v f2839z0;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.A) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.F) {
                    recyclerView2.E = true;
                } else {
                    recyclerView2.n();
                }
            }
        }
    }

    public static abstract class a0 {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f2841t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f2842a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f2843b;

        /* renamed from: c  reason: collision with root package name */
        public int f2844c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2845d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f2846e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2847f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2848g = -1;

        /* renamed from: h  reason: collision with root package name */
        public a0 f2849h = null;

        /* renamed from: i  reason: collision with root package name */
        public a0 f2850i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f2851j;

        /* renamed from: k  reason: collision with root package name */
        public List<Object> f2852k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f2853l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f2854m = 0;

        /* renamed from: n  reason: collision with root package name */
        public s f2855n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2856o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f2857p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f2858q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f2859r;

        /* renamed from: s  reason: collision with root package name */
        public e<? extends a0> f2860s;

        public a0(View view) {
            if (view != null) {
                this.f2842a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void b(Object obj) {
            if (obj == null) {
                c(1024);
            } else if ((1024 & this.f2851j) == 0) {
                if (this.f2852k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f2852k = arrayList;
                    this.f2853l = Collections.unmodifiableList(arrayList);
                }
                this.f2852k.add(obj);
            }
        }

        public void c(int i10) {
            this.f2851j = i10 | this.f2851j;
        }

        public void d() {
            this.f2845d = -1;
            this.f2848g = -1;
        }

        public void e() {
            this.f2851j &= -33;
        }

        public final int f() {
            RecyclerView recyclerView = this.f2859r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.I(this);
        }

        public final int g() {
            RecyclerView recyclerView;
            e<? extends a0> adapter;
            int I;
            if (this.f2860s == null || (recyclerView = this.f2859r) == null || (adapter = recyclerView.getAdapter()) == null || (I = this.f2859r.I(this)) == -1 || this.f2860s != adapter) {
                return -1;
            }
            return I;
        }

        public final int h() {
            int i10 = this.f2848g;
            return i10 == -1 ? this.f2844c : i10;
        }

        public List<Object> i() {
            if ((this.f2851j & 1024) != 0) {
                return f2841t;
            }
            List<Object> list = this.f2852k;
            if (list == null || list.size() == 0) {
                return f2841t;
            }
            return this.f2853l;
        }

        public boolean j(int i10) {
            return (i10 & this.f2851j) != 0;
        }

        public boolean k() {
            return (this.f2842a.getParent() == null || this.f2842a.getParent() == this.f2859r) ? false : true;
        }

        public boolean l() {
            return (this.f2851j & 1) != 0;
        }

        public boolean m() {
            return (this.f2851j & 4) != 0;
        }

        public final boolean n() {
            if ((this.f2851j & 16) == 0) {
                View view = this.f2842a;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                if (!c0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean o() {
            return (this.f2851j & 8) != 0;
        }

        public boolean p() {
            return this.f2855n != null;
        }

        public boolean q() {
            return (this.f2851j & 256) != 0;
        }

        public boolean r() {
            return (this.f2851j & 2) != 0;
        }

        public boolean s() {
            return (this.f2851j & 2) != 0;
        }

        public void t(int i10, boolean z10) {
            if (this.f2845d == -1) {
                this.f2845d = this.f2844c;
            }
            if (this.f2848g == -1) {
                this.f2848g = this.f2844c;
            }
            if (z10) {
                this.f2848g += i10;
            }
            this.f2844c += i10;
            if (this.f2842a.getLayoutParams() != null) {
                ((n) this.f2842a.getLayoutParams()).f2898c = true;
            }
        }

        public String toString() {
            StringBuilder a10 = t.f.a(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            a10.append(Integer.toHexString(hashCode()));
            a10.append(" position=");
            a10.append(this.f2844c);
            a10.append(" id=");
            a10.append(this.f2846e);
            a10.append(", oldPos=");
            a10.append(this.f2845d);
            a10.append(", pLpos:");
            a10.append(this.f2848g);
            StringBuilder sb2 = new StringBuilder(a10.toString());
            if (p()) {
                sb2.append(" scrap ");
                sb2.append(this.f2856o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m()) {
                sb2.append(" invalid");
            }
            if (!l()) {
                sb2.append(" unbound");
            }
            if (s()) {
                sb2.append(" update");
            }
            if (o()) {
                sb2.append(" removed");
            }
            if (x()) {
                sb2.append(" ignored");
            }
            if (q()) {
                sb2.append(" tmpDetached");
            }
            if (!n()) {
                StringBuilder a11 = android.support.v4.media.a.a(" not recyclable(");
                a11.append(this.f2854m);
                a11.append(")");
                sb2.append(a11.toString());
            }
            if ((this.f2851j & 512) != 0 || m()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2842a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void u() {
            this.f2851j = 0;
            this.f2844c = -1;
            this.f2845d = -1;
            this.f2846e = -1;
            this.f2848g = -1;
            this.f2854m = 0;
            this.f2849h = null;
            this.f2850i = null;
            List<Object> list = this.f2852k;
            if (list != null) {
                list.clear();
            }
            this.f2851j &= -1025;
            this.f2857p = 0;
            this.f2858q = -1;
            RecyclerView.k(this);
        }

        public void v(int i10, int i11) {
            this.f2851j = (i10 & i11) | (this.f2851j & (i11 ^ -1));
        }

        public final void w(boolean z10) {
            int i10 = this.f2854m;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f2854m = i11;
            if (i11 < 0) {
                this.f2854m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.f2851j |= 16;
            } else if (z10 && i11 == 0) {
                this.f2851j &= -17;
            }
        }

        public boolean x() {
            return (this.f2851j & 128) != 0;
        }

        public boolean y() {
            return (this.f2851j & 32) != 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            j jVar = RecyclerView.this.f2797a0;
            if (jVar != null) {
                jVar.j();
            }
            RecyclerView.this.f2837y0 = false;
        }
    }

    public class c implements Interpolator {
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class d implements a0.b {
        public d() {
        }

        public void a(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z10;
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.getClass();
            a0Var.w(false);
            x xVar = (x) recyclerView.f2797a0;
            xVar.getClass();
            if (cVar == null || ((i10 = cVar.f2872a) == (i11 = cVar2.f2872a) && cVar.f2873b == cVar2.f2873b)) {
                z10 = xVar.k(a0Var);
            } else {
                z10 = xVar.m(a0Var, i10, cVar.f2873b, i11, cVar2.f2873b);
            }
            if (z10) {
                recyclerView.W();
            }
        }

        public void b(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z10;
            RecyclerView.this.f2798b.m(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(a0Var);
            a0Var.w(false);
            x xVar = (x) recyclerView.f2797a0;
            xVar.getClass();
            int i10 = cVar.f2872a;
            int i11 = cVar.f2873b;
            View view = a0Var.f2842a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f2872a;
            int top = cVar2 == null ? view.getTop() : cVar2.f2873b;
            if (a0Var.o() || (i10 == left && i11 == top)) {
                z10 = xVar.n(a0Var);
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z10 = xVar.m(a0Var, i10, i11, left, top);
            }
            if (z10) {
                recyclerView.W();
            }
        }
    }

    public static abstract class e<VH extends a0> {

        /* renamed from: a  reason: collision with root package name */
        public final f f2863a = new f();

        /* renamed from: b  reason: collision with root package name */
        public boolean f2864b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f2865c = 1;

        public abstract int b();

        public long c(int i10) {
            return -1;
        }

        public int d(int i10) {
            return 0;
        }

        public abstract void e(VH vh, int i10);

        public void f(VH vh, int i10, List<Object> list) {
            e(vh, i10);
        }

        public abstract VH g(ViewGroup viewGroup, int i10);

        public boolean h(VH vh) {
            return false;
        }

        public void i(VH vh) {
        }

        public void j(VH vh) {
        }

        public void k(VH vh) {
        }
    }

    public static class f extends Observable<g> {
        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            int size = this.mObservers.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((g) this.mObservers.get(size)).b(i10, i11, (Object) null);
                } else {
                    return;
                }
            }
        }

        public void d(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).c(i10, i11);
            }
        }

        public void e(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).d(i10, i11);
            }
        }
    }

    public static abstract class g {
        public void a() {
        }

        public void b(int i10, int i11, Object obj) {
        }

        public void c(int i10, int i11) {
        }

        public void d(int i10, int i11) {
        }
    }

    public interface h {
        int a(int i10, int i11);
    }

    public static class i {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public b f2866a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f2867b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f2868c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f2869d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f2870e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f2871f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f2872a;

            /* renamed from: b  reason: collision with root package name */
            public int f2873b;
        }

        public static int b(a0 a0Var) {
            int i10 = a0Var.f2851j & 14;
            if (a0Var.m()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int i11 = a0Var.f2845d;
            int f10 = a0Var.f();
            return (i11 == -1 || f10 == -1 || i11 == f10) ? i10 : i10 | 2048;
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, c cVar, c cVar2);

        public boolean c(a0 a0Var, List<Object> list) {
            return !((x) this).f3144g || a0Var.m();
        }

        public final void d(a0 a0Var) {
            b bVar = this.f2866a;
            if (bVar != null) {
                k kVar = (k) bVar;
                kVar.getClass();
                boolean z10 = true;
                a0Var.w(true);
                if (a0Var.f2849h != null && a0Var.f2850i == null) {
                    a0Var.f2849h = null;
                }
                a0Var.f2850i = null;
                if (!((a0Var.f2851j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = a0Var.f2842a;
                    recyclerView.l0();
                    c cVar = recyclerView.f2804e;
                    int indexOfChild = ((t) cVar.f3012a).f3138a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        cVar.l(view);
                    } else if (cVar.f3013b.d(indexOfChild)) {
                        cVar.f3013b.f(indexOfChild);
                        cVar.l(view);
                        ((t) cVar.f3012a).c(indexOfChild);
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        a0 L = RecyclerView.L(view);
                        recyclerView.f2798b.m(L);
                        recyclerView.f2798b.j(L);
                    }
                    recyclerView.n0(!z10);
                    if (!z10 && a0Var.q()) {
                        RecyclerView.this.removeDetachedView(a0Var.f2842a, false);
                    }
                }
            }
        }

        public final void e() {
            int size = this.f2867b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f2867b.get(i10).a();
            }
            this.f2867b.clear();
        }

        public abstract void f(a0 a0Var);

        public abstract void g();

        public abstract boolean h();

        public c i(a0 a0Var) {
            c cVar = new c();
            View view = a0Var.f2842a;
            cVar.f2872a = view.getLeft();
            cVar.f2873b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        public abstract void j();
    }

    public class k implements j.b {
        public k() {
        }
    }

    public static abstract class l {
        public void d(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }
    }

    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        public c f2875a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f2876b;

        /* renamed from: c  reason: collision with root package name */
        public z f2877c;

        /* renamed from: d  reason: collision with root package name */
        public z f2878d;

        /* renamed from: e  reason: collision with root package name */
        public w f2879e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2880f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2881g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2882h = true;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2883i = true;

        /* renamed from: j  reason: collision with root package name */
        public int f2884j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2885k;

        /* renamed from: l  reason: collision with root package name */
        public int f2886l;

        /* renamed from: m  reason: collision with root package name */
        public int f2887m;

        /* renamed from: n  reason: collision with root package name */
        public int f2888n;

        /* renamed from: o  reason: collision with root package name */
        public int f2889o;

        public class a implements z.b {
            public a() {
            }

            public int a() {
                m mVar = m.this;
                return mVar.f2888n - mVar.R();
            }

            public int b(View view) {
                return m.this.F(view) - ((n) view.getLayoutParams()).leftMargin;
            }

            public View c(int i10) {
                return m.this.z(i10);
            }

            public int d() {
                return m.this.Q();
            }

            public int e(View view) {
                return m.this.I(view) + ((n) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements z.b {
            public b() {
            }

            public int a() {
                m mVar = m.this;
                return mVar.f2889o - mVar.P();
            }

            public int b(View view) {
                return m.this.J(view) - ((n) view.getLayoutParams()).topMargin;
            }

            public View c(int i10) {
                return m.this.z(i10);
            }

            public int d() {
                return m.this.S();
            }

            public int e(View view) {
                return m.this.D(view) + ((n) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f2892a;

            /* renamed from: b  reason: collision with root package name */
            public int f2893b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f2894c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f2895d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.f2877c = new z(aVar);
            this.f2878d = new z(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int B(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.B(int, int, int, int, boolean):int");
        }

        public static d U(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s1.a.f24901a, i10, i11);
            dVar.f2892a = obtainStyledAttributes.getInt(0, 1);
            dVar.f2893b = obtainStyledAttributes.getInt(10, 1);
            dVar.f2894c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f2895d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean Z(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        public static int j(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        public int A() {
            c cVar = this.f2875a;
            if (cVar != null) {
                return cVar.e();
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean A0(androidx.recyclerview.widget.RecyclerView.s r8, androidx.recyclerview.widget.RecyclerView.x r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f2876b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x003e
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x006b
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0027
                int r8 = r7.f2889o
                int r11 = r7.S()
                int r8 = r8 - r11
                int r11 = r7.P()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x0028
            L_0x0027:
                r8 = 0
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f2876b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.f2888n
                int r11 = r7.Q()
                int r10 = r10 - r11
                int r11 = r7.R()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x0066
            L_0x003e:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0051
                int r8 = r7.f2889o
                int r10 = r7.S()
                int r8 = r8 - r10
                int r10 = r7.P()
                int r8 = r8 - r10
                goto L_0x0052
            L_0x0051:
                r8 = 0
            L_0x0052:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f2876b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.f2888n
                int r11 = r7.Q()
                int r10 = r10 - r11
                int r11 = r7.R()
                int r10 = r10 - r11
            L_0x0066:
                r3 = r8
                r2 = r10
                goto L_0x006b
            L_0x0069:
                r3 = r8
                r2 = 0
            L_0x006b:
                if (r3 != 0) goto L_0x0070
                if (r2 != 0) goto L_0x0070
                return r9
            L_0x0070:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f2876b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.j0(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.A0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, int, android.os.Bundle):boolean");
        }

        public void B0(s sVar) {
            for (int A = A() - 1; A >= 0; A--) {
                if (!RecyclerView.L(z(A)).x()) {
                    E0(A, sVar);
                }
            }
        }

        public int C(s sVar, x xVar) {
            return -1;
        }

        public void C0(s sVar) {
            int size = sVar.f2906a.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = sVar.f2906a.get(i10).f2842a;
                a0 L = RecyclerView.L(view);
                if (!L.x()) {
                    L.w(false);
                    if (L.q()) {
                        this.f2876b.removeDetachedView(view, false);
                    }
                    j jVar = this.f2876b.f2797a0;
                    if (jVar != null) {
                        jVar.f(L);
                    }
                    L.w(true);
                    a0 L2 = RecyclerView.L(view);
                    L2.f2855n = null;
                    L2.f2856o = false;
                    L2.e();
                    sVar.j(L2);
                }
            }
            sVar.f2906a.clear();
            ArrayList<a0> arrayList = sVar.f2907b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f2876b.invalidate();
            }
        }

        public int D(View view) {
            return view.getBottom() + ((n) view.getLayoutParams()).f2897b.bottom;
        }

        public void D0(View view, s sVar) {
            c cVar = this.f2875a;
            int indexOfChild = ((t) cVar.f3012a).f3138a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (cVar.f3013b.f(indexOfChild)) {
                    cVar.l(view);
                }
                ((t) cVar.f3012a).c(indexOfChild);
            }
            sVar.i(view);
        }

        public void E(View view, Rect rect) {
            int[] iArr = RecyclerView.M0;
            n nVar = (n) view.getLayoutParams();
            Rect rect2 = nVar.f2897b;
            rect.set((view.getLeft() - rect2.left) - nVar.leftMargin, (view.getTop() - rect2.top) - nVar.topMargin, view.getRight() + rect2.right + nVar.rightMargin, view.getBottom() + rect2.bottom + nVar.bottomMargin);
        }

        public void E0(int i10, s sVar) {
            View z10 = z(i10);
            F0(i10);
            sVar.i(z10);
        }

        public int F(View view) {
            return view.getLeft() - ((n) view.getLayoutParams()).f2897b.left;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.f2875a;
            r4 = r0.f(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void F0(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.z(r4)
                if (r0 == 0) goto L_0x0029
                androidx.recyclerview.widget.c r0 = r3.f2875a
                int r4 = r0.f(r4)
                androidx.recyclerview.widget.c$b r1 = r0.f3012a
                androidx.recyclerview.widget.t r1 = (androidx.recyclerview.widget.t) r1
                android.view.View r1 = r1.a(r4)
                if (r1 != 0) goto L_0x0017
                goto L_0x0029
            L_0x0017:
                androidx.recyclerview.widget.c$a r2 = r0.f3013b
                boolean r2 = r2.f(r4)
                if (r2 == 0) goto L_0x0022
                r0.l(r1)
            L_0x0022:
                androidx.recyclerview.widget.c$b r0 = r0.f3012a
                androidx.recyclerview.widget.t r0 = (androidx.recyclerview.widget.t) r0
                r0.c(r4)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.F0(int):void");
        }

        public int G(View view) {
            Rect rect = ((n) view.getLayoutParams()).f2897b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public boolean G0(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return H0(recyclerView, view, rect, z10, false);
        }

        public int H(View view) {
            Rect rect = ((n) view.getLayoutParams()).f2897b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
            if (r14 == false) goto L_0x00ba;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean H0(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.Q()
                int r2 = r9.S()
                int r3 = r9.f2888n
                int r4 = r9.R()
                int r3 = r3 - r4
                int r4 = r9.f2889o
                int r5 = r9.P()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                int r4 = r9.M()
                r8 = 1
                if (r4 != r8) goto L_0x005f
                if (r3 == 0) goto L_0x005a
                goto L_0x0067
            L_0x005a:
                int r3 = java.lang.Math.max(r7, r11)
                goto L_0x0067
            L_0x005f:
                if (r7 == 0) goto L_0x0062
                goto L_0x0066
            L_0x0062:
                int r7 = java.lang.Math.min(r5, r3)
            L_0x0066:
                r3 = r7
            L_0x0067:
                if (r2 == 0) goto L_0x006a
                goto L_0x006e
            L_0x006a:
                int r2 = java.lang.Math.min(r6, r12)
            L_0x006e:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto L_0x00b5
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L_0x0080
            L_0x007e:
                r14 = 0
                goto L_0x00b3
            L_0x0080:
                int r0 = r9.Q()
                int r2 = r9.S()
                int r3 = r9.f2888n
                int r4 = r9.R()
                int r3 = r3 - r4
                int r4 = r9.f2889o
                int r5 = r9.P()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.f2876b
                android.graphics.Rect r5 = r5.f2812i
                r9.E(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto L_0x007e
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto L_0x007e
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto L_0x007e
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto L_0x00b2
                goto L_0x007e
            L_0x00b2:
                r14 = 1
            L_0x00b3:
                if (r14 == 0) goto L_0x00ba
            L_0x00b5:
                if (r11 != 0) goto L_0x00bb
                if (r12 == 0) goto L_0x00ba
                goto L_0x00bb
            L_0x00ba:
                return r1
            L_0x00bb:
                if (r13 == 0) goto L_0x00c1
                r10.scrollBy(r11, r12)
                goto L_0x00c4
            L_0x00c1:
                r10.i0(r11, r12)
            L_0x00c4:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.H0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int I(View view) {
            return view.getRight() + ((n) view.getLayoutParams()).f2897b.right;
        }

        public void I0() {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int J(View view) {
            return view.getTop() - ((n) view.getLayoutParams()).f2897b.top;
        }

        public final void J0(s sVar, int i10, View view) {
            a0 L = RecyclerView.L(view);
            if (!L.x()) {
                if (!L.m() || L.o() || this.f2876b.f2826t.f2864b) {
                    z(i10);
                    this.f2875a.c(i10);
                    sVar.k(view);
                    this.f2876b.f2806f.f(L);
                    return;
                }
                F0(i10);
                sVar.j(L);
            }
        }

        public View K() {
            View focusedChild;
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2875a.f3014c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int K0(int i10, s sVar, x xVar) {
            return 0;
        }

        public int L() {
            RecyclerView recyclerView = this.f2876b;
            e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.b();
            }
            return 0;
        }

        public void L0(int i10) {
        }

        public int M() {
            RecyclerView recyclerView = this.f2876b;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            return c0.e.d(recyclerView);
        }

        public int M0(int i10, s sVar, x xVar) {
            return 0;
        }

        public int N() {
            RecyclerView recyclerView = this.f2876b;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            return c0.d.d(recyclerView);
        }

        public void N0(RecyclerView recyclerView) {
            O0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int O() {
            RecyclerView recyclerView = this.f2876b;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            return c0.d.e(recyclerView);
        }

        public void O0(int i10, int i11) {
            this.f2888n = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f2886l = mode;
            if (mode == 0 && !RecyclerView.O0) {
                this.f2888n = 0;
            }
            this.f2889o = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2887m = mode2;
            if (mode2 == 0 && !RecyclerView.O0) {
                this.f2889o = 0;
            }
        }

        public int P() {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void P0(Rect rect, int i10, int i11) {
            int R = R() + Q() + rect.width();
            int P = P() + S() + rect.height();
            this.f2876b.setMeasuredDimension(j(i10, R, O()), j(i11, P, N()));
        }

        public int Q() {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void Q0(int i10, int i11) {
            int A = A();
            if (A == 0) {
                this.f2876b.o(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < A; i16++) {
                View z10 = z(i16);
                Rect rect = this.f2876b.f2812i;
                E(z10, rect);
                int i17 = rect.left;
                if (i17 < i14) {
                    i14 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i15) {
                    i15 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i13) {
                    i13 = i20;
                }
            }
            this.f2876b.f2812i.set(i14, i15, i12, i13);
            P0(this.f2876b.f2812i, i10, i11);
        }

        public int R() {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void R0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f2876b = null;
                this.f2875a = null;
                this.f2888n = 0;
                this.f2889o = 0;
            } else {
                this.f2876b = recyclerView;
                this.f2875a = recyclerView.f2804e;
                this.f2888n = recyclerView.getWidth();
                this.f2889o = recyclerView.getHeight();
            }
            this.f2886l = 1073741824;
            this.f2887m = 1073741824;
        }

        public int S() {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean S0(View view, int i10, int i11, n nVar) {
            return view.isLayoutRequested() || !this.f2882h || !Z(view.getWidth(), i10, nVar.width) || !Z(view.getHeight(), i11, nVar.height);
        }

        public int T(View view) {
            return ((n) view.getLayoutParams()).b();
        }

        public boolean T0() {
            return false;
        }

        public boolean U0(View view, int i10, int i11, n nVar) {
            return !this.f2882h || !Z(view.getMeasuredWidth(), i10, nVar.width) || !Z(view.getMeasuredHeight(), i11, nVar.height);
        }

        public int V(s sVar, x xVar) {
            return -1;
        }

        public void V0(RecyclerView recyclerView, x xVar, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void W(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((n) view.getLayoutParams()).f2897b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f2876b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f2876b.f2824s;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void W0(w wVar) {
            w wVar2 = this.f2879e;
            if (!(wVar2 == null || wVar == wVar2 || !wVar2.f2920e)) {
                wVar2.f();
            }
            this.f2879e = wVar;
            RecyclerView recyclerView = this.f2876b;
            wVar.getClass();
            recyclerView.f2820p0.c();
            if (wVar.f2923h) {
                StringBuilder a10 = android.support.v4.media.a.a("An instance of ");
                a10.append(wVar.getClass().getSimpleName());
                a10.append(" was started more than once. Each instance of");
                a10.append(wVar.getClass().getSimpleName());
                a10.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", a10.toString());
            }
            wVar.f2917b = recyclerView;
            wVar.f2918c = this;
            int i10 = wVar.f2916a;
            if (i10 != -1) {
                recyclerView.f2825s0.f2931a = i10;
                wVar.f2920e = true;
                wVar.f2919d = true;
                wVar.f2921f = wVar.b(i10);
                wVar.f2917b.f2820p0.a();
                wVar.f2923h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public boolean X() {
            RecyclerView recyclerView = this.f2876b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public boolean X0() {
            return this instanceof androidx.leanback.widget.p;
        }

        public boolean Y() {
            return false;
        }

        public boolean a0() {
            w wVar = this.f2879e;
            return wVar != null && wVar.f2920e;
        }

        public void b(View view) {
            d(view, -1, true);
        }

        public void b0(View view, int i10, int i11, int i12, int i13) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f2897b;
            view.layout(i10 + rect.left + nVar.leftMargin, i11 + rect.top + nVar.topMargin, (i12 - rect.right) - nVar.rightMargin, (i13 - rect.bottom) - nVar.bottomMargin);
        }

        public void c(View view) {
            d(view, -1, false);
        }

        public void c0(int i10) {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2804e.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f2804e.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public final void d(View view, int i10, boolean z10) {
            a0 L = RecyclerView.L(view);
            if (z10 || L.o()) {
                this.f2876b.f2806f.a(L);
            } else {
                this.f2876b.f2806f.f(L);
            }
            n nVar = (n) view.getLayoutParams();
            if (L.y() || L.p()) {
                if (L.p()) {
                    L.f2855n.m(L);
                } else {
                    L.e();
                }
                this.f2875a.b(view, i10, view.getLayoutParams(), false);
            } else {
                int i11 = -1;
                if (view.getParent() == this.f2876b) {
                    int j10 = this.f2875a.j(view);
                    if (i10 == -1) {
                        i10 = this.f2875a.e();
                    }
                    if (j10 == -1) {
                        StringBuilder a10 = android.support.v4.media.a.a("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        a10.append(this.f2876b.indexOfChild(view));
                        throw new IllegalStateException(b.a(this.f2876b, a10));
                    } else if (j10 != i10) {
                        m mVar = this.f2876b.f2828u;
                        View z11 = mVar.z(j10);
                        if (z11 != null) {
                            mVar.z(j10);
                            mVar.f2875a.c(j10);
                            n nVar2 = (n) z11.getLayoutParams();
                            a0 L2 = RecyclerView.L(z11);
                            if (L2.o()) {
                                mVar.f2876b.f2806f.a(L2);
                            } else {
                                mVar.f2876b.f2806f.f(L2);
                            }
                            mVar.f2875a.b(z11, i10, nVar2, L2.o());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j10 + mVar.f2876b.toString());
                        }
                    }
                } else {
                    this.f2875a.a(view, i10, false);
                    nVar.f2898c = true;
                    w wVar = this.f2879e;
                    if (wVar != null && wVar.f2920e) {
                        wVar.f2917b.getClass();
                        a0 L3 = RecyclerView.L(view);
                        if (L3 != null) {
                            i11 = L3.h();
                        }
                        if (i11 == wVar.f2916a) {
                            wVar.f2921f = view;
                        }
                    }
                }
            }
            if (nVar.f2899d) {
                L.f2842a.invalidate();
                nVar.f2899d = false;
            }
        }

        public void d0(int i10) {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2804e.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f2804e.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void e(String str) {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void e0(e eVar, e eVar2) {
        }

        public void f(View view, Rect rect) {
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.M(view));
            }
        }

        public boolean f0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public boolean g() {
            return false;
        }

        public void g0(RecyclerView recyclerView, s sVar) {
        }

        public boolean h() {
            return false;
        }

        public View h0(View view, int i10, s sVar, x xVar) {
            return null;
        }

        public boolean i(n nVar) {
            return nVar != null;
        }

        public void i0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2876b;
            s sVar = recyclerView.f2798b;
            x xVar = recyclerView.f2825s0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f2876b.canScrollVertically(-1) && !this.f2876b.canScrollHorizontally(-1) && !this.f2876b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                e eVar = this.f2876b.f2826t;
                if (eVar != null) {
                    accessibilityEvent.setItemCount(eVar.b());
                }
            }
        }

        public void j0(s sVar, x xVar, p0.c cVar) {
            if (this.f2876b.canScrollVertically(-1) || this.f2876b.canScrollHorizontally(-1)) {
                cVar.f23748a.addAction(8192);
                cVar.f23748a.setScrollable(true);
            }
            if (this.f2876b.canScrollVertically(1) || this.f2876b.canScrollHorizontally(1)) {
                cVar.f23748a.addAction(4096);
                cVar.f23748a.setScrollable(true);
            }
            cVar.m(c.b.a(V(sVar, xVar), C(sVar, xVar), false, 0));
        }

        public void k(int i10, int i11, x xVar, c cVar) {
        }

        public void k0(View view, p0.c cVar) {
            a0 L = RecyclerView.L(view);
            if (L != null && !L.o() && !this.f2875a.k(L.f2842a)) {
                RecyclerView recyclerView = this.f2876b;
                l0(recyclerView.f2798b, recyclerView.f2825s0, view, cVar);
            }
        }

        public void l(int i10, c cVar) {
        }

        public void l0(s sVar, x xVar, View view, p0.c cVar) {
        }

        public int m(x xVar) {
            return 0;
        }

        public View m0(View view, int i10) {
            return null;
        }

        public int n(x xVar) {
            return 0;
        }

        public void n0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int o(x xVar) {
            return 0;
        }

        public void o0(RecyclerView recyclerView) {
        }

        public int p(x xVar) {
            return 0;
        }

        public void p0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int q(x xVar) {
            return 0;
        }

        public void q0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int r(x xVar) {
            return 0;
        }

        public void r0(RecyclerView recyclerView, int i10, int i11) {
        }

        public void s(s sVar) {
            for (int A = A() - 1; A >= 0; A--) {
                J0(sVar, A, z(A));
            }
        }

        public void s0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            r0(recyclerView, i10, i11);
        }

        public void t(View view, s sVar) {
            J0(sVar, this.f2875a.j(view), view);
        }

        public void t0(s sVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public View u(View view) {
            View C;
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView == null || (C = recyclerView.C(view)) == null || this.f2875a.f3014c.contains(C)) {
                return null;
            }
            return C;
        }

        public void u0(x xVar) {
        }

        public View v(int i10) {
            int A = A();
            for (int i11 = 0; i11 < A; i11++) {
                View z10 = z(i11);
                a0 L = RecyclerView.L(z10);
                if (L != null && L.h() == i10 && !L.x() && (this.f2876b.f2825s0.f2937g || !L.o())) {
                    return z10;
                }
            }
            return null;
        }

        public void v0(s sVar, x xVar, int i10, int i11) {
            this.f2876b.o(i10, i11);
        }

        public abstract n w();

        @Deprecated
        public boolean w0(RecyclerView recyclerView, View view, View view2) {
            return a0() || recyclerView.P();
        }

        public n x(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public void x0(Parcelable parcelable) {
        }

        public n y(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof n) {
                return new n((n) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new n((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new n(layoutParams);
        }

        public Parcelable y0() {
            return null;
        }

        public View z(int i10) {
            c cVar = this.f2875a;
            if (cVar == null) {
                return null;
            }
            return ((t) cVar.f3012a).a(cVar.f(i10));
        }

        public void z0(int i10) {
        }
    }

    public static abstract class o {
    }

    public interface p {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class q {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f2900a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2901b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<a0> f2902a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f2903b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f2904c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f2905d = 0;
        }

        public final a a(int i10) {
            a aVar = this.f2900a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2900a.put(i10, aVar2);
            return aVar2;
        }

        public long b(long j10, long j11) {
            if (j10 == 0) {
                return j11;
            }
            return (j11 / 4) + ((j10 / 4) * 3);
        }
    }

    public final class s {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<a0> f2906a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a0> f2907b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<a0> f2908c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<a0> f2909d;

        /* renamed from: e  reason: collision with root package name */
        public int f2910e;

        /* renamed from: f  reason: collision with root package name */
        public int f2911f;

        /* renamed from: g  reason: collision with root package name */
        public r f2912g;

        public s() {
            ArrayList<a0> arrayList = new ArrayList<>();
            this.f2906a = arrayList;
            this.f2909d = Collections.unmodifiableList(arrayList);
            this.f2910e = 2;
            this.f2911f = 2;
        }

        public void a(a0 a0Var, boolean z10) {
            RecyclerView.k(a0Var);
            View view = a0Var.f2842a;
            v vVar = RecyclerView.this.f2839z0;
            if (vVar != null) {
                v.a aVar = vVar.f3141e;
                c0.C(view, aVar instanceof v.a ? aVar.f3143e.remove(view) : null);
            }
            if (z10) {
                t tVar = RecyclerView.this.f2830v;
                if (tVar != null) {
                    tVar.a(a0Var);
                }
                int size = RecyclerView.this.f2832w.size();
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView.this.f2832w.get(i10).a(a0Var);
                }
                e eVar = RecyclerView.this.f2826t;
                if (eVar != null) {
                    eVar.k(a0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2825s0 != null) {
                    recyclerView.f2806f.g(a0Var);
                }
            }
            a0Var.f2860s = null;
            a0Var.f2859r = null;
            r d10 = d();
            d10.getClass();
            int i11 = a0Var.f2847f;
            ArrayList<a0> arrayList = d10.a(i11).f2902a;
            if (d10.f2900a.get(i11).f2903b > arrayList.size()) {
                a0Var.u();
                arrayList.add(a0Var);
            }
        }

        public void b() {
            this.f2906a.clear();
            g();
        }

        public int c(int i10) {
            if (i10 < 0 || i10 >= RecyclerView.this.f2825s0.b()) {
                StringBuilder a10 = y0.a("invalid position ", i10, ". State item count is ");
                a10.append(RecyclerView.this.f2825s0.b());
                throw new IndexOutOfBoundsException(b.a(RecyclerView.this, a10));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f2825s0.f2937g) {
                return i10;
            }
            return recyclerView.f2802d.f(i10, 0);
        }

        public r d() {
            if (this.f2912g == null) {
                this.f2912g = new r();
            }
            return this.f2912g;
        }

        public View e(int i10) {
            return l(i10, false, Long.MAX_VALUE).f2842a;
        }

        public final void f(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    f((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public void g() {
            for (int size = this.f2908c.size() - 1; size >= 0; size--) {
                h(size);
            }
            this.f2908c.clear();
            if (RecyclerView.Q0) {
                k.b bVar = RecyclerView.this.f2823r0;
                int[] iArr = bVar.f3107c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f3108d = 0;
            }
        }

        public void h(int i10) {
            a(this.f2908c.get(i10), true);
            this.f2908c.remove(i10);
        }

        public void i(View view) {
            a0 L = RecyclerView.L(view);
            if (L.q()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (L.p()) {
                L.f2855n.m(L);
            } else if (L.y()) {
                L.e();
            }
            j(L);
            if (RecyclerView.this.f2797a0 != null && !L.n()) {
                RecyclerView.this.f2797a0.f(L);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void j(androidx.recyclerview.widget.RecyclerView.a0 r6) {
            /*
                r5 = this;
                boolean r0 = r6.p()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x00e5
                android.view.View r0 = r6.f2842a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00e5
            L_0x0012:
                boolean r0 = r6.q()
                if (r0 != 0) goto L_0x00cc
                boolean r0 = r6.x()
                if (r0 != 0) goto L_0x00ba
                int r0 = r6.f2851j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                android.view.View r0 = r6.f2842a
                java.util.WeakHashMap<android.view.View, java.lang.String> r3 = o0.c0.f22553a
                boolean r0 = o0.c0.d.i(r0)
                if (r0 == 0) goto L_0x0030
                r0 = 1
                goto L_0x0031
            L_0x0030:
                r0 = 0
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.f2826t
                if (r3 == 0) goto L_0x0041
                if (r0 == 0) goto L_0x0041
                boolean r3 = r3.h(r6)
                if (r3 == 0) goto L_0x0041
                r3 = 1
                goto L_0x0042
            L_0x0041:
                r3 = 0
            L_0x0042:
                if (r3 != 0) goto L_0x004d
                boolean r3 = r6.n()
                if (r3 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r1 = 0
                goto L_0x00a4
            L_0x004d:
                int r3 = r5.f2911f
                if (r3 <= 0) goto L_0x009c
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r6.j(r3)
                if (r3 != 0) goto L_0x009c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r5.f2908c
                int r3 = r3.size()
                int r4 = r5.f2911f
                if (r3 < r4) goto L_0x006a
                if (r3 <= 0) goto L_0x006a
                r5.h(r2)
                int r3 = r3 + -1
            L_0x006a:
                boolean r2 = androidx.recyclerview.widget.RecyclerView.Q0
                if (r2 == 0) goto L_0x0095
                if (r3 <= 0) goto L_0x0095
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.k$b r2 = r2.f2823r0
                int r4 = r6.f2844c
                boolean r2 = r2.c(r4)
                if (r2 != 0) goto L_0x0095
            L_0x007c:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x0094
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r2 = r5.f2908c
                java.lang.Object r2 = r2.get(r3)
                androidx.recyclerview.widget.RecyclerView$a0 r2 = (androidx.recyclerview.widget.RecyclerView.a0) r2
                int r2 = r2.f2844c
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.k$b r4 = r4.f2823r0
                boolean r2 = r4.c(r2)
                if (r2 != 0) goto L_0x007c
            L_0x0094:
                int r3 = r3 + r1
            L_0x0095:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r2 = r5.f2908c
                r2.add(r3, r6)
                r2 = 1
                goto L_0x009d
            L_0x009c:
                r2 = 0
            L_0x009d:
                if (r2 != 0) goto L_0x00a3
                r5.a(r6, r1)
                goto L_0x00a7
            L_0x00a3:
                r1 = r2
            L_0x00a4:
                r2 = 0
                r2 = r1
                r1 = 0
            L_0x00a7:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a0 r3 = r3.f2806f
                r3.g(r6)
                if (r2 != 0) goto L_0x00b9
                if (r1 != 0) goto L_0x00b9
                if (r0 == 0) goto L_0x00b9
                r0 = 0
                r6.f2860s = r0
                r6.f2859r = r0
            L_0x00b9:
                return
            L_0x00ba:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.b.a(r1, r0)
                r6.<init>(r0)
                throw r6
            L_0x00cc:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r6)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r6 = androidx.recyclerview.widget.b.a(r6, r1)
                r0.<init>(r6)
                throw r0
            L_0x00e5:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
                boolean r3 = r6.p()
                r2.append(r3)
                java.lang.String r3 = " isAttached:"
                r2.append(r3)
                android.view.View r6 = r6.f2842a
                android.view.ViewParent r6 = r6.getParent()
                if (r6 == 0) goto L_0x0102
                goto L_0x0103
            L_0x0102:
                r1 = 0
            L_0x0103:
                r2.append(r1)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r6 = androidx.recyclerview.widget.b.a(r6, r2)
                r0.<init>(r6)
                goto L_0x0111
            L_0x0110:
                throw r0
            L_0x0111:
                goto L_0x0110
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.j(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        public void k(View view) {
            a0 L = RecyclerView.L(view);
            if (!L.j(12) && L.r()) {
                j jVar = RecyclerView.this.f2797a0;
                if (!(jVar == null || jVar.c(L, L.i()))) {
                    if (this.f2907b == null) {
                        this.f2907b = new ArrayList<>();
                    }
                    L.f2855n = this;
                    L.f2856o = true;
                    this.f2907b.add(L);
                    return;
                }
            }
            if (!L.m() || L.o() || RecyclerView.this.f2826t.f2864b) {
                L.f2855n = this;
                L.f2856o = false;
                this.f2906a.add(L);
                return;
            }
            throw new IllegalArgumentException(b.a(RecyclerView.this, android.support.v4.media.a.a("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ff, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x048b, code lost:
            if ((r4 == 0 || r4 + r8 < r19) == false) goto L_0x048d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x024a  */
        /* JADX WARNING: Removed duplicated region for block: B:218:0x041f  */
        /* JADX WARNING: Removed duplicated region for block: B:223:0x0442  */
        /* JADX WARNING: Removed duplicated region for block: B:224:0x0445  */
        /* JADX WARNING: Removed duplicated region for block: B:283:0x054a  */
        /* JADX WARNING: Removed duplicated region for block: B:284:0x0558  */
        /* JADX WARNING: Removed duplicated region for block: B:290:0x0574 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.a0 l(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                if (r0 < 0) goto L_0x057c
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.f2825s0
                int r2 = r2.b()
                if (r0 >= r2) goto L_0x057c
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.f2825s0
                boolean r2 = r2.f2937g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r2 = r1.f2907b
                if (r2 == 0) goto L_0x0086
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0027
                goto L_0x0086
            L_0x0027:
                r6 = 0
            L_0x0028:
                if (r6 >= r2) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f2907b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.a0) r7
                boolean r8 = r7.y()
                if (r8 != 0) goto L_0x0042
                int r8 = r7.h()
                if (r8 != r0) goto L_0x0042
                r7.c(r3)
                goto L_0x0087
            L_0x0042:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r6.f2826t
                boolean r7 = r7.f2864b
                if (r7 == 0) goto L_0x0086
                androidx.recyclerview.widget.a r6 = r6.f2802d
                int r6 = r6.f(r0, r5)
                if (r6 <= 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r7.f2826t
                int r7 = r7.b()
                if (r6 >= r7) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r7.f2826t
                long r6 = r7.c(r6)
                r8 = 0
            L_0x0068:
                if (r8 >= r2) goto L_0x0086
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f2907b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.a0) r9
                boolean r10 = r9.y()
                if (r10 != 0) goto L_0x0083
                long r10 = r9.f2846e
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x0083
                r9.c(r3)
                r7 = r9
                goto L_0x0087
            L_0x0083:
                int r8 = r8 + 1
                goto L_0x0068
            L_0x0086:
                r7 = r4
            L_0x0087:
                if (r7 == 0) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x008b:
                r7 = r4
            L_0x008c:
                r2 = 0
            L_0x008d:
                r6 = -1
                if (r7 != 0) goto L_0x0248
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f2906a
                int r7 = r7.size()
                r8 = 0
            L_0x0097:
                if (r8 >= r7) goto L_0x00c9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f2906a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.a0) r9
                boolean r10 = r9.y()
                if (r10 != 0) goto L_0x00c6
                int r10 = r9.h()
                if (r10 != r0) goto L_0x00c6
                boolean r10 = r9.m()
                if (r10 != 0) goto L_0x00c6
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r10 = r10.f2825s0
                boolean r10 = r10.f2937g
                if (r10 != 0) goto L_0x00c1
                boolean r10 = r9.o()
                if (r10 != 0) goto L_0x00c6
            L_0x00c1:
                r9.c(r3)
                goto L_0x01b4
            L_0x00c6:
                int r8 = r8 + 1
                goto L_0x0097
            L_0x00c9:
                if (r18 != 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r7 = r7.f2804e
                java.util.List<android.view.View> r8 = r7.f3014c
                int r8 = r8.size()
                r9 = 0
            L_0x00d6:
                if (r9 >= r8) goto L_0x0101
                java.util.List<android.view.View> r10 = r7.f3014c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                androidx.recyclerview.widget.c$b r11 = r7.f3012a
                androidx.recyclerview.widget.t r11 = (androidx.recyclerview.widget.t) r11
                r11.getClass()
                androidx.recyclerview.widget.RecyclerView$a0 r11 = androidx.recyclerview.widget.RecyclerView.L(r10)
                int r12 = r11.h()
                if (r12 != r0) goto L_0x00fe
                boolean r12 = r11.m()
                if (r12 != 0) goto L_0x00fe
                boolean r11 = r11.o()
                if (r11 != 0) goto L_0x00fe
                goto L_0x0102
            L_0x00fe:
                int r9 = r9 + 1
                goto L_0x00d6
            L_0x0101:
                r10 = r4
            L_0x0102:
                if (r10 == 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView$a0 r7 = androidx.recyclerview.widget.RecyclerView.L(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r8 = r8.f2804e
                androidx.recyclerview.widget.c$b r9 = r8.f3012a
                androidx.recyclerview.widget.t r9 = (androidx.recyclerview.widget.t) r9
                androidx.recyclerview.widget.RecyclerView r9 = r9.f3138a
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0173
                androidx.recyclerview.widget.c$a r11 = r8.f3013b
                boolean r11 = r11.d(r9)
                if (r11 == 0) goto L_0x015c
                androidx.recyclerview.widget.c$a r11 = r8.f3013b
                r11.a(r9)
                r8.l(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r8 = r8.f2804e
                int r8 = r8.j(r10)
                if (r8 == r6) goto L_0x0143
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r9 = r9.f2804e
                r9.c(r8)
                r1.k(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.c(r8)
                goto L_0x01ba
            L_0x0143:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = androidx.recyclerview.widget.b.a(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x015c:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0173:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x018a:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f2908c
                int r7 = r7.size()
                r8 = 0
            L_0x0191:
                if (r8 >= r7) goto L_0x01b9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f2908c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.a0) r9
                boolean r10 = r9.m()
                if (r10 != 0) goto L_0x01b6
                int r10 = r9.h()
                if (r10 != r0) goto L_0x01b6
                boolean r10 = r9.k()
                if (r10 != 0) goto L_0x01b6
                if (r18 != 0) goto L_0x01b4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f2908c
                r7.remove(r8)
            L_0x01b4:
                r7 = r9
                goto L_0x01ba
            L_0x01b6:
                int r8 = r8 + 1
                goto L_0x0191
            L_0x01b9:
                r7 = r4
            L_0x01ba:
                if (r7 == 0) goto L_0x0248
                boolean r8 = r7.o()
                if (r8 == 0) goto L_0x01c9
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r8 = r8.f2825s0
                boolean r8 = r8.f2937g
                goto L_0x0204
            L_0x01c9:
                int r8 = r7.f2844c
                if (r8 < 0) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r9 = r9.f2826t
                int r9 = r9.b()
                if (r8 >= r9) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r9 = r8.f2825s0
                boolean r9 = r9.f2937g
                if (r9 != 0) goto L_0x01ec
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.f2826t
                int r9 = r7.f2844c
                int r8 = r8.d(r9)
                int r9 = r7.f2847f
                if (r8 == r9) goto L_0x01ec
                goto L_0x0201
            L_0x01ec:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.f2826t
                boolean r9 = r8.f2864b
                if (r9 == 0) goto L_0x0203
                long r9 = r7.f2846e
                int r11 = r7.f2844c
                long r11 = r8.c(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x0201
                goto L_0x0203
            L_0x0201:
                r8 = 0
                goto L_0x0204
            L_0x0203:
                r8 = 1
            L_0x0204:
                if (r8 != 0) goto L_0x022d
                if (r18 != 0) goto L_0x022b
                r8 = 4
                r7.c(r8)
                boolean r8 = r7.p()
                if (r8 == 0) goto L_0x021f
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f2842a
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$s r8 = r7.f2855n
                r8.m(r7)
                goto L_0x0228
            L_0x021f:
                boolean r8 = r7.y()
                if (r8 == 0) goto L_0x0228
                r7.e()
            L_0x0228:
                r1.j(r7)
            L_0x022b:
                r7 = r4
                goto L_0x0248
            L_0x022d:
                r2 = 1
                goto L_0x0248
            L_0x022f:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = androidx.recyclerview.widget.b.a(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x0248:
                if (r7 != 0) goto L_0x0402
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r10 = r10.f2802d
                int r10 = r10.f(r0, r5)
                if (r10 < 0) goto L_0x03d1
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f2826t
                int r11 = r11.b()
                if (r10 >= r11) goto L_0x03d1
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f2826t
                int r11 = r11.d(r10)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r12 = r12.f2826t
                boolean r13 = r12.f2864b
                if (r13 == 0) goto L_0x0305
                long r12 = r12.c(r10)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f2906a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x0279:
                if (r7 < 0) goto L_0x02cd
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r14 = r1.f2906a
                java.lang.Object r14 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r14 = (androidx.recyclerview.widget.RecyclerView.a0) r14
                long r8 = r14.f2846e
                int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r15 != 0) goto L_0x02ca
                boolean r8 = r14.y()
                if (r8 != 0) goto L_0x02ca
                int r8 = r14.f2847f
                if (r11 != r8) goto L_0x02ac
                r14.c(r3)
                boolean r3 = r14.o()
                if (r3 == 0) goto L_0x02aa
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f2825s0
                boolean r3 = r3.f2937g
                if (r3 != 0) goto L_0x02aa
                r3 = 2
                r7 = 14
                r14.v(r3, r7)
            L_0x02aa:
                r7 = r14
                goto L_0x0300
            L_0x02ac:
                if (r18 != 0) goto L_0x02ca
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r8 = r1.f2906a
                r8.remove(r7)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r14.f2842a
                r8.removeDetachedView(r9, r5)
                android.view.View r8 = r14.f2842a
                androidx.recyclerview.widget.RecyclerView$a0 r8 = androidx.recyclerview.widget.RecyclerView.L(r8)
                r8.f2855n = r4
                r8.f2856o = r5
                r8.e()
                r1.j(r8)
            L_0x02ca:
                int r7 = r7 + -1
                goto L_0x0279
            L_0x02cd:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r1.f2908c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02d4:
                if (r3 < 0) goto L_0x02ff
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f2908c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.a0) r7
                long r8 = r7.f2846e
                int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r14 != 0) goto L_0x02fc
                boolean r8 = r7.k()
                if (r8 != 0) goto L_0x02fc
                int r8 = r7.f2847f
                if (r11 != r8) goto L_0x02f6
                if (r18 != 0) goto L_0x0300
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r8 = r1.f2908c
                r8.remove(r3)
                goto L_0x0300
            L_0x02f6:
                if (r18 != 0) goto L_0x02fc
                r1.h(r3)
                goto L_0x02ff
            L_0x02fc:
                int r3 = r3 + -1
                goto L_0x02d4
            L_0x02ff:
                r7 = r4
            L_0x0300:
                if (r7 == 0) goto L_0x0305
                r7.f2844c = r10
                r2 = 1
            L_0x0305:
                if (r7 != 0) goto L_0x0352
                androidx.recyclerview.widget.RecyclerView$r r3 = r16.d()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$r$a> r3 = r3.f2900a
                java.lang.Object r3 = r3.get(r11)
                androidx.recyclerview.widget.RecyclerView$r$a r3 = (androidx.recyclerview.widget.RecyclerView.r.a) r3
                if (r3 == 0) goto L_0x033c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r3.f2902a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x033c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r3.f2902a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x0324:
                if (r7 < 0) goto L_0x033c
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r6 = (androidx.recyclerview.widget.RecyclerView.a0) r6
                boolean r6 = r6.k()
                if (r6 != 0) goto L_0x0339
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r3 = (androidx.recyclerview.widget.RecyclerView.a0) r3
                goto L_0x033d
            L_0x0339:
                int r7 = r7 + -1
                goto L_0x0324
            L_0x033c:
                r3 = r4
            L_0x033d:
                if (r3 == 0) goto L_0x0351
                r3.u()
                boolean r6 = androidx.recyclerview.widget.RecyclerView.N0
                if (r6 == 0) goto L_0x0351
                android.view.View r6 = r3.f2842a
                boolean r7 = r6 instanceof android.view.ViewGroup
                if (r7 == 0) goto L_0x0351
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                r1.f(r6, r5)
            L_0x0351:
                r7 = r3
            L_0x0352:
                if (r7 != 0) goto L_0x0402
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
                if (r3 == 0) goto L_0x037d
                androidx.recyclerview.widget.RecyclerView$r r3 = r1.f2912g
                androidx.recyclerview.widget.RecyclerView$r$a r3 = r3.a(r11)
                long r8 = r3.f2904c
                r12 = 0
                int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r3 == 0) goto L_0x0379
                long r8 = r8 + r6
                int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
                if (r3 >= 0) goto L_0x0377
                goto L_0x0379
            L_0x0377:
                r3 = 0
                goto L_0x037a
            L_0x0379:
                r3 = 1
            L_0x037a:
                if (r3 != 0) goto L_0x037d
                return r4
            L_0x037d:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r8 = r3.f2826t
                r8.getClass()
                java.lang.String r9 = "RV CreateView"
                k0.k.a(r9)     // Catch:{ all -> 0x03cc }
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r8.g(r3, r11)     // Catch:{ all -> 0x03cc }
                android.view.View r8 = r3.f2842a     // Catch:{ all -> 0x03cc }
                android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x03cc }
                if (r8 != 0) goto L_0x03c4
                r3.f2847f = r11     // Catch:{ all -> 0x03cc }
                k0.k.b()
                boolean r8 = androidx.recyclerview.widget.RecyclerView.Q0
                if (r8 == 0) goto L_0x03ad
                android.view.View r8 = r3.f2842a
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.F(r8)
                if (r8 == 0) goto L_0x03ad
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r8)
                r3.f2843b = r9
            L_0x03ad:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                long r8 = r8.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r10 = r1.f2912g
                long r8 = r8 - r6
                androidx.recyclerview.widget.RecyclerView$r$a r6 = r10.a(r11)
                long r11 = r6.f2904c
                long r7 = r10.b(r11, r8)
                r6.f2904c = r7
                r7 = r3
                goto L_0x0402
            L_0x03c4:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03cc }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03cc }
                throw r0     // Catch:{ all -> 0x03cc }
            L_0x03cc:
                r0 = move-exception
                k0.k.b()
                throw r0
            L_0x03d1:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r10)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r0 = r0.f2825s0
                int r0 = r0.b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.b.a(r0, r3)
                r2.<init>(r0)
                throw r2
            L_0x0402:
                if (r2 == 0) goto L_0x0434
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f2825s0
                boolean r3 = r3.f2937g
                if (r3 != 0) goto L_0x0434
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r6 = r7.j(r3)
                if (r6 == 0) goto L_0x0434
                r7.v(r5, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f2825s0
                boolean r3 = r3.f2940j
                if (r3 == 0) goto L_0x0434
                androidx.recyclerview.widget.RecyclerView.j.b(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r6 = r3.f2797a0
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f2825s0
                r7.i()
                androidx.recyclerview.widget.RecyclerView$j$c r3 = r6.i(r7)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r6.Z(r7, r3)
            L_0x0434:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f2825s0
                boolean r3 = r3.f2937g
                if (r3 == 0) goto L_0x0445
                boolean r3 = r7.l()
                if (r3 == 0) goto L_0x0445
                r7.f2848g = r0
                goto L_0x048d
            L_0x0445:
                boolean r3 = r7.l()
                if (r3 == 0) goto L_0x0457
                boolean r3 = r7.s()
                if (r3 != 0) goto L_0x0457
                boolean r3 = r7.m()
                if (r3 == 0) goto L_0x048d
            L_0x0457:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r3 = r3.f2802d
                int r3 = r3.f(r0, r5)
                r7.f2860s = r4
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r7.f2859r = r4
                int r5 = r7.f2847f
                long r8 = r4.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r4 == 0) goto L_0x0490
                androidx.recyclerview.widget.RecyclerView$r r4 = r1.f2912g
                androidx.recyclerview.widget.RecyclerView$r$a r4 = r4.a(r5)
                long r4 = r4.f2905d
                r10 = 0
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L_0x048a
                long r4 = r4 + r8
                int r6 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
                if (r6 >= 0) goto L_0x0488
                goto L_0x048a
            L_0x0488:
                r4 = 0
                goto L_0x048b
            L_0x048a:
                r4 = 1
            L_0x048b:
                if (r4 != 0) goto L_0x0490
            L_0x048d:
                r0 = 0
                goto L_0x0542
            L_0x0490:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r4 = r4.f2826t
                r4.getClass()
                androidx.recyclerview.widget.RecyclerView$e<? extends androidx.recyclerview.widget.RecyclerView$a0> r5 = r7.f2860s
                if (r5 != 0) goto L_0x049d
                r5 = 1
                goto L_0x049e
            L_0x049d:
                r5 = 0
            L_0x049e:
                if (r5 == 0) goto L_0x04b7
                r7.f2844c = r3
                boolean r6 = r4.f2864b
                if (r6 == 0) goto L_0x04ac
                long r10 = r4.c(r3)
                r7.f2846e = r10
            L_0x04ac:
                r6 = 519(0x207, float:7.27E-43)
                r10 = 1
                r7.v(r10, r6)
                java.lang.String r6 = "RV OnBindView"
                k0.k.a(r6)
            L_0x04b7:
                r7.f2860s = r4
                java.util.List r6 = r7.i()
                r4.f(r7, r3, r6)
                if (r5 == 0) goto L_0x04e1
                java.util.List<java.lang.Object> r3 = r7.f2852k
                if (r3 == 0) goto L_0x04c9
                r3.clear()
            L_0x04c9:
                int r3 = r7.f2851j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f2851j = r3
                android.view.View r3 = r7.f2842a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView.n
                if (r4 == 0) goto L_0x04de
                androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.n) r3
                r4 = 1
                r3.f2898c = r4
            L_0x04de:
                k0.k.b()
            L_0x04e1:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r3 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r5 = r1.f2912g
                int r6 = r7.f2847f
                long r3 = r3 - r8
                androidx.recyclerview.widget.RecyclerView$r$a r6 = r5.a(r6)
                long r8 = r6.f2905d
                long r3 = r5.b(r8, r3)
                r6.f2905d = r3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.J
                if (r3 == 0) goto L_0x0506
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x0506
                r3 = 1
                goto L_0x0507
            L_0x0506:
                r3 = 0
            L_0x0507:
                if (r3 == 0) goto L_0x0537
                android.view.View r3 = r7.f2842a
                java.util.WeakHashMap<android.view.View, java.lang.String> r4 = o0.c0.f22553a
                int r4 = o0.c0.d.c(r3)
                r5 = 1
                if (r4 != 0) goto L_0x0517
                o0.c0.I(r3, r5)
            L_0x0517:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.v r4 = r4.f2839z0
                if (r4 != 0) goto L_0x051e
                goto L_0x0537
            L_0x051e:
                androidx.recyclerview.widget.v$a r4 = r4.f3141e
                boolean r5 = r4 instanceof androidx.recyclerview.widget.v.a
                if (r5 == 0) goto L_0x0534
                r4.getClass()
                o0.a r5 = o0.c0.g(r3)
                if (r5 == 0) goto L_0x0534
                if (r5 == r4) goto L_0x0534
                java.util.Map<android.view.View, o0.a> r6 = r4.f3143e
                r6.put(r3, r5)
            L_0x0534:
                o0.c0.C(r3, r4)
            L_0x0537:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f2825s0
                boolean r3 = r3.f2937g
                if (r3 == 0) goto L_0x0541
                r7.f2848g = r0
            L_0x0541:
                r0 = 1
            L_0x0542:
                android.view.View r3 = r7.f2842a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 != 0) goto L_0x0558
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.n) r3
                android.view.View r4 = r7.f2842a
                r4.setLayoutParams(r3)
                goto L_0x0570
            L_0x0558:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                boolean r4 = r4.checkLayoutParams(r3)
                if (r4 != 0) goto L_0x056e
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r3 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r3)
                androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.n) r3
                android.view.View r4 = r7.f2842a
                r4.setLayoutParams(r3)
                goto L_0x0570
            L_0x056e:
                androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.n) r3
            L_0x0570:
                r3.f2896a = r7
                if (r2 == 0) goto L_0x0578
                if (r0 == 0) goto L_0x0578
                r0 = 1
                goto L_0x0579
            L_0x0578:
                r0 = 0
            L_0x0579:
                r3.f2899d = r0
                return r7
            L_0x057c:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r0 = r0.f2825s0
                int r0 = r0.b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.b.a(r0, r3)
                r2.<init>(r0)
                goto L_0x05ae
            L_0x05ad:
                throw r2
            L_0x05ae:
                goto L_0x05ad
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.l(int, boolean, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        public void m(a0 a0Var) {
            if (a0Var.f2856o) {
                this.f2907b.remove(a0Var);
            } else {
                this.f2906a.remove(a0Var);
            }
            a0Var.f2855n = null;
            a0Var.f2856o = false;
            a0Var.e();
        }

        public void n() {
            m mVar = RecyclerView.this.f2828u;
            this.f2911f = this.f2910e + (mVar != null ? mVar.f2884j : 0);
            for (int size = this.f2908c.size() - 1; size >= 0 && this.f2908c.size() > this.f2911f; size--) {
                h(size);
            }
        }
    }

    public interface t {
        void a(a0 a0Var);
    }

    public class u extends g {
        public u() {
        }

        public void a() {
            RecyclerView.this.i((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2825s0.f2936f = true;
            recyclerView.Y(true);
            if (!RecyclerView.this.f2802d.g()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void b(int i10, int i11, Object obj) {
            RecyclerView.this.i((String) null);
            a aVar = RecyclerView.this.f2802d;
            aVar.getClass();
            boolean z10 = false;
            if (i11 >= 1) {
                aVar.f2997b.add(aVar.h(4, i10, i11, obj));
                aVar.f3001f |= 4;
                if (aVar.f2997b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                e();
            }
        }

        public void c(int i10, int i11) {
            RecyclerView.this.i((String) null);
            a aVar = RecyclerView.this.f2802d;
            aVar.getClass();
            boolean z10 = false;
            if (i11 >= 1) {
                aVar.f2997b.add(aVar.h(1, i10, i11, (Object) null));
                aVar.f3001f |= 1;
                if (aVar.f2997b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                e();
            }
        }

        public void d(int i10, int i11) {
            RecyclerView.this.i((String) null);
            a aVar = RecyclerView.this.f2802d;
            aVar.getClass();
            boolean z10 = false;
            if (i11 >= 1) {
                aVar.f2997b.add(aVar.h(2, i10, i11, (Object) null));
                aVar.f3001f |= 2;
                if (aVar.f2997b.size() == 1) {
                    z10 = true;
                }
            }
            if (z10) {
                e();
            }
        }

        public void e() {
            if (RecyclerView.P0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.B && recyclerView.A) {
                    Runnable runnable = recyclerView.f2810h;
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    c0.d.m(recyclerView, runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.I = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class w {

        /* renamed from: a  reason: collision with root package name */
        public int f2916a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f2917b;

        /* renamed from: c  reason: collision with root package name */
        public m f2918c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2919d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2920e;

        /* renamed from: f  reason: collision with root package name */
        public View f2921f;

        /* renamed from: g  reason: collision with root package name */
        public final a f2922g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        public boolean f2923h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f2924a;

            /* renamed from: b  reason: collision with root package name */
            public int f2925b;

            /* renamed from: c  reason: collision with root package name */
            public int f2926c;

            /* renamed from: d  reason: collision with root package name */
            public int f2927d = -1;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f2928e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f2929f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f2930g = 0;

            public a(int i10, int i11) {
                this.f2924a = i10;
                this.f2925b = i11;
                this.f2926c = Integer.MIN_VALUE;
                this.f2928e = null;
            }

            public void a(RecyclerView recyclerView) {
                int i10 = this.f2927d;
                if (i10 >= 0) {
                    this.f2927d = -1;
                    recyclerView.Q(i10);
                    this.f2929f = false;
                } else if (this.f2929f) {
                    Interpolator interpolator = this.f2928e;
                    if (interpolator == null || this.f2926c >= 1) {
                        int i11 = this.f2926c;
                        if (i11 >= 1) {
                            recyclerView.f2820p0.b(this.f2924a, this.f2925b, i11, interpolator);
                            int i12 = this.f2930g + 1;
                            this.f2930g = i12;
                            if (i12 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f2929f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f2930g = 0;
                }
            }

            public void b(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2924a = i10;
                this.f2925b = i11;
                this.f2926c = i12;
                this.f2928e = interpolator;
                this.f2929f = true;
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            m mVar = this.f2918c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i10);
            }
            StringBuilder a10 = android.support.v4.media.a.a("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            a10.append(b.class.getCanonicalName());
            Log.w("RecyclerView", a10.toString());
            return null;
        }

        public View b(int i10) {
            return this.f2917b.f2828u.v(i10);
        }

        public void c(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f2917b;
            int i12 = -1;
            if (this.f2916a == -1 || recyclerView == null) {
                f();
            }
            if (this.f2919d && this.f2921f == null && this.f2918c != null && (a10 = a(this.f2916a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.f0((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            boolean z10 = false;
            this.f2919d = false;
            View view = this.f2921f;
            if (view != null) {
                this.f2917b.getClass();
                a0 L = RecyclerView.L(view);
                if (L != null) {
                    i12 = L.h();
                }
                if (i12 == this.f2916a) {
                    e(this.f2921f, recyclerView.f2825s0, this.f2922g);
                    this.f2922g.a(recyclerView);
                    f();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2921f = null;
                }
            }
            if (this.f2920e) {
                x xVar = recyclerView.f2825s0;
                a aVar = this.f2922g;
                m mVar = (m) this;
                if (mVar.f2917b.f2828u.A() == 0) {
                    mVar.f();
                } else {
                    int i13 = mVar.f3129o;
                    int i14 = i13 - i10;
                    if (i13 * i14 <= 0) {
                        i14 = 0;
                    }
                    mVar.f3129o = i14;
                    int i15 = mVar.f3130p;
                    int i16 = i15 - i11;
                    if (i15 * i16 <= 0) {
                        i16 = 0;
                    }
                    mVar.f3130p = i16;
                    if (i14 == 0 && i16 == 0) {
                        mVar.k(aVar);
                    }
                }
                a aVar2 = this.f2922g;
                if (aVar2.f2927d >= 0) {
                    z10 = true;
                }
                aVar2.a(recyclerView);
                if (z10 && this.f2920e) {
                    this.f2919d = true;
                    recyclerView.f2820p0.a();
                }
            }
        }

        public abstract void d();

        public abstract void e(View view, x xVar, a aVar);

        public final void f() {
            if (this.f2920e) {
                this.f2920e = false;
                d();
                this.f2917b.f2825s0.f2931a = -1;
                this.f2921f = null;
                this.f2916a = -1;
                this.f2919d = false;
                m mVar = this.f2918c;
                if (mVar.f2879e == this) {
                    mVar.f2879e = null;
                }
                this.f2918c = null;
                this.f2917b = null;
            }
        }
    }

    public static class x {

        /* renamed from: a  reason: collision with root package name */
        public int f2931a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f2932b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2933c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2934d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f2935e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2936f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2937g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2938h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2939i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2940j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2941k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f2942l;

        /* renamed from: m  reason: collision with root package name */
        public long f2943m;

        /* renamed from: n  reason: collision with root package name */
        public int f2944n;

        /* renamed from: o  reason: collision with root package name */
        public int f2945o;

        /* renamed from: p  reason: collision with root package name */
        public int f2946p;

        public void a(int i10) {
            if ((this.f2934d & i10) == 0) {
                StringBuilder a10 = android.support.v4.media.a.a("Layout state should be one of ");
                a10.append(Integer.toBinaryString(i10));
                a10.append(" but it is ");
                a10.append(Integer.toBinaryString(this.f2934d));
                throw new IllegalStateException(a10.toString());
            }
        }

        public int b() {
            if (this.f2937g) {
                return this.f2932b - this.f2933c;
            }
            return this.f2935e;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("State{mTargetPosition=");
            a10.append(this.f2931a);
            a10.append(", mData=");
            a10.append((Object) null);
            a10.append(", mItemCount=");
            a10.append(this.f2935e);
            a10.append(", mIsMeasuring=");
            a10.append(this.f2939i);
            a10.append(", mPreviousLayoutItemCount=");
            a10.append(this.f2932b);
            a10.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            a10.append(this.f2933c);
            a10.append(", mStructureChanged=");
            a10.append(this.f2936f);
            a10.append(", mInPreLayout=");
            a10.append(this.f2937g);
            a10.append(", mRunSimpleAnimations=");
            a10.append(this.f2940j);
            a10.append(", mRunPredictiveAnimations=");
            a10.append(this.f2941k);
            a10.append('}');
            return a10.toString();
        }
    }

    public static abstract class y {
    }

    public class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f2947a;

        /* renamed from: b  reason: collision with root package name */
        public int f2948b;

        /* renamed from: c  reason: collision with root package name */
        public OverScroller f2949c;

        /* renamed from: d  reason: collision with root package name */
        public Interpolator f2950d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2951e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2952f = false;

        public z() {
            Interpolator interpolator = RecyclerView.S0;
            this.f2950d = interpolator;
            this.f2949c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.f2951e) {
                this.f2952f = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.m(recyclerView, this);
        }

        public void b(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                boolean z10 = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z10) {
                    abs = abs2;
                }
                i12 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.S0;
            }
            if (this.f2950d != interpolator) {
                this.f2950d = interpolator;
                this.f2949c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2948b = 0;
            this.f2947a = 0;
            RecyclerView.this.setScrollState(2);
            this.f2949c.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2949c.computeScrollOffset();
            }
            a();
        }

        public void c() {
            RecyclerView.this.removeCallbacks(this);
            this.f2949c.abortAnimation();
        }

        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2828u == null) {
                c();
                return;
            }
            this.f2952f = false;
            this.f2951e = true;
            recyclerView.n();
            OverScroller overScroller = this.f2949c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f2947a;
                int i13 = currY - this.f2948b;
                this.f2947a = currX;
                this.f2948b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.F0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.t(i12, i13, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.F0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f2826t != null) {
                    int[] iArr3 = recyclerView3.F0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.f0(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.F0;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    i12 -= i10;
                    i13 -= i11;
                    w wVar = recyclerView4.f2828u.f2879e;
                    if (wVar != null && !wVar.f2919d && wVar.f2920e) {
                        int b10 = recyclerView4.f2825s0.b();
                        if (b10 == 0) {
                            wVar.f();
                        } else if (wVar.f2916a >= b10) {
                            wVar.f2916a = b10 - 1;
                            wVar.c(i10, i11);
                        } else {
                            wVar.c(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f2834x.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.F0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.u(i10, i11, i12, i13, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.F0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (!(i10 == 0 && i11 == 0)) {
                    recyclerView6.v(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                w wVar2 = recyclerView7.f2828u.f2879e;
                if ((wVar2 != null && wVar2.f2919d) || !z10) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    k kVar = recyclerView8.f2821q0;
                    if (kVar != null) {
                        kVar.a(recyclerView8, i10, i11);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        recyclerView9.getClass();
                        if (i16 < 0) {
                            recyclerView9.x();
                            if (recyclerView9.P.isFinished()) {
                                recyclerView9.P.onAbsorb(-i16);
                            }
                        } else if (i16 > 0) {
                            recyclerView9.y();
                            if (recyclerView9.R.isFinished()) {
                                recyclerView9.R.onAbsorb(i16);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.z();
                            if (recyclerView9.Q.isFinished()) {
                                recyclerView9.Q.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.w();
                            if (recyclerView9.S.isFinished()) {
                                recyclerView9.S.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i16 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, String> weakHashMap = c0.f22553a;
                            c0.d.k(recyclerView9);
                        }
                    }
                    if (RecyclerView.Q0) {
                        k.b bVar = RecyclerView.this.f2823r0;
                        int[] iArr7 = bVar.f3107c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f3108d = 0;
                    }
                }
            }
            w wVar3 = RecyclerView.this.f2828u.f2879e;
            if (wVar3 != null && wVar3.f2919d) {
                wVar3.c(0, 0);
            }
            this.f2951e = false;
            if (this.f2952f) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                c0.d.m(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.o0(1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            M0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r1 == r3) goto L_0x001c
            r3 = 19
            if (r1 == r3) goto L_0x001c
            r3 = 20
            if (r1 != r3) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = 1
        L_0x001d:
            N0 = r3
            r3 = 23
            if (r1 < r3) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            O0 = r3
            P0 = r0
            r3 = 21
            if (r1 < r3) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            Q0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            R0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            S0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView F2 = F(viewGroup.getChildAt(i10));
            if (F2 != null) {
                return F2;
            }
        }
        return null;
    }

    public static a0 L(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f2896a;
    }

    private o0.n getScrollingChildHelper() {
        if (this.C0 == null) {
            this.C0 = new o0.n(this);
        }
        return this.C0;
    }

    public static void k(a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.f2843b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != a0Var.f2842a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            a0Var.f2843b = null;
        }
    }

    public String A() {
        StringBuilder a10 = android.support.v4.media.a.a(" ");
        a10.append(super.toString());
        a10.append(", adapter:");
        a10.append(this.f2826t);
        a10.append(", layout:");
        a10.append(this.f2828u);
        a10.append(", context:");
        a10.append(getContext());
        return a10.toString();
    }

    public final void B(x xVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f2820p0.f2949c;
            xVar.f2945o = overScroller.getFinalX() - overScroller.getCurrX();
            xVar.f2946p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        xVar.f2945o = 0;
        xVar.f2946p = 0;
    }

    public View C(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f2836y.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = this.f2836y.get(i10);
            if (!pVar.a(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.f2838z = pVar;
                return true;
            }
        }
        return false;
    }

    public final void E(int[] iArr) {
        int e10 = this.f2804e.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            a0 L2 = L(this.f2804e.d(i12));
            if (!L2.x()) {
                int h10 = L2.h();
                if (h10 < i10) {
                    i10 = h10;
                }
                if (h10 > i11) {
                    i11 = h10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public a0 G(int i10) {
        a0 a0Var = null;
        if (this.K) {
            return null;
        }
        int h10 = this.f2804e.h();
        for (int i11 = 0; i11 < h10; i11++) {
            a0 L2 = L(this.f2804e.g(i11));
            if (L2 != null && !L2.o() && I(L2) == i10) {
                if (!this.f2804e.k(L2.f2842a)) {
                    return L2;
                }
                a0Var = L2;
            }
        }
        return a0Var;
    }

    public a0 H(int i10, boolean z10) {
        int h10 = this.f2804e.h();
        a0 a0Var = null;
        for (int i11 = 0; i11 < h10; i11++) {
            a0 L2 = L(this.f2804e.g(i11));
            if (L2 != null && !L2.o()) {
                if (z10) {
                    if (L2.f2844c != i10) {
                        continue;
                    }
                } else if (L2.h() != i10) {
                    continue;
                }
                if (!this.f2804e.k(L2.f2842a)) {
                    return L2;
                }
                a0Var = L2;
            }
        }
        return a0Var;
    }

    public int I(a0 a0Var) {
        if (!a0Var.j(524) && a0Var.l()) {
            a aVar = this.f2802d;
            int i10 = a0Var.f2844c;
            int size = aVar.f2997b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f2997b.get(i11);
                int i12 = bVar.f3002a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = bVar.f3003b;
                        if (i13 <= i10) {
                            int i14 = bVar.f3005d;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = bVar.f3003b;
                        if (i15 == i10) {
                            i10 = bVar.f3005d;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (bVar.f3005d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (bVar.f3003b <= i10) {
                    i10 += bVar.f3005d;
                }
            }
            return i10;
        }
        return -1;
    }

    public long J(a0 a0Var) {
        if (this.f2826t.f2864b) {
            return a0Var.f2846e;
        }
        return (long) a0Var.f2844c;
    }

    public a0 K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public Rect M(View view) {
        n nVar = (n) view.getLayoutParams();
        if (!nVar.f2898c) {
            return nVar.f2897b;
        }
        if (this.f2825s0.f2937g && (nVar.c() || nVar.f2896a.m())) {
            return nVar.f2897b;
        }
        Rect rect = nVar.f2897b;
        rect.set(0, 0, 0, 0);
        int size = this.f2834x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2812i.set(0, 0, 0, 0);
            Rect rect2 = this.f2812i;
            this.f2834x.get(i10).getClass();
            ((n) view.getLayoutParams()).b();
            rect2.set(0, 0, 0, 0);
            int i11 = rect.left;
            Rect rect3 = this.f2812i;
            rect.left = i11 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        nVar.f2898c = false;
        return rect;
    }

    public boolean N() {
        return !this.C || this.K || this.f2802d.g();
    }

    public void O() {
        this.S = null;
        this.Q = null;
        this.R = null;
        this.P = null;
    }

    public boolean P() {
        return this.M > 0;
    }

    public void Q(int i10) {
        if (this.f2828u != null) {
            setScrollState(2);
            this.f2828u.L0(i10);
            awakenScrollBars();
        }
    }

    public void R() {
        int h10 = this.f2804e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((n) this.f2804e.g(i10).getLayoutParams()).f2898c = true;
        }
        s sVar = this.f2798b;
        int size = sVar.f2908c.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) sVar.f2908c.get(i11).f2842a.getLayoutParams();
            if (nVar != null) {
                nVar.f2898c = true;
            }
        }
    }

    public void S(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.f2804e.h();
        for (int i13 = 0; i13 < h10; i13++) {
            a0 L2 = L(this.f2804e.g(i13));
            if (L2 != null && !L2.x()) {
                int i14 = L2.f2844c;
                if (i14 >= i12) {
                    L2.t(-i11, z10);
                    this.f2825s0.f2936f = true;
                } else if (i14 >= i10) {
                    L2.c(8);
                    L2.t(-i11, z10);
                    L2.f2844c = i10 - 1;
                    this.f2825s0.f2936f = true;
                }
            }
        }
        s sVar = this.f2798b;
        int size = sVar.f2908c.size();
        while (true) {
            size--;
            if (size >= 0) {
                a0 a0Var = sVar.f2908c.get(size);
                if (a0Var != null) {
                    int i15 = a0Var.f2844c;
                    if (i15 >= i12) {
                        a0Var.t(-i11, z10);
                    } else if (i15 >= i10) {
                        a0Var.c(8);
                        sVar.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void T() {
        this.M++;
    }

    public void U(boolean z10) {
        int i10;
        boolean z11 = true;
        int i11 = this.M - 1;
        this.M = i11;
        if (i11 < 1) {
            this.M = 0;
            if (z10) {
                int i12 = this.H;
                this.H = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.J;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z11 = false;
                    }
                    if (z11) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        if (Build.VERSION.SDK_INT >= 19) {
                            p0.b.b(obtain, i12);
                        }
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.G0.size() - 1; size >= 0; size--) {
                    a0 a0Var = this.G0.get(size);
                    if (a0Var.f2842a.getParent() == this && !a0Var.x() && (i10 = a0Var.f2858q) != -1) {
                        c0.I(a0Var.f2842a, i10);
                        a0Var.f2858q = -1;
                    }
                }
                this.G0.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2801c0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2801c0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f2809g0 = x10;
            this.f2805e0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f2811h0 = y10;
            this.f2807f0 = y10;
        }
    }

    public void W() {
        if (!this.f2837y0 && this.A) {
            Runnable runnable = this.H0;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.m(this, runnable);
            this.f2837y0 = true;
        }
    }

    public final void X() {
        boolean z10;
        boolean z11 = false;
        if (this.K) {
            a aVar = this.f2802d;
            aVar.l(aVar.f2997b);
            aVar.l(aVar.f2998c);
            aVar.f3001f = 0;
            if (this.L) {
                this.f2828u.o0(this);
            }
        }
        if (this.f2797a0 != null && this.f2828u.X0()) {
            this.f2802d.j();
        } else {
            this.f2802d.c();
        }
        boolean z12 = this.f2831v0 || this.f2833w0;
        x xVar = this.f2825s0;
        boolean z13 = this.C && this.f2797a0 != null && ((z10 = this.K) || z12 || this.f2828u.f2880f) && (!z10 || this.f2826t.f2864b);
        xVar.f2940j = z13;
        if (z13 && z12 && !this.K) {
            if (this.f2797a0 != null && this.f2828u.X0()) {
                z11 = true;
            }
        }
        xVar.f2941k = z11;
    }

    public void Y(boolean z10) {
        this.L = z10 | this.L;
        this.K = true;
        int h10 = this.f2804e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            a0 L2 = L(this.f2804e.g(i10));
            if (L2 != null && !L2.x()) {
                L2.c(6);
            }
        }
        R();
        s sVar = this.f2798b;
        int size = sVar.f2908c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = sVar.f2908c.get(i11);
            if (a0Var != null) {
                a0Var.c(6);
                a0Var.b((Object) null);
            }
        }
        e eVar = RecyclerView.this.f2826t;
        if (eVar == null || !eVar.f2864b) {
            sVar.g();
        }
    }

    public void Z(a0 a0Var, j.c cVar) {
        a0Var.v(0, 8192);
        if (this.f2825s0.f2938h && a0Var.r() && !a0Var.o() && !a0Var.x()) {
            this.f2806f.f3007b.h(J(a0Var), a0Var);
        }
        this.f2806f.c(a0Var, cVar);
    }

    public void a0() {
        j jVar = this.f2797a0;
        if (jVar != null) {
            jVar.g();
        }
        m mVar = this.f2828u;
        if (mVar != null) {
            mVar.B0(this.f2798b);
            this.f2828u.C0(this.f2798b);
        }
        this.f2798b.b();
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        m mVar = this.f2828u;
        if (mVar == null || !mVar.f0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void b0(q qVar) {
        List<q> list = this.f2829u0;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public final void c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2812i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f2898c) {
                Rect rect = nVar.f2897b;
                Rect rect2 = this.f2812i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2812i);
            offsetRectIntoDescendantCoords(view, this.f2812i);
        }
        this.f2828u.H0(this, view, this.f2812i, !this.C, view2 == null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.f2828u.i((n) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        m mVar = this.f2828u;
        if (mVar != null && mVar.g()) {
            return this.f2828u.m(this.f2825s0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        m mVar = this.f2828u;
        if (mVar != null && mVar.g()) {
            return this.f2828u.n(this.f2825s0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        m mVar = this.f2828u;
        if (mVar != null && mVar.g()) {
            return this.f2828u.o(this.f2825s0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        m mVar = this.f2828u;
        if (mVar != null && mVar.h()) {
            return this.f2828u.p(this.f2825s0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        m mVar = this.f2828u;
        if (mVar != null && mVar.h()) {
            return this.f2828u.q(this.f2825s0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        m mVar = this.f2828u;
        if (mVar != null && mVar.h()) {
            return this.f2828u.r(this.f2825s0);
        }
        return 0;
    }

    public final void d0() {
        VelocityTracker velocityTracker = this.f2803d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        o0(0);
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.R;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.S;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.S.isFinished();
        }
        if (z10) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(this);
        }
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f2834x.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f2834x.get(i10).e(canvas, this, this.f2825s0);
        }
        EdgeEffect edgeEffect = this.P;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2808g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.P;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2808g) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.Q;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.R;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2808g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.R;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.S;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2808g) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.S;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f2797a0 == null || this.f2834x.size() <= 0 || !this.f2797a0.h()) {
            z12 = z10;
        }
        if (z12) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r18.n()
            androidx.recyclerview.widget.RecyclerView$e r0 = r8.f2826t
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x002b
            int[] r0 = r8.F0
            r0[r13] = r13
            r0[r12] = r13
            r8.f0(r9, r10, r0)
            int[] r0 = r8.F0
            r1 = r0[r13]
            r0 = r0[r12]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x0031
        L_0x002b:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0031:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r0 = r8.f2834x
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003c
            r18.invalidate()
        L_0x003c:
            int[] r7 = r8.F0
            r7[r13] = r13
            r7[r12] = r13
            int[] r5 = r8.D0
            r0 = r18
            r1 = r15
            r2 = r14
            r3 = r16
            r4 = r17
            r6 = r22
            r0.u(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.F0
            r1 = r0[r13]
            int r1 = r16 - r1
            r2 = r0[r12]
            int r2 = r17 - r2
            r3 = r0[r13]
            if (r3 != 0) goto L_0x0066
            r0 = r0[r12]
            if (r0 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0 = 0
            goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            int r3 = r8.f2809g0
            int[] r4 = r8.D0
            r5 = r4[r13]
            int r3 = r3 - r5
            r8.f2809g0 = r3
            int r3 = r8.f2811h0
            r5 = r4[r12]
            int r3 = r3 - r5
            r8.f2811h0 = r3
            int[] r3 = r8.E0
            r5 = r3[r13]
            r6 = r4[r13]
            int r5 = r5 + r6
            r3[r13] = r5
            r5 = r3[r12]
            r4 = r4[r12]
            int r5 = r5 + r4
            r3[r12] = r5
            int r3 = r18.getOverScrollMode()
            r4 = 2
            if (r3 == r4) goto L_0x0124
            if (r11 == 0) goto L_0x0121
            r3 = 8194(0x2002, float:1.1482E-41)
            boolean r3 = q.h.e(r11, r3)
            if (r3 != 0) goto L_0x0121
            float r3 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r2 = (float) r2
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00c1
            r18.x()
            android.widget.EdgeEffect r7 = r8.P
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r5 - r4
            s0.d.b(r7, r11, r4)
            goto L_0x00da
        L_0x00c1:
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00dc
            r18.y()
            android.widget.EdgeEffect r7 = r8.R
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            s0.d.b(r7, r11, r4)
        L_0x00da:
            r4 = 1
            goto L_0x00dd
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f7
            r18.z()
            android.widget.EdgeEffect r4 = r8.Q
            float r5 = -r2
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r5 = r5 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r3 = r3 / r7
            s0.d.b(r4, r5, r3)
            goto L_0x0111
        L_0x00f7:
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0112
            r18.w()
            android.widget.EdgeEffect r4 = r8.S
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r7 = r2 / r7
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r3 = r3 / r11
            float r5 = r5 - r3
            s0.d.b(r4, r7, r5)
        L_0x0111:
            r4 = 1
        L_0x0112:
            if (r4 != 0) goto L_0x011c
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x011c
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0121
        L_0x011c:
            java.util.WeakHashMap<android.view.View, java.lang.String> r1 = o0.c0.f22553a
            o0.c0.d.k(r18)
        L_0x0121:
            r18.m(r19, r20)
        L_0x0124:
            if (r15 != 0) goto L_0x0128
            if (r14 == 0) goto L_0x012b
        L_0x0128:
            r8.v(r15, r14)
        L_0x012b:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0134
            r18.invalidate()
        L_0x0134:
            if (r0 != 0) goto L_0x013d
            if (r15 != 0) goto L_0x013d
            if (r14 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r12 = 0
            goto L_0x013e
        L_0x013d:
            r12 = 1
        L_0x013e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.e0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void f(a0 a0Var) {
        View view = a0Var.f2842a;
        boolean z10 = view.getParent() == this;
        this.f2798b.m(K(view));
        if (a0Var.q()) {
            this.f2804e.b(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f2804e.a(view, -1, true);
        } else {
            c cVar = this.f2804e;
            int indexOfChild = ((t) cVar.f3012a).f3138a.indexOfChild(view);
            if (indexOfChild >= 0) {
                cVar.f3013b.h(indexOfChild);
                cVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void f0(int i10, int i11, int[] iArr) {
        a0 a0Var;
        l0();
        T();
        k0.k.a("RV Scroll");
        B(this.f2825s0);
        int K02 = i10 != 0 ? this.f2828u.K0(i10, this.f2798b, this.f2825s0) : 0;
        int M02 = i11 != 0 ? this.f2828u.M0(i11, this.f2798b, this.f2825s0) : 0;
        k0.k.b();
        int e10 = this.f2804e.e();
        for (int i12 = 0; i12 < e10; i12++) {
            View d10 = this.f2804e.d(i12);
            a0 K2 = K(d10);
            if (!(K2 == null || (a0Var = K2.f2850i) == null)) {
                View view = a0Var.f2842a;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = K02;
            iArr[1] = M02;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x016b, code lost:
        if (r3 > 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0185, code lost:
        if (r6 > 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0188, code lost:
        if (r3 < 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018b, code lost:
        if (r6 < 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0194, code lost:
        if ((r6 * r1) <= 0) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x019d, code lost:
        if ((r6 * r1) >= 0) goto L_0x01a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2828u
            android.view.View r0 = r0.m0(r14, r15)
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            androidx.recyclerview.widget.RecyclerView$e r0 = r13.f2826t
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2828u
            if (r0 == 0) goto L_0x001f
            boolean r0 = r13.P()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.F
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x0093
            if (r15 == r7) goto L_0x0030
            if (r15 != r2) goto L_0x0093
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2828u
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0047
            if (r15 != r7) goto L_0x003d
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003f
        L_0x003d:
            r0 = 33
        L_0x003f:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r0 != 0) goto L_0x0073
            androidx.recyclerview.widget.RecyclerView$m r8 = r13.f2828u
            boolean r8 = r8.g()
            if (r8 == 0) goto L_0x0073
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2828u
            int r0 = r0.M()
            if (r0 != r2) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r15 != r7) goto L_0x0061
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0068
            r0 = 66
            goto L_0x006a
        L_0x0068:
            r0 = 17
        L_0x006a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x008e
            r13.n()
            android.view.View r0 = r13.C(r14)
            if (r0 != 0) goto L_0x007f
            return r6
        L_0x007f:
            r13.l0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2828u
            androidx.recyclerview.widget.RecyclerView$s r8 = r13.f2798b
            androidx.recyclerview.widget.RecyclerView$x r9 = r13.f2825s0
            r0.h0(r14, r15, r8, r9)
            r13.n0(r1)
        L_0x008e:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b7
        L_0x0093:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00b6
            r13.n()
            android.view.View r0 = r13.C(r14)
            if (r0 != 0) goto L_0x00a5
            return r6
        L_0x00a5:
            r13.l0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2828u
            androidx.recyclerview.widget.RecyclerView$s r3 = r13.f2798b
            androidx.recyclerview.widget.RecyclerView$x r8 = r13.f2825s0
            android.view.View r0 = r0.h0(r14, r15, r3, r8)
            r13.n0(r1)
            goto L_0x00b7
        L_0x00b6:
            r0 = r3
        L_0x00b7:
            if (r0 == 0) goto L_0x00ce
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00ce
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00ca
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00ca:
            r13.c0(r0, r6)
            return r14
        L_0x00ce:
            if (r0 == 0) goto L_0x01a1
            if (r0 == r13) goto L_0x01a1
            if (r0 != r14) goto L_0x00d6
            goto L_0x01a1
        L_0x00d6:
            android.view.View r3 = r13.C(r0)
            if (r3 != 0) goto L_0x00de
            goto L_0x01a2
        L_0x00de:
            if (r14 != 0) goto L_0x00e2
            goto L_0x019f
        L_0x00e2:
            android.view.View r3 = r13.C(r14)
            if (r3 != 0) goto L_0x00ea
            goto L_0x019f
        L_0x00ea:
            android.graphics.Rect r3 = r13.f2812i
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r1, r1, r6, r8)
            android.graphics.Rect r3 = r13.f2822r
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r1, r1, r6, r8)
            android.graphics.Rect r1 = r13.f2812i
            r13.offsetDescendantRectToMyCoords(r14, r1)
            android.graphics.Rect r1 = r13.f2822r
            r13.offsetDescendantRectToMyCoords(r0, r1)
            androidx.recyclerview.widget.RecyclerView$m r1 = r13.f2828u
            int r1 = r1.M()
            if (r1 != r2) goto L_0x0118
            r1 = -1
            goto L_0x0119
        L_0x0118:
            r1 = 1
        L_0x0119:
            android.graphics.Rect r3 = r13.f2812i
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f2822r
            int r9 = r8.left
            if (r6 < r9) goto L_0x0127
            int r10 = r3.right
            if (r10 > r9) goto L_0x012f
        L_0x0127:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x012f
            r6 = 1
            goto L_0x013c
        L_0x012f:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0137
            if (r6 < r11) goto L_0x013b
        L_0x0137:
            if (r6 <= r9) goto L_0x013b
            r6 = -1
            goto L_0x013c
        L_0x013b:
            r6 = 0
        L_0x013c:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x0146
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x014e
        L_0x0146:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x014e
            r3 = 1
            goto L_0x015b
        L_0x014e:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x0156
            if (r9 < r8) goto L_0x015a
        L_0x0156:
            if (r9 <= r10) goto L_0x015a
            r3 = -1
            goto L_0x015b
        L_0x015a:
            r3 = 0
        L_0x015b:
            if (r15 == r2) goto L_0x0197
            if (r15 == r7) goto L_0x018e
            if (r15 == r5) goto L_0x018b
            if (r15 == r4) goto L_0x0188
            r1 = 66
            if (r15 == r1) goto L_0x0185
            r1 = 130(0x82, float:1.82E-43)
            if (r15 != r1) goto L_0x016e
            if (r3 <= 0) goto L_0x01a1
            goto L_0x019f
        L_0x016e:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = androidx.recyclerview.widget.b.a(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x0185:
            if (r6 <= 0) goto L_0x01a1
            goto L_0x019f
        L_0x0188:
            if (r3 >= 0) goto L_0x01a1
            goto L_0x019f
        L_0x018b:
            if (r6 >= 0) goto L_0x01a1
            goto L_0x019f
        L_0x018e:
            if (r3 > 0) goto L_0x019f
            if (r3 != 0) goto L_0x01a1
            int r6 = r6 * r1
            if (r6 <= 0) goto L_0x01a1
            goto L_0x019f
        L_0x0197:
            if (r3 < 0) goto L_0x019f
            if (r3 != 0) goto L_0x01a1
            int r6 = r6 * r1
            if (r6 >= 0) goto L_0x01a1
        L_0x019f:
            r1 = 1
            goto L_0x01a2
        L_0x01a1:
            r1 = 0
        L_0x01a2:
            if (r1 == 0) goto L_0x01a5
            goto L_0x01a9
        L_0x01a5:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x01a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g(l lVar) {
        m mVar = this.f2828u;
        if (mVar != null) {
            mVar.e("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f2834x.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f2834x.add(lVar);
        R();
        requestLayout();
    }

    public void g0(int i10) {
        if (!this.F) {
            p0();
            m mVar = this.f2828u;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            mVar.L0(i10);
            awakenScrollBars();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.f2828u;
        if (mVar != null) {
            return mVar.w();
        }
        throw new IllegalStateException(b.a(this, android.support.v4.media.a.a("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.f2828u;
        if (mVar != null) {
            return mVar.x(getContext(), attributeSet);
        }
        throw new IllegalStateException(b.a(this, android.support.v4.media.a.a("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.f2826t;
    }

    public int getBaseline() {
        m mVar = this.f2828u;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    public int getChildDrawingOrder(int i10, int i11) {
        h hVar = this.A0;
        if (hVar == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        return hVar.a(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.f2808g;
    }

    public v getCompatAccessibilityDelegate() {
        return this.f2839z0;
    }

    public i getEdgeEffectFactory() {
        return this.O;
    }

    public j getItemAnimator() {
        return this.f2797a0;
    }

    public int getItemDecorationCount() {
        return this.f2834x.size();
    }

    public m getLayoutManager() {
        return this.f2828u;
    }

    public int getMaxFlingVelocity() {
        return this.f2816l0;
    }

    public int getMinFlingVelocity() {
        return this.f2815k0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (Q0) {
            return System.nanoTime();
        }
        return 0;
    }

    public o getOnFlingListener() {
        return this.f2814j0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2819o0;
    }

    public r getRecycledViewPool() {
        return this.f2798b.d();
    }

    public int getScrollState() {
        return this.f2799b0;
    }

    public void h(q qVar) {
        if (this.f2829u0 == null) {
            this.f2829u0 = new ArrayList();
        }
        this.f2829u0.add(qVar);
    }

    public boolean h0(a0 a0Var, int i10) {
        if (P()) {
            a0Var.f2858q = i10;
            this.G0.add(a0Var);
            return false;
        }
        c0.I(a0Var.f2842a, i10);
        return true;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public void i(String str) {
        if (P()) {
            if (str == null) {
                throw new IllegalStateException(b.a(this, android.support.v4.media.a.a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.N > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(b.a(this, android.support.v4.media.a.a(""))));
        }
    }

    public void i0(int i10, int i11) {
        j0(i10, i11, (Interpolator) null, Integer.MIN_VALUE, false);
    }

    public boolean isAttachedToWindow() {
        return this.A;
    }

    public final boolean isLayoutSuppressed() {
        return this.F;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f22594d;
    }

    public final void j() {
        d0();
        setScrollState(0);
    }

    public void j0(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        m mVar = this.f2828u;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.F) {
            int i13 = 0;
            if (!mVar.g()) {
                i10 = 0;
            }
            if (!this.f2828u.h()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (i12 == Integer.MIN_VALUE || i12 > 0) {
                    if (z10) {
                        if (i10 != 0) {
                            i13 = 1;
                        }
                        if (i11 != 0) {
                            i13 |= 2;
                        }
                        m0(i13, 1);
                    }
                    this.f2820p0.b(i10, i11, i12, interpolator);
                    return;
                }
                scrollBy(i10, i11);
            }
        }
    }

    public void k0(int i10) {
        if (!this.F) {
            m mVar = this.f2828u;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                mVar.V0(this, this.f2825s0, i10);
            }
        }
    }

    public void l() {
        int h10 = this.f2804e.h();
        for (int i10 = 0; i10 < h10; i10++) {
            a0 L2 = L(this.f2804e.g(i10));
            if (!L2.x()) {
                L2.d();
            }
        }
        s sVar = this.f2798b;
        int size = sVar.f2908c.size();
        for (int i11 = 0; i11 < size; i11++) {
            sVar.f2908c.get(i11).d();
        }
        int size2 = sVar.f2906a.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sVar.f2906a.get(i12).d();
        }
        ArrayList<a0> arrayList = sVar.f2907b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                sVar.f2907b.get(i13).d();
            }
        }
    }

    public void l0() {
        int i10 = this.D + 1;
        this.D = i10;
        if (i10 == 1 && !this.F) {
            this.E = false;
        }
    }

    public void m(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.P;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.P.onRelease();
            z10 = this.P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.R;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.R.onRelease();
            z10 |= this.R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.Q.onRelease();
            z10 |= this.Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.S;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.S.onRelease();
            z10 |= this.S.isFinished();
        }
        if (z10) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(this);
        }
    }

    public boolean m0(int i10, int i11) {
        return getScrollingChildHelper().j(i10, i11);
    }

    public void n() {
        if (!this.C || this.K) {
            k0.k.a("RV FullInvalidate");
            q();
            k0.k.b();
        } else if (this.f2802d.g()) {
            a aVar = this.f2802d;
            int i10 = aVar.f3001f;
            boolean z10 = false;
            if ((i10 & 4) != 0) {
                if (!((i10 & 11) != 0)) {
                    k0.k.a("RV PartialInvalidate");
                    l0();
                    T();
                    this.f2802d.j();
                    if (!this.E) {
                        int e10 = this.f2804e.e();
                        int i11 = 0;
                        while (true) {
                            if (i11 < e10) {
                                a0 L2 = L(this.f2804e.d(i11));
                                if (L2 != null && !L2.x() && L2.r()) {
                                    z10 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            q();
                        } else {
                            this.f2802d.b();
                        }
                    }
                    n0(true);
                    U(true);
                    k0.k.b();
                    return;
                }
            }
            if (aVar.g()) {
                k0.k.a("RV FullInvalidate");
                q();
                k0.k.b();
            }
        }
    }

    public void n0(boolean z10) {
        if (this.D < 1) {
            this.D = 1;
        }
        if (!z10 && !this.F) {
            this.E = false;
        }
        if (this.D == 1) {
            if (z10 && this.E && !this.F && this.f2828u != null && this.f2826t != null) {
                q();
            }
            if (!this.F) {
                this.E = false;
            }
        }
        this.D--;
    }

    public void o(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        setMeasuredDimension(m.j(i10, paddingRight, c0.d.e(this)), m.j(i11, getPaddingBottom() + getPaddingTop(), c0.d.d(this)));
    }

    public void o0(int i10) {
        getScrollingChildHelper().k(i10);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = 0;
        this.A = true;
        this.C = this.C && !isLayoutRequested();
        m mVar = this.f2828u;
        if (mVar != null) {
            mVar.f2881g = true;
        }
        this.f2837y0 = false;
        if (Q0) {
            ThreadLocal<k> threadLocal = k.f3099e;
            k kVar = threadLocal.get();
            this.f2821q0 = kVar;
            if (kVar == null) {
                this.f2821q0 = new k();
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                Display b10 = c0.e.b(this);
                float f10 = 60.0f;
                if (!isInEditMode() && b10 != null) {
                    float refreshRate = b10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                k kVar2 = this.f2821q0;
                kVar2.f3103c = (long) (1.0E9f / f10);
                threadLocal.set(kVar2);
            }
            this.f2821q0.f3101a.add(this);
        }
    }

    public void onDetachedFromWindow() {
        k kVar;
        super.onDetachedFromWindow();
        j jVar = this.f2797a0;
        if (jVar != null) {
            jVar.g();
        }
        p0();
        this.A = false;
        m mVar = this.f2828u;
        if (mVar != null) {
            s sVar = this.f2798b;
            mVar.f2881g = false;
            mVar.g0(this, sVar);
        }
        this.G0.clear();
        removeCallbacks(this.H0);
        this.f2806f.getClass();
        do {
        } while (((t.d) a0.a.f3008d).b() != null);
        if (Q0 && (kVar = this.f2821q0) != null) {
            kVar.f3101a.remove(this);
            this.f2821q0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f2834x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2834x.get(i10).d(canvas, this, this.f2825s0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2828u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r13.F
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r14.getAction()
            r2 = 8
            if (r0 != r2) goto L_0x00dd
            int r0 = r14.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003c
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2828u
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x002c
            r0 = 9
            float r0 = r14.getAxisValue(r0)
            float r0 = -r0
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            androidx.recyclerview.widget.RecyclerView$m r3 = r13.f2828u
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x0061
            r3 = 10
            float r3 = r14.getAxisValue(r3)
            goto L_0x0062
        L_0x003c:
            int r0 = r14.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0060
            r0 = 26
            float r0 = r14.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$m r3 = r13.f2828u
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x0055
            float r0 = -r0
            goto L_0x0061
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView$m r3 = r13.f2828u
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x0060
            r3 = r0
            r0 = 0
            goto L_0x0062
        L_0x0060:
            r0 = 0
        L_0x0061:
            r3 = 0
        L_0x0062:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x006a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00dd
        L_0x006a:
            float r2 = r13.f2817m0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r13.f2818n0
            float r0 = r0 * r3
            int r0 = (int) r0
            androidx.recyclerview.widget.RecyclerView$m r3 = r13.f2828u
            if (r3 != 0) goto L_0x0081
            java.lang.String r14 = "RecyclerView"
            java.lang.String r0 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r14, r0)
            goto L_0x00dd
        L_0x0081:
            boolean r4 = r13.F
            if (r4 == 0) goto L_0x0086
            goto L_0x00dd
        L_0x0086:
            int[] r4 = r13.F0
            r4[r1] = r1
            r5 = 1
            r4[r5] = r1
            boolean r3 = r3.g()
            androidx.recyclerview.widget.RecyclerView$m r4 = r13.f2828u
            boolean r4 = r4.h()
            if (r4 == 0) goto L_0x009c
            r6 = r3 | 2
            goto L_0x009d
        L_0x009c:
            r6 = r3
        L_0x009d:
            r13.m0(r6, r5)
            if (r3 == 0) goto L_0x00a4
            r8 = r2
            goto L_0x00a5
        L_0x00a4:
            r8 = 0
        L_0x00a5:
            if (r4 == 0) goto L_0x00a9
            r9 = r0
            goto L_0x00aa
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            int[] r10 = r13.F0
            int[] r11 = r13.D0
            r12 = 1
            r7 = r13
            boolean r6 = r7.t(r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x00be
            int[] r6 = r13.F0
            r7 = r6[r1]
            int r2 = r2 - r7
            r6 = r6[r5]
            int r0 = r0 - r6
        L_0x00be:
            if (r3 == 0) goto L_0x00c2
            r3 = r2
            goto L_0x00c3
        L_0x00c2:
            r3 = 0
        L_0x00c3:
            if (r4 == 0) goto L_0x00c7
            r4 = r0
            goto L_0x00c8
        L_0x00c7:
            r4 = 0
        L_0x00c8:
            r13.e0(r3, r4, r14, r5)
            androidx.recyclerview.widget.k r14 = r13.f2821q0
            if (r14 == 0) goto L_0x00d6
            if (r2 != 0) goto L_0x00d3
            if (r0 == 0) goto L_0x00d6
        L_0x00d3:
            r14.a(r13, r2, r0)
        L_0x00d6:
            o0.n r14 = r13.getScrollingChildHelper()
            r14.k(r5)
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.F) {
            return false;
        }
        this.f2838z = null;
        if (D(motionEvent)) {
            j();
            return true;
        }
        m mVar = this.f2828u;
        if (mVar == null) {
            return false;
        }
        boolean g10 = mVar.g();
        boolean h10 = this.f2828u.h();
        if (this.f2803d0 == null) {
            this.f2803d0 = VelocityTracker.obtain();
        }
        this.f2803d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.G) {
                this.G = false;
            }
            this.f2801c0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f2809g0 = x10;
            this.f2805e0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f2811h0 = y10;
            this.f2807f0 = y10;
            if (this.f2799b0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                o0(1);
            }
            int[] iArr = this.E0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (h10) {
                g10 |= true;
            }
            m0(g10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f2803d0.clear();
            o0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2801c0);
            if (findPointerIndex < 0) {
                StringBuilder a10 = android.support.v4.media.a.a("Error processing scroll; pointer index for id ");
                a10.append(this.f2801c0);
                a10.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", a10.toString());
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2799b0 != 1) {
                int i10 = x11 - this.f2805e0;
                int i11 = y11 - this.f2807f0;
                if (!g10 || Math.abs(i10) <= this.f2813i0) {
                    z10 = false;
                } else {
                    this.f2809g0 = x11;
                    z10 = true;
                }
                if (h10 && Math.abs(i11) > this.f2813i0) {
                    this.f2811h0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.f2801c0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2809g0 = x12;
            this.f2805e0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2811h0 = y12;
            this.f2807f0 = y12;
        } else if (actionMasked == 6) {
            V(motionEvent);
        }
        if (this.f2799b0 == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        k0.k.a("RV OnLayout");
        q();
        k0.k.b();
        this.C = true;
    }

    public void onMeasure(int i10, int i11) {
        m mVar = this.f2828u;
        if (mVar == null) {
            o(i10, i11);
            return;
        }
        boolean z10 = false;
        if (mVar.Y()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2828u.v0(this.f2798b, this.f2825s0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.I0 = z10;
            if (!z10 && this.f2826t != null) {
                if (this.f2825s0.f2934d == 1) {
                    r();
                }
                this.f2828u.O0(i10, i11);
                this.f2825s0.f2939i = true;
                s();
                this.f2828u.Q0(i10, i11);
                if (this.f2828u.T0()) {
                    this.f2828u.O0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f2825s0.f2939i = true;
                    s();
                    this.f2828u.Q0(i10, i11);
                }
                this.J0 = getMeasuredWidth();
                this.K0 = getMeasuredHeight();
            }
        } else if (this.B) {
            this.f2828u.v0(this.f2798b, this.f2825s0, i10, i11);
        } else {
            if (this.I) {
                l0();
                T();
                X();
                U(true);
                x xVar = this.f2825s0;
                if (xVar.f2941k) {
                    xVar.f2937g = true;
                } else {
                    this.f2802d.c();
                    this.f2825s0.f2937g = false;
                }
                this.I = false;
                n0(false);
            } else if (this.f2825s0.f2941k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.f2826t;
            if (eVar != null) {
                this.f2825s0.f2935e = eVar.b();
            } else {
                this.f2825s0.f2935e = 0;
            }
            l0();
            this.f2828u.v0(this.f2798b, this.f2825s0, i10, i11);
            n0(false);
            this.f2825s0.f2937g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f2800c = vVar;
        super.onRestoreInstanceState(vVar.f25915a);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f2800c;
        if (vVar2 != null) {
            vVar.f2915c = vVar2.f2915c;
        } else {
            m mVar = this.f2828u;
            if (mVar != null) {
                vVar.f2915c = mVar.y0();
            } else {
                vVar.f2915c = null;
            }
        }
        return vVar;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            O();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0321, code lost:
        if (r3 < r8) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03a4, code lost:
        if (r8 != false) goto L_0x03aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            boolean r0 = r6.F
            r8 = 0
            if (r0 != 0) goto L_0x03e7
            boolean r0 = r6.G
            if (r0 == 0) goto L_0x000f
            goto L_0x03e7
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f2838z
            r1 = 3
            r2 = 0
            r9 = 1
            if (r0 != 0) goto L_0x0023
            int r0 = r20.getAction()
            if (r0 != 0) goto L_0x001e
            r0 = 0
            goto L_0x0031
        L_0x001e:
            boolean r0 = r19.D(r20)
            goto L_0x0031
        L_0x0023:
            r0.b(r6, r7)
            int r0 = r20.getAction()
            if (r0 == r1) goto L_0x002e
            if (r0 != r9) goto L_0x0030
        L_0x002e:
            r6.f2838z = r2
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r0 == 0) goto L_0x0037
            r19.j()
            return r9
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.f2828u
            if (r0 != 0) goto L_0x003c
            return r8
        L_0x003c:
            boolean r10 = r0.g()
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.f2828u
            boolean r11 = r0.h()
            android.view.VelocityTracker r0 = r6.f2803d0
            if (r0 != 0) goto L_0x0050
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f2803d0 = r0
        L_0x0050:
            int r0 = r20.getActionMasked()
            int r3 = r20.getActionIndex()
            if (r0 != 0) goto L_0x0060
            int[] r4 = r6.E0
            r4[r9] = r8
            r4[r8] = r8
        L_0x0060:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r20)
            int[] r4 = r6.E0
            r5 = r4[r8]
            float r5 = (float) r5
            r4 = r4[r9]
            float r4 = (float) r4
            r12.offsetLocation(r5, r4)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x03af
            java.lang.String r5 = "RecyclerView"
            r13 = 2
            if (r0 == r9) goto L_0x018f
            if (r0 == r13) goto L_0x00aa
            if (r0 == r1) goto L_0x00a5
            r1 = 5
            if (r0 == r1) goto L_0x0089
            r1 = 6
            if (r0 == r1) goto L_0x0084
            goto L_0x018a
        L_0x0084:
            r19.V(r20)
            goto L_0x018a
        L_0x0089:
            int r0 = r7.getPointerId(r3)
            r6.f2801c0 = r0
            float r0 = r7.getX(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f2809g0 = r0
            r6.f2805e0 = r0
            float r0 = r7.getY(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f2811h0 = r0
            r6.f2807f0 = r0
            goto L_0x018a
        L_0x00a5:
            r19.j()
            goto L_0x018a
        L_0x00aa:
            int r0 = r6.f2801c0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00ca
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
            int r1 = r6.f2801c0
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r5, r0)
            return r8
        L_0x00ca:
            float r1 = r7.getX(r0)
            float r1 = r1 + r4
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r4
            int r14 = (int) r0
            int r0 = r6.f2809g0
            int r0 = r0 - r13
            int r1 = r6.f2811h0
            int r1 = r1 - r14
            int r2 = r6.f2799b0
            if (r2 == r9) goto L_0x0113
            if (r10 == 0) goto L_0x00f7
            if (r0 <= 0) goto L_0x00ec
            int r2 = r6.f2813i0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00f3
        L_0x00ec:
            int r2 = r6.f2813i0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00f3:
            if (r0 == 0) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            if (r11 == 0) goto L_0x010e
            if (r1 <= 0) goto L_0x0104
            int r3 = r6.f2813i0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x010b
        L_0x0104:
            int r3 = r6.f2813i0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x010b:
            if (r1 == 0) goto L_0x010e
            r2 = 1
        L_0x010e:
            if (r2 == 0) goto L_0x0113
            r6.setScrollState(r9)
        L_0x0113:
            r15 = r0
            r16 = r1
            int r0 = r6.f2799b0
            if (r0 != r9) goto L_0x018a
            int[] r3 = r6.F0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0124
            r1 = r15
            goto L_0x0126
        L_0x0124:
            r0 = 0
            r1 = 0
        L_0x0126:
            if (r11 == 0) goto L_0x012b
            r2 = r16
            goto L_0x012d
        L_0x012b:
            r0 = 0
            r2 = 0
        L_0x012d:
            int[] r4 = r6.D0
            r5 = 0
            r0 = r19
            boolean r0 = r0.t(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x015a
            int[] r0 = r6.F0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.E0
            r1 = r0[r8]
            int[] r2 = r6.D0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r19.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x015a:
            r0 = r16
            int[] r1 = r6.D0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f2809g0 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f2811h0 = r14
            if (r10 == 0) goto L_0x016c
            r1 = r15
            goto L_0x016d
        L_0x016c:
            r1 = 0
        L_0x016d:
            if (r11 == 0) goto L_0x0171
            r2 = r0
            goto L_0x0172
        L_0x0171:
            r2 = 0
        L_0x0172:
            boolean r1 = r6.e0(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x017f
            android.view.ViewParent r1 = r19.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x017f:
            androidx.recyclerview.widget.k r1 = r6.f2821q0
            if (r1 == 0) goto L_0x018a
            if (r15 != 0) goto L_0x0187
            if (r0 == 0) goto L_0x018a
        L_0x0187:
            r1.a(r6, r15, r0)
        L_0x018a:
            r5 = r6
            r16 = r12
            goto L_0x03d5
        L_0x018f:
            android.view.VelocityTracker r0 = r6.f2803d0
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f2803d0
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r6.f2816l0
            float r3 = (float) r3
            r0.computeCurrentVelocity(r1, r3)
            r0 = 0
            if (r10 == 0) goto L_0x01ab
            android.view.VelocityTracker r1 = r6.f2803d0
            int r3 = r6.f2801c0
            float r1 = r1.getXVelocity(r3)
            float r1 = -r1
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            if (r11 == 0) goto L_0x01b8
            android.view.VelocityTracker r3 = r6.f2803d0
            int r4 = r6.f2801c0
            float r3 = r3.getYVelocity(r4)
            float r3 = -r3
            goto L_0x01b9
        L_0x01b8:
            r3 = 0
        L_0x01b9:
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x01c7
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c2
            goto L_0x01c7
        L_0x01c2:
            r5 = r6
            r16 = r12
            goto L_0x03a6
        L_0x01c7:
            int r0 = (int) r1
            int r1 = (int) r3
            androidx.recyclerview.widget.RecyclerView$m r3 = r6.f2828u
            if (r3 != 0) goto L_0x01d3
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r5, r0)
            goto L_0x01fc
        L_0x01d3:
            boolean r4 = r6.F
            if (r4 == 0) goto L_0x01d8
            goto L_0x01fc
        L_0x01d8:
            boolean r3 = r3.g()
            androidx.recyclerview.widget.RecyclerView$m r4 = r6.f2828u
            boolean r4 = r4.h()
            if (r3 == 0) goto L_0x01ec
            int r5 = java.lang.Math.abs(r0)
            int r7 = r6.f2815k0
            if (r5 >= r7) goto L_0x01ed
        L_0x01ec:
            r0 = 0
        L_0x01ed:
            if (r4 == 0) goto L_0x01f7
            int r5 = java.lang.Math.abs(r1)
            int r7 = r6.f2815k0
            if (r5 >= r7) goto L_0x01f8
        L_0x01f7:
            r1 = 0
        L_0x01f8:
            if (r0 != 0) goto L_0x0201
            if (r1 != 0) goto L_0x0201
        L_0x01fc:
            r5 = r6
            r16 = r12
            goto L_0x03a4
        L_0x0201:
            float r5 = (float) r0
            float r7 = (float) r1
            boolean r9 = r6.dispatchNestedPreFling(r5, r7)
            if (r9 != 0) goto L_0x03a0
            if (r3 != 0) goto L_0x0210
            if (r4 == 0) goto L_0x020e
            goto L_0x0210
        L_0x020e:
            r9 = 0
            goto L_0x0211
        L_0x0210:
            r9 = 1
        L_0x0211:
            r6.dispatchNestedFling(r5, r7, r9)
            androidx.recyclerview.widget.RecyclerView$o r5 = r6.f2814j0
            if (r5 == 0) goto L_0x033a
            androidx.recyclerview.widget.y r5 = (androidx.recyclerview.widget.y) r5
            androidx.recyclerview.widget.RecyclerView r7 = r5.f3145a
            androidx.recyclerview.widget.RecyclerView$m r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x0223
            goto L_0x023f
        L_0x0223:
            androidx.recyclerview.widget.RecyclerView r10 = r5.f3145a
            androidx.recyclerview.widget.RecyclerView$e r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x022c
            goto L_0x023f
        L_0x022c:
            androidx.recyclerview.widget.RecyclerView r10 = r5.f3145a
            int r10 = r10.getMinFlingVelocity()
            int r11 = java.lang.Math.abs(r1)
            if (r11 > r10) goto L_0x0247
            int r11 = java.lang.Math.abs(r0)
            if (r11 <= r10) goto L_0x023f
            goto L_0x0247
        L_0x023f:
            r20 = r3
            r18 = r4
            r16 = r12
            goto L_0x0333
        L_0x0247:
            boolean r10 = r7 instanceof androidx.recyclerview.widget.RecyclerView.w.b
            if (r10 != 0) goto L_0x024c
            goto L_0x025e
        L_0x024c:
            androidx.recyclerview.widget.s r5 = (androidx.recyclerview.widget.s) r5
            if (r10 != 0) goto L_0x0251
            goto L_0x025c
        L_0x0251:
            androidx.recyclerview.widget.r r2 = new androidx.recyclerview.widget.r
            androidx.recyclerview.widget.RecyclerView r11 = r5.f3145a
            android.content.Context r11 = r11.getContext()
            r2.<init>(r5, r11)
        L_0x025c:
            if (r2 != 0) goto L_0x0266
        L_0x025e:
            r20 = r3
            r18 = r4
            r16 = r12
            goto L_0x032f
        L_0x0266:
            int r8 = r7.L()
            if (r8 != 0) goto L_0x026d
            goto L_0x0286
        L_0x026d:
            boolean r11 = r7.h()
            if (r11 == 0) goto L_0x0278
            androidx.recyclerview.widget.q r11 = r5.f(r7)
            goto L_0x0284
        L_0x0278:
            boolean r11 = r7.g()
            if (r11 == 0) goto L_0x0283
            androidx.recyclerview.widget.q r11 = r5.e(r7)
            goto L_0x0284
        L_0x0283:
            r11 = 0
        L_0x0284:
            if (r11 != 0) goto L_0x028e
        L_0x0286:
            r20 = r3
            r18 = r4
            r16 = r12
            goto L_0x0323
        L_0x028e:
            int r13 = r7.A()
            r14 = 0
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = 2147483647(0x7fffffff, float:NaN)
            r17 = 0
            r18 = 0
            r20 = r3
            r16 = r12
            r6 = r17
            r3 = 0
            r12 = 2147483647(0x7fffffff, float:NaN)
        L_0x02a6:
            if (r3 >= r13) goto L_0x02cc
            r17 = r13
            android.view.View r13 = r7.z(r3)
            if (r13 != 0) goto L_0x02b3
            r18 = r4
            goto L_0x02c5
        L_0x02b3:
            r18 = r4
            int r4 = r5.c(r13, r11)
            if (r4 > 0) goto L_0x02bf
            if (r4 <= r15) goto L_0x02bf
            r15 = r4
            r6 = r13
        L_0x02bf:
            if (r4 < 0) goto L_0x02c5
            if (r4 >= r12) goto L_0x02c5
            r12 = r4
            r14 = r13
        L_0x02c5:
            int r3 = r3 + 1
            r13 = r17
            r4 = r18
            goto L_0x02a6
        L_0x02cc:
            r18 = r4
            boolean r3 = r7.g()
            if (r3 == 0) goto L_0x02d7
            if (r0 <= 0) goto L_0x02db
            goto L_0x02d9
        L_0x02d7:
            if (r1 <= 0) goto L_0x02db
        L_0x02d9:
            r3 = 1
            goto L_0x02dc
        L_0x02db:
            r3 = 0
        L_0x02dc:
            if (r3 == 0) goto L_0x02e5
            if (r14 == 0) goto L_0x02e5
            int r3 = r7.T(r14)
            goto L_0x0324
        L_0x02e5:
            if (r3 != 0) goto L_0x02ee
            if (r6 == 0) goto L_0x02ee
            int r3 = r7.T(r6)
            goto L_0x0324
        L_0x02ee:
            if (r3 == 0) goto L_0x02f1
            r14 = r6
        L_0x02f1:
            if (r14 != 0) goto L_0x02f4
            goto L_0x0323
        L_0x02f4:
            int r4 = r7.T(r14)
            int r5 = r7.L()
            if (r10 == 0) goto L_0x0318
            r6 = r7
            androidx.recyclerview.widget.RecyclerView$w$b r6 = (androidx.recyclerview.widget.RecyclerView.w.b) r6
            int r5 = r5 + -1
            android.graphics.PointF r5 = r6.a(r5)
            if (r5 == 0) goto L_0x0318
            float r6 = r5.x
            r10 = 0
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x0316
            float r5 = r5.y
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0318
        L_0x0316:
            r5 = 1
            goto L_0x0319
        L_0x0318:
            r5 = 0
        L_0x0319:
            if (r5 != r3) goto L_0x031d
            r3 = -1
            goto L_0x031e
        L_0x031d:
            r3 = 1
        L_0x031e:
            int r3 = r3 + r4
            if (r3 < 0) goto L_0x0323
            if (r3 < r8) goto L_0x0324
        L_0x0323:
            r3 = -1
        L_0x0324:
            r4 = -1
            if (r3 != r4) goto L_0x0329
            r8 = 0
            goto L_0x032f
        L_0x0329:
            r2.f2916a = r3
            r7.W0(r2)
            r8 = 1
        L_0x032f:
            if (r8 == 0) goto L_0x0333
            r2 = 1
            goto L_0x0334
        L_0x0333:
            r2 = 0
        L_0x0334:
            if (r2 == 0) goto L_0x0340
            r8 = 1
            r5 = r19
            goto L_0x03a4
        L_0x033a:
            r20 = r3
            r18 = r4
            r16 = r12
        L_0x0340:
            if (r9 == 0) goto L_0x039d
            if (r18 == 0) goto L_0x0347
            r3 = r20 | 2
            goto L_0x0349
        L_0x0347:
            r3 = r20
        L_0x0349:
            r2 = 1
            r5 = r19
            r5.m0(r3, r2)
            int r2 = r5.f2816l0
            int r3 = -r2
            int r0 = java.lang.Math.min(r0, r2)
            int r9 = java.lang.Math.max(r3, r0)
            int r0 = r5.f2816l0
            int r2 = -r0
            int r0 = java.lang.Math.min(r1, r0)
            int r10 = java.lang.Math.max(r2, r0)
            androidx.recyclerview.widget.RecyclerView$z r0 = r5.f2820p0
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            r2 = 2
            r1.setScrollState(r2)
            r1 = 0
            r0.f2948b = r1
            r0.f2947a = r1
            android.view.animation.Interpolator r1 = r0.f2950d
            android.view.animation.Interpolator r2 = S0
            if (r1 == r2) goto L_0x0387
            r0.f2950d = r2
            android.widget.OverScroller r1 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r2)
            r0.f2949c = r1
        L_0x0387:
            android.widget.OverScroller r6 = r0.f2949c
            r7 = 0
            r8 = 0
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.a()
            r8 = 1
            goto L_0x03a4
        L_0x039d:
            r5 = r19
            goto L_0x03a3
        L_0x03a0:
            r5 = r6
            r16 = r12
        L_0x03a3:
            r8 = 0
        L_0x03a4:
            if (r8 != 0) goto L_0x03aa
        L_0x03a6:
            r0 = 0
            r5.setScrollState(r0)
        L_0x03aa:
            r19.d0()
            r0 = 1
            goto L_0x03d6
        L_0x03af:
            r5 = r6
            r16 = r12
            r0 = 0
            int r0 = r7.getPointerId(r0)
            r5.f2801c0 = r0
            float r0 = r20.getX()
            float r0 = r0 + r4
            int r0 = (int) r0
            r5.f2809g0 = r0
            r5.f2805e0 = r0
            float r0 = r20.getY()
            float r0 = r0 + r4
            int r0 = (int) r0
            r5.f2811h0 = r0
            r5.f2807f0 = r0
            if (r11 == 0) goto L_0x03d1
            r10 = r10 | 2
        L_0x03d1:
            r0 = 0
            r5.m0(r10, r0)
        L_0x03d5:
            r0 = 0
        L_0x03d6:
            if (r0 != 0) goto L_0x03e0
            android.view.VelocityTracker r0 = r5.f2803d0
            r1 = r16
            r0.addMovement(r1)
            goto L_0x03e2
        L_0x03e0:
            r1 = r16
        L_0x03e2:
            r1.recycle()
            r0 = 1
            return r0
        L_0x03e7:
            r5 = r6
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view) {
        a0 L2 = L(view);
        e eVar = this.f2826t;
        if (eVar != null && L2 != null) {
            eVar.j(L2);
        }
    }

    public void p0() {
        w wVar;
        setScrollState(0);
        this.f2820p0.c();
        m mVar = this.f2828u;
        if (mVar != null && (wVar = mVar.f2879e) != null) {
            wVar.f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0350, code lost:
        if (r15.f2804e.k(getFocusedChild()) == false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d9, code lost:
        r5 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q() {
        /*
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f2826t
            java.lang.String r1 = "RecyclerView"
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "No adapter attached; skipping layout"
            android.util.Log.w(r1, r0)
            return
        L_0x000c:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "No layout manager attached; skipping layout"
            android.util.Log.e(r1, r0)
            return
        L_0x0016:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f2825s0
            r2 = 0
            r0.f2939i = r2
            boolean r0 = r15.I0
            r3 = 1
            if (r0 == 0) goto L_0x0032
            int r0 = r15.J0
            int r4 = r15.getWidth()
            if (r0 != r4) goto L_0x0030
            int r0 = r15.K0
            int r4 = r15.getHeight()
            if (r0 == r4) goto L_0x0032
        L_0x0030:
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r15.J0 = r2
            r15.K0 = r2
            r15.I0 = r2
            androidx.recyclerview.widget.RecyclerView$x r4 = r15.f2825s0
            int r4 = r4.f2934d
            if (r4 != r3) goto L_0x004b
            r15.r()
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            r0.N0(r15)
            r15.s()
            goto L_0x0087
        L_0x004b:
            androidx.recyclerview.widget.a r4 = r15.f2802d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r4.f2998c
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x005f
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r4 = r4.f2997b
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x005f
            r4 = 1
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            if (r4 != 0) goto L_0x007f
            if (r0 != 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            int r0 = r0.f2888n
            int r4 = r15.getWidth()
            if (r0 != r4) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            int r0 = r0.f2889o
            int r4 = r15.getHeight()
            if (r0 == r4) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            r0.N0(r15)
            goto L_0x0087
        L_0x007f:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            r0.N0(r15)
            r15.s()
        L_0x0087:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f2825s0
            r4 = 4
            r0.a(r4)
            r15.l0()
            r15.T()
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f2825s0
            r0.f2934d = r3
            boolean r0 = r0.f2940j
            r5 = 0
            if (r0 == 0) goto L_0x02b1
            androidx.recyclerview.widget.c r0 = r15.f2804e
            int r0 = r0.e()
            int r0 = r0 - r3
        L_0x00a3:
            if (r0 < 0) goto L_0x01d4
            androidx.recyclerview.widget.c r3 = r15.f2804e
            android.view.View r3 = r3.d(r0)
            androidx.recyclerview.widget.RecyclerView$a0 r3 = L(r3)
            boolean r6 = r3.x()
            if (r6 == 0) goto L_0x00b7
            goto L_0x01cf
        L_0x00b7:
            long r6 = r15.J(r3)
            androidx.recyclerview.widget.RecyclerView$j r8 = r15.f2797a0
            r8.getClass()
            androidx.recyclerview.widget.RecyclerView$j$c r8 = new androidx.recyclerview.widget.RecyclerView$j$c
            r8.<init>()
            android.view.View r9 = r3.f2842a
            int r10 = r9.getLeft()
            r8.f2872a = r10
            int r10 = r9.getTop()
            r8.f2873b = r10
            r9.getRight()
            r9.getBottom()
            androidx.recyclerview.widget.a0 r9 = r15.f2806f
            s.f<androidx.recyclerview.widget.RecyclerView$a0> r9 = r9.f3007b
            java.lang.Object r9 = r9.f(r6, r5)
            androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.a0) r9
            if (r9 == 0) goto L_0x01ca
            boolean r10 = r9.x()
            if (r10 != 0) goto L_0x01ca
            androidx.recyclerview.widget.a0 r10 = r15.f2806f
            boolean r10 = r10.d(r9)
            androidx.recyclerview.widget.a0 r11 = r15.f2806f
            boolean r11 = r11.d(r3)
            if (r10 == 0) goto L_0x0102
            if (r9 != r3) goto L_0x0102
            androidx.recyclerview.widget.a0 r4 = r15.f2806f
            r4.b(r3, r8)
            goto L_0x01cf
        L_0x0102:
            androidx.recyclerview.widget.a0 r12 = r15.f2806f
            androidx.recyclerview.widget.RecyclerView$j$c r4 = r12.e(r9, r4)
            androidx.recyclerview.widget.a0 r12 = r15.f2806f
            r12.b(r3, r8)
            androidx.recyclerview.widget.a0 r8 = r15.f2806f
            r12 = 8
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r8.e(r3, r12)
            if (r4 != 0) goto L_0x01a0
            androidx.recyclerview.widget.c r4 = r15.f2804e
            int r4 = r4.e()
            r8 = 0
        L_0x011e:
            if (r8 >= r4) goto L_0x017c
            androidx.recyclerview.widget.c r10 = r15.f2804e
            android.view.View r10 = r10.d(r8)
            androidx.recyclerview.widget.RecyclerView$a0 r10 = L(r10)
            if (r10 != r3) goto L_0x012d
            goto L_0x0179
        L_0x012d:
            long r11 = r15.J(r10)
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x0179
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f2826t
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x015c
            boolean r0 = r0.f2864b
            if (r0 == 0) goto L_0x015c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r2.append(r4)
            r2.append(r10)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = androidx.recyclerview.widget.b.a(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r2.append(r4)
            r2.append(r10)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = androidx.recyclerview.widget.b.a(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0179:
            int r8 = r8 + 1
            goto L_0x011e
        L_0x017c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r4.append(r6)
            r4.append(r9)
            java.lang.String r6 = " cannot be found but it is necessary for "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r15.A()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.e(r1, r3)
            goto L_0x01cf
        L_0x01a0:
            r9.w(r2)
            if (r10 == 0) goto L_0x01a8
            r15.f(r9)
        L_0x01a8:
            if (r9 == r3) goto L_0x01be
            if (r11 == 0) goto L_0x01af
            r15.f(r3)
        L_0x01af:
            r9.f2849h = r3
            r15.f(r9)
            androidx.recyclerview.widget.RecyclerView$s r6 = r15.f2798b
            r6.m(r9)
            r3.w(r2)
            r3.f2850i = r9
        L_0x01be:
            androidx.recyclerview.widget.RecyclerView$j r6 = r15.f2797a0
            boolean r3 = r6.a(r9, r3, r4, r8)
            if (r3 == 0) goto L_0x01cf
            r15.W()
            goto L_0x01cf
        L_0x01ca:
            androidx.recyclerview.widget.a0 r4 = r15.f2806f
            r4.b(r3, r8)
        L_0x01cf:
            int r0 = r0 + -1
            r4 = 4
            goto L_0x00a3
        L_0x01d4:
            androidx.recyclerview.widget.a0 r0 = r15.f2806f
            androidx.recyclerview.widget.a0$b r1 = r15.L0
            s.i<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r3 = r0.f3006a
            int r3 = r3.f24851c
        L_0x01dc:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x02b1
            s.i<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r4 = r0.f3006a
            java.lang.Object r4 = r4.h(r3)
            r7 = r4
            androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.a0) r7
            s.i<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r4 = r0.f3006a
            java.lang.Object r4 = r4.j(r3)
            androidx.recyclerview.widget.a0$a r4 = (androidx.recyclerview.widget.a0.a) r4
            int r6 = r4.f3009a
            r8 = r6 & 3
            r9 = 3
            if (r8 != r9) goto L_0x0208
            r6 = r1
            androidx.recyclerview.widget.RecyclerView$d r6 = (androidx.recyclerview.widget.RecyclerView.d) r6
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r8 = r6.f2828u
            android.view.View r7 = r7.f2842a
            androidx.recyclerview.widget.RecyclerView$s r6 = r6.f2798b
            r8.D0(r7, r6)
            goto L_0x02ac
        L_0x0208:
            r8 = r6 & 1
            if (r8 == 0) goto L_0x022a
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r4.f3010b
            if (r6 != 0) goto L_0x0220
            r6 = r1
            androidx.recyclerview.widget.RecyclerView$d r6 = (androidx.recyclerview.widget.RecyclerView.d) r6
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r8 = r6.f2828u
            android.view.View r7 = r7.f2842a
            androidx.recyclerview.widget.RecyclerView$s r6 = r6.f2798b
            r8.D0(r7, r6)
            goto L_0x02ac
        L_0x0220:
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r4.f3011c
            r9 = r1
            androidx.recyclerview.widget.RecyclerView$d r9 = (androidx.recyclerview.widget.RecyclerView.d) r9
            r9.b(r7, r6, r8)
            goto L_0x02ac
        L_0x022a:
            r8 = r6 & 14
            r9 = 14
            if (r8 != r9) goto L_0x023c
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r4.f3010b
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r4.f3011c
            r9 = r1
            androidx.recyclerview.widget.RecyclerView$d r9 = (androidx.recyclerview.widget.RecyclerView.d) r9
            r9.a(r7, r6, r8)
            goto L_0x02ac
        L_0x023c:
            r8 = r6 & 12
            r9 = 12
            if (r8 != r9) goto L_0x0291
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r4.f3010b
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r4.f3011c
            r12 = r1
            androidx.recyclerview.widget.RecyclerView$d r12 = (androidx.recyclerview.widget.RecyclerView.d) r12
            r12.getClass()
            r7.w(r2)
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            boolean r10 = r9.K
            if (r10 == 0) goto L_0x0263
            androidx.recyclerview.widget.RecyclerView$j r9 = r9.f2797a0
            boolean r6 = r9.a(r7, r7, r6, r8)
            if (r6 == 0) goto L_0x02ac
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            r6.W()
            goto L_0x02ac
        L_0x0263:
            androidx.recyclerview.widget.RecyclerView$j r9 = r9.f2797a0
            androidx.recyclerview.widget.x r9 = (androidx.recyclerview.widget.x) r9
            r9.getClass()
            int r10 = r6.f2872a
            int r11 = r8.f2872a
            if (r10 != r11) goto L_0x027c
            int r13 = r6.f2873b
            int r14 = r8.f2873b
            if (r13 == r14) goto L_0x0277
            goto L_0x027c
        L_0x0277:
            r9.d(r7)
            r6 = 0
            goto L_0x0289
        L_0x027c:
            int r13 = r6.f2873b
            int r14 = r8.f2873b
            r6 = r9
            r8 = r10
            r9 = r13
            r10 = r11
            r11 = r14
            boolean r6 = r6.m(r7, r8, r9, r10, r11)
        L_0x0289:
            if (r6 == 0) goto L_0x02ac
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            r6.W()
            goto L_0x02ac
        L_0x0291:
            r8 = r6 & 4
            if (r8 == 0) goto L_0x029e
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r4.f3010b
            r8 = r1
            androidx.recyclerview.widget.RecyclerView$d r8 = (androidx.recyclerview.widget.RecyclerView.d) r8
            r8.b(r7, r6, r5)
            goto L_0x02ac
        L_0x029e:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x02ac
            androidx.recyclerview.widget.RecyclerView$j$c r6 = r4.f3010b
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r4.f3011c
            r9 = r1
            androidx.recyclerview.widget.RecyclerView$d r9 = (androidx.recyclerview.widget.RecyclerView.d) r9
            r9.a(r7, r6, r8)
        L_0x02ac:
            androidx.recyclerview.widget.a0.a.b(r4)
            goto L_0x01dc
        L_0x02b1:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            androidx.recyclerview.widget.RecyclerView$s r1 = r15.f2798b
            r0.C0(r1)
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f2825s0
            int r1 = r0.f2935e
            r0.f2932b = r1
            r15.K = r2
            r15.L = r2
            r0.f2940j = r2
            r0.f2941k = r2
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            r0.f2880f = r2
            androidx.recyclerview.widget.RecyclerView$s r0 = r15.f2798b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r0.f2907b
            if (r0 == 0) goto L_0x02d3
            r0.clear()
        L_0x02d3:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            boolean r1 = r0.f2885k
            if (r1 == 0) goto L_0x02e2
            r0.f2884j = r2
            r0.f2885k = r2
            androidx.recyclerview.widget.RecyclerView$s r0 = r15.f2798b
            r0.n()
        L_0x02e2:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2828u
            androidx.recyclerview.widget.RecyclerView$x r1 = r15.f2825s0
            r0.u0(r1)
            r0 = 1
            r15.U(r0)
            r15.n0(r2)
            androidx.recyclerview.widget.a0 r1 = r15.f2806f
            s.i<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r3 = r1.f3006a
            r3.clear()
            s.f<androidx.recyclerview.widget.RecyclerView$a0> r1 = r1.f3007b
            r1.b()
            int[] r1 = r15.B0
            r3 = r1[r2]
            r4 = r1[r0]
            r15.E(r1)
            int[] r1 = r15.B0
            r6 = r1[r2]
            if (r6 != r3) goto L_0x0312
            r0 = r1[r0]
            if (r0 == r4) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r0 = 0
            goto L_0x0313
        L_0x0312:
            r0 = 1
        L_0x0313:
            if (r0 == 0) goto L_0x0318
            r15.v(r2, r2)
        L_0x0318:
            boolean r0 = r15.f2819o0
            r3 = -1
            if (r0 == 0) goto L_0x0413
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f2826t
            if (r0 == 0) goto L_0x0413
            boolean r0 = r15.hasFocus()
            if (r0 == 0) goto L_0x0413
            int r0 = r15.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x0413
            int r0 = r15.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0340
            boolean r0 = r15.isFocused()
            if (r0 == 0) goto L_0x0340
            goto L_0x0413
        L_0x0340:
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x0354
            android.view.View r0 = r15.getFocusedChild()
            androidx.recyclerview.widget.c r1 = r15.f2804e
            boolean r0 = r1.k(r0)
            if (r0 != 0) goto L_0x0354
            goto L_0x0413
        L_0x0354:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f2825s0
            long r0 = r0.f2943m
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0398
            androidx.recyclerview.widget.RecyclerView$e r6 = r15.f2826t
            boolean r6 = r6.f2864b
            if (r6 == 0) goto L_0x0398
            if (r6 != 0) goto L_0x0366
            r8 = r5
            goto L_0x0396
        L_0x0366:
            androidx.recyclerview.widget.c r6 = r15.f2804e
            int r6 = r6.h()
            r7 = 0
            r8 = r5
        L_0x036e:
            if (r7 >= r6) goto L_0x0396
            androidx.recyclerview.widget.c r9 = r15.f2804e
            android.view.View r9 = r9.g(r7)
            androidx.recyclerview.widget.RecyclerView$a0 r9 = L(r9)
            if (r9 == 0) goto L_0x0393
            boolean r10 = r9.o()
            if (r10 != 0) goto L_0x0393
            long r10 = r9.f2846e
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0393
            androidx.recyclerview.widget.c r8 = r15.f2804e
            android.view.View r10 = r9.f2842a
            boolean r8 = r8.k(r10)
            if (r8 == 0) goto L_0x0399
            r8 = r9
        L_0x0393:
            int r7 = r7 + 1
            goto L_0x036e
        L_0x0396:
            r9 = r8
            goto L_0x0399
        L_0x0398:
            r9 = r5
        L_0x0399:
            if (r9 == 0) goto L_0x03b1
            androidx.recyclerview.widget.c r0 = r15.f2804e
            android.view.View r1 = r9.f2842a
            boolean r0 = r0.k(r1)
            if (r0 != 0) goto L_0x03b1
            android.view.View r0 = r9.f2842a
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x03ae
            goto L_0x03b1
        L_0x03ae:
            android.view.View r5 = r9.f2842a
            goto L_0x03f8
        L_0x03b1:
            androidx.recyclerview.widget.c r0 = r15.f2804e
            int r0 = r0.e()
            if (r0 <= 0) goto L_0x03f8
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f2825s0
            int r1 = r0.f2942l
            r6 = -1
            if (r1 == r6) goto L_0x03c1
            r2 = r1
        L_0x03c1:
            int r0 = r0.b()
            r1 = r2
        L_0x03c6:
            if (r1 >= r0) goto L_0x03de
            androidx.recyclerview.widget.RecyclerView$a0 r6 = r15.G(r1)
            if (r6 != 0) goto L_0x03cf
            goto L_0x03de
        L_0x03cf:
            android.view.View r7 = r6.f2842a
            boolean r7 = r7.hasFocusable()
            if (r7 == 0) goto L_0x03db
            android.view.View r0 = r6.f2842a
        L_0x03d9:
            r5 = r0
            goto L_0x03f8
        L_0x03db:
            int r1 = r1 + 1
            goto L_0x03c6
        L_0x03de:
            int r0 = java.lang.Math.min(r0, r2)
        L_0x03e2:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x03f8
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r15.G(r0)
            if (r1 != 0) goto L_0x03ed
            goto L_0x03f8
        L_0x03ed:
            android.view.View r2 = r1.f2842a
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L_0x03e2
            android.view.View r0 = r1.f2842a
            goto L_0x03d9
        L_0x03f8:
            if (r5 == 0) goto L_0x0413
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f2825s0
            int r0 = r0.f2944n
            long r1 = (long) r0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0410
            android.view.View r0 = r5.findViewById(r0)
            if (r0 == 0) goto L_0x0410
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x0410
            r5 = r0
        L_0x0410:
            r5.requestFocus()
        L_0x0413:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f2825s0
            r0.f2943m = r3
            r1 = -1
            r0.f2942l = r1
            r0.f2944n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    public final void r() {
        a0 a0Var;
        int i10;
        View C2;
        this.f2825s0.a(1);
        B(this.f2825s0);
        this.f2825s0.f2939i = false;
        l0();
        a0 a0Var2 = this.f2806f;
        a0Var2.f3006a.clear();
        a0Var2.f3007b.b();
        T();
        X();
        View focusedChild = (!this.f2819o0 || !hasFocus() || this.f2826t == null) ? null : getFocusedChild();
        if (focusedChild == null || (C2 = C(focusedChild)) == null) {
            a0Var = null;
        } else {
            a0Var = K(C2);
        }
        long j10 = -1;
        if (a0Var == null) {
            x xVar = this.f2825s0;
            xVar.f2943m = -1;
            xVar.f2942l = -1;
            xVar.f2944n = -1;
        } else {
            x xVar2 = this.f2825s0;
            if (this.f2826t.f2864b) {
                j10 = a0Var.f2846e;
            }
            xVar2.f2943m = j10;
            if (this.K) {
                i10 = -1;
            } else if (a0Var.o()) {
                i10 = a0Var.f2845d;
            } else {
                i10 = a0Var.f();
            }
            xVar2.f2942l = i10;
            x xVar3 = this.f2825s0;
            View view = a0Var.f2842a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            xVar3.f2944n = id2;
        }
        x xVar4 = this.f2825s0;
        xVar4.f2938h = xVar4.f2940j && this.f2833w0;
        this.f2833w0 = false;
        this.f2831v0 = false;
        xVar4.f2937g = xVar4.f2941k;
        xVar4.f2935e = this.f2826t.b();
        E(this.B0);
        if (this.f2825s0.f2940j) {
            int e10 = this.f2804e.e();
            for (int i11 = 0; i11 < e10; i11++) {
                a0 L2 = L(this.f2804e.d(i11));
                if (!L2.x() && (!L2.m() || this.f2826t.f2864b)) {
                    j jVar = this.f2797a0;
                    j.b(L2);
                    L2.i();
                    this.f2806f.c(L2, jVar.i(L2));
                    if (this.f2825s0.f2938h && L2.r() && !L2.o() && !L2.x() && !L2.m()) {
                        this.f2806f.f3007b.h(J(L2), L2);
                    }
                }
            }
        }
        if (this.f2825s0.f2941k) {
            int h10 = this.f2804e.h();
            for (int i12 = 0; i12 < h10; i12++) {
                a0 L3 = L(this.f2804e.g(i12));
                if (!L3.x() && L3.f2845d == -1) {
                    L3.f2845d = L3.f2844c;
                }
            }
            x xVar5 = this.f2825s0;
            boolean z10 = xVar5.f2936f;
            xVar5.f2936f = false;
            this.f2828u.t0(this.f2798b, xVar5);
            this.f2825s0.f2936f = z10;
            for (int i13 = 0; i13 < this.f2804e.e(); i13++) {
                a0 L4 = L(this.f2804e.d(i13));
                if (!L4.x()) {
                    a0.a orDefault = this.f2806f.f3006a.getOrDefault(L4, null);
                    if (!((orDefault == null || (orDefault.f3009a & 4) == 0) ? false : true)) {
                        j.b(L4);
                        boolean j11 = L4.j(8192);
                        j jVar2 = this.f2797a0;
                        L4.i();
                        j.c i14 = jVar2.i(L4);
                        if (j11) {
                            Z(L4, i14);
                        } else {
                            a0 a0Var3 = this.f2806f;
                            a0.a orDefault2 = a0Var3.f3006a.getOrDefault(L4, null);
                            if (orDefault2 == null) {
                                orDefault2 = a0.a.a();
                                a0Var3.f3006a.put(L4, orDefault2);
                            }
                            orDefault2.f3009a |= 2;
                            orDefault2.f3010b = i14;
                        }
                    }
                }
            }
            l();
        } else {
            l();
        }
        U(true);
        n0(false);
        this.f2825s0.f2934d = 2;
    }

    public void removeDetachedView(View view, boolean z10) {
        a0 L2 = L(view);
        if (L2 != null) {
            if (L2.q()) {
                L2.f2851j &= -257;
            } else if (!L2.x()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(L2);
                throw new IllegalArgumentException(b.a(this, sb2));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z10);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2828u.w0(this, view, view2) && view2 != null) {
            c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2828u.G0(this, view, rect, z10);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f2836y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2836y.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void requestLayout() {
        if (this.D != 0 || this.F) {
            this.E = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        l0();
        T();
        this.f2825s0.a(6);
        this.f2802d.c();
        this.f2825s0.f2935e = this.f2826t.b();
        this.f2825s0.f2933c = 0;
        if (this.f2800c != null) {
            e eVar = this.f2826t;
            int f10 = t.g.f(eVar.f2865c);
            if (f10 == 1 ? eVar.b() > 0 : f10 != 2) {
                Parcelable parcelable = this.f2800c.f2915c;
                if (parcelable != null) {
                    this.f2828u.x0(parcelable);
                }
                this.f2800c = null;
            }
        }
        x xVar = this.f2825s0;
        xVar.f2937g = false;
        this.f2828u.t0(this.f2798b, xVar);
        x xVar2 = this.f2825s0;
        xVar2.f2936f = false;
        xVar2.f2940j = xVar2.f2940j && this.f2797a0 != null;
        xVar2.f2934d = 4;
        U(true);
        n0(false);
    }

    public void scrollBy(int i10, int i11) {
        m mVar = this.f2828u;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.F) {
            boolean g10 = mVar.g();
            boolean h10 = this.f2828u.h();
            if (g10 || h10) {
                if (!g10) {
                    i10 = 0;
                }
                if (!h10) {
                    i11 = 0;
                }
                e0(i10, i11, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (P()) {
            int a10 = (accessibilityEvent == null || Build.VERSION.SDK_INT < 19) ? 0 : p0.b.a(accessibilityEvent);
            if (a10 != 0) {
                i10 = a10;
            }
            this.H |= i10;
            i10 = 1;
        }
        if (i10 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(v vVar) {
        this.f2839z0 = vVar;
        c0.C(this, vVar);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.f2826t;
        if (eVar2 != null) {
            eVar2.f2863a.unregisterObserver(this.f2796a);
            this.f2826t.getClass();
        }
        a0();
        a aVar = this.f2802d;
        aVar.l(aVar.f2997b);
        aVar.l(aVar.f2998c);
        aVar.f3001f = 0;
        e eVar3 = this.f2826t;
        this.f2826t = eVar;
        if (eVar != null) {
            eVar.f2863a.registerObserver(this.f2796a);
        }
        m mVar = this.f2828u;
        if (mVar != null) {
            mVar.e0(eVar3, this.f2826t);
        }
        s sVar = this.f2798b;
        e eVar4 = this.f2826t;
        sVar.b();
        r d10 = sVar.d();
        d10.getClass();
        if (eVar3 != null) {
            d10.f2901b--;
        }
        if (d10.f2901b == 0) {
            for (int i10 = 0; i10 < d10.f2900a.size(); i10++) {
                d10.f2900a.valueAt(i10).f2902a.clear();
            }
        }
        if (eVar4 != null) {
            d10.f2901b++;
        }
        this.f2825s0.f2936f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar != this.A0) {
            this.A0 = hVar;
            setChildrenDrawingOrderEnabled(hVar != null);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2808g) {
            O();
        }
        this.f2808g = z10;
        super.setClipToPadding(z10);
        if (this.C) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.O = iVar;
        O();
    }

    public void setHasFixedSize(boolean z10) {
        this.B = z10;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.f2797a0;
        if (jVar2 != null) {
            jVar2.g();
            this.f2797a0.f2866a = null;
        }
        this.f2797a0 = jVar;
        if (jVar != null) {
            jVar.f2866a = this.f2835x0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        s sVar = this.f2798b;
        sVar.f2910e = i10;
        sVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(m mVar) {
        if (mVar != this.f2828u) {
            p0();
            if (this.f2828u != null) {
                j jVar = this.f2797a0;
                if (jVar != null) {
                    jVar.g();
                }
                this.f2828u.B0(this.f2798b);
                this.f2828u.C0(this.f2798b);
                this.f2798b.b();
                if (this.A) {
                    m mVar2 = this.f2828u;
                    s sVar = this.f2798b;
                    mVar2.f2881g = false;
                    mVar2.g0(this, sVar);
                }
                this.f2828u.R0((RecyclerView) null);
                this.f2828u = null;
            } else {
                this.f2798b.b();
            }
            c cVar = this.f2804e;
            c.a aVar = cVar.f3013b;
            aVar.f3015a = 0;
            c.a aVar2 = aVar.f3016b;
            if (aVar2 != null) {
                aVar2.g();
            }
            int size = cVar.f3014c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                t tVar = (t) cVar.f3012a;
                tVar.getClass();
                a0 L2 = L(cVar.f3014c.get(size));
                if (L2 != null) {
                    tVar.f3138a.h0(L2, L2.f2857p);
                    L2.f2857p = 0;
                }
                cVar.f3014c.remove(size);
            }
            t tVar2 = (t) cVar.f3012a;
            int b10 = tVar2.b();
            for (int i10 = 0; i10 < b10; i10++) {
                View a10 = tVar2.a(i10);
                tVar2.f3138a.p(a10);
                a10.clearAnimation();
            }
            tVar2.f3138a.removeAllViews();
            this.f2828u = mVar;
            if (mVar != null) {
                if (mVar.f2876b == null) {
                    mVar.R0(this);
                    if (this.A) {
                        this.f2828u.f2881g = true;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("LayoutManager ");
                    sb2.append(mVar);
                    sb2.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(b.a(mVar.f2876b, sb2));
                }
            }
            this.f2798b.n();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().i(z10);
    }

    public void setOnFlingListener(o oVar) {
        this.f2814j0 = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.f2827t0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2819o0 = z10;
    }

    public void setRecycledViewPool(r rVar) {
        s sVar = this.f2798b;
        r rVar2 = sVar.f2912g;
        if (rVar2 != null) {
            rVar2.f2901b--;
        }
        sVar.f2912g = rVar;
        if (rVar != null && RecyclerView.this.getAdapter() != null) {
            sVar.f2912g.f2901b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(t tVar) {
        this.f2830v = tVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        w wVar;
        if (i10 != this.f2799b0) {
            this.f2799b0 = i10;
            if (i10 != 2) {
                this.f2820p0.c();
                m mVar = this.f2828u;
                if (!(mVar == null || (wVar = mVar.f2879e) == null)) {
                    wVar.f();
                }
            }
            m mVar2 = this.f2828u;
            if (mVar2 != null) {
                mVar2.z0(i10);
            }
            q qVar = this.f2827t0;
            if (qVar != null) {
                qVar.a(this, i10);
            }
            List<q> list = this.f2829u0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.f2829u0.get(size).a(this, i10);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f2813i0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2813i0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(y yVar) {
        this.f2798b.getClass();
    }

    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().j(i10, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().k(0);
    }

    public final void suppressLayout(boolean z10) {
        if (z10 != this.F) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.F = false;
                if (!(!this.E || this.f2828u == null || this.f2826t == null)) {
                    requestLayout();
                }
                this.E = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.F = true;
            this.G = true;
            p0();
        }
    }

    public boolean t(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    public final void u(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().f(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void v(int i10, int i11) {
        this.N++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        q qVar = this.f2827t0;
        if (qVar != null) {
            qVar.b(this, i10, i11);
        }
        List<q> list = this.f2829u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2829u0.get(size).b(this, i10, i11);
            }
        }
        this.N--;
    }

    public void w() {
        if (this.S == null) {
            EdgeEffect a10 = this.O.a(this);
            this.S = a10;
            if (this.f2808g) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void x() {
        if (this.P == null) {
            EdgeEffect a10 = this.O.a(this);
            this.P = a10;
            if (this.f2808g) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void y() {
        if (this.R == null) {
            EdgeEffect a10 = this.O.a(this);
            this.R = a10;
            if (this.f2808g) {
                a10.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a10.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void z() {
        if (this.Q == null) {
            EdgeEffect a10 = this.O.a(this);
            this.Q = a10;
            if (this.f2808g) {
                a10.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a10.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float f10;
        float f11;
        char c10;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        this.f2796a = new u();
        this.f2798b = new s();
        this.f2806f = new a0();
        this.f2810h = new a();
        this.f2812i = new Rect();
        this.f2822r = new Rect();
        this.f2824s = new RectF();
        this.f2832w = new ArrayList();
        this.f2834x = new ArrayList<>();
        this.f2836y = new ArrayList<>();
        this.D = 0;
        this.K = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = new i();
        this.f2797a0 = new d();
        this.f2799b0 = 0;
        this.f2801c0 = -1;
        this.f2817m0 = Float.MIN_VALUE;
        this.f2818n0 = Float.MIN_VALUE;
        boolean z10 = true;
        this.f2819o0 = true;
        this.f2820p0 = new z();
        this.f2823r0 = Q0 ? new k.b() : null;
        this.f2825s0 = new x();
        this.f2831v0 = false;
        this.f2833w0 = false;
        this.f2835x0 = new k();
        this.f2837y0 = false;
        this.B0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new ArrayList();
        this.H0 = new b();
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2813i0 = viewConfiguration.getScaledTouchSlop();
        Method method = e0.f22576a;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            f10 = e0.a.a(viewConfiguration);
        } else {
            f10 = e0.a(viewConfiguration, context2);
        }
        this.f2817m0 = f10;
        if (i12 >= 26) {
            f11 = e0.a.b(viewConfiguration);
        } else {
            f11 = e0.a(viewConfiguration, context2);
        }
        this.f2818n0 = f11;
        this.f2815k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2816l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2797a0.f2866a = this.f2835x0;
        this.f2802d = new a(new u(this));
        this.f2804e = new c(new t(this));
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if ((i12 >= 26 ? c0.l.b(this) : 0) == 0 && i12 >= 26) {
            c0.l.l(this, 8);
        }
        if (c0.d.c(this) == 0) {
            c0.I(this, 1);
        }
        this.J = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new v(this));
        int[] iArr = s1.a.f24901a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        c0.B(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2808g = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(b.a(this, android.support.v4.media.a.a("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c10 = 2;
            new j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        } else {
            c10 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(m.class);
                    try {
                        constructor = asSubclass.getConstructor(R0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c10] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        noSuchMethodException = e10;
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e16);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = M0;
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i11, 0);
            c0.B(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
            z10 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z10);
    }

    public static class v extends u0.a {
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f2915c;

        public class a implements Parcelable.ClassLoaderCreator<v> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new v[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new v(parcel, (ClassLoader) null);
            }
        }

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2915c = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeParcelable(this.f2915c, 0);
        }

        public v(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public a0 f2896a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2897b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f2898c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2899d = false;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Deprecated
        public int a() {
            return this.f2896a.g();
        }

        public int b() {
            return this.f2896a.h();
        }

        public boolean c() {
            return this.f2896a.r();
        }

        public boolean d() {
            return this.f2896a.o();
        }

        public n(int i10, int i11) {
            super(i10, i11);
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public n(n nVar) {
            super(nVar);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f2828u;
        if (mVar != null) {
            return mVar.y(layoutParams);
        }
        throw new IllegalStateException(b.a(this, android.support.v4.media.a.a("RecyclerView has no LayoutManager")));
    }
}
