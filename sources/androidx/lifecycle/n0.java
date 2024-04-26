package androidx.lifecycle;

import android.app.Application;
import android.support.v4.media.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ld.e;
import ld.h;
import ld.n;
import ud.k;

/* compiled from: SavedStateViewModelFactory.kt */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f2686a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f2687b;

    static {
        Class<i0> cls = i0.class;
        f2686a = e.a(new Class[]{Application.class, cls});
        f2687b = h.c(cls);
    }

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        List list2;
        k.f(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        k.e(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor<T> constructor = constructors[i10];
            Class[] parameterTypes = constructor.getParameterTypes();
            k.e(parameterTypes, "constructor.parameterTypes");
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                list2 = n.f21256a;
            } else if (length2 != 1) {
                list2 = new ArrayList(h.a(parameterTypes));
            } else {
                list2 = h.c(parameterTypes[0]);
            }
            if (k.a(list, list2)) {
                return constructor;
            }
            if (list.size() != list2.size() || !list2.containsAll(list)) {
                i10++;
            } else {
                StringBuilder a10 = a.a("Class ");
                a10.append(cls.getSimpleName());
                a10.append(" must have parameters in the proper order: ");
                a10.append(list);
                throw new UnsupportedOperationException(a10.toString());
            }
        }
        return null;
    }

    public static final <T extends q0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return (q0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
