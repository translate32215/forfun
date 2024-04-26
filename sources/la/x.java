package la;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ra.c;

/* compiled from: RestrictedComponentContainer */
public final class x extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Class<?>> f21234a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<?>> f21235b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Class<?>> f21236c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<Class<?>> f21237d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<Class<?>> f21238e;

    /* renamed from: f  reason: collision with root package name */
    public final d f21239f;

    /* compiled from: RestrictedComponentContainer */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final c f21240a;

        public a(Set<Class<?>> set, c cVar) {
            this.f21240a = cVar;
        }
    }

    public x(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (m next : cVar.f21186b) {
            int i10 = next.f21219c;
            boolean z10 = false;
            if (!(i10 == 0)) {
                if (i10 == 2 ? true : z10) {
                    hashSet3.add(next.f21217a);
                } else if (next.a()) {
                    hashSet5.add(next.f21217a);
                } else {
                    hashSet2.add(next.f21217a);
                }
            } else if (next.a()) {
                hashSet4.add(next.f21217a);
            } else {
                hashSet.add(next.f21217a);
            }
        }
        if (!cVar.f21190f.isEmpty()) {
            hashSet.add(c.class);
        }
        this.f21234a = Collections.unmodifiableSet(hashSet);
        this.f21235b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f21236c = Collections.unmodifiableSet(hashSet4);
        this.f21237d = Collections.unmodifiableSet(hashSet5);
        this.f21238e = cVar.f21190f;
        this.f21239f = dVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.f21234a.contains(cls)) {
            T a10 = this.f21239f.a(cls);
            if (!cls.equals(c.class)) {
                return a10;
            }
            return new a(this.f21238e, (c) a10);
        }
        throw new o(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> Set<T> b(Class<T> cls) {
        if (this.f21236c.contains(cls)) {
            return this.f21239f.b(cls);
        }
        throw new o(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> ua.a<T> c(Class<T> cls) {
        if (this.f21235b.contains(cls)) {
            return this.f21239f.c(cls);
        }
        throw new o(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> ua.a<Set<T>> d(Class<T> cls) {
        if (this.f21237d.contains(cls)) {
            return this.f21239f.d(cls);
        }
        throw new o(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }
}
