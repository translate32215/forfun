package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wa0<T> implements pa0<T>, ta0<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final wa0<Object> f17233b = new wa0<>((Object) null);

    /* renamed from: a  reason: collision with root package name */
    public final T f17234a;

    public wa0(T t10) {
        this.f17234a = t10;
    }

    public static <T> ta0<T> a(T t10) {
        if (t10 != null) {
            return new wa0(t10);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static <T> ta0<T> b(T t10) {
        if (t10 == null) {
            return f17233b;
        }
        return new wa0(t10);
    }

    public final T get() {
        return this.f17234a;
    }
}
