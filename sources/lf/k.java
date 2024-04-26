package lf;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import ke.z;
import lf.c;

/* compiled from: DefaultCallAdapterFactory */
public final class k extends c.a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Executor f21352a;

    /* compiled from: DefaultCallAdapterFactory */
    public class a implements c<Object, b<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Type f21353a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Executor f21354b;

        public a(k kVar, Type type, Executor executor) {
            this.f21353a = type;
            this.f21354b = executor;
        }

        public Object a(b bVar) {
            Executor executor = this.f21354b;
            return executor == null ? bVar : new b(executor, bVar);
        }

        public Type b() {
            return this.f21353a;
        }
    }

    /* compiled from: DefaultCallAdapterFactory */
    public static final class b<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f21355a;

        /* renamed from: b  reason: collision with root package name */
        public final b<T> f21356b;

        /* compiled from: DefaultCallAdapterFactory */
        public class a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f21357a;

            /* renamed from: lf.k$b$a$a  reason: collision with other inner class name */
            /* compiled from: DefaultCallAdapterFactory */
            public class C0185a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ d0 f21359a;

                public C0185a(d0 d0Var) {
                    this.f21359a = d0Var;
                }

                public void run() {
                    if (b.this.f21356b.N()) {
                        a aVar = a.this;
                        aVar.f21357a.b(b.this, new IOException("Canceled"));
                        return;
                    }
                    a aVar2 = a.this;
                    aVar2.f21357a.a(b.this, this.f21359a);
                }
            }

            /* renamed from: lf.k$b$a$b  reason: collision with other inner class name */
            /* compiled from: DefaultCallAdapterFactory */
            public class C0186b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Throwable f21361a;

                public C0186b(Throwable th) {
                    this.f21361a = th;
                }

                public void run() {
                    a aVar = a.this;
                    aVar.f21357a.b(b.this, this.f21361a);
                }
            }

            public a(d dVar) {
                this.f21357a = dVar;
            }

            public void a(b<T> bVar, d0<T> d0Var) {
                b.this.f21355a.execute(new C0185a(d0Var));
            }

            public void b(b<T> bVar, Throwable th) {
                b.this.f21355a.execute(new C0186b(th));
            }
        }

        public b(Executor executor, b<T> bVar) {
            this.f21355a = executor;
            this.f21356b = bVar;
        }

        public void J(d<T> dVar) {
            this.f21356b.J(new a(dVar));
        }

        public z M() {
            return this.f21356b.M();
        }

        public boolean N() {
            return this.f21356b.N();
        }

        public void cancel() {
            this.f21356b.cancel();
        }

        public Object clone() throws CloneNotSupportedException {
            return new b(this.f21355a, this.f21356b.i());
        }

        public b<T> i() {
            return new b(this.f21355a, this.f21356b.i());
        }
    }

    public k(@Nullable Executor executor) {
        this.f21352a = executor;
    }

    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, f0 f0Var) {
        Executor executor = null;
        if (j0.g(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type f10 = j0.f(0, (ParameterizedType) type);
            if (!j0.j(annotationArr, h0.class)) {
                executor = this.f21352a;
            }
            return new a(this, f10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
