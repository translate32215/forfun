package e8;

import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.ji;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ya0<T> implements ta0<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ab0<T>> f17589a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ab0<Collection<T>>> f17590b;

    static {
        wa0.a(Collections.emptySet());
    }

    public ya0(List list, List list2, ji jiVar) {
        this.f17589a = list;
        this.f17590b = list2;
    }

    public static <T> gf0 a(int i10, int i11) {
        return new gf0(i10, i11, (ji) null);
    }

    public final Object get() {
        int size = this.f17589a.size();
        ArrayList arrayList = new ArrayList(this.f17590b.size());
        int size2 = this.f17590b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) this.f17590b.get(i10).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(g7.t(size));
        int size3 = this.f17589a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object obj = this.f17589a.get(i11).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object next : (Collection) arrayList.get(i12)) {
                next.getClass();
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
