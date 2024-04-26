package v5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.e0;

/* compiled from: PrivFrame */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26414b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f26415c;

    /* compiled from: PrivFrame */
    public class a implements Parcelable.Creator<k> {
        public Object createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        public Object[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(String str, byte[] bArr) {
        super("PRIV");
        this.f26414b = str;
        this.f26415c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (!e0.a(this.f26414b, kVar.f26414b) || !Arrays.equals(this.f26415c, kVar.f26415c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f26414b;
        return Arrays.hashCode(this.f26415c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return this.f26405a + ": owner=" + this.f26414b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26414b);
        parcel.writeByteArray(this.f26415c);
    }

    public k(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f26414b = readString;
        this.f26415c = parcel.createByteArray();
    }
}
