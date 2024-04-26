package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.xt;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ie0 extends xt {
    public static final Parcelable.Creator<ie0> CREATOR = new ke0();

    /* renamed from: b  reason: collision with root package name */
    public final String f15028b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15029c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15030d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f15031e;

    public ie0(String str, byte[] bArr) {
        super("APIC");
        this.f15028b = str;
        this.f15029c = null;
        this.f15030d = 3;
        this.f15031e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ie0.class == obj.getClass()) {
            ie0 ie0 = (ie0) obj;
            return this.f15030d == ie0.f15030d && eg0.d(this.f15028b, ie0.f15028b) && eg0.d(this.f15029c, ie0.f15029c) && Arrays.equals(this.f15031e, ie0.f15031e);
        }
    }

    public final int hashCode() {
        int i10 = (this.f15030d + 527) * 31;
        String str = this.f15028b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15029c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f15031e) + ((hashCode + i11) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15028b);
        parcel.writeString(this.f15029c);
        parcel.writeInt(this.f15030d);
        parcel.writeByteArray(this.f15031e);
    }

    public ie0(Parcel parcel) {
        super("APIC");
        this.f15028b = parcel.readString();
        this.f15029c = parcel.readString();
        this.f15030d = parcel.readInt();
        this.f15031e = parcel.createByteArray();
    }
}
