package w5;

import android.os.Parcel;
import android.os.Parcelable;
import q5.a;
import x4.b0;

/* compiled from: MotionPhotoMetadata */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f27006a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27007b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27008c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27009d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27010e;

    /* compiled from: MotionPhotoMetadata */
    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        public Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f27006a = j10;
        this.f27007b = j11;
        this.f27008c = j12;
        this.f27009d = j13;
        this.f27010e = j14;
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
        if (this.f27006a == bVar.f27006a && this.f27007b == bVar.f27007b && this.f27008c == bVar.f27008c && this.f27009d == bVar.f27009d && this.f27010e == bVar.f27010e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int d10 = u.b.d(this.f27007b);
        int d11 = u.b.d(this.f27008c);
        int d12 = u.b.d(this.f27009d);
        return u.b.d(this.f27010e) + ((d12 + ((d11 + ((d10 + ((u.b.d(this.f27006a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Motion photo metadata: photoStartPosition=");
        a10.append(this.f27006a);
        a10.append(", photoSize=");
        a10.append(this.f27007b);
        a10.append(", photoPresentationTimestampUs=");
        a10.append(this.f27008c);
        a10.append(", videoStartPosition=");
        a10.append(this.f27009d);
        a10.append(", videoSize=");
        a10.append(this.f27010e);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27006a);
        parcel.writeLong(this.f27007b);
        parcel.writeLong(this.f27008c);
        parcel.writeLong(this.f27009d);
        parcel.writeLong(this.f27010e);
    }

    public b(Parcel parcel, a aVar) {
        this.f27006a = parcel.readLong();
        this.f27007b = parcel.readLong();
        this.f27008c = parcel.readLong();
        this.f27009d = parcel.readLong();
        this.f27010e = parcel.readLong();
    }
}
