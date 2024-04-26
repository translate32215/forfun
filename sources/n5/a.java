package n5;

import androidx.appcompat.widget.d0;
import d5.i;
import d5.j;
import d5.k;
import d5.w;
import d5.x;
import java.io.IOException;
import t4.o;
import v6.v;

/* compiled from: Ac3Extractor */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final b f21987a = new b((String) null);

    /* renamed from: b  reason: collision with root package name */
    public final v f21988b = new v(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f21989c;

    static {
        o oVar = o.f25714a;
    }

    public void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        r14.f();
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if ((r5 - r3) < 8192) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(d5.j r14) throws java.io.IOException {
        /*
            r13 = this;
            v6.v r0 = new v6.v
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f26518a
            r14.j(r4, r2, r1)
            r0.D(r2)
            int r4 = r0.u()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L_0x0085
            r14.f()
            r14.k(r3)
            r5 = r3
        L_0x0022:
            r4 = 0
        L_0x0023:
            byte[] r7 = r0.f26518a
            r8 = 6
            r14.j(r7, r2, r8)
            r0.D(r2)
            int r7 = r0.x()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r7 == r9) goto L_0x0044
            r14.f()
            int r5 = r5 + 1
            int r4 = r5 - r3
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r4 < r7) goto L_0x0040
            return r2
        L_0x0040:
            r14.k(r5)
            goto L_0x0022
        L_0x0044:
            r7 = 1
            int r4 = r4 + r7
            r9 = 4
            if (r4 < r9) goto L_0x004a
            return r7
        L_0x004a:
            byte[] r10 = r0.f26518a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L_0x0052
            r9 = -1
            goto L_0x007c
        L_0x0052:
            r11 = 5
            byte r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r6
            if (r11 <= r1) goto L_0x005c
            r11 = 1
            goto L_0x005d
        L_0x005c:
            r11 = 0
        L_0x005d:
            if (r11 == 0) goto L_0x006f
            r8 = 2
            byte r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            byte r10 = r10[r6]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r7
            int r9 = r9 * 2
            goto L_0x007c
        L_0x006f:
            byte r7 = r10[r9]
            r7 = r7 & 192(0xc0, float:2.69E-43)
            int r7 = r7 >> r8
            byte r8 = r10[r9]
            r8 = r8 & 63
            int r9 = z4.b.a(r7, r8)
        L_0x007c:
            if (r9 != r12) goto L_0x007f
            return r2
        L_0x007f:
            int r9 = r9 + -6
            r14.k(r9)
            goto L_0x0023
        L_0x0085:
            r0.E(r6)
            int r4 = r0.r()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r14.k(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a.e(d5.j):boolean");
    }

    public int f(j jVar, w wVar) throws IOException {
        int a10 = jVar.a(this.f21988b.f26518a, 0, 2786);
        if (a10 == -1) {
            return -1;
        }
        this.f21988b.D(0);
        this.f21988b.C(a10);
        if (!this.f21989c) {
            this.f21987a.f22005l = 0;
            this.f21989c = true;
        }
        this.f21987a.c(this.f21988b);
        return 0;
    }

    public void h(long j10, long j11) {
        this.f21989c = false;
        this.f21987a.a();
    }

    public void i(k kVar) {
        b bVar = this.f21987a;
        bVar.f21997d = d0.a("", 0);
        bVar.f21998e = kVar.l(0, 1);
        kVar.d();
        kVar.b(new x.b(-9223372036854775807L, 0));
    }
}
