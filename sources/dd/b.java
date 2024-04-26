package dd;

import android.support.v4.media.a;
import dev.pankaj.ytvclib.data.model.Channel;
import java.util.List;
import ud.k;

/* compiled from: ChannelsResponse.kt */
public final class b {
    @fb.b("data")

    /* renamed from: a  reason: collision with root package name */
    private final List<Channel> f13250a;

    public final List<Channel> a() {
        return this.f13250a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k.a(this.f13250a, ((b) obj).f13250a);
    }

    public int hashCode() {
        return this.f13250a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("ChannelsResponse(data=");
        a10.append(this.f13250a);
        a10.append(')');
        return a10.toString();
    }
}
