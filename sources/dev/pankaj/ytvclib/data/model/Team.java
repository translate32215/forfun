package dev.pankaj.ytvclib.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fb.b;
import ud.k;

@Keep
/* compiled from: Team.kt */
public final class Team implements Parcelable {
    public static final Parcelable.Creator<Team> CREATOR = new a();
    @b("logo")
    private final String logo;
    @b("name")
    private final String name;

    /* compiled from: Team.kt */
    public static final class a implements Parcelable.Creator<Team> {
        public Object createFromParcel(Parcel parcel) {
            k.f(parcel, "parcel");
            return new Team(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i10) {
            return new Team[i10];
        }
    }

    public Team(String str, String str2) {
        k.f(str, "name");
        k.f(str2, "logo");
        this.name = str;
        this.logo = str2;
    }

    public static /* synthetic */ Team copy$default(Team team, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = team.name;
        }
        if ((i10 & 2) != 0) {
            str2 = team.logo;
        }
        return team.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.logo;
    }

    public final Team copy(String str, String str2) {
        k.f(str, "name");
        k.f(str2, "logo");
        return new Team(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team)) {
            return false;
        }
        Team team = (Team) obj;
        return k.a(this.name, team.name) && k.a(this.logo, team.logo);
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.logo.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Team(name=");
        a10.append(this.name);
        a10.append(", logo=");
        a10.append(this.logo);
        a10.append(')');
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        k.f(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
    }
}
