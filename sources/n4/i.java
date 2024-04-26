package n4;

import android.support.v4.media.a;
import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest */
public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final List<r> f21947a;

    public i(List<r> list) {
        if (list != null) {
            this.f21947a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public List<r> a() {
        return this.f21947a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f21947a.equals(((o) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f21947a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder a10 = a.a("BatchedLogRequest{logRequests=");
        a10.append(this.f21947a);
        a10.append("}");
        return a10.toString();
    }
}
