package androidx.versionedparcelable;

import android.os.Parcelable;
import d2.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: VersionedParcel */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final s.a<String, Method> f3166a;

    /* renamed from: b  reason: collision with root package name */
    public final s.a<String, Method> f3167b;

    /* renamed from: c  reason: collision with root package name */
    public final s.a<String, Class> f3168c;

    public a(s.a<String, Method> aVar, s.a<String, Method> aVar2, s.a<String, Class> aVar3) {
        this.f3166a = aVar;
        this.f3167b = aVar2;
        this.f3168c = aVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> cls) throws ClassNotFoundException {
        Class orDefault = this.f3168c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3168c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<a> cls = a.class;
        Method orDefault = this.f3166a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3166a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f3167b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c10 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c10.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f3167b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i10);

    public abstract int j();

    public int k(int i10, int i11) {
        if (!i(i11)) {
            return i10;
        }
        return j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t10, int i10) {
        if (!i(i10)) {
            return t10;
        }
        return l();
    }

    public abstract String n();

    public <T extends c> T o() {
        String n10 = n();
        if (n10 == null) {
            return null;
        }
        a b10 = b();
        try {
            return (c) d(n10).invoke((Object) null, new Object[]{b10});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    public abstract void p(int i10);

    public abstract void q(boolean z10);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i10);

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    public void w(c cVar) {
        if (cVar == null) {
            v((String) null);
            return;
        }
        try {
            v(c(cVar.getClass()).getName());
            a b10 = b();
            try {
                e(cVar.getClass()).invoke((Object) null, new Object[]{cVar, b10});
                b10.a();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e14);
        }
    }
}
