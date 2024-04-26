package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
public class j<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19384a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public j(boolean z10) {
        this._cur = new k(8, z10);
    }

    public final boolean a(E e10) {
        while (true) {
            k kVar = (k) this._cur;
            int a10 = kVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                f19384a.compareAndSet(this, kVar, kVar.e());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            k kVar = (k) this._cur;
            if (!kVar.b()) {
                f19384a.compareAndSet(this, kVar, kVar.e());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((k) this._cur).c();
    }

    public final E d() {
        while (true) {
            k kVar = (k) this._cur;
            E f10 = kVar.f();
            if (f10 != k.f19388h) {
                return f10;
            }
            f19384a.compareAndSet(this, kVar, kVar.e());
        }
    }
}
