package d6;

import v6.e0;

/* compiled from: Descriptor */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f13102a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13103b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13104c;

    public d(String str, String str2, String str3) {
        this.f13102a = str;
        this.f13103b = str2;
        this.f13104c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!e0.a(this.f13102a, dVar.f13102a) || !e0.a(this.f13103b, dVar.f13103b) || !e0.a(this.f13104c, dVar.f13104c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f13102a.hashCode() * 31;
        String str = this.f13103b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13104c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }
}
