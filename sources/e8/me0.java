package e8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.xt;
import o1.q;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class me0 extends xt {
    public static final Parcelable.Creator<me0> CREATOR = new ne0();

    /* renamed from: b  reason: collision with root package name */
    public final String f15499b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15500c;

    public me0(String str, String str2) {
        super(str);
        this.f15499b = null;
        this.f15500c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && me0.class == obj.getClass()) {
            me0 me0 = (me0) obj;
            return this.f8575a.equals(me0.f8575a) && eg0.d(this.f15499b, me0.f15499b) && eg0.d(this.f15500c, me0.f15500c);
        }
    }

    public final int hashCode() {
        int a10 = q.a(this.f8575a, 527, 31);
        String str = this.f15499b;
        int i10 = 0;
        int hashCode = (a10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15500c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8575a);
        parcel.writeString(this.f15499b);
        parcel.writeString(this.f15500c);
    }

    public me0(Parcel parcel) {
        super(parcel.readString());
        this.f15499b = parcel.readString();
        this.f15500c = parcel.readString();
    }
}
