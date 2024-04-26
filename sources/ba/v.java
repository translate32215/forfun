package ba;

import java.util.Iterator;

/* compiled from: ImmutableMultimap */
public class v extends y0<Object> {

    /* renamed from: a  reason: collision with root package name */
    public Iterator<? extends q<Object>> f3808a;

    /* renamed from: b  reason: collision with root package name */
    public Iterator<Object> f3809b = a0.f3684e;

    public v(w wVar) {
        this.f3808a = wVar.f3812d.values().iterator();
    }

    public boolean hasNext() {
        return this.f3809b.hasNext() || this.f3808a.hasNext();
    }

    public Object next() {
        if (!this.f3809b.hasNext()) {
            this.f3809b = ((q) this.f3808a.next()).iterator();
        }
        return this.f3809b.next();
    }
}
