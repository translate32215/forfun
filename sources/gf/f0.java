package gf;

import android.support.v4.media.a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import ld.e;
import ld.l;
import ud.k;

/* compiled from: typeDisp.kt */
public abstract class f0 {
    public static /* synthetic */ String c(f0 f0Var, Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return f0Var.b(type, z10);
    }

    public abstract String a(Class<?> cls, boolean z10);

    public final String b(Type type, boolean z10) {
        String str;
        boolean z11;
        k.g(type, "type");
        Type f10 = j0.f(type);
        if (f10 instanceof Class) {
            return a((Class) f10, z10);
        }
        if (f10 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) f10;
            Type rawType = parameterizedType.getRawType();
            if (rawType != null) {
                TypeVariable[] typeParameters = ((Class) rawType).getTypeParameters();
                k.b(typeParameters, "cls.typeParameters");
                ArrayList arrayList = new ArrayList(typeParameters.length);
                int length = typeParameters.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    TypeVariable typeVariable = typeParameters[i10];
                    int i12 = i11 + 1;
                    Type type2 = parameterizedType.getActualTypeArguments()[i11];
                    if (type2 instanceof WildcardType) {
                        k.b(typeVariable, "variable");
                        Type[] bounds = typeVariable.getBounds();
                        k.b(bounds, "variable.bounds");
                        int length2 = bounds.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length2) {
                                z11 = false;
                                break;
                            }
                            Type type3 = bounds[i13];
                            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                            k.b(upperBounds, "argument.upperBounds");
                            if (e.b(upperBounds, type3)) {
                                z11 = true;
                                break;
                            }
                            i13++;
                        }
                        if (z11) {
                            str = "*";
                            arrayList.add(str);
                            i10++;
                            i11 = i12;
                        }
                    }
                    k.b(type2, "argument");
                    str = c(this, type2, false, 2, (Object) null);
                    arrayList.add(str);
                    i10++;
                    i11 = i12;
                }
                StringBuilder sb2 = new StringBuilder();
                Type rawType2 = parameterizedType.getRawType();
                k.b(rawType2, "jvmType.rawType");
                sb2.append(b(rawType2, true));
                sb2.append("<");
                return androidx.activity.e.a(sb2, l.m(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (td.l) null, 62), ">");
            }
            throw new kd.l("null cannot be cast to non-null type java.lang.Class<*>");
        } else if (f10 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) f10;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            k.b(lowerBounds, "jvmType.lowerBounds");
            if (!(lowerBounds.length == 0)) {
                StringBuilder a10 = a.a("in ");
                Type type4 = wildcardType.getLowerBounds()[0];
                k.b(type4, "jvmType.lowerBounds[0]");
                a10.append(c(this, type4, false, 2, (Object) null));
                return a10.toString();
            }
            Type[] upperBounds2 = wildcardType.getUpperBounds();
            k.b(upperBounds2, "jvmType.upperBounds");
            if (!(!(upperBounds2.length == 0)) || k.a(wildcardType.getUpperBounds()[0], Object.class)) {
                return "*";
            }
            StringBuilder a11 = a.a("out ");
            Type type5 = wildcardType.getUpperBounds()[0];
            k.b(type5, "jvmType.upperBounds[0]");
            a11.append(c(this, type5, false, 2, (Object) null));
            return a11.toString();
        } else if (f10 instanceof GenericArrayType) {
            StringBuilder a12 = a.a("Array<");
            Type genericComponentType = ((GenericArrayType) f10).getGenericComponentType();
            k.b(genericComponentType, "jvmType.genericComponentType");
            a12.append(c(this, genericComponentType, false, 2, (Object) null));
            a12.append(">");
            return a12.toString();
        } else if (f10 instanceof TypeVariable) {
            String name = ((TypeVariable) f10).getName();
            k.b(name, "jvmType.name");
            return name;
        } else {
            StringBuilder a13 = a.a("Unknown type ");
            a13.append(getClass());
            throw new IllegalStateException(a13.toString());
        }
    }
}
