package androidx.leanback.widget;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.x0;

/* compiled from: RowPresenter */
public abstract class y0 extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public x0 f2565a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2566b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f2567c = 1;

    /* compiled from: RowPresenter */
    public static class a extends r0.a {

        /* renamed from: b  reason: collision with root package name */
        public final b f2568b;

        public a(w0 w0Var, b bVar) {
            super(w0Var);
            w0Var.addView(bVar.f2509a);
            x0.a aVar = bVar.f2570c;
            if (aVar != null) {
                View view = aVar.f2509a;
                if (w0Var.f2550a.indexOfChild(view) < 0) {
                    w0Var.f2550a.addView(view, 0);
                }
            }
            this.f2568b = bVar;
            bVar.f2569b = this;
        }
    }

    /* compiled from: RowPresenter */
    public static class b extends r0.a {

        /* renamed from: b  reason: collision with root package name */
        public a f2569b;

        /* renamed from: c  reason: collision with root package name */
        public x0.a f2570c;

        /* renamed from: d  reason: collision with root package name */
        public v0 f2571d;

        /* renamed from: e  reason: collision with root package name */
        public Object f2572e;

        /* renamed from: f  reason: collision with root package name */
        public int f2573f = 0;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2574g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2575h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2576i;

        /* renamed from: j  reason: collision with root package name */
        public float f2577j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public final f1.a f2578k;

        /* renamed from: l  reason: collision with root package name */
        public g f2579l;

        /* renamed from: m  reason: collision with root package name */
        public f f2580m;

        public b(View view) {
            super(view);
            this.f2578k = f1.a.a(view.getContext());
        }

        public final void b(boolean z10) {
            this.f2573f = z10 ? 1 : 2;
        }
    }

    public y0() {
        x0 x0Var = new x0();
        this.f2565a = x0Var;
        x0Var.f2555c = true;
    }

    public final void c(r0.a aVar, Object obj) {
        m(k(aVar), obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if ((((r4 instanceof androidx.leanback.widget.e0) ^ true) && r4.f2566b) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.leanback.widget.r0.a d(android.view.ViewGroup r5) {
        /*
            r4 = this;
            androidx.leanback.widget.y0$b r0 = r4.h(r5)
            r1 = 0
            r0.f2576i = r1
            androidx.leanback.widget.x0 r2 = r4.f2565a
            r3 = 1
            if (r2 != 0) goto L_0x001a
            boolean r2 = r4 instanceof androidx.leanback.widget.e0
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0017
            boolean r2 = r4.f2566b
            if (r2 == 0) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            if (r2 == 0) goto L_0x001b
        L_0x001a:
            r1 = 1
        L_0x001b:
            if (r1 == 0) goto L_0x003c
            androidx.leanback.widget.w0 r1 = new androidx.leanback.widget.w0
            android.content.Context r5 = r5.getContext()
            r1.<init>(r5)
            androidx.leanback.widget.x0 r5 = r4.f2565a
            if (r5 == 0) goto L_0x0036
            android.view.View r2 = r0.f2509a
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.leanback.widget.r0$a r5 = r5.d(r2)
            androidx.leanback.widget.x0$a r5 = (androidx.leanback.widget.x0.a) r5
            r0.f2570c = r5
        L_0x0036:
            androidx.leanback.widget.y0$a r5 = new androidx.leanback.widget.y0$a
            r5.<init>(r1, r0)
            goto L_0x003d
        L_0x003c:
            r5 = r0
        L_0x003d:
            r4.l(r0)
            boolean r0 = r0.f2576i
            if (r0 == 0) goto L_0x0045
            return r5
        L_0x0045:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "super.initializeRowViewHolder() must be called"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.y0.d(android.view.ViewGroup):androidx.leanback.widget.r0$a");
    }

    public final void e(r0.a aVar) {
        q(k(aVar));
    }

    public final void f(r0.a aVar) {
        if (k(aVar).f2570c != null) {
            this.f2565a.getClass();
        }
    }

    public final void g(r0.a aVar) {
        b k10 = k(aVar);
        x0.a aVar2 = k10.f2570c;
        if (aVar2 != null) {
            this.f2565a.getClass();
            r0.b(aVar2.f2509a);
        }
        r0.b(k10.f2509a);
    }

    public abstract b h(ViewGroup viewGroup);

    public void i(b bVar, boolean z10) {
        g gVar;
        if (z10 && (gVar = bVar.f2579l) != null) {
            gVar.a((r0.a) null, (Object) null, bVar, bVar.f2572e);
        }
    }

    public void j(b bVar, boolean z10) {
    }

    public final b k(r0.a aVar) {
        if (aVar instanceof a) {
            return ((a) aVar).f2568b;
        }
        return (b) aVar;
    }

    public void l(b bVar) {
        bVar.f2576i = true;
        View view = bVar.f2509a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        a aVar = bVar.f2569b;
        if (aVar != null) {
            ((ViewGroup) aVar.f2509a).setClipChildren(false);
        }
    }

    public void m(b bVar, Object obj) {
        bVar.f2572e = obj;
        v0 v0Var = obj instanceof v0 ? (v0) obj : null;
        bVar.f2571d = v0Var;
        x0.a aVar = bVar.f2570c;
        if (aVar != null && v0Var != null) {
            this.f2565a.c(aVar, obj);
        }
    }

    public void n(b bVar, boolean z10) {
        t(bVar);
        s(bVar, bVar.f2509a);
    }

    public void o(b bVar, boolean z10) {
        i(bVar, z10);
        t(bVar);
        s(bVar, bVar.f2509a);
    }

    public void p(b bVar) {
        if (this.f2566b) {
            bVar.f2578k.b(bVar.f2577j);
            x0.a aVar = bVar.f2570c;
            if (aVar != null) {
                this.f2565a.h(aVar, bVar.f2577j);
            }
            if (!(this instanceof e0)) {
                w0 w0Var = (w0) bVar.f2569b.f2509a;
                int color = bVar.f2578k.f18076c.getColor();
                Drawable drawable = w0Var.f2551b;
                if (drawable instanceof ColorDrawable) {
                    ((ColorDrawable) drawable.mutate()).setColor(color);
                    w0Var.invalidate();
                    return;
                }
                w0Var.setForeground(new ColorDrawable(color));
            }
        }
    }

    public void q(b bVar) {
        x0.a aVar = bVar.f2570c;
        if (aVar != null) {
            this.f2565a.e(aVar);
        }
        bVar.f2571d = null;
        bVar.f2572e = null;
    }

    public void r(b bVar, boolean z10) {
        x0.a aVar = bVar.f2570c;
        if (aVar != null && aVar.f2509a.getVisibility() != 8) {
            bVar.f2570c.f2509a.setVisibility(z10 ? 0 : 4);
        }
    }

    public final void s(b bVar, View view) {
        int i10 = this.f2567c;
        if (i10 == 1) {
            bVar.b(bVar.f2575h);
        } else if (i10 == 2) {
            bVar.b(bVar.f2574g);
        } else if (i10 == 3) {
            bVar.b(bVar.f2575h && bVar.f2574g);
        }
        int i11 = bVar.f2573f;
        if (i11 == 1) {
            view.setActivated(true);
        } else if (i11 == 2) {
            view.setActivated(false);
        }
    }

    public final void t(b bVar) {
        if (this.f2565a != null && bVar.f2570c != null) {
            ((w0) bVar.f2569b.f2509a).f2550a.setVisibility(bVar.f2575h ? 0 : 8);
        }
    }
}
