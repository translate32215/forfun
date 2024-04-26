package w5;

import android.os.Parcel;
import android.os.Parcelable;
import q5.a;
import q5.b;
import x4.b0;

/* compiled from: SmtaMetadataEntry */
public final class d implements a.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f27015a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27016b;

    /* compiled from: SmtaMetadataEntry */
    public class a implements Parcelable.Creator<d> {
        public Object createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        public Object[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(float f10, int i10) {
        this.f27015a = f10;
        this.f27016b = i10;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f27015a == dVar.f27015a && this.f27016b == dVar.f27016b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.valueOf(this.f27015a).hashCode()) * 31) + this.f27016b;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("smta: captureFrameRate=");
        a10.append(this.f27015a);
        a10.append(", svcTemporalLayerCount=");
        a10.append(this.f27016b);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f27015a);
        parcel.writeInt(this.f27016b);
    }

    public d(Parcel parcel, a aVar) {
        this.f27015a = parcel.readFloat();
        this.f27016b = parcel.readInt();
    }
}
