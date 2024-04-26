package n1;

import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.ZipFile;

/* compiled from: MultiDex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Constructor<?> f21815a;

    public b(Class<?> cls) throws SecurityException, NoSuchMethodException {
        Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
        this.f21815a = constructor;
        constructor.setAccessible(true);
    }

    public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
        return this.f21815a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
    }
}
