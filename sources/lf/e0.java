package lf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* compiled from: Retrofit */
public class e0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final y f21327a = y.f21433a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f21328b = new Object[0];

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f21329c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f0 f21330d;

    public e0(f0 f0Var, Class cls) {
        this.f21330d = f0Var;
        this.f21329c = cls;
    }

    @Nullable
    public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (this.f21327a.g(method)) {
            return this.f21327a.f(method, this.f21329c, obj, objArr);
        }
        g0<?> b10 = this.f21330d.b(method);
        if (objArr == null) {
            objArr = this.f21328b;
        }
        return b10.a(objArr);
    }
}
