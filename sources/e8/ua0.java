package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ua0<T> implements pa0<T>, ab0<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f16865c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile ab0<T> f16866a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f16867b = f16865c;

    public ua0(ab0<T> ab0) {
        this.f16866a = ab0;
    }

    public static <P extends ab0<T>, T> pa0<T> a(P p10) {
        if (p10 instanceof pa0) {
            return (pa0) p10;
        }
        p10.getClass();
        return new ua0(p10);
    }

    public final T get() {
        T t10 = this.f16867b;
        T t11 = f16865c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f16867b;
                if (t10 == t11) {
                    t10 = this.f16866a.get();
                    T t12 = this.f16867b;
                    if (t12 != t11) {
                        if (t12 != t10) {
                            String valueOf = String.valueOf(t12);
                            String valueOf2 = String.valueOf(t10);
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb2.append("Scoped provider was invoked recursively returning different results: ");
                            sb2.append(valueOf);
                            sb2.append(" & ");
                            sb2.append(valueOf2);
                            sb2.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb2.toString());
                        }
                    }
                    this.f16867b = t10;
                    this.f16866a = null;
                }
            }
        }
        return t10;
    }
}
