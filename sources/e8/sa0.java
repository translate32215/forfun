package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class sa0<T> implements ta0<T> {

    /* renamed from: a  reason: collision with root package name */
    public ab0<T> f16386a;

    public static <T> void a(ab0<T> ab0, ab0<T> ab02) {
        sa0 sa0 = (sa0) ab0;
        if (sa0.f16386a == null) {
            sa0.f16386a = ab02;
            return;
        }
        throw new IllegalStateException();
    }

    public final T get() {
        ab0<T> ab0 = this.f16386a;
        if (ab0 != null) {
            return ab0.get();
        }
        throw new IllegalStateException();
    }
}
