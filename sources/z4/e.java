package z4;

import android.support.v4.media.a;
import java.util.Arrays;

/* compiled from: AudioCapabilities */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f28343c = new e(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    public static final e f28344d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: a  reason: collision with root package name */
    public final int[] f28345a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28346b;

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f28345a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f28345a = new int[0];
        }
        this.f28346b = i10;
    }

    public boolean a(int i10) {
        return Arrays.binarySearch(this.f28345a, i10) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!Arrays.equals(this.f28345a, eVar.f28345a) || this.f28346b != eVar.f28346b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f28345a) * 31) + this.f28346b;
    }

    public String toString() {
        StringBuilder a10 = a.a("AudioCapabilities[maxChannelCount=");
        a10.append(this.f28346b);
        a10.append(", supportedEncodings=");
        a10.append(Arrays.toString(this.f28345a));
        a10.append("]");
        return a10.toString();
    }
}
