package ve;

import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.y0;
import com.startapp.b4;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import t3.a0;

/* compiled from: Buffer */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f26738c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public u f26739a;

    /* renamed from: b  reason: collision with root package name */
    public long f26740b;

    /* compiled from: Buffer */
    public class a extends InputStream {
        public a() {
        }

        public int available() {
            return (int) Math.min(f.this.f26740b, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            f fVar = f.this;
            if (fVar.f26740b > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return f.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i10, int i11) {
            return f.this.H(bArr, i10, i11);
        }
    }

    public f A() {
        return this;
    }

    public boolean B() {
        return this.f26740b == 0;
    }

    public /* bridge */ /* synthetic */ g C(int i10) throws IOException {
        q0(i10);
        return this;
    }

    public byte[] D(long j10) throws EOFException {
        a0.b(this.f26740b, 0, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[((int) j10)];
            V(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(a0.a("byteCount > Integer.MAX_VALUE: ", j10));
    }

    public /* bridge */ /* synthetic */ g F(byte[] bArr) throws IOException {
        n0(bArr);
        return this;
    }

    public long G(i iVar, long j10) {
        int i10;
        int i11;
        long j11 = 0;
        if (j10 >= 0) {
            u uVar = this.f26739a;
            if (uVar == null) {
                return -1;
            }
            long j12 = this.f26740b;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    uVar = uVar.f26780g;
                    j12 -= (long) (uVar.f26776c - uVar.f26775b);
                }
            } else {
                while (true) {
                    long j13 = ((long) (uVar.f26776c - uVar.f26775b)) + j11;
                    if (j13 >= j10) {
                        break;
                    }
                    uVar = uVar.f26779f;
                    j11 = j13;
                }
                j12 = j11;
            }
            if (iVar.u() == 2) {
                byte m10 = iVar.m(0);
                byte m11 = iVar.m(1);
                while (j12 < this.f26740b) {
                    byte[] bArr = uVar.f26774a;
                    i10 = (int) ((((long) uVar.f26775b) + j10) - j12);
                    int i12 = uVar.f26776c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == m10 || b10 == m11) {
                            i11 = uVar.f26775b;
                        } else {
                            i10++;
                        }
                    }
                    j12 += (long) (uVar.f26776c - uVar.f26775b);
                    uVar = uVar.f26779f;
                    j10 = j12;
                }
                return -1;
            }
            byte[] q10 = iVar.q();
            while (j12 < this.f26740b) {
                byte[] bArr2 = uVar.f26774a;
                int i13 = (int) ((((long) uVar.f26775b) + j10) - j12);
                int i14 = uVar.f26776c;
                while (i10 < i14) {
                    byte b11 = bArr2[i10];
                    int length = q10.length;
                    int i15 = 0;
                    while (i15 < length) {
                        if (b11 == q10[i15]) {
                            i11 = uVar.f26775b;
                        } else {
                            i15++;
                        }
                    }
                    i13 = i10 + 1;
                }
                j12 += (long) (uVar.f26776c - uVar.f26775b);
                uVar = uVar.f26779f;
                j10 = j12;
            }
            return -1;
            return ((long) (i10 - i11)) + j12;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public int H(byte[] bArr, int i10, int i11) {
        a0.b((long) bArr.length, (long) i10, (long) i11);
        u uVar = this.f26739a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i11, uVar.f26776c - uVar.f26775b);
        System.arraycopy(uVar.f26774a, uVar.f26775b, bArr, i10, min);
        int i12 = uVar.f26775b + min;
        uVar.f26775b = i12;
        this.f26740b -= (long) min;
        if (i12 == uVar.f26776c) {
            this.f26739a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public short I() {
        short readShort = readShort();
        Charset charset = a0.f26727a;
        short s10 = readShort & 65535;
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public long K(x xVar) throws IOException {
        long j10 = this.f26740b;
        if (j10 > 0) {
            ((f) xVar).m(this, j10);
        }
        return j10;
    }

    public g L() throws IOException {
        return this;
    }

    public String O(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long v10 = v((byte) 10, 0, j11);
            if (v10 != -1) {
                return j0(v10);
            }
            if (j11 < this.f26740b && u(j11 - 1) == 13 && u(j11) == 10) {
                return j0(j11);
            }
            f fVar = new f();
            t(fVar, 0, Math.min(32, this.f26740b));
            StringBuilder a10 = android.support.v4.media.a.a("\\n not found: limit=");
            a10.append(Math.min(this.f26740b, j10));
            a10.append(" content=");
            a10.append(fVar.T().o());
            a10.append(8230);
            throw new EOFException(a10.toString());
        }
        throw new IllegalArgumentException(a0.a("limit < 0: ", j10));
    }

    public boolean R(long j10, i iVar) {
        int u10 = iVar.u();
        if (j10 < 0 || u10 < 0 || this.f26740b - j10 < ((long) u10) || iVar.u() - 0 < u10) {
            return false;
        }
        for (int i10 = 0; i10 < u10; i10++) {
            if (u(((long) i10) + j10) != iVar.m(0 + i10)) {
                return false;
            }
        }
        return true;
    }

    public i T() {
        try {
            return new i(D(this.f26740b));
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public void V(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int H = H(bArr, i10, bArr.length - i10);
            if (H != -1) {
                i10 += H;
            } else {
                throw new EOFException();
            }
        }
    }

    public void X(long j10) throws EOFException {
        if (this.f26740b < j10) {
            throw new EOFException();
        }
    }

    public /* bridge */ /* synthetic */ g Y(String str) throws IOException {
        w0(str);
        return this;
    }

    public final void a() {
        try {
            b(this.f26740b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public long a0(f fVar, long j10) {
        if (fVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j10 >= 0) {
            long j11 = this.f26740b;
            if (j11 == 0) {
                return -1;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            fVar.m(this, j10);
            return j10;
        } else {
            throw new IllegalArgumentException(a0.a("byteCount < 0: ", j10));
        }
    }

    public void b(long j10) throws EOFException {
        while (j10 > 0) {
            u uVar = this.f26739a;
            if (uVar != null) {
                int min = (int) Math.min(j10, (long) (uVar.f26776c - uVar.f26775b));
                long j11 = (long) min;
                this.f26740b -= j11;
                j10 -= j11;
                u uVar2 = this.f26739a;
                int i10 = uVar2.f26775b + min;
                uVar2.f26775b = i10;
                if (i10 == uVar2.f26776c) {
                    this.f26739a = uVar2.a();
                    v.a(uVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public long b0(byte b10) {
        return v(b10, 0, Long.MAX_VALUE);
    }

    public f c() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r8 != r9) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        r15.f26739a = r6.a();
        ve.v.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        r6.f26775b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (r1 != false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c0() {
        /*
            r15 = this;
            long r0 = r15.f26740b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a2
            r0 = 0
            r1 = 0
            r4 = r2
        L_0x000b:
            ve.u r6 = r15.f26739a
            byte[] r7 = r6.f26774a
            int r8 = r6.f26775b
            int r9 = r6.f26776c
        L_0x0013:
            if (r8 >= r9) goto L_0x0087
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0039
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -97
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x006c
            r11 = 70
            if (r10 > r11) goto L_0x006c
            int r11 = r10 + -65
        L_0x0037:
            int r11 = r11 + 10
        L_0x0039:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0049
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0049:
            ve.f r0 = new ve.f
            r0.<init>()
            ve.f r0 = r0.k(r4)
            r0.q0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            java.lang.String r0 = r0.g0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006c:
            if (r0 == 0) goto L_0x0070
            r1 = 1
            goto L_0x0087
        L_0x0070:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0087:
            if (r8 != r9) goto L_0x0093
            ve.u r7 = r6.a()
            r15.f26739a = r7
            ve.v.a(r6)
            goto L_0x0095
        L_0x0093:
            r6.f26775b = r8
        L_0x0095:
            if (r1 != 0) goto L_0x009b
            ve.u r6 = r15.f26739a
            if (r6 != 0) goto L_0x000b
        L_0x009b:
            long r1 = r15.f26740b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f26740b = r1
            return r4
        L_0x00a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto L_0x00ab
        L_0x00aa:
            throw r0
        L_0x00ab:
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.f.c0():long");
    }

    public void close() {
    }

    /* renamed from: d */
    public f clone() {
        f fVar = new f();
        if (this.f26740b == 0) {
            return fVar;
        }
        u c10 = this.f26739a.c();
        fVar.f26739a = c10;
        c10.f26780g = c10;
        c10.f26779f = c10;
        u uVar = this.f26739a;
        while (true) {
            uVar = uVar.f26779f;
            if (uVar != this.f26739a) {
                fVar.f26739a.f26780g.b(uVar.c());
            } else {
                fVar.f26740b = this.f26740b;
                return fVar;
            }
        }
    }

    public String d0(Charset charset) {
        try {
            return f0(this.f26740b, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public z e() {
        return z.f26785d;
    }

    public InputStream e0() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        long j10 = this.f26740b;
        if (j10 != fVar.f26740b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        u uVar = this.f26739a;
        u uVar2 = fVar.f26739a;
        int i10 = uVar.f26775b;
        int i11 = uVar2.f26775b;
        while (j11 < this.f26740b) {
            long min = (long) Math.min(uVar.f26776c - i10, uVar2.f26776c - i11);
            int i12 = 0;
            while (((long) i12) < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (uVar.f26774a[i10] != uVar2.f26774a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == uVar.f26776c) {
                uVar = uVar.f26779f;
                i10 = uVar.f26775b;
            }
            if (i11 == uVar2.f26776c) {
                uVar2 = uVar2.f26779f;
                i11 = uVar2.f26775b;
            }
            j11 += min;
        }
        return true;
    }

    public int f(r rVar) {
        int k02 = k0(rVar, false);
        if (k02 == -1) {
            return -1;
        }
        try {
            b((long) rVar.f26765a[k02].u());
            return k02;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public String f0(long j10, Charset charset) throws EOFException {
        a0.b(this.f26740b, 0, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j10 > 2147483647L) {
            throw new IllegalArgumentException(a0.a("byteCount > Integer.MAX_VALUE: ", j10));
        } else if (j10 == 0) {
            return "";
        } else {
            u uVar = this.f26739a;
            int i10 = uVar.f26775b;
            if (((long) i10) + j10 > ((long) uVar.f26776c)) {
                return new String(D(j10), charset);
            }
            String str = new String(uVar.f26774a, i10, (int) j10, charset);
            int i11 = (int) (((long) uVar.f26775b) + j10);
            uVar.f26775b = i11;
            this.f26740b -= j10;
            if (i11 == uVar.f26776c) {
                this.f26739a = uVar.a();
                v.a(uVar);
            }
            return str;
        }
    }

    public void flush() {
    }

    public /* bridge */ /* synthetic */ g g(byte[] bArr, int i10, int i11) throws IOException {
        o0(bArr, i10, i11);
        return this;
    }

    public String g0() {
        try {
            return f0(this.f26740b, a0.f26727a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public String h0(long j10) throws EOFException {
        return f0(j10, a0.f26727a);
    }

    public int hashCode() {
        u uVar = this.f26739a;
        if (uVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = uVar.f26776c;
            for (int i12 = uVar.f26775b; i12 < i11; i12++) {
                i10 = (i10 * 31) + uVar.f26774a[i12];
            }
            uVar = uVar.f26779f;
        } while (uVar != this.f26739a);
        return i10;
    }

    public int i0() throws EOFException {
        byte b10;
        int i10;
        byte b11;
        if (this.f26740b != 0) {
            byte u10 = u(0);
            int i11 = 1;
            if ((u10 & b4.f10104d) == 0) {
                b11 = u10 & Byte.MAX_VALUE;
                i10 = 1;
                b10 = 0;
            } else if ((u10 & 224) == 192) {
                b11 = u10 & 31;
                i10 = 2;
                b10 = b4.f10104d;
            } else if ((u10 & 240) == 224) {
                b11 = u10 & 15;
                i10 = 3;
                b10 = 2048;
            } else if ((u10 & 248) == 240) {
                b11 = u10 & 7;
                i10 = 4;
                b10 = 65536;
            } else {
                b(1);
                return 65533;
            }
            long j10 = (long) i10;
            if (this.f26740b >= j10) {
                while (i11 < i10) {
                    long j11 = (long) i11;
                    byte u11 = u(j11);
                    if ((u11 & 192) == 128) {
                        b11 = (b11 << 6) | (u11 & 63);
                        i11++;
                    } else {
                        b(j11);
                        return 65533;
                    }
                }
                b(j10);
                if (b11 > 1114111) {
                    return 65533;
                }
                if ((b11 < 55296 || b11 > 57343) && b11 >= b10) {
                    return b11;
                }
                return 65533;
            }
            StringBuilder a10 = y0.a("size < ", i10, ": ");
            a10.append(this.f26740b);
            a10.append(" (to read code point prefixed 0x");
            a10.append(Integer.toHexString(u10));
            a10.append(")");
            throw new EOFException(a10.toString());
        }
        throw new EOFException();
    }

    public boolean isOpen() {
        return true;
    }

    public String j0(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (u(j11) == 13) {
                String h02 = h0(j11);
                b(2);
                return h02;
            }
        }
        String h03 = h0(j10);
        b(1);
        return h03;
    }

    public int k0(r rVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        u uVar;
        int i13;
        r rVar2 = rVar;
        u uVar2 = this.f26739a;
        int i14 = -2;
        if (uVar2 != null) {
            byte[] bArr = uVar2.f26774a;
            int i15 = uVar2.f26775b;
            int i16 = uVar2.f26776c;
            int[] iArr = rVar2.f26766b;
            u uVar3 = uVar2;
            int i17 = 0;
            int i18 = -1;
            loop0:
            while (true) {
                int i19 = i17 + 1;
                int i20 = iArr[i17];
                int i21 = i19 + 1;
                int i22 = iArr[i19];
                if (i22 != -1) {
                    i18 = i22;
                }
                if (uVar3 == null) {
                    break;
                }
                if (i20 < 0) {
                    int i23 = (i20 * -1) + i21;
                    while (true) {
                        int i24 = i15 + 1;
                        int i25 = i21 + 1;
                        if ((bArr[i15] & 255) != iArr[i21]) {
                            return i18;
                        }
                        boolean z11 = i25 == i23;
                        if (i24 == i16) {
                            u uVar4 = uVar3.f26779f;
                            i13 = uVar4.f26775b;
                            byte[] bArr2 = uVar4.f26774a;
                            i12 = uVar4.f26776c;
                            if (uVar4 != uVar2) {
                                byte[] bArr3 = bArr2;
                                uVar = uVar4;
                                bArr = bArr3;
                            } else if (!z11) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                uVar = null;
                            }
                        } else {
                            u uVar5 = uVar3;
                            i12 = i16;
                            i13 = i24;
                            uVar = uVar5;
                        }
                        if (z11) {
                            i10 = iArr[i25];
                            i11 = i13;
                            i16 = i12;
                            uVar3 = uVar;
                            break;
                        }
                        i15 = i13;
                        i16 = i12;
                        i21 = i25;
                        uVar3 = uVar;
                    }
                } else {
                    int i26 = i15 + 1;
                    byte b10 = bArr[i15] & 255;
                    int i27 = i21 + i20;
                    while (i21 != i27) {
                        if (b10 == iArr[i21]) {
                            i10 = iArr[i21 + i20];
                            if (i26 == i16) {
                                uVar3 = uVar3.f26779f;
                                i11 = uVar3.f26775b;
                                bArr = uVar3.f26774a;
                                i16 = uVar3.f26776c;
                                if (uVar3 == uVar2) {
                                    uVar3 = null;
                                }
                            } else {
                                i11 = i26;
                            }
                        } else {
                            i21++;
                        }
                    }
                    return i18;
                }
                if (i10 >= 0) {
                    return i10;
                }
                i17 = -i10;
                i15 = i11;
                i14 = -2;
            }
            return z10 ? i14 : i18;
        } else if (z10) {
            return -2;
        } else {
            return rVar2.indexOf(i.f26743e);
        }
    }

    public i l(long j10) throws EOFException {
        return new i(D(j10));
    }

    public u l0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        u uVar = this.f26739a;
        if (uVar == null) {
            u b10 = v.b();
            this.f26739a = b10;
            b10.f26780g = b10;
            b10.f26779f = b10;
            return b10;
        }
        u uVar2 = uVar.f26780g;
        if (uVar2.f26776c + i10 <= 8192 && uVar2.f26778e) {
            return uVar2;
        }
        u b11 = v.b();
        uVar2.b(b11);
        return b11;
    }

    public void m(f fVar, long j10) {
        u uVar;
        int i10;
        if (fVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (fVar != this) {
            a0.b(fVar.f26740b, 0, j10);
            while (j10 > 0) {
                u uVar2 = fVar.f26739a;
                int i11 = 0;
                if (j10 < ((long) (uVar2.f26776c - uVar2.f26775b))) {
                    u uVar3 = this.f26739a;
                    u uVar4 = uVar3 != null ? uVar3.f26780g : null;
                    if (uVar4 != null && uVar4.f26778e) {
                        long j11 = ((long) uVar4.f26776c) + j10;
                        if (uVar4.f26777d) {
                            i10 = 0;
                        } else {
                            i10 = uVar4.f26775b;
                        }
                        if (j11 - ((long) i10) <= 8192) {
                            uVar2.d(uVar4, (int) j10);
                            fVar.f26740b -= j10;
                            this.f26740b += j10;
                            return;
                        }
                    }
                    int i12 = (int) j10;
                    uVar2.getClass();
                    if (i12 <= 0 || i12 > uVar2.f26776c - uVar2.f26775b) {
                        throw new IllegalArgumentException();
                    }
                    if (i12 >= 1024) {
                        uVar = uVar2.c();
                    } else {
                        uVar = v.b();
                        System.arraycopy(uVar2.f26774a, uVar2.f26775b, uVar.f26774a, 0, i12);
                    }
                    uVar.f26776c = uVar.f26775b + i12;
                    uVar2.f26775b += i12;
                    uVar2.f26780g.b(uVar);
                    fVar.f26739a = uVar;
                }
                u uVar5 = fVar.f26739a;
                long j12 = (long) (uVar5.f26776c - uVar5.f26775b);
                fVar.f26739a = uVar5.a();
                u uVar6 = this.f26739a;
                if (uVar6 == null) {
                    this.f26739a = uVar5;
                    uVar5.f26780g = uVar5;
                    uVar5.f26779f = uVar5;
                } else {
                    uVar6.f26780g.b(uVar5);
                    u uVar7 = uVar5.f26780g;
                    if (uVar7 == uVar5) {
                        throw new IllegalStateException();
                    } else if (uVar7.f26778e) {
                        int i13 = uVar5.f26776c - uVar5.f26775b;
                        int i14 = 8192 - uVar7.f26776c;
                        if (!uVar7.f26777d) {
                            i11 = uVar7.f26775b;
                        }
                        if (i13 <= i14 + i11) {
                            uVar5.d(uVar7, i13);
                            uVar5.a();
                            v.a(uVar5);
                        }
                    }
                }
                fVar.f26740b -= j12;
                this.f26740b += j12;
                j10 -= j12;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public f m0(i iVar) {
        if (iVar != null) {
            iVar.y(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public /* bridge */ /* synthetic */ g n(int i10) throws IOException {
        u0(i10);
        return this;
    }

    public f n0(byte[] bArr) {
        if (bArr != null) {
            o0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long o() {
        long j10 = this.f26740b;
        if (j10 == 0) {
            return 0;
        }
        u uVar = this.f26739a.f26780g;
        int i10 = uVar.f26776c;
        return (i10 >= 8192 || !uVar.f26778e) ? j10 : j10 - ((long) (i10 - uVar.f26775b));
    }

    public f o0(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = (long) i11;
            a0.b((long) bArr.length, (long) i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                u l02 = l0(1);
                int min = Math.min(i12 - i10, 8192 - l02.f26776c);
                System.arraycopy(bArr, i10, l02.f26774a, l02.f26776c, min);
                i10 += min;
                l02.f26776c += min;
            }
            this.f26740b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public boolean p(long j10) {
        return this.f26740b >= j10;
    }

    public long p0(y yVar) throws IOException {
        if (yVar != null) {
            long j10 = 0;
            while (true) {
                long a02 = yVar.a0(this, 8192);
                if (a02 == -1) {
                    return j10;
                }
                j10 += a02;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public long q(i iVar) {
        return G(iVar, 0);
    }

    public f q0(int i10) {
        u l02 = l0(1);
        byte[] bArr = l02.f26774a;
        int i11 = l02.f26776c;
        l02.f26776c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f26740b++;
        return this;
    }

    public /* bridge */ /* synthetic */ g r(int i10) throws IOException {
        t0(i10);
        return this;
    }

    /* renamed from: r0 */
    public f Z(long j10) {
        if (j10 == 0) {
            q0(48);
            return this;
        }
        boolean z10 = false;
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                w0("-9223372036854775808");
                return this;
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        u l02 = l0(i10);
        byte[] bArr = l02.f26774a;
        int i11 = l02.f26776c + i10;
        while (j10 != 0) {
            i11--;
            bArr[i11] = f26738c[(int) (j10 % 10)];
            j10 /= 10;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        l02.f26776c += i10;
        this.f26740b += (long) i10;
        return this;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        u uVar = this.f26739a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f26776c - uVar.f26775b);
        byteBuffer.put(uVar.f26774a, uVar.f26775b, min);
        int i10 = uVar.f26775b + min;
        uVar.f26775b = i10;
        this.f26740b -= (long) min;
        if (i10 == uVar.f26776c) {
            this.f26739a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    public byte readByte() {
        long j10 = this.f26740b;
        if (j10 != 0) {
            u uVar = this.f26739a;
            int i10 = uVar.f26775b;
            int i11 = uVar.f26776c;
            int i12 = i10 + 1;
            byte b10 = uVar.f26774a[i10];
            this.f26740b = j10 - 1;
            if (i12 == i11) {
                this.f26739a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f26775b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    public int readInt() {
        long j10 = this.f26740b;
        if (j10 >= 4) {
            u uVar = this.f26739a;
            int i10 = uVar.f26775b;
            int i11 = uVar.f26776c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.f26774a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i14 = i13 + 1;
            byte b11 = b10 | ((bArr[i13] & 255) << 8);
            int i15 = i14 + 1;
            byte b12 = b11 | (bArr[i14] & 255);
            this.f26740b = j10 - 4;
            if (i15 == i11) {
                this.f26739a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f26775b = i15;
            }
            return b12;
        }
        StringBuilder a10 = android.support.v4.media.a.a("size < 4: ");
        a10.append(this.f26740b);
        throw new IllegalStateException(a10.toString());
    }

    public short readShort() {
        long j10 = this.f26740b;
        if (j10 >= 2) {
            u uVar = this.f26739a;
            int i10 = uVar.f26775b;
            int i11 = uVar.f26776c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.f26774a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            byte b10 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f26740b = j10 - 2;
            if (i13 == i11) {
                this.f26739a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f26775b = i13;
            }
            return (short) b10;
        }
        StringBuilder a10 = android.support.v4.media.a.a("size < 2: ");
        a10.append(this.f26740b);
        throw new IllegalStateException(a10.toString());
    }

    /* renamed from: s0 */
    public f k(long j10) {
        if (j10 == 0) {
            q0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        u l02 = l0(numberOfTrailingZeros);
        byte[] bArr = l02.f26774a;
        int i10 = l02.f26776c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f26738c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        l02.f26776c += numberOfTrailingZeros;
        this.f26740b += (long) numberOfTrailingZeros;
        return this;
    }

    public final f t(f fVar, long j10, long j11) {
        if (fVar != null) {
            a0.b(this.f26740b, j10, j11);
            if (j11 == 0) {
                return this;
            }
            fVar.f26740b += j11;
            u uVar = this.f26739a;
            while (true) {
                int i10 = uVar.f26776c;
                int i11 = uVar.f26775b;
                if (j10 < ((long) (i10 - i11))) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                uVar = uVar.f26779f;
            }
            while (j11 > 0) {
                u c10 = uVar.c();
                int i12 = (int) (((long) c10.f26775b) + j10);
                c10.f26775b = i12;
                c10.f26776c = Math.min(i12 + ((int) j11), c10.f26776c);
                u uVar2 = fVar.f26739a;
                if (uVar2 == null) {
                    c10.f26780g = c10;
                    c10.f26779f = c10;
                    fVar.f26739a = c10;
                } else {
                    uVar2.f26780g.b(c10);
                }
                j11 -= (long) (c10.f26776c - c10.f26775b);
                uVar = uVar.f26779f;
                j10 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public f t0(int i10) {
        u l02 = l0(4);
        byte[] bArr = l02.f26774a;
        int i11 = l02.f26776c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        l02.f26776c = i14 + 1;
        this.f26740b += 4;
        return this;
    }

    public String toString() {
        i iVar;
        long j10 = this.f26740b;
        if (j10 <= 2147483647L) {
            int i10 = (int) j10;
            if (i10 == 0) {
                iVar = i.f26743e;
            } else {
                iVar = new w(this, i10);
            }
            return iVar.toString();
        }
        StringBuilder a10 = android.support.v4.media.a.a("size > Integer.MAX_VALUE: ");
        a10.append(this.f26740b);
        throw new IllegalArgumentException(a10.toString());
    }

    public final byte u(long j10) {
        int i10;
        a0.b(this.f26740b, j10, 1);
        long j11 = this.f26740b;
        if (j11 - j10 > j10) {
            u uVar = this.f26739a;
            while (true) {
                int i11 = uVar.f26776c;
                int i12 = uVar.f26775b;
                long j12 = (long) (i11 - i12);
                if (j10 < j12) {
                    return uVar.f26774a[i12 + ((int) j10)];
                }
                j10 -= j12;
                uVar = uVar.f26779f;
            }
        } else {
            long j13 = j10 - j11;
            u uVar2 = this.f26739a;
            do {
                uVar2 = uVar2.f26780g;
                int i13 = uVar2.f26776c;
                i10 = uVar2.f26775b;
                j13 += (long) (i13 - i10);
            } while (j13 < 0);
            return uVar2.f26774a[i10 + ((int) j13)];
        }
    }

    public f u0(int i10) {
        u l02 = l0(2);
        byte[] bArr = l02.f26774a;
        int i11 = l02.f26776c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        l02.f26776c = i12 + 1;
        this.f26740b += 2;
        return this;
    }

    public long v(byte b10, long j10, long j11) {
        u uVar;
        long j12 = 0;
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f26740b), Long.valueOf(j10), Long.valueOf(j11)}));
        }
        long j13 = this.f26740b;
        long j14 = j11 > j13 ? j13 : j11;
        if (j10 == j14 || (uVar = this.f26739a) == null) {
            return -1;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                uVar = uVar.f26780g;
                j13 -= (long) (uVar.f26776c - uVar.f26775b);
            }
        } else {
            while (true) {
                long j15 = ((long) (uVar.f26776c - uVar.f26775b)) + j12;
                if (j15 >= j10) {
                    break;
                }
                uVar = uVar.f26779f;
                j12 = j15;
            }
            j13 = j12;
        }
        long j16 = j10;
        while (j13 < j14) {
            byte[] bArr = uVar.f26774a;
            int min = (int) Math.min((long) uVar.f26776c, (((long) uVar.f26775b) + j14) - j13);
            for (int i10 = (int) ((((long) uVar.f26775b) + j16) - j13); i10 < min; i10++) {
                if (bArr[i10] == b10) {
                    return ((long) (i10 - uVar.f26775b)) + j13;
                }
            }
            byte b11 = b10;
            j13 += (long) (uVar.f26776c - uVar.f26775b);
            uVar = uVar.f26779f;
            j16 = j13;
        }
        return -1;
    }

    public f v0(String str, int i10, int i11, Charset charset) {
        if (i10 < 0) {
            throw new IllegalAccessError(d0.a("beginIndex < 0: ", i10));
        } else if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        } else if (i11 > str.length()) {
            StringBuilder a10 = y0.a("endIndex > string.length: ", i11, " > ");
            a10.append(str.length());
            throw new IllegalArgumentException(a10.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(a0.f26727a)) {
            x0(str, i10, i11);
            return this;
        } else {
            byte[] bytes = str.substring(i10, i11).getBytes(charset);
            o0(bytes, 0, bytes.length);
            return this;
        }
    }

    public String w() throws EOFException {
        return O(Long.MAX_VALUE);
    }

    public f w0(String str) {
        x0(str, 0, str.length());
        return this;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                u l02 = l0(1);
                int min = Math.min(i10, 8192 - l02.f26776c);
                byteBuffer.get(l02.f26774a, l02.f26776c, min);
                i10 -= min;
                l02.f26776c += min;
            }
            this.f26740b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public /* bridge */ /* synthetic */ g x(i iVar) throws IOException {
        m0(iVar);
        return this;
    }

    public f x0(String str, int i10, int i11) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i10 < 0) {
            throw new IllegalArgumentException(d0.a("beginIndex < 0: ", i10));
        } else if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        } else if (i11 <= str.length()) {
            while (i10 < i11) {
                char charAt2 = str.charAt(i10);
                if (charAt2 < 128) {
                    u l02 = l0(1);
                    byte[] bArr = l02.f26774a;
                    int i12 = l02.f26776c - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                            int i14 = l02.f26776c;
                            int i15 = (i12 + i10) - i14;
                            l02.f26776c = i14 + i15;
                            this.f26740b += (long) i15;
                        } else {
                            i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt;
                        }
                    }
                    int i142 = l02.f26776c;
                    int i152 = (i12 + i10) - i142;
                    l02.f26776c = i142 + i152;
                    this.f26740b += (long) i152;
                } else {
                    if (charAt2 < 2048) {
                        q0((charAt2 >> 6) | 192);
                        q0((charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        q0((charAt2 >> 12) | 224);
                        q0(((charAt2 >> 6) & 63) | 128);
                        q0((charAt2 & '?') | 128);
                    } else {
                        int i16 = i10 + 1;
                        char charAt3 = i16 < i11 ? str.charAt(i16) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            q0(63);
                            i10 = i16;
                        } else {
                            int i17 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 0;
                            q0((i17 >> 18) | 240);
                            q0(((i17 >> 12) & 63) | 128);
                            q0(((i17 >> 6) & 63) | 128);
                            q0((i17 & 63) | 128);
                            i10 += 2;
                        }
                    }
                    i10++;
                }
            }
            return this;
        } else {
            StringBuilder a10 = y0.a("endIndex > string.length: ", i11, " > ");
            a10.append(str.length());
            throw new IllegalArgumentException(a10.toString());
        }
    }

    public int y() {
        int readInt = readInt();
        Charset charset = a0.f26727a;
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public f y0(int i10) {
        if (i10 < 128) {
            q0(i10);
        } else if (i10 < 2048) {
            q0((i10 >> 6) | 192);
            q0((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 < 55296 || i10 > 57343) {
                q0((i10 >> 12) | 224);
                q0(((i10 >> 6) & 63) | 128);
                q0((i10 & 63) | 128);
            } else {
                q0(63);
            }
        } else if (i10 <= 1114111) {
            q0((i10 >> 18) | 240);
            q0(((i10 >> 12) & 63) | 128);
            q0(((i10 >> 6) & 63) | 128);
            q0((i10 & 63) | 128);
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Unexpected code point: ");
            a10.append(Integer.toHexString(i10));
            throw new IllegalArgumentException(a10.toString());
        }
        return this;
    }
}
