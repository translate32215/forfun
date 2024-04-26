package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.j0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import c1.d;
import com.startapp.startappsdk.R;
import d0.a;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import o0.g;
import ud.k;

/* compiled from: Fragment */
public class p implements ComponentCallbacks, View.OnCreateContextMenuListener, t, v0, n, w1.c {

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f1783m0 = new Object();
    public int A;
    public a0 B;
    public v<?> C;
    public a0 D;
    public p E;
    public int F;
    public int G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public ViewGroup P;
    public View Q;
    public boolean R;
    public boolean S;
    public d Z;

    /* renamed from: a  reason: collision with root package name */
    public int f1784a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1785a0;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f1786b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1787b0;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<Parcelable> f1788c;

    /* renamed from: c0  reason: collision with root package name */
    public String f1789c0;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f1790d;

    /* renamed from: d0  reason: collision with root package name */
    public o.c f1791d0;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f1792e;

    /* renamed from: e0  reason: collision with root package name */
    public u f1793e0;

    /* renamed from: f  reason: collision with root package name */
    public String f1794f;

    /* renamed from: f0  reason: collision with root package name */
    public n0 f1795f0;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f1796g;

    /* renamed from: g0  reason: collision with root package name */
    public b0<t> f1797g0;

    /* renamed from: h  reason: collision with root package name */
    public p f1798h;

    /* renamed from: h0  reason: collision with root package name */
    public s0.b f1799h0;

    /* renamed from: i  reason: collision with root package name */
    public String f1800i;

    /* renamed from: i0  reason: collision with root package name */
    public w1.b f1801i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1802j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList<f> f1803k0;

    /* renamed from: l0  reason: collision with root package name */
    public final f f1804l0;

    /* renamed from: r  reason: collision with root package name */
    public int f1805r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f1806s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1807t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1808u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1809v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1810w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1811x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1812y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1813z;

    /* compiled from: Fragment */
    public class a implements Runnable {
    }

    /* compiled from: Fragment */
    public class b extends f {
        public b() {
            super((a) null);
        }

        public void a() {
            p.this.f1801i0.b();
            j0.b(p.this);
        }
    }

    /* compiled from: Fragment */
    public class c extends s {
        public c() {
        }

        public View b(int i10) {
            View view = p.this.Q;
            if (view != null) {
                return view.findViewById(i10);
            }
            StringBuilder a10 = android.support.v4.media.a.a("Fragment ");
            a10.append(p.this);
            a10.append(" does not have a view");
            throw new IllegalStateException(a10.toString());
        }

        public boolean i() {
            return p.this.Q != null;
        }
    }

    /* compiled from: Fragment */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1816a;

        /* renamed from: b  reason: collision with root package name */
        public int f1817b;

        /* renamed from: c  reason: collision with root package name */
        public int f1818c;

        /* renamed from: d  reason: collision with root package name */
        public int f1819d;

        /* renamed from: e  reason: collision with root package name */
        public int f1820e;

        /* renamed from: f  reason: collision with root package name */
        public int f1821f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f1822g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f1823h;

        /* renamed from: i  reason: collision with root package name */
        public Object f1824i;

        /* renamed from: j  reason: collision with root package name */
        public Object f1825j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1826k;

        /* renamed from: l  reason: collision with root package name */
        public float f1827l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public View f1828m = null;

