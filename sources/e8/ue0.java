package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ue0 {

    /* renamed from: a  reason: collision with root package name */
    public int f16928a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public int[] f16929b = new int[1000];

    /* renamed from: c  reason: collision with root package name */
    public long[] f16930c = new long[1000];

    /* renamed from: d  reason: collision with root package name */
    public int[] f16931d = new int[1000];

    /* renamed from: e  reason: collision with root package name */
    public int[] f16932e = new int[1000];

    /* renamed from: f  reason: collision with root package name */
    public long[] f16933f = new long[1000];

    /* renamed from: g  reason: collision with root package name */
    public ld0[] f16934g = new ld0[1000];

    /* renamed from: h  reason: collision with root package name */
    public bc0[] f16935h = new bc0[1000];

    /* renamed from: i  reason: collision with root package name */
    public int f16936i;

    /* renamed from: j  reason: collision with root package name */
    public int f16937j;

    /* renamed from: k  reason: collision with root package name */
    public int f16938k;

    /* renamed from: l  reason: collision with root package name */
    public int f16939l;

    /* renamed from: m  reason: collision with root package name */
    public long f16940m = Long.MIN_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public long f16941n = Long.MIN_VALUE;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16942o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16943p = true;

    /* renamed from: q  reason: collision with root package name */
    public bc0 f16944q;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a(long r6, int r8, long r9, int r11, e8.ld0 r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f16942o     // Catch:{ all -> 0x00d7 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f16942o = r1     // Catch:{ all -> 0x00d7 }
        L_0x000e:
            boolean r0 = r5.f16943p     // Catch:{ all -> 0x00d7 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            o.a.c(r0)     // Catch:{ all -> 0x00d7 }
            monitor-enter(r5)     // Catch:{ all -> 0x00d7 }
            long r3 = r5.f16941n     // Catch:{ all -> 0x00d4 }
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ all -> 0x00d4 }
            r5.f16941n = r3     // Catch:{ all -> 0x00d4 }
            monitor-exit(r5)     // Catch:{ all -> 0x00d7 }
            long[] r0 = r5.f16933f     // Catch:{ all -> 0x00d7 }
            int r3 = r5.f16939l     // Catch:{ all -> 0x00d7 }
            r0[r3] = r6     // Catch:{ all -> 0x00d7 }
            long[] r6 = r5.f16930c     // Catch:{ all -> 0x00d7 }
            r6[r3] = r9     // Catch:{ all -> 0x00d7 }
            int[] r7 = r5.f16931d     // Catch:{ all -> 0x00d7 }
            r7[r3] = r11     // Catch:{ all -> 0x00d7 }
            int[] r7 = r5.f16932e     // Catch:{ all -> 0x00d7 }
            r7[r3] = r8     // Catch:{ all -> 0x00d7 }
            e8.ld0[] r7 = r5.f16934g     // Catch:{ all -> 0x00d7 }
            r7[r3] = r12     // Catch:{ all -> 0x00d7 }
            e8.bc0[] r7 = r5.f16935h     // Catch:{ all -> 0x00d7 }
            e8.bc0 r8 = r5.f16944q     // Catch:{ all -> 0x00d7 }
            r7[r3] = r8     // Catch:{ all -> 0x00d7 }
            int[] r7 = r5.f16929b     // Catch:{ all -> 0x00d7 }
            r7[r3] = r1     // Catch:{ all -> 0x00d7 }
            int r7 = r5.f16936i     // Catch:{ all -> 0x00d7 }
            int r7 = r7 + r2
            r5.f16936i = r7     // Catch:{ all -> 0x00d7 }
            int r8 = r5.f16928a     // Catch:{ all -> 0x00d7 }
            if (r7 != r8) goto L_0x00cb
            int r7 = r8 + 1000
            int[] r9 = new int[r7]     // Catch:{ all -> 0x00d7 }
            long[] r10 = new long[r7]     // Catch:{ all -> 0x00d7 }
            long[] r11 = new long[r7]     // Catch:{ all -> 0x00d7 }
            int[] r12 = new int[r7]     // Catch:{ all -> 0x00d7 }
            int[] r0 = new int[r7]     // Catch:{ all -> 0x00d7 }
            e8.ld0[] r2 = new e8.ld0[r7]     // Catch:{ all -> 0x00d7 }
            e8.bc0[] r3 = new e8.bc0[r7]     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f16938k     // Catch:{ all -> 0x00d7 }
            int r8 = r8 - r4
            java.lang.System.arraycopy(r6, r4, r10, r1, r8)     // Catch:{ all -> 0x00d7 }
            long[] r6 = r5.f16933f     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f16938k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r11, r1, r8)     // Catch:{ all -> 0x00d7 }
            int[] r6 = r5.f16932e     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f16938k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r12, r1, r8)     // Catch:{ all -> 0x00d7 }
            int[] r6 = r5.f16931d     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f16938k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r0, r1, r8)     // Catch:{ all -> 0x00d7 }
            e8.ld0[] r6 = r5.f16934g     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f16938k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r2, r1, r8)     // Catch:{ all -> 0x00d7 }
            e8.bc0[] r6 = r5.f16935h     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f16938k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r3, r1, r8)     // Catch:{ all -> 0x00d7 }
            int[] r6 = r5.f16929b     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f16938k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r9, r1, r8)     // Catch:{ all -> 0x00d7 }
            int r6 = r5.f16938k     // Catch:{ all -> 0x00d7 }
            long[] r4 = r5.f16930c     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r10, r8, r6)     // Catch:{ all -> 0x00d7 }
            long[] r4 = r5.f16933f     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r11, r8, r6)     // Catch:{ all -> 0x00d7 }
            int[] r4 = r5.f16932e     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r12, r8, r6)     // Catch:{ all -> 0x00d7 }
            int[] r4 = r5.f16931d     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r0, r8, r6)     // Catch:{ all -> 0x00d7 }
            e8.ld0[] r4 = r5.f16934g     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r2, r8, r6)     // Catch:{ all -> 0x00d7 }
            e8.bc0[] r4 = r5.f16935h     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r3, r8, r6)     // Catch:{ all -> 0x00d7 }
            int[] r4 = r5.f16929b     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r9, r8, r6)     // Catch:{ all -> 0x00d7 }
            r5.f16930c = r10     // Catch:{ all -> 0x00d7 }
            r5.f16933f = r11     // Catch:{ all -> 0x00d7 }
            r5.f16932e = r12     // Catch:{ all -> 0x00d7 }
            r5.f16931d = r0     // Catch:{ all -> 0x00d7 }
            r5.f16934g = r2     // Catch:{ all -> 0x00d7 }
            r5.f16935h = r3     // Catch:{ all -> 0x00d7 }
            r5.f16929b = r9     // Catch:{ all -> 0x00d7 }
            r5.f16938k = r1     // Catch:{ all -> 0x00d7 }
            int r6 = r5.f16928a     // Catch:{ all -> 0x00d7 }
            r5.f16939l = r6     // Catch:{ all -> 0x00d7 }
            r5.f16936i = r6     // Catch:{ all -> 0x00d7 }
            r5.f16928a = r7     // Catch:{ all -> 0x00d7 }
            monitor-exit(r5)
            return
        L_0x00cb:
            int r3 = r3 + r2
            r5.f16939l = r3     // Catch:{ all -> 0x00d7 }
            if (r3 != r8) goto L_0x00d2
            r5.f16939l = r1     // Catch:{ all -> 0x00d7 }
        L_0x00d2:
            monitor-exit(r5)
            return
        L_0x00d4:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d7 }
            throw r6     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.ue0.a(long, int, long, int, e8.ld0):void");
    }

    public final synchronized boolean b() {
        return this.f16936i != 0;
    }
}
