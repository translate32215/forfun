package kd;

import java.io.Serializable;
import td.a;
import ud.k;

/* compiled from: LazyJVM.kt */
public final class j<T> implements d<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends T> f20620a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f20621b = m.f20626a;

    /* renamed from: c  reason: collision with root package name */
    public final Object f20622c = this;

    public j(a aVar, Object obj, int i10) {
        this.f20620a = aVar;
    }

    public T getValue() {
        T t10;
        T t11 = this.f20621b;
        T t12 = m.f20626a;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.f20622c) {
            t10 = this.f20621b;
            if (t10 == t12) {
                a aVar = this.f20620a;
                k.c(aVar);
                t10 = aVar.d();
                this.f20621b = t10;
                this.f20620a = null;
            }
        }
        return t10;
    }

    public String toString() {
        return this.f20621b != m.f20626a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
