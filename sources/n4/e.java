package n4;

import java.io.IOException;
import oa.d;
import oa.f;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class e implements oa.e<q> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f21916a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final d f21917b = d.a("eventTimeMs");

    /* renamed from: c  reason: collision with root package name */
    public static final d f21918c = d.a("eventCode");

    /* renamed from: d  reason: collision with root package name */
    public static final d f21919d = d.a("eventUptimeMs");

    /* renamed from: e  reason: collision with root package name */
    public static final d f21920e = d.a("sourceExtension");

    /* renamed from: f  reason: collision with root package name */
    public static final d f21921f = d.a("sourceExtensionJsonProto3");

    /* renamed from: g  reason: collision with root package name */
    public static final d f21922g = d.a("timezoneOffsetSeconds");

    /* renamed from: h  reason: collision with root package name */
    public static final d f21923h = d.a("networkConnectionInfo");

    public void a(Object obj, Object obj2) throws IOException {
        q qVar = (q) obj;
        f fVar = (f) obj2;
        fVar.b(f21917b, qVar.b());
        fVar.e(f21918c, qVar.a());
        fVar.b(f21919d, qVar.c());
        fVar.e(f21920e, qVar.e());
        fVar.e(f21921f, qVar.f());
        fVar.b(f21922g, qVar.g());
        fVar.e(f21923h, qVar.d());
    }
}
