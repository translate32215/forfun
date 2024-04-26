package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.o;

/* compiled from: ServiceLifecycleDispatcher */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final u f2696a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2697b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public a f2698c;

    /* compiled from: ServiceLifecycleDispatcher */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final u f2699a;

        /* renamed from: b  reason: collision with root package name */
        public final o.b f2700b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2701c = false;

        public a(u uVar, o.b bVar) {
            this.f2699a = uVar;
            this.f2700b = bVar;
        }

        public void run() {
            if (!this.f2701c) {
                this.f2699a.f(this.f2700b);
                this.f2701c = true;
            }
        }
    }

    public o0(t tVar) {
        this.f2696a = new u(tVar);
    }

    public final void a(o.b bVar) {
        a aVar = this.f2698c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f2696a, bVar);
        this.f2698c = aVar2;
        this.f2697b.postAtFrontOfQueue(aVar2);
    }
}
