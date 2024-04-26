package k5;

import android.util.Log;
import android.util.SparseArray;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.y0;
import c5.f;
import d5.a0;
import d5.i;
import d5.k;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k5.a;
import k5.j;
import s5.c;
import v6.e0;
import v6.u;
import v6.v;
import x4.b0;
import x4.m0;

/* compiled from: FragmentedMp4Extractor */
public class f implements i {
    public static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final b0 J;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public k E;
    public a0[] F;
    public a0[] G;
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    public final int f19913a;

    /* renamed from: b  reason: collision with root package name */
    public final m f19914b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b0> f19915c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<b> f19916d;

    /* renamed from: e  reason: collision with root package name */
    public final v f19917e;

    /* renamed from: f  reason: collision with root package name */
    public final v f19918f;

    /* renamed from: g  reason: collision with root package name */
    public final v f19919g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f19920h;

    /* renamed from: i  reason: collision with root package name */
    public final v f19921i;

    /* renamed from: j  reason: collision with root package name */
    public final v6.b0 f19922j;

    /* renamed from: k  reason: collision with root package name */
    public final c f19923k;

    /* renamed from: l  reason: collision with root package name */
    public final v f19924l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayDeque<a.C0173a> f19925m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayDeque<a> f19926n;

    /* renamed from: o  reason: collision with root package name */
    public final a0 f19927o;

    /* renamed from: p  reason: collision with root package name */
    public int f19928p;

    /* renamed from: q  reason: collision with root package name */
    public int f19929q;

    /* renamed from: r  reason: collision with root package name */
    public long f19930r;

    /* renamed from: s  reason: collision with root package name */
    public int f19931s;

    /* renamed from: t  reason: collision with root package name */
    public v f19932t;

    /* renamed from: u  reason: collision with root package name */
    public long f19933u;

    /* renamed from: v  reason: collision with root package name */
    public int f19934v;

    /* renamed from: w  reason: collision with root package name */
    public long f19935w;

    /* renamed from: x  reason: collision with root package name */
    public long f19936x;

    /* renamed from: y  reason: collision with root package name */
    public long f19937y;

    /* renamed from: z  reason: collision with root package name */
    public b f19938z;

    /* compiled from: FragmentedMp4Extractor */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f19939a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19940b;

