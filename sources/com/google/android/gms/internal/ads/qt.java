package com.google.android.gms.internal.ads;

import e8.eg0;
import e8.fd0;
import e8.pd0;
import e8.w60;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class qt {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f7996a = {eg0.f("isom"), eg0.f("iso2"), eg0.f("iso3"), eg0.f("iso4"), eg0.f("iso5"), eg0.f("iso6"), eg0.f("avc1"), eg0.f("hvc1"), eg0.f("hev1"), eg0.f("mp41"), eg0.f("mp42"), eg0.f("3g2a"), eg0.f("3g2b"), eg0.f("3gr6"), eg0.f("3gs6"), eg0.f("3ge6"), eg0.f("3gg6"), eg0.f("M4V "), eg0.f("M4A "), eg0.f("f4v "), eg0.f("kddi"), eg0.f("M4VP"), eg0.f("qt  "), eg0.f("MSNV")};

    public static boolean a(fd0 fd0, boolean z10) throws IOException, InterruptedException {
        boolean z11;
        boolean z12;
        gt gtVar = (gt) fd0;
        long j10 = gtVar.f6687b;
        if (j10 == -1 || j10 > 4096) {
            j10 = 4096;
        }
        int i10 = (int) j10;
        w60 w60 = new w60(64);
        int i11 = 0;
        boolean z13 = false;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            w60.f(8);
            gtVar.b(w60.f17220a, 0, 8);
            long n10 = w60.n();
            int b10 = w60.b();
            int i12 = 16;
            if (n10 == 1) {
                gtVar.b(w60.f17220a, 8, 8);
                w60.g(16);
                n10 = w60.p();
            } else {
                i12 = 8;
            }
            long j11 = (long) i12;
            if (n10 >= j11) {
                i11 += i12;
                if (b10 != pd0.C) {
                    if (b10 != pd0.L && b10 != pd0.N) {
                        if ((((long) i11) + n10) - j11 >= ((long) i10)) {
                            break;
                        }
                        int i13 = (int) (n10 - j11);
                        i11 += i13;
                        if (b10 == pd0.f15946b) {
                            if (i13 < 8) {
                                return false;
                            }
                            w60.f(i13);
                            gtVar.b(w60.f17220a, 0, i13);
                            int i14 = i13 / 4;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= i14) {
                                    break;
                                }
                                if (i15 == 1) {
                                    w60.i(4);
                                } else {
                                    int b11 = w60.b();
                                    if ((b11 >>> 8) != eg0.f("3gp")) {
                                        int[] iArr = f7996a;
                                        int length = iArr.length;
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= length) {
                                                z12 = false;
                                                break;
                                            } else if (iArr[i16] == b11) {
                                                break;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                    z12 = true;
                                    if (z12) {
                                        z13 = true;
                                        break;
                                    }
                                }
                                i15++;
                            }
                            if (!z13) {
                                return false;
                            }
                        } else if (i13 != 0) {
                            gtVar.g(i13);
                        }
                    } else {
                        z11 = true;
                    }
                }
            } else {
                return false;
            }
        }
        z11 = false;
        if (!z13 || z10 != z11) {
            return false;
        }
        return true;
    }
}
