package z4;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import v6.e0;

/* compiled from: AudioTrackPositionTracker */
public final class n {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a  reason: collision with root package name */
    public final a f28383a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f28384b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f28385c;

    /* renamed from: d  reason: collision with root package name */
    public int f28386d;

    /* renamed from: e  reason: collision with root package name */
    public int f28387e;

    /* renamed from: f  reason: collision with root package name */
    public m f28388f;

    /* renamed from: g  reason: collision with root package name */
    public int f28389g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f28390h;

    /* renamed from: i  reason: collision with root package name */
    public long f28391i;

    /* renamed from: j  reason: collision with root package name */
    public float f28392j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f28393k;

    /* renamed from: l  reason: collision with root package name */
    public long f28394l;

    /* renamed from: m  reason: collision with root package name */
    public long f28395m;

    /* renamed from: n  reason: collision with root package name */
    public Method f28396n;

    /* renamed from: o  reason: collision with root package name */
    public long f28397o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f28398p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f28399q;

    /* renamed from: r  reason: collision with root package name */
    public long f28400r;

    /* renamed from: s  reason: collision with root package name */
    public long f28401s;

    /* renamed from: t  reason: collision with root package name */
    public long f28402t;

    /* renamed from: u  reason: collision with root package name */
    public long f28403u;

    /* renamed from: v  reason: collision with root package name */
    public int f28404v;

    /* renamed from: w  reason: collision with root package name */
    public int f28405w;

    /* renamed from: x  reason: collision with root package name */
    public long f28406x;

    /* renamed from: y  reason: collision with root package name */
    public long f28407y;

    /* renamed from: z  reason: collision with root package name */
    public long f28408z;

    /* compiled from: AudioTrackPositionTracker */
    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10);
    }

    public n(a aVar) {
        this.f28383a = aVar;
        if (e0.f26436a >= 18) {
            try {
                this.f28396n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f28384b = new long[10];
    }

    public final long a(long j10) {
        return (j10 * 1000000) / ((long) this.f28389g);
    }

    public final long b() {
        AudioTrack audioTrack = this.f28385c;
        audioTrack.getClass();
        if (this.f28406x != -9223372036854775807L) {
            return Math.min(this.A, this.f28408z + ((((SystemClock.elapsedRealtime() * 1000) - this.f28406x) * ((long) this.f28389g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f28390h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f28403u = this.f28401s;
            }
            playbackHeadPosition += this.f28403u;
        }
        if (e0.f26436a <= 29) {
            if (playbackHeadPosition == 0 && this.f28401s > 0 && playState == 3) {
                if (this.f28407y == -9223372036854775807L) {
                    this.f28407y = SystemClock.elapsedRealtime();
                }
                return this.f28401s;
            }
            this.f28407y = -9223372036854775807L;
        }
        if (this.f28401s > playbackHeadPosition) {
            this.f28402t++;
        }
        this.f28401s = playbackHeadPosition;
        return playbackHeadPosition + (this.f28402t << 32);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(long r6) {
        /*
            r5 = this;
            long r0 = r5.b()
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0029
            boolean r6 = r5.f28390h
            if (r6 == 0) goto L_0x0026
            android.media.AudioTrack r6 = r5.f28385c
            r6.getClass()
            int r6 = r6.getPlayState()
            r7 = 2
            if (r6 != r7) goto L_0x0026
            long r6 = r5.b()
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0026
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 == 0) goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.n.c(long):boolean");
    }

    public void d() {
        this.f28394l = 0;
        this.f28405w = 0;
        this.f28404v = 0;
        this.f28395m = 0;
        this.C = 0;
        this.F = 0;
        this.f28393k = false;
        this.f28385c = null;
        this.f28388f = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((v6.e0.f26436a < 23 && (r5 == 5 || r5 == 6)) != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f28385c = r3
            r2.f28386d = r6
            r2.f28387e = r7
            z4.m r0 = new z4.m
            r0.<init>(r3)
            r2.f28388f = r0
            int r3 = r3.getSampleRate()
            r2.f28389g = r3
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L_0x0029
            int r4 = v6.e0.f26436a
            r1 = 23
            if (r4 >= r1) goto L_0x0025
            r4 = 5
            if (r5 == r4) goto L_0x0023
            r4 = 6
            if (r5 != r4) goto L_0x0025
        L_0x0023:
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            r2.f28390h = r3
            boolean r3 = v6.e0.H(r5)
            r2.f28399q = r3
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0040
            int r7 = r7 / r6
            long r6 = (long) r7
            long r6 = r2.a(r6)
            goto L_0x0041
        L_0x0040:
            r6 = r4
        L_0x0041:
            r2.f28391i = r6
            r6 = 0
            r2.f28401s = r6
            r2.f28402t = r6
            r2.f28403u = r6
            r2.f28398p = r0
            r2.f28406x = r4
            r2.f28407y = r4
            r2.f28400r = r6
            r2.f28397o = r6
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f28392j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.n.e(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
