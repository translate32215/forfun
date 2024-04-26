package com.startapp;

import android.net.TrafficStats;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import q.b;

/* compiled from: Sta */
public class eb {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10325a = "eb";

    /* renamed from: b  reason: collision with root package name */
    private static String[] f10326b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f10327c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f10328d = true;

    /* renamed from: e  reason: collision with root package name */
    private static Method f10329e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f10330f;

    /* renamed from: g  reason: collision with root package name */
    private static Method f10331g;

    static {
        Class<String> cls = String.class;
        try {
            Method declaredMethod = TrafficStats.class.getDeclaredMethod("getRxBytes", new Class[]{cls});
            f10329e = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            x2.b(th);
        }
        try {
            Method declaredMethod2 = TrafficStats.class.getDeclaredMethod("getTxBytes", new Class[]{cls});
            f10330f = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Throwable th2) {
            x2.b(th2);
        }
        try {
            Method declaredMethod3 = TrafficStats.class.getDeclaredMethod("getMobileIfaces", new Class[0]);
            f10331g = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (Throwable th3) {
            x2.b(th3);
        }
    }

    private static void a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement != null && nextElement.getName().startsWith("eth")) {
                        String[] strArr = f10326b;
                        if (strArr != null && strArr.length > 0) {
                            int length = strArr.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    break;
                                }
                                if (nextElement.getName().equals(strArr[i10])) {
                                    break;
                                }
                                i10++;
                            }
                        }
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        boolean z10 = false;
                        if (inetAddresses != null) {
                            while (inetAddresses.hasMoreElements()) {
                                InetAddress nextElement2 = inetAddresses.nextElement();
                                if (nextElement2 != null && nextElement2.isLinkLocalAddress() && !nextElement2.isLoopbackAddress()) {
                                    z10 = true;
                                }
                            }
                        }
                        if (z10) {
                            arrayList.add(la.a(nextElement.getName()));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            x2.a(th);
        } finally {
            f10327c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            f10328d = false;
        }
    }

    public static synchronized long b() {
        long j10;
        String[] strArr;
        synchronized (eb.class) {
            j10 = 0;
            if (f10328d && ((strArr = f10327c) == null || strArr.length <= 0)) {
                a();
            }
            String[] strArr2 = f10327c;
            if (strArr2 != null && strArr2.length > 0) {
                for (String a10 : strArr2) {
                    long a11 = a(a10);
                    if (a11 > -1) {
                        j10 += a11;
                    }
                }
            }
        }
        return j10;
    }

    public static synchronized long c() {
        long j10;
        String[] strArr;
        synchronized (eb.class) {
            j10 = 0;
            if (f10328d && ((strArr = f10327c) == null || strArr.length <= 0)) {
                a();
            }
            String[] strArr2 = f10327c;
            if (strArr2 != null && strArr2.length > 0) {
                for (String b10 : strArr2) {
                    long b11 = b(b10);
                    if (b11 > -1) {
                        j10 += b11;
                    }
                }
            }
        }
        return j10;
    }

    private static void d() {
        Method method = f10331g;
        if (method != null) {
            try {
                String[] strArr = (String[]) method.invoke((Object) null, new Object[0]);
                if (strArr != null) {
                    f10326b = strArr;
                }
            } catch (Throwable th) {
                x2.a(th);
            }
        }
    }

    public static synchronized long e() {
        long j10;
        synchronized (eb.class) {
            try {
                j10 = TrafficStats.getMobileRxBytes();
            } catch (Throwable th) {
                x2.a(th);
                j10 = 0;
            }
            if (j10 <= 0) {
                String[] strArr = f10326b;
                if (strArr != null) {
                    for (String str : strArr) {
                        long c10 = c("/sys/class/net/" + str + "/statistics/rx_bytes");
                        if (c10 > -1) {
                            j10 += c10;
                        }
                    }
                }
            } else if (f10326b == null) {
                d();
            }
        }
        return j10;
    }

    public static synchronized long f() {
        long j10;
        synchronized (eb.class) {
            try {
                j10 = TrafficStats.getMobileTxBytes();
            } catch (Throwable th) {
                x2.a(th);
                j10 = 0;
            }
            if (j10 <= 0) {
                String[] strArr = f10326b;
                if (strArr != null) {
                    for (String str : strArr) {
                        long c10 = c("/sys/class/net/" + str + "/statistics/tx_bytes");
                        if (c10 > -1) {
                            j10 += c10;
                        }
                    }
                }
            } else if (f10326b == null) {
                d();
            }
        }
        return j10;
    }

    public static synchronized long g() {
        long totalRxBytes;
        synchronized (eb.class) {
            totalRxBytes = TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
        }
        return totalRxBytes;
    }

    public static synchronized long h() {
        long totalTxBytes;
        synchronized (eb.class) {
            totalTxBytes = TrafficStats.getTotalTxBytes() - TrafficStats.getMobileTxBytes();
        }
        return totalTxBytes;
    }

    public static long b(String str) {
        Method method = f10330f;
        if (method != null) {
            try {
                return ((Long) method.invoke((Object) null, new Object[]{str})).longValue();
            } catch (Throwable th) {
                x2.a(th);
            }
        }
        return c(b.a("/sys/class/net/", str, "/statistics/tx_bytes"));
    }

    private static long c(String str) {
        String[] a10 = v9.a(str);
        if (a10.length > 0) {
            return Long.parseLong(a10[0]);
        }
        return -1;
    }

    public static long a(String str) {
        Method method = f10329e;
        if (method != null) {
            try {
                return ((Long) method.invoke((Object) null, new Object[]{str})).longValue();
            } catch (Throwable th) {
                x2.a(th);
            }
        }
        return c(b.a("/sys/class/net/", str, "/statistics/rx_bytes"));
    }
}
