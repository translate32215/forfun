package n4;

import n4.p;

/* compiled from: AutoValue_ClientInfo */
public final class j extends p {

    /* renamed from: a  reason: collision with root package name */
    public final p.a f21948a;

    /* renamed from: b  reason: collision with root package name */
    public final a f21949b;

    public j(p.a aVar, a aVar2, a aVar3) {
        this.f21948a = aVar;
        this.f21949b = aVar2;
    }

    public a a() {
        return this.f21949b;
    }

    public p.a b() {
        return this.f21948a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        p.a aVar = this.f21948a;
        if (aVar != null ? aVar.equals(pVar.b()) : pVar.b() == null) {
            a aVar2 = this.f21949b;
            if (aVar2 == null) {
                if (pVar.a() == null) {
                    return true;
                }
            } else if (aVar2.equals(pVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        p.a aVar = this.f21948a;
        int i10 = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f21949b;
        if (aVar2 != null) {
            i10 = aVar2.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("ClientInfo{clientType=");
        a10.append(this.f21948a);
        a10.append(", androidClientInfo=");
        a10.append(this.f21949b);
        a10.append("}");
        return a10.toString();
    }
}
