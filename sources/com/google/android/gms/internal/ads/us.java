package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import e8.bc0;
import e8.dc0;
import e8.dg0;
import e8.ec0;
import e8.gc0;
import e8.hc0;
import e8.ic0;
import e8.kf0;
import e8.nf0;
import e8.ra;
import e8.rb0;
import e8.re0;
import e8.se0;
import e8.vb0;
import e8.xb0;
import e8.xe0;
import e8.yb0;
import e8.zb0;
import e8.zf0;
import java.io.IOException;
import o.a;
import u6.f;
import x4.c0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class us implements Handler.Callback, re0, se0, nf0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E = 0;
    public int F;
    public int G;
    public long H;
    public int I;
    public zb0 J;
    public long K;
    public vs L;
    public vs M;
    public vs N;
    public gc0 O;

    /* renamed from: a  reason: collision with root package name */
    public final ws[] f8277a;

    /* renamed from: b  reason: collision with root package name */
    public final ss[] f8278b;

    /* renamed from: c  reason: collision with root package name */
    public final iu f8279c;

    /* renamed from: d  reason: collision with root package name */
    public final ra f8280d;

    /* renamed from: e  reason: collision with root package name */
    public final dg0 f8281e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f8282f;

    /* renamed from: g  reason: collision with root package name */
    public final HandlerThread f8283g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f8284h;

    /* renamed from: i  reason: collision with root package name */
    public final vb0 f8285i;

    /* renamed from: r  reason: collision with root package name */
    public final hc0 f8286r;

    /* renamed from: s  reason: collision with root package name */
    public final ic0 f8287s;

    /* renamed from: t  reason: collision with root package name */
    public xb0 f8288t;

    /* renamed from: u  reason: collision with root package name */
    public dc0 f8289u;

    /* renamed from: v  reason: collision with root package name */
    public ws f8290v;

    /* renamed from: w  reason: collision with root package name */
    public zf0 f8291w;

    /* renamed from: x  reason: collision with root package name */
    public du f8292x;

    /* renamed from: y  reason: collision with root package name */
    public ws[] f8293y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8294z;

    public us(ws[] wsVarArr, iu iuVar, ra raVar, boolean z10, Handler handler, xb0 xb0, vb0 vb0) {
        this.f8277a = wsVarArr;
        this.f8279c = iuVar;
        this.f8280d = raVar;
        this.A = z10;
        this.f8284h = handler;
        this.D = 1;
        this.f8288t = xb0;
        this.f8285i = vb0;
        this.f8278b = new ss[wsVarArr.length];
        for (int i10 = 0; i10 < wsVarArr.length; i10++) {
            wsVarArr[i10].c(i10);
            this.f8278b[i10] = wsVarArr[i10].k();
        }
        this.f8281e = new dg0();
        this.f8293y = new ws[0];
        this.f8286r = new hc0();
        this.f8287s = new ic0();
        iuVar.f7111a = this;
        this.f8289u = dc0.f14249d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f8283g = handlerThread;
        handlerThread.start();
        this.f8282f = new Handler(handlerThread.getLooper(), this);
    }

    public static void i(vs vsVar) {
        while (vsVar != null) {
            vsVar.a();
            vsVar = vsVar.f8398l;
        }
    }

    public static void j(ws wsVar) throws rb0 {
        if (wsVar.getState() == 2) {
            wsVar.stop();
        }
    }

    public final boolean A(int i10) {
        this.O.e(i10, this.f8287s, false);
        this.O.c(0, this.f8286r);
        if (this.O.b(i10, this.f8287s, this.f8286r, this.E) == -1) {
            return true;
        }
        return false;
    }

    public final void a(int i10) {
        if (this.D != i10) {
            this.D = i10;
            this.f8284h.obtainMessage(1, i10, 0).sendToTarget();
        }
    }

    public final int b(int i10, gc0 gc0, gc0 gc02) {
        int h10 = gc0.h();
        int i11 = -1;
        for (int i12 = 0; i12 < h10 && i11 == -1; i12++) {
            i10 = gc0.b(i10, this.f8287s, this.f8286r, this.E);
            i11 = gc02.f(gc0.e(i10, this.f8287s, true).f15016b);
        }
        return i11;
    }

    public final void c(cu cuVar) {
        this.f8282f.obtainMessage(8, cuVar).sendToTarget();
    }

    public final void d(gc0 gc0, Object obj) {
        this.f8282f.obtainMessage(7, Pair.create(gc0, obj)).sendToTarget();
    }

    public final Pair<Integer, Long> e(zb0 zb0) {
        gc0 gc0 = zb0.f17709a;
        if (gc0.a()) {
            gc0 = this.O;
        }
        try {
            Pair<Integer, Long> f10 = f(gc0, zb0.f17710b, zb0.f17711c, 0);
            gc0 gc02 = this.O;
            if (gc02 == gc0) {
                return f10;
            }
            int f11 = gc02.f(gc0.e(((Integer) f10.first).intValue(), this.f8287s, true).f15016b);
            if (f11 != -1) {
                return Pair.create(Integer.valueOf(f11), (Long) f10.second);
            }
            int b10 = b(((Integer) f10.first).intValue(), gc0, this.O);
            if (b10 == -1) {
                return null;
            }
            this.O.e(b10, this.f8287s, false);
            return p();
        } catch (IndexOutOfBoundsException unused) {
            throw new c0(this.O, zb0.f17710b, zb0.f17711c);
        }
    }

    public final Pair<Integer, Long> f(gc0 gc0, int i10, long j10, long j11) {
        a.i(i10, gc0.g());
        gc0.d(i10, this.f8286r, false, j11);
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        int i11 = (gc0.e(0, this.f8287s, false).f15017c > -9223372036854775807L ? 1 : (gc0.e(0, this.f8287s, false).f15017c == -9223372036854775807L ? 0 : -1));
        return Pair.create(0, Long.valueOf(j10 + 0));
    }

    public final void g(long j10, long j11) {
        this.f8282f.removeMessages(2);
        long elapsedRealtime = (j10 + j11) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f8282f.sendEmptyMessage(2);
        } else {
            this.f8282f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final /* synthetic */ void h(xe0 xe0) {
        this.f8282f.obtainMessage(9, (cu) xe0).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0356, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0413, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0414, code lost:
        r2 = r0;
        r6 = new e8.xb0(r3, r4);
        r8.f8288t = r6;
        r3 = r8.f8284h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x041e, code lost:
        if (r1 != false) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0420, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0422, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0423, code lost:
        r3.obtainMessage(4, r1, 0, r6).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x042a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0845, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0847, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0848, code lost:
        r2 = r0;
        r1 = true;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x084e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x084f, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f8284h.obtainMessage(8, e8.rb0.c(r1)).sendToTarget();
        v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x086a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x086b, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Source error.", r1);
        r8.f8284h.obtainMessage(8, e8.rb0.a(r1)).sendToTarget();
        v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0886, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00bf, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c0, code lost:
        monitor-enter(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r8.G++;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0263 A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0264 A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0268 A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0324 A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0338 A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x04ef A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x04f6 A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x050e A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0511 A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x054a A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x055c A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0576 A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }, LOOP:8: B:329:0x0576->B:333:0x0586, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x06bc A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x076e A[Catch:{ all -> 0x0413, all -> 0x0356, all -> 0x00be, all -> 0x00cb, all -> 0x00ba, rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0845 A[ExcHandler: IOException (r0v2 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x084e A[ExcHandler: RuntimeException (r0v1 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r32) {
        /*
            r31 = this;
            r8 = r31
            r1 = r32
            r10 = 1
            int r2 = r1.what     // Catch:{ rb0 -> 0x0887, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3 = 0
            r5 = 0
            r13 = 4
            r6 = -1
            r14 = 7
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r15 = 3
            r9 = 0
            switch(r2) {
                case 0: goto L_0x080b;
                case 1: goto L_0x07dc;
                case 2: goto L_0x042b;
                case 3: goto L_0x037c;
                case 4: goto L_0x035e;
                case 5: goto L_0x035a;
                case 6: goto L_0x0343;
                case 7: goto L_0x01f1;
                case 8: goto L_0x01c1;
                case 9: goto L_0x01b0;
                case 10: goto L_0x00cf;
                case 11: goto L_0x0091;
                case 12: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = 0
            return r1
        L_0x001a:
            int r1 = r1.arg1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.E = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0025:
            if (r2 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.vs r3 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != r3) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            com.google.android.gms.internal.ads.vs r4 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != r4) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            e8.gc0 r11 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r12 = r2.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r14 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.hc0 r15 = r8.f8286r     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r11 = r11.b(r12, r14, r15, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r12 = r2.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r12 == 0) goto L_0x005d
            if (r11 == r6) goto L_0x005d
            int r14 = r12.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r14 != r11) goto L_0x005d
            com.google.android.gms.internal.ads.vs r2 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r12 != r2) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            r3 = r3 | r2
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r12 != r2) goto L_0x0059
            r2 = 1
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            r4 = r4 | r2
            r2 = r12
            goto L_0x0035
        L_0x005d:
            if (r12 == 0) goto L_0x0064
            i(r12)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.f8398l = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0064:
            int r5 = r2.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r5 = r8.A(r5)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.f8395i = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r4 != 0) goto L_0x0070
            r8.L = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0070:
            if (r3 != 0) goto L_0x0087
            com.google.android.gms.internal.ads.vs r2 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x0087
            int r2 = r2.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r3 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r3 = r3.f17461c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r3 = r8.m(r2, r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r5 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r5.<init>(r2, r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0087:
            int r2 = r8.D     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != r13) goto L_0x0090
            if (r1 == 0) goto L_0x0090
            r8.a(r7)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0090:
            return r10
        L_0x0091:
            java.lang.Object r1 = r1.obj     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ub0[] r1 = (e8.ub0[]) r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r1.length     // Catch:{ all -> 0x00be }
        L_0x0096:
            if (r9 >= r2) goto L_0x00a6
            r3 = r1[r9]     // Catch:{ all -> 0x00be }
            com.google.android.gms.internal.ads.ts r4 = r3.f16869a     // Catch:{ all -> 0x00be }
            int r5 = r3.f16870b     // Catch:{ all -> 0x00be }
            java.lang.Object r3 = r3.f16871c     // Catch:{ all -> 0x00be }
            r4.m(r5, r3)     // Catch:{ all -> 0x00be }
            int r9 = r9 + 1
            goto L_0x0096
        L_0x00a6:
            com.google.android.gms.internal.ads.du r1 = r8.f8292x     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00af
            android.os.Handler r1 = r8.f8282f     // Catch:{ all -> 0x00be }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00be }
        L_0x00af:
            monitor-enter(r31)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r1 = r8.G     // Catch:{ all -> 0x00ba }
            int r1 = r1 + r10
            r8.G = r1     // Catch:{ all -> 0x00ba }
            r31.notifyAll()     // Catch:{ all -> 0x00ba }
            monitor-exit(r31)     // Catch:{ all -> 0x00ba }
            return r10
        L_0x00ba:
            r0 = move-exception
            r1 = r0
            monitor-exit(r31)     // Catch:{ all -> 0x00ba }
            throw r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x00be:
            r0 = move-exception
            r1 = r0
            monitor-enter(r31)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r8.G     // Catch:{ all -> 0x00cb }
            int r2 = r2 + r10
            r8.G = r2     // Catch:{ all -> 0x00cb }
            r31.notifyAll()     // Catch:{ all -> 0x00cb }
            monitor-exit(r31)     // Catch:{ all -> 0x00cb }
            throw r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x00cb:
            r0 = move-exception
            r1 = r0
            monitor-exit(r31)     // Catch:{ all -> 0x00cb }
            throw r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x00cf:
            com.google.android.gms.internal.ads.vs r1 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x01af
            r2 = 1
        L_0x00d4:
            if (r1 == 0) goto L_0x01af
            boolean r3 = r1.f8396j     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 != 0) goto L_0x00dc
            goto L_0x01af
        L_0x00dc:
            boolean r3 = r1.g()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 != 0) goto L_0x00ea
            com.google.android.gms.internal.ads.vs r3 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 != r3) goto L_0x00e7
            r2 = 0
        L_0x00e7:
            com.google.android.gms.internal.ads.vs r1 = r1.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x00d4
        L_0x00ea:
            if (r2 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.vs r2 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r3 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == r3) goto L_0x00f4
            r2 = 1
            goto L_0x00f5
        L_0x00f4:
            r2 = 0
        L_0x00f5:
            com.google.android.gms.internal.ads.vs r3 = r3.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            i(r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r3 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3.f8398l = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.L = r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.M = r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.ws[] r4 = r8.f8277a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r4 = r4.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean[] r4 = new boolean[r4]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r6 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r11 = r6.f17461c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r2 = r3.b(r11, r2, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r6 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r11 = r6.f17461c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r6 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x011e
            e8.xb0 r6 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r6.f17461c = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.q(r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x011e:
            com.google.android.gms.internal.ads.ws[] r2 = r8.f8277a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r2.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean[] r2 = new boolean[r2]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3 = 0
            r6 = 0
        L_0x0125:
            com.google.android.gms.internal.ads.ws[] r11 = r8.f8277a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r12 = r11.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 >= r12) goto L_0x016f
            r11 = r11[r3]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r12 = r11.getState()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r12 == 0) goto L_0x0134
            r12 = 1
            goto L_0x0135
        L_0x0134:
            r12 = 0
        L_0x0135:
            r2[r3] = r12     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r12 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.oe0[] r12 = r12.f8390d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r12 = r12[r3]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r12 == 0) goto L_0x0141
            int r6 = r6 + 1
        L_0x0141:
            boolean r13 = r2[r3]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r13 == 0) goto L_0x016c
            e8.oe0 r13 = r11.q()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r12 == r13) goto L_0x0163
            com.google.android.gms.internal.ads.ws r13 = r8.f8290v     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r11 != r13) goto L_0x015c
            if (r12 != 0) goto L_0x0158
            e8.dg0 r12 = r8.f8281e     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.zf0 r13 = r8.f8291w     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r12.c(r13)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0158:
            r8.f8291w = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8290v = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x015c:
            j(r11)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r11.e()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x016c
        L_0x0163:
            boolean r12 = r4[r3]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r12 == 0) goto L_0x016c
            long r12 = r8.K     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r11.i(r12)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x016c:
            int r3 = r3 + 1
            goto L_0x0125
        L_0x016f:
            android.os.Handler r3 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.mf0 r1 = r1.f8399m     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Message r1 = r3.obtainMessage(r15, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendToTarget()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.l(r2, r6)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x01a4
        L_0x017e:
            r8.L = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r1 = r1.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0182:
            if (r1 == 0) goto L_0x018a
            r1.a()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r1 = r1.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0182
        L_0x018a:
            com.google.android.gms.internal.ads.vs r1 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.f8398l = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r2 = r1.f8396j     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x01a4
            long r2 = r1.f8394h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r4 = r8.K     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r11 = r1.e()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r2, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r3 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3.c(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x01a4:
            r31.x()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r31.u()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r1 = r8.f8282f     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendEmptyMessage(r7)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x01af:
            return r10
        L_0x01b0:
            java.lang.Object r1 = r1.obj     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.cu r1 = (com.google.android.gms.internal.ads.cu) r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x01c0
            com.google.android.gms.internal.ads.cu r2 = r2.f8387a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == r1) goto L_0x01bd
            goto L_0x01c0
        L_0x01bd:
            r31.x()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x01c0:
            return r10
        L_0x01c1:
            java.lang.Object r1 = r1.obj     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.cu r1 = (com.google.android.gms.internal.ads.cu) r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x01f0
            com.google.android.gms.internal.ads.cu r3 = r2.f8387a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == r1) goto L_0x01ce
            goto L_0x01f0
        L_0x01ce:
            r2.f8396j = r10     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.g()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r3 = r2.f8394h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r3 = r2.c(r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.f8394h = r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r1 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 != 0) goto L_0x01ed
            com.google.android.gms.internal.ads.vs r1 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.M = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r1 = r1.f8394h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.q(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r1 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.n(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x01ed:
            r31.x()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x01f0:
            return r10
        L_0x01f1:
            java.lang.Object r1 = r1.obj     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r2 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r3 = r1.first     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r3 = (e8.gc0) r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.O = r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r1 = r1.second     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x025e
            int r4 = r8.I     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r4 <= 0) goto L_0x0230
            e8.zb0 r3 = r8.J     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.util.Pair r3 = r8.e(r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r4 = r8.I     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.I = r9     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.J = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 != 0) goto L_0x0218
            r8.k(r1, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0342
        L_0x0218:
            e8.xb0 r7 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r11 = r3.first     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r11 = r11.intValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r3 = r3.second     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r12 = r3.longValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r7.<init>(r11, r12)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r7     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x025f
        L_0x0230:
            e8.xb0 r4 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r13 = r4.f17460b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x025e
            boolean r3 = r3.a()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == 0) goto L_0x0243
            r8.k(r1, r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0342
        L_0x0243:
            android.util.Pair r3 = r31.p()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r4 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r7 = r3.first     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r7 = r7.intValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r3 = r3.second     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r11 = r3.longValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r4.<init>(r7, r11)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r4     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x025e:
            r4 = 0
        L_0x025f:
            com.google.android.gms.internal.ads.vs r3 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == 0) goto L_0x0264
            goto L_0x0266
        L_0x0264:
            com.google.android.gms.internal.ads.vs r3 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0266:
            if (r3 == 0) goto L_0x033f
            e8.gc0 r7 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r11 = r3.f8388b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r7 = r7.f(r11)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r7 != r6) goto L_0x02c8
            int r5 = r3.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r7 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r8.b(r5, r2, r7)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != r6) goto L_0x0281
            r8.k(r1, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0342
        L_0x0281:
            e8.gc0 r5 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r7 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r5.e(r2, r7, r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.util.Pair r2 = r31.p()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r5 = r2.first     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r5 = r5.intValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r2 = r2.second     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r11 = r2.longValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r2 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r7 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.e(r5, r7, r10)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r2 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r2 = r2.f15016b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3.f8393g = r6     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x02a9:
            com.google.android.gms.internal.ads.vs r3 = r3.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == 0) goto L_0x02bb
            java.lang.Object r7 = r3.f8388b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r7 = r7.equals(r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r7 == 0) goto L_0x02b7
            r7 = r5
            goto L_0x02b8
        L_0x02b7:
            r7 = -1
        L_0x02b8:
            r3.f8393g = r7     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x02a9
        L_0x02bb:
            long r2 = r8.m(r5, r11)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r6 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r6.<init>(r5, r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r6     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x033f
        L_0x02c8:
            boolean r2 = r8.A(r7)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3.d(r7, r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 != r2) goto L_0x02d5
            r2 = 1
            goto L_0x02d6
        L_0x02d5:
            r2 = 0
        L_0x02d6:
            e8.xb0 r11 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r12 = r11.f17459a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r7 == r12) goto L_0x02ed
            e8.xb0 r12 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r13 = r11.f17460b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r12.<init>(r7, r13)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r13 = r11.f17461c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r12.f17461c = r13     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r13 = r11.f17462d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r12.f17462d = r13     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r12     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x02ed:
            com.google.android.gms.internal.ads.vs r11 = r3.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r11 == 0) goto L_0x033f
            e8.gc0 r12 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r13 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.hc0 r14 = r8.f8286r     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r15 = r8.E     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r7 = r12.b(r7, r13, r14, r15)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r7 == r6) goto L_0x0322
            java.lang.Object r12 = r11.f8388b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r13 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r14 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r13 = r13.e(r7, r14, r10)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r13 = r13.f15016b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r12 = r12.equals(r13)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r12 == 0) goto L_0x0322
            boolean r3 = r8.A(r7)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r11.d(r7, r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r3 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r11 != r3) goto L_0x031e
            r3 = 1
            goto L_0x031f
        L_0x031e:
            r3 = 0
        L_0x031f:
            r2 = r2 | r3
            r3 = r11
            goto L_0x02ed
        L_0x0322:
            if (r2 != 0) goto L_0x0338
            com.google.android.gms.internal.ads.vs r2 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r2.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r3 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r5 = r3.f17461c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r5 = r8.m(r2, r5)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r3 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3.<init>(r2, r5)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x033f
        L_0x0338:
            r8.L = r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3.f8398l = r5     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            i(r11)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x033f:
            r8.o(r1, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0342:
            return r10
        L_0x0343:
            r8.z(r10)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ra r1 = r8.f8280d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.c()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.a(r10)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            monitor-enter(r31)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8294z = r10     // Catch:{ all -> 0x0356 }
            r31.notifyAll()     // Catch:{ all -> 0x0356 }
            monitor-exit(r31)     // Catch:{ all -> 0x0356 }
            return r10
        L_0x0356:
            r0 = move-exception
            r1 = r0
            monitor-exit(r31)     // Catch:{ all -> 0x0356 }
            throw r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x035a:
            r31.v()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            return r10
        L_0x035e:
            java.lang.Object r1 = r1.obj     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.dc0 r1 = (e8.dc0) r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.zf0 r2 = r8.f8291w     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x036b
            e8.dc0 r1 = r2.b(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0370
        L_0x036b:
            e8.dg0 r2 = r8.f8281e     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.b(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0370:
            r8.f8289u = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r2 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Message r1 = r2.obtainMessage(r14, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendToTarget()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            return r10
        L_0x037c:
            java.lang.Object r1 = r1.obj     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.zb0 r1 = (e8.zb0) r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r2 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x038d
            int r2 = r8.I     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r2 + r10
            r8.I = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.J = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0412
        L_0x038d:
            android.util.Pair r2 = r8.e(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x03b1
            e8.xb0 r1 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.<init>(r9, r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r2 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Message r1 = r2.obtainMessage(r13, r10, r9, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendToTarget()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r1 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.<init>(r9, r11)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.a(r13)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.z(r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0412
        L_0x03b1:
            long r3 = r1.f17711c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x03b9
            r1 = 1
            goto L_0x03ba
        L_0x03b9:
            r1 = 0
        L_0x03ba:
            java.lang.Object r3 = r2.first     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r3 = r3.intValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r2 = r2.second     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r4 = r2.longValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r2 = r8.f8288t     // Catch:{ all -> 0x0413 }
            int r6 = r2.f17459a     // Catch:{ all -> 0x0413 }
            if (r3 != r6) goto L_0x03f1
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            long r14 = r2.f17461c     // Catch:{ all -> 0x0413 }
            long r14 = r14 / r6
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x03f1
            e8.xb0 r2 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.<init>(r3, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r3 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x03e8
            r1 = 1
            goto L_0x03e9
        L_0x03e8:
            r1 = 0
        L_0x03e9:
            android.os.Message r1 = r3.obtainMessage(r13, r1, r9, r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendToTarget()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0412
        L_0x03f1:
            long r6 = r8.m(r3, r4)     // Catch:{ all -> 0x0413 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x03fb
            r2 = 1
            goto L_0x03fc
        L_0x03fb:
            r2 = 0
        L_0x03fc:
            r1 = r1 | r2
            e8.xb0 r2 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.<init>(r3, r6)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r3 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x040a
            r1 = 1
            goto L_0x040b
        L_0x040a:
            r1 = 0
        L_0x040b:
            android.os.Message r1 = r3.obtainMessage(r13, r1, r9, r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendToTarget()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0412:
            return r10
        L_0x0413:
            r0 = move-exception
            r2 = r0
            e8.xb0 r6 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r6.<init>(r3, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r6     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r3 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x0422
            r1 = 1
            goto L_0x0423
        L_0x0422:
            r1 = 0
        L_0x0423:
            android.os.Message r1 = r3.obtainMessage(r13, r1, r9, r6)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendToTarget()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            throw r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x042b:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r1 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 != 0) goto L_0x043b
            com.google.android.gms.internal.ads.du r1 = r8.f8292x     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.b()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r13 = r5
            goto L_0x066c
        L_0x043b:
            com.google.android.gms.internal.ads.vs r1 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 != 0) goto L_0x0444
            e8.xb0 r1 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r1 = r1.f17459a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x047b
        L_0x0444:
            int r2 = r1.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r7 = r1.f8395i     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r7 != 0) goto L_0x0557
            boolean r1 = r1.f()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x0557
            e8.gc0 r1 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r7 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r1 = r1.e(r2, r7, r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r13 = r1.f15017c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0460
            goto L_0x0557
        L_0x0460:
            com.google.android.gms.internal.ads.vs r1 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x046f
            com.google.android.gms.internal.ads.vs r7 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r7 = r7.f8389c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r1 = r1.f8389c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r7 = r7 - r1
            r1 = 100
            if (r7 == r1) goto L_0x0557
        L_0x046f:
            e8.gc0 r1 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r7 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.hc0 r13 = r8.f8286r     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r14 = r8.E     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r1 = r1.b(r2, r7, r13, r14)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x047b:
            e8.gc0 r2 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r2.h()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 < r2) goto L_0x048a
            com.google.android.gms.internal.ads.du r1 = r8.f8292x     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.b()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0557
        L_0x048a:
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x0493
            e8.xb0 r2 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r3 = r2.f17461c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x04a3
        L_0x0493:
            e8.gc0 r2 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r7 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.e(r1, r7, r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r2 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.hc0 r7 = r8.f8286r     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.c(r9, r7)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x04a6
        L_0x04a3:
            r13 = r5
            r15 = 2
            goto L_0x04eb
        L_0x04a6:
            com.google.android.gms.internal.ads.vs r1 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r1 = r1.e()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r7 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r13 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r13 = r13.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r14 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r7 = r7.e(r13, r14, r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r13 = r7.f15017c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r1 = r1 + r13
            long r13 = r8.K     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r1 = r1 - r13
            e8.gc0 r7 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r13 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1 = r31
            r2 = r7
            r3 = r13
            r13 = r5
            r4 = r16
            r15 = 2
            r6 = r18
            android.util.Pair r1 = r1.f(r2, r3, r4, r6)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x0558
            java.lang.Object r2 = r1.first     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r2.intValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r1 = r1.second     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r3 = r1.longValue()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1 = r2
        L_0x04eb:
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x04f6
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x04f3:
            r20 = r5
            goto L_0x050a
        L_0x04f6:
            long r5 = r2.e()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r2 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r7 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r7 = r7.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r15 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r2 = r2.e(r7, r15, r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r11 = r2.f15017c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r5 = r5 + r11
            goto L_0x04f3
        L_0x050a:
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x0511
            r26 = 0
            goto L_0x0516
        L_0x0511:
            int r2 = r2.f8389c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r2 + r10
            r26 = r2
        L_0x0516:
            boolean r28 = r8.A(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.gc0 r2 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r5 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.e(r1, r5, r10)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = new com.google.android.gms.internal.ads.vs     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.ws[] r5 = r8.f8277a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.ss[] r6 = r8.f8278b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.iu r7 = r8.f8279c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ra r11 = r8.f8280d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.du r12 = r8.f8292x     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r15 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            java.lang.Object r15 = r15.f15016b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r17 = r2
            r18 = r5
            r19 = r6
            r22 = r7
            r23 = r11
            r24 = r12
            r25 = r15
            r27 = r1
            r29 = r3
            r17.<init>(r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r1 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x054c
            r1.f8398l = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x054c:
            r8.L = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.cu r1 = r2.f8387a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.k(r8, r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.y(r10)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0558
        L_0x0557:
            r13 = r5
        L_0x0558:
            com.google.android.gms.internal.ads.vs r1 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x056f
            boolean r1 = r1.f()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x0563
            goto L_0x056f
        L_0x0563:
            com.google.android.gms.internal.ads.vs r1 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x0572
            boolean r1 = r8.C     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 != 0) goto L_0x0572
            r31.x()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0572
        L_0x056f:
            r8.y(r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0572:
            com.google.android.gms.internal.ads.vs r1 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x066c
        L_0x0576:
            com.google.android.gms.internal.ads.vs r1 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == r2) goto L_0x05ad
            long r3 = r8.K     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r5 = r1.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r5 = r5.f8392f     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x05ad
            r1.a()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r1 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r1 = r1.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.n(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r1 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r3 = r2.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r4 = r2.f8394h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.<init>(r3, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r31.u()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r1 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2 = 5
            e8.xb0 r3 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendToTarget()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0576
        L_0x05ad:
            boolean r1 = r2.f8395i     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x05d3
            r1 = 0
        L_0x05b2:
            com.google.android.gms.internal.ads.ws[] r2 = r8.f8277a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r3 = r2.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 >= r3) goto L_0x066c
            r2 = r2[r1]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r3 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.oe0[] r3 = r3.f8390d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3 = r3[r1]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == 0) goto L_0x05d0
            e8.oe0 r4 = r2.q()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r4 != r3) goto L_0x05d0
            boolean r3 = r2.h()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == 0) goto L_0x05d0
            r2.j()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x05d0:
            int r1 = r1 + 1
            goto L_0x05b2
        L_0x05d3:
            r1 = 0
        L_0x05d4:
            com.google.android.gms.internal.ads.ws[] r2 = r8.f8277a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r3 = r2.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 >= r3) goto L_0x05f4
            r2 = r2[r1]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r3 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.oe0[] r3 = r3.f8390d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3 = r3[r1]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.oe0 r4 = r2.q()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r4 != r3) goto L_0x066c
            if (r3 == 0) goto L_0x05f1
            boolean r2 = r2.h()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x05f1
            goto L_0x066c
        L_0x05f1:
            int r1 = r1 + 1
            goto L_0x05d4
        L_0x05f4:
            com.google.android.gms.internal.ads.vs r1 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r1.f8398l     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x066c
            boolean r3 = r2.f8396j     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == 0) goto L_0x066c
            e8.mf0 r1 = r1.f8399m     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.M = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.mf0 r3 = r2.f8399m     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.cu r2 = r2.f8387a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r4 = r2.f()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0615
            r2 = 1
            goto L_0x0616
        L_0x0615:
            r2 = 0
        L_0x0616:
            r4 = 0
        L_0x0617:
            com.google.android.gms.internal.ads.ws[] r5 = r8.f8277a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r6 = r5.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r4 >= r6) goto L_0x066c
            r5 = r5[r4]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.lf0 r6 = r1.f15502b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.kf0 r6 = r6.a(r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r6 == 0) goto L_0x0667
            if (r2 != 0) goto L_0x0664
            boolean r6 = r5.o()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r6 != 0) goto L_0x0667
            e8.lf0 r6 = r3.f15502b     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.kf0 r6 = r6.a(r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ec0[] r7 = r1.f15504d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r7 = r7[r4]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ec0[] r11 = r3.f15504d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r11 = r11[r4]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r6 == 0) goto L_0x0664
            boolean r7 = r11.equals(r7)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r7 == 0) goto L_0x0664
            int r7 = r6.length()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.bc0[] r11 = new e8.bc0[r7]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r12 = 0
        L_0x064b:
            if (r12 >= r7) goto L_0x0656
            e8.bc0 r15 = r6.c(r12)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r11[r12] = r15     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r12 = r12 + 1
            goto L_0x064b
        L_0x0656:
            com.google.android.gms.internal.ads.vs r6 = r8.M     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.oe0[] r7 = r6.f8390d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r7 = r7[r4]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r9 = r6.e()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r5.s(r11, r7, r9)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0667
        L_0x0664:
            r5.j()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0667:
            int r4 = r4 + 1
            r9 = 0
            r10 = 1
            goto L_0x0617
        L_0x066c:
            com.google.android.gms.internal.ads.vs r1 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2 = 10
            if (r1 != 0) goto L_0x067b
            r31.w()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.g(r13, r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0678:
            r1 = 1
            goto L_0x07db
        L_0x067b:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.xs.a(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r31.u()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r1 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.cu r1 = r1.f8387a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.xb0 r4 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r4 = r4.f17461c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.g(r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.ws[] r1 = r8.f8293y     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r4 = r1.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r5 = 1
            r6 = 1
            r7 = 0
        L_0x0694:
            if (r7 >= r4) goto L_0x06cb
            r9 = r1[r7]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r10 = r8.K     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r2 = r8.H     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r9.l(r10, r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r6 == 0) goto L_0x06a9
            boolean r2 = r9.f()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x06a9
            r6 = 1
            goto L_0x06aa
        L_0x06a9:
            r6 = 0
        L_0x06aa:
            boolean r2 = r9.isReady()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x06b9
            boolean r2 = r9.f()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 == 0) goto L_0x06b7
            goto L_0x06b9
        L_0x06b7:
            r2 = 0
            goto L_0x06ba
        L_0x06b9:
            r2 = 1
        L_0x06ba:
            if (r2 != 0) goto L_0x06bf
            r9.r()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x06bf:
            if (r5 == 0) goto L_0x06c5
            if (r2 == 0) goto L_0x06c5
            r5 = 1
            goto L_0x06c6
        L_0x06c5:
            r5 = 0
        L_0x06c6:
            int r7 = r7 + 1
            r2 = 10
            goto L_0x0694
        L_0x06cb:
            if (r5 != 0) goto L_0x06d0
            r31.w()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x06d0:
            e8.zf0 r1 = r8.f8291w     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x06f3
            e8.dc0 r1 = r1.a()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.dc0 r2 = r8.f8289u     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r2 = r1.equals(r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r2 != 0) goto L_0x06f3
            r8.f8289u = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.dg0 r2 = r8.f8281e     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.zf0 r3 = r8.f8291w     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.c(r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r2 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendToTarget()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x06f3:
            e8.gc0 r1 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r2.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r3 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r4 = 0
            e8.ic0 r1 = r1.e(r2, r3, r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r1 = r1.f15017c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r6 == 0) goto L_0x0724
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0715
            e8.xb0 r3 = r8.f8288t     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r3 = r3.f17461c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0724
        L_0x0715:
            com.google.android.gms.internal.ads.vs r3 = r8.N     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r3 = r3.f8395i     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == 0) goto L_0x0724
            r3 = 4
            r8.a(r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r31.t()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x079e
        L_0x0724:
            int r3 = r8.D     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r4 = 2
            if (r3 != r4) goto L_0x0784
            com.google.android.gms.internal.ads.ws[] r3 = r8.f8293y     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r3 = r3.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 <= 0) goto L_0x0772
            if (r5 == 0) goto L_0x0770
            boolean r1 = r8.B     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r3 = r2.f8396j     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 != 0) goto L_0x073b
            long r2 = r2.f8394h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0741
        L_0x073b:
            com.google.android.gms.internal.ads.cu r2 = r2.f8387a     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r2 = r2.i()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0741:
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x075c
            com.google.android.gms.internal.ads.vs r2 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r3 = r2.f8395i     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 == 0) goto L_0x074f
            r1 = 1
            goto L_0x076c
        L_0x074f:
            e8.gc0 r3 = r8.O     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r2.f8393g     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ic0 r4 = r8.f8287s     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r5 = 0
            e8.ic0 r2 = r3.e(r2, r4, r5)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r2 = r2.f15017c     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x075c:
            e8.ra r4 = r8.f8280d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.vs r5 = r8.L     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r6 = r8.K     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r9 = r5.e()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            long r6 = r6 - r9
            long r2 = r2 - r6
            boolean r1 = r4.a(r2, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x076c:
            if (r1 == 0) goto L_0x0770
            r1 = 1
            goto L_0x0776
        L_0x0770:
            r1 = 0
            goto L_0x0776
        L_0x0772:
            boolean r1 = r8.r(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0776:
            if (r1 == 0) goto L_0x079e
            r1 = 3
            r8.a(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            boolean r1 = r8.A     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x079e
            r31.s()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x079e
        L_0x0784:
            r4 = 3
            if (r3 != r4) goto L_0x079e
            com.google.android.gms.internal.ads.ws[] r3 = r8.f8293y     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r3 = r3.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r3 <= 0) goto L_0x078d
            goto L_0x0791
        L_0x078d:
            boolean r5 = r8.r(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0791:
            if (r5 != 0) goto L_0x079e
            boolean r1 = r8.A     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.B = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1 = 2
            r8.a(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r31.t()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x079e:
            int r1 = r8.D     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2 = 2
            if (r1 != r2) goto L_0x07b1
            com.google.android.gms.internal.ads.ws[] r1 = r8.f8293y     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r2 = r1.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r9 = 0
        L_0x07a7:
            if (r9 >= r2) goto L_0x07b1
            r3 = r1[r9]     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3.r()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r9 = r9 + 1
            goto L_0x07a7
        L_0x07b1:
            boolean r1 = r8.A     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x07ba
            int r1 = r8.D     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2 = 3
            if (r1 == r2) goto L_0x07bf
        L_0x07ba:
            int r1 = r8.D     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2 = 2
            if (r1 != r2) goto L_0x07c5
        L_0x07bf:
            r1 = 10
            r8.g(r13, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x07d6
        L_0x07c5:
            com.google.android.gms.internal.ads.ws[] r1 = r8.f8293y     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r1 = r1.length     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x07d0
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.g(r13, r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x07d6
        L_0x07d0:
            android.os.Handler r1 = r8.f8282f     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2 = 2
            r1.removeMessages(r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x07d6:
            com.google.android.gms.internal.ads.xs.b()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0678
        L_0x07db:
            return r1
        L_0x07dc:
            int r1 = r1.arg1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x07e3
            r1 = 0
            r15 = 1
            goto L_0x07e5
        L_0x07e3:
            r1 = 0
            r15 = 0
        L_0x07e5:
            r8.B = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.A = r15     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r15 != 0) goto L_0x07f2
            r31.t()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r31.u()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0809
        L_0x07f2:
            int r1 = r8.D     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2 = 3
            if (r1 != r2) goto L_0x0801
            r31.s()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r1 = r8.f8282f     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2 = 2
            r1.sendEmptyMessage(r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            goto L_0x0809
        L_0x0801:
            r2 = 2
            if (r1 != r2) goto L_0x0809
            android.os.Handler r1 = r8.f8282f     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1.sendEmptyMessage(r2)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0809:
            r1 = 1
            return r1
        L_0x080b:
            java.lang.Object r2 = r1.obj     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            com.google.android.gms.internal.ads.du r2 = (com.google.android.gms.internal.ads.du) r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            int r1 = r1.arg1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x0815
            r1 = 1
            goto L_0x0816
        L_0x0815:
            r1 = 0
        L_0x0816:
            android.os.Handler r3 = r8.f8284h     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r4 = 0
            r3.sendEmptyMessage(r4)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3 = 1
            r8.z(r3)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.ra r3 = r8.f8280d     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3.b()     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            if (r1 == 0) goto L_0x0833
            e8.xb0 r1 = new e8.xb0     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r5)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r8.f8288t = r1     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
        L_0x0833:
            r8.f8292x = r2     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            e8.vb0 r1 = r8.f8285i     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r3 = 1
            r2.f(r1, r3, r8)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r1 = 2
            r8.a(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            android.os.Handler r2 = r8.f8282f     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            r2.sendEmptyMessage(r1)     // Catch:{ rb0 -> 0x0847, IOException -> 0x0845, RuntimeException -> 0x084e }
            return r3
        L_0x0845:
            r0 = move-exception
            goto L_0x086b
        L_0x0847:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = 1
            r3 = 8
            goto L_0x088c
        L_0x084e:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f8284h
            e8.rb0 r1 = e8.rb0.c(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r31.v()
            r1 = 1
            return r1
        L_0x086b:
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Source error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f8284h
            e8.rb0 r1 = e8.rb0.a(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r31.v()
            r1 = 1
            return r1
        L_0x0887:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x088c:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Renderer error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f8284h
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r31.v()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.us.handleMessage(android.os.Message):boolean");
    }

    public final void k(Object obj, int i10) {
        xb0 xb0 = new xb0(0, 0);
        this.f8288t = xb0;
        this.f8284h.obtainMessage(6, new yb0(this.O, obj, xb0, i10)).sendToTarget();
        this.f8288t = new xb0(0, -9223372036854775807L);
        a(4);
        z(false);
    }

    public final void l(boolean[] zArr, int i10) throws rb0 {
        this.f8293y = new ws[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ws[] wsVarArr = this.f8277a;
            if (i11 < wsVarArr.length) {
                ws wsVar = wsVarArr[i11];
                kf0 kf0 = this.N.f8399m.f15502b.f15384b[i11];
                if (kf0 != null) {
                    int i13 = i12 + 1;
                    this.f8293y[i12] = wsVar;
                    if (wsVar.getState() == 0) {
                        ec0 ec0 = this.N.f8399m.f15504d[i11];
                        boolean z10 = this.A && this.D == 3;
                        boolean z11 = !zArr[i11] && z10;
                        int length = kf0.length();
                        bc0[] bc0Arr = new bc0[length];
                        for (int i14 = 0; i14 < length; i14++) {
                            bc0Arr[i14] = kf0.c(i14);
                        }
                        vs vsVar = this.N;
                        wsVar.p(ec0, bc0Arr, vsVar.f8390d[i11], this.K, z11, vsVar.e());
                        zf0 n10 = wsVar.n();
                        if (n10 != null) {
                            if (this.f8291w == null) {
                                this.f8291w = n10;
                                this.f8290v = wsVar;
                                n10.b(this.f8289u);
                            } else {
                                throw new rb0(2, new IllegalStateException("Multiple renderer media clocks enabled."), -1);
                            }
                        }
                        if (z10) {
                            wsVar.start();
                        }
                    }
                    i12 = i13;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final long m(int i10, long j10) throws rb0 {
        vs vsVar;
        t();
        this.B = false;
        a(2);
        vs vsVar2 = this.N;
        if (vsVar2 == null) {
            vs vsVar3 = this.L;
            if (vsVar3 != null) {
                vsVar3.a();
            }
            vsVar = null;
        } else {
            vsVar = null;
            while (vsVar2 != null) {
                if (vsVar2.f8393g != i10 || !vsVar2.f8396j) {
                    vsVar2.a();
                } else {
                    vsVar = vsVar2;
                }
                vsVar2 = vsVar2.f8398l;
            }
        }
        vs vsVar4 = this.N;
        if (!(vsVar4 == vsVar && vsVar4 == this.M)) {
            for (ws e10 : this.f8293y) {
                e10.e();
            }
            this.f8293y = new ws[0];
            this.f8291w = null;
            this.f8290v = null;
            this.N = null;
        }
        if (vsVar != null) {
            vsVar.f8398l = null;
            this.L = vsVar;
            this.M = vsVar;
            n(vsVar);
            vs vsVar5 = this.N;
            if (vsVar5.f8397k) {
                j10 = vsVar5.f8387a.j(j10);
            }
            q(j10);
            x();
        } else {
            this.L = null;
            this.M = null;
            this.N = null;
            q(j10);
        }
        this.f8282f.sendEmptyMessage(2);
        return j10;
    }

    public final void n(vs vsVar) throws rb0 {
        if (this.N != vsVar) {
            boolean[] zArr = new boolean[this.f8277a.length];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ws[] wsVarArr = this.f8277a;
                if (i10 < wsVarArr.length) {
                    ws wsVar = wsVarArr[i10];
                    zArr[i10] = wsVar.getState() != 0;
                    kf0 kf0 = vsVar.f8399m.f15502b.f15384b[i10];
                    if (kf0 != null) {
                        i11++;
                    }
                    if (zArr[i10] && (kf0 == null || (wsVar.o() && wsVar.q() == this.N.f8390d[i10]))) {
                        if (wsVar == this.f8290v) {
                            this.f8281e.c(this.f8291w);
                            this.f8291w = null;
                            this.f8290v = null;
                        }
                        if (wsVar.getState() == 2) {
                            wsVar.stop();
                        }
                        wsVar.e();
                    }
                    i10++;
                } else {
                    this.N = vsVar;
                    this.f8284h.obtainMessage(3, vsVar.f8399m).sendToTarget();
                    l(zArr, i11);
                    return;
                }
            }
        }
    }

    public final void o(Object obj, int i10) {
        this.f8284h.obtainMessage(6, new yb0(this.O, obj, this.f8288t, i10)).sendToTarget();
    }

    public final Pair p() {
        return f(this.O, 0, -9223372036854775807L, 0);
    }

    public final void q(long j10) throws rb0 {
        long j11;
        vs vsVar = this.N;
        if (vsVar == null) {
            j11 = j10 + 60000000;
        } else {
            j11 = j10 + vsVar.e();
        }
        this.K = j11;
        this.f8281e.e(j11);
        for (ws i10 : this.f8293y) {
            i10.i(this.K);
        }
    }

    public final boolean r(long j10) {
        if (j10 == -9223372036854775807L || this.f8288t.f17461c < j10) {
            return true;
        }
        vs vsVar = this.N.f8398l;
        return vsVar != null && vsVar.f8396j;
    }

    public final void s() throws rb0 {
        this.B = false;
        dg0 dg0 = this.f8281e;
        if (!dg0.f14269a) {
            dg0.f14271c = SystemClock.elapsedRealtime();
            dg0.f14269a = true;
        }
        for (ws start : this.f8293y) {
            start.start();
        }
    }

    public final void t() throws rb0 {
        dg0 dg0 = this.f8281e;
        if (dg0.f14269a) {
            dg0.e(dg0.d());
            dg0.f14269a = false;
        }
        for (ws j10 : this.f8293y) {
            j(j10);
        }
    }

    public final void u() throws rb0 {
        long j10;
        vs vsVar = this.N;
        if (vsVar != null) {
            long f10 = vsVar.f8387a.f();
            if (f10 != -9223372036854775807L) {
                q(f10);
            } else {
                ws wsVar = this.f8290v;
                if (wsVar == null || wsVar.f()) {
                    this.K = this.f8281e.d();
                } else {
                    long d10 = this.f8291w.d();
                    this.K = d10;
                    this.f8281e.e(d10);
                }
                f10 = this.K - this.N.e();
            }
            this.f8288t.f17461c = f10;
            this.H = SystemClock.elapsedRealtime() * 1000;
            if (this.f8293y.length == 0) {
                j10 = Long.MIN_VALUE;
            } else {
                j10 = this.N.f8387a.i();
            }
            xb0 xb0 = this.f8288t;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.O.e(this.N.f8393g, this.f8287s, false).f15017c;
            }
            xb0.f17462d = j10;
        }
    }

    public final void v() {
        z(true);
        this.f8280d.d(true);
        a(1);
    }

    public final void w() throws IOException {
        vs vsVar = this.L;
        if (vsVar != null && !vsVar.f8396j) {
            vs vsVar2 = this.M;
            if (vsVar2 == null || vsVar2.f8398l == vsVar) {
                ws[] wsVarArr = this.f8293y;
                int length = wsVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    if (wsVarArr[i10].h()) {
                        i10++;
                    } else {
                        return;
                    }
                }
                this.L.f8387a.l();
            }
        }
    }

    public final void x() {
        long j10;
        char c10;
        int i10;
        vs vsVar = this.L;
        if (!vsVar.f8396j) {
            j10 = 0;
        } else {
            j10 = vsVar.f8387a.b();
        }
        boolean z10 = false;
        if (j10 == Long.MIN_VALUE) {
            y(false);
            return;
        }
        long e10 = this.K - this.L.e();
        long j11 = j10 - e10;
        ra raVar = this.f8280d;
        synchronized (raVar) {
            if (j11 > raVar.f16255c) {
                c10 = 0;
            } else {
                c10 = j11 < raVar.f16254b ? (char) 2 : 1;
            }
            f fVar = raVar.f16253a;
            synchronized (fVar) {
                i10 = fVar.f26064g * fVar.f26060c;
            }
            boolean z11 = i10 >= raVar.f16258f;
            if (c10 == 2 || (c10 == 1 && raVar.f16259g && !z11)) {
                z10 = true;
            }
            raVar.f16259g = z10;
        }
        y(z10);
        if (z10) {
            this.L.f8387a.a(e10);
        }
    }

    public final void y(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            this.f8284h.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void z(boolean z10) {
        this.f8282f.removeMessages(2);
        this.B = false;
        dg0 dg0 = this.f8281e;
        if (dg0.f14269a) {
            dg0.e(dg0.d());
            dg0.f14269a = false;
        }
        this.f8291w = null;
        this.f8290v = null;
        this.K = 60000000;
        for (ws wsVar : this.f8293y) {
            try {
                j(wsVar);
                wsVar.e();
            } catch (rb0 | RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e10);
            }
        }
        this.f8293y = new ws[0];
        vs vsVar = this.N;
        if (vsVar == null) {
            vsVar = this.L;
        }
        i(vsVar);
        this.L = null;
        this.M = null;
        this.N = null;
        y(false);
        if (z10) {
            du duVar = this.f8292x;
            if (duVar != null) {
                duVar.e();
                this.f8292x = null;
            }
            this.O = null;
        }
    }
}
