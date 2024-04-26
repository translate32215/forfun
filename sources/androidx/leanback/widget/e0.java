package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.b0;
import androidx.leanback.widget.e;
import androidx.leanback.widget.e1;
import androidx.leanback.widget.n;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.x0;
import androidx.leanback.widget.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: ListRowPresenter */
public class e0 extends y0 {

    /* renamed from: m  reason: collision with root package name */
    public static int f2352m;

    /* renamed from: n  reason: collision with root package name */
    public static int f2353n;

    /* renamed from: o  reason: collision with root package name */
    public static int f2354o;

    /* renamed from: d  reason: collision with root package name */
    public int f2355d = 1;

    /* renamed from: e  reason: collision with root package name */
    public int f2356e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2357f = true;

    /* renamed from: g  reason: collision with root package name */
    public int f2358g = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2359h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2360i = true;

    /* renamed from: j  reason: collision with root package name */
    public HashMap<r0, Integer> f2361j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public e1 f2362k;

    /* renamed from: l  reason: collision with root package name */
    public b0.e f2363l;

    /* compiled from: ListRowPresenter */
    public class a implements j0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f2364a;

        public a(d dVar) {
            this.f2364a = dVar;
        }

        public void a(ViewGroup viewGroup, View view, int i10, long j10) {
            e0.this.v(this.f2364a, view, true);
        }
    }

    /* compiled from: ListRowPresenter */
    public class b implements e.C0029e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f2366a;

        public b(e0 e0Var, d dVar) {
            this.f2366a = dVar;
        }
    }

    /* compiled from: ListRowPresenter */
    public class c extends b0 {

        /* renamed from: k  reason: collision with root package name */
        public d f2367k;

        /* compiled from: ListRowPresenter */
        public class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b0.d f2369a;

            public a(b0.d dVar) {
                this.f2369a = dVar;
            }

            public void onClick(View view) {
                b0.d dVar = (b0.d) c.this.f2367k.f2371n.K(this.f2369a.f2842a);
                d dVar2 = c.this.f2367k;
                f fVar = dVar2.f2580m;
                if (fVar != null) {
                    fVar.a(this.f2369a.f2326v, dVar.f2328x, dVar2, (d0) dVar2.f2571d);
                }
            }
        }

        public c(d dVar) {
            this.f2367k = dVar;
        }

        public void l(r0 r0Var, int i10) {
            RecyclerView.r recycledViewPool = this.f2367k.f2371n.getRecycledViewPool();
            e0 e0Var = e0.this;
            int intValue = e0Var.f2361j.containsKey(r0Var) ? e0Var.f2361j.get(r0Var).intValue() : 24;
            RecyclerView.r.a a10 = recycledViewPool.a(i10);
            a10.f2903b = intValue;
            ArrayList<RecyclerView.a0> arrayList = a10.f2902a;
            while (arrayList.size() > intValue) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public void m(b0.d dVar) {
            e0.this.u(this.f2367k, dVar.f2842a);
            d dVar2 = this.f2367k;
            View view = dVar.f2842a;
            int i10 = dVar2.f2573f;
            if (i10 == 1) {
                view.setActivated(true);
            } else if (i10 == 2) {
                view.setActivated(false);
            }
        }

        public void n(b0.d dVar) {
            if (this.f2367k.f2580m != null) {
                dVar.f2326v.f2509a.setOnClickListener(new a(dVar));
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
            e1 e1Var = e0.this.f2362k;
            if (e1Var != null) {
                e1Var.a(dVar.f2842a);
            }
        }

        public void p(b0.d dVar) {
            if (this.f2367k.f2580m != null) {
                dVar.f2326v.f2509a.setOnClickListener((View.OnClickListener) null);
            }
        }
    }

    /* compiled from: ListRowPresenter */
    public static class d extends y0.b {

        /* renamed from: n  reason: collision with root package name */
        public final HorizontalGridView f2371n;

        /* renamed from: o  reason: collision with root package name */
        public b0 f2372o;

        /* renamed from: p  reason: collision with root package name */
        public final int f2373p;

        /* renamed from: q  reason: collision with root package name */
        public final int f2374q;

        /* renamed from: r  reason: collision with root package name */
        public final int f2375r;

        /* renamed from: s  reason: collision with root package name */
        public final int f2376s;

        public d(View view, HorizontalGridView horizontalGridView, e0 e0Var) {
            super(view);
            new u();
            this.f2371n = horizontalGridView;
            this.f2373p = horizontalGridView.getPaddingTop();
            this.f2374q = horizontalGridView.getPaddingBottom();
            this.f2375r = horizontalGridView.getPaddingLeft();
            this.f2376s = horizontalGridView.getPaddingRight();
        }
    }

    public e0() {
        boolean z10 = true;
        if (n.a(2) <= 0 ? false : z10) {
            this.f2356e = 2;
            return;
        }
        throw new IllegalArgumentException("Unhandled zoom factor");
    }

    public y0.b h(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (f2352m == 0) {
            f2352m = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_selected_row_top_padding);
            f2353n = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_selected_row_top_padding);
            f2354o = context.getResources().getDimensionPixelSize(R.dimen.lb_browse_expanded_row_no_hovercard_bottom_padding);
        }
        f0 f0Var = new f0(viewGroup.getContext());
        HorizontalGridView gridView = f0Var.getGridView();
        if (this.f2358g < 0) {
            TypedArray obtainStyledAttributes = gridView.getContext().obtainStyledAttributes(e1.a.f13528b);
            this.f2358g = (int) obtainStyledAttributes.getDimension(5, 0.0f);
            obtainStyledAttributes.recycle();
        }
        gridView.setFadingLeftEdgeLength(this.f2358g);
        return new d(f0Var, f0Var.getGridView(), this);
    }

    public void i(y0.b bVar, boolean z10) {
        g gVar;
        g gVar2;
        d dVar = (d) bVar;
        HorizontalGridView horizontalGridView = dVar.f2371n;
        b0.d dVar2 = (b0.d) horizontalGridView.H(horizontalGridView.getSelectedPosition(), false);
        if (dVar2 == null) {
            if (z10 && (gVar2 = bVar.f2579l) != null) {
                gVar2.a((r0.a) null, (Object) null, bVar, bVar.f2572e);
            }
        } else if (z10 && (gVar = bVar.f2579l) != null) {
            gVar.a(dVar2.f2326v, dVar2.f2328x, dVar, dVar.f2571d);
        }
    }

    public void j(y0.b bVar, boolean z10) {
        d dVar = (d) bVar;
        dVar.f2371n.setScrollEnabled(!z10);
        dVar.f2371n.setAnimateChildLayout(!z10);
    }

    public void l(y0.b bVar) {
        super.l(bVar);
        d dVar = (d) bVar;
        Context context = bVar.f2509a.getContext();
        boolean z10 = true;
        if (this.f2362k == null) {
            e1.a aVar = new e1.a();
            aVar.f2385a = this.f2566b;
            aVar.f2387c = e1.d() && this.f2357f;
            aVar.f2386b = (g1.a.a(context).f18384b ^ true) && this.f2359h;
            aVar.f2388d = !g1.a.a(context).f18383a;
            aVar.f2389e = this.f2360i;
            aVar.f2390f = e1.b.f2391a;
            e1 a10 = aVar.a(context);
            this.f2362k = a10;
            if (a10.f2381e) {
                this.f2363l = new c0(a10);
            }
        }
        c cVar = new c(dVar);
        dVar.f2372o = cVar;
        cVar.f2316e = this.f2363l;
        e1 e1Var = this.f2362k;
        HorizontalGridView horizontalGridView = dVar.f2371n;
        if (e1Var.f2377a == 2 && Build.VERSION.SDK_INT >= 21) {
            horizontalGridView.setLayoutMode(1);
        }
        dVar.f2372o.f2318g = new n.a(this.f2356e, false);
        HorizontalGridView horizontalGridView2 = dVar.f2371n;
        if (this.f2362k.f2377a == 3) {
            z10 = false;
        }
        horizontalGridView2.setFocusDrawingOrderEnabled(z10);
        dVar.f2371n.setOnChildSelectedListener(new a(dVar));
        dVar.f2371n.setOnUnhandledKeyListener(new b(this, dVar));
        dVar.f2371n.setNumRows(this.f2355d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(androidx.leanback.widget.y0.b r3, java.lang.Object r4) {
        /*
            r2 = this;
            super.m(r3, r4)
            androidx.leanback.widget.e0$d r3 = (androidx.leanback.widget.e0.d) r3
            androidx.leanback.widget.d0 r4 = (androidx.leanback.widget.d0) r4
            androidx.leanback.widget.b0 r0 = r3.f2372o
            androidx.leanback.widget.h0 r1 = r4.f2337b
            r0.q(r1)
            androidx.leanback.widget.HorizontalGridView r0 = r3.f2371n
            androidx.leanback.widget.b0 r1 = r3.f2372o
            r0.setAdapter(r1)
            androidx.leanback.widget.HorizontalGridView r3 = r3.f2371n
            androidx.leanback.widget.t r4 = r4.f2549a
            if (r4 == 0) goto L_0x0028
            java.lang.Object r0 = r4.f2528e
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0022
            goto L_0x0029
        L_0x0022:
            java.lang.Object r4 = r4.f2526c
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r3.setContentDescription(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.e0.m(androidx.leanback.widget.y0$b, java.lang.Object):void");
    }

    public void n(y0.b bVar, boolean z10) {
        t(bVar);
        s(bVar, bVar.f2509a);
        d dVar = (d) bVar;
        w(dVar);
        x(dVar);
    }

    public void o(y0.b bVar, boolean z10) {
        i(bVar, z10);
        t(bVar);
        s(bVar, bVar.f2509a);
        d dVar = (d) bVar;
        w(dVar);
        x(dVar);
    }

    public void p(y0.b bVar) {
        super.p(bVar);
        d dVar = (d) bVar;
        int childCount = dVar.f2371n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            u(dVar, dVar.f2371n.getChildAt(i10));
        }
    }

    public void q(y0.b bVar) {
        d dVar = (d) bVar;
        dVar.f2371n.setAdapter((RecyclerView.e) null);
        dVar.f2372o.q((h0) null);
        x0.a aVar = bVar.f2570c;
        if (aVar != null) {
            this.f2565a.e(aVar);
        }
        bVar.f2571d = null;
        bVar.f2572e = null;
    }

    public void r(y0.b bVar, boolean z10) {
        super.r(bVar, z10);
        ((d) bVar).f2371n.setChildrenVisibility(z10 ? 0 : 4);
    }

    public void u(d dVar, View view) {
        e1 e1Var = this.f2362k;
        if (e1Var != null && e1Var.f2378b) {
            int color = dVar.f2578k.f18076c.getColor();
            if (this.f2362k.f2381e) {
                ((d1) view).setOverlayColor(color);
            } else {
                e1.b(view, color);
            }
        }
    }

    public void v(d dVar, View view, boolean z10) {
        g gVar;
        g gVar2;
        if (view != null) {
            if (dVar.f2574g) {
                b0.d dVar2 = (b0.d) dVar.f2371n.K(view);
                if (z10 && (gVar2 = dVar.f2579l) != null) {
                    gVar2.a(dVar2.f2326v, dVar2.f2328x, dVar, dVar.f2571d);
                }
            }
        } else if (z10 && (gVar = dVar.f2579l) != null) {
            gVar.a((r0.a) null, (Object) null, dVar, dVar.f2571d);
        }
    }

    public final void w(d dVar) {
        int i10;
        int i11 = 0;
        if (dVar.f2575h) {
            x0.a aVar = dVar.f2570c;
            if (aVar != null) {
                x0 x0Var = this.f2565a;
                if (x0Var != null) {
                    int paddingBottom = aVar.f2509a.getPaddingBottom();
                    View view = aVar.f2509a;
                    if (view instanceof TextView) {
                        TextView textView = (TextView) view;
                        Paint paint = x0Var.f2554b;
                        if (paint.getTextSize() != textView.getTextSize()) {
                            paint.setTextSize(textView.getTextSize());
                        }
                        if (paint.getTypeface() != textView.getTypeface()) {
                            paint.setTypeface(textView.getTypeface());
                        }
                        paddingBottom += (int) paint.descent();
                    }
                    i11 = paddingBottom;
                } else {
                    i11 = aVar.f2509a.getPaddingBottom();
                }
            }
            i11 = (dVar.f2574g ? f2353n : dVar.f2373p) - i11;
            i10 = f2354o;
        } else if (dVar.f2574g) {
            i10 = f2352m;
            i11 = i10 - dVar.f2374q;
        } else {
            i10 = dVar.f2374q;
        }
        dVar.f2371n.setPadding(dVar.f2375r, i11, dVar.f2376s, i10);
    }

    public final void x(d dVar) {
        View view;
        if (dVar.f2575h && dVar.f2574g) {
            HorizontalGridView horizontalGridView = dVar.f2371n;
            b0.d dVar2 = (b0.d) horizontalGridView.H(horizontalGridView.getSelectedPosition(), false);
            if (dVar2 == null) {
                view = null;
            } else {
                view = dVar2.f2842a;
            }
            v(dVar, view, false);
        }
    }
}
