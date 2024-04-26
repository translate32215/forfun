package lf;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import lf.c;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* compiled from: CompletableFutureCallAdapterFactory */
public final class g extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f21339a = new g();

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f21340a;

        public a(Type type) {
            this.f21340a = type;
        }

        public Object a(b bVar) {
            e eVar = new e(this, bVar);
            bVar.J(new f(this, eVar));
            return eVar;
        }

        public Type b() {
            return this.f21340a;
        }
    }

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class b<R> implements c<R, CompletableFuture<d0<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f21341a;

        public b(Type type) {
            this.f21341a = type;
        }

        public Object a(b bVar) {
            h hVar = new h(this, bVar);
            bVar.J(new i(this, hVar));
            return hVar;
        }

        public Type b() {
            return this.f21341a;
        }
    }

    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, f0 f0Var) {
        if (j0.g(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type f10 = j0.f(0, (ParameterizedType) type);
            if (j0.g(f10) != d0.class) {
                return new a(f10);
            }
            if (f10 instanceof ParameterizedType) {
                return new b(j0.f(0, (ParameterizedType) f10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
