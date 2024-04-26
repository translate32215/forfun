package n4;

import androidx.activity.e;

/* compiled from: AutoValue_AndroidClientInfo */
public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f21935a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21936b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21937c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21938d;

    /* renamed from: e  reason: collision with root package name */
    public final String f21939e;

    /* renamed from: f  reason: collision with root package name */
    public final String f21940f;

    /* renamed from: g  reason: collision with root package name */
    public final String f21941g;

    /* renamed from: h  reason: collision with root package name */
    public final String f21942h;

    /* renamed from: i  reason: collision with root package name */
    public final String f21943i;

    /* renamed from: j  reason: collision with root package name */
    public final String f21944j;

    /* renamed from: k  reason: collision with root package name */
    public final String f21945k;

    /* renamed from: l  reason: collision with root package name */
    public final String f21946l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, a aVar) {
        this.f21935a = num;
        this.f21936b = str;
        this.f21937c = str2;
        this.f21938d = str3;
        this.f21939e = str4;
        this.f21940f = str5;
        this.f21941g = str6;
        this.f21942h = str7;
        this.f21943i = str8;
        this.f21944j = str9;
        this.f21945k = str10;
        this.f21946l = str11;
    }

    public String a() {
        return this.f21946l;
    }

    public String b() {
        return this.f21944j;
    }

    public String c() {
        return this.f21938d;
    }

    public String d() {
        return this.f21942h;
    }

    public String e() {
        return this.f21937c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f21935a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f21936b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f21937c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f21938d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f21939e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f21940f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f21941g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f21942h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f21943i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f21944j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f21945k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f21946l;
                                                    if (str11 == null) {
                                                        if (aVar.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f21943i;
    }

    public String g() {
        return this.f21941g;
    }

    public String h() {
        return this.f21945k;
    }

    public int hashCode() {
        Integer num = this.f21935a;
        int i10 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f21936b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f21937c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f21938d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f21939e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f21940f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f21941g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f21942h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f21943i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f21944j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f21945k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f21946l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return hashCode11 ^ i10;
    }

    public String i() {
        return this.f21936b;
    }

    public String j() {
        return this.f21940f;
    }

    public String k() {
        return this.f21939e;
    }

    public Integer l() {
        return this.f21935a;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("AndroidClientInfo{sdkVersion=");
        a10.append(this.f21935a);
        a10.append(", model=");
        a10.append(this.f21936b);
        a10.append(", hardware=");
        a10.append(this.f21937c);
        a10.append(", device=");
        a10.append(this.f21938d);
        a10.append(", product=");
        a10.append(this.f21939e);
        a10.append(", osBuild=");
        a10.append(this.f21940f);
        a10.append(", manufacturer=");
        a10.append(this.f21941g);
        a10.append(", fingerprint=");
        a10.append(this.f21942h);
        a10.append(", locale=");
        a10.append(this.f21943i);
        a10.append(", country=");
        a10.append(this.f21944j);
        a10.append(", mccMnc=");
        a10.append(this.f21945k);
        a10.append(", applicationBuild=");
        return e.a(a10, this.f21946l, "}");
    }
}
