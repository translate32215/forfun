package androidx.leanback.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.a1;
import androidx.leanback.widget.b0;
import androidx.leanback.widget.h;
import androidx.leanback.widget.i;
import androidx.leanback.widget.j;
import androidx.leanback.widget.n;
import androidx.leanback.widget.s0;
import androidx.leanback.widget.v0;
import androidx.leanback.widget.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;

/* compiled from: HeadersSupportFragment */
public class l extends c {
    public static final s0 D0;
    public static View.OnLayoutChangeListener E0 = new b();
    public boolean A0;
    public final b0.b B0 = new a();
    public final b0.e C0 = new c(this);

    /* renamed from: v0  reason: collision with root package name */
    public f f2023v0;

    /* renamed from: w0  reason: collision with root package name */
    public e f2024w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f2025x0 = true;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f2026y0 = false;

    /* renamed from: z0  reason: collision with root package name */
    public int f2027z0;

    /* compiled from: HeadersSupportFragment */
    public class a extends b0.b {

        /* renamed from: androidx.leanback.app.l$a$a  reason: collision with other inner class name */
        /* compiled from: HeadersSupportFragment */
        public class C0026a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b0.d f2029a;

            public C0026a(b0.d dVar) {
                this.f2029a = dVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
                r0 = androidx.leanback.app.h.this;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r3) {
                /*
                    r2 = this;
                    androidx.leanback.app.l$a r3 = androidx.leanback.app.l.a.this
                    androidx.leanback.app.l r3 = androidx.leanback.app.l.this
                    androidx.leanback.app.l$e r3 = r3.f2024w0
                    if (r3 == 0) goto L_0x003d
                    androidx.leanback.widget.b0$d r0 = r2.f2029a
                    androidx.leanback.widget.r0$a r1 = r0.f2326v
                    androidx.leanback.widget.x0$a r1 = (androidx.leanback.widget.x0.a) r1
                    java.lang.Object r0 = r0.f2328x
                    androidx.leanback.widget.v0 r0 = (androidx.leanback.widget.v0) r0
                    androidx.leanback.app.h$a r3 = (androidx.leanback.app.h.a) r3
                    androidx.leanback.app.h r0 = androidx.leanback.app.h.this
                    boolean r1 = r0.f1960e1
                    if (r1 == 0) goto L_0x003d
                    boolean r1 = r0.f1959d1
                    if (r1 == 0) goto L_0x003d
                    boolean r0 = r0.B0()
                    if (r0 == 0) goto L_0x0025
                    goto L_0x003d
                L_0x0025:
                    androidx.leanback.app.h r0 = androidx.leanback.app.h.this
                    androidx.fragment.app.p r1 = r0.Q0
                    if (r1 == 0) goto L_0x003d
                    android.view.View r1 = r1.Q
                    if (r1 != 0) goto L_0x0030
                    goto L_0x003d
                L_0x0030:
                    r1 = 0
                    r0.L0(r1)
                    androidx.leanback.app.h r3 = androidx.leanback.app.h.this
                    androidx.fragment.app.p r3 = r3.Q0
                    android.view.View r3 = r3.Q
                    r3.requestFocus()
                L_0x003d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.app.l.a.C0026a.onClick(android.view.View):void");
            }
        }

        public a() {
        }

        public void d(b0.d dVar) {
            View view = dVar.f2326v.f2509a;
            view.setOnClickListener(new C0026a(dVar));
            if (l.this.C0 != null) {
                dVar.f2842a.addOnLayoutChangeListener(l.E0);
            } else {
                view.addOnLayoutChangeListener(l.E0);
            }
        }
    }

    /* compiled from: HeadersSupportFragment */
    public static class b implements View.OnLayoutChangeListener {
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.setPivotX(view.getLayoutDirection() == 1 ? (float) view.getWidth() : 0.0f);
            view.setPivotY((float) (view.getMeasuredHeight() / 2));
        }
    }

    /* compiled from: HeadersSupportFragment */
    public class c extends b0.e {
        public c(l lVar) {
        }

        public View a(View view) {
            return new d(view.getContext());
        }

