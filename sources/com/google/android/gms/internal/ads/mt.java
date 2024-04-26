package com.google.android.gms.internal.ads;

import android.util.Pair;
import e8.eg0;
import e8.pd0;
import e8.w60;
import e8.xd0;
import o.a;
import v6.a0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7499a = eg0.f("vide");

    /* renamed from: b  reason: collision with root package name */
    public static final int f7500b = eg0.f("soun");

    /* renamed from: c  reason: collision with root package name */
    public static final int f7501c = eg0.f("text");

    /* renamed from: d  reason: collision with root package name */
    public static final int f7502d = eg0.f("sbtl");

    /* renamed from: e  reason: collision with root package name */
    public static final int f7503e = eg0.f("subt");

    /* renamed from: f  reason: collision with root package name */
    public static final int f7504f = eg0.f("clcp");

    /* renamed from: g  reason: collision with root package name */
    public static final int f7505g = eg0.f("cenc");

    /* renamed from: h  reason: collision with root package name */
    public static final int f7506h = eg0.f("meta");

    public static int a(w60 w60, int i10, int i11, a0 a0Var, int i12) {
        w60 w602 = w60;
        int i13 = w602.f17221b;
        while (true) {
            boolean z10 = false;
            if (i13 - i10 >= i11) {
                return 0;
            }
            w602.h(i13);
            int b10 = w60.b();
            int i14 = 1;
            a.b(b10 > 0, "childAtomSize should be positive");
            if (w60.b() == pd0.W) {
                int i15 = i13 + 8;
                Pair pair = null;
                Integer num = null;
                xd0 xd0 = null;
                boolean z11 = false;
                while (i15 - i13 < b10) {
                    w602.h(i15);
                    int b11 = w60.b();
                    int b12 = w60.b();
                    if (b12 == pd0.f15949c0) {
                        num = Integer.valueOf(w60.b());
                    } else if (b12 == pd0.X) {
                        w602.i(4);
                        z11 = w60.b() == f7505g;
                    } else if (b12 == pd0.Y) {
                        int i16 = i15 + 8;
                        while (true) {
                            if (i16 - i15 >= b11) {
                                xd0 = null;
                                break;
                            }
                            w602.h(i16);
                            int b13 = w60.b();
                            if (w60.b() == pd0.Z) {
                                w602.i(6);
                                boolean z12 = w60.d() == i14;
                                int d10 = w60.d();
                                byte[] bArr = new byte[16];
                                System.arraycopy(w602.f17220a, w602.f17221b, bArr, 0, 16);
                                w602.f17221b += 16;
                                xd0 = new xd0(z12, d10, bArr);
                            } else {
                                i16 += b13;
                                i14 = 1;
                            }
                        }
                    }
                    i15 += b11;
                    i14 = 1;
                }
                if (z11) {
                    a.b(num != null, "frma atom is mandatory");
                    if (xd0 != null) {
                        z10 = true;
                    }
                    a.b(z10, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, xd0);
                }
                if (pair != null) {
                    ((xd0[]) a0Var.f26420a)[i12] = (xd0) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            a0 a0Var2 = a0Var;
            i13 += b10;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: java.util.List<byte[]>} */
    /* JADX WARNING: type inference failed for: r0v15, types: [e8.bc0, V[]] */
    /* JADX WARNING: type inference failed for: r0v30, types: [e8.bc0, V[]] */
    /* JADX WARNING: type inference failed for: r2v40, types: [e8.bc0, V[]] */
    /* JADX WARNING: type inference failed for: r2v48, types: [e8.bc0, V[]] */
    /* JADX WARNING: type inference failed for: r2v55, types: [e8.bc0, V[]] */
    /* JADX WARNING: type inference failed for: r6v77, types: [e8.bc0, V[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        if (r14 == 0) goto L_0x00a2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e8.yd0 b(e8.od0 r65, e8.qd0 r66, long r67, com.google.android.gms.internal.ads.et r69, boolean r70) throws e8.cc0 {
        /*
            r0 = r65
            int r1 = e8.pd0.F
            e8.od0 r1 = r0.c(r1)
            int r2 = e8.pd0.T
            e8.qd0 r2 = r1.b(r2)
            e8.w60 r2 = r2.P0
            r3 = 16
            r2.h(r3)
            int r2 = r2.b()
            int r4 = f7500b
            r5 = 3
            r6 = -1
            r7 = 4
            r8 = 2
            if (r2 != r4) goto L_0x0023
            r12 = 1
            goto L_0x0043
        L_0x0023:
            int r4 = f7499a
            if (r2 != r4) goto L_0x0029
            r12 = 2
            goto L_0x0043
        L_0x0029:
            int r4 = f7501c
            if (r2 == r4) goto L_0x0042
            int r4 = f7502d
            if (r2 == r4) goto L_0x0042
            int r4 = f7503e
            if (r2 == r4) goto L_0x0042
            int r4 = f7504f
            if (r2 != r4) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r4 = f7506h
            if (r2 != r4) goto L_0x0040
            r12 = 4
            goto L_0x0043
        L_0x0040:
            r12 = -1
            goto L_0x0043
        L_0x0042:
            r12 = 3
        L_0x0043:
            r2 = 0
            if (r12 != r6) goto L_0x0047
            return r2
        L_0x0047:
            int r4 = e8.pd0.P
            e8.qd0 r4 = r0.b(r4)
            e8.w60 r4 = r4.P0
            r10 = 8
            r4.h(r10)
            int r11 = r4.b()
            int r11 = r11 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L_0x0061
            r13 = 8
            goto L_0x0063
        L_0x0061:
            r13 = 16
        L_0x0063:
            r4.i(r13)
            int r13 = r4.b()
            r4.i(r7)
            int r14 = r4.f17221b
            if (r11 != 0) goto L_0x0073
            r15 = 4
            goto L_0x0075
        L_0x0073:
            r15 = 8
        L_0x0075:
            r9 = 0
        L_0x0076:
            if (r9 >= r15) goto L_0x0085
            byte[] r2 = r4.f17220a
            int r19 = r14 + r9
            byte r2 = r2[r19]
            if (r2 == r6) goto L_0x0082
            r2 = 0
            goto L_0x0086
        L_0x0082:
            int r9 = r9 + 1
            goto L_0x0076
        L_0x0085:
            r2 = 1
        L_0x0086:
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0093
            r4.i(r15)
            goto L_0x00a2
        L_0x0093:
            if (r11 != 0) goto L_0x009a
            long r14 = r4.n()
            goto L_0x009e
        L_0x009a:
            long r14 = r4.p()
        L_0x009e:
            int r2 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x00a4
        L_0x00a2:
            r14 = r21
        L_0x00a4:
            r4.i(r3)
            int r2 = r4.b()
            int r9 = r4.b()
            r4.i(r7)
            int r11 = r4.b()
            int r4 = r4.b()
            r6 = 65536(0x10000, float:9.18355E-41)
            r7 = -65536(0xffffffffffff0000, float:NaN)
            if (r2 != 0) goto L_0x00c9
            if (r9 != r6) goto L_0x00c9
            if (r11 != r7) goto L_0x00c9
            if (r4 != 0) goto L_0x00c9
            r2 = 90
            goto L_0x00e0
        L_0x00c9:
            if (r2 != 0) goto L_0x00d4
            if (r9 != r7) goto L_0x00d4
            if (r11 != r6) goto L_0x00d4
            if (r4 != 0) goto L_0x00d4
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e0
        L_0x00d4:
            if (r2 != r7) goto L_0x00df
            if (r9 != 0) goto L_0x00df
            if (r11 != 0) goto L_0x00df
            if (r4 != r7) goto L_0x00df
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            int r4 = (r67 > r21 ? 1 : (r67 == r21 ? 0 : -1))
            if (r4 != 0) goto L_0x00e9
            r4 = r66
            r25 = r14
            goto L_0x00ed
        L_0x00e9:
            r4 = r66
            r25 = r67
        L_0x00ed:
            e8.w60 r4 = r4.P0
            r4.h(r10)
            int r6 = r4.b()
            int r6 = r6 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != 0) goto L_0x00ff
            r6 = 8
            goto L_0x0101
        L_0x00ff:
            r6 = 16
        L_0x0101:
            r4.i(r6)
            long r6 = r4.n()
            int r4 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r4 != 0) goto L_0x010d
            goto L_0x0118
        L_0x010d:
            r27 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r6
            long r14 = e8.eg0.b(r25, r27, r29)
            r21 = r14
        L_0x0118:
            int r4 = e8.pd0.G
            e8.od0 r4 = r1.c(r4)
            int r9 = e8.pd0.H
            e8.od0 r4 = r4.c(r9)
            int r9 = e8.pd0.S
            e8.qd0 r1 = r1.b(r9)
            e8.w60 r1 = r1.P0
            r1.h(r10)
            int r9 = r1.b()
            int r9 = r9 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 != 0) goto L_0x013c
            r11 = 8
            goto L_0x013e
        L_0x013c:
            r11 = 16
        L_0x013e:
            r1.i(r11)
            long r14 = r1.n()
            if (r9 != 0) goto L_0x0149
            r9 = 4
            goto L_0x014b
        L_0x0149:
            r9 = 8
        L_0x014b:
            r1.i(r9)
            int r1 = r1.e()
            int r9 = r1 >> 10
            r11 = 31
            r9 = r9 & r11
            int r9 = r9 + 96
            char r9 = (char) r9
            int r25 = r1 >> 5
            r25 = r25 & 31
            int r3 = r25 + 96
            char r3 = (char) r3
            r1 = r1 & r11
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            r11.append(r9)
            r11.append(r3)
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            int r3 = e8.pd0.U
            e8.qd0 r3 = r4.b(r3)
            e8.w60 r3 = r3.P0
            java.lang.Object r4 = r1.second
            java.lang.String r4 = (java.lang.String) r4
            r9 = 12
            r3.h(r9)
            int r9 = r3.b()
            v6.a0 r11 = new v6.a0
            r11.<init>(r9, r8)
            r14 = 0
        L_0x019a:
            if (r14 >= r9) goto L_0x0780
            int r15 = r3.f17221b
            int r5 = r3.b()
            if (r5 <= 0) goto L_0x01a6
            r8 = 1
            goto L_0x01a7
        L_0x01a6:
            r8 = 0
        L_0x01a7:
            java.lang.String r10 = "childAtomSize should be positive"
            o.a.b(r8, r10)
            int r8 = r3.b()
            r67 = r9
            int r9 = e8.pd0.f15948c
            if (r8 == r9) goto L_0x05d3
            int r9 = e8.pd0.f15950d
            if (r8 == r9) goto L_0x05d3
            int r9 = e8.pd0.f15945a0
            if (r8 == r9) goto L_0x05d3
            int r9 = e8.pd0.f15967l0
            if (r8 == r9) goto L_0x05d3
            int r9 = e8.pd0.f15952e
            if (r8 == r9) goto L_0x05d3
            int r9 = e8.pd0.f15954f
            if (r8 == r9) goto L_0x05d3
            int r9 = e8.pd0.f15956g
            if (r8 == r9) goto L_0x05d3
            int r9 = e8.pd0.K0
            if (r8 == r9) goto L_0x05d3
            int r9 = e8.pd0.L0
            if (r8 != r9) goto L_0x01d8
            goto L_0x05d3
        L_0x01d8:
            int r9 = e8.pd0.f15962j
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15947b0
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15972o
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15976q
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15980s
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15986v
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15982t
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15984u
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15993y0
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15995z0
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15968m
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15970n
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.f15964k
            if (r8 == r9) goto L_0x02f6
            int r9 = e8.pd0.O0
            if (r8 != r9) goto L_0x0212
            goto L_0x02f6
        L_0x0212:
            int r9 = e8.pd0.f15965k0
            if (r8 == r9) goto L_0x027b
            int r10 = e8.pd0.f15985u0
            if (r8 == r10) goto L_0x027b
            int r10 = e8.pd0.f15987v0
            if (r8 == r10) goto L_0x027b
            int r10 = e8.pd0.f15989w0
            if (r8 == r10) goto L_0x027b
            int r10 = e8.pd0.f15991x0
            if (r8 != r10) goto L_0x0227
            goto L_0x027b
        L_0x0227:
            int r9 = e8.pd0.N0
            if (r8 != r9) goto L_0x026d
            java.lang.String r38 = java.lang.Integer.toString(r13)
            e8.bc0 r8 = new e8.bc0
            r37 = r8
            r39 = 0
            r41 = 0
            r42 = -1
            r43 = -1
            r44 = -1
            r45 = -1
            r46 = -1082130432(0xffffffffbf800000, float:-1.0)
            r47 = -1
            r48 = -1082130432(0xffffffffbf800000, float:-1.0)
            r49 = 0
            r50 = -1
            r51 = 0
            r52 = -1
            r53 = -1
            r54 = -1
            r55 = -1
            r56 = -1
            r57 = 0
            r58 = 0
            r59 = -1
            r60 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r62 = 0
            r64 = 0
            java.lang.String r40 = "application/x-camera-motion"
            r63 = r69
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r62, r63, r64)
            r11.f26421b = r8
        L_0x026d:
            r40 = r1
            r41 = r2
            r37 = r6
            r39 = r12
            r2 = r14
            r6 = 3
            r23 = 4
            goto L_0x0768
        L_0x027b:
            int r10 = r15 + 8
            r25 = 8
            int r10 = r10 + 8
            r3.h(r10)
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r10 = "application/ttml+xml"
            if (r8 != r9) goto L_0x0296
            r37 = r6
            r30 = r25
            r32 = 0
            r26 = r10
            goto L_0x02df
        L_0x0296:
            int r9 = e8.pd0.f15985u0
            if (r8 != r9) goto L_0x02bc
            int r8 = r5 + -8
            int r8 = r8 + -8
            byte[] r9 = new byte[r8]
            byte[] r10 = r3.f17220a
            r37 = r6
            int r6 = r3.f17221b
            r7 = 0
            java.lang.System.arraycopy(r10, r6, r9, r7, r8)
            int r6 = r3.f17221b
            int r6 = r6 + r8
            r3.f17221b = r6
            java.util.List r6 = java.util.Collections.singletonList(r9)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r32 = r6
            r30 = r25
            r26 = r7
            goto L_0x02df
        L_0x02bc:
            r37 = r6
            int r6 = e8.pd0.f15987v0
            if (r8 != r6) goto L_0x02c5
            java.lang.String r6 = "application/x-mp4-vtt"
            goto L_0x02d9
        L_0x02c5:
            int r6 = e8.pd0.f15989w0
            if (r8 != r6) goto L_0x02d0
            r26 = r10
            r30 = r19
            r32 = 0
            goto L_0x02df
        L_0x02d0:
            int r6 = e8.pd0.f15991x0
            if (r8 != r6) goto L_0x02f0
            r6 = 1
            r11.f26423d = r6
            java.lang.String r6 = "application/x-mp4-cea-608"
        L_0x02d9:
            r30 = r25
            r32 = 0
            r26 = r6
        L_0x02df:
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = r4
            r29 = r69
            e8.bc0 r6 = e8.bc0.g(r25, r26, r27, r28, r29, r30, r32)
            r11.f26421b = r6
            goto L_0x0339
        L_0x02f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02f6:
            r37 = r6
            int r6 = r15 + 8
            r7 = 8
            int r6 = r6 + r7
            r3.h(r6)
            r6 = 6
            if (r70 == 0) goto L_0x030c
            int r9 = r3.e()
            r3.i(r6)
            r7 = r9
            goto L_0x0310
        L_0x030c:
            r3.i(r7)
            r7 = 0
        L_0x0310:
            if (r7 == 0) goto L_0x034a
            r9 = 1
            if (r7 != r9) goto L_0x0316
            goto L_0x034a
        L_0x0316:
            r9 = 2
            if (r7 != r9) goto L_0x0339
            r7 = 16
            r3.i(r7)
            long r25 = r3.c()
            double r25 = java.lang.Double.longBitsToDouble(r25)
            long r6 = java.lang.Math.round(r25)
            int r7 = (int) r6
            int r6 = r3.o()
            r9 = 20
            r3.i(r9)
            r40 = r1
            r39 = r12
            goto L_0x0380
        L_0x0339:
            r40 = r1
            r41 = r2
            r42 = r5
            r39 = r12
            r43 = r14
            r10 = 31
            r14 = -1
            r23 = 4
            goto L_0x05cc
        L_0x034a:
            int r6 = r3.e()
            r9 = 6
            r3.i(r9)
            byte[] r9 = r3.f17220a
            r25 = r6
            int r6 = r3.f17221b
            r39 = r12
            int r12 = r6 + 1
            r3.f17221b = r12
            byte r6 = r9[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r26 = 8
            int r6 = r6 << 8
            r40 = r1
            int r1 = r12 + 1
            r3.f17221b = r1
            byte r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r6 = r6 | r9
            r9 = 2
            int r1 = r1 + r9
            r3.f17221b = r1
            r1 = 1
            if (r7 != r1) goto L_0x037d
            r1 = 16
            r3.i(r1)
        L_0x037d:
            r7 = r6
            r6 = r25
        L_0x0380:
            int r1 = r3.f17221b
            int r9 = e8.pd0.f15947b0
            if (r8 != r9) goto L_0x038d
            int r8 = a(r3, r15, r5, r11, r14)
            r3.h(r1)
        L_0x038d:
            int r9 = e8.pd0.f15972o
            java.lang.String r12 = "audio/raw"
            if (r8 != r9) goto L_0x0396
            java.lang.String r8 = "audio/ac3"
            goto L_0x03df
        L_0x0396:
            int r9 = e8.pd0.f15976q
            if (r8 != r9) goto L_0x039d
            java.lang.String r8 = "audio/eac3"
            goto L_0x03df
        L_0x039d:
            int r9 = e8.pd0.f15980s
            if (r8 != r9) goto L_0x03a4
            java.lang.String r8 = "audio/vnd.dts"
            goto L_0x03df
        L_0x03a4:
            int r9 = e8.pd0.f15982t
            if (r8 == r9) goto L_0x03dd
            int r9 = e8.pd0.f15984u
            if (r8 != r9) goto L_0x03ad
            goto L_0x03dd
        L_0x03ad:
            int r9 = e8.pd0.f15986v
            if (r8 != r9) goto L_0x03b4
            java.lang.String r8 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03df
        L_0x03b4:
            int r9 = e8.pd0.f15993y0
            if (r8 != r9) goto L_0x03bb
            java.lang.String r8 = "audio/3gpp"
            goto L_0x03df
        L_0x03bb:
            int r9 = e8.pd0.f15995z0
            if (r8 != r9) goto L_0x03c2
            java.lang.String r8 = "audio/amr-wb"
            goto L_0x03df
        L_0x03c2:
            int r9 = e8.pd0.f15968m
            if (r8 == r9) goto L_0x03db
            int r9 = e8.pd0.f15970n
            if (r8 != r9) goto L_0x03cb
            goto L_0x03db
        L_0x03cb:
            int r9 = e8.pd0.f15964k
            if (r8 != r9) goto L_0x03d2
            java.lang.String r8 = "audio/mpeg"
            goto L_0x03df
        L_0x03d2:
            int r9 = e8.pd0.O0
            if (r8 != r9) goto L_0x03d9
            java.lang.String r8 = "audio/alac"
            goto L_0x03df
        L_0x03d9:
            r8 = 0
            goto L_0x03df
        L_0x03db:
            r8 = r12
            goto L_0x03df
        L_0x03dd:
            java.lang.String r8 = "audio/vnd.dts.hd"
        L_0x03df:
            r9 = 0
        L_0x03e0:
            int r0 = r1 - r15
            if (r0 >= r5) goto L_0x058b
            r3.h(r1)
            int r0 = r3.b()
            r41 = r2
            if (r0 <= 0) goto L_0x03f1
            r2 = 1
            goto L_0x03f2
        L_0x03f1:
            r2 = 0
        L_0x03f2:
            o.a.b(r2, r10)
            int r2 = r3.b()
            r42 = r5
            int r5 = e8.pd0.K
            r43 = r14
            if (r2 == r5) goto L_0x04ba
            if (r70 == 0) goto L_0x0409
            int r14 = e8.pd0.f15966l
            if (r2 != r14) goto L_0x0409
            goto L_0x04ba
        L_0x0409:
            int r5 = e8.pd0.f15974p
            if (r2 != r5) goto L_0x0447
            int r2 = r1 + 8
            r3.h(r2)
            java.lang.String r25 = java.lang.Integer.toString(r13)
            int r2 = r3.d()
            r2 = r2 & 192(0xc0, float:2.69E-43)
            r5 = 6
            int r2 = r2 >> r5
            int[] r5 = e8.kc0.f15272b
            r28 = r5[r2]
            int r2 = r3.d()
            int[] r5 = e8.kc0.f15273c
            r14 = r2 & 56
            r26 = 3
            int r14 = r14 >> 3
            r5 = r5[r14]
            r14 = 4
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0436
            int r5 = r5 + 1
        L_0x0436:
            r27 = r5
            java.lang.String r26 = "audio/ac3"
            r29 = r69
            r30 = r4
            e8.bc0 r2 = e8.bc0.d(r25, r26, r27, r28, r29, r30)
            r11.f26421b = r2
        L_0x0444:
            r14 = 0
            goto L_0x04b6
        L_0x0447:
            int r5 = e8.pd0.f15978r
            if (r2 != r5) goto L_0x0487
            int r2 = r1 + 8
            r3.h(r2)
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r2 = 2
            r3.i(r2)
            int r2 = r3.d()
            r2 = r2 & 192(0xc0, float:2.69E-43)
            r5 = 6
            int r2 = r2 >> r5
            int[] r5 = e8.kc0.f15272b
            r28 = r5[r2]
            int r2 = r3.d()
            int[] r5 = e8.kc0.f15273c
            r14 = r2 & 14
            r17 = 1
            int r14 = r14 >> 1
            r5 = r5[r14]
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0478
            int r5 = r5 + 1
        L_0x0478:
            r27 = r5
            java.lang.String r26 = "audio/eac3"
            r29 = r69
            r30 = r4
            e8.bc0 r2 = e8.bc0.d(r25, r26, r27, r28, r29, r30)
            r11.f26421b = r2
            goto L_0x0444
        L_0x0487:
            int r5 = e8.pd0.f15988w
            if (r2 != r5) goto L_0x04a0
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r26 = r8
            r27 = r6
            r28 = r7
            r29 = r69
            r30 = r4
            e8.bc0 r2 = e8.bc0.d(r25, r26, r27, r28, r29, r30)
            r11.f26421b = r2
            goto L_0x0444
        L_0x04a0:
            int r5 = e8.pd0.O0
            if (r2 != r5) goto L_0x0444
            byte[] r9 = new byte[r0]
            r3.h(r1)
            byte[] r2 = r3.f17220a
            int r5 = r3.f17221b
            r14 = 0
            java.lang.System.arraycopy(r2, r5, r9, r14, r0)
            int r2 = r3.f17221b
            int r2 = r2 + r0
            r3.f17221b = r2
        L_0x04b6:
            r25 = r10
            goto L_0x057a
        L_0x04ba:
            r14 = 0
            if (r2 != r5) goto L_0x04c1
            r2 = r1
            r25 = r10
            goto L_0x04e7
        L_0x04c1:
            int r2 = r3.f17221b
        L_0x04c3:
            int r5 = r2 - r1
            if (r5 >= r0) goto L_0x04e4
            r3.h(r2)
            int r5 = r3.b()
            if (r5 <= 0) goto L_0x04d1
            r14 = 1
        L_0x04d1:
            o.a.b(r14, r10)
            int r14 = r3.b()
            r25 = r10
            int r10 = e8.pd0.K
            if (r14 != r10) goto L_0x04df
            goto L_0x04e7
        L_0x04df:
            int r2 = r2 + r5
            r10 = r25
            r14 = 0
            goto L_0x04c3
        L_0x04e4:
            r25 = r10
            r2 = -1
        L_0x04e7:
            r5 = -1
            if (r2 == r5) goto L_0x057a
            android.util.Pair r2 = d(r3, r2)
            java.lang.Object r5 = r2.first
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0572
            e8.cg0 r5 = new e8.cg0
            r5.<init>(r2)
            r6 = 5
            int r7 = r5.a(r6)
            r9 = 31
            if (r7 != r9) goto L_0x0514
            r9 = 6
            int r7 = r5.a(r9)
            int r7 = r7 + 32
        L_0x0514:
            int r9 = e8.xf0.a(r5)
            r10 = 4
            int r14 = r5.a(r10)
            if (r7 == r6) goto L_0x0528
            r10 = 29
            if (r7 != r10) goto L_0x0524
            goto L_0x0528
        L_0x0524:
            r6 = 4
            r10 = 31
            goto L_0x0546
        L_0x0528:
            int r9 = e8.xf0.a(r5)
            int r6 = r5.a(r6)
            r10 = 31
            if (r6 != r10) goto L_0x053b
            r7 = 6
            int r6 = r5.a(r7)
            int r6 = r6 + 32
        L_0x053b:
            r7 = 22
            if (r6 != r7) goto L_0x0545
            r6 = 4
            int r14 = r5.a(r6)
            goto L_0x0546
        L_0x0545:
            r6 = 4
        L_0x0546:
            int[] r5 = e8.xf0.f17488c
            r5 = r5[r14]
            r14 = -1
            if (r5 == r14) goto L_0x054f
            r7 = 1
            goto L_0x0550
        L_0x054f:
            r7 = 0
        L_0x0550:
            o.a.a(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.util.Pair r5 = android.util.Pair.create(r7, r5)
            java.lang.Object r7 = r5.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r5 = r5.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = r5
            r5 = 6
            goto L_0x0576
        L_0x0572:
            r5 = 6
            r10 = 31
            r14 = -1
        L_0x0576:
            r23 = 4
            r9 = r2
            goto L_0x0580
        L_0x057a:
            r5 = 6
            r10 = 31
            r14 = -1
            r23 = 4
        L_0x0580:
            int r1 = r1 + r0
            r10 = r25
            r2 = r41
            r5 = r42
            r14 = r43
            goto L_0x03e0
        L_0x058b:
            r41 = r2
            r42 = r5
            r43 = r14
            r10 = 31
            r14 = -1
            r23 = 4
            V[] r0 = r11.f26421b
            e8.bc0 r0 = (e8.bc0) r0
            if (r0 != 0) goto L_0x05cc
            if (r8 == 0) goto L_0x05cc
            boolean r0 = r12.equals(r8)
            if (r0 == 0) goto L_0x05a7
            r30 = 2
            goto L_0x05a9
        L_0x05a7:
            r30 = -1
        L_0x05a9:
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = -1
            if (r9 != 0) goto L_0x05b4
            r31 = 0
            goto L_0x05ba
        L_0x05b4:
            java.util.List r0 = java.util.Collections.singletonList(r9)
            r31 = r0
        L_0x05ba:
            r33 = 0
            r26 = r8
            r28 = r6
            r29 = r7
            r32 = r69
            r34 = r4
            e8.bc0 r0 = e8.bc0.a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r11.f26421b = r0
        L_0x05cc:
            r5 = r42
            r2 = r43
            r6 = 3
            goto L_0x0768
        L_0x05d3:
            r40 = r1
            r41 = r2
            r42 = r5
            r37 = r6
            r25 = r10
            r39 = r12
            r43 = r14
            r10 = 31
            r14 = -1
            r23 = 4
            int r0 = r15 + 8
            r1 = 8
            int r0 = r0 + r1
            r3.h(r0)
            r0 = 16
            r3.i(r0)
            int r28 = r3.e()
            int r29 = r3.e()
            r1 = 50
            r3.i(r1)
            int r1 = r3.f17221b
            int r2 = e8.pd0.f15945a0
            if (r8 != r2) goto L_0x0612
            r5 = r42
            r2 = r43
            int r8 = a(r3, r15, r5, r11, r2)
            r3.h(r1)
            goto L_0x0616
        L_0x0612:
            r5 = r42
            r2 = r43
        L_0x0616:
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r26 = 0
            r30 = 0
            r32 = 1065353216(0x3f800000, float:1.0)
            r33 = 0
            r34 = -1
        L_0x0623:
            int r6 = r1 - r15
            if (r6 >= r5) goto L_0x0753
            r3.h(r1)
            int r6 = r3.f17221b
            int r9 = r3.b()
            if (r9 != 0) goto L_0x0637
            int r12 = r3.f17221b
            int r12 = r12 - r15
            if (r12 == r5) goto L_0x0753
        L_0x0637:
            r0 = r25
            if (r9 <= 0) goto L_0x063d
            r12 = 1
            goto L_0x063e
        L_0x063d:
            r12 = 0
        L_0x063e:
            o.a.b(r12, r0)
            int r12 = r3.b()
            int r10 = e8.pd0.I
            if (r12 != r10) goto L_0x066e
            if (r26 != 0) goto L_0x064d
            r10 = 1
            goto L_0x064e
        L_0x064d:
            r10 = 0
        L_0x064e:
            o.a.c(r10)
            int r6 = r6 + 8
            r3.h(r6)
            com.google.android.gms.internal.ads.mu r6 = com.google.android.gms.internal.ads.mu.a(r3)
            java.util.List<byte[]> r10 = r6.f7507a
            int r12 = r6.f7508b
            r11.f26422c = r12
            if (r7 != 0) goto L_0x0666
            float r6 = r6.f7509c
            r32 = r6
        L_0x0666:
            java.lang.String r26 = "video/avc"
            r25 = r0
            r30 = r10
            goto L_0x071f
        L_0x066e:
            int r10 = e8.pd0.J
            if (r12 != r10) goto L_0x0692
            if (r26 != 0) goto L_0x0676
            r10 = 1
            goto L_0x0677
        L_0x0676:
            r10 = 0
        L_0x0677:
            o.a.c(r10)
            int r6 = r6 + 8
            r3.h(r6)
            com.google.android.gms.internal.ads.se r6 = com.google.android.gms.internal.ads.se.g(r3)
            java.lang.Object r10 = r6.f8122b
            r30 = r10
            java.util.List r30 = (java.util.List) r30
            int r6 = r6.f8121a
            r11.f26422c = r6
            java.lang.String r6 = "video/hevc"
        L_0x068f:
            r26 = r6
            goto L_0x06d5
        L_0x0692:
            int r10 = e8.pd0.M0
            if (r12 != r10) goto L_0x06a8
            if (r26 != 0) goto L_0x069a
            r6 = 1
            goto L_0x069b
        L_0x069a:
            r6 = 0
        L_0x069b:
            o.a.c(r6)
            int r6 = e8.pd0.K0
            if (r8 != r6) goto L_0x06a5
            java.lang.String r6 = "video/x-vnd.on2.vp8"
            goto L_0x068f
        L_0x06a5:
            java.lang.String r6 = "video/x-vnd.on2.vp9"
            goto L_0x068f
        L_0x06a8:
            int r10 = e8.pd0.f15958h
            if (r12 != r10) goto L_0x06b7
            if (r26 != 0) goto L_0x06b0
            r6 = 1
            goto L_0x06b1
        L_0x06b0:
            r6 = 0
        L_0x06b1:
            o.a.c(r6)
            java.lang.String r6 = "video/3gpp"
            goto L_0x068f
        L_0x06b7:
            int r10 = e8.pd0.K
            if (r12 != r10) goto L_0x06d8
            if (r26 != 0) goto L_0x06bf
            r10 = 1
            goto L_0x06c0
        L_0x06bf:
            r10 = 0
        L_0x06c0:
            o.a.c(r10)
            android.util.Pair r6 = d(r3, r6)
            java.lang.Object r10 = r6.first
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r6.second
            byte[] r6 = (byte[]) r6
            java.util.List r30 = java.util.Collections.singletonList(r6)
            r26 = r10
        L_0x06d5:
            r25 = r0
            goto L_0x071f
        L_0x06d8:
            int r10 = e8.pd0.f15963j0
            if (r12 != r10) goto L_0x06f1
            int r6 = r6 + 8
            r3.h(r6)
            int r6 = r3.o()
            int r7 = r3.o()
            float r6 = (float) r6
            float r7 = (float) r7
            float r32 = r6 / r7
            r25 = r0
            r7 = 1
            goto L_0x071f
        L_0x06f1:
            int r10 = e8.pd0.I0
            if (r12 != r10) goto L_0x0721
            int r10 = r6 + 8
        L_0x06f7:
            int r12 = r10 - r6
            if (r12 >= r9) goto L_0x071b
            r3.h(r10)
            int r12 = r3.b()
            int r14 = r3.b()
            r25 = r0
            int r0 = e8.pd0.J0
            if (r14 != r0) goto L_0x0716
            byte[] r0 = r3.f17220a
            int r12 = r12 + r10
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r10, r12)
            r33 = r0
            goto L_0x071f
        L_0x0716:
            int r10 = r10 + r12
            r0 = r25
            r14 = -1
            goto L_0x06f7
        L_0x071b:
            r25 = r0
            r33 = 0
        L_0x071f:
            r6 = 3
            goto L_0x074b
        L_0x0721:
            r25 = r0
            int r0 = e8.pd0.H0
            if (r12 != r0) goto L_0x071f
            int r0 = r3.d()
            r6 = 3
            r3.i(r6)
            if (r0 != 0) goto L_0x074b
            int r0 = r3.d()
            if (r0 == 0) goto L_0x0749
            r10 = 1
            if (r0 == r10) goto L_0x0746
            r10 = 2
            if (r0 == r10) goto L_0x0743
            if (r0 == r6) goto L_0x0740
            goto L_0x074b
        L_0x0740:
            r34 = 3
            goto L_0x074b
        L_0x0743:
            r34 = 2
            goto L_0x074b
        L_0x0746:
            r34 = 1
            goto L_0x074b
        L_0x0749:
            r34 = 0
        L_0x074b:
            int r1 = r1 + r9
            r0 = 16
            r10 = 31
            r14 = -1
            goto L_0x0623
        L_0x0753:
            r6 = 3
            if (r26 == 0) goto L_0x0768
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = -1
            r35 = 0
            r31 = r41
            r36 = r69
            e8.bc0 r0 = e8.bc0.b(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r11.f26421b = r0
        L_0x0768:
            int r15 = r15 + r5
            r3.h(r15)
            int r14 = r2 + 1
            r0 = r65
            r9 = r67
            r6 = r37
            r12 = r39
            r1 = r40
            r2 = r41
            r5 = 3
            r8 = 2
            r10 = 8
            goto L_0x019a
        L_0x0780:
            r40 = r1
            r37 = r6
            r39 = r12
            int r0 = e8.pd0.Q
            r1 = r65
            e8.od0 r0 = r1.c(r0)
            if (r0 == 0) goto L_0x0801
            int r1 = e8.pd0.R
            e8.qd0 r0 = r0.b(r1)
            if (r0 != 0) goto L_0x0799
            goto L_0x0801
        L_0x0799:
            e8.w60 r0 = r0.P0
            r1 = 8
            r0.h(r1)
            int r1 = r0.b()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0.o()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r5 = 0
        L_0x07b1:
            if (r5 >= r2) goto L_0x07fa
            r6 = 1
            if (r1 != r6) goto L_0x07bb
            long r7 = r0.p()
            goto L_0x07bf
        L_0x07bb:
            long r7 = r0.n()
        L_0x07bf:
            r3[r5] = r7
            if (r1 != r6) goto L_0x07c8
            long r6 = r0.c()
            goto L_0x07cd
        L_0x07c8:
            int r6 = r0.b()
            long r6 = (long) r6
        L_0x07cd:
            r4[r5] = r6
            byte[] r6 = r0.f17220a
            int r7 = r0.f17221b
            int r8 = r7 + 1
            r0.f17221b = r8
            byte r7 = r6[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r9 = 8
            int r7 = r7 << r9
            int r10 = r8 + 1
            r0.f17221b = r10
            byte r6 = r6[r8]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            short r6 = (short) r6
            r7 = 1
            if (r6 != r7) goto L_0x07f2
            r6 = 2
            r0.i(r6)
            int r5 = r5 + 1
            goto L_0x07b1
        L_0x07f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x07fa:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x0806
        L_0x0801:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x0806:
            V[] r2 = r11.f26421b
            e8.bc0 r2 = (e8.bc0) r2
            if (r2 != 0) goto L_0x080d
            return r0
        L_0x080d:
            e8.yd0 r0 = new e8.yd0
            r2 = r40
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            V[] r4 = r11.f26421b
            r19 = r4
            e8.bc0 r19 = (e8.bc0) r19
            int r4 = r11.f26423d
            java.lang.Object r5 = r11.f26420a
            e8.xd0[] r5 = (e8.xd0[]) r5
            int r6 = r11.f26422c
            java.lang.Object r7 = r1.first
            r23 = r7
            long[] r23 = (long[]) r23
            java.lang.Object r1 = r1.second
            r24 = r1
            long[] r24 = (long[]) r24
            r10 = r0
            r11 = r13
            r12 = r39
            r13 = r2
            r15 = r37
            r17 = r21
            r20 = r4
            r21 = r5
            r22 = r6
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mt.b(e8.od0, e8.qd0, long, com.google.android.gms.internal.ads.et, boolean):e8.yd0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e8.zd0 c(e8.yd0 r44, e8.od0 r45, com.google.android.gms.internal.ads.it r46) throws e8.cc0 {
        /*
            r0 = r44
            r1 = r45
            r2 = r46
            int r3 = e8.pd0.f15977q0
            e8.qd0 r3 = r1.b(r3)
            if (r3 == 0) goto L_0x0014
            w6.c r4 = new w6.c
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = e8.pd0.f15979r0
            e8.qd0 r3 = r1.b(r3)
            if (r3 == 0) goto L_0x054f
            v6.l r4 = new v6.l
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.b()
            r5 = 0
            if (r3 != 0) goto L_0x0038
            e8.zd0 r0 = new e8.zd0
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            r9 = 0
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0038:
            int r6 = e8.pd0.f15981s0
            e8.qd0 r6 = r1.b(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0049
            int r6 = e8.pd0.f15983t0
            e8.qd0 r6 = r1.b(r6)
            r8 = 1
            goto L_0x004a
        L_0x0049:
            r8 = 0
        L_0x004a:
            e8.w60 r6 = r6.P0
            int r9 = e8.pd0.f15975p0
            e8.qd0 r9 = r1.b(r9)
            e8.w60 r9 = r9.P0
            int r10 = e8.pd0.f15969m0
            e8.qd0 r10 = r1.b(r10)
            e8.w60 r10 = r10.P0
            int r11 = e8.pd0.f15971n0
            e8.qd0 r11 = r1.b(r11)
            if (r11 == 0) goto L_0x0067
            e8.w60 r11 = r11.P0
            goto L_0x0068
        L_0x0067:
            r11 = 0
        L_0x0068:
            int r13 = e8.pd0.f15973o0
            e8.qd0 r1 = r1.b(r13)
            if (r1 == 0) goto L_0x0073
            e8.w60 r1 = r1.P0
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            r13 = 12
            r6.h(r13)
            int r14 = r6.o()
            r9.h(r13)
            int r15 = r9.o()
            int r12 = r9.b()
            if (r12 != r7) goto L_0x008c
            r12 = 1
            goto L_0x008d
        L_0x008c:
            r12 = 0
        L_0x008d:
            java.lang.String r5 = "first_chunk must be 1"
            o.a.d(r12, r5)
            r10.h(r13)
            int r5 = r10.o()
            int r5 = r5 - r7
            int r12 = r10.o()
            int r7 = r10.o()
            if (r1 == 0) goto L_0x00ae
            r1.h(r13)
            int r19 = r1.o()
            r45 = r12
            goto L_0x00b2
        L_0x00ae:
            r45 = r12
            r19 = 0
        L_0x00b2:
            r12 = -1
            if (r11 == 0) goto L_0x00c8
            r11.h(r13)
            int r13 = r11.o()
            if (r13 <= 0) goto L_0x00c5
            int r16 = r11.o()
            int r16 = r16 + -1
            goto L_0x00cf
        L_0x00c5:
            r16 = 0
            goto L_0x00cb
        L_0x00c8:
            r16 = r11
            r13 = 0
        L_0x00cb:
            r11 = r16
            r16 = -1
        L_0x00cf:
            boolean r20 = r4.a()
            if (r20 == 0) goto L_0x00eb
            e8.bc0 r12 = r0.f17613f
            java.lang.String r12 = r12.f13920f
            r21 = r15
            java.lang.String r15 = "audio/raw"
            boolean r12 = r15.equals(r12)
            if (r12 == 0) goto L_0x00ed
            if (r5 != 0) goto L_0x00ed
            if (r19 != 0) goto L_0x00ed
            if (r13 != 0) goto L_0x00ed
            r12 = 1
            goto L_0x00ee
        L_0x00eb:
            r21 = r15
        L_0x00ed:
            r12 = 0
        L_0x00ee:
            r22 = 0
            if (r12 != 0) goto L_0x026c
            long[] r12 = new long[r3]
            int[] r15 = new int[r3]
            r25 = r5
            long[] r5 = new long[r3]
            r26 = r13
            int[] r13 = new int[r3]
            r27 = r7
            r7 = r16
            r31 = r19
            r33 = r22
            r35 = r33
            r37 = r35
            r0 = 0
            r2 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = -1
            r19 = r45
            r16 = r10
            r45 = r25
            r10 = r26
            r25 = 0
            r26 = 0
        L_0x0120:
            if (r0 >= r3) goto L_0x01f6
            r43 = r26
            r26 = r3
            r3 = r43
        L_0x0128:
            if (r28 != 0) goto L_0x016c
            r39 = r10
            int r10 = r32 + 1
            if (r10 != r14) goto L_0x0135
            r28 = r21
            r21 = 0
            goto L_0x015e
        L_0x0135:
            if (r8 == 0) goto L_0x013c
            long r32 = r6.p()
            goto L_0x0140
        L_0x013c:
            long r32 = r6.n()
        L_0x0140:
            if (r10 != r3) goto L_0x0158
            int r30 = r9.o()
            r3 = 4
            r9.i(r3)
            int r21 = r21 + -1
            if (r21 <= 0) goto L_0x0157
            int r3 = r9.o()
            r20 = -1
            int r3 = r3 + -1
            goto L_0x0158
        L_0x0157:
            r3 = -1
        L_0x0158:
            r28 = r21
            r37 = r32
            r21 = 1
        L_0x015e:
            o.a.c(r21)
            r32 = r10
            r21 = r28
            r28 = r30
            r33 = r37
            r10 = r39
            goto L_0x0128
        L_0x016c:
            r39 = r10
            if (r1 == 0) goto L_0x0181
        L_0x0170:
            if (r25 != 0) goto L_0x017f
            if (r31 <= 0) goto L_0x017f
            int r25 = r1.o()
            int r29 = r1.b()
            int r31 = r31 + -1
            goto L_0x0170
        L_0x017f:
            int r25 = r25 + -1
        L_0x0181:
            r10 = r29
            r12[r0] = r33
            int r29 = r4.c()
            r15[r0] = r29
            r29 = r3
            r3 = r15[r0]
            if (r3 <= r2) goto L_0x0193
            r2 = r15[r0]
        L_0x0193:
            r40 = r2
            long r2 = (long) r10
            long r2 = r35 + r2
            r5[r0] = r2
            if (r11 != 0) goto L_0x019e
            r2 = 1
            goto L_0x019f
        L_0x019e:
            r2 = 0
        L_0x019f:
            r13[r0] = r2
            if (r0 != r7) goto L_0x01b4
            r2 = 1
            r13[r0] = r2
            int r3 = r39 + -1
            if (r3 <= 0) goto L_0x01af
            int r7 = r11.o()
            int r7 = r7 - r2
        L_0x01af:
            r41 = r10
            r2 = r27
            goto L_0x01ba
        L_0x01b4:
            r41 = r10
            r2 = r27
            r3 = r39
        L_0x01ba:
            r27 = r11
            long r10 = (long) r2
            long r35 = r35 + r10
            int r19 = r19 + -1
            if (r19 != 0) goto L_0x01d3
            if (r45 <= 0) goto L_0x01d3
            int r2 = r16.o()
            int r10 = r16.o()
            int r11 = r45 + -1
            r19 = r2
            r2 = r10
            goto L_0x01d5
        L_0x01d3:
            r11 = r45
        L_0x01d5:
            r10 = r15[r0]
            r45 = r2
            r39 = r3
            long r2 = (long) r10
            long r33 = r33 + r2
            int r28 = r28 + -1
            int r0 = r0 + 1
            r3 = r26
            r26 = r29
            r10 = r39
            r2 = r40
            r29 = r41
            r43 = r27
            r27 = r45
            r45 = r11
            r11 = r43
            goto L_0x0120
        L_0x01f6:
            r26 = r3
            r39 = r10
            if (r25 != 0) goto L_0x01fe
            r0 = 1
            goto L_0x01ff
        L_0x01fe:
            r0 = 0
        L_0x01ff:
            o.a.a(r0)
        L_0x0202:
            if (r31 <= 0) goto L_0x0216
            int r0 = r1.o()
            if (r0 != 0) goto L_0x020c
            r0 = 1
            goto L_0x020d
        L_0x020c:
            r0 = 0
        L_0x020d:
            o.a.a(r0)
            r1.b()
            int r31 = r31 + -1
            goto L_0x0202
        L_0x0216:
            if (r39 != 0) goto L_0x0224
            if (r19 != 0) goto L_0x0224
            r0 = r28
            if (r0 != 0) goto L_0x0226
            if (r45 == 0) goto L_0x0221
            goto L_0x0226
        L_0x0221:
            r1 = r44
            goto L_0x0268
        L_0x0224:
            r0 = r28
        L_0x0226:
            r1 = r44
            r3 = r19
            int r4 = r1.f17608a
            r6 = 215(0xd7, float:3.01E-43)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Inconsistent stbl box for track "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = ": remainingSynchronizationSamples "
            r7.append(r4)
            r4 = r39
            r7.append(r4)
            java.lang.String r4 = ", remainingSamplesAtTimestampDelta "
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = ", remainingSamplesInChunk "
            r7.append(r3)
            r7.append(r0)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r7.append(r0)
            r11 = r45
            r7.append(r11)
            java.lang.String r0 = r7.toString()
            java.lang.String r3 = "AtomParsers"
            android.util.Log.w(r3, r0)
        L_0x0268:
            r30 = r2
            goto L_0x031a
        L_0x026c:
            r1 = r0
            r26 = r3
            long[] r0 = new long[r14]
            int[] r2 = new int[r14]
            r15 = r21
            r11 = r22
            r3 = 0
            r5 = 0
            r10 = -1
        L_0x027a:
            r13 = 1
            int r10 = r10 + r13
            if (r10 != r14) goto L_0x0282
            r13 = 4
            r16 = 0
            goto L_0x02a9
        L_0x0282:
            if (r8 == 0) goto L_0x0289
            long r11 = r6.p()
            goto L_0x028d
        L_0x0289:
            long r11 = r6.n()
        L_0x028d:
            if (r10 != r3) goto L_0x02a6
            int r5 = r9.o()
            r13 = 4
            r9.i(r13)
            int r15 = r15 + -1
            if (r15 <= 0) goto L_0x02a4
            int r3 = r9.o()
            r16 = -1
            int r3 = r3 + -1
            goto L_0x02a7
        L_0x02a4:
            r3 = -1
            goto L_0x02a7
        L_0x02a6:
            r13 = 4
        L_0x02a7:
            r16 = 1
        L_0x02a9:
            if (r16 == 0) goto L_0x02b0
            r0[r10] = r11
            r2[r10] = r5
            goto L_0x027a
        L_0x02b0:
            int r3 = r4.c()
            long r4 = (long) r7
            r6 = 8192(0x2000, float:1.14794E-41)
            int r6 = r6 / r3
            r7 = 0
            r8 = 0
        L_0x02ba:
            if (r7 >= r14) goto L_0x02c6
            r9 = r2[r7]
            int r9 = e8.eg0.h(r9, r6)
            int r8 = r8 + r9
            int r7 = r7 + 1
            goto L_0x02ba
        L_0x02c6:
            long[] r12 = new long[r8]
            int[] r15 = new int[r8]
            long[] r7 = new long[r8]
            int[] r13 = new int[r8]
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x02d2:
            if (r8 >= r14) goto L_0x0315
            r16 = r2[r8]
            r24 = r0[r8]
            r43 = r16
            r16 = r0
            r0 = r43
        L_0x02de:
            if (r0 <= 0) goto L_0x030c
            int r19 = java.lang.Math.min(r6, r0)
            r12[r11] = r24
            int r21 = r3 * r19
            r15[r11] = r21
            r21 = r2
            r2 = r15[r11]
            int r9 = java.lang.Math.max(r9, r2)
            r45 = r3
            long r2 = (long) r10
            long r2 = r2 * r4
            r7[r11] = r2
            r2 = 1
            r13[r11] = r2
            r2 = r15[r11]
            long r2 = (long) r2
            long r24 = r24 + r2
            int r10 = r10 + r19
            int r0 = r0 - r19
            int r11 = r11 + 1
            r3 = r45
            r2 = r21
            goto L_0x02de
        L_0x030c:
            r21 = r2
            r45 = r3
            int r8 = r8 + 1
            r0 = r16
            goto L_0x02d2
        L_0x0315:
            r5 = r7
            r30 = r9
            r35 = r22
        L_0x031a:
            long[] r0 = r1.f17616i
            if (r0 == 0) goto L_0x0539
            r2 = r46
            int r3 = r2.f7109a
            r4 = -1
            if (r3 == r4) goto L_0x032b
            int r3 = r2.f7110b
            if (r3 == r4) goto L_0x032b
            r3 = 1
            goto L_0x032c
        L_0x032b:
            r3 = 0
        L_0x032c:
            if (r3 == 0) goto L_0x0330
            goto L_0x0539
        L_0x0330:
            int r3 = r0.length
            r4 = 1
            if (r3 != r4) goto L_0x03bc
            int r3 = r1.f17609b
            if (r3 != r4) goto L_0x03bc
            int r3 = r5.length
            r4 = 2
            if (r3 < r4) goto L_0x03bc
            long[] r3 = r1.f17617j
            r4 = 0
            r6 = r3[r4]
            r37 = r0[r4]
            long r8 = r1.f17610c
            long r10 = r1.f17611d
            r39 = r8
            r41 = r10
            long r8 = e8.eg0.b(r37, r39, r41)
            long r8 = r8 + r6
            r10 = r5[r4]
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x03bc
            r0 = 1
            r3 = r5[r0]
            int r10 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x03bc
            int r3 = r5.length
            int r3 = r3 - r0
            r3 = r5[r3]
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x03bc
            int r0 = (r8 > r35 ? 1 : (r8 == r35 ? 0 : -1))
            if (r0 > 0) goto L_0x03bc
            long r37 = r35 - r8
            r0 = 0
            r3 = r5[r0]
            long r31 = r6 - r3
            e8.bc0 r0 = r1.f17613f
            int r0 = r0.A
            long r3 = (long) r0
            long r6 = r1.f17610c
            r33 = r3
            r35 = r6
            long r3 = e8.eg0.b(r31, r33, r35)
            e8.bc0 r0 = r1.f17613f
            int r0 = r0.A
            long r6 = (long) r0
            long r8 = r1.f17610c
            r39 = r6
            r41 = r8
            long r6 = e8.eg0.b(r37, r39, r41)
            int r0 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x0396
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x03bc
        L_0x0396:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x03bc
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x03bc
            int r0 = (int) r3
            r2.f7109a = r0
            int r0 = (int) r6
            r2.f7110b = r0
            long r0 = r1.f17610c
            e8.eg0.c(r5, r0)
            e8.zd0 r0 = new e8.zd0
            r27 = r0
            r28 = r12
            r29 = r15
            r31 = r5
            r32 = r13
            r27.<init>(r28, r29, r30, r31, r32)
            return r0
        L_0x03bc:
            long[] r0 = r1.f17616i
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L_0x03f8
            r17 = 0
            r2 = r0[r17]
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x03f8
            r0 = 0
        L_0x03cb:
            int r2 = r5.length
            if (r0 >= r2) goto L_0x03e8
            r2 = r5[r0]
            long[] r4 = r1.f17617j
            r6 = r4[r17]
            long r18 = r2 - r6
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r1.f17610c
            r22 = r2
            long r2 = e8.eg0.b(r18, r20, r22)
            r5[r0] = r2
            int r0 = r0 + 1
            r17 = 0
            goto L_0x03cb
        L_0x03e8:
            e8.zd0 r0 = new e8.zd0
            r27 = r0
            r28 = r12
            r29 = r15
            r31 = r5
            r32 = r13
            r27.<init>(r28, r29, r30, r31, r32)
            return r0
        L_0x03f8:
            int r0 = r1.f17609b
            r2 = 1
            if (r0 != r2) goto L_0x03ff
            r2 = 1
            goto L_0x0400
        L_0x03ff:
            r2 = 0
        L_0x0400:
            r0 = 0
            r3 = 0
            r4 = 0
            r6 = 0
        L_0x0404:
            long[] r7 = r1.f17616i
            int r8 = r7.length
            r9 = -1
            if (r4 >= r8) goto L_0x043f
            long[] r8 = r1.f17617j
            r45 = r13
            r13 = r8[r4]
            int r8 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x043a
            r31 = r7[r4]
            long r7 = r1.f17610c
            long r9 = r1.f17611d
            r33 = r7
            r35 = r9
            long r7 = e8.eg0.b(r31, r33, r35)
            r9 = 1
            int r10 = e8.eg0.e(r5, r13, r9, r9)
            long r13 = r13 + r7
            r7 = 0
            int r8 = e8.eg0.e(r5, r13, r2, r7)
            int r7 = r8 - r10
            int r7 = r7 + r0
            if (r3 == r10) goto L_0x0435
            r0 = 1
            goto L_0x0436
        L_0x0435:
            r0 = 0
        L_0x0436:
            r0 = r0 | r6
            r6 = r0
            r0 = r7
            r3 = r8
        L_0x043a:
            int r4 = r4 + 1
            r13 = r45
            goto L_0x0404
        L_0x043f:
            r45 = r13
            r3 = r26
            if (r0 == r3) goto L_0x0447
            r3 = 1
            goto L_0x0448
        L_0x0447:
            r3 = 0
        L_0x0448:
            r3 = r3 | r6
            if (r3 == 0) goto L_0x044e
            long[] r4 = new long[r0]
            goto L_0x044f
        L_0x044e:
            r4 = r12
        L_0x044f:
            if (r3 == 0) goto L_0x0454
            int[] r6 = new int[r0]
            goto L_0x0455
        L_0x0454:
            r6 = r15
        L_0x0455:
            if (r3 == 0) goto L_0x0459
            r30 = 0
        L_0x0459:
            if (r3 == 0) goto L_0x045e
            int[] r7 = new int[r0]
            goto L_0x0460
        L_0x045e:
            r7 = r45
        L_0x0460:
            long[] r0 = new long[r0]
            r13 = r22
            r27 = r30
            r8 = 0
            r11 = 0
        L_0x0468:
            long[] r9 = r1.f17616i
            int r10 = r9.length
            if (r8 >= r10) goto L_0x050a
            long[] r10 = r1.f17617j
            r28 = r13
            r13 = r10[r8]
            r30 = r9[r8]
            r9 = -1
            int r16 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x04f8
            long r9 = r1.f17610c
            r16 = r7
            r32 = r8
            long r7 = r1.f17611d
            r19 = r30
            r21 = r9
            r23 = r7
            long r7 = e8.eg0.b(r19, r21, r23)
            long r7 = r7 + r13
            r9 = 1
            int r10 = e8.eg0.e(r5, r13, r9, r9)
            r9 = 0
            int r7 = e8.eg0.e(r5, r7, r2, r9)
            if (r3 == 0) goto L_0x04ae
            int r8 = r7 - r10
            java.lang.System.arraycopy(r12, r10, r4, r11, r8)
            java.lang.System.arraycopy(r15, r10, r6, r11, r8)
            r9 = r45
            r43 = r16
            r16 = r2
            r2 = r43
            java.lang.System.arraycopy(r9, r10, r2, r11, r8)
            goto L_0x04b6
        L_0x04ae:
            r9 = r45
            r43 = r16
            r16 = r2
            r2 = r43
        L_0x04b6:
            r8 = r27
        L_0x04b8:
            if (r10 >= r7) goto L_0x04f5
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r45 = r7
            r27 = r8
            long r7 = r1.f17611d
            r19 = r28
            r23 = r7
            long r7 = e8.eg0.b(r19, r21, r23)
            r19 = r5[r10]
            long r33 = r19 - r13
            r35 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r13
            long r13 = r1.f17610c
            r37 = r13
            long r13 = e8.eg0.b(r33, r35, r37)
            long r7 = r7 + r13
            r0[r11] = r7
            if (r3 == 0) goto L_0x04ea
            r7 = r6[r11]
            r8 = r27
            if (r7 <= r8) goto L_0x04ec
            r8 = r15[r10]
            goto L_0x04ec
        L_0x04ea:
            r8 = r27
        L_0x04ec:
            int r11 = r11 + 1
            int r10 = r10 + 1
            r7 = r45
            r13 = r19
            goto L_0x04b8
        L_0x04f5:
            r27 = r8
            goto L_0x04ff
        L_0x04f8:
            r9 = r45
            r16 = r2
            r2 = r7
            r32 = r8
        L_0x04ff:
            long r13 = r28 + r30
            int r8 = r32 + 1
            r7 = r2
            r45 = r9
            r2 = r16
            goto L_0x0468
        L_0x050a:
            r2 = r7
            r1 = 0
            r3 = 0
        L_0x050d:
            int r5 = r2.length
            if (r1 >= r5) goto L_0x051f
            if (r3 != 0) goto L_0x051f
            r5 = r2[r1]
            r7 = 1
            r5 = r5 & r7
            if (r5 == 0) goto L_0x051a
            r5 = 1
            goto L_0x051b
        L_0x051a:
            r5 = 0
        L_0x051b:
            r3 = r3 | r5
            int r1 = r1 + 1
            goto L_0x050d
        L_0x051f:
            if (r3 == 0) goto L_0x0531
            e8.zd0 r1 = new e8.zd0
            r24 = r1
            r25 = r4
            r26 = r6
            r28 = r0
            r29 = r2
            r24.<init>(r25, r26, r27, r28, r29)
            return r1
        L_0x0531:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>(r1)
            throw r0
        L_0x0539:
            r9 = r13
            long r0 = r1.f17610c
            e8.eg0.c(r5, r0)
            e8.zd0 r0 = new e8.zd0
            r27 = r0
            r28 = r12
            r29 = r15
            r31 = r5
            r32 = r9
            r27.<init>(r28, r29, r30, r31, r32)
            return r0
        L_0x054f:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            goto L_0x0558
        L_0x0557:
            throw r0
        L_0x0558:
            goto L_0x0557
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mt.c(e8.yd0, e8.od0, com.google.android.gms.internal.ads.it):e8.zd0");
    }

    public static Pair<String, byte[]> d(w60 w60, int i10) {
        w60.h(i10 + 8 + 4);
        w60.i(1);
        e(w60);
        w60.i(2);
        int d10 = w60.d();
        if ((d10 & 128) != 0) {
            w60.i(2);
        }
        if ((d10 & 64) != 0) {
            w60.i(w60.e());
        }
        if ((d10 & 32) != 0) {
            w60.i(2);
        }
        w60.i(1);
        e(w60);
        int d11 = w60.d();
        String str = null;
        if (d11 == 32) {
            str = "video/mp4v-es";
        } else if (d11 == 33) {
            str = "video/avc";
        } else if (d11 != 35) {
            if (d11 != 64) {
                if (d11 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (d11 == 165) {
                    str = "audio/ac3";
                } else if (d11 != 166) {
                    switch (d11) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (d11) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        w60.i(12);
        w60.i(1);
        int e10 = e(w60);
        byte[] bArr = new byte[e10];
        System.arraycopy(w60.f17220a, w60.f17221b, bArr, 0, e10);
        w60.f17221b += e10;
        return Pair.create(str, bArr);
    }

    public static int e(w60 w60) {
        int d10 = w60.d();
        int i10 = d10 & 127;
        while ((d10 & 128) == 128) {
            d10 = w60.d();
            i10 = (i10 << 7) | (d10 & 127);
        }
        return i10;
    }
}
