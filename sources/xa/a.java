package xa;

import androidx.activity.e;
import j.f;
import xa.c;
import xa.d;

/* compiled from: AutoValue_PersistedInstallationEntry */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f27890b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f27891c;

    /* renamed from: d  reason: collision with root package name */
    public final String f27892d;

    /* renamed from: e  reason: collision with root package name */
    public final String f27893e;

    /* renamed from: f  reason: collision with root package name */
    public final long f27894f;

    /* renamed from: g  reason: collision with root package name */
    public final long f27895g;

    /* renamed from: h  reason: collision with root package name */
    public final String f27896h;

    /* compiled from: AutoValue_PersistedInstallationEntry */
    public static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f27897a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f27898b;

        /* renamed from: c  reason: collision with root package name */
        public String f27899c;

        /* renamed from: d  reason: collision with root package name */
        public String f27900d;

        /* renamed from: e  reason: collision with root package name */
        public Long f27901e;

        /* renamed from: f  reason: collision with root package name */
        public Long f27902f;

        /* renamed from: g  reason: collision with root package name */
        public String f27903g;

        public b() {
        }

        public d a() {
            String str = this.f27898b == null ? " registrationStatus" : "";
            if (this.f27901e == null) {
                str = f.a(str, " expiresInSecs");
            }
            if (this.f27902f == null) {
                str = f.a(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f27897a, this.f27898b, this.f27899c, this.f27900d, this.f27901e.longValue(), this.f27902f.longValue(), this.f27903g, (C0279a) null);
            }
            throw new IllegalStateException(f.a("Missing required properties:", str));
        }

        public d.a b(long j10) {
            this.f27901e = Long.valueOf(j10);
            return this;
        }

        public d.a c(c.a aVar) {
            if (aVar != null) {
                this.f27898b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public d.a d(long j10) {
            this.f27902f = Long.valueOf(j10);
            return this;
        }

        public b(d dVar, C0279a aVar) {
            a aVar2 = (a) dVar;
            this.f27897a = aVar2.f27890b;
            this.f27898b = aVar2.f27891c;
            this.f27899c = aVar2.f27892d;
            this.f27900d = aVar2.f27893e;
            this.f27901e = Long.valueOf(aVar2.f27894f);
            this.f27902f = Long.valueOf(aVar2.f27895g);
            this.f27903g = aVar2.f27896h;
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4, C0279a aVar2) {
        this.f27890b = str;
        this.f27891c = aVar;
        this.f27892d = str2;
        this.f27893e = str3;
        this.f27894f = j10;
        this.f27895g = j11;
        this.f27896h = str4;
    }

    public String a() {
        return this.f27892d;
    }

    public long b() {
        return this.f27894f;
    }

    public String c() {
        return this.f27890b;
    }

    public String d() {
        return this.f27896h;
    }

    public String e() {
        return this.f27893e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f27890b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (this.f27891c.equals(dVar.f()) && ((str = this.f27892d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f27893e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f27894f == dVar.b() && this.f27895g == dVar.g()) {
                String str4 = this.f27896h;
                if (str4 == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public c.a f() {
        return this.f27891c;
    }

    public long g() {
        return this.f27895g;
    }

    public int hashCode() {
        String str = this.f27890b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f27891c.hashCode()) * 1000003;
        String str2 = this.f27892d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f27893e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f27894f;
        long j11 = this.f27895g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f27896h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    public d.a k() {
        return new b(this, (C0279a) null);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("PersistedInstallationEntry{firebaseInstallationId=");
        a10.append(this.f27890b);
        a10.append(", registrationStatus=");
        a10.append(this.f27891c);
        a10.append(", authToken=");
        a10.append(this.f27892d);
        a10.append(", refreshToken=");
        a10.append(this.f27893e);
        a10.append(", expiresInSecs=");
        a10.append(this.f27894f);
        a10.append(", tokenCreationEpochInSecs=");
        a10.append(this.f27895g);
        a10.append(", fisError=");
        return e.a(a10, this.f27896h, "}");
    }
}
