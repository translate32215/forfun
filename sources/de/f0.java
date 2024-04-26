package de;

import e.j;
import je.h;
import md.d;
import o.a;
import ud.k;

/* compiled from: DispatchedTask.kt */
public abstract class f0<T> extends h {

    /* renamed from: c  reason: collision with root package name */
    public int f13280c;

    public f0(int i10) {
        this.f13280c = i10;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract d<T> b();

    public Throwable c(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar == null) {
            return null;
        }
        return nVar.f13313a;
    }

    public <T> T d(Object obj) {
        return obj;
    }

    public final void e(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                j.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            k.c(th);
            a.g(b().getContext(), new z("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object h();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r4.W() != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r4.W() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            je.i r0 = r10.f19775b
            md.d r1 = r10.b()     // Catch:{ all -> 0x0095 }
            ie.d r1 = (ie.d) r1     // Catch:{ all -> 0x0095 }
            md.d<T> r2 = r1.f19368e     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = r1.f19370g     // Catch:{ all -> 0x0095 }
            md.f r3 = r2.getContext()     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = ie.t.c(r3, r1)     // Catch:{ all -> 0x0095 }
            b2.t r4 = ie.t.f19398a     // Catch:{ all -> 0x0095 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            de.o1 r4 = de.s.c(r2, r3, r1)     // Catch:{ all -> 0x0095 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            md.f r6 = r2.getContext()     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r10.h()     // Catch:{ all -> 0x0040 }
            java.lang.Throwable r8 = r10.c(r7)     // Catch:{ all -> 0x0040 }
            if (r8 != 0) goto L_0x0042
            int r9 = r10.f13280c     // Catch:{ all -> 0x0040 }
            boolean r9 = androidx.activity.j.a(r9)     // Catch:{ all -> 0x0040 }
            if (r9 == 0) goto L_0x0042
            int r9 = de.w0.f13338l     // Catch:{ all -> 0x0040 }
            de.w0$b r9 = de.w0.b.f13339a     // Catch:{ all -> 0x0040 }
            md.f$b r6 = r6.get(r9)     // Catch:{ all -> 0x0040 }
            de.w0 r6 = (de.w0) r6     // Catch:{ all -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r2 = move-exception
            goto L_0x0089
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x005a
            boolean r9 = r6.a()     // Catch:{ all -> 0x0040 }
            if (r9 != 0) goto L_0x005a
            java.util.concurrent.CancellationException r6 = r6.N()     // Catch:{ all -> 0x0040 }
            r10.a(r7, r6)     // Catch:{ all -> 0x0040 }
            java.lang.Object r6 = l0.e.a(r6)     // Catch:{ all -> 0x0040 }
            r2.g(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x006b
        L_0x005a:
            if (r8 == 0) goto L_0x0064
            java.lang.Object r6 = l0.e.a(r8)     // Catch:{ all -> 0x0040 }
            r2.g(r6)     // Catch:{ all -> 0x0040 }
            goto L_0x006b
        L_0x0064:
            java.lang.Object r6 = r10.d(r7)     // Catch:{ all -> 0x0040 }
            r2.g(r6)     // Catch:{ all -> 0x0040 }
        L_0x006b:
            kd.o r2 = kd.o.f20627a     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0075
            boolean r4 = r4.W()     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x0078
        L_0x0075:
            ie.t.a(r3, r1)     // Catch:{ all -> 0x0095 }
        L_0x0078:
            r0.a()     // Catch:{ all -> 0x007c }
            goto L_0x0081
        L_0x007c:
            r0 = move-exception
            java.lang.Object r2 = l0.e.a(r0)
        L_0x0081:
            java.lang.Throwable r0 = kd.h.a(r2)
            r10.e(r5, r0)
            goto L_0x00a8
        L_0x0089:
            if (r4 == 0) goto L_0x0091
            boolean r4 = r4.W()     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x0094
        L_0x0091:
            ie.t.a(r3, r1)     // Catch:{ all -> 0x0095 }
        L_0x0094:
            throw r2     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            r0.a()     // Catch:{ all -> 0x009c }
            kd.o r0 = kd.o.f20627a     // Catch:{ all -> 0x009c }
            goto L_0x00a1
        L_0x009c:
            r0 = move-exception
            java.lang.Object r0 = l0.e.a(r0)
        L_0x00a1:
            java.lang.Throwable r0 = kd.h.a(r0)
            r10.e(r1, r0)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.f0.run():void");
    }
}
