package va;

import com.google.firebase.installations.b;

/* compiled from: AutoValue_InstallationTokenResult */
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final String f26685a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26686b;

    /* renamed from: c  reason: collision with root package name */
    public final long f26687c;

    public a(String str, long j10, long j11, C0266a aVar) {
        this.f26685a = str;
        this.f26686b = j10;
        this.f26687c = j11;
    }

    public String a() {
        return this.f26685a;
    }

    public long b() {
        return this.f26687c;
    }

    public long c() {
        return this.f26686b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f26685a.equals(bVar.a()) && this.f26686b == bVar.c() && this.f26687c == bVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f26686b;
        long j11 = this.f26687c;
        return ((((this.f26685a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("InstallationTokenResult{token=");
        a10.append(this.f26685a);
        a10.append(", tokenExpirationTimestamp=");
        a10.append(this.f26686b);
        a10.append(", tokenCreationTimestamp=");
        a10.append(this.f26687c);
        a10.append("}");
        return a10.toString();
    }
}
