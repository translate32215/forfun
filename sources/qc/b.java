package qc;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kd.d;
import kd.e;
import kd.j;
import ke.s;
import ke.w;
import lf.e0;
import lf.f0;
import lf.y;
import ud.k;
import ud.l;

/* compiled from: ApiClient.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f24264a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final d f24265b = e.b(C0227b.f24269b);

    /* renamed from: c  reason: collision with root package name */
    public static final d f24266c = e.b(a.f24268b);

    /* renamed from: d  reason: collision with root package name */
    public static final d f24267d = e.b(c.f24270b);

    /* compiled from: ApiClient.kt */
    public static final class a extends l implements td.a<w> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f24268b = new a();

        public a() {
            super(0);
        }

        public Object d() {
            w.b bVar = new w.b();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            byte[] bArr = le.c.f21261a;
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(20);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException("timeout too large.");
                } else if (millis != 0) {
                    bVar.f20859x = (int) millis;
                    bVar.f20856u = true;
                    bVar.f20855t = true;
                    bVar.a(a.f24263a);
                    return new w(bVar);
                } else {
                    throw new IllegalArgumentException("timeout too small.");
                }
            } else {
                throw new NullPointerException("unit == null");
            }
        }
    }

    /* renamed from: qc.b$b  reason: collision with other inner class name */
    /* compiled from: ApiClient.kt */
    public static final class C0227b extends l implements td.a<ue.a> {

        /* renamed from: b  reason: collision with root package name */
        public static final C0227b f24269b = new C0227b();

        public C0227b() {
            super(0);
        }

        public Object d() {
            ue.a aVar = new ue.a();
            aVar.f26203c = 1;
            return aVar;
        }
    }

    /* compiled from: ApiClient.kt */
    public static final class c extends l implements td.a<f0> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f24270b = new c();

        public c() {
            super(0);
        }

        public Object d() {
            y yVar = y.f21433a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            pc.l.g();
            s.a aVar = new s.a();
            aVar.d((s) null, "http://def.yacinelive.com/api/");
            s a10 = aVar.a();
            List<String> list = a10.f20787f;
            if ("".equals(list.get(list.size() - 1))) {
                arrayList.add(new mf.a(new com.google.gson.e().a()));
                arrayList2.add(new l());
                b bVar = b.f24264a;
                Object value = ((j) b.f24266c).getValue();
                k.e(value, "<get-client>(...)");
                Executor c10 = yVar.c();
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList3.addAll(yVar.a(c10));
                ArrayList arrayList4 = new ArrayList(yVar.e() + arrayList.size() + 1);
                arrayList4.add(new lf.a());
                arrayList4.addAll(arrayList);
                arrayList4.addAll(yVar.d());
                return new f0((w) value, a10, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3), c10, false);
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + a10);
        }
    }

    public final <T> T a(Class<T> cls, i iVar) {
        k.f(iVar, "hostInterceptor");
        Object value = ((j) f24266c).getValue();
        k.e(value, "<get-client>(...)");
        w.b bVar = new w.b((w) value);
        bVar.a(iVar);
        bVar.a(new h());
        bVar.a((ue.a) ((j) f24265b).getValue());
        w wVar = new w(bVar);
        Object value2 = ((j) f24267d).getValue();
        k.e(value2, "<get-retrofit>(...)");
        f0 f0Var = (f0) value2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar = y.f21433a;
        s sVar = f0Var.f21334c;
        int size = f0Var.f21335d.size() - yVar.e();
        for (int i10 = 1; i10 < size; i10++) {
            arrayList.add(f0Var.f21335d.get(i10));
        }
        int size2 = f0Var.f21336e.size() - yVar.b();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList2.add(f0Var.f21336e.get(i11));
        }
        Executor executor = f0Var.f21337f;
        boolean z10 = f0Var.f21338g;
        if (sVar != null) {
            Executor c10 = executor == null ? yVar.c() : executor;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.addAll(yVar.a(c10));
            ArrayList arrayList4 = new ArrayList(yVar.e() + arrayList.size() + 1);
            arrayList4.add(new lf.a());
            arrayList4.addAll(arrayList);
            arrayList4.addAll(yVar.d());
            f0 f0Var2 = new f0(wVar, sVar, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3), c10, z10);
            if (!cls.isInterface()) {
                throw new IllegalArgumentException("API declarations must be interfaces.");
            } else if (cls.getInterfaces().length <= 0) {
                if (f0Var2.f21338g) {
                    y yVar2 = y.f21433a;
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!yVar2.g(method) && !Modifier.isStatic(method.getModifiers())) {
                            f0Var2.b(method);
                        }
                    }
                }
                return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new e0(f0Var2, cls));
            } else {
                throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
            }
        } else {
            throw new IllegalStateException("Base URL required.");
        }
    }
}
