package aa;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: Function */
public interface e<F, T> {
    @NullableDecl
    @CanIgnoreReturnValue
    T apply(@NullableDecl F f10);
}
