package e8;

import com.google.android.gms.internal.ads.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class u implements h1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f16826a;

    public u(e eVar) {
        this.f16826a = eVar;
    }

    public final String a(String str, String str2) {
        return this.f16826a.f6257e.getString(str, str2);
    }

    public final Boolean b(String str, boolean z10) {
        return Boolean.valueOf(this.f16826a.f6257e.getBoolean(str, z10));
    }

    public final Double c(String str, double d10) {
        return Double.valueOf((double) this.f16826a.f6257e.getFloat(str, (float) d10));
    }

    public final Long getLong(String str, long j10) {
        try {
            return Long.valueOf(this.f16826a.f6257e.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f16826a.f6257e.getInt(str, (int) j10));
        }
    }
}
