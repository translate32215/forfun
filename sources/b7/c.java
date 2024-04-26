package b7;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class c extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<a> f3651a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3652b;

    /* renamed from: c  reason: collision with root package name */
    public final CountDownLatch f3653c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    public boolean f3654d = false;

    public c(a aVar, long j10) {
        this.f3651a = new WeakReference<>(aVar);
        this.f3652b = j10;
        start();
    }

    public final void run() {
        a aVar;
        try {
            if (!this.f3653c.await(this.f3652b, TimeUnit.MILLISECONDS) && (aVar = (a) this.f3651a.get()) != null) {
                aVar.c();
                this.f3654d = true;
            }
        } catch (InterruptedException unused) {
            a aVar2 = (a) this.f3651a.get();
            if (aVar2 != null) {
                aVar2.c();
                this.f3654d = true;
            }
        }
    }
}
