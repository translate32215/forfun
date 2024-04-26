package c4;

/* compiled from: ErrorRequestCoordinator */
public final class b implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4215a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4216b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f4217c;

    /* renamed from: d  reason: collision with root package name */
    public volatile c f4218d;

    /* renamed from: e  reason: collision with root package name */
    public int f4219e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f4220f = 3;

    public b(Object obj, d dVar) {
        this.f4215a = obj;
        this.f4216b = dVar;
    }

    public d a() {
        d a10;
        synchronized (this.f4215a) {
            d dVar = this.f4216b;
            a10 = dVar != null ? dVar.a() : this;
        }
        return a10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(c4.c r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4215a
            monitor-enter(r0)
            c4.d r1 = r4.f4216b     // Catch:{ all -> 0x001f }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.b(r4)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x001c
            boolean r5 = r4.m(r5)     // Catch:{ all -> 0x001f }
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r2
        L_0x001f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.b(c4.c):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(c4.c r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4215a
            monitor-enter(r0)
            c4.d r1 = r4.f4216b     // Catch:{ all -> 0x001f }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.c(r4)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x001c
            boolean r5 = r4.m(r5)     // Catch:{ all -> 0x001f }
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r2
        L_0x001f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.c(c4.c):boolean");
    }

    public void clear() {
        synchronized (this.f4215a) {
            this.f4219e = 3;
            this.f4217c.clear();
            if (this.f4220f != 3) {
                this.f4220f = 3;
                this.f4218d.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(c4.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4215a
            monitor-enter(r0)
            c4.c r1 = r2.f4218d     // Catch:{ all -> 0x0027 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0027 }
            r1 = 5
            if (r3 != 0) goto L_0x001c
            r2.f4219e = r1     // Catch:{ all -> 0x0027 }
            int r3 = r2.f4220f     // Catch:{ all -> 0x0027 }
            r1 = 1
            if (r3 == r1) goto L_0x001a
            r2.f4220f = r1     // Catch:{ all -> 0x0027 }
            c4.c r3 = r2.f4218d     // Catch:{ all -> 0x0027 }
            r3.k()     // Catch:{ all -> 0x0027 }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x001c:
            r2.f4220f = r1     // Catch:{ all -> 0x0027 }
            c4.d r3 = r2.f4216b     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0025
            r3.d(r2)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.d(c4.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(c4.c r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4215a
            monitor-enter(r0)
            c4.d r1 = r4.f4216b     // Catch:{ all -> 0x001f }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.e(r4)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x001c
            boolean r5 = r4.m(r5)     // Catch:{ all -> 0x001f }
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r2
        L_0x001f:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.e(c4.c):boolean");
    }

    public void f(c cVar) {
        synchronized (this.f4215a) {
            if (cVar.equals(this.f4217c)) {
                this.f4219e = 4;
            } else if (cVar.equals(this.f4218d)) {
                this.f4220f = 4;
            }
            d dVar = this.f4216b;
            if (dVar != null) {
                dVar.f(this);
            }
        }
    }

    public void g() {
        synchronized (this.f4215a) {
            if (this.f4219e == 1) {
                this.f4219e = 2;
                this.f4217c.g();
            }
            if (this.f4220f == 1) {
                this.f4220f = 2;
                this.f4218d.g();
            }
        }
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f4215a) {
            if (!this.f4217c.h()) {
                if (!this.f4218d.h()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public boolean i(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        if (!this.f4217c.i(bVar.f4217c) || !this.f4218d.i(bVar.f4218d)) {
            return false;
        }
        return true;
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f4215a) {
            z10 = true;
            if (this.f4219e != 1) {
                if (this.f4220f != 1) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public boolean j() {
        boolean z10;
        synchronized (this.f4215a) {
            z10 = this.f4219e == 3 && this.f4220f == 3;
        }
        return z10;
    }

    public void k() {
        synchronized (this.f4215a) {
            if (this.f4219e != 1) {
                this.f4219e = 1;
                this.f4217c.k();
            }
        }
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f4215a) {
            if (this.f4219e != 4) {
                if (this.f4220f != 4) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean m(c cVar) {
        return cVar.equals(this.f4217c) || (this.f4219e == 5 && cVar.equals(this.f4218d));
    }
}
