package n5;

import d5.a;
import d5.j;
import java.io.IOException;
import v6.b0;
import v6.e0;
import v6.v;

/* compiled from: PsBinarySearchSeeker */
public final class u extends d5.a {

    /* compiled from: PsBinarySearchSeeker */
    public static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f22303a;

        /* renamed from: b  reason: collision with root package name */
        public final v f22304b = new v();

        public b(b0 b0Var, a aVar) {
            this.f22303a = b0Var;
        }

        public a.e a(j jVar, long j10) throws IOException {
            int g10;
            long l10 = jVar.l();
            int min = (int) Math.min(20000, jVar.b() - l10);
            this.f22304b.z(min);
            jVar.j(this.f22304b.f26518a, 0, min);
            v vVar = this.f22304b;
            int i10 = -1;
            long j11 = -9223372036854775807L;
            int i11 = -1;
            while (vVar.a() >= 4) {
                if (u.g(vVar.f26518a, vVar.f26519b) != 442) {
                    vVar.E(1);
                } else {
                    vVar.E(4);
                    long c10 = v.c(vVar);
                    if (c10 != -9223372036854775807L) {
                        long b10 = this.f22303a.b(c10);
                        if (b10 > j10) {
                            if (j11 == -9223372036854775807L) {
                                return a.e.a(b10, l10);
                            }
                            return a.e.b(l10 + ((long) i11));
                        } else if (100000 + b10 > j10) {
                            return a.e.b(l10 + ((long) vVar.f26519b));
                        } else {
                            i11 = vVar.f26519b;
                            j11 = b10;
                        }
                    }
                    int i12 = vVar.f26520c;
                    if (vVar.a() >= 10) {
                        vVar.E(9);
                        int s10 = vVar.s() & 7;
                        if (vVar.a() >= s10) {
                            vVar.E(s10);
                            if (vVar.a() >= 4) {
                                if (u.g(vVar.f26518a, vVar.f26519b) == 443) {
                                    vVar.E(4);
                                    int x10 = vVar.x();
                                    if (vVar.a() < x10) {
                                        vVar.D(i12);
                                    } else {
                                        vVar.E(x10);
                                    }
                                }
                                while (true) {
                                    if (vVar.a() < 4 || (g10 = u.g(vVar.f26518a, vVar.f26519b)) == 442 || g10 == 441 || (g10 >>> 8) != 1) {
                                        break;
                                    }
                                    vVar.E(4);
                                    if (vVar.a() < 2) {
                                        vVar.D(i12);
                                        break;
                                    }
                                    vVar.D(Math.min(vVar.f26520c, vVar.f26519b + vVar.x()));
                                }
                            } else {
                                vVar.D(i12);
                            }
                        } else {
                            vVar.D(i12);
                        }
                    } else {
                        vVar.D(i12);
                    }
                    i10 = vVar.f26519b;
                }
            }
            if (j11 != -9223372036854775807L) {
                return a.e.c(j11, l10 + ((long) i10));
            }
            return a.e.f12992d;
        }

        public void b() {
            this.f22304b.A(e0.f26441f);
        }
    }

    public u(b0 b0Var, long j10, long j11) {
        super(new a.b(), new b(b0Var, (a) null), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    public static int g(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
