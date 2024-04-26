package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class za0<T> implements ab0<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f17704c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile ab0<T> f17705a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f17706b = f17704c;

    public za0(ab0<T> ab0) {
        this.f17705a = ab0;
    }

    public static <P extends ab0<T>, T> ab0<T> a(P p10) {
        return ((p10 instanceof za0) || (p10 instanceof ua0)) ? p10 : new za0(p10);
    }

    public final T get() {
        T t10 = this.f17706b;
        if (t10 != f17704c) {
            return t10;
        }
        ab0<T> ab0 = this.f17705a;
        if (ab0 == null) {
            return this.f17706b;
        }
        T t11 = ab0.get();
        this.f17706b = t11;
        this.f17705a = null;
        return t11;
    }
}
