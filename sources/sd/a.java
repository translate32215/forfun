package sd;

import ae.b;
import ud.c;
import ud.k;

/* compiled from: JvmClassMapping.kt */
public final class a {
    public static final <T> Class<T> a(b<T> bVar) {
        k.f(bVar, "<this>");
        Class<?> a10 = ((c) bVar).a();
        k.d(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a10;
    }

    public static final <T> Class<T> b(b<T> bVar) {
        k.f(bVar, "<this>");
        Class<?> a10 = ((c) bVar).a();
        if (!a10.isPrimitive()) {
            return a10;
        }
        String name = a10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a10 : Double.class;
            case 104431:
                return !name.equals("int") ? a10 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a10 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a10 : Character.class;
            case 3327612:
                return !name.equals("long") ? a10 : Long.class;
            case 3625364:
                return !name.equals("void") ? a10 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a10 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a10 : Float.class;
            case 109413500:
                return !name.equals("short") ? a10 : Short.class;
            default:
                return a10;
        }
    }
}
