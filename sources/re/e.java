package re;

import android.support.v4.media.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: OptionalMethod */
public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f24791a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24792b;

    /* renamed from: c  reason: collision with root package name */
    public final Class[] f24793c;

    public e(Class<?> cls, String str, Class... clsArr) {
        this.f24791a = cls;
        this.f24792b = str;
        this.f24793c = clsArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f24792b
            r1 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.Class[] r2 = r3.f24793c
            java.lang.reflect.Method r4 = r4.getMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0016 }
            int r0 = r4.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0014 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0017
            goto L_0x0016
        L_0x0014:
            goto L_0x0017
        L_0x0016:
            r4 = r1
        L_0x0017:
            if (r4 == 0) goto L_0x0028
            java.lang.Class<?> r0 = r3.f24791a
            if (r0 == 0) goto L_0x0028
            java.lang.Class r2 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = r4
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: re.e.a(java.lang.Class):java.lang.reflect.Method");
    }

    public Object b(T t10, Object... objArr) throws InvocationTargetException {
        Method a10 = a(t10.getClass());
        if (a10 != null) {
            try {
                return a10.invoke(t10, objArr);
            } catch (IllegalAccessException e10) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a10);
                assertionError.initCause(e10);
                throw assertionError;
            }
        } else {
            StringBuilder a11 = a.a("Method ");
            a11.append(this.f24792b);
            a11.append(" not supported for object ");
            a11.append(t10);
            throw new AssertionError(a11.toString());
        }
    }

    public Object c(T t10, Object... objArr) {
        try {
            Method a10 = a(t10.getClass());
            if (a10 == null) {
                return null;
            }
            try {
                return a10.invoke(t10, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object d(T t10, Object... objArr) {
        try {
            return b(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
