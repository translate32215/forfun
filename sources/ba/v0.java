package ba;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Sets */
public final class v0 {

    /* compiled from: Sets */
    public static class a extends c<E> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Set f3810a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Set f3811b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super((t0) null);
            this.f3810a = set;
            this.f3811b = set2;
        }

        public boolean contains(Object obj) {
            return this.f3810a.contains(obj) && this.f3811b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f3810a.containsAll(collection) && this.f3811b.containsAll(collection);
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f3811b, this.f3810a);
        }

        public Iterator iterator() {
            return new u0(this);
        }

        public int size() {
            int i10 = 0;
            for (Object contains : this.f3810a) {
                if (this.f3811b.contains(contains)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* compiled from: Sets */
    public static abstract class b<E> extends AbstractSet<E> {
        public boolean removeAll(Collection<?> collection) {
            collection.getClass();
            if (collection instanceof k0) {
                collection = ((k0) collection).l();
            }
            if (!(collection instanceof Set) || collection.size() <= size()) {
                return v0.c(this, collection.iterator());
            }
            Iterator it = iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    /* compiled from: Sets */
    public static abstract class c<E> extends AbstractSet<E> {
        public c(t0 t0Var) {
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ((i10 + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i10;
    }

    public static <E> c<E> b(Set<E> set, Set<?> set2) {
        if (set == null) {
            throw new NullPointerException("set1");
        } else if (set2 != null) {
            return new a(set, set2);
        } else {
            throw new NullPointerException("set2");
        }
    }

    public static boolean c(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
