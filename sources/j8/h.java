package j8;

import bb.b;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import oa.d;
import oa.e;
import oa.f;
import v6.q;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class h implements e<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f19664a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final d f19665b;

    static {
        q qVar = new q(1, (q.e) null);
        qVar.f26491b = 1;
        u g10 = qVar.g();
        HashMap hashMap = new HashMap();
        hashMap.put(g10.annotationType(), g10);
        f19665b = new d("messagingClientEvent", Collections.unmodifiableMap(new HashMap(hashMap)), (d.a) null);
    }

    public final void a(Object obj, Object obj2) throws IOException {
        ((f) obj2).e(f19665b, ((b) obj).f3868a);
    }
}
