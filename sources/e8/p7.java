package e8;

import android.os.Parcel;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.internal.ads.m5;
import com.google.android.gms.internal.ads.os;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p7 extends os implements m5 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15873a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15874b;

    public p7(String str, int i10) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f15873a = str;
        this.f15874b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p7)) {
            p7 p7Var = (p7) obj;
            if (!h.a(this.f15873a, p7Var.f15873a) || !h.a(Integer.valueOf(this.f15874b), Integer.valueOf(p7Var.f15874b))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String o() {
        return this.f15873a;
    }

    public final int q0() {
        return this.f15874b;
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String str = this.f15873a;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = this.f15874b;
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        }
    }
}
