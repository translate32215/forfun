package androidx.leanback.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.b0;
import androidx.leanback.widget.h0;
import androidx.leanback.widget.k0;
import androidx.leanback.widget.s0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BaseRowSupportFragment */
public abstract class c extends p {

    /* renamed from: n0  reason: collision with root package name */
    public h0 f1923n0;

    /* renamed from: o0  reason: collision with root package name */
    public VerticalGridView f1924o0;

    /* renamed from: p0  reason: collision with root package name */
    public s0 f1925p0;

    /* renamed from: q0  reason: collision with root package name */
    public final b0 f1926q0 = new b0();

    /* renamed from: r0  reason: collision with root package name */
    public int f1927r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1928s0;

    /* renamed from: t0  reason: collision with root package name */
    public b f1929t0 = new b();

    /* renamed from: u0  reason: collision with root package name */
    public final k0 f1930u0 = new a();

    /* compiled from: BaseRowSupportFragment */
    public class a extends k0 {
        public a() {
        }

        public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10, int i11) {
            c cVar = c.this;
            if (!cVar.f1929t0.f1932a) {
                cVar.f1927r0 = i10;
                cVar.t0(recyclerView, a0Var, i10, i11);
            }
        }
    }

    /* compiled from: BaseRowSupportFragment */
    public class b extends RecyclerView.g {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1932a = false;

        public b() {
        }

        public void a() {
            e();
        }

        public void c(int i10, int i11) {
            e();
        }

        public void e() {
            if (this.f1932a) {
                this.f1932a = false;
                c.this.f1926q0.f2863a.unregisterObserver(this);
            }
            c cVar = c.this;
            VerticalGridView verticalGridView = cVar.f1924o0;
            if (verticalGridView != null) {
                verticalGridView.setSelectedPosition(cVar.f1927r0);
            }
        }
    }

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(s0(), viewGroup, false);
        this.f1924o0 = r0(inflate);
        if (this.f1928s0) {
            this.f1928s0 = false;
            v0();
        }
        return inflate;
    }

    public void R() {
        this.O = true;
        b bVar = this.f1929t0;
        if (bVar.f1932a) {
            bVar.f1932a = false;
            c.this.f1926q0.f2863a.unregisterObserver(bVar);
        }
        this.f1924o0 = null;
    }

    public void a0(Bundle bundle) {
        bundle.putInt("currentSelectedPosition", this.f1927r0);
    }

    public void d0(View view, Bundle bundle) {
        if (bundle != null) {
            this.f1927r0 = bundle.getInt("currentSelectedPosition", -1);
        }
        x0();
        this.f1924o0.setOnChildViewHolderSelectedListener(this.f1930u0);
    }

    public abstract VerticalGridView r0(View view);

    /* access modifiers changed from: package-private */
    public abstract int s0();

    public abstract void t0(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10, int i11);

    public void u0() {
        VerticalGridView verticalGridView = this.f1924o0;
        if (verticalGridView != null) {
            verticalGridView.setLayoutFrozen(false);
            this.f1924o0.setAnimateChildLayout(true);
            this.f1924o0.setPruneChild(true);
            this.f1924o0.setFocusSearchDisabled(false);
            this.f1924o0.setScrollEnabled(true);
        }
    }

    public boolean v0() {
        VerticalGridView verticalGridView = this.f1924o0;
        if (verticalGridView != null) {
            verticalGridView.setAnimateChildLayout(false);
            this.f1924o0.setScrollEnabled(false);
            return true;
        }
        this.f1928s0 = true;
        return false;
    }

    public final void w0(h0 h0Var) {
        if (this.f1923n0 != h0Var) {
            this.f1923n0 = h0Var;
            z0();
        }
    }

    public void x0() {
        if (this.f1923n0 != null) {
            RecyclerView.e adapter = this.f1924o0.getAdapter();
            b0 b0Var = this.f1926q0;
            if (adapter != b0Var) {
                this.f1924o0.setAdapter(b0Var);
            }
            if (this.f1926q0.b() == 0 && this.f1927r0 >= 0) {
                b bVar = this.f1929t0;
                bVar.f1932a = true;
                c.this.f1926q0.f2863a.registerObserver(bVar);
                return;
            }
            int i10 = this.f1927r0;
            if (i10 >= 0) {
                this.f1924o0.setSelectedPosition(i10);
            }
        }
    }

    public void y0(int i10, boolean z10) {
        if (this.f1927r0 != i10) {
            this.f1927r0 = i10;
            VerticalGridView verticalGridView = this.f1924o0;
            if (verticalGridView != null && !this.f1929t0.f1932a) {
                if (z10) {
                    verticalGridView.setSelectedPositionSmooth(i10);
                } else {
                    verticalGridView.setSelectedPosition(i10);
                }
            }
        }
    }

    public void z0() {
        this.f1926q0.q(this.f1923n0);
        b0 b0Var = this.f1926q0;
        b0Var.f2317f = this.f1925p0;
        b0Var.f2863a.b();
        if (this.f1924o0 != null) {
            x0();
        }
    }
}
