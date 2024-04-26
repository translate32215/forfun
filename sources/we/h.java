package we;

import ff.a;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import ze.j;

/* compiled from: HTTPServer */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public ServerSocket f27221a;

    /* renamed from: b  reason: collision with root package name */
    public InetAddress f27222b;

    /* renamed from: c  reason: collision with root package name */
    public int f27223c;

    /* renamed from: d  reason: collision with root package name */
    public j f27224d;

    /* renamed from: e  reason: collision with root package name */
    public Thread f27225e;

    public h() {
        this.f27221a = null;
        this.f27222b = null;
        this.f27223c = 0;
        this.f27224d = new j(1);
        this.f27225e = null;
        this.f27221a = null;
    }

    public void run() {
        if (this.f27221a != null) {
            Thread currentThread = Thread.currentThread();
            while (this.f27225e == currentThread) {
                Thread.yield();
                try {
                    a aVar = a.f18351b;
                    ServerSocket serverSocket = this.f27221a;
                    Socket socket = null;
                    if (serverSocket != null) {
                        try {
                            Socket accept = serverSocket.accept();
                            synchronized (this) {
                            }
                            accept.setSoTimeout(80000);
                            socket = accept;
                        } catch (Exception unused) {
                        }
                    }
                    if (socket != null) {
                        g.a(socket.getRemoteSocketAddress());
                        a aVar2 = a.f18351b;
                    }
                    new j(this, socket).start();
                    a aVar3 = a.f18351b;
                } catch (Exception e10) {
                    a.b(e10);
                    return;
                }
            }
        }
    }
}
