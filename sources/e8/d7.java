package e8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d7 {

    /* renamed from: e  reason: collision with root package name */
    public static final Comparator<byte[]> f14222e = new e8(0);

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f14223a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<byte[]> f14224b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    public int f14225c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f14226d = 4096;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x004b
            int r0 = r3.length     // Catch:{ all -> 0x0048 }
            int r1 = r2.f14226d     // Catch:{ all -> 0x0048 }
            if (r0 <= r1) goto L_0x0009
            goto L_0x004b
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f14223a     // Catch:{ all -> 0x0048 }
            r0.add(r3)     // Catch:{ all -> 0x0048 }
            java.util.List<byte[]> r0 = r2.f14224b     // Catch:{ all -> 0x0048 }
            java.util.Comparator<byte[]> r1 = f14222e     // Catch:{ all -> 0x0048 }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x0048 }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f14224b     // Catch:{ all -> 0x0048 }
            r1.add(r0, r3)     // Catch:{ all -> 0x0048 }
            int r0 = r2.f14225c     // Catch:{ all -> 0x0048 }
            int r3 = r3.length     // Catch:{ all -> 0x0048 }
            int r0 = r0 + r3
            r2.f14225c = r0     // Catch:{ all -> 0x0048 }
            monitor-enter(r2)     // Catch:{ all -> 0x0048 }
        L_0x0027:
            int r3 = r2.f14225c     // Catch:{ all -> 0x0045 }
            int r0 = r2.f14226d     // Catch:{ all -> 0x0045 }
            if (r3 <= r0) goto L_0x0042
            java.util.List<byte[]> r3 = r2.f14223a     // Catch:{ all -> 0x0045 }
            r0 = 0
            java.lang.Object r3 = r3.remove(r0)     // Catch:{ all -> 0x0045 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0045 }
            java.util.List<byte[]> r0 = r2.f14224b     // Catch:{ all -> 0x0045 }
            r0.remove(r3)     // Catch:{ all -> 0x0045 }
            int r0 = r2.f14225c     // Catch:{ all -> 0x0045 }
            int r3 = r3.length     // Catch:{ all -> 0x0045 }
            int r0 = r0 - r3
            r2.f14225c = r0     // Catch:{ all -> 0x0045 }
            goto L_0x0027
        L_0x0042:
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)
            return
        L_0x0045:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r3     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x004b:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.d7.a(byte[]):void");
    }

    public final synchronized byte[] b(int i10) {
        for (int i11 = 0; i11 < this.f14224b.size(); i11++) {
            byte[] bArr = this.f14224b.get(i11);
            if (bArr.length >= i10) {
                this.f14225c -= bArr.length;
                this.f14224b.remove(i11);
                this.f14223a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }
}
