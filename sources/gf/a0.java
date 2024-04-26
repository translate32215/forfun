package gf;

import android.support.v4.media.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import kd.l;
import org.kodein.di.TypeToken;
import ud.k;

/* compiled from: types.kt */
public final class a0<T> extends k<T> {

    /* renamed from: a  reason: collision with root package name */
    public Type f18644a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f18645b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f18646c;

    public a0(Type type) {
        y yVar;
        this.f18646c = type;
        Type type2 = this.f18644a;
        if (type2 == null) {
            if ((j0.e() || j0.d()) && !(type instanceof Class)) {
                if (!j0.e() || !(type instanceof ParameterizedType)) {
                    yVar = (j0.d() && (type instanceof GenericArrayType)) ? new y(type) : yVar;
                } else {
                    new y(type);
                }
                type = yVar;
            }
            this.f18644a = type;
            type2 = type;
        }
        this.f18645b = type2;
    }

    public TypeToken<?>[] b() {
        TypeVariable[] typeParameters;
        g0<?> g0Var;
        Type type = this.f18644a;
        if (!(type instanceof ParameterizedType)) {
            type = null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType != null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            k.b(actualTypeArguments, "type.actualTypeArguments");
            ArrayList arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                if (type2 instanceof WildcardType) {
                    Type type3 = ((WildcardType) type2).getUpperBounds()[0];
                    k.b(type3, "it.upperBounds[0]");
                    g0Var = j0.b(type3);
                } else {
                    k.b(type2, "it");
                    g0Var = j0.b(type2);
                }
                arrayList.add(g0Var);
            }
            Object[] array = arrayList.toArray(new g0[0]);
            if (array != null) {
                return (g0[]) array;
            }
            throw new l("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Class<?> j10 = j();
        if (j10 == null || (typeParameters = j10.getTypeParameters()) == null) {
            return new g0[0];
        }
        ArrayList arrayList2 = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            k.b(typeVariable, "it");
            Type type4 = typeVariable.getBounds()[0];
            k.b(type4, "it.bounds[0]");
            arrayList2.add(j0.b(type4));
        }
        Object[] array2 = arrayList2.toArray(new g0[0]);
        if (array2 != null) {
            return (g0[]) array2;
        }
        throw new l("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public g0<T> c() {
        Class<?> j10 = j();
        if (j10 != null) {
            return new f(j10);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ld.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ld.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: ld.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<gf.g0<?>> d() {
        /*
            r7 = this;
            java.lang.reflect.Type r0 = r7.f18645b
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x0025
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
            if (r0 == 0) goto L_0x001d
            java.lang.Class r0 = (java.lang.Class) r0
            ae.g[] r1 = gf.j0.f18667a
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            if (r0 == 0) goto L_0x0025
            gf.g0 r0 = gf.j0.b(r0)
            goto L_0x0026
        L_0x001d:
            kd.l r0 = new kd.l
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T>"
            r0.<init>(r1)
            throw r0
        L_0x0025:
            r0 = 0
        L_0x0026:
            java.lang.Class r1 = r7.j()
            if (r1 == 0) goto L_0x004d
            java.lang.reflect.Type[] r1 = r1.getGenericInterfaces()
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = 0
        L_0x003a:
            if (r4 >= r3) goto L_0x004f
            r5 = r1[r4]
            java.lang.String r6 = "it"
            ud.k.b(r5, r6)
            gf.g0 r5 = gf.j0.b(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x003a
        L_0x004d:
            ld.n r2 = ld.n.f21256a
        L_0x004f:
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = ld.h.c(r0)
            goto L_0x0058
        L_0x0056:
            ld.n r0 = ld.n.f21256a
        L_0x0058:
            java.util.List r0 = ld.l.q(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.a0.d():java.util.List");
    }

    public void f(Object obj) {
        i(this.f18645b, obj);
    }

    public Type h() {
        return this.f18645b;
    }

    public final void i(Type type, Object obj) {
        Type f10 = j0.f(type);
        if (!(f10 instanceof Class)) {
            int i10 = 0;
            if (f10 instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) f10).getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i10 < length) {
                    Type type2 = actualTypeArguments[i10];
                    k.b(type2, "arg");
                    i(type2, obj);
                    i10++;
                }
            } else if (f10 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) f10).getGenericComponentType();
                k.b(genericComponentType, "jvmType.genericComponentType");
                i(genericComponentType, obj);
            } else if (f10 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) f10;
                for (Type type3 : wildcardType.getLowerBounds()) {
                    k.b(type3, "arg");
                    i(type3, obj);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i10 < length2) {
                    Type type4 = upperBounds[i10];
                    k.b(type4, "arg");
                    i(type4, obj);
                    i10++;
                }
            } else if (f10 instanceof TypeVariable) {
                throw new IllegalArgumentException(obj + " uses a type variable named " + ((TypeVariable) f10).getName() + ", therefore, the bound value can never be retrieved.");
            } else {
                StringBuilder a10 = a.a("Unknown type ");
                a10.append(f10.getClass());
                a10.append(' ');
                a10.append(f10);
                throw new IllegalArgumentException(a10.toString());
            }
        }
    }

    public final Class<?> j() {
        Type type = this.f18646c;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        Type rawType = ((ParameterizedType) type).getRawType();
        if (rawType != null) {
            return (Class) rawType;
        }
        throw new l("null cannot be cast to non-null type java.lang.Class<*>");
    }
}
