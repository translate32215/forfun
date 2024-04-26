package p5;

import a5.f;

/* compiled from: BatchBuffer */
public final class g extends f {

    /* renamed from: i  reason: collision with root package name */
    public long f23870i;

    /* renamed from: r  reason: collision with root package name */
    public int f23871r;

    /* renamed from: s  reason: collision with root package name */
    public int f23872s = 32;

    public g() {
        super(2);
    }

    public void t() {
        super.t();
        this.f23871r = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean y(a5.f r5) {
        /*
            r4 = this;
            boolean r0 = r5.x()
            r1 = 1
            r0 = r0 ^ r1
            v6.a.a(r0)
            boolean r0 = r5.o()
            r0 = r0 ^ r1
            v6.a.a(r0)
            boolean r0 = r5.r()
            r0 = r0 ^ r1
            v6.a.a(r0)
            boolean r0 = r4.z()
            r2 = 0
            if (r0 != 0) goto L_0x0022
        L_0x0020:
            r0 = 1
            goto L_0x004c
        L_0x0022:
            int r0 = r4.f23871r
            int r3 = r4.f23872s
            if (r0 < r3) goto L_0x002a
        L_0x0028:
            r0 = 0
            goto L_0x004c
        L_0x002a:
            boolean r0 = r5.q()
            boolean r3 = r4.q()
            if (r0 == r3) goto L_0x0035
            goto L_0x0028
        L_0x0035:
            java.nio.ByteBuffer r0 = r5.f86c
            if (r0 == 0) goto L_0x0020
            java.nio.ByteBuffer r3 = r4.f86c
            if (r3 == 0) goto L_0x0020
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L_0x0020
            goto L_0x0028
        L_0x004c:
            if (r0 != 0) goto L_0x004f
            return r2
        L_0x004f:
            int r0 = r4.f23871r
            int r2 = r0 + 1
            r4.f23871r = r2
            if (r0 != 0) goto L_0x0063
            long r2 = r5.f88e
            r4.f88e = r2
            boolean r0 = r5.s()
            if (r0 == 0) goto L_0x0063
            r4.f61a = r1
        L_0x0063:
            boolean r0 = r5.q()
            if (r0 == 0) goto L_0x006d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f61a = r0
        L_0x006d:
            java.nio.ByteBuffer r0 = r5.f86c
            if (r0 == 0) goto L_0x007d
            int r2 = r0.remaining()
            r4.v(r2)
            java.nio.ByteBuffer r2 = r4.f86c
            r2.put(r0)
        L_0x007d:
            long r2 = r5.f88e
            r4.f23870i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.g.y(a5.f):boolean");
    }

    public boolean z() {
        return this.f23871r > 0;
    }
}
