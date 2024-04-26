package p5;

import a5.b;
import a5.d;
import a5.f;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import c5.g;
import c5.j;
import c5.p;
import c5.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m3.t;
import p5.i;
import p5.p;
import v6.a0;
import v6.e0;
import v6.u;
import x4.b0;
import x4.e;
import x4.m;
import z4.x;

/* compiled from: MediaCodecRenderer */
public abstract class l extends e {
    public static final byte[] U0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final g A;
    public int A0;
    public final a0<b0> B;
    public int B0;
    public final ArrayList<Long> C;
    public int C0;
    public final MediaCodec.BufferInfo D;
    public boolean D0;
    public final long[] E;
    public boolean E0;
    public final long[] F;
    public boolean F0;
    public final long[] G;
    public long G0;
    public b0 H;
    public long H0;
    public b0 I;
    public boolean I0;
    public g J;
    public boolean J0;
    public g K;
    public boolean K0;
    public MediaCrypto L;
    public boolean L0;
    public boolean M;
    public boolean M0;
    public long N;
    public boolean N0;
    public float O;
    public boolean O0;
    public float P;
    public m P0;
    public i Q;
    public d Q0;
    public b0 R;
    public long R0;
    public MediaFormat S;
    public long S0;
    public int T0;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f23884a0;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayDeque<k> f23885b0;

    /* renamed from: c0  reason: collision with root package name */
    public a f23886c0;

    /* renamed from: d0  reason: collision with root package name */
    public k f23887d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f23888e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f23889f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f23890g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f23891h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f23892i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f23893j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f23894k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f23895l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f23896m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f23897n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f23898o0;

    /* renamed from: p0  reason: collision with root package name */
    public h f23899p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f23900q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f23901r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f23902s0;

    /* renamed from: t  reason: collision with root package name */
    public final i.a f23903t;

    /* renamed from: t0  reason: collision with root package name */
    public ByteBuffer f23904t0;

    /* renamed from: u  reason: collision with root package name */
    public final n f23905u;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f23906u0;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f23907v;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f23908v0;

    /* renamed from: w  reason: collision with root package name */
    public final float f23909w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f23910w0;

    /* renamed from: x  reason: collision with root package name */
    public final f f23911x = new f(0);

    /* renamed from: x0  reason: collision with root package name */
    public boolean f23912x0;

    /* renamed from: y  reason: collision with root package name */
    public final f f23913y = new f(0);

    /* renamed from: y0  reason: collision with root package name */
    public boolean f23914y0;

    /* renamed from: z  reason: collision with root package name */
    public final f f23915z = new f(2);

    /* renamed from: z0  reason: collision with root package name */
    public boolean f23916z0;

    public l(int i10, i.a aVar, n nVar, boolean z10, float f10) {
        super(i10);
        this.f23903t = aVar;
        nVar.getClass();
        this.f23905u = nVar;
        this.f23907v = z10;
        this.f23909w = f10;
        g gVar = new g();
        this.A = gVar;
        this.B = new a0<>();
        this.C = new ArrayList<>();
        this.D = new MediaCodec.BufferInfo();
        this.O = 1.0f;
        this.P = 1.0f;
        this.N = -9223372036854775807L;
        this.E = new long[10];
        this.F = new long[10];
        this.G = new long[10];
        this.R0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        gVar.v(0);
        gVar.f86c.order(ByteOrder.nativeOrder());
        r0();
    }

    public static boolean z0(b0 b0Var) {
        Class<? extends p> cls = b0Var.M;
        return cls == null || r.class.equals(cls);
    }

    public final boolean A0(b0 b0Var) throws m {
        if (e0.f26436a < 23) {
            return true;
        }
        float f10 = this.P;
        b0[] b0VarArr = this.f27498g;
        b0VarArr.getClass();
        float X = X(f10, b0Var, b0VarArr);
        float f11 = this.f23884a0;
        if (f11 == X) {
            return true;
        }
        if (X == -1.0f) {
            P();
            return false;
        } else if (f11 == -1.0f && X <= this.f23909w) {
            return true;
        } else {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", X);
            this.Q.l(bundle);
            this.f23884a0 = X;
            return true;
        }
    }

    public final void B0() throws m {
        try {
            this.L.setMediaDrmSession(Z(this.K).f4343b);
            t0(this.K);
            this.B0 = 0;
            this.C0 = 0;
        } catch (MediaCryptoException e10) {
            throw A(e10, this.H, false);
        }
    }

    public void C() {
        this.H = null;
        this.R0 = -9223372036854775807L;
        this.S0 = -9223372036854775807L;
        this.T0 = 0;
        if (this.K == null && this.J == null) {
            U();
        } else {
            F();
        }
    }

