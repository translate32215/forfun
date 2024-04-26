package df;

import androidx.leanback.widget.t;
import bf.d;
import ff.a;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* compiled from: SSDPSearchResponseSocket */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public DatagramSocket f13495a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f13496b = "";

    /* renamed from: c  reason: collision with root package name */
    public ze.e f13497c;

    /* renamed from: d  reason: collision with root package name */
    public Thread f13498d;

    public e() {
        a();
        try {
            this.f13495a = new DatagramSocket();
        } catch (Exception e10) {
            a.b(e10);
        }
        this.f13497c = null;
        this.f13498d = null;
        this.f13497c = null;
    }

    public boolean a() {
        DatagramSocket datagramSocket = this.f13495a;
        if (datagramSocket == null) {
            return true;
        }
        try {
            datagramSocket.close();
            this.f13495a = null;
            return true;
        } catch (Exception e10) {
            a.b(e10);
            return false;
        }
    }

    public String b() {
        if (this.f13496b.length() > 0) {
            return this.f13496b;
        }
        return this.f13495a.getLocalAddress().getHostAddress();
    }

    public void finalize() {
        a();
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        ze.e eVar = this.f13497c;
        while (this.f13498d == currentThread) {
            Thread.yield();
            t tVar = new t(new byte[1024], 1024);
            tVar.f2526c = b();
            try {
                this.f13495a.receive((DatagramPacket) tVar.f2527d);
                tVar.f2525b = System.currentTimeMillis();
            } catch (Exception unused) {
                tVar = null;
            }
            if (tVar != null) {
                if (eVar != null) {
                    if (tVar.d()) {
                        eVar.b(tVar);
                    }
                    int size = eVar.f28861j.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        try {
                            ((d) eVar.f28861j.get(i10)).a(tVar);
                        } catch (Exception e10) {
                            a.d("SearchResponseListener returned an error:", e10);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public e(String str, int i10) {
        a();
        try {
            this.f13495a = new DatagramSocket(new InetSocketAddress(InetAddress.getByName(str), i10));
            this.f13496b = str;
        } catch (Exception e10) {
            a.b(e10);
        }
        this.f13497c = null;
        this.f13498d = null;
        this.f13497c = null;
    }
}
