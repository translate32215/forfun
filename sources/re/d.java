package re;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import ke.x;
import le.c;

/* compiled from: JdkWithJettyBootPlatform */
public class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f24783c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f24784d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f24785e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f24786f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f24787g;

    /* compiled from: JdkWithJettyBootPlatform */
    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f24788a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f24789b;

        /* renamed from: c  reason: collision with root package name */
        public String f24790c;

        public a(List<String> list) {
            this.f24788a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = c.f21262b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f24789b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f24788a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f24788a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f24790c = str;
                            return str;
                        }
                    }
                    String str2 = this.f24788a.get(0);
                    this.f24790c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f24790c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f24783c = method;
        this.f24784d = method2;
        this.f24785e = method3;
        this.f24786f = cls;
        this.f24787g = cls2;
    }

    public void a(SSLSocket sSLSocket) {
        try {
            this.f24785e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw c.a("unable to remove alpn", e10);
        }
    }

    public void f(SSLSocket sSLSocket, String str, List<x> list) {
        List<String> b10 = f.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f24786f, this.f24787g}, new a(b10));
            this.f24783c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw c.a("unable to set alpn", e10);
        }
    }

    @Nullable
    public String i(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f24784d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z10 = aVar.f24789b;
            if (!z10 && aVar.f24790c == null) {
                f.f24794a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z10) {
                return null;
            } else {
                return aVar.f24790c;
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw c.a("unable to get selected protocol", e10);
        }
    }
}
