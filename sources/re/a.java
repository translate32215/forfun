package re;

import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import ke.x;
import te.e;
import ve.f;

/* compiled from: AndroidPlatform */
public class a extends f {

    /* renamed from: c  reason: collision with root package name */
    public final e<Socket> f24769c;

    /* renamed from: d  reason: collision with root package name */
    public final e<Socket> f24770d;

    /* renamed from: e  reason: collision with root package name */
    public final e<Socket> f24771e;

    /* renamed from: f  reason: collision with root package name */
    public final e<Socket> f24772f;

    /* renamed from: g  reason: collision with root package name */
    public final c f24773g;

    /* renamed from: re.a$a  reason: collision with other inner class name */
    /* compiled from: AndroidPlatform */
    public static final class C0237a extends te.c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f24774a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f24775b;

        public C0237a(Object obj, Method method) {
            this.f24774a = obj;
            this.f24775b = method;
        }

        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f24775b.invoke(this.f24774a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0237a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* compiled from: AndroidPlatform */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f24776a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f24777b;

        public b(X509TrustManager x509TrustManager, Method method) {
            this.f24777b = method;
            this.f24776a = x509TrustManager;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f24777b.invoke(this.f24776a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e10) {
                throw le.c.a("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f24776a.equals(bVar.f24776a) || !this.f24777b.equals(bVar.f24777b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f24777b.hashCode() * 31) + this.f24776a.hashCode();
        }
    }

    /* compiled from: AndroidPlatform */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Method f24778a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f24779b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f24780c;

        public c(Method method, Method method2, Method method3) {
            this.f24778a = method;
            this.f24779b = method2;
            this.f24780c = method3;
        }
    }

    public a(Class<?> cls, e<Socket> eVar, e<Socket> eVar2, e<Socket> eVar3, e<Socket> eVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method = cls2.getMethod("open", new Class[]{String.class});
            method2 = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f24773g = new c(method3, method, method2);
        this.f24769c = eVar;
        this.f24770d = eVar2;
        this.f24771e = eVar3;
        this.f24772f = eVar4;
    }

    public te.c c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0237a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return new te.a(d(x509TrustManager));
        }
    }

    public e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new te.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    public void f(SSLSocket sSLSocket, String str, List<x> list) {
        if (str != null) {
            this.f24769c.c(sSLSocket, Boolean.TRUE);
            this.f24770d.c(sSLSocket, str);
        }
        e<Socket> eVar = this.f24772f;
        if (eVar != null) {
            if (eVar.a(sSLSocket.getClass()) != null) {
                Object[] objArr = new Object[1];
                f fVar = new f();
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    x xVar = list.get(i10);
                    if (xVar != x.HTTP_1_0) {
                        fVar.q0(xVar.f20869a.length());
                        fVar.w0(xVar.f20869a);
                    }
                }
                try {
                    objArr[0] = fVar.D(fVar.f26740b);
                    this.f24772f.d(sSLSocket, objArr);
                } catch (EOFException e10) {
                    throw new AssertionError(e10);
                }
            }
        }
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (le.c.s(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        } catch (SecurityException e11) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e11);
            throw iOException;
        } catch (ClassCastException e12) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e12);
                throw iOException2;
            }
            throw e12;
        }
    }

    public SSLContext h() {
        boolean z10 = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z10 = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z10) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Nullable
    public String i(SSLSocket sSLSocket) {
        byte[] bArr;
        e<Socket> eVar = this.f24771e;
        if (eVar == null) {
            return null;
        }
        if ((eVar.a(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f24771e.d(sSLSocket, new Object[0])) != null) {
            return new String(bArr, le.c.f21269i);
        }
        return null;
    }

    public Object j(String str) {
        c cVar = this.f24773g;
        Method method = cVar.f24778a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            cVar.f24779b.invoke(invoke, new Object[]{str});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean k(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return n(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            throw le.c.a("unable to determine cleartext support", e10);
        }
    }

    public void l(int i10, String str, @Nullable Throwable th) {
        int min;
        int i11 = 5;
        if (i10 != 5) {
            i11 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                }
                i12 = min;
            }
            i12 = min + 1;
        }
    }

    public void m(String str, Object obj) {
        c cVar = this.f24773g;
        cVar.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                cVar.f24780c.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            l(5, str, (Throwable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return ((java.lang.Boolean) r7.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(r8, new java.lang.Object[0])).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        /*
            r5 = this;
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.reflect.Method r3 = r7.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            r4[r1] = r6     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object r6 = r3.invoke(r8, r4)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x001d }
            boolean r6 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x001d }
            return r6
        L_0x001d:
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Method r6 = r7.getMethod(r0, r6)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object r6 = r6.invoke(r8, r7)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x002f }
            boolean r2 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x002f }
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: re.a.n(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }
}
