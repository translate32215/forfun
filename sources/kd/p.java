package kd;

import java.io.Serializable;
import td.a;
import ud.k;

/* compiled from: Lazy.kt */
public final class p<T> implements d<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends T> f20628a;

    /* renamed from: b  reason: collision with root package name */
    public Object f20629b = m.f20626a;

    public p(a<? extends T> aVar) {
        this.f20628a = aVar;
    }

    public T getValue() {
        if (this.f20629b == m.f20626a) {
            a<? extends T> aVar = this.f20628a;
            k.c(aVar);
            this.f20629b = aVar.d();
            this.f20628a = null;
        }
        return this.f20629b;
    }

    public String toString() {
        return this.f20629b != m.f20626a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
