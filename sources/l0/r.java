package l0;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: RequestExecutor */
public class r<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Callable<T> f21004a;

    /* renamed from: b  reason: collision with root package name */
    public n0.a<T> f21005b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f21006c;

    /* compiled from: RequestExecutor */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n0.a f21007a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f21008b;

        public a(r rVar, n0.a aVar, Object obj) {
            this.f21007a = aVar;
            this.f21008b = obj;
        }

        public void run() {
            this.f21007a.a(this.f21008b);
        }
    }

    public r(Handler handler, Callable<T> callable, n0.a<T> aVar) {
        this.f21004a = callable;
        this.f21005b = aVar;
        this.f21006c = handler;
    }

    public void run() {
        T t10;
        try {
            t10 = this.f21004a.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f21006c.post(new a(this, this.f21005b, t10));
    }
}
