package la;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import ra.a;
import ra.b;
import ra.c;
import ra.d;

/* compiled from: EventBus */
public class p implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> f21221a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Queue<a<?>> f21222b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f21223c;

    public p(Executor executor) {
        this.f21223c = executor;
    }

    public <T> void a(Class<T> cls, b<? super T> bVar) {
        b(cls, this.f21223c, bVar);
    }

    public synchronized <T> void b(Class<T> cls, Executor executor, b<? super T> bVar) {
        cls.getClass();
        bVar.getClass();
        executor.getClass();
        if (!this.f21221a.containsKey(cls)) {
            this.f21221a.put(cls, new ConcurrentHashMap());
        }
        this.f21221a.get(cls).put(bVar, executor);
    }
}
