package gf;

import ae.g;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kd.d;
import kd.e;
import kd.j;
import ud.k;
import ud.l;
import ud.m;
import ud.o;
import ud.v;

/* compiled from: types.kt */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g[] f18667a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f18668b = e.b(b.f18671b);

    /* renamed from: c  reason: collision with root package name */
    public static final d f18669c = e.b(a.f18670b);

    /* compiled from: types.kt */
    public static final class a extends l implements td.a<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f18670b = new a();

        public a() {
            super(0);
        }

        public Object d() {
            return Boolean.valueOf(!k.a((GenericArrayType) new h0().a(), (GenericArrayType) new i0().a()));
        }
    }

    /* compiled from: types.kt */
    public static final class b extends l implements td.a<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f18671b = new b();

        public b() {
            super(0);
        }

        public Object d() {
            return Boolean.valueOf(!k.a((ParameterizedType) new k0().a(), (ParameterizedType) new l0().a()));
        }
    }

    static {
        Class<j0> cls = j0.class;
        v.f26198a.getClass();
        f18667a = new g[]{new o(new m(cls, "kodein-di-core"), "_needPTWrapper", "get_needPTWrapper()Z"), new o(new m(cls, "kodein-di-core"), "_needGATWrapper", "get_needGATWrapper()Z")};
    }

    public static final <T> g0<T> a(e0<T> e0Var) {
        return b(e0Var.f18662a);
    }

    public static final g0<?> b(Type type) {
        k.g(type, "type");
        if (type instanceof Class) {
            return new f((Class) type);
        }
        return new a0(type);
    }

    public static final <T> g0<? extends T> c(T t10) {
        k.g(t10, "obj");
        return new f(t10.getClass());
    }

    public static final boolean d() {
        d dVar = f18669c;
        g gVar = f18667a[1];
        return ((Boolean) ((j) dVar).getValue()).booleanValue();
    }

    public static final boolean e() {
        d dVar = f18668b;
        g gVar = f18667a[0];
        return ((Boolean) ((j) dVar).getValue()).booleanValue();
    }

    public static final Type f(Type type) {
        Type type2;
        k.g(type, "$this$javaType");
        y yVar = (y) (!(type instanceof y) ? null : type);
        return (yVar == null || (type2 = yVar.f18701b) == null) ? type : type2;
    }
}
