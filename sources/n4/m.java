package n4;

import android.support.v4.media.a;

/* compiled from: AutoValue_LogResponse */
public final class m extends s {

    /* renamed from: a  reason: collision with root package name */
    public final long f21971a;

    public m(long j10) {
        this.f21971a = j10;
    }

    public long b() {
        return this.f21971a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || this.f21971a != ((s) obj).b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f21971a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = a.a("LogResponse{nextRequestWaitMillis=");
        a10.append(this.f21971a);
        a10.append("}");
        return a10.toString();
    }
}
