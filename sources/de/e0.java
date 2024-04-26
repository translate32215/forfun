package de;

import ie.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import md.d;
import md.f;

/* compiled from: Builders.common.kt */
public final class e0<T> extends r<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13279d = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public e0(f fVar, d<? super T> dVar) {
        super(fVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void U(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f13279d
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            md.d<T> r0 = r4.f19396c
            md.d r0 = q.a.k(r0)
            md.d<T> r1 = r4.f19396c
            java.lang.Object r5 = l0.e.j(r5, r1)
            r1 = 0
            ie.e.a(r0, r5, (td.l<? super java.lang.Throwable, kd.o>) null)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.e0.U(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object W() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f13279d
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            nd.a r0 = nd.a.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.y()
            java.lang.Object r0 = de.c1.a(r0)
            boolean r1 = r0 instanceof de.n
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            de.n r0 = (de.n) r0
            java.lang.Throwable r0 = r0.f13313a
            goto L_0x0037
        L_0x0036:
            throw r0
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: de.e0.W():java.lang.Object");
    }

    public void c(Object obj) {
        U(obj);
    }
}
