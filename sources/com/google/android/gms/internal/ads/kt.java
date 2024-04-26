package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.databinding.a;
import com.startapp.b4;
import e8.bg0;
import e8.cc0;
import e8.eg0;
import e8.fd0;
import e8.id0;
import e8.nd0;
import e8.w60;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import q.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kt implements ht {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0  reason: collision with root package name */
    public static final byte[] f7270a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0  reason: collision with root package name */
    public static final UUID f7271b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A = -9223372036854775807L;
    public se B;
    public se C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public id0 Y;

    /* renamed from: a  reason: collision with root package name */
    public final jt f7272a;

    /* renamed from: b  reason: collision with root package name */
    public final lt f7273b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<nd0> f7274c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7275d;

    /* renamed from: e  reason: collision with root package name */
    public final w60 f7276e;

    /* renamed from: f  reason: collision with root package name */
    public final w60 f7277f;

    /* renamed from: g  reason: collision with root package name */
    public final w60 f7278g;

    /* renamed from: h  reason: collision with root package name */
    public final w60 f7279h;

    /* renamed from: i  reason: collision with root package name */
    public final w60 f7280i;

    /* renamed from: j  reason: collision with root package name */
    public final w60 f7281j;

    /* renamed from: k  reason: collision with root package name */
    public final w60 f7282k;

    /* renamed from: l  reason: collision with root package name */
    public final w60 f7283l;

    /* renamed from: m  reason: collision with root package name */
    public final w60 f7284m;

    /* renamed from: n  reason: collision with root package name */
    public ByteBuffer f7285n;

    /* renamed from: o  reason: collision with root package name */
    public long f7286o;

    /* renamed from: p  reason: collision with root package name */
    public long f7287p = -1;

    /* renamed from: q  reason: collision with root package name */
    public long f7288q = -9223372036854775807L;

    /* renamed from: r  reason: collision with root package name */
    public long f7289r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public long f7290s = -9223372036854775807L;

    /* renamed from: t  reason: collision with root package name */
    public nd0 f7291t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7292u;

    /* renamed from: v  reason: collision with root package name */
    public int f7293v;

    /* renamed from: w  reason: collision with root package name */
    public long f7294w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f7295x;

    /* renamed from: y  reason: collision with root package name */
    public long f7296y = -1;

    /* renamed from: z  reason: collision with root package name */
    public long f7297z = -1;

    public kt() {
        jt jtVar = new jt();
        this.f7272a = jtVar;
        jtVar.f7177d = new g2(this, (a) null);
        this.f7275d = true;
        this.f7273b = new lt();
        this.f7274c = new SparseArray<>();
        this.f7278g = new w60(4);
        this.f7279h = new w60(ByteBuffer.allocate(4).putInt(-1).array(), 1);
        this.f7280i = new w60(4);
        this.f7276e = new w60(bg0.f14009a, 1);
        this.f7277f = new w60(4);
        this.f7281j = new w60();
        this.f7282k = new w60();
        this.f7283l = new w60(8);
        this.f7284m = new w60();
    }

    public static int[] i(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i10)];
    }

    public final void a() {
    }

    public final int b(fd0 fd0, gu guVar, int i10) throws IOException, InterruptedException {
        int i11;
        int m10 = this.f7281j.m();
        if (m10 > 0) {
            i11 = Math.min(i10, m10);
            guVar.e(this.f7281j, i11);
        } else {
            i11 = guVar.b(fd0, i10);
        }
        this.N += i11;
        this.V += i11;
        return i11;
    }

    public final void c(fd0 fd0, nd0 nd0, int i10) throws IOException, InterruptedException {
        int i11;
        if ("S_TEXT/UTF8".equals(nd0.f15648a)) {
            byte[] bArr = Z;
            int length = bArr.length + i10;
            if (this.f7282k.a() < length) {
                this.f7282k.f17220a = Arrays.copyOf(bArr, length + i10);
            }
            ((gt) fd0).c(this.f7282k.f17220a, bArr.length, i10, false);
            this.f7282k.h(0);
            this.f7282k.g(length);
            return;
        }
        gu guVar = nd0.O;
        if (!this.O) {
            if (nd0.f15652e) {
                this.M &= -1073741825;
                int i12 = 128;
                if (!this.P) {
                    ((gt) fd0).c(this.f7278g.f17220a, 0, 1, false);
                    this.N++;
                    byte[] bArr2 = this.f7278g.f17220a;
                    if ((bArr2[0] & b4.f10104d) != 128) {
                        this.S = bArr2[0];
                        this.P = true;
                    } else {
                        throw new cc0("Extension bit is set in signal byte");
                    }
                }
                byte b10 = this.S;
                if ((b10 & 1) == 1) {
                    boolean z10 = (b10 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        ((gt) fd0).c(this.f7283l.f17220a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        w60 w60 = this.f7278g;
                        byte[] bArr3 = w60.f17220a;
                        if (!z10) {
                            i12 = 0;
                        }
                        bArr3[0] = (byte) (i12 | 8);
                        w60.h(0);
                        guVar.e(this.f7278g, 1);
                        this.V++;
                        this.f7283l.h(0);
                        guVar.e(this.f7283l, 8);
                        this.V += 8;
                    }
                    if (z10) {
                        if (!this.R) {
                            ((gt) fd0).c(this.f7278g.f17220a, 0, 1, false);
                            this.N++;
                            this.f7278g.h(0);
                            this.T = this.f7278g.d();
                            this.R = true;
                        }
                        int i13 = this.T << 2;
                        this.f7278g.f(i13);
                        ((gt) fd0).c(this.f7278g.f17220a, 0, i13, false);
                        this.N += i13;
                        short s10 = (short) ((this.T / 2) + 1);
                        int i14 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f7285n;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f7285n = ByteBuffer.allocate(i14);
                        }
                        this.f7285n.position(0);
                        this.f7285n.putShort(s10);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i11 = this.T;
                            if (i15 >= i11) {
                                break;
                            }
                            int o10 = this.f7278g.o();
                            if (i15 % 2 == 0) {
                                this.f7285n.putShort((short) (o10 - i16));
                            } else {
                                this.f7285n.putInt(o10 - i16);
                            }
                            i15++;
                            i16 = o10;
                        }
                        int i17 = (i10 - this.N) - i16;
                        if (i11 % 2 == 1) {
                            this.f7285n.putInt(i17);
                        } else {
                            this.f7285n.putShort((short) i17);
                            this.f7285n.putInt(0);
                        }
                        this.f7284m.k(this.f7285n.array(), i14);
                        guVar.e(this.f7284m, i14);
                        this.V += i14;
                    }
                }
            } else {
                byte[] bArr4 = nd0.f15653f;
                if (bArr4 != null) {
                    w60 w602 = this.f7281j;
                    int length2 = bArr4.length;
                    w602.f17220a = bArr4;
                    w602.f17222c = length2;
                    w602.f17221b = 0;
                }
            }
            this.O = true;
        }
        int i18 = i10 + this.f7281j.f17222c;
        if (!"V_MPEG4/ISO/AVC".equals(nd0.f15648a) && !"V_MPEGH/ISO/HEVC".equals(nd0.f15648a)) {
            while (true) {
                int i19 = this.N;
                if (i19 >= i18) {
                    break;
                }
                b(fd0, guVar, i18 - i19);
            }
        } else {
            byte[] bArr5 = this.f7277f.f17220a;
            bArr5[0] = 0;
            bArr5[1] = 0;
            bArr5[2] = 0;
            int i20 = nd0.P;
            int i21 = 4 - i20;
            while (this.N < i18) {
                int i22 = this.U;
                if (i22 == 0) {
                    int min = Math.min(i20, this.f7281j.m());
                    ((gt) fd0).c(bArr5, i21 + min, i20 - min, false);
                    if (min > 0) {
                        w60 w603 = this.f7281j;
                        System.arraycopy(w603.f17220a, w603.f17221b, bArr5, i21, min);
                        w603.f17221b += min;
                    }
                    this.N += i20;
                    this.f7277f.h(0);
                    this.U = this.f7277f.o();
                    this.f7276e.h(0);
                    guVar.e(this.f7276e, 4);
                    this.V += 4;
                } else {
                    this.U = i22 - b(fd0, guVar, i22);
                }
            }
        }
        if ("A_VORBIS".equals(nd0.f15648a)) {
            this.f7279h.h(0);
            guVar.e(this.f7279h, 4);
            this.V += 4;
        }
    }

    public final void d(nd0 nd0, long j10) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(nd0.f15648a)) {
            byte[] bArr2 = this.f7282k.f17220a;
            long j11 = this.G;
            if (j11 == -9223372036854775807L) {
                bArr = f7270a0;
            } else {
                int i10 = (int) (j11 / 3600000000L);
                long j12 = j11 - (((long) i10) * 3600000000L);
                int i11 = (int) (j12 / 60000000);
                long j13 = j12 - ((long) (60000000 * i11));
                int i12 = (int) (j13 / 1000000);
                String format = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - ((long) (1000000 * i12))) / 1000))});
                int i13 = eg0.f14479a;
                bArr = format.getBytes(Charset.defaultCharset());
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            gu guVar = nd0.O;
            w60 w60 = this.f7282k;
            guVar.e(w60, w60.f17222c);
            this.V += this.f7282k.f17222c;
        }
        nd0.O.c(j10, this.M, this.V, 0, nd0.f15654g);
        this.W = true;
        l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(e8.fd0 r9, d5.w r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.W = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003b
            boolean r3 = r8.W
            if (r3 != 0) goto L_0x003b
            com.google.android.gms.internal.ads.jt r2 = r8.f7272a
            boolean r2 = r2.b(r9)
            if (r2 == 0) goto L_0x0005
            r3 = r9
            com.google.android.gms.internal.ads.gt r3 = (com.google.android.gms.internal.ads.gt) r3
            long r3 = r3.f6688c
            boolean r5 = r8.f7295x
            if (r5 == 0) goto L_0x0025
            r8.f7297z = r3
            long r3 = r8.f7296y
            r10.f13063a = r3
            r8.f7295x = r0
            goto L_0x0035
        L_0x0025:
            boolean r3 = r8.f7292u
            if (r3 == 0) goto L_0x0037
            long r3 = r8.f7297z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0037
            r10.f13063a = r3
            r8.f7297z = r5
        L_0x0035:
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003b:
            if (r2 == 0) goto L_0x003e
            return r0
        L_0x003e:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kt.e(e8.fd0, d5.w):int");
    }

    public final void f(id0 id0) {
        this.Y = id0;
    }

    public final boolean g(fd0 fd0) throws IOException, InterruptedException {
        fd0 fd02 = fd0;
        se seVar = new se(1, (e) null);
        gt gtVar = (gt) fd02;
        long j10 = gtVar.f6687b;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        gtVar.b(((w60) seVar.f8122b).f17220a, 0, 4);
        long n10 = ((w60) seVar.f8122b).n();
        seVar.f8121a = 4;
        while (true) {
            if (n10 != 440786851) {
                int i11 = seVar.f8121a + 1;
                seVar.f8121a = i11;
                if (i11 == i10) {
                    break;
                }
                gtVar.b(((w60) seVar.f8122b).f17220a, 0, 1);
                n10 = ((n10 << 8) & -256) | ((long) (((w60) seVar.f8122b).f17220a[0] & 255));
            } else {
                long f10 = seVar.f(fd02);
                long j12 = (long) seVar.f8121a;
                if (f10 != Long.MIN_VALUE && (j10 == -1 || j12 + f10 < j10)) {
                    while (true) {
                        long j13 = (long) seVar.f8121a;
                        long j14 = j12 + f10;
                        if (j13 < j14) {
                            if (seVar.f(fd02) != Long.MIN_VALUE) {
                                long f11 = seVar.f(fd02);
                                if (f11 < 0 || f11 > 2147483647L) {
                                    break;
                                } else if (f11 != 0) {
                                    gtVar.g((int) f11);
                                    seVar.f8121a = (int) (((long) seVar.f8121a) + f11);
                                }
                            } else {
                                break;
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void h(long j10, long j11) {
        this.A = -9223372036854775807L;
        this.E = 0;
        jt jtVar = this.f7272a;
        jtVar.f7178e = 0;
        jtVar.f7175b.clear();
        lt ltVar = jtVar.f7176c;
        ltVar.f7414b = 0;
        ltVar.f7415c = 0;
        lt ltVar2 = this.f7273b;
        ltVar2.f7414b = 0;
        ltVar2.f7415c = 0;
        l();
    }

    public final void j(fd0 fd0, int i10) throws IOException, InterruptedException {
        w60 w60 = this.f7278g;
        if (w60.f17222c < i10) {
            if (w60.a() < i10) {
                w60 w602 = this.f7278g;
                byte[] bArr = w602.f17220a;
                w602.k(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i10)), this.f7278g.f17222c);
            }
            w60 w603 = this.f7278g;
            byte[] bArr2 = w603.f17220a;
            int i11 = w603.f17222c;
            ((gt) fd0).c(bArr2, i11, i10 - i11, false);
            this.f7278g.g(i10);
        }
    }

    public final long k(long j10) throws cc0 {
        long j11 = this.f7288q;
        if (j11 != -9223372036854775807L) {
            return eg0.b(j10, j11, 1000);
        }
        throw new cc0("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void l() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = 0;
        this.Q = false;
        w60 w60 = this.f7281j;
        w60.f17221b = 0;
        w60.f17222c = 0;
    }
}
