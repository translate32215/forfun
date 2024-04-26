package lf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import ke.c0;
import ke.d;
import ke.e0;
import ke.s;
import lf.a;
import lf.c;
import lf.j;

/* compiled from: Retrofit */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Method, g0<?>> f21332a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final d.a f21333b;

    /* renamed from: c  reason: collision with root package name */
    public final s f21334c;

    /* renamed from: d  reason: collision with root package name */
    public final List<j.a> f21335d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f21336e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final Executor f21337f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21338g;

    public f0(d.a aVar, s sVar, List<j.a> list, List<c.a> list2, @Nullable Executor executor, boolean z10) {
        this.f21333b = aVar;
        this.f21334c = sVar;
        this.f21335d = list;
        this.f21336e = list2;
        this.f21337f = executor;
        this.f21338g = z10;
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        if (type == null) {
            throw new NullPointerException("returnType == null");
        } else if (annotationArr != null) {
            int indexOf = this.f21336e.indexOf((Object) null) + 1;
            int size = this.f21336e.size();
            for (int i10 = indexOf; i10 < size; i10++) {
                c<?, ?> a10 = this.f21336e.get(i10).a(type, annotationArr, this);
                if (a10 != null) {
                    return a10;
                }
            }
            StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
            sb2.append(type);
            sb2.append(".\n");
            sb2.append("  Tried:");
            int size2 = this.f21336e.size();
            while (indexOf < size2) {
                sb2.append("\n   * ");
                sb2.append(this.f21336e.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb2.toString());
        } else {
            throw new NullPointerException("annotations == null");
        }
    }

    public g0<?> b(Method method) {
        g0<?> g0Var;
        g0<?> g0Var2 = this.f21332a.get(method);
        if (g0Var2 != null) {
            return g0Var2;
        }
        synchronized (this.f21332a) {
            g0Var = this.f21332a.get(method);
            if (g0Var == null) {
                g0Var = g0.b(this, method);
                this.f21332a.put(method, g0Var);
            }
        }
        return g0Var;
    }

    public <T> j<T, c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (annotationArr == null) {
            throw new NullPointerException("parameterAnnotations == null");
        } else if (annotationArr2 != null) {
            int indexOf = this.f21335d.indexOf((Object) null) + 1;
            int size = this.f21335d.size();
            for (int i10 = indexOf; i10 < size; i10++) {
                j<?, c0> a10 = this.f21335d.get(i10).a(type, annotationArr, annotationArr2, this);
                if (a10 != null) {
                    return a10;
                }
            }
            StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
            sb2.append(type);
            sb2.append(".\n");
            sb2.append("  Tried:");
            int size2 = this.f21335d.size();
            while (indexOf < size2) {
                sb2.append("\n   * ");
                sb2.append(this.f21335d.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb2.toString());
        } else {
            throw new NullPointerException("methodAnnotations == null");
        }
    }

    public <T> j<e0, T> d(Type type, Annotation[] annotationArr) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (annotationArr != null) {
            int indexOf = this.f21335d.indexOf((Object) null) + 1;
            int size = this.f21335d.size();
            for (int i10 = indexOf; i10 < size; i10++) {
                j<e0, ?> b10 = this.f21335d.get(i10).b(type, annotationArr, this);
                if (b10 != null) {
                    return b10;
                }
            }
            StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
            sb2.append(type);
            sb2.append(".\n");
            sb2.append("  Tried:");
            int size2 = this.f21335d.size();
            while (indexOf < size2) {
                sb2.append("\n   * ");
                sb2.append(this.f21335d.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb2.toString());
        } else {
            throw new NullPointerException("annotations == null");
        }
    }

    public <T> j<T, String> e(Type type, Annotation[] annotationArr) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (annotationArr != null) {
            int size = this.f21335d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f21335d.get(i10).getClass();
            }
            return a.d.f21284a;
        } else {
            throw new NullPointerException("annotations == null");
        }
    }
}
