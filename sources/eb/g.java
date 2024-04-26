package eb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import pb.b;
import pb.c;
import ua.a;

/* compiled from: Personalization */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final a<ja.a> f17831a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f17832b;

    /* JADX WARNING: type inference failed for: r0v0, types: [pb.a, pb.c, ua.a<ja.a>] */
    /* JADX WARNING: type inference failed for: r1v0, types: [pb.b, java.util.Map<java.lang.String, java.lang.String>] */
    public g() {
        ? cVar = new c();
        this.f17831a = cVar;
        this.f17832b = new b(cVar);
    }

    public g(a aVar) {
        this.f17832b = Collections.synchronizedMap(new HashMap());
        this.f17831a = aVar;
    }
}
