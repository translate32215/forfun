package dev.pankaj.ytvclib.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fb.b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import o1.q;
import ud.f;
import ud.k;

@Keep
/* compiled from: Stream.kt */
public final class Stream implements Parcelable {
    public static final Parcelable.Creator<Stream> CREATOR = new a();
    @b("headers")
    private final Map<String, String> headers;
    @b("name")
    private final String name;
    @b("url")
    private final String url;
    @b("url_type")
    private final int urlType;
    @b("user_agent")
    private final String userAgent;

    /* compiled from: Stream.kt */
    public static final class a implements Parcelable.Creator<Stream> {
        public Object createFromParcel(Parcel parcel) {
            k.f(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i10 = 0; i10 != readInt2; i10++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new Stream(readString, readString2, readInt, readString3, linkedHashMap);
        }

        public Object[] newArray(int i10) {
            return new Stream[i10];
        }
    }

    public Stream(String str, String str2, int i10, String str3, Map<String, String> map) {
        k.f(str, "name");
        k.f(str2, "url");
        k.f(str3, "userAgent");
        k.f(map, "headers");
        this.name = str;
        this.url = str2;
        this.urlType = i10;
        this.userAgent = str3;
        this.headers = map;
    }

    public static /* synthetic */ Stream copy$default(Stream stream, String str, String str2, int i10, String str3, Map<String, String> map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stream.name;
        }
        if ((i11 & 2) != 0) {
            str2 = stream.url;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            i10 = stream.urlType;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str3 = stream.userAgent;
        }
        String str5 = str3;
        if ((i11 & 16) != 0) {
            map = stream.headers;
        }
        return stream.copy(str, str4, i12, str5, map);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final int component3() {
        return this.urlType;
    }

    public final String component4() {
        return this.userAgent;
    }

    public final Map<String, String> component5() {
        return this.headers;
    }

    public final Stream copy(String str, String str2, int i10, String str3, Map<String, String> map) {
        k.f(str, "name");
        k.f(str2, "url");
        k.f(str3, "userAgent");
        k.f(map, "headers");
        return new Stream(str, str2, i10, str3, map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stream)) {
            return false;
        }
        Stream stream = (Stream) obj;
        return k.a(this.name, stream.name) && k.a(this.url, stream.url) && this.urlType == stream.urlType && k.a(this.userAgent, stream.userAgent) && k.a(this.headers, stream.headers);
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getUrlType() {
        return this.urlType;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        String str = this.url;
        return this.headers.hashCode() + q.a(this.userAgent, (q.a(str, this.name.hashCode() * 31, 31) + this.urlType) * 31, 31);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Stream(name=");
        a10.append(this.name);
        a10.append(", url=");
        a10.append(this.url);
        a10.append(", urlType=");
        a10.append(this.urlType);
        a10.append(", userAgent=");
        a10.append(this.userAgent);
        a10.append(", headers=");
        a10.append(this.headers);
        a10.append(')');
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        k.f(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeInt(this.urlType);
        parcel.writeString(this.userAgent);
        Map<String, String> map = this.headers;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Stream(String str, String str2, int i10, String str3, Map map, int i11, f fVar) {
        this(str, str2, (i11 & 4) != 0 ? 1 : i10, str3, (i11 & 16) != 0 ? new HashMap() : map);
    }
}
