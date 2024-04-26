package com.google.android.gms.internal.ads;

import e8.ha0;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class mq extends lq<nq, nq> {
    public final /* synthetic */ void a(Object obj, int i10, long j10) {
        ((nq) obj).e(i10 << 3, Long.valueOf(j10));
    }

    public final /* synthetic */ void b(Object obj, int i10, mp mpVar) {
        ((nq) obj).e((i10 << 3) | 2, mpVar);
    }

    public final /* synthetic */ void c(Object obj, int i10, Object obj2) {
        ((nq) obj).e((i10 << 3) | 3, (nq) obj2);
    }

    public final /* synthetic */ void d(Object obj, ha0 ha0) throws IOException {
        ((nq) obj).b(ha0);
    }

    public final boolean e(rp rpVar) {
        return false;
    }

    public final void g(Object obj) {
        ((aq) obj).zziou.f7608e = false;
    }

    public final Object h(Object obj) {
        nq nqVar = (nq) obj;
        nqVar.f7608e = false;
        return nqVar;
    }

    public final /* synthetic */ int i(Object obj) {
        return ((nq) obj).c();
    }

    public final /* synthetic */ Object j(Object obj) {
        return ((aq) obj).zziou;
    }

    public final Object k(Object obj) {
        aq aqVar = (aq) obj;
        nq nqVar = aqVar.zziou;
        if (nqVar != nq.f7603f) {
            return nqVar;
        }
        nq d10 = nq.d();
        aqVar.zziou = d10;
        return d10;
    }

    public final /* synthetic */ void l(Object obj, int i10, long j10) {
        ((nq) obj).e((i10 << 3) | 1, Long.valueOf(j10));
    }

    public final int m(Object obj) {
        nq nqVar = (nq) obj;
        int i10 = nqVar.f7607d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < nqVar.f7604a; i12++) {
            int l10 = sp.l(2, nqVar.f7605b[i12] >>> 3);
            i11 += sp.v(3, (mp) nqVar.f7606c[i12]) + l10 + (sp.I(8) << 1);
        }
        nqVar.f7607d = i11;
        return i11;
    }

    public final /* synthetic */ Object n() {
        return nq.d();
    }

    public final /* synthetic */ void o(Object obj, int i10, int i11) {
        ((nq) obj).e((i10 << 3) | 5, Integer.valueOf(i11));
    }

    public final void p(Object obj, ha0 ha0) throws IOException {
        nq nqVar = (nq) obj;
        nqVar.getClass();
        ha0.getClass();
        for (int i10 = 0; i10 < nqVar.f7604a; i10++) {
            ((tp) ha0).f(nqVar.f7605b[i10] >>> 3, nqVar.f7606c[i10]);
        }
    }

    public final void q(Object obj, Object obj2) {
        ((aq) obj).zziou = (nq) obj2;
    }

    public final void r(Object obj, Object obj2) {
        ((aq) obj).zziou = (nq) obj2;
    }

    public final Object s(Object obj, Object obj2) {
        nq nqVar = (nq) obj;
        nq nqVar2 = (nq) obj2;
        if (nqVar2.equals(nq.f7603f)) {
            return nqVar;
        }
        int i10 = nqVar.f7604a + nqVar2.f7604a;
        int[] copyOf = Arrays.copyOf(nqVar.f7605b, i10);
        System.arraycopy(nqVar2.f7605b, 0, copyOf, nqVar.f7604a, nqVar2.f7604a);
        Object[] copyOf2 = Arrays.copyOf(nqVar.f7606c, i10);
        System.arraycopy(nqVar2.f7606c, 0, copyOf2, nqVar.f7604a, nqVar2.f7604a);
        return new nq(i10, copyOf, copyOf2, true);
    }
}
