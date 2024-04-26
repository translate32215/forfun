package y5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: StreamKey */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f28103a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28104b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28105c;

    /* compiled from: StreamKey */
    public class a implements Parcelable.Creator<c> {
        public Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        public Object[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10, int i11, int i12) {
        this.f28103a = i10;
        this.f28104b = i11;
        this.f28105c = i12;
    }

    public int compareTo(Object obj) {
        c cVar = (c) obj;
        int i10 = this.f28103a - cVar.f28103a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f28104b - cVar.f28104b;
        return i11 == 0 ? this.f28105c - cVar.f28105c : i11;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f28103a == cVar.f28103a && this.f28104b == cVar.f28104b && this.f28105c == cVar.f28105c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f28103a * 31) + this.f28104b) * 31) + this.f28105c;
    }

    public String toString() {
        return this.f28103a + "." + this.f28104b + "." + this.f28105c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28103a);
        parcel.writeInt(this.f28104b);
        parcel.writeInt(this.f28105c);
    }

    public c(Parcel parcel) {
        this.f28103a = parcel.readInt();
        this.f28104b = parcel.readInt();
        this.f28105c = parcel.readInt();
    }
}
