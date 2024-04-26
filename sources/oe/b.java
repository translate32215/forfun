package oe;

import java.io.IOException;
import ke.t;
import ve.f;
import ve.j;
import ve.x;

/* compiled from: CallServerInterceptor */
public final class b implements t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23694a;

    /* compiled from: CallServerInterceptor */
    public static final class a extends j {

        /* renamed from: b  reason: collision with root package name */
        public long f23695b;

        public a(x xVar) {
            super(xVar);
        }

        public void m(f fVar, long j10) throws IOException {
            this.f26747a.m(fVar, j10);
            this.f23695b += j10;
        }
    }

    public b(boolean z10) {
        this.f23694a = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010d, code lost:
        if ("close".equalsIgnoreCase(r7) != false) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ke.d0 a(ke.t.a r11) throws java.io.IOException {
        /*
            r10 = this;
            oe.f r11 = (oe.f) r11
            oe.c r0 = r11.f23701c
            ne.f r1 = r11.f23700b
            ne.c r2 = r11.f23702d
            ke.z r3 = r11.f23704f
            long r4 = java.lang.System.currentTimeMillis()
            ke.n r6 = r11.f23706h
            r6.getClass()
            r0.e(r3)
            ke.n r6 = r11.f23706h
            r6.getClass()
            java.lang.String r6 = r3.f20881b
            boolean r6 = q.h.f(r6)
            r7 = 0
            if (r6 == 0) goto L_0x007c
            ke.c0 r6 = r3.f20883d
            if (r6 == 0) goto L_0x007c
            ke.r r6 = r3.f20882c
            java.lang.String r8 = "Expect"
            java.lang.String r6 = r6.c(r8)
            java.lang.String r8 = "100-continue"
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0046
            r0.d()
            ke.n r6 = r11.f23706h
            r6.getClass()
            r6 = 1
            ke.d0$a r6 = r0.f(r6)
            goto L_0x0047
        L_0x0046:
            r6 = r7
        L_0x0047:
            if (r6 != 0) goto L_0x0072
            ke.n r2 = r11.f23706h
            r2.getClass()
            ke.c0 r2 = r3.f20883d
            long r8 = r2.a()
            oe.b$a r2 = new oe.b$a
            ve.x r8 = r0.a(r3, r8)
            r2.<init>(r8)
            java.util.logging.Logger r8 = ve.p.f26761a
            ve.s r8 = new ve.s
            r8.<init>(r2)
            ke.c0 r2 = r3.f20883d
            r2.c(r8)
            r8.close()
            ke.n r2 = r11.f23706h
            r2.getClass()
            goto L_0x007d
        L_0x0072:
            boolean r2 = r2.h()
            if (r2 != 0) goto L_0x007d
            r1.f()
            goto L_0x007d
        L_0x007c:
            r6 = r7
        L_0x007d:
            r0.b()
            r2 = 0
            if (r6 != 0) goto L_0x008c
            ke.n r6 = r11.f23706h
            r6.getClass()
            ke.d0$a r6 = r0.f(r2)
        L_0x008c:
            r6.f20677a = r3
            ne.c r8 = r1.b()
            ke.q r8 = r8.f22498f
            r6.f20681e = r8
            r6.f20687k = r4
            long r8 = java.lang.System.currentTimeMillis()
            r6.f20688l = r8
            ke.d0 r6 = r6.a()
            int r8 = r6.f20666c
            r9 = 100
            if (r8 != r9) goto L_0x00c4
            ke.d0$a r2 = r0.f(r2)
            r2.f20677a = r3
            ne.c r3 = r1.b()
            ke.q r3 = r3.f22498f
            r2.f20681e = r3
            r2.f20687k = r4
            long r3 = java.lang.System.currentTimeMillis()
            r2.f20688l = r3
            ke.d0 r6 = r2.a()
            int r8 = r6.f20666c
        L_0x00c4:
            ke.n r11 = r11.f23706h
            r11.getClass()
            boolean r11 = r10.f23694a
            if (r11 == 0) goto L_0x00df
            r11 = 101(0x65, float:1.42E-43)
            if (r8 != r11) goto L_0x00df
            ke.d0$a r11 = new ke.d0$a
            r11.<init>(r6)
            ke.e0 r0 = le.c.f21263c
            r11.f20683g = r0
            ke.d0 r11 = r11.a()
            goto L_0x00ee
        L_0x00df:
            ke.d0$a r11 = new ke.d0$a
            r11.<init>(r6)
            ke.e0 r0 = r0.c(r6)
            r11.f20683g = r0
            ke.d0 r11 = r11.a()
        L_0x00ee:
            ke.z r0 = r11.f20664a
            ke.r r0 = r0.f20882c
            java.lang.String r2 = "Connection"
            java.lang.String r0 = r0.c(r2)
            java.lang.String r3 = "close"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x010f
            ke.r r0 = r11.f20669f
            java.lang.String r0 = r0.c(r2)
            if (r0 == 0) goto L_0x0109
            r7 = r0
        L_0x0109:
            boolean r0 = r3.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0112
        L_0x010f:
            r1.f()
        L_0x0112:
            r0 = 204(0xcc, float:2.86E-43)
            if (r8 == r0) goto L_0x011a
            r0 = 205(0xcd, float:2.87E-43)
            if (r8 != r0) goto L_0x0126
        L_0x011a:
            ke.e0 r0 = r11.f20670g
            long r0 = r0.a()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0127
        L_0x0126:
            return r11
        L_0x0127:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = " had non-zero Content-Length: "
            java.lang.StringBuilder r1 = androidx.appcompat.widget.y0.a(r1, r8, r2)
            ke.e0 r11 = r11.f20670g
            long r2 = r11.a()
            r1.append(r2)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.b.a(ke.t$a):ke.d0");
    }
}
