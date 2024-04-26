package lf;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kd.o;
import ke.c0;
import ke.e0;
import lf.j;
import nf.w;

/* compiled from: BuiltInConverters */
public final class a extends j.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21280a = true;

    /* renamed from: lf.a$a  reason: collision with other inner class name */
    /* compiled from: BuiltInConverters */
    public static final class C0184a implements j<e0, e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0184a f21281a = new C0184a();

        public Object a(Object obj) throws IOException {
            e0 e0Var = (e0) obj;
            try {
                return j0.a(e0Var);
            } finally {
                e0Var.close();
            }
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class b implements j<c0, c0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21282a = new b();

        public Object a(Object obj) throws IOException {
            return (c0) obj;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class c implements j<e0, e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f21283a = new c();

        public Object a(Object obj) throws IOException {
            return (e0) obj;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class d implements j<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f21284a = new d();

        public Object a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class e implements j<e0, o> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f21285a = new e();

        public Object a(Object obj) throws IOException {
            ((e0) obj).close();
            return o.f20627a;
        }
    }

    /* compiled from: BuiltInConverters */
    public static final class f implements j<e0, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f21286a = new f();

        public Object a(Object obj) throws IOException {
            ((e0) obj).close();
            return null;
        }
    }

    @Nullable
    public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, f0 f0Var) {
        if (c0.class.isAssignableFrom(j0.g(type))) {
            return b.f21282a;
        }
        return null;
    }

    @Nullable
    public j<e0, ?> b(Type type, Annotation[] annotationArr, f0 f0Var) {
        if (type == e0.class) {
            if (j0.j(annotationArr, w.class)) {
                return c.f21283a;
            }
            return C0184a.f21281a;
        } else if (type == Void.class) {
            return f.f21286a;
        } else {
            if (!this.f21280a || type != o.class) {
                return null;
            }
            try {
                return e.f21285a;
            } catch (NoClassDefFoundError unused) {
                this.f21280a = false;
                return null;
            }
        }
    }
}
