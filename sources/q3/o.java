package q3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n0.d;

/* compiled from: ModelLoaderRegistry */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final q f24107a;

    /* renamed from: b  reason: collision with root package name */
    public final a f24108b = new a();

    /* compiled from: ModelLoaderRegistry */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, C0223a<?>> f24109a = new HashMap();

        /* renamed from: q3.o$a$a  reason: collision with other inner class name */
        /* compiled from: ModelLoaderRegistry */
        public static class C0223a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<m<Model, ?>> f24110a;

            public C0223a(List<m<Model, ?>> list) {
                this.f24110a = list;
            }
        }
    }

    public o(d<List<Throwable>> dVar) {
        q qVar = new q(dVar);
        this.f24107a = qVar;
    }
}
