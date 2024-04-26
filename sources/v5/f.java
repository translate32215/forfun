package v5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.e0;

/* compiled from: GeobFrame */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26396b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26397c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26398d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f26399e;

    /* compiled from: GeobFrame */
    public class a implements Parcelable.Creator<f> {
        public Object createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        public Object[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f26396b = str;
        this.f26397c = str2;
        this.f26398d = str3;
        this.f26399e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!e0.a(this.f26396b, fVar.f26396b) || !e0.a(this.f26397c, fVar.f26397c) || !e0.a(this.f26398d, fVar.f26398d) || !Arrays.equals(this.f26399e, fVar.f26399e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f26396b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26397c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26398d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return Arrays.hashCode(this.f26399e) + ((hashCode2 + i10) * 31);
    }

    public String toString() {
        return this.f26405a + ": mimeType=" + this.f26396b + ", filename=" + this.f26397c + ", description=" + this.f26398d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26396b);
        parcel.writeString(this.f26397c);
        parcel.writeString(this.f26398d);
        parcel.writeByteArray(this.f26399e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f26396b = readString;
        this.f26397c = parcel.readString();
        this.f26398d = parcel.readString();
        this.f26399e = parcel.createByteArray();
    }
}
