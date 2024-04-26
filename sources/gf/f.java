package gf;

import ae.g;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kd.l;
import ld.h;
import ld.n;
import org.kodein.di.TypeToken;
import ud.k;

/* compiled from: types.kt */
public final class f<T> extends k<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f18663a;

    public f(Class<T> cls) {
        this.f18663a = cls;
    }

    public TypeToken<?>[] b() {
        TypeVariable[] typeParameters = this.f18663a.getTypeParameters();
        k.b(typeParameters, "jvmType.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            k.b(typeVariable, "it");
            Type type = typeVariable.getBounds()[0];
            k.b(type, "it.bounds[0]");
            arrayList.add(j0.b(type));
        }
        Object[] array = arrayList.toArray(new g0[0]);
        if (array != null) {
            return (g0[]) array;
        }
        throw new l("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public g0 c() {
        return this;
    }

    public List<g0<?>> d() {
        Class<T> cls = this.f18663a;
        g[] gVarArr = j0.f18667a;
        Type genericSuperclass = cls.getGenericSuperclass();
        g0<?> b10 = genericSuperclass != null ? j0.b(genericSuperclass) : null;
        List<?> c10 = b10 != null ? h.c(b10) : n.f21256a;
        Type[] genericInterfaces = this.f18663a.getGenericInterfaces();
        k.b(genericInterfaces, "jvmType.genericInterfaces");
        ArrayList arrayList = new ArrayList(genericInterfaces.length);
        for (Type type : genericInterfaces) {
            k.b(type, "it");
            arrayList.add(j0.b(type));
        }
        return ld.l.q(c10, arrayList);
    }

    public void f(Object obj) {
    }

    public boolean g(g0<?> g0Var) {
        k.g(g0Var, "typeToken");
        if (g0Var instanceof f) {
            return this.f18663a.isAssignableFrom(((f) g0Var).f18663a);
        }
        return super.g(g0Var);
    }

    public Type h() {
        return this.f18663a;
    }
}
