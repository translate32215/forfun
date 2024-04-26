package x4;

import android.os.Looper;
import android.util.Log;

/* compiled from: PlayerMessage */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f27713a;

    /* renamed from: b  reason: collision with root package name */
    public final a f27714b;

    /* renamed from: c  reason: collision with root package name */
    public final v6.b f27715c;

    /* renamed from: d  reason: collision with root package name */
    public final c1 f27716d;

    /* renamed from: e  reason: collision with root package name */
    public int f27717e;

    /* renamed from: f  reason: collision with root package name */
    public Object f27718f;

    /* renamed from: g  reason: collision with root package name */
    public Looper f27719g;

    /* renamed from: h  reason: collision with root package name */
    public int f27720h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f27721i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f27722j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f27723k;

    /* compiled from: PlayerMessage */
    public interface a {
    }

    /* compiled from: PlayerMessage */
    public interface b {
        void n(int i10, Object obj) throws m;
    }

    public s0(a aVar, b bVar, c1 c1Var, int i10, v6.b bVar2, Looper looper) {
        this.f27714b = aVar;
        this.f27713a = bVar;
        this.f27716d = c1Var;
        this.f27719g = looper;
        this.f27715c = bVar2;
        this.f27720h = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[SYNTHETIC, Splitter:B:16:0x003b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(long r7) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f27721i     // Catch:{ all -> 0x0043 }
            v6.a.d(r0)     // Catch:{ all -> 0x0043 }
            android.os.Looper r0 = r6.f27719g     // Catch:{ all -> 0x0043 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0043 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0043 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            v6.a.d(r0)     // Catch:{ all -> 0x0043 }
            v6.b r0 = r6.f27715c     // Catch:{ all -> 0x0043 }
            long r0 = r0.a()     // Catch:{ all -> 0x0043 }
            long r0 = r0 + r7
        L_0x001f:
            boolean r2 = r6.f27723k     // Catch:{ all -> 0x0043 }
            if (r2 != 0) goto L_0x0035
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0035
            r6.wait(r7)     // Catch:{ all -> 0x0043 }
            v6.b r7 = r6.f27715c     // Catch:{ all -> 0x0043 }
            long r7 = r7.a()     // Catch:{ all -> 0x0043 }
            long r7 = r0 - r7
            goto L_0x001f
        L_0x0035:
            if (r2 == 0) goto L_0x003b
            boolean r7 = r6.f27722j     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)
            return r7
        L_0x003b:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0043 }
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch:{ all -> 0x0043 }
            throw r7     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0047
        L_0x0046:
            throw r7
        L_0x0047:
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.s0.a(long):boolean");
    }

    public synchronized boolean b() {
        return false;
    }

    public synchronized void c(boolean z10) {
        this.f27722j = z10 | this.f27722j;
        this.f27723k = true;
        notifyAll();
    }

    public s0 d() {
        v6.a.d(!this.f27721i);
        this.f27721i = true;
        y yVar = (y) this.f27714b;
        synchronized (yVar) {
            if (!yVar.G) {
                if (yVar.f27773h.isAlive()) {
                    yVar.f27772g.Q(14, this).sendToTarget();
                }
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c(false);
        }
        return this;
    }
}
