package e8;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wi0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f17363a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f17364b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f17365c;

    /* renamed from: d  reason: collision with root package name */
    public final List<uh0> f17366d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f17367e;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wi0(int r9, byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11, boolean r12, long r13) {
        /*
            r8 = this;
            if (r11 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r4 = r0
            goto L_0x0042
        L_0x0005:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0003
        L_0x0010:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            java.util.Set r1 = r11.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            e8.uh0 r3 = new e8.uh0
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L_0x0021
        L_0x0042:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.wi0.<init>(int, byte[], java.util.Map, boolean, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wi0(int r9, byte[] r10, boolean r11, long r12, java.util.List<e8.uh0> r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L_0x0005
            r0 = 0
        L_0x0003:
            r3 = r0
            goto L_0x002f
        L_0x0005:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x0003
        L_0x0010:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L_0x001b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0003
            java.lang.Object r2 = r1.next()
            e8.uh0 r2 = (e8.uh0) r2
            java.lang.String r3 = r2.f16960a
            java.lang.String r2 = r2.f16961b
            r0.put(r3, r2)
            goto L_0x001b
        L_0x002f:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.wi0.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    public wi0(int i10, byte[] bArr, Map<String, String> map, List<uh0> list, boolean z10, long j10) {
        this.f17363a = i10;
        this.f17364b = bArr;
        this.f17365c = map;
        if (list == null) {
            this.f17366d = null;
        } else {
            this.f17366d = Collections.unmodifiableList(list);
        }
        this.f17367e = z10;
    }
}
