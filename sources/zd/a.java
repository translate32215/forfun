package zd;

import androidx.activity.k;
import ld.q;

/* compiled from: Progressions.kt */
public class a implements Iterable<Integer>, vd.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f28839a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28840b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28841c;

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f28839a = i10;
            if (i12 > 0) {
                if (i10 < i11) {
                    i11 -= k.b(k.b(i11, i12) - k.b(i10, i12), i12);
                }
            } else if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i10 > i11) {
                int i13 = -i12;
                i11 += k.b(k.b(i10, i13) - k.b(i11, i13), i13);
            }
            this.f28840b = i11;
            this.f28841c = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public static final a c(int i10, int i11, int i12) {
        return new a(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f28839a == aVar.f28839a && this.f28840b == aVar.f28840b && this.f28841c == aVar.f28841c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f28839a;
    }

    public final int h() {
        return this.f28840b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f28839a * 31) + this.f28840b) * 31) + this.f28841c;
    }

    public final int i() {
        return this.f28841c;
    }

    public boolean isEmpty() {
        if (this.f28841c > 0) {
            if (this.f28839a > this.f28840b) {
                return true;
            }
        } else if (this.f28839a < this.f28840b) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public q iterator() {
        return new b(this.f28839a, this.f28840b, this.f28841c);
    }

    public String toString() {
        int i10;
        StringBuilder sb2;
        if (this.f28841c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f28839a);
            sb2.append("..");
            sb2.append(this.f28840b);
            sb2.append(" step ");
            i10 = this.f28841c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f28839a);
            sb2.append(" downTo ");
            sb2.append(this.f28840b);
            sb2.append(" step ");
            i10 = -this.f28841c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
