package je;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WorkQueue.kt */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19786b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19787c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19788d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19789e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<h> f19790a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<n> cls = n.class;
        f19786b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f19787c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f19788d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f19789e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f19786b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        boolean z10 = true;
        if (hVar.f19775b.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f19789e.incrementAndGet(this);
        }
        if (c() == 127) {
            return hVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f19790a.get(i10) != null) {
            Thread.yield();
        }
        this.f19790a.lazySet(i10, hVar);
        f19787c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final h e() {
        h hVar = (h) f19786b.getAndSet(this, (Object) null);
        return hVar == null ? f() : hVar;
    }

    public final h f() {
        h andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f19788d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f19790a.getAndSet(i11, (Object) null)) != null) {
                boolean z10 = true;
                if (andSet.f19775b.b() != 1) {
                    z10 = false;
                }
                if (z10) {
                    f19789e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long g(n nVar) {
        int i10 = nVar.consumerIndex;
        int i11 = nVar.producerIndex;
        AtomicReferenceArray<h> atomicReferenceArray = nVar.f19790a;
        while (true) {
            boolean z10 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = atomicReferenceArray.get(i12);
            if (hVar != null) {
                if (hVar.f19775b.b() != 1) {
                    z10 = false;
                }
                if (z10 && atomicReferenceArray.compareAndSet(i12, hVar, (Object) null)) {
                    f19789e.decrementAndGet(nVar);
                    a(hVar, false);
                    return -1;
                }
            }
            i10++;
        }
        return h(nVar, true);
    }

    public final long h(n nVar, boolean z10) {
        h hVar;
        do {
            hVar = (h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z10) {
                boolean z11 = true;
                if (hVar.f19775b.b() != 1) {
                    z11 = false;
                }
                if (!z11) {
                    return -2;
                }
            }
            ((e) l.f19782e).getClass();
            long nanoTime = System.nanoTime() - hVar.f19774a;
            long j10 = l.f19778a;
            if (nanoTime < j10) {
                return j10 - nanoTime;
            }
        } while (!f19786b.compareAndSet(nVar, hVar, (Object) null));
        a(hVar, false);
        return -1;
    }
}
