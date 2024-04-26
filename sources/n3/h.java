package n3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n3.m;

/* compiled from: GroupedLinkedMap */
public class h<K extends m, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f21861a = new a<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final Map<K, a<K, V>> f21862b = new HashMap();

    /* compiled from: GroupedLinkedMap */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f21863a;

        /* renamed from: b  reason: collision with root package name */
        public List<V> f21864b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f21865c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f21866d;

        public a() {
            this((Object) null);
        }

        public V a() {
            List<V> list = this.f21864b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f21864b.remove(size - 1);
            }
            return null;
        }

        public a(K k10) {
            this.f21866d = this;
            this.f21865c = this;
            this.f21863a = k10;
        }
    }

    public V a(K k10) {
        a<K, V> aVar = this.f21862b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f21862b.put(k10, aVar);
        } else {
            k10.a();
        }
        a<K, V> aVar2 = aVar.f21866d;
        aVar2.f21865c = aVar.f21865c;
        aVar.f21865c.f21866d = aVar2;
        a<K, V> aVar3 = this.f21861a;
        aVar.f21866d = aVar3;
        a<K, V> aVar4 = aVar3.f21865c;
        aVar.f21865c = aVar4;
        aVar4.f21866d = aVar;
        aVar.f21866d.f21865c = aVar;
        return aVar.a();
    }

    public void b(K k10, V v10) {
        a<K, V> aVar = this.f21862b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            a<K, V> aVar2 = aVar.f21866d;
            aVar2.f21865c = aVar.f21865c;
            aVar.f21865c.f21866d = aVar2;
            a<K, V> aVar3 = this.f21861a;
            aVar.f21866d = aVar3.f21866d;
            aVar.f21865c = aVar3;
            aVar3.f21866d = aVar;
            aVar.f21866d.f21865c = aVar;
            this.f21862b.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f21864b == null) {
            aVar.f21864b = new ArrayList();
        }
        aVar.f21864b.add(v10);
    }

    public V c() {
        for (a<K, V> aVar = this.f21861a.f21866d; !aVar.equals(this.f21861a); aVar = aVar.f21866d) {
            V a10 = aVar.a();
            if (a10 != null) {
                return a10;
            }
            a<K, V> aVar2 = aVar.f21866d;
            aVar2.f21865c = aVar.f21865c;
            aVar.f21865c.f21866d = aVar2;
            this.f21862b.remove(aVar.f21863a);
            ((m) aVar.f21863a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a<K, V> aVar = this.f21861a.f21865c; !aVar.equals(this.f21861a); aVar = aVar.f21865c) {
            z10 = true;
            sb2.append('{');
            sb2.append(aVar.f21863a);
            sb2.append(':');
            List<V> list = aVar.f21864b;
            sb2.append(list != null ? list.size() : 0);
            sb2.append("}, ");
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
