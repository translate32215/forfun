package k5;

import android.util.Log;
import android.util.Pair;
import k5.a;
import v6.e0;
import v6.s;
import v6.v;
import x4.b0;

/* compiled from: AtomParsers */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f19899a = e0.D("OpusHead");

    /* compiled from: AtomParsers */
    public interface a {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19900a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19901b;

        /* renamed from: c  reason: collision with root package name */
        public final v f19902c;

        public b(a.b bVar, b0 b0Var) {
            v vVar = bVar.f19898b;
            this.f19902c = vVar;
            vVar.D(12);
            int v10 = vVar.v();
            if ("audio/raw".equals(b0Var.f27408t)) {
                int y10 = e0.y(b0Var.I, b0Var.G);
                if (v10 == 0 || v10 % y10 != 0) {
                    Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + y10 + ", stsz sample size: " + v10);
                    v10 = y10;
                }
            }
            this.f19900a = v10 == 0 ? -1 : v10;
            this.f19901b = vVar.v();
        }

        public int a() {
            return this.f19900a;
        }

        public int b() {
            return this.f19901b;
        }

        public int c() {
            int i10 = this.f19900a;
            return i10 == -1 ? this.f19902c.v() : i10;
        }
    }

    /* renamed from: k5.c$c  reason: collision with other inner class name */
    /* compiled from: AtomParsers */
    public static final class C0174c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final v f19903a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19904b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19905c;

        /* renamed from: d  reason: collision with root package name */
        public int f19906d;

        /* renamed from: e  reason: collision with root package name */
        public int f19907e;

        public C0174c(a.b bVar) {
            v vVar = bVar.f19898b;
            this.f19903a = vVar;
            vVar.D(12);
            this.f19905c = vVar.v() & 255;
            this.f19904b = vVar.v();
        }

        public int a() {
            return -1;
        }

        public int b() {
            return this.f19904b;
        }

        public int c() {
            int i10 = this.f19905c;
            if (i10 == 8) {
                return this.f19903a.s();
            }
            if (i10 == 16) {
                return this.f19903a.x();
            }
            int i11 = this.f19906d;
            this.f19906d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f19907e & 15;
            }
            int s10 = this.f19903a.s();
            this.f19907e = s10;
            return (s10 & 240) >> 4;
        }
    }

    public static Pair<String, byte[]> a(v vVar, int i10) {
        vVar.D(i10 + 8 + 4);
        vVar.E(1);
        b(vVar);
        vVar.E(2);
        int s10 = vVar.s();
        if ((s10 & 128) != 0) {
            vVar.E(2);
        }
        if ((s10 & 64) != 0) {
            vVar.E(vVar.x());
        }
        if ((s10 & 32) != 0) {
            vVar.E(2);
        }
        vVar.E(1);
        b(vVar);
        String f10 = s.f(vVar.s());
        if ("audio/mpeg".equals(f10) || "audio/vnd.dts".equals(f10) || "audio/vnd.dts.hd".equals(f10)) {
            return Pair.create(f10, (Object) null);
        }
        vVar.E(12);
        vVar.E(1);
        int b10 = b(vVar);
        byte[] bArr = new byte[b10];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, b10);
        vVar.f26519b += b10;
        return Pair.create(f10, bArr);
    }

    public static int b(v vVar) {
        int s10 = vVar.s();
        int i10 = s10 & 127;
        while ((s10 & 128) == 128) {
            s10 = vVar.s();
            i10 = (i10 << 7) | (s10 & 127);
        }
        return i10;
    }

    public static Pair<Integer, n> c(v vVar, int i10, int i11) {
        Pair<Integer, n> pair;
        Integer num;
        n nVar;
        int i12;
        int i13;
        byte[] bArr;
        v vVar2 = vVar;
        int i14 = vVar2.f26519b;
        while (i14 - i10 < i11) {
            vVar2.D(i14);
            int f10 = vVar.f();
            v6.a.e(f10 > 0, "childAtomSize should be positive");
            if (vVar.f() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                int i17 = 0;
                String str = null;
                Integer num2 = null;
                while (i15 - i14 < f10) {
                    vVar2.D(i15);
                    int f11 = vVar.f();
                    int f12 = vVar.f();
                    if (f12 == 1718775137) {
                        num2 = Integer.valueOf(vVar.f());
                    } else if (f12 == 1935894637) {
                        vVar2.E(4);
                        str = vVar2.p(4);
                    } else if (f12 == 1935894633) {
                        i16 = i15;
                        i17 = f11;
                    }
                    i15 += f11;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    v6.a.g(num2, "frma atom is mandatory");
                    v6.a.e(i16 != -1, "schi atom is mandatory");
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 >= i17) {
                            num = num2;
                            nVar = null;
                            break;
                        }
                        vVar2.D(i18);
                        int f13 = vVar.f();
                        if (vVar.f() == 1952804451) {
                            int f14 = (vVar.f() >> 24) & 255;
                            vVar2.E(1);
                            if (f14 == 0) {
                                vVar2.E(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int s10 = vVar.s();
                                i13 = s10 & 15;
                                i12 = (s10 & 240) >> 4;
                            }
                            boolean z10 = vVar.s() == 1;
                            int s11 = vVar.s();
                            byte[] bArr2 = new byte[16];
                            System.arraycopy(vVar2.f26518a, vVar2.f26519b, bArr2, 0, 16);
                            vVar2.f26519b += 16;
                            if (!z10 || s11 != 0) {
                                bArr = null;
                            } else {
                                int s12 = vVar.s();
                                byte[] bArr3 = new byte[s12];
                                System.arraycopy(vVar2.f26518a, vVar2.f26519b, bArr3, 0, s12);
                                vVar2.f26519b += s12;
                                bArr = bArr3;
                            }
                            num = num2;
                            nVar = new n(z10, str, s11, bArr2, i12, i13, bArr);
                        } else {
                            Integer num3 = num2;
                            i18 += f13;
                        }
                    }
                    v6.a.g(nVar, "tenc atom is mandatory");
                    pair = Pair.create(num, nVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i14 += f10;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k5.p d(k5.m r38, k5.a.C0173a r39, d5.t r40) throws x4.m0 {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            k5.a$b r3 = r0.c(r3)
            if (r3 == 0) goto L_0x0017
            k5.c$b r4 = new k5.c$b
            x4.b0 r5 = r1.f20000f
            r4.<init>(r3, r5)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            k5.a$b r3 = r0.c(r3)
            if (r3 == 0) goto L_0x05d6
            k5.c$c r4 = new k5.c$c
            r4.<init>(r3)
        L_0x0025:
            int r3 = r4.b()
            r5 = 0
            if (r3 != 0) goto L_0x0043
            k5.p r9 = new k5.p
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r0 = r9
            r1 = r38
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0043:
            r5 = 1937007471(0x7374636f, float:1.9362445E31)
            k5.a$b r5 = r0.c(r5)
            r6 = 1
            if (r5 != 0) goto L_0x0059
            r5 = 1668232756(0x636f3634, float:4.4126776E21)
            k5.a$b r5 = r0.c(r5)
            r5.getClass()
            r7 = 1
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            v6.v r5 = r5.f19898b
            r8 = 1937011555(0x73747363, float:1.9367382E31)
            k5.a$b r8 = r0.c(r8)
            r8.getClass()
            v6.v r8 = r8.f19898b
            r9 = 1937011827(0x73747473, float:1.9367711E31)
            k5.a$b r9 = r0.c(r9)
            r9.getClass()
            v6.v r9 = r9.f19898b
            r10 = 1937011571(0x73747373, float:1.9367401E31)
            k5.a$b r10 = r0.c(r10)
            if (r10 == 0) goto L_0x0080
            v6.v r10 = r10.f19898b
            goto L_0x0081
        L_0x0080:
            r10 = 0
        L_0x0081:
            r11 = 1668576371(0x63747473, float:4.5093966E21)
            k5.a$b r0 = r0.c(r11)
            if (r0 == 0) goto L_0x008d
            v6.v r0 = r0.f19898b
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            r11 = 12
            r5.D(r11)
            int r12 = r5.v()
            r8.D(r11)
            int r13 = r8.v()
            int r14 = r8.f()
            if (r14 != r6) goto L_0x00a6
            r14 = 1
            goto L_0x00a7
        L_0x00a6:
            r14 = 0
        L_0x00a7:
            java.lang.String r15 = "first_chunk must be 1"
            v6.a.e(r14, r15)
            r9.D(r11)
            int r14 = r9.v()
            int r14 = r14 - r6
            int r6 = r9.v()
            int r15 = r9.v()
            if (r0 == 0) goto L_0x00c6
            r0.D(r11)
            int r16 = r0.v()
            goto L_0x00c8
        L_0x00c6:
            r16 = 0
        L_0x00c8:
            if (r10 == 0) goto L_0x00dc
            r10.D(r11)
            int r11 = r10.v()
            if (r11 <= 0) goto L_0x00da
            int r17 = r10.v()
            int r17 = r17 + -1
            goto L_0x00df
        L_0x00da:
            r10 = 0
            goto L_0x00dd
        L_0x00dc:
            r11 = 0
        L_0x00dd:
            r17 = -1
        L_0x00df:
            r39 = r6
            int r6 = r4.a()
            r18 = r13
            x4.b0 r13 = r1.f20000f
            java.lang.String r13 = r13.f27408t
            r2 = -1
            if (r6 == r2) goto L_0x010e
            java.lang.String r2 = "audio/raw"
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L_0x0106
            java.lang.String r2 = "audio/g711-mlaw"
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L_0x0106
            java.lang.String r2 = "audio/g711-alaw"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x010e
        L_0x0106:
            if (r14 != 0) goto L_0x010e
            if (r16 != 0) goto L_0x010e
            if (r11 != 0) goto L_0x010e
            r2 = 1
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            r13 = 4
            if (r2 == 0) goto L_0x01bc
            long[] r0 = new long[r12]
            int[] r2 = new int[r12]
            r4 = 0
            r9 = 0
            r10 = -1
            r16 = 0
        L_0x011b:
            int r10 = r10 + 1
            if (r10 != r12) goto L_0x0121
            r11 = 0
            goto L_0x0142
        L_0x0121:
            if (r7 == 0) goto L_0x0128
            long r16 = r5.w()
            goto L_0x012c
        L_0x0128:
            long r16 = r5.t()
        L_0x012c:
            if (r10 != r4) goto L_0x0141
            int r9 = r8.v()
            r8.E(r13)
            int r18 = r18 + -1
            if (r18 <= 0) goto L_0x0140
            int r4 = r8.v()
            int r4 = r4 + -1
            goto L_0x0141
        L_0x0140:
            r4 = -1
        L_0x0141:
            r11 = 1
        L_0x0142:
            if (r11 == 0) goto L_0x0149
            r0[r10] = r16
            r2[r10] = r9
            goto L_0x011b
        L_0x0149:
            long r4 = (long) r15
            r7 = 8192(0x2000, float:1.14794E-41)
            int r7 = r7 / r6
            r8 = 0
            r9 = 0
        L_0x014f:
            if (r8 >= r12) goto L_0x015b
            r10 = r2[r8]
            int r10 = v6.e0.g(r10, r7)
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x014f
        L_0x015b:
            long[] r8 = new long[r9]
            int[] r10 = new int[r9]
            long[] r11 = new long[r9]
            int[] r9 = new int[r9]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0168:
            if (r13 >= r12) goto L_0x01b0
            r17 = r2[r13]
            r18 = r0[r13]
            r37 = r17
            r17 = r0
            r0 = r37
        L_0x0174:
            if (r0 <= 0) goto L_0x01a4
            int r20 = java.lang.Math.min(r7, r0)
            r8[r16] = r18
            int r21 = r6 * r20
            r10[r16] = r21
            r21 = r2
            r2 = r10[r16]
            int r15 = java.lang.Math.max(r15, r2)
            r2 = r6
            r39 = r7
            long r6 = (long) r14
            long r6 = r6 * r4
            r11[r16] = r6
            r6 = 1
            r9[r16] = r6
            r6 = r10[r16]
            long r6 = (long) r6
            long r18 = r18 + r6
            int r14 = r14 + r20
            int r0 = r0 - r20
            int r16 = r16 + 1
            r7 = r39
            r6 = r2
            r2 = r21
            goto L_0x0174
        L_0x01a4:
            r21 = r2
            r2 = r6
            r39 = r7
            int r13 = r13 + 1
            r0 = r17
            r2 = r21
            goto L_0x0168
        L_0x01b0:
            long r6 = (long) r14
            long r4 = r4 * r6
            r0 = r3
            r2 = r8
            r14 = r9
            r3 = r10
            r13 = r11
            r10 = r1
        L_0x01b9:
            r11 = r4
            goto L_0x0358
        L_0x01bc:
            long[] r2 = new long[r3]
            int[] r6 = new int[r3]
            long[] r13 = new long[r3]
            r19 = r11
            int[] r11 = new int[r3]
            r20 = -1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r21 = r15
            r1 = r17
            r22 = r19
            r34 = 0
            r35 = 0
            r19 = r39
            r39 = r14
            r17 = r16
            r14 = 0
            r16 = r9
            r9 = 0
        L_0x01f0:
            java.lang.String r15 = "AtomParsers"
            if (r14 >= r3) goto L_0x02d4
            r26 = 1
            r37 = r23
            r23 = r3
            r3 = r37
        L_0x01fc:
            if (r25 != 0) goto L_0x0239
            r27 = r1
            int r1 = r20 + 1
            if (r1 != r12) goto L_0x0209
            r20 = 0
            r26 = 0
            goto L_0x022e
        L_0x0209:
            if (r7 == 0) goto L_0x0210
            long r28 = r5.w()
            goto L_0x0214
        L_0x0210:
            long r28 = r5.t()
        L_0x0214:
            if (r1 != r3) goto L_0x022a
            int r24 = r8.v()
            r3 = 4
            r8.E(r3)
            int r18 = r18 + -1
            if (r18 <= 0) goto L_0x0229
            int r3 = r8.v()
            int r3 = r3 + -1
            goto L_0x022a
        L_0x0229:
            r3 = -1
        L_0x022a:
            r20 = 1
            r26 = 1
        L_0x022e:
            r20 = r1
            if (r26 == 0) goto L_0x023b
            r25 = r24
            r1 = r27
            r30 = r28
            goto L_0x01fc
        L_0x0239:
            r27 = r1
        L_0x023b:
            if (r26 != 0) goto L_0x0255
            java.lang.String r1 = "Unexpected end of chunk data"
            android.util.Log.w(r15, r1)
            long[] r2 = java.util.Arrays.copyOf(r2, r14)
            int[] r6 = java.util.Arrays.copyOf(r6, r14)
            long[] r13 = java.util.Arrays.copyOf(r13, r14)
            int[] r11 = java.util.Arrays.copyOf(r11, r14)
            r3 = r14
            goto L_0x02d8
        L_0x0255:
            if (r0 == 0) goto L_0x0268
        L_0x0257:
            if (r35 != 0) goto L_0x0266
            if (r17 <= 0) goto L_0x0266
            int r35 = r0.v()
            int r34 = r0.f()
            int r17 = r17 + -1
            goto L_0x0257
        L_0x0266:
            int r35 = r35 + -1
        L_0x0268:
            r1 = r34
            r2[r14] = r30
            int r15 = r4.c()
            r6[r14] = r15
            r15 = r6[r14]
            if (r15 <= r9) goto L_0x0278
            r9 = r6[r14]
        L_0x0278:
            r36 = r2
            r26 = r3
            long r2 = (long) r1
            long r2 = r32 + r2
            r13[r14] = r2
            if (r10 != 0) goto L_0x0285
            r2 = 1
            goto L_0x0286
        L_0x0285:
            r2 = 0
        L_0x0286:
            r11[r14] = r2
            r2 = r27
            if (r14 != r2) goto L_0x029b
            r3 = 1
            r11[r14] = r3
            int r22 = r22 + -1
            if (r22 <= 0) goto L_0x029b
            r10.getClass()
            int r2 = r10.v()
            int r2 = r2 - r3
        L_0x029b:
            r3 = r1
            r15 = r21
            r21 = r2
            long r1 = (long) r15
            long r32 = r32 + r1
            int r19 = r19 + -1
            if (r19 != 0) goto L_0x02b6
            if (r39 <= 0) goto L_0x02b6
            int r1 = r16.v()
            int r2 = r16.f()
            int r15 = r39 + -1
            r19 = r1
            goto L_0x02b9
        L_0x02b6:
            r2 = r15
            r15 = r39
        L_0x02b9:
            r1 = r6[r14]
            r39 = r2
            long r1 = (long) r1
            long r30 = r30 + r1
            int r25 = r25 + -1
            int r14 = r14 + 1
            r34 = r3
            r1 = r21
            r3 = r23
            r23 = r26
            r2 = r36
            r21 = r39
            r39 = r15
            goto L_0x01f0
        L_0x02d4:
            r36 = r2
            r23 = r3
        L_0x02d8:
            r1 = r25
            r4 = r34
            long r4 = (long) r4
            long r4 = r32 + r4
            if (r0 == 0) goto L_0x02f1
        L_0x02e1:
            if (r17 <= 0) goto L_0x02f1
            int r7 = r0.v()
            if (r7 == 0) goto L_0x02eb
            r0 = 0
            goto L_0x02f2
        L_0x02eb:
            r0.f()
            int r17 = r17 + -1
            goto L_0x02e1
        L_0x02f1:
            r0 = 1
        L_0x02f2:
            if (r22 != 0) goto L_0x0304
            if (r19 != 0) goto L_0x0304
            if (r1 != 0) goto L_0x0304
            if (r39 != 0) goto L_0x0304
            r7 = r35
            if (r7 != 0) goto L_0x0306
            if (r0 != 0) goto L_0x0301
            goto L_0x0306
        L_0x0301:
            r10 = r38
            goto L_0x0352
        L_0x0304:
            r7 = r35
        L_0x0306:
            java.lang.String r8 = "Inconsistent stbl box for track "
            java.lang.StringBuilder r8 = android.support.v4.media.a.a(r8)
            r10 = r38
            r14 = r39
            int r12 = r10.f19995a
            r8.append(r12)
            java.lang.String r12 = ": remainingSynchronizationSamples "
            r8.append(r12)
            r12 = r22
            r8.append(r12)
            java.lang.String r12 = ", remainingSamplesAtTimestampDelta "
            r8.append(r12)
            r12 = r19
            r8.append(r12)
            java.lang.String r12 = ", remainingSamplesInChunk "
            r8.append(r12)
            r8.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r8.append(r1)
            r8.append(r14)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r8.append(r1)
            r8.append(r7)
            if (r0 != 0) goto L_0x0346
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0348
        L_0x0346:
            java.lang.String r0 = ""
        L_0x0348:
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.util.Log.w(r15, r0)
        L_0x0352:
            r0 = r3
            r3 = r6
            r15 = r9
            r14 = r11
            goto L_0x01b9
        L_0x0358:
            long r8 = r10.f19997c
            r6 = 1000000(0xf4240, double:4.940656E-318)
            r4 = r11
            r16 = r6
            long r7 = v6.e0.P(r4, r6, r8)
            long[] r1 = r10.f20002h
            if (r1 != 0) goto L_0x037b
            long r0 = r10.f19997c
            r4 = r16
            v6.e0.Q(r13, r4, r0)
            k5.p r9 = new k5.p
            r0 = r9
            r1 = r38
            r4 = r15
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x037b:
            int r1 = r1.length
            r4 = 1
            if (r1 != r4) goto L_0x0431
            int r1 = r10.f19996b
            if (r1 != r4) goto L_0x0431
            int r1 = r13.length
            r4 = 2
            if (r1 < r4) goto L_0x0431
            long[] r1 = r10.f20003i
            r1.getClass()
            r4 = 0
            r5 = r1[r4]
            long[] r1 = r10.f20002h
            r16 = r1[r4]
            long r7 = r10.f19997c
            r4 = r0
            long r0 = r10.f19998d
            r18 = r7
            r20 = r0
            long r0 = v6.e0.P(r16, r18, r20)
            long r0 = r0 + r5
            int r7 = r13.length
            int r7 = r7 + -1
            r8 = 4
            r9 = 0
            int r16 = v6.e0.i(r8, r9, r7)
            r17 = r4
            int r4 = r13.length
            int r4 = r4 - r8
            int r4 = v6.e0.i(r4, r9, r7)
            r7 = r13[r9]
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x03ca
            r7 = r13[r16]
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x03ca
            r7 = r13[r4]
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x03ca
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x03ca
            r4 = 1
            goto L_0x03cb
        L_0x03ca:
            r4 = 0
        L_0x03cb:
            if (r4 == 0) goto L_0x0433
            long r18 = r11 - r0
            r0 = 0
            r0 = r13[r0]
            long r20 = r5 - r0
            x4.b0 r0 = r10.f20000f
            int r0 = r0.H
            long r0 = (long) r0
            long r4 = r10.f19997c
            r22 = r0
            r24 = r4
            long r0 = v6.e0.P(r20, r22, r24)
            x4.b0 r4 = r10.f20000f
            int r4 = r4.H
            long r4 = (long) r4
            long r6 = r10.f19997c
            r20 = r4
            r22 = r6
            long r4 = v6.e0.P(r18, r20, r22)
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x03fc
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0433
        L_0x03fc:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0433
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0433
            int r1 = (int) r0
            r0 = r40
            r0.f13056a = r1
            int r1 = (int) r4
            r0.f13057b = r1
            long r0 = r10.f19997c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            v6.e0.Q(r13, r4, r0)
            long[] r0 = r10.f20002h
            r1 = 0
            r4 = r0[r1]
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r10.f19998d
            long r7 = v6.e0.P(r4, r6, r8)
            k5.p r9 = new k5.p
            r0 = r9
            r1 = r38
            r4 = r15
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0431:
            r17 = r0
        L_0x0433:
            long[] r0 = r10.f20002h
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L_0x047a
            r1 = 0
            r4 = r0[r1]
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x047a
            long[] r0 = r10.f20003i
            r0.getClass()
            r4 = r0[r1]
            r0 = 0
        L_0x044a:
            int r1 = r13.length
            if (r0 >= r1) goto L_0x0461
            r6 = r13[r0]
            long r16 = r6 - r4
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r10.f19997c
            r20 = r6
            long r6 = v6.e0.P(r16, r18, r20)
            r13[r0] = r6
            int r0 = r0 + 1
            goto L_0x044a
        L_0x0461:
            long r16 = r11 - r4
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r10.f19997c
            r20 = r0
            long r7 = v6.e0.P(r16, r18, r20)
            k5.p r9 = new k5.p
            r0 = r9
            r1 = r38
            r4 = r15
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x047a:
            int r1 = r10.f19996b
            r4 = 1
            if (r1 != r4) goto L_0x0481
            r1 = 1
            goto L_0x0482
        L_0x0481:
            r1 = 0
        L_0x0482:
            int r4 = r0.length
            int[] r4 = new int[r4]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r5 = r10.f20003i
            r5.getClass()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0491:
            long[] r11 = r10.f20002h
            int r12 = r11.length
            if (r6 >= r12) goto L_0x04f9
            r39 = r2
            r12 = r3
            r2 = r5[r6]
            r18 = -1
            int r16 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x04ee
            r18 = r11[r6]
            r16 = r12
            long r11 = r10.f19997c
            r24 = r8
            r40 = r9
            long r8 = r10.f19998d
            r20 = r11
            r22 = r8
            long r8 = v6.e0.P(r18, r20, r22)
            r11 = 1
            int r12 = v6.e0.f(r13, r2, r11, r11)
            r4[r6] = r12
            long r2 = r2 + r8
            r8 = 0
            int r2 = v6.e0.b(r13, r2, r1, r8)
            r0[r6] = r2
        L_0x04c4:
            r2 = r4[r6]
            r3 = r0[r6]
            if (r2 >= r3) goto L_0x04d7
            r2 = r4[r6]
            r2 = r14[r2]
            r2 = r2 & r11
            if (r2 != 0) goto L_0x04d7
            r2 = r4[r6]
            int r2 = r2 + r11
            r4[r6] = r2
            goto L_0x04c4
        L_0x04d7:
            r2 = r0[r6]
            r3 = r4[r6]
            int r2 = r2 - r3
            int r2 = r2 + r7
            r3 = r4[r6]
            r8 = r24
            if (r8 == r3) goto L_0x04e5
            r3 = 1
            goto L_0x04e6
        L_0x04e5:
            r3 = 0
        L_0x04e6:
            r3 = r40 | r3
            r7 = r0[r6]
            r9 = r3
            r8 = r7
            r7 = r2
            goto L_0x04f2
        L_0x04ee:
            r40 = r9
            r16 = r12
        L_0x04f2:
            int r6 = r6 + 1
            r2 = r39
            r3 = r16
            goto L_0x0491
        L_0x04f9:
            r39 = r2
            r16 = r3
            r40 = r9
            r1 = 0
            r2 = 1
            r3 = r17
            if (r7 == r3) goto L_0x0506
            goto L_0x0507
        L_0x0506:
            r2 = 0
        L_0x0507:
            r2 = r40 | r2
            if (r2 == 0) goto L_0x050e
            long[] r3 = new long[r7]
            goto L_0x0510
        L_0x050e:
            r3 = r39
        L_0x0510:
            if (r2 == 0) goto L_0x0515
            int[] r5 = new int[r7]
            goto L_0x0517
        L_0x0515:
            r5 = r16
        L_0x0517:
            if (r2 == 0) goto L_0x051a
            r15 = 0
        L_0x051a:
            if (r2 == 0) goto L_0x051f
            int[] r6 = new int[r7]
            goto L_0x0520
        L_0x051f:
            r6 = r14
        L_0x0520:
            long[] r7 = new long[r7]
            r8 = 0
            r11 = 0
        L_0x0525:
            long[] r9 = r10.f20002h
            int r9 = r9.length
            if (r1 >= r9) goto L_0x05b5
            long[] r9 = r10.f20003i
            r23 = r9[r1]
            r9 = r4[r1]
            r25 = r4
            r4 = r0[r1]
            if (r2 == 0) goto L_0x054a
            r26 = r0
            int r0 = r4 - r9
            r40 = r15
            r15 = r39
            java.lang.System.arraycopy(r15, r9, r3, r8, r0)
            r15 = r16
            java.lang.System.arraycopy(r15, r9, r5, r8, r0)
            java.lang.System.arraycopy(r14, r9, r6, r8, r0)
            goto L_0x0550
        L_0x054a:
            r26 = r0
            r40 = r15
            r15 = r16
        L_0x0550:
            r0 = r40
        L_0x0552:
            if (r9 >= r4) goto L_0x059a
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r3
            r27 = r4
            long r3 = r10.f19998d
            r17 = r11
            r21 = r3
            long r3 = v6.e0.P(r17, r19, r21)
            r17 = r13[r9]
            r19 = r13
            r20 = r14
            long r13 = r17 - r23
            r17 = r11
            r11 = 0
            long r28 = java.lang.Math.max(r11, r13)
            r30 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r10.f19997c
            r32 = r11
            long r11 = v6.e0.P(r28, r30, r32)
            long r3 = r3 + r11
            r7[r8] = r3
            if (r2 == 0) goto L_0x058b
            r3 = r5[r8]
            if (r3 <= r0) goto L_0x058b
            r0 = r15[r9]
        L_0x058b:
            int r8 = r8 + 1
            int r9 = r9 + 1
            r3 = r16
            r11 = r17
            r13 = r19
            r14 = r20
            r4 = r27
            goto L_0x0552
        L_0x059a:
            r16 = r3
            r17 = r11
            r19 = r13
            r20 = r14
            long[] r3 = r10.f20002h
            r11 = r3[r1]
            long r11 = r17 + r11
            int r1 = r1 + 1
            r3 = r16
            r4 = r25
            r16 = r15
            r15 = r0
            r0 = r26
            goto L_0x0525
        L_0x05b5:
            r16 = r3
            r17 = r11
            r40 = r15
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r10.f19998d
            r21 = r0
            long r8 = v6.e0.P(r17, r19, r21)
            k5.p r11 = new k5.p
            r0 = r11
            r1 = r38
            r2 = r16
            r3 = r5
            r4 = r40
            r5 = r7
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L_0x05d6:
            x4.m0 r0 = new x4.m0
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            goto L_0x05df
        L_0x05de:
            throw r0
        L_0x05df:
            goto L_0x05de
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.c.d(k5.m, k5.a$a, d5.t):k5.p");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v10, resolved type: ba.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v11, resolved type: ba.s} */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        if (r8 == 0) goto L_0x00e5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x0a98  */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0abf  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0ac4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<k5.p> e(k5.a.C0173a r41, d5.t r42, long r43, c5.f r45, boolean r46, boolean r47, aa.e<k5.m, k5.m> r48) throws x4.m0 {
        /*
            r0 = r41
            r1 = r45
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L_0x000a:
            java.util.List<k5.a$a> r4 = r0.f19897d
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0af6
            java.util.List<k5.a$a> r4 = r0.f19897d
            java.lang.Object r4 = r4.get(r3)
            k5.a$a r4 = (k5.a.C0173a) r4
            int r5 = r4.f19894a
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x0029
            r1 = r48
            r25 = r3
            r3 = r42
            goto L_0x0aed
        L_0x0029:
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            k5.a$b r5 = r0.c(r5)
            r5.getClass()
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            k5.a$a r6 = r4.b(r6)
            r6.getClass()
            r7 = 1751411826(0x68646c72, float:4.3148E24)
            k5.a$b r7 = r6.c(r7)
            r7.getClass()
            v6.v r7 = r7.f19898b
            r8 = 16
            r7.D(r8)
            int r7 = r7.f()
            r8 = 1936684398(0x736f756e, float:1.8971874E31)
            r9 = -1
            if (r7 != r8) goto L_0x005b
            r7 = 1
            r12 = 1
            goto L_0x0085
        L_0x005b:
            r8 = 1986618469(0x76696465, float:1.1834389E33)
            if (r7 != r8) goto L_0x0063
            r7 = 2
            r12 = 2
            goto L_0x0085
        L_0x0063:
            r8 = 1952807028(0x74657874, float:7.272211E31)
            if (r7 == r8) goto L_0x0083
            r8 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r7 == r8) goto L_0x0083
            r8 = 1937072756(0x73756274, float:1.944137E31)
            if (r7 == r8) goto L_0x0083
            r8 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r7 != r8) goto L_0x0078
            goto L_0x0083
        L_0x0078:
            r8 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r7 != r8) goto L_0x0080
            r7 = 5
            r12 = 5
            goto L_0x0085
        L_0x0080:
            r7 = -1
            r12 = -1
            goto L_0x0085
        L_0x0083:
            r7 = 3
            r12 = 3
        L_0x0085:
            if (r12 != r9) goto L_0x008d
            r26 = r2
            r25 = r3
            goto L_0x0a94
        L_0x008d:
            r7 = 1953196132(0x746b6864, float:7.46037E31)
            k5.a$b r7 = r4.c(r7)
            r7.getClass()
            v6.v r7 = r7.f19898b
            r8 = 8
            r7.D(r8)
            int r10 = r7.f()
            int r10 = r10 >> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00ab
            r11 = 8
            goto L_0x00ad
        L_0x00ab:
            r11 = 16
        L_0x00ad:
            r7.E(r11)
            int r11 = r7.f()
            r13 = 4
            r7.E(r13)
            int r13 = r7.f26519b
            if (r10 != 0) goto L_0x00bd
            r8 = 4
        L_0x00bd:
            r14 = 0
        L_0x00be:
            if (r14 >= r8) goto L_0x00cd
            byte[] r15 = r7.f26518a
            int r16 = r13 + r14
            byte r15 = r15[r16]
            if (r15 == r9) goto L_0x00ca
            r9 = 0
            goto L_0x00ce
        L_0x00ca:
            int r14 = r14 + 1
            goto L_0x00be
        L_0x00cd:
            r9 = 1
        L_0x00ce:
            r13 = 0
            if (r9 == 0) goto L_0x00d6
            r7.E(r8)
            goto L_0x00e5
        L_0x00d6:
            if (r10 != 0) goto L_0x00dd
            long r8 = r7.t()
            goto L_0x00e1
        L_0x00dd:
            long r8 = r7.w()
        L_0x00e1:
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x00ea
        L_0x00e5:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00ea:
            r10 = 16
            r7.E(r10)
            int r10 = r7.f()
            int r13 = r7.f()
            r14 = 4
            r7.E(r14)
            int r14 = r7.f()
            int r7 = r7.f()
            r15 = 65536(0x10000, float:9.18355E-41)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            if (r10 != 0) goto L_0x0112
            if (r13 != r15) goto L_0x0112
            if (r14 != r0) goto L_0x0112
            if (r7 != 0) goto L_0x0112
            r0 = 90
            goto L_0x0129
        L_0x0112:
            if (r10 != 0) goto L_0x011d
            if (r13 != r0) goto L_0x011d
            if (r14 != r15) goto L_0x011d
            if (r7 != 0) goto L_0x011d
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0129
        L_0x011d:
            if (r10 != r0) goto L_0x0128
            if (r13 != 0) goto L_0x0128
            if (r14 != 0) goto L_0x0128
            if (r7 != r0) goto L_0x0128
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x0129
        L_0x0128:
            r0 = 0
        L_0x0129:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r43 > r13 ? 1 : (r43 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0134
            r15 = r8
            goto L_0x0136
        L_0x0134:
            r15 = r43
        L_0x0136:
            v6.v r5 = r5.f19898b
            r7 = 8
            r5.D(r7)
            int r7 = r5.f()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 != 0) goto L_0x014a
            r7 = 8
            goto L_0x014c
        L_0x014a:
            r7 = 16
        L_0x014c:
            r5.E(r7)
            long r7 = r5.t()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x015d
            goto L_0x0166
        L_0x015d:
            r17 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r7
            long r9 = v6.e0.P(r15, r17, r19)
        L_0x0166:
            r17 = r9
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            k5.a$a r5 = r6.b(r5)
            r5.getClass()
            r9 = 1937007212(0x7374626c, float:1.9362132E31)
            k5.a$a r5 = r5.b(r9)
            r5.getClass()
            r9 = 1835296868(0x6d646864, float:4.418049E27)
            k5.a$b r6 = r6.c(r9)
            r6.getClass()
            v6.v r6 = r6.f19898b
            r9 = 8
            r6.D(r9)
            int r9 = r6.f()
            int r9 = r9 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 != 0) goto L_0x019a
            r10 = 8
            goto L_0x019c
        L_0x019a:
            r10 = 16
        L_0x019c:
            r6.E(r10)
            long r13 = r6.t()
            if (r9 != 0) goto L_0x01a7
            r9 = 4
            goto L_0x01a9
        L_0x01a7:
            r9 = 8
        L_0x01a9:
            r6.E(r9)
            int r6 = r6.x()
            java.lang.String r9 = ""
            java.lang.StringBuilder r9 = android.support.v4.media.a.a(r9)
            int r10 = r6 >> 10
            r10 = r10 & 31
            int r10 = r10 + 96
            char r10 = (char) r10
            r9.append(r10)
            int r10 = r6 >> 5
            r10 = r10 & 31
            int r10 = r10 + 96
            char r10 = (char) r10
            r9.append(r10)
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            android.util.Pair r6 = android.util.Pair.create(r9, r6)
            r9 = 1937011556(0x73747364, float:1.9367383E31)
            k5.a$b r5 = r5.c(r9)
            r5.getClass()
            v6.v r5 = r5.f19898b
            java.lang.Object r9 = r6.second
            java.lang.String r9 = (java.lang.String) r9
            r10 = 12
            r5.D(r10)
            int r10 = r5.f()
            k5.n[] r15 = new k5.n[r10]
            r13 = 0
            r14 = 0
            r16 = 0
            r19 = 0
            r19 = r14
            r20 = 0
            r22 = 0
        L_0x0205:
            if (r13 >= r10) goto L_0x09f9
            int r14 = r5.f26519b
            r16 = r10
            int r10 = r5.f()
            if (r10 <= 0) goto L_0x0219
            r21 = 1
            r26 = r2
            r25 = r3
            r3 = 1
            goto L_0x0220
        L_0x0219:
            r21 = 0
            r26 = r2
            r25 = r3
            r3 = 0
        L_0x0220:
            java.lang.String r2 = "childAtomSize should be positive"
            v6.a.e(r3, r2)
            int r3 = r5.f()
            r23 = r7
            r7 = 1635148593(0x61766331, float:2.840654E20)
            if (r3 == r7) goto L_0x07bc
            r7 = 1635148595(0x61766333, float:2.8406544E20)
            if (r3 == r7) goto L_0x07bc
            r7 = 1701733238(0x656e6376, float:7.035987E22)
            if (r3 == r7) goto L_0x07bc
            r7 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r3 == r7) goto L_0x07bc
            r7 = 1836070006(0x6d703476, float:4.646239E27)
            if (r3 == r7) goto L_0x07bc
            r7 = 1752589105(0x68766331, float:4.6541277E24)
            if (r3 == r7) goto L_0x07bc
            r7 = 1751479857(0x68657631, float:4.3344087E24)
            if (r3 == r7) goto L_0x07bc
            r7 = 1932670515(0x73323633, float:1.4119387E31)
            if (r3 == r7) goto L_0x07bc
            r7 = 1987063864(0x76703038, float:1.21789965E33)
            if (r3 == r7) goto L_0x07bc
            r7 = 1987063865(0x76703039, float:1.2178997E33)
            if (r3 == r7) goto L_0x07bc
            r7 = 1635135537(0x61763031, float:2.8383572E20)
            if (r3 == r7) goto L_0x07bc
            r7 = 1685479798(0x64766176, float:1.8179687E22)
            if (r3 == r7) goto L_0x07bc
            r7 = 1685479729(0x64766131, float:1.817961E22)
            if (r3 == r7) goto L_0x07bc
            r7 = 1685481573(0x64766865, float:1.8181686E22)
            if (r3 == r7) goto L_0x07bc
            r7 = 1685481521(0x64766831, float:1.8181627E22)
            if (r3 != r7) goto L_0x0278
            goto L_0x07bc
        L_0x0278:
            r7 = 1836069985(0x6d703461, float:4.6462328E27)
            r8 = 1701733217(0x656e6361, float:7.0359778E22)
            r21 = r12
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r3 == r7) goto L_0x03a9
            if (r3 == r8) goto L_0x03a9
            r7 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r3 == r7) goto L_0x03a9
            r7 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r3 == r7) goto L_0x03a9
            r7 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r3 == r7) goto L_0x03a9
            r7 = 1685353315(0x64747363, float:1.803728E22)
            if (r3 == r7) goto L_0x03a9
            r7 = 1685353317(0x64747365, float:1.8037282E22)
            if (r3 == r7) goto L_0x03a9
            r7 = 1685353320(0x64747368, float:1.8037286E22)
            if (r3 == r7) goto L_0x03a9
            r7 = 1685353324(0x6474736c, float:1.803729E22)
            if (r3 == r7) goto L_0x03a9
            r7 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r3 == r7) goto L_0x03a9
            r7 = 1935767394(0x73617762, float:1.7863284E31)
            if (r3 == r7) goto L_0x03a9
            r7 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r3 == r7) goto L_0x03a9
            r7 = 1936684916(0x736f7774, float:1.89725E31)
            if (r3 == r7) goto L_0x03a9
            r7 = 1953984371(0x74776f73, float:7.841539E31)
            if (r3 == r7) goto L_0x03a9
            r7 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r3 == r7) goto L_0x03a9
            r7 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r3 == r7) goto L_0x03a9
            if (r3 == r12) goto L_0x03a9
            r7 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r3 == r7) goto L_0x03a9
            r7 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r3 == r7) goto L_0x03a9
            r7 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r3 == r7) goto L_0x03a9
            r7 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r3 != r7) goto L_0x02e5
            goto L_0x03a9
        L_0x02e5:
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r3 == r2) goto L_0x0338
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r3 == r2) goto L_0x0338
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r3 == r2) goto L_0x0338
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r3 == r2) goto L_0x0338
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r3 != r2) goto L_0x02ff
            goto L_0x0338
        L_0x02ff:
            r2 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r3 != r2) goto L_0x0324
            int r2 = r14 + 8
            int r2 = r2 + 8
            r5.D(r2)
            r2 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r3 != r2) goto L_0x0335
            r5.n()
            java.lang.String r2 = r5.n()
            if (r2 == 0) goto L_0x0335
            x4.b0$b r3 = k5.b.a(r11)
            r3.f27425k = r2
            x4.b0 r19 = r3.a()
            goto L_0x0335
        L_0x0324:
            r2 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r3 != r2) goto L_0x0335
            x4.b0$b r2 = k5.b.a(r11)
            java.lang.String r3 = "application/x-camera-motion"
            r2.f27425k = r3
            x4.b0 r19 = r2.a()
        L_0x0335:
            r12 = r4
            goto L_0x03eb
        L_0x0338:
            int r2 = r14 + 8
            int r2 = r2 + 8
            r5.D(r2)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            java.lang.String r7 = "application/ttml+xml"
            if (r3 != r2) goto L_0x0347
            goto L_0x036e
        L_0x0347:
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r3 != r2) goto L_0x0367
            int r2 = r10 + -8
            int r2 = r2 + -8
            byte[] r3 = new byte[r2]
            byte[] r7 = r5.f26518a
            int r8 = r5.f26519b
            r12 = 0
            java.lang.System.arraycopy(r7, r8, r3, r12, r2)
            int r7 = r5.f26519b
            int r7 = r7 + r2
            r5.f26519b = r7
            ba.s r2 = ba.s.C(r3)
            java.lang.String r3 = "application/x-quicktime-tx3g"
            r7 = r3
            goto L_0x036f
        L_0x0367:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r3 != r2) goto L_0x0378
            java.lang.String r7 = "application/x-mp4-vtt"
        L_0x036e:
            r2 = 0
        L_0x036f:
            r27 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0374:
            r8 = r4
            r3 = r27
            goto L_0x0391
        L_0x0378:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r3 != r2) goto L_0x0381
            r2 = 0
            r27 = 0
            goto L_0x0374
        L_0x0381:
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r3 != r2) goto L_0x03a3
            r27 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r7 = "application/x-mp4-cea-608"
            r2 = 0
            r20 = 1
            goto L_0x0374
        L_0x0391:
            x4.b0$b r12 = k5.b.a(r11)
            r12.f27425k = r7
            r12.f27417c = r9
            r12.f27429o = r3
            r12.f27427m = r2
            x4.b0 r19 = r12.a()
        L_0x03a1:
            r12 = r8
            goto L_0x03eb
        L_0x03a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x03a9:
            r8 = r4
            int r4 = r14 + 8
            r7 = 8
            int r4 = r4 + r7
            r5.D(r4)
            r4 = 6
            if (r47 == 0) goto L_0x03bd
            int r7 = r5.x()
            r5.E(r4)
            goto L_0x03c1
        L_0x03bd:
            r5.E(r7)
            r7 = 0
        L_0x03c1:
            r4 = 20
            if (r7 == 0) goto L_0x03fb
            r12 = 1
            if (r7 != r12) goto L_0x03c9
            goto L_0x03fb
        L_0x03c9:
            r12 = 2
            if (r7 != r12) goto L_0x03a1
            r7 = 16
            r5.E(r7)
            long r27 = r5.m()
            double r27 = java.lang.Double.longBitsToDouble(r27)
            r12 = r8
            long r7 = java.lang.Math.round(r27)
            int r8 = (int) r7
            int r7 = r5.v()
            r5.E(r4)
            r29 = r6
            r28 = r12
            goto L_0x042f
        L_0x03eb:
            r30 = r0
            r29 = r6
            r35 = r10
            r28 = r12
            r31 = r13
            r34 = r14
            r32 = r15
            goto L_0x07b2
        L_0x03fb:
            r12 = r8
            int r4 = r5.x()
            r8 = 6
            r5.E(r8)
            byte[] r8 = r5.f26518a
            r27 = r4
            int r4 = r5.f26519b
            r28 = r12
            int r12 = r4 + 1
            r5.f26519b = r12
            byte r4 = r8[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r29 = r6
            int r6 = r12 + 1
            r5.f26519b = r6
            byte r8 = r8[r12]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 | r4
            int r6 = r6 + 2
            r5.f26519b = r6
            r4 = 1
            if (r7 != r4) goto L_0x042d
            r4 = 16
            r5.E(r4)
        L_0x042d:
            r7 = r27
        L_0x042f:
            int r4 = r5.f26519b
            r6 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r3 != r6) goto L_0x045e
            android.util.Pair r6 = c(r5, r14, r10)
            if (r6 == 0) goto L_0x0459
            java.lang.Object r3 = r6.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r1 != 0) goto L_0x0448
            r12 = 0
            goto L_0x0452
        L_0x0448:
            java.lang.Object r12 = r6.second
            k5.n r12 = (k5.n) r12
            java.lang.String r12 = r12.f20007b
            c5.f r12 = r1.a(r12)
        L_0x0452:
            java.lang.Object r6 = r6.second
            k5.n r6 = (k5.n) r6
            r15[r13] = r6
            goto L_0x045a
        L_0x0459:
            r12 = r1
        L_0x045a:
            r5.D(r4)
            goto L_0x045f
        L_0x045e:
            r12 = r1
        L_0x045f:
            java.lang.String r6 = "audio/ac4"
            java.lang.String r27 = "audio/eac3"
            r30 = r4
            java.lang.String r4 = "audio/ac3"
            r31 = r7
            r7 = 1633889587(0x61632d33, float:2.6191674E20)
            java.lang.String r32 = "audio/raw"
            if (r3 != r7) goto L_0x0474
            r32 = r4
            goto L_0x0505
        L_0x0474:
            r7 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r3 != r7) goto L_0x047d
            r32 = r27
            goto L_0x0505
        L_0x047d:
            r7 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r3 != r7) goto L_0x0486
            r32 = r6
            goto L_0x0505
        L_0x0486:
            r7 = 1685353315(0x64747363, float:1.803728E22)
            if (r3 != r7) goto L_0x048f
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x0503
        L_0x048f:
            r7 = 1685353320(0x64747368, float:1.8037286E22)
            if (r3 == r7) goto L_0x0501
            r7 = 1685353324(0x6474736c, float:1.803729E22)
            if (r3 != r7) goto L_0x049b
            goto L_0x0501
        L_0x049b:
            r7 = 1685353317(0x64747365, float:1.8037282E22)
            if (r3 != r7) goto L_0x04a4
            java.lang.String r3 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0503
        L_0x04a4:
            r7 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r3 != r7) goto L_0x04ac
            java.lang.String r3 = "audio/3gpp"
            goto L_0x0503
        L_0x04ac:
            r7 = 1935767394(0x73617762, float:1.7863284E31)
            if (r3 != r7) goto L_0x04b4
            java.lang.String r3 = "audio/amr-wb"
            goto L_0x0503
        L_0x04b4:
            r7 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r3 == r7) goto L_0x04ff
            r7 = 1936684916(0x736f7774, float:1.89725E31)
            if (r3 != r7) goto L_0x04bf
            goto L_0x04ff
        L_0x04bf:
            r7 = 1953984371(0x74776f73, float:7.841539E31)
            if (r3 != r7) goto L_0x04c7
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0506
        L_0x04c7:
            r7 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r3 == r7) goto L_0x04fc
            r7 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r3 != r7) goto L_0x04d2
            goto L_0x04fc
        L_0x04d2:
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r3 != r7) goto L_0x04da
            java.lang.String r3 = "audio/alac"
            goto L_0x0503
        L_0x04da:
            r7 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r3 != r7) goto L_0x04e2
            java.lang.String r3 = "audio/g711-alaw"
            goto L_0x0503
        L_0x04e2:
            r7 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r3 != r7) goto L_0x04ea
            java.lang.String r3 = "audio/g711-mlaw"
            goto L_0x0503
        L_0x04ea:
            r7 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r3 != r7) goto L_0x04f2
            java.lang.String r3 = "audio/opus"
            goto L_0x0503
        L_0x04f2:
            r7 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r3 != r7) goto L_0x04fa
            java.lang.String r3 = "audio/flac"
            goto L_0x0503
        L_0x04fa:
            r3 = 0
            goto L_0x0503
        L_0x04fc:
            java.lang.String r3 = "audio/mpeg"
            goto L_0x0503
        L_0x04ff:
            r3 = 2
            goto L_0x0506
        L_0x0501:
            java.lang.String r3 = "audio/vnd.dts.hd"
        L_0x0503:
            r32 = r3
        L_0x0505:
            r3 = -1
        L_0x0506:
            r7 = 0
            r33 = 0
            r1 = r33
            r33 = r7
            r7 = r30
            r30 = r0
            r39 = r13
            r13 = r8
            r8 = r31
            r31 = r39
            r40 = r32
            r32 = r15
            r15 = r40
        L_0x051e:
            int r0 = r7 - r14
            if (r0 >= r10) goto L_0x0786
            r5.D(r7)
            int r0 = r5.f()
            if (r0 <= 0) goto L_0x0531
            r34 = 1
            r35 = r10
            r10 = 1
            goto L_0x0536
        L_0x0531:
            r34 = 0
            r35 = r10
            r10 = 0
        L_0x0536:
            v6.a.e(r10, r2)
            int r10 = r5.f()
            r34 = r14
            r14 = 1702061171(0x65736473, float:7.183675E22)
            if (r10 == r14) goto L_0x071b
            if (r47 == 0) goto L_0x0556
            r14 = 2002876005(0x77617665, float:4.5729223E33)
            if (r10 != r14) goto L_0x0556
            r14 = 1702061171(0x65736473, float:7.183675E22)
            r36 = r1
            r37 = r3
            r38 = r4
            goto L_0x0724
        L_0x0556:
            r14 = 1684103987(0x64616333, float:1.6630662E22)
            if (r10 != r14) goto L_0x05a1
            int r10 = r7 + 8
            r5.D(r10)
            java.lang.String r10 = java.lang.Integer.toString(r11)
            int r14 = r5.s()
            r14 = r14 & 192(0xc0, float:2.69E-43)
            int r14 = r14 >> 6
            int[] r19 = z4.b.f28306b
            r14 = r19[r14]
            int r19 = r5.s()
            int[] r36 = z4.b.f28308d
            r37 = r19 & 56
            int r37 = r37 >> 3
            r36 = r36[r37]
            r19 = r19 & 4
            if (r19 == 0) goto L_0x0582
            int r36 = r36 + 1
        L_0x0582:
            r37 = r3
            r3 = r36
            r36 = r1
            x4.b0$b r1 = new x4.b0$b
            r1.<init>()
            r1.f27415a = r10
            r1.f27425k = r4
            r1.f27438x = r3
            r1.f27439y = r14
            r1.f27428n = r12
            r1.f27417c = r9
            x4.b0 r1 = r1.a()
            r38 = r4
            goto L_0x0615
        L_0x05a1:
            r36 = r1
            r37 = r3
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r10 != r1) goto L_0x0619
            int r1 = r7 + 8
            r5.D(r1)
            java.lang.String r1 = java.lang.Integer.toString(r11)
            r3 = 2
            r5.E(r3)
            int r3 = r5.s()
            r3 = r3 & 192(0xc0, float:2.69E-43)
            int r3 = r3 >> 6
            int[] r10 = z4.b.f28306b
            r3 = r10[r3]
            int r10 = r5.s()
            int[] r14 = z4.b.f28308d
            r19 = r10 & 14
            int r19 = r19 >> 1
            r14 = r14[r19]
            r10 = r10 & 1
            if (r10 == 0) goto L_0x05d5
            int r14 = r14 + 1
        L_0x05d5:
            int r10 = r5.s()
            r10 = r10 & 30
            int r10 = r10 >> 1
            if (r10 <= 0) goto L_0x05e9
            int r10 = r5.s()
            r10 = r10 & 2
            if (r10 == 0) goto L_0x05e9
            int r14 = r14 + 2
        L_0x05e9:
            int r10 = r5.a()
            if (r10 <= 0) goto L_0x05fc
            int r10 = r5.s()
            r10 = r10 & 1
            if (r10 == 0) goto L_0x05fc
            java.lang.String r10 = "audio/eac3-joc"
            r38 = r4
            goto L_0x0600
        L_0x05fc:
            r38 = r4
            r10 = r27
        L_0x0600:
            x4.b0$b r4 = new x4.b0$b
            r4.<init>()
            r4.f27415a = r1
            r4.f27425k = r10
            r4.f27438x = r14
            r4.f27439y = r3
            r4.f27428n = r12
            r4.f27417c = r9
            x4.b0 r1 = r4.a()
        L_0x0615:
            r19 = r1
            goto L_0x0716
        L_0x0619:
            r38 = r4
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r10 != r1) goto L_0x0655
            int r1 = r7 + 8
            r5.D(r1)
            java.lang.String r1 = java.lang.Integer.toString(r11)
            r3 = 1
            r5.E(r3)
            int r4 = r5.s()
            r4 = r4 & 32
            int r4 = r4 >> 5
            if (r4 != r3) goto L_0x063b
            r3 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x063e
        L_0x063b:
            r3 = 44100(0xac44, float:6.1797E-41)
        L_0x063e:
            x4.b0$b r4 = new x4.b0$b
            r4.<init>()
            r4.f27415a = r1
            r4.f27425k = r6
            r1 = 2
            r4.f27438x = r1
            r4.f27439y = r3
            r4.f27428n = r12
            r4.f27417c = r9
            x4.b0 r1 = r4.a()
            goto L_0x0615
        L_0x0655:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r10 != r1) goto L_0x066d
            x4.b0$b r1 = k5.b.a(r11)
            r1.f27425k = r15
            r1.f27438x = r8
            r1.f27439y = r13
            r1.f27428n = r12
            r1.f27417c = r9
            x4.b0 r1 = r1.a()
            goto L_0x0615
        L_0x066d:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r10 != r1) goto L_0x068b
            int r1 = r0 + -8
            byte[] r3 = f19899a
            int r4 = r3.length
            int r4 = r4 + r1
            byte[] r4 = java.util.Arrays.copyOf(r3, r4)
            int r10 = r7 + 8
            r5.D(r10)
            int r3 = r3.length
            r5.e(r4, r3, r1)
            java.util.List r1 = q.h.a(r4)
            goto L_0x0718
        L_0x068b:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r10 != r1) goto L_0x06c3
            int r1 = r0 + -12
            int r3 = r1 + 4
            byte[] r3 = new byte[r3]
            r4 = 102(0x66, float:1.43E-43)
            r10 = 0
            r3[r10] = r4
            r4 = 76
            r10 = 1
            r3[r10] = r4
            r4 = 97
            r10 = 2
            r3[r10] = r4
            r4 = 67
            r10 = 3
            r3[r10] = r4
            int r4 = r7 + 12
            r5.D(r4)
            byte[] r4 = r5.f26518a
            int r10 = r5.f26519b
            r14 = 4
            java.lang.System.arraycopy(r4, r10, r3, r14, r1)
            int r4 = r5.f26519b
            int r4 = r4 + r1
            r5.f26519b = r4
            ba.s r1 = ba.s.C(r3)
            r33 = r1
            goto L_0x0716
        L_0x06c3:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r10 != r1) goto L_0x0716
            int r1 = r0 + -12
            byte[] r3 = new byte[r1]
            int r4 = r7 + 12
            r5.D(r4)
            byte[] r4 = r5.f26518a
            int r8 = r5.f26519b
            r10 = 0
            java.lang.System.arraycopy(r4, r8, r3, r10, r1)
            int r4 = r5.f26519b
            int r4 = r4 + r1
            r5.f26519b = r4
            v6.v r1 = new v6.v
            r1.<init>((byte[]) r3)
            r4 = 9
            r1.D(r4)
            int r4 = r1.s()
            r8 = 20
            r1.D(r8)
            int r1 = r1.v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.util.Pair r1 = android.util.Pair.create(r1, r4)
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r13 = r4.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r8 = r1.intValue()
            ba.s r1 = ba.s.C(r3)
            goto L_0x0718
        L_0x0716:
            r1 = r33
        L_0x0718:
            r33 = r1
            goto L_0x0779
        L_0x071b:
            r36 = r1
            r37 = r3
            r38 = r4
            r14 = 1702061171(0x65736473, float:7.183675E22)
        L_0x0724:
            if (r10 != r14) goto L_0x0728
            r1 = r7
            goto L_0x074a
        L_0x0728:
            int r1 = r5.f26519b
        L_0x072a:
            int r3 = r1 - r7
            if (r3 >= r0) goto L_0x0749
            r5.D(r1)
            int r3 = r5.f()
            if (r3 <= 0) goto L_0x0739
            r4 = 1
            goto L_0x073a
        L_0x0739:
            r4 = 0
        L_0x073a:
            v6.a.e(r4, r2)
            int r4 = r5.f()
            r10 = 1702061171(0x65736473, float:7.183675E22)
            if (r4 != r10) goto L_0x0747
            goto L_0x074a
        L_0x0747:
            int r1 = r1 + r3
            goto L_0x072a
        L_0x0749:
            r1 = -1
        L_0x074a:
            r3 = -1
            if (r1 == r3) goto L_0x0779
            android.util.Pair r1 = a(r5, r1)
            java.lang.Object r3 = r1.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0775
            java.lang.String r4 = "audio/mp4a-latm"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x076f
            z4.a$b r4 = z4.a.e(r1)
            int r13 = r4.f28280a
            int r8 = r4.f28281b
            java.lang.String r4 = r4.f28282c
            r36 = r4
        L_0x076f:
            ba.s r1 = ba.s.C(r1)
            r33 = r1
        L_0x0775:
            r1 = r36
            r15 = r3
            goto L_0x077b
        L_0x0779:
            r1 = r36
        L_0x077b:
            int r7 = r7 + r0
            r14 = r34
            r10 = r35
            r3 = r37
            r4 = r38
            goto L_0x051e
        L_0x0786:
            r36 = r1
            r37 = r3
            r35 = r10
            r34 = r14
            if (r19 != 0) goto L_0x07b2
            if (r15 == 0) goto L_0x07b2
            x4.b0$b r0 = k5.b.a(r11)
            r0.f27425k = r15
            r1 = r36
            r0.f27422h = r1
            r0.f27438x = r8
            r0.f27439y = r13
            r3 = r37
            r0.f27440z = r3
            r7 = r33
            r0.f27427m = r7
            r0.f27428n = r12
            r0.f27417c = r9
            x4.b0 r0 = r0.a()
            r19 = r0
        L_0x07b2:
            r27 = r9
            r1 = r30
            r7 = r34
            r8 = r35
            goto L_0x09db
        L_0x07bc:
            r30 = r0
            r28 = r4
            r29 = r6
            r35 = r10
            r21 = r12
            r31 = r13
            r34 = r14
            r32 = r15
            r0 = -1
            int r14 = r34 + 8
            int r14 = r14 + 8
            r5.D(r14)
            r1 = 16
            r5.E(r1)
            int r1 = r5.x()
            int r4 = r5.x()
            r6 = 50
            r5.E(r6)
            int r6 = r5.f26519b
            r7 = 1701733238(0x656e6376, float:7.035987E22)
            if (r3 != r7) goto L_0x081d
            r7 = r34
            r8 = r35
            android.util.Pair r10 = c(r5, r7, r8)
            if (r10 == 0) goto L_0x0816
            java.lang.Object r3 = r10.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r15 = r45
            if (r15 != 0) goto L_0x0805
            r12 = 0
            goto L_0x080f
        L_0x0805:
            java.lang.Object r12 = r10.second
            k5.n r12 = (k5.n) r12
            java.lang.String r12 = r12.f20007b
            c5.f r12 = r15.a(r12)
        L_0x080f:
            java.lang.Object r10 = r10.second
            k5.n r10 = (k5.n) r10
            r32[r31] = r10
            goto L_0x0819
        L_0x0816:
            r15 = r45
            r12 = r15
        L_0x0819:
            r5.D(r6)
            goto L_0x0824
        L_0x081d:
            r15 = r45
            r7 = r34
            r8 = r35
            r12 = r15
        L_0x0824:
            r10 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r3 != r10) goto L_0x082c
            java.lang.String r10 = "video/mpeg"
            goto L_0x082d
        L_0x082c:
            r10 = 0
        L_0x082d:
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r27 = 0
            r33 = 0
            r34 = 0
            r15 = r33
            r33 = r12
            r39 = r27
            r27 = r9
            r9 = r39
        L_0x0840:
            int r12 = r6 - r7
            if (r12 >= r8) goto L_0x09ae
            r5.D(r6)
            int r12 = r5.f26519b
            r35 = r15
            int r15 = r5.f()
            r36 = r0
            if (r15 != 0) goto L_0x085a
            int r0 = r5.f26519b
            int r0 = r0 - r7
            if (r0 != r8) goto L_0x085a
            goto L_0x09b2
        L_0x085a:
            if (r15 <= 0) goto L_0x085e
            r0 = 1
            goto L_0x085f
        L_0x085e:
            r0 = 0
        L_0x085f:
            v6.a.e(r0, r2)
            int r0 = r5.f()
            r37 = r2
            r2 = 1635148611(0x61766343, float:2.8406573E20)
            if (r0 != r2) goto L_0x088b
            if (r10 != 0) goto L_0x0871
            r0 = 1
            goto L_0x0872
        L_0x0871:
            r0 = 0
        L_0x0872:
            v6.a.d(r0)
            int r12 = r12 + 8
            r5.D(r12)
            w6.a r0 = w6.a.b(r5)
            java.util.List<byte[]> r2 = r0.f27017a
            int r9 = r0.f27018b
            if (r34 != 0) goto L_0x0886
            float r13 = r0.f27021e
        L_0x0886:
            java.lang.String r0 = r0.f27022f
            java.lang.String r10 = "video/avc"
            goto L_0x08a9
        L_0x088b:
            r2 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r2) goto L_0x08ad
            if (r10 != 0) goto L_0x0894
            r0 = 1
            goto L_0x0895
        L_0x0894:
            r0 = 0
        L_0x0895:
            v6.a.d(r0)
            int r12 = r12 + 8
            r5.D(r12)
            w6.f r0 = w6.f.a(r5)
            java.util.List<byte[]> r2 = r0.f27053a
            int r9 = r0.f27054b
            java.lang.String r0 = r0.f27055c
            java.lang.String r10 = "video/hevc"
        L_0x08a9:
            r22 = r9
            r9 = r0
            goto L_0x08f4
        L_0x08ad:
            r2 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r2) goto L_0x0994
            r2 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 != r2) goto L_0x08b9
            goto L_0x0994
        L_0x08b9:
            r2 = 1987076931(0x76706343, float:1.21891066E33)
            if (r0 != r2) goto L_0x08d1
            if (r10 != 0) goto L_0x08c2
            r0 = 1
            goto L_0x08c3
        L_0x08c2:
            r0 = 0
        L_0x08c3:
            v6.a.d(r0)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r3 != r0) goto L_0x08ce
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x08e0
        L_0x08ce:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L_0x08e0
        L_0x08d1:
            r2 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r2) goto L_0x08e2
            if (r10 != 0) goto L_0x08da
            r0 = 1
            goto L_0x08db
        L_0x08da:
            r0 = 0
        L_0x08db:
            v6.a.d(r0)
            java.lang.String r0 = "video/av01"
        L_0x08e0:
            r10 = r0
            goto L_0x08f2
        L_0x08e2:
            r2 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r2) goto L_0x08f6
            if (r10 != 0) goto L_0x08eb
            r0 = 1
            goto L_0x08ec
        L_0x08eb:
            r0 = 0
        L_0x08ec:
            v6.a.d(r0)
            java.lang.String r0 = "video/3gpp"
            goto L_0x08e0
        L_0x08f2:
            r2 = r35
        L_0x08f4:
            r0 = r2
            goto L_0x091a
        L_0x08f6:
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r2) goto L_0x0920
            if (r10 != 0) goto L_0x08ff
            r0 = 1
            goto L_0x0900
        L_0x08ff:
            r0 = 0
        L_0x0900:
            v6.a.d(r0)
            android.util.Pair r0 = a(r5, r12)
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0917
            ba.s r0 = ba.s.C(r0)
            r10 = r2
            goto L_0x091a
        L_0x0917:
            r10 = r2
            r0 = r35
        L_0x091a:
            r35 = r0
            r38 = r3
            goto L_0x09a3
        L_0x0920:
            r2 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r2) goto L_0x093f
            int r12 = r12 + 8
            r5.D(r12)
            int r0 = r5.v()
            int r2 = r5.v()
            float r0 = (float) r0
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1
            r13 = r0
            r38 = r3
            r0 = r36
            r34 = 1
            goto L_0x09a5
        L_0x093f:
            r2 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r2) goto L_0x096c
            int r0 = r12 + 8
        L_0x0946:
            int r2 = r0 - r12
            if (r2 >= r15) goto L_0x0968
            r5.D(r0)
            int r2 = r5.f()
            int r14 = r5.f()
            r38 = r3
            r3 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r14 != r3) goto L_0x0964
            byte[] r3 = r5.f26518a
            int r2 = r2 + r0
            byte[] r14 = java.util.Arrays.copyOfRange(r3, r0, r2)
            goto L_0x09a3
        L_0x0964:
            int r0 = r0 + r2
            r3 = r38
            goto L_0x0946
        L_0x0968:
            r38 = r3
            r14 = 0
            goto L_0x09a3
        L_0x096c:
            r38 = r3
            r2 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r2) goto L_0x09a3
            int r0 = r5.s()
            r2 = 3
            r5.E(r2)
            if (r0 != 0) goto L_0x09a3
            int r0 = r5.s()
            if (r0 == 0) goto L_0x0992
            r3 = 1
            if (r0 == r3) goto L_0x0990
            r3 = 2
            if (r0 == r3) goto L_0x098e
            if (r0 == r2) goto L_0x098c
            goto L_0x09a3
        L_0x098c:
            r0 = 3
            goto L_0x09a5
        L_0x098e:
            r0 = 2
            goto L_0x09a5
        L_0x0990:
            r0 = 1
            goto L_0x09a5
        L_0x0992:
            r0 = 0
            goto L_0x09a5
        L_0x0994:
            r38 = r3
            w6.c r0 = w6.c.e(r5)
            if (r0 == 0) goto L_0x09a3
            java.lang.Object r0 = r0.f27030c
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "video/dolby-vision"
        L_0x09a3:
            r0 = r36
        L_0x09a5:
            int r6 = r6 + r15
            r15 = r35
            r2 = r37
            r3 = r38
            goto L_0x0840
        L_0x09ae:
            r36 = r0
            r35 = r15
        L_0x09b2:
            if (r10 != 0) goto L_0x09b7
            r1 = r30
            goto L_0x09db
        L_0x09b7:
            x4.b0$b r0 = k5.b.a(r11)
            r0.f27425k = r10
            r0.f27422h = r9
            r0.f27430p = r1
            r0.f27431q = r4
            r0.f27434t = r13
            r1 = r30
            r0.f27433s = r1
            r0.f27435u = r14
            r2 = r36
            r0.f27436v = r2
            r2 = r35
            r0.f27427m = r2
            r12 = r33
            r0.f27428n = r12
            x4.b0 r19 = r0.a()
        L_0x09db:
            int r14 = r7 + r8
            r5.D(r14)
            int r13 = r31 + 1
            r0 = r1
            r10 = r16
            r12 = r21
            r7 = r23
            r3 = r25
            r2 = r26
            r9 = r27
            r4 = r28
            r6 = r29
            r15 = r32
            r1 = r45
            goto L_0x0205
        L_0x09f9:
            r26 = r2
            r25 = r3
            r28 = r4
            r29 = r6
            r23 = r7
            r21 = r12
            r32 = r15
            if (r46 != 0) goto L_0x0a8e
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r4 = r28
            k5.a$a r0 = r4.b(r0)
            if (r0 == 0) goto L_0x0a90
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            k5.a$b r0 = r0.c(r1)
            if (r0 != 0) goto L_0x0a1f
            r0 = 0
            goto L_0x0a83
        L_0x0a1f:
            v6.v r0 = r0.f19898b
            r1 = 8
            r0.D(r1)
            int r1 = r0.f()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0.v()
            long[] r3 = new long[r2]
            long[] r5 = new long[r2]
            r6 = 0
        L_0x0a37:
            if (r6 >= r2) goto L_0x0a7f
            r7 = 1
            if (r1 != r7) goto L_0x0a41
            long r8 = r0.w()
            goto L_0x0a45
        L_0x0a41:
            long r8 = r0.t()
        L_0x0a45:
            r3[r6] = r8
            if (r1 != r7) goto L_0x0a4e
            long r7 = r0.m()
            goto L_0x0a53
        L_0x0a4e:
            int r7 = r0.f()
            long r7 = (long) r7
        L_0x0a53:
            r5[r6] = r7
            byte[] r7 = r0.f26518a
            int r8 = r0.f26519b
            int r9 = r8 + 1
            r0.f26519b = r9
            byte r8 = r7[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r10 = r9 + 1
            r0.f26519b = r10
            byte r7 = r7[r9]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r7 | r8
            short r7 = (short) r7
            r8 = 1
            if (r7 != r8) goto L_0x0a77
            r7 = 2
            r0.E(r7)
            int r6 = r6 + 1
            goto L_0x0a37
        L_0x0a77:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0a7f:
            android.util.Pair r0 = android.util.Pair.create(r3, r5)
        L_0x0a83:
            if (r0 == 0) goto L_0x0a90
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            goto L_0x0a92
        L_0x0a8e:
            r4 = r28
        L_0x0a90:
            r0 = 0
            r1 = 0
        L_0x0a92:
            if (r19 != 0) goto L_0x0a98
        L_0x0a94:
            r0 = 0
            r1 = r48
            goto L_0x0ab7
        L_0x0a98:
            k5.m r2 = new k5.m
            r3 = r29
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r13 = r3.longValue()
            r10 = r2
            r12 = r21
            r3 = r32
            r15 = r23
            r21 = r3
            r23 = r1
            r24 = r0
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24)
            r1 = r48
            r0 = r2
        L_0x0ab7:
            java.lang.Object r0 = r1.apply(r0)
            k5.m r0 = (k5.m) r0
            if (r0 != 0) goto L_0x0ac4
            r3 = r42
            r2 = r26
            goto L_0x0aed
        L_0x0ac4:
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            k5.a$a r2 = r4.b(r2)
            r2.getClass()
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            k5.a$a r2 = r2.b(r3)
            r2.getClass()
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            k5.a$a r2 = r2.b(r3)
            r2.getClass()
            r3 = r42
            k5.p r0 = d(r0, r2, r3)
            r2 = r26
            r2.add(r0)
        L_0x0aed:
            int r0 = r25 + 1
            r1 = r45
            r3 = r0
            r0 = r41
            goto L_0x000a
        L_0x0af6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.c.e(k5.a$a, d5.t, long, c5.f, boolean, boolean, aa.e):java.util.List");
    }
}
