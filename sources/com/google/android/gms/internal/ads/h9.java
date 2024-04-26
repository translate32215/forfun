package com.google.android.gms.internal.ads;

import e7.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class h9<ListenerT> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public final Map<ListenerT, Executor> f6833a = new HashMap();

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public h9(java.util.Set<e8.ul<ListenerT>> r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f6833a = r0
            monitor-enter(r2)
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
        L_0x000f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x002a }
            e8.ul r0 = (e8.ul) r0     // Catch:{ all -> 0x002a }
            monitor-enter(r2)     // Catch:{ all -> 0x002a }
            T r1 = r0.f16965a     // Catch:{ all -> 0x0025 }
            java.util.concurrent.Executor r0 = r0.f16966b     // Catch:{ all -> 0x0025 }
            r2.J0(r1, r0)     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            goto L_0x000f
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x002e
        L_0x002d:
            throw r3
        L_0x002e:
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h9.<init>(java.util.Set):void");
    }

    public final synchronized void I0(j9<ListenerT> j9Var) {
        for (Map.Entry next : this.f6833a.entrySet()) {
            ((Executor) next.getValue()).execute(new i((j9) j9Var, next.getKey()));
        }
    }

    public final synchronized void J0(ListenerT listenert, Executor executor) {
        this.f6833a.put(listenert, executor);
    }
}
