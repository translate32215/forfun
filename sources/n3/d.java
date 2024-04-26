package n3;

import g4.j;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Queue;
import n3.m;
import sun.misc.Unsafe;

/* compiled from: BaseKeyPool */
public abstract class d<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<T> f21860a;

    public d(Unsafe unsafe) {
        this.f21860a = unsafe;
    }

    public abstract T a();

    public T b() {
        T t10 = (m) this.f21860a.poll();
        return t10 == null ? a() : t10;
    }

    public void c(T t10) {
        if (this.f21860a.size() < 20) {
            this.f21860a.offer(t10);
        }
    }

    public abstract double d(Object obj, long j10);

    public abstract float e(Object obj, long j10);

    public abstract void f(Object obj, long j10, boolean z10);

    public abstract void g(Object obj, long j10, byte b10);

    public abstract void h(Object obj, long j10, double d10);

    public abstract void i(Object obj, long j10, float f10);

    public abstract boolean j(Object obj, long j10);

    public int k(Class<?> cls) {
        return this.f21860a.arrayBaseOffset(cls);
    }

    public int l(Class<?> cls) {
        return this.f21860a.arrayIndexScale(cls);
    }

    public int m(Object obj, long j10) {
        return this.f21860a.getInt(obj, j10);
    }

    public long n(Object obj, long j10) {
        return this.f21860a.getLong(obj, j10);
    }

    public long o(Field field) {
        return this.f21860a.objectFieldOffset(field);
    }

    public Object p(Object obj, long j10) {
        return this.f21860a.getObject(obj, j10);
    }

    public void q(Object obj, long j10, int i10) {
        this.f21860a.putInt(obj, j10, i10);
    }

    public void r(Object obj, long j10, long j11) {
        this.f21860a.putLong(obj, j10, j11);
    }

    public void s(Object obj, long j10, Object obj2) {
        this.f21860a.putObject(obj, j10, obj2);
    }

    public d() {
        char[] cArr = j.f18467a;
        this.f21860a = new ArrayDeque(20);
    }
}
