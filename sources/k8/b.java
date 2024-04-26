package k8;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f20074a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20075b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f20076c;

    public b(String str, long j10, Map<String, Object> map) {
        this.f20074a = str;
        this.f20075b = j10;
        HashMap hashMap = new HashMap();
        this.f20076c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final b clone() {
        return new b(this.f20074a, this.f20075b, new HashMap(this.f20076c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f20075b == bVar.f20075b && this.f20074a.equals(bVar.f20074a)) {
            return this.f20076c.equals(bVar.f20076c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f20074a.hashCode();
        long j10 = this.f20075b;
        return this.f20076c.hashCode() + (((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f20074a;
        long j10 = this.f20075b;
        String valueOf = String.valueOf(this.f20076c);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 55 + valueOf.length());
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(valueOf);
        sb2.append('}');
        return sb2.toString();
    }
}
