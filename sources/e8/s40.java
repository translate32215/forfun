package e8;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class s40 extends d50<T> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16372a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16373b;

    public s40(Object obj) {
        this.f16373b = obj;
    }

    public final boolean hasNext() {
        return !this.f16372a;
    }

    public final T next() {
        if (!this.f16372a) {
            this.f16372a = true;
            return this.f16373b;
        }
        throw new NoSuchElementException();
    }
}
