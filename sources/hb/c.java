package hb;

import com.google.gson.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor */
public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f18971d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18972b;

    /* renamed from: c  reason: collision with root package name */
    public final Field f18973c;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f18971d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f18972b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f18973c = field;
    }

    public void a(AccessibleObject accessibleObject) {
        boolean z10 = false;
        if (!(this.f18972b == null || this.f18973c == null)) {
            try {
                long longValue = ((Long) f18971d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f18972b, new Object[]{this.f18973c})).longValue();
                f18971d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f18972b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }
}
