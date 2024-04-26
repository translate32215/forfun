package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import e7.i;
import e8.ad0;
import e8.bc0;
import e8.be0;
import e8.eg0;
import e8.gf0;
import e8.ig0;
import e8.lg0;
import e8.nc0;
import e8.ng0;
import e8.og0;
import e8.pg0;
import e8.qg0;
import e8.rb0;
import e8.wc;
import e8.yc0;
import r7.m;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class nu extends rt {

    /* renamed from: w0  reason: collision with root package name */
    public static final int[] f7635w0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final Context T;
    public final ng0 U;
    public final gf0 V;
    public final int W = -1;
    public final boolean X;
    public final long[] Y;
    public bc0[] Z;

    /* renamed from: a0  reason: collision with root package name */
    public wc f7636a0;

    /* renamed from: b0  reason: collision with root package name */
    public Surface f7637b0;

    /* renamed from: c0  reason: collision with root package name */
    public Surface f7638c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f7639d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7640e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f7641f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f7642g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f7643h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7644i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f7645j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f7646k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f7647l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f7648m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f7649n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f7650o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f7651p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f7652q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f7653r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f7654s0;

    /* renamed from: t0  reason: collision with root package name */
    public lg0 f7655t0;

    /* renamed from: u0  reason: collision with root package name */
    public long f7656u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f7657v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nu(Context context, st stVar, Handler handler, og0 og0) {
        super(2, stVar, false);
        boolean z10 = false;
        this.T = context.getApplicationContext();
        this.U = new ng0(context);
        this.V = new gf0(handler, og0);
        if (eg0.f14479a <= 22 && "foster".equals(eg0.f14480b) && "NVIDIA".equals(eg0.f14481c)) {
            z10 = true;
        }
        this.X = z10;
        this.Y = new long[10];
        this.f7656u0 = -9223372036854775807L;
        this.f7641f0 = -9223372036854775807L;
        this.f7647l0 = -1;
        this.f7648m0 = -1;
        this.f7650o0 = -1.0f;
        this.f7646k0 = -1.0f;
        this.f7639d0 = 1;
        U();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int O(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x0082
            if (r7 != r0) goto L_0x0007
            goto L_0x0082
        L_0x0007:
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 4
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x004d;
                case -1662541442: goto L_0x0042;
                case 1187890754: goto L_0x0037;
                case 1331836730: goto L_0x002c;
                case 1599127256: goto L_0x0021;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r5 = -1
            goto L_0x0057
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r5 = 5
            goto L_0x0057
        L_0x0021:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x002a
            goto L_0x0014
        L_0x002a:
            r5 = 4
            goto L_0x0057
        L_0x002c:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r5 = 3
            goto L_0x0057
        L_0x0037:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0040
            goto L_0x0014
        L_0x0040:
            r5 = 2
            goto L_0x0057
        L_0x0042:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x004b
            goto L_0x0014
        L_0x004b:
            r5 = 1
            goto L_0x0057
        L_0x004d:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            r5 = 0
        L_0x0057:
            switch(r5) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0076;
                case 2: goto L_0x0079;
                case 3: goto L_0x005b;
                case 4: goto L_0x0079;
                case 5: goto L_0x0076;
                default: goto L_0x005a;
            }
        L_0x005a:
            return r0
        L_0x005b:
            java.lang.String r5 = e8.eg0.f14482d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0066
            return r0
        L_0x0066:
            r5 = 16
            int r6 = e8.eg0.h(r6, r5)
            int r5 = e8.eg0.h(r7, r5)
            int r5 = r5 * r6
            int r5 = r5 << r3
            int r6 = r5 << 4
            goto L_0x007b
        L_0x0076:
            int r6 = r6 * r7
            goto L_0x007c
        L_0x0079:
            int r6 = r6 * r7
        L_0x007b:
            r3 = 2
        L_0x007c:
            int r6 = r6 * 3
            int r3 = r3 * 2
            int r6 = r6 / r3
            return r6
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nu.O(java.lang.String, int, int):int");
    }

    public static boolean P(boolean z10, bc0 bc0, bc0 bc02) {
        if (bc0.f13920f.equals(bc02.f13920f)) {
            int i10 = bc0.f13927u;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = bc02.f13927u;
            if (i11 == -1) {
                i11 = 0;
            }
            if (i10 == i11) {
                if (z10) {
                    return true;
                }
                if (bc0.f13924r == bc02.f13924r && bc0.f13925s == bc02.f13925s) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void A(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i10;
        int i11;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z10) {
            i10 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i10 = mediaFormat.getInteger("width");
        }
        this.f7647l0 = i10;
        if (z10) {
            i11 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i11 = mediaFormat.getInteger("height");
        }
        this.f7648m0 = i11;
        float f10 = this.f7646k0;
        this.f7650o0 = f10;
        if (eg0.f14479a >= 21) {
            int i12 = this.f7645j0;
            if (i12 == 90 || i12 == 270) {
                int i13 = this.f7647l0;
                this.f7647l0 = i11;
                this.f7648m0 = i13;
                this.f7650o0 = 1.0f / f10;
            }
        } else {
            this.f7649n0 = this.f7645j0;
        }
        mediaCodec.setVideoScalingMode(this.f7639d0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int B(com.google.android.gms.internal.ads.st r19, e8.bc0 r20) throws e8.ee0 {
        /*
            r18 = this;
            r0 = r20
            java.lang.String r1 = r0.f13920f
            boolean r2 = p.a.f(r1)
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            com.google.android.gms.internal.ads.et r2 = r0.f13923i
            if (r2 == 0) goto L_0x0020
            r4 = 0
            r5 = 0
        L_0x0012:
            int r6 = r2.f6322c
            if (r4 >= r6) goto L_0x0021
            com.google.android.gms.internal.ads.et$a[] r6 = r2.f6320a
            r6 = r6[r4]
            boolean r6 = r6.f6327e
            r5 = r5 | r6
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0020:
            r5 = 0
        L_0x0021:
            r2 = r19
            e8.be0 r1 = r2.zzc(r1, r5)
            r2 = 1
            if (r1 != 0) goto L_0x002b
            return r2
        L_0x002b:
            java.lang.String r4 = r0.f13917c
            r5 = 16
            r6 = 4
            r7 = 3
            r8 = 2
            if (r4 == 0) goto L_0x0357
            java.lang.String r9 = r1.f13992e
            if (r9 != 0) goto L_0x003a
            goto L_0x0357
        L_0x003a:
            java.lang.String r9 = r4.trim()
            java.lang.String r10 = "avc1"
            boolean r11 = r9.startsWith(r10)
            java.lang.String r12 = "hvc1"
            java.lang.String r13 = "hev1"
            if (r11 != 0) goto L_0x00f1
            java.lang.String r11 = "avc3"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x0054
            goto L_0x00f1
        L_0x0054:
            boolean r11 = r9.startsWith(r13)
            if (r11 != 0) goto L_0x00ee
            boolean r11 = r9.startsWith(r12)
            if (r11 == 0) goto L_0x0062
            goto L_0x00ee
        L_0x0062:
            java.lang.String r11 = "vp9"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x006e
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            goto L_0x00f3
        L_0x006e:
            java.lang.String r11 = "vp8"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x007a
            java.lang.String r9 = "video/x-vnd.on2.vp8"
            goto L_0x00f3
        L_0x007a:
            java.lang.String r11 = "mp4a"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x0086
            java.lang.String r9 = "audio/mp4a-latm"
            goto L_0x00f3
        L_0x0086:
            java.lang.String r11 = "ac-3"
            boolean r11 = r9.startsWith(r11)
            if (r11 != 0) goto L_0x00eb
            java.lang.String r11 = "dac3"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x0097
            goto L_0x00eb
        L_0x0097:
            java.lang.String r11 = "ec-3"
            boolean r11 = r9.startsWith(r11)
            if (r11 != 0) goto L_0x00e8
            java.lang.String r11 = "dec3"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x00a8
            goto L_0x00e8
        L_0x00a8:
            java.lang.String r11 = "dtsc"
            boolean r11 = r9.startsWith(r11)
            if (r11 != 0) goto L_0x00e5
            java.lang.String r11 = "dtse"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x00b9
            goto L_0x00e5
        L_0x00b9:
            java.lang.String r11 = "dtsh"
            boolean r11 = r9.startsWith(r11)
            if (r11 != 0) goto L_0x00e2
            java.lang.String r11 = "dtsl"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x00ca
            goto L_0x00e2
        L_0x00ca:
            java.lang.String r11 = "opus"
            boolean r11 = r9.startsWith(r11)
            if (r11 == 0) goto L_0x00d5
            java.lang.String r9 = "audio/opus"
            goto L_0x00f3
        L_0x00d5:
            java.lang.String r11 = "vorbis"
            boolean r9 = r9.startsWith(r11)
            if (r9 == 0) goto L_0x00e0
            java.lang.String r9 = "audio/vorbis"
            goto L_0x00f3
        L_0x00e0:
            r9 = 0
            goto L_0x00f3
        L_0x00e2:
            java.lang.String r9 = "audio/vnd.dts.hd"
            goto L_0x00f3
        L_0x00e5:
            java.lang.String r9 = "audio/vnd.dts"
            goto L_0x00f3
        L_0x00e8:
            java.lang.String r9 = "audio/eac3"
            goto L_0x00f3
        L_0x00eb:
            java.lang.String r9 = "audio/ac3"
            goto L_0x00f3
        L_0x00ee:
            java.lang.String r9 = "video/hevc"
            goto L_0x00f3
        L_0x00f1:
            java.lang.String r9 = "video/avc"
        L_0x00f3:
            if (r9 != 0) goto L_0x00f7
            goto L_0x0358
        L_0x00f7:
            java.lang.String r11 = r1.f13992e
            boolean r11 = r11.equals(r9)
            java.lang.String r14 = ", "
            if (r11 != 0) goto L_0x0128
            int r2 = r4.length()
            int r2 = r2 + 13
            int r3 = r9.length()
            int r3 = r3 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r3 = "codec.mime "
            r2.append(r3)
            r2.append(r4)
            r2.append(r14)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.c(r2)
            goto L_0x0355
        L_0x0128:
            e8.be0 r11 = com.google.android.gms.internal.ads.tt.f8210a
            java.lang.String r11 = "\\."
            java.lang.String[] r11 = r4.split(r11)
            r15 = r11[r3]
            r15.getClass()
            int r16 = r15.hashCode()
            switch(r16) {
                case 3006243: goto L_0x015a;
                case 3006244: goto L_0x014f;
                case 3199032: goto L_0x0146;
                case 3214780: goto L_0x013d;
                default: goto L_0x013c;
            }
        L_0x013c:
            goto L_0x0163
        L_0x013d:
            boolean r10 = r15.equals(r12)
            if (r10 != 0) goto L_0x0144
            goto L_0x0163
        L_0x0144:
            r10 = 3
            goto L_0x0164
        L_0x0146:
            boolean r10 = r15.equals(r13)
            if (r10 != 0) goto L_0x014d
            goto L_0x0163
        L_0x014d:
            r10 = 2
            goto L_0x0164
        L_0x014f:
            java.lang.String r10 = "avc2"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x0158
            goto L_0x0163
        L_0x0158:
            r10 = 1
            goto L_0x0164
        L_0x015a:
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            r10 = 0
            goto L_0x0164
        L_0x0163:
            r10 = -1
        L_0x0164:
            java.lang.String r12 = "MediaCodecUtil"
            if (r10 == 0) goto L_0x0218
            if (r10 == r2) goto L_0x0218
            if (r10 == r8) goto L_0x0170
            if (r10 == r7) goto L_0x0170
            goto L_0x0300
        L_0x0170:
            int r5 = r11.length
            java.lang.String r8 = "Ignoring malformed HEVC codec string: "
            if (r5 >= r6) goto L_0x018a
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0180
            java.lang.String r5 = r8.concat(r4)
            goto L_0x0185
        L_0x0180:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r8)
        L_0x0185:
            android.util.Log.w(r12, r5)
            goto L_0x0300
        L_0x018a:
            java.util.regex.Pattern r5 = com.google.android.gms.internal.ads.tt.f8211b
            r10 = r11[r2]
            java.util.regex.Matcher r5 = r5.matcher(r10)
            boolean r10 = r5.matches()
            if (r10 != 0) goto L_0x01ad
            int r5 = r4.length()
            if (r5 == 0) goto L_0x01a3
            java.lang.String r5 = r8.concat(r4)
            goto L_0x01a8
        L_0x01a3:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r8)
        L_0x01a8:
            android.util.Log.w(r12, r5)
            goto L_0x0300
        L_0x01ad:
            java.lang.String r8 = r5.group(r2)
            java.lang.String r10 = "1"
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L_0x01bb
            r8 = 1
            goto L_0x01c4
        L_0x01bb:
            java.lang.String r10 = "2"
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L_0x01fc
            r8 = 2
        L_0x01c4:
            java.util.Map<java.lang.String, java.lang.Integer> r10 = com.google.android.gms.internal.ads.tt.f8215f
            r11 = r11[r7]
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x01f1
            java.lang.String r8 = "Unknown HEVC level string: "
            java.lang.String r5 = r5.group(r2)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r10 = r5.length()
            if (r10 == 0) goto L_0x01e7
            java.lang.String r5 = r8.concat(r5)
            goto L_0x01ec
        L_0x01e7:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r8)
        L_0x01ec:
            android.util.Log.w(r12, r5)
            goto L_0x0300
        L_0x01f1:
            android.util.Pair r5 = new android.util.Pair
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.<init>(r8, r10)
            goto L_0x0301
        L_0x01fc:
            java.lang.String r5 = "Unknown HEVC profile string: "
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r10 = r8.length()
            if (r10 == 0) goto L_0x020d
            java.lang.String r5 = r5.concat(r8)
            goto L_0x0213
        L_0x020d:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r5)
            r5 = r8
        L_0x0213:
            android.util.Log.w(r12, r5)
            goto L_0x0300
        L_0x0218:
            int r10 = r11.length
            java.lang.String r13 = "Ignoring malformed AVC codec string: "
            if (r10 >= r8) goto L_0x0232
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0228
            java.lang.String r5 = r13.concat(r4)
            goto L_0x022d
        L_0x0228:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r13)
        L_0x022d:
            android.util.Log.w(r12, r5)
            goto L_0x0300
        L_0x0232:
            r10 = r11[r2]     // Catch:{ NumberFormatException -> 0x02ec }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x02ec }
            r15 = 6
            if (r10 != r15) goto L_0x0258
            r10 = r11[r2]     // Catch:{ NumberFormatException -> 0x02ec }
            java.lang.String r8 = r10.substring(r3, r8)     // Catch:{ NumberFormatException -> 0x02ec }
            int r8 = java.lang.Integer.parseInt(r8, r5)     // Catch:{ NumberFormatException -> 0x02ec }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x02ec }
            r10 = r11[r2]     // Catch:{ NumberFormatException -> 0x02ec }
            java.lang.String r10 = r10.substring(r6)     // Catch:{ NumberFormatException -> 0x02ec }
            int r5 = java.lang.Integer.parseInt(r10, r5)     // Catch:{ NumberFormatException -> 0x02ec }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02ec }
            goto L_0x0274
        L_0x0258:
            int r5 = r11.length     // Catch:{ NumberFormatException -> 0x02ec }
            if (r5 < r7) goto L_0x02d8
            r5 = r11[r2]     // Catch:{ NumberFormatException -> 0x02ec }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x02ec }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02ec }
            r8 = r11[r8]     // Catch:{ NumberFormatException -> 0x02ec }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x02ec }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x02ec }
            r17 = r8
            r8 = r5
            r5 = r17
        L_0x0274:
            android.util.SparseIntArray r10 = com.google.android.gms.internal.ads.tt.f8213d
            int r11 = r8.intValue()
            int r10 = r10.get(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            if (r10 != 0) goto L_0x02a3
            java.lang.String r5 = java.lang.String.valueOf(r8)
            int r8 = r5.length()
            int r8 = r8 + 21
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            java.lang.String r8 = "Unknown AVC profile: "
            r10.append(r8)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            android.util.Log.w(r12, r5)
            goto L_0x0300
        L_0x02a3:
            android.util.SparseIntArray r8 = com.google.android.gms.internal.ads.tt.f8214e
            int r11 = r5.intValue()
            int r8 = r8.get(r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            if (r8 != 0) goto L_0x02d2
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r8 = r5.length()
            int r8 = r8 + 19
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            java.lang.String r8 = "Unknown AVC level: "
            r10.append(r8)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            android.util.Log.w(r12, r5)
            goto L_0x0300
        L_0x02d2:
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r10, r8)
            goto L_0x0301
        L_0x02d8:
            int r5 = r4.length()     // Catch:{ NumberFormatException -> 0x02ec }
            if (r5 == 0) goto L_0x02e3
            java.lang.String r5 = r13.concat(r4)     // Catch:{ NumberFormatException -> 0x02ec }
            goto L_0x02e8
        L_0x02e3:
            java.lang.String r5 = new java.lang.String     // Catch:{ NumberFormatException -> 0x02ec }
            r5.<init>(r13)     // Catch:{ NumberFormatException -> 0x02ec }
        L_0x02e8:
            android.util.Log.w(r12, r5)     // Catch:{ NumberFormatException -> 0x02ec }
            goto L_0x0300
        L_0x02ec:
            int r5 = r4.length()
            if (r5 == 0) goto L_0x02f8
            java.lang.String r5 = r13.concat(r4)
            goto L_0x02fd
        L_0x02f8:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r13)
        L_0x02fd:
            android.util.Log.w(r12, r5)
        L_0x0300:
            r5 = 0
        L_0x0301:
            if (r5 != 0) goto L_0x0304
            goto L_0x0358
        L_0x0304:
            android.media.MediaCodecInfo$CodecCapabilities r2 = r1.f13993f
            if (r2 == 0) goto L_0x030c
            android.media.MediaCodecInfo$CodecProfileLevel[] r2 = r2.profileLevels
            if (r2 != 0) goto L_0x030e
        L_0x030c:
            android.media.MediaCodecInfo$CodecProfileLevel[] r2 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
        L_0x030e:
            int r3 = r2.length
            r8 = 0
        L_0x0310:
            if (r8 >= r3) goto L_0x0330
            r10 = r2[r8]
            int r11 = r10.profile
            java.lang.Object r12 = r5.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 != r12) goto L_0x032d
            int r10 = r10.level
            java.lang.Object r11 = r5.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 < r11) goto L_0x032d
            goto L_0x0357
        L_0x032d:
            int r8 = r8 + 1
            goto L_0x0310
        L_0x0330:
            int r2 = r4.length()
            int r2 = r2 + 22
            int r3 = r9.length()
            int r3 = r3 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r3 = "codec.profileLevel, "
            r2.append(r3)
            r2.append(r4)
            r2.append(r14)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.c(r2)
        L_0x0355:
            r2 = 0
            goto L_0x0358
        L_0x0357:
            r2 = 1
        L_0x0358:
            if (r2 == 0) goto L_0x03b4
            int r3 = r0.f13924r
            if (r3 <= 0) goto L_0x03b4
            int r4 = r0.f13925s
            if (r4 <= 0) goto L_0x03b4
            int r2 = e8.eg0.f14479a
            r5 = 21
            if (r2 < r5) goto L_0x0370
            float r0 = r0.f13926t
            double r8 = (double) r0
            boolean r2 = r1.a(r3, r4, r8)
            goto L_0x03b4
        L_0x0370:
            int r3 = r3 * r4
            int r2 = com.google.android.gms.internal.ads.tt.c()
            if (r3 > r2) goto L_0x037a
            r2 = 1
            goto L_0x037b
        L_0x037a:
            r2 = 0
        L_0x037b:
            if (r2 != 0) goto L_0x03b4
            int r3 = r0.f13924r
            int r0 = r0.f13925s
            java.lang.String r4 = e8.eg0.f14483e
            r5 = 56
            int r5 = androidx.appcompat.widget.o.a(r4, r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r5)
            java.lang.String r5 = "FalseCheck [legacyFrameSize, "
            r8.append(r5)
            r8.append(r3)
            java.lang.String r3 = "x"
            r8.append(r3)
            r8.append(r0)
            java.lang.String r0 = "] ["
            r8.append(r0)
            r8.append(r4)
            java.lang.String r0 = "]"
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r3 = "MediaCodecVideoRenderer"
            android.util.Log.d(r3, r0)
        L_0x03b4:
            boolean r0 = r1.f13989b
            if (r0 == 0) goto L_0x03ba
            r6 = 8
        L_0x03ba:
            boolean r0 = r1.f13990c
            if (r0 == 0) goto L_0x03c1
            r0 = 16
            goto L_0x03c2
        L_0x03c1:
            r0 = 0
        L_0x03c2:
            if (r2 == 0) goto L_0x03c5
            goto L_0x03c6
        L_0x03c5:
            r7 = 2
        L_0x03c6:
            r0 = r0 | r6
            r0 = r0 | r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nu.B(com.google.android.gms.internal.ads.st, e8.bc0):int");
    }

    public final void D(ad0 ad0) {
        int i10 = eg0.f14479a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012e, code lost:
        r20 = r7;
        r19 = r8;
        r3 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0133 A[EDGE_INSN: B:85:0x0133->B:64:0x0133 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(e8.be0 r22, android.media.MediaCodec r23, e8.bc0 r24, android.media.MediaCrypto r25) throws e8.ee0 {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            e8.bc0[] r3 = r0.Z
            int r4 = r2.f13924r
            int r5 = r2.f13925s
            int r6 = r2.f13921g
            r7 = -1
            if (r6 == r7) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            java.lang.String r6 = r2.f13920f
            int r6 = O(r6, r4, r5)
        L_0x0018:
            int r8 = r3.length
            r9 = 1
            if (r8 != r9) goto L_0x0023
            e8.wc r3 = new e8.wc
            r3.<init>(r4, r5, r6, r9)
            goto L_0x0160
        L_0x0023:
            int r8 = r3.length
            r9 = 0
            r10 = 0
        L_0x0026:
            if (r9 >= r8) goto L_0x005f
            r11 = r3[r9]
            boolean r12 = r1.f13989b
            boolean r12 = P(r12, r2, r11)
            if (r12 == 0) goto L_0x005c
            int r12 = r11.f13924r
            if (r12 == r7) goto L_0x003d
            int r13 = r11.f13925s
            if (r13 != r7) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r13 = 0
            goto L_0x003e
        L_0x003d:
            r13 = 1
        L_0x003e:
            r10 = r10 | r13
            int r4 = java.lang.Math.max(r4, r12)
            int r12 = r11.f13925s
            int r5 = java.lang.Math.max(r5, r12)
            int r12 = r11.f13921g
            if (r12 == r7) goto L_0x004e
            goto L_0x0058
        L_0x004e:
            java.lang.String r12 = r11.f13920f
            int r13 = r11.f13924r
            int r11 = r11.f13925s
            int r12 = O(r12, r13, r11)
        L_0x0058:
            int r6 = java.lang.Math.max(r6, r12)
        L_0x005c:
            int r9 = r9 + 1
            goto L_0x0026
        L_0x005f:
            if (r10 == 0) goto L_0x015a
            r3 = 66
            java.lang.String r7 = "Resolutions unknown. Codec max resolution: "
            java.lang.String r8 = "x"
            java.lang.String r3 = e8.y9.a(r3, r7, r4, r8, r5)
            java.lang.String r7 = "MediaCodecVideoRenderer"
            android.util.Log.w(r7, r3)
            int r3 = r2.f13925s
            int r9 = r2.f13924r
            if (r3 <= r9) goto L_0x0078
            r10 = 1
            goto L_0x0079
        L_0x0078:
            r10 = 0
        L_0x0079:
            if (r10 == 0) goto L_0x007d
            r11 = r3
            goto L_0x007e
        L_0x007d:
            r11 = r9
        L_0x007e:
            if (r10 == 0) goto L_0x0081
            r3 = r9
        L_0x0081:
            float r9 = (float) r3
            float r12 = (float) r11
            float r9 = r9 / r12
            int[] r12 = f7635w0
            int r13 = r12.length
            r14 = 0
        L_0x0088:
            if (r14 >= r13) goto L_0x012e
            r15 = r12[r14]
            r25 = r12
            float r12 = (float) r15
            float r12 = r12 * r9
            int r12 = (int) r12
            if (r15 <= r11) goto L_0x012e
            if (r12 > r3) goto L_0x0098
            goto L_0x012e
        L_0x0098:
            r16 = r3
            int r3 = e8.eg0.f14479a
            r17 = r9
            r9 = 21
            if (r3 < r9) goto L_0x00f2
            if (r10 == 0) goto L_0x00a6
            r3 = r12
            goto L_0x00a7
        L_0x00a6:
            r3 = r15
        L_0x00a7:
            if (r10 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r15 = r12
        L_0x00ab:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r1.f13993f
            if (r9 != 0) goto L_0x00b5
            java.lang.String r3 = "align.caps"
            r1.c(r3)
            goto L_0x00c0
        L_0x00b5:
            android.media.MediaCodecInfo$VideoCapabilities r9 = r9.getVideoCapabilities()
            if (r9 != 0) goto L_0x00c4
            java.lang.String r3 = "align.vCaps"
            r1.c(r3)
        L_0x00c0:
            r3 = 0
            r18 = r11
            goto L_0x00e0
        L_0x00c4:
            int r12 = r9.getWidthAlignment()
            int r9 = r9.getHeightAlignment()
            r18 = r11
            android.graphics.Point r11 = new android.graphics.Point
            int r3 = e8.eg0.h(r3, r12)
            int r3 = r3 * r12
            int r12 = e8.eg0.h(r15, r9)
            int r12 = r12 * r9
            r11.<init>(r3, r12)
            r3 = r11
        L_0x00e0:
            float r9 = r2.f13926t
            int r11 = r3.x
            int r12 = r3.y
            r20 = r7
            r19 = r8
            double r7 = (double) r9
            boolean r7 = r1.a(r11, r12, r7)
            if (r7 == 0) goto L_0x011e
            goto L_0x0133
        L_0x00f2:
            r20 = r7
            r19 = r8
            r18 = r11
            r3 = 16
            int r7 = e8.eg0.h(r15, r3)
            int r7 = r7 << 4
            int r3 = e8.eg0.h(r12, r3)
            int r3 = r3 << 4
            int r8 = r7 * r3
            int r9 = com.google.android.gms.internal.ads.tt.c()
            if (r8 > r9) goto L_0x011e
            android.graphics.Point r8 = new android.graphics.Point
            if (r10 == 0) goto L_0x0114
            r9 = r3
            goto L_0x0115
        L_0x0114:
            r9 = r7
        L_0x0115:
            if (r10 == 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r7 = r3
        L_0x0119:
            r8.<init>(r9, r7)
            r3 = r8
            goto L_0x0133
        L_0x011e:
            int r14 = r14 + 1
            r12 = r25
            r3 = r16
            r9 = r17
            r11 = r18
            r8 = r19
            r7 = r20
            goto L_0x0088
        L_0x012e:
            r20 = r7
            r19 = r8
            r3 = 0
        L_0x0133:
            if (r3 == 0) goto L_0x015a
            int r7 = r3.x
            int r4 = java.lang.Math.max(r4, r7)
            int r3 = r3.y
            int r5 = java.lang.Math.max(r5, r3)
            java.lang.String r3 = r2.f13920f
            int r3 = O(r3, r4, r5)
            int r6 = java.lang.Math.max(r6, r3)
            r3 = 57
            java.lang.String r7 = "Codec max resolution adjusted to: "
            r8 = r19
            java.lang.String r3 = e8.y9.a(r3, r7, r4, r8, r5)
            r7 = r20
            android.util.Log.w(r7, r3)
        L_0x015a:
            e8.wc r3 = new e8.wc
            r7 = 1
            r3.<init>(r4, r5, r6, r7)
        L_0x0160:
            r0.f7636a0 = r3
            boolean r4 = r0.X
            android.media.MediaFormat r2 = r24.k()
            int r5 = r3.f17237a
            java.lang.String r6 = "max-width"
            r2.setInteger(r6, r5)
            int r5 = r3.f17238b
            java.lang.String r6 = "max-height"
            r2.setInteger(r6, r5)
            int r3 = r3.f17239c
            r5 = -1
            if (r3 == r5) goto L_0x0180
            java.lang.String r5 = "max-input-size"
            r2.setInteger(r5, r3)
        L_0x0180:
            if (r4 == 0) goto L_0x0188
            java.lang.String r3 = "auto-frc"
            r4 = 0
            r2.setInteger(r3, r4)
        L_0x0188:
            android.view.Surface r3 = r0.f7637b0
            if (r3 != 0) goto L_0x01a7
            boolean r3 = r1.f13991d
            boolean r3 = r0.Y(r3)
            o.a.c(r3)
            android.view.Surface r3 = r0.f7638c0
            if (r3 != 0) goto L_0x01a3
            android.content.Context r3 = r0.T
            boolean r1 = r1.f13991d
            e8.ig0 r1 = e8.ig0.a(r3, r1)
            r0.f7638c0 = r1
        L_0x01a3:
            android.view.Surface r1 = r0.f7638c0
            r0.f7637b0 = r1
        L_0x01a7:
            android.view.Surface r1 = r0.f7637b0
            r3 = 0
            r4 = 0
            r5 = r23
            r5.configure(r2, r1, r3, r4)
            int r1 = e8.eg0.f14479a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nu.E(e8.be0, android.media.MediaCodec, e8.bc0, android.media.MediaCrypto):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r22, long r24, android.media.MediaCodec r26, java.nio.ByteBuffer r27, int r28, int r29, long r30, boolean r32) {
        /*
            r21 = this;
            r0 = r21
            r1 = r26
            r2 = r28
            r3 = r30
        L_0x0008:
            int r5 = r0.f7657v0
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0022
            long[] r8 = r0.Y
            r9 = r8[r7]
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0022
            r9 = r8[r7]
            r0.f7656u0 = r9
            int r5 = r5 + -1
            r0.f7657v0 = r5
            java.lang.System.arraycopy(r8, r6, r8, r7, r5)
            goto L_0x0008
        L_0x0022:
            java.lang.String r5 = "skipVideoBuffer"
            if (r32 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.xs.a(r5)
            r1.releaseOutputBuffer(r2, r7)
            com.google.android.gms.internal.ads.xs.b()
            e8.yc0 r1 = r0.R
            int r2 = r1.f17602e
            int r2 = r2 + r6
            r1.f17602e = r2
            return r6
        L_0x0037:
            long r8 = r3 - r22
            android.view.Surface r10 = r0.f7637b0
            android.view.Surface r11 = r0.f7638c0
            r12 = -30000(0xffffffffffff8ad0, double:NaN)
            if (r10 != r11) goto L_0x005c
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r3 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.xs.a(r5)
            r1.releaseOutputBuffer(r2, r7)
            com.google.android.gms.internal.ads.xs.b()
            e8.yc0 r1 = r0.R
            int r2 = r1.f17602e
            int r2 = r2 + r6
            r1.f17602e = r2
            return r6
        L_0x005b:
            return r7
        L_0x005c:
            boolean r5 = r0.f7640e0
            r10 = 21
            if (r5 != 0) goto L_0x0072
            int r3 = e8.eg0.f14479a
            if (r3 < r10) goto L_0x006e
            long r3 = java.lang.System.nanoTime()
            r0.Q(r1, r2, r3)
            goto L_0x0071
        L_0x006e:
            r0.R(r1, r2)
        L_0x0071:
            return r6
        L_0x0072:
            int r5 = r0.f8146d
            r11 = 2
            if (r5 == r11) goto L_0x0078
            return r7
        L_0x0078:
            long r14 = android.os.SystemClock.elapsedRealtime()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r16
            long r14 = r14 - r24
            long r8 = r8 - r14
            long r14 = java.lang.System.nanoTime()
            long r8 = r8 * r16
            long r8 = r8 + r14
            e8.ng0 r5 = r0.U
            long r10 = r3 * r16
            boolean r12 = r5.f15685h
            if (r12 == 0) goto L_0x00d2
            long r12 = r5.f15682e
            int r18 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r18 == 0) goto L_0x00a4
            long r12 = r5.f15688k
            r18 = 1
            long r12 = r12 + r18
            r5.f15688k = r12
            long r12 = r5.f15684g
            r5.f15683f = r12
        L_0x00a4:
            long r12 = r5.f15688k
            r18 = 6
            int r20 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r20 < 0) goto L_0x00c9
            long r6 = r5.f15687j
            long r6 = r10 - r6
            long r6 = r6 / r12
            long r12 = r5.f15683f
            long r12 = r12 + r6
            boolean r6 = r5.a(r12, r8)
            if (r6 == 0) goto L_0x00be
            r6 = 0
            r5.f15685h = r6
            goto L_0x00d2
        L_0x00be:
            long r6 = r5.f15686i
            long r6 = r6 + r12
            r23 = r12
            long r12 = r5.f15687j
            long r6 = r6 - r12
            r12 = r23
            goto L_0x00d4
        L_0x00c9:
            boolean r6 = r5.a(r10, r8)
            if (r6 == 0) goto L_0x00d2
            r6 = 0
            r5.f15685h = r6
        L_0x00d2:
            r6 = r8
            r12 = r10
        L_0x00d4:
            boolean r0 = r5.f15685h
            r1 = 0
            if (r0 != 0) goto L_0x00e3
            r5.f15687j = r10
            r5.f15686i = r8
            r5.f15688k = r1
            r0 = 1
            r5.f15685h = r0
        L_0x00e3:
            r5.f15682e = r3
            r5.f15684g = r12
            e8.mg0 r0 = r5.f15678a
            if (r0 == 0) goto L_0x0115
            long r3 = r0.f15508a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00f2
            goto L_0x0115
        L_0x00f2:
            e8.mg0 r0 = r5.f15678a
            long r0 = r0.f15508a
            long r2 = r5.f15680c
            long r8 = r6 - r0
            long r8 = r8 / r2
            long r8 = r8 * r2
            long r8 = r8 + r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0105
            long r0 = r8 - r2
            goto L_0x0108
        L_0x0105:
            long r2 = r2 + r8
            r0 = r8
            r8 = r2
        L_0x0108:
            long r2 = r8 - r6
            long r6 = r6 - r0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r8 = r0
        L_0x0111:
            long r0 = r5.f15681d
            long r6 = r8 - r0
        L_0x0115:
            long r0 = r6 - r14
            long r0 = r0 / r16
            r2 = -30000(0xffffffffffff8ad0, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0121
            r2 = 1
            goto L_0x0122
        L_0x0121:
            r2 = 0
        L_0x0122:
            if (r2 == 0) goto L_0x015a
            java.lang.String r0 = "dropVideoBuffer"
            com.google.android.gms.internal.ads.xs.a(r0)
            r2 = r26
            r3 = r28
            r0 = 0
            r2.releaseOutputBuffer(r3, r0)
            com.google.android.gms.internal.ads.xs.b()
            r4 = r21
            e8.yc0 r0 = r4.R
            int r1 = r0.f17603f
            r5 = 1
            int r1 = r1 + r5
            r0.f17603f = r1
            int r1 = r4.f7643h0
            int r1 = r1 + r5
            r4.f7643h0 = r1
            int r1 = r4.f7644i0
            int r1 = r1 + r5
            r4.f7644i0 = r1
            int r2 = r0.f17604g
            int r1 = java.lang.Math.max(r1, r2)
            r0.f17604g = r1
            int r0 = r4.f7643h0
            int r1 = r4.W
            if (r0 != r1) goto L_0x0159
            r21.X()
        L_0x0159:
            return r5
        L_0x015a:
            r4 = r21
            r2 = r26
            r3 = r28
            r5 = 1
            int r8 = e8.eg0.f14479a
            r9 = 21
            if (r8 < r9) goto L_0x0172
            r8 = 50000(0xc350, double:2.47033E-319)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0193
            r4.Q(r2, r3, r6)
            return r5
        L_0x0172:
            r5 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0193
            r5 = 11000(0x2af8, double:5.4347E-320)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x018e
            r5 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 - r5
            long r0 = r0 / r16
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0187 }
            goto L_0x018e
        L_0x0187:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x018e:
            r4.R(r2, r3)
            r0 = 1
            return r0
        L_0x0193:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nu.F(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    public final boolean G(MediaCodec mediaCodec, boolean z10, bc0 bc0, bc0 bc02) {
        if (!P(z10, bc0, bc02)) {
            return false;
        }
        int i10 = bc02.f13924r;
        wc wcVar = this.f7636a0;
        return i10 <= wcVar.f17237a && bc02.f13925s <= wcVar.f17238b && bc02.f13921g <= wcVar.f17239c;
    }

    public final boolean H(be0 be0) {
        return this.f7637b0 != null || Y(be0.f13991d);
    }

    public final void I(String str, long j10, long j11) {
        gf0 gf0 = this.V;
        if (((og0) gf0.f14777c) != null) {
            ((Handler) gf0.f14776b).post(new nc0(gf0, str, j10, j11));
        }
    }

    public final void J(bc0 bc0) throws rb0 {
        super.J(bc0);
        gf0 gf0 = this.V;
        if (((og0) gf0.f14777c) != null) {
            ((Handler) gf0.f14776b).post(new i(gf0, bc0));
        }
        float f10 = bc0.f13928v;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f7646k0 = f10;
        int i10 = bc0.f13927u;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f7645j0 = i10;
    }

    public final void M() {
        try {
            super.M();
            Surface surface = this.f7638c0;
            if (surface != null) {
                if (this.f7637b0 == surface) {
                    this.f7637b0 = null;
                }
                surface.release();
                this.f7638c0 = null;
            }
        } catch (Throwable th) {
            if (this.f7638c0 != null) {
                Surface surface2 = this.f7637b0;
                Surface surface3 = this.f7638c0;
                if (surface2 == surface3) {
                    this.f7637b0 = null;
                }
                surface3.release();
                this.f7638c0 = null;
            }
            throw th;
        }
    }

    @TargetApi(21)
    public final void Q(MediaCodec mediaCodec, int i10, long j10) {
        V();
        xs.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j10);
        xs.b();
        this.R.f17601d++;
        this.f7644i0 = 0;
        T();
    }

    public final void R(MediaCodec mediaCodec, int i10) {
        V();
        xs.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        xs.b();
        this.R.f17601d++;
        this.f7644i0 = 0;
        T();
    }

    public final void S() {
        this.f7640e0 = false;
        int i10 = eg0.f14479a;
    }

    public final void T() {
        if (!this.f7640e0) {
            this.f7640e0 = true;
            gf0 gf0 = this.V;
            Surface surface = this.f7637b0;
            if (((og0) gf0.f14777c) != null) {
                ((Handler) gf0.f14776b).post(new m(gf0, surface));
            }
        }
    }

    public final void U() {
        this.f7651p0 = -1;
        this.f7652q0 = -1;
        this.f7654s0 = -1.0f;
        this.f7653r0 = -1;
    }

    public final void V() {
        int i10 = this.f7651p0;
        int i11 = this.f7647l0;
        if (i10 != i11 || this.f7652q0 != this.f7648m0 || this.f7653r0 != this.f7649n0 || this.f7654s0 != this.f7650o0) {
            this.V.g(i11, this.f7648m0, this.f7649n0, this.f7650o0);
            this.f7651p0 = this.f7647l0;
            this.f7652q0 = this.f7648m0;
            this.f7653r0 = this.f7649n0;
            this.f7654s0 = this.f7650o0;
        }
    }

    public final void W() {
        if (this.f7651p0 != -1 || this.f7652q0 != -1) {
            this.V.g(this.f7647l0, this.f7648m0, this.f7649n0, this.f7650o0);
        }
    }

    public final void X() {
        if (this.f7643h0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f7642g0;
            gf0 gf0 = this.V;
            int i10 = this.f7643h0;
            if (((og0) gf0.f14777c) != null) {
                ((Handler) gf0.f14776b).post(new qg0(gf0, i10, j10));
            }
            this.f7643h0 = 0;
            this.f7642g0 = elapsedRealtime;
        }
    }

    public final boolean Y(boolean z10) {
        if (eg0.f14479a >= 23) {
            return !z10 || ig0.b(this.T);
        }
        return false;
    }

    public final boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.f7640e0 || (((surface = this.f7638c0) != null && this.f7637b0 == surface) || this.f8061r == null))) {
            this.f7641f0 = -9223372036854775807L;
            return true;
        } else if (this.f7641f0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f7641f0) {
                return true;
            }
            this.f7641f0 = -9223372036854775807L;
            return false;
        }
    }

    public final void m(int i10, Object obj) throws rb0 {
        if (i10 == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f7638c0;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    be0 be0 = this.f8062s;
                    if (be0 != null && Y(be0.f13991d)) {
                        surface = ig0.a(this.T, be0.f13991d);
                        this.f7638c0 = surface;
                    }
                }
            }
            if (this.f7637b0 != surface) {
                this.f7637b0 = surface;
                int i11 = this.f8146d;
                if (i11 == 1 || i11 == 2) {
                    MediaCodec mediaCodec = this.f8061r;
                    if (eg0.f14479a < 23 || mediaCodec == null || surface == null) {
                        M();
                        L();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f7638c0) {
                    U();
                    S();
                    return;
                }
                W();
                S();
                if (i11 == 2) {
                    this.f7641f0 = -9223372036854775807L;
                }
            } else if (surface != null && surface != this.f7638c0) {
                W();
                if (this.f7640e0) {
                    gf0 gf0 = this.V;
                    Surface surface3 = this.f7637b0;
                    if (((og0) gf0.f14777c) != null) {
                        ((Handler) gf0.f14776b).post(new m(gf0, surface3));
                    }
                }
            }
        } else if (i10 == 4) {
            int intValue = ((Integer) obj).intValue();
            this.f7639d0 = intValue;
            MediaCodec mediaCodec2 = this.f8061r;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(intValue);
            }
        }
    }

    public final void t() {
        this.f7643h0 = 0;
        this.f7642g0 = SystemClock.elapsedRealtime();
        this.f7641f0 = -9223372036854775807L;
    }

    public final void u() {
        X();
    }

    public final void w(long j10, boolean z10) throws rb0 {
        super.w(j10, z10);
        S();
        this.f7644i0 = 0;
        int i10 = this.f7657v0;
        if (i10 != 0) {
            this.f7656u0 = this.Y[i10 - 1];
            this.f7657v0 = 0;
        }
        if (z10) {
            this.f7641f0 = -9223372036854775807L;
        } else {
            this.f7641f0 = -9223372036854775807L;
        }
    }

    public final void x(bc0[] bc0Arr, long j10) throws rb0 {
        this.Z = bc0Arr;
        if (this.f7656u0 == -9223372036854775807L) {
            this.f7656u0 = j10;
            return;
        }
        int i10 = this.f7657v0;
        long[] jArr = this.Y;
        if (i10 == jArr.length) {
            long j11 = jArr[i10 - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j11);
            Log.w("MediaCodecVideoRenderer", sb2.toString());
        } else {
            this.f7657v0 = i10 + 1;
        }
        this.Y[this.f7657v0 - 1] = j10;
    }

    public final void y(boolean z10) throws rb0 {
        this.R = new yc0();
        this.f8144b.getClass();
        gf0 gf0 = this.V;
        yc0 yc0 = this.R;
        if (((og0) gf0.f14777c) != null) {
            ((Handler) gf0.f14776b).post(new pg0(gf0, yc0, 0));
        }
        ng0 ng0 = this.U;
        ng0.f15685h = false;
        if (ng0.f15679b) {
            ng0.f15678a.f15509b.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void z() {
        this.f7647l0 = -1;
        this.f7648m0 = -1;
        this.f7650o0 = -1.0f;
        this.f7646k0 = -1.0f;
        this.f7656u0 = -9223372036854775807L;
        this.f7657v0 = 0;
        U();
        S();
        ng0 ng0 = this.U;
        if (ng0.f15679b) {
            ng0.f15678a.f15509b.sendEmptyMessage(2);
        }
        this.f7655t0 = null;
        try {
            super.z();
            synchronized (this.R) {
            }
            gf0 gf0 = this.V;
            yc0 yc0 = this.R;
            if (((og0) gf0.f14777c) != null) {
                ((Handler) gf0.f14776b).post(new pg0(gf0, yc0, 1));
            }
        } catch (Throwable th) {
            synchronized (this.R) {
                gf0 gf02 = this.V;
                yc0 yc02 = this.R;
                if (((og0) gf02.f14777c) != null) {
                    ((Handler) gf02.f14776b).post(new pg0(gf02, yc02, 1));
                }
                throw th;
            }
        }
    }
}
