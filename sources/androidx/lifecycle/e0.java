package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g0;
import androidx.lifecycle.o;

/* compiled from: ProcessLifecycleOwner */
public class e0 implements t {

    /* renamed from: i  reason: collision with root package name */
    public static final e0 f2637i = new e0();

    /* renamed from: a  reason: collision with root package name */
    public int f2638a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2639b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2640c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2641d = true;

    /* renamed from: e  reason: collision with root package name */
    public Handler f2642e;

    /* renamed from: f  reason: collision with root package name */
    public final u f2643f = new u(this);

    /* renamed from: g  reason: collision with root package name */
    public Runnable f2644g = new a();

    /* renamed from: h  reason: collision with root package name */
    public g0.a f2645h = new b();

    /* compiled from: ProcessLifecycleOwner */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            e0 e0Var = e0.this;
            if (e0Var.f2639b == 0) {
                e0Var.f2640c = true;
                e0Var.f2643f.f(o.b.ON_PAUSE);
            }
            e0 e0Var2 = e0.this;
            if (e0Var2.f2638a == 0 && e0Var2.f2640c) {
                e0Var2.f2643f.f(o.b.ON_STOP);
                e0Var2.f2641d = true;
            }
        }
    }

    /* compiled from: ProcessLifecycleOwner */
    public class b implements g0.a {
        public b() {
        }
    }

    public void a() {
        int i10 = this.f2639b + 1;
        this.f2639b = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f2640c) {
            this.f2643f.f(o.b.ON_RESUME);
            this.f2640c = false;
            return;
        }
        this.f2642e.removeCallbacks(this.f2644g);
    }

    public void b() {
        int i10 = this.f2638a + 1;
        this.f2638a = i10;
        if (i10 == 1 && this.f2641d) {
            this.f2643f.f(o.b.ON_START);
            this.f2641d = false;
        }
    }

    public o c() {
        return this.f2643f;
    }
}
