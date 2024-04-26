package e8;

import androidx.appcompat.widget.o;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class i30 extends h30 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14978a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14979b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14980c;

    public i30(String str, boolean z10, boolean z11, jc0 jc0) {
        this.f14978a = str;
        this.f14979b = z10;
        this.f14980c = z11;
    }

    public final String a() {
        return this.f14978a;
    }

    public final boolean b() {
        return this.f14979b;
    }

    public final boolean c() {
        return this.f14980c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h30) {
            h30 h30 = (h30) obj;
            return this.f14978a.equals(h30.a()) && this.f14979b == h30.b() && this.f14980c == h30.c();
        }
    }

    public final int hashCode() {
        int i10 = 1231;
        int hashCode = (((this.f14978a.hashCode() ^ 1000003) * 1000003) ^ (this.f14979b ? 1231 : 1237)) * 1000003;
        if (!this.f14980c) {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        String str = this.f14978a;
        boolean z10 = this.f14979b;
        boolean z11 = this.f14980c;
        StringBuilder sb2 = new StringBuilder(o.a(str, 99));
        sb2.append("AdShield2Options{clientVersion=");
        sb2.append(str);
        sb2.append(", shouldGetAdvertisingId=");
        sb2.append(z10);
        sb2.append(", isGooglePlayServicesAvailable=");
        sb2.append(z11);
        sb2.append("}");
        return sb2.toString();
    }
}
