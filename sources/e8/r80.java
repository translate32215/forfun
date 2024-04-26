package e8;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class r80 implements a90 {

    /* renamed from: a  reason: collision with root package name */
    public a90[] f16249a;

    public r80(a90... a90Arr) {
        this.f16249a = a90Arr;
    }

    public final boolean a(Class<?> cls) {
        for (a90 a10 : this.f16249a) {
            if (a10.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final b90 b(Class<?> cls) {
        for (a90 a90 : this.f16249a) {
            if (a90.a(cls)) {
                return a90.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
