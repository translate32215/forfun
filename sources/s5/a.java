package s5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q5.a;
import v6.e0;
import x4.b0;

/* compiled from: EventMessage */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0242a();

    /* renamed from: g  reason: collision with root package name */
    public static final b0 f24955g;

    /* renamed from: h  reason: collision with root package name */
    public static final b0 f24956h;

    /* renamed from: a  reason: collision with root package name */
    public final String f24957a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24958b;

    /* renamed from: c  reason: collision with root package name */
    public final long f24959c;

    /* renamed from: d  reason: collision with root package name */
    public final long f24960d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f24961e;

    /* renamed from: f  reason: collision with root package name */
    public int f24962f;

    /* renamed from: s5.a$a  reason: collision with other inner class name */
    /* compiled from: EventMessage */
    public class C0242a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    static {
        b0.b bVar = new b0.b();
        bVar.f27425k = "application/id3";
        f24955g = bVar.a();
        b0.b bVar2 = new b0.b();
        bVar2.f27425k = "application/x-scte35";
        f24956h = bVar2.a();
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f24957a = str;
        this.f24958b = str2;
        this.f24959c = j10;
        this.f24960d = j11;
        this.f24961e = bArr;
    }

    public b0 F() {
        String str = this.f24957a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f24956h;
            case 1:
            case 2:
                return f24955g;
            default:
                return null;
        }
    }

    public byte[] I() {
        if (F() != null) {
            return this.f24961e;
        }
        return null;
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
        if (this.f24959c != aVar.f24959c || this.f24960d != aVar.f24960d || !e0.a(this.f24957a, aVar.f24957a) || !e0.a(this.f24958b, aVar.f24958b) || !Arrays.equals(this.f24961e, aVar.f24961e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f24962f == 0) {
            String str = this.f24957a;
            int i10 = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f24958b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f24959c;
            long j11 = this.f24960d;
            this.f24962f = Arrays.hashCode(this.f24961e) + ((((((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f24962f;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("EMSG: scheme=");
        a10.append(this.f24957a);
        a10.append(", id=");
        a10.append(this.f24960d);
        a10.append(", durationMs=");
        a10.append(this.f24959c);
        a10.append(", value=");
        a10.append(this.f24958b);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f24957a);
        parcel.writeString(this.f24958b);
        parcel.writeLong(this.f24959c);
        parcel.writeLong(this.f24960d);
        parcel.writeByteArray(this.f24961e);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f24957a = readString;
        this.f24958b = parcel.readString();
        this.f24959c = parcel.readLong();
        this.f24960d = parcel.readLong();
        this.f24961e = parcel.createByteArray();
    }
}
