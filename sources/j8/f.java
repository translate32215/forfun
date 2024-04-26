package j8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import oa.c;
import oa.e;
import oa.g;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, e<?>> f19657a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, g<?>> f19658b;

    /* renamed from: c  reason: collision with root package name */
    public final e<Object> f19659c;

    public f(Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.f19657a = map;
        this.f19658b = map2;
        this.f19659c = eVar;
    }

    public final void a(Object obj, OutputStream outputStream) throws IOException {
        Map<Class<?>, e<?>> map = this.f19657a;
        c cVar = new c(outputStream, map, this.f19658b, this.f19659c);
        if (obj != null) {
            e eVar = map.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, cVar);
            } else {
                String valueOf = String.valueOf(obj.getClass());
                throw new c(androidx.activity.e.a(new StringBuilder(valueOf.length() + 15), "No encoder for ", valueOf));
            }
        }
    }
}
