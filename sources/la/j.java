package la;

import android.util.Log;
import c1.b;
import f0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ra.c;
import ra.d;

/* compiled from: ComponentRuntime */
public class j extends a implements na.a {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f21203g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Map<c<?>, ua.a<?>> f21204a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, ua.a<?>> f21205b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, s<?>> f21206c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final List<ua.a<g>> f21207d;

    /* renamed from: e  reason: collision with root package name */
    public final p f21208e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<Boolean> f21209f = new AtomicReference<>();

    public j(Executor executor, Iterable iterable, Collection collection, a aVar) {
        p pVar = new p(executor);
        this.f21208e = pVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.c(pVar, p.class, d.class, c.class));
        arrayList.add(c.c(this, na.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.f21207d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    g gVar = (g) ((ua.a) it2.next()).get();
                    if (gVar != null) {
                        arrayList.addAll(gVar.getComponents());
                        it2.remove();
                    }
                } catch (q e10) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f21204a.isEmpty()) {
                l.a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f21204a.keySet());
                arrayList4.addAll(arrayList);
                l.a(arrayList4);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c cVar2 = (c) it3.next();
                this.f21204a.put(cVar2, new r(new h(this, cVar2)));
            }
            arrayList3.addAll(g(arrayList));
            arrayList3.addAll(h());
            f();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f21209f.get();
        if (bool != null) {
            e(this.f21204a, bool.booleanValue());
        }
    }

    public synchronized <T> ua.a<T> c(Class<T> cls) {
        if (cls != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return this.f21205b.get(cls);
    }

    public synchronized <T> ua.a<Set<T>> d(Class<T> cls) {
        s sVar = this.f21206c.get(cls);
        if (sVar != null) {
            return sVar;
        }
        return i.f21200b;
    }

    public final void e(Map<c<?>, ua.a<?>> map, boolean z10) {
        Queue<ra.a<?>> queue;
        Set<Map.Entry> emptySet;
        for (Map.Entry next : map.entrySet()) {
            ua.a aVar = (ua.a) next.getValue();
            int i10 = ((c) next.getKey()).f21187c;
            boolean z11 = false;
            if (!(i10 == 1)) {
                if (i10 == 2) {
                    z11 = true;
                }
                if (z11) {
                    if (!z10) {
                    }
                }
            }
            aVar.get();
        }
        p pVar = this.f21208e;
        synchronized (pVar) {
            queue = pVar.f21222b;
            if (queue != null) {
                pVar.f21222b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (ra.a aVar2 : queue) {
                aVar2.getClass();
                synchronized (pVar) {
                    Queue<ra.a<?>> queue2 = pVar.f21222b;
                    if (queue2 != null) {
                        queue2.add(aVar2);
                    } else {
                        synchronized (pVar) {
                            Map map2 = pVar.f21221a.get((Object) null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new i(entry, aVar2));
                        }
                    }
                }
            }
        }
    }

    public final void f() {
        for (c next : this.f21204a.keySet()) {
            Iterator<m> it = next.f21186b.iterator();
            while (true) {
                if (it.hasNext()) {
                    m next2 = it.next();
                    if (next2.a() && !this.f21206c.containsKey(next2.f21217a)) {
                        this.f21206c.put(next2.f21217a, new s(Collections.emptySet()));
                    } else if (this.f21205b.containsKey(next2.f21217a)) {
                        continue;
                    } else {
                        if (next2.f21218b == 1) {
                            throw new t(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.f21217a}));
                        } else if (!next2.a()) {
                            this.f21205b.put(next2.f21217a, new w(u.f21229a, v.f21230a));
                        }
                    }
                }
            }
        }
    }

    public final List<Runnable> g(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c next : list) {
            if (next.b()) {
                ua.a aVar = this.f21204a.get(next);
                for (Class next2 : next.f21185a) {
                    if (!this.f21205b.containsKey(next2)) {
                        this.f21205b.put(next2, aVar);
                    } else {
                        arrayList.add(new b((w) this.f21205b.get(next2), aVar));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> h() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f21204a.entrySet()) {
            c cVar = (c) next.getKey();
            if (!cVar.b()) {
                ua.a aVar = (ua.a) next.getValue();
                for (Class next2 : cVar.f21185a) {
                    if (!hashMap.containsKey(next2)) {
                        hashMap.put(next2, new HashSet());
                    }
                    ((Set) hashMap.get(next2)).add(aVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f21206c.containsKey(entry.getKey())) {
                this.f21206c.put((Class) entry.getKey(), new s((Set) ((Collection) entry.getValue())));
            } else {
                s sVar = this.f21206c.get(entry.getKey());
                for (ua.a cVar2 : (Set) entry.getValue()) {
                    arrayList.add(new c1.c(sVar, cVar2));
                }
            }
        }
        return arrayList;
    }
}
