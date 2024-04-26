package f5;

import d5.a0;
import d5.b0;
import d5.c0;
import d5.i;
import d5.j;
import d5.k;
import d5.l;
import d5.p;
import d5.q;
import d5.r;
import d5.s;
import d5.w;
import d5.x;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import q.e;
import q5.a;
import v6.e0;
import v6.v;
import x4.m0;

/* compiled from: FlacExtractor */
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f18115a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final v f18116b = new v(new byte[32768], 0);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18117c;

    /* renamed from: d  reason: collision with root package name */
    public final p.a f18118d;

    /* renamed from: e  reason: collision with root package name */
    public k f18119e;

    /* renamed from: f  reason: collision with root package name */
    public a0 f18120f;

    /* renamed from: g  reason: collision with root package name */
    public int f18121g;

    /* renamed from: h  reason: collision with root package name */
    public a f18122h;

    /* renamed from: i  reason: collision with root package name */
    public s f18123i;

    /* renamed from: j  reason: collision with root package name */
    public int f18124j;

    /* renamed from: k  reason: collision with root package name */
    public int f18125k;

    /* renamed from: l  reason: collision with root package name */
    public a f18126l;

    /* renamed from: m  reason: collision with root package name */
    public int f18127m;

    /* renamed from: n  reason: collision with root package name */
    public long f18128n;

    static {
        b bVar = b.f18114a;
    }

    public c(int i10) {
        this.f18117c = (i10 & 1) == 0 ? false : true;
        this.f18118d = new p.a();
        this.f18121g = 0;
    }

    public void a() {
    }

    public final void b() {
        s sVar = this.f18123i;
        int i10 = e0.f26436a;
        this.f18120f.d((this.f18128n * 1000000) / ((long) sVar.f13045e), 1, this.f18127m, 0, (a0.a) null);
    }

    public boolean e(j jVar) throws IOException {
        q.a(jVar, false);
        byte[] bArr = new byte[4];
        jVar.j(bArr, 0, 4);
        if ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (255 & ((long) bArr[3]))) == 1716281667) {
            return true;
        }
        return false;
    }

    public int f(j jVar, w wVar) throws IOException {
        s sVar;
        x xVar;
        long j10;
        boolean z10;
        j jVar2 = jVar;
        int i10 = this.f18121g;
        int i11 = 1;
        if (i10 == 0) {
            jVar.f();
            long i12 = jVar.i();
            a a10 = q.a(jVar2, !this.f18117c);
            jVar2.g((int) (jVar.i() - i12));
            this.f18122h = a10;
            this.f18121g = 1;
            return 0;
        } else if (i10 != 1) {
            int i13 = 24;
            int i14 = 4;
            int i15 = 3;
            if (i10 != 2) {
                int i16 = 7;
                int i17 = 6;
                if (i10 != 3) {
                    long j11 = 0;
                    if (i10 == 4) {
                        jVar.f();
                        byte[] bArr = new byte[2];
                        jVar2.j(bArr, 0, 2);
                        byte b10 = (bArr[1] & 255) | ((bArr[0] & 255) << 8);
                        if ((b10 >> 2) == 16382) {
                            jVar.f();
                            this.f18125k = b10;
                            k kVar = this.f18119e;
                            int i18 = e0.f26436a;
                            long l10 = jVar.l();
                            long b11 = jVar.b();
                            this.f18123i.getClass();
                            s sVar2 = this.f18123i;
                            if (sVar2.f13051k != null) {
                                xVar = new r(sVar2, l10);
                            } else if (b11 == -1 || sVar2.f13050j <= 0) {
                                xVar = new x.b(sVar2.d(), 0);
                            } else {
                                a aVar = new a(sVar2, this.f18125k, l10, b11);
                                this.f18126l = aVar;
                                xVar = aVar.f12973a;
                            }
                            kVar.b(xVar);
                            this.f18121g = 5;
                            return 0;
                        }
                        jVar.f();
                        throw new m0("First frame does not start with sync code.");
                    } else if (i10 == 5) {
                        this.f18120f.getClass();
                        this.f18123i.getClass();
                        a aVar2 = this.f18126l;
                        if (aVar2 != null && aVar2.b()) {
                            return this.f18126l.a(jVar2, wVar);
                        }
                        if (this.f18128n == -1) {
                            s sVar3 = this.f18123i;
                            jVar.f();
                            jVar2.k(1);
                            byte[] bArr2 = new byte[1];
                            jVar2.j(bArr2, 0, 1);
                            boolean z11 = (bArr2[0] & 1) == 1;
                            jVar2.k(2);
                            if (!z11) {
                                i16 = 6;
                            }
                            v vVar = new v(i16);
                            vVar.C(l.a(jVar2, vVar.f26518a, 0, i16));
                            jVar.f();
                            try {
                                long y10 = vVar.y();
                                if (!z11) {
                                    y10 *= (long) sVar3.f13042b;
                                }
                                j11 = y10;
                            } catch (NumberFormatException unused) {
                                i11 = 0;
                            }
                            if (i11 != 0) {
                                this.f18128n = j11;
                                return 0;
                            }
                            throw new m0();
                        }
                        v vVar2 = this.f18116b;
                        int i19 = vVar2.f26520c;
                        if (i19 < 32768) {
                            int a11 = jVar2.a(vVar2.f26518a, i19, 32768 - i19);
                            if (a11 != -1) {
                                i11 = 0;
                            }
                            if (i11 == 0) {
                                this.f18116b.C(i19 + a11);
                            } else if (this.f18116b.a() == 0) {
                                b();
                                return -1;
                            }
                        } else {
                            i11 = 0;
                        }
                        v vVar3 = this.f18116b;
                        int i20 = vVar3.f26519b;
                        int i21 = this.f18127m;
                        int i22 = this.f18124j;
                        if (i21 < i22) {
                            vVar3.E(Math.min(i22 - i21, vVar3.a()));
                        }
                        v vVar4 = this.f18116b;
                        this.f18123i.getClass();
                        int i23 = vVar4.f26519b;
                        while (true) {
                            if (i23 <= vVar4.f26520c - 16) {
                                vVar4.D(i23);
                                if (p.b(vVar4, this.f18123i, this.f18125k, this.f18118d)) {
                                    vVar4.D(i23);
                                    j10 = this.f18118d.f13038a;
                                    break;
                                }
                                i23++;
                            } else {
                                if (i11 != 0) {
                                    while (true) {
                                        int i24 = vVar4.f26520c;
                                        if (i23 > i24 - this.f18124j) {
                                            vVar4.D(i24);
                                            break;
                                        }
                                        vVar4.D(i23);
                                        try {
                                            z10 = p.b(vVar4, this.f18123i, this.f18125k, this.f18118d);
                                        } catch (IndexOutOfBoundsException unused2) {
                                            z10 = false;
                                        }
                                        if (vVar4.f26519b > vVar4.f26520c) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            vVar4.D(i23);
                                            j10 = this.f18118d.f13038a;
                                            break;
                                        }
                                        i23++;
                                    }
                                } else {
                                    vVar4.D(i23);
                                }
                                j10 = -1;
                            }
                        }
                        v vVar5 = this.f18116b;
                        int i25 = vVar5.f26519b - i20;
                        vVar5.D(i20);
                        this.f18120f.b(this.f18116b, i25);
                        this.f18127m += i25;
                        if (j10 != -1) {
                            b();
                            this.f18127m = 0;
                            this.f18128n = j10;
                        }
                        if (this.f18116b.a() >= 16) {
                            return 0;
                        }
                        int a12 = this.f18116b.a();
                        v vVar6 = this.f18116b;
                        byte[] bArr3 = vVar6.f26518a;
                        System.arraycopy(bArr3, vVar6.f26519b, bArr3, 0, a12);
                        this.f18116b.D(0);
                        this.f18116b.C(a12);
                        return 0;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    s sVar4 = this.f18123i;
                    boolean z12 = false;
                    while (!z12) {
                        jVar.f();
                        b0 b0Var = new b0(new byte[i14], i11, (e) null);
                        jVar2.j(b0Var.f13001b, 0, i14);
                        boolean h10 = b0Var.h();
                        int i26 = b0Var.i(i16);
                        int i27 = b0Var.i(i13) + i14;
                        if (i26 == 0) {
                            byte[] bArr4 = new byte[38];
                            jVar2.readFully(bArr4, 0, 38);
                            sVar4 = new s(bArr4, i14);
                        } else if (sVar4 == null) {
                            throw new IllegalArgumentException();
                        } else if (i26 == i15) {
                            v vVar7 = new v(i27);
                            jVar2.readFully(vVar7.f26518a, 0, i27);
                            sVar4 = sVar4.b(q.b(vVar7));
                        } else {
                            if (i26 == i14) {
                                v vVar8 = new v(i27);
                                jVar2.readFully(vVar8.f26518a, 0, i27);
                                vVar8.E(i14);
                                sVar = new s(sVar4.f13041a, sVar4.f13042b, sVar4.f13043c, sVar4.f13044d, sVar4.f13045e, sVar4.f13047g, sVar4.f13048h, sVar4.f13050j, sVar4.f13051k, sVar4.f(s.a(Arrays.asList(c0.b(vVar8, false, false).f13005a), Collections.emptyList())));
                            } else if (i26 == i17) {
                                v vVar9 = new v(i27);
                                jVar2.readFully(vVar9.f26518a, 0, i27);
                                vVar9.E(4);
                                int f10 = vVar9.f();
                                String q10 = vVar9.q(vVar9.f(), aa.c.f176a);
                                String p10 = vVar9.p(vVar9.f());
                                int f11 = vVar9.f();
                                int f12 = vVar9.f();
                                int f13 = vVar9.f();
                                int f14 = vVar9.f();
                                int f15 = vVar9.f();
                                byte[] bArr5 = new byte[f15];
                                System.arraycopy(vVar9.f26518a, vVar9.f26519b, bArr5, 0, f15);
                                vVar9.f26519b += f15;
                                sVar = new s(sVar4.f13041a, sVar4.f13042b, sVar4.f13043c, sVar4.f13044d, sVar4.f13045e, sVar4.f13047g, sVar4.f13048h, sVar4.f13050j, sVar4.f13051k, sVar4.f(s.a(Collections.emptyList(), Collections.singletonList(new t5.a(f10, q10, p10, f11, f12, f13, f14, bArr5)))));
                            } else {
                                jVar2.g(i27);
                            }
                            sVar4 = sVar;
                        }
                        int i28 = e0.f26436a;
                        this.f18123i = sVar4;
                        z12 = h10;
                        i11 = 1;
                        i13 = 24;
                        i14 = 4;
                        i15 = 3;
                        i16 = 7;
                        i17 = 6;
                    }
                    this.f18123i.getClass();
                    this.f18124j = Math.max(this.f18123i.f13043c, 6);
                    a0 a0Var = this.f18120f;
                    int i29 = e0.f26436a;
                    a0Var.c(this.f18123i.e(this.f18115a, this.f18122h));
                    this.f18121g = 4;
                    return 0;
                }
            } else {
                byte[] bArr6 = new byte[4];
                jVar2.readFully(bArr6, 0, 4);
                if ((((((long) bArr6[0]) & 255) << 24) | ((((long) bArr6[1]) & 255) << 16) | ((((long) bArr6[2]) & 255) << 8) | (((long) bArr6[3]) & 255)) == 1716281667) {
                    this.f18121g = 3;
                    return 0;
                }
                throw new m0("Failed to read FLAC stream marker.");
            }
        } else {
            byte[] bArr7 = this.f18115a;
            jVar2.j(bArr7, 0, bArr7.length);
            jVar.f();
            this.f18121g = 2;
            return 0;
        }
    }

    public void h(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f18121g = 0;
        } else {
            a aVar = this.f18126l;
            if (aVar != null) {
                aVar.e(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f18128n = j12;
        this.f18127m = 0;
        this.f18116b.z(0);
    }

    public void i(k kVar) {
        this.f18119e = kVar;
        this.f18120f = kVar.l(0, 1);
        kVar.d();
    }
}