    public final void C0(long j10) throws m {
        boolean z10;
        b0 f10;
        b0 e10 = this.B.e(j10);
        if (e10 == null && this.Z) {
            a0<b0> a0Var = this.B;
            synchronized (a0Var) {
                f10 = a0Var.f26423d == 0 ? null : a0Var.f();
            }
            e10 = f10;
        }
        if (e10 != null) {
            this.I = e10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.Z && this.I != null)) {
            h0(this.I, this.S);
            this.Z = false;
        }
    }

    public void E(long j10, boolean z10) throws m {
        int i10;
        this.I0 = false;
        this.J0 = false;
        this.L0 = false;
        if (this.f23910w0) {
            this.A.t();
            this.f23915z.t();
            this.f23912x0 = false;
        } else if (U()) {
            c0();
        }
        a0<b0> a0Var = this.B;
        synchronized (a0Var) {
            i10 = a0Var.f26423d;
        }
        if (i10 > 0) {
            this.K0 = true;
        }
        this.B.b();
        int i11 = this.T0;
        if (i11 != 0) {
            this.S0 = this.F[i11 - 1];
            this.R0 = this.E[i11 - 1];
            this.T0 = 0;
        }
    }

    public abstract void F();

    public void I(b0[] b0VarArr, long j10, long j11) throws m {
        boolean z10 = true;
        if (this.S0 == -9223372036854775807L) {
            if (this.R0 != -9223372036854775807L) {
                z10 = false;
            }
            v6.a.d(z10);
            this.R0 = j10;
            this.S0 = j11;
            return;
        }
        int i10 = this.T0;
        if (i10 == this.F.length) {
            StringBuilder a10 = android.support.v4.media.a.a("Too many stream changes, so dropping offset: ");
            a10.append(this.F[this.T0 - 1]);
            Log.w("MediaCodecRenderer", a10.toString());
        } else {
            this.T0 = i10 + 1;
        }
        long[] jArr = this.E;
        int i11 = this.T0;
        jArr[i11 - 1] = j10;
        this.F[i11 - 1] = j11;
        this.G[i11 - 1] = this.G0;
    }

    public final boolean K(long j10, long j11) throws m {
        v6.a.d(!this.J0);
        if (this.A.z()) {
            g gVar = this.A;
            if (!m0(j10, j11, (i) null, gVar.f86c, this.f23902s0, 0, gVar.f23871r, gVar.f88e, gVar.q(), this.A.r(), this.I)) {
                return false;
            }
            i0(this.A.f23870i);
            this.A.t();
        }
        if (this.I0) {
            this.J0 = true;
            return false;
        }
        if (this.f23912x0) {
            v6.a.d(this.A.y(this.f23915z));
            this.f23912x0 = false;
        }
        if (this.f23914y0) {
            if (this.A.z()) {
                return true;
            }
            O();
            this.f23914y0 = false;
            c0();
            if (!this.f23910w0) {
                return false;
            }
        }
        v6.a.d(!this.I0);
        t B2 = B();
        this.f23915z.t();
        while (true) {
            this.f23915z.t();
            int J2 = J(B2, this.f23915z, false);
            if (J2 != -5) {
                if (J2 == -4) {
                    if (!this.f23915z.r()) {
                        if (this.K0) {
                            b0 b0Var = this.H;
                            b0Var.getClass();
                            this.I = b0Var;
                            h0(b0Var, (MediaFormat) null);
                            this.K0 = false;
                        }
                        this.f23915z.w();
                        if (!this.A.y(this.f23915z)) {
                            this.f23912x0 = true;
                            break;
                        }
                    } else {
                        this.I0 = true;
                        break;
                    }
                } else if (J2 != -3) {
                    throw new IllegalStateException();
                }
            } else {
                g0(B2);
                break;
            }
        }
        if (this.A.z()) {
            this.A.w();
        }
        return this.A.z() || this.I0 || this.f23914y0;
    }

    public abstract a5.g L(k kVar, b0 b0Var, b0 b0Var2);

    public abstract void M(k kVar, i iVar, b0 b0Var, MediaCrypto mediaCrypto, float f10);

    public j N(Throwable th, k kVar) {
        return new j(th, kVar);
    }

    public final void O() {
        this.f23914y0 = false;
        this.A.t();
        this.f23915z.t();
        this.f23912x0 = false;
        this.f23910w0 = false;
    }

    public final void P() throws m {
        if (this.D0) {
            this.B0 = 1;
            this.C0 = 3;
            return;
        }
        o0();
        c0();
    }

    @TargetApi(23)
    public final boolean Q() throws m {
        if (this.D0) {
            this.B0 = 1;
            if (this.f23890g0 || this.f23892i0) {
                this.C0 = 3;
                return false;
            }
            this.C0 = 2;
        } else {
            B0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean R(long r20, long r22) throws x4.m {
        /*
            r19 = this;
            r15 = r19
            int r0 = r15.f23902s0
            r14 = 1
            r13 = 0
            if (r0 < 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 != 0) goto L_0x010f
            boolean r0 = r15.f23893j0
            if (r0 == 0) goto L_0x002a
            boolean r0 = r15.E0
            if (r0 == 0) goto L_0x002a
            p5.i r0 = r15.Q     // Catch:{ IllegalStateException -> 0x001e }
            android.media.MediaCodec$BufferInfo r1 = r15.D     // Catch:{ IllegalStateException -> 0x001e }
            int r0 = r0.b(r1)     // Catch:{ IllegalStateException -> 0x001e }
            goto L_0x0032
        L_0x001e:
            r19.l0()
            boolean r0 = r15.J0
            if (r0 == 0) goto L_0x0029
            r19.o0()
        L_0x0029:
            return r13
        L_0x002a:
            p5.i r0 = r15.Q
            android.media.MediaCodec$BufferInfo r1 = r15.D
            int r0 = r0.b(r1)
        L_0x0032:
            if (r0 >= 0) goto L_0x0077
            r1 = -2
            if (r0 != r1) goto L_0x0066
            r15.F0 = r14
            p5.i r0 = r15.Q
            android.media.MediaFormat r0 = r0.f()
            int r1 = r15.f23888e0
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0058
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0058
            r15.f23897n0 = r14
            goto L_0x0065
        L_0x0058:
            boolean r1 = r15.f23895l0
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)
        L_0x0061:
            r15.S = r0
            r15.Z = r14
        L_0x0065:
            return r14
        L_0x0066:
            boolean r0 = r15.f23898o0
            if (r0 == 0) goto L_0x0076
            boolean r0 = r15.I0
            if (r0 != 0) goto L_0x0073
            int r0 = r15.B0
            r1 = 2
            if (r0 != r1) goto L_0x0076
        L_0x0073:
            r19.l0()
        L_0x0076:
            return r13
        L_0x0077:
            boolean r1 = r15.f23897n0
            if (r1 == 0) goto L_0x0083
            r15.f23897n0 = r13
            p5.i r1 = r15.Q
            r1.d(r0, r13)
            return r14
        L_0x0083:
            android.media.MediaCodec$BufferInfo r1 = r15.D
            int r2 = r1.size
            if (r2 != 0) goto L_0x0093
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0093
            r19.l0()
            return r13
        L_0x0093:
            r15.f23902s0 = r0
            p5.i r1 = r15.Q
            java.nio.ByteBuffer r0 = r1.m(r0)
            r15.f23904t0 = r0
            if (r0 == 0) goto L_0x00b2
            android.media.MediaCodec$BufferInfo r1 = r15.D
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f23904t0
            android.media.MediaCodec$BufferInfo r1 = r15.D
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00b2:
            boolean r0 = r15.f23894k0
            if (r0 == 0) goto L_0x00d3
            android.media.MediaCodec$BufferInfo r0 = r15.D
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00d3
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00d3
            long r1 = r15.G0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d3
            r0.presentationTimeUs = r1
        L_0x00d3:
            android.media.MediaCodec$BufferInfo r0 = r15.D
            long r0 = r0.presentationTimeUs
            java.util.ArrayList<java.lang.Long> r2 = r15.C
            int r2 = r2.size()
            r3 = 0
        L_0x00de:
            if (r3 >= r2) goto L_0x00fa
            java.util.ArrayList<java.lang.Long> r4 = r15.C
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00f7
            java.util.ArrayList<java.lang.Long> r0 = r15.C
            r0.remove(r3)
            r0 = 1
            goto L_0x00fb
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x00de
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            r15.f23906u0 = r0
            long r0 = r15.H0
            android.media.MediaCodec$BufferInfo r2 = r15.D
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            r15.f23908v0 = r0
            r15.C0(r2)
        L_0x010f:
            boolean r0 = r15.f23893j0
            if (r0 == 0) goto L_0x0150
            boolean r0 = r15.E0
            if (r0 == 0) goto L_0x0150
            p5.i r5 = r15.Q     // Catch:{ IllegalStateException -> 0x0143 }
            java.nio.ByteBuffer r6 = r15.f23904t0     // Catch:{ IllegalStateException -> 0x0143 }
            int r7 = r15.f23902s0     // Catch:{ IllegalStateException -> 0x0143 }
            android.media.MediaCodec$BufferInfo r0 = r15.D     // Catch:{ IllegalStateException -> 0x0143 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0143 }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0143 }
            boolean r12 = r15.f23906u0     // Catch:{ IllegalStateException -> 0x0143 }
            boolean r3 = r15.f23908v0     // Catch:{ IllegalStateException -> 0x0143 }
            x4.b0 r4 = r15.I     // Catch:{ IllegalStateException -> 0x0143 }
            r0 = r19
            r1 = r20
            r16 = r3
            r17 = r4
            r3 = r22
            r18 = 0
            r13 = r16
            r16 = 1
            r14 = r17
            boolean r0 = r0.m0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0141 }
            goto L_0x0171
        L_0x0141:
            goto L_0x0145
        L_0x0143:
            r18 = 0
        L_0x0145:
            r19.l0()
            boolean r0 = r15.J0
            if (r0 == 0) goto L_0x014f
            r19.o0()
        L_0x014f:
            return r18
        L_0x0150:
            r16 = 1
            r18 = 0
            p5.i r5 = r15.Q
            java.nio.ByteBuffer r6 = r15.f23904t0
            int r7 = r15.f23902s0
            android.media.MediaCodec$BufferInfo r0 = r15.D
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f23906u0
            boolean r13 = r15.f23908v0
            x4.b0 r14 = r15.I
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.m0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0171:
            if (r0 == 0) goto L_0x0191
            android.media.MediaCodec$BufferInfo r0 = r15.D
            long r0 = r0.presentationTimeUs
            r15.i0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.D
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0184
            r14 = 1
            goto L_0x0185
        L_0x0184:
            r14 = 0
        L_0x0185:
            r0 = -1
            r15.f23902s0 = r0
            r0 = 0
            r15.f23904t0 = r0
            if (r14 != 0) goto L_0x018e
            return r16
        L_0x018e:
            r19.l0()
        L_0x0191:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.l.R(long, long):boolean");
    }

    public final boolean S() throws m {
        i iVar = this.Q;
        if (iVar == null || this.B0 == 2 || this.I0) {
            return false;
        }
        if (this.f23901r0 < 0) {
            int o10 = iVar.o();
            this.f23901r0 = o10;
            if (o10 < 0) {
                return false;
            }
            this.f23913y.f86c = this.Q.g(o10);
            this.f23913y.t();
        }
        if (this.B0 == 1) {
            if (!this.f23898o0) {
                this.E0 = true;
                this.Q.j(this.f23901r0, 0, 0, 0, 4);
                s0();
            }
            this.B0 = 2;
            return false;
        } else if (this.f23896m0) {
            this.f23896m0 = false;
            ByteBuffer byteBuffer = this.f23913y.f86c;
            byte[] bArr = U0;
            byteBuffer.put(bArr);
            this.Q.j(this.f23901r0, 0, bArr.length, 0, 0);
            s0();
            this.D0 = true;
            return true;
        } else {
            if (this.A0 == 1) {
                for (int i10 = 0; i10 < this.R.f27410v.size(); i10++) {
                    this.f23913y.f86c.put(this.R.f27410v.get(i10));
                }
                this.A0 = 2;
            }
            int position = this.f23913y.f86c.position();
            t B2 = B();
            int J2 = J(B2, this.f23913y, false);
            if (k()) {
                this.H0 = this.G0;
            }
            if (J2 == -3) {
                return false;
            }
            if (J2 == -5) {
                if (this.A0 == 2) {
                    this.f23913y.t();
                    this.A0 = 1;
                }
                g0(B2);
                return true;
            } else if (this.f23913y.r()) {
                if (this.A0 == 2) {
                    this.f23913y.t();
                    this.A0 = 1;
                }
                this.I0 = true;
                if (!this.D0) {
                    l0();
                    return false;
                }
                try {
                    if (!this.f23898o0) {
                        this.E0 = true;
                        this.Q.j(this.f23901r0, 0, 0, 0, 4);
                        s0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw A(e10, this.H, false);
                }
            } else if (this.D0 || this.f23913y.s()) {
                boolean x10 = this.f23913y.x();
                if (x10) {
                    b bVar = this.f23913y.f85b;
                    bVar.getClass();
                    if (position != 0) {
                        if (bVar.f65d == null) {
                            int[] iArr = new int[1];
                            bVar.f65d = iArr;
                            bVar.f70i.numBytesOfClearData = iArr;
                        }
                        int[] iArr2 = bVar.f65d;
                        iArr2[0] = iArr2[0] + position;
                    }
                }
                if (this.f23889f0 && !x10) {
                    ByteBuffer byteBuffer2 = this.f23913y.f86c;
                    byte[] bArr2 = u.f26498a;
                    int position2 = byteBuffer2.position();
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        int i13 = i11 + 1;
                        if (i13 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        byte b10 = byteBuffer2.get(i11) & 255;
                        if (i12 == 3) {
                            if (b10 == 1 && (byteBuffer2.get(i13) & 31) == 7) {
                                ByteBuffer duplicate = byteBuffer2.duplicate();
                                duplicate.position(i11 - 3);
                                duplicate.limit(position2);
                                byteBuffer2.position(0);
                                byteBuffer2.put(duplicate);
                                break;
                            }
                        } else if (b10 == 0) {
                            i12++;
                        }
                        if (b10 != 0) {
                            i12 = 0;
                        }
                        i11 = i13;
                    }
                    if (this.f23913y.f86c.position() == 0) {
                        return true;
                    }
                    this.f23889f0 = false;
                }
                f fVar = this.f23913y;
                long j10 = fVar.f88e;
                h hVar = this.f23899p0;
                if (hVar != null) {
                    b0 b0Var = this.H;
                    if (!hVar.f23875c) {
                        ByteBuffer byteBuffer3 = fVar.f86c;
                        byteBuffer3.getClass();
                        byte b11 = 0;
                        for (int i14 = 0; i14 < 4; i14++) {
                            b11 = (b11 << 8) | (byteBuffer3.get(i14) & 255);
                        }
                        int d10 = x.d(b11);
                        if (d10 == -1) {
                            hVar.f23875c = true;
                            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                            j10 = fVar.f88e;
                        } else {
                            long j11 = hVar.f23873a;
                            if (j11 == 0) {
                                long j12 = fVar.f88e;
                                hVar.f23874b = j12;
                                hVar.f23873a = ((long) d10) - 529;
                                j10 = j12;
                            } else {
                                hVar.f23873a = j11 + ((long) d10);
                                j10 = hVar.f23874b + ((1000000 * j11) / ((long) b0Var.H));
                            }
                        }
                    }
                }
                long j13 = j10;
                if (this.f23913y.q()) {
                    this.C.add(Long.valueOf(j13));
                }
                if (this.K0) {
                    this.B.a(j13, this.H);
                    this.K0 = false;
                }
                if (this.f23899p0 != null) {
                    this.G0 = Math.max(this.G0, this.f23913y.f88e);
                } else {
                    this.G0 = Math.max(this.G0, j13);
                }
                this.f23913y.w();
                if (this.f23913y.o()) {
                    a0(this.f23913y);
                }
                k0(this.f23913y);
                if (x10) {
                    try {
                        this.Q.i(this.f23901r0, 0, this.f23913y.f85b, j13, 0);
                    } catch (MediaCodec.CryptoException e11) {
                        throw A(e11, this.H, false);
                    }
                } else {
                    this.Q.j(this.f23901r0, 0, this.f23913y.f86c.limit(), j13, 0);
                }
                s0();
                this.D0 = true;
                this.A0 = 0;
                this.Q0.f76c++;
                return true;
            } else {
                this.f23913y.t();
                if (this.A0 == 2) {
                    this.A0 = 1;
                }
                return true;
            }
        }
    }

    public final void T() {
        try {
            this.Q.flush();
        } finally {
            q0();
        }
    }

    public boolean U() {
        if (this.Q == null) {
            return false;
        }
        if (this.C0 == 3 || this.f23890g0 || ((this.f23891h0 && !this.F0) || (this.f23892i0 && this.E0))) {
            o0();
            return true;
        }
        T();
        return false;
    }

    public final List<k> V(boolean z10) throws p.c {
        List<k> Y = Y(this.f23905u, this.H, z10);
        if (Y.isEmpty() && z10) {
            Y = Y(this.f23905u, this.H, false);
            if (!Y.isEmpty()) {
                StringBuilder a10 = android.support.v4.media.a.a("Drm session requires secure decoder for ");
                a10.append(this.H.f27408t);
                a10.append(", but no secure decoder available. Trying to proceed with ");
                a10.append(Y);
                a10.append(".");
                Log.w("MediaCodecRenderer", a10.toString());
            }
        }
        return Y;
    }

    public boolean W() {
        return false;
    }

    public abstract float X(float f10, b0 b0Var, b0[] b0VarArr);

    public abstract List<k> Y(n nVar, b0 b0Var, boolean z10) throws p.c;

    public final r Z(g gVar) throws m {
        c5.p c10 = gVar.c();
        if (c10 == null || (c10 instanceof r)) {
            return (r) c10;
        }
        throw A(new IllegalArgumentException("Expecting FrameworkMediaCrypto but found: " + c10), this.H, false);
    }

    public void a0(f fVar) throws m {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a0, code lost:
        if ("stvm8".equals(r2) == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b0, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r8) == false) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b0(p5.k r22, android.media.MediaCrypto r23) throws java.lang.Exception {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            java.lang.String r8 = r0.f23877a
            int r9 = v6.e0.f26436a
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 23
            if (r9 >= r10) goto L_0x0011
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001e
        L_0x0011:
            float r2 = r7.P
            x4.b0 r3 = r7.H
            x4.b0[] r4 = r7.f27498g
            r4.getClass()
            float r2 = r7.X(r2, r3, r4)
        L_0x001e:
            float r3 = r7.f23909w
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0027
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0028
        L_0x0027:
            r11 = r2
        L_0x0028:
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02ad }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ad }
            r2.<init>()     // Catch:{ Exception -> 0x02ad }
            java.lang.String r3 = "createCodec:"
            r2.append(r3)     // Catch:{ Exception -> 0x02ad }
            r2.append(r8)     // Catch:{ Exception -> 0x02ad }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02ad }
            androidx.appcompat.widget.p.a(r2)     // Catch:{ Exception -> 0x02ad }
            android.media.MediaCodec r15 = android.media.MediaCodec.createByCodecName(r8)     // Catch:{ Exception -> 0x02ad }
            boolean r2 = r7.M0     // Catch:{ Exception -> 0x02ad }
            r6 = 0
            r5 = 1
            if (r2 == 0) goto L_0x007a
            if (r9 < r10) goto L_0x007a
            int r2 = r7.f27492a     // Catch:{ Exception -> 0x02ad }
            boolean r3 = r7.N0     // Catch:{ Exception -> 0x02ad }
            boolean r4 = r7.O0     // Catch:{ Exception -> 0x02ad }
            p5.c r14 = new p5.c     // Catch:{ Exception -> 0x02ad }
            r14.<init>(r2, r6)     // Catch:{ Exception -> 0x02ad }
            p5.c r1 = new p5.c     // Catch:{ Exception -> 0x02ad }
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x02ad }
            p5.b r2 = new p5.b     // Catch:{ Exception -> 0x02ad }
            java.lang.Object r14 = r14.get()     // Catch:{ Exception -> 0x02ad }
            r16 = r14
            android.os.HandlerThread r16 = (android.os.HandlerThread) r16     // Catch:{ Exception -> 0x02ad }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x02ad }
            r17 = r1
            android.os.HandlerThread r17 = (android.os.HandlerThread) r17     // Catch:{ Exception -> 0x02ad }
            r20 = 0
            r14 = r2
            r18 = r3
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x02ad }
            r14 = r2
            goto L_0x0081
        L_0x007a:
            p5.i$a r1 = r7.f23903t     // Catch:{ Exception -> 0x02ad }
            p5.i r1 = r1.a(r15)     // Catch:{ Exception -> 0x02ad }
            r14 = r1
        L_0x0081:
            androidx.appcompat.widget.p.f()     // Catch:{ Exception -> 0x02aa }
            java.lang.String r1 = "configureCodec"
            androidx.appcompat.widget.p.a(r1)     // Catch:{ Exception -> 0x02aa }
            x4.b0 r4 = r7.H     // Catch:{ Exception -> 0x02aa }
            r1 = r21
            r2 = r22
            r3 = r14
            r15 = 1
            r5 = r23
            r16 = 0
            r6 = r11
            r1.M(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x02aa }
            androidx.appcompat.widget.p.f()     // Catch:{ Exception -> 0x02aa }
            java.lang.String r1 = "startCodec"
            androidx.appcompat.widget.p.a(r1)     // Catch:{ Exception -> 0x02aa }
            r14.start()     // Catch:{ Exception -> 0x02aa }
            androidx.appcompat.widget.p.f()     // Catch:{ Exception -> 0x02aa }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02aa }
            r7.Q = r14
            r7.f23887d0 = r0
            r7.f23884a0 = r11
            x4.b0 r1 = r7.H
            r7.R = r1
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r2 = 25
            if (r9 > r2) goto L_0x00e5
            boolean r5 = r1.equals(r8)
            if (r5 == 0) goto L_0x00e5
            java.lang.String r5 = v6.e0.f26439d
            java.lang.String r11 = "SM-T585"
            boolean r11 = r5.startsWith(r11)
            if (r11 != 0) goto L_0x00e3
            java.lang.String r11 = "SM-A510"
            boolean r11 = r5.startsWith(r11)
            if (r11 != 0) goto L_0x00e3
            java.lang.String r11 = "SM-A520"
            boolean r11 = r5.startsWith(r11)
            if (r11 != 0) goto L_0x00e3
            java.lang.String r11 = "SM-J700"
            boolean r5 = r5.startsWith(r11)
            if (r5 == 0) goto L_0x00e5
        L_0x00e3:
            r5 = 2
            goto L_0x011e
        L_0x00e5:
            r5 = 24
            if (r9 >= r5) goto L_0x011d
            java.lang.String r5 = "OMX.Nvidia.h264.decode"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00f9
            java.lang.String r5 = "OMX.Nvidia.h264.decode.secure"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x011d
        L_0x00f9:
            java.lang.String r5 = v6.e0.f26437b
            java.lang.String r11 = "flounder"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x011b
            java.lang.String r11 = "flounder_lte"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x011b
            java.lang.String r11 = "grouper"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x011b
            java.lang.String r11 = "tilapia"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x011d
        L_0x011b:
            r5 = 1
            goto L_0x011e
        L_0x011d:
            r5 = 0
        L_0x011e:
            r7.f23888e0 = r5
            x4.b0 r5 = r7.R
            r11 = 21
            if (r9 >= r11) goto L_0x0138
            java.util.List<byte[]> r5 = r5.f27410v
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0138
            java.lang.String r5 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0138
            r5 = 1
            goto L_0x0139
        L_0x0138:
            r5 = 0
        L_0x0139:
            r7.f23889f0 = r5
            r5 = 19
            r14 = 18
            if (r9 < r14) goto L_0x0170
            if (r9 != r14) goto L_0x0153
            java.lang.String r6 = "OMX.SEC.avc.dec"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0170
            java.lang.String r6 = "OMX.SEC.avc.dec.secure"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0170
        L_0x0153:
            if (r9 != r5) goto L_0x016e
            java.lang.String r6 = v6.e0.f26439d
            java.lang.String r2 = "SM-G800"
            boolean r2 = r6.startsWith(r2)
            if (r2 == 0) goto L_0x016e
            java.lang.String r2 = "OMX.Exynos.avc.dec"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0170
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            r6 = 0
            goto L_0x0171
        L_0x0170:
            r6 = 1
        L_0x0171:
            r7.f23890g0 = r6
            r1 = 29
            if (r9 != r1) goto L_0x0181
            java.lang.String r2 = "c2.android.aac.decoder"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0181
            r6 = 1
            goto L_0x0182
        L_0x0181:
            r6 = 0
        L_0x0182:
            r7.f23891h0 = r6
            if (r9 > r10) goto L_0x018e
            java.lang.String r2 = "OMX.google.vorbis.decoder"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x01b2
        L_0x018e:
            if (r9 > r5) goto L_0x01b4
            java.lang.String r2 = v6.e0.f26437b
            java.lang.String r5 = "hb2000"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x01a2
            java.lang.String r5 = "stvm8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x01b4
        L_0x01a2:
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x01b2
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x01b4
        L_0x01b2:
            r6 = 1
            goto L_0x01b5
        L_0x01b4:
            r6 = 0
        L_0x01b5:
            r7.f23892i0 = r6
            if (r9 != r11) goto L_0x01c3
            java.lang.String r2 = "OMX.google.aac.decoder"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x01c3
            r6 = 1
            goto L_0x01c4
        L_0x01c3:
            r6 = 0
        L_0x01c4:
            r7.f23893j0 = r6
            if (r9 >= r11) goto L_0x020e
            java.lang.String r2 = "OMX.SEC.mp3.dec"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x020e
            java.lang.String r2 = v6.e0.f26438c
            java.lang.String r5 = "samsung"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x020e
            java.lang.String r2 = v6.e0.f26437b
            java.lang.String r5 = "baffin"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x020c
            java.lang.String r5 = "grand"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x020c
            java.lang.String r5 = "fortuna"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x020c
            java.lang.String r5 = "gprimelte"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x020c
            java.lang.String r5 = "j2y18lte"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x020c
            java.lang.String r5 = "ms01"
            boolean r2 = r2.startsWith(r5)
            if (r2 == 0) goto L_0x020e
        L_0x020c:
            r6 = 1
            goto L_0x020f
        L_0x020e:
            r6 = 0
        L_0x020f:
            r7.f23894k0 = r6
            x4.b0 r2 = r7.R
            if (r9 > r14) goto L_0x0223
            int r2 = r2.G
            if (r2 != r15) goto L_0x0223
            java.lang.String r2 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0223
            r6 = 1
            goto L_0x0224
        L_0x0223:
            r6 = 0
        L_0x0224:
            r7.f23895l0 = r6
            java.lang.String r2 = r0.f23877a
            r5 = 25
            if (r9 > r5) goto L_0x0234
            java.lang.String r5 = "OMX.rk.video_decoder.avc"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x026a
        L_0x0234:
            r5 = 17
            if (r9 > r5) goto L_0x0240
            java.lang.String r5 = "OMX.allwinner.video.decoder.avc"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x026a
        L_0x0240:
            if (r9 > r1) goto L_0x0252
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x026a
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x026a
        L_0x0252:
            java.lang.String r1 = v6.e0.f26438c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x026c
            java.lang.String r1 = v6.e0.f26439d
            java.lang.String r2 = "AFTS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x026c
            boolean r1 = r0.f23882f
            if (r1 == 0) goto L_0x026c
        L_0x026a:
            r6 = 1
            goto L_0x026d
        L_0x026c:
            r6 = 0
        L_0x026d:
            if (r6 != 0) goto L_0x0278
            boolean r1 = r21.W()
            if (r1 == 0) goto L_0x0276
            goto L_0x0278
        L_0x0276:
            r6 = 0
            goto L_0x0279
        L_0x0278:
            r6 = 1
        L_0x0279:
            r7.f23898o0 = r6
            java.lang.String r0 = r0.f23877a
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x028c
            p5.h r0 = new p5.h
            r0.<init>()
            r7.f23899p0 = r0
        L_0x028c:
            int r0 = r7.f27496e
            r1 = 2
            if (r0 != r1) goto L_0x029a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r5
            r7.f23900q0 = r0
        L_0x029a:
            a5.d r0 = r7.Q0
            int r1 = r0.f74a
            int r1 = r1 + r15
            r0.f74a = r1
            long r5 = r3 - r12
            r1 = r21
            r2 = r8
            r1.e0(r2, r3, r5)
            return
        L_0x02aa:
            r0 = move-exception
            r1 = r14
            goto L_0x02af
        L_0x02ad:
            r0 = move-exception
            r1 = 0
        L_0x02af:
            if (r1 == 0) goto L_0x02b4
            r1.a()
        L_0x02b4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.l.b0(p5.k, android.media.MediaCrypto):void");
    }

    public final void c0() throws m {
        b0 b0Var;
        if (this.Q == null && !this.f23910w0 && (b0Var = this.H) != null) {
            if (this.K != null || !x0(b0Var)) {
                t0(this.K);
                String str = this.H.f27408t;
                g gVar = this.J;
                if (gVar != null) {
                    if (this.L == null) {
                        r Z2 = Z(gVar);
                        if (Z2 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(Z2.f4342a, Z2.f4343b);
                                this.L = mediaCrypto;
                                this.M = !Z2.f4344c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e10) {
                                throw A(e10, this.H, false);
                            }
                        } else if (this.J.f() == null) {
                            return;
                        }
                    }
                    if (r.f4341d) {
                        int state = this.J.getState();
                        if (state == 1) {
                            throw z(this.J.f(), this.H);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    d0(this.L, this.M);
                } catch (a e11) {
                    throw A(e11, this.H, false);
                }
            } else {
                b0 b0Var2 = this.H;
                O();
                String str2 = b0Var2.f27408t;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    g gVar2 = this.A;
                    gVar2.getClass();
                    v6.a.a(true);
                    gVar2.f23872s = 32;
                } else {
                    g gVar3 = this.A;
                    gVar3.getClass();
                    v6.a.a(true);
                    gVar3.f23872s = 1;
                }
                this.f23910w0 = true;
            }
        }
    }

    public boolean d() {
        return this.J0;
    }

    public final void d0(MediaCrypto mediaCrypto, boolean z10) throws a {
        boolean z11 = z10;
        if (this.f23885b0 == null) {
            try {
                List<k> V = V(z11);
                ArrayDeque<k> arrayDeque = new ArrayDeque<>();
                this.f23885b0 = arrayDeque;
                if (this.f23907v) {
                    arrayDeque.addAll(V);
                } else if (!V.isEmpty()) {
                    this.f23885b0.add(V.get(0));
                }
                this.f23886c0 = null;
            } catch (p.c e10) {
                throw new a(this.H, e10, z11, -49998);
            }
        }
        if (!this.f23885b0.isEmpty()) {
            while (this.Q == null) {
                k peekFirst = this.f23885b0.peekFirst();
                if (w0(peekFirst)) {
                    try {
                        b0(peekFirst, mediaCrypto);
                    } catch (Exception e11) {
                        Exception exc = e11;
                        v6.p.d("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, exc);
                        this.f23885b0.removeFirst();
                        b0 b0Var = this.H;
                        StringBuilder a10 = android.support.v4.media.a.a("Decoder init failed: ");
                        a10.append(peekFirst.f23877a);
                        a10.append(", ");
                        a10.append(b0Var);
                        a aVar = new a(a10.toString(), exc, b0Var.f27408t, z10, peekFirst, (e0.f26436a < 21 || !(exc instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) exc).getDiagnosticInfo(), (a) null);
                        a aVar2 = this.f23886c0;
                        if (aVar2 == null) {
                            this.f23886c0 = aVar;
                        } else {
                            this.f23886c0 = new a(aVar2.getMessage(), aVar2.getCause(), aVar2.f23917a, aVar2.f23918b, aVar2.f23919c, aVar2.f23920d, aVar);
                        }
                        if (this.f23885b0.isEmpty()) {
                            throw this.f23886c0;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f23885b0 = null;
            return;
        }
        throw new a(this.H, (Throwable) null, z11, -49999);
    }

    public abstract void e0(String str, long j10, long j11);

    public abstract void f0(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r3 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cf, code lost:
        if (Q() == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0101, code lost:
        if (Q() == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0115, code lost:
        if (Q() == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x012d, code lost:
        if (r0 == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x012f, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a5.g g0(m3.t r12) throws x4.m {
        /*
            r11 = this;
            r0 = 1
            r11.K0 = r0
            java.util.Map<k3.c, m3.m<?>> r1 = r12.f21666b
            r5 = r1
            x4.b0 r5 = (x4.b0) r5
            r5.getClass()
            java.lang.String r1 = r5.f27408t
            r2 = 0
            if (r1 == 0) goto L_0x014c
            java.util.Map<k3.c, m3.m<?>> r12 = r12.f21665a
            c5.g r12 = (c5.g) r12
            r11.u0(r12)
            r11.H = r5
            boolean r12 = r11.f23910w0
            r1 = 0
            if (r12 == 0) goto L_0x0021
            r11.f23914y0 = r0
            return r1
        L_0x0021:
            p5.i r12 = r11.Q
            if (r12 != 0) goto L_0x002b
            r11.f23885b0 = r1
            r11.c0()
            return r1
        L_0x002b:
            p5.k r1 = r11.f23887d0
            x4.b0 r4 = r11.R
            c5.g r3 = r11.J
            c5.g r6 = r11.K
            r7 = 23
            if (r3 != r6) goto L_0x0039
        L_0x0037:
            r3 = 0
            goto L_0x0087
        L_0x0039:
            if (r6 == 0) goto L_0x0086
            if (r3 != 0) goto L_0x003e
            goto L_0x0086
        L_0x003e:
            int r8 = v6.e0.f26436a
            if (r8 >= r7) goto L_0x0043
            goto L_0x0086
        L_0x0043:
            java.util.UUID r8 = x4.f.f27570e
            java.util.UUID r3 = r3.b()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0086
            java.util.UUID r3 = r6.b()
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0086
        L_0x005a:
            c5.r r3 = r11.Z(r6)
            if (r3 != 0) goto L_0x0061
            goto L_0x0086
        L_0x0061:
            boolean r6 = r1.f23882f
            if (r6 != 0) goto L_0x0037
            boolean r6 = r3.f4344c
            if (r6 == 0) goto L_0x006b
            r3 = 0
            goto L_0x0084
        L_0x006b:
            android.media.MediaCrypto r6 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x0083 }
            java.util.UUID r8 = r3.f4342a     // Catch:{ MediaCryptoException -> 0x0083 }
            byte[] r3 = r3.f4343b     // Catch:{ MediaCryptoException -> 0x0083 }
            r6.<init>(r8, r3)     // Catch:{ MediaCryptoException -> 0x0083 }
            java.lang.String r3 = r5.f27408t     // Catch:{ all -> 0x007e }
            boolean r3 = r6.requiresSecureDecoderComponent(r3)     // Catch:{ all -> 0x007e }
            r6.release()
            goto L_0x0084
        L_0x007e:
            r12 = move-exception
            r6.release()
            throw r12
        L_0x0083:
            r3 = 1
        L_0x0084:
            if (r3 == 0) goto L_0x0037
        L_0x0086:
            r3 = 1
        L_0x0087:
            if (r3 == 0) goto L_0x0098
            r11.P()
            a5.g r12 = new a5.g
            java.lang.String r3 = r1.f23877a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0098:
            c5.g r3 = r11.K
            c5.g r6 = r11.J
            if (r3 == r6) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            if (r3 == 0) goto L_0x00aa
            int r6 = v6.e0.f26436a
            if (r6 < r7) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r6 = 0
            goto L_0x00ab
        L_0x00aa:
            r6 = 1
        L_0x00ab:
            v6.a.d(r6)
            a5.g r6 = r11.L(r1, r4, r5)
            int r7 = r6.f95d
            r8 = 16
            r9 = 3
            r10 = 2
            if (r7 == 0) goto L_0x0131
            if (r7 == r0) goto L_0x0104
            if (r7 == r10) goto L_0x00d8
            if (r7 != r9) goto L_0x00d2
            boolean r0 = r11.A0(r5)
            if (r0 != 0) goto L_0x00c7
            goto L_0x010a
        L_0x00c7:
            r11.R = r5
            if (r3 == 0) goto L_0x0134
            boolean r0 = r11.Q()
            if (r0 != 0) goto L_0x0134
            goto L_0x012f
        L_0x00d2:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00d8:
            boolean r7 = r11.A0(r5)
            if (r7 != 0) goto L_0x00df
            goto L_0x010a
        L_0x00df:
            r11.f23916z0 = r0
            r11.A0 = r0
            int r7 = r11.f23888e0
            if (r7 == r10) goto L_0x00f7
            if (r7 != r0) goto L_0x00f6
            int r7 = r5.f27413y
            int r8 = r4.f27413y
            if (r7 != r8) goto L_0x00f6
            int r7 = r5.f27414z
            int r8 = r4.f27414z
            if (r7 != r8) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            r11.f23896m0 = r0
            r11.R = r5
            if (r3 == 0) goto L_0x0134
            boolean r0 = r11.Q()
            if (r0 != 0) goto L_0x0134
            goto L_0x012f
        L_0x0104:
            boolean r7 = r11.A0(r5)
            if (r7 != 0) goto L_0x010d
        L_0x010a:
            r7 = 16
            goto L_0x0135
        L_0x010d:
            r11.R = r5
            if (r3 == 0) goto L_0x0118
            boolean r0 = r11.Q()
            if (r0 != 0) goto L_0x0134
            goto L_0x012f
        L_0x0118:
            boolean r3 = r11.D0
            if (r3 == 0) goto L_0x012d
            r11.B0 = r0
            boolean r3 = r11.f23890g0
            if (r3 != 0) goto L_0x012a
            boolean r3 = r11.f23892i0
            if (r3 == 0) goto L_0x0127
            goto L_0x012a
        L_0x0127:
            r11.C0 = r0
            goto L_0x012d
        L_0x012a:
            r11.C0 = r9
            r0 = 0
        L_0x012d:
            if (r0 != 0) goto L_0x0134
        L_0x012f:
            r7 = 2
            goto L_0x0135
        L_0x0131:
            r11.P()
        L_0x0134:
            r7 = 0
        L_0x0135:
            int r0 = r6.f95d
            if (r0 == 0) goto L_0x014b
            p5.i r0 = r11.Q
            if (r0 != r12) goto L_0x0141
            int r12 = r11.C0
            if (r12 != r9) goto L_0x014b
        L_0x0141:
            a5.g r12 = new a5.g
            java.lang.String r3 = r1.f23877a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x014b:
            return r6
        L_0x014c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            x4.m r12 = r11.A(r12, r5, r2)
            goto L_0x0157
        L_0x0156:
            throw r12
        L_0x0157:
            goto L_0x0156
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.l.g0(m3.t):a5.g");
    }

    public final int h(b0 b0Var) throws m {
        try {
            return y0(this.f23905u, b0Var);
        } catch (p.c e10) {
            throw z(e10, b0Var);
        }
    }

    public abstract void h0(b0 b0Var, MediaFormat mediaFormat) throws m;

    public void i0(long j10) {
        while (true) {
            int i10 = this.T0;
            if (i10 != 0 && j10 >= this.G[0]) {
                long[] jArr = this.E;
                this.R0 = jArr[0];
                this.S0 = this.F[0];
                int i11 = i10 - 1;
                this.T0 = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
                long[] jArr2 = this.F;
                System.arraycopy(jArr2, 1, jArr2, 0, this.T0);
                long[] jArr3 = this.G;
                System.arraycopy(jArr3, 1, jArr3, 0, this.T0);
                j0();
            } else {
                return;
            }
        }
    }

    public boolean isReady() {
        boolean z10;
        if (this.H == null) {
            return false;
        }
        if (k()) {
            z10 = this.f27501r;
        } else {
            z5.b0 b0Var = this.f27497f;
            b0Var.getClass();
            z10 = b0Var.isReady();
        }
        if (!z10) {
            if ((this.f23902s0 >= 0) || (this.f23900q0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f23900q0)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public abstract void j0();

    public abstract void k0(f fVar) throws m;

    public final int l() {
        return 8;
    }

    @TargetApi(23)
    public final void l0() throws m {
        int i10 = this.C0;
        if (i10 == 1) {
            T();
        } else if (i10 == 2) {
            T();
            B0();
        } else if (i10 != 3) {
            this.J0 = true;
            p0();
        } else {
            o0();
            c0();
        }
    }

    public void m(long j10, long j11) throws m {
        boolean z10 = false;
        if (this.L0) {
            this.L0 = false;
            l0();
        }
        m mVar = this.P0;
        if (mVar == null) {
            boolean z11 = true;
            try {
                if (this.J0) {
                    p0();
                } else if (this.H != null || n0(true)) {
                    c0();
                    if (this.f23910w0) {
                        androidx.appcompat.widget.p.a("bypassRender");
                        while (K(j10, j11)) {
                        }
                        androidx.appcompat.widget.p.f();
                    } else if (this.Q != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        androidx.appcompat.widget.p.a("drainAndFeed");
                        while (R(j10, j11) && v0(elapsedRealtime)) {
                        }
                        while (S() && v0(elapsedRealtime)) {
                        }
                        androidx.appcompat.widget.p.f();
                    } else {
                        d dVar = this.Q0;
                        int i10 = dVar.f77d;
                        z5.b0 b0Var = this.f27497f;
                        b0Var.getClass();
                        dVar.f77d = i10 + b0Var.l(j10 - this.f27499h);
                        n0(false);
                    }
                    synchronized (this.Q0) {
                    }
                }
            } catch (IllegalStateException e10) {
                if (e0.f26436a < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e10.getStackTrace();
                    if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        z10 = true;
                    }
                    z11 = z10;
                }
                if (z11) {
                    throw z(N(e10, this.f23887d0), this.H);
                }
                throw e10;
            }
        } else {
            this.P0 = null;
            throw mVar;
        }
    }

    public abstract boolean m0(long j10, long j11, i iVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b0 b0Var) throws m;

    public final boolean n0(boolean z10) throws m {
        t B2 = B();
        this.f23911x.t();
        int J2 = J(B2, this.f23911x, z10);
        if (J2 == -5) {
            g0(B2);
            return true;
        } else if (J2 != -4 || !this.f23911x.r()) {
            return false;
        } else {
            this.I0 = true;
            l0();
            return false;
        }
    }

    public void o0() {
        try {
            i iVar = this.Q;
            if (iVar != null) {
                iVar.a();
                this.Q0.f75b++;
                f0(this.f23887d0.f23877a);
            }
            this.Q = null;
            try {
                MediaCrypto mediaCrypto = this.L;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.L = null;
                t0((g) null);
                r0();
            }
        } catch (Throwable th) {
            this.Q = null;
            MediaCrypto mediaCrypto2 = this.L;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.L = null;
            t0((g) null);
            r0();
        }
    }

    public void p0() throws m {
    }

    public void q0() {
        s0();
        this.f23902s0 = -1;
        this.f23904t0 = null;
        this.f23900q0 = -9223372036854775807L;
        this.E0 = false;
        this.D0 = false;
        this.f23896m0 = false;
        this.f23897n0 = false;
        this.f23906u0 = false;
        this.f23908v0 = false;
        this.C.clear();
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        h hVar = this.f23899p0;
        if (hVar != null) {
            hVar.f23873a = 0;
            hVar.f23874b = 0;
            hVar.f23875c = false;
        }
        this.B0 = 0;
        this.C0 = 0;
        this.A0 = this.f23916z0 ? 1 : 0;
    }

    public void r0() {
        q0();
        this.P0 = null;
        this.f23899p0 = null;
        this.f23885b0 = null;
        this.f23887d0 = null;
        this.R = null;
        this.S = null;
        this.Z = false;
        this.F0 = false;
        this.f23884a0 = -1.0f;
        this.f23888e0 = 0;
        this.f23889f0 = false;
        this.f23890g0 = false;
        this.f23891h0 = false;
        this.f23892i0 = false;
        this.f23893j0 = false;
        this.f23894k0 = false;
        this.f23895l0 = false;
        this.f23898o0 = false;
        this.f23916z0 = false;
        this.A0 = 0;
        this.M = false;
    }

    public final void s0() {
        this.f23901r0 = -1;
        this.f23913y.f86c = null;
    }

    public final void t0(g gVar) {
        g gVar2 = this.J;
        if (gVar2 != gVar) {
            if (gVar != null) {
                gVar.d((j.a) null);
            }
            if (gVar2 != null) {
                gVar2.e((j.a) null);
            }
        }
        this.J = gVar;
    }

    public final void u0(g gVar) {
        g gVar2 = this.K;
        if (gVar2 != gVar) {
            if (gVar != null) {
                gVar.d((j.a) null);
            }
            if (gVar2 != null) {
                gVar2.e((j.a) null);
            }
        }
        this.K = gVar;
    }

    public final boolean v0(long j10) {
        return this.N == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.N;
    }

    public boolean w0(k kVar) {
        return true;
    }

    public boolean x0(b0 b0Var) {
        return false;
    }

    public void y(float f10, float f11) throws m {
        this.O = f10;
        this.P = f11;
        if (this.Q != null && this.C0 != 3 && this.f27496e != 0) {
            A0(this.R);
        }
    }

    public abstract int y0(n nVar, b0 b0Var) throws p.c;

    /* compiled from: MediaCodecRenderer */
    public static class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f23917a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f23918b;

        /* renamed from: c  reason: collision with root package name */
        public final k f23919c;

        /* renamed from: d  reason: collision with root package name */
        public final String f23920d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(x4.b0 r11, java.lang.Throwable r12, boolean r13, int r14) {
            /*
                r10 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Decoder init failed: ["
                r0.append(r1)
                r0.append(r14)
                java.lang.String r1 = "], "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r11.f27408t
                if (r14 >= 0) goto L_0x0020
                java.lang.String r11 = "neg_"
                goto L_0x0022
            L_0x0020:
                java.lang.String r11 = ""
            L_0x0022:
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                java.lang.StringBuilder r11 = t.f.a(r0, r11)
                int r14 = java.lang.Math.abs(r14)
                r11.append(r14)
                java.lang.String r8 = r11.toString()
                r9 = 0
                r7 = 0
                r2 = r10
                r4 = r12
                r6 = r13
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.l.a.<init>(x4.b0, java.lang.Throwable, boolean, int):void");
        }

        public a(String str, Throwable th, String str2, boolean z10, k kVar, String str3, a aVar) {
            super(str, th);
            this.f23917a = str2;
            this.f23918b = z10;
            this.f23919c = kVar;
            this.f23920d = str3;
        }
    }
}
