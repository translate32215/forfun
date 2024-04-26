package f7;

import com.google.android.gms.common.internal.h;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f18314a;

    /* renamed from: b  reason: collision with root package name */
    public final double f18315b;

    /* renamed from: c  reason: collision with root package name */
    public final double f18316c;

    /* renamed from: d  reason: collision with root package name */
    public final double f18317d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18318e;

    public s(String str, double d10, double d11, double d12, int i10) {
        this.f18314a = str;
        this.f18316c = d10;
        this.f18315b = d11;
        this.f18317d = d12;
        this.f18318e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (h.a(this.f18314a, sVar.f18314a) && this.f18315b == sVar.f18315b && this.f18316c == sVar.f18316c && this.f18318e == sVar.f18318e && Double.compare(this.f18317d, sVar.f18317d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18314a, Double.valueOf(this.f18315b), Double.valueOf(this.f18316c), Double.valueOf(this.f18317d), Integer.valueOf(this.f18318e)});
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a("name", this.f18314a);
        aVar.a("minBound", Double.valueOf(this.f18316c));
        aVar.a("maxBound", Double.valueOf(this.f18315b));
        aVar.a("percent", Double.valueOf(this.f18317d));
        aVar.a("count", Integer.valueOf(this.f18318e));
        return aVar.toString();
    }
}
