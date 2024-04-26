package e8;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bf0 {

    /* renamed from: d  reason: collision with root package name */
    public static final bf0 f14005d = new bf0(new ye0[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f14006a;

    /* renamed from: b  reason: collision with root package name */
    public final ye0[] f14007b;

    /* renamed from: c  reason: collision with root package name */
    public int f14008c;

    public bf0(ye0... ye0Arr) {
        this.f14007b = ye0Arr;
        this.f14006a = ye0Arr.length;
    }

    public final int a(ye0 ye0) {
        for (int i10 = 0; i10 < this.f14006a; i10++) {
            if (this.f14007b[i10] == ye0) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf0.class == obj.getClass()) {
            bf0 bf0 = (bf0) obj;
            return this.f14006a == bf0.f14006a && Arrays.equals(this.f14007b, bf0.f14007b);
        }
    }

    public final int hashCode() {
        if (this.f14008c == 0) {
            this.f14008c = Arrays.hashCode(this.f14007b);
        }
        return this.f14008c;
    }
}
