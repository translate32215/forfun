package ie;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: Atomic.kt */
public abstract class b<T> extends o {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19364a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = a.f19363a;

    public final Object a(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = a.f19363a;
        if (obj2 == obj3) {
            obj2 = c(obj);
            Object obj4 = this._consensus;
            if (obj4 != obj3) {
                obj2 = obj4;
            } else if (!f19364a.compareAndSet(this, obj3, obj2)) {
                obj2 = this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object c(T t10);
}
