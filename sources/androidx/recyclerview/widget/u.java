package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* compiled from: RecyclerView */
public class u implements a.C0036a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3139a;

    public u(RecyclerView recyclerView) {
        this.f3139a = recyclerView;
    }

    public void a(a.b bVar) {
        int i10 = bVar.f3002a;
        if (i10 == 1) {
            RecyclerView recyclerView = this.f3139a;
            recyclerView.f2828u.n0(recyclerView, bVar.f3003b, bVar.f3005d);
        } else if (i10 == 2) {
            RecyclerView recyclerView2 = this.f3139a;
            recyclerView2.f2828u.q0(recyclerView2, bVar.f3003b, bVar.f3005d);
        } else if (i10 == 4) {
            RecyclerView recyclerView3 = this.f3139a;
            recyclerView3.f2828u.s0(recyclerView3, bVar.f3003b, bVar.f3005d, bVar.f3004c);
        } else if (i10 == 8) {
            RecyclerView recyclerView4 = this.f3139a;
            recyclerView4.f2828u.p0(recyclerView4, bVar.f3003b, bVar.f3005d, 1);
        }
    }

    public RecyclerView.a0 b(int i10) {
        RecyclerView.a0 H = this.f3139a.H(i10, true);
        if (H != null && !this.f3139a.f2804e.k(H.f2842a)) {
            return H;
        }
        return null;
    }

    public void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f3139a;
        int h10 = recyclerView.f2804e.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f2804e.g(i15);
            RecyclerView.a0 L = RecyclerView.L(g10);
            if (L != null && !L.x() && (i13 = L.f2844c) >= i10 && i13 < i14) {
                L.c(2);
                L.b(obj);
                ((RecyclerView.n) g10.getLayoutParams()).f2898c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2798b;
        int size = sVar.f2908c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.a0 a0Var = sVar.f2908c.get(size);
                if (a0Var != null && (i12 = a0Var.f2844c) >= i10 && i12 < i14) {
                    a0Var.c(2);
                    sVar.h(size);
                }
            } else {
                this.f3139a.f2833w0 = true;
                return;
            }
        }
    }

    public void d(int i10, int i11) {
        RecyclerView recyclerView = this.f3139a;
        int h10 = recyclerView.f2804e.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.a0 L = RecyclerView.L(recyclerView.f2804e.g(i12));
            if (L != null && !L.x() && L.f2844c >= i10) {
                L.t(i11, false);
                recyclerView.f2825s0.f2936f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2798b;
        int size = sVar.f2908c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.a0 a0Var = sVar.f2908c.get(i13);
            if (a0Var != null && a0Var.f2844c >= i10) {
                a0Var.t(i11, false);
            }
        }
        recyclerView.requestLayout();
        this.f3139a.f2831v0 = true;
    }

    public void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f3139a;
        int h10 = recyclerView.f2804e.h();
        int i19 = -1;
        if (i10 < i11) {
            i14 = i10;
            i13 = i11;
            i12 = -1;
        } else {
            i13 = i10;
            i14 = i11;
            i12 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.a0 L = RecyclerView.L(recyclerView.f2804e.g(i20));
            if (L != null && (i18 = L.f2844c) >= i14 && i18 <= i13) {
                if (i18 == i10) {
                    L.t(i11 - i10, false);
                } else {
                    L.t(i12, false);
                }
                recyclerView.f2825s0.f2936f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2798b;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = sVar.f2908c.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.a0 a0Var = sVar.f2908c.get(i21);
            if (a0Var != null && (i17 = a0Var.f2844c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    a0Var.t(i11 - i10, false);
                } else {
                    a0Var.t(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f3139a.f2831v0 = true;
    }
}
