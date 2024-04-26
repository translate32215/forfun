package z5;

import z5.r;

public final /* synthetic */ class e implements r.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f28559a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f28560b;

    public /* synthetic */ e(f fVar, Object obj) {
        this.f28559a = fVar;
        this.f28560b = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(z5.r r11, x4.c1 r12) {
        /*
            r10 = this;
            z5.f r0 = r10.f28559a
            java.lang.Object r1 = r10.f28560b
            r0.getClass()
            r6 = r0
            z5.m r6 = (z5.m) r6
            java.lang.Void r1 = (java.lang.Void) r1
            boolean r0 = r6.f28614y
            if (r0 == 0) goto L_0x0028
            z5.m$a r0 = r6.f28611v
            z5.m$a r1 = new z5.m$a
            java.lang.Object r2 = r0.f28617c
            java.lang.Object r0 = r0.f28618d
            r1.<init>(r12, r2, r0)
            r6.f28611v = r1
            z5.l r0 = r6.f28612w
            if (r0 == 0) goto L_0x00cd
            long r0 = r0.f28606g
            r6.z(r0)
            goto L_0x00cd
        L_0x0028:
            boolean r0 = r12.q()
            if (r0 == 0) goto L_0x004c
            boolean r0 = r6.f28615z
            if (r0 == 0) goto L_0x003e
            z5.m$a r0 = r6.f28611v
            z5.m$a r1 = new z5.m$a
            java.lang.Object r2 = r0.f28617c
            java.lang.Object r0 = r0.f28618d
            r1.<init>(r12, r2, r0)
            goto L_0x0048
        L_0x003e:
            java.lang.Object r0 = x4.c1.c.f27468r
            java.lang.Object r1 = z5.m.a.f28616e
            z5.m$a r2 = new z5.m$a
            r2.<init>(r12, r0, r1)
            r1 = r2
        L_0x0048:
            r6.f28611v = r1
            goto L_0x00cd
        L_0x004c:
            x4.c1$c r0 = r6.f28609t
            r1 = 0
            r12.n(r1, r0)
            x4.c1$c r0 = r6.f28609t
            long r2 = r0.f27484o
            java.lang.Object r7 = r0.f27470a
            z5.l r0 = r6.f28612w
            if (r0 == 0) goto L_0x007e
            long r4 = r0.f28601b
            z5.m$a r8 = r6.f28611v
            z5.r$a r0 = r0.f28600a
            java.lang.Object r0 = r0.f28627a
            x4.c1$b r9 = r6.f28610u
            r8.h(r0, r9)
            x4.c1$b r0 = r6.f28610u
            long r8 = r0.f27466e
            long r8 = r8 + r4
            z5.m$a r0 = r6.f28611v
            x4.c1$c r4 = r6.f28609t
            x4.c1$c r0 = r0.n(r1, r4)
            long r0 = r0.f27484o
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x007e
            r4 = r8
            goto L_0x007f
        L_0x007e:
            r4 = r2
        L_0x007f:
            x4.c1$c r1 = r6.f28609t
            x4.c1$b r2 = r6.f28610u
            r3 = 0
            r0 = r12
            android.util.Pair r0 = r0.j(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r6.f28615z
            if (r0 == 0) goto L_0x00a3
            z5.m$a r0 = r6.f28611v
            z5.m$a r1 = new z5.m$a
            java.lang.Object r4 = r0.f28617c
            java.lang.Object r0 = r0.f28618d
            r1.<init>(r12, r4, r0)
            goto L_0x00a9
        L_0x00a3:
            z5.m$a r0 = new z5.m$a
            r0.<init>(r12, r7, r1)
            r1 = r0
        L_0x00a9:
            r6.f28611v = r1
            z5.l r0 = r6.f28612w
            if (r0 == 0) goto L_0x00cd
            r6.z(r2)
            z5.r$a r0 = r0.f28600a
            java.lang.Object r1 = r0.f28627a
            z5.m$a r2 = r6.f28611v
            java.lang.Object r2 = r2.f28618d
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r2 = z5.m.a.f28616e
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00c8
            z5.m$a r1 = r6.f28611v
            java.lang.Object r1 = r1.f28618d
        L_0x00c8:
            z5.r$a r0 = r0.b(r1)
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            r1 = 1
            r6.f28615z = r1
            r6.f28614y = r1
            z5.m$a r1 = r6.f28611v
            r6.v(r1)
            if (r0 == 0) goto L_0x00e2
            z5.l r1 = r6.f28612w
            r1.getClass()
            r1.b(r0)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.e.a(z5.r, x4.c1):void");
    }
}
