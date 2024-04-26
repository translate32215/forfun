package e8;

import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.ug;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class r40<E> {

    /* renamed from: a  reason: collision with root package name */
    public final int f16242a;

    /* renamed from: b  reason: collision with root package name */
    public int f16243b;

    /* renamed from: c  reason: collision with root package name */
    public final ug<E> f16244c;

    public r40(ug<E> ugVar, int i10) {
        int size = ugVar.size();
        pg.g(i10, size);
        this.f16242a = size;
        this.f16243b = i10;
        this.f16244c = ugVar;
    }

    public final boolean hasNext() {
        return this.f16243b < this.f16242a;
    }

    public final boolean hasPrevious() {
        return this.f16243b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f16243b;
            this.f16243b = i10 + 1;
            return this.f16244c.get(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f16243b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f16243b - 1;
            this.f16243b = i10;
            return this.f16244c.get(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f16243b - 1;
    }
}
