package v6;

import android.os.SystemClock;
import androidx.appcompat.widget.d0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.upstream.n;
import com.startapp.b4;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* compiled from: SntpClient */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f26533a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f26534b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f26535c;

    /* renamed from: d  reason: collision with root package name */
    public static long f26536d;

    /* compiled from: SntpClient */
    public interface b {
    }

    /* compiled from: SntpClient */
    public static final class c implements n.b<n.e> {

        /* renamed from: a  reason: collision with root package name */
        public final b f26537a;

        public c(b bVar) {
            this.f26537a = bVar;
        }

        public void k(n.e eVar, long j10, long j11, boolean z10) {
        }

        public n.c m(n.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f26537a;
            if (bVar != null) {
                DashMediaSource.this.A(iOException);
            }
            return n.f5529e;
        }

        public void n(n.e eVar, long j10, long j11) {
            boolean z10;
            if (this.f26537a != null) {
                synchronized (x.f26534b) {
                    z10 = x.f26535c;
                }
                if (!z10) {
                    b bVar = this.f26537a;
                    DashMediaSource.this.A(new IOException(new ConcurrentModificationException()));
                    return;
                }
                ((DashMediaSource.a) this.f26537a).a();
            }
        }
    }

    /* compiled from: SntpClient */
    public static final class d implements n.e {
        public d(a aVar) {
        }

        /* JADX WARNING: CFG modification limit reached, blocks count: 139 */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r2 = v6.x.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0014, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            v6.x.f26536d = r2;
            v6.x.f26535c = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x001a, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x001c, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() throws java.io.IOException {
            /*
                r4 = this;
                java.lang.Object r0 = v6.x.f26533a
                java.lang.Object r0 = v6.x.f26533a
                monitor-enter(r0)
                java.lang.Object r1 = v6.x.f26534b     // Catch:{ all -> 0x0025 }
                monitor-enter(r1)     // Catch:{ all -> 0x0025 }
                boolean r2 = v6.x.f26535c     // Catch:{ all -> 0x0023 }
                if (r2 == 0) goto L_0x000f
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return
            L_0x000f:
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                long r2 = v6.x.a()     // Catch:{ all -> 0x0025 }
                monitor-enter(r1)     // Catch:{ all -> 0x0025 }
                v6.x.f26536d = r2     // Catch:{ all -> 0x001f }
                r2 = 1
                v6.x.f26535c = r2     // Catch:{ all -> 0x001f }
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return
            L_0x001d:
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                throw r2     // Catch:{ all -> 0x0025 }
            L_0x001f:
                r2 = move-exception
                goto L_0x001d
            L_0x0021:
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                throw r2     // Catch:{ all -> 0x0025 }
            L_0x0023:
                r2 = move-exception
                goto L_0x0021
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                goto L_0x0029
            L_0x0028:
                throw r1
            L_0x0029:
                goto L_0x0028
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.x.d.a():void");
        }

        public void b() {
        }
    }

    public static long a() throws IOException {
        Throwable th;
        DatagramSocket datagramSocket;
        synchronized (f26534b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j10 = currentTimeMillis / 1000;
                Long.signum(j10);
                long j11 = currentTimeMillis - (j10 * 1000);
                long j12 = j10 + 2208988800L;
                bArr[40] = (byte) ((int) (j12 >> 24));
                datagramSocket = datagramSocket2;
                try {
                    bArr[41] = (byte) ((int) (j12 >> 16));
                    bArr[42] = (byte) ((int) (j12 >> 8));
                    bArr[43] = (byte) ((int) (j12 >> 0));
                    long j13 = (j11 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j13 >> 24));
                    bArr[45] = (byte) ((int) (j13 >> 16));
                    bArr[46] = (byte) ((int) (j13 >> 8));
                    bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                } catch (Throwable th2) {
                    th = th2;
                    datagramSocket2 = datagramSocket;
                    try {
                        throw th;
                    } catch (Throwable unused) {
                    }
                }
            }
            datagramSocket2 = datagramSocket;
            datagramSocket2.send(datagramPacket);
            datagramSocket2.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j14 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
            long d10 = d(bArr, 24);
            long d11 = d(bArr, 32);
            long d12 = d(bArr, 40);
            b((byte) ((bArr[0] >> 6) & 3), (byte) (bArr[0] & 7), bArr[1] & 255, d12);
            long j15 = (j14 + (((d12 - j14) + (d11 - d10)) / 2)) - elapsedRealtime2;
            datagramSocket2.close();
            return j15;
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
        throw th;
    }

    public static void b(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b11 != 4 && b11 != 5) {
            throw new IOException(d0.a("SNTP: Untrusted mode: ", b11));
        } else if (i10 == 0 || i10 > 15) {
            throw new IOException(d0.a("SNTP: Untrusted stratum: ", i10));
        } else if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(byte[] bArr, int i10) {
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        byte b12 = bArr[i10 + 2];
        byte b13 = bArr[i10 + 3];
        byte b14 = b10 & true;
        int i11 = b10;
        if (b14 == true) {
            i11 = (b10 & Byte.MAX_VALUE) + b4.f10104d;
        }
        byte b15 = b11 & true;
        int i12 = b11;
        if (b15 == true) {
            i12 = (b11 & Byte.MAX_VALUE) + b4.f10104d;
        }
        byte b16 = b12 & true;
        int i13 = b12;
        if (b16 == true) {
            i13 = (b12 & Byte.MAX_VALUE) + b4.f10104d;
        }
        byte b17 = b13 & true;
        int i14 = b13;
        if (b17 == true) {
            i14 = (b13 & Byte.MAX_VALUE) + b4.f10104d;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long d(byte[] bArr, int i10) {
        long c10 = c(bArr, i10);
        long c11 = c(bArr, i10 + 4);
        if (c10 == 0 && c11 == 0) {
            return 0;
        }
        return ((c11 * 1000) / 4294967296L) + ((c10 - 2208988800L) * 1000);
    }
}
