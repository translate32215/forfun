package androidx.leanback.app;

import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.leanback.app.h;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.b0;
import androidx.leanback.widget.e0;
import androidx.leanback.widget.f;
import androidx.leanback.widget.g;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;
import java.util.ArrayList;

/* compiled from: RowsSupportFragment */
public class o extends c implements h.u, h.q {
    public boolean A0;
    public int B0 = Integer.MIN_VALUE;
    public boolean C0 = true;
    public boolean D0;
    public g E0;
    public f F0;
    public int G0;
    public Interpolator H0 = new DecelerateInterpolator(2.0f);
    public RecyclerView.r I0;
    public ArrayList<r0> J0;
    public final b0.b K0 = new a();

    /* renamed from: v0  reason: collision with root package name */
    public b f2043v0;

    /* renamed from: w0  reason: collision with root package name */
    public c f2044w0;

    /* renamed from: x0  reason: collision with root package name */
    public b0.d f2045x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f2046y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2047z0 = true;

    /* compiled from: RowsSupportFragment */
    public class a extends b0.b {
        public a() {
        }

        public void a(r0 r0Var, int i10) {
            o.this.getClass();
        }

        public void b(b0.d dVar) {
            boolean z10 = o.this.f2047z0;
            y0 y0Var = (y0) dVar.f2325u;
            y0.b k10 = y0Var.k(dVar.f2326v);
            k10.f2575h = z10;
            y0Var.n(k10, z10);
            y0 y0Var2 = (y0) dVar.f2325u;
            y0.b k11 = y0Var2.k(dVar.f2326v);
            y0Var2.r(k11, o.this.C0);
            y0Var2.j(k11, o.this.D0);
            o.this.getClass();
        }

        public void c(b0.d dVar) {
            o.this.getClass();
        }

        public void d(b0.d dVar) {
            VerticalGridView verticalGridView = o.this.f1924o0;
            if (verticalGridView != null) {
                verticalGridView.setClipChildren(false);
            }
            o oVar = o.this;
            oVar.getClass();
            y0.b k10 = ((y0) dVar.f2325u).k(dVar.f2326v);
            if (k10 instanceof e0.d) {
                e0.d dVar2 = (e0.d) k10;
                HorizontalGridView horizontalGridView = dVar2.f2371n;
                RecyclerView.r rVar = oVar.I0;
                if (rVar == null) {
                    oVar.I0 = horizontalGridView.getRecycledViewPool();
                } else {
                    horizontalGridView.setRecycledViewPool(rVar);
                }
                b0 b0Var = dVar2.f2372o;
                ArrayList<r0> arrayList = oVar.J0;
                if (arrayList == null) {
                    oVar.J0 = b0Var.f2320i;
                } else {
                    b0Var.f2320i = arrayList;
                }
            }
            o oVar2 = o.this;
            oVar2.A0 = true;
            dVar.f2329y = new d(dVar);
            o.F0(dVar, false, true);
            o.this.getClass();
            y0.b k11 = ((y0) dVar.f2325u).k(dVar.f2326v);
            o oVar3 = o.this;
            k11.f2579l = oVar3.E0;
            k11.f2580m = oVar3.F0;
        }

        public void e(b0.d dVar) {
            b0.d dVar2 = o.this.f2045x0;
            if (dVar2 == dVar) {
                o.F0(dVar2, false, true);
                o.this.f2045x0 = null;
            }
            o.this.getClass();
        }

        public void f(b0.d dVar) {
            o.F0(dVar, false, true);
            o.this.getClass();
        }
    }

    /* compiled from: RowsSupportFragment */
    public static class b extends h.p<o> {
        public b(o oVar) {
            super(oVar);
            this.f2001a = true;
        }

        public boolean a() {
            VerticalGridView verticalGridView = ((o) this.f2002b).f1924o0;
            if (verticalGridView == null || verticalGridView.getScrollState() == 0) {
                return false;
            }
            return true;
        }

        public void b() {
            ((o) this.f2002b).u0();
        }

        public boolean c() {
            return ((o) this.f2002b).v0();
        }

