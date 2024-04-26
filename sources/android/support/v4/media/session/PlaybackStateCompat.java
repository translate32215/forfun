package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f309a;

    /* renamed from: b  reason: collision with root package name */
    public final long f310b;

    /* renamed from: c  reason: collision with root package name */
    public final long f311c;

    /* renamed from: d  reason: collision with root package name */
    public final float f312d;

    /* renamed from: e  reason: collision with root package name */
    public final long f313e;

    /* renamed from: f  reason: collision with root package name */
    public final int f314f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f315g;

    /* renamed from: h  reason: collision with root package name */
    public final long f316h;

    /* renamed from: i  reason: collision with root package name */
    public List<CustomAction> f317i;

    /* renamed from: r  reason: collision with root package name */
    public final long f318r;

    /* renamed from: s  reason: collision with root package name */
    public final Bundle f319s;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f320a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f321b;

        /* renamed from: c  reason: collision with root package name */
        public final int f322c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f323d;

        public class a implements Parcelable.Creator<CustomAction> {
            public Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public Object[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f320a = parcel.readString();
            this.f321b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f322c = parcel.readInt();
            this.f323d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Action:mName='");
            a10.append(this.f321b);
            a10.append(", mIcon=");
            a10.append(this.f322c);
            a10.append(", mExtras=");
            a10.append(this.f323d);
            return a10.toString();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f320a);
            TextUtils.writeToParcel(this.f321b, parcel, i10);
            parcel.writeInt(this.f322c);
            parcel.writeBundle(this.f323d);
        }
    }

    public class a implements Parcelable.Creator<PlaybackStateCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public Object[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f309a = parcel.readInt();
        this.f310b = parcel.readLong();
        this.f312d = parcel.readFloat();
        this.f316h = parcel.readLong();
        this.f311c = parcel.readLong();
        this.f313e = parcel.readLong();
        this.f315g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f317i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f318r = parcel.readLong();
        this.f319s = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f314f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f309a + ", position=" + this.f310b + ", buffered position=" + this.f311c + ", speed=" + this.f312d + ", updated=" + this.f316h + ", actions=" + this.f313e + ", error code=" + this.f314f + ", error message=" + this.f315g + ", custom actions=" + this.f317i + ", active item id=" + this.f318r + "}";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f309a);
        parcel.writeLong(this.f310b);
        parcel.writeFloat(this.f312d);
        parcel.writeLong(this.f316h);
        parcel.writeLong(this.f311c);
        parcel.writeLong(this.f313e);
        TextUtils.writeToParcel(this.f315g, parcel, i10);
        parcel.writeTypedList(this.f317i);
        parcel.writeLong(this.f318r);
        parcel.writeBundle(this.f319s);
        parcel.writeInt(this.f314f);
    }
}
