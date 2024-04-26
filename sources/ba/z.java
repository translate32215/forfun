package ba;

import java.util.NoSuchElementException;

/* compiled from: Iterators */
public final class z extends y0<Object> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3820a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3821b;

    public z(Object obj) {
        this.f3821b = obj;
    }

    public boolean hasNext() {
        return !this.f3820a;
    }

    public Object next() {
        if (!this.f3820a) {
            this.f3820a = true;
            return this.f3821b;
        }
        throw new NoSuchElementException();
    }
}
