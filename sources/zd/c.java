package zd;

/* compiled from: Ranges.kt */
public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f28846d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final c f28847e = new c(1, 0);

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(this.f28839a == cVar.f28839a && this.f28840b == cVar.f28840b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f28839a * 31) + this.f28840b;
    }

    public boolean isEmpty() {
        return this.f28839a > this.f28840b;
    }

    public boolean o(int i10) {
        return this.f28839a <= i10 && i10 <= this.f28840b;
    }

    public Integer q() {
        return Integer.valueOf(this.f28840b);
    }

    public Integer s() {
        return Integer.valueOf(this.f28839a);
    }

    public String toString() {
        return this.f28839a + ".." + this.f28840b;
    }
}
