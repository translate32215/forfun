package de;

import ie.r;
import ie.t;
import kd.g;
import l0.e;
import md.d;
import md.f;

/* compiled from: CoroutineContext.kt */
public final class o1<T> extends r<T> {

    /* renamed from: d  reason: collision with root package name */
    public ThreadLocal<g<f, Object>> f13320d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o1(md.f r3, md.d<? super T> r4) {
        /*
            r2 = this;
            de.p1 r0 = de.p1.f13321a
            md.f$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            md.f r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f13320d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.o1.<init>(md.f, md.d):void");
    }

    public void U(Object obj) {
        g gVar = this.f13320d.get();
        o1<?> o1Var = null;
        if (gVar != null) {
            t.a((f) gVar.f20614a, gVar.f20615b);
            this.f13320d.set(o1Var);
        }
        Object j10 = e.j(obj, this.f19396c);
        d<T> dVar = this.f19396c;
        f context = dVar.getContext();
        Object c10 = t.c(context, o1Var);
        if (c10 != t.f19398a) {
            o1Var = s.c(dVar, context, c10);
        }
        try {
            this.f19396c.g(j10);
        } finally {
            if (o1Var == null || o1Var.W()) {
                t.a(context, c10);
            }
        }
    }

    public final boolean W() {
        if (this.f13320d.get() == null) {
            return false;
        }
        this.f13320d.set((Object) null);
        return true;
    }
}
