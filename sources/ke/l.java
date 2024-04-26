package ke;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import javax.annotation.Nullable;
import ke.y;

/* compiled from: Dispatcher */
public final class l {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f20763a;

    /* renamed from: b  reason: collision with root package name */
    public final Deque<y.b> f20764b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Deque<y.b> f20765c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public final Deque<y> f20766d = new ArrayDeque();

    public void a(y.b bVar) {
        Deque<y.b> deque = this.f20765c;
        synchronized (this) {
            if (!deque.remove(bVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean b() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.Deque<ke.y$b> r1 = r15.f20764b     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c1 }
            ke.y$b r2 = (ke.y.b) r2     // Catch:{ all -> 0x00c1 }
            java.util.Deque<ke.y$b> r3 = r15.f20765c     // Catch:{ all -> 0x00c1 }
            int r3 = r3.size()     // Catch:{ all -> 0x00c1 }
            r4 = 64
            if (r3 < r4) goto L_0x0023
            goto L_0x0037
        L_0x0023:
            int r3 = r15.c(r2)     // Catch:{ all -> 0x00c1 }
            r4 = 5
            if (r3 < r4) goto L_0x002b
            goto L_0x000c
        L_0x002b:
            r1.remove()     // Catch:{ all -> 0x00c1 }
            r0.add(r2)     // Catch:{ all -> 0x00c1 }
            java.util.Deque<ke.y$b> r3 = r15.f20765c     // Catch:{ all -> 0x00c1 }
            r3.add(r2)     // Catch:{ all -> 0x00c1 }
            goto L_0x000c
        L_0x0037:
            monitor-enter(r15)     // Catch:{ all -> 0x00c1 }
            java.util.Deque<ke.y$b> r1 = r15.f20765c     // Catch:{ all -> 0x00be }
            int r1 = r1.size()     // Catch:{ all -> 0x00be }
            java.util.Deque<ke.y> r2 = r15.f20766d     // Catch:{ all -> 0x00be }
            int r2 = r2.size()     // Catch:{ all -> 0x00be }
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch:{ all -> 0x00c1 }
            r2 = 0
            if (r1 <= 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            monitor-exit(r15)     // Catch:{ all -> 0x00c1 }
            int r3 = r0.size()
            r4 = 0
        L_0x0052:
            if (r4 >= r3) goto L_0x00bd
            java.lang.Object r5 = r0.get(r4)
            ke.y$b r5 = (ke.y.b) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.f20763a     // Catch:{ all -> 0x00ba }
            if (r6 != 0) goto L_0x007d
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00ba }
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ba }
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00ba }
            r13.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "OkHttp Dispatcher"
            byte[] r14 = le.c.f21261a     // Catch:{ all -> 0x00ba }
            le.d r14 = new le.d     // Catch:{ all -> 0x00ba }
            r14.<init>(r7, r2)     // Catch:{ all -> 0x00ba }
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch:{ all -> 0x00ba }
            r15.f20763a = r6     // Catch:{ all -> 0x00ba }
        L_0x007d:
            java.util.concurrent.ExecutorService r6 = r15.f20763a     // Catch:{ all -> 0x00ba }
            monitor-exit(r15)
            r5.getClass()
            r6.execute(r5)     // Catch:{ RejectedExecutionException -> 0x0089 }
            goto L_0x00ad
        L_0x0087:
            r0 = move-exception
            goto L_0x00b0
        L_0x0089:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0087 }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x0087 }
            r7.initCause(r6)     // Catch:{ all -> 0x0087 }
            ke.y r6 = ke.y.this     // Catch:{ all -> 0x0087 }
            ke.n r6 = r6.f20873d     // Catch:{ all -> 0x0087 }
            r6.getClass()     // Catch:{ all -> 0x0087 }
            ke.e r6 = r5.f20878b     // Catch:{ all -> 0x0087 }
            ke.y r8 = ke.y.this     // Catch:{ all -> 0x0087 }
            lf.t$a r6 = (lf.t.a) r6     // Catch:{ all -> 0x0087 }
            r6.a(r8, r7)     // Catch:{ all -> 0x0087 }
            ke.y r6 = ke.y.this
            ke.w r6 = r6.f20870a
            ke.l r6 = r6.f20818a
            r6.a(r5)
        L_0x00ad:
            int r4 = r4 + 1
            goto L_0x0052
        L_0x00b0:
            ke.y r1 = ke.y.this
            ke.w r1 = r1.f20870a
            ke.l r1 = r1.f20818a
            r1.a(r5)
            throw r0
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x00bd:
            return r1
        L_0x00be:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c5
        L_0x00c4:
            throw r0
        L_0x00c5:
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.l.b():boolean");
    }

    public final int c(y.b bVar) {
        int i10 = 0;
        for (y.b bVar2 : this.f20765c) {
            y yVar = y.this;
            if (!yVar.f20875f && yVar.f20874e.f20880a.f20785d.equals(y.this.f20874e.f20880a.f20785d)) {
                i10++;
            }
        }
        return i10;
    }
}
