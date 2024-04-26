package qe;

import le.b;
import qe.g;
import v6.q;

/* compiled from: Http2Connection */
public class n extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f24383b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f24384c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g.C0229g f24385d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(g.C0229g gVar, String str, Object[] objArr, boolean z10, q qVar) {
        super(str, objArr);
        this.f24385d = gVar;
        this.f24383b = z10;
        this.f24384c = qVar;
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|3|d|28|29|30|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x008d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r14 = this;
            qe.g$g r0 = r14.f24385d
            boolean r1 = r14.f24383b
            v6.q r2 = r14.f24384c
            qe.g r3 = qe.g.this
            qe.r r3 = r3.D
            monitor-enter(r3)
            qe.g r4 = qe.g.this     // Catch:{ all -> 0x00c9 }
            monitor-enter(r4)     // Catch:{ all -> 0x00c9 }
            qe.g r5 = qe.g.this     // Catch:{ all -> 0x00c6 }
            v6.q r5 = r5.B     // Catch:{ all -> 0x00c6 }
            int r5 = r5.d()     // Catch:{ all -> 0x00c6 }
            r6 = 0
            if (r1 == 0) goto L_0x0026
            qe.g r1 = qe.g.this     // Catch:{ all -> 0x00c6 }
            v6.q r1 = r1.B     // Catch:{ all -> 0x00c6 }
            r1.f26491b = r6     // Catch:{ all -> 0x00c6 }
            java.lang.Object r1 = r1.f26492c     // Catch:{ all -> 0x00c6 }
            int[] r1 = (int[]) r1     // Catch:{ all -> 0x00c6 }
            java.util.Arrays.fill(r1, r6)     // Catch:{ all -> 0x00c6 }
        L_0x0026:
            qe.g r1 = qe.g.this     // Catch:{ all -> 0x00c6 }
            v6.q r1 = r1.B     // Catch:{ all -> 0x00c6 }
            r1.getClass()     // Catch:{ all -> 0x00c6 }
            r7 = 0
        L_0x002e:
            r8 = 10
            r9 = 1
            if (r7 >= r8) goto L_0x004b
            int r8 = r9 << r7
            int r10 = r2.f26491b     // Catch:{ all -> 0x00c6 }
            r8 = r8 & r10
            if (r8 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r9 != 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            java.lang.Object r8 = r2.f26492c     // Catch:{ all -> 0x00c6 }
            int[] r8 = (int[]) r8     // Catch:{ all -> 0x00c6 }
            r8 = r8[r7]     // Catch:{ all -> 0x00c6 }
            r1.e(r7, r8)     // Catch:{ all -> 0x00c6 }
        L_0x0048:
            int r7 = r7 + 1
            goto L_0x002e
        L_0x004b:
            qe.g r1 = qe.g.this     // Catch:{ all -> 0x00c6 }
            v6.q r1 = r1.B     // Catch:{ all -> 0x00c6 }
            int r1 = r1.d()     // Catch:{ all -> 0x00c6 }
            r2 = -1
            r7 = 0
            r10 = 0
            if (r1 == r2) goto L_0x0081
            if (r1 == r5) goto L_0x0081
            int r1 = r1 - r5
            long r1 = (long) r1     // Catch:{ all -> 0x00c6 }
            qe.g r5 = qe.g.this     // Catch:{ all -> 0x00c6 }
            java.util.Map<java.lang.Integer, qe.q> r5 = r5.f24332c     // Catch:{ all -> 0x00c6 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r5 != 0) goto L_0x0082
            qe.g r5 = qe.g.this     // Catch:{ all -> 0x00c6 }
            java.util.Map<java.lang.Integer, qe.q> r5 = r5.f24332c     // Catch:{ all -> 0x00c6 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x00c6 }
            qe.g r7 = qe.g.this     // Catch:{ all -> 0x00c6 }
            java.util.Map<java.lang.Integer, qe.q> r7 = r7.f24332c     // Catch:{ all -> 0x00c6 }
            int r7 = r7.size()     // Catch:{ all -> 0x00c6 }
            qe.q[] r7 = new qe.q[r7]     // Catch:{ all -> 0x00c6 }
            java.lang.Object[] r5 = r5.toArray(r7)     // Catch:{ all -> 0x00c6 }
            r7 = r5
            qe.q[] r7 = (qe.q[]) r7     // Catch:{ all -> 0x00c6 }
            goto L_0x0082
        L_0x0081:
            r1 = r10
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x00c6 }
            qe.g r4 = qe.g.this     // Catch:{ IOException -> 0x008d }
            qe.r r5 = r4.D     // Catch:{ IOException -> 0x008d }
            v6.q r4 = r4.B     // Catch:{ IOException -> 0x008d }
            r5.a(r4)     // Catch:{ IOException -> 0x008d }
            goto L_0x0092
        L_0x008d:
            qe.g r4 = qe.g.this     // Catch:{ all -> 0x00c9 }
            qe.g.a(r4)     // Catch:{ all -> 0x00c9 }
        L_0x0092:
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            if (r7 == 0) goto L_0x00af
            int r3 = r7.length
            r4 = 0
        L_0x0097:
            if (r4 >= r3) goto L_0x00af
            r5 = r7[r4]
            monitor-enter(r5)
            long r12 = r5.f24399b     // Catch:{ all -> 0x00ac }
            long r12 = r12 + r1
            r5.f24399b = r12     // Catch:{ all -> 0x00ac }
            int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a8
            r5.notifyAll()     // Catch:{ all -> 0x00ac }
        L_0x00a8:
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            int r4 = r4 + 1
            goto L_0x0097
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            throw r0
        L_0x00af:
            java.util.concurrent.ExecutorService r1 = qe.g.G
            qe.o r2 = new qe.o
            java.lang.String r3 = "OkHttp %s settings"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            qe.g r5 = qe.g.this
            java.lang.String r5 = r5.f24333d
            r4[r6] = r5
            r2.<init>(r0, r3, r4)
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            r1.execute(r2)
            return
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c6 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c9 }
            goto L_0x00cd
        L_0x00cc:
            throw r0
        L_0x00cd:
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.n.a():void");
    }
}
