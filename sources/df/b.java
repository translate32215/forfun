package df;

import androidx.leanback.widget.t;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.util.Enumeration;
import q.h;
import we.c;
import xe.a;
import ze.e;

/* compiled from: SSDPNotifySocket */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public InetSocketAddress f13489a = null;

    /* renamed from: b  reason: collision with root package name */
    public MulticastSocket f13490b = null;

    /* renamed from: c  reason: collision with root package name */
    public NetworkInterface f13491c = null;

    /* renamed from: d  reason: collision with root package name */
    public e f13492d = null;

    /* renamed from: e  reason: collision with root package name */
    public Thread f13493e = null;

    public b(String str) {
        try {
            c(a.d(str) ? a.f13488a : "239.255.255.250", 1900, InetAddress.getByName(str));
        } catch (Exception e10) {
            ff.a.b(e10);
        }
        this.f13492d = null;
    }

    public boolean a() {
        MulticastSocket multicastSocket = this.f13490b;
        if (multicastSocket == null) {
            return true;
        }
        try {
            multicastSocket.leaveGroup(this.f13489a, this.f13491c);
            this.f13490b.close();
            this.f13490b = null;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String b() {
        InetSocketAddress inetSocketAddress = this.f13489a;
        if (inetSocketAddress == null || this.f13491c == null) {
            return "";
        }
        InetAddress address = inetSocketAddress.getAddress();
        Enumeration<InetAddress> inetAddresses = this.f13491c.getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress nextElement = inetAddresses.nextElement();
            if ((address instanceof Inet6Address) && (nextElement instanceof Inet6Address)) {
                return nextElement.getHostAddress();
            }
            if ((address instanceof Inet4Address) && (nextElement instanceof Inet4Address)) {
                return nextElement.getHostAddress();
            }
        }
        return "";
    }

    public boolean c(String str, int i10, InetAddress inetAddress) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket((SocketAddress) null);
            this.f13490b = multicastSocket;
            multicastSocket.setReuseAddress(true);
            this.f13490b.bind(new InetSocketAddress(i10));
            this.f13489a = new InetSocketAddress(InetAddress.getByName(str), i10);
            NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(inetAddress);
            this.f13491c = byInetAddress;
            this.f13490b.joinGroup(this.f13489a, byInetAddress);
            return true;
        } catch (Exception e10) {
            ff.a.b(e10);
            return false;
        }
    }

    public t d() {
        t tVar = new t(new byte[1024], 1024);
        tVar.f2526c = b();
        MulticastSocket multicastSocket = this.f13490b;
        if (multicastSocket != null) {
            multicastSocket.receive((DatagramPacket) tVar.f2527d);
            tVar.f2525b = System.currentTimeMillis();
            return tVar;
        }
        throw new IOException("Multicast socket has already been closed.");
    }

    public void finalize() {
        a();
    }

    public void run() {
        String str;
        boolean z10;
        Thread currentThread = Thread.currentThread();
        e eVar = this.f13492d;
        while (this.f13493e == currentThread) {
            Thread.yield();
            try {
                t d10 = d();
                InetAddress address = this.f13489a.getAddress();
                String a10 = c.a(d10.a(), "HOST");
                int lastIndexOf = a10.lastIndexOf(":");
                if (lastIndexOf >= 0) {
                    str = a10.substring(0, lastIndexOf);
                    if (str.charAt(0) == '[') {
                        str = str.substring(1, str.length());
                    }
                    if (str.charAt(str.length() - 1) == ']') {
                        str = str.substring(0, str.length() - 1);
                    }
                } else {
                    str = "127.0.0.1";
                }
                InetAddress address2 = new InetSocketAddress(str, 0).getAddress();
                if (!address.equals(address2)) {
                    ff.a.c("Invalidate Multicast Recieved from IP " + address + " on " + address2);
                } else if (eVar != null) {
                    if (d10.d()) {
                        String a11 = c.a(d10.a(), "NTS");
                        if (a11 == null) {
                            z10 = false;
                        } else {
                            z10 = a11.startsWith("ssdp:alive");
                        }
                        if (z10) {
                            eVar.b(d10);
                        } else if (d10.c() && d10.c()) {
                            eVar.g(eVar.c(h.c(d10.b())));
                        }
                    }
                    int size = eVar.f28860i.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        try {
                            ((bf.c) eVar.f28860i.get(i10)).a(d10);
                        } catch (Exception e10) {
                            ff.a.d("NotifyListener returned an error:", e10);
                        }
                    }
                }
            } catch (IOException unused) {
                return;
            }
        }
    }
}
