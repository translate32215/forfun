package s8;

import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class n implements o {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f25039a = new CountDownLatch(1);

    public final void a(Object obj) {
        this.f25039a.countDown();
    }

    public final void b() {
        this.f25039a.countDown();
    }

    public final void d(Exception exc) {
        this.f25039a.countDown();
    }
}
