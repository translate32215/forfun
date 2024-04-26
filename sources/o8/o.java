package o8;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class o implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    public final Iterator<String> f23370a;

    public o(p pVar) {
        this.f23370a = pVar.f23382a.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return this.f23370a.next();
    }

    public final boolean hasNext() {
        return this.f23370a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
