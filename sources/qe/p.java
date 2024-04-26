package qe;

import com.startapp.b4;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import le.c;
import qe.d;
import qe.g;
import ve.f;
import ve.h;
import ve.i;
import ve.y;
import ve.z;

/* compiled from: Http2Reader */
public final class p implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f24387e = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final h f24388a;

    /* renamed from: b  reason: collision with root package name */
    public final a f24389b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24390c;

    /* renamed from: d  reason: collision with root package name */
    public final d.a f24391d;

    /* compiled from: Http2Reader */
    public static final class a implements y {

        /* renamed from: a  reason: collision with root package name */
        public final h f24392a;

        /* renamed from: b  reason: collision with root package name */
        public int f24393b;

        /* renamed from: c  reason: collision with root package name */
        public byte f24394c;

        /* renamed from: d  reason: collision with root package name */
        public int f24395d;

        /* renamed from: e  reason: collision with root package name */
        public int f24396e;

        /* renamed from: f  reason: collision with root package name */
        public short f24397f;

        public a(h hVar) {
            this.f24392a = hVar;
        }

        public long a0(f fVar, long j10) throws IOException {
            int i10;
            int readInt;
            do {
                int i11 = this.f24396e;
                if (i11 == 0) {
                    this.f24392a.b((long) this.f24397f);
                    this.f24397f = 0;
                    if ((this.f24394c & 4) != 0) {
                        return -1;
                    }
                    i10 = this.f24395d;
                    int t10 = p.t(this.f24392a);
                    this.f24396e = t10;
                    this.f24393b = t10;
                    byte readByte = (byte) (this.f24392a.readByte() & 255);
                    this.f24394c = (byte) (this.f24392a.readByte() & 255);
                    Logger logger = p.f24387e;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(e.a(true, this.f24395d, this.f24393b, readByte, this.f24394c));
                    }
                    readInt = this.f24392a.readInt() & Integer.MAX_VALUE;
                    this.f24395d = readInt;
                    if (readByte != 9) {
                        e.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                } else {
                    long a02 = this.f24392a.a0(fVar, Math.min(j10, (long) i11));
                    if (a02 == -1) {
                        return -1;
                    }
                    this.f24396e = (int) (((long) this.f24396e) - a02);
                    return a02;
                }
            } while (readInt == i10);
            e.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        public void close() throws IOException {
        }

        public z e() {
            return this.f24392a.e();
        }
    }

    /* compiled from: Http2Reader */
    public interface b {
    }

    public p(h hVar, boolean z10) {
        this.f24388a = hVar;
        this.f24390c = z10;
        a aVar = new a(hVar);
        this.f24389b = aVar;
        this.f24391d = new d.a(4096, aVar);
    }

    public static int a(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        e.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
        throw null;
    }

    public static int t(h hVar) throws IOException {
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public final void G(b bVar, int i10, int i11) throws IOException {
        if (i10 != 4) {
            e.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            throw null;
        } else if (i11 != 0) {
            int readInt = this.f24388a.readInt();
            b a10 = b.a(readInt);
            if (a10 != null) {
                g.C0229g gVar = (g.C0229g) bVar;
                if (g.this.t(i11)) {
                    g gVar2 = g.this;
                    gVar2.s(new l(gVar2, "OkHttp %s Push Reset[%s]", new Object[]{gVar2.f24333d, Integer.valueOf(i11)}, i11, a10));
                    return;
                }
                q u10 = g.this.u(i11);
                if (u10 != null) {
                    synchronized (u10) {
                        if (u10.f24408k == null) {
                            u10.f24408k = a10;
                            u10.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            e.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            e.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    public final void H(b bVar, int i10, int i11) throws IOException {
        if (i10 == 4) {
            long readInt = ((long) this.f24388a.readInt()) & 2147483647L;
            if (readInt != 0) {
                g.C0229g gVar = (g.C0229g) bVar;
                if (i11 == 0) {
                    synchronized (g.this) {
                        g gVar2 = g.this;
                        gVar2.f24347z += readInt;
                        gVar2.notifyAll();
                    }
                    return;
                }
                q i12 = g.this.i(i11);
                if (i12 != null) {
                    synchronized (i12) {
                        i12.f24399b += readInt;
                        if (readInt > 0) {
                            i12.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            e.c("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        e.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        throw null;
    }

    public void close() throws IOException {
        this.f24388a.close();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x036f, code lost:
        if (r19 == false) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0371, code lost:
        r7.i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(boolean r23, qe.p.b r24) throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            r2 = 0
            ve.h r3 = r1.f24388a     // Catch:{ IOException -> 0x039a }
            r4 = 9
            r3.X(r4)     // Catch:{ IOException -> 0x039a }
            ve.h r3 = r1.f24388a
            int r3 = t(r3)
            r4 = 0
            r5 = 1
            if (r3 < 0) goto L_0x038c
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r6) goto L_0x038c
            ve.h r7 = r1.f24388a
            byte r7 = r7.readByte()
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r8 = 4
            if (r23 == 0) goto L_0x0037
            if (r7 != r8) goto L_0x0029
            goto L_0x0037
        L_0x0029:
            java.lang.String r0 = "Expected a SETTINGS frame but was %s"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r7)
            r3[r2] = r5
            qe.e.c(r0, r3)
            throw r4
        L_0x0037:
            ve.h r9 = r1.f24388a
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            ve.h r10 = r1.f24388a
            int r10 = r10.readInt()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r11
            java.util.logging.Logger r11 = f24387e
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            boolean r12 = r11.isLoggable(r12)
            if (r12 == 0) goto L_0x005b
            java.lang.String r12 = qe.e.a(r5, r10, r3, r7, r9)
            r11.fine(r12)
        L_0x005b:
            r11 = 5
            r15 = 2
            switch(r7) {
                case 0: goto L_0x024d;
                case 1: goto L_0x0157;
                case 2: goto L_0x012e;
                case 3: goto L_0x0129;
                case 4: goto L_0x007c;
                case 5: goto L_0x0077;
                case 6: goto L_0x0072;
                case 7: goto L_0x006d;
                case 8: goto L_0x0068;
                default: goto L_0x0060;
            }
        L_0x0060:
            ve.h r0 = r1.f24388a
            long r2 = (long) r3
            r0.b(r2)
            goto L_0x038b
        L_0x0068:
            r1.H(r0, r3, r10)
            goto L_0x038b
        L_0x006d:
            r1.o(r0, r3, r10)
            goto L_0x038b
        L_0x0072:
            r1.u(r0, r3, r9, r10)
            goto L_0x038b
        L_0x0077:
            r1.v(r0, r3, r9, r10)
            goto L_0x038b
        L_0x007c:
            if (r10 != 0) goto L_0x0121
            r7 = r9 & 1
            if (r7 == 0) goto L_0x0091
            if (r3 != 0) goto L_0x0089
            r24.getClass()
            goto L_0x038b
        L_0x0089:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            qe.e.c(r2, r0)
            throw r4
        L_0x0091:
            int r7 = r3 % 6
            if (r7 != 0) goto L_0x0113
            v6.q r7 = new v6.q
            r7.<init>(r15, r4)
            r9 = 0
        L_0x009b:
            if (r9 >= r3) goto L_0x00ee
            ve.h r10 = r1.f24388a
            short r10 = r10.readShort()
            r12 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r12
            ve.h r12 = r1.f24388a
            int r12 = r12.readInt()
            if (r10 == r15) goto L_0x00db
            r13 = 3
            if (r10 == r13) goto L_0x00d9
            if (r10 == r8) goto L_0x00cd
            if (r10 == r11) goto L_0x00b7
            goto L_0x00e8
        L_0x00b7:
            if (r12 < r6) goto L_0x00bf
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            if (r12 > r13) goto L_0x00bf
            goto L_0x00e8
        L_0x00bf:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0[r2] = r3
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            qe.e.c(r2, r0)
            throw r4
        L_0x00cd:
            r10 = 7
            if (r12 < 0) goto L_0x00d1
            goto L_0x00e8
        L_0x00d1:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            qe.e.c(r2, r0)
            throw r4
        L_0x00d9:
            r10 = 4
            goto L_0x00e8
        L_0x00db:
            if (r12 == 0) goto L_0x00e8
            if (r12 != r5) goto L_0x00e0
            goto L_0x00e8
        L_0x00e0:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            qe.e.c(r2, r0)
            throw r4
        L_0x00e8:
            r7.e(r10, r12)
            int r9 = r9 + 6
            goto L_0x009b
        L_0x00ee:
            r20 = 0
            qe.g$g r0 = (qe.g.C0229g) r0
            r0.getClass()
            qe.g r3 = qe.g.this     // Catch:{ RejectedExecutionException -> 0x038b }
            java.util.concurrent.ScheduledExecutorService r4 = r3.f24337h     // Catch:{ RejectedExecutionException -> 0x038b }
            qe.n r6 = new qe.n     // Catch:{ RejectedExecutionException -> 0x038b }
            java.lang.String r18 = "OkHttp %s ACK Settings"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ RejectedExecutionException -> 0x038b }
            java.lang.String r3 = r3.f24333d     // Catch:{ RejectedExecutionException -> 0x038b }
            r8[r2] = r3     // Catch:{ RejectedExecutionException -> 0x038b }
            r16 = r6
            r17 = r0
            r19 = r8
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ RejectedExecutionException -> 0x038b }
            r4.execute(r6)     // Catch:{ RejectedExecutionException -> 0x038b }
            goto L_0x038b
        L_0x0113:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_SETTINGS length %% 6 != 0: %s"
            qe.e.c(r2, r0)
            throw r4
        L_0x0121:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            qe.e.c(r2, r0)
            throw r4
        L_0x0129:
            r1.G(r0, r3, r10)
            goto L_0x038b
        L_0x012e:
            if (r3 != r11) goto L_0x0149
            if (r10 == 0) goto L_0x0141
            ve.h r2 = r1.f24388a
            r2.readInt()
            ve.h r2 = r1.f24388a
            r2.readByte()
            r24.getClass()
            goto L_0x038b
        L_0x0141:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            qe.e.c(r2, r0)
            throw r4
        L_0x0149:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_PRIORITY length: %d != 5"
            qe.e.c(r2, r0)
            throw r4
        L_0x0157:
            if (r10 == 0) goto L_0x0245
            r4 = r9 & 1
            if (r4 == 0) goto L_0x015f
            r4 = 1
            goto L_0x0160
        L_0x015f:
            r4 = 0
        L_0x0160:
            r6 = r9 & 8
            if (r6 == 0) goto L_0x016e
            ve.h r6 = r1.f24388a
            byte r6 = r6.readByte()
            r6 = r6 & 255(0xff, float:3.57E-43)
            short r6 = (short) r6
            goto L_0x016f
        L_0x016e:
            r6 = 0
        L_0x016f:
            r7 = r9 & 32
            if (r7 == 0) goto L_0x0182
            ve.h r7 = r1.f24388a
            r7.readInt()
            ve.h r7 = r1.f24388a
            r7.readByte()
            r24.getClass()
            int r3 = r3 + -5
        L_0x0182:
            int r3 = a(r3, r9, r6)
            java.util.List r17 = r1.s(r3, r6, r9, r10)
            qe.g$g r0 = (qe.g.C0229g) r0
            qe.g r3 = qe.g.this
            boolean r3 = r3.t(r10)
            if (r3 == 0) goto L_0x01b7
            qe.g r0 = qe.g.this
            r0.getClass()
            qe.j r3 = new qe.j     // Catch:{ RejectedExecutionException -> 0x038b }
            java.lang.String r14 = "OkHttp %s Push Headers[%s]"
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ RejectedExecutionException -> 0x038b }
            java.lang.String r6 = r0.f24333d     // Catch:{ RejectedExecutionException -> 0x038b }
            r15[r2] = r6     // Catch:{ RejectedExecutionException -> 0x038b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ RejectedExecutionException -> 0x038b }
            r15[r5] = r2     // Catch:{ RejectedExecutionException -> 0x038b }
            r12 = r3
            r13 = r0
            r16 = r10
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ RejectedExecutionException -> 0x038b }
            r0.s(r3)     // Catch:{ RejectedExecutionException -> 0x038b }
            goto L_0x038b
        L_0x01b7:
            qe.g r3 = qe.g.this
            monitor-enter(r3)
            qe.g r6 = qe.g.this     // Catch:{ all -> 0x0242 }
            qe.q r6 = r6.i(r10)     // Catch:{ all -> 0x0242 }
            if (r6 != 0) goto L_0x021a
            qe.g r6 = qe.g.this     // Catch:{ all -> 0x0242 }
            boolean r7 = r6.f24336g     // Catch:{ all -> 0x0242 }
            if (r7 == 0) goto L_0x01cb
            monitor-exit(r3)     // Catch:{ all -> 0x0242 }
            goto L_0x038b
        L_0x01cb:
            int r7 = r6.f24334e     // Catch:{ all -> 0x0242 }
            if (r10 > r7) goto L_0x01d2
            monitor-exit(r3)     // Catch:{ all -> 0x0242 }
            goto L_0x038b
        L_0x01d2:
            int r7 = r10 % 2
            int r6 = r6.f24335f     // Catch:{ all -> 0x0242 }
            int r6 = r6 % r15
            if (r7 != r6) goto L_0x01dc
            monitor-exit(r3)     // Catch:{ all -> 0x0242 }
            goto L_0x038b
        L_0x01dc:
            ke.r r17 = le.c.x(r17)     // Catch:{ all -> 0x0242 }
            qe.q r6 = new qe.q     // Catch:{ all -> 0x0242 }
            qe.g r14 = qe.g.this     // Catch:{ all -> 0x0242 }
            r7 = 0
            r12 = r6
            r13 = r10
            r8 = 2
            r15 = r7
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0242 }
            qe.g r4 = qe.g.this     // Catch:{ all -> 0x0242 }
            r4.f24334e = r10     // Catch:{ all -> 0x0242 }
            java.util.Map<java.lang.Integer, qe.q> r4 = r4.f24332c     // Catch:{ all -> 0x0242 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0242 }
            r4.put(r7, r6)     // Catch:{ all -> 0x0242 }
            java.util.concurrent.ExecutorService r4 = qe.g.G     // Catch:{ all -> 0x0242 }
            qe.m r7 = new qe.m     // Catch:{ all -> 0x0242 }
            java.lang.String r9 = "OkHttp %s stream %d"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0242 }
            qe.g r11 = qe.g.this     // Catch:{ all -> 0x0242 }
            java.lang.String r11 = r11.f24333d     // Catch:{ all -> 0x0242 }
            r8[r2] = r11     // Catch:{ all -> 0x0242 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0242 }
            r8[r5] = r2     // Catch:{ all -> 0x0242 }
            r7.<init>(r0, r9, r8, r6)     // Catch:{ all -> 0x0242 }
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4     // Catch:{ all -> 0x0242 }
            r4.execute(r7)     // Catch:{ all -> 0x0242 }
            monitor-exit(r3)     // Catch:{ all -> 0x0242 }
            goto L_0x038b
        L_0x021a:
            monitor-exit(r3)     // Catch:{ all -> 0x0242 }
            monitor-enter(r6)
            r6.f24403f = r5     // Catch:{ all -> 0x023f }
            java.util.Deque<ke.r> r0 = r6.f24402e     // Catch:{ all -> 0x023f }
            ke.r r2 = le.c.x(r17)     // Catch:{ all -> 0x023f }
            r0.add(r2)     // Catch:{ all -> 0x023f }
            boolean r0 = r6.h()     // Catch:{ all -> 0x023f }
            r6.notifyAll()     // Catch:{ all -> 0x023f }
            monitor-exit(r6)     // Catch:{ all -> 0x023f }
            if (r0 != 0) goto L_0x0238
            qe.g r0 = r6.f24401d
            int r2 = r6.f24400c
            r0.u(r2)
        L_0x0238:
            if (r4 == 0) goto L_0x038b
            r6.i()
            goto L_0x038b
        L_0x023f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x023f }
            throw r0
        L_0x0242:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0242 }
            throw r0
        L_0x0245:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            qe.e.c(r0, r2)
            throw r4
        L_0x024d:
            r8 = 2
            if (r10 == 0) goto L_0x0383
            r6 = r9 & 1
            if (r6 == 0) goto L_0x0257
            r19 = 1
            goto L_0x0259
        L_0x0257:
            r19 = 0
        L_0x0259:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x025f
            r6 = 1
            goto L_0x0260
        L_0x025f:
            r6 = 0
        L_0x0260:
            if (r6 != 0) goto L_0x037b
            r4 = r9 & 8
            if (r4 == 0) goto L_0x0270
            ve.h r4 = r1.f24388a
            byte r4 = r4.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            short r4 = (short) r4
            goto L_0x0271
        L_0x0270:
            r4 = 0
        L_0x0271:
            int r3 = a(r3, r9, r4)
            ve.h r6 = r1.f24388a
            qe.g$g r0 = (qe.g.C0229g) r0
            qe.g r7 = qe.g.this
            boolean r7 = r7.t(r10)
            if (r7 == 0) goto L_0x02d4
            qe.g r0 = qe.g.this
            r0.getClass()
            ve.f r7 = new ve.f
            r7.<init>()
            long r11 = (long) r3
            r6.X(r11)
            r6.a0(r7, r11)
            long r13 = r7.f26740b
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x02b8
            qe.k r6 = new qe.k
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.String r8 = r0.f24333d
            r15[r2] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r15[r5] = r2
            java.lang.String r14 = "OkHttp %s Push Data[%s]"
            r12 = r6
            r13 = r0
            r16 = r10
            r17 = r7
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.s(r6)
            goto L_0x0374
        L_0x02b8:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r4 = r7.f26740b
            r2.append(r4)
            java.lang.String r4 = " != "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x02d4:
            qe.g r7 = qe.g.this
            qe.q r7 = r7.i(r10)
            if (r7 != 0) goto L_0x02ee
            qe.g r2 = qe.g.this
            qe.b r7 = qe.b.PROTOCOL_ERROR
            r2.M(r10, r7)
            qe.g r0 = qe.g.this
            long r2 = (long) r3
            r0.G(r2)
            r6.b(r2)
            goto L_0x0374
        L_0x02ee:
            qe.q$b r0 = r7.f24404g
            long r8 = (long) r3
            r0.getClass()
        L_0x02f4:
            r10 = 0
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x036f
            qe.q r3 = qe.q.this
            monitor-enter(r3)
            boolean r12 = r0.f24417e     // Catch:{ all -> 0x036c }
            ve.f r13 = r0.f24414b     // Catch:{ all -> 0x036c }
            long r13 = r13.f26740b     // Catch:{ all -> 0x036c }
            long r13 = r13 + r8
            long r10 = r0.f24415c     // Catch:{ all -> 0x036c }
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x030c
            r10 = 1
            goto L_0x030d
        L_0x030c:
            r10 = 0
        L_0x030d:
            monitor-exit(r3)     // Catch:{ all -> 0x036c }
            if (r10 == 0) goto L_0x031b
            r6.b(r8)
            qe.q r0 = qe.q.this
            qe.b r2 = qe.b.FLOW_CONTROL_ERROR
            r0.e(r2)
            goto L_0x036f
        L_0x031b:
            if (r12 == 0) goto L_0x0321
            r6.b(r8)
            goto L_0x036f
        L_0x0321:
            ve.f r3 = r0.f24413a
            long r10 = r6.a0(r3, r8)
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0366
            long r8 = r8 - r10
            qe.q r3 = qe.q.this
            monitor-enter(r3)
            boolean r10 = r0.f24416d     // Catch:{ all -> 0x0363 }
            if (r10 == 0) goto L_0x033d
            ve.f r10 = r0.f24413a     // Catch:{ all -> 0x0363 }
            long r11 = r10.f26740b     // Catch:{ all -> 0x0363 }
            r10.a()     // Catch:{ all -> 0x0363 }
            goto L_0x0358
        L_0x033d:
            ve.f r10 = r0.f24414b     // Catch:{ all -> 0x0363 }
            long r11 = r10.f26740b     // Catch:{ all -> 0x0363 }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0349
            r11 = 1
            goto L_0x034a
        L_0x0349:
            r11 = 0
        L_0x034a:
            ve.f r12 = r0.f24413a     // Catch:{ all -> 0x0363 }
            r10.p0(r12)     // Catch:{ all -> 0x0363 }
            if (r11 == 0) goto L_0x0356
            qe.q r10 = qe.q.this     // Catch:{ all -> 0x0363 }
            r10.notifyAll()     // Catch:{ all -> 0x0363 }
        L_0x0356:
            r11 = 0
        L_0x0358:
            monitor-exit(r3)     // Catch:{ all -> 0x0363 }
            r13 = 0
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x02f4
            r0.a(r11)
            goto L_0x02f4
        L_0x0363:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0363 }
            throw r0
        L_0x0366:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x036c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x036c }
            throw r0
        L_0x036f:
            if (r19 == 0) goto L_0x0374
            r7.i()
        L_0x0374:
            ve.h r0 = r1.f24388a
            long r2 = (long) r4
            r0.b(r2)
            goto L_0x038b
        L_0x037b:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            qe.e.c(r0, r2)
            throw r4
        L_0x0383:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            qe.e.c(r0, r2)
            throw r4
        L_0x038b:
            return r5
        L_0x038c:
            java.lang.String r0 = "FRAME_SIZE_ERROR: %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r2] = r3
            qe.e.c(r0, r5)
            throw r4
        L_0x039a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.p.d(boolean, qe.p$b):boolean");
    }

    public void i(b bVar) throws IOException {
        if (!this.f24390c) {
            h hVar = this.f24388a;
            i iVar = e.f24316a;
            i l10 = hVar.l((long) iVar.f26744a.length);
            Logger logger = f24387e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(c.m("<< CONNECTION %s", l10.o()));
            }
            if (!iVar.equals(l10)) {
                e.c("Expected a connection header but was %s", l10.x());
                throw null;
            }
        } else if (!d(true, bVar)) {
            e.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public final void o(b bVar, int i10, int i11) throws IOException {
        q[] qVarArr;
        if (i10 < 8) {
            e.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            throw null;
        } else if (i11 == 0) {
            int readInt = this.f24388a.readInt();
            int readInt2 = this.f24388a.readInt();
            int i12 = i10 - 8;
            if (b.a(readInt2) != null) {
                i iVar = i.f26743e;
                if (i12 > 0) {
                    iVar = this.f24388a.l((long) i12);
                }
                g.C0229g gVar = (g.C0229g) bVar;
                gVar.getClass();
                iVar.u();
                synchronized (g.this) {
                    qVarArr = (q[]) g.this.f24332c.values().toArray(new q[g.this.f24332c.size()]);
                    g.this.f24336g = true;
                }
                for (q qVar : qVarArr) {
                    if (qVar.f24400c > readInt && qVar.g()) {
                        b bVar2 = b.REFUSED_STREAM;
                        synchronized (qVar) {
                            if (qVar.f24408k == null) {
                                qVar.f24408k = bVar2;
                                qVar.notifyAll();
                            }
                        }
                        g.this.u(qVar.f24400c);
                    }
                }
                return;
            }
            e.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            e.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final List<c> s(int i10, short s10, byte b10, int i11) throws IOException {
        a aVar = this.f24389b;
        aVar.f24396e = i10;
        aVar.f24393b = i10;
        aVar.f24397f = s10;
        aVar.f24394c = b10;
        aVar.f24395d = i11;
        d.a aVar2 = this.f24391d;
        while (!aVar2.f24301b.B()) {
            byte readByte = aVar2.f24301b.readByte() & 255;
            if (readByte == 128) {
                throw new IOException("index == 0");
            } else if ((readByte & b4.f10104d) == 128) {
                int g10 = aVar2.g(readByte, 127) - 1;
                if (g10 >= 0 && g10 <= d.f24298a.length + -1) {
                    aVar2.f24300a.add(d.f24298a[g10]);
                } else {
                    int b11 = aVar2.b(g10 - d.f24298a.length);
                    if (b11 >= 0) {
                        c[] cVarArr = aVar2.f24304e;
                        if (b11 < cVarArr.length) {
                            aVar2.f24300a.add(cVarArr[b11]);
                        }
                    }
                    StringBuilder a10 = android.support.v4.media.a.a("Header index too large ");
                    a10.append(g10 + 1);
                    throw new IOException(a10.toString());
                }
            } else if (readByte == 64) {
                i f10 = aVar2.f();
                d.a(f10);
                aVar2.e(-1, new c(f10, aVar2.f()));
            } else if ((readByte & 64) == 64) {
                aVar2.e(-1, new c(aVar2.d(aVar2.g(readByte, 63) - 1), aVar2.f()));
            } else if ((readByte & 32) == 32) {
                int g11 = aVar2.g(readByte, 31);
                aVar2.f24303d = g11;
                if (g11 < 0 || g11 > aVar2.f24302c) {
                    StringBuilder a11 = android.support.v4.media.a.a("Invalid dynamic table size update ");
                    a11.append(aVar2.f24303d);
                    throw new IOException(a11.toString());
                }
                int i12 = aVar2.f24307h;
                if (g11 < i12) {
                    if (g11 == 0) {
                        aVar2.a();
                    } else {
                        aVar2.c(i12 - g11);
                    }
                }
            } else if (readByte == 16 || readByte == 0) {
                i f11 = aVar2.f();
                d.a(f11);
                aVar2.f24300a.add(new c(f11, aVar2.f()));
            } else {
                aVar2.f24300a.add(new c(aVar2.d(aVar2.g(readByte, 15) - 1), aVar2.f()));
            }
        }
        d.a aVar3 = this.f24391d;
        aVar3.getClass();
        ArrayList arrayList = new ArrayList(aVar3.f24300a);
        aVar3.f24300a.clear();
        return arrayList;
    }

    public final void u(b bVar, int i10, byte b10, int i11) throws IOException {
        boolean z10 = false;
        if (i10 != 8) {
            e.c("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            throw null;
        } else if (i11 == 0) {
            int readInt = this.f24388a.readInt();
            int readInt2 = this.f24388a.readInt();
            if ((b10 & 1) != 0) {
                z10 = true;
            }
            g.C0229g gVar = (g.C0229g) bVar;
            gVar.getClass();
            if (z10) {
                synchronized (g.this) {
                    if (readInt == 1) {
                        try {
                            g.this.f24341t++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (readInt == 2) {
                        g.this.f24343v++;
                    } else if (readInt == 3) {
                        g gVar2 = g.this;
                        gVar2.f24344w++;
                        gVar2.notifyAll();
                    }
                }
                return;
            }
            try {
                g gVar3 = g.this;
                gVar3.f24337h.execute(new g.f(true, readInt, readInt2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            e.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final void v(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            short readByte = (b10 & 8) != 0 ? (short) (this.f24388a.readByte() & 255) : 0;
            int readInt = this.f24388a.readInt() & Integer.MAX_VALUE;
            List<c> s10 = s(a(i10 - 4, b10, readByte), readByte, b10, i11);
            g gVar = g.this;
            synchronized (gVar) {
                if (gVar.F.contains(Integer.valueOf(readInt))) {
                    gVar.M(readInt, b.PROTOCOL_ERROR);
                    return;
                }
                gVar.F.add(Integer.valueOf(readInt));
                try {
                    gVar.s(new i(gVar, "OkHttp %s Push Request[%s]", new Object[]{gVar.f24333d, Integer.valueOf(readInt)}, readInt, s10));
                } catch (RejectedExecutionException unused) {
                }
            }
        } else {
            e.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
    }
}
