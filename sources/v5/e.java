package v5;

import android.os.Parcel;
import android.os.Parcelable;
import v6.e0;

/* compiled from: CommentFrame */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26393b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26394c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26395d;

    /* compiled from: CommentFrame */
    public class a implements Parcelable.Creator<e> {
        public Object createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        public Object[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f26393b = str;
        this.f26394c = str2;
        this.f26395d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!e0.a(this.f26394c, eVar.f26394c) || !e0.a(this.f26393b, eVar.f26393b) || !e0.a(this.f26395d, eVar.f26395d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f26393b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26394c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26395d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f26405a + ": language=" + this.f26393b + ", description=" + this.f26394c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26405a);
        parcel.writeString(this.f26393b);
        parcel.writeString(this.f26395d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f26393b = readString;
        this.f26394c = parcel.readString();
        this.f26395d = parcel.readString();
    }
}