        public void b(View view, View view2) {
            ((FrameLayout) view).addView(view2);
        }
    }

    /* compiled from: HeadersSupportFragment */
    public static class d extends FrameLayout {
        public d(Context context) {
            super(context);
        }

        public boolean hasOverlappingRendering() {
            return false;
        }
    }

    /* compiled from: HeadersSupportFragment */
    public interface e {
    }

    /* compiled from: HeadersSupportFragment */
    public interface f {
    }

    static {
        h hVar = new h();
        hVar.c(j.class, new i());
        hVar.c(a1.class, new x0(R.layout.lb_section_header, false));
        hVar.c(v0.class, new x0(R.layout.lb_header));
        D0 = hVar;
    }

    public l() {
        s0 s0Var = D0;
        if (this.f1925p0 != s0Var) {
            this.f1925p0 = s0Var;
            z0();
        }
        this.f1926q0.f2318g = new n.c(true);
    }

    public void A0() {
        VerticalGridView verticalGridView;
        VerticalGridView verticalGridView2 = this.f1924o0;
        if (verticalGridView2 != null) {
            verticalGridView2.setPruneChild(false);
            this.f1924o0.setLayoutFrozen(true);
            this.f1924o0.setFocusSearchDisabled(true);
        }
        if (!this.f2025x0 && (verticalGridView = this.f1924o0) != null) {
            verticalGridView.setDescendantFocusability(131072);
            if (verticalGridView.hasFocus()) {
                verticalGridView.requestFocus();
            }
        }
    }

    public final void B0(int i10) {
        Drawable background = this.Q.findViewById(R.id.fade_out_edge).getBackground();
        if (background instanceof GradientDrawable) {
            background.mutate();
            ((GradientDrawable) background).setColors(new int[]{0, i10});
        }
    }

    public final void C0() {
        VerticalGridView verticalGridView = this.f1924o0;
        if (verticalGridView != null) {
            this.Q.setVisibility(this.f2026y0 ? 8 : 0);
            if (this.f2026y0) {
                return;
            }
            if (this.f2025x0) {
                verticalGridView.setChildrenVisibility(0);
            } else {
                verticalGridView.setChildrenVisibility(4);
            }
        }
    }

    public void d0(View view, Bundle bundle) {
        super.d0(view, bundle);
        VerticalGridView verticalGridView = this.f1924o0;
        if (verticalGridView != null) {
            if (this.A0) {
                verticalGridView.setBackgroundColor(this.f2027z0);
                B0(this.f2027z0);
            } else {
                Drawable background = verticalGridView.getBackground();
                if (background instanceof ColorDrawable) {
                    B0(((ColorDrawable) background).getColor());
                }
            }
            C0();
        }
    }

    public VerticalGridView r0(View view) {
        return (VerticalGridView) view.findViewById(R.id.browse_headers);
    }

    public int s0() {
        return R.layout.lb_headers_fragment;
    }

    public void t0(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10, int i11) {
        f fVar = this.f2023v0;
        if (fVar == null) {
            return;
        }
        if (a0Var == null || i10 < 0) {
            h hVar = h.this;
            int i12 = hVar.R0.f1927r0;
            if (hVar.f1959d1) {
                hVar.D0(i12);
                return;
            }
            return;
        }
        b0.d dVar = (b0.d) a0Var;
        x0.a aVar = (x0.a) dVar.f2326v;
        v0 v0Var = (v0) dVar.f2328x;
        h hVar2 = h.this;
        int i13 = hVar2.R0.f1927r0;
        if (hVar2.f1959d1) {
            hVar2.D0(i13);
        }
    }

    public void u0() {
        VerticalGridView verticalGridView;
        if (this.f2025x0 && (verticalGridView = this.f1924o0) != null) {
            verticalGridView.setDescendantFocusability(262144);
            if (verticalGridView.hasFocus()) {
                verticalGridView.requestFocus();
            }
        }
        super.u0();
    }

    public void z0() {
        super.z0();
        b0 b0Var = this.f1926q0;
        b0Var.f2319h = this.B0;
        b0Var.f2316e = this.C0;
    }
}
