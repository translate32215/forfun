package x5;

import android.os.Parcel;
import android.os.Parcelable;
import v6.e0;

/* compiled from: PrivateCommand */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0278a();

    /* renamed from: a  reason: collision with root package name */
    public final long f27813a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27814b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f27815c;

    /* renamed from: x5.a$a  reason: collision with other inner class name */
    /* compiled from: PrivateCommand */
    public class C0278a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, (C0278a) null);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(long j10, byte[] bArr, long j11) {
        this.f27813a = j11;
        this.f27814b = j10;
        this.f27815c = bArr;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27813a);
        parcel.writeLong(this.f27814b);
        parcel.writeByteArray(this.f27815c);
    }

    public a(Parcel parcel, C0278a aVar) {
        this.f27813a = parcel.readLong();
        this.f27814b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = e0.f26436a;
        this.f27815c = createByteArray;
    }
}
