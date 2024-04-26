package n5;

import d5.a;
import d5.j;
import e.i;
import java.io.IOException;
import v6.b0;
import v6.e0;
import v6.v;

/* compiled from: TsBinarySearchSeeker */
public final class a0 extends d5.a {

    /* compiled from: TsBinarySearchSeeker */
    public static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f21990a;

        /* renamed from: b  reason: collision with root package name */
        public final v f21991b = new v();

        /* renamed from: c  reason: collision with root package name */
        public final int f21992c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21993d;

        public a(int i10, b0 b0Var, int i11) {
            this.f21992c = i10;
            this.f21990a = b0Var;
            this.f21993d = i11;
        }

        public a.e a(j jVar, long j10) throws IOException {
            long l10 = jVar.l();
            int min = (int) Math.min((long) this.f21993d, jVar.b() - l10);
            this.f21991b.z(min);
            jVar.j(this.f21991b.f26518a, 0, min);
            v vVar = this.f21991b;
            int i10 = vVar.f26520c;
            long j11 = -1;
            long j12 = -1;
            long j13 = -9223372036854775807L;
            while (vVar.a() >= 188) {
                byte[] bArr = vVar.f26518a;
                int i11 = vVar.f26519b;
                while (i11 < i10 && bArr[i11] != 71) {
                    i11++;
                }
                int i12 = i11 + 188;
                if (i12 > i10) {
                    break;
                }
                long g10 = i.g(vVar, i11, this.f21992c);
                if (g10 != -9223372036854775807L) {
                    long b10 = this.f21990a.b(g10);
                    if (b10 > j10) {
                        if (j13 == -9223372036854775807L) {
                            return a.e.a(b10, l10);
                        }
                        return a.e.b(l10 + j12);
                    } else if (100000 + b10 > j10) {
                        return a.e.b(l10 + ((long) i11));
                    } else {
                        j13 = b10;
                        j12 = (long) i11;
                    }
                }
                vVar.D(i12);
                j11 = (long) i12;
            }
            if (j13 != -9223372036854775807L) {
                return a.e.c(j13, l10 + j11);
            }
            return a.e.f12992d;
        }

        public void b() {
            this.f21991b.A(e0.f26441f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(v6.b0 r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            d5.a$b r1 = new d5.a$b
            r1.<init>()
            n5.a0$a r2 = new n5.a0$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a0.<init>(v6.b0, long, long, int, int):void");
    }
}
