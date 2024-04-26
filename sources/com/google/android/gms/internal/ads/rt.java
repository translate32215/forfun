package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import e8.ad0;
import e8.bc0;
import e8.be0;
import e8.cd0;
import e8.ee0;
import e8.eg0;
import e8.gz;
import e8.oe0;
import e8.rb0;
import e8.yc0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.a;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class rt extends ss {
    public static final byte[] S;
    public boolean A;
    public boolean B;
    public ByteBuffer[] C;
    public ByteBuffer[] D;
    public long E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public yc0 R;

    /* renamed from: i  reason: collision with root package name */
    public final st f8052i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8053j;

    /* renamed from: k  reason: collision with root package name */
    public final ad0 f8054k;

    /* renamed from: l  reason: collision with root package name */
    public final ad0 f8055l;

    /* renamed from: m  reason: collision with root package name */
    public final gz f8056m;

    /* renamed from: n  reason: collision with root package name */
    public final List<Long> f8057n;

    /* renamed from: o  reason: collision with root package name */
    public final MediaCodec.BufferInfo f8058o;

    /* renamed from: p  reason: collision with root package name */
    public bc0 f8059p;

    /* renamed from: q  reason: collision with root package name */
    public cd0<Object> f8060q;

    /* renamed from: r  reason: collision with root package name */
    public MediaCodec f8061r;

    /* renamed from: s  reason: collision with root package name */
    public be0 f8062s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8063t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8064u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8065v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8066w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8067x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8068y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8069z;

    static {
        int i10 = eg0.f14479a;
        byte[] bArr = new byte[38];
        for (int i11 = 0; i11 < 38; i11++) {
            int i12 = i11 << 1;
            bArr[i11] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12), 16) << 4));
        }
        S = bArr;
    }

    public rt(int i10, st stVar, boolean z10) {
        super(i10);
        a.c(eg0.f14479a >= 16);
        stVar.getClass();
        this.f8052i = stVar;
        this.f8053j = z10;
        this.f8054k = new ad0();
        this.f8055l = new ad0();
        this.f8056m = new gz(10);
        this.f8057n = new ArrayList();
        this.f8058o = new MediaCodec.BufferInfo();
        this.J = 0;
        this.K = 0;
    }

    public abstract void A(MediaCodec mediaCodec, MediaFormat mediaFormat) throws rb0;

    public abstract int B(st stVar, bc0 bc0) throws ee0;

    public be0 C(st stVar, bc0 bc0, boolean z10) throws ee0 {
        return stVar.zzc(bc0.f13920f, z10);
    }

    public void D(ad0 ad0) {
    }

    public abstract void E(be0 be0, MediaCodec mediaCodec, bc0 bc0, MediaCrypto mediaCrypto) throws ee0;

    public abstract boolean F(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws rb0;

    public boolean G(MediaCodec mediaCodec, boolean z10, bc0 bc0, bc0 bc02) {
        return false;
    }

    public boolean H(be0 be0) {
        return true;
    }

    public abstract void I(String str, long j10, long j11);

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r5.f13925s == r0.f13925s) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void J(e8.bc0 r5) throws e8.rb0 {
        /*
            r4 = this;
            e8.bc0 r0 = r4.f8059p
            r4.f8059p = r5
            com.google.android.gms.internal.ads.et r5 = r5.f13923i
            if (r0 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000c
        L_0x000a:
            com.google.android.gms.internal.ads.et r1 = r0.f13923i
        L_0x000c:
            boolean r5 = e8.eg0.d(r5, r1)
            r1 = 1
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x0029
            e8.bc0 r5 = r4.f8059p
            com.google.android.gms.internal.ads.et r5 = r5.f13923i
            if (r5 != 0) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.f8145c
            e8.rb0 r5 = e8.rb0.b(r5, r0)
            throw r5
        L_0x0029:
            e8.cd0<java.lang.Object> r5 = r4.f8060q
            if (r5 != 0) goto L_0x0058
            android.media.MediaCodec r5 = r4.f8061r
            if (r5 == 0) goto L_0x0058
            e8.be0 r2 = r4.f8062s
            boolean r2 = r2.f13989b
            e8.bc0 r3 = r4.f8059p
            boolean r5 = r4.G(r5, r2, r0, r3)
            if (r5 == 0) goto L_0x0058
            r4.I = r1
            r4.J = r1
            boolean r5 = r4.f8065v
            if (r5 == 0) goto L_0x0054
            e8.bc0 r5 = r4.f8059p
            int r2 = r5.f13924r
            int r3 = r0.f13924r
            if (r2 != r3) goto L_0x0054
            int r5 = r5.f13925s
            int r0 = r0.f13925s
            if (r5 != r0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            r4.A = r1
            return
        L_0x0058:
            boolean r5 = r4.L
            if (r5 == 0) goto L_0x005f
            r4.K = r1
            return
        L_0x005f:
            r4.M()
            r4.L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rt.J(e8.bc0):void");
    }

    public void K() throws rb0 {
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0158 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015d A[Catch:{ Exception -> 0x01cb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L() throws e8.rb0 {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.f8061r
            if (r0 != 0) goto L_0x01da
            e8.bc0 r0 = r11.f8059p
            if (r0 != 0) goto L_0x000a
            goto L_0x01da
        L_0x000a:
            r1 = 0
            r11.f8060q = r1
            e8.be0 r2 = r11.f8062s
            r3 = 0
            if (r2 != 0) goto L_0x0040
            com.google.android.gms.internal.ads.st r2 = r11.f8052i     // Catch:{ ee0 -> 0x002e }
            e8.be0 r0 = r11.C(r2, r0, r3)     // Catch:{ ee0 -> 0x002e }
            r11.f8062s = r0     // Catch:{ ee0 -> 0x002e }
            if (r0 == 0) goto L_0x001d
            goto L_0x0040
        L_0x001d:
            e8.ce0 r0 = new e8.ce0
            e8.bc0 r2 = r11.f8059p
            r3 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((e8.bc0) r2, (java.lang.Throwable) r1, (int) r3)
            int r1 = r11.f8145c
            e8.rb0 r0 = e8.rb0.b(r0, r1)
            throw r0
        L_0x002e:
            r0 = move-exception
            e8.ce0 r1 = new e8.ce0
            e8.bc0 r2 = r11.f8059p
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((e8.bc0) r2, (java.lang.Throwable) r0, (int) r3)
            int r0 = r11.f8145c
            e8.rb0 r0 = e8.rb0.b(r1, r0)
            throw r0
        L_0x0040:
            e8.be0 r0 = r11.f8062s
            boolean r0 = r11.H(r0)
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            e8.be0 r0 = r11.f8062s
            java.lang.String r0 = r0.f13988a
            e8.bc0 r2 = r11.f8059p
            int r4 = e8.eg0.f14479a
            r5 = 21
            r10 = 1
            if (r4 >= r5) goto L_0x0068
            java.util.List<byte[]> r2 = r2.f13922h
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0068
            java.lang.String r2 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0068
            r2 = 1
            goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            r11.f8063t = r2
            r2 = 19
            r6 = 18
            if (r4 < r6) goto L_0x00a2
            if (r4 != r6) goto L_0x0083
            java.lang.String r7 = "OMX.SEC.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.SEC.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
        L_0x0083:
            if (r4 != r2) goto L_0x00a0
            java.lang.String r7 = e8.eg0.f14482d
            java.lang.String r8 = "SM-G800"
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = "OMX.Exynos.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.Exynos.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r7 = 0
            goto L_0x00a3
        L_0x00a2:
            r7 = 1
        L_0x00a3:
            r11.f8064u = r7
            r7 = 24
            if (r4 >= r7) goto L_0x00dd
            java.lang.String r7 = "OMX.Nvidia.h264.decode"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "OMX.Nvidia.h264.decode.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00dd
        L_0x00b9:
            java.lang.String r7 = e8.eg0.f14480b
            java.lang.String r8 = "flounder"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "flounder_lte"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "grouper"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "tilapia"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00dd
        L_0x00db:
            r7 = 1
            goto L_0x00de
        L_0x00dd:
            r7 = 0
        L_0x00de:
            r11.f8065v = r7
            r7 = 17
            if (r4 > r7) goto L_0x00f6
            java.lang.String r7 = "OMX.rk.video_decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00f4
            java.lang.String r7 = "OMX.allwinner.video.decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00f6
        L_0x00f4:
            r7 = 1
            goto L_0x00f7
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            r11.f8066w = r7
            r7 = 23
            if (r4 > r7) goto L_0x0105
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0121
        L_0x0105:
            if (r4 > r2) goto L_0x0123
            java.lang.String r2 = e8.eg0.f14480b
            java.lang.String r7 = "hb2000"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0123
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0121
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0123
        L_0x0121:
            r2 = 1
            goto L_0x0124
        L_0x0123:
            r2 = 0
        L_0x0124:
            r11.f8067x = r2
            if (r4 != r5) goto L_0x0132
            java.lang.String r2 = "OMX.google.aac.decoder"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0132
            r2 = 1
            goto L_0x0133
        L_0x0132:
            r2 = 0
        L_0x0133:
            r11.f8068y = r2
            e8.bc0 r2 = r11.f8059p
            if (r4 > r6) goto L_0x0146
            int r2 = r2.f13932z
            if (r2 != r10) goto L_0x0146
            java.lang.String r2 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0146
            r3 = 1
        L_0x0146:
            r11.f8069z = r3
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r4 = "createCodec:"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01cb }
            int r6 = r5.length()     // Catch:{ Exception -> 0x01cb }
            if (r6 == 0) goto L_0x015d
            java.lang.String r4 = r4.concat(r5)     // Catch:{ Exception -> 0x01cb }
            goto L_0x0163
        L_0x015d:
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x01cb }
            r5.<init>(r4)     // Catch:{ Exception -> 0x01cb }
            r4 = r5
        L_0x0163:
            com.google.android.gms.internal.ads.xs.a(r4)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r4 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x01cb }
            r11.f8061r = r4     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.xs.b()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r4 = "configureCodec"
            com.google.android.gms.internal.ads.xs.a(r4)     // Catch:{ Exception -> 0x01cb }
            e8.be0 r4 = r11.f8062s     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r5 = r11.f8061r     // Catch:{ Exception -> 0x01cb }
            e8.bc0 r6 = r11.f8059p     // Catch:{ Exception -> 0x01cb }
            r11.E(r4, r5, r6, r1)     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.xs.b()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = "startCodec"
            com.google.android.gms.internal.ads.xs.a(r1)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f8061r     // Catch:{ Exception -> 0x01cb }
            r1.start()     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.xs.b()     // Catch:{ Exception -> 0x01cb }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01cb }
            long r8 = r6 - r2
            r4 = r11
            r5 = r0
            r4.I(r5, r6, r8)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f8061r     // Catch:{ Exception -> 0x01cb }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x01cb }
            r11.C = r1     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f8061r     // Catch:{ Exception -> 0x01cb }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x01cb }
            r11.D = r1     // Catch:{ Exception -> 0x01cb }
            int r0 = r11.f8146d
            r1 = 2
            if (r0 != r1) goto L_0x01b5
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01ba
        L_0x01b5:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01ba:
            r11.E = r0
            r0 = -1
            r11.F = r0
            r11.G = r0
            r11.Q = r10
            e8.yc0 r0 = r11.R
            int r1 = r0.f17598a
            int r1 = r1 + r10
            r0.f17598a = r1
            return
        L_0x01cb:
            r1 = move-exception
            e8.ce0 r2 = new e8.ce0
            e8.bc0 r3 = r11.f8059p
            r2.<init>((e8.bc0) r3, (java.lang.Throwable) r1, (java.lang.String) r0)
            int r0 = r11.f8145c
            e8.rb0 r0 = e8.rb0.b(r2, r0)
            throw r0
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rt.L():void");
    }

    public void M() {
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1;
        this.P = false;
        this.H = false;
        this.f8057n.clear();
        this.C = null;
        this.D = null;
        this.f8062s = null;
        this.I = false;
        this.L = false;
        this.f8063t = false;
        this.f8064u = false;
        this.f8065v = false;
        this.f8066w = false;
        this.f8067x = false;
        this.f8069z = false;
        this.A = false;
        this.B = false;
        this.M = false;
        this.J = 0;
        this.K = 0;
        this.f8054k.f13680c = null;
        MediaCodec mediaCodec = this.f8061r;
        if (mediaCodec != null) {
            this.R.f17599b++;
            try {
                mediaCodec.stop();
                try {
                    this.f8061r.release();
                    this.f8061r = null;
                    if (this.f8060q != null) {
                        try {
                            throw null;
                        } catch (Throwable th) {
                            this.f8060q = null;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    this.f8060q = null;
                    throw th2;
                }
            } catch (Throwable th3) {
                this.f8060q = null;
                throw th3;
            }
        }
    }

    public final void N() throws rb0 {
        if (this.K == 2) {
            M();
            L();
            return;
        }
        this.O = true;
        K();
    }

    public boolean f() {
        return this.O;
    }

    public boolean isReady() {
        boolean z10;
        if (this.f8059p != null && !this.P) {
            if (this.f8149g) {
                z10 = this.f8150h;
            } else {
                oe0 oe0 = this.f8147e;
                yt ytVar = oe0.f15792b;
                z10 = ytVar.N || (!ytVar.s() && ytVar.f8656w.valueAt(oe0.f15791a).f6694c.b());
            }
            if (z10 || this.G >= 0 || (this.E != -9223372036854775807L && SystemClock.elapsedRealtime() < this.E)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r15v11 */
    /* JADX WARNING: type inference failed for: r15v12 */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: type inference failed for: r15v14 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r15v2, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03db A[LOOP:2: B:91:0x01a0->B:216:0x03db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03de A[LOOP:0: B:14:0x0048->B:217:0x03de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x01a0 A[EDGE_INSN: B:251:0x01a0->B:91:0x01a0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03d6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(long r29, long r31) throws e8.rb0 {
        /*
            r28 = this;
            r13 = r28
            boolean r0 = r13.O
            if (r0 == 0) goto L_0x000a
            r28.K()
            return
        L_0x000a:
            e8.bc0 r0 = r13.f8059p
            r14 = -4
            r15 = -5
            r12 = 1
            if (r0 != 0) goto L_0x003b
            e8.ad0 r0 = r13.f8055l
            r0.a()
            e8.gz r0 = r13.f8056m
            e8.ad0 r1 = r13.f8055l
            int r0 = r13.v(r0, r1, r12)
            if (r0 != r15) goto L_0x002a
            e8.gz r0 = r13.f8056m
            java.lang.Object r0 = r0.f14835b
            e8.bc0 r0 = (e8.bc0) r0
            r13.J(r0)
            goto L_0x003b
        L_0x002a:
            if (r0 != r14) goto L_0x003a
            e8.ad0 r0 = r13.f8055l
            boolean r0 = r0.d()
            o.a.c(r0)
            r13.N = r12
            r28.N()
        L_0x003a:
            return
        L_0x003b:
            r28.L()
            android.media.MediaCodec r0 = r13.f8061r
            r10 = 0
            if (r0 == 0) goto L_0x03e4
            java.lang.String r0 = "drainAndFeed"
            com.google.android.gms.internal.ads.xs.a(r0)
        L_0x0048:
            int r0 = r13.G
            r11 = 2
            r9 = 4
            r8 = -3
            r6 = 0
            r4 = -1
            if (r0 >= 0) goto L_0x012f
            boolean r0 = r13.f8068y
            if (r0 == 0) goto L_0x0071
            boolean r0 = r13.M
            if (r0 == 0) goto L_0x0071
            android.media.MediaCodec r0 = r13.f8061r     // Catch:{ IllegalStateException -> 0x0065 }
            android.media.MediaCodec$BufferInfo r1 = r13.f8058o     // Catch:{ IllegalStateException -> 0x0065 }
            int r0 = r0.dequeueOutputBuffer(r1, r6)     // Catch:{ IllegalStateException -> 0x0065 }
            r13.G = r0     // Catch:{ IllegalStateException -> 0x0065 }
            goto L_0x007b
        L_0x0065:
            r28.N()
            boolean r0 = r13.O
            if (r0 == 0) goto L_0x009d
            r28.M()
            goto L_0x009d
        L_0x0071:
            android.media.MediaCodec r0 = r13.f8061r
            android.media.MediaCodec$BufferInfo r1 = r13.f8058o
            int r0 = r0.dequeueOutputBuffer(r1, r6)
            r13.G = r0
        L_0x007b:
            int r0 = r13.G
            if (r0 < 0) goto L_0x00e0
            boolean r1 = r13.B
            if (r1 == 0) goto L_0x0091
            r13.B = r10
            android.media.MediaCodec r1 = r13.f8061r
            r1.releaseOutputBuffer(r0, r10)
            r13.G = r4
        L_0x008c:
            r0 = 2
        L_0x008d:
            r14 = -1
            r15 = 1
            goto L_0x019e
        L_0x0091:
            android.media.MediaCodec$BufferInfo r1 = r13.f8058o
            int r2 = r1.flags
            r2 = r2 & r9
            if (r2 == 0) goto L_0x00a0
            r28.N()
            r13.G = r4
        L_0x009d:
            r0 = 2
            r12 = 0
            goto L_0x008d
        L_0x00a0:
            java.nio.ByteBuffer[] r2 = r13.D
            r0 = r2[r0]
            if (r0 == 0) goto L_0x00b5
            int r1 = r1.offset
            r0.position(r1)
            android.media.MediaCodec$BufferInfo r1 = r13.f8058o
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00b5:
            android.media.MediaCodec$BufferInfo r0 = r13.f8058o
            long r0 = r0.presentationTimeUs
            java.util.List<java.lang.Long> r2 = r13.f8057n
            int r2 = r2.size()
            r3 = 0
        L_0x00c0:
            if (r3 >= r2) goto L_0x00dc
            java.util.List<java.lang.Long> r5 = r13.f8057n
            java.lang.Object r5 = r5.get(r3)
            java.lang.Long r5 = (java.lang.Long) r5
            long r16 = r5.longValue()
            int r5 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00d9
            java.util.List<java.lang.Long> r0 = r13.f8057n
            r0.remove(r3)
            r0 = 1
            goto L_0x00dd
        L_0x00d9:
            int r3 = r3 + 1
            goto L_0x00c0
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            r13.H = r0
            goto L_0x012f
        L_0x00e0:
            r1 = -2
            if (r0 != r1) goto L_0x0112
            android.media.MediaCodec r0 = r13.f8061r
            android.media.MediaFormat r0 = r0.getOutputFormat()
            boolean r1 = r13.f8065v
            if (r1 == 0) goto L_0x0102
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0102
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0102
            r13.B = r12
            goto L_0x008c
        L_0x0102:
            boolean r1 = r13.f8069z
            if (r1 == 0) goto L_0x010b
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r12)
        L_0x010b:
            android.media.MediaCodec r1 = r13.f8061r
            r13.A(r1, r0)
            goto L_0x008c
        L_0x0112:
            if (r0 != r8) goto L_0x011e
            android.media.MediaCodec r0 = r13.f8061r
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r13.D = r0
            goto L_0x008c
        L_0x011e:
            boolean r0 = r13.f8066w
            if (r0 == 0) goto L_0x009d
            boolean r0 = r13.N
            if (r0 != 0) goto L_0x012a
            int r0 = r13.K
            if (r0 != r11) goto L_0x009d
        L_0x012a:
            r28.N()
            goto L_0x009d
        L_0x012f:
            boolean r0 = r13.f8068y
            if (r0 == 0) goto L_0x0176
            boolean r0 = r13.M
            if (r0 == 0) goto L_0x0176
            android.media.MediaCodec r0 = r13.f8061r     // Catch:{ IllegalStateException -> 0x0168 }
            java.nio.ByteBuffer[] r1 = r13.D     // Catch:{ IllegalStateException -> 0x0168 }
            int r5 = r13.G     // Catch:{ IllegalStateException -> 0x0168 }
            r16 = r1[r5]     // Catch:{ IllegalStateException -> 0x0168 }
            android.media.MediaCodec$BufferInfo r1 = r13.f8058o     // Catch:{ IllegalStateException -> 0x0168 }
            int r2 = r1.flags     // Catch:{ IllegalStateException -> 0x0168 }
            long r10 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0168 }
            boolean r3 = r13.H     // Catch:{ IllegalStateException -> 0x0168 }
            r1 = r28
            r18 = r2
            r19 = r3
            r2 = r29
            r20 = r5
            r14 = -1
            r4 = r31
            r6 = r0
            r7 = r16
            r0 = -3
            r8 = r20
            r9 = r18
            r0 = 2
            r15 = 0
            r15 = 1
            r12 = r19
            boolean r1 = r1.F(r2, r4, r6, r7, r8, r9, r10, r12)     // Catch:{ IllegalStateException -> 0x0166 }
            goto L_0x0193
        L_0x0166:
            goto L_0x016b
        L_0x0168:
            r0 = 2
            r14 = -1
            r15 = 1
        L_0x016b:
            r28.N()
            boolean r1 = r13.O
            if (r1 == 0) goto L_0x019d
            r28.M()
            goto L_0x019d
        L_0x0176:
            r0 = 2
            r14 = -1
            r15 = 1
            android.media.MediaCodec r6 = r13.f8061r
            java.nio.ByteBuffer[] r1 = r13.D
            int r8 = r13.G
            r7 = r1[r8]
            android.media.MediaCodec$BufferInfo r1 = r13.f8058o
            int r9 = r1.flags
            long r10 = r1.presentationTimeUs
            boolean r12 = r13.H
            r1 = r28
            r2 = r29
            r4 = r31
            boolean r1 = r1.F(r2, r4, r6, r7, r8, r9, r10, r12)
        L_0x0193:
            if (r1 == 0) goto L_0x019d
            android.media.MediaCodec$BufferInfo r1 = r13.f8058o
            long r1 = r1.presentationTimeUs
            r13.G = r14
            r12 = 1
            goto L_0x019e
        L_0x019d:
            r12 = 0
        L_0x019e:
            if (r12 != 0) goto L_0x03de
        L_0x01a0:
            android.media.MediaCodec r1 = r13.f8061r
            if (r1 == 0) goto L_0x03d0
            int r2 = r13.K
            if (r2 == r0) goto L_0x03d0
            boolean r2 = r13.N
            if (r2 == 0) goto L_0x01ae
            goto L_0x03d0
        L_0x01ae:
            int r2 = r13.F
            if (r2 >= 0) goto L_0x01cc
            r2 = 0
            int r1 = r1.dequeueInputBuffer(r2)
            r13.F = r1
            if (r1 >= 0) goto L_0x01c0
        L_0x01bc:
            r4 = -3
        L_0x01bd:
            r6 = 4
            goto L_0x03d3
        L_0x01c0:
            e8.ad0 r4 = r13.f8054k
            java.nio.ByteBuffer[] r5 = r13.C
            r1 = r5[r1]
            r4.f13680c = r1
            r4.a()
            goto L_0x01ce
        L_0x01cc:
            r2 = 0
        L_0x01ce:
            int r1 = r13.K
            if (r1 != r15) goto L_0x01e9
            boolean r1 = r13.f8066w
            if (r1 != 0) goto L_0x01e6
            r13.M = r15
            android.media.MediaCodec r4 = r13.f8061r
            int r5 = r13.F
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 4
            r4.queueInputBuffer(r5, r6, r7, r8, r10)
            r13.F = r14
        L_0x01e6:
            r13.K = r0
            goto L_0x01bc
        L_0x01e9:
            boolean r1 = r13.A
            if (r1 == 0) goto L_0x020e
            r1 = 0
            r13.A = r1
            e8.ad0 r1 = r13.f8054k
            java.nio.ByteBuffer r1 = r1.f13680c
            byte[] r4 = S
            r1.put(r4)
            android.media.MediaCodec r5 = r13.f8061r
            int r6 = r13.F
            r7 = 0
            int r8 = r4.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r13.F = r14
            r13.L = r15
            r4 = -3
        L_0x020a:
            r6 = 4
        L_0x020b:
            r12 = 1
            goto L_0x03d4
        L_0x020e:
            boolean r1 = r13.P
            if (r1 == 0) goto L_0x0216
            r1 = -4
            r4 = -3
            r10 = 0
            goto L_0x024d
        L_0x0216:
            int r1 = r13.J
            if (r1 != r15) goto L_0x023b
            r10 = 0
        L_0x021b:
            e8.bc0 r1 = r13.f8059p
            java.util.List<byte[]> r1 = r1.f13922h
            int r1 = r1.size()
            if (r10 >= r1) goto L_0x0239
            e8.bc0 r1 = r13.f8059p
            java.util.List<byte[]> r1 = r1.f13922h
            java.lang.Object r1 = r1.get(r10)
            byte[] r1 = (byte[]) r1
            e8.ad0 r4 = r13.f8054k
            java.nio.ByteBuffer r4 = r4.f13680c
            r4.put(r1)
            int r10 = r10 + 1
            goto L_0x021b
        L_0x0239:
            r13.J = r0
        L_0x023b:
            e8.ad0 r1 = r13.f8054k
            java.nio.ByteBuffer r1 = r1.f13680c
            int r10 = r1.position()
            e8.gz r1 = r13.f8056m
            e8.ad0 r4 = r13.f8054k
            r5 = 0
            int r1 = r13.v(r1, r4, r5)
            r4 = -3
        L_0x024d:
            if (r1 != r4) goto L_0x0251
            goto L_0x01bd
        L_0x0251:
            r5 = -5
            if (r1 != r5) goto L_0x0269
            int r1 = r13.J
            if (r1 != r0) goto L_0x025f
            e8.ad0 r1 = r13.f8054k
            r1.a()
            r13.J = r15
        L_0x025f:
            e8.gz r1 = r13.f8056m
            java.lang.Object r1 = r1.f14835b
            e8.bc0 r1 = (e8.bc0) r1
            r13.J(r1)
            goto L_0x020a
        L_0x0269:
            e8.ad0 r1 = r13.f8054k
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x02a5
            int r1 = r13.J
            if (r1 != r0) goto L_0x027c
            e8.ad0 r1 = r13.f8054k
            r1.a()
            r13.J = r15
        L_0x027c:
            r13.N = r15
            boolean r1 = r13.L
            if (r1 != 0) goto L_0x0287
            r28.N()
            goto L_0x01bd
        L_0x0287:
            boolean r1 = r13.f8066w     // Catch:{ CryptoException -> 0x029d }
            if (r1 != 0) goto L_0x01bd
            r13.M = r15     // Catch:{ CryptoException -> 0x029d }
            android.media.MediaCodec r5 = r13.f8061r     // Catch:{ CryptoException -> 0x029d }
            int r6 = r13.F     // Catch:{ CryptoException -> 0x029d }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x029d }
            r13.F = r14     // Catch:{ CryptoException -> 0x029d }
            goto L_0x01bd
        L_0x029d:
            r0 = move-exception
            int r1 = r13.f8145c
            e8.rb0 r0 = e8.rb0.b(r0, r1)
            throw r0
        L_0x02a5:
            boolean r1 = r13.Q
            if (r1 == 0) goto L_0x02be
            e8.ad0 r1 = r13.f8054k
            boolean r1 = r1.b(r15)
            if (r1 != 0) goto L_0x02be
            e8.ad0 r1 = r13.f8054k
            r1.a()
            int r1 = r13.J
            if (r1 != r0) goto L_0x020a
            r13.J = r15
            goto L_0x020a
        L_0x02be:
            r1 = 0
            r13.Q = r1
            e8.ad0 r1 = r13.f8054k
            r5 = 1073741824(0x40000000, float:2.0)
            boolean r1 = r1.b(r5)
            e8.cd0<java.lang.Object> r5 = r13.f8060q
            if (r5 == 0) goto L_0x02eb
            int r5 = r5.getState()
            if (r5 == 0) goto L_0x02de
            r6 = 4
            if (r5 == r6) goto L_0x02ec
            if (r1 != 0) goto L_0x02dc
            boolean r5 = r13.f8053j
            if (r5 != 0) goto L_0x02ec
        L_0x02dc:
            r12 = 1
            goto L_0x02ed
        L_0x02de:
            e8.cd0<java.lang.Object> r0 = r13.f8060q
            r0.a()
            r0 = 0
            int r1 = r13.f8145c
            e8.rb0 r0 = e8.rb0.b(r0, r1)
            throw r0
        L_0x02eb:
            r6 = 4
        L_0x02ec:
            r12 = 0
        L_0x02ed:
            r13.P = r12
            if (r12 == 0) goto L_0x02f3
            goto L_0x03d3
        L_0x02f3:
            boolean r5 = r13.f8063t
            if (r5 == 0) goto L_0x034f
            if (r1 != 0) goto L_0x034f
            e8.ad0 r5 = r13.f8054k
            java.nio.ByteBuffer r5 = r5.f13680c
            byte[] r7 = e8.bg0.f14009a
            int r7 = r5.position()
            r8 = 0
            r9 = 0
        L_0x0305:
            int r11 = r8 + 1
            if (r11 >= r7) goto L_0x033d
            byte r12 = r5.get(r8)
            r12 = r12 & 255(0xff, float:3.57E-43)
            r0 = 3
            if (r9 != r0) goto L_0x0331
            if (r12 != r15) goto L_0x0335
            byte r0 = r5.get(r11)
            r0 = r0 & 31
            r2 = 7
            if (r0 != r2) goto L_0x0335
            java.nio.ByteBuffer r0 = r5.duplicate()
            int r8 = r8 + -3
            r0.position(r8)
            r0.limit(r7)
            r2 = 0
            r5.position(r2)
            r5.put(r0)
            goto L_0x0340
        L_0x0331:
            if (r12 != 0) goto L_0x0335
            int r9 = r9 + 1
        L_0x0335:
            if (r12 == 0) goto L_0x0338
            r9 = 0
        L_0x0338:
            r8 = r11
            r0 = 2
            r2 = 0
            goto L_0x0305
        L_0x033d:
            r5.clear()
        L_0x0340:
            e8.ad0 r0 = r13.f8054k
            java.nio.ByteBuffer r0 = r0.f13680c
            int r0 = r0.position()
            if (r0 != 0) goto L_0x034c
            goto L_0x020b
        L_0x034c:
            r0 = 0
            r13.f8063t = r0
        L_0x034f:
            e8.ad0 r0 = r13.f8054k     // Catch:{ CryptoException -> 0x03c8 }
            long r2 = r0.f13681d     // Catch:{ CryptoException -> 0x03c8 }
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = r0.b(r5)     // Catch:{ CryptoException -> 0x03c8 }
            if (r0 == 0) goto L_0x0364
            java.util.List<java.lang.Long> r0 = r13.f8057n     // Catch:{ CryptoException -> 0x03c8 }
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch:{ CryptoException -> 0x03c8 }
            r0.add(r5)     // Catch:{ CryptoException -> 0x03c8 }
        L_0x0364:
            e8.ad0 r0 = r13.f8054k     // Catch:{ CryptoException -> 0x03c8 }
            java.nio.ByteBuffer r0 = r0.f13680c     // Catch:{ CryptoException -> 0x03c8 }
            r0.flip()     // Catch:{ CryptoException -> 0x03c8 }
            e8.ad0 r0 = r13.f8054k     // Catch:{ CryptoException -> 0x03c8 }
            r13.D(r0)     // Catch:{ CryptoException -> 0x03c8 }
            if (r1 == 0) goto L_0x039f
            e8.ad0 r0 = r13.f8054k     // Catch:{ CryptoException -> 0x03c8 }
            e8.xc0 r0 = r0.f13679b     // Catch:{ CryptoException -> 0x03c8 }
            android.media.MediaCodec$CryptoInfo r0 = r0.f17469d     // Catch:{ CryptoException -> 0x03c8 }
            if (r10 != 0) goto L_0x037b
            goto L_0x038b
        L_0x037b:
            int[] r1 = r0.numBytesOfClearData     // Catch:{ CryptoException -> 0x03c8 }
            if (r1 != 0) goto L_0x0383
            int[] r1 = new int[r15]     // Catch:{ CryptoException -> 0x03c8 }
            r0.numBytesOfClearData = r1     // Catch:{ CryptoException -> 0x03c8 }
        L_0x0383:
            int[] r1 = r0.numBytesOfClearData     // Catch:{ CryptoException -> 0x03c8 }
            r5 = 0
            r7 = r1[r5]     // Catch:{ CryptoException -> 0x03c8 }
            int r7 = r7 + r10
            r1[r5] = r7     // Catch:{ CryptoException -> 0x03c8 }
        L_0x038b:
            android.media.MediaCodec r1 = r13.f8061r     // Catch:{ CryptoException -> 0x03c8 }
            int r5 = r13.F     // Catch:{ CryptoException -> 0x03c8 }
            r23 = 0
            r27 = 0
            r21 = r1
            r22 = r5
            r24 = r0
            r25 = r2
            r21.queueSecureInputBuffer(r22, r23, r24, r25, r27)     // Catch:{ CryptoException -> 0x03c8 }
            goto L_0x03b8
        L_0x039f:
            android.media.MediaCodec r0 = r13.f8061r     // Catch:{ CryptoException -> 0x03c8 }
            int r1 = r13.F     // Catch:{ CryptoException -> 0x03c8 }
            r23 = 0
            e8.ad0 r5 = r13.f8054k     // Catch:{ CryptoException -> 0x03c8 }
            java.nio.ByteBuffer r5 = r5.f13680c     // Catch:{ CryptoException -> 0x03c8 }
            int r24 = r5.limit()     // Catch:{ CryptoException -> 0x03c8 }
            r27 = 0
            r21 = r0
            r22 = r1
            r25 = r2
            r21.queueInputBuffer(r22, r23, r24, r25, r27)     // Catch:{ CryptoException -> 0x03c8 }
        L_0x03b8:
            r13.F = r14     // Catch:{ CryptoException -> 0x03c8 }
            r13.L = r15     // Catch:{ CryptoException -> 0x03c8 }
            r0 = 0
            r13.J = r0     // Catch:{ CryptoException -> 0x03c8 }
            e8.yc0 r0 = r13.R     // Catch:{ CryptoException -> 0x03c8 }
            int r1 = r0.f17600c     // Catch:{ CryptoException -> 0x03c8 }
            int r1 = r1 + r15
            r0.f17600c = r1     // Catch:{ CryptoException -> 0x03c8 }
            goto L_0x020b
        L_0x03c8:
            r0 = move-exception
            int r1 = r13.f8145c
            e8.rb0 r0 = e8.rb0.b(r0, r1)
            throw r0
        L_0x03d0:
            r4 = -3
            goto L_0x01bd
        L_0x03d3:
            r12 = 0
        L_0x03d4:
            if (r12 != 0) goto L_0x03db
            com.google.android.gms.internal.ads.xs.b()
            goto L_0x046b
        L_0x03db:
            r0 = 2
            goto L_0x01a0
        L_0x03de:
            r10 = 0
            r12 = 1
            r14 = -4
            r15 = -5
            goto L_0x0048
        L_0x03e4:
            r15 = 1
            e8.oe0 r0 = r13.f8147e
            long r1 = r13.f8148f
            long r1 = r29 - r1
            com.google.android.gms.internal.ads.yt r3 = r0.f15792b
            int r0 = r0.f15791a
            android.util.SparseArray<com.google.android.gms.internal.ads.gu> r4 = r3.f8656w
            java.lang.Object r0 = r4.valueAt(r0)
            com.google.android.gms.internal.ads.gu r0 = (com.google.android.gms.internal.ads.gu) r0
            boolean r3 = r3.N
            if (r3 == 0) goto L_0x043c
            long r3 = r0.j()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x043c
            e8.ue0 r1 = r0.f6694c
            monitor-enter(r1)
            boolean r2 = r1.b()     // Catch:{ all -> 0x0439 }
            r3 = -1
            if (r2 != 0) goto L_0x0411
            monitor-exit(r1)
            r7 = r3
            goto L_0x0431
        L_0x0411:
            int r2 = r1.f16938k     // Catch:{ all -> 0x0439 }
            int r5 = r1.f16936i     // Catch:{ all -> 0x0439 }
            int r2 = r2 + r5
            int r6 = r2 + -1
            int r7 = r1.f16928a     // Catch:{ all -> 0x0439 }
            int r6 = r6 % r7
            int r2 = r2 % r7
            r1.f16938k = r2     // Catch:{ all -> 0x0439 }
            int r2 = r1.f16937j     // Catch:{ all -> 0x0439 }
            int r2 = r2 + r5
            r1.f16937j = r2     // Catch:{ all -> 0x0439 }
            r2 = 0
            r1.f16936i = r2     // Catch:{ all -> 0x0439 }
            long[] r2 = r1.f16930c     // Catch:{ all -> 0x0439 }
            r7 = r2[r6]     // Catch:{ all -> 0x0439 }
            int[] r2 = r1.f16931d     // Catch:{ all -> 0x0439 }
            r2 = r2[r6]     // Catch:{ all -> 0x0439 }
            long r5 = (long) r2
            long r7 = r7 + r5
            monitor-exit(r1)
        L_0x0431:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x043f
            r0.i(r7)
            goto L_0x043f
        L_0x0439:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x043c:
            r0.h(r1, r15)
        L_0x043f:
            e8.ad0 r0 = r13.f8055l
            r0.a()
            e8.gz r0 = r13.f8056m
            e8.ad0 r1 = r13.f8055l
            r2 = 0
            int r0 = r13.v(r0, r1, r2)
            r1 = -5
            if (r0 != r1) goto L_0x045a
            e8.gz r0 = r13.f8056m
            java.lang.Object r0 = r0.f14835b
            e8.bc0 r0 = (e8.bc0) r0
            r13.J(r0)
            goto L_0x046b
        L_0x045a:
            r1 = -4
            if (r0 != r1) goto L_0x046b
            e8.ad0 r0 = r13.f8055l
            boolean r0 = r0.d()
            o.a.c(r0)
            r13.N = r15
            r28.N()
        L_0x046b:
            e8.yc0 r0 = r13.R
            monitor-enter(r0)
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rt.l(long, long):void");
    }

    public void w(long j10, boolean z10) throws rb0 {
        this.N = false;
        this.O = false;
        if (this.f8061r != null) {
            this.E = -9223372036854775807L;
            this.F = -1;
            this.G = -1;
            this.Q = true;
            this.P = false;
            this.H = false;
            this.f8057n.clear();
            this.A = false;
            this.B = false;
            if (this.f8064u || (this.f8067x && this.M)) {
                M();
                L();
            } else if (this.K != 0) {
                M();
                L();
            } else {
                this.f8061r.flush();
                this.L = false;
            }
            if (this.I && this.f8059p != null) {
                this.J = 1;
            }
        }
    }

    public void z() {
        this.f8059p = null;
        try {
            M();
            try {
                if (this.f8060q != null) {
                    throw null;
                }
            } finally {
                this.f8060q = null;
            }
        } catch (Throwable th) {
            if (this.f8060q == null) {
                throw th;
            }
            throw null;
        } finally {
            this.f8060q = null;
        }
    }
}
