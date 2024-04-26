package kd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.a;

/* compiled from: LazyJVM.kt */
public final class i<T> implements d<T>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<i<?>, Object> f20617c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "b");

    /* renamed from: a  reason: collision with root package name */
    public volatile a<? extends T> f20618a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f20619b = m.f20626a;

    public i(a<? extends T> aVar) {
        this.f20618a = aVar;
    }

    public T getValue() {
        T t10 = this.f20619b;
        T t11 = m.f20626a;
        if (t10 != t11) {
            return t10;
        }
        a<? extends T> aVar = this.f20618a;
        if (aVar != null) {
            T d10 = aVar.d();
            if (f20617c.compareAndSet(this, t11, d10)) {
                this.f20618a = null;
                return d10;
            }
        }
        return this.f20619b;
    }

    public String toString() {
        return this.f20619b != m.f20626a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
