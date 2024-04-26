package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.h0;
import androidx.leanback.widget.r0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ItemBridgeAdapter */
public class b0 extends RecyclerView.e implements l {

    /* renamed from: d  reason: collision with root package name */
    public h0 f2315d;

    /* renamed from: e  reason: collision with root package name */
    public e f2316e;

    /* renamed from: f  reason: collision with root package name */
    public s0 f2317f;

    /* renamed from: g  reason: collision with root package name */
    public m f2318g;

    /* renamed from: h  reason: collision with root package name */
    public b f2319h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<r0> f2320i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public h0.b f2321j = new a();

    /* compiled from: ItemBridgeAdapter */
    public class a extends h0.b {
        public a() {
        }

        public void a() {
            b0.this.f2863a.b();
        }

        public void b(int i10, int i11) {
            b0.this.f2863a.c(i10, i11);
        }

        public void c(int i10, int i11) {
            b0.this.f2863a.d(i10, i11);
        }

        public void d(int i10, int i11) {
            b0.this.f2863a.e(i10, i11);
        }
    }

    /* compiled from: ItemBridgeAdapter */
    public static class b {
        public void a(r0 r0Var, int i10) {
        }

        public void b(d dVar) {
        }

        public void c(d dVar) {
        }

        public void d(d dVar) {
            throw null;
        }

        public void e(d dVar) {
        }

        public void f(d dVar) {
        }
    }

    /* compiled from: ItemBridgeAdapter */
    public final class c implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public View.OnFocusChangeListener f2323a;

        public c() {
        }

        public void onFocusChange(View view, boolean z10) {
            if (b0.this.f2316e != null) {
                view = (View) view.getParent();
            }
            m mVar = b0.this.f2318g;
            if (mVar != null) {
                mVar.a(view, z10);
            }
            View.OnFocusChangeListener onFocusChangeListener = this.f2323a;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z10);
            }
        }
    }

    /* compiled from: ItemBridgeAdapter */
    public class d extends RecyclerView.a0 implements k {

        /* renamed from: u  reason: collision with root package name */
        public final r0 f2325u;

        /* renamed from: v  reason: collision with root package name */
        public final r0.a f2326v;

        /* renamed from: w  reason: collision with root package name */
        public final c f2327w;

        /* renamed from: x  reason: collision with root package name */
        public Object f2328x;

        /* renamed from: y  reason: collision with root package name */
        public Object f2329y;

        public d(b0 b0Var, r0 r0Var, View view, r0.a aVar) {
            super(view);
            this.f2327w = new c();
            this.f2325u = r0Var;
            this.f2326v = aVar;
        }

        public Object a(Class<?> cls) {
            this.f2326v.getClass();
            return null;
        }
    }

    /* compiled from: ItemBridgeAdapter */
    public static abstract class e {
        public abstract View a(View view);

        public abstract void b(View view, View view2);
    }

    public k a(int i10) {
        return this.f2320i.get(i10);
    }

    public int b() {
        h0 h0Var = this.f2315d;
        if (h0Var != null) {
            return h0Var.e();
        }
        return 0;
    }

    public long c(int i10) {
        this.f2315d.getClass();
        return -1;
    }

    public int d(int i10) {
        s0 s0Var = this.f2317f;
        if (s0Var == null) {
            s0Var = this.f2315d.f2401b;
        }
        r0 a10 = s0Var.a(this.f2315d.a(i10));
        int indexOf = this.f2320i.indexOf(a10);
        if (indexOf < 0) {
            this.f2320i.add(a10);
            indexOf = this.f2320i.indexOf(a10);
            l(a10, indexOf);
            b bVar = this.f2319h;
            if (bVar != null) {
                bVar.a(a10, indexOf);
            }
        }
        return indexOf;
    }

    public final void e(RecyclerView.a0 a0Var, int i10) {
        d dVar = (d) a0Var;
        Object a10 = this.f2315d.a(i10);
        dVar.f2328x = a10;
        dVar.f2325u.c(dVar.f2326v, a10);
        n(dVar);
        b bVar = this.f2319h;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    public final void f(RecyclerView.a0 a0Var, int i10, List list) {
        d dVar = (d) a0Var;
        Object a10 = this.f2315d.a(i10);
        dVar.f2328x = a10;
        dVar.f2325u.c(dVar.f2326v, a10);
        n(dVar);
        b bVar = this.f2319h;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    public final RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
        r0.a aVar;
        View view;
        r0 r0Var = this.f2320i.get(i10);
        e eVar = this.f2316e;
        if (eVar != null) {
            view = eVar.a(viewGroup);
            aVar = r0Var.d(viewGroup);
            this.f2316e.b(view, aVar.f2509a);
        } else {
            aVar = r0Var.d(viewGroup);
            view = aVar.f2509a;
        }
        d dVar = new d(this, r0Var, view, aVar);
        o(dVar);
        b bVar = this.f2319h;
        if (bVar != null) {
            bVar.d(dVar);
        }
        View view2 = dVar.f2326v.f2509a;
        if (view2 != null) {
            dVar.f2327w.f2323a = view2.getOnFocusChangeListener();
            view2.setOnFocusChangeListener(dVar.f2327w);
        }
        m mVar = this.f2318g;
        if (mVar != null) {
            mVar.b(view);
        }
        return dVar;
    }

    public final boolean h(RecyclerView.a0 a0Var) {
        k(a0Var);
        return false;
    }

    public final void i(RecyclerView.a0 a0Var) {
        d dVar = (d) a0Var;
        m(dVar);
        b bVar = this.f2319h;
        if (bVar != null) {
            bVar.b(dVar);
        }
        dVar.f2325u.f(dVar.f2326v);
    }

    public final void j(RecyclerView.a0 a0Var) {
        d dVar = (d) a0Var;
        dVar.f2325u.g(dVar.f2326v);
        b bVar = this.f2319h;
        if (bVar != null) {
            bVar.e(dVar);
        }
    }

    public final void k(RecyclerView.a0 a0Var) {
        d dVar = (d) a0Var;
        dVar.f2325u.e(dVar.f2326v);
        p(dVar);
        b bVar = this.f2319h;
        if (bVar != null) {
            bVar.f(dVar);
        }
        dVar.f2328x = null;
    }

    public void l(r0 r0Var, int i10) {
    }

    public void m(d dVar) {
    }

    public void n(d dVar) {
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }

    public void q(h0 h0Var) {
        h0 h0Var2 = this.f2315d;
        if (h0Var != h0Var2) {
            if (h0Var2 != null) {
                h0Var2.f2400a.unregisterObserver(this.f2321j);
            }
            this.f2315d = h0Var;
            if (h0Var == null) {
                this.f2863a.b();
                return;
            }
            h0Var.f2400a.registerObserver(this.f2321j);
            boolean z10 = this.f2864b;
            this.f2315d.getClass();
            if (z10) {
                this.f2315d.getClass();
                if (!this.f2863a.a()) {
                    this.f2864b = false;
                } else {
                    throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                }
            }
            this.f2863a.b();
        }
    }
}
