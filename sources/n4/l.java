package n4;

import java.util.List;

/* compiled from: AutoValue_LogRequest */
public final class l extends r {

    /* renamed from: a  reason: collision with root package name */
    public final long f21964a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21965b;

    /* renamed from: c  reason: collision with root package name */
    public final p f21966c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f21967d;

    /* renamed from: e  reason: collision with root package name */
    public final String f21968e;

    /* renamed from: f  reason: collision with root package name */
    public final List<q> f21969f;

    /* renamed from: g  reason: collision with root package name */
    public final u f21970g;

    public l(long j10, long j11, p pVar, Integer num, String str, List list, u uVar, a aVar) {
        this.f21964a = j10;
        this.f21965b = j11;
        this.f21966c = pVar;
        this.f21967d = num;
        this.f21968e = str;
        this.f21969f = list;
        this.f21970g = uVar;
    }

    public p a() {
        return this.f21966c;
    }

    public List<q> b() {
        return this.f21969f;
    }

    public Integer c() {
        return this.f21967d;
    }

    public String d() {
        return this.f21968e;
    }

    public u e() {
        return this.f21970g;
    }

    public boolean equals(Object obj) {
        p pVar;
        Integer num;
        String str;
        List<q> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f21964a == rVar.f() && this.f21965b == rVar.g() && ((pVar = this.f21966c) != null ? pVar.equals(rVar.a()) : rVar.a() == null) && ((num = this.f21967d) != null ? num.equals(rVar.c()) : rVar.c() == null) && ((str = this.f21968e) != null ? str.equals(rVar.d()) : rVar.d() == null) && ((list = this.f21969f) != null ? list.equals(rVar.b()) : rVar.b() == null)) {
            u uVar = this.f21970g;
            if (uVar == null) {
                if (rVar.e() == null) {
                    return true;
                }
            } else if (uVar.equals(rVar.e())) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f21964a;
    }

    public long g() {
        return this.f21965b;
    }

    public int hashCode() {
        long j10 = this.f21964a;
        long j11 = this.f21965b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        p pVar = this.f21966c;
        int i11 = 0;
        int hashCode = (i10 ^ (pVar == null ? 0 : pVar.hashCode())) * 1000003;
        Integer num = this.f21967d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f21968e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<q> list = this.f21969f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        u uVar = this.f21970g;
        if (uVar != null) {
            i11 = uVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("LogRequest{requestTimeMs=");
        a10.append(this.f21964a);
        a10.append(", requestUptimeMs=");
        a10.append(this.f21965b);
        a10.append(", clientInfo=");
        a10.append(this.f21966c);
        a10.append(", logSource=");
        a10.append(this.f21967d);
        a10.append(", logSourceName=");
        a10.append(this.f21968e);
        a10.append(", logEvents=");
        a10.append(this.f21969f);
        a10.append(", qosTier=");
        a10.append(this.f21970g);
        a10.append("}");
        return a10.toString();
    }
}
