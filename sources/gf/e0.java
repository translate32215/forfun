package gf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import ud.k;

/* compiled from: types.kt */
public abstract class e0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Type f18662a;

    public e0() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) (!(genericSuperclass instanceof ParameterizedType) ? null : genericSuperclass);
        if (parameterizedType != null) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            k.b(type, "(javaClass.genericSuperc…)).actualTypeArguments[0]");
            this.f18662a = type;
            return;
        }
        throw new RuntimeException("Invalid TypeToken; must specify type parameters");
    }
}
