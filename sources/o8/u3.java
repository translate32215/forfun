package o8;

import com.google.android.gms.measurement.internal.k;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class u3 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f23462a;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<t3<?>> f23463b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23464c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f23465d;

    public u3(k kVar, String str, BlockingQueue<t3<?>> blockingQueue) {
        this.f23465d = kVar;
        if (blockingQueue != null) {
            this.f23462a = new Object();
            this.f23463b = blockingQueue;
            setName(str);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void a() {
        synchronized (this.f23465d.f8835i) {
            if (!this.f23464c) {
                this.f23465d.f8836j.release();
                this.f23465d.f8835i.notifyAll();
                k kVar = this.f23465d;
                if (this == kVar.f8829c) {
                    kVar.f8829c = null;
                } else if (this == kVar.f8830d) {
                    kVar.f8830d = null;
                } else {
                    kVar.f8864a.d().f8797f.a("Current scheduler thread is neither worker nor network");
                }
                this.f23464c = true;
            }
        }
    }

    public final void b(InterruptedException interruptedException) {
        this.f23465d.f8864a.d().f8800i.b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0012
            com.google.android.gms.measurement.internal.k r2 = r6.f23465d     // Catch:{ InterruptedException -> 0x000d }
            java.util.concurrent.Semaphore r2 = r2.f8836j     // Catch:{ InterruptedException -> 0x000d }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000d }
            r1 = 1
            goto L_0x0002
        L_0x000d:
            r2 = move-exception
            r6.b(r2)
            goto L_0x0002
        L_0x0012:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x007c }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x007c }
        L_0x001a:
            java.util.concurrent.BlockingQueue<o8.t3<?>> r2 = r6.f23463b     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x007c }
            o8.t3 r2 = (o8.t3) r2     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0033
            boolean r3 = r2.f23446b     // Catch:{ all -> 0x007c }
            if (r0 == r3) goto L_0x002b
            r3 = 10
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x007c }
            r2.run()     // Catch:{ all -> 0x007c }
            goto L_0x001a
        L_0x0033:
            java.lang.Object r2 = r6.f23462a     // Catch:{ all -> 0x007c }
            monitor-enter(r2)     // Catch:{ all -> 0x007c }
            java.util.concurrent.BlockingQueue<o8.t3<?>> r3 = r6.f23463b     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x004f
            com.google.android.gms.measurement.internal.k r3 = r6.f23465d     // Catch:{ all -> 0x0079 }
            r3.getClass()     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r6.f23462a     // Catch:{ InterruptedException -> 0x004b }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r3 = move-exception
            r6.b(r3)     // Catch:{ all -> 0x0079 }
        L_0x004f:
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            com.google.android.gms.measurement.internal.k r2 = r6.f23465d     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.f8835i     // Catch:{ all -> 0x007c }
            monitor-enter(r2)     // Catch:{ all -> 0x007c }
            java.util.concurrent.BlockingQueue<o8.t3<?>> r3 = r6.f23463b     // Catch:{ all -> 0x0076 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x0074
            com.google.android.gms.measurement.internal.k r0 = r6.f23465d     // Catch:{ all -> 0x0076 }
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a     // Catch:{ all -> 0x0076 }
            o8.f r0 = r0.f8843g     // Catch:{ all -> 0x0076 }
            o8.u2<java.lang.Boolean> r1 = o8.v2.f23520k0     // Catch:{ all -> 0x0076 }
            r3 = 0
            boolean r0 = r0.v(r3, r1)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006f
            r6.a()     // Catch:{ all -> 0x0076 }
        L_0x006f:
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            r6.a()
            return
        L_0x0074:
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            goto L_0x001a
        L_0x0076:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0079:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            r6.a()
            goto L_0x0082
        L_0x0081:
            throw r0
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u3.run():void");
    }
}
