package k8;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import k8.x5;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public abstract class f6<T extends x5> {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f20206a = Logger.getLogger(t5.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final String f20207b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static <T extends x5> T b(Class<T> cls) {
        String str;
        String str2;
        Class<f6> cls2 = f6.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(x5.class)) {
            str = f20207b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (x5) cls.cast(((f6) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (IllegalAccessException e12) {
            throw new IllegalStateException(e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException(e13);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((f6) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    ServiceConfigurationError serviceConfigurationError = e14;
                    Logger logger = f20206a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    if (simpleName.length() != 0) {
                        str2 = "Unable to load ".concat(simpleName);
                    } else {
                        str2 = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (x5) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (x5) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract T a();
}
