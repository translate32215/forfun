package z9;

import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;

public final class o {

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    public static IBinder a(Class<?> cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z10) throws a {
        try {
            return (IBinder) cls.getConstructor(new Class[]{IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE}).newInstance(new Object[]{iBinder, iBinder2, iBinder3, Boolean.valueOf(z10)});
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            throw new a(name.length() != 0 ? "Could not find the right constructor for ".concat(name) : new String("Could not find the right constructor for "), e10);
        } catch (InvocationTargetException e11) {
            String name2 = cls.getName();
            throw new a(name2.length() != 0 ? "Exception thrown by invoked constructor in ".concat(name2) : new String("Exception thrown by invoked constructor in "), e11);
        } catch (InstantiationException e12) {
            String name3 = cls.getName();
            throw new a(name3.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name3) : new String("Unable to instantiate the dynamic class "), e12);
        } catch (IllegalAccessException e13) {
            String name4 = cls.getName();
            throw new a(name4.length() != 0 ? "Unable to call the default constructor of ".concat(name4) : new String("Unable to call the default constructor of "), e13);
        }
    }
}
