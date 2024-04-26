package lf;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import ke.e0;
import lf.j;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* compiled from: OptionalConverterFactory */
public final class u extends j.a {

    /* renamed from: a  reason: collision with root package name */
    public static final j.a f21394a = new u();

    @IgnoreJRERequirement
    /* compiled from: OptionalConverterFactory */
    public static final class a<T> implements j<e0, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final j<e0, T> f21395a;

        public a(j<e0, T> jVar) {
            this.f21395a = jVar;
        }

        public Object a(Object obj) throws IOException {
            return Optional.ofNullable(this.f21395a.a((e0) obj));
        }
    }

    @Nullable
    public j<e0, ?> b(Type type, Annotation[] annotationArr, f0 f0Var) {
        if (j0.g(type) != Optional.class) {
            return null;
        }
        return new a(f0Var.d(j0.f(0, (ParameterizedType) type), annotationArr));
    }
}
