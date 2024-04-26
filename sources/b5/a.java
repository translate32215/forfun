package b5;

/* compiled from: DeviceInfo */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3563a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3564b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3565c;

    public a(int i10, int i11, int i12) {
        this.f3563a = i10;
        this.f3564b = i11;
        this.f3565c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3563a == aVar.f3563a && this.f3564b == aVar.f3564b && this.f3565c == aVar.f3565c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f3563a) * 31) + this.f3564b) * 31) + this.f3565c;
    }
}
