package u5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q5.a;
import q5.b;
import x4.b0;

/* compiled from: IcyInfo */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f26035a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26036b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26037c;

    /* compiled from: IcyInfo */
    public class a implements Parcelable.Creator<c> {
        public Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        public Object[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(byte[] bArr, String str, String str2) {
        this.f26035a = bArr;
        this.f26036b = str;
        this.f26037c = str2;
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f26035a, ((c) obj).f26035a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f26035a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f26036b, this.f26037c, Integer.valueOf(this.f26035a.length)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f26035a);
        parcel.writeString(this.f26036b);
        parcel.writeString(this.f26037c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f26035a = createByteArray;
        this.f26036b = parcel.readString();
        this.f26037c = parcel.readString();
    }
}
