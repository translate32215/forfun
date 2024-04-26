package d6;

import v6.e0;

/* compiled from: ProgramInformation */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f13113a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13114b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13115c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13116d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13117e;

    public g(String str, String str2, String str3, String str4, String str5) {
        this.f13113a = str;
        this.f13114b = str2;
        this.f13115c = str3;
        this.f13116d = str4;
        this.f13117e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (!e0.a(this.f13113a, gVar.f13113a) || !e0.a(this.f13114b, gVar.f13114b) || !e0.a(this.f13115c, gVar.f13115c) || !e0.a(this.f13116d, gVar.f13116d) || !e0.a(this.f13117e, gVar.f13117e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13113a;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13114b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13115c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13116d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f13117e;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
    }
}
