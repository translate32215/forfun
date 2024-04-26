package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b2.t;
import b6.h;
import c5.j;
import c5.l;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import d6.d;
import d6.e;
import de.a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u6.f;
import u6.i;
import v6.e0;
import x4.b0;
import x4.z0;
import z5.c0;
import z5.f0;
import z5.g0;
import z5.o;
import z5.v;

/* compiled from: DashMediaPeriod */
public final class b implements o, c0.a<h<a>>, h.b<a> {
    public static final Pattern E = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern F = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public c0 A;
    public d6.b B;
    public int C;
    public List<e> D;

    /* renamed from: a  reason: collision with root package name */
    public final int f5064a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0075a f5065b;

    /* renamed from: c  reason: collision with root package name */
    public final i f5066c;

    /* renamed from: d  reason: collision with root package name */
    public final l f5067d;

    /* renamed from: e  reason: collision with root package name */
    public final u6.h f5068e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5069f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.o f5070g;

    /* renamed from: h  reason: collision with root package name */
    public final f f5071h;

    /* renamed from: i  reason: collision with root package name */
    public final g0 f5072i;

    /* renamed from: r  reason: collision with root package name */
    public final a[] f5073r;

    /* renamed from: s  reason: collision with root package name */
    public final a0 f5074s;

    /* renamed from: t  reason: collision with root package name */
    public final e f5075t;

    /* renamed from: u  reason: collision with root package name */
    public final IdentityHashMap<h<a>, e.c> f5076u = new IdentityHashMap<>();

    /* renamed from: v  reason: collision with root package name */
    public final v.a f5077v;

    /* renamed from: w  reason: collision with root package name */
    public final j.a f5078w;

    /* renamed from: x  reason: collision with root package name */
    public o.a f5079x;

    /* renamed from: y  reason: collision with root package name */
    public ChunkSampleStream<a>[] f5080y = new h[0];

    /* renamed from: z  reason: collision with root package name */
    public d[] f5081z = new d[0];

    /* compiled from: DashMediaPeriod */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f5082a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5083b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5084c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5085d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5086e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5087f;

