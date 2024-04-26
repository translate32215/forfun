package r6;

import java.util.Arrays;

/* compiled from: TrackSelectionArray */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f24663a;

    /* renamed from: b  reason: collision with root package name */
    public final k[] f24664b;

    /* renamed from: c  reason: collision with root package name */
    public int f24665c;

    public l(k... kVarArr) {
        this.f24664b = kVarArr;
        this.f24663a = kVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f24664b, ((l) obj).f24664b);
    }

    public int hashCode() {
        if (this.f24665c == 0) {
            this.f24665c = 527 + Arrays.hashCode(this.f24664b);
        }
        return this.f24665c;
    }
}
