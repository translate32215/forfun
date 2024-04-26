package ba;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: Ordering */
public abstract class n0<T> implements Comparator<T> {
    public static <T> n0<T> a(Comparator<T> comparator) {
        return comparator instanceof n0 ? (n0) comparator : new m(comparator);
    }

    public <S extends T> n0<S> b() {
        return new s0(this);
    }

    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t10, @NullableDecl T t11);
}
