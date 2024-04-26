package g2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kd.l;
import ud.k;

/* compiled from: WorkManager */
public abstract class h {
    public h(int i10) {
    }

    public Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            k.b(type, "(javaClass.genericSuperc…e).actualTypeArguments[0]");
            return type;
        }
        throw new l("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
    }
}
