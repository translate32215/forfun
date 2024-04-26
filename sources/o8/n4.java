package o8;

import com.google.android.gms.measurement.internal.l;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class n4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23366a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f23367b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s4 f23368c;

    public n4(s4 s4Var, AtomicReference atomicReference, int i10) {
        this.f23366a = i10;
        if (i10 != 1) {
            this.f23368c = s4Var;
            this.f23367b = atomicReference;
            return;
        }
        this.f23368c = s4Var;
        this.f23367b = atomicReference;
    }

    public final void run() {
        switch (this.f23366a) {
            case 0:
                synchronized (this.f23367b) {
                    try {
                        AtomicReference atomicReference = this.f23367b;
                        l lVar = this.f23368c.f8864a;
                        atomicReference.set(Boolean.valueOf(lVar.f8843g.v(lVar.q().m(), v2.K)));
                        this.f23367b.notify();
                    } catch (Throwable th) {
                        this.f23367b.notify();
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.f23367b) {
                    try {
                        AtomicReference atomicReference2 = this.f23367b;
                        l lVar2 = this.f23368c.f8864a;
                        atomicReference2.set(Integer.valueOf(lVar2.f8843g.o(lVar2.q().m(), v2.N)));
                        this.f23367b.notify();
                    } catch (Throwable th2) {
                        this.f23367b.notify();
                        throw th2;
                    }
                }
                return;
        }
    }
}
