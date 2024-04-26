package ud;

import ae.c;

/* compiled from: ReflectionFactory */
public class w {
    public c a(Class cls, String str) {
        return new m(cls, str);
    }

    public String b(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
