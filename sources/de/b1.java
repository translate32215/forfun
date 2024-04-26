package de;

import de.w0;
import e.j;
import ie.h;
import ie.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd.o;
import md.f;
import td.p;
import ud.k;

/* compiled from: JobSupport.kt */
public class b1 implements w0, l, i1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13260a = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    public static final class a extends a1 {

        /* renamed from: e  reason: collision with root package name */
        public final b1 f13261e;

        /* renamed from: f  reason: collision with root package name */
        public final b f13262f;

        /* renamed from: g  reason: collision with root package name */
        public final k f13263g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f13264h;

        public a(b1 b1Var, b bVar, k kVar, Object obj) {
            this.f13261e = b1Var;
            this.f13262f = bVar;
            this.f13263g = kVar;
            this.f13264h = obj;
        }

        public /* bridge */ /* synthetic */ Object c(Object obj) {
            q((Throwable) obj);
            return o.f20627a;
        }

        public void q(Throwable th) {
            b1 b1Var = this.f13261e;
            b bVar = this.f13262f;
            k kVar = this.f13263g;
            Object obj = this.f13264h;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.f13260a;
            k F = b1Var.F(kVar);
            if (F == null || !b1Var.S(bVar, F, obj)) {
                b1Var.c(b1Var.p(bVar, obj));
            }
        }
    }

    /* compiled from: JobSupport.kt */
    public static final class b implements r0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a  reason: collision with root package name */
        public final f1 f13265a;

        public b(f1 f1Var, boolean z10, Throwable th) {
            this.f13265a = f1Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        public boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> c10 = c();
                        c10.add(obj);
                        c10.add(th);
                        this._exceptionsHolder = c10;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(k.j("State is ", obj).toString());
                }
            }
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean f() {
            return this._isCompleting;
        }

        public f1 g() {
            return this.f13265a;
        }

        public final boolean h() {
            return this._exceptionsHolder == c1.f13275e;
        }

        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(obj);
                arrayList = c10;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(k.j("State is ", obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !k.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = c1.f13275e;
            return arrayList;
        }

        public final void j(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Finishing[cancelling=");
            a10.append(e());
            a10.append(", completing=");
            a10.append(f());
            a10.append(", rootCause=");
            a10.append((Throwable) this._rootCause);
            a10.append(", exceptions=");
            a10.append(this._exceptionsHolder);
            a10.append(", list=");
            a10.append(this.f13265a);
            a10.append(']');
            return a10.toString();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class c extends i.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b1 f13266d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f13267e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar, b1 b1Var, Object obj) {
            super(iVar);
            this.f13266d = b1Var;
            this.f13267e = obj;
        }

        public Object c(Object obj) {
            i iVar = (i) obj;
            if (this.f13266d.y() == this.f13267e) {
                return null;
            }
            return h.f19378a;
        }
    }

    public b1(boolean z10) {
        this._state = z10 ? c1.f13277g : c1.f13276f;
        this._parentHandle = null;
    }

    public void A(Throwable th) {
        throw th;
    }

    public final void B(w0 w0Var) {
        if (w0Var == null) {
            this._parentHandle = g1.f13288a;
            return;
        }
        w0Var.start();
        j t10 = w0Var.t(this);
        this._parentHandle = t10;
        if (!(y() instanceof r0)) {
            t10.f();
            this._parentHandle = g1.f13288a;
        }
    }

    public boolean C() {
        return false;
    }

    public final Object D(Object obj) {
        Object R;
        do {
            R = R(y(), obj);
            if (R == c1.f13271a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                n nVar = obj instanceof n ? (n) obj : null;
                if (nVar != null) {
                    th = nVar.f13313a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (R == c1.f13273c);
        return R;
    }

    public String E() {
        return getClass().getSimpleName();
    }

    public final k F(i iVar) {
        while (iVar.o()) {
            iVar = iVar.n();
        }
        while (true) {
            iVar = iVar.m();
            if (!iVar.o()) {
                if (iVar instanceof k) {
                    return (k) iVar;
                }
                if (iVar instanceof f1) {
                    return null;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [de.q0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final de.h0 G(boolean r8, boolean r9, td.l<? super java.lang.Throwable, kd.o> r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0014
            boolean r1 = r10 instanceof de.y0
            if (r1 == 0) goto L_0x000b
            r1 = r10
            de.y0 r1 = (de.y0) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0027
            de.u0 r1 = new de.u0
            r1.<init>(r10)
            goto L_0x0027
        L_0x0014:
            boolean r1 = r10 instanceof de.a1
            if (r1 == 0) goto L_0x001c
            r1 = r10
            de.a1 r1 = (de.a1) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 != 0) goto L_0x0020
            r1 = r0
        L_0x0020:
            if (r1 != 0) goto L_0x0027
            de.v0 r1 = new de.v0
            r1.<init>(r10)
        L_0x0027:
            r1.f13256d = r7
        L_0x0029:
            java.lang.Object r2 = r7.y()
            boolean r3 = r2 instanceof de.j0
            if (r3 == 0) goto L_0x0057
            r3 = r2
            de.j0 r3 = (de.j0) r3
            boolean r4 = r3.f13292a
            if (r4 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f13260a
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x0041:
            de.f1 r2 = new de.f1
            r2.<init>()
            boolean r4 = r3.f13292a
            if (r4 == 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            de.q0 r4 = new de.q0
            r4.<init>(r2)
            r2 = r4
        L_0x0051:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f13260a
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0029
        L_0x0057:
            boolean r3 = r2 instanceof de.r0
            if (r3 == 0) goto L_0x00b5
            r3 = r2
            de.r0 r3 = (de.r0) r3
            de.f1 r3 = r3.g()
            if (r3 != 0) goto L_0x0074
            if (r2 == 0) goto L_0x006c
            de.a1 r2 = (de.a1) r2
            r7.O(r2)
            goto L_0x0029
        L_0x006c:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r8.<init>(r9)
            throw r8
        L_0x0074:
            de.g1 r4 = de.g1.f13288a
            if (r8 == 0) goto L_0x00a5
            boolean r5 = r2 instanceof de.b1.b
            if (r5 == 0) goto L_0x00a5
            monitor-enter(r2)
            r5 = r2
            de.b1$b r5 = (de.b1.b) r5     // Catch:{ all -> 0x00a2 }
            java.lang.Throwable r5 = r5.d()     // Catch:{ all -> 0x00a2 }
            if (r5 == 0) goto L_0x0093
            boolean r6 = r10 instanceof de.k     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x00a0
            r6 = r2
            de.b1$b r6 = (de.b1.b) r6     // Catch:{ all -> 0x00a2 }
            boolean r6 = r6.f()     // Catch:{ all -> 0x00a2 }
            if (r6 != 0) goto L_0x00a0
        L_0x0093:
            boolean r4 = r7.b(r2, r3, r1)     // Catch:{ all -> 0x00a2 }
            if (r4 != 0) goto L_0x009b
            monitor-exit(r2)
            goto L_0x0029
        L_0x009b:
            if (r5 != 0) goto L_0x009f
            monitor-exit(r2)
            return r1
        L_0x009f:
            r4 = r1
        L_0x00a0:
            monitor-exit(r2)
            goto L_0x00a6
        L_0x00a2:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00a5:
            r5 = r0
        L_0x00a6:
            if (r5 == 0) goto L_0x00ae
            if (r9 == 0) goto L_0x00ad
            r10.c(r5)
        L_0x00ad:
            return r4
        L_0x00ae:
            boolean r2 = r7.b(r2, r3, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x00b5:
            if (r9 == 0) goto L_0x00c7
            boolean r8 = r2 instanceof de.n
            if (r8 == 0) goto L_0x00be
            de.n r2 = (de.n) r2
            goto L_0x00bf
        L_0x00be:
            r2 = r0
        L_0x00bf:
            if (r2 != 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            java.lang.Throwable r0 = r2.f13313a
        L_0x00c4:
            r10.c(r0)
        L_0x00c7:
            de.g1 r8 = de.g1.f13288a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: de.b1.G(boolean, boolean, td.l):de.h0");
    }

    public CancellationException H() {
        Throwable th;
        Object y10 = y();
        CancellationException cancellationException = null;
        if (y10 instanceof b) {
            th = ((b) y10).d();
        } else if (y10 instanceof n) {
            th = ((n) y10).f13313a;
        } else if (!(y10 instanceof r0)) {
            th = null;
        } else {
            throw new IllegalStateException(k.j("Cannot be cancelling child in this state: ", y10).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new x0(k.j("Parent job is ", P(y10)), th, this) : cancellationException;
    }

    public final void I(f1 f1Var, Throwable th) {
        q qVar;
        q qVar2 = null;
        for (i iVar = (i) f1Var.l(); !k.a(iVar, f1Var); iVar = iVar.m()) {
            if (iVar instanceof y0) {
                a1 a1Var = (a1) iVar;
                try {
                    a1Var.q(th);
                } catch (Throwable th2) {
                    if (qVar2 == null) {
                        qVar = null;
                    } else {
                        j.a(qVar2, th2);
                        qVar = qVar2;
                    }
                    if (qVar == null) {
                        qVar2 = new q("Exception in completion handler " + a1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (qVar2 != null) {
            A(qVar2);
        }
        h(th);
    }

    public void K(Object obj) {
    }

    public void L() {
    }

    public final CancellationException N() {
        Object y10 = y();
        CancellationException cancellationException = null;
        if (y10 instanceof b) {
            Throwable d10 = ((b) y10).d();
            if (d10 != null) {
                cancellationException = Q(d10, k.j(getClass().getSimpleName(), " is cancelling"));
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(k.j("Job is still new or active: ", this).toString());
        } else if (y10 instanceof r0) {
            throw new IllegalStateException(k.j("Job is still new or active: ", this).toString());
        } else if (y10 instanceof n) {
            return Q(((n) y10).f13313a, (String) null);
        } else {
            return new x0(k.j(getClass().getSimpleName(), " has completed normally"), (Throwable) null, this);
        }
    }

    public final void O(a1 a1Var) {
        f1 f1Var = new f1();
        i.f19380b.lazySet(f1Var, a1Var);
        i.f19379a.lazySet(f1Var, a1Var);
        while (true) {
            if (a1Var.l() == a1Var) {
                if (i.f19379a.compareAndSet(a1Var, a1Var, f1Var)) {
                    f1Var.k(a1Var);
                    break;
                }
            } else {
                break;
            }
        }
        f13260a.compareAndSet(this, a1Var, a1Var.m());
    }

    public final String P(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.e()) {
                return "Cancelling";
            }
            if (bVar.f()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof r0)) {
            return obj instanceof n ? "Cancelled" : "Completed";
        } else {
            if (((r0) obj).a()) {
                return "Active";
            }
            return "New";
        }
    }

    public final CancellationException Q(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = l();
            }
            cancellationException = new x0(str, th, this);
        }
        return cancellationException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0098, code lost:
        if (r5 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009b, code lost:
        I(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a0, code lost:
        if ((r7 instanceof de.k) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a2, code lost:
        r0 = (de.k) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a6, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a7, code lost:
        if (r0 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a9, code lost:
        r7 = r7.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ad, code lost:
        if (r7 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b0, code lost:
        r4 = F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b5, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b6, code lost:
        if (r4 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00bc, code lost:
        if (S(r3, r4, r8) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return p(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return de.c1.f13272b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof de.r0
            if (r0 != 0) goto L_0x0007
            b2.t r7 = de.c1.f13271a
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof de.j0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r7 instanceof de.a1
            if (r0 == 0) goto L_0x003f
        L_0x0011:
            boolean r0 = r7 instanceof de.k
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof de.n
            if (r0 != 0) goto L_0x003f
            de.r0 r7 = (de.r0) r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f13260a
            boolean r3 = r8 instanceof de.r0
            if (r3 == 0) goto L_0x002a
            de.s0 r3 = new de.s0
            r4 = r8
            de.r0 r4 = (de.r0) r4
            r3.<init>(r4)
            goto L_0x002b
        L_0x002a:
            r3 = r8
        L_0x002b:
            boolean r0 = r0.compareAndSet(r6, r7, r3)
            if (r0 != 0) goto L_0x0033
            r1 = 0
            goto L_0x0039
        L_0x0033:
            r6.K(r8)
            r6.n(r7, r8)
        L_0x0039:
            if (r1 == 0) goto L_0x003c
            return r8
        L_0x003c:
            b2.t r7 = de.c1.f13273c
            return r7
        L_0x003f:
            de.r0 r7 = (de.r0) r7
            de.f1 r0 = r6.w(r7)
            if (r0 != 0) goto L_0x004b
            b2.t r7 = de.c1.f13273c
            goto L_0x00c5
        L_0x004b:
            boolean r3 = r7 instanceof de.b1.b
            r4 = 0
            if (r3 == 0) goto L_0x0054
            r3 = r7
            de.b1$b r3 = (de.b1.b) r3
            goto L_0x0055
        L_0x0054:
            r3 = r4
        L_0x0055:
            if (r3 != 0) goto L_0x005c
            de.b1$b r3 = new de.b1$b
            r3.<init>(r0, r2, r4)
        L_0x005c:
            monitor-enter(r3)
            boolean r2 = r3.f()     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x0068
            b2.t r7 = de.c1.f13271a     // Catch:{ all -> 0x00c6 }
            monitor-exit(r3)
            goto L_0x00c5
        L_0x0068:
            r3.j(r1)     // Catch:{ all -> 0x00c6 }
            if (r3 == r7) goto L_0x0079
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f13260a     // Catch:{ all -> 0x00c6 }
            boolean r2 = r2.compareAndSet(r6, r7, r3)     // Catch:{ all -> 0x00c6 }
            if (r2 != 0) goto L_0x0079
            b2.t r7 = de.c1.f13273c     // Catch:{ all -> 0x00c6 }
            monitor-exit(r3)
            goto L_0x00c5
        L_0x0079:
            boolean r2 = r3.e()     // Catch:{ all -> 0x00c6 }
            boolean r5 = r8 instanceof de.n     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x0085
            r5 = r8
            de.n r5 = (de.n) r5     // Catch:{ all -> 0x00c6 }
            goto L_0x0086
        L_0x0085:
            r5 = r4
        L_0x0086:
            if (r5 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            java.lang.Throwable r5 = r5.f13313a     // Catch:{ all -> 0x00c6 }
            r3.b(r5)     // Catch:{ all -> 0x00c6 }
        L_0x008e:
            java.lang.Throwable r5 = r3.d()     // Catch:{ all -> 0x00c6 }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r5 = r4
        L_0x0097:
            monitor-exit(r3)
            if (r5 != 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r6.I(r0, r5)
        L_0x009e:
            boolean r0 = r7 instanceof de.k
            if (r0 == 0) goto L_0x00a6
            r0 = r7
            de.k r0 = (de.k) r0
            goto L_0x00a7
        L_0x00a6:
            r0 = r4
        L_0x00a7:
            if (r0 != 0) goto L_0x00b5
            de.f1 r7 = r7.g()
            if (r7 != 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            de.k r4 = r6.F(r7)
            goto L_0x00b6
        L_0x00b5:
            r4 = r0
        L_0x00b6:
            if (r4 == 0) goto L_0x00c1
            boolean r7 = r6.S(r3, r4, r8)
            if (r7 == 0) goto L_0x00c1
            b2.t r7 = de.c1.f13272b
            goto L_0x00c5
        L_0x00c1:
            java.lang.Object r7 = r6.p(r3, r8)
        L_0x00c5:
            return r7
        L_0x00c6:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: de.b1.R(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean S(b bVar, k kVar, Object obj) {
        while (w0.a.a(kVar.f13293e, false, false, new a(this, bVar, kVar, obj), 1, (Object) null) == g1.f13288a) {
            kVar = F(kVar);
            if (kVar == null) {
                return false;
            }
        }
        return true;
    }

    public void V(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new x0(l(), (Throwable) null, this);
        }
        e(cancellationException);
    }

    public boolean a() {
        Object y10 = y();
        return (y10 instanceof r0) && ((r0) y10).a();
    }

    public final boolean b(Object obj, f1 f1Var, a1 a1Var) {
        char c10;
        c cVar = new c(a1Var, this, obj);
        do {
            i n10 = f1Var.n();
            i.f19380b.lazySet(a1Var, n10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.f19379a;
            atomicReferenceFieldUpdater.lazySet(a1Var, f1Var);
            cVar.f19383c = f1Var;
            if (!atomicReferenceFieldUpdater.compareAndSet(n10, f1Var, cVar)) {
                c10 = 0;
            } else {
                c10 = cVar.a(n10) == null ? (char) 1 : 2;
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    public void c(Object obj) {
    }

    public final void d(i1 i1Var) {
        e(i1Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r10) {
        /*
            r9 = this;
            b2.t r0 = de.c1.f13271a
            boolean r1 = r9.r()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003a
        L_0x000b:
            java.lang.Object r0 = r9.y()
            boolean r1 = r0 instanceof de.r0
            if (r1 == 0) goto L_0x0033
            boolean r1 = r0 instanceof de.b1.b
            if (r1 == 0) goto L_0x0021
            r1 = r0
            de.b1$b r1 = (de.b1.b) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0021
            goto L_0x0033
        L_0x0021:
            de.n r1 = new de.n
            java.lang.Throwable r5 = r9.o(r10)
            r1.<init>(r5, r3, r2)
            java.lang.Object r0 = r9.R(r0, r1)
            b2.t r1 = de.c1.f13273c
            if (r0 == r1) goto L_0x000b
            goto L_0x0035
        L_0x0033:
            b2.t r0 = de.c1.f13271a
        L_0x0035:
            b2.t r1 = de.c1.f13272b
            if (r0 != r1) goto L_0x003a
            return r4
        L_0x003a:
            b2.t r1 = de.c1.f13271a
            if (r0 != r1) goto L_0x00e5
            r0 = 0
            r1 = r0
        L_0x0040:
            java.lang.Object r5 = r9.y()
            boolean r6 = r5 instanceof de.b1.b
            if (r6 == 0) goto L_0x008b
            monitor-enter(r5)
            r2 = r5
            de.b1$b r2 = (de.b1.b) r2     // Catch:{ all -> 0x0088 }
            boolean r2 = r2.h()     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0057
            b2.t r10 = de.c1.f13274d     // Catch:{ all -> 0x0088 }
            monitor-exit(r5)
            goto L_0x00e4
        L_0x0057:
            r2 = r5
            de.b1$b r2 = (de.b1.b) r2     // Catch:{ all -> 0x0088 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x0088 }
            if (r10 != 0) goto L_0x0062
            if (r2 != 0) goto L_0x006e
        L_0x0062:
            if (r1 != 0) goto L_0x0068
            java.lang.Throwable r1 = r9.o(r10)     // Catch:{ all -> 0x0088 }
        L_0x0068:
            r10 = r5
            de.b1$b r10 = (de.b1.b) r10     // Catch:{ all -> 0x0088 }
            r10.b(r1)     // Catch:{ all -> 0x0088 }
        L_0x006e:
            r10 = r5
            de.b1$b r10 = (de.b1.b) r10     // Catch:{ all -> 0x0088 }
            java.lang.Throwable r10 = r10.d()     // Catch:{ all -> 0x0088 }
            r1 = r2 ^ 1
            if (r1 == 0) goto L_0x007a
            r0 = r10
        L_0x007a:
            monitor-exit(r5)
            if (r0 != 0) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            de.b1$b r5 = (de.b1.b) r5
            de.f1 r10 = r5.f13265a
            r9.I(r10, r0)
        L_0x0085:
            b2.t r10 = de.c1.f13271a
            goto L_0x00e4
        L_0x0088:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        L_0x008b:
            boolean r6 = r5 instanceof de.r0
            if (r6 == 0) goto L_0x00e2
            if (r1 != 0) goto L_0x0095
            java.lang.Throwable r1 = r9.o(r10)
        L_0x0095:
            r6 = r5
            de.r0 r6 = (de.r0) r6
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x00bd
            de.f1 r5 = r9.w(r6)
            if (r5 != 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            de.b1$b r7 = new de.b1$b
            r7.<init>(r5, r3, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f13260a
            boolean r6 = r8.compareAndSet(r9, r6, r7)
            if (r6 != 0) goto L_0x00b4
        L_0x00b2:
            r5 = 0
            goto L_0x00b8
        L_0x00b4:
            r9.I(r5, r1)
            r5 = 1
        L_0x00b8:
            if (r5 == 0) goto L_0x0040
            b2.t r10 = de.c1.f13271a
            goto L_0x00e4
        L_0x00bd:
            de.n r6 = new de.n
            r6.<init>(r1, r3, r2)
            java.lang.Object r6 = r9.R(r5, r6)
            b2.t r7 = de.c1.f13271a
            if (r6 == r7) goto L_0x00d2
            b2.t r5 = de.c1.f13273c
            if (r6 != r5) goto L_0x00d0
            goto L_0x0040
        L_0x00d0:
            r0 = r6
            goto L_0x00e5
        L_0x00d2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = ud.k.j(r0, r5)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00e2:
            b2.t r10 = de.c1.f13274d
        L_0x00e4:
            r0 = r10
        L_0x00e5:
            b2.t r10 = de.c1.f13271a
            if (r0 != r10) goto L_0x00eb
        L_0x00e9:
            r3 = 1
            goto L_0x00f9
        L_0x00eb:
            b2.t r10 = de.c1.f13272b
            if (r0 != r10) goto L_0x00f0
            goto L_0x00e9
        L_0x00f0:
            b2.t r10 = de.c1.f13274d
            if (r0 != r10) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            r9.c(r0)
            goto L_0x00e9
        L_0x00f9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: de.b1.e(java.lang.Object):boolean");
    }

    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return f.b.a.a(this, r10, pVar);
    }

    public <E extends f.b> E get(f.c<E> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final f.c<?> getKey() {
        return w0.b.f13339a;
    }

    public final boolean h(Throwable th) {
        if (C()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        j jVar = (j) this._parentHandle;
        if (jVar == null || jVar == g1.f13288a) {
            return z10;
        }
        if (jVar.i(th) || z10) {
            return true;
        }
        return false;
    }

    public String l() {
        return "Job was cancelled";
    }

    public boolean m(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!e(th) || !q()) {
            return false;
        }
        return true;
    }

    public f minusKey(f.c<?> cVar) {
        return f.b.a.c(this, cVar);
    }

    public final void n(r0 r0Var, Object obj) {
        q qVar;
        j jVar = (j) this._parentHandle;
        if (jVar != null) {
            jVar.f();
            this._parentHandle = g1.f13288a;
        }
        n nVar = obj instanceof n ? (n) obj : null;
        Throwable th = nVar == null ? null : nVar.f13313a;
        if (r0Var instanceof a1) {
            try {
                ((a1) r0Var).q(th);
            } catch (Throwable th2) {
                A(new q("Exception in completion handler " + r0Var + " for " + this, th2));
            }
        } else {
            f1 g10 = r0Var.g();
            if (g10 != null) {
                q qVar2 = null;
                for (i iVar = (i) g10.l(); !k.a(iVar, g10); iVar = iVar.m()) {
                    if (iVar instanceof a1) {
                        a1 a1Var = (a1) iVar;
                        try {
                            a1Var.q(th);
                        } catch (Throwable th3) {
                            if (qVar2 == null) {
                                qVar = null;
                            } else {
                                j.a(qVar2, th3);
                                qVar = qVar2;
                            }
                            if (qVar == null) {
                                qVar2 = new q("Exception in completion handler " + a1Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (qVar2 != null) {
                    A(qVar2);
                }
            }
        }
    }

    public final Throwable o(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new x0(l(), (Throwable) null, this);
            }
            return th;
        } else if (obj != null) {
            return ((i1) obj).H();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    public final Object p(b bVar, Object obj) {
        T t10 = null;
        n nVar = obj instanceof n ? (n) obj : null;
        T t11 = nVar == null ? null : nVar.f13313a;
        synchronized (bVar) {
            bVar.e();
            List<Throwable> i10 = bVar.i(t11);
            if (!i10.isEmpty()) {
                Iterator<T> it = i10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        t10 = next;
                        break;
                    }
                }
                t10 = (Throwable) t10;
                if (t10 == null) {
                    t10 = (Throwable) i10.get(0);
                }
            } else if (bVar.e()) {
                t10 = new x0(l(), (Throwable) null, this);
            }
            if (t10 != null) {
                if (i10.size() > 1) {
                    Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i10.size()));
                    for (T next2 : i10) {
                        if (next2 != t10 && next2 != t10 && !(next2 instanceof CancellationException) && newSetFromMap.add(next2)) {
                            j.a(t10, next2);
                        }
                    }
                }
            }
        }
        if (!(t10 == null || t10 == t11)) {
            obj = new n(t10, false, 2);
        }
        if (t10 != null) {
            if (h(t10) || z(t10)) {
                if (obj != null) {
                    n.f13312b.compareAndSet((n) obj, 0, 1);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        K(obj);
        f13260a.compareAndSet(this, bVar, obj instanceof r0 ? new s0((r0) obj) : obj);
        n(bVar, obj);
        return obj;
    }

    public f plus(f fVar) {
        return f.b.a.d(this, fVar);
    }

    public boolean q() {
        return true;
    }

    public boolean r() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[ADDED_TO_REGION, LOOP:0: B:0:0x0000->B:15:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean start() {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6.y()
            boolean r1 = r0 instanceof de.j0
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0022
            r1 = r0
            de.j0 r1 = (de.j0) r1
            boolean r1 = r1.f13292a
            if (r1 == 0) goto L_0x0013
            goto L_0x0039
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f13260a
            de.j0 r5 = de.c1.f13277g
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x001e
            goto L_0x003a
        L_0x001e:
            r6.L()
            goto L_0x0037
        L_0x0022:
            boolean r1 = r0 instanceof de.q0
            if (r1 == 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f13260a
            r5 = r0
            de.q0 r5 = (de.q0) r5
            de.f1 r5 = r5.f13322a
            boolean r0 = r1.compareAndSet(r6, r0, r5)
            if (r0 != 0) goto L_0x0034
            goto L_0x003a
        L_0x0034:
            r6.L()
        L_0x0037:
            r2 = 1
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            return r4
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: de.b1.start():boolean");
    }

    public final j t(l lVar) {
        return (j) w0.a.a(this, true, false, new k(lVar), 2, (Object) null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(E() + '{' + P(y()) + '}');
        sb2.append('@');
        sb2.append(a0.c(this));
        return sb2.toString();
    }

    public final f1 w(r0 r0Var) {
        f1 g10 = r0Var.g();
        if (g10 != null) {
            return g10;
        }
        if (r0Var instanceof j0) {
            return new f1();
        }
        if (r0Var instanceof a1) {
            O((a1) r0Var);
            return null;
        }
        throw new IllegalStateException(k.j("State should have list: ", r0Var).toString());
    }

    public final j x() {
        return (j) this._parentHandle;
    }

    public final Object y() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof ie.o)) {
                return obj;
            }
            ((ie.o) obj).a(this);
        }
    }

    public boolean z(Throwable th) {
        return false;
    }
}
