package s8;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class x<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f25067a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b  reason: collision with root package name */
    public Queue<w<TResult>> f25068b;
    @GuardedBy("mLock")

    /* renamed from: c  reason: collision with root package name */
    public boolean f25069c;

    public final void a(w<TResult> wVar) {
        synchronized (this.f25067a) {
            if (this.f25068b == null) {
                this.f25068b = new ArrayDeque();
            }
            this.f25068b.add(wVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f25067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f25068b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f25069c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.c(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(s8.i<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f25067a
            monitor-enter(r0)
            java.util.Queue<s8.w<TResult>> r1 = r2.f25068b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f25069c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f25069c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f25067a
            monitor-enter(r1)
            java.util.Queue<s8.w<TResult>> r0 = r2.f25068b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            s8.w r0 = (s8.w) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f25069c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.c(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002f:
            throw r3
        L_0x0030:
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.x.b(s8.i):void");
    }
}
