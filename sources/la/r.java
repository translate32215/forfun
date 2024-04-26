package la;

import ua.a;

/* compiled from: Lazy */
public class r<T> implements a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f21224c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f21225a = f21224c;

    /* renamed from: b  reason: collision with root package name */
    public volatile a<T> f21226b;

    public r(a<T> aVar) {
        this.f21226b = aVar;
    }

    public T get() {
        T t10 = this.f21225a;
        T t11 = f21224c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f21225a;
                if (t10 == t11) {
                    t10 = this.f21226b.get();
                    this.f21225a = t10;
                    this.f21226b = null;
                }
            }
        }
        return t10;
    }
}
