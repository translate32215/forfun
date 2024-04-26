package l2;

/* compiled from: NetworkState */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21013a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21014b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21015c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21016d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21013a = z10;
        this.f21014b = z11;
        this.f21015c = z12;
        this.f21016d = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f21013a == bVar.f21013a && this.f21014b == bVar.f21014b && this.f21015c == bVar.f21015c && this.f21016d == bVar.f21016d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f21013a;
        if (this.f21014b) {
            i10 += 16;
        }
        if (this.f21015c) {
            i10 += 256;
        }
        return this.f21016d ? i10 + 4096 : i10;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f21013a), Boolean.valueOf(this.f21014b), Boolean.valueOf(this.f21015c), Boolean.valueOf(this.f21016d)});
    }
}
