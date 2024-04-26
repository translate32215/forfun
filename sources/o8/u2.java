package o8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class u2<V> {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f23455g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23456a;

    /* renamed from: b  reason: collision with root package name */
    public final t2<V> f23457b;

    /* renamed from: c  reason: collision with root package name */
    public final V f23458c;

    /* renamed from: d  reason: collision with root package name */
    public final V f23459d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f23460e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile V f23461f = null;

    public /* synthetic */ u2(String str, Object obj, Object obj2, t2 t2Var) {
        this.f23456a = str;
        this.f23458c = obj;
        this.f23459d = obj2;
        this.f23457b = t2Var;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0041 */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f23460e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            f7.v r4 = o.a.f22534a
            if (r4 == 0) goto L_0x0069
            java.lang.Object r4 = f23455g
            monitor-enter(r4)
            boolean r0 = f7.v.a()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x001f
            V r0 = r3.f23461f     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x001b
            V r0 = r3.f23458c     // Catch:{ all -> 0x0066 }
            goto L_0x001d
        L_0x001b:
            V r0 = r3.f23461f     // Catch:{ all -> 0x0066 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return r0
        L_0x001f:
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            java.util.List<o8.u2<?>> r4 = o8.v2.f23499a     // Catch:{ SecurityException -> 0x0053 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0053 }
        L_0x0026:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0053 }
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0053 }
            o8.u2 r0 = (o8.u2) r0     // Catch:{ SecurityException -> 0x0053 }
            boolean r1 = f7.v.a()     // Catch:{ SecurityException -> 0x0053 }
            if (r1 != 0) goto L_0x004b
            r1 = 0
            o8.t2<V> r2 = r0.f23457b     // Catch:{ IllegalStateException -> 0x0041 }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0041 }
        L_0x0041:
            java.lang.Object r2 = f23455g     // Catch:{ SecurityException -> 0x0053 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0053 }
            r0.f23461f = r1     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            goto L_0x0026
        L_0x0048:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r4     // Catch:{ SecurityException -> 0x0053 }
        L_0x004b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0053 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0053 }
            throw r4     // Catch:{ SecurityException -> 0x0053 }
        L_0x0053:
        L_0x0054:
            o8.t2<V> r4 = r3.f23457b
            if (r4 != 0) goto L_0x005b
            V r4 = r3.f23458c
            return r4
        L_0x005b:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0063, IllegalStateException -> 0x0060 }
            return r4
        L_0x0060:
            V r4 = r3.f23458c
            return r4
        L_0x0063:
            V r4 = r3.f23458c
            return r4
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x0069:
            V r4 = r3.f23458c
            return r4
        L_0x006c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            goto L_0x0070
        L_0x006f:
            throw r4
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.u2.a(java.lang.Object):java.lang.Object");
    }
}
