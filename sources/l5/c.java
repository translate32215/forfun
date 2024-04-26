package l5;

import d5.c0;
import d5.i;
import d5.j;
import d5.k;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import t4.p;
import v6.e0;
import v6.v;
import x4.m0;

/* compiled from: OggExtractor */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public k f21059a;

    /* renamed from: b  reason: collision with root package name */
    public h f21060b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21061c;

    static {
        p pVar = p.f25717b;
    }

    public void a() {
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean b(j jVar) throws IOException {
        boolean z10;
        boolean z11;
        e eVar = new e();
        if (eVar.a(jVar, true) && (eVar.f21067a & 2) == 2) {
            int min = Math.min(eVar.f21071e, 8);
            v vVar = new v(min);
            jVar.j(vVar.f26518a, 0, min);
            vVar.D(0);
            if (vVar.a() >= 5 && vVar.s() == 127 && vVar.t() == 1179402563) {
                this.f21060b = new b();
            } else {
                vVar.D(0);
                try {
                    z10 = c0.c(1, vVar, true);
                } catch (m0 unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f21060b = new i();
                } else {
                    vVar.D(0);
                    int a10 = vVar.a();
                    byte[] bArr = g.f21074o;
                    if (a10 < bArr.length) {
                        z11 = false;
                    } else {
                        byte[] bArr2 = new byte[bArr.length];
                        int length = bArr.length;
                        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr2, 0, length);
                        vVar.f26519b += length;
                        z11 = Arrays.equals(bArr2, bArr);
                    }
                    if (z11) {
                        this.f21060b = new g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean e(j jVar) throws IOException {
        try {
            return b(jVar);
        } catch (m0 unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(d5.j r20, d5.w r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            d5.k r2 = r0.f21059a
            v6.a.f(r2)
            l5.h r2 = r0.f21060b
            if (r2 != 0) goto L_0x001f
            boolean r2 = r19.b(r20)
            if (r2 == 0) goto L_0x0017
            r20.f()
            goto L_0x001f
        L_0x0017:
            x4.m0 r1 = new x4.m0
            java.lang.String r2 = "Failed to determine bitstream type"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x001f:
            boolean r2 = r0.f21061c
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x003d
            d5.k r2 = r0.f21059a
            d5.a0 r2 = r2.l(r3, r4)
            d5.k r5 = r0.f21059a
            r5.d()
            l5.h r5 = r0.f21060b
            d5.k r6 = r0.f21059a
            r5.f21078c = r6
            r5.f21077b = r2
            r5.e(r4)
            r0.f21061c = r4
        L_0x003d:
            l5.h r2 = r0.f21060b
            d5.a0 r5 = r2.f21077b
            v6.a.f(r5)
            int r5 = v6.e0.f26436a
            int r5 = r2.f21083h
            r6 = -1
            r8 = -1
            r9 = 3
            r15 = 2
            if (r5 == 0) goto L_0x00ed
            if (r5 == r4) goto L_0x00e3
            if (r5 == r15) goto L_0x005d
            if (r5 != r9) goto L_0x0057
            goto L_0x0118
        L_0x0057:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x005d:
            l5.f r5 = r2.f21079d
            long r10 = r5.b(r1)
            r12 = 0
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x0070
            r5 = r21
            r5.f13063a = r10
            r3 = 1
            goto L_0x018f
        L_0x0070:
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x007b
            r14 = 2
            long r10 = r10 + r14
            long r10 = -r10
            r2.b(r10)
        L_0x007b:
            boolean r5 = r2.f21087l
            if (r5 != 0) goto L_0x008f
            l5.f r5 = r2.f21079d
            d5.x r5 = r5.a()
            v6.a.f(r5)
            d5.k r10 = r2.f21078c
            r10.b(r5)
            r2.f21087l = r4
        L_0x008f:
            long r4 = r2.f21086k
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x00a3
            l5.d r4 = r2.f21076a
            boolean r1 = r4.b(r1)
            if (r1 == 0) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            r2.f21083h = r9
        L_0x00a0:
            r3 = -1
            goto L_0x018f
        L_0x00a3:
            r2.f21086k = r12
            l5.d r1 = r2.f21076a
            v6.v r1 = r1.f21063b
            long r4 = r2.c(r1)
            int r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r8 < 0) goto L_0x00dc
            long r8 = r2.f21082g
            long r10 = r8 + r4
            long r12 = r2.f21080e
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00dc
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r10
            int r10 = r2.f21084i
            long r10 = (long) r10
            long r13 = r8 / r10
            d5.a0 r8 = r2.f21077b
            int r9 = r1.f26520c
            r8.b(r1, r9)
            d5.a0 r12 = r2.f21077b
            r15 = 1
            int r1 = r1.f26520c
            r17 = 0
            r18 = 0
            r16 = r1
            r12.d(r13, r15, r16, r17, r18)
            r2.f21080e = r6
        L_0x00dc:
            long r6 = r2.f21082g
            long r6 = r6 + r4
            r2.f21082g = r6
            goto L_0x018f
        L_0x00e3:
            long r4 = r2.f21081f
            int r5 = (int) r4
            r1.g(r5)
            r2.f21083h = r15
            goto L_0x018f
        L_0x00ed:
            l5.d r5 = r2.f21076a
            boolean r5 = r5.b(r1)
            if (r5 != 0) goto L_0x00f9
            r2.f21083h = r9
            r5 = 0
            goto L_0x0116
        L_0x00f9:
            long r10 = r20.l()
            long r12 = r2.f21081f
            long r10 = r10 - r12
            r2.f21086k = r10
            l5.d r5 = r2.f21076a
            v6.v r5 = r5.f21063b
            l5.h$b r10 = r2.f21085j
            boolean r5 = r2.d(r5, r12, r10)
            if (r5 == 0) goto L_0x0115
            long r10 = r20.l()
            r2.f21081f = r10
            goto L_0x00ed
        L_0x0115:
            r5 = 1
        L_0x0116:
            if (r5 != 0) goto L_0x0119
        L_0x0118:
            goto L_0x00a0
        L_0x0119:
            l5.h$b r5 = r2.f21085j
            x4.b0 r5 = r5.f21089a
            int r8 = r5.H
            r2.f21084i = r8
            boolean r8 = r2.f21088m
            if (r8 != 0) goto L_0x012c
            d5.a0 r8 = r2.f21077b
            r8.c(r5)
            r2.f21088m = r4
        L_0x012c:
            l5.h$b r5 = r2.f21085j
            l5.f r5 = r5.f21090b
            if (r5 == 0) goto L_0x0136
            r2.f21079d = r5
        L_0x0134:
            r1 = 2
            goto L_0x016f
        L_0x0136:
            long r8 = r20.b()
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0147
            l5.h$c r1 = new l5.h$c
            r4 = 0
            r1.<init>(r4)
            r2.f21079d = r1
            goto L_0x0134
        L_0x0147:
            l5.d r5 = r2.f21076a
            l5.e r5 = r5.f21062a
            int r6 = r5.f21067a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0154
            r17 = 1
            goto L_0x0156
        L_0x0154:
            r17 = 0
        L_0x0156:
            l5.a r4 = new l5.a
            long r9 = r2.f21081f
            long r11 = r20.b()
            int r1 = r5.f21070d
            int r6 = r5.f21071e
            int r1 = r1 + r6
            long r13 = (long) r1
            long r5 = r5.f21068b
            r7 = r4
            r8 = r2
            r1 = 2
            r15 = r5
            r7.<init>(r8, r9, r11, r13, r15, r17)
            r2.f21079d = r4
        L_0x016f:
            r2.f21083h = r1
            l5.d r1 = r2.f21076a
            v6.v r2 = r1.f21063b
            byte[] r4 = r2.f26518a
            int r5 = r4.length
            r6 = 65025(0xfe01, float:9.112E-41)
            if (r5 != r6) goto L_0x017e
            goto L_0x018f
        L_0x017e:
            int r5 = r2.f26520c
            int r5 = java.lang.Math.max(r6, r5)
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            v6.v r1 = r1.f21063b
            int r1 = r1.f26520c
            r2.B(r4, r1)
        L_0x018f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.c.f(d5.j, d5.w):int");
    }

    public void h(long j10, long j11) {
        h hVar = this.f21060b;
        if (hVar != null) {
            d dVar = hVar.f21076a;
            dVar.f21062a.b();
            dVar.f21063b.z(0);
            dVar.f21064c = -1;
            dVar.f21066e = false;
            if (j10 == 0) {
                hVar.e(!hVar.f21087l);
            } else if (hVar.f21083h != 0) {
                long j12 = (((long) hVar.f21084i) * j11) / 1000000;
                hVar.f21080e = j12;
                f fVar = hVar.f21079d;
                int i10 = e0.f26436a;
                fVar.c(j12);
                hVar.f21083h = 2;
            }
        }
    }

    public void i(k kVar) {
        this.f21059a = kVar;
    }
}
