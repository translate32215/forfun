package ib;

import com.google.gson.internal.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? super T> f19348a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f19349b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19350c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a10 = b.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f19349b = a10;
            this.f19348a = b.e(a10);
            this.f19350c = a10.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.c(this.f19349b, ((a) obj).f19349b);
    }

    public final int hashCode() {
        return this.f19350c;
    }

    public final String toString() {
        return b.i(this.f19349b);
    }

    public a(Type type) {
        type.getClass();
        Type a10 = b.a(type);
        this.f19349b = a10;
        this.f19348a = b.e(a10);
        this.f19350c = a10.hashCode();
    }
}