        public a(long j10, int i10) {
            this.f19939a = j10;
            this.f19940b = i10;
        }
    }

    /* compiled from: FragmentedMp4Extractor */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f19941a;

        /* renamed from: b  reason: collision with root package name */
        public final o f19942b = new o();

        /* renamed from: c  reason: collision with root package name */
        public final v f19943c = new v();

        /* renamed from: d  reason: collision with root package name */
        public p f19944d;

        /* renamed from: e  reason: collision with root package name */
        public d f19945e;

        /* renamed from: f  reason: collision with root package name */
        public int f19946f;

        /* renamed from: g  reason: collision with root package name */
        public int f19947g;

        /* renamed from: h  reason: collision with root package name */
        public int f19948h;

        /* renamed from: i  reason: collision with root package name */
        public int f19949i;

        /* renamed from: j  reason: collision with root package name */
        public final v f19950j = new v(1);

        /* renamed from: k  reason: collision with root package name */
        public final v f19951k = new v();

        /* renamed from: l  reason: collision with root package name */
        public boolean f19952l;

        public b(a0 a0Var, p pVar, d dVar) {
            this.f19941a = a0Var;
            this.f19944d = pVar;
            this.f19945e = dVar;
            this.f19944d = pVar;
            this.f19945e = dVar;
            a0Var.c(pVar.f20029a.f20000f);
            e();
        }

        public long a() {
            if (!this.f19952l) {
                return this.f19944d.f20031c[this.f19946f];
            }
            return this.f19942b.f20016f[this.f19948h];
        }

        public n b() {
            if (!this.f19952l) {
                return null;
            }
            o oVar = this.f19942b;
            d dVar = oVar.f20011a;
            int i10 = e0.f26436a;
            int i11 = dVar.f19908a;
            n nVar = oVar.f20024n;
            if (nVar == null) {
                nVar = this.f19944d.f20029a.a(i11);
            }
            if (nVar == null || !nVar.f20006a) {
                return null;
            }
            return nVar;
        }

        public boolean c() {
            this.f19946f++;
            if (!this.f19952l) {
                return false;
            }
            int i10 = this.f19947g + 1;
            this.f19947g = i10;
            int[] iArr = this.f19942b.f20017g;
            int i11 = this.f19948h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f19948h = i11 + 1;
            this.f19947g = 0;
            return false;
        }

        public int d(int i10, int i11) {
            v vVar;
            n b10 = b();
            if (b10 == null) {
                return 0;
            }
            int i12 = b10.f20009d;
            if (i12 != 0) {
                vVar = this.f19942b.f20025o;
            } else {
                byte[] bArr = b10.f20010e;
                int i13 = e0.f26436a;
                v vVar2 = this.f19951k;
                int length = bArr.length;
                vVar2.f26518a = bArr;
                vVar2.f26520c = length;
                vVar2.f26519b = 0;
                v vVar3 = vVar2;
                i12 = bArr.length;
                vVar = vVar3;
            }
            o oVar = this.f19942b;
            boolean z10 = oVar.f20022l && oVar.f20023m[this.f19946f];
            boolean z11 = z10 || i11 != 0;
            v vVar4 = this.f19950j;
            vVar4.f26518a[0] = (byte) ((z11 ? 128 : 0) | i12);
            vVar4.D(0);
            this.f19941a.e(this.f19950j, 1, 1);
            this.f19941a.e(vVar, i12, 1);
            if (!z11) {
                return i12 + 1;
            }
            if (!z10) {
                this.f19943c.z(8);
                v vVar5 = this.f19943c;
                byte[] bArr2 = vVar5.f26518a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                bArr2[4] = (byte) ((i10 >> 24) & 255);
                bArr2[5] = (byte) ((i10 >> 16) & 255);
                bArr2[6] = (byte) ((i10 >> 8) & 255);
                bArr2[7] = (byte) (i10 & 255);
                this.f19941a.e(vVar5, 8, 1);
                return i12 + 1 + 8;
            }
            v vVar6 = this.f19942b.f20025o;
            int x10 = vVar6.x();
            vVar6.E(-2);
            int i14 = (x10 * 6) + 2;
            if (i11 != 0) {
                this.f19943c.z(i14);
                byte[] bArr3 = this.f19943c.f26518a;
                vVar6.e(bArr3, 0, i14);
                int i15 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
                bArr3[2] = (byte) ((i15 >> 8) & 255);
                bArr3[3] = (byte) (i15 & 255);
                vVar6 = this.f19943c;
            }
            this.f19941a.e(vVar6, i14, 1);
            return i12 + 1 + i14;
        }

        public void e() {
            o oVar = this.f19942b;
            oVar.f20014d = 0;
            oVar.f20027q = 0;
            oVar.f20028r = false;
            oVar.f20022l = false;
            oVar.f20026p = false;
            oVar.f20024n = null;
            this.f19946f = 0;
            this.f19948h = 0;
            this.f19947g = 0;
            this.f19949i = 0;
            this.f19952l = false;
        }
    }

    static {
        b0.b bVar = new b0.b();
        bVar.f27425k = "application/x-emsg";
        J = bVar.a();
    }

    public f(int i10, v6.b0 b0Var, m mVar, List<b0> list) {
        this(i10, b0Var, mVar, list, (a0) null);
    }

    public static int b(int i10) throws m0 {
        if (i10 >= 0) {
            return i10;
        }
        throw new m0(d0.a("Unexpected negative value: ", i10));
    }

    public static c5.f g(List<a.b> list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f19894a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f19898b.f26518a;
                j.a c10 = j.c(bArr);
                if (c10 == null) {
                    uuid = null;
                } else {
                    uuid = c10.f19984a;
                }
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new f.b(uuid, (String) null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new c5.f((String) null, false, (f.b[]) arrayList.toArray(new f.b[0]));
    }

    public static void j(v vVar, int i10, o oVar) throws m0 {
        vVar.D(i10 + 8);
        int f10 = vVar.f() & 16777215;
        if ((f10 & 1) == 0) {
            boolean z10 = (f10 & 2) != 0;
            int v10 = vVar.v();
            if (v10 == 0) {
                Arrays.fill(oVar.f20023m, 0, oVar.f20015e, false);
            } else if (v10 == oVar.f20015e) {
                Arrays.fill(oVar.f20023m, 0, v10, z10);
                int a10 = vVar.a();
                v vVar2 = oVar.f20025o;
                byte[] bArr = vVar2.f26518a;
                if (bArr.length < a10) {
                    bArr = new byte[a10];
                }
                vVar2.f26518a = bArr;
                vVar2.f26520c = a10;
                vVar2.f26519b = 0;
                oVar.f20022l = true;
                oVar.f20026p = true;
                vVar.e(bArr, 0, a10);
                oVar.f20025o.D(0);
                oVar.f20026p = false;
            } else {
                StringBuilder a11 = y0.a("Senc sample count ", v10, " is different from fragment sample count");
                a11.append(oVar.f20015e);
                throw new m0(a11.toString());
            }
        } else {
            throw new m0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    public void a() {
    }

    public final void c() {
        this.f19928p = 0;
        this.f19931s = 0;
    }

    public final d d(SparseArray<d> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        d dVar = sparseArray.get(i10);
        dVar.getClass();
        return dVar;
    }

    public boolean e(d5.j jVar) throws IOException {
        return l.a(jVar, true, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:337:0x02e2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x075b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(d5.j r27, d5.w r28) throws java.io.IOException {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
        L_0x0004:
            int r2 = r0.f19928p
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0554
            java.lang.String r8 = "FragmentedMp4Extractor"
            if (r2 == r7) goto L_0x033e
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 3
            if (r2 == r5) goto L_0x02e4
            k5.f$b r2 = r0.f19938z
            if (r2 != 0) goto L_0x008c
            android.util.SparseArray<k5.f$b> r2 = r0.f19916d
            int r5 = r2.size()
            r10 = 0
            r10 = r3
            r3 = r6
            r4 = 0
        L_0x002b:
            if (r4 >= r5) goto L_0x0057
            java.lang.Object r12 = r2.valueAt(r4)
            k5.f$b r12 = (k5.f.b) r12
            boolean r13 = r12.f19952l
            if (r13 != 0) goto L_0x003f
            int r14 = r12.f19946f
            k5.p r15 = r12.f19944d
            int r15 = r15.f20030b
            if (r14 == r15) goto L_0x0054
        L_0x003f:
            if (r13 == 0) goto L_0x004a
            int r13 = r12.f19948h
            k5.o r14 = r12.f19942b
            int r14 = r14.f20014d
            if (r13 != r14) goto L_0x004a
            goto L_0x0054
        L_0x004a:
            long r13 = r12.a()
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x0054
            r3 = r12
            r10 = r13
        L_0x0054:
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0057:
            if (r3 != 0) goto L_0x0074
            long r2 = r0.f19933u
            long r4 = r27.l()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x006c
            r1.g(r3)
            r26.c()
            r7 = 0
            goto L_0x02e0
        L_0x006c:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0074:
            long r4 = r3.a()
            long r10 = r27.l()
            long r4 = r4 - r10
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0086
            java.lang.String r2 = "Ignoring negative offset to sample data."
            android.util.Log.w(r8, r2)
            r2 = 0
        L_0x0086:
            r1.g(r2)
            r0.f19938z = r3
            r2 = r3
        L_0x008c:
            int r3 = r0.f19928p
            r4 = 6
            if (r3 != r9) goto L_0x013f
            boolean r3 = r2.f19952l
            if (r3 != 0) goto L_0x009e
            k5.p r3 = r2.f19944d
            int[] r3 = r3.f20032d
            int r5 = r2.f19946f
            r3 = r3[r5]
            goto L_0x00a6
        L_0x009e:
            k5.o r3 = r2.f19942b
            int[] r3 = r3.f20018h
            int r5 = r2.f19946f
            r3 = r3[r5]
        L_0x00a6:
            r0.A = r3
            int r5 = r2.f19946f
            int r8 = r2.f19949i
            if (r5 >= r8) goto L_0x00eb
            r1.g(r3)
            k5.n r3 = r2.b()
            if (r3 != 0) goto L_0x00b8
            goto L_0x00df
        L_0x00b8:
            k5.o r4 = r2.f19942b
            v6.v r4 = r4.f20025o
            int r3 = r3.f20009d
            if (r3 == 0) goto L_0x00c3
            r4.E(r3)
        L_0x00c3:
            k5.o r3 = r2.f19942b
            int r5 = r2.f19946f
            boolean r8 = r3.f20022l
            if (r8 == 0) goto L_0x00d3
            boolean[] r3 = r3.f20023m
            boolean r3 = r3[r5]
            if (r3 == 0) goto L_0x00d3
            r3 = 1
            goto L_0x00d4
        L_0x00d3:
            r3 = 0
        L_0x00d4:
            if (r3 == 0) goto L_0x00df
            int r3 = r4.x()
            int r3 = r3 * 6
            r4.E(r3)
        L_0x00df:
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x00e7
            r0.f19938z = r6
        L_0x00e7:
            r0.f19928p = r9
            goto L_0x02e0
        L_0x00eb:
            k5.p r5 = r2.f19944d
            k5.m r5 = r5.f20029a
            int r5 = r5.f20001g
            if (r5 != r7) goto L_0x00fc
            int r3 = r3 + -8
            r0.A = r3
            r3 = 8
            r1.g(r3)
        L_0x00fc:
            k5.p r3 = r2.f19944d
            k5.m r3 = r3.f20029a
            x4.b0 r3 = r3.f20000f
            java.lang.String r3 = r3.f27408t
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0129
            int r3 = r0.A
            r5 = 7
            int r3 = r2.d(r3, r5)
            r0.B = r3
            int r3 = r0.A
            v6.v r8 = r0.f19921i
            z4.c.a(r3, r8)
            d5.a0 r3 = r2.f19941a
            v6.v r8 = r0.f19921i
            r3.b(r8, r5)
            int r3 = r0.B
            int r3 = r3 + r5
            r0.B = r3
            goto L_0x0132
        L_0x0129:
            int r3 = r0.A
            r5 = 0
            int r3 = r2.d(r3, r5)
            r0.B = r3
        L_0x0132:
            r3 = 0
            int r5 = r0.A
            int r8 = r0.B
            int r5 = r5 + r8
            r0.A = r5
            r5 = 4
            r0.f19928p = r5
            r0.C = r3
        L_0x013f:
            k5.p r3 = r2.f19944d
            k5.m r5 = r3.f20029a
            d5.a0 r8 = r2.f19941a
            boolean r9 = r2.f19952l
            if (r9 != 0) goto L_0x0150
            long[] r3 = r3.f20034f
            int r9 = r2.f19946f
            r9 = r3[r9]
            goto L_0x015e
        L_0x0150:
            k5.o r3 = r2.f19942b
            int r9 = r2.f19946f
            long[] r10 = r3.f20020j
            r11 = r10[r9]
            int[] r3 = r3.f20019i
            r3 = r3[r9]
            long r9 = (long) r3
            long r9 = r9 + r11
        L_0x015e:
            v6.b0 r3 = r0.f19922j
            if (r3 == 0) goto L_0x0166
            long r9 = r3.a(r9)
        L_0x0166:
            r14 = r9
            int r3 = r5.f20004j
            if (r3 == 0) goto L_0x0245
            v6.v r9 = r0.f19918f
            byte[] r9 = r9.f26518a
            r10 = 0
            r9[r10] = r10
            r9[r7] = r10
            r11 = 2
            r9[r11] = r10
            int r10 = r3 + 1
            int r3 = 4 - r3
        L_0x017b:
            int r11 = r0.B
            int r12 = r0.A
            if (r11 >= r12) goto L_0x0257
            int r11 = r0.C
            java.lang.String r12 = "video/hevc"
            if (r11 != 0) goto L_0x01f0
            r1.readFully(r9, r3, r10)
            v6.v r11 = r0.f19918f
            r13 = 0
            r11.D(r13)
            v6.v r11 = r0.f19918f
            int r11 = r11.f()
            if (r11 < r7) goto L_0x01e8
            int r11 = r11 + -1
            r0.C = r11
            v6.v r11 = r0.f19917e
            r11.D(r13)
            v6.v r11 = r0.f19917e
            r13 = 4
            r8.b(r11, r13)
            v6.v r11 = r0.f19918f
            r8.b(r11, r7)
            d5.a0[] r11 = r0.G
            int r11 = r11.length
            if (r11 <= 0) goto L_0x01d9
            x4.b0 r11 = r5.f20000f
            java.lang.String r11 = r11.f27408t
            byte r13 = r9[r13]
            byte[] r16 = v6.u.f26498a
            java.lang.String r6 = "video/avc"
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x01c5
            r6 = r13 & 31
            if (r6 == r4) goto L_0x01d2
        L_0x01c5:
            boolean r6 = r12.equals(r11)
            if (r6 == 0) goto L_0x01d4
            r6 = r13 & 126(0x7e, float:1.77E-43)
            int r6 = r6 >> r7
            r11 = 39
            if (r6 != r11) goto L_0x01d4
        L_0x01d2:
            r6 = 1
            goto L_0x01d5
        L_0x01d4:
            r6 = 0
        L_0x01d5:
            if (r6 == 0) goto L_0x01d9
            r6 = 1
            goto L_0x01da
        L_0x01d9:
            r6 = 0
        L_0x01da:
            r0.D = r6
            int r6 = r0.B
            int r6 = r6 + 5
            r0.B = r6
            int r6 = r0.A
            int r6 = r6 + r3
            r0.A = r6
            goto L_0x0242
        L_0x01e8:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Invalid NAL length"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01f0:
            boolean r4 = r0.D
            if (r4 == 0) goto L_0x0230
            v6.v r4 = r0.f19919g
            r4.z(r11)
            v6.v r4 = r0.f19919g
            byte[] r4 = r4.f26518a
            int r6 = r0.C
            r7 = 0
            r1.readFully(r4, r7, r6)
            v6.v r4 = r0.f19919g
            int r6 = r0.C
            r8.b(r4, r6)
            int r4 = r0.C
            v6.v r6 = r0.f19919g
            byte[] r7 = r6.f26518a
            int r6 = r6.f26520c
            int r6 = v6.u.e(r7, r6)
            v6.v r7 = r0.f19919g
            x4.b0 r11 = r5.f20000f
            java.lang.String r11 = r11.f27408t
            boolean r11 = r12.equals(r11)
            r7.D(r11)
            v6.v r7 = r0.f19919g
            r7.C(r6)
            v6.v r6 = r0.f19919g
            d5.a0[] r7 = r0.G
            d5.c.a(r14, r6, r7)
            goto L_0x0235
        L_0x0230:
            r4 = 0
            int r4 = r8.f(r1, r11, r4)
        L_0x0235:
            int r6 = r0.B
            int r6 = r6 + r4
            r0.B = r6
            int r6 = r0.C
            int r6 = r6 - r4
            r0.C = r6
            r4 = 6
            r6 = 1
            r7 = 1
        L_0x0242:
            r6 = 0
            goto L_0x017b
        L_0x0245:
            int r3 = r0.B
            int r4 = r0.A
            if (r3 >= r4) goto L_0x0257
            int r4 = r4 - r3
            r3 = 0
            int r3 = r8.f(r1, r4, r3)
            int r4 = r0.B
            int r4 = r4 + r3
            r0.B = r4
            goto L_0x0245
        L_0x0257:
            boolean r3 = r2.f19952l
            if (r3 != 0) goto L_0x0264
            k5.p r3 = r2.f19944d
            int[] r3 = r3.f20035g
            int r4 = r2.f19946f
            r3 = r3[r4]
            goto L_0x0271
        L_0x0264:
            k5.o r3 = r2.f19942b
            boolean[] r3 = r3.f20021k
            int r4 = r2.f19946f
            boolean r3 = r3[r4]
            if (r3 == 0) goto L_0x0270
            r3 = 1
            goto L_0x0271
        L_0x0270:
            r3 = 0
        L_0x0271:
            k5.n r4 = r2.b()
            if (r4 == 0) goto L_0x027a
            r4 = 1073741824(0x40000000, float:2.0)
            r3 = r3 | r4
        L_0x027a:
            r11 = r3
            k5.n r3 = r2.b()
            if (r3 == 0) goto L_0x0284
            d5.a0$a r3 = r3.f20008c
            goto L_0x0285
        L_0x0284:
            r3 = 0
        L_0x0285:
            int r12 = r0.A
            r13 = 0
            r9 = r14
            r4 = r14
            r14 = r3
            r8.d(r9, r11, r12, r13, r14)
        L_0x028e:
            java.util.ArrayDeque<k5.f$a> r3 = r0.f19926n
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x02d3
            java.util.ArrayDeque<k5.f$a> r3 = r0.f19926n
            java.lang.Object r3 = r3.removeFirst()
            k5.f$a r3 = (k5.f.a) r3
            int r6 = r0.f19934v
            int r7 = r3.f19940b
            int r6 = r6 - r7
            r0.f19934v = r6
            long r6 = r3.f19939a
            long r6 = r6 + r4
            v6.b0 r8 = r0.f19922j
            if (r8 == 0) goto L_0x02b0
            long r6 = r8.a(r6)
        L_0x02b0:
            d5.a0[] r15 = r0.F
            int r14 = r15.length
            r8 = 0
            r13 = 0
        L_0x02b5:
            if (r13 >= r14) goto L_0x028e
            r8 = r15[r13]
            r11 = 1
            int r12 = r3.f19940b
            int r9 = r0.f19934v
            r16 = 0
            r17 = r9
            r9 = r6
            r18 = r13
            r13 = r17
            r17 = r14
            r14 = r16
            r8.d(r9, r11, r12, r13, r14)
            int r13 = r18 + 1
            r14 = r17
            goto L_0x02b5
        L_0x02d3:
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x02dc
            r2 = 0
            r0.f19938z = r2
        L_0x02dc:
            r2 = 3
            r0.f19928p = r2
            r7 = 1
        L_0x02e0:
            if (r7 == 0) goto L_0x0004
            r1 = 0
            return r1
        L_0x02e4:
            android.util.SparseArray<k5.f$b> r2 = r0.f19916d
            int r2 = r2.size()
            r5 = 0
            r6 = 0
        L_0x02ec:
            if (r5 >= r2) goto L_0x030f
            android.util.SparseArray<k5.f$b> r7 = r0.f19916d
            java.lang.Object r7 = r7.valueAt(r5)
            k5.f$b r7 = (k5.f.b) r7
            k5.o r7 = r7.f19942b
            boolean r8 = r7.f20026p
            if (r8 == 0) goto L_0x030c
            long r7 = r7.f20013c
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x030c
            android.util.SparseArray<k5.f$b> r3 = r0.f19916d
            java.lang.Object r3 = r3.valueAt(r5)
            k5.f$b r3 = (k5.f.b) r3
            r6 = r3
            r3 = r7
        L_0x030c:
            int r5 = r5 + 1
            goto L_0x02ec
        L_0x030f:
            if (r6 != 0) goto L_0x0316
            r2 = 3
            r0.f19928p = r2
            goto L_0x0004
        L_0x0316:
            long r7 = r27.l()
            long r3 = r3 - r7
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0336
            r1.g(r2)
            k5.o r2 = r6.f19942b
            v6.v r3 = r2.f20025o
            byte[] r4 = r3.f26518a
            int r3 = r3.f26520c
            r5 = 0
            r1.readFully(r4, r5, r3)
            v6.v r3 = r2.f20025o
            r3.D(r5)
            r2.f20026p = r5
            goto L_0x0004
        L_0x0336:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x033e:
            long r5 = r0.f19930r
            int r2 = (int) r5
            int r5 = r0.f19931s
            int r2 = r2 - r5
            v6.v r5 = r0.f19932t
            if (r5 == 0) goto L_0x0548
            byte[] r6 = r5.f26518a
            r7 = 8
            r1.readFully(r6, r7, r2)
            k5.a$b r2 = new k5.a$b
            int r6 = r0.f19929q
            r2.<init>(r6, r5)
            long r9 = r27.l()
            java.util.ArrayDeque<k5.a$a> r7 = r0.f19925m
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0371
            java.util.ArrayDeque<k5.a$a> r3 = r0.f19925m
            java.lang.Object r3 = r3.peek()
            k5.a$a r3 = (k5.a.C0173a) r3
            java.util.List<k5.a$b> r3 = r3.f19896c
            r3.add(r2)
            goto L_0x054b
        L_0x0371:
            if (r6 != r4) goto L_0x042f
            r1 = 8
            r5.D(r1)
            int r1 = r5.f()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 4
            r5.E(r2)
            long r2 = r5.t()
            if (r1 != 0) goto L_0x0393
            long r6 = r5.t()
            long r11 = r5.t()
            goto L_0x039b
        L_0x0393:
            long r6 = r5.w()
            long r11 = r5.w()
        L_0x039b:
            long r9 = r9 + r11
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r6
            r15 = r2
            long r17 = v6.e0.P(r11, r13, r15)
            r1 = 2
            r5.E(r1)
            int r1 = r5.x()
            int[] r4 = new int[r1]
            long[] r8 = new long[r1]
            long[] r15 = new long[r1]
            long[] r13 = new long[r1]
            r11 = 0
            r11 = r17
            r14 = 0
        L_0x03b9:
            if (r14 >= r1) goto L_0x0408
            int r16 = r5.f()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r16 & r19
            if (r19 != 0) goto L_0x0400
            long r19 = r5.t()
            r21 = 2147483647(0x7fffffff, float:NaN)
            r16 = r16 & r21
            r4[r14] = r16
            r8[r14] = r9
            r13[r14] = r11
            long r6 = r6 + r19
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r6
            r28 = r1
            r1 = r13
            r21 = r14
            r13 = r19
            r19 = r6
            r6 = r15
            r15 = r2
            long r11 = v6.e0.P(r11, r13, r15)
            r13 = r1[r21]
            long r13 = r11 - r13
            r6[r21] = r13
            r7 = 4
            r5.E(r7)
            r7 = r4[r21]
            long r13 = (long) r7
            long r9 = r9 + r13
            int r14 = r21 + 1
            r13 = r1
            r15 = r6
            r6 = r19
            r1 = r28
            goto L_0x03b9
        L_0x0400:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0408:
            r1 = r13
            r6 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            d5.d r3 = new d5.d
            r3.<init>(r4, r8, r6, r1)
            android.util.Pair r1 = android.util.Pair.create(r2, r3)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f19937y = r2
            d5.k r2 = r0.E
            java.lang.Object r1 = r1.second
            d5.x r1 = (d5.x) r1
            r2.b(r1)
            r1 = 1
            r0.H = r1
            goto L_0x0545
        L_0x042f:
            if (r6 != r3) goto L_0x0545
            d5.a0[] r1 = r0.F
            int r1 = r1.length
            if (r1 != 0) goto L_0x0438
            goto L_0x0545
        L_0x0438:
            r1 = 8
            r5.D(r1)
            int r1 = r5.f()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x048d
            r4 = 1
            if (r1 == r4) goto L_0x0456
            java.lang.String r2 = "Skipping unsupported emsg version: "
            f0.j.a(r2, r1, r8)
            goto L_0x0545
        L_0x0456:
            long r6 = r5.t()
            long r9 = r5.w()
            r11 = 1000000(0xf4240, double:4.940656E-318)
            r13 = r6
            long r15 = v6.e0.P(r9, r11, r13)
            long r9 = r5.t()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r6 = v6.e0.P(r9, r11, r13)
            long r8 = r5.t()
            java.lang.String r1 = r5.n()
            r1.getClass()
            java.lang.String r4 = r5.n()
            r4.getClass()
            r19 = r1
            r20 = r4
            r21 = r6
            r23 = r8
            r6 = r15
            r14 = r2
            goto L_0x04d0
        L_0x048d:
            java.lang.String r1 = r5.n()
            r1.getClass()
            java.lang.String r4 = r5.n()
            r4.getClass()
            long r12 = r5.t()
            long r6 = r5.t()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = v6.e0.P(r6, r8, r10)
            long r6 = r0.f19937y
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x04b5
            long r6 = r6 + r14
            r16 = r6
            goto L_0x04b7
        L_0x04b5:
            r16 = r2
        L_0x04b7:
            long r6 = r5.t()
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = r12
            long r6 = v6.e0.P(r6, r8, r10)
            long r8 = r5.t()
            r19 = r1
            r20 = r4
            r21 = r6
            r23 = r8
            r6 = r16
        L_0x04d0:
            int r1 = r5.a()
            byte[] r1 = new byte[r1]
            int r4 = r5.a()
            byte[] r8 = r5.f26518a
            int r9 = r5.f26519b
            r10 = 0
            java.lang.System.arraycopy(r8, r9, r1, r10, r4)
            int r8 = r5.f26519b
            int r8 = r8 + r4
            r5.f26519b = r8
            s5.a r4 = new s5.a
            r18 = r4
            r25 = r1
            r18.<init>(r19, r20, r21, r23, r25)
            v6.v r1 = new v6.v
            s5.c r5 = r0.f19923k
            byte[] r4 = r5.a(r4)
            r1.<init>((byte[]) r4)
            int r4 = r1.a()
            d5.a0[] r5 = r0.F
            int r8 = r5.length
            r9 = 0
        L_0x0503:
            if (r9 >= r8) goto L_0x0511
            r10 = r5[r9]
            r11 = 0
            r1.D(r11)
            r10.b(r1, r4)
            int r9 = r9 + 1
            goto L_0x0503
        L_0x0511:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0525
            java.util.ArrayDeque<k5.f$a> r1 = r0.f19926n
            k5.f$a r2 = new k5.f$a
            r2.<init>(r14, r4)
            r1.addLast(r2)
            int r1 = r0.f19934v
            int r1 = r1 + r4
            r0.f19934v = r1
            goto L_0x0545
        L_0x0525:
            v6.b0 r1 = r0.f19922j
            if (r1 == 0) goto L_0x052d
            long r6 = r1.a(r6)
        L_0x052d:
            d5.a0[] r1 = r0.F
            int r2 = r1.length
            r3 = 0
        L_0x0531:
            if (r3 >= r2) goto L_0x0545
            r16 = r1[r3]
            r19 = 1
            r21 = 0
            r22 = 0
            r17 = r6
            r20 = r4
            r16.d(r17, r19, r20, r21, r22)
            int r3 = r3 + 1
            goto L_0x0531
        L_0x0545:
            r1 = r27
            goto L_0x054b
        L_0x0548:
            r1.g(r2)
        L_0x054b:
            long r2 = r27.l()
            r0.k(r2)
            goto L_0x0004
        L_0x0554:
            int r2 = r0.f19931s
            if (r2 != 0) goto L_0x0580
            v6.v r2 = r0.f19924l
            byte[] r2 = r2.f26518a
            r5 = 8
            r6 = 0
            r7 = 1
            boolean r2 = r1.d(r2, r6, r5, r7)
            if (r2 != 0) goto L_0x0569
            r2 = 0
            goto L_0x0759
        L_0x0569:
            r0.f19931s = r5
            v6.v r2 = r0.f19924l
            r2.D(r6)
            v6.v r2 = r0.f19924l
            long r5 = r2.t()
            r0.f19930r = r5
            v6.v r2 = r0.f19924l
            int r2 = r2.f()
            r0.f19929q = r2
        L_0x0580:
            long r5 = r0.f19930r
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x059f
            v6.v r2 = r0.f19924l
            byte[] r2 = r2.f26518a
            r5 = 8
            r1.readFully(r2, r5, r5)
            int r2 = r0.f19931s
            int r2 = r2 + r5
            r0.f19931s = r2
            v6.v r2 = r0.f19924l
            long r5 = r2.w()
            r0.f19930r = r5
            goto L_0x05d0
        L_0x059f:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05d0
            long r5 = r27.b()
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05c1
            java.util.ArrayDeque<k5.a$a> r2 = r0.f19925m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05c1
            java.util.ArrayDeque<k5.a$a> r2 = r0.f19925m
            java.lang.Object r2 = r2.peek()
            k5.a$a r2 = (k5.a.C0173a) r2
            long r5 = r2.f19895b
        L_0x05c1:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05d0
            long r7 = r27.l()
            long r5 = r5 - r7
            int r2 = r0.f19931s
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.f19930r = r5
        L_0x05d0:
            long r5 = r0.f19930r
            int r2 = r0.f19931s
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0765
            long r5 = r27.l()
            int r2 = r0.f19931s
            long r7 = (long) r2
            long r5 = r5 - r7
            int r2 = r0.f19929q
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            r8 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r8) goto L_0x05ed
            if (r2 != r7) goto L_0x0600
        L_0x05ed:
            boolean r2 = r0.H
            if (r2 != 0) goto L_0x0600
            d5.k r2 = r0.E
            d5.x$b r9 = new d5.x$b
            long r10 = r0.f19936x
            r9.<init>(r10, r5)
            r2.b(r9)
            r2 = 1
            r0.H = r2
        L_0x0600:
            int r2 = r0.f19929q
            if (r2 != r8) goto L_0x0621
            android.util.SparseArray<k5.f$b> r2 = r0.f19916d
            int r2 = r2.size()
            r9 = 0
        L_0x060b:
            if (r9 >= r2) goto L_0x0621
            android.util.SparseArray<k5.f$b> r10 = r0.f19916d
            java.lang.Object r10 = r10.valueAt(r9)
            k5.f$b r10 = (k5.f.b) r10
            k5.o r10 = r10.f19942b
            r10.getClass()
            r10.f20013c = r5
            r10.f20012b = r5
            int r9 = r9 + 1
            goto L_0x060b
        L_0x0621:
            int r2 = r0.f19929q
            if (r2 != r7) goto L_0x0632
            r7 = 0
            r0.f19938z = r7
            long r2 = r0.f19930r
            long r5 = r5 + r2
            r0.f19933u = r5
            r2 = 2
            r0.f19928p = r2
            goto L_0x0758
        L_0x0632:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x065f
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x065f
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x065f
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x065f
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x065f
            if (r2 == r8) goto L_0x065f
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x065f
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x065f
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x065d
            goto L_0x065f
        L_0x065d:
            r5 = 0
            goto L_0x0660
        L_0x065f:
            r5 = 1
        L_0x0660:
            if (r5 == 0) goto L_0x068b
            long r2 = r27.l()
            long r4 = r0.f19930r
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.ArrayDeque<k5.a$a> r4 = r0.f19925m
            k5.a$a r5 = new k5.a$a
            int r6 = r0.f19929q
            r5.<init>(r6, r2)
            r4.push(r5)
            long r4 = r0.f19930r
            int r6 = r0.f19931s
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0686
            r0.k(r2)
            goto L_0x0758
        L_0x0686:
            r26.c()
            goto L_0x0758
        L_0x068b:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            if (r2 == r5) goto L_0x0714
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x0714
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x0714
            if (r2 == r4) goto L_0x0714
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x0714
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x0714
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x0714
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x0714
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x0714
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x0714
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x0714
            if (r2 != r3) goto L_0x0712
            goto L_0x0714
        L_0x0712:
            r2 = 0
            goto L_0x0715
        L_0x0714:
            r2 = 1
        L_0x0715:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == 0) goto L_0x074c
            int r2 = r0.f19931s
            r5 = 8
            if (r2 != r5) goto L_0x0744
            long r6 = r0.f19930r
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x073c
            v6.v r2 = new v6.v
            int r3 = (int) r6
            r2.<init>((int) r3)
            v6.v r3 = r0.f19924l
            byte[] r3 = r3.f26518a
            byte[] r4 = r2.f26518a
            r6 = 0
            java.lang.System.arraycopy(r3, r6, r4, r6, r5)
            r0.f19932t = r2
            r2 = 1
            r0.f19928p = r2
            goto L_0x0758
        L_0x073c:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0744:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x074c:
            long r5 = r0.f19930r
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x075d
            r2 = 0
            r0.f19932t = r2
            r2 = 1
            r0.f19928p = r2
        L_0x0758:
            r2 = 1
        L_0x0759:
            if (r2 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x075d:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0765:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            goto L_0x076e
        L_0x076d:
            throw r1
        L_0x076e:
            goto L_0x076d
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.f.f(d5.j, d5.w):int");
    }

    public void h(long j10, long j11) {
        int size = this.f19916d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19916d.valueAt(i10).e();
        }
        this.f19926n.clear();
        this.f19934v = 0;
        this.f19935w = j11;
        this.f19925m.clear();
        c();
    }

    public void i(k kVar) {
        int i10;
        this.E = kVar;
        c();
        a0[] a0VarArr = new a0[2];
        this.F = a0VarArr;
        a0 a0Var = this.f19927o;
        if (a0Var != null) {
            a0VarArr[0] = a0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = 100;
        if ((this.f19913a & 4) != 0) {
            a0VarArr[i10] = this.E.l(100, 5);
            i11 = 101;
            i10++;
        }
        a0[] a0VarArr2 = (a0[]) e0.L(this.F, i10);
        this.F = a0VarArr2;
        for (a0 c10 : a0VarArr2) {
            c10.c(J);
        }
        this.G = new a0[this.f19915c.size()];
        int i12 = 0;
        while (i12 < this.G.length) {
            a0 l10 = this.E.l(i11, 3);
            l10.c(this.f19915c.get(i12));
            this.G[i12] = l10;
            i12++;
            i11++;
        }
        m mVar = this.f19914b;
        if (mVar != null) {
            this.f19916d.put(0, new b(kVar.l(0, mVar.f19996b), new p(this.f19914b, new long[0], new int[0], 0, new long[0], new int[0], 0), new d(0, 0, 0, 0)));
            this.E.d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(long r48) throws x4.m0 {
        /*
            r47 = this;
            r0 = r47
            r1 = r0
        L_0x0003:
            java.util.ArrayDeque<k5.a$a> r2 = r1.f19925m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x07a8
            java.util.ArrayDeque<k5.a$a> r2 = r1.f19925m
            java.lang.Object r2 = r2.peek()
            k5.a$a r2 = (k5.a.C0173a) r2
            long r2 = r2.f19895b
            int r4 = (r2 > r48 ? 1 : (r2 == r48 ? 0 : -1))
            if (r4 != 0) goto L_0x07a8
            java.util.ArrayDeque<k5.a$a> r2 = r1.f19925m
            java.lang.Object r2 = r2.pop()
            r3 = r2
            k5.a$a r3 = (k5.a.C0173a) r3
            int r2 = r3.f19894a
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r5 = 12
            if (r2 != r4) goto L_0x0169
            k5.m r2 = r1.f19914b
            if (r2 != 0) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            java.lang.String r4 = "Unexpected moov box."
            v6.a.e(r2, r4)
            java.util.List<k5.a$b> r2 = r3.f19896c
            c5.f r7 = g(r2)
            r2 = 1836475768(0x6d766578, float:4.7659988E27)
            k5.a$a r2 = r3.b(r2)
            r2.getClass()
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            java.util.List<k5.a$b> r4 = r2.f19896c
            int r4 = r4.size()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
        L_0x0058:
            if (r10 >= r4) goto L_0x00c8
            java.util.List<k5.a$b> r12 = r2.f19896c
            java.lang.Object r12 = r12.get(r10)
            k5.a$b r12 = (k5.a.b) r12
            int r13 = r12.f19894a
            r14 = 1953654136(0x74726578, float:7.6818474E31)
            if (r13 != r14) goto L_0x00a1
            v6.v r12 = r12.f19898b
            r12.D(r5)
            int r5 = r12.f()
            int r13 = r12.f()
            int r13 = r13 + -1
            int r14 = r12.f()
            int r15 = r12.f()
            int r12 = r12.f()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            k5.d r6 = new k5.d
            r6.<init>(r13, r14, r15, r12)
            android.util.Pair r5 = android.util.Pair.create(r5, r6)
            java.lang.Object r6 = r5.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r5 = r5.second
            k5.d r5 = (k5.d) r5
            r11.put(r6, r5)
            goto L_0x00c1
        L_0x00a1:
            r5 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r13 != r5) goto L_0x00c1
            v6.v r5 = r12.f19898b
            r6 = 8
            r5.D(r6)
            int r8 = r5.f()
            int r8 = r8 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 != 0) goto L_0x00bc
            long r8 = r5.t()
            goto L_0x00c3
        L_0x00bc:
            long r8 = r5.w()
            goto L_0x00c3
        L_0x00c1:
            r6 = 8
        L_0x00c3:
            int r10 = r10 + 1
            r5 = 12
            goto L_0x0058
        L_0x00c8:
            d5.t r4 = new d5.t
            r4.<init>()
            int r2 = r1.f19913a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x00d5
            r2 = 1
            goto L_0x00d6
        L_0x00d5:
            r2 = 0
        L_0x00d6:
            r10 = 0
            k5.e r12 = new k5.e
            r12.<init>(r1)
            r5 = r8
            r8 = r2
            r9 = r10
            r10 = r12
            java.util.List r2 = k5.c.e(r3, r4, r5, r7, r8, r9, r10)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            android.util.SparseArray<k5.f$b> r4 = r1.f19916d
            int r4 = r4.size()
            if (r4 != 0) goto L_0x012a
            r4 = 0
        L_0x00f3:
            if (r4 >= r3) goto L_0x0124
            java.lang.Object r5 = r2.get(r4)
            k5.p r5 = (k5.p) r5
            k5.m r6 = r5.f20029a
            k5.f$b r7 = new k5.f$b
            d5.k r8 = r1.E
            int r9 = r6.f19996b
            d5.a0 r8 = r8.l(r4, r9)
            int r9 = r6.f19995a
            k5.d r9 = r1.d(r11, r9)
            r7.<init>(r8, r5, r9)
            android.util.SparseArray<k5.f$b> r5 = r1.f19916d
            int r8 = r6.f19995a
            r5.put(r8, r7)
            long r7 = r1.f19936x
            long r5 = r6.f19999e
            long r5 = java.lang.Math.max(r7, r5)
            r1.f19936x = r5
            int r4 = r4 + 1
            goto L_0x00f3
        L_0x0124:
            d5.k r2 = r1.E
            r2.d()
            goto L_0x0166
        L_0x012a:
            android.util.SparseArray<k5.f$b> r4 = r1.f19916d
            int r4 = r4.size()
            if (r4 != r3) goto L_0x0134
            r4 = 1
            goto L_0x0135
        L_0x0134:
            r4 = 0
        L_0x0135:
            v6.a.d(r4)
            r4 = 0
        L_0x0139:
            if (r4 >= r3) goto L_0x0166
            java.lang.Object r5 = r2.get(r4)
            k5.p r5 = (k5.p) r5
            k5.m r6 = r5.f20029a
            android.util.SparseArray<k5.f$b> r7 = r1.f19916d
            int r8 = r6.f19995a
            java.lang.Object r7 = r7.get(r8)
            k5.f$b r7 = (k5.f.b) r7
            int r6 = r6.f19995a
            k5.d r6 = r1.d(r11, r6)
            r7.f19944d = r5
            r7.f19945e = r6
            d5.a0 r6 = r7.f19941a
            k5.m r5 = r5.f20029a
            x4.b0 r5 = r5.f20000f
            r6.c(r5)
            r7.e()
            int r4 = r4 + 1
            goto L_0x0139
        L_0x0166:
            r3 = r0
            goto L_0x07a5
        L_0x0169:
            r6 = 8
            r4 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r4) goto L_0x078e
            android.util.SparseArray<k5.f$b> r2 = r1.f19916d
            int r4 = r1.f19913a
            byte[] r1 = r1.f19920h
            java.util.List<k5.a$a> r5 = r3.f19897d
            int r5 = r5.size()
            r7 = 0
        L_0x017d:
            if (r7 >= r5) goto L_0x06f5
            java.util.List<k5.a$a> r8 = r3.f19897d
            java.lang.Object r8 = r8.get(r7)
            k5.a$a r8 = (k5.a.C0173a) r8
            int r9 = r8.f19894a
            r10 = 1953653094(0x74726166, float:7.6813435E31)
            if (r9 != r10) goto L_0x06d9
            r9 = 1952868452(0x74666864, float:7.301914E31)
            k5.a$b r9 = r8.c(r9)
            r9.getClass()
            v6.v r9 = r9.f19898b
            r9.D(r6)
            int r10 = r9.f()
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r11 = r9.f()
            int r12 = r2.size()
            r13 = 1
            if (r12 != r13) goto L_0x01b8
            r11 = 0
            java.lang.Object r11 = r2.valueAt(r11)
            k5.f$b r11 = (k5.f.b) r11
            goto L_0x01be
        L_0x01b8:
            java.lang.Object r11 = r2.get(r11)
            k5.f$b r11 = (k5.f.b) r11
        L_0x01be:
            if (r11 != 0) goto L_0x01c2
            r11 = 0
            goto L_0x0209
        L_0x01c2:
            r12 = r10 & 1
            if (r12 == 0) goto L_0x01d0
            long r12 = r9.w()
            k5.o r14 = r11.f19942b
            r14.f20012b = r12
            r14.f20013c = r12
        L_0x01d0:
            k5.d r12 = r11.f19945e
            r13 = r10 & 2
            if (r13 == 0) goto L_0x01dd
            int r13 = r9.f()
            int r13 = r13 + -1
            goto L_0x01df
        L_0x01dd:
            int r13 = r12.f19908a
        L_0x01df:
            r14 = r10 & 8
            if (r14 == 0) goto L_0x01e8
            int r14 = r9.f()
            goto L_0x01ea
        L_0x01e8:
            int r14 = r12.f19909b
        L_0x01ea:
            r15 = r10 & 16
            if (r15 == 0) goto L_0x01f3
            int r15 = r9.f()
            goto L_0x01f5
        L_0x01f3:
            int r15 = r12.f19910c
        L_0x01f5:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01fe
            int r9 = r9.f()
            goto L_0x0200
        L_0x01fe:
            int r9 = r12.f19911d
        L_0x0200:
            k5.o r10 = r11.f19942b
            k5.d r12 = new k5.d
            r12.<init>(r13, r14, r15, r9)
            r10.f20011a = r12
        L_0x0209:
            if (r11 != 0) goto L_0x020d
            goto L_0x06d9
        L_0x020d:
            k5.o r9 = r11.f19942b
            long r12 = r9.f20027q
            boolean r10 = r9.f20028r
            r11.e()
            r14 = 1
            r11.f19952l = r14
            r14 = 1952867444(0x74666474, float:7.3014264E31)
            k5.a$b r14 = r8.c(r14)
            if (r14 == 0) goto L_0x0244
            r15 = r4 & 2
            if (r15 != 0) goto L_0x0244
            v6.v r10 = r14.f19898b
            r10.D(r6)
            int r6 = r10.f()
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            r12 = 1
            if (r6 != r12) goto L_0x023b
            long r13 = r10.w()
            goto L_0x023f
        L_0x023b:
            long r13 = r10.t()
        L_0x023f:
            r9.f20027q = r13
            r9.f20028r = r12
            goto L_0x0248
        L_0x0244:
            r9.f20027q = r12
            r9.f20028r = r10
        L_0x0248:
            java.util.List<k5.a$b> r6 = r8.f19896c
            int r10 = r6.size()
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0251:
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            if (r12 >= r10) goto L_0x027d
            java.lang.Object r16 = r6.get(r12)
            r17 = r2
            r2 = r16
            k5.a$b r2 = (k5.a.b) r2
            r16 = r5
            int r5 = r2.f19894a
            if (r5 != r15) goto L_0x0276
            v6.v r2 = r2.f19898b
            r5 = 12
            r2.D(r5)
            int r2 = r2.v()
            if (r2 <= 0) goto L_0x0276
            int r14 = r14 + r2
            int r13 = r13 + 1
        L_0x0276:
            int r12 = r12 + 1
            r5 = r16
            r2 = r17
            goto L_0x0251
        L_0x027d:
            r17 = r2
            r16 = r5
            r2 = 0
            r11.f19948h = r2
            r11.f19947g = r2
            r11.f19946f = r2
            k5.o r2 = r11.f19942b
            r2.f20014d = r13
            r2.f20015e = r14
            int[] r5 = r2.f20017g
            int r5 = r5.length
            if (r5 >= r13) goto L_0x029b
            long[] r5 = new long[r13]
            r2.f20016f = r5
            int[] r5 = new int[r13]
            r2.f20017g = r5
        L_0x029b:
            int[] r5 = r2.f20018h
            int r5 = r5.length
            if (r5 >= r14) goto L_0x02b8
            int r14 = r14 * 125
            int r14 = r14 / 100
            int[] r5 = new int[r14]
            r2.f20018h = r5
            int[] r5 = new int[r14]
            r2.f20019i = r5
            long[] r5 = new long[r14]
            r2.f20020j = r5
            boolean[] r5 = new boolean[r14]
            r2.f20021k = r5
            boolean[] r5 = new boolean[r14]
            r2.f20023m = r5
        L_0x02b8:
            r2 = 0
            r5 = 0
            r12 = 0
        L_0x02bb:
            if (r2 >= r10) goto L_0x048a
            java.lang.Object r18 = r6.get(r2)
            r13 = r18
            k5.a$b r13 = (k5.a.b) r13
            int r14 = r13.f19894a
            if (r14 != r15) goto L_0x045b
            int r14 = r5 + 1
            v6.v r13 = r13.f19898b
            r15 = 8
            r13.D(r15)
            int r15 = r13.f()
            r18 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r18
            r18 = r6
            k5.p r6 = r11.f19944d
            k5.m r6 = r6.f20029a
            r21 = r10
            k5.o r10 = r11.f19942b
            r22 = r14
            k5.d r14 = r10.f20011a
            int r23 = v6.e0.f26436a
            int[] r0 = r10.f20017g
            int r23 = r13.v()
            r0[r5] = r23
            long[] r0 = r10.f20016f
            r23 = r7
            r24 = r8
            long r7 = r10.f20012b
            r0[r5] = r7
            r7 = r15 & 1
            if (r7 == 0) goto L_0x0312
            r7 = r0[r5]
            r25 = r3
            int r3 = r13.f()
            r26 = r1
            r27 = r2
            long r1 = (long) r3
            long r7 = r7 + r1
            r0[r5] = r7
            goto L_0x0318
        L_0x0312:
            r26 = r1
            r27 = r2
            r25 = r3
        L_0x0318:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x031e
            r0 = 1
            goto L_0x031f
        L_0x031e:
            r0 = 0
        L_0x031f:
            int r1 = r14.f19911d
            if (r0 == 0) goto L_0x0327
            int r1 = r13.f()
        L_0x0327:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x032d
            r2 = 1
            goto L_0x032e
        L_0x032d:
            r2 = 0
        L_0x032e:
            r3 = r15 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0334
            r3 = 1
            goto L_0x0335
        L_0x0334:
            r3 = 0
        L_0x0335:
            r7 = r15 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x033b
            r7 = 1
            goto L_0x033c
        L_0x033b:
            r7 = 0
        L_0x033c:
            r8 = r15 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0342
            r8 = 1
            goto L_0x0343
        L_0x0342:
            r8 = 0
        L_0x0343:
            long[] r15 = r6.f20002h
            if (r15 == 0) goto L_0x036d
            r28 = r1
            int r1 = r15.length
            r29 = r9
            r9 = 1
            if (r1 != r9) goto L_0x036b
            r1 = 0
            r30 = r15[r1]
            r19 = 0
            int r9 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x036b
            long[] r9 = r6.f20003i
            r30 = r9[r1]
            r32 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r8
            long r8 = r6.f19997c
            r34 = r8
            long r8 = v6.e0.P(r30, r32, r34)
            r19 = r8
            goto L_0x0374
        L_0x036b:
            r1 = r8
            goto L_0x0372
        L_0x036d:
            r28 = r1
            r1 = r8
            r29 = r9
        L_0x0372:
            r19 = 0
        L_0x0374:
            int[] r8 = r10.f20018h
            int[] r9 = r10.f20019i
            long[] r15 = r10.f20020j
            r30 = r8
            boolean[] r8 = r10.f20021k
            r31 = r8
            int r8 = r6.f19996b
            r32 = r11
            r11 = 2
            if (r8 != r11) goto L_0x038d
            r8 = r4 & 1
            if (r8 == 0) goto L_0x038d
            r8 = 1
            goto L_0x038e
        L_0x038d:
            r8 = 0
        L_0x038e:
            int[] r11 = r10.f20017g
            r5 = r11[r5]
            int r5 = r5 + r12
            r33 = r12
            long r11 = r6.f19997c
            r39 = r8
            r6 = r9
            long r8 = r10.f20027q
            r40 = r4
            r4 = r33
        L_0x03a0:
            if (r4 >= r5) goto L_0x0450
            if (r2 == 0) goto L_0x03ad
            int r33 = r13.f()
            r41 = r2
            r2 = r33
            goto L_0x03b1
        L_0x03ad:
            r41 = r2
            int r2 = r14.f19909b
        L_0x03b1:
            b(r2)
            if (r3 == 0) goto L_0x03bf
            int r33 = r13.f()
            r42 = r3
            r3 = r33
            goto L_0x03c3
        L_0x03bf:
            r42 = r3
            int r3 = r14.f19910c
        L_0x03c3:
            b(r3)
            if (r7 == 0) goto L_0x03d1
            int r33 = r13.f()
            r43 = r0
            r0 = r33
            goto L_0x03de
        L_0x03d1:
            if (r4 != 0) goto L_0x03da
            if (r0 == 0) goto L_0x03da
            r43 = r0
            r0 = r28
            goto L_0x03de
        L_0x03da:
            r43 = r0
            int r0 = r14.f19911d
        L_0x03de:
            if (r1 == 0) goto L_0x03f5
            r44 = r1
            int r1 = r13.f()
            r45 = r13
            r46 = r14
            long r13 = (long) r1
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 * r33
            long r13 = r13 / r11
            int r1 = (int) r13
            r6[r4] = r1
            goto L_0x03fe
        L_0x03f5:
            r44 = r1
            r45 = r13
            r46 = r14
            r1 = 0
            r6[r4] = r1
        L_0x03fe:
            r35 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r8
            r37 = r11
            long r13 = v6.e0.P(r33, r35, r37)
            long r13 = r13 - r19
            r15[r4] = r13
            boolean r1 = r10.f20028r
            if (r1 != 0) goto L_0x0421
            r13 = r15[r4]
            r1 = r32
            r32 = r5
            k5.p r5 = r1.f19944d
            r34 = r6
            long r5 = r5.f20036h
            long r13 = r13 + r5
            r15[r4] = r13
            goto L_0x0427
        L_0x0421:
            r34 = r6
            r1 = r32
            r32 = r5
        L_0x0427:
            r30[r4] = r3
            int r0 = r0 >> 16
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0435
            if (r39 == 0) goto L_0x0433
            if (r4 != 0) goto L_0x0435
        L_0x0433:
            r0 = 1
            goto L_0x0436
        L_0x0435:
            r0 = 0
        L_0x0436:
            r31[r4] = r0
            long r2 = (long) r2
            long r8 = r8 + r2
            int r4 = r4 + 1
            r5 = r32
            r6 = r34
            r2 = r41
            r3 = r42
            r0 = r43
            r13 = r45
            r14 = r46
            r32 = r1
            r1 = r44
            goto L_0x03a0
        L_0x0450:
            r1 = r32
            r32 = r5
            r10.f20027q = r8
            r5 = r22
            r12 = r32
            goto L_0x0470
        L_0x045b:
            r26 = r1
            r27 = r2
            r25 = r3
            r40 = r4
            r18 = r6
            r23 = r7
            r24 = r8
            r29 = r9
            r21 = r10
            r1 = r11
            r33 = r12
        L_0x0470:
            int r2 = r27 + 1
            r15 = 1953658222(0x7472756e, float:7.683823E31)
            r0 = r47
            r11 = r1
            r6 = r18
            r10 = r21
            r7 = r23
            r8 = r24
            r3 = r25
            r1 = r26
            r9 = r29
            r4 = r40
            goto L_0x02bb
        L_0x048a:
            r26 = r1
            r25 = r3
            r40 = r4
            r23 = r7
            r24 = r8
            r29 = r9
            r1 = r11
            k5.p r0 = r1.f19944d
            k5.m r0 = r0.f20029a
            r1 = r29
            k5.d r2 = r1.f20011a
            r2.getClass()
            int r2 = r2.f19908a
            k5.n r0 = r0.a(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            k5.a$b r2 = r8.c(r2)
            if (r2 == 0) goto L_0x0531
            r0.getClass()
            v6.v r2 = r2.f19898b
            int r3 = r0.f20009d
            r4 = 8
            r2.D(r4)
            int r5 = r2.f()
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r6
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x04cc
            r2.E(r4)
        L_0x04cc:
            int r4 = r2.s()
            int r5 = r2.v()
            int r6 = r1.f20015e
            if (r5 > r6) goto L_0x051a
            if (r4 != 0) goto L_0x04ef
            boolean[] r4 = r1.f20023m
            r6 = 0
            r7 = 0
        L_0x04de:
            if (r6 >= r5) goto L_0x04fe
            int r9 = r2.s()
            int r7 = r7 + r9
            if (r9 <= r3) goto L_0x04e9
            r9 = 1
            goto L_0x04ea
        L_0x04e9:
            r9 = 0
        L_0x04ea:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L_0x04de
        L_0x04ef:
            if (r4 <= r3) goto L_0x04f3
            r2 = 1
            goto L_0x04f4
        L_0x04f3:
            r2 = 0
        L_0x04f4:
            int r4 = r4 * r5
            r3 = 0
            int r7 = r4 + 0
            boolean[] r4 = r1.f20023m
            java.util.Arrays.fill(r4, r3, r5, r2)
        L_0x04fe:
            r2 = 0
            boolean[] r3 = r1.f20023m
            int r4 = r1.f20015e
            java.util.Arrays.fill(r3, r5, r4, r2)
            if (r7 <= 0) goto L_0x0531
            v6.v r2 = r1.f20025o
            byte[] r3 = r2.f26518a
            int r4 = r3.length
            if (r4 >= r7) goto L_0x0511
            byte[] r3 = new byte[r7]
        L_0x0511:
            r2.B(r3, r7)
            r2 = 1
            r1.f20022l = r2
            r1.f20026p = r2
            goto L_0x0531
        L_0x051a:
            x4.m0 r0 = new x4.m0
            java.lang.String r2 = "Saiz sample count "
            java.lang.String r3 = " is greater than fragment sample count"
            java.lang.StringBuilder r2 = androidx.appcompat.widget.y0.a(r2, r5, r3)
            int r1 = r1.f20015e
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0531:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            k5.a$b r2 = r8.c(r2)
            if (r2 == 0) goto L_0x0577
            v6.v r2 = r2.f19898b
            r3 = 8
            r2.D(r3)
            int r4 = r2.f()
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0550
            r2.E(r3)
        L_0x0550:
            int r3 = r2.v()
            if (r3 != r6) goto L_0x056b
            int r3 = r4 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r4 = r1.f20013c
            if (r3 != 0) goto L_0x0563
            long r2 = r2.t()
            goto L_0x0567
        L_0x0563:
            long r2 = r2.w()
        L_0x0567:
            long r4 = r4 + r2
            r1.f20013c = r4
            goto L_0x0577
        L_0x056b:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Unexpected saio entry count: "
            java.lang.String r1 = androidx.appcompat.widget.d0.a(r1, r3)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0577:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            k5.a$b r2 = r8.c(r2)
            if (r2 == 0) goto L_0x0586
            v6.v r2 = r2.f19898b
            r3 = 0
            j(r2, r3, r1)
        L_0x0586:
            if (r0 == 0) goto L_0x058b
            java.lang.String r0 = r0.f20007b
            goto L_0x058c
        L_0x058b:
            r0 = 0
        L_0x058c:
            r29 = r0
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x0591:
            java.util.List<k5.a$b> r4 = r8.f19896c
            int r4 = r4.size()
            if (r0 >= r4) goto L_0x05ce
            java.util.List<k5.a$b> r4 = r8.f19896c
            java.lang.Object r4 = r4.get(r0)
            k5.a$b r4 = (k5.a.b) r4
            v6.v r5 = r4.f19898b
            int r4 = r4.f19894a
            r6 = 1935828848(0x73626770, float:1.7937577E31)
            r7 = 1936025959(0x73656967, float:1.817587E31)
            if (r4 != r6) goto L_0x05ba
            r4 = 12
            r5.D(r4)
            int r4 = r5.f()
            if (r4 != r7) goto L_0x05cb
            r2 = r5
            goto L_0x05cb
        L_0x05ba:
            r6 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r4 != r9) goto L_0x05cb
            r5.D(r6)
            int r4 = r5.f()
            if (r4 != r7) goto L_0x05cb
            r3 = r5
        L_0x05cb:
            int r0 = r0 + 1
            goto L_0x0591
        L_0x05ce:
            if (r2 == 0) goto L_0x0692
            if (r3 != 0) goto L_0x05d4
            goto L_0x0692
        L_0x05d4:
            r0 = 8
            r2.D(r0)
            int r0 = r2.f()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r4 = 4
            r2.E(r4)
            r5 = 1
            if (r0 != r5) goto L_0x05eb
            r2.E(r4)
        L_0x05eb:
            int r0 = r2.f()
            if (r0 != r5) goto L_0x068a
            r0 = 8
            r3.D(r0)
            int r0 = r3.f()
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.E(r4)
            if (r0 != r5) goto L_0x0616
            long r4 = r3.t()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x060e
            goto L_0x061c
        L_0x060e:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Variable length description in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0616:
            r2 = 2
            if (r0 < r2) goto L_0x061c
            r3.E(r4)
        L_0x061c:
            long r4 = r3.t()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0682
            r0 = 1
            r3.E(r0)
            int r2 = r3.s()
            r4 = r2 & 240(0xf0, float:3.36E-43)
            int r32 = r4 >> 4
            r33 = r2 & 15
            int r2 = r3.s()
            if (r2 != r0) goto L_0x063e
            r0 = 1
            r28 = 1
            goto L_0x0641
        L_0x063e:
            r0 = 0
            r28 = 0
        L_0x0641:
            if (r28 != 0) goto L_0x0644
            goto L_0x0692
        L_0x0644:
            int r30 = r3.s()
            r0 = 16
            byte[] r2 = new byte[r0]
            byte[] r4 = r3.f26518a
            int r5 = r3.f26519b
            r6 = 0
            java.lang.System.arraycopy(r4, r5, r2, r6, r0)
            int r4 = r3.f26519b
            int r4 = r4 + r0
            r3.f26519b = r4
            if (r30 != 0) goto L_0x0670
            int r0 = r3.s()
            byte[] r4 = new byte[r0]
            byte[] r5 = r3.f26518a
            int r7 = r3.f26519b
            java.lang.System.arraycopy(r5, r7, r4, r6, r0)
            int r5 = r3.f26519b
            int r5 = r5 + r0
            r3.f26519b = r5
            r34 = r4
            goto L_0x0673
        L_0x0670:
            r0 = 0
            r34 = r0
        L_0x0673:
            r0 = 1
            r1.f20022l = r0
            k5.n r0 = new k5.n
            r27 = r0
            r31 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r1.f20024n = r0
            goto L_0x0692
        L_0x0682:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x068a:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0692:
            java.util.List<k5.a$b> r0 = r8.f19896c
            int r0 = r0.size()
            r2 = 0
        L_0x0699:
            if (r2 >= r0) goto L_0x06d6
            java.util.List<k5.a$b> r3 = r8.f19896c
            java.lang.Object r3 = r3.get(r2)
            k5.a$b r3 = (k5.a.b) r3
            int r4 = r3.f19894a
            r5 = 1970628964(0x75756964, float:3.1109627E32)
            if (r4 != r5) goto L_0x06cf
            v6.v r3 = r3.f19898b
            r4 = 8
            r3.D(r4)
            byte[] r4 = r3.f26518a
            int r5 = r3.f26519b
            r6 = 0
            r7 = 16
            r9 = r26
            java.lang.System.arraycopy(r4, r5, r9, r6, r7)
            int r4 = r3.f26519b
            int r4 = r4 + r7
            r3.f26519b = r4
            byte[] r4 = I
            boolean r4 = java.util.Arrays.equals(r9, r4)
            if (r4 != 0) goto L_0x06cb
            goto L_0x06d1
        L_0x06cb:
            j(r3, r7, r1)
            goto L_0x06d1
        L_0x06cf:
            r9 = r26
        L_0x06d1:
            int r2 = r2 + 1
            r26 = r9
            goto L_0x0699
        L_0x06d6:
            r9 = r26
            goto L_0x06e4
        L_0x06d9:
            r9 = r1
            r17 = r2
            r25 = r3
            r40 = r4
            r16 = r5
            r23 = r7
        L_0x06e4:
            int r7 = r23 + 1
            r6 = 8
            r0 = r47
            r1 = r9
            r5 = r16
            r2 = r17
            r3 = r25
            r4 = r40
            goto L_0x017d
        L_0x06f5:
            r2 = r3
            java.util.List<k5.a$b> r0 = r2.f19896c
            c5.f r0 = g(r0)
            r3 = r47
            if (r0 == 0) goto L_0x0743
            android.util.SparseArray<k5.f$b> r1 = r3.f19916d
            int r1 = r1.size()
            r2 = 0
        L_0x0707:
            if (r2 >= r1) goto L_0x0743
            android.util.SparseArray<k5.f$b> r4 = r3.f19916d
            java.lang.Object r4 = r4.valueAt(r2)
            k5.f$b r4 = (k5.f.b) r4
            k5.p r5 = r4.f19944d
            k5.m r5 = r5.f20029a
            k5.o r6 = r4.f19942b
            k5.d r6 = r6.f20011a
            int r7 = v6.e0.f26436a
            int r6 = r6.f19908a
            k5.n r5 = r5.a(r6)
            if (r5 == 0) goto L_0x0726
            java.lang.String r5 = r5.f20007b
            goto L_0x0727
        L_0x0726:
            r5 = 0
        L_0x0727:
            c5.f r5 = r0.a(r5)
            k5.p r6 = r4.f19944d
            k5.m r6 = r6.f20029a
            x4.b0 r6 = r6.f20000f
            x4.b0$b r6 = r6.a()
            r6.f27428n = r5
            x4.b0 r5 = r6.a()
            d5.a0 r4 = r4.f19941a
            r4.c(r5)
            int r2 = r2 + 1
            goto L_0x0707
        L_0x0743:
            long r0 = r3.f19935w
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x078c
            android.util.SparseArray<k5.f$b> r0 = r3.f19916d
            int r0 = r0.size()
            r1 = 0
        L_0x0755:
            if (r1 >= r0) goto L_0x0785
            android.util.SparseArray<k5.f$b> r2 = r3.f19916d
            java.lang.Object r2 = r2.valueAt(r1)
            k5.f$b r2 = (k5.f.b) r2
            long r4 = r3.f19935w
            int r6 = r2.f19946f
        L_0x0763:
            k5.o r7 = r2.f19942b
            int r8 = r7.f20015e
            if (r6 >= r8) goto L_0x0782
            long[] r8 = r7.f20020j
            r9 = r8[r6]
            int[] r8 = r7.f20019i
            r8 = r8[r6]
            long r11 = (long) r8
            long r9 = r9 + r11
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x0782
            boolean[] r7 = r7.f20021k
            boolean r7 = r7[r6]
            if (r7 == 0) goto L_0x077f
            r2.f19949i = r6
        L_0x077f:
            int r6 = r6 + 1
            goto L_0x0763
        L_0x0782:
            int r1 = r1 + 1
            goto L_0x0755
        L_0x0785:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f19935w = r0
        L_0x078c:
            r1 = r3
            goto L_0x07a5
        L_0x078e:
            r2 = r3
            r3 = r0
            java.util.ArrayDeque<k5.a$a> r0 = r1.f19925m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x07a5
            java.util.ArrayDeque<k5.a$a> r0 = r1.f19925m
            java.lang.Object r0 = r0.peek()
            k5.a$a r0 = (k5.a.C0173a) r0
            java.util.List<k5.a$a> r0 = r0.f19897d
            r0.add(r2)
        L_0x07a5:
            r0 = r3
            goto L_0x0003
        L_0x07a8:
            r3 = r0
            r47.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.f.k(long):void");
    }

    public f(int i10, v6.b0 b0Var, m mVar, List<b0> list, a0 a0Var) {
        this.f19913a = i10;
        this.f19922j = b0Var;
        this.f19914b = mVar;
        this.f19915c = Collections.unmodifiableList(list);
        this.f19927o = a0Var;
        this.f19923k = new c();
        this.f19924l = new v(16);
        this.f19917e = new v(u.f26498a);
        this.f19918f = new v(5);
        this.f19919g = new v();
        byte[] bArr = new byte[16];
        this.f19920h = bArr;
        this.f19921i = new v(bArr);
        this.f19925m = new ArrayDeque<>();
        this.f19926n = new ArrayDeque<>();
        this.f19916d = new SparseArray<>();
        this.f19936x = -9223372036854775807L;
        this.f19935w = -9223372036854775807L;
        this.f19937y = -9223372036854775807L;
        this.E = k.f13036j;
        this.F = new a0[0];
        this.G = new a0[0];
    }
}
