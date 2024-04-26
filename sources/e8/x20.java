package e8;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class x20 implements t20 {

    /* renamed from: a  reason: collision with root package name */
    public final s20 f17432a;

    /* renamed from: b  reason: collision with root package name */
    public final a30 f17433b;

    /* renamed from: c  reason: collision with root package name */
    public final z20 f17434c;

    public x20(s20 s20, a30 a30, z20 z20) {
        this.f17432a = s20;
        this.f17433b = a30;
        this.f17434c = z20;
    }

    public final void a(u20 u20) {
        this.f17432a.a(b(u20));
    }

    public final String b(u20 u20) {
        a30 a30 = this.f17433b;
        Map<String, String> e10 = u20.e();
        this.f17434c.a(e10);
        return a30.a(e10);
    }
}
