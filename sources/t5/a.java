package t5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o1.q;
import q5.a;
import q5.b;
import v6.e0;
import x4.b0;

/* compiled from: PictureFrame */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0247a();

    /* renamed from: a  reason: collision with root package name */
    public final int f25739a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25740b;

    /* renamed from: c  reason: collision with root package name */
    public final String f25741c;

    /* renamed from: d  reason: collision with root package name */
    public final int f25742d;

    /* renamed from: e  reason: collision with root package name */
    public final int f25743e;

    /* renamed from: f  reason: collision with root package name */
    public final int f25744f;

    /* renamed from: g  reason: collision with root package name */
    public final int f25745g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f25746h;

    /* renamed from: t5.a$a  reason: collision with other inner class name */
    /* compiled from: PictureFrame */
    public class C0247a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f25739a = i10;
        this.f25740b = str;
        this.f25741c = str2;
        this.f25742d = i11;
        this.f25743e = i12;
        this.f25744f = i13;
        this.f25745g = i14;
        this.f25746h = bArr;
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
        if (this.f25739a == aVar.f25739a && this.f25740b.equals(aVar.f25740b) && this.f25741c.equals(aVar.f25741c) && this.f25742d == aVar.f25742d && this.f25743e == aVar.f25743e && this.f25744f == aVar.f25744f && this.f25745g == aVar.f25745g && Arrays.equals(this.f25746h, aVar.f25746h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int a10 = q.a(this.f25740b, (this.f25739a + 527) * 31, 31);
        return Arrays.hashCode(this.f25746h) + ((((((((q.a(this.f25741c, a10, 31) + this.f25742d) * 31) + this.f25743e) * 31) + this.f25744f) * 31) + this.f25745g) * 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Picture: mimeType=");
        a10.append(this.f25740b);
        a10.append(", description=");
        a10.append(this.f25741c);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f25739a);
        parcel.writeString(this.f25740b);
        parcel.writeString(this.f25741c);
        parcel.writeInt(this.f25742d);
        parcel.writeInt(this.f25743e);
        parcel.writeInt(this.f25744f);
        parcel.writeInt(this.f25745g);
        parcel.writeByteArray(this.f25746h);
    }

    public a(Parcel parcel) {
        this.f25739a = parcel.readInt();
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f25740b = readString;
        this.f25741c = parcel.readString();
        this.f25742d = parcel.readInt();
        this.f25743e = parcel.readInt();
        this.f25744f = parcel.readInt();
        this.f25745g = parcel.readInt();
        this.f25746h = parcel.createByteArray();
    }
}
