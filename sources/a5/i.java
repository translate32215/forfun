package a5;

import a5.e;
import a5.f;
import a5.h;
import h6.c;
import h6.d;
import java.util.ArrayDeque;
import r0.b;

/* compiled from: SimpleDecoder */
public abstract class i<I extends f, O extends h, E extends e> implements c<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    public final Thread f98a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f99b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque<I> f100c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<O> f101d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final I[] f102e;

    /* renamed from: f  reason: collision with root package name */
    public final O[] f103f;

    /* renamed from: g  reason: collision with root package name */
    public int f104g;

    /* renamed from: h  reason: collision with root package name */
    public int f105h;

    /* renamed from: i  reason: collision with root package name */
    public I f106i;

    /* renamed from: j  reason: collision with root package name */
    public E f107j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f108k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f109l;

    /* renamed from: m  reason: collision with root package name */
    public int f110m;

    /* compiled from: SimpleDecoder */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        public void run() {
            i iVar = i.this;
            iVar.getClass();
            do {
                try {
                } catch (InterruptedException e10) {
                    throw new IllegalStateException(e10);
                }
            } while (iVar.g());
        }
    }

    public i(I[] iArr, O[] oArr) {
        this.f102e = iArr;
        this.f104g = iArr.length;
        for (int i10 = 0; i10 < this.f104g; i10++) {
            this.f102e[i10] = new h6.i();
        }
        this.f103f = oArr;
        this.f105h = oArr.length;
        for (int i11 = 0; i11 < this.f105h; i11++) {
            this.f103f[i11] = new d(new b((c) this));
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f98a = aVar;
        aVar.start();
    }

    public void a() {
        synchronized (this.f99b) {
            this.f109l = true;
            this.f99b.notify();
        }
        try {
            this.f98a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void c(Object obj) throws e {
        I i10 = (f) obj;
        synchronized (this.f99b) {
            i();
            v6.a.a(i10 == this.f106i);
            this.f100c.addLast(i10);
            h();
            this.f106i = null;
        }
    }

    public Object d() throws e {
        h hVar;
        synchronized (this.f99b) {
            i();
            if (this.f101d.isEmpty()) {
                hVar = null;
            } else {
                hVar = (h) this.f101d.removeFirst();
            }
        }
        return hVar;
    }

    public Object e() throws e {
        I i10;
        synchronized (this.f99b) {
            i();
            v6.a.d(this.f106i == null);
            int i11 = this.f104g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f102e;
                int i12 = i11 - 1;
                this.f104g = i12;
                i10 = iArr[i12];
            }
            this.f106i = i10;
        }
        return i10;
    }

    public abstract E f(I i10, O o10, boolean z10);

    public final void flush() {
        synchronized (this.f99b) {
            this.f108k = true;
            this.f110m = 0;
            I i10 = this.f106i;
            if (i10 != null) {
                j(i10);
                this.f106i = null;
            }
            while (!this.f100c.isEmpty()) {
                j((f) this.f100c.removeFirst());
            }
            while (!this.f101d.isEmpty()) {
                ((h) this.f101d.removeFirst()).t();
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    public final boolean g() throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f99b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r7.f109l     // Catch:{ all -> 0x009e }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0020
            java.util.ArrayDeque<I> r1 = r7.f100c     // Catch:{ all -> 0x009e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x009e }
            if (r1 != 0) goto L_0x0017
            int r1 = r7.f105h     // Catch:{ all -> 0x009e }
            if (r1 <= 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 != 0) goto L_0x0020
            java.lang.Object r1 = r7.f99b     // Catch:{ all -> 0x009e }
            r1.wait()     // Catch:{ all -> 0x009e }
            goto L_0x0003
        L_0x0020:
            boolean r1 = r7.f109l     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return r2
        L_0x0026:
            java.util.ArrayDeque<I> r1 = r7.f100c     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x009e }
            a5.f r1 = (a5.f) r1     // Catch:{ all -> 0x009e }
            O[] r4 = r7.f103f     // Catch:{ all -> 0x009e }
            int r5 = r7.f105h     // Catch:{ all -> 0x009e }
            int r5 = r5 - r3
            r7.f105h = r5     // Catch:{ all -> 0x009e }
            r4 = r4[r5]     // Catch:{ all -> 0x009e }
            boolean r5 = r7.f108k     // Catch:{ all -> 0x009e }
            r7.f108k = r2     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            boolean r0 = r1.r()
            if (r0 == 0) goto L_0x0047
            r0 = 4
            r4.i(r0)
            goto L_0x0075
        L_0x0047:
            boolean r0 = r1.q()
            if (r0 == 0) goto L_0x0052
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.i(r0)
        L_0x0052:
            a5.e r0 = r7.f(r1, r4, r5)     // Catch:{ RuntimeException -> 0x0060, OutOfMemoryError -> 0x0057 }
            goto L_0x0069
        L_0x0057:
            r0 = move-exception
            h6.g r5 = new h6.g
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L_0x0068
        L_0x0060:
            r0 = move-exception
            h6.g r5 = new h6.g
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L_0x0068:
            r0 = r5
        L_0x0069:
            if (r0 == 0) goto L_0x0075
            java.lang.Object r5 = r7.f99b
            monitor-enter(r5)
            r7.f107j = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r5)     // Catch:{ all -> 0x0072 }
            return r2
        L_0x0072:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            java.lang.Object r5 = r7.f99b
            monitor-enter(r5)
            boolean r0 = r7.f108k     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0080
            r4.t()     // Catch:{ all -> 0x009b }
            goto L_0x0096
        L_0x0080:
            boolean r0 = r4.q()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x008f
            int r0 = r7.f110m     // Catch:{ all -> 0x009b }
            int r0 = r0 + r3
            r7.f110m = r0     // Catch:{ all -> 0x009b }
            r4.t()     // Catch:{ all -> 0x009b }
            goto L_0x0096
        L_0x008f:
            r7.f110m = r2     // Catch:{ all -> 0x009b }
            java.util.ArrayDeque<O> r0 = r7.f101d     // Catch:{ all -> 0x009b }
            r0.addLast(r4)     // Catch:{ all -> 0x009b }
        L_0x0096:
            r7.j(r1)     // Catch:{ all -> 0x009b }
            monitor-exit(r5)     // Catch:{ all -> 0x009b }
            return r3
        L_0x009b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x009b }
            throw r0
        L_0x009e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x00a1:
            throw r1
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.i.g():boolean");
    }

    public final void h() {
        if (!this.f100c.isEmpty() && this.f105h > 0) {
            this.f99b.notify();
        }
    }

    public final void i() throws e {
        E e10 = this.f107j;
        if (e10 != null) {
            throw e10;
        }
    }

    public final void j(I i10) {
        i10.t();
        I[] iArr = this.f102e;
        int i11 = this.f104g;
        this.f104g = i11 + 1;
        iArr[i11] = i10;
    }
}
