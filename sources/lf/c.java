package lf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: CallAdapter */
public interface c<R, T> {

    /* compiled from: CallAdapter */
    public static abstract class a {
        @Nullable
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, f0 f0Var);
    }

    T a(b<R> bVar);

    Type b();
}
