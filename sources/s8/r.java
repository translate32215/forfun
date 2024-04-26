package s8;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25052a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f25053b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f25054c;

    public r(q qVar, i iVar) {
        this.f25054c = qVar;
        this.f25053b = iVar;
    }

    public final void run() {
        switch (this.f25052a) {
            case 0:
                try {
                    i iVar = (i) ((q) this.f25054c).f25050c.e(this.f25053b);
                    if (iVar == null) {
                        ((q) this.f25054c).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    Executor executor = k.f25037b;
                    iVar.d(executor, (q) this.f25054c);
                    iVar.c(executor, (q) this.f25054c);
                    iVar.a(executor, (q) this.f25054c);
                    return;
                } catch (g e10) {
                    if (e10.getCause() instanceof Exception) {
                        ((q) this.f25054c).f25051d.o((Exception) e10.getCause());
                        return;
                    } else {
                        ((q) this.f25054c).f25051d.o(e10);
                        return;
                    }
                } catch (Exception e11) {
                    ((q) this.f25054c).f25051d.o(e11);
                    return;
                }
            default:
                synchronized (((v) this.f25054c).f25065b) {
                    f<? super TResult> fVar = ((v) this.f25054c).f25066c;
                    if (fVar != null) {
                        fVar.a(this.f25053b.h());
                    }
                }
                return;
        }
    }

    public r(v vVar, i iVar) {
        this.f25054c = vVar;
        this.f25053b = iVar;
    }
}
