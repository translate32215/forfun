package n4;

import java.io.IOException;
import oa.d;
import oa.e;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class f implements e<r> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f21924a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final d f21925b = d.a("requestTimeMs");

    /* renamed from: c  reason: collision with root package name */
    public static final d f21926c = d.a("requestUptimeMs");

    /* renamed from: d  reason: collision with root package name */
    public static final d f21927d = d.a("clientInfo");

    /* renamed from: e  reason: collision with root package name */
    public static final d f21928e = d.a("logSource");

    /* renamed from: f  reason: collision with root package name */
    public static final d f21929f = d.a("logSourceName");

    /* renamed from: g  reason: collision with root package name */
    public static final d f21930g = d.a("logEvent");

    /* renamed from: h  reason: collision with root package name */
    public static final d f21931h = d.a("qosTier");

    public void a(Object obj, Object obj2) throws IOException {
        r rVar = (r) obj;
        oa.f fVar = (oa.f) obj2;
        fVar.b(f21925b, rVar.f());
        fVar.b(f21926c, rVar.g());
        fVar.e(f21927d, rVar.a());
        fVar.e(f21928e, rVar.c());
        fVar.e(f21929f, rVar.d());
        fVar.e(f21930g, rVar.b());
        fVar.e(f21931h, rVar.e());
    }
}
