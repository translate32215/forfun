package e8;

import androidx.appcompat.widget.p;
import java.util.Arrays;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class cf0 implements kf0 {

    /* renamed from: a  reason: collision with root package name */
    public final ye0 f14130a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14131b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f14132c;

    /* renamed from: d  reason: collision with root package name */
    public final bc0[] f14133d;

    /* renamed from: e  reason: collision with root package name */
    public int f14134e;

    public cf0(ye0 ye0, int... iArr) {
        a.c(iArr.length > 0);
        ye0.getClass();
        this.f14130a = ye0;
        int length = iArr.length;
        this.f14131b = length;
        this.f14133d = new bc0[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f14133d[i10] = ye0.f17621b[iArr[i10]];
        }
        Arrays.sort(this.f14133d, new df0((p) null));
        this.f14132c = new int[this.f14131b];
        int i11 = 0;
        while (true) {
            int i12 = this.f14131b;
            if (i11 < i12) {
                int[] iArr2 = this.f14132c;
                bc0 bc0 = this.f14133d[i11];
                int i13 = 0;
                while (true) {
                    bc0[] bc0Arr = ye0.f17621b;
                    if (i13 >= bc0Arr.length) {
                        i13 = -1;
                        break;
                    } else if (bc0 == bc0Arr[i13]) {
                        break;
                    } else {
                        i13++;
                    }
                }
                iArr2[i11] = i13;
                i11++;
            } else {
                long[] jArr = new long[i12];
                return;
            }
        }
    }

    public final int a(int i10) {
        return this.f14132c[0];
    }

    public final ye0 b() {
        return this.f14130a;
    }

    public final bc0 c(int i10) {
        return this.f14133d[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cf0 cf0 = (cf0) obj;
            return this.f14130a == cf0.f14130a && Arrays.equals(this.f14132c, cf0.f14132c);
        }
    }

    public int hashCode() {
        if (this.f14134e == 0) {
            this.f14134e = Arrays.hashCode(this.f14132c) + (System.identityHashCode(this.f14130a) * 31);
        }
        return this.f14134e;
    }

    public final int length() {
        return this.f14132c.length;
    }
}
