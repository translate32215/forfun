package de;

import ud.k;

/* compiled from: JobSupport.kt */
public abstract class a1 extends p implements h0, r0 {

    /* renamed from: d  reason: collision with root package name */
    public b1 f13256d;

    public boolean a() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r4 = this;
            de.b1 r0 = r4.r()
        L_0x0004:
            java.lang.Object r1 = r0.y()
            boolean r2 = r1 instanceof de.a1
            if (r2 == 0) goto L_0x001a
            if (r1 == r4) goto L_0x000f
            goto L_0x0029
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = de.b1.f13260a
            de.j0 r3 = de.c1.f13277g
            boolean r1 = r2.compareAndSet(r0, r1, r3)
            if (r1 == 0) goto L_0x0004
            goto L_0x0029
        L_0x001a:
            boolean r0 = r1 instanceof de.r0
            if (r0 == 0) goto L_0x0029
            de.r0 r1 = (de.r0) r1
            de.f1 r0 = r1.g()
            if (r0 == 0) goto L_0x0029
            r4.p()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.a1.f():void");
    }

    public f1 g() {
        return null;
    }

    public final b1 r() {
        b1 b1Var = this.f13256d;
        if (b1Var != null) {
            return b1Var;
        }
        k.l("job");
        throw null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.c(this) + "[job@" + a0.c(r()) + ']';
    }
}
