package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f304a;

    /* renamed from: b  reason: collision with root package name */
    public int f305b;

    /* renamed from: c  reason: collision with root package name */
    public int f306c;

    /* renamed from: d  reason: collision with root package name */
    public int f307d;

    /* renamed from: e  reason: collision with root package name */
    public int f308e;

    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public Object[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f304a = parcel.readInt();
        this.f306c = parcel.readInt();
        this.f307d = parcel.readInt();
        this.f308e = parcel.readInt();
        this.f305b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f304a);
        parcel.writeInt(this.f306c);
        parcel.writeInt(this.f307d);
        parcel.writeInt(this.f308e);
        parcel.writeInt(this.f305b);
    }
}
