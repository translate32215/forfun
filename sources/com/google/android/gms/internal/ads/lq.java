package com.google.android.gms.internal.ads;

import e8.ha0;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class lq<T, B> {
    public abstract void a(B b10, int i10, long j10);

    public abstract void b(B b10, int i10, mp mpVar);

    public abstract void c(B b10, int i10, T t10);

    public abstract void d(T t10, ha0 ha0) throws IOException;

    public abstract boolean e(rp rpVar);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[LOOP:0: B:16:0x002d->B:19:0x003a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(B r7, com.google.android.gms.internal.ads.rp r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.f8047b
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 == r2) goto L_0x0055
            r3 = 2
            if (r0 == r3) goto L_0x004d
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0026
            if (r0 == r3) goto L_0x0024
            r3 = 5
            if (r0 != r3) goto L_0x001f
            int r8 = r8.q()
            r6.o(r7, r1, r8)
            return r2
        L_0x001f:
            e8.e80 r7 = e8.f80.f()
            throw r7
        L_0x0024:
            r7 = 0
            return r7
        L_0x0026:
            java.lang.Object r0 = r6.n()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002d:
            int r4 = r8.A()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003c
            boolean r4 = r6.f(r0, r8)
            if (r4 != 0) goto L_0x002d
        L_0x003c:
            int r8 = r8.f8047b
            if (r3 != r8) goto L_0x0048
            java.lang.Object r8 = r6.h(r0)
            r6.c(r7, r1, r8)
            return r2
        L_0x0048:
            e8.f80 r7 = e8.f80.e()
            throw r7
        L_0x004d:
            com.google.android.gms.internal.ads.mp r8 = r8.t()
            r6.b(r7, r1, r8)
            return r2
        L_0x0055:
            long r3 = r8.p()
            r6.l(r7, r1, r3)
            return r2
        L_0x005d:
            long r3 = r8.n()
            r6.a(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lq.f(java.lang.Object, com.google.android.gms.internal.ads.rp):boolean");
    }

    public abstract void g(Object obj);

    public abstract T h(B b10);

    public abstract int i(T t10);

    public abstract T j(Object obj);

    public abstract B k(Object obj);

    public abstract void l(B b10, int i10, long j10);

    public abstract int m(T t10);

    public abstract B n();

    public abstract void o(B b10, int i10, int i11);

    public abstract void p(T t10, ha0 ha0) throws IOException;

    public abstract void q(Object obj, T t10);

    public abstract void r(Object obj, B b10);

    public abstract T s(T t10, T t11);
}
