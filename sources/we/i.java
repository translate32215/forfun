package we;

import ff.a;
import java.net.ServerSocket;
import java.util.Vector;

/* compiled from: HTTPServerList */
public class i extends Vector {

    /* renamed from: a  reason: collision with root package name */
    public int f27226a = 4004;

    public void c() {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            h f10 = f(i10);
            ServerSocket serverSocket = f10.f27221a;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                    f10.f27221a = null;
                    f10.f27222b = null;
                    f10.f27223c = 0;
                } catch (Exception e10) {
                    a.b(e10);
                }
            }
        }
    }

    public h f(int i10) {
        return (h) get(i10);
    }
}
