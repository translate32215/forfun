package ba;

import ba.u;
import ba.w;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableListMultimap */
public class t<K, V> extends w<K, V> {

    /* compiled from: ImmutableListMultimap */
    public static final class a<K, V> extends w.a<K, V> {
        public t<K, V> a() {
            Set<Map.Entry<K, Collection<V>>> entrySet = this.f3814a.entrySet();
            if (entrySet.isEmpty()) {
                return o.f3764f;
            }
            u.a aVar = new u.a(entrySet.size());
            int i10 = 0;
            for (Map.Entry next : entrySet) {
                Object key = next.getKey();
                s z10 = s.z((Collection) next.getValue());
                if (!z10.isEmpty()) {
                    aVar.c(key, z10);
                    i10 += z10.size();
                }
            }
            return new t<>(aVar.a(), i10);
        }

        @CanIgnoreReturnValue
        public a<K, V> b(K k10, V... vArr) {
            List asList = Arrays.asList(vArr);
            Collection collection = this.f3814a.get(k10);
            if (collection != null) {
                for (Object next : asList) {
                    h.a(k10, next);
                    collection.add(next);
                }
            } else {
                Iterator it = asList.iterator();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        h.a(k10, next2);
                        arrayList.add(next2);
                    }
                    this.f3814a.put(k10, arrayList);
                }
            }
            return this;
        }
    }

    public t(u<K, s<V>> uVar, int i10) {
        super(uVar, i10);
    }

    public static <K, V> a<K, V> f() {
        return new a<>();
    }
}
