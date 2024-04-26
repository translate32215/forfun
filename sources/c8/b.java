package c8;

import android.os.IBinder;
import androidx.appcompat.widget.d0;
import c8.a;
import com.google.android.gms.common.internal.i;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class b<T> extends a.C0062a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4359a;

    public b(Object obj) {
        this.f4359a = obj;
    }

    public static <T> T z0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f4359a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            i.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(d0.a("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
    }
}
