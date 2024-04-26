package lf;

import de.f;
import java.lang.reflect.Method;
import kd.b;
import l0.e;
import ud.k;

/* compiled from: KotlinExtensions.kt */
public final class p implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f21372a;

    public p(f fVar) {
        this.f21372a = fVar;
    }

    public void a(b<Object> bVar, d0<Object> d0Var) {
        k.g(bVar, "call");
        k.g(d0Var, "response");
        if (d0Var.b()) {
            T t10 = d0Var.f21324b;
            if (t10 == null) {
                Class<n> cls = n.class;
                n cast = cls.cast(bVar.M().f20884e.get(cls));
                if (cast != null) {
                    k.b(cast, "call.request().tag(Invocation::class.java)!!");
                    Method method = cast.f21369a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Response from ");
                    k.b(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    k.b(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(method.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    this.f21372a.g(e.a(new b(sb2.toString())));
                    return;
                }
                k.k();
                throw null;
            }
            this.f21372a.g(t10);
            return;
        }
        this.f21372a.g(e.a(new l(d0Var)));
    }

    public void b(b<Object> bVar, Throwable th) {
        k.g(bVar, "call");
        k.g(th, "t");
        this.f21372a.g(e.a(th));
    }
}
