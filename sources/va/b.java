package va;

import com.google.firebase.installations.a;
import z4.k;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26688a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f26689b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f26690c;

    public /* synthetic */ b(a aVar, boolean z10, int i10) {
        this.f26688a = i10;
        this.f26689b = aVar;
        this.f26690c = z10;
    }

    public /* synthetic */ b(k.a aVar, boolean z10) {
        this.f26688a = 2;
        this.f26689b = aVar;
        this.f26690c = z10;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f26688a
            switch(r0) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00ff
        L_0x0007:
            java.lang.Object r0 = r7.f26689b
            com.google.firebase.installations.a r0 = (com.google.firebase.installations.a) r0
            boolean r1 = r7.f26690c
            r0.getClass()
            java.lang.Object r2 = com.google.firebase.installations.a.f9676m
            monitor-enter(r2)
            com.google.firebase.a r3 = r0.f9678a     // Catch:{ all -> 0x00f2 }
            r3.a()     // Catch:{ all -> 0x00f2 }
            android.content.Context r3 = r3.f9662a     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "generatefid.lock"
            t1.c r3 = t1.c.d(r3, r4)     // Catch:{ all -> 0x00f2 }
            xa.c r4 = r0.f9680c     // Catch:{ all -> 0x00eb }
            xa.d r4 = r4.b()     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x002b
            r3.g()     // Catch:{ all -> 0x00f2 }
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x00f2 }
            boolean r3 = r4.h()     // Catch:{ d -> 0x00e6 }
            r5 = 1
            if (r3 != 0) goto L_0x0051
            r3 = r4
            xa.a r3 = (xa.a) r3     // Catch:{ d -> 0x00e6 }
            xa.c$a r3 = r3.f27891c     // Catch:{ d -> 0x00e6 }
            xa.c$a r6 = xa.c.a.UNREGISTERED     // Catch:{ d -> 0x00e6 }
            if (r3 != r6) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            if (r3 == 0) goto L_0x0042
            goto L_0x0051
        L_0x0042:
            if (r1 != 0) goto L_0x004c
            va.j r1 = r0.f9681d     // Catch:{ d -> 0x00e6 }
            boolean r1 = r1.d(r4)     // Catch:{ d -> 0x00e6 }
            if (r1 == 0) goto L_0x00ea
        L_0x004c:
            xa.d r1 = r0.c(r4)     // Catch:{ d -> 0x00e6 }
            goto L_0x0055
        L_0x0051:
            xa.d r1 = r0.j(r4)     // Catch:{ d -> 0x00e6 }
        L_0x0055:
            monitor-enter(r2)
            com.google.firebase.a r3 = r0.f9678a     // Catch:{ all -> 0x00e3 }
            r3.a()     // Catch:{ all -> 0x00e3 }
            android.content.Context r3 = r3.f9662a     // Catch:{ all -> 0x00e3 }
            java.lang.String r6 = "generatefid.lock"
            t1.c r3 = t1.c.d(r3, r6)     // Catch:{ all -> 0x00e3 }
            xa.c r6 = r0.f9680c     // Catch:{ all -> 0x00dc }
            r6.a(r1)     // Catch:{ all -> 0x00dc }
            if (r3 == 0) goto L_0x006d
            r3.g()     // Catch:{ all -> 0x00e3 }
        L_0x006d:
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            monitor-enter(r0)
            java.util.Set<wa.a> r2 = r0.f9688k     // Catch:{ all -> 0x00d9 }
            int r2 = r2.size()     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x00a1
            xa.a r4 = (xa.a) r4     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = r4.f27890b     // Catch:{ all -> 0x00d9 }
            r3 = r1
            xa.a r3 = (xa.a) r3     // Catch:{ all -> 0x00d9 }
            java.lang.String r3 = r3.f27890b     // Catch:{ all -> 0x00d9 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00d9 }
            if (r2 != 0) goto L_0x00a1
            java.util.Set<wa.a> r2 = r0.f9688k     // Catch:{ all -> 0x00d9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d9 }
        L_0x008c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d9 }
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d9 }
            wa.a r3 = (wa.a) r3     // Catch:{ all -> 0x00d9 }
            r4 = r1
            xa.a r4 = (xa.a) r4     // Catch:{ all -> 0x00d9 }
            java.lang.String r4 = r4.f27890b     // Catch:{ all -> 0x00d9 }
            r3.a(r4)     // Catch:{ all -> 0x00d9 }
            goto L_0x008c
        L_0x00a1:
            monitor-exit(r0)
            boolean r2 = r1.j()
            if (r2 == 0) goto L_0x00b5
            r2 = r1
            xa.a r2 = (xa.a) r2
            java.lang.String r2 = r2.f27890b
            monitor-enter(r0)
            r0.f9687j = r2     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)
            goto L_0x00b5
        L_0x00b2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00b5:
            boolean r2 = r1.h()
            if (r2 == 0) goto L_0x00c4
            va.d r1 = new va.d
            r1.<init>(r5)
            r0.k(r1)
            goto L_0x00ea
        L_0x00c4:
            boolean r2 = r1.i()
            if (r2 == 0) goto L_0x00d5
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.k(r1)
            goto L_0x00ea
        L_0x00d5:
            r0.l(r1)
            goto L_0x00ea
        L_0x00d9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00dc:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e2
            r3.g()     // Catch:{ all -> 0x00e3 }
        L_0x00e2:
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            throw r0
        L_0x00e6:
            r1 = move-exception
            r0.k(r1)
        L_0x00ea:
            return
        L_0x00eb:
            r0 = move-exception
            if (r3 == 0) goto L_0x00f1
            r3.g()     // Catch:{ all -> 0x00f2 }
        L_0x00f1:
            throw r0     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00f2 }
            throw r0
        L_0x00f5:
            java.lang.Object r0 = r7.f26689b
            com.google.firebase.installations.a r0 = (com.google.firebase.installations.a) r0
            boolean r1 = r7.f26690c
            r0.b(r1)
            return
        L_0x00ff:
            java.lang.Object r0 = r7.f26689b
            z4.k$a r0 = (z4.k.a) r0
            boolean r1 = r7.f26690c
            z4.k r0 = r0.f28366b
            int r2 = v6.e0.f26436a
            r0.s(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.b.run():void");
    }
}
