package j5;

import d5.a0;
import d5.h;
import d5.i;
import d5.j;
import d5.k;
import d5.t;
import d5.u;
import java.io.EOFException;
import java.io.IOException;
import q5.a;
import t4.n;
import v5.g;
import v5.l;
import v6.v;
import x4.f;
import x4.m0;
import y4.m;
import z4.x;

/* compiled from: Mp3Extractor */
public final class d implements i {

    /* renamed from: u  reason: collision with root package name */
    public static final g.a f19539u = n.f25713a;

    /* renamed from: a  reason: collision with root package name */
    public final int f19540a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19541b;

    /* renamed from: c  reason: collision with root package name */
    public final v f19542c;

    /* renamed from: d  reason: collision with root package name */
    public final x.a f19543d;

    /* renamed from: e  reason: collision with root package name */
    public final t f19544e;

    /* renamed from: f  reason: collision with root package name */
    public final u f19545f;

    /* renamed from: g  reason: collision with root package name */
    public final a0 f19546g;

    /* renamed from: h  reason: collision with root package name */
    public k f19547h;

    /* renamed from: i  reason: collision with root package name */
    public a0 f19548i;

    /* renamed from: j  reason: collision with root package name */
    public a0 f19549j;

    /* renamed from: k  reason: collision with root package name */
    public int f19550k;

    /* renamed from: l  reason: collision with root package name */
    public a f19551l;

    /* renamed from: m  reason: collision with root package name */
    public long f19552m;

    /* renamed from: n  reason: collision with root package name */
    public long f19553n;

    /* renamed from: o  reason: collision with root package name */
    public long f19554o;

    /* renamed from: p  reason: collision with root package name */
    public int f19555p;

    /* renamed from: q  reason: collision with root package name */
    public e f19556q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f19557r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f19558s;

    /* renamed from: t  reason: collision with root package name */
    public long f19559t;

    static {
        m mVar = m.f28049b;
    }

    public d() {
        this(0, -9223372036854775807L);
    }

