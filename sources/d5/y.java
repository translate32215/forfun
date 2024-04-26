package d5;

import android.support.v4.media.a;

/* compiled from: SeekPoint */
public final class y {

    /* renamed from: c  reason: collision with root package name */
    public static final y f13068c = new y(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f13069a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13070b;

    public y(long j10, long j11) {
        this.f13069a = j10;
        this.f13070b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f13069a == yVar.f13069a && this.f13070b == yVar.f13070b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f13069a) * 31) + ((int) this.f13070b);
    }

    public String toString() {
        StringBuilder a10 = a.a("[timeUs=");
        a10.append(this.f13069a);
        a10.append(", position=");
        a10.append(this.f13070b);
        a10.append("]");
        return a10.toString();
    }
}
