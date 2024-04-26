package k0;

/* compiled from: CancellationSignal */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19865a;

    /* renamed from: b  reason: collision with root package name */
    public a f19866b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f19867c;

    /* compiled from: CancellationSignal */
    public interface a {
        void a();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:22:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(k0.d.a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.f19867c     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            k0.d$a r0 = r1.f19866b     // Catch:{ all -> 0x001c }
            if (r0 != r2) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            return
        L_0x000f:
            r1.f19866b = r2     // Catch:{ all -> 0x001c }
            boolean r0 = r1.f19865a     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            r2.a()
            return
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            goto L_0x0020
        L_0x001f:
            throw r2
        L_0x0020:
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.d.a(k0.d$a):void");
    }
}
