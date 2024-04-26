package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import o0.i0;
import o0.j0;
import o0.k0;

/* compiled from: ViewPropertyAnimatorCompatSet */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<i0> f19470a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f19471b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f19472c;

    /* renamed from: d  reason: collision with root package name */
    public j0 f19473d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19474e;

    /* renamed from: f  reason: collision with root package name */
    public final k0 f19475f = new a();

    /* compiled from: ViewPropertyAnimatorCompatSet */
    public class a extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f19476a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f19477b = 0;

        public a() {
        }

        public void b(View view) {
            int i10 = this.f19477b + 1;
            this.f19477b = i10;
            if (i10 == h.this.f19470a.size()) {
                j0 j0Var = h.this.f19473d;
                if (j0Var != null) {
                    j0Var.b((View) null);
                }
                this.f19477b = 0;
                this.f19476a = false;
                h.this.f19474e = false;
            }
        }

        public void c(View view) {
            if (!this.f19476a) {
                this.f19476a = true;
                j0 j0Var = h.this.f19473d;
                if (j0Var != null) {
                    j0Var.c((View) null);
                }
            }
        }
    }

    public void a() {
        if (this.f19474e) {
            Iterator<i0> it = this.f19470a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f19474e = false;
        }
    }

    public void b() {
        View view;
        if (!this.f19474e) {
            Iterator<i0> it = this.f19470a.iterator();
            while (it.hasNext()) {
                i0 next = it.next();
                long j10 = this.f19471b;
                if (j10 >= 0) {
                    next.c(j10);
                }
                Interpolator interpolator = this.f19472c;
                if (!(interpolator == null || (view = (View) next.f22585a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f19473d != null) {
                    next.d(this.f19475f);
                }
                View view2 = (View) next.f22585a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f19474e = true;
        }
    }
}
