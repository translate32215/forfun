package ud;

import ae.b;

/* compiled from: Reflection */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final w f26198a;

    /* renamed from: b  reason: collision with root package name */
    public static final b[] f26199b = new b[0];

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (wVar == null) {
            wVar = new w();
        }
        f26198a = wVar;
    }

    public static b a(Class cls) {
        f26198a.getClass();
        return new d(cls);
    }
}
