package com.startapp;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructPollfd;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(21)
/* compiled from: Sta */
public class y {

    /* renamed from: p  reason: collision with root package name */
    private static final String f12812p = "y";

    /* renamed from: q  reason: collision with root package name */
    private static final boolean f12813q = false;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final short f12814r;

    /* renamed from: s  reason: collision with root package name */
    private static final int f12815s = 7;

    /* renamed from: t  reason: collision with root package name */
    private static final int f12816t = 16;

    /* renamed from: u  reason: collision with root package name */
    private static final int f12817u = 64;

    /* renamed from: v  reason: collision with root package name */
    private static final short f12818v = 30583;

    /* renamed from: a  reason: collision with root package name */
    private InetAddress f12819a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public e8 f12820b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f12821c;

    /* renamed from: d  reason: collision with root package name */
    private int f12822d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f12823e;

    /* renamed from: f  reason: collision with root package name */
    private b4 f12824f;

    /* renamed from: g  reason: collision with root package name */
    private short f12825g = 1;

    /* renamed from: h  reason: collision with root package name */
    private short f12826h = f12818v;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f12827i = false;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f12828j = false;

    /* renamed from: k  reason: collision with root package name */
    private int f12829k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f12830l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f12831m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public long f12832n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public SparseArray<Long> f12833o;

    /* compiled from: Sta */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private StructPollfd[] f12834a;

        public a(StructPollfd[] structPollfdArr) {
            this.f12834a = structPollfdArr;
        }

        public void run() {
            StructPollfd structPollfd = this.f12834a[0];
            FileDescriptor fileDescriptor = structPollfd.fd;
            int a10 = y.this.f12830l;
            byte[] bArr = new byte[a10];
            int i10 = 0;
            while (y.this.f12828j && !y.this.f12827i && y.this.f12831m < y.this.f12823e) {
                try {
                    int poll = Os.poll(this.f12834a, y.this.f12821c);
                    if (!y.this.f12827i) {
                        if (poll >= 0 && structPollfd.revents == y.f12814r) {
                            structPollfd.revents = y.f12814r;
                            Os.recvfrom(fileDescriptor, bArr, 0, a10, y.f12817u, (InetSocketAddress) null);
                            int hashCode = Arrays.hashCode(y.b(bArr));
                            Long l10 = (Long) y.this.f12833o.get(hashCode);
                            if (l10 != null) {
                                y.this.f12833o.remove(hashCode);
                                long elapsedRealtime = SystemClock.elapsedRealtime() - l10.longValue();
                                int i11 = i10 + 1;
                                try {
                                    y.this.f12820b.a(i10, SystemClock.elapsedRealtime() - y.this.f12832n, elapsedRealtime);
                                    y.f(y.this);
                                    i10 = i11;
                                } catch (Throwable th) {
                                    th = th;
                                    i10 = i11;
                                    x2.a(th);
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    x2.a(th);
                }
            }
        }
    }

    static {
        int i10 = OsConstants.POLLIN;
        if (i10 == 0) {
            i10 = 1;
        }
        f12814r = (short) i10;
    }

    public y(InetAddress inetAddress, int i10, int i11, int i12, int i13) {
        this.f12819a = inetAddress;
        this.f12821c = i12;
        this.f12823e = i10;
        this.f12822d = i11;
        this.f12824f = new b4(inetAddress instanceof Inet6Address ? b4.f10104d : 8);
        this.f12829k = i13;
        this.f12830l = i13 + 8;
        this.f12833o = new SparseArray<>();
    }

    public static /* synthetic */ int f(y yVar) {
        int i10 = yVar.f12831m;
        yVar.f12831m = i10 + 1;
        return i10;
    }

    public void b() {
        this.f12827i = true;
    }

    @TargetApi(21)
    public void c() {
        int i10;
        int i11;
        int i12;
        this.f12827i = false;
        if (this.f12819a instanceof Inet6Address) {
            i11 = OsConstants.AF_INET6;
            i10 = OsConstants.IPPROTO_ICMPV6;
        } else {
            i11 = OsConstants.AF_INET;
            i10 = OsConstants.IPPROTO_ICMP;
        }
        this.f12832n = SystemClock.elapsedRealtime();
        try {
            FileDescriptor socket = Os.socket(i11, OsConstants.SOCK_DGRAM, i10);
            if (socket.valid()) {
                try {
                    a(socket);
                    StructPollfd structPollfd = new StructPollfd();
                    structPollfd.fd = socket;
                    structPollfd.events = f12814r;
                    a aVar = new a(new StructPollfd[]{structPollfd});
                    this.f12828j = true;
                    this.f12832n = SystemClock.elapsedRealtime();
                    aVar.start();
                    i12 = 0;
                    while (true) {
                        if (i12 >= this.f12823e) {
                            break;
                        } else if (this.f12827i) {
                            break;
                        } else {
                            byte[] a10 = b4.a(this.f12829k);
                            b4 b4Var = this.f12824f;
                            short s10 = this.f12825g;
                            this.f12825g = (short) (s10 + 1);
                            ByteBuffer a11 = b4Var.a(s10, this.f12826h, a10);
                            this.f12833o.put(Arrays.hashCode(a10), Long.valueOf(SystemClock.elapsedRealtime()));
                            if (Os.sendto(socket, a11, 0, this.f12819a, f12815s) < 0) {
                                break;
                            }
                            if (i12 < this.f12823e - 1) {
                                try {
                                    Thread.sleep((long) this.f12822d);
                                } catch (Throwable th) {
                                    x2.a(th);
                                }
                            }
                            i12++;
                        }
                    }
                    this.f12828j = false;
                    if (aVar.isAlive()) {
                        aVar.join();
                    }
                    Os.close(socket);
                    this.f12828j = false;
                } catch (Throwable th2) {
                    Os.close(socket);
                    this.f12828j = false;
                    throw th2;
                }
            }
            if (!this.f12827i) {
                for (int i13 = this.f12831m; i13 < this.f12823e; i13++) {
                    this.f12820b.a(i13, SystemClock.elapsedRealtime() - this.f12832n, -1);
                }
            }
        } catch (Throwable th3) {
            x2.a(th3);
        }
    }

    /* access modifiers changed from: private */
    public static byte[] b(byte[] bArr) {
        return Arrays.copyOfRange(bArr, 8, bArr.length);
    }

    public void a(short s10) {
        this.f12826h = s10;
    }

    public void a(e8 e8Var) {
        this.f12820b = e8Var;
    }

    private void a(FileDescriptor fileDescriptor) throws ErrnoException {
        if (Build.VERSION.SDK_INT >= 26) {
            Os.setsockoptInt(fileDescriptor, OsConstants.IPPROTO_IP, OsConstants.IP_TOS, f12816t);
            return;
        }
        Class<Os> cls = Os.class;
        try {
            Class cls2 = Integer.TYPE;
            cls.getMethod("setsockoptInt", new Class[]{FileDescriptor.class, cls2, cls2, cls2}).invoke((Object) null, new Object[]{fileDescriptor, Integer.valueOf(OsConstants.IPPROTO_IP), Integer.valueOf(OsConstants.IP_TOS), Integer.valueOf(f12816t)});
        } catch (Throwable th) {
            x2.a(th);
        }
    }
}
