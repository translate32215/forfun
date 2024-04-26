package n4;

import java.io.IOException;
import oa.d;
import oa.e;
import oa.f;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class g implements e<t> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f21932a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final d f21933b = d.a("networkType");

    /* renamed from: c  reason: collision with root package name */
    public static final d f21934c = d.a("mobileSubtype");

    public void a(Object obj, Object obj2) throws IOException {
        t tVar = (t) obj;
        f fVar = (f) obj2;
        fVar.e(f21933b, tVar.b());
        fVar.e(f21934c, tVar.a());
    }
}
