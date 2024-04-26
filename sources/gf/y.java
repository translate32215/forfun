package gf;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import ld.e;
import ld.q;
import ud.k;
import zd.b;
import zd.c;

/* compiled from: types.kt */
public final class y implements Type {

    /* renamed from: a  reason: collision with root package name */
    public int f18700a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f18701b;

    /* compiled from: types.kt */
    public static final class a {
        public static final boolean a(Type type, Type type2) {
            k.g(type, "l");
            k.g(type2, "r");
            Type f10 = j0.f(type);
            Type f11 = j0.f(type2);
            if (!k.a(f10.getClass(), f11.getClass())) {
                return false;
            }
            if (f10 instanceof Class) {
                return k.a(f10, f11);
            }
            if (f10 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) f11;
                ParameterizedType parameterizedType2 = (ParameterizedType) f10;
                Type rawType = parameterizedType2.getRawType();
                k.b(rawType, "left.rawType");
                Type rawType2 = parameterizedType.getRawType();
                k.b(rawType2, "right.rawType");
                if (a(rawType, rawType2)) {
                    Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                    k.b(actualTypeArguments, "left.actualTypeArguments");
                    Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                    k.b(actualTypeArguments2, "right.actualTypeArguments");
                    if (b(actualTypeArguments, actualTypeArguments2)) {
                        return true;
                    }
                }
            } else if (f10 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) f11;
                WildcardType wildcardType2 = (WildcardType) f10;
                Type[] lowerBounds = wildcardType2.getLowerBounds();
                k.b(lowerBounds, "left.lowerBounds");
                Type[] lowerBounds2 = wildcardType.getLowerBounds();
                k.b(lowerBounds2, "right.lowerBounds");
                if (b(lowerBounds, lowerBounds2)) {
                    Type[] upperBounds = wildcardType2.getUpperBounds();
                    k.b(upperBounds, "left.upperBounds");
                    Type[] upperBounds2 = wildcardType.getUpperBounds();
                    k.b(upperBounds2, "right.upperBounds");
                    if (b(upperBounds, upperBounds2)) {
                        return true;
                    }
                }
            } else if (f10 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) f10).getGenericComponentType();
                k.b(genericComponentType, "left.genericComponentType");
                Type genericComponentType2 = ((GenericArrayType) f11).getGenericComponentType();
                k.b(genericComponentType2, "right.genericComponentType");
                return a(genericComponentType, genericComponentType2);
            } else if (!(f10 instanceof TypeVariable)) {
                return k.a(f10, f11);
            } else {
                Type[] bounds = ((TypeVariable) f10).getBounds();
                k.b(bounds, "left.bounds");
                Type[] bounds2 = ((TypeVariable) f11).getBounds();
                k.b(bounds2, "right.bounds");
                return b(bounds, bounds2);
            }
            return false;
        }

        public static final boolean b(Type[] typeArr, Type[] typeArr2) {
            if (typeArr.length != typeArr2.length) {
                return false;
            }
            c cVar = new c(0, e.g(typeArr));
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                q j10 = cVar.iterator();
                while (((b) j10).f28844c) {
                    int a10 = j10.a();
                    if (!a(typeArr[a10], typeArr2[a10])) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static final int c(Type type) {
            k.g(type, "type");
            if (type instanceof Class) {
                return type.hashCode();
            }
            int i10 = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                k.b(rawType, "type.rawType");
                int c10 = c(rawType);
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i10 < length) {
                    Type type2 = actualTypeArguments[i10];
                    k.b(type2, "arg");
                    c10 = (c10 * 31) + c(type2);
                    i10++;
                }
                return c10;
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                int i11 = 0;
                for (Type type3 : wildcardType.getUpperBounds()) {
                    k.b(type3, "arg");
                    i11 = (i11 * 19) + c(type3);
                }
                Type[] lowerBounds = wildcardType.getLowerBounds();
                int length2 = lowerBounds.length;
                while (i10 < length2) {
                    Type type4 = lowerBounds[i10];
                    k.b(type4, "arg");
                    i11 = (i11 * 17) + c(type4);
                    i10++;
                }
                return i11;
            } else if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                k.b(genericComponentType, "type.genericComponentType");
                return c(genericComponentType) + 53;
            } else if (!(type instanceof TypeVariable)) {
                return type.hashCode();
            } else {
                for (Type type5 : ((TypeVariable) type).getBounds()) {
                    int i12 = i10 * 29;
                    k.b(type5, "arg");
                    i10 = i12 + c(type5);
                }
                return i10;
            }
        }
    }

    public y(Type type) {
        this.f18701b = type;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Type) || hashCode() != obj.hashCode()) {
            return false;
        }
        return a.a(this.f18701b, (Type) obj);
    }

    public int hashCode() {
        if (this.f18700a == 0) {
            this.f18700a = a.c(this.f18701b);
        }
        return this.f18700a;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("KodeinWrappedType{");
        a10.append(this.f18701b);
        a10.append('}');
        return a10.toString();
    }
}
