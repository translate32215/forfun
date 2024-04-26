package e8;

import java.util.Iterator;
import k8.o8;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class ba0 implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13909a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Iterator<String> f13910b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13911c;

    public ba0(aa0 aa0) {
        this.f13911c = aa0;
        this.f13910b = aa0.f13670a.iterator();
    }

    public final boolean hasNext() {
        switch (this.f13909a) {
            case 0:
                return this.f13910b.hasNext();
            default:
                return this.f13910b.hasNext();
        }
    }

    public final /* synthetic */ Object next() {
        switch (this.f13909a) {
            case 0:
                return this.f13910b.next();
            default:
                return this.f13910b.next();
        }
    }

    public final void remove() {
        switch (this.f13909a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public ba0(o8 o8Var) {
        this.f13911c = o8Var;
        this.f13910b = o8Var.f20393a.iterator();
    }
}
