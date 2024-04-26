package androidx.leanback.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.a0;
import androidx.leanback.app.l;
import androidx.leanback.app.o;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.ScaleFrameLayout;
import androidx.leanback.widget.TitleView;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.d0;
import androidx.leanback.widget.h0;
import androidx.leanback.widget.m0;
import androidx.leanback.widget.n0;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.s0;
import androidx.leanback.widget.v0;
import androidx.leanback.widget.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;
import h1.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BrowseSupportFragment */
public class h extends d {

    /* renamed from: y1  reason: collision with root package name */
    public static final String f1954y1 = (h.class.getCanonicalName() + ".title");

    /* renamed from: z1  reason: collision with root package name */
    public static final String f1955z1 = (h.class.getCanonicalName() + ".headersState");
    public final a.c K0 = new d("SET_ENTRANCE_START_STATE");
    public final a.b L0 = new a.b("headerFragmentViewCreated");
    public final a.b M0 = new a.b("mainFragmentViewCreated");
    public final a.b N0 = new a.b("screenDataReady");
    public r O0 = new r();
    public p P0;
    public androidx.fragment.app.p Q0;
    public l R0;
    public t S0;
    public m T0;
    public h0 U0;
    public s0 V0;
    public int W0 = 1;
    public int X0 = 0;
    public boolean Y0;
    public BrowseFrameLayout Z0;

    /* renamed from: a1  reason: collision with root package name */
    public ScaleFrameLayout f1956a1;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f1957b1 = true;

    /* renamed from: c1  reason: collision with root package name */
    public String f1958c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f1959d1 = true;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f1960e1 = true;

    /* renamed from: f1  reason: collision with root package name */
    public int f1961f1;

    /* renamed from: g1  reason: collision with root package name */
    public int f1962g1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f1963h1 = true;

    /* renamed from: i1  reason: collision with root package name */
    public int f1964i1 = -1;

    /* renamed from: j1  reason: collision with root package name */
    public float f1965j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f1966k1;

    /* renamed from: l1  reason: collision with root package name */
    public Object f1967l1;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f1968m1 = true;

    /* renamed from: n1  reason: collision with root package name */
    public final v f1969n1 = new v();

    /* renamed from: o1  reason: collision with root package name */
    public Object f1970o1;

    /* renamed from: p1  reason: collision with root package name */
    public Object f1971p1;

    /* renamed from: q1  reason: collision with root package name */
    public Object f1972q1;

    /* renamed from: r1  reason: collision with root package name */
    public Object f1973r1;

    /* renamed from: s1  reason: collision with root package name */
    public k f1974s1;

    /* renamed from: t1  reason: collision with root package name */
    public final BrowseFrameLayout.b f1975t1 = new f();

    /* renamed from: u1  reason: collision with root package name */
    public final BrowseFrameLayout.a f1976u1 = new g();

    /* renamed from: v1  reason: collision with root package name */
    public l.e f1977v1 = new a();

    /* renamed from: w1  reason: collision with root package name */
    public l.f f1978w1 = new b();

    /* renamed from: x1  reason: collision with root package name */
    public final RecyclerView.q f1979x1 = new c();

