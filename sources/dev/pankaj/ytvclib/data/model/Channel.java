package dev.pankaj.ytvclib.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fb.b;
import o1.q;
import ud.f;
import ud.k;

@Keep
/* compiled from: Channel.kt */
public final class Channel implements Parcelable {
    public static final Parcelable.Creator<Channel> CREATOR = new a();
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final long f13427id;
    @b("logo")
    private final String logo;
    @b("name")
    private final String name;

    /* compiled from: Channel.kt */
    public static final class a implements Parcelable.Creator<Channel> {
        public Object createFromParcel(Parcel parcel) {
            k.f(parcel, "parcel");
            return new Channel(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i10) {
            return new Channel[i10];
        }
    }

    public Channel() {
        this(0, (String) null, (String) null, 7, (f) null);
    }

    public Channel(long j10, String str, String str2) {
        k.f(str, "name");
        k.f(str2, "logo");
        this.f13427id = j10;
        this.name = str;
        this.logo = str2;
    }

    public static /* synthetic */ Channel copy$default(Channel channel, long j10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = channel.f13427id;
        }
        if ((i10 & 2) != 0) {
            str = channel.name;
        }
        if ((i10 & 4) != 0) {
            str2 = channel.logo;
        }
        return channel.copy(j10, str, str2);
    }

    public final long component1() {
        return this.f13427id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.logo;
    }

    public final Channel copy(long j10, String str, String str2) {
        k.f(str, "name");
        k.f(str2, "logo");
        return new Channel(j10, str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return this.f13427id == channel.f13427id && k.a(this.name, channel.name) && k.a(this.logo, channel.logo);
    }

    public final long getId() {
        return this.f13427id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        long j10 = this.f13427id;
        return this.logo.hashCode() + q.a(this.name, ((int) (j10 ^ (j10 >>> 32))) * 31, 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Channel(id=");
        a10.append(this.f13427id);
        a10.append(", name=");
        a10.append(this.name);
        a10.append(", logo=");
        a10.append(this.logo);
        a10.append(')');
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        k.f(parcel, "out");
        parcel.writeLong(this.f13427id);
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Channel(long j10, String str, String str2, int i10, f fVar) {
        this((i10 & 1) != 0 ? 0 : j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
