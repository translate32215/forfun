package de;

import w6.c;

/* compiled from: EventLoop.common.kt */
public abstract class k0 extends u {

    /* renamed from: b  reason: collision with root package name */
    public long f13294b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13295c;

    /* renamed from: d  reason: collision with root package name */
    public c f13296d;

    public final void i0(boolean z10) {
        long j02 = this.f13294b - j0(z10);
        this.f13294b = j02;
        if (j02 <= 0 && this.f13295c) {
            shutdown();
        }
    }

    public final long j0(boolean z10) {
        return z10 ? 4294967296L : 1;
    }

    public final void k0(f0<?> f0Var) {
        c cVar = this.f13296d;
        if (cVar == null) {
            cVar = new c();
            this.f13296d = cVar;
        }
        Object[] objArr = (Object[]) cVar.f27030c;
        int i10 = cVar.f27029b;
        objArr[i10] = f0Var;
        int length = (objArr.length - 1) & (i10 + 1);
        cVar.f27029b = length;
        if (length == cVar.f27028a) {
            cVar.d();
        }
    }

    public final void l0(boolean z10) {
        this.f13294b = j0(z10) + this.f13294b;
        if (!z10) {
            this.f13295c = true;
        }
    }

    public final boolean m0() {
        return this.f13294b >= j0(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: de.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n0() {
        /*
            r7 = this;
            w6.c r0 = r7.f13296d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r0.f27028a
            int r3 = r0.f27029b
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000f
            goto L_0x0021
        L_0x000f:
            java.lang.Object r3 = r0.f27030c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r6 = r3[r2]
            r3[r2] = r4
            int r2 = r2 + r5
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f27028a = r2
            if (r6 == 0) goto L_0x002a
            r4 = r6
        L_0x0021:
            de.f0 r4 = (de.f0) r4
            if (r4 != 0) goto L_0x0026
            return r1
        L_0x0026:
            r4.run()
            return r5
        L_0x002a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.k0.n0():boolean");
    }

    public void shutdown() {
    }
}
