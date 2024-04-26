package ie;

import de.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ud.k;
import ud.o;

/* compiled from: LockFreeLinkedList.kt */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19379a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19380b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19381c;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends b<i> {

        /* renamed from: b  reason: collision with root package name */
        public final i f19382b;

        /* renamed from: c  reason: collision with root package name */
        public i f19383c;

        public a(i iVar) {
            this.f19382b = iVar;
        }

        public void b(Object obj, Object obj2) {
            i iVar = (i) obj;
            boolean z10 = obj2 == null;
            i iVar2 = z10 ? this.f19382b : this.f19383c;
            if (iVar2 != null && i.f19379a.compareAndSet(iVar, this, iVar2) && z10) {
                i iVar3 = this.f19382b;
                i iVar4 = this.f19383c;
                k.c(iVar4);
                iVar3.k(iVar4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public /* synthetic */ class b extends o {
        public b(Object obj) {
            super(obj, a0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return a0.b(this.f26182b);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<i> cls2 = i.class;
        f19379a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f19380b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f19381c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (f19379a.compareAndSet(r2, r1, ((ie.p) r3).f19395a) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ie.i j(ie.o r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r7 = r6._prev
            ie.i r7 = (ie.i) r7
            r0 = 0
            r1 = r7
        L_0x0006:
            r2 = r0
        L_0x0007:
            java.lang.Object r3 = r1._next
            if (r3 != r6) goto L_0x0018
            if (r7 != r1) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19380b
            boolean r7 = r0.compareAndSet(r6, r7, r1)
            if (r7 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r1
        L_0x0018:
            boolean r4 = r6.o()
            if (r4 == 0) goto L_0x001f
            return r0
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            return r1
        L_0x0022:
            boolean r4 = r3 instanceof ie.o
            if (r4 == 0) goto L_0x002c
            ie.o r3 = (ie.o) r3
            r3.a(r1)
            goto L_0x0000
        L_0x002c:
            boolean r4 = r3 instanceof ie.p
            if (r4 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f19379a
            ie.p r3 = (ie.p) r3
            ie.i r3 = r3.f19395a
            boolean r1 = r4.compareAndSet(r2, r1, r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x0000
        L_0x003f:
            r1 = r2
            goto L_0x0006
        L_0x0041:
            java.lang.Object r1 = r1._prev
            ie.i r1 = (ie.i) r1
            goto L_0x0007
        L_0x0046:
            r2 = r3
            ie.i r2 = (ie.i) r2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.i.j(ie.o):ie.i");
    }

    public final void k(i iVar) {
        i iVar2;
        do {
            iVar2 = (i) iVar._prev;
            if (l() != iVar) {
                return;
            }
        } while (!f19380b.compareAndSet(iVar, iVar2, this));
        if (o()) {
            iVar.j((o) null);
        }
    }

    public final Object l() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof o)) {
                return obj;
            }
            ((o) obj).a(this);
        }
    }

    public final i m() {
        Object l10 = l();
        i iVar = null;
        p pVar = l10 instanceof p ? (p) l10 : null;
        if (pVar != null) {
            iVar = pVar.f19395a;
        }
        return iVar == null ? (i) l10 : iVar;
    }

    public final i n() {
        i j10 = j((o) null);
        if (j10 == null) {
            Object obj = this._prev;
            while (true) {
                j10 = (i) obj;
                if (!j10.o()) {
                    break;
                }
                obj = j10._prev;
            }
        }
        return j10;
    }

    public boolean o() {
        return l() instanceof p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean p() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.l()
            boolean r1 = r0 instanceof ie.p
            if (r1 == 0) goto L_0x000d
            ie.p r0 = (ie.p) r0
            ie.i r0 = r0.f19395a
            goto L_0x0031
        L_0x000d:
            if (r0 != r4) goto L_0x0012
            ie.i r0 = (ie.i) r0
            goto L_0x0031
        L_0x0012:
            r1 = r0
            ie.i r1 = (ie.i) r1
            java.lang.Object r2 = r1._removedRef
            ie.p r2 = (ie.p) r2
            if (r2 != 0) goto L_0x0025
            ie.p r2 = new ie.p
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f19381c
            r3.lazySet(r1, r2)
        L_0x0025:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f19379a
            boolean r0 = r3.compareAndSet(r4, r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = 0
            r1.j(r0)
        L_0x0031:
            if (r0 != 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.i.p():boolean");
    }

    public String toString() {
        return new b(this) + '@' + a0.c(this);
    }
}
