package ud;

/* compiled from: PackageReference.kt */
public final class m implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f26194a;

    public m(Class<?> cls, String str) {
        k.f(cls, "jClass");
        k.f(str, "moduleName");
        this.f26194a = cls;
    }

    public Class<?> a() {
        return this.f26194a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && k.a(this.f26194a, ((m) obj).f26194a);
    }

    public int hashCode() {
        return this.f26194a.hashCode();
    }

    public String toString() {
        return this.f26194a.toString() + " (Kotlin reflection is not available)";
    }
}