        public void d() {
            o oVar = (o) this.f2002b;
            VerticalGridView verticalGridView = oVar.f1924o0;
            if (verticalGridView != null) {
                verticalGridView.setPruneChild(false);
                oVar.f1924o0.setLayoutFrozen(true);
                oVar.f1924o0.setFocusSearchDisabled(true);
            }
        }

        public void e(int i10) {
            ((o) this.f2002b).B0(i10);
        }

        public void f(boolean z10) {
            o oVar = (o) this.f2002b;
            oVar.C0 = z10;
            VerticalGridView verticalGridView = oVar.f1924o0;
            if (verticalGridView != null) {
                int childCount = verticalGridView.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    b0.d dVar = (b0.d) verticalGridView.K(verticalGridView.getChildAt(i10));
                    y0 y0Var = (y0) dVar.f2325u;
                    y0Var.r(y0Var.k(dVar.f2326v), oVar.C0);
                }
            }
        }

        public void g(boolean z10) {
            ((o) this.f2002b).C0(z10);
        }
    }

    /* compiled from: RowsSupportFragment */
    public static class c extends h.t<o> {
        public c(o oVar) {
            super(oVar);
        }
    }

    /* compiled from: RowsSupportFragment */
    public final class d implements TimeAnimator.TimeListener {

        /* renamed from: a  reason: collision with root package name */
        public final y0 f2049a;

        /* renamed from: b  reason: collision with root package name */
        public final r0.a f2050b;

        /* renamed from: c  reason: collision with root package name */
        public final TimeAnimator f2051c;

        /* renamed from: d  reason: collision with root package name */
        public int f2052d;

        /* renamed from: e  reason: collision with root package name */
        public Interpolator f2053e;

        /* renamed from: f  reason: collision with root package name */
        public float f2054f;

        /* renamed from: g  reason: collision with root package name */
        public float f2055g;

        public d(b0.d dVar) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.f2051c = timeAnimator;
            this.f2049a = (y0) dVar.f2325u;
            this.f2050b = dVar.f2326v;
            timeAnimator.setTimeListener(this);
        }

        public void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
            float f10;
            if (this.f2051c.isRunning()) {
                int i10 = this.f2052d;
                if (j10 >= ((long) i10)) {
                    f10 = 1.0f;
                    this.f2051c.end();
                } else {
                    double d10 = (double) j10;
                    double d11 = (double) i10;
                    Double.isNaN(d10);
                    Double.isNaN(d11);
                    Double.isNaN(d10);
                    Double.isNaN(d11);
                    f10 = (float) (d10 / d11);
                }
                Interpolator interpolator = this.f2053e;
                if (interpolator != null) {
                    f10 = interpolator.getInterpolation(f10);
                }
                float f11 = (f10 * this.f2055g) + this.f2054f;
                y0 y0Var = this.f2049a;
                y0.b k10 = y0Var.k(this.f2050b);
                k10.f2577j = f11;
                y0Var.p(k10);
            }
        }
    }

    public static void F0(b0.d dVar, boolean z10, boolean z11) {
        d dVar2 = (d) dVar.f2329y;
        dVar2.f2051c.end();
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
            y0 y0Var = dVar2.f2049a;
            y0.b k10 = y0Var.k(dVar2.f2050b);
            k10.f2577j = f10;
            y0Var.p(k10);
        } else if (dVar2.f2049a.k(dVar2.f2050b).f2577j != f10) {
            o oVar = o.this;
            dVar2.f2052d = oVar.G0;
            dVar2.f2053e = oVar.H0;
            float f11 = dVar2.f2049a.k(dVar2.f2050b).f2577j;
            dVar2.f2054f = f11;
            dVar2.f2055g = f10 - f11;
            dVar2.f2051c.start();
        }
        y0 y0Var2 = (y0) dVar.f2325u;
        y0.b k11 = y0Var2.k(dVar.f2326v);
        k11.f2574g = z10;
        y0Var2.o(k11, z10);
    }

    public final void A0(boolean z10) {
        this.D0 = z10;
        VerticalGridView verticalGridView = this.f1924o0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b0.d dVar = (b0.d) verticalGridView.K(verticalGridView.getChildAt(i10));
                y0 y0Var = (y0) dVar.f2325u;
                y0Var.j(y0Var.k(dVar.f2326v), z10);
            }
        }
    }

    public void B0(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            this.B0 = i10;
            VerticalGridView verticalGridView = this.f1924o0;
            if (verticalGridView != null) {
                verticalGridView.setItemAlignmentOffset(0);
                verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
                verticalGridView.setItemAlignmentOffsetWithPadding(true);
                verticalGridView.setWindowAlignmentOffset(this.B0);
                verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
                verticalGridView.setWindowAlignment(0);
            }
        }
    }

    public void C0(boolean z10) {
        this.f2047z0 = z10;
        VerticalGridView verticalGridView = this.f1924o0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b0.d dVar = (b0.d) verticalGridView.K(verticalGridView.getChildAt(i10));
                boolean z11 = this.f2047z0;
                y0 y0Var = (y0) dVar.f2325u;
                y0.b k10 = y0Var.k(dVar.f2326v);
                k10.f2575h = z11;
                y0Var.n(k10, z11);
            }
        }
    }

    public void D0(f fVar) {
        this.F0 = fVar;
        if (this.A0) {
            throw new IllegalStateException("Item clicked listener must be set before views are created");
        }
    }

    public void E0(g gVar) {
        y0.b bVar;
        this.E0 = gVar;
        VerticalGridView verticalGridView = this.f1924o0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b0.d dVar = (b0.d) verticalGridView.K(verticalGridView.getChildAt(i10));
                if (dVar == null) {
                    bVar = null;
                } else {
                    bVar = ((y0) dVar.f2325u).k(dVar.f2326v);
                }
                bVar.f2579l = this.E0;
            }
        }
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        this.G0 = C().getInteger(R.integer.lb_browse_rows_anim_duration);
    }

    public void R() {
        this.A0 = false;
        super.R();
    }

    public void d0(View view, Bundle bundle) {
        super.d0(view, bundle);
        this.f1924o0.setItemAlignmentViewId(R.id.row_content);
        this.f1924o0.setSaveChildrenPolicy(2);
        B0(this.B0);
        this.I0 = null;
        this.J0 = null;
        b bVar = this.f2043v0;
        if (bVar != null) {
            bVar.f2003c.b(bVar);
        }
    }

    public h.t f() {
        if (this.f2044w0 == null) {
            this.f2044w0 = new c(this);
        }
        return this.f2044w0;
    }

    public h.p g() {
        if (this.f2043v0 == null) {
            this.f2043v0 = new b(this);
        }
        return this.f2043v0;
    }

    public VerticalGridView r0(View view) {
        return (VerticalGridView) view.findViewById(R.id.container_list);
    }

    public int s0() {
        return R.layout.lb_rows_fragment;
    }

    public void t0(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10, int i11) {
        b0.d dVar = this.f2045x0;
        boolean z10 = true;
        if (!(dVar == a0Var && this.f2046y0 == i11)) {
            this.f2046y0 = i11;
            if (dVar != null) {
                F0(dVar, false, false);
            }
            b0.d dVar2 = (b0.d) a0Var;
            this.f2045x0 = dVar2;
            if (dVar2 != null) {
                F0(dVar2, true, false);
            }
        }
        b bVar = this.f2043v0;
        if (bVar != null) {
            h.n nVar = bVar.f2003c;
            if (i10 > 0) {
                z10 = false;
            }
            nVar.c(z10);
        }
    }

    public void u0() {
        super.u0();
        A0(false);
    }

    public boolean v0() {
        boolean v02 = super.v0();
        if (v02) {
            A0(true);
        }
        return v02;
    }

    public void z0() {
        super.z0();
        this.f2045x0 = null;
        this.A0 = false;
        b0 b0Var = this.f1926q0;
        if (b0Var != null) {
            b0Var.f2319h = this.K0;
        }
    }
}
