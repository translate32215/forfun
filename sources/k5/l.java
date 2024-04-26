package k5;

import d5.j;
import java.io.IOException;
import v6.v;

/* compiled from: Sniffer */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f19994a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(j jVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        j jVar2 = jVar;
        long b10 = jVar.b();
        long j10 = 4096;
        long j11 = -1;
        if (b10 != -1 && b10 <= 4096) {
            j10 = b10;
        }
        int i10 = (int) j10;
        v vVar = new v(64);
        boolean z14 = false;
        int i11 = 0;
        boolean z15 = false;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            vVar.z(8);
            if (!jVar2.h(vVar.f26518a, z14 ? 1 : 0, 8, true)) {
                break;
            }
            long t10 = vVar.t();
            int f10 = vVar.f();
            int i12 = 16;
            if (t10 == 1) {
                jVar2.j(vVar.f26518a, 8, 8);
                vVar.C(16);
                t10 = vVar.m();
            } else {
                if (t10 == 0) {
                    long b11 = jVar.b();
                    if (b11 != j11) {
                        t10 = ((long) 8) + (b11 - jVar.i());
                    }
                }
                i12 = 8;
            }
            long j12 = (long) i12;
            if (t10 < j12) {
                return z14;
            }
            i11 += i12;
            if (f10 == 1836019574) {
                i10 += (int) t10;
                if (b10 != -1 && ((long) i10) > b10) {
                    i10 = (int) b10;
                }
                j11 = -1;
            } else if (f10 == 1836019558 || f10 == 1836475768) {
                z12 = true;
            } else {
                long j13 = b10;
                int i13 = i11;
                if ((((long) i11) + t10) - j12 >= ((long) i10)) {
                    break;
                }
                int i14 = (int) (t10 - j12);
                i11 = i13 + i14;
                if (f10 == 1718909296) {
                    if (i14 < 8) {
                        return false;
                    }
                    vVar.z(i14);
                    jVar2.j(vVar.f26518a, 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            break;
                        }
                        if (i16 == 1) {
                            vVar.E(4);
                        } else {
                            int f11 = vVar.f();
                            if ((f11 >>> 8) != 3368816 && (f11 != 1751476579 || !z11)) {
                                int[] iArr = f19994a;
                                int length = iArr.length;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= length) {
                                        z13 = false;
                                        break;
                                    } else if (iArr[i17] == f11) {
                                        break;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            z13 = true;
                            if (z13) {
                                z15 = true;
                                break;
                            }
                        }
                        i16++;
                    }
                    if (!z15) {
                        return false;
                    }
                } else if (i14 != 0) {
                    jVar2.k(i14);
                }
                j11 = -1;
                b10 = j13;
                z14 = false;
            }
        }
        z12 = false;
        return z15 && z10 == z12;
    }
}
