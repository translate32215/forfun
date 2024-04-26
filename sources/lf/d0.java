package lf;

import javax.annotation.Nullable;
import ke.e0;

/* compiled from: Response */
public final class d0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ke.d0 f21323a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final T f21324b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final e0 f21325c;

    public d0(ke.d0 d0Var, @Nullable T t10, @Nullable e0 e0Var) {
        this.f21323a = d0Var;
        this.f21324b = t10;
        this.f21325c = e0Var;
    }

    public static <T> d0<T> a(e0 e0Var, ke.d0 d0Var) {
        if (!d0Var.d()) {
            return new d0<>(d0Var, (Object) null, e0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> d0<T> c(@Nullable T t10, ke.d0 d0Var) {
        if (d0Var.d()) {
            return new d0<>(d0Var, t10, (e0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public boolean b() {
        return this.f21323a.d();
    }

    public String toString() {
        return this.f21323a.toString();
    }
}
