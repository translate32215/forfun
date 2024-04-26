package ba;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import t.g;

/* compiled from: AbstractIterator */
public abstract class b<T> extends y0<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f3687a = 2;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    public T f3688b;

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        T t10;
        int i10 = this.f3687a;
        if (i10 != 4) {
            int f10 = g.f(i10);
            if (f10 == 0) {
                return true;
            }
            if (f10 == 2) {
                return false;
            }
            this.f3687a = 4;
            u0 u0Var = (u0) this;
            while (true) {
                if (!u0Var.f3806c.hasNext()) {
                    u0Var.f3687a = 3;
                    t10 = null;
                    break;
                }
                t10 = u0Var.f3806c.next();
                if (u0Var.f3807d.f3811b.contains(t10)) {
                    break;
                }
            }
            this.f3688b = t10;
            if (this.f3687a == 3) {
                return false;
            }
            this.f3687a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f3687a = 2;
            T t10 = this.f3688b;
            this.f3688b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
