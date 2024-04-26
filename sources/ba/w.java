package ba;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ImmutableMultimap */
public abstract class w<K, V> extends g<K, V> implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public final transient u<K, ? extends q<V>> f3812d;

    /* renamed from: e  reason: collision with root package name */
    public final transient int f3813e;

    /* compiled from: ImmutableMultimap */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Map<K, Collection<V>> f3814a = new l();
    }

    public w(u<K, ? extends q<V>> uVar, int i10) {
        this.f3812d = uVar;
        this.f3813e = i10;
    }

    public Map a() {
        return this.f3812d;
    }

    public boolean b(@NullableDecl Object obj) {
        return obj != null && super.b(obj);
    }

    public Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public Set<K> d() {
        throw new AssertionError("unreachable");
    }

    public Iterator e() {
        return new v(this);
    }

    public int size() {
        return this.f3813e;
    }
}
