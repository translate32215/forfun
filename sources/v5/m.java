package v5;

import android.os.Parcel;
import android.os.Parcelable;
import o1.q;
import v6.e0;

/* compiled from: UrlLinkFrame */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26418b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26419c;

    /* compiled from: UrlLinkFrame */
    public class a implements Parcelable.Creator<m> {
        public Object createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        public Object[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f26418b = str2;
        this.f26419c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f26405a.equals(mVar.f26405a) || !e0.a(this.f26418b, mVar.f26418b) || !e0.a(this.f26419c, mVar.f26419c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int a10 = q.a(this.f26405a, 527, 31);
        String str = this.f26418b;
        int i10 = 0;
        int hashCode = (a10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f26419c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return this.f26405a + ": url=" + this.f26419c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26405a);
        parcel.writeString(this.f26418b);
        parcel.writeString(this.f26419c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = v6.e0.f26436a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f26418b = r0
            java.lang.String r3 = r3.readString()
            r2.f26419c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.m.<init>(android.os.Parcel):void");
    }
}
