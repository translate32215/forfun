package af;

import e8.s30;
import ze.e;
import ze.g;

/* compiled from: RenewSubscriber */
public class f extends s30 {

    /* renamed from: c  reason: collision with root package name */
    public e f281c;

    public f(e eVar) {
        this.f281c = eVar;
    }

    public void run() {
        e eVar = this.f281c;
        while (true) {
            if (Thread.currentThread() == ((Thread) this.f16370b)) {
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException unused) {
                }
                g e10 = eVar.e();
                int size = e10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    eVar.h(e10.c(i10), -1);
                }
            } else {
                return;
            }
        }
    }
}
