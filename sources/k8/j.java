package k8;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class j implements Iterator<o> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterator f20270a;

    public j(Iterator it) {
        this.f20270a = it;
    }

    public final boolean hasNext() {
        return this.f20270a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new r((String) this.f20270a.next());
    }
}
