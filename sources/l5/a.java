package l5;

import d5.x;
import d5.y;
import v6.e0;

/* compiled from: DefaultOggSeeker */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final e f21040a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21041b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21042c;

    /* renamed from: d  reason: collision with root package name */
    public final h f21043d;

    /* renamed from: e  reason: collision with root package name */
    public int f21044e;

    /* renamed from: f  reason: collision with root package name */
    public long f21045f;

    /* renamed from: g  reason: collision with root package name */
    public long f21046g;

    /* renamed from: h  reason: collision with root package name */
    public long f21047h;

    /* renamed from: i  reason: collision with root package name */
    public long f21048i;

    /* renamed from: j  reason: collision with root package name */
    public long f21049j;

    /* renamed from: k  reason: collision with root package name */
    public long f21050k;

    /* renamed from: l  reason: collision with root package name */
    public long f21051l;

    /* compiled from: DefaultOggSeeker */
    public final class b implements x {
        public b(C0182a aVar) {
        }

        public boolean b() {
            return true;
        }

        public long c() {
            a aVar = a.this;
            return (aVar.f21045f * 1000000) / ((long) aVar.f21043d.f21084i);
        }

        public x.a j(long j10) {
            a aVar = a.this;
            long j11 = aVar.f21041b;
            long j12 = aVar.f21042c;
            return new x.a(new y(j10, e0.j(((((j12 - j11) * ((((long) aVar.f21043d.f21084i) * j10) / 1000000)) / aVar.f21045f) + j11) - 30000, j11, j12 - 1)));
        }
    }

    public a(h hVar, long j10, long j11, long j12, long j13, boolean z10) {
        v6.a.a(j10 >= 0 && j11 > j10);
        this.f21043d = hVar;
        this.f21041b = j10;
        this.f21042c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f21045f = j13;
            this.f21044e = 4;
        } else {
            this.f21044e = 0;
        }
        this.f21040a = new e();
    }

    public x a() {
        if (this.f21045f != 0) {
            return new b((C0182a) null);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(d5.j r23) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r0.f21044e
            r3 = 1
            r4 = 0
            r5 = 4
            r6 = -1
            if (r2 == 0) goto L_0x0102
            if (r2 == r3) goto L_0x0115
            r3 = 2
            r10 = 3
            if (r2 == r3) goto L_0x0021
            if (r2 == r10) goto L_0x001e
            if (r2 != r5) goto L_0x0018
            return r6
        L_0x0018:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x001e:
            r2 = r6
            goto L_0x00c7
        L_0x0021:
            long r2 = r0.f21048i
            long r11 = r0.f21049j
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x002c
        L_0x0029:
            r11 = r6
            goto L_0x00be
        L_0x002c:
            long r2 = r23.l()
            l5.e r11 = r0.f21040a
            long r12 = r0.f21049j
            boolean r11 = r11.c(r1, r12)
            if (r11 != 0) goto L_0x004a
            long r11 = r0.f21048i
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0042
            goto L_0x00be
        L_0x0042:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x004a:
            l5.e r11 = r0.f21040a
            r11.a(r1, r4)
            r23.f()
            long r11 = r0.f21047h
            l5.e r13 = r0.f21040a
            long r14 = r13.f21068b
            long r11 = r11 - r14
            int r8 = r13.f21070d
            int r9 = r13.f21071e
            int r8 = r8 + r9
            r16 = 0
            int r9 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x006c
            r18 = 72000(0x11940, double:3.55727E-319)
            int r9 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x006c
            goto L_0x0029
        L_0x006c:
            int r9 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r9 >= 0) goto L_0x0075
            r0.f21049j = r2
            r0.f21051l = r14
            goto L_0x0083
        L_0x0075:
            long r2 = r23.l()
            long r13 = (long) r8
            long r2 = r2 + r13
            r0.f21048i = r2
            l5.e r2 = r0.f21040a
            long r2 = r2.f21068b
            r0.f21050k = r2
        L_0x0083:
            long r2 = r0.f21049j
            long r13 = r0.f21048i
            long r2 = r2 - r13
            r18 = 100000(0x186a0, double:4.94066E-319)
            int r9 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x0093
            r0.f21049j = r13
            r11 = r13
            goto L_0x00be
        L_0x0093:
            long r2 = (long) r8
            r8 = 1
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 > 0) goto L_0x009d
            r13 = 2
            goto L_0x009e
        L_0x009d:
            r13 = r8
        L_0x009e:
            long r2 = r2 * r13
            long r13 = r23.l()
            long r13 = r13 - r2
            long r2 = r0.f21049j
            long r4 = r0.f21048i
            long r16 = r2 - r4
            long r16 = r16 * r11
            long r11 = r0.f21051l
            long r6 = r0.f21050k
            long r11 = r11 - r6
            long r16 = r16 / r11
            long r16 = r16 + r13
            long r20 = r2 - r8
            r18 = r4
            long r11 = v6.e0.j(r16, r18, r20)
        L_0x00be:
            r2 = -1
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00c5
            return r11
        L_0x00c5:
            r0.f21044e = r10
        L_0x00c7:
            l5.e r4 = r0.f21040a
            r4.c(r1, r2)
            l5.e r2 = r0.f21040a
            r3 = 0
            r2.a(r1, r3)
            l5.e r2 = r0.f21040a
            long r3 = r2.f21068b
            long r5 = r0.f21047h
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e9
            r23.f()
            r1 = 4
            r0.f21044e = r1
            long r1 = r0.f21050k
            r3 = 2
            long r1 = r1 + r3
            long r1 = -r1
            return r1
        L_0x00e9:
            r3 = 2
            int r5 = r2.f21070d
            int r2 = r2.f21071e
            int r5 = r5 + r2
            r1.g(r5)
            long r5 = r23.l()
            r0.f21048i = r5
            l5.e r2 = r0.f21040a
            long r5 = r2.f21068b
            r0.f21050k = r5
            r2 = -1
            goto L_0x00c7
        L_0x0102:
            long r4 = r23.l()
            r0.f21046g = r4
            r0.f21044e = r3
            long r2 = r0.f21042c
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r2 = r2 - r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0115
            return r2
        L_0x0115:
            l5.e r2 = r0.f21040a
            r2.b()
            l5.e r2 = r0.f21040a
            r3 = -1
            boolean r2 = r2.c(r1, r3)
            if (r2 == 0) goto L_0x015a
        L_0x0124:
            l5.e r2 = r0.f21040a
            r3 = 0
            r2.a(r1, r3)
            l5.e r2 = r0.f21040a
            int r4 = r2.f21070d
            int r2 = r2.f21071e
            int r4 = r4 + r2
            r1.g(r4)
            l5.e r2 = r0.f21040a
            int r4 = r2.f21067a
            r5 = 4
            r4 = r4 & r5
            if (r4 == r5) goto L_0x014e
            r4 = -1
            boolean r2 = r2.c(r1, r4)
            if (r2 == 0) goto L_0x014e
            long r6 = r23.l()
            long r8 = r0.f21042c
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0124
        L_0x014e:
            l5.e r1 = r0.f21040a
            long r1 = r1.f21068b
            r0.f21045f = r1
            r1 = 4
            r0.f21044e = r1
            long r1 = r0.f21046g
            return r1
        L_0x015a:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            goto L_0x0161
        L_0x0160:
            throw r1
        L_0x0161:
            goto L_0x0160
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.a.b(d5.j):long");
    }

    public void c(long j10) {
        this.f21047h = e0.j(j10, 0, this.f21045f - 1);
        this.f21044e = 2;
        this.f21048i = this.f21041b;
        this.f21049j = this.f21042c;
        this.f21050k = 0;
        this.f21051l = this.f21045f;
    }
}
