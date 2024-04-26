package rc;

import android.support.v4.media.a;
import dev.pankaj.ytvclib.data.model.Stream;
import java.util.List;
import java.util.Map;
import ud.k;

/* compiled from: StreamsResponse.kt */
public final class b {
    @fb.b("data")

    /* renamed from: a  reason: collision with root package name */
    private final List<Stream> f24766a;
    @fb.b("servers")

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<String>> f24767b;

    public final List<Stream> a() {
        return this.f24766a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.f24766a, bVar.f24766a) && k.a(this.f24767b, bVar.f24767b);
    }

    public int hashCode() {
        return this.f24767b.hashCode() + (this.f24766a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("StreamsResponse(data=");
        a10.append(this.f24766a);
        a10.append(", servers=");
        a10.append(this.f24767b);
        a10.append(')');
        return a10.toString();
    }
}
