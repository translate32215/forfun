package com.startapp;

import android.content.Context;
import android.content.Intent;

/* compiled from: Sta */
public class vb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent[] f12705a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f12706b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f12707c;

    public vb(Intent[] intentArr, Context context, String str) {
        this.f12705a = intentArr;
        this.f12706b = context;
        this.f12707c = str;
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r3 = this;
            android.content.Intent[] r0 = r3.f12705a
            android.content.Context r1 = r3.f12706b
            java.lang.String r2 = r3.f12707c
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x0015
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r2)     // Catch:{ all -> 0x0011 }
            goto L_0x0016
        L_0x0011:
            r1 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r1)
        L_0x0015:
            r1 = 0
        L_0x0016:
            r2 = 0
            r0[r2] = r1
            android.content.Intent[] r0 = r3.f12705a
            monitor-enter(r0)
            android.content.Intent[] r1 = r3.f12705a     // Catch:{ all -> 0x0023 }
            r1.notifyAll()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.vb.run():void");
    }
}
