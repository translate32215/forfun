package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f284a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDescriptionCompat f285b;

    public class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public Object createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public Object[] newArray(int i10) {
            return new MediaBrowserCompat$MediaItem[i10];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f284a = parcel.readInt();
        this.f285b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f284a + ", mDescription=" + this.f285b + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f284a);
        this.f285b.writeToParcel(parcel, i10);
    }
}
