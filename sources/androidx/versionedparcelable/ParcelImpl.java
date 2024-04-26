package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import d2.b;
import d2.c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final c f3165a;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public Object[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f3165a = new b(parcel).o();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).w(this.f3165a);
    }
}
