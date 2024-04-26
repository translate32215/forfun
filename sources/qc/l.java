package qc;

import androidx.lifecycle.LiveData;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import lf.c;
import lf.f0;
import lf.j0;
import ud.k;

/* compiled from: LiveDataCallAdapterFactory.kt */
public final class l extends c.a {
    public c<?, ?> a(Type type, Annotation[] annotationArr, f0 f0Var) {
        if (!k.a(j0.g(type), LiveData.class)) {
            return null;
        }
        Type f10 = j0.f(0, (ParameterizedType) type);
        if (!k.a(j0.g(f10), e.class)) {
            throw new IllegalArgumentException("type must be a resource");
        } else if (f10 instanceof ParameterizedType) {
            Type f11 = j0.f(0, (ParameterizedType) f10);
            k.e(f11, "bodyType");
            return new k(f11);
        } else {
            throw new IllegalArgumentException("resource must be parameterized");
        }
    }
}
