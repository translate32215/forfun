package lf;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* compiled from: Invocation */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Method f21369a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f21370b;

    public n(Method method, List<?> list) {
        this.f21369a = method;
        this.f21370b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f21369a.getDeclaringClass().getName(), this.f21369a.getName(), this.f21370b});
    }
}
