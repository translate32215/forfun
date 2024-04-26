package s8;

import f7.j0;
import java.util.concurrent.Executor;
import r7.m;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class q<TResult, TContinuationResult> implements w<TResult>, f, e, c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25048a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f25049b;

    /* renamed from: c  reason: collision with root package name */
    public final a<TResult, TContinuationResult> f25050c;

    /* renamed from: d  reason: collision with root package name */
    public final z<TContinuationResult> f25051d;

    public q(Executor executor, a aVar, z zVar, int i10) {
        this.f25048a = i10;
        if (i10 != 1) {
            this.f25049b = executor;
            this.f25050c = aVar;
            this.f25051d = zVar;
            return;
        }
        this.f25049b = executor;
        this.f25050c = aVar;
        this.f25051d = zVar;
    }

    public void a(Object obj) {
        switch (this.f25048a) {
            case 1:
                this.f25051d.p(obj);
                return;
            default:
                this.f25051d.p(obj);
                return;
        }
    }

    public void b() {
        switch (this.f25048a) {
            case 1:
                this.f25051d.q();
                return;
            default:
                this.f25051d.q();
                return;
        }
    }

    public final void c(i iVar) {
        switch (this.f25048a) {
            case 0:
                this.f25049b.execute(new j0(this, iVar));
                return;
            case 1:
                this.f25049b.execute(new r(this, iVar));
                return;
            default:
                this.f25049b.execute(new m(this, iVar));
                return;
        }
    }

    public void d(Exception exc) {
        switch (this.f25048a) {
            case 1:
                this.f25051d.o(exc);
                return;
            default:
                this.f25051d.o(exc);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [s8.a<TResult, TContinuationResult>, s8.h] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(java.util.concurrent.Executor r2, s8.h r3, s8.z r4) {
        /*
            r1 = this;
            r0 = 2
            r1.f25048a = r0
            r1.<init>()
            r1.f25049b = r2
            r1.f25050c = r3
            r1.f25051d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.q.<init>(java.util.concurrent.Executor, s8.h, s8.z):void");
    }
}
