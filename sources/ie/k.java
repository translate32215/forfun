package ie;

import b2.t;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ud.f;

/* compiled from: LockFreeTaskQueue.kt */
public final class k<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f19385e = new a((f) null);

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19386f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19387g;

    /* renamed from: h  reason: collision with root package name */
    public static final t f19388h = new t("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f19389a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19390b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19391c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f19392d;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final long a(long j10, long j11) {
            return j10 & (j11 ^ -1);
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19393a;

        public b(int i10) {
            this.f19393a = i10;
        }
    }

    static {
        Class<k> cls = k.class;
        f19386f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f19387g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public k(int i10, boolean z10) {
        this.f19389a = i10;
        this.f19390b = z10;
        int i11 = i10 - 1;
        this.f19391c = i11;
        this.f19392d = new AtomicReferenceArray(i10);
        boolean z11 = false;
        if (i11 <= 1073741823) {
            if (!((i10 & i11) == 0 ? true : z11)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(E e10) {
        E e11 = e10;
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                return (2305843009213693952L & j10) != 0 ? 2 : 1;
            }
            a aVar = f19385e;
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((j10 & 1152921503533105152L) >> 30);
            int i12 = this.f19391c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (this.f19390b || this.f19392d.get(i11 & i12) == null) {
                if (f19387g.compareAndSet(this, j10, aVar.a(j10, 1152921503533105152L) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                    this.f19392d.set(i11 & i12, e11);
                    k kVar = this;
                    while ((kVar._state & 1152921504606846976L) != 0) {
                        kVar = kVar.e();
                        Object obj = kVar.f19392d.get(kVar.f19391c & i11);
                        if (!(obj instanceof b) || ((b) obj).f19393a != i11) {
                            kVar = null;
                            continue;
                        } else {
                            kVar.f19392d.set(kVar.f19391c & i11, e11);
                            continue;
                        }
                        if (kVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f19389a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f19387g.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j10 = this._state;
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    public final boolean d() {
        long j10 = this._state;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ie.k<E> e() {
        /*
            r12 = this;
        L_0x0000:
            long r2 = r12._state
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r2 & r6
            r4 = 0
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r8 = r2 | r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f19387g
            r1 = r12
            r4 = r8
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r8
        L_0x001a:
            java.lang.Object r0 = r12._next
            ie.k r0 = (ie.k) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f19386f
            r1 = 0
            ie.k r4 = new ie.k
            int r5 = r12.f19389a
            int r5 = r5 * 2
            boolean r8 = r12.f19390b
            r4.<init>(r5, r8)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r2
            r5 = 0
            long r8 = r8 >> r5
            int r5 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r8 = r8 & r2
            r10 = 30
            long r8 = r8 >> r10
            int r9 = (int) r8
        L_0x0040:
            int r8 = r12.f19391c
            r10 = r5 & r8
            r8 = r8 & r9
            if (r10 == r8) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r12.f19392d
            java.lang.Object r8 = r8.get(r10)
            if (r8 != 0) goto L_0x0054
            ie.k$b r8 = new ie.k$b
            r8.<init>(r5)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r4.f19392d
            int r11 = r4.f19391c
            r11 = r11 & r5
            r10.set(r11, r8)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005f:
            ie.k$a r5 = f19385e
            long r8 = r5.a(r2, r6)
            r4._state = r8
            r0.compareAndSet(r12, r1, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.k.e():ie.k");
    }

    public final Object f() {
        while (true) {
            long j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return f19388h;
            }
            a aVar = f19385e;
            int i10 = (int) ((j10 & 1073741823) >> 0);
            int i11 = this.f19391c;
            int i12 = ((int) ((1152921503533105152L & j10) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.f19392d.get(i13);
            if (obj == null) {
                if (this.f19390b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                long j11 = ((long) ((i10 + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f19387g.compareAndSet(this, j10, aVar.a(j10, 1073741823) | j11)) {
                    this.f19392d.set(this.f19391c & i10, (Object) null);
                    return obj2;
                } else if (this.f19390b) {
                    k kVar = this;
                    while (true) {
                        long j12 = kVar._state;
                        a aVar2 = f19385e;
                        int i14 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            kVar = kVar.e();
                        } else {
                            if (f19387g.compareAndSet(kVar, j12, j11 | aVar2.a(j12, 1073741823))) {
                                kVar.f19392d.set(kVar.f19391c & i14, (Object) null);
                                kVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
