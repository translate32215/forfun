package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.startapp.b4;
import e8.dc0;
import e8.eg0;
import e8.kc0;
import e8.lc0;
import e8.mc0;
import e8.oc0;
import e8.pc0;
import e8.qc0;
import e8.rc0;
import e8.sb0;
import e8.sc0;
import e8.tc0;
import e8.uc0;
import e8.vc0;
import e8.y10;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import l0.d;
import o.a;
import t1.c;
import u7.m;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zs {
    public long A;
    public Method B;
    public int C;
    public long D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public int J;
    public long K;
    public long L;
    public long M;
    public float N;
    public ys[] O;
    public ByteBuffer[] P;
    public ByteBuffer Q;
    public ByteBuffer R;
    public byte[] S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public long Z;

    /* renamed from: a  reason: collision with root package name */
    public final at f8733a;

    /* renamed from: b  reason: collision with root package name */
    public final dt f8734b;

    /* renamed from: c  reason: collision with root package name */
    public final ys[] f8735c;

    /* renamed from: d  reason: collision with root package name */
    public final y10 f8736d;

    /* renamed from: e  reason: collision with root package name */
    public final ConditionVariable f8737e = new ConditionVariable(true);

    /* renamed from: f  reason: collision with root package name */
    public final long[] f8738f;

    /* renamed from: g  reason: collision with root package name */
    public final rc0 f8739g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedList<uc0> f8740h;

    /* renamed from: i  reason: collision with root package name */
    public AudioTrack f8741i;

    /* renamed from: j  reason: collision with root package name */
    public int f8742j;

    /* renamed from: k  reason: collision with root package name */
    public int f8743k;

    /* renamed from: l  reason: collision with root package name */
    public int f8744l;

    /* renamed from: m  reason: collision with root package name */
    public int f8745m;

    /* renamed from: n  reason: collision with root package name */
    public int f8746n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8747o;

    /* renamed from: p  reason: collision with root package name */
    public int f8748p;

    /* renamed from: q  reason: collision with root package name */
    public long f8749q;

    /* renamed from: r  reason: collision with root package name */
    public dc0 f8750r;

    /* renamed from: s  reason: collision with root package name */
    public dc0 f8751s;

    /* renamed from: t  reason: collision with root package name */
    public long f8752t;

    /* renamed from: u  reason: collision with root package name */
    public long f8753u;

    /* renamed from: v  reason: collision with root package name */
    public int f8754v;

    /* renamed from: w  reason: collision with root package name */
    public int f8755w;

    /* renamed from: x  reason: collision with root package name */
    public long f8756x;

    /* renamed from: y  reason: collision with root package name */
    public long f8757y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8758z;

    public zs(ys[] ysVarArr, y10 y10) {
        this.f8736d = y10;
        if (eg0.f14479a >= 18) {
            try {
                this.B = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (eg0.f14479a >= 19) {
            this.f8739g = new qc0();
        } else {
            this.f8739g = new rc0((pc0) null);
        }
        at atVar = new at();
        this.f8733a = atVar;
        dt dtVar = new dt();
        this.f8734b = dtVar;
        ys[] ysVarArr2 = new ys[(ysVarArr.length + 3)];
        this.f8735c = ysVarArr2;
        ysVarArr2[0] = new ct();
        ysVarArr2[1] = atVar;
        System.arraycopy(ysVarArr, 0, ysVarArr2, 2, ysVarArr.length);
        ysVarArr2[ysVarArr.length + 2] = dtVar;
        this.f8738f = new long[10];
        this.N = 1.0f;
        this.J = 0;
        this.f8746n = 3;
        this.X = 0;
        this.f8751s = dc0.f14249d;
        this.U = -1;
        this.O = new ys[0];
        this.P = new ByteBuffer[0];
        this.f8740h = new LinkedList<>();
    }

    public final boolean a() {
        return this.f8741i != null;
    }

    public final void b() {
        this.W = true;
        if (a()) {
            this.L = System.nanoTime() / 1000;
            this.f8741i.play();
        }
    }

    public final void c() {
        if (a()) {
            this.D = 0;
            this.E = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            dc0 dc0 = this.f8750r;
            if (dc0 != null) {
                this.f8751s = dc0;
                this.f8750r = null;
            } else if (!this.f8740h.isEmpty()) {
                this.f8751s = this.f8740h.getLast().f16872a;
            }
            this.f8740h.clear();
            this.f8752t = 0;
            this.f8753u = 0;
            this.Q = null;
            this.R = null;
            int i10 = 0;
            while (true) {
                ys[] ysVarArr = this.O;
                if (i10 >= ysVarArr.length) {
                    break;
                }
                ys ysVar = ysVarArr[i10];
                ysVar.flush();
                this.P[i10] = ysVar.i();
                i10++;
            }
            this.V = false;
            this.U = -1;
            this.J = 0;
            this.M = 0;
            this.f8756x = 0;
            this.f8755w = 0;
            this.f8754v = 0;
            this.f8757y = 0;
            this.f8758z = false;
            this.A = 0;
            if (this.f8741i.getPlayState() == 3) {
                this.f8741i.pause();
            }
            AudioTrack audioTrack = this.f8741i;
            this.f8741i = null;
            this.f8739g.a((AudioTrack) null, false);
            this.f8737e.close();
            new pc0(this, audioTrack).start();
        }
    }

    public final void d(String str, int i10, int i11, int i12, int[] iArr) throws tc0 {
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        long j10;
        String str2 = str;
        int i17 = i11;
        boolean z11 = true;
        boolean z12 = !"audio/raw".equals(str2);
        if (z12) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1095064472:
                    if (str2.equals("audio/vnd.dts")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 187078296:
                    if (str2.equals("audio/ac3")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1504578661:
                    if (str2.equals("audio/eac3")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1505942594:
                    if (str2.equals("audio/vnd.dts.hd")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i13 = 7;
                    break;
                case 1:
                    i13 = 5;
                    break;
                case 2:
                    i13 = 6;
                    break;
                case 3:
                    i13 = 8;
                    break;
                default:
                    i13 = 0;
                    break;
            }
        } else {
            i13 = i12;
        }
        if (!z12) {
            i14 = i10;
            this.C = eg0.i(i12, i14);
            this.f8733a.f5977d = iArr;
            ys[] ysVarArr = this.f8735c;
            int length = ysVarArr.length;
            int i18 = 0;
            z10 = false;
            while (i18 < length) {
                ys ysVar = ysVarArr[i18];
                try {
                    z10 |= ysVar.d(i17, i14, i13);
                    if (ysVar.a()) {
                        i14 = ysVar.c();
                        i13 = ysVar.e();
                    }
                    i18++;
                } catch (lc0 e10) {
                    throw new tc0((Throwable) e10);
                }
            }
            if (z10) {
                k();
            }
        } else {
            i14 = i10;
            z10 = false;
        }
        switch (i14) {
            case 1:
                i15 = 4;
                break;
            case 2:
                i15 = 12;
                break;
            case 3:
                i15 = 28;
                break;
            case 4:
                i15 = 204;
                break;
            case 5:
                i15 = 220;
                break;
            case 6:
                i15 = 252;
                break;
            case 7:
                i15 = 1276;
                break;
            case b4.f10106f /*8*/:
                i15 = sb0.f16388a;
                break;
            default:
                throw new tc0(d.a(38, "Unsupported channel count: ", i14));
        }
        int i19 = eg0.f14479a;
        if (i19 <= 23 && "foster".equals(eg0.f14480b) && "NVIDIA".equals(eg0.f14481c)) {
            if (i14 == 3 || i14 == 5) {
                i15 = 252;
            } else if (i14 == 7) {
                i15 = sb0.f16388a;
            }
        }
        if (i19 <= 25 && "fugu".equals(eg0.f14480b) && z12 && i14 == 1) {
            i15 = 12;
        }
        if (z10 || !a() || this.f8744l != i13 || this.f8742j != i17 || this.f8743k != i15) {
            c();
            this.f8744l = i13;
            this.f8747o = z12;
            this.f8742j = i17;
            this.f8743k = i15;
            if (!z12) {
                i13 = 2;
            }
            this.f8745m = i13;
            this.F = eg0.i(2, i14);
            if (z12) {
                int i20 = this.f8745m;
                i16 = (i20 == 5 || i20 == 6) ? 20480 : 49152;
            } else {
                int minBufferSize = AudioTrack.getMinBufferSize(i17, i15, this.f8745m);
                if (minBufferSize == -2) {
                    z11 = false;
                }
                a.c(z11);
                int i21 = minBufferSize << 2;
                int j11 = this.F * ((int) j(250000));
                i16 = (int) Math.max((long) minBufferSize, j(750000) * ((long) this.F));
                if (i21 < j11) {
                    i16 = j11;
                } else if (i21 <= i16) {
                    i16 = i21;
                }
            }
            this.f8748p = i16;
            if (z12) {
                j10 = -9223372036854775807L;
            } else {
                j10 = i((long) (i16 / this.F));
            }
            this.f8749q = j10;
            e(this.f8751s);
        }
    }

    public final dc0 e(dc0 dc0) {
        if (this.f8747o) {
            dc0 dc02 = dc0.f14249d;
            this.f8751s = dc02;
            return dc02;
        }
        dt dtVar = this.f8734b;
        float f10 = dc0.f14250a;
        dtVar.getClass();
        int i10 = eg0.f14479a;
        float max = Math.max(0.1f, Math.min(f10, 8.0f));
        dtVar.f6244e = max;
        dt dtVar2 = this.f8734b;
        float f11 = dc0.f14251b;
        dtVar2.getClass();
        dtVar2.f6245f = Math.max(0.1f, Math.min(f11, 8.0f));
        dc0 dc03 = new dc0(max, f11);
        dc0 dc04 = this.f8750r;
        if (dc04 == null) {
            if (!this.f8740h.isEmpty()) {
                dc04 = this.f8740h.getLast().f16872a;
            } else {
                dc04 = this.f8751s;
            }
        }
        if (!dc03.equals(dc04)) {
            if (a()) {
                this.f8750r = dc03;
            } else {
                this.f8751s = dc03;
            }
        }
        return this.f8751s;
    }

    public final boolean f(ByteBuffer byteBuffer, long j10) throws sc0, vc0 {
        int i10;
        int i11;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j11 = j10;
        ByteBuffer byteBuffer3 = this.Q;
        a.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!a()) {
            this.f8737e.block();
            if (this.X == 0) {
                this.f8741i = new AudioTrack(this.f8746n, this.f8742j, this.f8743k, this.f8745m, this.f8748p, 1);
            } else {
                this.f8741i = new AudioTrack(this.f8746n, this.f8742j, this.f8743k, this.f8745m, this.f8748p, 1, this.X);
            }
            int state = this.f8741i.getState();
            if (state == 1) {
                int audioSessionId = this.f8741i.getAudioSessionId();
                if (this.X != audioSessionId) {
                    this.X = audioSessionId;
                    c cVar = ((bt) this.f8736d.f17566a).T;
                    if (((mc0) cVar.f25351c) != null) {
                        ((Handler) cVar.f25350b).post(new m(cVar, audioSessionId));
                    }
                    int i12 = bt.f6054a0;
                }
                this.f8739g.a(this.f8741i, p());
                n();
                this.Y = false;
                if (this.W) {
                    b();
                }
            } else {
                try {
                    this.f8741i.release();
                } catch (Exception unused) {
                } finally {
                    this.f8741i = null;
                }
                throw new sc0(state, this.f8742j, this.f8743k, this.f8748p);
            }
        }
        if (p()) {
            if (this.f8741i.getPlayState() == 2) {
                this.Y = false;
                return false;
            } else if (this.f8741i.getPlayState() == 1 && this.f8739g.e() != 0) {
                return false;
            }
        }
        boolean z10 = this.Y;
        boolean m10 = m();
        this.Y = m10;
        if (z10 && !m10 && this.f8741i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.Z;
            y10 y10 = this.f8736d;
            int i13 = this.f8748p;
            long a10 = sb0.a(this.f8749q);
            c cVar2 = ((bt) y10.f17566a).T;
            if (((mc0) cVar2.f25351c) != null) {
                ((Handler) cVar2.f25350b).post(new oc0(cVar2, i13, a10, elapsedRealtime));
            }
            int i14 = bt.f6054a0;
        }
        if (this.Q == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f8747o && this.I == 0) {
                int i15 = this.f8745m;
                int i16 = 6;
                if (i15 == 7 || i15 == 8) {
                    int position = byteBuffer.position();
                    i11 = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) << 5;
                } else if (i15 == 5) {
                    i11 = 1536;
                } else if (i15 == 6) {
                    if (((byteBuffer2.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                        i16 = kc0.f15271a[(byteBuffer2.get(byteBuffer.position() + 4) & 48) >> 4];
                    }
                    i11 = i16 * 256;
                } else {
                    throw new IllegalStateException(d.a(38, "Unexpected audio encoding: ", i15));
                }
                this.I = i11;
            }
            if (this.f8750r != null) {
                if (!l()) {
                    return false;
                }
                this.f8740h.add(new uc0(this.f8750r, Math.max(0, j11), i(o()), (pc0) null));
                this.f8750r = null;
                k();
            }
            if (this.J == 0) {
                this.K = Math.max(0, j11);
                this.J = 1;
            } else {
                long i17 = i(this.f8747o ? this.E : this.D / ((long) this.C)) + this.K;
                if (this.J != 1 || Math.abs(i17 - j11) <= 200000) {
                    i10 = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(i17);
                    sb2.append(", got ");
                    sb2.append(j11);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i10 = 2;
                    this.J = 2;
                }
                if (this.J == i10) {
                    this.K = (j11 - i17) + this.K;
                    this.J = 1;
                    y10 y102 = this.f8736d;
                    y102.getClass();
                    int i18 = bt.f6054a0;
                    ((bt) y102.f17566a).Z = true;
                }
            }
            if (this.f8747o) {
                this.E += (long) this.I;
            } else {
                this.D += (long) byteBuffer.remaining();
            }
            this.Q = byteBuffer2;
        }
        if (this.f8747o) {
            g(this.Q, j11);
        } else {
            h(j11);
        }
        if (this.Q.hasRemaining()) {
            return false;
        }
        this.Q = null;
        return true;
    }

    public final boolean g(ByteBuffer byteBuffer, long j10) throws vc0 {
        int i10;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.R;
        if (byteBuffer2 != null) {
            a.a(byteBuffer2 == byteBuffer);
        } else {
            this.R = byteBuffer;
            if (eg0.f14479a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.S;
                if (bArr == null || bArr.length < remaining) {
                    this.S = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.S, 0, remaining);
                byteBuffer.position(position);
                this.T = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (eg0.f14479a < 21) {
            int e10 = this.f8748p - ((int) (this.G - (this.f8739g.e() * ((long) this.F))));
            if (e10 > 0) {
                i10 = this.f8741i.write(this.S, this.T, Math.min(remaining2, e10));
                if (i10 > 0) {
                    this.T += i10;
                    byteBuffer.position(byteBuffer.position() + i10);
                }
            } else {
                i10 = 0;
            }
        } else {
            i10 = this.f8741i.write(byteBuffer, remaining2, 1);
        }
        this.Z = SystemClock.elapsedRealtime();
        if (i10 >= 0) {
            boolean z10 = this.f8747o;
            if (!z10) {
                this.G += (long) i10;
            }
            if (i10 != remaining2) {
                return false;
            }
            if (z10) {
                this.H += (long) this.I;
            }
            this.R = null;
            return true;
        }
        throw new vc0(i10);
    }

    public final void h(long j10) throws vc0 {
        ByteBuffer byteBuffer;
        int length = this.O.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.P[i10 - 1];
            } else {
                byteBuffer = this.Q;
                if (byteBuffer == null) {
                    byteBuffer = ys.f8641a;
                }
            }
            if (i10 == length) {
                g(byteBuffer, j10);
            } else {
                ys ysVar = this.O[i10];
                ysVar.h(byteBuffer);
                ByteBuffer i11 = ysVar.i();
                this.P[i10] = i11;
                if (i11.hasRemaining()) {
                    i10++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i10--;
            } else {
                return;
            }
        }
    }

    public final long i(long j10) {
        return (j10 * 1000000) / ((long) this.f8742j);
    }

    public final long j(long j10) {
        return (j10 * ((long) this.f8742j)) / 1000000;
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        for (ys ysVar : this.f8735c) {
            if (ysVar.a()) {
                arrayList.add(ysVar);
            } else {
                ysVar.flush();
            }
        }
        int size = arrayList.size();
        this.O = (ys[]) arrayList.toArray(new ys[size]);
        this.P = new ByteBuffer[size];
        for (int i10 = 0; i10 < size; i10++) {
            ys ysVar2 = this.O[i10];
            ysVar2.flush();
            this.P[i10] = ysVar2.i();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l() throws e8.vc0 {
        /*
            r9 = this;
            int r0 = r9.U
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f8747o
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.ys[] r0 = r9.O
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.U = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.U
            com.google.android.gms.internal.ads.ys[] r5 = r9.O
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.g()
        L_0x0028:
            r9.h(r7)
            boolean r0 = r4.f()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.U
            int r0 = r0 + r2
            r9.U = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.R
            if (r0 == 0) goto L_0x0044
            r9.g(r0, r7)
            java.nio.ByteBuffer r0 = r9.R
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.U = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zs.l():boolean");
    }

    public final boolean m() {
        if (a()) {
            if (o() <= this.f8739g.e()) {
                if (p() && this.f8741i.getPlayState() == 2 && this.f8741i.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final void n() {
        if (!a()) {
            return;
        }
        if (eg0.f14479a >= 21) {
            this.f8741i.setVolume(this.N);
            return;
        }
        AudioTrack audioTrack = this.f8741i;
        float f10 = this.N;
        audioTrack.setStereoVolume(f10, f10);
    }

    public final long o() {
        return this.f8747o ? this.H : this.G / ((long) this.F);
    }

    public final boolean p() {
        if (eg0.f14479a >= 23) {
            return false;
        }
        int i10 = this.f8745m;
        return i10 == 5 || i10 == 6;
    }
}
