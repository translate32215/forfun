package k8;

import e8.ft;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class q7<T> implements x7<T> {

    /* renamed from: a  reason: collision with root package name */
    public final m7 f20434a;

    /* renamed from: b  reason: collision with root package name */
    public final l8<?, ?> f20435b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20436c;

    /* renamed from: d  reason: collision with root package name */
    public final y5<?> f20437d;

    public q7(l8<?, ?> l8Var, y5<?> y5Var, m7 m7Var) {
        this.f20435b = l8Var;
        this.f20436c = y5Var.c(m7Var);
        this.f20437d = y5Var;
        this.f20434a = m7Var;
    }

    public final void a(T t10) {
        this.f20435b.g(t10);
        this.f20437d.b(t10);
    }

    public final T b() {
        return ((h6) this.f20434a.e()).g();
    }

    public final void c(T t10, T t11) {
        l8<?, ?> l8Var = this.f20435b;
        Class<?> cls = z7.f20565a;
        l8Var.h(t10, l8Var.d(l8Var.c(t10), l8Var.c(t11)));
        if (this.f20436c) {
            this.f20437d.a(t11);
            throw null;
        }
    }

    public final boolean d(T t10) {
        this.f20437d.a(t10);
        throw null;
    }

    public final int e(T t10) {
        l8<?, ?> l8Var = this.f20435b;
        int b10 = l8Var.b(l8Var.c(t10));
        if (!this.f20436c) {
            return b10;
        }
        this.f20437d.a(t10);
        throw null;
    }

    public final void f(T t10, u5 u5Var) throws IOException {
        this.f20437d.a(t10);
        throw null;
    }

    public final boolean g(T t10, T t11) {
        if (!this.f20435b.c(t10).equals(this.f20435b.c(t11))) {
            return false;
        }
        if (!this.f20436c) {
            return true;
        }
        this.f20437d.a(t10);
        this.f20437d.a(t11);
        throw null;
    }

    public final int h(T t10) {
        int hashCode = this.f20435b.c(t10).hashCode();
        if (!this.f20436c) {
            return hashCode;
        }
        this.f20437d.a(t10);
        throw null;
    }

    public final void i(T t10, byte[] bArr, int i10, int i11, ft ftVar) throws IOException {
        k6 k6Var = (k6) t10;
        if (k6Var.zzc == m8.f20328f) {
            k6Var.zzc = m8.b();
        }
        i6 i6Var = (i6) t10;
        throw null;
    }
}
