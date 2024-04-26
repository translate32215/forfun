package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import e8.bc0;
import e8.be0;
import e8.dc0;
import e8.ee0;
import e8.eg0;
import e8.mc0;
import e8.nc0;
import e8.rb0;
import e8.rc0;
import e8.sc0;
import e8.tc0;
import e8.vc0;
import e8.y10;
import e8.yc0;
import e8.zf0;
import f7.j0;
import java.nio.ByteBuffer;
import r7.m;
import t1.c;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bt extends rt implements zf0 {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f6054a0 = 0;
    public final c T;
    public final zs U = new zs(new ys[0], new y10(this));
    public boolean V;
    public int W;
    public int X;
    public long Y;
    public boolean Z;

    public bt(st stVar, Handler handler, mc0 mc0) {
        super(1, stVar, true);
        this.T = new c(handler, mc0);
    }

    public final void A(MediaCodec mediaCodec, MediaFormat mediaFormat) throws rb0 {
        int[] iArr;
        int i10;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.V || integer != 6 || (i10 = this.X) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i10];
            for (int i11 = 0; i11 < this.X; i11++) {
                iArr[i11] = i11;
            }
        }
        try {
            this.U.d("audio/raw", integer, integer2, this.W, iArr);
        } catch (tc0 e10) {
            throw rb0.b(e10, this.f8145c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r1 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r8 == false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int B(com.google.android.gms.internal.ads.st r8, e8.bc0 r9) throws e8.ee0 {
        /*
            r7 = this;
            java.lang.String r0 = r9.f13920f
            boolean r1 = p.a.e(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = e8.eg0.f14479a
            r3 = 21
            if (r1 < r3) goto L_0x0013
            r4 = 16
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            e8.be0 r8 = r8.zzc(r0, r2)
            r0 = 1
            if (r8 != 0) goto L_0x001c
            return r0
        L_0x001c:
            if (r1 < r3) goto L_0x0095
            int r1 = r9.A
            r3 = -1
            if (r1 == r3) goto L_0x005a
            android.media.MediaCodecInfo$CodecCapabilities r5 = r8.f13993f
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "sampleRate.caps"
            r8.c(r1)
        L_0x002c:
            r1 = 0
            goto L_0x0058
        L_0x002e:
            android.media.MediaCodecInfo$AudioCapabilities r5 = r5.getAudioCapabilities()
            if (r5 != 0) goto L_0x003a
            java.lang.String r1 = "sampleRate.aCaps"
            r8.c(r1)
            goto L_0x002c
        L_0x003a:
            boolean r5 = r5.isSampleRateSupported(r1)
            if (r5 != 0) goto L_0x0057
            r5 = 31
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "sampleRate.support, "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r8.c(r1)
            goto L_0x002c
        L_0x0057:
            r1 = 1
        L_0x0058:
            if (r1 == 0) goto L_0x0096
        L_0x005a:
            int r9 = r9.f13932z
            if (r9 == r3) goto L_0x0095
            android.media.MediaCodecInfo$CodecCapabilities r1 = r8.f13993f
            if (r1 != 0) goto L_0x0069
            java.lang.String r9 = "channelCount.caps"
            r8.c(r9)
        L_0x0067:
            r8 = 0
            goto L_0x0093
        L_0x0069:
            android.media.MediaCodecInfo$AudioCapabilities r1 = r1.getAudioCapabilities()
            if (r1 != 0) goto L_0x0075
            java.lang.String r9 = "channelCount.aCaps"
            r8.c(r9)
            goto L_0x0067
        L_0x0075:
            int r1 = r1.getMaxInputChannelCount()
            if (r1 >= r9) goto L_0x0092
            r1 = 33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "channelCount.support, "
            r3.append(r1)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r8.c(r9)
            goto L_0x0067
        L_0x0092:
            r8 = 1
        L_0x0093:
            if (r8 == 0) goto L_0x0096
        L_0x0095:
            r2 = 1
        L_0x0096:
            if (r2 == 0) goto L_0x009a
            r8 = 3
            goto L_0x009b
        L_0x009a:
            r8 = 2
        L_0x009b:
            r9 = r4 | 4
            r8 = r8 | r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bt.B(com.google.android.gms.internal.ads.st, e8.bc0):int");
    }

    public final be0 C(st stVar, bc0 bc0, boolean z10) throws ee0 {
        return stVar.zzc(bc0.f13920f, z10);
    }

    public final void E(be0 be0, MediaCodec mediaCodec, bc0 bc0, MediaCrypto mediaCrypto) {
        boolean z10;
        String str = be0.f13988a;
        if (eg0.f14479a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(eg0.f14481c)) {
            String str2 = eg0.f14480b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
                this.V = z10;
                mediaCodec.configure(bc0.k(), (Surface) null, (MediaCrypto) null, 0);
            }
        }
        z10 = false;
        this.V = z10;
        mediaCodec.configure(bc0.k(), (Surface) null, (MediaCrypto) null, 0);
    }

    public final boolean F(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws rb0 {
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.R.f17602e++;
            zs zsVar = this.U;
            if (zsVar.J == 1) {
                zsVar.J = 2;
            }
            return true;
        }
        try {
            if (!this.U.f(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.R.f17601d++;
            return true;
        } catch (sc0 | vc0 e10) {
            throw rb0.b(e10, this.f8145c);
        }
    }

    public final void I(String str, long j10, long j11) {
        c cVar = this.T;
        if (((mc0) cVar.f25351c) != null) {
            ((Handler) cVar.f25350b).post(new nc0(cVar, str, j10, j11));
        }
    }

    public final void J(bc0 bc0) throws rb0 {
        super.J(bc0);
        c cVar = this.T;
        if (((mc0) cVar.f25351c) != null) {
            ((Handler) cVar.f25350b).post(new j0(cVar, bc0));
        }
        this.W = "audio/raw".equals(bc0.f13920f) ? bc0.B : 2;
        this.X = bc0.f13932z;
    }

    public final void K() throws rb0 {
        try {
            zs zsVar = this.U;
            if (zsVar.V) {
                return;
            }
            if (zsVar.a()) {
                if (zsVar.l()) {
                    rc0 rc0 = zsVar.f8739g;
                    long o10 = zsVar.o();
                    rc0.f16269h = rc0.e();
                    rc0.f16268g = SystemClock.elapsedRealtime() * 1000;
                    rc0.f16270i = o10;
                    rc0.f16262a.stop();
                    zsVar.V = true;
                }
            }
        } catch (vc0 e10) {
            throw rb0.b(e10, this.f8145c);
        }
    }

    public final dc0 a() {
        return this.U.f8751s;
    }

    public final dc0 b(dc0 dc0) {
        return this.U.e(dc0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0162 A[Catch:{ Exception -> 0x017d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d() {
        /*
            r21 = this;
            r0 = r21
            com.google.android.gms.internal.ads.zs r1 = r0.U
            boolean r2 = r21.f()
            boolean r3 = r1.a()
            r4 = 1
            if (r3 == 0) goto L_0x0015
            int r3 = r1.J
            if (r3 == 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x001c
            r6 = -9223372036854775808
            goto L_0x0241
        L_0x001c:
            android.media.AudioTrack r3 = r1.f8741i
            int r3 = r3.getPlayState()
            r8 = 3
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r3 != r8) goto L_0x0181
            e8.rc0 r3 = r1.f8739g
            long r13 = r3.e()
            long r13 = r13 * r9
            int r3 = r3.f16264c
            long r6 = (long) r3
            long r13 = r13 / r6
            r6 = 0
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0181
            long r15 = java.lang.System.nanoTime()
            long r9 = r15 / r11
            long r11 = r1.f8757y
            long r11 = r9 - r11
            r17 = 30000(0x7530, double:1.4822E-319)
            int r3 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r3 < 0) goto L_0x007c
            long[] r3 = r1.f8738f
            int r8 = r1.f8754v
            long r11 = r13 - r9
            r3[r8] = r11
            int r8 = r8 + r4
            r3 = 10
            int r8 = r8 % r3
            r1.f8754v = r8
            int r8 = r1.f8755w
            if (r8 >= r3) goto L_0x0061
            int r8 = r8 + r4
            r1.f8755w = r8
        L_0x0061:
            r1.f8757y = r9
            r1.f8756x = r6
            r3 = 0
        L_0x0066:
            int r4 = r1.f8755w
            if (r3 >= r4) goto L_0x007c
            long r11 = r1.f8756x
            long[] r8 = r1.f8738f
            r17 = r8[r3]
            long r6 = (long) r4
            long r17 = r17 / r6
            long r6 = r17 + r11
            r1.f8756x = r6
            int r3 = r3 + 1
            r6 = 0
            goto L_0x0066
        L_0x007c:
            boolean r3 = r1.p()
            if (r3 != 0) goto L_0x0181
            long r3 = r1.A
            long r3 = r9 - r3
            r6 = 500000(0x7a120, double:2.47033E-318)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0181
            e8.rc0 r3 = r1.f8739g
            boolean r3 = r3.b()
            r1.f8758z = r3
            java.lang.String r4 = "AudioTrack"
            if (r3 == 0) goto L_0x0133
            e8.rc0 r3 = r1.f8739g
            long r11 = r3.c()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r15
            e8.rc0 r3 = r1.f8739g
            long r6 = r3.d()
            r19 = r6
            long r5 = r1.L
            int r7 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b5
            r3 = 0
            r1.f8758z = r3
            goto L_0x0133
        L_0x00b5:
            long r5 = r11 - r9
            long r5 = java.lang.Math.abs(r5)
            java.lang.String r7 = ", "
            r17 = 5000000(0x4c4b40, double:2.470328E-317)
            int r8 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f3
            r5 = 136(0x88, float:1.9E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Spurious audio timestamp (system clock mismatch): "
            r6.append(r5)
            r5 = r4
            r3 = r19
            r6.append(r3)
            r6.append(r7)
            r6.append(r11)
            r6.append(r7)
            r6.append(r9)
            r6.append(r7)
            r6.append(r13)
            java.lang.String r3 = r6.toString()
            android.util.Log.w(r5, r3)
            r3 = 0
            r1.f8758z = r3
            goto L_0x0134
        L_0x00f3:
            r5 = r4
            r3 = r19
            long r19 = r1.i(r3)
            long r19 = r19 - r13
            long r19 = java.lang.Math.abs(r19)
            r17 = 5000000(0x4c4b40, double:2.470328E-317)
            int r8 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x0134
            r8 = 138(0x8a, float:1.93E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            java.lang.String r8 = "Spurious audio timestamp (frame position mismatch): "
            r6.append(r8)
            r6.append(r3)
            r6.append(r7)
            r6.append(r11)
            r6.append(r7)
            r6.append(r9)
            r6.append(r7)
            r6.append(r13)
            java.lang.String r3 = r6.toString()
            android.util.Log.w(r5, r3)
            r3 = 0
            r1.f8758z = r3
            goto L_0x0134
        L_0x0133:
            r5 = r4
        L_0x0134:
            java.lang.reflect.Method r4 = r1.B
            if (r4 == 0) goto L_0x017f
            boolean r6 = r1.f8747o
            if (r6 != 0) goto L_0x017f
            r6 = 0
            android.media.AudioTrack r7 = r1.f8741i     // Catch:{ Exception -> 0x017d }
            java.lang.Object r4 = r4.invoke(r7, r6)     // Catch:{ Exception -> 0x017d }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x017d }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x017d }
            long r7 = (long) r4     // Catch:{ Exception -> 0x017d }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r11
            long r11 = r1.f8749q     // Catch:{ Exception -> 0x017d }
            long r7 = r7 - r11
            r1.M = r7     // Catch:{ Exception -> 0x017d }
            r11 = 0
            long r7 = java.lang.Math.max(r7, r11)     // Catch:{ Exception -> 0x017d }
            r1.M = r7     // Catch:{ Exception -> 0x017d }
            r11 = 5000000(0x4c4b40, double:2.470328E-317)
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x017f
            r4 = 61
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017d }
            r11.<init>(r4)     // Catch:{ Exception -> 0x017d }
            java.lang.String r4 = "Ignoring impossibly large audio latency: "
            r11.append(r4)     // Catch:{ Exception -> 0x017d }
            r11.append(r7)     // Catch:{ Exception -> 0x017d }
            java.lang.String r4 = r11.toString()     // Catch:{ Exception -> 0x017d }
            android.util.Log.w(r5, r4)     // Catch:{ Exception -> 0x017d }
            r4 = 0
            r1.M = r4     // Catch:{ Exception -> 0x017d }
            goto L_0x017f
        L_0x017d:
            r1.B = r6
        L_0x017f:
            r1.A = r9
        L_0x0181:
            long r4 = java.lang.System.nanoTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            boolean r8 = r1.f8758z
            if (r8 == 0) goto L_0x01a4
            e8.rc0 r2 = r1.f8739g
            long r8 = r2.c()
            long r8 = r8 / r6
            long r4 = r4 - r8
            long r4 = r1.j(r4)
            e8.rc0 r2 = r1.f8739g
            long r6 = r2.d()
            long r6 = r6 + r4
            long r4 = r1.i(r6)
            goto L_0x01c1
        L_0x01a4:
            int r6 = r1.f8755w
            if (r6 != 0) goto L_0x01b9
            e8.rc0 r4 = r1.f8739g
            long r5 = r4.e()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r7
            int r4 = r4.f16264c
            long r7 = (long) r4
            long r5 = r5 / r7
            r4 = r5
            goto L_0x01bc
        L_0x01b9:
            long r6 = r1.f8756x
            long r4 = r4 + r6
        L_0x01bc:
            if (r2 != 0) goto L_0x01c1
            long r6 = r1.M
            long r4 = r4 - r6
        L_0x01c1:
            long r6 = r1.K
        L_0x01c3:
            java.util.LinkedList<e8.uc0> r2 = r1.f8740h
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01f1
            java.util.LinkedList<e8.uc0> r2 = r1.f8740h
            java.lang.Object r2 = r2.getFirst()
            e8.uc0 r2 = (e8.uc0) r2
            long r8 = r2.f16874c
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x01f1
            java.util.LinkedList<e8.uc0> r2 = r1.f8740h
            java.lang.Object r2 = r2.remove()
            e8.uc0 r2 = (e8.uc0) r2
            e8.dc0 r8 = r2.f16872a
            r1.f8751s = r8
            long r8 = r2.f16874c
            r1.f8753u = r8
            long r8 = r2.f16873b
            long r10 = r1.K
            long r8 = r8 - r10
            r1.f8752t = r8
            goto L_0x01c3
        L_0x01f1:
            e8.dc0 r2 = r1.f8751s
            float r2 = r2.f14250a
            r8 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0202
            long r8 = r1.f8752t
            long r4 = r4 + r8
            long r1 = r1.f8753u
            long r4 = r4 - r1
            goto L_0x0240
        L_0x0202:
            java.util.LinkedList<e8.uc0> r2 = r1.f8740h
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0224
            com.google.android.gms.internal.ads.dt r2 = r1.f8734b
            long r12 = r2.f6250k
            r8 = 1024(0x400, double:5.06E-321)
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0224
            long r10 = r1.f8752t
            long r8 = r1.f8753u
            long r8 = r4 - r8
            long r1 = r2.f6249j
            r4 = r10
            r10 = r1
            long r1 = e8.eg0.b(r8, r10, r12)
            long r4 = r4 + r1
            goto L_0x0240
        L_0x0224:
            long r8 = r1.f8752t
            e8.dc0 r2 = r1.f8751s
            float r2 = r2.f14250a
            double r10 = (double) r2
            long r1 = r1.f8753u
            long r4 = r4 - r1
            double r1 = (double) r4
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r10)
            java.lang.Double.isNaN(r1)
            double r10 = r10 * r1
            long r1 = (long) r10
            long r4 = r1 + r8
        L_0x0240:
            long r6 = r6 + r4
        L_0x0241:
            r1 = -9223372036854775808
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0257
            boolean r1 = r0.Z
            if (r1 == 0) goto L_0x024c
            goto L_0x0252
        L_0x024c:
            long r1 = r0.Y
            long r6 = java.lang.Math.max(r1, r6)
        L_0x0252:
            r0.Y = r6
            r1 = 0
            r0.Z = r1
        L_0x0257:
            long r1 = r0.Y
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bt.d():long");
    }

    public final boolean f() {
        if (this.O) {
            zs zsVar = this.U;
            if (!zsVar.a() || (zsVar.V && !zsVar.m())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isReady() {
        return this.U.m() || super.isReady();
    }

    public final void m(int i10, Object obj) throws rb0 {
        if (i10 == 2) {
            zs zsVar = this.U;
            float floatValue = ((Float) obj).floatValue();
            if (zsVar.N != floatValue) {
                zsVar.N = floatValue;
                zsVar.n();
            }
        } else if (i10 == 3) {
            int intValue = ((Integer) obj).intValue();
            zs zsVar2 = this.U;
            if (zsVar2.f8746n != intValue) {
                zsVar2.f8746n = intValue;
                zsVar2.c();
                zsVar2.X = 0;
            }
        }
    }

    public final zf0 n() {
        return this;
    }

    public final void t() {
        this.U.b();
    }

    public final void u() {
        zs zsVar = this.U;
        zsVar.W = false;
        if (zsVar.a()) {
            zsVar.f8756x = 0;
            zsVar.f8755w = 0;
            zsVar.f8754v = 0;
            zsVar.f8757y = 0;
            zsVar.f8758z = false;
            zsVar.A = 0;
            rc0 rc0 = zsVar.f8739g;
            if (rc0.f16268g == -9223372036854775807L) {
                rc0.f16262a.pause();
            }
        }
    }

    public final void w(long j10, boolean z10) throws rb0 {
        super.w(j10, z10);
        this.U.c();
        this.Y = j10;
        this.Z = true;
    }

    public final void y(boolean z10) throws rb0 {
        yc0 yc0 = new yc0();
        this.R = yc0;
        c cVar = this.T;
        if (((mc0) cVar.f25351c) != null) {
            ((Handler) cVar.f25350b).post(new m(cVar, yc0));
        }
        this.f8144b.getClass();
        this.U.getClass();
    }

    /* JADX INFO: finally extract failed */
    public final void z() {
        try {
            zs zsVar = this.U;
            zsVar.c();
            for (ys b10 : zsVar.f8735c) {
                b10.b();
            }
            zsVar.X = 0;
            zsVar.W = false;
            try {
                super.z();
                synchronized (this.R) {
                }
                this.T.l(this.R);
            } catch (Throwable th) {
                synchronized (this.R) {
                    this.T.l(this.R);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            synchronized (this.R) {
                this.T.l(this.R);
                throw th2;
            }
        }
    }
}
