package t5;

import android.os.Parcel;
import android.os.Parcelable;
import o1.q;
import q5.a;
import v6.e0;
import x4.b0;

/* compiled from: VorbisComment */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f25747a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25748b;

    /* compiled from: VorbisComment */
    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, String str2) {
        this.f25747a = str;
        this.f25748b = str2;
    }

    public /* synthetic */ b0 F() {
        return q5.b.b(this);
    }

    public /* synthetic */ byte[] I() {
        return q5.b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f25747a.equals(bVar.f25747a) || !this.f25748b.equals(bVar.f25748b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f25748b.hashCode() + q.a(this.f25747a, 527, 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("VC: ");
        a10.append(this.f25747a);
        a10.append("=");
        a10.append(this.f25748b);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25747a);
        parcel.writeString(this.f25748b);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f25747a = readString;
        this.f25748b = parcel.readString();
    }
}
