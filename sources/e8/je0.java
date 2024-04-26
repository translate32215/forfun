package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.xt;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class je0 extends xt {
    public static final Parcelable.Creator<je0> CREATOR = new le0();

    /* renamed from: b  reason: collision with root package name */
    public final String f15139b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15140c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15141d;

    public je0(String str, String str2, String str3) {
        super("COMM");
        this.f15139b = str;
        this.f15140c = str2;
        this.f15141d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && je0.class == obj.getClass()) {
            je0 je0 = (je0) obj;
            return eg0.d(this.f15140c, je0.f15140c) && eg0.d(this.f15139b, je0.f15139b) && eg0.d(this.f15141d, je0.f15141d);
        }
    }

    public final int hashCode() {
        String str = this.f15139b;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f15140c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15141d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8575a);
        parcel.writeString(this.f15139b);
        parcel.writeString(this.f15141d);
    }

    public je0(Parcel parcel) {
        super("COMM");
        this.f15139b = parcel.readString();
        this.f15140c = parcel.readString();
        this.f15141d = parcel.readString();
    }
}
