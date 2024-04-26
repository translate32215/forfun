package ba;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: AbstractMultimap */
public abstract class f<K, V> implements h0<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: a  reason: collision with root package name */
    public transient Set<K> f3724a;
    @MonotonicNonNullDecl

    /* renamed from: b  reason: collision with root package name */
    public transient Collection<V> f3725b;
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    public transient Map<K, Collection<V>> f3726c;

    /* compiled from: AbstractMultimap */
    public class a extends AbstractCollection<V> {
        public a() {
        }

        public void clear() {
            f.this.clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            return f.this.b(obj);
        }

        public Iterator<V> iterator() {
            return f.this.e();
        }

        public int size() {
            return f.this.size();
        }
    }

    public abstract Map<K, Collection<V>> a();

    public boolean b(@NullableDecl Object obj) {
        for (Collection contains : a().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> c();

    public abstract Set<K> d();

    public abstract Iterator<V> e();

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            return a().equals(((h0) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
