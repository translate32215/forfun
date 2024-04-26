package v5;

import android.os.Parcel;
import android.os.Parcelable;
import o1.q;
import v6.e0;

/* compiled from: TextInformationFrame */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26416b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26417c;

    /* compiled from: TextInformationFrame */
    public class a implements Parcelable.Creator<l> {
        public Object createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        public Object[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(String str, String str2, String str3) {
        super(str);
        this.f26416b = str2;
        this.f26417c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f26405a.equals(lVar.f26405a) || !e0.a(this.f26416b, lVar.f26416b) || !e0.a(this.f26417c, lVar.f26417c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int a10 = q.a(this.f26405a, 527, 31);
        String str = this.f26416b;
        int i10 = 0;
        int hashCode = (a10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26417c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return this.f26405a + ": description=" + this.f26416b + ": value=" + this.f26417c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26405a);
        parcel.writeString(this.f26416b);
        parcel.writeString(this.f26417c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = v6.e0.f26436a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f26416b = r0
            java.lang.String r3 = r3.readString()
            r2.f26417c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.l.<init>(android.os.Parcel):void");
    }
}
