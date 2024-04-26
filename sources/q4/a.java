package q4;

/* compiled from: DoubleCheck */
public final class a<T> implements jd.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f24146c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile jd.a<T> f24147a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f24148b = f24146c;

    public a(jd.a<T> aVar) {
        this.f24147a = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != f24146c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t10 = this.f24148b;
        T t11 = f24146c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f24148b;
                if (t10 == t11) {
                    t10 = this.f24147a.get();
                    a(this.f24148b, t10);
                    this.f24148b = t10;
                    this.f24147a = null;
                }
            }
        }
        return t10;
    }
}
