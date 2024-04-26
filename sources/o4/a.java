package o4;

import java.util.Map;
import o4.f;

/* compiled from: AutoValue_EventInternal */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f22924a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f22925b;

    /* renamed from: c  reason: collision with root package name */
    public final e f22926c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22927d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22928e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f22929f;

    /* compiled from: AutoValue_EventInternal */
    public static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public String f22930a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f22931b;

        /* renamed from: c  reason: collision with root package name */
        public e f22932c;

        /* renamed from: d  reason: collision with root package name */
        public Long f22933d;

        /* renamed from: e  reason: collision with root package name */
        public Long f22934e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f22935f;

        public f b() {
            String str = this.f22930a == null ? " transportName" : "";
            if (this.f22932c == null) {
                str = j.f.a(str, " encodedPayload");
            }
            if (this.f22933d == null) {
                str = j.f.a(str, " eventMillis");
            }
            if (this.f22934e == null) {
                str = j.f.a(str, " uptimeMillis");
            }
            if (this.f22935f == null) {
                str = j.f.a(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new a(this.f22930a, this.f22931b, this.f22932c, this.f22933d.longValue(), this.f22934e.longValue(), this.f22935f, (C0203a) null);
            }
            throw new IllegalStateException(j.f.a("Missing required properties:", str));
        }

        public Map<String, String> c() {
            Map<String, String> map = this.f22935f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public f.a d(e eVar) {
            if (eVar != null) {
                this.f22932c = eVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public f.a e(long j10) {
            this.f22933d = Long.valueOf(j10);
            return this;
        }

        public f.a f(String str) {
            if (str != null) {
                this.f22930a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public f.a g(long j10) {
            this.f22934e = Long.valueOf(j10);
            return this;
        }
    }

    public a(String str, Integer num, e eVar, long j10, long j11, Map map, C0203a aVar) {
        this.f22924a = str;
        this.f22925b = num;
        this.f22926c = eVar;
        this.f22927d = j10;
        this.f22928e = j11;
        this.f22929f = map;
    }

    public Map<String, String> b() {
        return this.f22929f;
    }

    public Integer c() {
        return this.f22925b;
    }

    public e d() {
        return this.f22926c;
    }

    public long e() {
        return this.f22927d;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f22924a.equals(fVar.g()) || ((num = this.f22925b) != null ? !num.equals(fVar.c()) : fVar.c() != null) || !this.f22926c.equals(fVar.d()) || this.f22927d != fVar.e() || this.f22928e != fVar.h() || !this.f22929f.equals(fVar.b())) {
            return false;
        }
        return true;
    }

    public String g() {
        return this.f22924a;
    }

    public long h() {
        return this.f22928e;
    }

    public int hashCode() {
        int hashCode = (this.f22924a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f22925b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f22927d;
        long j11 = this.f22928e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f22926c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f22929f.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("EventInternal{transportName=");
        a10.append(this.f22924a);
        a10.append(", code=");
        a10.append(this.f22925b);
        a10.append(", encodedPayload=");
        a10.append(this.f22926c);
        a10.append(", eventMillis=");
        a10.append(this.f22927d);
        a10.append(", uptimeMillis=");
        a10.append(this.f22928e);
        a10.append(", autoMetadata=");
        a10.append(this.f22929f);
        a10.append("}");
        return a10.toString();
    }
}