    /* compiled from: BrowseSupportFragment */
    public class a implements l.e {
        public a() {
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class b implements l.f {
        public b() {
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class c extends RecyclerView.q {
        public c() {
        }

        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                List<RecyclerView.q> list = recyclerView.f2829u0;
                if (list != null) {
                    list.remove(this);
                }
                h hVar = h.this;
                if (!hVar.f1968m1) {
                    hVar.w0();
                }
            }
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class d extends a.c {
        public d(String str) {
            super(str, false, true);
        }

        public void c() {
            h hVar = h.this;
            hVar.E0(false);
            hVar.J0(false);
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f1984a;

        public e(boolean z10) {
            this.f1984a = z10;
        }

        public void run() {
            h.this.R0.v0();
            h.this.R0.A0();
            h hVar = h.this;
            Object c10 = androidx.leanback.transition.b.c(hVar.q(), hVar.f1959d1 ? R.transition.lb_browse_headers_in : R.transition.lb_browse_headers_out);
            hVar.f1973r1 = c10;
            androidx.leanback.transition.b.a(c10, new j(hVar));
            h.this.getClass();
            androidx.leanback.transition.b.d(this.f1984a ? h.this.f1970o1 : h.this.f1971p1, h.this.f1973r1);
            h hVar2 = h.this;
            if (!hVar2.f1957b1) {
                return;
            }
            if (!this.f1984a) {
                androidx.fragment.app.b bVar = new androidx.fragment.app.b(hVar2.B);
                bVar.d(h.this.f1958c1);
                bVar.e();
                return;
            }
            int i10 = hVar2.f1974s1.f1992b;
            if (i10 >= 0) {
                h.this.B.X(hVar2.B.f1580d.get(i10).getId(), 1);
            }
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class f implements BrowseFrameLayout.b {
        public f() {
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class g implements BrowseFrameLayout.a {
        public g() {
        }
    }

    /* renamed from: androidx.leanback.app.h$h  reason: collision with other inner class name */
    /* compiled from: BrowseSupportFragment */
    public class C0025h implements Runnable {
        public C0025h() {
        }

        public void run() {
            h.this.K0(true);
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class i implements Runnable {
        public i() {
        }

        public void run() {
            h.this.K0(false);
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class j implements Runnable {
        public j() {
        }

        public void run() {
            h hVar = h.this;
            hVar.E0(hVar.f1959d1);
            hVar.J0(true);
            hVar.P0.f(true);
        }
    }

    /* compiled from: BrowseSupportFragment */
    public final class k implements a0.m {

        /* renamed from: a  reason: collision with root package name */
        public int f1991a;

        /* renamed from: b  reason: collision with root package name */
        public int f1992b = -1;

        public k() {
            this.f1991a = h.this.B.H();
        }

        public void a() {
            a0 a0Var = h.this.B;
            if (a0Var == null) {
                Log.w("BrowseSupportFragment", "getFragmentManager() is null, stack:", new Exception());
                return;
            }
            int H = a0Var.H();
            int i10 = this.f1991a;
            if (H > i10) {
                int i11 = H - 1;
                if (h.this.f1958c1.equals(h.this.B.f1580d.get(i11).a())) {
                    this.f1992b = i11;
                }
            } else if (H < i10 && this.f1992b >= H) {
                if (!h.this.A0()) {
                    androidx.fragment.app.b bVar = new androidx.fragment.app.b(h.this.B);
                    bVar.d(h.this.f1958c1);
                    bVar.e();
                    return;
                }
                this.f1992b = -1;
                h hVar = h.this;
                if (!hVar.f1959d1) {
                    hVar.L0(true);
                }
            }
            this.f1991a = H;
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class l implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f1994a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f1995b;

        /* renamed from: c  reason: collision with root package name */
        public int f1996c;

        /* renamed from: d  reason: collision with root package name */
        public p f1997d;

        public l(Runnable runnable, p pVar, View view) {
            this.f1994a = view;
            this.f1995b = runnable;
            this.f1997d = pVar;
        }

        public boolean onPreDraw() {
            h hVar = h.this;
            if (hVar.Q == null || hVar.q() == null) {
                this.f1994a.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            int i10 = this.f1996c;
            if (i10 == 0) {
                this.f1997d.g(true);
                this.f1994a.invalidate();
                this.f1996c = 1;
                return false;
            } else if (i10 != 1) {
                return false;
            } else {
                this.f1995b.run();
                this.f1994a.getViewTreeObserver().removeOnPreDrawListener(this);
                this.f1996c = 2;
                return false;
            }
        }
    }

    /* compiled from: BrowseSupportFragment */
    public static abstract class m<T extends androidx.fragment.app.p> {
        public abstract T a(Object obj);
    }

    /* compiled from: BrowseSupportFragment */
    public final class n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1999a = true;

        public n() {
        }

        public void a(p pVar) {
            h hVar = h.this;
            p pVar2 = hVar.P0;
            if (pVar2 != null && pVar2.f2003c == this && hVar.f1966k1) {
                hVar.H0.c(hVar.N0);
            }
        }

        public void b(p pVar) {
            h hVar = h.this;
            hVar.H0.c(hVar.M0);
            h hVar2 = h.this;
            if (!hVar2.f1966k1) {
                hVar2.H0.c(hVar2.N0);
            }
        }

        public void c(boolean z10) {
            this.f1999a = z10;
            h hVar = h.this;
            p pVar = hVar.P0;
            if (pVar != null && pVar.f2003c == this && hVar.f1966k1) {
                hVar.N0();
            }
        }
    }

    /* compiled from: BrowseSupportFragment */
    public static class o extends m<o> {
        public androidx.fragment.app.p a(Object obj) {
            return new o();
        }
    }

    /* compiled from: BrowseSupportFragment */
    public static class p<T extends androidx.fragment.app.p> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2001a;

        /* renamed from: b  reason: collision with root package name */
        public final T f2002b;

        /* renamed from: c  reason: collision with root package name */
        public n f2003c;

        public p(T t10) {
            this.f2002b = t10;
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public boolean c() {
            return false;
        }

        public void d() {
        }

        public void e(int i10) {
        }

        public void f(boolean z10) {
        }

        public void g(boolean z10) {
        }
    }

    /* compiled from: BrowseSupportFragment */
    public interface q {
        p g();
    }

    /* compiled from: BrowseSupportFragment */
    public static final class r {

        /* renamed from: b  reason: collision with root package name */
        public static final m f2004b = new o();

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class, m> f2005a;

        public r() {
            HashMap hashMap = new HashMap();
            this.f2005a = hashMap;
            hashMap.put(d0.class, f2004b);
        }
    }

    /* compiled from: BrowseSupportFragment */
    public class s implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public t f2006a;

        public s(t tVar) {
            this.f2006a = tVar;
        }

        public void a(r0.a aVar, Object obj, y0.b bVar, Object obj2) {
            v0 v0Var = (v0) obj2;
            h.this.D0(((o) ((o.c) this.f2006a).f2008a).f1927r0);
            h.this.getClass();
        }
    }

    /* compiled from: BrowseSupportFragment */
    public static class t<T extends androidx.fragment.app.p> {

        /* renamed from: a  reason: collision with root package name */
        public final T f2008a;

        public t(T t10) {
            if (t10 != null) {
                this.f2008a = t10;
                return;
            }
            throw new IllegalArgumentException("Fragment can't be null");
        }
    }

    /* compiled from: BrowseSupportFragment */
    public interface u {
        t f();
    }

    /* compiled from: BrowseSupportFragment */
    public final class v implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f2009a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f2010b = -1;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2011c = false;

        public v() {
        }

        public void run() {
            h hVar = h.this;
            int i10 = this.f2009a;
            boolean z10 = this.f2011c;
            hVar.getClass();
            if (i10 != -1) {
                hVar.f1964i1 = i10;
                l lVar = hVar.R0;
                if (!(lVar == null || hVar.P0 == null)) {
                    lVar.y0(i10, z10);
                    if (hVar.x0(hVar.U0, i10)) {
                        if (!hVar.f1968m1) {
                            VerticalGridView verticalGridView = hVar.R0.f1924o0;
                            if (!hVar.f1959d1 || verticalGridView == null || verticalGridView.getScrollState() == 0) {
                                hVar.w0();
                            } else {
                                androidx.fragment.app.b bVar = new androidx.fragment.app.b(hVar.p());
                                bVar.h(R.id.scale_frame, new androidx.fragment.app.p());
                                bVar.e();
                                verticalGridView.b0(hVar.f1979x1);
                                verticalGridView.h(hVar.f1979x1);
                            }
                        }
                        hVar.y0(!hVar.f1960e1 || !hVar.f1959d1);
                    }
                    t tVar = hVar.S0;
                    if (tVar != null) {
                        ((o) ((o.c) tVar).f2008a).y0(i10, z10);
                    }
                    hVar.N0();
                }
            }
            this.f2009a = -1;
            this.f2010b = -1;
            this.f2011c = false;
        }
    }

    public final boolean A0() {
        h0 h0Var = this.U0;
        return (h0Var == null || h0Var.e() == 0) ? false : true;
    }

    public boolean B0() {
        return this.f1973r1 != null;
    }

    public boolean C0() {
        if ((this.R0.f1924o0.getScrollState() != 0) || this.P0.a()) {
            return true;
        }
        return false;
    }

    public void D0(int i10) {
        v vVar = this.f1969n1;
        if (vVar.f2010b <= 0) {
            vVar.f2009a = i10;
            vVar.f2010b = 0;
            vVar.f2011c = true;
            h.this.Z0.removeCallbacks(vVar);
            h hVar = h.this;
            if (!hVar.f1968m1) {
                hVar.Z0.post(vVar);
            }
        }
    }

    public final void E0(boolean z10) {
        int i10;
        View view = this.R0.Q;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (z10) {
            i10 = 0;
        } else {
            i10 = -this.f1961f1;
        }
        marginLayoutParams.setMarginStart(i10);
        view.setLayoutParams(marginLayoutParams);
    }

    public void F0(int i10) {
        if (i10 < 1 || i10 > 3) {
            throw new IllegalArgumentException(androidx.appcompat.widget.d0.a("Invalid headers state: ", i10));
        } else if (i10 != this.W0) {
            this.W0 = i10;
            if (i10 == 1) {
                this.f1960e1 = true;
                this.f1959d1 = true;
            } else if (i10 == 2) {
                this.f1960e1 = true;
                this.f1959d1 = false;
            } else if (i10 != 3) {
                f0.j.a("Unknown headers state: ", i10, "BrowseSupportFragment");
            } else {
                this.f1960e1 = false;
                this.f1959d1 = false;
            }
            l lVar = this.R0;
            if (lVar != null) {
                lVar.f2026y0 = true ^ this.f1960e1;
                lVar.C0();
            }
        }
    }

    public void G0() {
        p g10 = ((q) this.Q0).g();
        this.P0 = g10;
        g10.f2003c = new n();
        if (!this.f1966k1) {
            androidx.fragment.app.p pVar = this.Q0;
            if (pVar instanceof u) {
                I0(((u) pVar).f());
            } else {
                I0((t) null);
            }
            this.f1966k1 = this.S0 == null;
            return;
        }
        I0((t) null);
    }

    public final void H0() {
        int i10 = this.f1962g1;
        if (this.f1963h1 && this.P0.f2001a && this.f1959d1) {
            i10 = (int) ((((float) i10) / this.f1965j1) + 0.5f);
        }
        this.P0.e(i10);
    }

    public void I0(t tVar) {
        t tVar2 = this.S0;
        if (tVar != tVar2) {
            if (tVar2 != null) {
                o oVar = (o) ((o.c) tVar2).f2008a;
                if (oVar.f1923n0 != null) {
                    oVar.f1923n0 = null;
                    oVar.z0();
                }
            }
            this.S0 = tVar;
            if (tVar != null) {
                ((o) ((o.c) tVar).f2008a).E0(new s(tVar));
                ((o) ((o.c) this.S0).f2008a).D0((androidx.leanback.widget.f) null);
            }
            M0();
        }
    }

    public void J0(boolean z10) {
        int i10;
        View searchAffordanceView = TitleView.this.getSearchAffordanceView();
        if (searchAffordanceView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchAffordanceView.getLayoutParams();
            if (z10) {
                i10 = 0;
            } else {
                i10 = -this.f1961f1;
            }
            marginLayoutParams.setMarginStart(i10);
            searchAffordanceView.setLayoutParams(marginLayoutParams);
        }
    }

    public void K0(boolean z10) {
        l lVar = this.R0;
        lVar.f2025x0 = z10;
        lVar.C0();
        E0(z10);
        y0(!z10);
    }

    public void L0(boolean z10) {
        if (!this.B.I && A0()) {
            this.f1959d1 = z10;
            this.P0.c();
            this.P0.d();
            boolean z11 = !z10;
            e eVar = new e(z10);
            if (z11) {
                eVar.run();
                return;
            }
            p pVar = this.P0;
            View view = this.Q;
            l lVar = new l(eVar, pVar, view);
            view.getViewTreeObserver().addOnPreDrawListener(lVar);
            lVar.f1997d.g(false);
            view.invalidate();
            lVar.f1996c = 0;
        }
    }

    public void M0() {
        m mVar = this.T0;
        m mVar2 = null;
        if (mVar != null) {
            h0 h0Var = mVar.f2031c;
            h0Var.f2400a.unregisterObserver(mVar.f2033e);
            this.T0 = null;
        }
        if (this.S0 != null) {
            h0 h0Var2 = this.U0;
            if (h0Var2 != null) {
                mVar2 = new m(h0Var2);
            }
            this.T0 = mVar2;
            o oVar = (o) ((o.c) this.S0).f2008a;
            if (oVar.f1923n0 != mVar2) {
                oVar.f1923n0 = mVar2;
                oVar.z0();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void N0() {
        /*
            r6 = this;
            boolean r0 = r6.f1959d1
            r1 = 0
            if (r0 != 0) goto L_0x0023
            boolean r0 = r6.f1966k1
            if (r0 == 0) goto L_0x0012
            androidx.leanback.app.h$p r0 = r6.P0
            if (r0 == 0) goto L_0x0012
            androidx.leanback.app.h$n r0 = r0.f2003c
            boolean r0 = r0.f1999a
            goto L_0x0018
        L_0x0012:
            int r0 = r6.f1964i1
            boolean r0 = r6.z0(r0)
        L_0x0018:
            if (r0 == 0) goto L_0x001f
            r0 = 6
            r6.u0(r0)
            goto L_0x007a
        L_0x001f:
            r6.v0(r1)
            goto L_0x007a
        L_0x0023:
            boolean r0 = r6.f1966k1
            if (r0 == 0) goto L_0x0030
            androidx.leanback.app.h$p r0 = r6.P0
            if (r0 == 0) goto L_0x0030
            androidx.leanback.app.h$n r0 = r0.f2003c
            boolean r0 = r0.f1999a
            goto L_0x0036
        L_0x0030:
            int r0 = r6.f1964i1
            boolean r0 = r6.z0(r0)
        L_0x0036:
            int r2 = r6.f1964i1
            androidx.leanback.widget.h0 r3 = r6.U0
            if (r3 == 0) goto L_0x0067
            int r3 = r3.e()
            if (r3 != 0) goto L_0x0043
            goto L_0x0067
        L_0x0043:
            r3 = 0
        L_0x0044:
            androidx.leanback.widget.h0 r4 = r6.U0
            int r4 = r4.e()
            if (r3 >= r4) goto L_0x0067
            androidx.leanback.widget.h0 r4 = r6.U0
            java.lang.Object r4 = r4.a(r3)
            androidx.leanback.widget.v0 r4 = (androidx.leanback.widget.v0) r4
            boolean r5 = r4.a()
            if (r5 != 0) goto L_0x0062
            boolean r4 = r4 instanceof androidx.leanback.widget.n0
            if (r4 == 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0062:
            if (r2 != r3) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r2 = 0
            goto L_0x0068
        L_0x0067:
            r2 = 1
        L_0x0068:
            if (r0 == 0) goto L_0x006c
            r0 = 2
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r2 == 0) goto L_0x0071
            r0 = r0 | 4
        L_0x0071:
            if (r0 == 0) goto L_0x0077
            r6.u0(r0)
            goto L_0x007a
        L_0x0077:
            r6.v0(r1)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.app.h.N0():void");
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        Context q10 = q();
        TypedArray obtainStyledAttributes = q10.obtainStyledAttributes(e1.a.f13528b);
        this.f1961f1 = (int) obtainStyledAttributes.getDimension(6, (float) q10.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_start));
        this.f1962g1 = (int) obtainStyledAttributes.getDimension(7, (float) q10.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_top));
        obtainStyledAttributes.recycle();
        Bundle bundle2 = this.f1796g;
        if (bundle2 != null) {
            String str = f1954y1;
            if (bundle2.containsKey(str)) {
                s0(bundle2.getString(str));
            }
            String str2 = f1955z1;
            if (bundle2.containsKey(str2)) {
                F0(bundle2.getInt(str2));
            }
        }
        if (this.f1960e1) {
            if (this.f1957b1) {
                this.f1958c1 = "lbHeadersBackStack_" + this;
                k kVar = new k();
                this.f1974s1 = kVar;
                a0 a0Var = this.B;
                if (a0Var.f1589m == null) {
                    a0Var.f1589m = new ArrayList<>();
                }
                a0Var.f1589m.add(kVar);
                k kVar2 = this.f1974s1;
                kVar2.getClass();
                if (bundle != null) {
                    int i10 = bundle.getInt("headerStackIndex", -1);
                    kVar2.f1992b = i10;
                    h.this.f1959d1 = i10 == -1;
                } else {
                    h hVar = h.this;
                    if (!hVar.f1959d1) {
                        androidx.fragment.app.b bVar = new androidx.fragment.app.b(hVar.B);
                        bVar.d(h.this.f1958c1);
                        bVar.e();
                    }
                }
            } else if (bundle != null) {
                this.f1959d1 = bundle.getBoolean("headerShow");
            }
        }
        this.f1965j1 = C().getFraction(R.fraction.lb_browse_rows_scale, 1, 1);
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (p().F(R.id.scale_frame) == null) {
            this.R0 = new l();
            x0(this.U0, this.f1964i1);
            androidx.fragment.app.b bVar = new androidx.fragment.app.b(p());
            bVar.h(R.id.browse_headers_dock, this.R0);
            androidx.fragment.app.p pVar = this.Q0;
            if (pVar != null) {
                bVar.h(R.id.scale_frame, pVar);
            } else {
                p pVar2 = new p(null);
                this.P0 = pVar2;
                pVar2.f2003c = new n();
            }
            bVar.e();
        } else {
            this.R0 = (l) p().F(R.id.browse_headers_dock);
            this.Q0 = p().F(R.id.scale_frame);
            this.f1966k1 = bundle != null && bundle.getBoolean("isPageRow", false);
            this.f1964i1 = bundle != null ? bundle.getInt("currentSelectedPosition", 0) : 0;
            G0();
        }
        l lVar = this.R0;
        lVar.f2026y0 = !this.f1960e1;
        lVar.C0();
        this.R0.w0(this.U0);
        l lVar2 = this.R0;
        lVar2.f2023v0 = this.f1978w1;
        lVar2.f2024w0 = this.f1977v1;
        View inflate = layoutInflater.inflate(R.layout.lb_browse_fragment, viewGroup, false);
        this.J0.f2036a = (ViewGroup) inflate;
        BrowseFrameLayout browseFrameLayout = (BrowseFrameLayout) inflate.findViewById(R.id.browse_frame);
        this.Z0 = browseFrameLayout;
        browseFrameLayout.setOnChildFocusListener(this.f1976u1);
        this.Z0.setOnFocusSearchListener(this.f1975t1);
        r0(layoutInflater, this.Z0, bundle);
        ScaleFrameLayout scaleFrameLayout = (ScaleFrameLayout) inflate.findViewById(R.id.scale_frame);
        this.f1956a1 = scaleFrameLayout;
        scaleFrameLayout.setPivotX(0.0f);
        this.f1956a1.setPivotY((float) this.f1962g1);
        if (this.Y0) {
            l lVar3 = this.R0;
            int i10 = this.X0;
            lVar3.f2027z0 = i10;
            lVar3.A0 = true;
            VerticalGridView verticalGridView = lVar3.f1924o0;
            if (verticalGridView != null) {
                verticalGridView.setBackgroundColor(i10);
                lVar3.B0(lVar3.f2027z0);
            }
        }
        this.f1970o1 = androidx.leanback.transition.b.b(this.Z0, new C0025h());
        this.f1971p1 = androidx.leanback.transition.b.b(this.Z0, new i());
        this.f1972q1 = androidx.leanback.transition.b.b(this.Z0, new j());
        return inflate;
    }

    public void Q() {
        ArrayList<a0.m> arrayList;
        k kVar = this.f1974s1;
        if (!(kVar == null || (arrayList = this.B.f1589m) == null)) {
            arrayList.remove(kVar);
        }
        this.O = true;
    }

    public void R() {
        I0((t) null);
        this.f1967l1 = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = null;
        this.O = true;
        this.f1953t0 = null;
    }

    public void a0(Bundle bundle) {
        bundle.putBoolean("titleShow", this.f1947n0);
        bundle.putInt("currentSelectedPosition", this.f1964i1);
        bundle.putBoolean("isPageRow", this.f1966k1);
        k kVar = this.f1974s1;
        if (kVar != null) {
            bundle.putInt("headerStackIndex", kVar.f1992b);
        } else {
            bundle.putBoolean("headerShow", this.f1959d1);
        }
    }

    public void b0() {
        androidx.fragment.app.p pVar;
        View view;
        l lVar;
        View view2;
        super.b0();
        l lVar2 = this.R0;
        int i10 = this.f1962g1;
        VerticalGridView verticalGridView = lVar2.f1924o0;
        if (verticalGridView != null) {
            verticalGridView.setItemAlignmentOffset(0);
            lVar2.f1924o0.setItemAlignmentOffsetPercent(-1.0f);
            lVar2.f1924o0.setWindowAlignmentOffset(i10);
            lVar2.f1924o0.setWindowAlignmentOffsetPercent(-1.0f);
            lVar2.f1924o0.setWindowAlignment(0);
        }
        H0();
        boolean z10 = this.f1960e1;
        if (z10 && this.f1959d1 && (lVar = this.R0) != null && (view2 = lVar.Q) != null) {
            view2.requestFocus();
        } else if (!((z10 && this.f1959d1) || (pVar = this.Q0) == null || (view = pVar.Q) == null)) {
            view.requestFocus();
        }
        if (this.f1960e1) {
            K0(this.f1959d1);
        }
        this.H0.c(this.L0);
        this.f1968m1 = false;
        w0();
        v vVar = this.f1969n1;
        if (vVar.f2010b != -1) {
            h.this.Z0.post(vVar);
        }
    }

    public void c0() {
        this.f1968m1 = true;
        v vVar = this.f1969n1;
        h.this.Z0.removeCallbacks(vVar);
        this.O = true;
    }

    public final void w0() {
        a0 p10 = p();
        if (p10.F(R.id.scale_frame) != this.Q0) {
            androidx.fragment.app.b bVar = new androidx.fragment.app.b(p10);
            bVar.h(R.id.scale_frame, this.Q0);
            bVar.e();
        }
    }

    public final boolean x0(h0 h0Var, int i10) {
        Object obj;
        m mVar;
        Object obj2 = null;
        boolean z10 = true;
        if (!this.f1960e1) {
            obj = null;
        } else if (h0Var == null || h0Var.e() == 0) {
            return false;
        } else {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= h0Var.e()) {
                throw new IllegalArgumentException(String.format("Invalid position %d requested", new Object[]{Integer.valueOf(i10)}));
            }
            obj = h0Var.a(i10);
        }
        boolean z11 = this.f1966k1;
        Object obj3 = this.f1967l1;
        boolean z12 = this.f1960e1 && (obj instanceof n0);
        this.f1966k1 = z12;
        if (z12) {
            obj2 = obj;
        }
        this.f1967l1 = obj2;
        if (this.Q0 != null) {
            if (!z11) {
                z10 = z12;
            } else if (z12 && (obj3 == null || obj3 == obj2)) {
                z10 = false;
            }
        }
        if (z10) {
            r rVar = this.O0;
            rVar.getClass();
            if (obj == null) {
                mVar = r.f2004b;
            } else {
                mVar = rVar.f2005a.get(obj.getClass());
            }
            if (mVar == null && !(obj instanceof n0)) {
                mVar = r.f2004b;
            }
            androidx.fragment.app.p a10 = mVar.a(obj);
            this.Q0 = a10;
            if (a10 instanceof q) {
                G0();
            } else {
                throw new IllegalArgumentException("Fragment must implement MainFragmentAdapterProvider");
            }
        }
        return z10;
    }

    public final void y0(boolean z10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1956a1.getLayoutParams();
        marginLayoutParams.setMarginStart(!z10 ? this.f1961f1 : 0);
        this.f1956a1.setLayoutParams(marginLayoutParams);
        this.P0.g(z10);
        H0();
        float f10 = (z10 || !this.f1963h1 || !this.P0.f2001a) ? 1.0f : this.f1965j1;
        this.f1956a1.setLayoutScaleY(f10);
        this.f1956a1.setChildScale(f10);
    }

    public boolean z0(int i10) {
        h0 h0Var = this.U0;
        if (!(h0Var == null || h0Var.e() == 0)) {
            int i11 = 0;
            while (i11 < this.U0.e()) {
                if (!((v0) this.U0.a(i11)).a()) {
                    i11++;
                } else if (i10 == i11) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