    public static long d(a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        for (a.b bVar : aVar.f24150a) {
            if (bVar instanceof l) {
                l lVar = (l) bVar;
                if (lVar.f26405a.equals("TLEN")) {
                    return f.b(Long.parseLong(lVar.f26417c));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static boolean g(int i10, long j10) {
        return ((long) (i10 & -128000)) == (j10 & -128000);
    }

    public void a() {
    }

    public final long b(long j10) {
        return ((j10 * 1000000) / ((long) this.f19543d.f28493d)) + this.f19552m;
    }

    public final e c(j jVar) throws IOException {
        jVar.j(this.f19542c.f26518a, 0, 4);
        this.f19542c.D(0);
        this.f19543d.a(this.f19542c.f());
        return new a(jVar.b(), jVar.l(), this.f19543d);
    }

    public boolean e(j jVar) throws IOException {
        return k(jVar, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: j5.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: j5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: j5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: j5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: j5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: j5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: j5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: j5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: j5.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: j5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: j5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: j5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: j5.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: j5.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: j5.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: j5.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: j5.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: j5.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: j5.f} */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d4, code lost:
        if (r0 == null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02e4, code lost:
        if ((r1.f19540a & 1) != 0) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r8 != 1231971951) goto L_0x0063;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(d5.j r37, d5.w r38) throws java.io.IOException {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            d5.a0 r2 = r0.f19548i
            v6.a.f(r2)
            int r2 = v6.e0.f26436a
            int r2 = r0.f19550k
            r4 = 0
            if (r2 != 0) goto L_0x0018
            r0.k(r1, r4)     // Catch:{ EOFException -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r1 = r0
            r5 = -1
            goto L_0x042d
        L_0x0018:
            j5.e r2 = r0.f19556q
            r7 = 1
            if (r2 != 0) goto L_0x032e
            v6.v r2 = new v6.v
            z4.x$a r8 = r0.f19543d
            int r8 = r8.f28492c
            r2.<init>((int) r8)
            byte[] r8 = r2.f26518a
            z4.x$a r9 = r0.f19543d
            int r9 = r9.f28492c
            r1.j(r8, r4, r9)
            z4.x$a r8 = r0.f19543d
            int r9 = r8.f28490a
            r9 = r9 & r7
            r10 = 21
            r11 = 36
            if (r9 == 0) goto L_0x0041
            int r8 = r8.f28494e
            if (r8 == r7) goto L_0x0048
            r10 = 36
            goto L_0x0048
        L_0x0041:
            int r8 = r8.f28494e
            if (r8 == r7) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r10 = 13
        L_0x0048:
            int r8 = r2.f26520c
            int r9 = r10 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1231971951(0x496e666f, float:976486.94)
            r14 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 < r9) goto L_0x0063
            r2.D(r10)
            int r8 = r2.f()
            if (r8 == r12) goto L_0x0077
            if (r8 != r13) goto L_0x0063
            goto L_0x0077
        L_0x0063:
            int r8 = r2.f26520c
            r9 = 40
            if (r8 < r9) goto L_0x0076
            r2.D(r11)
            int r8 = r2.f()
            if (r8 != r14) goto L_0x0076
            r8 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0077
        L_0x0076:
            r8 = 0
        L_0x0077:
            java.lang.String r9 = ", "
            r15 = 1000000(0xf4240, double:4.940656E-318)
            r17 = -1
            r5 = 2
            if (r8 == r12) goto L_0x015a
            if (r8 != r13) goto L_0x0085
            goto L_0x015a
        L_0x0085:
            if (r8 != r14) goto L_0x0152
            long r12 = r37.b()
            long r19 = r37.l()
            z4.x$a r8 = r0.f19543d
            r10 = 10
            r2.E(r10)
            int r10 = r2.f()
            if (r10 > 0) goto L_0x009d
            goto L_0x00ee
        L_0x009d:
            int r14 = r8.f28493d
            long r3 = (long) r10
            r10 = 32000(0x7d00, float:4.4842E-41)
            if (r14 < r10) goto L_0x00a7
            r10 = 1152(0x480, float:1.614E-42)
            goto L_0x00a9
        L_0x00a7:
            r10 = 576(0x240, float:8.07E-43)
        L_0x00a9:
            r27 = r12
            long r11 = (long) r10
            long r23 = r11 * r15
            long r10 = (long) r14
            r21 = r3
            r25 = r10
            long r32 = v6.e0.P(r21, r23, r25)
            int r3 = r2.x()
            int r4 = r2.x()
            int r10 = r2.x()
            r2.E(r5)
            int r8 = r8.f28492c
            long r11 = (long) r8
            long r11 = r19 + r11
            long[] r8 = new long[r3]
            long[] r13 = new long[r3]
            r5 = r19
            r14 = 0
        L_0x00d2:
            if (r14 >= r3) goto L_0x0112
            r15 = r8
            long r7 = (long) r14
            long r7 = r7 * r32
            long r0 = (long) r3
            long r7 = r7 / r0
            r15[r14] = r7
            long r0 = java.lang.Math.max(r5, r11)
            r13[r14] = r0
            r0 = 1
            if (r10 == r0) goto L_0x0101
            r0 = 2
            if (r10 == r0) goto L_0x00fc
            r0 = 3
            if (r10 == r0) goto L_0x00f7
            r0 = 4
            if (r10 == r0) goto L_0x00f2
        L_0x00ee:
            r0 = 0
        L_0x00ef:
            r1 = r36
            goto L_0x0147
        L_0x00f2:
            int r0 = r2.v()
            goto L_0x0105
        L_0x00f7:
            int r0 = r2.u()
            goto L_0x0105
        L_0x00fc:
            int r0 = r2.x()
            goto L_0x0105
        L_0x0101:
            int r0 = r2.s()
        L_0x0105:
            int r0 = r0 * r4
            long r0 = (long) r0
            long r5 = r5 + r0
            int r14 = r14 + 1
            r7 = 1
            r0 = r36
            r1 = r37
            r8 = r15
            goto L_0x00d2
        L_0x0112:
            r15 = r8
            int r0 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0139
            int r0 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0139
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VBRI data size mismatch: "
            r0.append(r1)
            r1 = r27
            r0.append(r1)
            r0.append(r9)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VbriSeeker"
            android.util.Log.w(r1, r0)
        L_0x0139:
            j5.f r0 = new j5.f
            r29 = r0
            r30 = r15
            r31 = r13
            r34 = r5
            r29.<init>(r30, r31, r32, r34)
            goto L_0x00ef
        L_0x0147:
            z4.x$a r2 = r1.f19543d
            int r2 = r2.f28492c
            r3 = r37
            r3.g(r2)
            goto L_0x0245
        L_0x0152:
            r3 = r1
            r1 = r0
            r37.f()
            r0 = 0
            goto L_0x0245
        L_0x015a:
            r3 = r1
            r1 = r0
            long r4 = r37.b()
            long r28 = r37.l()
            z4.x$a r0 = r1.f19543d
            int r6 = r0.f28496g
            int r7 = r0.f28493d
            int r11 = r2.f()
            r12 = r11 & 1
            r14 = 1
            if (r12 != r14) goto L_0x01ec
            int r12 = r2.v()
            if (r12 != 0) goto L_0x017b
            goto L_0x01ec
        L_0x017b:
            long r13 = (long) r12
            r12 = r8
            r23 = r9
            long r8 = (long) r6
            long r32 = r8 * r15
            long r6 = (long) r7
            r30 = r13
            r34 = r6
            long r31 = v6.e0.P(r30, r32, r34)
            r6 = 6
            r7 = r11 & 6
            if (r7 == r6) goto L_0x01a0
            j5.g r2 = new j5.g
            int r0 = r0.f28492c
            r33 = -1
            r35 = 0
            r27 = r2
            r30 = r0
            r27.<init>(r28, r30, r31, r33, r35)
            goto L_0x01ea
        L_0x01a0:
            long r33 = r2.t()
            r6 = 100
            long[] r7 = new long[r6]
            r8 = 0
        L_0x01a9:
            if (r8 >= r6) goto L_0x01b5
            int r9 = r2.s()
            long r13 = (long) r9
            r7[r8] = r13
            int r8 = r8 + 1
            goto L_0x01a9
        L_0x01b5:
            int r2 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x01dd
            long r8 = r28 + r33
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x01dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "XING data size mismatch: "
            r2.append(r6)
            r2.append(r4)
            r4 = r23
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "XingSeeker"
            android.util.Log.w(r4, r2)
        L_0x01dd:
            j5.g r2 = new j5.g
            int r0 = r0.f28492c
            r27 = r2
            r30 = r0
            r35 = r7
            r27.<init>(r28, r30, r31, r33, r35)
        L_0x01ea:
            r0 = r2
            goto L_0x01ee
        L_0x01ec:
            r12 = r8
            r0 = 0
        L_0x01ee:
            if (r0 == 0) goto L_0x022d
            d5.t r2 = r1.f19544e
            int r4 = r2.f13056a
            r5 = -1
            if (r4 == r5) goto L_0x01fd
            int r2 = r2.f13057b
            if (r2 == r5) goto L_0x01fd
            r2 = 1
            goto L_0x01fe
        L_0x01fd:
            r2 = 0
        L_0x01fe:
            if (r2 != 0) goto L_0x022d
            r37.f()
            int r10 = r10 + 141
            r3.k(r10)
            v6.v r2 = r1.f19542c
            byte[] r2 = r2.f26518a
            r4 = 3
            r5 = 0
            r3.j(r2, r5, r4)
            v6.v r2 = r1.f19542c
            r2.D(r5)
            d5.t r2 = r1.f19544e
            v6.v r4 = r1.f19542c
            int r4 = r4.u()
            r2.getClass()
            int r5 = r4 >> 12
            r4 = r4 & 4095(0xfff, float:5.738E-42)
            if (r5 > 0) goto L_0x0229
            if (r4 <= 0) goto L_0x022d
        L_0x0229:
            r2.f13056a = r5
            r2.f13057b = r4
        L_0x022d:
            z4.x$a r2 = r1.f19543d
            int r2 = r2.f28492c
            r3.g(r2)
            if (r0 == 0) goto L_0x0245
            boolean r2 = r0.b()
            if (r2 != 0) goto L_0x0245
            r2 = 1231971951(0x496e666f, float:976486.94)
            if (r12 != r2) goto L_0x0245
            j5.e r0 = r36.c(r37)
        L_0x0245:
            q5.a r2 = r1.f19551l
            long r4 = r37.l()
            if (r2 == 0) goto L_0x029a
            q5.a$b[] r6 = r2.f24150a
            int r6 = r6.length
            r7 = 0
        L_0x0251:
            if (r7 >= r6) goto L_0x029a
            q5.a$b[] r8 = r2.f24150a
            r8 = r8[r7]
            boolean r9 = r8 instanceof v5.j
            if (r9 == 0) goto L_0x0297
            v5.j r8 = (v5.j) r8
            long r6 = d(r2)
            int[] r2 = r8.f26412e
            int r2 = r2.length
            int r9 = r2 + 1
            long[] r10 = new long[r9]
            long[] r9 = new long[r9]
            r11 = 0
            r10[r11] = r4
            r12 = 0
            r9[r11] = r12
            r11 = 0
            r13 = 1
        L_0x0274:
            if (r13 > r2) goto L_0x0291
            int r14 = r8.f26410c
            int[] r15 = r8.f26412e
            int r16 = r13 + -1
            r15 = r15[r16]
            int r14 = r14 + r15
            long r14 = (long) r14
            long r4 = r4 + r14
            int r14 = r8.f26411d
            int[] r15 = r8.f26413f
            r15 = r15[r16]
            int r14 = r14 + r15
            long r14 = (long) r14
            long r11 = r11 + r14
            r10[r13] = r4
            r9[r13] = r11
            int r13 = r13 + 1
            goto L_0x0274
        L_0x0291:
            j5.c r2 = new j5.c
            r2.<init>(r10, r9, r6)
            goto L_0x029b
        L_0x0297:
            int r7 = r7 + 1
            goto L_0x0251
        L_0x029a:
            r2 = 0
        L_0x029b:
            boolean r4 = r1.f19557r
            if (r4 == 0) goto L_0x02a5
            j5.e$a r0 = new j5.e$a
            r0.<init>()
            goto L_0x02ea
        L_0x02a5:
            int r4 = r1.f19540a
            r5 = 2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x02d0
            if (r2 == 0) goto L_0x02b3
            long r4 = r2.f19538c
        L_0x02af:
            r7 = r4
            r11 = r17
            goto L_0x02c5
        L_0x02b3:
            if (r0 == 0) goto L_0x02be
            long r4 = r0.c()
            long r17 = r0.g()
            goto L_0x02af
        L_0x02be:
            q5.a r0 = r1.f19551l
            long r4 = d(r0)
            goto L_0x02af
        L_0x02c5:
            j5.b r0 = new j5.b
            long r9 = r37.l()
            r6 = r0
            r6.<init>(r7, r9, r11)
            goto L_0x02d8
        L_0x02d0:
            if (r2 == 0) goto L_0x02d4
            r0 = r2
            goto L_0x02d8
        L_0x02d4:
            if (r0 == 0) goto L_0x02d7
            goto L_0x02d8
        L_0x02d7:
            r0 = 0
        L_0x02d8:
            if (r0 == 0) goto L_0x02e6
            boolean r2 = r0.b()
            if (r2 != 0) goto L_0x02ea
            int r2 = r1.f19540a
            r4 = 1
            r2 = r2 & r4
            if (r2 == 0) goto L_0x02ea
        L_0x02e6:
            j5.e r0 = r36.c(r37)
        L_0x02ea:
            r1.f19556q = r0
            d5.k r2 = r1.f19547h
            r2.b(r0)
            d5.a0 r0 = r1.f19549j
            x4.b0$b r2 = new x4.b0$b
            r2.<init>()
            z4.x$a r4 = r1.f19543d
            java.lang.String r5 = r4.f28491b
            r2.f27425k = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r2.f27426l = r5
            int r5 = r4.f28494e
            r2.f27438x = r5
            int r4 = r4.f28493d
            r2.f27439y = r4
            d5.t r4 = r1.f19544e
            int r5 = r4.f13056a
            r2.A = r5
            int r4 = r4.f13057b
            r2.B = r4
            int r4 = r1.f19540a
            r5 = 4
            r4 = r4 & r5
            if (r4 == 0) goto L_0x031c
            r11 = 0
            goto L_0x031e
        L_0x031c:
            q5.a r11 = r1.f19551l
        L_0x031e:
            r2.f27423i = r11
            x4.b0 r2 = r2.a()
            r0.c(r2)
            long r4 = r37.l()
            r1.f19554o = r4
            goto L_0x0347
        L_0x032e:
            r3 = r1
            r1 = r0
            long r4 = r1.f19554o
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0347
            long r4 = r37.l()
            long r6 = r1.f19554o
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0347
            long r6 = r6 - r4
            int r0 = (int) r6
            r3.g(r0)
        L_0x0347:
            int r0 = r1.f19555p
            if (r0 != 0) goto L_0x03f5
            r37.f()
            boolean r0 = r36.j(r37)
            if (r0 == 0) goto L_0x0356
            goto L_0x0401
        L_0x0356:
            v6.v r0 = r1.f19542c
            r2 = 0
            r0.D(r2)
            v6.v r0 = r1.f19542c
            int r0 = r0.f()
            int r2 = r1.f19550k
            long r4 = (long) r2
            boolean r2 = g(r0, r4)
            if (r2 == 0) goto L_0x03ed
            int r2 = z4.x.a(r0)
            r4 = -1
            if (r2 != r4) goto L_0x0374
            goto L_0x03ed
        L_0x0374:
            z4.x$a r2 = r1.f19543d
            r2.a(r0)
            long r4 = r1.f19552m
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x03a6
            j5.e r0 = r1.f19556q
            long r4 = r37.l()
            long r4 = r0.d(r4)
            r1.f19552m = r4
            long r4 = r1.f19541b
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x03a6
            j5.e r0 = r1.f19556q
            r4 = 0
            long r4 = r0.d(r4)
            long r6 = r1.f19552m
            long r8 = r1.f19541b
            long r8 = r8 - r4
            long r8 = r8 + r6
            r1.f19552m = r8
        L_0x03a6:
            z4.x$a r0 = r1.f19543d
            int r2 = r0.f28492c
            r1.f19555p = r2
            j5.e r2 = r1.f19556q
            boolean r4 = r2 instanceof j5.b
            if (r4 == 0) goto L_0x03f5
            j5.b r2 = (j5.b) r2
            long r4 = r1.f19553n
            int r0 = r0.f28496g
            long r6 = (long) r0
            long r4 = r4 + r6
            long r4 = r1.b(r4)
            long r6 = r37.l()
            z4.x$a r0 = r1.f19543d
            int r0 = r0.f28492c
            long r8 = (long) r0
            long r6 = r6 + r8
            boolean r0 = r2.a(r4)
            if (r0 == 0) goto L_0x03cf
            goto L_0x03d9
        L_0x03cf:
            v6.q r0 = r2.f19533b
            r0.a(r4)
            v6.q r0 = r2.f19534c
            r0.a(r6)
        L_0x03d9:
            boolean r0 = r1.f19558s
            if (r0 == 0) goto L_0x03f5
            long r4 = r1.f19559t
            boolean r0 = r2.a(r4)
            if (r0 == 0) goto L_0x03f5
            r0 = 0
            r1.f19558s = r0
            d5.a0 r2 = r1.f19548i
            r1.f19549j = r2
            goto L_0x03f5
        L_0x03ed:
            r0 = 0
            r2 = 1
            r3.g(r2)
            r1.f19550k = r0
            goto L_0x042b
        L_0x03f5:
            r2 = 1
            d5.a0 r0 = r1.f19549j
            int r4 = r1.f19555p
            int r0 = r0.f(r3, r4, r2)
            r2 = -1
            if (r0 != r2) goto L_0x0403
        L_0x0401:
            r4 = -1
            goto L_0x042c
        L_0x0403:
            int r2 = r1.f19555p
            int r2 = r2 - r0
            r1.f19555p = r2
            if (r2 <= 0) goto L_0x040c
            r0 = 0
            goto L_0x042b
        L_0x040c:
            d5.a0 r3 = r1.f19549j
            long r4 = r1.f19553n
            long r4 = r1.b(r4)
            r6 = 1
            z4.x$a r0 = r1.f19543d
            int r7 = r0.f28492c
            r8 = 0
            r9 = 0
            r3.d(r4, r6, r7, r8, r9)
            long r2 = r1.f19553n
            z4.x$a r0 = r1.f19543d
            int r0 = r0.f28496g
            long r4 = (long) r0
            long r2 = r2 + r4
            r1.f19553n = r2
            r0 = 0
            r1.f19555p = r0
        L_0x042b:
            r4 = 0
        L_0x042c:
            r5 = r4
        L_0x042d:
            r0 = -1
            if (r5 != r0) goto L_0x0452
            j5.e r0 = r1.f19556q
            boolean r0 = r0 instanceof j5.b
            if (r0 == 0) goto L_0x0452
            long r2 = r1.f19553n
            long r2 = r1.b(r2)
            j5.e r0 = r1.f19556q
            long r6 = r0.c()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0452
            j5.e r0 = r1.f19556q
            r4 = r0
            j5.b r4 = (j5.b) r4
            r4.f19535d = r2
            d5.k r2 = r1.f19547h
            r2.b(r0)
        L_0x0452:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.d.f(d5.j, d5.w):int");
    }

    public void h(long j10, long j11) {
        this.f19550k = 0;
        this.f19552m = -9223372036854775807L;
        this.f19553n = 0;
        this.f19555p = 0;
        this.f19559t = j11;
        e eVar = this.f19556q;
        if ((eVar instanceof b) && !((b) eVar).a(j11)) {
            this.f19558s = true;
            this.f19549j = this.f19546g;
        }
    }

    public void i(k kVar) {
        this.f19547h = kVar;
        a0 l10 = kVar.l(0, 1);
        this.f19548i = l10;
        this.f19549j = l10;
        this.f19547h.d();
    }

    public final boolean j(j jVar) throws IOException {
        e eVar = this.f19556q;
        if (eVar != null) {
            long g10 = eVar.g();
            if (g10 != -1 && jVar.i() > g10 - 4) {
                return true;
            }
        }
        try {
            return !jVar.h(this.f19542c.f26518a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean k(j jVar, boolean z10) throws IOException {
        int i10;
        int i11;
        int a10;
        g.a aVar;
        int i12 = z10 ? 32768 : 131072;
        jVar.f();
        if (jVar.l() == 0) {
            if ((this.f19540a & 4) == 0) {
                aVar = null;
            } else {
                aVar = f19539u;
            }
            a a11 = this.f19545f.a(jVar, aVar);
            this.f19551l = a11;
            if (a11 != null) {
                this.f19544e.b(a11);
            }
            i10 = (int) jVar.i();
            if (!z10) {
                jVar.g(i10);
            }
            i11 = 0;
        } else {
            i11 = 0;
            i10 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (!j(jVar)) {
                this.f19542c.D(0);
                int f10 = this.f19542c.f();
                if ((i11 == 0 || g(f10, (long) i11)) && (a10 = x.a(f10)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f19543d.a(f10);
                        i11 = f10;
                    }
                    jVar.k(a10 - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 != i12) {
                        if (z10) {
                            jVar.f();
                            jVar.k(i10 + i15);
                        } else {
                            jVar.g(1);
                        }
                        i14 = i15;
                        i11 = 0;
                        i13 = 0;
                    } else if (z10) {
                        return false;
                    } else {
                        throw new m0("Searched too many bytes.");
                    }
                }
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            jVar.g(i10 + i14);
        } else {
            jVar.f();
        }
        this.f19550k = i11;
        return true;
    }

    public d(int i10, long j10) {
        this.f19540a = i10;
        this.f19541b = j10;
        this.f19542c = new v(10);
        this.f19543d = new x.a();
        this.f19544e = new t();
        this.f19552m = -9223372036854775807L;
        this.f19545f = new u();
        h hVar = new h();
        this.f19546g = hVar;
        this.f19549j = hVar;
    }
}
