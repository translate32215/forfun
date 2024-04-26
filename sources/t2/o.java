package t2;

import com.adcolony.sdk.h;
import com.adcolony.sdk.j0;

public class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f25539a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f25540b;

    public o(h hVar, Runnable runnable) {
        this.f25540b = hVar;
        this.f25539a = runnable;
    }

    public void run() {
        while (!this.f25540b.f4515u) {
            j0.h(this.f25539a);
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
            }
        }
    }
}
