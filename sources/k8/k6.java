package k8;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k8.h6;
import k8.k6;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public abstract class k6<MessageType extends k6<MessageType, BuilderType>, BuilderType extends h6<MessageType, BuilderType>> extends g5<MessageType, BuilderType> {
    private static final Map<Object, k6<?, ?>> zza = new ConcurrentHashMap();
    public m8 zzc = m8.f20328f;
    public int zzd = -1;

    public static <E> q6<E> j(q6<E> q6Var) {
        int size = q6Var.size();
        return q6Var.g(size == 0 ? 10 : size + size);
    }

    public static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static <T extends k6> void l(Class<T> cls, T t10) {
        zza.put(cls, t10);
    }

    public static <T extends k6> T p(Class<T> cls) {
        Map<Object, k6<?, ?>> map = zza;
        T t10 = (k6) map.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (k6) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (k6) ((k6) s8.i(cls)).r(6, (Object) null, (Object) null);
            if (t10 != null) {
                map.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    public static p6 q(p6 p6Var) {
        b7 b7Var = (b7) p6Var;
        int i10 = b7Var.f20079c;
        return b7Var.g(i10 == 0 ? 10 : i10 + i10);
    }

    public final /* bridge */ /* synthetic */ f5 a() {
        h6 h6Var = (h6) r(5, (Object) null, (Object) null);
        h6Var.k(this);
        return h6Var;
    }

    public final int c() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int e10 = u7.f20499c.a(getClass()).e(this);
        this.zzd = e10;
        return e10;
    }

    public final /* bridge */ /* synthetic */ m7 d() {
        return (k6) r(6, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ f5 e() {
        return (h6) r(5, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return u7.f20499c.a(getClass()).g(this, (k6) obj);
        }
        return false;
    }

    public final int f() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void h(int i10) {
        this.zzd = i10;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int h10 = u7.f20499c.a(getClass()).h(this);
        this.zzb = h10;
        return h10;
    }

    public final void m(t5 t5Var) throws IOException {
        x7<?> a10 = u7.f20499c.a(getClass());
        u5 u5Var = t5Var.f20475a;
        if (u5Var == null) {
            u5Var = new u5(t5Var);
        }
        a10.f(this, u5Var);
    }

    public final <MessageType extends k6<MessageType, BuilderType>, BuilderType extends h6<MessageType, BuilderType>> BuilderType n() {
        return (h6) r(5, (Object) null, (Object) null);
    }

    public final BuilderType o() {
        BuilderType buildertype = (h6) r(5, (Object) null, (Object) null);
        buildertype.k(this);
        return buildertype;
    }

    public abstract Object r(int i10, Object obj, Object obj2);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        o7.c(this, sb2, 0);
        return sb2.toString();
    }
}
