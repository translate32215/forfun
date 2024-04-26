package lf;

import md.d;
import od.c;
import od.e;

/* compiled from: KotlinExtensions.kt */
public final class s {

    @e(c = "retrofit2/KotlinExtensions", f = "KotlinExtensions.kt", l = {100, 102}, m = "yieldAndThrow")
    /* compiled from: KotlinExtensions.kt */
    public static final class a extends c {

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f21375d;

        /* renamed from: e  reason: collision with root package name */
        public int f21376e;

        /* renamed from: f  reason: collision with root package name */
        public Object f21377f;

        public a(d dVar) {
            super(dVar);
        }

        public final Object l(Object obj) {
            this.f21375d = obj;
            this.f21376e |= Integer.MIN_VALUE;
            s.a((Exception) null, this);
            return nd.a.COROUTINE_SUSPENDED;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.lang.Exception r8, md.d<?> r9) {
        /*
            boolean r0 = r9 instanceof lf.s.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            lf.s$a r0 = (lf.s.a) r0
            int r1 = r0.f21376e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f21376e = r1
            goto L_0x0018
        L_0x0013:
            lf.s$a r0 = new lf.s$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f21375d
            nd.a r1 = nd.a.COROUTINE_SUSPENDED
            int r2 = r0.f21376e
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r8 = r0.f21377f
            java.lang.Exception r8 = (java.lang.Exception) r8
            boolean r0 = r9 instanceof kd.h.a
            if (r0 == 0) goto L_0x00db
            kd.h$a r9 = (kd.h.a) r9
            java.lang.Throwable r8 = r9.f20616a
            throw r8
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            boolean r2 = r9 instanceof kd.h.a
            if (r2 != 0) goto L_0x00dc
            r0.f21377f = r8
            r0.f21376e = r3
            md.f r9 = r0.getContext()
            e.a.d(r9)
            md.d r2 = q.a.k(r0)
            boolean r4 = r2 instanceof ie.d
            r5 = 0
            if (r4 == 0) goto L_0x0053
            ie.d r2 = (ie.d) r2
            goto L_0x0054
        L_0x0053:
            r2 = r5
        L_0x0054:
            if (r2 != 0) goto L_0x005a
            kd.o r9 = kd.o.f20627a
            goto L_0x00cc
        L_0x005a:
            de.u r4 = r2.f19367d
            boolean r4 = r4.h0(r9)
            if (r4 == 0) goto L_0x006e
            kd.o r4 = kd.o.f20627a
            r2.f19369f = r4
            r2.f13280c = r3
            de.u r3 = r2.f19367d
            r3.g0(r9, r2)
            goto L_0x00cb
        L_0x006e:
            de.q1 r4 = new de.q1
            r4.<init>()
            md.f r9 = r9.plus(r4)
            kd.o r6 = kd.o.f20627a
            r2.f19369f = r6
            r2.f13280c = r3
            de.u r7 = r2.f19367d
            r7.g0(r9, r2)
            boolean r9 = r4.f13324a
            if (r9 == 0) goto L_0x00cb
            de.m1 r9 = de.m1.f13310a
            de.k0 r9 = de.m1.a()
            w6.c r4 = r9.f13296d
            if (r4 != 0) goto L_0x0091
            goto L_0x0097
        L_0x0091:
            int r7 = r4.f27028a
            int r4 = r4.f27029b
            if (r7 != r4) goto L_0x0099
        L_0x0097:
            r4 = 1
            goto L_0x009a
        L_0x0099:
            r4 = 0
        L_0x009a:
            if (r4 == 0) goto L_0x009d
            goto L_0x00bf
        L_0x009d:
            boolean r4 = r9.m0()
            if (r4 == 0) goto L_0x00ab
            r2.f19369f = r6
            r2.f13280c = r3
            r9.k0(r2)
            goto L_0x00c0
        L_0x00ab:
            r9.l0(r3)
            r2.run()     // Catch:{ all -> 0x00b8 }
        L_0x00b1:
            boolean r4 = r9.n0()     // Catch:{ all -> 0x00b8 }
            if (r4 != 0) goto L_0x00b1
            goto L_0x00bc
        L_0x00b8:
            r4 = move-exception
            r2.e(r4, r5)     // Catch:{ all -> 0x00c6 }
        L_0x00bc:
            r9.i0(r3)
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            if (r3 == 0) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            kd.o r9 = kd.o.f20627a
            goto L_0x00cc
        L_0x00c6:
            r8 = move-exception
            r9.i0(r3)
            throw r8
        L_0x00cb:
            r9 = r1
        L_0x00cc:
            if (r9 != r1) goto L_0x00d3
            java.lang.String r2 = "frame"
            ud.k.f(r0, r2)
        L_0x00d3:
            if (r9 != r1) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            kd.o r9 = kd.o.f20627a
        L_0x00d8:
            if (r9 != r1) goto L_0x00db
            return r1
        L_0x00db:
            throw r8
        L_0x00dc:
            kd.h$a r9 = (kd.h.a) r9
            java.lang.Throwable r8 = r9.f20616a
            goto L_0x00e2
        L_0x00e1:
            throw r8
        L_0x00e2:
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.s.a(java.lang.Exception, md.d):java.lang.Object");
    }
}
