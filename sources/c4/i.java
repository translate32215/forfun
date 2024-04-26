package c4;

import t.g;

/* compiled from: ThumbnailRequestCoordinator */
public class i implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final d f4247a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4248b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f4249c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f4250d;

    /* renamed from: e  reason: collision with root package name */
    public int f4251e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f4252f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4253g;

    public i(Object obj, d dVar) {
        this.f4248b = obj;
        this.f4247a = dVar;
    }

    public d a() {
        d a10;
        synchronized (this.f4248b) {
            d dVar = this.f4247a;
            a10 = dVar != null ? dVar.a() : this;
        }
        return a10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(c4.c r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4248b
            monitor-enter(r0)
            c4.d r1 = r4.f4247a     // Catch:{ all -> 0x0026 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.b(r4)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x0023
            c4.c r1 = r4.f4249c     // Catch:{ all -> 0x0026 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0026 }
            if (r5 == 0) goto L_0x0023
            int r5 = r4.f4251e     // Catch:{ all -> 0x0026 }
            r1 = 2
            if (r5 == r1) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0026:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.i.b(c4.c):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(c4.c r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4248b
            monitor-enter(r0)
            c4.d r1 = r4.f4247a     // Catch:{ all -> 0x0027 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.c(r4)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x0024
            c4.c r1 = r4.f4249c     // Catch:{ all -> 0x0027 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0027 }
            if (r5 == 0) goto L_0x0024
            boolean r5 = r4.h()     // Catch:{ all -> 0x0027 }
            if (r5 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r2
        L_0x0027:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.i.c(c4.c):boolean");
    }

    public void clear() {
        synchronized (this.f4248b) {
            this.f4253g = false;
            this.f4251e = 3;
            this.f4252f = 3;
            this.f4250d.clear();
            this.f4249c.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(c4.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4248b
            monitor-enter(r0)
            c4.c r1 = r2.f4249c     // Catch:{ all -> 0x001b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001b }
            r1 = 5
            if (r3 != 0) goto L_0x0010
            r2.f4252f = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0010:
            r2.f4251e = r1     // Catch:{ all -> 0x001b }
            c4.d r3 = r2.f4247a     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0019
            r3.d(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.i.d(c4.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(c4.c r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4248b
            monitor-enter(r0)
            c4.d r1 = r4.f4247a     // Catch:{ all -> 0x0026 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.e(r4)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x0023
            c4.c r1 = r4.f4249c     // Catch:{ all -> 0x0026 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0026 }
            if (r5 != 0) goto L_0x0024
            int r5 = r4.f4251e     // Catch:{ all -> 0x0026 }
            r1 = 4
            if (r5 == r1) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0026:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.i.e(c4.c):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(c4.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4248b
            monitor-enter(r0)
            c4.c r1 = r2.f4250d     // Catch:{ all -> 0x0028 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0028 }
            r1 = 4
            if (r3 == 0) goto L_0x0010
            r2.f4252f = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0010:
            r2.f4251e = r1     // Catch:{ all -> 0x0028 }
            c4.d r3 = r2.f4247a     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0019
            r3.f(r2)     // Catch:{ all -> 0x0028 }
        L_0x0019:
            int r3 = r2.f4252f     // Catch:{ all -> 0x0028 }
            boolean r3 = t.g.k(r3)     // Catch:{ all -> 0x0028 }
            if (r3 != 0) goto L_0x0026
            c4.c r3 = r2.f4250d     // Catch:{ all -> 0x0028 }
            r3.clear()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.i.f(c4.c):void");
    }

    public void g() {
        synchronized (this.f4248b) {
            if (!g.k(this.f4252f)) {
                this.f4252f = 2;
                this.f4250d.g();
            }
            if (!g.k(this.f4251e)) {
                this.f4251e = 2;
                this.f4249c.g();
            }
        }
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f4248b) {
            if (!this.f4250d.h()) {
                if (!this.f4249c.h()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(c4.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof c4.i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            c4.i r4 = (c4.i) r4
            c4.c r0 = r3.f4249c
            if (r0 != 0) goto L_0x0010
            c4.c r0 = r4.f4249c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            c4.c r0 = r3.f4249c
            c4.c r2 = r4.f4249c
            boolean r0 = r0.i(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            c4.c r0 = r3.f4250d
            if (r0 != 0) goto L_0x0023
            c4.c r4 = r4.f4250d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            c4.c r0 = r3.f4250d
            c4.c r4 = r4.f4250d
            boolean r4 = r0.i(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.i.i(c4.c):boolean");
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f4248b) {
            z10 = true;
            if (this.f4251e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean j() {
        boolean z10;
        synchronized (this.f4248b) {
            z10 = this.f4251e == 3;
        }
        return z10;
    }

    public void k() {
        synchronized (this.f4248b) {
            this.f4253g = true;
            try {
                if (!(this.f4251e == 4 || this.f4252f == 1)) {
                    this.f4252f = 1;
                    this.f4250d.k();
                }
                if (this.f4253g && this.f4251e != 1) {
                    this.f4251e = 1;
                    this.f4249c.k();
                }
            } finally {
                this.f4253g = false;
            }
        }
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f4248b) {
            z10 = this.f4251e == 4;
        }
        return z10;
    }
}
