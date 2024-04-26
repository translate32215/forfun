package k8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class d implements Iterator<o> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterator f20101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Iterator f20102b;

    public d(Iterator it, Iterator it2) {
        this.f20101a = it;
        this.f20102b = it2;
    }

    public final boolean hasNext() {
        if (this.f20101a.hasNext()) {
            return true;
        }
        return this.f20102b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f20101a.hasNext()) {
            return new r(((Integer) this.f20101a.next()).toString());
        }
        if (this.f20102b.hasNext()) {
            return new r((String) this.f20102b.next());
        }
        throw new NoSuchElementException();
    }
}
