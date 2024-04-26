package lf;

import androidx.appcompat.widget.y0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import javax.annotation.Nullable;
import ke.e0;
import ve.f;

/* compiled from: Utils */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f21345a = new Type[0];

    /* compiled from: Utils */
    public static final class a implements GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        public final Type f21346a;

        public a(Type type) {
            this.f21346a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && j0.d(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f21346a;
        }

        public int hashCode() {
            return this.f21346a.hashCode();
        }

        public String toString() {
            return j0.q(this.f21346a) + "[]";
        }
    }

    /* compiled from: Utils */
    public static final class b implements ParameterizedType {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final Type f21347a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f21348b;

        /* renamed from: c  reason: collision with root package name */
        public final Type[] f21349c;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                j0.b(type3, "typeArgument == null");
                j0.c(type3);
            }
            this.f21347a = type;
            this.f21348b = type2;
            this.f21349c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && j0.d(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f21349c.clone();
        }

        @Nullable
        public Type getOwnerType() {
            return this.f21347a;
        }

        public Type getRawType() {
            return this.f21348b;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f21349c) ^ this.f21348b.hashCode();
            Type type = this.f21347a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f21349c;
            if (typeArr.length == 0) {
                return j0.q(this.f21348b);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(j0.q(this.f21348b));
            sb2.append("<");
            sb2.append(j0.q(this.f21349c[0]));
            for (int i10 = 1; i10 < this.f21349c.length; i10++) {
                sb2.append(", ");
                sb2.append(j0.q(this.f21349c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: Utils */
    public static final class c implements WildcardType {

        /* renamed from: a  reason: collision with root package name */
        public final Type f21350a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final Type f21351b;

        public c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                j0.c(typeArr2[0]);
                if (typeArr[0] == cls) {
                    this.f21351b = typeArr2[0];
                    this.f21350a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                typeArr[0].getClass();
                j0.c(typeArr[0]);
                this.f21351b = null;
                this.f21350a = typeArr[0];
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && j0.d(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f21351b;
            if (type == null) {
                return j0.f21345a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f21350a};
        }

        public int hashCode() {
            Type type = this.f21351b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f21350a.hashCode() + 31);
        }

        public String toString() {
            if (this.f21351b != null) {
                StringBuilder a10 = android.support.v4.media.a.a("? super ");
                a10.append(j0.q(this.f21351b));
                return a10.toString();
            } else if (this.f21350a == Object.class) {
                return "?";
            } else {
                StringBuilder a11 = android.support.v4.media.a.a("? extends ");
                a11.append(j0.q(this.f21350a));
                return a11.toString();
            }
        }
    }

    public static e0 a(e0 e0Var) throws IOException {
        f fVar = new f();
        e0Var.o().K(fVar);
        return e0.i(e0Var.d(), e0Var.a(), fVar);
    }

    public static <T> T b(@Nullable T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (interfaces[i10] == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(interfaces[i10])) {
                    return e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type f(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 < 0 || i10 >= actualTypeArguments.length) {
            StringBuilder a10 = y0.a("Index ", i10, " not in range [0,");
            a10.append(actualTypeArguments.length);
            a10.append(") for ");
            a10.append(parameterizedType);
            throw new IllegalArgumentException(a10.toString());
        }
        Type type = actualTypeArguments[i10];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    public static Class<?> g(Type type) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (type instanceof Class) {
            return (Class) type;
        } else {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    return g(((WildcardType) type).getUpperBounds()[0]);
                }
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
            }
        }
    }

    public static Type h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return o(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean i(@Nullable Type type) {
        String str;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type i10 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (i(i10)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return i(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    public static boolean j(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    public static RuntimeException k(Method method, String str, Object... objArr) {
        return l(method, (Throwable) null, str, objArr);
    }

    public static RuntimeException l(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder a10 = t.f.a(String.format(str, objArr), "\n    for method ");
        a10.append(method.getDeclaringClass().getSimpleName());
        a10.append(".");
        a10.append(method.getName());
        return new IllegalArgumentException(a10.toString(), th);
    }

    public static RuntimeException m(Method method, int i10, String str, Object... objArr) {
        StringBuilder a10 = t.f.a(str, " (parameter #");
        a10.append(i10 + 1);
        a10.append(")");
        return k(method, a10.toString(), objArr);
    }

    public static RuntimeException n(Method method, Throwable th, int i10, String str, Object... objArr) {
        StringBuilder a10 = t.f.a(str, " (parameter #");
        a10.append(i10 + 1);
        a10.append(")");
        return l(method, th, a10.toString(), objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[LOOP:0: B:0:0x0000->B:21:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type o(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0012
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            goto L_0x003f
        L_0x0016:
            java.lang.reflect.Type r2 = e(r8, r9, r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x003f
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L_0x0022:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0039
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0036
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L_0x0040
        L_0x0036:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x0039:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x003f:
            r0 = r10
        L_0x0040:
            if (r0 != r10) goto L_0x0043
            return r0
        L_0x0043:
            r10 = r0
            goto L_0x0000
        L_0x0045:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0063
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0063
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = o(r8, r9, r10)
            if (r10 != r8) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            lf.j0$a r0 = new lf.j0$a
            r0.<init>(r8)
        L_0x0062:
            return r0
        L_0x0063:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x007a
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = o(r8, r9, r0)
            if (r0 != r8) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            lf.j0$a r10 = new lf.j0$a
            r10.<init>(r8)
        L_0x0079:
            return r10
        L_0x007a:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00bb
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = o(r8, r9, r0)
            if (r3 == r0) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0093:
            if (r1 >= r5) goto L_0x00ae
            r6 = r4[r1]
            java.lang.reflect.Type r6 = o(r8, r9, r6)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00ab
            if (r0 != 0) goto L_0x00a9
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00a9:
            r4[r1] = r6
        L_0x00ab:
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00ae:
            if (r0 == 0) goto L_0x00ba
            lf.j0$b r8 = new lf.j0$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x00ba:
            return r10
        L_0x00bb:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0101
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00e6
            r3 = r0[r1]
            java.lang.reflect.Type r8 = o(r8, r9, r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x0101
            lf.j0$c r9 = new lf.j0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00e6:
            int r0 = r3.length
            if (r0 != r2) goto L_0x0101
            r0 = r3[r1]
            java.lang.reflect.Type r8 = o(r8, r9, r0)     // Catch:{ all -> 0x00ff }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x0101
            lf.j0$c r9 = new lf.j0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = f21345a
            r9.<init>(r10, r8)
            return r9
        L_0x00ff:
            r8 = move-exception
            throw r8
        L_0x0101:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.j0.o(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void p(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String q(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
