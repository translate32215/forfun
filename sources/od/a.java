package od;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kd.o;
import l0.e;
import md.d;
import od.f;
import ud.k;

/* compiled from: ContinuationImpl.kt */
public abstract class a implements d<Object>, d, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final d<Object> f23683a;

    public a(d<Object> dVar) {
        this.f23683a = dVar;
    }

    public d<o> a(Object obj, d<?> dVar) {
        k.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public d f() {
        d<Object> dVar = this.f23683a;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final void g(Object obj) {
        d dVar = this;
        while (true) {
            k.f(dVar, "frame");
            a aVar = (a) dVar;
            d dVar2 = aVar.f23683a;
            k.c(dVar2);
            try {
                obj = aVar.l(obj);
                if (obj == nd.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = e.a(th);
            }
            aVar.m();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.g(obj);
                return;
            }
        }
    }

    public StackTraceElement i() {
        int i10;
        String str;
        k.f(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 <= 1) {
            int i11 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i10 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i11 = eVar.l()[i10];
            }
            k.f(this, "continuation");
            f.a aVar = f.f23688b;
            if (aVar == null) {
                try {
                    f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.f23688b = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = f.f23687a;
                    f.f23688b = aVar;
                }
            }
            if (aVar != f.f23687a) {
                Method method = aVar.f23689a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = aVar.f23690b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = aVar.f23691c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + 1 + ", got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object l(Object obj);

    public void m() {
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Continuation at ");
        Object i10 = i();
        if (i10 == null) {
            i10 = getClass().getName();
        }
        a10.append(i10);
        return a10.toString();
    }
}
