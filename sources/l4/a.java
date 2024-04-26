package l4;

/* compiled from: AutoValue_Event */
public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f21034a;

    public a(Integer num, T t10, d dVar) {
        if (t10 != null) {
            this.f21034a = t10;
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public Integer a() {
        return null;
    }

    public T b() {
        return this.f21034a;
    }

    public d c() {
        return d.VERY_LOW;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.a() != null || !this.f21034a.equals(cVar.b()) || !d.VERY_LOW.equals(cVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return d.VERY_LOW.hashCode() ^ ((-721379959 ^ this.f21034a.hashCode()) * 1000003);
    }

    public String toString() {
        return "Event{code=" + null + ", payload=" + this.f21034a + ", priority=" + d.VERY_LOW + "}";
    }
}
