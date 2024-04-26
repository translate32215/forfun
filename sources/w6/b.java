package w6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.e0;

/* compiled from: ColorInfo */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f27023a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27024b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27025c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f27026d;

    /* renamed from: e  reason: collision with root package name */
    public int f27027e;

    /* compiled from: ColorInfo */
    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f27023a = i10;
        this.f27024b = i11;
        this.f27025c = i12;
        this.f27026d = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f27023a == bVar.f27023a && this.f27024b == bVar.f27024b && this.f27025c == bVar.f27025c && Arrays.equals(this.f27026d, bVar.f27026d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f27027e == 0) {
            this.f27027e = Arrays.hashCode(this.f27026d) + ((((((527 + this.f27023a) * 31) + this.f27024b) * 31) + this.f27025c) * 31);
        }
        return this.f27027e;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("ColorInfo(");
        a10.append(this.f27023a);
        a10.append(", ");
        a10.append(this.f27024b);
        a10.append(", ");
        a10.append(this.f27025c);
        a10.append(", ");
        a10.append(this.f27026d != null);
        a10.append(")");
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f27023a);
        parcel.writeInt(this.f27024b);
        parcel.writeInt(this.f27025c);
        int i11 = this.f27026d != null ? 1 : 0;
        int i12 = e0.f26436a;
        parcel.writeInt(i11);
        byte[] bArr = this.f27026d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public b(Parcel parcel) {
        this.f27023a = parcel.readInt();
        this.f27024b = parcel.readInt();
        this.f27025c = parcel.readInt();
        int i10 = e0.f26436a;
        this.f27026d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
