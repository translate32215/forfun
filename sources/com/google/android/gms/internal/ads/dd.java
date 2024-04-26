package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import e8.fi0;
import e8.ov;
import e8.qn;
import e8.y00;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dd extends yx {

    /* renamed from: a  reason: collision with root package name */
    public final id f6200a;

    public dd(Context context, b8 b8Var, y00 y00, qn qnVar, rx rxVar) {
        j8 j8Var = new j8(qnVar, b8Var.d());
        ((ov) j8Var.f7135c).f15843a.set(rxVar);
        this.f6200a = new id(new kd(b8Var, context, j8Var, y00), y00.f17548d);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized java.lang.String A0() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.id r0 = r4.f6200a     // Catch:{ all -> 0x001c }
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            r1 = 0
            com.google.android.gms.internal.ads.gz r2 = r0.f7073c     // Catch:{ RemoteException -> 0x0011 }
            if (r2 == 0) goto L_0x000d
            java.lang.String r1 = r2.s()     // Catch:{ RemoteException -> 0x0011 }
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x0018
        L_0x000f:
            r1 = move-exception
            goto L_0x001a
        L_0x0011:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            l0.e.F(r3, r2)     // Catch:{ all -> 0x000f }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
        L_0x0018:
            monitor-exit(r4)
            return r1
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dd.A0():java.lang.String");
    }

    public final void J2(fi0 fi0) throws RemoteException {
        this.f6200a.a(fi0, 1);
    }

    public final synchronized void Y3(fi0 fi0, int i10) throws RemoteException {
        this.f6200a.a(fi0, i10);
    }

    public final synchronized boolean j() throws RemoteException {
        boolean j10;
        id idVar = this.f6200a;
        synchronized (idVar) {
            j10 = idVar.f7071a.j();
        }
        return j10;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized java.lang.String s() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.id r0 = r4.f6200a     // Catch:{ all -> 0x001c }
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            r1 = 0
            com.google.android.gms.internal.ads.gz r2 = r0.f7073c     // Catch:{ RemoteException -> 0x0011 }
            if (r2 == 0) goto L_0x000d
            java.lang.String r1 = r2.s()     // Catch:{ RemoteException -> 0x0011 }
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x0018
        L_0x000f:
            r1 = move-exception
            goto L_0x001a
        L_0x0011:
            r2 = move-exception
            java.lang.String r3 = "#007 Could not call remote method."
            l0.e.F(r3, r2)     // Catch:{ all -> 0x000f }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
        L_0x0018:
            monitor-exit(r4)
            return r1
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dd.s():java.lang.String");
    }
}
