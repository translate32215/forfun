package ld;

import be.f;
import ce.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ud.k;

/* compiled from: _Collections.kt */
public class l extends k {

    /* compiled from: Sequences.kt */
    public static final class a implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterable f21254a;

        public a(Iterable iterable) {
            this.f21254a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f21254a.iterator();
        }
    }

    public static final <T> f<T> j(Iterable<? extends T> iterable) {
        k.f(iterable, "<this>");
        return new a(iterable);
    }

    public static final <T> T k(List<? extends T> list) {
        k.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T l(List<? extends T> list, int i10) {
        k.f(list, "<this>");
        if (i10 < 0 || i10 > h.b(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static String m(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, td.l lVar, int i11) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        String str = (i11 & 16) != 0 ? "..." : null;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        k.f(iterable, "<this>");
        k.f(charSequence2, "prefix");
        k.f(charSequence3, "postfix");
        k.f(str, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        int i12 = 0;
        for (Object next : iterable) {
            i12++;
            if (i12 > 1) {
                sb2.append(charSequence);
            }
            if (i10 >= 0 && i12 > i10) {
                break;
            }
            e.a(sb2, next, lVar);
        }
        if (i10 >= 0 && i12 > i10) {
            sb2.append(str);
        }
        sb2.append(charSequence3);
        String sb3 = sb2.toString();
        k.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final <T> T n(List<? extends T> list) {
        k.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(h.b(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T o(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T extends Comparable<? super T>> T p(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static final <T> List<T> q(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        k.f(collection, "<this>");
        k.f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        k.g(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<T> r(Collection<? extends T> collection, T t10) {
        k.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static final <T> List<T> s(Iterable<? extends T> iterable) {
        k.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return w(iterable);
        }
        List<T> x10 = x(iterable);
        Collections.reverse(x10);
        return x10;
    }

    public static final <T, C extends Collection<? super T>> C t(Iterable<? extends T> iterable, C c10) {
        for (Object add : iterable) {
            c10.add(add);
        }
        return c10;
    }

    public static final <T> HashSet<T> u(Iterable<? extends T> iterable) {
        HashSet<T> hashSet = new HashSet<>(s.a(i.f(iterable, 12)));
        t(iterable, hashSet);
        return hashSet;
    }

    public static final int[] v(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            iArr[i10] = intValue.intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> w(Iterable<? extends T> iterable) {
        k.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return h.d(x(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return n.f21256a;
        }
        if (size != 1) {
            return y(collection);
        }
        return h.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> x(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return y((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        t(iterable, arrayList);
        return arrayList;
    }

    public static final <T> List<T> y(Collection<? extends T> collection) {
        k.f(collection, "<this>");
        return new ArrayList(collection);
    }
}
