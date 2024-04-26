package r6;

import b6.m;
import ba.f;
import ba.i0;
import ba.j0;
import ba.l0;
import ba.o0;
import ba.q;
import ba.s;
import ba.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import r6.h;
import v6.e0;
import x4.b0;
import x4.c1;
import z5.f0;
import z5.r;

/* compiled from: AdaptiveTrackSelection */
public class a extends c {

    /* renamed from: g  reason: collision with root package name */
    public final u6.b f24546g;

    /* renamed from: h  reason: collision with root package name */
    public final long f24547h;

    /* renamed from: i  reason: collision with root package name */
    public final long f24548i;

    /* renamed from: j  reason: collision with root package name */
    public final long f24549j;

    /* renamed from: k  reason: collision with root package name */
    public final float f24550k;

    /* renamed from: l  reason: collision with root package name */
    public final float f24551l;

    /* renamed from: m  reason: collision with root package name */
    public final s<C0234a> f24552m;

    /* renamed from: n  reason: collision with root package name */
    public final v6.b f24553n;

    /* renamed from: o  reason: collision with root package name */
    public float f24554o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public int f24555p;

    /* renamed from: q  reason: collision with root package name */
    public int f24556q = 0;

    /* renamed from: r  reason: collision with root package name */
    public long f24557r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public m f24558s;

    /* renamed from: r6.a$a  reason: collision with other inner class name */
    /* compiled from: AdaptiveTrackSelection */
    public static final class C0234a {

        /* renamed from: a  reason: collision with root package name */
        public final long f24559a;

        /* renamed from: b  reason: collision with root package name */
        public final long f24560b;

