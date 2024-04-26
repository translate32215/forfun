package r5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.e;
import q5.a;
import q5.b;
import x4.b0;

/* compiled from: AppInfoTable */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0233a();

    /* renamed from: a  reason: collision with root package name */
    public final int f24544a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24545b;

    /* renamed from: r5.a$a  reason: collision with other inner class name */
    /* compiled from: AppInfoTable */
    public class C0233a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new a(parcel.readInt(), readString);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str) {
        this.f24544a = i10;
        this.f24545b = str;
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

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Ait(controlCode=");
        a10.append(this.f24544a);
        a10.append(",url=");
        return e.a(a10, this.f24545b, ")");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f24545b);
        parcel.writeInt(this.f24544a);
    }
}
