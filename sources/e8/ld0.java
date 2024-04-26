package e8;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ld0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f15380a;

    public ld0(byte[] bArr) {
        this.f15380a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ld0.class == obj.getClass() && Arrays.equals(this.f15380a, ((ld0) obj).f15380a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15380a) + 31;
    }
}
