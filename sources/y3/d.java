package y3;

import java.util.ArrayList;
import java.util.List;

/* compiled from: TranscoderRegistry */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?, ?>> f28003a = new ArrayList();

    /* compiled from: TranscoderRegistry */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f28004a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f28005b;

        /* renamed from: c  reason: collision with root package name */
        public final c<Z, R> f28006c;

        public a(Class<Z> cls, Class<R> cls2, c<Z, R> cVar) {
            this.f28004a = cls;
            this.f28005b = cls2;
            this.f28006c = cVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f28004a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f28005b);
        }
    }

    public synchronized <Z, R> List<Class<R>> a(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> a10 : this.f28003a) {
            if (a10.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
