package v5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.e0;

/* compiled from: ApicFrame */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0265a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26377b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26378c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26379d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f26380e;

    /* renamed from: v5.a$a  reason: collision with other inner class name */
    /* compiled from: ApicFrame */
    public class C0265a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f26377b = str;
        this.f26378c = str2;
        this.f26379d = i10;
        this.f26380e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26379d != aVar.f26379d || !e0.a(this.f26377b, aVar.f26377b) || !e0.a(this.f26378c, aVar.f26378c) || !Arrays.equals(this.f26380e, aVar.f26380e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (527 + this.f26379d) * 31;
        String str = this.f26377b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26378c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f26380e) + ((hashCode + i11) * 31);
    }

    public String toString() {
        return this.f26405a + ": mimeType=" + this.f26377b + ", description=" + this.f26378c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26377b);
        parcel.writeString(this.f26378c);
        parcel.writeInt(this.f26379d);
        parcel.writeByteArray(this.f26380e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f26377b = readString;
        this.f26378c = parcel.readString();
        this.f26379d = parcel.readInt();
        this.f26380e = parcel.createByteArray();
    }
}
