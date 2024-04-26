package n5;

import androidx.appcompat.widget.d0;
import d5.i;
import d5.j;
import d5.k;
import d5.w;
import d5.x;
import java.io.IOException;
import t4.q;
import v6.v;

/* compiled from: Ac4Extractor */
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final d f22015a = new d((String) null);

    /* renamed from: b  reason: collision with root package name */
    public final v f22016b = new v(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f22017c;

    static {
        q qVar = q.f25721b;
    }

    public void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r15.f();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if ((r4 - r3) < 8192) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(d5.j r15) throws java.io.IOException {
        /*
            r14 = this;
            v6.v r0 = new v6.v
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f26518a
            r15.j(r4, r2, r1)
            r0.D(r2)
            int r4 = r0.u()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L_0x008e
            r15.f()
            r15.k(r3)
            r4 = r3
        L_0x0022:
            r1 = 0
        L_0x0023:
            byte[] r5 = r0.f26518a
            r7 = 7
            r15.j(r5, r2, r7)
            r0.D(r2)
            int r5 = r0.x()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L_0x004a
            if (r5 == r9) goto L_0x004a
            r15.f()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0046
            return r2
        L_0x0046:
            r15.k(r4)
            goto L_0x0022
        L_0x004a:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 < r10) goto L_0x0050
            return r8
        L_0x0050:
            byte[] r8 = r0.f26518a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L_0x0058
            r11 = -1
            goto L_0x0085
        L_0x0058:
            r11 = 2
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L_0x007f
            byte r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            byte r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L_0x0080
        L_0x007f:
            r7 = 4
        L_0x0080:
            if (r5 != r9) goto L_0x0084
            int r7 = r7 + 2
        L_0x0084:
            int r11 = r11 + r7
        L_0x0085:
            if (r11 != r12) goto L_0x0088
            return r2
        L_0x0088:
            int r11 = r11 + -7
            r15.k(r11)
            goto L_0x0023
        L_0x008e:
            r0.E(r6)
            int r4 = r0.r()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.k(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.c.e(d5.j):boolean");
    }

    public int f(j jVar, w wVar) throws IOException {
        int a10 = jVar.a(this.f22016b.f26518a, 0, 16384);
        if (a10 == -1) {
            return -1;
        }
        this.f22016b.D(0);
        this.f22016b.C(a10);
        if (!this.f22017c) {
            this.f22015a.f22031m = 0;
            this.f22017c = true;
        }
        this.f22015a.c(this.f22016b);
        return 0;
    }

    public void h(long j10, long j11) {
        this.f22017c = false;
        this.f22015a.a();
    }

    public void i(k kVar) {
        d dVar = this.f22015a;
        dVar.f22022d = d0.a("", 0);
        dVar.f22023e = kVar.l(0, 1);
        kVar.d();
        kVar.b(new x.b(-9223372036854775807L, 0));
    }
}
