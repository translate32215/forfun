package ya;

import ya.d;

/* compiled from: AutoValue_InstallationResponse */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f28138a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28139b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28140c;

    /* renamed from: d  reason: collision with root package name */
    public final f f28141d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f28142e;

    public a(String str, String str2, String str3, f fVar, d.a aVar, C0284a aVar2) {
        this.f28138a = str;
        this.f28139b = str2;
        this.f28140c = str3;
        this.f28141d = fVar;
        this.f28142e = aVar;
    }

    public f a() {
        return this.f28141d;
    }

    public String b() {
        return this.f28139b;
    }

    public String c() {
        return this.f28140c;
    }

    public d.a d() {
        return this.f28142e;
    }

    public String e() {
        return this.f28138a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f28138a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f28139b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f28140c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f28141d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        d.a aVar = this.f28142e;
                        if (aVar == null) {
                            if (dVar.d() == null) {
                                return true;
                            }
                        } else if (aVar.equals(dVar.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f28138a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f28139b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f28140c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f28141d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.a aVar = this.f28142e;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("InstallationResponse{uri=");
        a10.append(this.f28138a);
        a10.append(", fid=");
        a10.append(this.f28139b);
        a10.append(", refreshToken=");
        a10.append(this.f28140c);
        a10.append(", authToken=");
        a10.append(this.f28141d);
        a10.append(", responseCode=");
        a10.append(this.f28142e);
        a10.append("}");
        return a10.toString();
    }
}
