package z5;

import android.os.Looper;
import c5.g;
import c5.j;
import c5.l;
import com.google.android.exoplayer2.upstream.c;
import d5.a0;
import java.io.EOFException;
import java.io.IOException;
import u6.f;
import v6.e0;
import v6.s;
import v6.v;
import x4.b0;
import z5.z;

/* compiled from: SampleQueue */
public class a0 implements d5.a0 {
    public boolean A;
    public b0 B;
    public b0 C;
    public b0 D;
    public int E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;

    /* renamed from: a  reason: collision with root package name */
    public final z f28515a;

    /* renamed from: b  reason: collision with root package name */
    public final a f28516b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final l f28517c;

    /* renamed from: d  reason: collision with root package name */
    public final j.a f28518d;

    /* renamed from: e  reason: collision with root package name */
    public final Looper f28519e;

    /* renamed from: f  reason: collision with root package name */
    public b f28520f;

    /* renamed from: g  reason: collision with root package name */
    public b0 f28521g;

    /* renamed from: h  reason: collision with root package name */
    public g f28522h;

    /* renamed from: i  reason: collision with root package name */
    public int f28523i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public int[] f28524j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    public long[] f28525k = new long[1000];

    /* renamed from: l  reason: collision with root package name */
    public int[] f28526l = new int[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f28527m = new int[1000];

    /* renamed from: n  reason: collision with root package name */
    public long[] f28528n = new long[1000];

    /* renamed from: o  reason: collision with root package name */
    public a0.a[] f28529o = new a0.a[1000];

    /* renamed from: p  reason: collision with root package name */
    public b0[] f28530p = new b0[1000];

    /* renamed from: q  reason: collision with root package name */
    public int f28531q;

    /* renamed from: r  reason: collision with root package name */
    public int f28532r;

    /* renamed from: s  reason: collision with root package name */
    public int f28533s;

    /* renamed from: t  reason: collision with root package name */
    public int f28534t;

    /* renamed from: u  reason: collision with root package name */
    public long f28535u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f28536v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    public long f28537w = Long.MIN_VALUE;

    /* renamed from: x  reason: collision with root package name */
    public boolean f28538x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f28539y = true;

    /* renamed from: z  reason: collision with root package name */
    public boolean f28540z = true;

    /* compiled from: SampleQueue */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f28541a;

        /* renamed from: b  reason: collision with root package name */
        public long f28542b;

        /* renamed from: c  reason: collision with root package name */
        public a0.a f28543c;
    }

    /* compiled from: SampleQueue */
    public interface b {
        void o(b0 b0Var);
    }

    public a0(f fVar, Looper looper, l lVar, j.a aVar) {
        this.f28519e = looper;
        this.f28517c = lVar;
        this.f28518d = aVar;
        this.f28515a = new z(fVar);
    }

