package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f296a;

    /* renamed from: b  reason: collision with root package name */
    public final float f297b;

    public class a implements Parcelable.Creator<RatingCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(int i10, float f10) {
        this.f296a = i10;
        this.f297b = f10;
    }

    public int describeContents() {
        return this.f296a;
    }

    public String toString() {
        StringBuilder a10 = a.a("Rating:style=");
        a10.append(this.f296a);
        a10.append(" rating=");
        float f10 = this.f297b;
        a10.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f296a);
        parcel.writeFloat(this.f297b);
    }
}
