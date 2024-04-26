package androidx.leanback.widget;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.b0;
import androidx.leanback.widget.e1;
import androidx.leanback.widget.n;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;

/* compiled from: VerticalGridPresenter */
public class r1 extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public int f2510a = -1;

    /* renamed from: b  reason: collision with root package name */
    public m0 f2511b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f2512c;

    /* renamed from: d  reason: collision with root package name */
    public e1 f2513d;

    /* renamed from: e  reason: collision with root package name */
    public b0.e f2514e;

    /* compiled from: VerticalGridPresenter */
    public class a extends b0 {

        /* renamed from: androidx.leanback.widget.r1$a$a  reason: collision with other inner class name */
        /* compiled from: VerticalGridPresenter */
        public class C0031a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b0.d f2516a;

            public C0031a(b0.d dVar) {
                this.f2516a = dVar;
            }

            public void onClick(View view) {
                l0 l0Var = r1.this.f2512c;
                if (l0Var != null) {
                    b0.d dVar = this.f2516a;
                    l0Var.a(dVar.f2326v, dVar.f2328x, (y0.b) null, null);
                }
            }
        }

        public a() {
        }

        public void m(b0.d dVar) {
            dVar.f2842a.setActivated(true);
        }

        public void n(b0.d dVar) {
            if (r1.this.f2512c != null) {
                dVar.f2326v.f2509a.setOnClickListener(new C0031a(dVar));
            }
        }

        public void o(b0.d dVar) {
            View view = dVar.f2842a;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (Build.VERSION.SDK_INT >= 21) {
                    viewGroup.setTransitionGroup(true);
                }
            }
            e1 e1Var = r1.this.f2513d;
            if (e1Var != null) {
                e1Var.a(dVar.f2842a);
            }
        }

        public void p(b0.d dVar) {
            if (r1.this.f2512c != null) {
                dVar.f2326v.f2509a.setOnClickListener((View.OnClickListener) null);
            }
        }
    }

    /* compiled from: VerticalGridPresenter */
    public static class b extends r0.a {

        /* renamed from: b  reason: collision with root package name */
        public b0 f2518b;

        /* renamed from: c  reason: collision with root package name */
        public final VerticalGridView f2519c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2520d;

        public b(VerticalGridView verticalGridView) {
            super(verticalGridView);
            this.f2519c = verticalGridView;
        }
    }

    public r1(int i10) {
    }

    public void c(r0.a aVar, Object obj) {
        b bVar = (b) aVar;
        bVar.f2518b.q((h0) obj);
        bVar.f2519c.setAdapter(bVar.f2518b);
    }

    public void e(r0.a aVar) {
        b bVar = (b) aVar;
        bVar.f2518b.q((h0) null);
        bVar.f2519c.setAdapter((RecyclerView.e) null);
    }

    /* renamed from: h */
    public final b d(ViewGroup viewGroup) {
        boolean z10 = false;
        VerticalGridView verticalGridView = (VerticalGridView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_vertical_grid, viewGroup, false).findViewById(R.id.browse_grid);
        b bVar = new b(verticalGridView);
        bVar.f2520d = false;
        bVar.f2518b = new a();
        int i10 = this.f2510a;
        if (i10 != -1) {
            verticalGridView.setNumColumns(i10);
            bVar.f2520d = true;
            Context context = verticalGridView.getContext();
            if (this.f2513d == null) {
                e1.a aVar = new e1.a();
                aVar.f2385a = true;
                aVar.f2387c = e1.d();
                aVar.f2386b = true;
                aVar.f2388d = !g1.a.a(context).f18383a;
                aVar.f2389e = true;
                aVar.f2390f = e1.b.f2391a;
                e1 a10 = aVar.a(context);
                this.f2513d = a10;
                if (a10.f2381e) {
                    this.f2514e = new c0(a10);
                }
            }
            bVar.f2518b.f2316e = this.f2514e;
            if (this.f2513d.f2377a == 2 && Build.VERSION.SDK_INT >= 21) {
                verticalGridView.setLayoutMode(1);
            }
            if (this.f2513d.f2377a != 3) {
                z10 = true;
            }
            verticalGridView.setFocusDrawingOrderEnabled(z10);
            bVar.f2518b.f2318g = new n.a(2, true);
            verticalGridView.setOnChildSelectedListener(new q1(this, bVar));
            if (bVar.f2520d) {
                return bVar;
            }
            throw new RuntimeException("super.initializeGridViewHolder() must be called");
        }
        throw new IllegalStateException("Number of columns must be set");
    }
}
