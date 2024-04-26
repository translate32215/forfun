package la;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector */
public class l {

    /* compiled from: CycleDetector */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final c<?> f21212a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<b> f21213b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Set<b> f21214c = new HashSet();

        public b(c<?> cVar) {
            this.f21212a = cVar;
        }

        public boolean a() {
            return this.f21214c.isEmpty();
        }
    }

    /* compiled from: CycleDetector */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f21215a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21216b;

        public c(Class cls, boolean z10, a aVar) {
            this.f21215a = cls;
            this.f21216b = z10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f21215a.equals(this.f21215a) || cVar.f21216b != this.f21216b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f21215a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f21216b).hashCode();
        }
    }

    public static void a(List<c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<c<?>> it = list.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                c next = it.next();
                b bVar = new b(next);
                Iterator<Class<? super T>> it2 = next.f21185a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next2 = it2.next();
                        boolean z10 = !next.b();
                        c cVar = new c(next2, z10, (a) null);
                        if (!hashMap.containsKey(cVar)) {
                            hashMap.put(cVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(cVar);
                        if (set2.isEmpty() || z10) {
                            set2.add(bVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<b> it3 : hashMap.values()) {
                    for (b bVar2 : it3) {
                        for (m next3 : bVar2.f21212a.f21186b) {
                            if ((next3.f21219c == 0) && (set = (Set) hashMap.get(new c(next3.f21217a, next3.a(), (a) null))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.f21213b.add(bVar3);
                                    bVar3.f21214c.add(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    b bVar4 = (b) it4.next();
                    if (bVar4.a()) {
                        hashSet2.add(bVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b bVar5 = (b) hashSet2.iterator().next();
                    hashSet2.remove(bVar5);
                    i10++;
                    for (b next4 : bVar5.f21213b) {
                        next4.f21214c.remove(bVar5);
                        if (next4.a()) {
                            hashSet2.add(next4);
                        }
                    }
                }
                if (i10 != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = hashSet.iterator();
                    while (it5.hasNext()) {
                        b bVar6 = (b) it5.next();
                        if (!bVar6.a() && !bVar6.f21213b.isEmpty()) {
                            arrayList.add(bVar6.f21212a);
                        }
                    }
                    throw new n(arrayList);
                }
                return;
            }
        }
    }
}
