package xe;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* compiled from: HostInterface */
public class a {
    public static final String a(int i10) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            int i11 = 0;
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        if (i11 >= i10) {
                            return nextElement.getHostAddress();
                        }
                        i11++;
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String b(String str, int i10, String str2) {
        if (d(str)) {
            str = "[" + str + "]";
        }
        return "http://" + str + ":" + Integer.toString(i10) + str2;
    }

    public static final int c() {
        int i10 = 0;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    if (!inetAddresses.nextElement().isLoopbackAddress()) {
                        i10++;
                    }
                }
            }
        } catch (Exception e10) {
            ff.a.b(e10);
        }
        return i10;
    }

    public static final boolean d(String str) {
        try {
            if (InetAddress.getByName(str) instanceof Inet6Address) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
