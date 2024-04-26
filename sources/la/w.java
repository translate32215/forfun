package la;

import ua.a;

/* compiled from: OptionalProvider */
public class w<T> implements a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f21231c = 0;

    /* renamed from: a  reason: collision with root package name */
    public u f21232a;

    /* renamed from: b  reason: collision with root package name */
    public volatile a<T> f21233b;

    public w(u uVar, a<T> aVar) {
        this.f21232a = uVar;
        this.f21233b = aVar;
    }

    public T get() {
        return this.f21233b.get();
    }
}
