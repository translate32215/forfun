package dd;

import android.support.v4.media.a;
import dev.pankaj.ytvclib.data.model.Event;
import fb.b;
import java.util.List;
import ud.k;

/* compiled from: EventsResponse.kt */
public final class d {
    @b("data")

    /* renamed from: a  reason: collision with root package name */
    private final List<Event> f13254a;

    public final List<Event> a() {
        return this.f13254a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k.a(this.f13254a, ((d) obj).f13254a);
    }

    public int hashCode() {
        return this.f13254a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("EventsResponse(data=");
        a10.append(this.f13254a);
        a10.append(')');
        return a10.toString();
    }
}
