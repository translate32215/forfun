package ba;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ImmutableEntry */
public class r<K, V> extends e<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    public final K f3792a;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    public final V f3793b;

    public r(@NullableDecl K k10, @NullableDecl V v10) {
        this.f3792a = k10;
        this.f3793b = v10;
    }

    @NullableDecl
    public final K getKey() {
        return this.f3792a;
    }

    @NullableDecl
    public final V getValue() {
        return this.f3793b;
    }

    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
