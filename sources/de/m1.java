package de;

/* compiled from: EventLoop.common.kt */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final m1 f13310a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<k0> f13311b = new ThreadLocal<>();

    public static final k0 a() {
        ThreadLocal<k0> threadLocal = f13311b;
        k0 k0Var = threadLocal.get();
        if (k0Var != null) {
            return k0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
