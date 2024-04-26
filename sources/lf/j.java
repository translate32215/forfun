package lf;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import ke.c0;
import ke.e0;

/* compiled from: Converter */
public interface j<F, T> {

    /* compiled from: Converter */
    public static abstract class a {
        @Nullable
        public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, f0 f0Var) {
            return null;
        }

        @Nullable
        public j<e0, ?> b(Type type, Annotation[] annotationArr, f0 f0Var) {
            return null;
        }
    }

    @Nullable
    T a(F f10) throws IOException;
}
