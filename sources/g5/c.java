package g5;

import d5.i;
import d5.j;
import d5.k;
import d5.x;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import v6.v;

/* compiled from: FlvExtractor */
public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final v f18476a = new v(4);

    /* renamed from: b  reason: collision with root package name */
    public final v f18477b = new v(9);

    /* renamed from: c  reason: collision with root package name */
    public final v f18478c = new v(11);

    /* renamed from: d  reason: collision with root package name */
    public final v f18479d = new v();

    /* renamed from: e  reason: collision with root package name */
    public final d f18480e = new d();

    /* renamed from: f  reason: collision with root package name */
    public k f18481f;

    /* renamed from: g  reason: collision with root package name */
    public int f18482g = 1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18483h;

    /* renamed from: i  reason: collision with root package name */
    public long f18484i;

    /* renamed from: j  reason: collision with root package name */
    public int f18485j;

    /* renamed from: k  reason: collision with root package name */
    public int f18486k;

    /* renamed from: l  reason: collision with root package name */
    public int f18487l;

    /* renamed from: m  reason: collision with root package name */
    public long f18488m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f18489n;

    /* renamed from: o  reason: collision with root package name */
    public a f18490o;

    /* renamed from: p  reason: collision with root package name */
    public f f18491p;

    static {
        b bVar = b.f18475a;
    }

    public void a() {
    }

    @RequiresNonNull({"extractorOutput"})
    public final void b() {
        if (!this.f18489n) {
            this.f18481f.b(new x.b(-9223372036854775807L, 0));
            this.f18489n = true;
        }
    }

    public final v c(j jVar) throws IOException {
        int i10 = this.f18487l;
        v vVar = this.f18479d;
        byte[] bArr = vVar.f26518a;
        if (i10 > bArr.length) {
            vVar.f26518a = new byte[Math.max(bArr.length * 2, i10)];
            vVar.f26520c = 0;
            vVar.f26519b = 0;
        } else {
            vVar.D(0);
        }
        this.f18479d.C(this.f18487l);
        jVar.readFully(this.f18479d.f26518a, 0, this.f18487l);
        return this.f18479d;
    }

    public boolean e(j jVar) throws IOException {
        jVar.j(this.f18476a.f26518a, 0, 3);
        this.f18476a.D(0);
        if (this.f18476a.u() != 4607062) {
            return false;
        }
        jVar.j(this.f18476a.f26518a, 0, 2);
        this.f18476a.D(0);
        if ((this.f18476a.x() & 250) != 0) {
            return false;
        }
        jVar.j(this.f18476a.f26518a, 0, 4);
        this.f18476a.D(0);
        int f10 = this.f18476a.f();
        jVar.f();
        jVar.k(f10);
        jVar.j(this.f18476a.f26518a, 0, 4);
        this.f18476a.D(0);
        if (this.f18476a.f() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0009 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(d5.j r17, d5.w r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            d5.k r2 = r0.f18481f
            v6.a.f(r2)
        L_0x0009:
            int r2 = r0.f18482g
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x010e
            r10 = 3
            if (r2 == r6) goto L_0x0103
            if (r2 == r10) goto L_0x00bb
            if (r2 != r7) goto L_0x00b5
            boolean r2 = r0.f18483h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.f18484i
            long r14 = r0.f18488m
            long r2 = r2 + r14
            goto L_0x0039
        L_0x002c:
            g5.d r2 = r0.f18480e
            long r2 = r2.f18492b
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0037
            r2 = 0
            goto L_0x0039
        L_0x0037:
            long r2 = r0.f18488m
        L_0x0039:
            int r14 = r0.f18486k
            if (r14 != r4) goto L_0x004f
            g5.a r4 = r0.f18490o
            if (r4 == 0) goto L_0x004f
            r16.b()
            g5.a r4 = r0.f18490o
            v6.v r5 = r16.c(r17)
            boolean r2 = r4.a(r5, r2)
            goto L_0x008d
        L_0x004f:
            if (r14 != r5) goto L_0x0063
            g5.f r4 = r0.f18491p
            if (r4 == 0) goto L_0x0063
            r16.b()
            g5.f r4 = r0.f18491p
            v6.v r5 = r16.c(r17)
            boolean r2 = r4.a(r5, r2)
            goto L_0x008d
        L_0x0063:
            r4 = 18
            if (r14 != r4) goto L_0x008f
            boolean r4 = r0.f18489n
            if (r4 != 0) goto L_0x008f
            g5.d r4 = r0.f18480e
            v6.v r5 = r16.c(r17)
            boolean r2 = r4.a(r5, r2)
            g5.d r3 = r0.f18480e
            long r4 = r3.f18492b
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x008d
            d5.k r14 = r0.f18481f
            d5.v r15 = new d5.v
            long[] r10 = r3.f18494d
            long[] r3 = r3.f18493c
            r15.<init>(r10, r3, r4)
            r14.b(r15)
            r0.f18489n = r9
        L_0x008d:
            r3 = 1
            goto L_0x0096
        L_0x008f:
            int r2 = r0.f18487l
            r1.g(r2)
            r2 = 0
            r3 = 0
        L_0x0096:
            boolean r4 = r0.f18483h
            if (r4 != 0) goto L_0x00ae
            if (r2 == 0) goto L_0x00ae
            r0.f18483h = r9
            g5.d r2 = r0.f18480e
            long r4 = r2.f18492b
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00aa
            long r4 = r0.f18488m
            long r10 = -r4
            goto L_0x00ac
        L_0x00aa:
            r10 = 0
        L_0x00ac:
            r0.f18484i = r10
        L_0x00ae:
            r0.f18485j = r7
            r0.f18482g = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00b5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00bb:
            v6.v r2 = r0.f18478c
            byte[] r2 = r2.f26518a
            r4 = 11
            boolean r2 = r1.d(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00c8
            goto L_0x0100
        L_0x00c8:
            v6.v r2 = r0.f18478c
            r2.D(r8)
            v6.v r2 = r0.f18478c
            int r2 = r2.s()
            r0.f18486k = r2
            v6.v r2 = r0.f18478c
            int r2 = r2.u()
            r0.f18487l = r2
            v6.v r2 = r0.f18478c
            int r2 = r2.u()
            long r4 = (long) r2
            r0.f18488m = r4
            v6.v r2 = r0.f18478c
            int r2 = r2.s()
            int r2 = r2 << 24
            long r4 = (long) r2
            long r11 = r0.f18488m
            long r4 = r4 | r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r11
            r0.f18488m = r4
            v6.v r2 = r0.f18478c
            r2.E(r10)
            r0.f18482g = r7
            r8 = 1
        L_0x0100:
            if (r8 != 0) goto L_0x0009
            return r3
        L_0x0103:
            int r2 = r0.f18485j
            r1.g(r2)
            r0.f18485j = r8
            r0.f18482g = r10
            goto L_0x0009
        L_0x010e:
            v6.v r2 = r0.f18477b
            byte[] r2 = r2.f26518a
            boolean r2 = r1.d(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x0119
            goto L_0x016d
        L_0x0119:
            v6.v r2 = r0.f18477b
            r2.D(r8)
            v6.v r2 = r0.f18477b
            r2.E(r7)
            v6.v r2 = r0.f18477b
            int r2 = r2.s()
            r10 = r2 & 4
            if (r10 == 0) goto L_0x012f
            r10 = 1
            goto L_0x0130
        L_0x012f:
            r10 = 0
        L_0x0130:
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0135
            r8 = 1
        L_0x0135:
            if (r10 == 0) goto L_0x0148
            g5.a r2 = r0.f18490o
            if (r2 != 0) goto L_0x0148
            g5.a r2 = new g5.a
            d5.k r10 = r0.f18481f
            d5.a0 r4 = r10.l(r4, r9)
            r2.<init>(r4)
            r0.f18490o = r2
        L_0x0148:
            if (r8 == 0) goto L_0x015b
            g5.f r2 = r0.f18491p
            if (r2 != 0) goto L_0x015b
            g5.f r2 = new g5.f
            d5.k r4 = r0.f18481f
            d5.a0 r4 = r4.l(r5, r6)
            r2.<init>(r4)
            r0.f18491p = r2
        L_0x015b:
            d5.k r2 = r0.f18481f
            r2.d()
            v6.v r2 = r0.f18477b
            int r2 = r2.f()
            int r2 = r2 - r5
            int r2 = r2 + r7
            r0.f18485j = r2
            r0.f18482g = r6
            r8 = 1
        L_0x016d:
            if (r8 != 0) goto L_0x0009
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.c.f(d5.j, d5.w):int");
    }

    public void h(long j10, long j11) {
        if (j10 == 0) {
            this.f18482g = 1;
            this.f18483h = false;
        } else {
            this.f18482g = 3;
        }
        this.f18485j = 0;
    }

    public void i(k kVar) {
        this.f18481f = kVar;
    }
}