        public d() {
            Object obj = p.f1783m0;
            this.f1824i = obj;
            this.f1825j = obj;
            this.f1826k = obj;
        }
    }

    /* compiled from: Fragment */
    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* compiled from: Fragment */
    public static abstract class f {
        public f() {
        }

        public abstract void a();

        public f(a aVar) {
        }
    }

    public p() {
        this.f1784a = -1;
        this.f1794f = UUID.randomUUID().toString();
        this.f1800i = null;
        this.f1806s = null;
        this.D = new b0();
        this.N = true;
        this.S = true;
        this.f1791d0 = o.c.RESUMED;
        this.f1797g0 = new b0<>();
        new AtomicInteger();
        this.f1803k0 = new ArrayList<>();
        this.f1804l0 = new b();
        G();
    }

    public int A() {
        d dVar = this.Z;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1819d;
    }

    public int B() {
        d dVar = this.Z;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1820e;
    }

    public final Resources C() {
        return h0().getResources();
    }

    public final String D(int i10) {
        return C().getString(i10);
    }

    public final String E(int i10, Object... objArr) {
        return C().getString(i10, objArr);
    }

    public t F() {
        n0 n0Var = this.f1795f0;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final void G() {
        this.f1793e0 = new u(this);
        this.f1801i0 = w1.b.a(this);
        this.f1799h0 = null;
        if (!this.f1803k0.contains(this.f1804l0)) {
            f fVar = this.f1804l0;
            if (this.f1784a >= 0) {
                fVar.a();
            } else {
                this.f1803k0.add(fVar);
            }
        }
    }

    public void H() {
        G();
        this.f1789c0 = this.f1794f;
        this.f1794f = UUID.randomUUID().toString();
        this.f1807t = false;
        this.f1808u = false;
        this.f1810w = false;
        this.f1811x = false;
        this.f1812y = false;
        this.A = 0;
        this.B = null;
        this.D = new b0();
        this.C = null;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = false;
    }

    public final boolean I() {
        return this.C != null && this.f1807t;
    }

    public final boolean J() {
        boolean z10;
        if (!this.I) {
            a0 a0Var = this.B;
            if (a0Var == null) {
                return false;
            }
            p pVar = this.E;
            a0Var.getClass();
            if (pVar == null) {
                z10 = false;
            } else {
                z10 = pVar.J();
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean K() {
        return this.A > 0;
    }

    @Deprecated
    public void L(Bundle bundle) {
        this.O = true;
    }

    @Deprecated
    public void M(int i10, int i11, Intent intent) {
        if (a0.N(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void N(Context context) {
        Activity activity;
        this.O = true;
        v<?> vVar = this.C;
        if (vVar == null) {
            activity = null;
        } else {
            activity = vVar.f1873a;
        }
        if (activity != null) {
            this.O = false;
            this.O = true;
        }
    }

    public void O(Bundle bundle) {
        Parcelable parcelable;
        boolean z10 = true;
        this.O = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.D.c0(parcelable);
            this.D.j();
        }
        a0 a0Var = this.D;
        if (a0Var.f1597u < 1) {
            z10 = false;
        }
        if (!z10) {
            a0Var.j();
        }
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f1802j0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void Q() {
        this.O = true;
    }

    public void R() {
        this.O = true;
    }

    public void S() {
        this.O = true;
    }

    public LayoutInflater T(Bundle bundle) {
        v<?> vVar = this.C;
        if (vVar != null) {
            LayoutInflater o10 = vVar.o();
            g.b(o10, this.D.f1582f);
            return o10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void U(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.O = true;
        v<?> vVar = this.C;
        if (vVar == null) {
            activity = null;
        } else {
            activity = vVar.f1873a;
        }
        if (activity != null) {
            this.O = false;
            this.O = true;
        }
    }

    public void V() {
        this.O = true;
    }

    @Deprecated
    public void W(Menu menu) {
    }

    public void X(boolean z10) {
    }

    @Deprecated
    public void Y(int i10, String[] strArr, int[] iArr) {
    }

    public void Z() {
        this.O = true;
    }

    public void a0(Bundle bundle) {
    }

    public void b0() {
        this.O = true;
    }

    public o c() {
        return this.f1793e0;
    }

    public void c0() {
        this.O = true;
    }

    public void d0(View view, Bundle bundle) {
    }

    public final w1.a e() {
        return this.f1801i0.f26867b;
    }

    public void e0(Bundle bundle) {
        this.O = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D.U();
        boolean z10 = true;
        this.f1813z = true;
        this.f1795f0 = new n0(this, v());
        View P2 = P(layoutInflater, viewGroup, bundle);
        this.Q = P2;
        if (P2 != null) {
            this.f1795f0.b();
            this.Q.setTag(R.id.view_tree_lifecycle_owner, this.f1795f0);
            this.Q.setTag(R.id.view_tree_view_model_store_owner, this.f1795f0);
            u.b.e(this.Q, this.f1795f0);
            this.f1797g0.l(this.f1795f0);
            return;
        }
        if (this.f1795f0.f1762c == null) {
            z10 = false;
        }
        if (!z10) {
            this.f1795f0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final q g0() {
        q o10 = o();
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException(e.c.a("Fragment ", this, " not attached to an activity."));
    }

    public final Context h0() {
        Context q10 = q();
        if (q10 != null) {
            return q10;
        }
        throw new IllegalStateException(e.c.a("Fragment ", this, " not attached to a context."));
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final View i0() {
        View view = this.Q;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(e.c.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void j0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.D.c0(parcelable);
            this.D.j();
        }
    }

    public s k() {
        return new c();
    }

    public void k0(int i10, int i11, int i12, int i13) {
        if (this.Z != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            n().f1817b = i10;
            n().f1818c = i11;
            n().f1819d = i12;
            n().f1820e = i13;
        }
    }

    public k1.a l() {
        Application application;
        Context applicationContext = h0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("Could not find Application instance from Context ");
            a10.append(h0().getApplicationContext());
            a10.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            Log.d("FragmentManager", a10.toString());
        }
        k1.d dVar = new k1.d();
        if (application != null) {
            dVar.b(s0.a.C0032a.C0033a.f2721a, application);
        }
        dVar.b(j0.f2671a, this);
        dVar.b(j0.f2672b, this);
        Bundle bundle = this.f1796g;
        if (bundle != null) {
            dVar.b(j0.f2673c, bundle);
        }
        return dVar;
    }

    public void l0(Bundle bundle) {
        boolean z10;
        a0 a0Var = this.B;
        if (a0Var != null) {
            if (a0Var == null) {
                z10 = false;
            } else {
                z10 = a0Var.S();
            }
            if (z10) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1796g = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0137, code lost:
        r1 = r2.f1800i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.F
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.G
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.H
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.f1784a
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.f1794f
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.A
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.f1807t
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.f1808u
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.f1810w
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.f1811x
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.I
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.J
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.N
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            boolean r0 = r2.M
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.K
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.S
            r5.println(r0)
            androidx.fragment.app.a0 r0 = r2.B
            if (r0 == 0) goto L_0x00c8
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            androidx.fragment.app.a0 r0 = r2.B
            r5.println(r0)
        L_0x00c8:
            androidx.fragment.app.v<?> r0 = r2.C
            if (r0 == 0) goto L_0x00d9
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            androidx.fragment.app.v<?> r0 = r2.C
            r5.println(r0)
        L_0x00d9:
            androidx.fragment.app.p r0 = r2.E
            if (r0 == 0) goto L_0x00ea
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            androidx.fragment.app.p r0 = r2.E
            r5.println(r0)
        L_0x00ea:
            android.os.Bundle r0 = r2.f1796g
            if (r0 == 0) goto L_0x00fb
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1796g
            r5.println(r0)
        L_0x00fb:
            android.os.Bundle r0 = r2.f1786b
            if (r0 == 0) goto L_0x010c
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1786b
            r5.println(r0)
        L_0x010c:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f1788c
            if (r0 == 0) goto L_0x011d
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f1788c
            r5.println(r0)
        L_0x011d:
            android.os.Bundle r0 = r2.f1790d
            if (r0 == 0) goto L_0x012e
            r5.print(r3)
            java.lang.String r0 = "mSavedViewRegistryState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1790d
            r5.println(r0)
        L_0x012e:
            androidx.fragment.app.p r0 = r2.f1798h
            if (r0 == 0) goto L_0x0133
            goto L_0x0143
        L_0x0133:
            androidx.fragment.app.a0 r0 = r2.B
            if (r0 == 0) goto L_0x0142
            java.lang.String r1 = r2.f1800i
            if (r1 == 0) goto L_0x0142
            n2.g r0 = r0.f1579c
            androidx.fragment.app.p r0 = r0.e(r1)
            goto L_0x0143
        L_0x0142:
            r0 = 0
        L_0x0143:
            if (r0 == 0) goto L_0x015a
            r5.print(r3)
            java.lang.String r1 = "mTarget="
            r5.print(r1)
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.f1805r
            r5.println(r0)
        L_0x015a:
            r5.print(r3)
            java.lang.String r0 = "mPopDirection="
            r5.print(r0)
            androidx.fragment.app.p$d r0 = r2.Z
            if (r0 != 0) goto L_0x0168
            r0 = 0
            goto L_0x016a
        L_0x0168:
            boolean r0 = r0.f1816a
        L_0x016a:
            r5.println(r0)
            int r0 = r2.r()
            if (r0 == 0) goto L_0x0182
            r5.print(r3)
            java.lang.String r0 = "getEnterAnim="
            r5.print(r0)
            int r0 = r2.r()
            r5.println(r0)
        L_0x0182:
            int r0 = r2.u()
            if (r0 == 0) goto L_0x0197
            r5.print(r3)
            java.lang.String r0 = "getExitAnim="
            r5.print(r0)
            int r0 = r2.u()
            r5.println(r0)
        L_0x0197:
            int r0 = r2.A()
            if (r0 == 0) goto L_0x01ac
            r5.print(r3)
            java.lang.String r0 = "getPopEnterAnim="
            r5.print(r0)
            int r0 = r2.A()
            r5.println(r0)
        L_0x01ac:
            int r0 = r2.B()
            if (r0 == 0) goto L_0x01c1
            r5.print(r3)
            java.lang.String r0 = "getPopExitAnim="
            r5.print(r0)
            int r0 = r2.B()
            r5.println(r0)
        L_0x01c1:
            android.view.ViewGroup r0 = r2.P
            if (r0 == 0) goto L_0x01d2
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.P
            r5.println(r0)
        L_0x01d2:
            android.view.View r0 = r2.Q
            if (r0 == 0) goto L_0x01e3
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.Q
            r5.println(r0)
        L_0x01e3:
            android.content.Context r0 = r2.q()
            if (r0 == 0) goto L_0x01f0
            l1.a r0 = l1.a.b(r2)
            r0.a(r3, r4, r5, r6)
        L_0x01f0:
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            androidx.fragment.app.a0 r1 = r2.D
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            androidx.fragment.app.a0 r0 = r2.D
            java.lang.String r1 = "  "
            java.lang.String r3 = j.f.a(r3, r1)
            r0.w(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p.m(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public void m0(View view) {
        n().f1828m = null;
    }

    public final d n() {
        if (this.Z == null) {
            this.Z = new d();
        }
        return this.Z;
    }

    public void n0(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            if (this.M && I() && !J()) {
                this.C.p();
            }
        }
    }

    public final q o() {
        v<?> vVar = this.C;
        if (vVar == null) {
            return null;
        }
        return (q) vVar.f1873a;
    }

    public void o0(boolean z10) {
        if (this.Z != null) {
            n().f1816a = z10;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.O = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        g0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.O = true;
    }

    public final a0 p() {
        if (this.C != null) {
            return this.D;
        }
        throw new IllegalStateException(e.c.a("Fragment ", this, " has not been attached yet."));
    }

    @Deprecated
    public void p0(boolean z10) {
        c1.d dVar = c1.d.f4021a;
        k.f(this, "fragment");
        c1.f fVar = new c1.f(this);
        c1.d dVar2 = c1.d.f4021a;
        c1.d.c(fVar);
        d.c a10 = c1.d.a(this);
        if (a10.f4033a.contains(d.a.DETECT_RETAIN_INSTANCE_USAGE) && c1.d.f(a10, getClass(), c1.f.class)) {
            c1.d.b(a10, fVar);
        }
        this.K = z10;
        a0 a0Var = this.B;
        if (a0Var == null) {
            this.L = true;
        } else if (z10) {
            a0Var.N.f(this);
        } else {
            a0Var.N.i(this);
        }
    }

    public Context q() {
        v<?> vVar = this.C;
        if (vVar == null) {
            return null;
        }
        return vVar.f1874b;
    }

    @Deprecated
    public void q0(boolean z10) {
        c1.d dVar = c1.d.f4021a;
        k.f(this, "fragment");
        c1.g gVar = new c1.g(this, z10);
        c1.d dVar2 = c1.d.f4021a;
        c1.d.c(gVar);
        d.c a10 = c1.d.a(this);
        if (a10.f4033a.contains(d.a.DETECT_SET_USER_VISIBLE_HINT) && c1.d.f(a10, getClass(), c1.g.class)) {
            c1.d.b(a10, gVar);
        }
        if (!this.S && z10 && this.f1784a < 5 && this.B != null && I() && this.f1787b0) {
            a0 a0Var = this.B;
            a0Var.V(a0Var.f(this));
        }
        this.S = z10;
        this.R = this.f1784a < 5 && !z10;
        if (this.f1786b != null) {
            this.f1792e = Boolean.valueOf(z10);
        }
    }

    public int r() {
        d dVar = this.Z;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1817b;
    }

    public void s() {
        d dVar = this.Z;
        if (dVar != null) {
            dVar.getClass();
        }
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        if (this.C != null) {
            a0 y10 = y();
            if (y10.B != null) {
                y10.E.addLast(new a0.l(this.f1794f, i10));
                y10.B.a(intent);
                return;
            }
            v<?> vVar = y10.f1598v;
            vVar.getClass();
            if (i10 == -1) {
                Context context = vVar.f1874b;
                Object obj = d0.a.f12940a;
                a.C0126a.b(context, intent, (Bundle) null);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(e.c.a("Fragment ", this, " not attached to Activity"));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f1794f);
        if (this.F != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb2.append(" tag=");
            sb2.append(this.H);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        d dVar = this.Z;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1818c;
    }

    public u0 v() {
        if (this.B == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (x() != 1) {
            d0 d0Var = this.B.N;
            u0 u0Var = d0Var.f1650f.get(this.f1794f);
            if (u0Var != null) {
                return u0Var;
            }
            u0 u0Var2 = new u0();
            d0Var.f1650f.put(this.f1794f, u0Var2);
            return u0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final int x() {
        o.c cVar = this.f1791d0;
        if (cVar == o.c.INITIALIZED || this.E == null) {
            return cVar.ordinal();
        }
        return Math.min(cVar.ordinal(), this.E.x());
    }

    public final a0 y() {
        a0 a0Var = this.B;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException(e.c.a("Fragment ", this, " not associated with a fragment manager."));
    }

    public p(int i10) {
        this();
        this.f1802j0 = i10;
    }
}
