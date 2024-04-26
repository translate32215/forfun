package o2;

/* compiled from: SystemIdInfo */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f22855a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22856b;

    public d(String str, int i10) {
        this.f22855a = str;
        this.f22856b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f22856b != dVar.f22856b) {
            return false;
        }
        return this.f22855a.equals(dVar.f22855a);
    }

    public int hashCode() {
        return (this.f22855a.hashCode() * 31) + this.f22856b;
    }
}
