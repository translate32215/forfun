package v5;

import android.os.Parcel;
import android.os.Parcelable;
import v6.e0;

/* compiled from: InternalFrame */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26406b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26407c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26408d;

    /* compiled from: InternalFrame */
    public class a implements Parcelable.Creator<i> {
        public Object createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        public Object[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(String str, String str2, String str3) {
        super("----");
        this.f26406b = str;
        this.f26407c = str2;
        this.f26408d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (!e0.a(this.f26407c, iVar.f26407c) || !e0.a(this.f26406b, iVar.f26406b) || !e0.a(this.f26408d, iVar.f26408d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f26406b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26407c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26408d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return this.f26405a + ": domain=" + this.f26406b + ", description=" + this.f26407c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26405a);
        parcel.writeString(this.f26406b);
        parcel.writeString(this.f26408d);
    }

    public i(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f26406b = readString;
        this.f26407c = parcel.readString();
        this.f26408d = parcel.readString();
    }
}
