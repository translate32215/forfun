package f7;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, List<Map<String, Object>>> f18256a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static List<MediaCodecInfo> f18257b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f18258c = new Object();

    @TargetApi(21)
    public static Integer[] a(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @android.annotation.TargetApi(16)
    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b(java.lang.String r14) {
        /*
            java.lang.Object r0 = f18258c
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r1 = f18256a     // Catch:{ all -> 0x0159 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0159 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x0159 }
            if (r1 == 0) goto L_0x0019
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r1 = f18256a     // Catch:{ all -> 0x0159 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0159 }
            java.lang.Object r14 = r1.get(r14)     // Catch:{ all -> 0x0159 }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x0159 }
            monitor-exit(r0)     // Catch:{ all -> 0x0159 }
            return r14
        L_0x0019:
            monitor-enter(r0)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.util.List<android.media.MediaCodecInfo> r1 = f18257b     // Catch:{ all -> 0x0130 }
            r2 = 21
            r3 = 0
            if (r1 == 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x0130 }
            goto L_0x0052
        L_0x0023:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0130 }
            if (r1 < r2) goto L_0x0037
            android.media.MediaCodecList r1 = new android.media.MediaCodecList     // Catch:{ all -> 0x0130 }
            r1.<init>(r3)     // Catch:{ all -> 0x0130 }
            android.media.MediaCodecInfo[] r1 = r1.getCodecInfos()     // Catch:{ all -> 0x0130 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x0130 }
            f18257b = r1     // Catch:{ all -> 0x0130 }
            goto L_0x0051
        L_0x0037:
            int r1 = android.media.MediaCodecList.getCodecCount()     // Catch:{ all -> 0x0130 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0130 }
            r4.<init>(r1)     // Catch:{ all -> 0x0130 }
            f18257b = r4     // Catch:{ all -> 0x0130 }
            r4 = 0
        L_0x0043:
            if (r4 >= r1) goto L_0x0051
            android.media.MediaCodecInfo r5 = android.media.MediaCodecList.getCodecInfoAt(r4)     // Catch:{ all -> 0x0130 }
            java.util.List<android.media.MediaCodecInfo> r6 = f18257b     // Catch:{ all -> 0x0130 }
            r6.add(r5)     // Catch:{ all -> 0x0130 }
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0130 }
        L_0x0052:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.util.List<android.media.MediaCodecInfo> r4 = f18257b     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
        L_0x005d:
            boolean r5 = r4.hasNext()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            if (r5 == 0) goto L_0x0127
            java.lang.Object r5 = r4.next()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            android.media.MediaCodecInfo r5 = (android.media.MediaCodecInfo) r5     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            boolean r6 = r5.isEncoder()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            if (r6 != 0) goto L_0x005d
            java.lang.String[] r6 = r5.getSupportedTypes()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            boolean r6 = r6.contains(r14)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            if (r6 == 0) goto L_0x005d
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.String r7 = "codecName"
            java.lang.String r8 = r5.getName()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.put(r7, r8)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            android.media.MediaCodecInfo$CodecCapabilities r5 = r5.getCapabilitiesForType(r14)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r7.<init>()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            android.media.MediaCodecInfo$CodecProfileLevel[] r8 = r5.profileLevels     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            int r9 = r8.length     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r10 = 0
        L_0x0098:
            if (r10 >= r9) goto L_0x00b6
            r11 = r8[r10]     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r12 = 2
            java.lang.Integer[] r12 = new java.lang.Integer[r12]     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            int r13 = r11.profile     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r12[r3] = r13     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            int r11 = r11.level     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r13 = 1
            r12[r13] = r11     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r7.add(r12)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            int r10 = r10 + 1
            goto L_0x0098
        L_0x00b6:
            java.lang.String r8 = "profileLevels"
            r6.put(r8, r7)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            if (r7 < r2) goto L_0x0111
            android.media.MediaCodecInfo$VideoCapabilities r8 = r5.getVideoCapabilities()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.String r9 = "bitRatesBps"
            android.util.Range r10 = r8.getBitrateRange()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer[] r10 = a(r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.String r9 = "widthAlignment"
            int r10 = r8.getWidthAlignment()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.String r9 = "heightAlignment"
            int r10 = r8.getHeightAlignment()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.String r9 = "frameRates"
            android.util.Range r10 = r8.getSupportedFrameRates()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer[] r10 = a(r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.String r9 = "widths"
            android.util.Range r10 = r8.getSupportedWidths()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer[] r10 = a(r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.String r9 = "heights"
            android.util.Range r8 = r8.getSupportedHeights()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer[] r8 = a(r8)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.put(r9, r8)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
        L_0x0111:
            r8 = 23
            if (r7 < r8) goto L_0x0122
            java.lang.String r7 = "instancesLimit"
            int r5 = r5.getMaxSupportedInstances()     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r6.put(r7, r5)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
        L_0x0122:
            r1.add(r6)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            goto L_0x005d
        L_0x0127:
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r2 = f18256a     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            r2.put(r14, r1)     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
            monitor-exit(r0)     // Catch:{ all -> 0x0159 }
            return r1
        L_0x0130:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0130 }
            throw r1     // Catch:{ RuntimeException -> 0x0135, LinkageError -> 0x0133 }
        L_0x0133:
            r1 = move-exception
            goto L_0x0136
        L_0x0135:
            r1 = move-exception
        L_0x0136:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0159 }
            r2.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.String r3 = "error"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0159 }
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x0159 }
            r2.put(r3, r1)     // Catch:{ all -> 0x0159 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0159 }
            r1.<init>()     // Catch:{ all -> 0x0159 }
            r1.add(r2)     // Catch:{ all -> 0x0159 }
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r2 = f18256a     // Catch:{ all -> 0x0159 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x0159 }
            r2.put(r14, r1)     // Catch:{ all -> 0x0159 }
            monitor-exit(r0)     // Catch:{ all -> 0x0159 }
            return r1
        L_0x0159:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0159 }
            goto L_0x015d
        L_0x015c:
            throw r14
        L_0x015d:
            goto L_0x015c
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.b0.b(java.lang.String):java.util.List");
    }
}
