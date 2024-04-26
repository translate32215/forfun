package n4;

import java.util.Arrays;
import n4.q;

/* compiled from: AutoValue_LogEvent */
public final class k extends q {

    /* renamed from: a  reason: collision with root package name */
    public final long f21950a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f21951b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21952c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f21953d;

    /* renamed from: e  reason: collision with root package name */
    public final String f21954e;

    /* renamed from: f  reason: collision with root package name */
    public final long f21955f;

    /* renamed from: g  reason: collision with root package name */
    public final t f21956g;

    /* compiled from: AutoValue_LogEvent */
    public static final class b extends q.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f21957a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f21958b;

        /* renamed from: c  reason: collision with root package name */
        public Long f21959c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f21960d;

        /* renamed from: e  reason: collision with root package name */
        public String f21961e;

        /* renamed from: f  reason: collision with root package name */
        public Long f21962f;

        /* renamed from: g  reason: collision with root package name */
        public t f21963g;
    }

    public k(long j10, Integer num, long j11, byte[] bArr, String str, long j12, t tVar, a aVar) {
        this.f21950a = j10;
        this.f21951b = num;
        this.f21952c = j11;
        this.f21953d = bArr;
        this.f21954e = str;
        this.f21955f = j12;
        this.f21956g = tVar;
    }

    public Integer a() {
        return this.f21951b;
    }

    public long b() {
        return this.f21950a;
    }

    public long c() {
        return this.f21952c;
    }

    public t d() {
        return this.f21956g;
    }

    public byte[] e() {
        return this.f21953d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f21950a == qVar.b() && ((num = this.f21951b) != null ? num.equals(qVar.a()) : qVar.a() == null) && this.f21952c == qVar.c()) {
            if (Arrays.equals(this.f21953d, qVar instanceof k ? ((k) qVar).f21953d : qVar.e()) && ((str = this.f21954e) != null ? str.equals(qVar.f()) : qVar.f() == null) && this.f21955f == qVar.g()) {
                t tVar = this.f21956g;
                if (tVar == null) {
                    if (qVar.d() == null) {
                        return true;
                    }
                } else if (tVar.equals(qVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f21954e;
    }

    public long g() {
        return this.f21955f;
    }

    public int hashCode() {
        long j10 = this.f21950a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f21951b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f21952c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21953d)) * 1000003;
        String str = this.f21954e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f21955f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        t tVar = this.f21956g;
        if (tVar != null) {
            i11 = tVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("LogEvent{eventTimeMs=");
        a10.append(this.f21950a);
        a10.append(", eventCode=");
        a10.append(this.f21951b);
        a10.append(", eventUptimeMs=");
        a10.append(this.f21952c);
        a10.append(", sourceExtension=");
        a10.append(Arrays.toString(this.f21953d));
        a10.append(", sourceExtensionJsonProto3=");
        a10.append(this.f21954e);
        a10.append(", timezoneOffsetSeconds=");
        a10.append(this.f21955f);
        a10.append(", networkConnectionInfo=");
        a10.append(this.f21956g);
        a10.append("}");
        return a10.toString();
    }
}
