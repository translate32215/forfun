package ya;

import ya.f;

/* compiled from: AutoValue_TokenResult */
public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f28143a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28144b;

    /* renamed from: c  reason: collision with root package name */
    public final f.b f28145c;

    /* renamed from: ya.b$b  reason: collision with other inner class name */
    /* compiled from: AutoValue_TokenResult */
    public static final class C0285b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public String f28146a;

        /* renamed from: b  reason: collision with root package name */
        public Long f28147b;

        /* renamed from: c  reason: collision with root package name */
        public f.b f28148c;

        public f a() {
            String str = this.f28147b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.f28146a, this.f28147b.longValue(), this.f28148c, (a) null);
            }
            throw new IllegalStateException(j.f.a("Missing required properties:", str));
        }

        public f.a b(long j10) {
            this.f28147b = Long.valueOf(j10);
            return this;
        }
    }

    public b(String str, long j10, f.b bVar, a aVar) {
        this.f28143a = str;
        this.f28144b = j10;
        this.f28145c = bVar;
    }

    public f.b b() {
        return this.f28145c;
    }

    public String c() {
        return this.f28143a;
    }

    public long d() {
        return this.f28144b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f28143a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f28144b == fVar.d()) {
                f.b bVar = this.f28145c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f28143a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f28144b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f28145c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("TokenResult{token=");
        a10.append(this.f28143a);
        a10.append(", tokenExpirationTimestamp=");
        a10.append(this.f28144b);
        a10.append(", responseCode=");
        a10.append(this.f28145c);
        a10.append("}");
        return a10.toString();
    }
}
