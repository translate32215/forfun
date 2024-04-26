package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import k1.a;
import ud.f;
import ud.k;

/* compiled from: ViewModelProvider.kt */
public class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final u0 f2715a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2716b;

    /* renamed from: c  reason: collision with root package name */
    public final k1.a f2717c;

    /* compiled from: ViewModelProvider.kt */
    public interface b {
        <T extends q0> T a(Class<T> cls);

        <T extends q0> T b(Class<T> cls, k1.a aVar);
    }

    /* compiled from: ViewModelProvider.kt */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2722a = new a((f) null);

        /* renamed from: b  reason: collision with root package name */
        public static c f2723b;

        /* compiled from: ViewModelProvider.kt */
        public static final class a {

            /* renamed from: androidx.lifecycle.s0$c$a$a  reason: collision with other inner class name */
            /* compiled from: ViewModelProvider.kt */
            public static final class C0034a implements a.b<String> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0034a f2724a = new C0034a();
            }

            public a(f fVar) {
            }
        }

        public <T extends q0> T a(Class<T> cls) {
            k.f(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                k.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return (q0) newInstance;
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }

        public /* synthetic */ q0 b(Class cls, k1.a aVar) {
            return t0.b(this, cls, aVar);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public static class d {
        public void c(q0 q0Var) {
        }
    }

    public s0(u0 u0Var, b bVar, k1.a aVar) {
        k.f(u0Var, "store");
        k.f(bVar, "factory");
        k.f(aVar, "defaultCreationExtras");
        this.f2715a = u0Var;
        this.f2716b = bVar;
        this.f2717c = aVar;
    }

    public <T extends q0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends q0> T b(String str, Class<T> cls) {
        T t10;
        k.f(str, "key");
        T t11 = (q0) this.f2715a.f2735a.get(str);
        if (cls.isInstance(t11)) {
            b bVar = this.f2716b;
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                k.e(t11, "viewModel");
                dVar.c(t11);
            }
            if (t11 != null) {
                return t11;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        k1.d dVar2 = new k1.d(this.f2717c);
        c.a aVar = c.f2722a;
        dVar2.f19873a.put(c.a.C0034a.f2724a, str);
        try {
            t10 = this.f2716b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t10 = this.f2716b.a(cls);
        }
        q0 put = this.f2715a.f2735a.put(str, t10);
        if (put != null) {
            put.d();
        }
        return t10;
    }

    /* compiled from: ViewModelProvider.kt */
    public static class a extends c {

        /* renamed from: d  reason: collision with root package name */
        public static final C0032a f2718d = new C0032a((f) null);

        /* renamed from: e  reason: collision with root package name */
        public static a f2719e;

        /* renamed from: c  reason: collision with root package name */
        public final Application f2720c;

        /* renamed from: androidx.lifecycle.s0$a$a  reason: collision with other inner class name */
        /* compiled from: ViewModelProvider.kt */
        public static final class C0032a {

            /* renamed from: androidx.lifecycle.s0$a$a$a  reason: collision with other inner class name */
            /* compiled from: ViewModelProvider.kt */
            public static final class C0033a implements a.b<Application> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0033a f2721a = new C0033a();
            }

            public C0032a(f fVar) {
            }
        }

        public a() {
            this.f2720c = null;
        }

        public <T extends q0> T a(Class<T> cls) {
            k.f(cls, "modelClass");
            Application application = this.f2720c;
            if (application != null) {
                return c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public <T extends q0> T b(Class<T> cls, k1.a aVar) {
            if (this.f2720c != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(C0032a.C0033a.f2721a);
            if (application != null) {
                return c(cls, application);
            }
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends q0> T c(Class<T> cls, Application application) {
            if (!b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t10 = (q0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                k.e(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public a(Application application) {
            this.f2720c = application;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s0(androidx.lifecycle.v0 r3, androidx.lifecycle.s0.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            ud.k.f(r3, r0)
            androidx.lifecycle.u0 r0 = r3.v()
            java.lang.String r1 = "owner.viewModelStore"
            ud.k.e(r0, r1)
            boolean r1 = r3 instanceof androidx.lifecycle.n
            if (r1 == 0) goto L_0x001e
            androidx.lifecycle.n r3 = (androidx.lifecycle.n) r3
            k1.a r3 = r3.l()
            java.lang.String r1 = "{\n        owner.defaultV…ModelCreationExtras\n    }"
            ud.k.e(r3, r1)
            goto L_0x0020
        L_0x001e:
            k1.a$a r3 = k1.a.C0172a.f19874b
        L_0x0020:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.s0.<init>(androidx.lifecycle.v0, androidx.lifecycle.s0$b):void");
    }
}
