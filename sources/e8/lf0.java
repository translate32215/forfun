package e8;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lf0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15383a;

    /* renamed from: b  reason: collision with root package name */
    public final kf0[] f15384b;

    /* renamed from: c  reason: collision with root package name */
    public int f15385c;

    public lf0(kf0... kf0Arr) {
        this.f15384b = kf0Arr;
        this.f15383a = kf0Arr.length;
    }

    public final kf0 a(int i10) {
        return this.f15384b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lf0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f15384b, ((lf0) obj).f15384b);
    }

    public final int hashCode() {
        if (this.f15385c == 0) {
            this.f15385c = Arrays.hashCode(this.f15384b) + 527;
        }
        return this.f15385c;
    }
}
