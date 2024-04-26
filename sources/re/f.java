package re;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import ke.w;
import ke.x;
import te.a;
import te.b;
import te.c;
import te.e;

/* compiled from: Platform */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f24794a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f24795b = Logger.getLogger(w.class.getName());

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r0 != null) goto L_0x0104;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    static {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x000d }
        L_0x000b:
            r6 = r4
            goto L_0x0014
        L_0x000d:
            java.lang.String r4 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0061 }
            goto L_0x000b
        L_0x0014:
            re.e r7 = new re.e     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.String r4 = "setUseSessionTickets"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0061 }
            r5[r2] = r8     // Catch:{ ClassNotFoundException -> 0x0061 }
            r7.<init>(r1, r4, r5)     // Catch:{ ClassNotFoundException -> 0x0061 }
            re.e r8 = new re.e     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.String r4 = "setHostname"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r5[r2] = r9     // Catch:{ ClassNotFoundException -> 0x0061 }
            r8.<init>(r1, r4, r5)     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.String r4 = "GMSCore_OpenSSL"
            java.security.Provider r4 = java.security.Security.getProvider(r4)     // Catch:{ ClassNotFoundException -> 0x0061 }
            if (r4 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            java.lang.String r4 = "android.net.Network"
            java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x003e }
        L_0x003c:
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = 0
        L_0x003f:
            if (r4 == 0) goto L_0x0058
            re.e r4 = new re.e     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.String r5 = "getAlpnSelectedProtocol"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0061 }
            r4.<init>(r0, r5, r9)     // Catch:{ ClassNotFoundException -> 0x0061 }
            re.e r5 = new re.e     // Catch:{ ClassNotFoundException -> 0x0061 }
            java.lang.String r9 = "setAlpnProtocols"
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0061 }
            r10[r2] = r0     // Catch:{ ClassNotFoundException -> 0x0061 }
            r5.<init>(r1, r9, r10)     // Catch:{ ClassNotFoundException -> 0x0061 }
            r9 = r4
            r10 = r5
            goto L_0x005a
        L_0x0058:
            r9 = r1
            r10 = r9
        L_0x005a:
            re.a r0 = new re.a     // Catch:{ ClassNotFoundException -> 0x0061 }
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ ClassNotFoundException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r0 = r1
        L_0x0062:
            if (r0 == 0) goto L_0x0066
            goto L_0x0104
        L_0x0066:
            java.lang.String r0 = "okhttp.platform"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r4 = "conscrypt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0076
            r0 = 1
            goto L_0x0086
        L_0x0076:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = r4.equals(r0)
        L_0x0086:
            if (r0 == 0) goto L_0x0090
            re.b r0 = re.b.n()
            if (r0 == 0) goto L_0x0090
            goto L_0x0104
        L_0x0090:
            java.lang.Class<javax.net.ssl.SSLParameters> r0 = javax.net.ssl.SSLParameters.class
            java.lang.String r4 = "setApplicationProtocols"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x00af }
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r5[r2] = r6     // Catch:{ NoSuchMethodException -> 0x00af }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x00af }
            java.lang.Class<javax.net.ssl.SSLSocket> r4 = javax.net.ssl.SSLSocket.class
            java.lang.String r5 = "getApplicationProtocol"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x00af }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x00af }
            re.c r5 = new re.c     // Catch:{ NoSuchMethodException -> 0x00af }
            r5.<init>(r0, r4)     // Catch:{ NoSuchMethodException -> 0x00af }
            r0 = r5
            goto L_0x00b0
        L_0x00af:
            r0 = r1
        L_0x00b0:
            if (r0 == 0) goto L_0x00b3
            goto L_0x0104
        L_0x00b3:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            r6[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            re.d r0 = new re.d     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00fa }
            r1 = r0
            goto L_0x00fb
        L_0x00fa:
        L_0x00fb:
            if (r1 == 0) goto L_0x00ff
            r0 = r1
            goto L_0x0104
        L_0x00ff:
            re.f r0 = new re.f
            r0.<init>()
        L_0x0104:
            f24794a = r0
            java.lang.Class<ke.w> r0 = ke.w.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f24795b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: re.f.<clinit>():void");
    }

    public static List<String> b(List<x> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = list.get(i10);
            if (xVar != x.HTTP_1_0) {
                arrayList.add(xVar.f20869a);
            }
        }
        return arrayList;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public c c(X509TrustManager x509TrustManager) {
        return new a(d(x509TrustManager));
    }

    public e d(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void e(SSLSocketFactory sSLSocketFactory) {
    }

    public void f(SSLSocket sSLSocket, @Nullable String str, List<x> list) {
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    public SSLContext h() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
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
        return null;
    }

    public Object j(String str) {
        if (f24795b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean k(String str) {
        return true;
    }

    public void l(int i10, String str, @Nullable Throwable th) {
        f24795b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        if (obj == null) {
            str = j.f.a(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        l(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
