package n5;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import d5.i;
import d5.j;
import d5.k;
import d5.w;
import d5.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.e0;
import q.e;
import v6.b0;
import v6.v;
import x4.m0;

/* compiled from: TsExtractor */
public final class d0 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final int f22032a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b0> f22033b;

    /* renamed from: c  reason: collision with root package name */
    public final v f22034c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f22035d;

    /* renamed from: e  reason: collision with root package name */
    public final e0.c f22036e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseArray<e0> f22037f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseBooleanArray f22038g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseBooleanArray f22039h;

    /* renamed from: i  reason: collision with root package name */
    public final b0 f22040i;

    /* renamed from: j  reason: collision with root package name */
    public a0 f22041j;

    /* renamed from: k  reason: collision with root package name */
    public k f22042k;

    /* renamed from: l  reason: collision with root package name */
    public int f22043l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22044m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f22045n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f22046o;

    /* renamed from: p  reason: collision with root package name */
    public e0 f22047p;

    /* renamed from: q  reason: collision with root package name */
    public int f22048q;

    /* renamed from: r  reason: collision with root package name */
    public int f22049r;

    /* compiled from: TsExtractor */
    public class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final d5.b0 f22050a = new d5.b0(new byte[4], 1, (e) null);

        public a() {
        }

        public void b(b0 b0Var, k kVar, e0.d dVar) {
        }

        public void c(v vVar) {
            if (vVar.s() == 0 && (vVar.s() & 128) != 0) {
                vVar.E(6);
                int a10 = vVar.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    vVar.d(this.f22050a, 4);
                    int i11 = this.f22050a.i(16);
                    this.f22050a.s(3);
                    if (i11 == 0) {
                        this.f22050a.s(13);
                    } else {
                        int i12 = this.f22050a.i(13);
                        if (d0.this.f22037f.get(i12) == null) {
                            d0 d0Var = d0.this;
                            d0Var.f22037f.put(i12, new y(new b(i12)));
                            d0.this.f22043l++;
                        }
                    }
                }
                d0 d0Var2 = d0.this;
                if (d0Var2.f22032a != 2) {
                    d0Var2.f22037f.remove(0);
                }
            }
        }
    }

    /* compiled from: TsExtractor */
    public class b implements x {

        /* renamed from: a  reason: collision with root package name */
        public final d5.b0 f22052a = new d5.b0(new byte[5], 1, (e) null);

        /* renamed from: b  reason: collision with root package name */
        public final SparseArray<e0> f22053b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        public final SparseIntArray f22054c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        public final int f22055d;

        public b(int i10) {
            this.f22055d = i10;
        }

        public void b(b0 b0Var, k kVar, e0.d dVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x013d, code lost:
            if (r24.s() == r13) goto L_0x013f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0222  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x022f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(v6.v r24) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                int r2 = r24.s()
                r3 = 2
                if (r2 == r3) goto L_0x000c
                return
            L_0x000c:
                n5.d0 r2 = n5.d0.this
                int r4 = r2.f22032a
                r5 = 0
                r6 = 1
                if (r4 == r6) goto L_0x0034
                if (r4 == r3) goto L_0x0034
                int r4 = r2.f22043l
                if (r4 != r6) goto L_0x001b
                goto L_0x0034
            L_0x001b:
                v6.b0 r4 = new v6.b0
                java.util.List<v6.b0> r2 = r2.f22033b
                java.lang.Object r2 = r2.get(r5)
                v6.b0 r2 = (v6.b0) r2
                long r7 = r2.c()
                r4.<init>(r7)
                n5.d0 r2 = n5.d0.this
                java.util.List<v6.b0> r2 = r2.f22033b
                r2.add(r4)
                goto L_0x003d
            L_0x0034:
                java.util.List<v6.b0> r2 = r2.f22033b
                java.lang.Object r2 = r2.get(r5)
                r4 = r2
                v6.b0 r4 = (v6.b0) r4
            L_0x003d:
                int r2 = r24.s()
                r2 = r2 & 128(0x80, float:1.794E-43)
                if (r2 != 0) goto L_0x0046
                return
            L_0x0046:
                r1.E(r6)
                int r2 = r24.x()
                r7 = 3
                r1.E(r7)
                d5.b0 r8 = r0.f22052a
                r1.d(r8, r3)
                d5.b0 r8 = r0.f22052a
                r8.s(r7)
                n5.d0 r8 = n5.d0.this
                d5.b0 r9 = r0.f22052a
                r10 = 13
                int r9 = r9.i(r10)
                r8.f22049r = r9
                d5.b0 r8 = r0.f22052a
                r1.d(r8, r3)
                d5.b0 r8 = r0.f22052a
                r9 = 4
                r8.s(r9)
                d5.b0 r8 = r0.f22052a
                r11 = 12
                int r8 = r8.i(r11)
                r1.E(r8)
                n5.d0 r8 = n5.d0.this
                int r12 = r8.f22032a
                r13 = 21
                r14 = 0
                r15 = 8192(0x2000, float:1.14794E-41)
                if (r12 != r3) goto L_0x00ab
                n5.e0 r8 = r8.f22047p
                if (r8 != 0) goto L_0x00ab
                n5.e0$b r8 = new n5.e0$b
                byte[] r12 = v6.e0.f26441f
                r8.<init>(r13, r14, r14, r12)
                n5.d0 r12 = n5.d0.this
                n5.e0$c r14 = r12.f22036e
                n5.e0 r8 = r14.b(r13, r8)
                r12.f22047p = r8
                n5.d0 r8 = n5.d0.this
                n5.e0 r12 = r8.f22047p
                d5.k r8 = r8.f22042k
                n5.e0$d r14 = new n5.e0$d
                r14.<init>(r2, r13, r15)
                r12.b(r4, r8, r14)
            L_0x00ab:
                android.util.SparseArray<n5.e0> r8 = r0.f22053b
                r8.clear()
                android.util.SparseIntArray r8 = r0.f22054c
                r8.clear()
                int r8 = r24.a()
            L_0x00b9:
                if (r8 <= 0) goto L_0x024e
                d5.b0 r14 = r0.f22052a
                r12 = 5
                r1.d(r14, r12)
                d5.b0 r14 = r0.f22052a
                r6 = 8
                int r6 = r14.i(r6)
                d5.b0 r14 = r0.f22052a
                r14.s(r7)
                d5.b0 r14 = r0.f22052a
                int r14 = r14.i(r10)
                d5.b0 r10 = r0.f22052a
                r10.s(r9)
                d5.b0 r10 = r0.f22052a
                int r10 = r10.i(r11)
                int r11 = r1.f26519b
                int r15 = r10 + r11
                r3 = -1
                r17 = 0
                r18 = 0
            L_0x00e8:
                int r5 = r1.f26519b
                if (r5 >= r15) goto L_0x01ce
                int r5 = r24.s()
                int r16 = r24.s()
                int r9 = r1.f26519b
                int r9 = r9 + r16
                if (r9 <= r15) goto L_0x00fc
                goto L_0x01ce
            L_0x00fc:
                r7 = 89
                if (r5 != r12) goto L_0x0126
                long r19 = r24.t()
                r21 = 1094921523(0x41432d33, double:5.409631094E-315)
                int r5 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r5 != 0) goto L_0x010c
                goto L_0x012a
            L_0x010c:
                r21 = 1161904947(0x45414333, double:5.74057318E-315)
                int r5 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r5 != 0) goto L_0x0114
                goto L_0x0132
            L_0x0114:
                r21 = 1094921524(0x41432d34, double:5.4096311E-315)
                int r5 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r5 != 0) goto L_0x011c
                goto L_0x013f
            L_0x011c:
                r21 = 1212503619(0x48455643, double:5.990563836E-315)
                int r5 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r5 != 0) goto L_0x012c
                r3 = 36
                goto L_0x012c
            L_0x0126:
                r12 = 106(0x6a, float:1.49E-43)
                if (r5 != r12) goto L_0x012e
            L_0x012a:
                r3 = 129(0x81, float:1.81E-43)
            L_0x012c:
                r12 = 3
                goto L_0x0156
            L_0x012e:
                r12 = 122(0x7a, float:1.71E-43)
                if (r5 != r12) goto L_0x0135
            L_0x0132:
                r3 = 135(0x87, float:1.89E-43)
                goto L_0x012c
            L_0x0135:
                r12 = 127(0x7f, float:1.78E-43)
                if (r5 != r12) goto L_0x0142
                int r5 = r24.s()
                if (r5 != r13) goto L_0x012c
            L_0x013f:
                r3 = 172(0xac, float:2.41E-43)
                goto L_0x012c
            L_0x0142:
                r12 = 123(0x7b, float:1.72E-43)
                if (r5 != r12) goto L_0x0149
                r3 = 138(0x8a, float:1.93E-43)
                goto L_0x012c
            L_0x0149:
                r12 = 10
                if (r5 != r12) goto L_0x015e
                r12 = 3
                java.lang.String r5 = r1.p(r12)
                java.lang.String r17 = r5.trim()
            L_0x0156:
                r21 = r2
                r20 = r4
                r22 = r14
                r12 = 4
                goto L_0x01bb
            L_0x015e:
                r12 = 3
                if (r5 != r7) goto L_0x01ac
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x0166:
                int r5 = r1.f26519b
                if (r5 >= r9) goto L_0x01a0
                java.lang.String r5 = r1.p(r12)
                java.lang.String r5 = r5.trim()
                int r7 = r24.s()
                r12 = 4
                byte[] r13 = new byte[r12]
                r20 = r4
                byte[] r4 = r1.f26518a
                r21 = r2
                int r2 = r1.f26519b
                r22 = r14
                r14 = 0
                java.lang.System.arraycopy(r4, r2, r13, r14, r12)
                int r2 = r1.f26519b
                int r2 = r2 + r12
                r1.f26519b = r2
                n5.e0$a r2 = new n5.e0$a
                r2.<init>(r5, r7, r13)
                r3.add(r2)
                r4 = r20
                r2 = r21
                r14 = r22
                r7 = 89
                r12 = 3
                r13 = 21
                goto L_0x0166
            L_0x01a0:
                r21 = r2
                r20 = r4
                r22 = r14
                r12 = 4
                r18 = r3
                r3 = 89
                goto L_0x01bb
            L_0x01ac:
                r21 = r2
                r20 = r4
                r22 = r14
                r12 = 4
                r2 = 111(0x6f, float:1.56E-43)
                if (r5 != r2) goto L_0x01bb
                r2 = 257(0x101, float:3.6E-43)
                r3 = 257(0x101, float:3.6E-43)
            L_0x01bb:
                int r2 = r1.f26519b
                int r9 = r9 - r2
                r1.E(r9)
                r4 = r20
                r2 = r21
                r14 = r22
                r7 = 3
                r9 = 4
                r12 = 5
                r13 = 21
                goto L_0x00e8
            L_0x01ce:
                r21 = r2
                r20 = r4
                r22 = r14
                r12 = 4
                r1.D(r15)
                n5.e0$b r2 = new n5.e0$b
                byte[] r4 = r1.f26518a
                byte[] r4 = java.util.Arrays.copyOfRange(r4, r11, r15)
                r5 = r17
                r7 = r18
                r2.<init>(r3, r5, r7, r4)
                r4 = 6
                if (r6 == r4) goto L_0x01ed
                r4 = 5
                if (r6 != r4) goto L_0x01ee
            L_0x01ed:
                r6 = r3
            L_0x01ee:
                int r10 = r10 + 5
                int r8 = r8 - r10
                n5.d0 r3 = n5.d0.this
                int r4 = r3.f22032a
                r5 = 2
                if (r4 != r5) goto L_0x01fa
                r4 = r6
                goto L_0x01fc
            L_0x01fa:
                r4 = r22
            L_0x01fc:
                android.util.SparseBooleanArray r3 = r3.f22038g
                boolean r3 = r3.get(r4)
                if (r3 == 0) goto L_0x0207
                r7 = 21
                goto L_0x023b
            L_0x0207:
                n5.d0 r3 = n5.d0.this
                int r7 = r3.f22032a
                if (r7 != r5) goto L_0x0214
                r7 = 21
                if (r6 != r7) goto L_0x0216
                n5.e0 r2 = r3.f22047p
                goto L_0x021c
            L_0x0214:
                r7 = 21
            L_0x0216:
                n5.e0$c r3 = r3.f22036e
                n5.e0 r2 = r3.b(r6, r2)
            L_0x021c:
                n5.d0 r3 = n5.d0.this
                int r3 = r3.f22032a
                if (r3 != r5) goto L_0x022f
                android.util.SparseIntArray r3 = r0.f22054c
                r5 = 8192(0x2000, float:1.14794E-41)
                int r3 = r3.get(r4, r5)
                r5 = r22
                if (r5 >= r3) goto L_0x023b
                goto L_0x0231
            L_0x022f:
                r5 = r22
            L_0x0231:
                android.util.SparseIntArray r3 = r0.f22054c
                r3.put(r4, r5)
                android.util.SparseArray<n5.e0> r3 = r0.f22053b
                r3.put(r4, r2)
            L_0x023b:
                r4 = r20
                r2 = r21
                r3 = 2
                r5 = 0
                r6 = 1
                r7 = 3
                r9 = 4
                r10 = 13
                r11 = 12
                r13 = 21
                r15 = 8192(0x2000, float:1.14794E-41)
                goto L_0x00b9
            L_0x024e:
                r21 = r2
                r20 = r4
                android.util.SparseIntArray r1 = r0.f22054c
                int r1 = r1.size()
                r14 = 0
            L_0x0259:
                if (r14 >= r1) goto L_0x02b2
                android.util.SparseIntArray r2 = r0.f22054c
                int r2 = r2.keyAt(r14)
                android.util.SparseIntArray r3 = r0.f22054c
                int r3 = r3.valueAt(r14)
                n5.d0 r4 = n5.d0.this
                android.util.SparseBooleanArray r4 = r4.f22038g
                r5 = 1
                r4.put(r2, r5)
                n5.d0 r4 = n5.d0.this
                android.util.SparseBooleanArray r4 = r4.f22039h
                r4.put(r3, r5)
                android.util.SparseArray<n5.e0> r4 = r0.f22053b
                java.lang.Object r4 = r4.valueAt(r14)
                n5.e0 r4 = (n5.e0) r4
                if (r4 == 0) goto L_0x02a5
                n5.d0 r5 = n5.d0.this
                n5.e0 r6 = r5.f22047p
                if (r4 == r6) goto L_0x0297
                d5.k r5 = r5.f22042k
                n5.e0$d r6 = new n5.e0$d
                r7 = r21
                r8 = 8192(0x2000, float:1.14794E-41)
                r6.<init>(r7, r2, r8)
                r2 = r20
                r4.b(r2, r5, r6)
                goto L_0x029d
            L_0x0297:
                r2 = r20
                r7 = r21
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x029d:
                n5.d0 r5 = n5.d0.this
                android.util.SparseArray<n5.e0> r5 = r5.f22037f
                r5.put(r3, r4)
                goto L_0x02ab
            L_0x02a5:
                r2 = r20
                r7 = r21
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x02ab:
                int r14 = r14 + 1
                r20 = r2
                r21 = r7
                goto L_0x0259
            L_0x02b2:
                n5.d0 r1 = n5.d0.this
                int r2 = r1.f22032a
                r3 = 2
                if (r2 != r3) goto L_0x02cb
                boolean r2 = r1.f22044m
                if (r2 != 0) goto L_0x02ee
                d5.k r1 = r1.f22042k
                r1.d()
                n5.d0 r1 = n5.d0.this
                r2 = 0
                r1.f22043l = r2
                r3 = 1
                r1.f22044m = r3
                goto L_0x02ee
            L_0x02cb:
                r2 = 0
                r3 = 1
                android.util.SparseArray<n5.e0> r1 = r1.f22037f
                int r4 = r0.f22055d
                r1.remove(r4)
                n5.d0 r1 = n5.d0.this
                int r4 = r1.f22032a
                if (r4 != r3) goto L_0x02dc
                r5 = 0
                goto L_0x02e1
            L_0x02dc:
                int r2 = r1.f22043l
                r4 = -1
                int r5 = r2 + -1
            L_0x02e1:
                r1.f22043l = r5
                if (r5 != 0) goto L_0x02ee
                d5.k r1 = r1.f22042k
                r1.d()
                n5.d0 r1 = n5.d0.this
                r1.f22044m = r3
            L_0x02ee:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n5.d0.b.c(v6.v):void");
        }
    }

    static {
        c0 c0Var = c0.f22018a;
    }

    public d0(int i10, b0 b0Var, e0.c cVar, int i11) {
        cVar.getClass();
        this.f22036e = cVar;
        this.f22032a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f22033b = Collections.singletonList(b0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f22033b = arrayList;
            arrayList.add(b0Var);
        }
        this.f22034c = new v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f22038g = sparseBooleanArray;
        this.f22039h = new SparseBooleanArray();
        SparseArray<e0> sparseArray = new SparseArray<>();
        this.f22037f = sparseArray;
        this.f22035d = new SparseIntArray();
        this.f22040i = new b0(i11);
        this.f22049r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<e0> a10 = cVar.a();
        int size = a10.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f22037f.put(a10.keyAt(i12), a10.valueAt(i12));
        }
        this.f22037f.put(0, new y(new a()));
        this.f22047p = null;
    }

    public void a() {
    }

    public boolean e(j jVar) throws IOException {
        boolean z10;
        byte[] bArr = this.f22034c.f26518a;
        jVar.j(bArr, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (bArr[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                jVar.g(i10);
                return true;
            }
        }
        return false;
    }

    public int f(j jVar, w wVar) throws IOException {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        j jVar2 = jVar;
        w wVar2 = wVar;
        long b10 = jVar.b();
        if (this.f22044m) {
            long j10 = -9223372036854775807L;
            if ((b10 == -1 || this.f22032a == 2) ? false : true) {
                b0 b0Var = this.f22040i;
                if (!b0Var.f22009d) {
                    int i12 = this.f22049r;
                    if (i12 <= 0) {
                        b0Var.a(jVar2);
                        return 0;
                    }
                    if (!b0Var.f22011f) {
                        long b11 = jVar.b();
                        int min = (int) Math.min((long) b0Var.f22006a, b11);
                        long j11 = b11 - ((long) min);
                        if (jVar.l() != j11) {
                            wVar2.f13063a = j11;
                        } else {
                            b0Var.f22008c.z(min);
                            jVar.f();
                            jVar2.j(b0Var.f22008c.f26518a, 0, min);
                            v vVar = b0Var.f22008c;
                            int i13 = vVar.f26519b;
                            int i14 = vVar.f26520c;
                            while (true) {
                                i14--;
                                if (i14 < i13) {
                                    break;
                                } else if (vVar.f26518a[i14] == 71) {
                                    long g10 = e.i.g(vVar, i14, i12);
                                    if (g10 != -9223372036854775807L) {
                                        j10 = g10;
                                        break;
                                    }
                                }
                            }
                            b0Var.f22013h = j10;
                            b0Var.f22011f = true;
                            return 0;
                        }
                    } else if (b0Var.f22013h == -9223372036854775807L) {
                        b0Var.a(jVar2);
                        return 0;
                    } else if (!b0Var.f22010e) {
                        int min2 = (int) Math.min((long) b0Var.f22006a, jVar.b());
                        long j12 = (long) 0;
                        if (jVar.l() != j12) {
                            wVar2.f13063a = j12;
                        } else {
                            b0Var.f22008c.z(min2);
                            jVar.f();
                            jVar2.j(b0Var.f22008c.f26518a, 0, min2);
                            v vVar2 = b0Var.f22008c;
                            int i15 = vVar2.f26519b;
                            int i16 = vVar2.f26520c;
                            while (true) {
                                if (i15 >= i16) {
                                    break;
                                }
                                if (vVar2.f26518a[i15] == 71) {
                                    long g11 = e.i.g(vVar2, i15, i12);
                                    if (g11 != -9223372036854775807L) {
                                        j10 = g11;
                                        break;
                                    }
                                }
                                i15++;
                            }
                            b0Var.f22012g = j10;
                            b0Var.f22010e = true;
                            return 0;
                        }
                    } else {
                        long j13 = b0Var.f22012g;
                        if (j13 == -9223372036854775807L) {
                            b0Var.a(jVar2);
                            return 0;
                        }
                        b0Var.f22014i = b0Var.f22007b.b(b0Var.f22013h) - b0Var.f22007b.b(j13);
                        b0Var.a(jVar2);
                        return 0;
                    }
                    return 1;
                }
            }
            if (!this.f22045n) {
                this.f22045n = true;
                b0 b0Var2 = this.f22040i;
                long j14 = b0Var2.f22014i;
                if (j14 != -9223372036854775807L) {
                    a0 a0Var = r3;
                    a0 a0Var2 = new a0(b0Var2.f22007b, j14, b10, this.f22049r, 112800);
                    this.f22041j = a0Var;
                    this.f22042k.b(a0Var.f12973a);
                } else {
                    this.f22042k.b(new x.b(j14, 0));
                }
            }
            if (this.f22046o) {
                z11 = false;
                this.f22046o = false;
                h(0, 0);
                if (jVar.l() != 0) {
                    wVar2.f13063a = 0;
                    return 1;
                }
            } else {
                z11 = false;
            }
            z10 = true;
            a0 a0Var3 = this.f22041j;
            if (a0Var3 != null && a0Var3.b()) {
                return this.f22041j.a(jVar2, wVar2);
            }
        } else {
            z11 = false;
            z10 = true;
        }
        v vVar3 = this.f22034c;
        byte[] bArr = vVar3.f26518a;
        if (9400 - vVar3.f26519b < 188) {
            int a10 = vVar3.a();
            if (a10 > 0) {
                System.arraycopy(bArr, this.f22034c.f26519b, bArr, z11, a10);
            }
            this.f22034c.B(bArr, a10);
        }
        while (true) {
            if (this.f22034c.a() >= 188) {
                i10 = -1;
                z12 = true;
                break;
            }
            int i17 = this.f22034c.f26520c;
            int a11 = jVar2.a(bArr, i17, 9400 - i17);
            i10 = -1;
            if (a11 == -1) {
                z12 = false;
                break;
            }
            this.f22034c.C(i17 + a11);
        }
        if (!z12) {
            return i10;
        }
        v vVar4 = this.f22034c;
        int i18 = vVar4.f26519b;
        int i19 = vVar4.f26520c;
        byte[] bArr2 = vVar4.f26518a;
        int i20 = i18;
        while (i20 < i19 && bArr2[i20] != 71) {
            i20++;
        }
        this.f22034c.D(i20);
        int i21 = i20 + 188;
        if (i21 > i19) {
            int i22 = (i20 - i18) + this.f22048q;
            this.f22048q = i22;
            i11 = 2;
            if (this.f22032a == 2 && i22 > 376) {
                throw new m0("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i11 = 2;
            this.f22048q = z11;
        }
        v vVar5 = this.f22034c;
        int i23 = vVar5.f26520c;
        if (i21 > i23) {
            return z11;
        }
        int f10 = vVar5.f();
        if ((8388608 & f10) != 0) {
            this.f22034c.D(i21);
            return z11;
        }
        boolean z13 = ((4194304 & f10) != 0) | z11;
        int i24 = (2096896 & f10) >> 8;
        boolean z14 = (f10 & 32) != 0;
        e0 e0Var = (f10 & 16) != 0 ? this.f22037f.get(i24) : null;
        if (e0Var == null) {
            this.f22034c.D(i21);
            return z11;
        }
        if (this.f22032a != i11) {
            int i25 = f10 & 15;
            int i26 = this.f22035d.get(i24, i25 - 1);
            this.f22035d.put(i24, i25);
            if (i26 == i25) {
                this.f22034c.D(i21);
                return z11;
            } else if (i25 != ((i26 + z10) & 15)) {
                e0Var.a();
            }
        }
        if (z14) {
            int s10 = this.f22034c.s();
            z13 |= (this.f22034c.s() & 64) != 0 ? (char) 2 : 0;
            this.f22034c.E(s10 - (z10 ? 1 : 0));
        }
        boolean z15 = this.f22044m;
        if (this.f22032a == i11 || z15 || !this.f22039h.get(i24, z11)) {
            this.f22034c.C(i21);
            e0Var.c(this.f22034c, z13 ? 1 : 0);
            this.f22034c.C(i23);
        }
        if (this.f22032a != i11 && !z15 && this.f22044m && b10 != -1) {
            this.f22046o = z10;
        }
        this.f22034c.D(i21);
        return z11 ? 1 : 0;
    }

    public void h(long j10, long j11) {
        a0 a0Var;
        v6.a.d(this.f22032a != 2);
        int size = this.f22033b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = this.f22033b.get(i10);
            if ((b0Var.d() == -9223372036854775807L) || !(b0Var.d() == 0 || b0Var.c() == j11)) {
                b0Var.e(j11);
            }
        }
        if (!(j11 == 0 || (a0Var = this.f22041j) == null)) {
            a0Var.e(j11);
        }
        this.f22034c.z(0);
        this.f22035d.clear();
        for (int i11 = 0; i11 < this.f22037f.size(); i11++) {
            this.f22037f.valueAt(i11).a();
        }
        this.f22048q = 0;
    }

    public void i(k kVar) {
        this.f22042k = kVar;
    }
}
