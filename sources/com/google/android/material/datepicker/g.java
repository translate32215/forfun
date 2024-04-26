package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MaterialCalendar */
public final class g<S> extends y<S> {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f9165y0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public int f9166o0;

    /* renamed from: p0  reason: collision with root package name */
    public d<S> f9167p0;

    /* renamed from: q0  reason: collision with root package name */
    public a f9168q0;

    /* renamed from: r0  reason: collision with root package name */
    public t f9169r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f9170s0;

    /* renamed from: t0  reason: collision with root package name */
    public c f9171t0;

    /* renamed from: u0  reason: collision with root package name */
    public RecyclerView f9172u0;

    /* renamed from: v0  reason: collision with root package name */
    public RecyclerView f9173v0;

    /* renamed from: w0  reason: collision with root package name */
    public View f9174w0;

    /* renamed from: x0  reason: collision with root package name */
    public View f9175x0;

    /* compiled from: MaterialCalendar */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9176a;

        public a(int i10) {
            this.f9176a = i10;
        }

        public void run() {
            g.this.f9173v0.k0(this.f9176a);
        }
    }

    /* compiled from: MaterialCalendar */
    public class b extends o0.a {
        public b(g gVar) {
        }

        public void d(View view, p0.c cVar) {
            this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            cVar.m((Object) null);
        }
    }

    /* compiled from: MaterialCalendar */
    public class c extends z {
        public final /* synthetic */ int E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.E = i11;
        }

        public void Y0(RecyclerView.x xVar, int[] iArr) {
            if (this.E == 0) {
                iArr[0] = g.this.f9173v0.getWidth();
                iArr[1] = g.this.f9173v0.getWidth();
                return;
            }
            iArr[0] = g.this.f9173v0.getHeight();
            iArr[1] = g.this.f9173v0.getHeight();
        }
    }

    /* compiled from: MaterialCalendar */
    public class d implements e {
        public d() {
        }
    }

    /* compiled from: MaterialCalendar */
    public interface e {
    }

    public void O(Bundle bundle) {
        super.O(bundle);
        if (bundle == null) {
            bundle = this.f1796g;
        }
        this.f9166o0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f9167p0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f9168q0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9169r0 = (t) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0185, code lost:
        r13 = new androidx.recyclerview.widget.s();
        r0 = r10.f9173v0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View P(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.q()
            int r1 = r10.f9166o0
            r13.<init>(r0, r1)
            com.google.android.material.datepicker.c r0 = new com.google.android.material.datepicker.c
            r0.<init>(r13)
            r10.f9171t0 = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            com.google.android.material.datepicker.a r0 = r10.f9168q0
            com.google.android.material.datepicker.t r0 = r0.f9126a
            boolean r1 = com.google.android.material.datepicker.o.z0(r13)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0027
            r1 = 2131624110(0x7f0e00ae, float:1.887539E38)
            r9 = 1
            goto L_0x002b
        L_0x0027:
            r1 = 2131624105(0x7f0e00a9, float:1.887538E38)
            r9 = 0
        L_0x002b:
            android.view.View r11 = r11.inflate(r1, r12, r2)
            android.content.Context r12 = r10.h0()
            android.content.res.Resources r12 = r12.getResources()
            r1 = 2131165889(0x7f0702c1, float:1.7946008E38)
            int r1 = r12.getDimensionPixelSize(r1)
            r4 = 2131165890(0x7f0702c2, float:1.794601E38)
            int r4 = r12.getDimensionPixelOffset(r4)
            int r4 = r4 + r1
            r1 = 2131165888(0x7f0702c0, float:1.7946006E38)
            int r1 = r12.getDimensionPixelOffset(r1)
            int r1 = r1 + r4
            r4 = 2131165873(0x7f0702b1, float:1.7945975E38)
            int r4 = r12.getDimensionPixelSize(r4)
            int r5 = com.google.android.material.datepicker.u.f9209f
            r6 = 2131165868(0x7f0702ac, float:1.7945965E38)
            int r6 = r12.getDimensionPixelSize(r6)
            int r6 = r6 * r5
            int r5 = r5 + -1
            r7 = 2131165887(0x7f0702bf, float:1.7946004E38)
            int r7 = r12.getDimensionPixelOffset(r7)
            int r7 = r7 * r5
            int r7 = r7 + r6
            r5 = 2131165865(0x7f0702a9, float:1.794596E38)
            int r12 = r12.getDimensionPixelOffset(r5)
            int r1 = r1 + r4
            int r1 = r1 + r7
            int r1 = r1 + r12
            r11.setMinimumHeight(r1)
            r12 = 2131427856(0x7f0b0210, float:1.847734E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            com.google.android.material.datepicker.g$b r1 = new com.google.android.material.datepicker.g$b
            r1.<init>(r10)
            o0.c0.C(r12, r1)
            com.google.android.material.datepicker.f r1 = new com.google.android.material.datepicker.f
            r1.<init>()
            r12.setAdapter(r1)
            int r0 = r0.f9205d
            r12.setNumColumns(r0)
            r12.setEnabled(r2)
            r12 = 2131427859(0x7f0b0213, float:1.8477346E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.f9173v0 = r12
            com.google.android.material.datepicker.g$c r12 = new com.google.android.material.datepicker.g$c
            android.content.Context r6 = r10.q()
            r8 = 0
            r4 = r12
            r5 = r10
            r7 = r9
            r4.<init>(r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9173v0
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f9173v0
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r0)
            com.google.android.material.datepicker.w r12 = new com.google.android.material.datepicker.w
            com.google.android.material.datepicker.d<S> r0 = r10.f9167p0
            com.google.android.material.datepicker.a r1 = r10.f9168q0
            com.google.android.material.datepicker.g$d r4 = new com.google.android.material.datepicker.g$d
            r4.<init>()
            r12.<init>(r13, r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9173v0
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131492945(0x7f0c0051, float:1.8609356E38)
            int r0 = r0.getInteger(r1)
            r1 = 2131427862(0x7f0b0216, float:1.8477352E38)
            android.view.View r4 = r11.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r10.f9172u0 = r4
            if (r4 == 0) goto L_0x010a
            r4.setHasFixedSize(r3)
            androidx.recyclerview.widget.RecyclerView r4 = r10.f9172u0
            androidx.recyclerview.widget.GridLayoutManager r5 = new androidx.recyclerview.widget.GridLayoutManager
            r5.<init>((android.content.Context) r13, (int) r0, (int) r3, (boolean) r2)
            r4.setLayoutManager(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9172u0
            com.google.android.material.datepicker.d0 r2 = new com.google.android.material.datepicker.d0
            r2.<init>(r10)
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9172u0
            com.google.android.material.datepicker.h r2 = new com.google.android.material.datepicker.h
            r2.<init>(r10)
            r0.g(r2)
        L_0x010a:
            r0 = 2131427847(0x7f0b0207, float:1.8477322E38)
            android.view.View r2 = r11.findViewById(r0)
            if (r2 == 0) goto L_0x017f
            android.view.View r0 = r11.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r2 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r2)
            com.google.android.material.datepicker.i r2 = new com.google.android.material.datepicker.i
            r2.<init>(r10)
            o0.c0.C(r0, r2)
            r2 = 2131427849(0x7f0b0209, float:1.8477326E38)
            android.view.View r2 = r11.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            java.lang.String r4 = "NAVIGATION_PREV_TAG"
            r2.setTag(r4)
            r4 = 2131427848(0x7f0b0208, float:1.8477324E38)
            android.view.View r4 = r11.findViewById(r4)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            java.lang.String r5 = "NAVIGATION_NEXT_TAG"
            r4.setTag(r5)
            android.view.View r1 = r11.findViewById(r1)
            r10.f9174w0 = r1
            r1 = 2131427855(0x7f0b020f, float:1.8477338E38)
            android.view.View r1 = r11.findViewById(r1)
            r10.f9175x0 = r1
            r10.v0(r3)
            com.google.android.material.datepicker.t r1 = r10.f9169r0
            java.lang.String r1 = r1.q()
            r0.setText(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f9173v0
            com.google.android.material.datepicker.j r3 = new com.google.android.material.datepicker.j
            r3.<init>(r10, r12, r0)
            r1.h(r3)
            com.google.android.material.datepicker.k r1 = new com.google.android.material.datepicker.k
            r1.<init>(r10)
            r0.setOnClickListener(r1)
            com.google.android.material.datepicker.l r0 = new com.google.android.material.datepicker.l
            r0.<init>(r10, r12)
            r4.setOnClickListener(r0)
            com.google.android.material.datepicker.m r0 = new com.google.android.material.datepicker.m
            r0.<init>(r10, r12)
            r2.setOnClickListener(r0)
        L_0x017f:
            boolean r13 = com.google.android.material.datepicker.o.z0(r13)
            if (r13 != 0) goto L_0x01d0
            androidx.recyclerview.widget.s r13 = new androidx.recyclerview.widget.s
            r13.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r10.f9173v0
            androidx.recyclerview.widget.RecyclerView r1 = r13.f3145a
            if (r1 != r0) goto L_0x0191
            goto L_0x01d0
        L_0x0191:
            if (r1 == 0) goto L_0x019e
            androidx.recyclerview.widget.RecyclerView$q r2 = r13.f3146b
            r1.b0(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r13.f3145a
            r2 = 0
            r1.setOnFlingListener(r2)
        L_0x019e:
            r13.f3145a = r0
            if (r0 == 0) goto L_0x01d0
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x01c8
            androidx.recyclerview.widget.RecyclerView r0 = r13.f3145a
            androidx.recyclerview.widget.RecyclerView$q r1 = r13.f3146b
            r0.h(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f3145a
            r0.setOnFlingListener(r13)
            android.widget.Scroller r0 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r13.f3145a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r13.b()
            goto L_0x01d0
        L_0x01c8:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "An instance of OnFlingListener already set."
            r11.<init>(r12)
            throw r11
        L_0x01d0:
            androidx.recyclerview.widget.RecyclerView r13 = r10.f9173v0
            com.google.android.material.datepicker.t r0 = r10.f9169r0
            int r12 = r12.m(r0)
            r13.g0(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.P(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void a0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f9166o0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f9167p0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9168q0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9169r0);
    }

    public boolean r0(x<S> xVar) {
        return this.f9223n0.add(xVar);
    }

    public LinearLayoutManager s0() {
        return (LinearLayoutManager) this.f9173v0.getLayoutManager();
    }

    public final void t0(int i10) {
        this.f9173v0.post(new a(i10));
    }

    public void u0(t tVar) {
        w wVar = (w) this.f9173v0.getAdapter();
        int s10 = wVar.f9217d.f9126a.s(tVar);
        int m10 = s10 - wVar.m(this.f9169r0);
        boolean z10 = true;
        boolean z11 = Math.abs(m10) > 3;
        if (m10 <= 0) {
            z10 = false;
        }
        this.f9169r0 = tVar;
        if (z11 && z10) {
            this.f9173v0.g0(s10 - 3);
            t0(s10);
        } else if (z11) {
            this.f9173v0.g0(s10 + 3);
            t0(s10);
        } else {
            t0(s10);
        }
    }

    public void v0(int i10) {
        this.f9170s0 = i10;
        if (i10 == 2) {
            this.f9172u0.getLayoutManager().L0(((d0) this.f9172u0.getAdapter()).l(this.f9169r0.f9204c));
            this.f9174w0.setVisibility(0);
            this.f9175x0.setVisibility(8);
        } else if (i10 == 1) {
            this.f9174w0.setVisibility(8);
            this.f9175x0.setVisibility(0);
            u0(this.f9169r0);
        }
    }
}
