package b4;

import java.util.ArrayList;
import java.util.List;
import k3.f;

/* compiled from: ResourceEncoderRegistry */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<?>> f3560a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f3561a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T> f3562b;

        public a(Class<T> cls, f<T> fVar) {
            this.f3561a = cls;
            this.f3562b = fVar;
        }
    }

    public synchronized <Z> f<Z> a(Class<Z> cls) {
        int size = this.f3560a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = this.f3560a.get(i10);
            if (aVar.f3561a.isAssignableFrom(cls)) {
                return aVar.f3562b;
            }
        }
        return null;
    }
}
