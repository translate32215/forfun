package de;

import androidx.activity.j;
import de.w0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd.h;
import kd.o;
import md.f;
import o.a;
import od.d;
import td.l;
import ud.k;

/* compiled from: CancellableContinuationImpl.kt */
public class g<T> extends f0<T> implements f<T>, d {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13281g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_decision");

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13282h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = b.f13257a;

    /* renamed from: d  reason: collision with root package name */
    public final md.d<T> f13283d;

    /* renamed from: e  reason: collision with root package name */
    public final f f13284e;

    /* renamed from: f  reason: collision with root package name */
    public h0 f13285f;

    public g(md.d<? super T> dVar, int i10) {
        super(i10);
        this.f13283d = dVar;
        this.f13284e = dVar.getContext();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: de.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: de.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void x(de.g r8, java.lang.Object r9, int r10, td.l r11, int r12, java.lang.Object r13) {
        /*
            r11 = 0
        L_0x0001:
            r3 = 0
            java.lang.Object r12 = r8._state
            boolean r13 = r12 instanceof de.h1
            if (r13 == 0) goto L_0x0041
            r13 = r12
            de.h1 r13 = (de.h1) r13
            boolean r0 = r9 instanceof de.n
            if (r0 == 0) goto L_0x0010
            goto L_0x0030
        L_0x0010:
            boolean r0 = androidx.activity.j.a(r10)
            if (r0 != 0) goto L_0x0017
            goto L_0x0030
        L_0x0017:
            boolean r0 = r13 instanceof de.d
            if (r0 == 0) goto L_0x0030
            de.m r7 = new de.m
            boolean r0 = r13 instanceof de.d
            if (r0 == 0) goto L_0x0025
            de.d r13 = (de.d) r13
            r2 = r13
            goto L_0x0026
        L_0x0025:
            r2 = r11
        L_0x0026:
            r5 = 0
            r6 = 16
            r4 = 0
            r0 = r7
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x0031
        L_0x0030:
            r7 = r9
        L_0x0031:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = f13282h
            boolean r12 = r13.compareAndSet(r8, r12, r7)
            if (r12 != 0) goto L_0x003a
            goto L_0x0001
        L_0x003a:
            r8.p()
            r8.q(r10)
            goto L_0x0054
        L_0x0041:
            boolean r8 = r12 instanceof de.h
            if (r8 == 0) goto L_0x0055
            de.h r12 = (de.h) r12
            r12.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = de.h.f13289c
            r10 = 0
            r11 = 1
            boolean r8 = r8.compareAndSet(r12, r10, r11)
            if (r8 == 0) goto L_0x0055
        L_0x0054:
            return
        L_0x0055:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r10 = "Already resumed, but proposed with update "
            java.lang.String r9 = ud.k.j(r10, r9)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            goto L_0x0066
        L_0x0065:
            throw r8
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: de.g.x(de.g, java.lang.Object, int, td.l, int, java.lang.Object):void");
    }

    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof h1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof n)) {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    if (!(mVar.f13309e != null)) {
                        if (f13282h.compareAndSet(this, obj2, m.a(mVar, (Object) null, (d) null, (l) null, (Object) null, th, 15))) {
                            d dVar = mVar.f13306b;
                            if (dVar != null) {
                                i(dVar, th);
                            }
                            l<Throwable, o> lVar = mVar.f13307c;
                            if (lVar != null) {
                                m(lVar, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (f13282h.compareAndSet(this, obj2, new m(obj2, (d) null, (l) null, (Object) null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final md.d<T> b() {
        return this.f13283d;
    }

    public Throwable c(Object obj) {
        Throwable c10 = super.c(obj);
        if (c10 == null) {
            return null;
        }
        return c10;
    }

    public <T> T d(Object obj) {
        return obj instanceof m ? ((m) obj).f13305a : obj;
    }

    public d f() {
        md.d<T> dVar = this.f13283d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public void g(Object obj) {
        Throwable a10 = h.a(obj);
        if (a10 != null) {
            obj = new n(a10, false, 2);
        }
        x(this, obj, this.f13280c, (l) null, 4, (Object) null);
    }

    public f getContext() {
        return this.f13284e;
    }

    public Object h() {
        return this._state;
    }

    public final void i(d dVar, Throwable th) {
        try {
            dVar.a(th);
        } catch (Throwable th2) {
            a.g(this.f13284e, new q(k.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public void j(l<? super Throwable, o> lVar) {
        d t0Var = lVar instanceof d ? (d) lVar : new t0(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof b)) {
                Throwable th = null;
                if (!(obj instanceof d)) {
                    boolean z10 = obj instanceof n;
                    boolean z11 = true;
                    if (z10) {
                        n nVar = (n) obj;
                        nVar.getClass();
                        if (!n.f13312b.compareAndSet(nVar, 0, 1)) {
                            v(lVar, obj);
                            throw null;
                        } else if (obj instanceof h) {
                            if (!z10) {
                                nVar = null;
                            }
                            if (nVar != null) {
                                th = nVar.f13313a;
                            }
                            l(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof m) {
                        m mVar = (m) obj;
                        if (mVar.f13306b == null) {
                            Throwable th2 = mVar.f13309e;
                            if (th2 == null) {
                                z11 = false;
                            }
                            if (z11) {
                                l(lVar, th2);
                                return;
                            } else {
                                if (f13282h.compareAndSet(this, obj, m.a(mVar, (Object) null, t0Var, (l) null, (Object) null, (Throwable) null, 29))) {
                                    return;
                                }
                            }
                        } else {
                            v(lVar, obj);
                            throw null;
                        }
                    } else {
                        if (f13282h.compareAndSet(this, obj, new m(obj, t0Var, (l) null, (Object) null, (Throwable) null, 28))) {
                            return;
                        }
                    }
                } else {
                    v(lVar, obj);
                    throw null;
                }
            } else if (f13282h.compareAndSet(this, obj, t0Var)) {
                return;
            }
        }
    }

    public void k(u uVar, T t10) {
        md.d<T> dVar = this.f13283d;
        u uVar2 = null;
        ie.d dVar2 = dVar instanceof ie.d ? (ie.d) dVar : null;
        if (dVar2 != null) {
            uVar2 = dVar2.f19367d;
        }
        x(this, t10, uVar2 == uVar ? 4 : this.f13280c, (l) null, 4, (Object) null);
    }

    public final void l(l<? super Throwable, o> lVar, Throwable th) {
        try {
            lVar.c(th);
        } catch (Throwable th2) {
            a.g(this.f13284e, new q(k.j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void m(l<? super Throwable, o> lVar, Throwable th) {
        try {
            lVar.c(th);
        } catch (Throwable th2) {
            a.g(this.f13284e, new q(k.j("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public boolean n(Throwable th) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof h1)) {
                return false;
            }
            z10 = obj instanceof d;
        } while (!f13282h.compareAndSet(this, obj, new h(this, th, z10)));
        d dVar = z10 ? (d) obj : null;
        if (dVar != null) {
            i(dVar, th);
        }
        p();
        q(this.f13280c);
        return true;
    }

    public final void o() {
        h0 h0Var = this.f13285f;
        if (h0Var != null) {
            h0Var.f();
            this.f13285f = g1.f13288a;
        }
    }

    public final void p() {
        if (!u()) {
            o();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            r0 = 0
            goto L_0x0020
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f13281g
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r0 = 1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            md.d r0 = r4.b()
            r3 = 4
            if (r5 != r3) goto L_0x002b
            r1 = 1
        L_0x002b:
            if (r1 != 0) goto L_0x007f
            boolean r3 = r0 instanceof ie.d
            if (r3 == 0) goto L_0x007f
            boolean r5 = androidx.activity.j.a(r5)
            int r3 = r4.f13280c
            boolean r3 = androidx.activity.j.a(r3)
            if (r5 != r3) goto L_0x007f
            r5 = r0
            ie.d r5 = (ie.d) r5
            de.u r5 = r5.f19367d
            md.f r0 = r0.getContext()
            boolean r1 = r5.h0(r0)
            if (r1 == 0) goto L_0x0050
            r5.f0(r0, r4)
            goto L_0x0082
        L_0x0050:
            de.m1 r5 = de.m1.f13310a
            de.k0 r5 = de.m1.a()
            boolean r0 = r5.m0()
            if (r0 == 0) goto L_0x0060
            r5.k0(r4)
            goto L_0x0082
        L_0x0060:
            r5.l0(r2)
            md.d r0 = r4.b()     // Catch:{ all -> 0x0071 }
            androidx.activity.j.b(r4, r0, r2)     // Catch:{ all -> 0x0071 }
        L_0x006a:
            boolean r0 = r5.n0()     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x006a
            goto L_0x0076
        L_0x0071:
            r0 = move-exception
            r1 = 0
            r4.e(r0, r1)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r5.i0(r2)
            goto L_0x0082
        L_0x007a:
            r0 = move-exception
            r5.i0(r2)
            throw r0
        L_0x007f:
            androidx.activity.j.b(r4, r0, r1)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.g.q(int):void");
    }

    public final Object r() {
        boolean z10;
        boolean u10 = u();
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 == 0) {
                if (f13281g.compareAndSet(this, 0, 1)) {
                    z10 = true;
                    break;
                }
            } else if (i10 != 2) {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z10) {
            if (this.f13285f == null) {
                t();
            }
            if (u10) {
                w();
            }
            return nd.a.COROUTINE_SUSPENDED;
        }
        if (u10) {
            w();
        }
        Object obj = this._state;
        if (!(obj instanceof n)) {
            if (j.a(this.f13280c)) {
                f fVar = this.f13284e;
                int i11 = w0.f13338l;
                w0 w0Var = (w0) fVar.get(w0.b.f13339a);
                if (w0Var != null && !w0Var.a()) {
                    CancellationException N = w0Var.N();
                    a(obj, N);
                    throw N;
                }
            }
            return d(obj);
        }
        throw ((n) obj).f13313a;
    }

    public void s() {
        h0 t10 = t();
        if (t10 != null && (!(this._state instanceof h1))) {
            t10.f();
            this.f13285f = g1.f13288a;
        }
    }

    public final h0 t() {
        f fVar = this.f13284e;
        int i10 = w0.f13338l;
        w0 w0Var = (w0) fVar.get(w0.b.f13339a);
        if (w0Var == null) {
            return null;
        }
        h0 a10 = w0.a.a(w0Var, true, false, new i(this), 2, (Object) null);
        this.f13285f = a10;
        return a10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CancellableContinuation");
        sb2.append('(');
        sb2.append(a0.d(this.f13283d));
        sb2.append("){");
        Object obj = this._state;
        if (obj instanceof h1) {
            str = "Active";
        } else {
            str = obj instanceof h ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(a0.c(this));
        return sb2.toString();
    }

    public final boolean u() {
        return (this.f13280c == 2) && ((ie.d) this.f13283d).i();
    }

    public final void v(l<? super Throwable, o> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public final void w() {
        md.d<T> dVar = this.f13283d;
        Throwable th = null;
        ie.d dVar2 = dVar instanceof ie.d ? (ie.d) dVar : null;
        if (dVar2 != null) {
            th = dVar2.n(this);
        }
        if (th != null) {
            o();
            n(th);
        }
    }
}
