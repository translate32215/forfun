package o8;

import com.google.android.gms.measurement.internal.l;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class o4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f23376b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s4 f23377c;

    public o4(s4 s4Var, AtomicReference atomicReference, int i10) {
        this.f23375a = i10;
        if (i10 != 1) {
            this.f23377c = s4Var;
            this.f23376b = atomicReference;
            return;
        }
        this.f23377c = s4Var;
        this.f23376b = atomicReference;
    }

    public final void run() {
        String str;
        switch (this.f23375a) {
            case 0:
                synchronized (this.f23376b) {
                    try {
                        AtomicReference atomicReference = this.f23376b;
                        l lVar = this.f23377c.f8864a;
                        f fVar = lVar.f8843g;
                        String m10 = lVar.q().m();
                        u2<String> u2Var = v2.L;
                        fVar.getClass();
                        if (m10 == null) {
                            str = u2Var.a(null);
                        } else {
                            str = u2Var.a(fVar.f23191c.a(m10, u2Var.f23456a));
                        }
                        atomicReference.set(str);
                        this.f23376b.notify();
                    } catch (Throwable th) {
                        this.f23376b.notify();
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.f23376b) {
                    try {
                        AtomicReference atomicReference2 = this.f23376b;
                        l lVar2 = this.f23377c.f8864a;
                        atomicReference2.set(Double.valueOf(lVar2.f8843g.k(lVar2.q().m(), v2.O)));
                        this.f23376b.notify();
                    } catch (Throwable th2) {
                        this.f23376b.notify();
                        throw th2;
                    }
                }
                return;
        }
    }
}
