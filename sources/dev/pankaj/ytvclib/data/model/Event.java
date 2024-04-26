package dev.pankaj.ytvclib.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fb.b;
import o1.q;
import ud.f;
import ud.k;

@Keep
/* compiled from: Event.kt */
public final class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new a();
    @b("champions")
    private final String champions;
    @b("channel")
    private final String channel;
    @b("commentary")
    private final String commentary;
    @b("end_time")
    private final long endTime;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final long f13428id;
    @b("start_time")
    private final long startTime;
    @b("team_1")
    private final Team team1;
    @b("team_2")
    private final Team team2;

    /* compiled from: Event.kt */
    public static final class a implements Parcelable.Creator<Event> {
        public Object createFromParcel(Parcel parcel) {
            k.f(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Parcelable.Creator<Team> creator = Team.CREATOR;
            return new Event(readLong, readLong2, readLong3, readString, readString2, readString3, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        public Object[] newArray(int i10) {
            return new Event[i10];
        }
    }

    public Event(long j10, long j11, long j12, String str, String str2, String str3, Team team, Team team3) {
        k.f(str, "commentary");
        k.f(str2, "champions");
        k.f(str3, "channel");
        k.f(team, "team1");
        k.f(team3, "team2");
        this.f13428id = j10;
        this.startTime = j11;
        this.endTime = j12;
        this.commentary = str;
        this.champions = str2;
        this.channel = str3;
        this.team1 = team;
        this.team2 = team3;
    }

    public static /* synthetic */ Event copy$default(Event event, long j10, long j11, long j12, String str, String str2, String str3, Team team, Team team3, int i10, Object obj) {
        Event event2 = event;
        int i11 = i10;
        return event.copy((i11 & 1) != 0 ? event2.f13428id : j10, (i11 & 2) != 0 ? event2.startTime : j11, (i11 & 4) != 0 ? event2.endTime : j12, (i11 & 8) != 0 ? event2.commentary : str, (i11 & 16) != 0 ? event2.champions : str2, (i11 & 32) != 0 ? event2.channel : str3, (i11 & 64) != 0 ? event2.team1 : team, (i11 & 128) != 0 ? event2.team2 : team3);
    }

    public final long component1() {
        return this.f13428id;
    }

    public final long component2() {
        return this.startTime;
    }

    public final long component3() {
        return this.endTime;
    }

    public final String component4() {
        return this.commentary;
    }

    public final String component5() {
        return this.champions;
    }

    public final String component6() {
        return this.channel;
    }

    public final Team component7() {
        return this.team1;
    }

    public final Team component8() {
        return this.team2;
    }

    public final Event copy(long j10, long j11, long j12, String str, String str2, String str3, Team team, Team team3) {
        String str4 = str;
        k.f(str4, "commentary");
        String str5 = str2;
        k.f(str5, "champions");
        String str6 = str3;
        k.f(str6, "channel");
        Team team4 = team;
        k.f(team4, "team1");
        Team team5 = team3;
        k.f(team5, "team2");
        return new Event(j10, j11, j12, str4, str5, str6, team4, team5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return this.f13428id == event.f13428id && this.startTime == event.startTime && this.endTime == event.endTime && k.a(this.commentary, event.commentary) && k.a(this.champions, event.champions) && k.a(this.channel, event.channel) && k.a(this.team1, event.team1) && k.a(this.team2, event.team2);
    }

    public final String getChampions() {
        return this.champions;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getCommentary() {
        return this.commentary;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getId() {
        return this.f13428id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final Team getTeam1() {
        return this.team1;
    }

    public final Team getTeam2() {
        return this.team2;
    }

    public int hashCode() {
        long j10 = this.f13428id;
        long j11 = this.startTime;
        long j12 = this.endTime;
        int a10 = q.a(this.channel, q.a(this.champions, q.a(this.commentary, ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31, 31), 31), 31);
        return this.team2.hashCode() + ((this.team1.hashCode() + a10) * 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Event(id=");
        a10.append(this.f13428id);
        a10.append(", startTime=");
        a10.append(this.startTime);
        a10.append(", endTime=");
        a10.append(this.endTime);
        a10.append(", commentary=");
        a10.append(this.commentary);
        a10.append(", champions=");
        a10.append(this.champions);
        a10.append(", channel=");
        a10.append(this.channel);
        a10.append(", team1=");
        a10.append(this.team1);
        a10.append(", team2=");
        a10.append(this.team2);
        a10.append(')');
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        k.f(parcel, "out");
        parcel.writeLong(this.f13428id);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.commentary);
        parcel.writeString(this.champions);
        parcel.writeString(this.channel);
        this.team1.writeToParcel(parcel, i10);
        this.team2.writeToParcel(parcel, i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Event(long j10, long j11, long j12, String str, String str2, String str3, Team team, Team team3, int i10, f fVar) {
        this((i10 & 1) != 0 ? 0 : j10, j11, j12, str, str2, str3, team, team3);
    }
}
