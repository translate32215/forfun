package f5;

import d5.a;
import d5.j;
import d5.l;
import d5.p;
import d5.s;
import java.io.IOException;
import v6.v;

/* compiled from: FlacBinarySearchSeeker */
public final class a extends d5.a {

    /* compiled from: FlacBinarySearchSeeker */
    public static final class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final s f18111a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18112b;

        /* renamed from: c  reason: collision with root package name */
        public final p.a f18113c = new p.a();

        public b(s sVar, int i10, C0138a aVar) {
            this.f18111a = sVar;
            this.f18112b = i10;
        }

        public a.e a(j jVar, long j10) throws IOException {
            long l10 = jVar.l();
            long c10 = c(jVar);
            long i10 = jVar.i();
            jVar.k(Math.max(6, this.f18111a.f13043c));
            long c11 = c(jVar);
            long i11 = jVar.i();
            if (c10 <= j10 && c11 > j10) {
                return a.e.b(i10);
            }
            if (c11 <= j10) {
                return a.e.c(c11, i11);
            }
            return a.e.a(c10, l10);
        }

        public /* synthetic */ void b() {
            d5.b.a(this);
        }

        public final long c(j jVar) throws IOException {
            while (jVar.i() < jVar.b() - 6) {
                s sVar = this.f18111a;
                int i10 = this.f18112b;
                p.a aVar = this.f18113c;
                long i11 = jVar.i();
                byte[] bArr = new byte[2];
                boolean z10 = false;
                jVar.j(bArr, 0, 2);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                    jVar.f();
                    jVar.k((int) (i11 - jVar.l()));
                } else {
                    v vVar = new v(16);
                    System.arraycopy(bArr, 0, vVar.f26518a, 0, 2);
                    vVar.C(l.a(jVar, vVar.f26518a, 2, 14));
                    jVar.f();
                    jVar.k((int) (i11 - jVar.l()));
                    z10 = p.b(vVar, sVar, i10, aVar);
                }
                if (z10) {
                    break;
                }
                jVar.k(1);
            }
            if (jVar.i() < jVar.b() - 6) {
                return this.f18113c.f13038a;
            }
            jVar.k((int) (jVar.b() - jVar.i()));
            return this.f18111a.f13050j;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(d5.s r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            r17.getClass()
            r1.c r1 = new r1.c
            r1.<init>((d5.s) r0)
            f5.a$b r2 = new f5.a$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4, r3)
            long r3 = r17.d()
            long r7 = r0.f13050j
            int r5 = r0.f13044d
            if (r5 <= 0) goto L_0x0027
            long r5 = (long) r5
            int r9 = r0.f13043c
            long r9 = (long) r9
            long r5 = r5 + r9
            r9 = 2
            long r5 = r5 / r9
            r9 = 1
            goto L_0x0042
        L_0x0027:
            int r5 = r0.f13041a
            int r6 = r0.f13042b
            if (r5 != r6) goto L_0x0031
            if (r5 <= 0) goto L_0x0031
            long r5 = (long) r5
            goto L_0x0033
        L_0x0031:
            r5 = 4096(0x1000, double:2.0237E-320)
        L_0x0033:
            int r9 = r0.f13047g
            long r9 = (long) r9
            long r5 = r5 * r9
            int r9 = r0.f13048h
            long r9 = (long) r9
            long r5 = r5 * r9
            r9 = 8
            long r5 = r5 / r9
            r9 = 64
        L_0x0042:
            long r13 = r5 + r9
            r5 = 6
            int r0 = r0.f13043c
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.a.<init>(d5.s, int, long, long):void");
    }
}