    public void A() {
        i();
        g gVar = this.f28522h;
        if (gVar != null) {
            gVar.e(this.f28518d);
            this.f28522h = null;
            this.f28521g = null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0030=Splitter:B:19:0x0030, B:39:0x007b=Splitter:B:39:0x007b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int B(m3.t r18, a5.f r19, boolean r20, boolean r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            z5.a0$a r3 = r1.f28516b
            monitor-enter(r17)
            r4 = 0
            r2.f87d = r4     // Catch:{ all -> 0x020d }
            boolean r5 = r17.u()     // Catch:{ all -> 0x020d }
            r6 = -5
            r7 = -3
            r8 = 4
            r9 = -4
            r10 = 1
            if (r5 != 0) goto L_0x0035
            if (r21 != 0) goto L_0x0030
            boolean r3 = r1.f28538x     // Catch:{ all -> 0x020d }
            if (r3 == 0) goto L_0x001e
            goto L_0x0030
        L_0x001e:
            x4.b0 r3 = r1.C     // Catch:{ all -> 0x020d }
            if (r3 == 0) goto L_0x002d
            if (r20 != 0) goto L_0x0028
            x4.b0 r5 = r1.f28521g     // Catch:{ all -> 0x020d }
            if (r3 == r5) goto L_0x002d
        L_0x0028:
            r1.y(r3, r0)     // Catch:{ all -> 0x020d }
            monitor-exit(r17)
            goto L_0x0083
        L_0x002d:
            monitor-exit(r17)
        L_0x002e:
            r6 = -3
            goto L_0x0083
        L_0x0030:
            r2.f61a = r8     // Catch:{ all -> 0x020d }
            monitor-exit(r17)
        L_0x0033:
            r6 = -4
            goto L_0x0083
        L_0x0035:
            int r5 = r1.f28534t     // Catch:{ all -> 0x020d }
            int r5 = r1.q(r5)     // Catch:{ all -> 0x020d }
            if (r20 != 0) goto L_0x007b
            x4.b0[] r11 = r1.f28530p     // Catch:{ all -> 0x020d }
            r11 = r11[r5]     // Catch:{ all -> 0x020d }
            x4.b0 r12 = r1.f28521g     // Catch:{ all -> 0x020d }
            if (r11 == r12) goto L_0x0046
            goto L_0x007b
        L_0x0046:
            boolean r0 = r1.w(r5)     // Catch:{ all -> 0x020d }
            if (r0 != 0) goto L_0x0050
            r2.f87d = r10     // Catch:{ all -> 0x020d }
            monitor-exit(r17)
            goto L_0x002e
        L_0x0050:
            int[] r0 = r1.f28527m     // Catch:{ all -> 0x020d }
            r0 = r0[r5]     // Catch:{ all -> 0x020d }
            r2.f61a = r0     // Catch:{ all -> 0x020d }
            long[] r0 = r1.f28528n     // Catch:{ all -> 0x020d }
            r6 = r0[r5]     // Catch:{ all -> 0x020d }
            r2.f88e = r6     // Catch:{ all -> 0x020d }
            long r11 = r1.f28535u     // Catch:{ all -> 0x020d }
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0067
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.i(r0)     // Catch:{ all -> 0x020d }
        L_0x0067:
            int[] r0 = r1.f28526l     // Catch:{ all -> 0x020d }
            r0 = r0[r5]     // Catch:{ all -> 0x020d }
            r3.f28541a = r0     // Catch:{ all -> 0x020d }
            long[] r0 = r1.f28525k     // Catch:{ all -> 0x020d }
            r6 = r0[r5]     // Catch:{ all -> 0x020d }
            r3.f28542b = r6     // Catch:{ all -> 0x020d }
            d5.a0$a[] r0 = r1.f28529o     // Catch:{ all -> 0x020d }
            r0 = r0[r5]     // Catch:{ all -> 0x020d }
            r3.f28543c = r0     // Catch:{ all -> 0x020d }
            monitor-exit(r17)
            goto L_0x0033
        L_0x007b:
            x4.b0[] r3 = r1.f28530p     // Catch:{ all -> 0x020d }
            r3 = r3[r5]     // Catch:{ all -> 0x020d }
            r1.y(r3, r0)     // Catch:{ all -> 0x020d }
            monitor-exit(r17)
        L_0x0083:
            if (r6 != r9) goto L_0x020a
            boolean r0 = r19.r()
            if (r0 != 0) goto L_0x020a
            java.nio.ByteBuffer r0 = r2.f86c
            if (r0 != 0) goto L_0x0095
            int r0 = r2.f90g
            if (r0 != 0) goto L_0x0095
            r0 = 1
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            if (r0 != 0) goto L_0x020a
            z5.z r0 = r1.f28515a
            z5.a0$a r3 = r1.f28516b
            z5.z$a r5 = r0.f28718e
            v6.v r7 = r0.f28716c
            boolean r9 = r19.x()
            if (r9 == 0) goto L_0x0192
            long r11 = r3.f28542b
            r7.z(r10)
            byte[] r9 = r7.f26518a
            z5.z$a r5 = z5.z.f(r5, r11, r9, r10)
            r13 = 1
            long r11 = r11 + r13
            byte[] r9 = r7.f26518a
            byte r9 = r9[r4]
            r13 = r9 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x00be
            r13 = 1
            goto L_0x00bf
        L_0x00be:
            r13 = 0
        L_0x00bf:
            r9 = r9 & 127(0x7f, float:1.78E-43)
            a5.b r14 = r2.f85b
            byte[] r15 = r14.f62a
            if (r15 != 0) goto L_0x00ce
            r15 = 16
            byte[] r15 = new byte[r15]
            r14.f62a = r15
            goto L_0x00d1
        L_0x00ce:
            java.util.Arrays.fill(r15, r4)
        L_0x00d1:
            byte[] r15 = r14.f62a
            z5.z$a r5 = z5.z.f(r5, r11, r15, r9)
            long r8 = (long) r9
            long r11 = r11 + r8
            if (r13 == 0) goto L_0x00ed
            r8 = 2
            r7.z(r8)
            byte[] r9 = r7.f26518a
            z5.z$a r5 = z5.z.f(r5, r11, r9, r8)
            r8 = 2
            long r11 = r11 + r8
            int r8 = r7.x()
            goto L_0x00ee
        L_0x00ed:
            r8 = 1
        L_0x00ee:
            int[] r9 = r14.f65d
            if (r9 == 0) goto L_0x00f5
            int r15 = r9.length
            if (r15 >= r8) goto L_0x00f7
        L_0x00f5:
            int[] r9 = new int[r8]
        L_0x00f7:
            int[] r15 = r14.f66e
            if (r15 == 0) goto L_0x00fe
            int r10 = r15.length
            if (r10 >= r8) goto L_0x0100
        L_0x00fe:
            int[] r15 = new int[r8]
        L_0x0100:
            if (r13 == 0) goto L_0x0129
            int r10 = r8 * 6
            r7.z(r10)
            byte[] r13 = r7.f26518a
            z5.z$a r5 = z5.z.f(r5, r11, r13, r10)
            r20 = r5
            r13 = r6
            long r5 = (long) r10
            long r11 = r11 + r5
            r7.D(r4)
        L_0x0115:
            if (r4 >= r8) goto L_0x0126
            int r5 = r7.x()
            r9[r4] = r5
            int r5 = r7.v()
            r15[r4] = r5
            int r4 = r4 + 1
            goto L_0x0115
        L_0x0126:
            r5 = r20
            goto L_0x0139
        L_0x0129:
            r13 = r6
            r9[r4] = r4
            int r6 = r3.f28541a
            r10 = r5
            long r4 = r3.f28542b
            long r4 = r11 - r4
            int r5 = (int) r4
            int r6 = r6 - r5
            r4 = 0
            r15[r4] = r6
            r5 = r10
        L_0x0139:
            d5.a0$a r4 = r3.f28543c
            int r6 = v6.e0.f26436a
            byte[] r6 = r4.f12997b
            byte[] r10 = r14.f62a
            r20 = r5
            int r5 = r4.f12996a
            r21 = r13
            int r13 = r4.f12998c
            int r4 = r4.f12999d
            r14.f67f = r8
            r14.f65d = r9
            r14.f66e = r15
            r14.f63b = r6
            r14.f62a = r10
            r14.f64c = r5
            r14.f68g = r13
            r14.f69h = r4
            r16 = r0
            android.media.MediaCodec$CryptoInfo r0 = r14.f70i
            r0.numSubSamples = r8
            r0.numBytesOfClearData = r9
            r0.numBytesOfEncryptedData = r15
            r0.key = r6
            r0.iv = r10
            r0.mode = r5
            int r0 = v6.e0.f26436a
            r5 = 24
            if (r0 < r5) goto L_0x0182
            a5.b$b r0 = r14.f71j
            r0.getClass()
            android.media.MediaCodec$CryptoInfo$Pattern r5 = r0.f73b
            r5.set(r13, r4)
            android.media.MediaCodec$CryptoInfo r4 = r0.f72a
            android.media.MediaCodec$CryptoInfo$Pattern r0 = r0.f73b
            r4.setPattern(r0)
        L_0x0182:
            long r4 = r3.f28542b
            long r11 = r11 - r4
            int r0 = (int) r11
            long r8 = (long) r0
            long r4 = r4 + r8
            r3.f28542b = r4
            int r4 = r3.f28541a
            int r4 = r4 - r0
            r3.f28541a = r4
            r5 = r20
            goto L_0x0196
        L_0x0192:
            r16 = r0
            r21 = r6
        L_0x0196:
            boolean r0 = r19.o()
            if (r0 == 0) goto L_0x01f0
            r0 = 4
            r7.z(r0)
            long r8 = r3.f28542b
            byte[] r4 = r7.f26518a
            z5.z$a r4 = z5.z.f(r5, r8, r4, r0)
            int r5 = r7.v()
            long r6 = r3.f28542b
            r8 = 4
            long r6 = r6 + r8
            r3.f28542b = r6
            int r6 = r3.f28541a
            int r6 = r6 - r0
            r3.f28541a = r6
            r2.v(r5)
            long r6 = r3.f28542b
            java.nio.ByteBuffer r0 = r2.f86c
            z5.z$a r0 = z5.z.e(r4, r6, r0, r5)
            long r6 = r3.f28542b
            long r8 = (long) r5
            long r6 = r6 + r8
            r3.f28542b = r6
            int r4 = r3.f28541a
            int r4 = r4 - r5
            r3.f28541a = r4
            java.nio.ByteBuffer r5 = r2.f89f
            if (r5 == 0) goto L_0x01df
            int r5 = r5.capacity()
            if (r5 >= r4) goto L_0x01d9
            goto L_0x01df
        L_0x01d9:
            java.nio.ByteBuffer r4 = r2.f89f
            r4.clear()
            goto L_0x01e5
        L_0x01df:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r2.f89f = r4
        L_0x01e5:
            long r4 = r3.f28542b
            java.nio.ByteBuffer r2 = r2.f89f
            int r3 = r3.f28541a
            z5.z$a r0 = z5.z.e(r0, r4, r2, r3)
            goto L_0x01ff
        L_0x01f0:
            int r0 = r3.f28541a
            r2.v(r0)
            long r6 = r3.f28542b
            java.nio.ByteBuffer r0 = r2.f86c
            int r2 = r3.f28541a
            z5.z$a r0 = z5.z.e(r5, r6, r0, r2)
        L_0x01ff:
            r2 = r16
            r2.f28718e = r0
            int r0 = r1.f28534t
            r2 = 1
            int r0 = r0 + r2
            r1.f28534t = r0
            goto L_0x020c
        L_0x020a:
            r21 = r6
        L_0x020c:
            return r21
        L_0x020d:
            r0 = move-exception
            monitor-exit(r17)
            goto L_0x0211
        L_0x0210:
            throw r0
        L_0x0211:
            goto L_0x0210
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a0.B(m3.t, a5.f, boolean, boolean):int");
    }

    public void C() {
        D(true);
        g gVar = this.f28522h;
        if (gVar != null) {
            gVar.e(this.f28518d);
            this.f28522h = null;
            this.f28521g = null;
        }
    }

    public void D(boolean z10) {
        z zVar = this.f28515a;
        zVar.a(zVar.f28717d);
        z.a aVar = new z.a(0, zVar.f28715b);
        zVar.f28717d = aVar;
        zVar.f28718e = aVar;
        zVar.f28719f = aVar;
        zVar.f28720g = 0;
        zVar.f28714a.d();
        this.f28531q = 0;
        this.f28532r = 0;
        this.f28533s = 0;
        this.f28534t = 0;
        this.f28539y = true;
        this.f28535u = Long.MIN_VALUE;
        this.f28536v = Long.MIN_VALUE;
        this.f28537w = Long.MIN_VALUE;
        this.f28538x = false;
        this.D = null;
        if (z10) {
            this.B = null;
            this.C = null;
            this.f28540z = true;
        }
    }

    public final synchronized void E() {
        this.f28534t = 0;
        z zVar = this.f28515a;
        zVar.f28718e = zVar.f28717d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean F(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.E()     // Catch:{ all -> 0x0040 }
            int r0 = r8.f28534t     // Catch:{ all -> 0x0040 }
            int r2 = r8.q(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.u()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.f28528n     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.f28537w     // Catch:{ all -> 0x0040 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.f28531q     // Catch:{ all -> 0x0040 }
            int r0 = r8.f28534t     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.l(r2, r3, r4, r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f28535u = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.f28534t     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.f28534t = r9     // Catch:{ all -> 0x0040 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003e:
            monitor-exit(r8)
            return r7
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a0.F(long, boolean):boolean");
    }

    public final void G(long j10) {
        if (this.H != j10) {
            this.H = j10;
            this.A = true;
        }
    }

    public final synchronized void H(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f28534t + i10 <= this.f28531q) {
                    z10 = true;
                    v6.a.a(z10);
                    this.f28534t += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        v6.a.a(z10);
        this.f28534t += i10;
    }

    public final int a(c cVar, int i10, boolean z10, int i11) throws IOException {
        z zVar = this.f28515a;
        int d10 = zVar.d(i10);
        z.a aVar = zVar.f28719f;
        int a10 = cVar.a(aVar.f28724d.f26038a, aVar.a(zVar.f28720g), d10);
        if (a10 != -1) {
            zVar.c(a10);
            return a10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public /* synthetic */ void b(v vVar, int i10) {
        d5.z.b(this, vVar, i10);
    }

    public final void c(b0 b0Var) {
        b0 m10 = m(b0Var);
        boolean z10 = false;
        this.A = false;
        this.B = b0Var;
        synchronized (this) {
            this.f28540z = false;
            if (!e0.a(m10, this.C)) {
                if (e0.a(m10, this.D)) {
                    this.C = this.D;
                } else {
                    this.C = m10;
                }
                b0 b0Var2 = this.C;
                this.F = s.a(b0Var2.f27408t, b0Var2.f27405i);
                this.G = false;
                z10 = true;
            }
        }
        b bVar = this.f28520f;
        if (bVar != null && z10) {
            bVar.o(m10);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void d(long r10, int r12, int r13, int r14, d5.a0.a r15) {
        /*
            r9 = this;
            boolean r0 = r9.A
            if (r0 == 0) goto L_0x000e
            x4.b0 r0 = r9.B
            v6.a.f(r0)
            x4.b0 r0 = (x4.b0) r0
            r9.c(r0)
        L_0x000e:
            r0 = r12 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            boolean r4 = r9.f28539y
            if (r4 == 0) goto L_0x0020
            if (r3 != 0) goto L_0x001e
            return
        L_0x001e:
            r9.f28539y = r1
        L_0x0020:
            long r4 = r9.H
            long r10 = r10 + r4
            boolean r4 = r9.F
            if (r4 == 0) goto L_0x004c
            long r4 = r9.f28535u
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x002e
            return
        L_0x002e:
            if (r0 != 0) goto L_0x004c
            boolean r0 = r9.G
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "SampleQueue"
            java.lang.String r4 = "Overriding unexpected non-sync sample for format: "
            java.lang.StringBuilder r4 = android.support.v4.media.a.a(r4)
            x4.b0 r5 = r9.C
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r0, r4)
            r9.G = r2
        L_0x004a:
            r12 = r12 | 1
        L_0x004c:
            boolean r0 = r9.I
            if (r0 == 0) goto L_0x00ab
            if (r3 == 0) goto L_0x00aa
            monitor-enter(r9)
            int r0 = r9.f28531q     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x0062
            long r3 = r9.f28536v     // Catch:{ all -> 0x00a7 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            monitor-exit(r9)
            goto L_0x009e
        L_0x0062:
            monitor-enter(r9)     // Catch:{ all -> 0x00a7 }
            long r3 = r9.f28536v     // Catch:{ all -> 0x00a4 }
            int r0 = r9.f28534t     // Catch:{ all -> 0x00a4 }
            long r5 = r9.o(r0)     // Catch:{ all -> 0x00a4 }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r9)     // Catch:{ all -> 0x00a7 }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0077
            monitor-exit(r9)
            r0 = 0
            goto L_0x009e
        L_0x0077:
            int r0 = r9.f28531q     // Catch:{ all -> 0x00a7 }
            int r3 = r0 + -1
            int r3 = r9.q(r3)     // Catch:{ all -> 0x00a7 }
        L_0x007f:
            int r4 = r9.f28534t     // Catch:{ all -> 0x00a7 }
            if (r0 <= r4) goto L_0x0096
            long[] r4 = r9.f28528n     // Catch:{ all -> 0x00a7 }
            r5 = r4[r3]     // Catch:{ all -> 0x00a7 }
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0096
            int r0 = r0 + -1
            int r3 = r3 + -1
            r4 = -1
            if (r3 != r4) goto L_0x007f
            int r3 = r9.f28523i     // Catch:{ all -> 0x00a7 }
            int r3 = r3 + r4
            goto L_0x007f
        L_0x0096:
            int r3 = r9.f28532r     // Catch:{ all -> 0x00a7 }
            int r3 = r3 + r0
            r9.j(r3)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r9)
            r0 = 1
        L_0x009e:
            if (r0 != 0) goto L_0x00a1
            goto L_0x00aa
        L_0x00a1:
            r9.I = r1
            goto L_0x00ab
        L_0x00a4:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00a7 }
            throw r10     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x00aa:
            return
        L_0x00ab:
            z5.z r0 = r9.f28515a
            long r3 = r0.f28720g
            long r5 = (long) r13
            long r3 = r3 - r5
            long r5 = (long) r14
            long r3 = r3 - r5
            monitor-enter(r9)
            int r14 = r9.f28531q     // Catch:{ all -> 0x018d }
            if (r14 <= 0) goto L_0x00d1
            int r14 = r14 - r2
            int r14 = r9.q(r14)     // Catch:{ all -> 0x018d }
            long[] r0 = r9.f28525k     // Catch:{ all -> 0x018d }
            r5 = r0[r14]     // Catch:{ all -> 0x018d }
            int[] r0 = r9.f28526l     // Catch:{ all -> 0x018d }
            r14 = r0[r14]     // Catch:{ all -> 0x018d }
            long r7 = (long) r14     // Catch:{ all -> 0x018d }
            long r5 = r5 + r7
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 > 0) goto L_0x00cd
            r14 = 1
            goto L_0x00ce
        L_0x00cd:
            r14 = 0
        L_0x00ce:
            v6.a.a(r14)     // Catch:{ all -> 0x018d }
        L_0x00d1:
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = r14 & r12
            if (r14 == 0) goto L_0x00d8
            r14 = 1
            goto L_0x00d9
        L_0x00d8:
            r14 = 0
        L_0x00d9:
            r9.f28538x = r14     // Catch:{ all -> 0x018d }
            long r5 = r9.f28537w     // Catch:{ all -> 0x018d }
            long r5 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x018d }
            r9.f28537w = r5     // Catch:{ all -> 0x018d }
            int r14 = r9.f28531q     // Catch:{ all -> 0x018d }
            int r14 = r9.q(r14)     // Catch:{ all -> 0x018d }
            long[] r0 = r9.f28528n     // Catch:{ all -> 0x018d }
            r0[r14] = r10     // Catch:{ all -> 0x018d }
            long[] r10 = r9.f28525k     // Catch:{ all -> 0x018d }
            r10[r14] = r3     // Catch:{ all -> 0x018d }
            int[] r11 = r9.f28526l     // Catch:{ all -> 0x018d }
            r11[r14] = r13     // Catch:{ all -> 0x018d }
            int[] r11 = r9.f28527m     // Catch:{ all -> 0x018d }
            r11[r14] = r12     // Catch:{ all -> 0x018d }
            d5.a0$a[] r11 = r9.f28529o     // Catch:{ all -> 0x018d }
            r11[r14] = r15     // Catch:{ all -> 0x018d }
            x4.b0[] r11 = r9.f28530p     // Catch:{ all -> 0x018d }
            x4.b0 r12 = r9.C     // Catch:{ all -> 0x018d }
            r11[r14] = r12     // Catch:{ all -> 0x018d }
            int[] r11 = r9.f28524j     // Catch:{ all -> 0x018d }
            int r13 = r9.E     // Catch:{ all -> 0x018d }
            r11[r14] = r13     // Catch:{ all -> 0x018d }
            r9.D = r12     // Catch:{ all -> 0x018d }
            int r11 = r9.f28531q     // Catch:{ all -> 0x018d }
            int r11 = r11 + r2
            r9.f28531q = r11     // Catch:{ all -> 0x018d }
            int r12 = r9.f28523i     // Catch:{ all -> 0x018d }
            if (r11 != r12) goto L_0x018b
            int r11 = r12 + 1000
            int[] r13 = new int[r11]     // Catch:{ all -> 0x018d }
            long[] r14 = new long[r11]     // Catch:{ all -> 0x018d }
            long[] r15 = new long[r11]     // Catch:{ all -> 0x018d }
            int[] r0 = new int[r11]     // Catch:{ all -> 0x018d }
            int[] r2 = new int[r11]     // Catch:{ all -> 0x018d }
            d5.a0$a[] r3 = new d5.a0.a[r11]     // Catch:{ all -> 0x018d }
            x4.b0[] r4 = new x4.b0[r11]     // Catch:{ all -> 0x018d }
            int r5 = r9.f28533s     // Catch:{ all -> 0x018d }
            int r12 = r12 - r5
            java.lang.System.arraycopy(r10, r5, r14, r1, r12)     // Catch:{ all -> 0x018d }
            long[] r10 = r9.f28528n     // Catch:{ all -> 0x018d }
            int r5 = r9.f28533s     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r10, r5, r15, r1, r12)     // Catch:{ all -> 0x018d }
            int[] r10 = r9.f28527m     // Catch:{ all -> 0x018d }
            int r5 = r9.f28533s     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r10, r5, r0, r1, r12)     // Catch:{ all -> 0x018d }
            int[] r10 = r9.f28526l     // Catch:{ all -> 0x018d }
            int r5 = r9.f28533s     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r10, r5, r2, r1, r12)     // Catch:{ all -> 0x018d }
            d5.a0$a[] r10 = r9.f28529o     // Catch:{ all -> 0x018d }
            int r5 = r9.f28533s     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r10, r5, r3, r1, r12)     // Catch:{ all -> 0x018d }
            x4.b0[] r10 = r9.f28530p     // Catch:{ all -> 0x018d }
            int r5 = r9.f28533s     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r10, r5, r4, r1, r12)     // Catch:{ all -> 0x018d }
            int[] r10 = r9.f28524j     // Catch:{ all -> 0x018d }
            int r5 = r9.f28533s     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r10, r5, r13, r1, r12)     // Catch:{ all -> 0x018d }
            int r10 = r9.f28533s     // Catch:{ all -> 0x018d }
            long[] r5 = r9.f28525k     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r5, r1, r14, r12, r10)     // Catch:{ all -> 0x018d }
            long[] r5 = r9.f28528n     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r5, r1, r15, r12, r10)     // Catch:{ all -> 0x018d }
            int[] r5 = r9.f28527m     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r5, r1, r0, r12, r10)     // Catch:{ all -> 0x018d }
            int[] r5 = r9.f28526l     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r5, r1, r2, r12, r10)     // Catch:{ all -> 0x018d }
            d5.a0$a[] r5 = r9.f28529o     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r5, r1, r3, r12, r10)     // Catch:{ all -> 0x018d }
            x4.b0[] r5 = r9.f28530p     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r5, r1, r4, r12, r10)     // Catch:{ all -> 0x018d }
            int[] r5 = r9.f28524j     // Catch:{ all -> 0x018d }
            java.lang.System.arraycopy(r5, r1, r13, r12, r10)     // Catch:{ all -> 0x018d }
            r9.f28525k = r14     // Catch:{ all -> 0x018d }
            r9.f28528n = r15     // Catch:{ all -> 0x018d }
            r9.f28527m = r0     // Catch:{ all -> 0x018d }
            r9.f28526l = r2     // Catch:{ all -> 0x018d }
            r9.f28529o = r3     // Catch:{ all -> 0x018d }
            r9.f28530p = r4     // Catch:{ all -> 0x018d }
            r9.f28524j = r13     // Catch:{ all -> 0x018d }
            r9.f28533s = r1     // Catch:{ all -> 0x018d }
            r9.f28523i = r11     // Catch:{ all -> 0x018d }
        L_0x018b:
            monitor-exit(r9)
            return
        L_0x018d:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0191
        L_0x0190:
            throw r10
        L_0x0191:
            goto L_0x0190
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a0.d(long, int, int, int, d5.a0$a):void");
    }

    public final void e(v vVar, int i10, int i11) {
        z zVar = this.f28515a;
        zVar.getClass();
        while (i10 > 0) {
            int d10 = zVar.d(i10);
            z.a aVar = zVar.f28719f;
            vVar.e(aVar.f28724d.f26038a, aVar.a(zVar.f28720g), d10);
            i10 -= d10;
            zVar.c(d10);
        }
    }

    public /* synthetic */ int f(c cVar, int i10, boolean z10) {
        return d5.z.a(this, cVar, i10, z10);
    }

    public final long g(int i10) {
        this.f28536v = Math.max(this.f28536v, o(i10));
        int i11 = this.f28531q - i10;
        this.f28531q = i11;
        this.f28532r += i10;
        int i12 = this.f28533s + i10;
        this.f28533s = i12;
        int i13 = this.f28523i;
        if (i12 >= i13) {
            this.f28533s = i12 - i13;
        }
        int i14 = this.f28534t - i10;
        this.f28534t = i14;
        if (i14 < 0) {
            this.f28534t = 0;
        }
        if (i11 != 0) {
            return this.f28525k[this.f28533s];
        }
        int i15 = this.f28533s;
        if (i15 != 0) {
            i13 = i15;
        }
        int i16 = i13 - 1;
        return this.f28525k[i16] + ((long) this.f28526l[i16]);
    }

    public final void h(long j10, boolean z10, boolean z11) {
        long j11;
        int i10;
        z zVar = this.f28515a;
        synchronized (this) {
            int i11 = this.f28531q;
            j11 = -1;
            if (i11 != 0) {
                long[] jArr = this.f28528n;
                int i12 = this.f28533s;
                if (j10 >= jArr[i12]) {
                    if (z11 && (i10 = this.f28534t) != i11) {
                        i11 = i10 + 1;
                    }
                    int l10 = l(i12, i11, j10, z10);
                    if (l10 != -1) {
                        j11 = g(l10);
                    }
                }
            }
        }
        zVar.b(j11);
    }

    public final void i() {
        long j10;
        z zVar = this.f28515a;
        synchronized (this) {
            int i10 = this.f28531q;
            if (i10 == 0) {
                j10 = -1;
            } else {
                j10 = g(i10);
            }
        }
        zVar.b(j10);
    }

    public final long j(int i10) {
        int t10 = t() - i10;
        boolean z10 = false;
        v6.a.a(t10 >= 0 && t10 <= this.f28531q - this.f28534t);
        int i11 = this.f28531q - t10;
        this.f28531q = i11;
        this.f28537w = Math.max(this.f28536v, o(i11));
        if (t10 == 0 && this.f28538x) {
            z10 = true;
        }
        this.f28538x = z10;
        int i12 = this.f28531q;
        if (i12 == 0) {
            return 0;
        }
        int q10 = q(i12 - 1);
        return this.f28525k[q10] + ((long) this.f28526l[q10]);
    }

    public final void k(int i10) {
        z zVar = this.f28515a;
        long j10 = j(i10);
        zVar.f28720g = j10;
        if (j10 != 0) {
            z.a aVar = zVar.f28717d;
            if (j10 != aVar.f28721a) {
                while (zVar.f28720g > aVar.f28722b) {
                    aVar = aVar.f28725e;
                }
                z.a aVar2 = aVar.f28725e;
                zVar.a(aVar2);
                z.a aVar3 = new z.a(aVar.f28722b, zVar.f28715b);
                aVar.f28725e = aVar3;
                if (zVar.f28720g == aVar.f28722b) {
                    aVar = aVar3;
                }
                zVar.f28719f = aVar;
                if (zVar.f28718e == aVar2) {
                    zVar.f28718e = aVar3;
                    return;
                }
                return;
            }
        }
        zVar.a(zVar.f28717d);
        z.a aVar4 = new z.a(zVar.f28720g, zVar.f28715b);
        zVar.f28717d = aVar4;
        zVar.f28718e = aVar4;
        zVar.f28719f = aVar4;
    }

    public final int l(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f28528n;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f28527m[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f28523i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public b0 m(b0 b0Var) {
        if (this.H == 0 || b0Var.f27412x == Long.MAX_VALUE) {
            return b0Var;
        }
        b0.b a10 = b0Var.a();
        a10.f27429o = b0Var.f27412x + this.H;
        return a10.a();
    }

    public final synchronized long n() {
        return this.f28537w;
    }

    public final long o(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int q10 = q(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f28528n[q10]);
            if ((this.f28527m[q10] & 1) != 0) {
                break;
            }
            q10--;
            if (q10 == -1) {
                q10 = this.f28523i - 1;
            }
        }
        return j10;
    }

    public final int p() {
        return this.f28532r + this.f28534t;
    }

    public final int q(int i10) {
        int i11 = this.f28533s + i10;
        int i12 = this.f28523i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int r(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f28534t     // Catch:{ all -> 0x003c }
            int r2 = r8.q(r0)     // Catch:{ all -> 0x003c }
            boolean r0 = r8.u()     // Catch:{ all -> 0x003c }
            r7 = 0
            if (r0 == 0) goto L_0x003a
            long[] r0 = r8.f28528n     // Catch:{ all -> 0x003c }
            r3 = r0[r2]     // Catch:{ all -> 0x003c }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            long r0 = r8.f28537w     // Catch:{ all -> 0x003c }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.f28531q     // Catch:{ all -> 0x003c }
            int r10 = r8.f28534t     // Catch:{ all -> 0x003c }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.f28531q     // Catch:{ all -> 0x003c }
            int r0 = r8.f28534t     // Catch:{ all -> 0x003c }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.l(r2, r3, r4, r6)     // Catch:{ all -> 0x003c }
            r10 = -1
            if (r9 != r10) goto L_0x0038
            monitor-exit(r8)
            return r7
        L_0x0038:
            monitor-exit(r8)
            return r9
        L_0x003a:
            monitor-exit(r8)
            return r7
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a0.r(long, boolean):int");
    }

    public final synchronized b0 s() {
        return this.f28540z ? null : this.C;
    }

    public final int t() {
        return this.f28532r + this.f28531q;
    }

    public final boolean u() {
        return this.f28534t != this.f28531q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean v(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.u()     // Catch:{ all -> 0x0030 }
            r1 = 1
            if (r0 != 0) goto L_0x001a
            if (r4 != 0) goto L_0x0018
            boolean r4 = r3.f28538x     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x0018
            x4.b0 r4 = r3.C     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0017
            x4.b0 r0 = r3.f28521g     // Catch:{ all -> 0x0030 }
            if (r4 == r0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r3)
            return r1
        L_0x001a:
            int r4 = r3.f28534t     // Catch:{ all -> 0x0030 }
            int r4 = r3.q(r4)     // Catch:{ all -> 0x0030 }
            x4.b0[] r0 = r3.f28530p     // Catch:{ all -> 0x0030 }
            r0 = r0[r4]     // Catch:{ all -> 0x0030 }
            x4.b0 r2 = r3.f28521g     // Catch:{ all -> 0x0030 }
            if (r0 == r2) goto L_0x002a
            monitor-exit(r3)
            return r1
        L_0x002a:
            boolean r4 = r3.w(r4)     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)
            return r4
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a0.v(boolean):boolean");
    }

    public final boolean w(int i10) {
        g gVar = this.f28522h;
        return gVar == null || gVar.getState() == 4 || ((this.f28527m[i10] & 1073741824) == 0 && this.f28522h.a());
    }

    public void x() throws IOException {
        g gVar = this.f28522h;
        if (gVar != null && gVar.getState() == 1) {
            g.a f10 = this.f28522h.f();
            f10.getClass();
            throw f10;
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<k3.c, m3.m<?>>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.Map<k3.c, m3.m<?>>, c5.g] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.Map<k3.c, m3.m<?>>, c5.g] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(x4.b0 r5, m3.t r6) {
        /*
            r4 = this;
            x4.b0 r0 = r4.f28521g
            if (r0 != 0) goto L_0x0006
            r1 = 1
            goto L_0x0007
        L_0x0006:
            r1 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x000b
            r0 = 0
            goto L_0x000d
        L_0x000b:
            c5.f r0 = r0.f27411w
        L_0x000d:
            r4.f28521g = r5
            c5.f r2 = r5.f27411w
            c5.l r3 = r4.f28517c
            if (r3 == 0) goto L_0x001e
            java.lang.Class r3 = r3.c(r5)
            x4.b0 r3 = r5.b(r3)
            goto L_0x001f
        L_0x001e:
            r3 = r5
        L_0x001f:
            r6.f21666b = r3
            c5.g r3 = r4.f28522h
            r6.f21665a = r3
            c5.l r3 = r4.f28517c
            if (r3 != 0) goto L_0x002a
            return
        L_0x002a:
            if (r1 != 0) goto L_0x0033
            boolean r0 = v6.e0.a(r0, r2)
            if (r0 == 0) goto L_0x0033
            return
        L_0x0033:
            c5.g r0 = r4.f28522h
            c5.l r1 = r4.f28517c
            android.os.Looper r2 = r4.f28519e
            r2.getClass()
            c5.j$a r3 = r4.f28518d
            c5.g r5 = r1.d(r2, r3, r5)
            r4.f28522h = r5
            r6.f21665a = r5
            if (r0 == 0) goto L_0x004d
            c5.j$a r5 = r4.f28518d
            r0.e(r5)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.a0.y(x4.b0, m3.t):void");
    }

    public final synchronized int z() {
        return u() ? this.f28524j[q(this.f28534t)] : this.E;
    }
}
