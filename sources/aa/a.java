package aa;

import aa.k;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import t.g;

/* compiled from: AbstractIterator */
public abstract class a<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f171a = 2;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    public T f172b;

    public final boolean hasNext() {
        T t10;
        int i10;
        int i11 = this.f171a;
        if (i11 != 4) {
            int f10 = g.f(i11);
            if (f10 == 0) {
                return true;
            }
            if (f10 == 2) {
                return false;
            }
            this.f171a = 4;
            k.a aVar = (k.a) this;
            int i12 = aVar.f189f;
            while (true) {
                int i13 = aVar.f189f;
                if (i13 == -1) {
                    aVar.f171a = 3;
                    t10 = null;
                    break;
                }
                i iVar = (i) aVar;
                int a10 = iVar.f181h.f182a.a(iVar.f186c, i13);
                if (a10 == -1) {
                    a10 = aVar.f186c.length();
                    aVar.f189f = -1;
                } else {
                    aVar.f189f = a10 + 1;
                }
                int i14 = aVar.f189f;
                if (i14 == i12) {
                    int i15 = i14 + 1;
                    aVar.f189f = i15;
                    if (i15 > aVar.f186c.length()) {
                        aVar.f189f = -1;
                    }
                } else {
                    while (i12 < a10 && aVar.f187d.b(aVar.f186c.charAt(i12))) {
                        i12++;
                    }
                    while (i10 > i12) {
                        int i16 = i10 - 1;
                        if (!aVar.f187d.b(aVar.f186c.charAt(i16))) {
                            break;
                        }
                        a10 = i16;
                    }
                    if (!aVar.f188e || i12 != i10) {
                        int i17 = aVar.f190g;
                    } else {
                        i12 = aVar.f189f;
                    }
                }
            }
            int i172 = aVar.f190g;
            if (i172 == 1) {
                i10 = aVar.f186c.length();
                aVar.f189f = -1;
                while (i10 > i12) {
                    int i18 = i10 - 1;
                    if (!aVar.f187d.b(aVar.f186c.charAt(i18))) {
                        break;
                    }
                    i10 = i18;
                }
            } else {
                aVar.f190g = i172 - 1;
            }
            t10 = aVar.f186c.subSequence(i12, i10).toString();
            this.f172b = t10;
            if (this.f171a == 3) {
                return false;
            }
            this.f171a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.f171a = 2;
            T t10 = this.f172b;
            this.f172b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