        /* renamed from: g  reason: collision with root package name */
        public final int f5088g;

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f5083b = i10;
            this.f5082a = iArr;
            this.f5084c = i11;
            this.f5086e = i12;
            this.f5087f = i13;
            this.f5088g = i14;
            this.f5085d = i15;
        }
    }

    public b(int i10, d6.b bVar, int i11, a.C0075a aVar, i iVar, l lVar, j.a aVar2, u6.h hVar, v.a aVar3, long j10, com.google.android.exoplayer2.upstream.o oVar, f fVar, a0 a0Var, e.b bVar2) {
        List<d6.a> list;
        int i12;
        int i13;
        boolean z10;
        b0[] b0VarArr;
        d b10;
        d6.b bVar3 = bVar;
        int i14 = i11;
        l lVar2 = lVar;
        f fVar2 = fVar;
        this.f5064a = i10;
        this.B = bVar3;
        this.C = i14;
        this.f5065b = aVar;
        this.f5066c = iVar;
        this.f5067d = lVar2;
        this.f5078w = aVar2;
        this.f5068e = hVar;
        this.f5077v = aVar3;
        this.f5069f = j10;
        this.f5070g = oVar;
        this.f5071h = fVar2;
        this.f5074s = a0Var;
        this.f5075t = new e(bVar3, bVar2, fVar2);
        int i15 = 0;
        ChunkSampleStream<a>[] chunkSampleStreamArr = this.f5080y;
        a0Var.getClass();
        this.A = new t((c0[]) chunkSampleStreamArr);
        d6.f fVar3 = bVar3.f13089m.get(i14);
        List<d6.e> list2 = fVar3.f13112d;
        this.D = list2;
        List<d6.a> list3 = fVar3.f13111c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i16 = 0; i16 < size; i16++) {
            sparseIntArray.put(list3.get(i16).f13071a, i16);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i16));
            arrayList.add(arrayList2);
            sparseArray.put(i16, arrayList2);
        }
        for (int i17 = 0; i17 < size; i17++) {
            d6.a aVar4 = list3.get(i17);
            d b11 = b(aVar4.f13075e, "http://dashif.org/guidelines/trickmode");
            b11 = b11 == null ? b(aVar4.f13076f, "http://dashif.org/guidelines/trickmode") : b11;
            int i18 = (b11 == null || (i18 = sparseIntArray.get(Integer.parseInt(b11.f13103b), -1)) == -1) ? i17 : i18;
            if (i18 == i17 && (b10 = b(aVar4.f13076f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                for (String parseInt : e0.R(b10.f13103b, ",")) {
                    int i19 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i19 != -1) {
                        i18 = Math.min(i18, i19);
                    }
                }
            }
            if (i18 != i17) {
                List list4 = (List) sparseArray.get(i17);
                List list5 = (List) sparseArray.get(i18);
                list5.addAll(list4);
                sparseArray.put(i17, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i20 = 0; i20 < size2; i20++) {
            iArr[i20] = da.a.b((Collection) arrayList.get(i20));
            Arrays.sort(iArr[i20]);
        }
        boolean[] zArr = new boolean[size2];
        b0[][] b0VarArr2 = new b0[size2][];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr2 = iArr[i21];
            int length = iArr2.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length) {
                    z10 = false;
                    break;
                }
                List<d6.i> list6 = list3.get(iArr2[i23]).f13073c;
                while (i15 < list6.size()) {
                    if (!list6.get(i15).f13125d.isEmpty()) {
                        z10 = true;
                        break;
                    }
                    i15++;
                }
                i23++;
                i15 = 0;
            }
            if (z10) {
                zArr[i21] = true;
                i22++;
            }
            int[] iArr3 = iArr[i21];
            int length2 = iArr3.length;
            int i24 = 0;
            while (true) {
                if (i24 >= length2) {
                    b0VarArr = new b0[0];
                    break;
                }
                int i25 = iArr3[i24];
                d6.a aVar5 = list3.get(i25);
                List<d> list7 = list3.get(i25).f13074d;
                int i26 = 0;
                int[] iArr4 = iArr3;
                while (i26 < list7.size()) {
                    d dVar = list7.get(i26);
                    int i27 = length2;
                    List<d> list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f13102a)) {
                        b0.b bVar4 = new b0.b();
                        bVar4.f27425k = "application/cea-608";
                        bVar4.f27415a = v.e.a(new StringBuilder(), aVar5.f13071a, ":cea608");
                        b0VarArr = l(dVar, E, bVar4.a());
                        break;
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f13102a)) {
                        b0.b bVar5 = new b0.b();
                        bVar5.f27425k = "application/cea-708";
                        bVar5.f27415a = v.e.a(new StringBuilder(), aVar5.f13071a, ":cea708");
                        b0VarArr = l(dVar, F, bVar5.a());
                        break;
                    } else {
                        i26++;
                        length2 = i27;
                        list7 = list8;
                    }
                }
                int i28 = length2;
                i24++;
                iArr3 = iArr4;
            }
            b0VarArr2[i21] = b0VarArr;
            if (b0VarArr2[i21].length != 0) {
                i22++;
            }
            i21++;
            i15 = 0;
        }
        int size3 = list2.size() + i22 + size2;
        f0[] f0VarArr = new f0[size3];
        a[] aVarArr = new a[size3];
        int i29 = 0;
        int i30 = 0;
        while (i29 < size2) {
            int[] iArr5 = iArr[i29];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i31 = size2;
            int i32 = 0;
            while (i32 < length3) {
                arrayList3.addAll(list3.get(iArr5[i32]).f13073c);
                i32++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            b0[] b0VarArr3 = new b0[size4];
            int i33 = 0;
            while (i33 < size4) {
                int i34 = size4;
                b0 b0Var = ((d6.i) arrayList3.get(i33)).f13122a;
                b0VarArr3[i33] = b0Var.b(lVar2.c(b0Var));
                i33++;
                size4 = i34;
                arrayList3 = arrayList3;
            }
            d6.a aVar6 = list3.get(iArr5[0]);
            int i35 = i30 + 1;
            if (zArr[i29]) {
                list = list3;
                i12 = i35;
                i35++;
            } else {
                i12 = -1;
                list = list3;
            }
            if (b0VarArr2[i29].length != 0) {
                i13 = i35 + 1;
            } else {
                i13 = i35;
                i35 = -1;
            }
            f0VarArr[i30] = new f0(b0VarArr3);
            aVarArr[i30] = new a(aVar6.f13072b, 0, iArr5, i30, i12, i35, -1);
            int i36 = -1;
            if (i12 != -1) {
                b0.b bVar6 = new b0.b();
                bVar6.f27415a = v.e.a(new StringBuilder(), aVar6.f13071a, ":emsg");
                bVar6.f27425k = "application/x-emsg";
                f0VarArr[i12] = new f0(bVar6.a());
                aVarArr[i12] = new a(5, 1, iArr5, i30, -1, -1, -1);
                i36 = -1;
            }
            if (i35 != i36) {
                f0VarArr[i35] = new f0(b0VarArr2[i29]);
                aVarArr[i35] = new a(3, 1, iArr5, i30, -1, -1, -1);
            }
            i29++;
            size2 = i31;
            i30 = i13;
            lVar2 = lVar;
            iArr = iArr6;
            list3 = list;
        }
        int i37 = 0;
        while (i37 < list2.size()) {
            b0.b bVar7 = new b0.b();
            bVar7.f27415a = list2.get(i37).a();
            bVar7.f27425k = "application/x-emsg";
            f0VarArr[i30] = new f0(bVar7.a());
            aVarArr[i30] = new a(5, 2, new int[0], -1, -1, -1, i37);
            i37++;
            i30++;
        }
        Pair create = Pair.create(new g0(f0VarArr), aVarArr);
        this.f5072i = (g0) create.first;
        this.f5073r = (a[]) create.second;
    }

    public static d b(List<d> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            if (str.equals(dVar.f13102a)) {
                return dVar;
            }
        }
        return null;
    }

    public static b0[] l(d dVar, Pattern pattern, b0 b0Var) {
        String str = dVar.f13103b;
        if (str == null) {
            return new b0[]{b0Var};
        }
        int i10 = e0.f26436a;
        String[] split = str.split(";", -1);
        b0[] b0VarArr = new b0[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new b0[]{b0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            b0.b a10 = b0Var.a();
            a10.f27415a = b0Var.f27397a + ":" + parseInt;
            a10.C = parseInt;
            a10.f27417c = matcher.group(2);
            b0VarArr[i11] = a10.a();
        }
        return b0VarArr;
    }

    public void A(long j10, boolean z10) {
        for (h A2 : this.f5080y) {
            A2.A(j10, z10);
        }
    }

    public long D(long j10) {
        for (h z10 : this.f5080y) {
            z10.z(j10);
        }
        for (d a10 : this.f5081z) {
            a10.a(j10);
        }
        return j10;
    }

    public void E(o.a aVar, long j10) {
        this.f5079x = aVar;
        aVar.k(this);
    }

    public long a() {
        return this.A.a();
    }

    public long c(long j10, z0 z0Var) {
        for (h hVar : this.f5080y) {
            if (hVar.f3600a == 2) {
                return hVar.f3604e.c(j10, z0Var);
            }
        }
        return j10;
    }

    public void d(c0 c0Var) {
        this.f5079x.d(this);
    }

    public long e() {
        return this.A.e();
    }

    public boolean f(long j10) {
        return this.A.f(j10);
    }

    public void g(long j10) {
        this.A.g(j10);
    }

    public final int h(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f5073r[i11].f5086e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f5073r[i14].f5084c == 0) {
                return i13;
            }
        }
        return -1;
    }

    public long i(r6.h[] hVarArr, boolean[] zArr, z5.b0[] b0VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        f0 f0Var;
        f0 f0Var2;
        int i13;
        e.c cVar;
        r6.h[] hVarArr2 = hVarArr;
        long j11 = j10;
        int[] iArr3 = new int[hVarArr2.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= hVarArr2.length) {
                break;
            }
            if (hVarArr2[i14] != null) {
                iArr3[i14] = this.f5072i.a(hVarArr2[i14].j());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < hVarArr2.length; i15++) {
            if (hVarArr2[i15] == null || !zArr[i15]) {
                if (b0VarArr[i15] instanceof h) {
                    b0VarArr[i15].w(this);
                } else if (b0VarArr[i15] instanceof h.a) {
                    b0VarArr[i15].c();
                }
                b0VarArr[i15] = null;
            }
        }
        int i16 = 0;
        while (true) {
            z10 = true;
            if (i16 >= hVarArr2.length) {
                break;
            }
            if ((b0VarArr[i16] instanceof z5.h) || (b0VarArr[i16] instanceof h.a)) {
                int h10 = h(i16, iArr3);
                if (h10 == -1) {
                    z10 = b0VarArr[i16] instanceof z5.h;
                } else if (!(b0VarArr[i16] instanceof h.a) || b0VarArr[i16].f3618a != b0VarArr[h10]) {
                    z10 = false;
                }
                if (!z10) {
                    if (b0VarArr[i16] instanceof h.a) {
                        b0VarArr[i16].c();
                    }
                    b0VarArr[i16] = null;
                }
            }
            i16++;
        }
        z5.b0[] b0VarArr2 = b0VarArr;
        int i17 = 0;
        while (i17 < hVarArr2.length) {
            r6.h hVar = hVarArr2[i17];
            if (hVar == null) {
                i11 = i17;
                iArr2 = iArr3;
            } else if (b0VarArr2[i17] == null) {
                zArr2[i17] = z10;
                a aVar = this.f5073r[iArr3[i17]];
                int i18 = aVar.f5084c;
                if (i18 == 0) {
                    int i19 = aVar.f5087f;
                    boolean z11 = i19 != i10;
                    if (z11) {
                        f0Var = this.f5072i.f28590b[i19];
                        i12 = 1;
                    } else {
                        f0Var = null;
                        i12 = 0;
                    }
                    int i20 = aVar.f5088g;
                    boolean z12 = i20 != i10;
                    if (z12) {
                        f0Var2 = this.f5072i.f28590b[i20];
                        i12 += f0Var2.f28583a;
                    } else {
                        f0Var2 = null;
                    }
                    b0[] b0VarArr3 = new b0[i12];
                    int[] iArr4 = new int[i12];
                    if (z11) {
                        b0VarArr3[0] = f0Var.f28584b[0];
                        iArr4[0] = 5;
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (z12) {
                        for (int i21 = 0; i21 < f0Var2.f28583a; i21++) {
                            b0VarArr3[i13] = f0Var2.f28584b[i21];
                            iArr4[i13] = 3;
                            arrayList.add(b0VarArr3[i13]);
                            i13 += z10 ? 1 : 0;
                        }
                    }
                    if (!this.B.f13080d || !z11) {
                        cVar = null;
                    } else {
                        e eVar = this.f5075t;
                        cVar = new e.c(eVar.f5115a);
                    }
                    i11 = i17;
                    iArr2 = iArr3;
                    e.c cVar2 = cVar;
                    h hVar2 = r1;
                    h hVar3 = new h(aVar.f5083b, iArr4, b0VarArr3, this.f5065b.a(this.f5070g, this.B, this.C, aVar.f5082a, hVar, aVar.f5083b, this.f5069f, z11, arrayList, cVar, this.f5066c), this, this.f5071h, j10, this.f5067d, this.f5078w, this.f5068e, this.f5077v);
                    synchronized (this) {
                        this.f5076u.put(hVar2, cVar2);
                    }
                    b0VarArr[i11] = hVar2;
                    b0VarArr2 = b0VarArr;
                } else {
                    i11 = i17;
                    iArr2 = iArr3;
                    if (i18 == 2) {
                        b0VarArr2[i11] = new d(this.D.get(aVar.f5085d), hVar.j().f28584b[0], this.B.f13080d);
                    }
                }
            } else {
                i11 = i17;
                iArr2 = iArr3;
                if (b0VarArr2[i11] instanceof h) {
                    ((a) ((h) b0VarArr2[i11]).f3604e).d(hVar);
                }
            }
            i17 = i11 + 1;
            hVarArr2 = hVarArr;
            long j12 = j10;
            iArr3 = iArr2;
            z10 = true;
            i10 = -1;
        }
        int[] iArr5 = iArr3;
        r6.h[] hVarArr3 = hVarArr;
        int i22 = 0;
        while (i22 < hVarArr3.length) {
            if (b0VarArr2[i22] != null || hVarArr3[i22] == null) {
                long j13 = j10;
                iArr = iArr5;
            } else {
                a aVar2 = this.f5073r[iArr5[i22]];
                if (aVar2.f5084c == 1) {
                    iArr = iArr5;
                    int h11 = h(i22, iArr);
                    if (h11 == -1) {
                        b0VarArr2[i22] = new z5.h();
                        long j14 = j10;
                    } else {
                        h hVar4 = (h) b0VarArr2[h11];
                        int i23 = aVar2.f5083b;
                        int i24 = 0;
                        while (i24 < hVar4.f3613v.length) {
                            if (hVar4.f3601b[i24] == i23) {
                                v6.a.d(!hVar4.f3603d[i24]);
                                hVar4.f3603d[i24] = true;
                                hVar4.f3613v[i24].F(j10, true);
                                b0VarArr2[i22] = new h.a(hVar4, hVar4.f3613v[i24], i24);
                            } else {
                                long j15 = j10;
                                i24++;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i22++;
                    iArr5 = iArr;
                } else {
                    long j16 = j10;
                    iArr = iArr5;
                }
            }
            i22++;
            iArr5 = iArr;
        }
        long j17 = j10;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (z5.b0 b0Var : b0VarArr2) {
            if (b0Var instanceof h) {
                arrayList2.add((h) b0Var);
            } else if (b0Var instanceof d) {
                arrayList3.add((d) b0Var);
            }
        }
        h[] hVarArr4 = new h[arrayList2.size()];
        this.f5080y = hVarArr4;
        arrayList2.toArray(hVarArr4);
        d[] dVarArr = new d[arrayList3.size()];
        this.f5081z = dVarArr;
        arrayList3.toArray(dVarArr);
        a0 a0Var = this.f5074s;
        ChunkSampleStream<a>[] chunkSampleStreamArr = this.f5080y;
        a0Var.getClass();
        this.A = new t((c0[]) chunkSampleStreamArr);
        return j17;
    }

    public boolean j() {
        return this.A.j();
    }

    public long r() {
        return -9223372036854775807L;
    }

    public g0 v() {
        return this.f5072i;
    }

    public void y() throws IOException {
        this.f5070g.b();
    }
}
