package com.google.android.gms.internal.ads;

import e8.f80;
import e8.h80;
import e8.ha0;
import e8.q70;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class fq<T> implements iq<T> {

    /* renamed from: a  reason: collision with root package name */
    public final cq f6474a;

    /* renamed from: b  reason: collision with root package name */
    public final lq<?, ?> f6475b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6476c;

    /* renamed from: d  reason: collision with root package name */
    public final vp<?> f6477d;

    public fq(lq<?, ?> lqVar, vp<?> vpVar, cq cqVar) {
        this.f6475b = lqVar;
        this.f6476c = vpVar.j(cqVar);
        this.f6477d = vpVar;
        this.f6474a = cqVar;
    }

    public final void c(T t10, T t11) {
        lq<?, ?> lqVar = this.f6475b;
        Class<?> cls = kq.f7265a;
        lqVar.q(t10, lqVar.s(lqVar.j(t10), lqVar.j(t11)));
        if (this.f6476c) {
            kq.f(this.f6477d, t10, t11);
        }
    }

    public final void d(T t10, ha0 ha0) throws IOException {
        Iterator<Map.Entry<?, Object>> b10 = this.f6477d.g(t10).b();
        while (b10.hasNext()) {
            Map.Entry next = b10.next();
            q70 q70 = (q70) next.getKey();
            if (q70.l() != vq.MESSAGE || q70.n() || q70.h()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof h80) {
                ((tp) ha0).f(q70.g(), ((h80) next).f14880a.getValue().a());
            } else {
                ((tp) ha0).f(q70.g(), next.getValue());
            }
        }
        lq<?, ?> lqVar = this.f6475b;
        lqVar.p(lqVar.j(t10), ha0);
    }

    public final boolean e(T t10) {
        return this.f6477d.g(t10).a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.google.android.gms.internal.ads.aq$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(T r10, byte[] r11, int r12, int r13, e8.ft r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.aq r0 = (com.google.android.gms.internal.ads.aq) r0
            com.google.android.gms.internal.ads.nq r1 = r0.zziou
            com.google.android.gms.internal.ads.nq r2 = com.google.android.gms.internal.ads.nq.f7603f
            if (r1 != r2) goto L_0x000f
            com.google.android.gms.internal.ads.nq r1 = com.google.android.gms.internal.ads.nq.d()
            r0.zziou = r1
        L_0x000f:
            com.google.android.gms.internal.ads.aq$d r10 = (com.google.android.gms.internal.ads.aq.d) r10
            r10.y()
            r10 = 0
            r0 = r10
        L_0x0016:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.ads.lp.h(r11, r12, r14)
            int r2 = r14.f14681d
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0050
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004b
            com.google.android.gms.internal.ads.vp<?> r12 = r9.f6477d
            java.lang.Object r0 = r14.f14680c
            com.google.android.gms.internal.ads.up r0 = (com.google.android.gms.internal.ads.up) r0
            com.google.android.gms.internal.ads.cq r3 = r9.f6474a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.aq$f r0 = (com.google.android.gms.internal.ads.aq.f) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.lp.a(r2, r3, r4, r5, r6, r7)
            goto L_0x0016
        L_0x0043:
            e8.j90 r10 = e8.j90.f15105c
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004b:
            int r12 = com.google.android.gms.internal.ads.lp.b(r2, r11, r4, r13, r14)
            goto L_0x0016
        L_0x0050:
            r12 = 0
            r2 = r10
        L_0x0052:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.ads.lp.h(r11, r4, r14)
            int r5 = r14.f14681d
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x0079
            r8 = 3
            if (r6 == r8) goto L_0x0064
            goto L_0x0090
        L_0x0064:
            if (r0 != 0) goto L_0x0071
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.ads.lp.m(r11, r4, r14)
            java.lang.Object r2 = r14.f14679b
            com.google.android.gms.internal.ads.mp r2 = (com.google.android.gms.internal.ads.mp) r2
            goto L_0x0052
        L_0x0071:
            e8.j90 r10 = e8.j90.f15105c
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x0079:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.ads.lp.h(r11, r4, r14)
            int r12 = r14.f14681d
            com.google.android.gms.internal.ads.vp<?> r0 = r9.f6477d
            java.lang.Object r5 = r14.f14680c
            com.google.android.gms.internal.ads.up r5 = (com.google.android.gms.internal.ads.up) r5
            com.google.android.gms.internal.ads.cq r6 = r9.f6474a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.ads.aq$f r0 = (com.google.android.gms.internal.ads.aq.f) r0
            goto L_0x0052
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.ads.lp.b(r5, r11, r4, r13, r14)
            goto L_0x0052
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.e(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0016
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            e8.f80 r10 = e8.f80.g()
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fq.f(java.lang.Object, byte[], int, int, e8.ft):void");
    }

    public final void g(T t10) {
        this.f6475b.g(t10);
        this.f6477d.i(t10);
    }

    public final void h(T t10, rp rpVar, up upVar) throws IOException {
        boolean z10;
        lq<?, ?> lqVar = this.f6475b;
        vp<?> vpVar = this.f6477d;
        Object k10 = lqVar.k(t10);
        xp<?> h10 = vpVar.h(t10);
        do {
            try {
                if (rpVar.A() == Integer.MAX_VALUE) {
                    lqVar.r(t10, k10);
                    return;
                }
                int i10 = rpVar.f8047b;
                if (i10 == 11) {
                    int i11 = 0;
                    Object obj = null;
                    mp mpVar = null;
                    while (rpVar.A() != Integer.MAX_VALUE) {
                        int i12 = rpVar.f8047b;
                        if (i12 == 16) {
                            i11 = rpVar.u();
                            obj = vpVar.c(upVar, this.f6474a, i11);
                        } else if (i12 == 26) {
                            if (obj != null) {
                                vpVar.e(rpVar, obj, upVar, h10);
                            } else {
                                mpVar = rpVar.t();
                            }
                        } else if (!rpVar.B()) {
                            break;
                        }
                    }
                    if (rpVar.f8047b != 12) {
                        throw f80.e();
                    } else if (mpVar != null) {
                        if (obj != null) {
                            vpVar.d(mpVar, obj, upVar, h10);
                        } else {
                            lqVar.b(k10, i11, mpVar);
                        }
                    }
                } else if ((i10 & 7) == 2) {
                    Object c10 = vpVar.c(upVar, this.f6474a, i10 >>> 3);
                    if (c10 != null) {
                        vpVar.e(rpVar, c10, upVar, h10);
                    } else {
                        z10 = lqVar.f(k10, rpVar);
                        continue;
                    }
                } else {
                    z10 = rpVar.B();
                    continue;
                }
                z10 = true;
                continue;
            } finally {
                lqVar.r(t10, k10);
            }
        } while (z10);
    }

    public final int i(T t10) {
        lq<?, ?> lqVar = this.f6475b;
        int m10 = lqVar.m(lqVar.j(t10)) + 0;
        if (!this.f6476c) {
            return m10;
        }
        xp<?> g10 = this.f6477d.g(t10);
        int i10 = 0;
        for (int i11 = 0; i11 < g10.f8565a.d(); i11++) {
            i10 += xp.m(g10.f8565a.h(i11));
        }
        for (Map.Entry<T, Object> m11 : g10.f8565a.e()) {
            i10 += xp.m(m11);
        }
        return m10 + i10;
    }

    public final boolean j(T t10, T t11) {
        if (!this.f6475b.j(t10).equals(this.f6475b.j(t11))) {
            return false;
        }
        if (this.f6476c) {
            return this.f6477d.g(t10).equals(this.f6477d.g(t11));
        }
        return true;
    }

    public final T k() {
        return this.f6474a.b().h();
    }

    public final int l(T t10) {
        int hashCode = this.f6475b.j(t10).hashCode();
        return this.f6476c ? (hashCode * 53) + this.f6477d.g(t10).hashCode() : hashCode;
    }
}
