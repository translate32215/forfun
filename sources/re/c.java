package re;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import ke.x;

/* compiled from: Jdk9Platform */
public final class c extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f24781c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f24782d;

    public c(Method method, Method method2) {
        this.f24781c = method;
        this.f24782d = method2;
    }

    public void f(SSLSocket sSLSocket, String str, List<x> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b10 = f.b(list);
            ArrayList arrayList = (ArrayList) b10;
            this.f24781c.invoke(sSLParameters, new Object[]{arrayList.toArray(new String[arrayList.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw le.c.a("unable to set ssl parameters", e10);
        }
    }

    @Nullable
    public String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f24782d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw le.c.a("unable to get selected protocols", e10);
        }
    }
}
