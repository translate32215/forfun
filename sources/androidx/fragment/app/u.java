package androidx.fragment.app;

import androidx.fragment.app.p;
import q.b;
import s.i;

/* compiled from: FragmentFactory */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public static final i<ClassLoader, i<String, Class<?>>> f1872a = new i<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        i<ClassLoader, i<String, Class<?>>> iVar = f1872a;
        i orDefault = iVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new i();
            iVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends p> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new p.e(b.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        } catch (ClassCastException e11) {
            throw new p.e(b.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e11);
        }
    }

    public p a(ClassLoader classLoader, String str) {
        throw null;
    }
}