        public C0234a(long j10, long j11) {
            this.f24559a = j10;
            this.f24560b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0234a)) {
                return false;
            }
            C0234a aVar = (C0234a) obj;
            if (this.f24559a == aVar.f24559a && this.f24560b == aVar.f24560b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f24559a) * 31) + ((int) this.f24560b);
        }
    }

    /* compiled from: AdaptiveTrackSelection */
    public static class b implements h.b {

        /* renamed from: a  reason: collision with root package name */
        public final v6.b f24561a = v6.b.f26424a;

        public final h[] a(h.a[] aVarArr, u6.b bVar, r.a aVar, c1 c1Var) {
            int i10;
            h hVar;
            s<Object> sVar;
            double d10;
            double d11;
            h.a[] aVarArr2 = aVarArr;
            ArrayList arrayList = new ArrayList();
            char c10 = 0;
            int i11 = 0;
            while (true) {
                i10 = 1;
                if (i11 >= aVarArr2.length) {
                    break;
                }
                if (aVarArr2[i11] == null || aVarArr2[i11].f24650b.length <= 1) {
                    arrayList.add((Object) null);
                } else {
                    ba.a<Object> aVar2 = s.f3795b;
                    s.a aVar3 = new s.a();
                    aVar3.b(new C0234a(0, 0));
                    arrayList.add(aVar3);
                }
                i11++;
            }
            int length = aVarArr2.length;
            long[][] jArr = new long[length][];
            for (int i12 = 0; i12 < aVarArr2.length; i12++) {
                h.a aVar4 = aVarArr2[i12];
                if (aVar4 == null) {
                    jArr[i12] = new long[0];
                } else {
                    jArr[i12] = new long[aVar4.f24650b.length];
                    int i13 = 0;
                    while (true) {
                        int[] iArr = aVar4.f24650b;
                        if (i13 >= iArr.length) {
                            break;
                        }
                        jArr[i12][i13] = (long) aVar4.f24649a.f28584b[iArr[i13]].f27404h;
                        i13++;
                    }
                    Arrays.sort(jArr[i12]);
                }
            }
            int[] iArr2 = new int[length];
            long[] jArr2 = new long[length];
            for (int i14 = 0; i14 < length; i14++) {
                jArr2[i14] = jArr[i14].length == 0 ? 0 : jArr[i14][0];
            }
            a.v(arrayList, jArr2);
            l0 l0Var = l0.f3758a;
            ba.h.b(2, "expectedValuesPerKey");
            j0 j0Var = new j0(new TreeMap(l0Var), new i0(2));
            int i15 = 0;
            while (i15 < length) {
                if (jArr[i15].length > i10) {
                    int length2 = jArr[i15].length;
                    double[] dArr = new double[length2];
                    int i16 = 0;
                    while (true) {
                        d10 = 0.0d;
                        if (i16 >= jArr[i15].length) {
                            break;
                        }
                        if (jArr[i15][i16] != -1) {
                            d10 = Math.log((double) jArr[i15][i16]);
                        }
                        dArr[i16] = d10;
                        i16++;
                    }
                    int i17 = length2 - 1;
                    double d12 = dArr[i17] - dArr[c10];
                    int i18 = 0;
                    while (i18 < i17) {
                        double d13 = dArr[i18];
                        i18++;
                        double d14 = (d13 + dArr[i18]) * 0.5d;
                        if (d12 == d10) {
                            d11 = 1.0d;
                        } else {
                            d11 = (d14 - dArr[c10]) / d12;
                        }
                        Double valueOf = Double.valueOf(d11);
                        Integer valueOf2 = Integer.valueOf(i15);
                        Collection collection = j0Var.f3691d.get(valueOf);
                        if (collection == null) {
                            Collection h10 = j0Var.h();
                            if (h10.add(valueOf2)) {
                                j0Var.f3692e++;
                                j0Var.f3691d.put(valueOf, h10);
                            } else {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                        } else if (collection.add(valueOf2)) {
                            j0Var.f3692e++;
                        }
                        c10 = 0;
                        d10 = 0.0d;
                    }
                    continue;
                }
                i15++;
                c10 = 0;
                i10 = 1;
            }
            Collection collection2 = j0Var.f3725b;
            if (collection2 == null) {
                collection2 = new f.a();
                j0Var.f3725b = collection2;
            }
            s z10 = s.z(collection2);
            for (int i19 = 0; i19 < z10.size(); i19++) {
                int intValue = ((Integer) z10.get(i19)).intValue();
                int i20 = iArr2[intValue] + 1;
                iArr2[intValue] = i20;
                jArr2[intValue] = jArr[intValue][i20];
                a.v(arrayList, jArr2);
            }
            for (int i21 = 0; i21 < aVarArr2.length; i21++) {
                if (arrayList.get(i21) != null) {
                    jArr2[i21] = jArr2[i21] * 2;
                }
            }
            a.v(arrayList, jArr2);
            ba.h.b(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i22 = 0;
            int i23 = 0;
            while (i22 < arrayList.size()) {
                s.a aVar5 = (s.a) arrayList.get(i22);
                if (aVar5 == null) {
                    sVar = o0.f3765e;
                } else {
                    sVar = aVar5.c();
                }
                sVar.getClass();
                int i24 = i23 + 1;
                if (objArr.length < i24) {
                    objArr = Arrays.copyOf(objArr, q.b.a(objArr.length, i24));
                }
                objArr[i23] = sVar;
                i22++;
                i23 = i24;
            }
            s x10 = s.x(objArr, i23);
            h[] hVarArr = new h[aVarArr2.length];
            for (int i25 = 0; i25 < aVarArr2.length; i25++) {
                h.a aVar6 = aVarArr2[i25];
                if (aVar6 != null) {
                    int[] iArr3 = aVar6.f24650b;
                    if (iArr3.length != 0) {
                        if (iArr3.length == 1) {
                            hVar = new i(aVar6.f24649a, iArr3[0], aVar6.f24651c, aVar6.f24652d);
                        } else {
                            long j10 = (long) 25000;
                            hVar = new a(aVar6.f24649a, iArr3, bVar, (long) 10000, j10, j10, 0.7f, 0.75f, (s) ((o0) x10).get(i25), v6.b.f26424a);
                        }
                        hVarArr[i25] = hVar;
                    }
                }
            }
            return hVarArr;
        }
    }

    public a(f0 f0Var, int[] iArr, u6.b bVar, long j10, long j11, long j12, float f10, float f11, List<C0234a> list, v6.b bVar2) {
        super(f0Var, iArr);
        this.f24546g = bVar;
        this.f24547h = j10 * 1000;
        this.f24548i = j11 * 1000;
        this.f24549j = j12 * 1000;
        this.f24550k = f10;
        this.f24551l = f11;
        this.f24552m = s.z(list);
        this.f24553n = bVar2;
    }

    public static void v(List<s.a<C0234a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            s.a aVar = list.get(i10);
            if (aVar != null) {
                aVar.b(new C0234a(j10, jArr[i10]));
            }
        }
    }

    public void d() {
        this.f24557r = -9223372036854775807L;
        this.f24558s = null;
    }

    public void e() {
        this.f24558s = null;
    }

    public int g(long j10, List<? extends m> list) {
        int i10;
        int i11;
        long a10 = this.f24553n.a();
        long j11 = this.f24557r;
        if (!(j11 == -9223372036854775807L || a10 - j11 >= 1000 || (!list.isEmpty() && !((m) y.b(list)).equals(this.f24558s)))) {
            return list.size();
        }
        this.f24557r = a10;
        this.f24558s = list.isEmpty() ? null : (m) y.b(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long z10 = e0.z(((m) list.get(size - 1)).f3595g - j10, this.f24554o);
        long j12 = this.f24549j;
        if (z10 < j12) {
            return size;
        }
        b0 b0Var = this.f24568d[w(a10)];
        for (int i12 = 0; i12 < size; i12++) {
            m mVar = (m) list.get(i12);
            b0 b0Var2 = mVar.f3592d;
            if (e0.z(mVar.f3595g - j10, this.f24554o) >= j12 && b0Var2.f27404h < b0Var.f27404h && (i10 = b0Var2.f27414z) != -1 && i10 < 720 && (i11 = b0Var2.f27413y) != -1 && i11 < 1280 && i10 < b0Var.f27414z) {
                return i12;
            }
        }
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r8 < r10) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r8 >= r5.f24548i) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r12 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(long r6, long r8, long r10, java.util.List<? extends b6.m> r12, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] r13) {
        /*
            r5 = this;
            v6.b r6 = r5.f24553n
            long r6 = r6.a()
            int r13 = r5.f24556q
            r0 = 1
            if (r13 != 0) goto L_0x0014
            r5.f24556q = r0
            int r6 = r5.w(r6)
            r5.f24555p = r6
            return
        L_0x0014:
            int r1 = r5.f24555p
            boolean r2 = r12.isEmpty()
            r3 = -1
            if (r2 == 0) goto L_0x001f
            r2 = -1
            goto L_0x002b
        L_0x001f:
            java.lang.Object r2 = ba.y.b(r12)
            b6.m r2 = (b6.m) r2
            x4.b0 r2 = r2.f3592d
            int r2 = r5.o(r2)
        L_0x002b:
            if (r2 == r3) goto L_0x0036
            java.lang.Object r12 = ba.y.b(r12)
            b6.m r12 = (b6.m) r12
            int r13 = r12.f3593e
            r1 = r2
        L_0x0036:
            int r12 = r5.w(r6)
            boolean r6 = r5.u(r1, r6)
            if (r6 != 0) goto L_0x0076
            x4.b0[] r6 = r5.f24568d
            r7 = r6[r1]
            r6 = r6[r12]
            int r6 = r6.f27404h
            int r7 = r7.f27404h
            if (r6 <= r7) goto L_0x006d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x005c
            long r2 = r5.f24547h
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x0066
            float r10 = (float) r10
            float r11 = r5.f24551l
            float r10 = r10 * r11
            long r10 = (long) r10
            goto L_0x0068
        L_0x0066:
            long r10 = r5.f24547h
        L_0x0068:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            if (r6 >= r7) goto L_0x0076
            long r6 = r5.f24548i
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x0076
        L_0x0075:
            r12 = r1
        L_0x0076:
            if (r12 != r1) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r13 = 3
        L_0x007a:
            r5.f24556q = r13
            r5.f24555p = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.a.h(long, long, long, java.util.List, b6.n[]):void");
    }

    public int l() {
        return this.f24556q;
    }

    public int m() {
        return this.f24555p;
    }

    public void n(float f10) {
        this.f24554o = f10;
    }

    public Object p() {
        return null;
    }

    public final int w(long j10) {
        long e10 = (long) (((float) this.f24546g.e()) * this.f24550k);
        if (!this.f24552m.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f24552m.size() - 1 && this.f24552m.get(i10).f24559a < e10) {
                i10++;
            }
            C0234a aVar = this.f24552m.get(i10 - 1);
            C0234a aVar2 = this.f24552m.get(i10);
            long j11 = aVar.f24559a;
            long j12 = aVar.f24560b;
            e10 = ((long) ((((float) (e10 - j11)) / ((float) (aVar2.f24559a - j11))) * ((float) (aVar2.f24560b - j12)))) + j12;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f24566b; i12++) {
            if (j10 == Long.MIN_VALUE || !u(i12, j10)) {
                if (((long) Math.round(((float) this.f24568d[i12].f27404h) * this.f24554o)) <= e10) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
