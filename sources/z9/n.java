package z9;

import android.os.IBinder;
import java.lang.reflect.Field;
import z9.m;

public final class n<T> extends m.a {

    /* renamed from: b  reason: collision with root package name */
    public final T f28772b;

    public n(T t10) {
        this.f28772b = t10;
    }

    public static <T> T m(m mVar) {
        if (mVar instanceof n) {
            return ((n) mVar).f28772b;
        }
        IBinder asBinder = mVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalArgumentException e11) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e12);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
