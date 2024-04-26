package od;

import md.d;
import md.f;

/* compiled from: ContinuationImpl.kt */
public abstract class g extends a {
    public g(d<Object> dVar) {
        super(dVar);
        if (!(dVar.getContext() == md.g.f21797a)) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    public f getContext() {
        return md.g.f21797a;
    }
}
