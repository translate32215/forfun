package n1;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: MultiDex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Constructor<?> f21816a;

    public c(Class<?> cls) throws SecurityException, NoSuchMethodException {
        Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
        this.f21816a = constructor;
        constructor.setAccessible(true);
    }

    public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return this.f21816a.newInstance(new Object[]{file, file, dexFile});
    }
}
