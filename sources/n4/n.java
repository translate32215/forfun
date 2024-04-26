package n4;

import n4.t;

/* compiled from: AutoValue_NetworkConnectionInfo */
public final class n extends t {

    /* renamed from: a  reason: collision with root package name */
    public final t.b f21972a;

    /* renamed from: b  reason: collision with root package name */
    public final t.a f21973b;

    public n(t.b bVar, t.a aVar, a aVar2) {
        this.f21972a = bVar;
        this.f21973b = aVar;
    }

    public t.a a() {
        return this.f21973b;
    }

    public t.b b() {
        return this.f21972a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        t.b bVar = this.f21972a;
        if (bVar != null ? bVar.equals(tVar.b()) : tVar.b() == null) {
            t.a aVar = this.f21973b;
            if (aVar == null) {
                if (tVar.a() == null) {
                    return true;
                }
            } else if (aVar.equals(tVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        t.b bVar = this.f21972a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        t.a aVar = this.f21973b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("NetworkConnectionInfo{networkType=");
        a10.append(this.f21972a);
        a10.append(", mobileSubtype=");
        a10.append(this.f21973b);
        a10.append("}");
        return a10.toString();
    }
}
