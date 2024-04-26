package n5;

import d5.b0;
import d5.i;
import d5.j;
import d5.k;
import d5.w;
import d5.x;
import java.io.IOException;
import n5.e0;
import t4.r;
import v6.a;
import v6.v;

/* compiled from: AdtsExtractor */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final f f22057a = new f(true, (String) null);

    /* renamed from: b  reason: collision with root package name */
    public final v f22058b = new v(2048);

    /* renamed from: c  reason: collision with root package name */
    public final v f22059c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f22060d;

    /* renamed from: e  reason: collision with root package name */
    public k f22061e;

    /* renamed from: f  reason: collision with root package name */
    public long f22062f;

    /* renamed from: g  reason: collision with root package name */
    public long f22063g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f22064h = -1;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22065i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f22066j;

    static {
        r rVar = r.f25723a;
    }

    public e(int i10) {
        v vVar = new v(10);
        this.f22059c = vVar;
        this.f22060d = new b0(vVar.f26518a, 1, (q.e) null);
    }

    public void a() {
    }

    public final int b(j jVar) throws IOException {
        int i10 = 0;
        while (true) {
            jVar.j(this.f22059c.f26518a, 0, 10);
            this.f22059c.D(0);
            if (this.f22059c.u() != 4801587) {
                break;
            }
            this.f22059c.E(3);
            int r10 = this.f22059c.r();
            i10 += r10 + 10;
            jVar.k(r10);
        }
        jVar.f();
        jVar.k(i10);
        if (this.f22063g == -1) {
            this.f22063g = (long) i10;
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.f();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(d5.j r9) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.b(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = 0
            r4 = 0
        L_0x0008:
            v6.v r5 = r8.f22059c
            byte[] r5 = r5.f26518a
            r6 = 2
            r9.j(r5, r1, r6)
            v6.v r5 = r8.f22059c
            r5.D(r1)
            v6.v r5 = r8.f22059c
            int r5 = r5.x()
            boolean r5 = n5.f.g(r5)
            if (r5 != 0) goto L_0x0031
            r9.f()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002d
            return r1
        L_0x002d:
            r9.k(r3)
            goto L_0x0006
        L_0x0031:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003b
            return r5
        L_0x003b:
            v6.v r5 = r8.f22059c
            byte[] r5 = r5.f26518a
            r9.j(r5, r1, r6)
            d5.b0 r5 = r8.f22060d
            r6 = 14
            r5.p(r6)
            d5.b0 r5 = r8.f22060d
            r6 = 13
            int r5 = r5.i(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0055
            return r1
        L_0x0055:
            int r6 = r5 + -6
            r9.k(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.e.e(d5.j):boolean");
    }

    public int f(j jVar, w wVar) throws IOException {
        a.f(this.f22061e);
        jVar.b();
        int a10 = jVar.a(this.f22058b.f26518a, 0, 2048);
        boolean z10 = a10 == -1;
        if (!this.f22066j) {
            this.f22061e.b(new x.b(-9223372036854775807L, 0));
            this.f22066j = true;
        }
        if (z10) {
            return -1;
        }
        this.f22058b.D(0);
        this.f22058b.C(a10);
        if (!this.f22065i) {
            this.f22057a.f22096s = this.f22062f;
            this.f22065i = true;
        }
        this.f22057a.c(this.f22058b);
        return 0;
    }

    public void h(long j10, long j11) {
        this.f22065i = false;
        this.f22057a.a();
        this.f22062f = j11;
    }

    public void i(k kVar) {
        this.f22061e = kVar;
        this.f22057a.d(kVar, new e0.d(Integer.MIN_VALUE, 0, 1));
        kVar.d();
    }
}
