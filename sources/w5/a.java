package w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o1.q;
import q5.a;
import q5.b;
import v6.e0;
import x4.b0;

/* compiled from: MdtaMetadataEntry */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0271a();

    /* renamed from: a  reason: collision with root package name */
    public final String f27002a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f27003b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27004c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27005d;

    /* renamed from: w5.a$a  reason: collision with other inner class name */
    /* compiled from: MdtaMetadataEntry */
    public class C0271a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, (C0271a) null);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f27002a = str;
        this.f27003b = bArr;
        this.f27004c = i10;
        this.f27005d = i11;
    }

    public /* synthetic */ b0 F() {
        return b.b(this);
    }

    public /* synthetic */ byte[] I() {
        return b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f27002a.equals(aVar.f27002a) || !Arrays.equals(this.f27003b, aVar.f27003b) || this.f27004c != aVar.f27004c || this.f27005d != aVar.f27005d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f27003b) + q.a(this.f27002a, 527, 31)) * 31) + this.f27004c) * 31) + this.f27005d;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("mdta: key=");
        a10.append(this.f27002a);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27002a);
        parcel.writeByteArray(this.f27003b);
        parcel.writeInt(this.f27004c);
        parcel.writeInt(this.f27005d);
    }

    public a(Parcel parcel, C0271a aVar) {
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f27002a = readString;
        this.f27003b = parcel.createByteArray();
        this.f27004c = parcel.readInt();
        this.f27005d = parcel.readInt();
    }
}
