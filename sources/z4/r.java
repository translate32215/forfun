package z4;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.startapp.b4;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import v6.e0;
import v6.p;
import v6.s;
import x4.b0;
import x4.o0;
import x4.v0;
import z4.g;
import z4.k;
import z4.l;
import z4.n;

/* compiled from: DefaultAudioSink */
public final class r implements l {
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public g[] I;
    public ByteBuffer[] J;
    public ByteBuffer K;
    public int L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public o V;
    public boolean W;
    public long X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final e f28420a;

    /* renamed from: b  reason: collision with root package name */
    public final b f28421b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28422c;

    /* renamed from: d  reason: collision with root package name */
    public final q f28423d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f28424e;

    /* renamed from: f  reason: collision with root package name */
    public final g[] f28425f;

    /* renamed from: g  reason: collision with root package name */
    public final g[] f28426g;

    /* renamed from: h  reason: collision with root package name */
    public final ConditionVariable f28427h;

    /* renamed from: i  reason: collision with root package name */
    public final n f28428i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque<e> f28429j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f28430k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f28431l;

    /* renamed from: m  reason: collision with root package name */
    public h f28432m;

    /* renamed from: n  reason: collision with root package name */
    public final f<l.b> f28433n;

    /* renamed from: o  reason: collision with root package name */
    public final f<l.d> f28434o;

    /* renamed from: p  reason: collision with root package name */
    public l.c f28435p;

    /* renamed from: q  reason: collision with root package name */
    public c f28436q;

    /* renamed from: r  reason: collision with root package name */
    public c f28437r;

    /* renamed from: s  reason: collision with root package name */
    public AudioTrack f28438s;

    /* renamed from: t  reason: collision with root package name */
    public d f28439t;

    /* renamed from: u  reason: collision with root package name */
    public e f28440u;

    /* renamed from: v  reason: collision with root package name */
    public e f28441v;

    /* renamed from: w  reason: collision with root package name */
    public o0 f28442w;

    /* renamed from: x  reason: collision with root package name */
    public ByteBuffer f28443x;

    /* renamed from: y  reason: collision with root package name */
    public int f28444y;

    /* renamed from: z  reason: collision with root package name */
    public long f28445z;

    /* compiled from: DefaultAudioSink */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AudioTrack f28446a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f28446a = audioTrack;
        }

        public void run() {
            try {
                this.f28446a.flush();
                this.f28446a.release();
            } finally {
                r.this.f28427h.open();
            }
        }
    }

    /* compiled from: DefaultAudioSink */
    public interface b {
        o0 a(o0 o0Var);

        long b();

        boolean c(boolean z10);

        long d(long j10);
    }

    /* compiled from: DefaultAudioSink */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f28448a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28449b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28450c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28451d;

        /* renamed from: e  reason: collision with root package name */
        public final int f28452e;

        /* renamed from: f  reason: collision with root package name */
        public final int f28453f;

        /* renamed from: g  reason: collision with root package name */
        public final int f28454g;

        /* renamed from: h  reason: collision with root package name */
        public final int f28455h;

        /* renamed from: i  reason: collision with root package name */
        public final g[] f28456i;

        public c(b0 b0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, g[] gVarArr) {
            int i17;
            int i18 = i11;
            int i19 = i12;
            int i20 = i13;
            this.f28448a = b0Var;
            this.f28449b = i10;
            this.f28450c = i18;
            this.f28451d = i19;
            this.f28452e = i20;
            this.f28453f = i14;
            this.f28454g = i15;
            this.f28456i = gVarArr;
            if (i16 != 0) {
                i17 = i16;
            } else {
                boolean z11 = true;
                if (i18 == 0) {
                    float f10 = z10 ? 8.0f : 1.0f;
                    int minBufferSize = AudioTrack.getMinBufferSize(i13, i14, i15);
                    v6.a.d(minBufferSize == -2 ? false : z11);
                    long j10 = (long) i20;
                    int i21 = e0.i(minBufferSize * 4, ((int) ((250000 * j10) / 1000000)) * i19, Math.max(minBufferSize, ((int) ((j10 * 750000) / 1000000)) * i19));
                    i17 = f10 != 1.0f ? Math.round(((float) i21) * f10) : i21;
                } else if (i18 == 1) {
                    i17 = e(50000000);
                } else if (i18 == 2) {
                    i17 = e(250000);
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f28455h = i17;
        }

        public static AudioAttributes d(d dVar, boolean z10) {
            if (z10) {
                return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            }
            return dVar.a();
        }

        public AudioTrack a(boolean z10, d dVar, int i10) throws l.b {
            try {
                AudioTrack b10 = b(z10, dVar, i10);
                int state = b10.getState();
                if (state == 1) {
                    return b10;
                }
                try {
                    b10.release();
                } catch (Exception unused) {
                }
                throw new l.b(state, this.f28452e, this.f28453f, this.f28455h, this.f28448a, f(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new l.b(0, this.f28452e, this.f28453f, this.f28455h, this.f28448a, f(), e10);
            }
        }

        public final AudioTrack b(boolean z10, d dVar, int i10) {
            int i11 = e0.f26436a;
            if (i11 >= 29) {
                AudioFormat y10 = r.y(this.f28452e, this.f28453f, this.f28454g);
                AudioAttributes d10 = d(dVar, z10);
                boolean z11 = true;
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(d10).setAudioFormat(y10).setTransferMode(1).setBufferSizeInBytes(this.f28455h).setSessionId(i10);
                if (this.f28450c != 1) {
                    z11 = false;
                }
                return sessionId.setOffloadedPlayback(z11).build();
            } else if (i11 >= 21) {
                return new AudioTrack(d(dVar, z10), r.y(this.f28452e, this.f28453f, this.f28454g), this.f28455h, 1, i10);
            } else {
                int A = e0.A(dVar.f28340c);
                if (i10 == 0) {
                    return new AudioTrack(A, this.f28452e, this.f28453f, this.f28454g, this.f28455h, 1);
                }
                return new AudioTrack(A, this.f28452e, this.f28453f, this.f28454g, this.f28455h, 1, i10);
            }
        }

        public long c(long j10) {
            return (j10 * 1000000) / ((long) this.f28452e);
        }

        public final int e(long j10) {
            int i10;
            int i11 = this.f28454g;
            switch (i11) {
                case 5:
                    i10 = 80000;
                    break;
                case 6:
                case 18:
                    i10 = 768000;
                    break;
                case 7:
                    i10 = 192000;
                    break;
                case b4.f10106f:
                    i10 = 2250000;
                    break;
                case 9:
                    i10 = 40000;
                    break;
                case 10:
                    i10 = 100000;
                    break;
                case 11:
                    i10 = 16000;
                    break;
                case 12:
                    i10 = 7000;
                    break;
                case 14:
                    i10 = 3062500;
                    break;
                case 15:
                    i10 = 8000;
                    break;
                case 16:
                    i10 = 256000;
                    break;
                case 17:
                    i10 = 336000;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            if (i11 == 5) {
                i10 *= 2;
            }
            return (int) ((j10 * ((long) i10)) / 1000000);
        }

        public boolean f() {
            return this.f28450c == 1;
        }
    }

    /* compiled from: DefaultAudioSink */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public final g[] f28457a;

        /* renamed from: b  reason: collision with root package name */
        public final z f28458b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f28459c;

        public d(g... gVarArr) {
            z zVar = new z();
            b0 b0Var = new b0();
            g[] gVarArr2 = new g[(gVarArr.length + 2)];
            this.f28457a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f28458b = zVar;
            this.f28459c = b0Var;
            gVarArr2[gVarArr.length] = zVar;
            gVarArr2[gVarArr.length + 1] = b0Var;
        }

        public o0 a(o0 o0Var) {
            b0 b0Var = this.f28459c;
            float f10 = o0Var.f27700a;
            if (b0Var.f28312c != f10) {
                b0Var.f28312c = f10;
                b0Var.f28318i = true;
            }
            float f11 = o0Var.f27701b;
            if (b0Var.f28313d != f11) {
                b0Var.f28313d = f11;
                b0Var.f28318i = true;
            }
            return o0Var;
        }

        public long b() {
            return this.f28458b.f28508t;
        }

        public boolean c(boolean z10) {
            this.f28458b.f28501m = z10;
            return z10;
        }

        public long d(long j10) {
            b0 b0Var = this.f28459c;
            if (b0Var.f28324o >= 1024) {
                long j11 = b0Var.f28323n;
                a0 a0Var = b0Var.f28319j;
                a0Var.getClass();
                long j12 = j11 - ((long) ((a0Var.f28293k * a0Var.f28284b) * 2));
                int i10 = b0Var.f28317h.f28349a;
                int i11 = b0Var.f28316g.f28349a;
                if (i10 == i11) {
                    return e0.P(j10, j12, b0Var.f28324o);
                }
                return e0.P(j10, j12 * ((long) i10), b0Var.f28324o * ((long) i11));
            }
            double d10 = (double) b0Var.f28312c;
            double d11 = (double) j10;
            Double.isNaN(d10);
            Double.isNaN(d11);
            Double.isNaN(d10);
            Double.isNaN(d11);
            return (long) (d10 * d11);
        }
    }

    /* compiled from: DefaultAudioSink */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final o0 f28460a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f28461b;

        /* renamed from: c  reason: collision with root package name */
        public final long f28462c;

        /* renamed from: d  reason: collision with root package name */
        public final long f28463d;

        public e(o0 o0Var, boolean z10, long j10, long j11, a aVar) {
            this.f28460a = o0Var;
            this.f28461b = z10;
            this.f28462c = j10;
            this.f28463d = j11;
        }
    }

    /* compiled from: DefaultAudioSink */
    public static final class f<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        public T f28464a;

        /* renamed from: b  reason: collision with root package name */
        public long f28465b;

        public f(long j10) {
        }

        public void a(T t10) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f28464a == null) {
                this.f28464a = t10;
                this.f28465b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f28465b) {
                T t11 = this.f28464a;
                this.f28464a = null;
                throw t11;
            }
        }
    }

    /* compiled from: DefaultAudioSink */
    public final class g implements n.a {
        public g(a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = ((z4.v.b) r0).f28482a.W0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(long r4) {
            /*
                r3 = this;
                z4.r r0 = z4.r.this
                z4.l$c r0 = r0.f28435p
                if (r0 == 0) goto L_0x0018
                z4.v$b r0 = (z4.v.b) r0
                z4.v r0 = z4.v.this
                z4.k$a r0 = r0.W0
                android.os.Handler r1 = r0.f28365a
                if (r1 == 0) goto L_0x0018
                z4.j r2 = new z4.j
                r2.<init>(r0, r4)
                r1.post(r2)
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z4.r.g.a(long):void");
        }

        public void b(int i10, long j10) {
            if (r.this.f28435p != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                r rVar = r.this;
                long j11 = elapsedRealtime - rVar.X;
                k.a aVar = v.this.W0;
                Handler handler = aVar.f28365a;
                if (handler != null) {
                    handler.post(new h(aVar, i10, j10, j11));
                }
            }
        }

        public void c(long j10, long j11, long j12, long j13) {
            long j14;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            r rVar = r.this;
            c cVar = rVar.f28437r;
            if (cVar.f28450c == 0) {
                j14 = rVar.f28445z / ((long) cVar.f28449b);
            } else {
                j14 = rVar.A;
            }
            sb2.append(j14);
            sb2.append(", ");
            sb2.append(r.this.D());
            Log.w("DefaultAudioSink", sb2.toString());
        }

        public void d(long j10, long j11, long j12, long j13) {
            long j14;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            r rVar = r.this;
            c cVar = rVar.f28437r;
            if (cVar.f28450c == 0) {
                j14 = rVar.f28445z / ((long) cVar.f28449b);
            } else {
                j14 = rVar.A;
            }
            sb2.append(j14);
            sb2.append(", ");
            sb2.append(r.this.D());
            Log.w("DefaultAudioSink", sb2.toString());
        }

        public void e(long j10) {
            Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }
    }

    /* compiled from: DefaultAudioSink */
    public final class h {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f28467a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        public final AudioTrack.StreamEventCallback f28468b;

        /* compiled from: DefaultAudioSink */
        public class a extends AudioTrack.StreamEventCallback {
            public a(r rVar) {
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                v0.a aVar;
                v6.a.d(audioTrack == r.this.f28438s);
                r rVar = r.this;
                l.c cVar = rVar.f28435p;
                if (cVar != null && rVar.S && (aVar = v.this.f28481f1) != null) {
                    aVar.a();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                v0.a aVar;
                v6.a.d(audioTrack == r.this.f28438s);
                r rVar = r.this;
                l.c cVar = rVar.f28435p;
                if (cVar != null && rVar.S && (aVar = v.this.f28481f1) != null) {
                    aVar.a();
                }
            }
        }

        public h() {
            this.f28468b = new a(r.this);
        }
    }

    public r(e eVar, b bVar, boolean z10, boolean z11, boolean z12) {
        this.f28420a = eVar;
        this.f28421b = bVar;
        int i10 = e0.f26436a;
        this.f28422c = i10 >= 21 && z10;
        this.f28430k = i10 >= 23 && z11;
        this.f28431l = i10 >= 29 && z12;
        this.f28427h = new ConditionVariable(true);
        this.f28428i = new n(new g((a) null));
        q qVar = new q();
        this.f28423d = qVar;
        c0 c0Var = new c0();
        this.f28424e = c0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new p[]{new y(), qVar, c0Var});
        Collections.addAll(arrayList, ((d) bVar).f28457a);
        this.f28425f = (g[]) arrayList.toArray(new g[0]);
        this.f28426g = new g[]{new u()};
        this.H = 1.0f;
        this.f28439t = d.f28337f;
        this.U = 0;
        this.V = new o(0, 0.0f);
        o0 o0Var = o0.f27699d;
        this.f28441v = new e(o0Var, false, 0, 0, (a) null);
        this.f28442w = o0Var;
        this.P = -1;
        this.I = new g[0];
        this.J = new ByteBuffer[0];
        this.f28429j = new ArrayDeque<>();
        this.f28433n = new f<>(100);
        this.f28434o = new f<>(100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b2, code lost:
        if (r2 != 5) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A(x4.b0 r13, z4.e r14) {
        /*
            r0 = 0
            if (r14 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r13.f27408t
            r1.getClass()
            java.lang.String r2 = r13.f27405i
            int r1 = v6.s.d(r1, r2)
            r2 = 0
            r3 = 5
            r4 = 7
            r5 = 1
            r6 = 6
            r7 = 8
            r8 = 18
            if (r1 == r3) goto L_0x002d
            if (r1 == r6) goto L_0x002d
            if (r1 == r8) goto L_0x002d
            r9 = 17
            if (r1 == r9) goto L_0x002d
            if (r1 == r4) goto L_0x002d
            if (r1 == r7) goto L_0x002d
            r9 = 14
            if (r1 != r9) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r9 = 0
            goto L_0x002e
        L_0x002d:
            r9 = 1
        L_0x002e:
            if (r9 != 0) goto L_0x0031
            return r0
        L_0x0031:
            if (r1 != r8) goto L_0x003b
            boolean r9 = r14.a(r8)
            if (r9 != 0) goto L_0x003b
            r1 = 6
            goto L_0x0044
        L_0x003b:
            if (r1 != r7) goto L_0x0044
            boolean r9 = r14.a(r7)
            if (r9 != 0) goto L_0x0044
            r1 = 7
        L_0x0044:
            boolean r9 = r14.a(r1)
            if (r9 != 0) goto L_0x004b
            return r0
        L_0x004b:
            r9 = 3
            if (r1 != r8) goto L_0x009b
            int r14 = v6.e0.f26436a
            r10 = 29
            if (r14 < r10) goto L_0x0099
            int r13 = r13.H
            android.media.AudioAttributes$Builder r14 = new android.media.AudioAttributes$Builder
            r14.<init>()
            android.media.AudioAttributes$Builder r14 = r14.setUsage(r5)
            android.media.AudioAttributes$Builder r14 = r14.setContentType(r9)
            android.media.AudioAttributes r14 = r14.build()
            r10 = 8
        L_0x0069:
            if (r10 <= 0) goto L_0x008f
            android.media.AudioFormat$Builder r11 = new android.media.AudioFormat$Builder
            r11.<init>()
            android.media.AudioFormat$Builder r11 = r11.setEncoding(r8)
            android.media.AudioFormat$Builder r11 = r11.setSampleRate(r13)
            int r12 = v6.e0.q(r10)
            android.media.AudioFormat$Builder r11 = r11.setChannelMask(r12)
            android.media.AudioFormat r11 = r11.build()
            boolean r11 = android.media.AudioTrack.isDirectPlaybackSupported(r11, r14)
            if (r11 == 0) goto L_0x008c
            r2 = r10
            goto L_0x008f
        L_0x008c:
            int r10 = r10 + -1
            goto L_0x0069
        L_0x008f:
            if (r2 != 0) goto L_0x00a2
            java.lang.String r13 = "DefaultAudioSink"
            java.lang.String r14 = "E-AC3 JOC encoding supported but no channel count supported"
            android.util.Log.w(r13, r14)
            return r0
        L_0x0099:
            r2 = 6
            goto L_0x00a2
        L_0x009b:
            int r2 = r13.G
            int r13 = r14.f28346b
            if (r2 <= r13) goto L_0x00a2
            return r0
        L_0x00a2:
            int r13 = v6.e0.f26436a
            r14 = 28
            if (r13 > r14) goto L_0x00b5
            if (r2 != r4) goto L_0x00ad
            r6 = 8
            goto L_0x00b6
        L_0x00ad:
            if (r2 == r9) goto L_0x00b6
            r14 = 4
            if (r2 == r14) goto L_0x00b6
            if (r2 != r3) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r6 = r2
        L_0x00b6:
            r14 = 26
            if (r13 > r14) goto L_0x00c7
            java.lang.String r13 = v6.e0.f26437b
            java.lang.String r14 = "fugu"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00c7
            if (r6 != r5) goto L_0x00c7
            r6 = 2
        L_0x00c7:
            int r13 = v6.e0.q(r6)
            if (r13 != 0) goto L_0x00ce
            return r0
        L_0x00ce:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.util.Pair r13 = android.util.Pair.create(r14, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.A(x4.b0, z4.e):android.util.Pair");
    }

    public static boolean G(AudioTrack audioTrack) {
        return e0.f26436a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static boolean H(b0 b0Var, d dVar) {
        int q10;
        int i10 = e0.f26436a;
        if (i10 < 29) {
            return false;
        }
        String str = b0Var.f27408t;
        str.getClass();
        int d10 = s.d(str, b0Var.f27405i);
        if (d10 == 0 || (q10 = e0.q(b0Var.G)) == 0 || !AudioManager.isOffloadedPlaybackSupported(y(b0Var.H, q10, d10), dVar.a())) {
            return false;
        }
        if (!(b0Var.J == 0 && b0Var.K == 0)) {
            if (i10 >= 30 && e0.f26439d.startsWith("Pixel")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static AudioFormat y(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public final e B() {
        e eVar = this.f28440u;
        if (eVar != null) {
            return eVar;
        }
        if (!this.f28429j.isEmpty()) {
            return this.f28429j.getLast();
        }
        return this.f28441v;
    }

    public boolean C() {
        return B().f28461b;
    }

    public final long D() {
        c cVar = this.f28437r;
        if (cVar.f28450c == 0) {
            return this.B / ((long) cVar.f28451d);
        }
        return this.C;
    }

    public final void E() throws l.b {
        k.a aVar;
        Handler handler;
        this.f28427h.block();
        try {
            c cVar = this.f28437r;
            cVar.getClass();
            AudioTrack a10 = cVar.a(this.W, this.f28439t, this.U);
            this.f28438s = a10;
            if (G(a10)) {
                AudioTrack audioTrack = this.f28438s;
                if (this.f28432m == null) {
                    this.f28432m = new h();
                }
                h hVar = this.f28432m;
                Handler handler2 = hVar.f28467a;
                handler2.getClass();
                audioTrack.registerStreamEventCallback(new s(handler2), hVar.f28468b);
                AudioTrack audioTrack2 = this.f28438s;
                b0 b0Var = this.f28437r.f28448a;
                audioTrack2.setOffloadDelayPadding(b0Var.J, b0Var.K);
            }
            this.U = this.f28438s.getAudioSessionId();
            n nVar = this.f28428i;
            AudioTrack audioTrack3 = this.f28438s;
            c cVar2 = this.f28437r;
            nVar.e(audioTrack3, cVar2.f28450c == 2, cVar2.f28454g, cVar2.f28451d, cVar2.f28455h);
            N();
            int i10 = this.V.f28409a;
            if (i10 != 0) {
                this.f28438s.attachAuxEffect(i10);
                this.f28438s.setAuxEffectSendLevel(this.V.f28410b);
            }
            this.F = true;
        } catch (l.b e10) {
            if (this.f28437r.f()) {
                this.Y = true;
            }
            l.c cVar3 = this.f28435p;
            if (!(cVar3 == null || (handler = aVar.f28365a) == null)) {
                handler.post(new c1.c((aVar = v.this.W0), (Exception) e10));
            }
            throw e10;
        }
    }

    public final boolean F() {
        return this.f28438s != null;
    }

    public final void I() {
        if (!this.R) {
            this.R = true;
            n nVar = this.f28428i;
            long D2 = D();
            nVar.f28408z = nVar.b();
            nVar.f28406x = SystemClock.elapsedRealtime() * 1000;
            nVar.A = D2;
            this.f28438s.stop();
            this.f28444y = 0;
        }
    }

    public final void J(long j10) throws l.d {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.J[i10 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = g.f28347a;
                }
            }
            if (i10 == length) {
                P(byteBuffer, j10);
            } else {
                g gVar = this.I[i10];
                if (i10 > this.P) {
                    gVar.f(byteBuffer);
                }
                ByteBuffer c10 = gVar.c();
                this.J[i10] = c10;
                if (c10.hasRemaining()) {
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

    public final void K() {
        this.f28445z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.Z = false;
        this.D = 0;
        this.f28441v = new e(z(), C(), 0, 0, (a) null);
        this.G = 0;
        this.f28440u = null;
        this.f28429j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.f28443x = null;
        this.f28444y = 0;
        this.f28424e.f28336o = 0;
        x();
    }

    public final void L(o0 o0Var, boolean z10) {
        e B2 = B();
        if (!o0Var.equals(B2.f28460a) || z10 != B2.f28461b) {
            e eVar = new e(o0Var, z10, -9223372036854775807L, -9223372036854775807L, (a) null);
            if (F()) {
                this.f28440u = eVar;
            } else {
                this.f28441v = eVar;
            }
        }
    }

    public final void M(o0 o0Var) {
        if (F()) {
            try {
                this.f28438s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(o0Var.f27700a).setPitch(o0Var.f27701b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                p.d("DefaultAudioSink", "Failed to set playback params", e10);
            }
            o0Var = new o0(this.f28438s.getPlaybackParams().getSpeed(), this.f28438s.getPlaybackParams().getPitch());
            n nVar = this.f28428i;
            nVar.f28392j = o0Var.f27700a;
            m mVar = nVar.f28388f;
            if (mVar != null) {
                mVar.a();
            }
        }
        this.f28442w = o0Var;
    }

    public final void N() {
        if (F()) {
            if (e0.f26436a >= 21) {
                this.f28438s.setVolume(this.H);
                return;
            }
            AudioTrack audioTrack = this.f28438s;
            float f10 = this.H;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final boolean O() {
        if (this.W || !"audio/raw".equals(this.f28437r.f28448a.f27408t)) {
            return false;
        }
        if (!(this.f28422c && e0.G(this.f28437r.f28448a.I))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        if (r15 < r14) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(java.nio.ByteBuffer r13, long r14) throws z4.l.d {
        /*
            r12 = this;
            boolean r0 = r13.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r12.M
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r13) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            v6.a.a(r0)
            goto L_0x003b
        L_0x0018:
            r12.M = r13
            int r0 = v6.e0.f26436a
            if (r0 >= r1) goto L_0x003b
            int r0 = r13.remaining()
            byte[] r4 = r12.N
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r12.N = r4
        L_0x002d:
            int r4 = r13.position()
            byte[] r5 = r12.N
            r13.get(r5, r3, r0)
            r13.position(r4)
            r12.O = r3
        L_0x003b:
            int r0 = r13.remaining()
            int r4 = v6.e0.f26436a
            if (r4 >= r1) goto L_0x0076
            z4.n r14 = r12.f28428i
            long r5 = r12.B
            long r7 = r14.b()
            int r15 = r14.f28386d
            long r9 = (long) r15
            long r7 = r7 * r9
            long r5 = r5 - r7
            int r15 = (int) r5
            int r14 = r14.f28387e
            int r14 = r14 - r15
            if (r14 <= 0) goto L_0x00e4
            int r14 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r15 = r12.f28438s
            byte[] r1 = r12.N
            int r5 = r12.O
            int r14 = r15.write(r1, r5, r14)
            if (r14 <= 0) goto L_0x00fb
            int r15 = r12.O
            int r15 = r15 + r14
            r12.O = r15
            int r15 = r13.position()
            int r15 = r15 + r14
            r13.position(r15)
            goto L_0x00fb
        L_0x0076:
            boolean r1 = r12.W
            if (r1 == 0) goto L_0x00f5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0085
            r1 = 1
            goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            v6.a.d(r1)
            android.media.AudioTrack r6 = r12.f28438s
            r7 = 1000(0x3e8, double:4.94E-321)
            r1 = 26
            if (r4 < r1) goto L_0x009b
            r9 = 1
            long r10 = r14 * r7
            r7 = r13
            r8 = r0
            int r14 = r6.write(r7, r8, r9, r10)
            goto L_0x00fb
        L_0x009b:
            java.nio.ByteBuffer r1 = r12.f28443x
            if (r1 != 0) goto L_0x00b4
            r1 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r12.f28443x = r1
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r5)
            java.nio.ByteBuffer r1 = r12.f28443x
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r1.putInt(r5)
        L_0x00b4:
            int r1 = r12.f28444y
            if (r1 != 0) goto L_0x00ce
            java.nio.ByteBuffer r1 = r12.f28443x
            r5 = 4
            r1.putInt(r5, r0)
            java.nio.ByteBuffer r1 = r12.f28443x
            r5 = 8
            long r14 = r14 * r7
            r1.putLong(r5, r14)
            java.nio.ByteBuffer r14 = r12.f28443x
            r14.position(r3)
            r12.f28444y = r0
        L_0x00ce:
            java.nio.ByteBuffer r14 = r12.f28443x
            int r14 = r14.remaining()
            if (r14 <= 0) goto L_0x00e6
            java.nio.ByteBuffer r15 = r12.f28443x
            int r15 = r6.write(r15, r14, r2)
            if (r15 >= 0) goto L_0x00e2
            r12.f28444y = r3
            r14 = r15
            goto L_0x00fb
        L_0x00e2:
            if (r15 >= r14) goto L_0x00e6
        L_0x00e4:
            r14 = 0
            goto L_0x00fb
        L_0x00e6:
            int r14 = r6.write(r13, r0, r2)
            if (r14 >= 0) goto L_0x00ef
            r12.f28444y = r3
            goto L_0x00fb
        L_0x00ef:
            int r15 = r12.f28444y
            int r15 = r15 - r14
            r12.f28444y = r15
            goto L_0x00fb
        L_0x00f5:
            android.media.AudioTrack r14 = r12.f28438s
            int r14 = r14.write(r13, r0, r2)
        L_0x00fb:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r12.X = r5
            if (r14 >= 0) goto L_0x0146
            r13 = 24
            if (r4 < r13) goto L_0x010a
            r13 = -6
            if (r14 == r13) goto L_0x010e
        L_0x010a:
            r13 = -32
            if (r14 != r13) goto L_0x010f
        L_0x010e:
            r3 = 1
        L_0x010f:
            if (r3 == 0) goto L_0x011c
            z4.r$c r13 = r12.f28437r
            boolean r13 = r13.f()
            if (r13 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r12.Y = r2
        L_0x011c:
            z4.l$d r13 = new z4.l$d
            z4.r$c r15 = r12.f28437r
            x4.b0 r15 = r15.f28448a
            r13.<init>(r14, r15, r3)
            z4.l$c r14 = r12.f28435p
            if (r14 == 0) goto L_0x013b
            z4.v$b r14 = (z4.v.b) r14
            z4.v r14 = z4.v.this
            z4.k$a r14 = r14.W0
            android.os.Handler r15 = r14.f28365a
            if (r15 == 0) goto L_0x013b
            c1.c r0 = new c1.c
            r0.<init>((z4.k.a) r14, (java.lang.Exception) r13)
            r15.post(r0)
        L_0x013b:
            boolean r14 = r13.f28370a
            if (r14 != 0) goto L_0x0145
            z4.r$f<z4.l$d> r14 = r12.f28434o
            r14.a(r13)
            return
        L_0x0145:
            throw r13
        L_0x0146:
            z4.r$f<z4.l$d> r15 = r12.f28434o
            r1 = 0
            r15.f28464a = r1
            android.media.AudioTrack r15 = r12.f28438s
            boolean r15 = G(r15)
            if (r15 == 0) goto L_0x0187
            long r4 = r12.C
            r6 = 0
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x015d
            r12.Z = r3
        L_0x015d:
            boolean r15 = r12.S
            if (r15 == 0) goto L_0x0187
            z4.l$c r15 = r12.f28435p
            if (r15 == 0) goto L_0x0187
            if (r14 >= r0) goto L_0x0187
            boolean r15 = r12.Z
            if (r15 != 0) goto L_0x0187
            z4.n r15 = r12.f28428i
            long r6 = r15.b()
            long r4 = r4 - r6
            long r4 = r15.a(r4)
            long r4 = x4.f.c(r4)
            z4.l$c r15 = r12.f28435p
            z4.v$b r15 = (z4.v.b) r15
            z4.v r15 = z4.v.this
            x4.v0$a r15 = r15.f28481f1
            if (r15 == 0) goto L_0x0187
            r15.b(r4)
        L_0x0187:
            z4.r$c r15 = r12.f28437r
            int r15 = r15.f28450c
            if (r15 != 0) goto L_0x0193
            long r4 = r12.B
            long r6 = (long) r14
            long r4 = r4 + r6
            r12.B = r4
        L_0x0193:
            if (r14 != r0) goto L_0x01ae
            if (r15 == 0) goto L_0x01ac
            java.nio.ByteBuffer r14 = r12.K
            if (r13 != r14) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r2 = 0
        L_0x019d:
            v6.a.d(r2)
            long r13 = r12.C
            int r15 = r12.D
            int r0 = r12.L
            int r15 = r15 * r0
            long r2 = (long) r15
            long r13 = r13 + r2
            r12.C = r13
        L_0x01ac:
            r12.M = r1
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.P(java.nio.ByteBuffer, long):void");
    }

    public void a(o oVar) {
        if (!this.V.equals(oVar)) {
            int i10 = oVar.f28409a;
            float f10 = oVar.f28410b;
            AudioTrack audioTrack = this.f28438s;
            if (audioTrack != null) {
                if (this.V.f28409a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f28438s.setAuxEffectSendLevel(f10);
                }
            }
            this.V = oVar;
        }
    }

    public void b() {
        flush();
        for (g b10 : this.f28425f) {
            b10.b();
        }
        for (g b11 : this.f28426g) {
            b11.b();
        }
        this.S = false;
        this.Y = false;
    }

    public void c() {
        v6.a.d(e0.f26436a >= 21);
        v6.a.d(this.T);
        if (!this.W) {
            this.W = true;
            flush();
        }
    }

    public boolean d() {
        return !F() || (this.Q && !j());
    }

    public void e() throws l.d {
        if (!this.Q && F() && w()) {
            I();
            this.Q = true;
        }
    }

    public o0 f() {
        if (this.f28430k) {
            return this.f28442w;
        }
        return z();
    }

    public void flush() {
        if (F()) {
            K();
            AudioTrack audioTrack = this.f28428i.f28385c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f28438s.pause();
            }
            if (G(this.f28438s)) {
                h hVar = this.f28432m;
                hVar.getClass();
                this.f28438s.unregisterStreamEventCallback(hVar.f28468b);
                hVar.f28467a.removeCallbacksAndMessages((Object) null);
            }
            AudioTrack audioTrack2 = this.f28438s;
            this.f28438s = null;
            if (e0.f26436a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f28436q;
            if (cVar != null) {
                this.f28437r = cVar;
                this.f28436q = null;
            }
            this.f28428i.d();
            this.f28427h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack2).start();
        }
        this.f28434o.f28464a = null;
        this.f28433n.f28464a = null;
    }

    public void g() {
        boolean z10 = false;
        this.S = false;
        if (F()) {
            n nVar = this.f28428i;
            nVar.f28394l = 0;
            nVar.f28405w = 0;
            nVar.f28404v = 0;
            nVar.f28395m = 0;
            nVar.C = 0;
            nVar.F = 0;
            nVar.f28393k = false;
            if (nVar.f28406x == -9223372036854775807L) {
                m mVar = nVar.f28388f;
                mVar.getClass();
                mVar.a();
                z10 = true;
            }
            if (z10) {
                this.f28438s.pause();
            }
        }
    }

    public boolean h(b0 b0Var) {
        return q(b0Var) != 0;
    }

    public void i(o0 o0Var) {
        o0 o0Var2 = new o0(e0.h(o0Var.f27700a, 0.1f, 8.0f), e0.h(o0Var.f27701b, 0.1f, 8.0f));
        if (!this.f28430k || e0.f26436a < 23) {
            L(o0Var2, C());
        } else {
            M(o0Var2);
        }
    }

    public boolean j() {
        return F() && this.f28428i.c(D());
    }

    public void k(b0 b0Var, int i10, int[] iArr) throws l.a {
        g[] gVarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        g[] gVarArr2;
        int[] iArr2;
        b0 b0Var2 = b0Var;
        int i18 = 1;
        if ("audio/raw".equals(b0Var2.f27408t)) {
            v6.a.a(e0.H(b0Var2.I));
            int y10 = e0.y(b0Var2.I, b0Var2.G);
            int i19 = b0Var2.I;
            if (!this.f28422c || !e0.G(i19)) {
                i18 = 0;
            }
            if (i18 != 0) {
                gVarArr2 = this.f28426g;
            } else {
                gVarArr2 = this.f28425f;
            }
            c0 c0Var = this.f28424e;
            int i20 = b0Var2.J;
            int i21 = b0Var2.K;
            c0Var.f28330i = i20;
            c0Var.f28331j = i21;
            if (e0.f26436a < 21 && b0Var2.G == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i22 = 0; i22 < 6; i22++) {
                    iArr2[i22] = i22;
                }
            } else {
                iArr2 = iArr;
            }
            this.f28423d.f28418i = iArr2;
            g.a aVar = new g.a(b0Var2.H, b0Var2.G, b0Var2.I);
            int length = gVarArr2.length;
            int i23 = 0;
            while (i23 < length) {
                g gVar = gVarArr2[i23];
                try {
                    g.a g10 = gVar.g(aVar);
                    if (gVar.a()) {
                        aVar = g10;
                    }
                    i23++;
                } catch (g.b e10) {
                    throw new l.a((Throwable) e10, b0Var);
                }
            }
            int i24 = aVar.f28351c;
            i13 = aVar.f28349a;
            i12 = e0.q(aVar.f28350b);
            gVarArr = gVarArr2;
            i11 = i24;
            i14 = e0.y(i24, aVar.f28350b);
            i15 = y10;
            i16 = 0;
        } else {
            g[] gVarArr3 = new g[0];
            int i25 = b0Var2.H;
            if (!this.f28431l || !H(b0Var, this.f28439t)) {
                Pair<Integer, Integer> A2 = A(b0Var, this.f28420a);
                if (A2 != null) {
                    i17 = ((Integer) A2.first).intValue();
                    i12 = ((Integer) A2.second).intValue();
                    i18 = 2;
                } else {
                    throw new l.a("Unable to configure passthrough for: " + b0Var, b0Var);
                }
            } else {
                String str = b0Var2.f27408t;
                str.getClass();
                i17 = s.d(str, b0Var2.f27405i);
                i12 = e0.q(b0Var2.G);
            }
            gVarArr = gVarArr3;
            i16 = i18;
            i11 = i17;
            i15 = -1;
            i13 = i25;
            i14 = -1;
        }
        if (i11 == 0) {
            throw new l.a("Invalid output encoding (mode=" + i16 + ") for: " + b0Var, b0Var);
        } else if (i12 != 0) {
            this.Y = false;
            c cVar = new c(b0Var, i15, i16, i14, i13, i12, i11, i10, this.f28430k, gVarArr);
            if (F()) {
                this.f28436q = cVar;
            } else {
                this.f28437r = cVar;
            }
        } else {
            throw new l.a("Invalid output channel config (mode=" + i16 + ") for: " + b0Var, b0Var);
        }
    }

    public void k0() {
        this.S = true;
        if (F()) {
            m mVar = this.f28428i.f28388f;
            mVar.getClass();
            mVar.a();
            this.f28438s.play();
        }
    }

    public void l(d dVar) {
        if (!this.f28439t.equals(dVar)) {
            this.f28439t = dVar;
            if (!this.W) {
                flush();
            }
        }
    }

    public void m(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.T = i10 != 0;
            flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        if (r5.b() == 0) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0107 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n(java.nio.ByteBuffer r19, long r20, int r22) throws z4.l.b, z4.l.d {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r4 = r22
            java.nio.ByteBuffer r5 = r1.K
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0013
            if (r0 != r5) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            v6.a.a(r5)
            z4.r$c r5 = r1.f28436q
            r8 = 0
            if (r5 == 0) goto L_0x0080
            boolean r5 = r18.w()
            if (r5 != 0) goto L_0x0023
            return r7
        L_0x0023:
            z4.r$c r5 = r1.f28436q
            z4.r$c r9 = r1.f28437r
            r5.getClass()
            int r10 = r9.f28450c
            int r11 = r5.f28450c
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f28454g
            int r11 = r5.f28454g
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f28452e
            int r11 = r5.f28452e
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f28453f
            int r11 = r5.f28453f
            if (r10 != r11) goto L_0x004a
            int r9 = r9.f28451d
            int r5 = r5.f28451d
            if (r9 != r5) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 != 0) goto L_0x005b
            r18.I()
            boolean r5 = r18.j()
            if (r5 == 0) goto L_0x0057
            return r7
        L_0x0057:
            r18.flush()
            goto L_0x007d
        L_0x005b:
            z4.r$c r5 = r1.f28436q
            r1.f28437r = r5
            r1.f28436q = r8
            android.media.AudioTrack r5 = r1.f28438s
            boolean r5 = G(r5)
            if (r5 == 0) goto L_0x007d
            android.media.AudioTrack r5 = r1.f28438s
            r5.setOffloadEndOfStream()
            android.media.AudioTrack r5 = r1.f28438s
            z4.r$c r9 = r1.f28437r
            x4.b0 r9 = r9.f28448a
            int r10 = r9.J
            int r9 = r9.K
            r5.setOffloadDelayPadding(r10, r9)
            r1.Z = r6
        L_0x007d:
            r1.v(r2)
        L_0x0080:
            boolean r5 = r18.F()
            if (r5 != 0) goto L_0x0097
            r18.E()     // Catch:{ b -> 0x008a }
            goto L_0x0097
        L_0x008a:
            r0 = move-exception
            r2 = r0
            boolean r0 = r2.f28368a
            if (r0 != 0) goto L_0x0096
            z4.r$f<z4.l$b> r0 = r1.f28433n
            r0.a(r2)
            return r7
        L_0x0096:
            throw r2
        L_0x0097:
            z4.r$f<z4.l$b> r5 = r1.f28433n
            r5.f28464a = r8
            boolean r5 = r1.F
            r9 = 0
            if (r5 == 0) goto L_0x00c4
            long r11 = java.lang.Math.max(r9, r2)
            r1.G = r11
            r1.E = r7
            r1.F = r7
            boolean r5 = r1.f28430k
            if (r5 == 0) goto L_0x00ba
            int r5 = v6.e0.f26436a
            r11 = 23
            if (r5 < r11) goto L_0x00ba
            x4.o0 r5 = r1.f28442w
            r1.M(r5)
        L_0x00ba:
            r1.v(r2)
            boolean r5 = r1.S
            if (r5 == 0) goto L_0x00c4
            r18.k0()
        L_0x00c4:
            z4.n r5 = r1.f28428i
            long r11 = r18.D()
            android.media.AudioTrack r13 = r5.f28385c
            r13.getClass()
            int r13 = r13.getPlayState()
            boolean r14 = r5.f28390h
            r15 = 2
            if (r14 == 0) goto L_0x00e9
            if (r13 != r15) goto L_0x00dd
            r5.f28398p = r7
            goto L_0x00e7
        L_0x00dd:
            if (r13 != r6) goto L_0x00e9
            long r16 = r5.b()
            int r14 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x00e9
        L_0x00e7:
            r5 = 0
            goto L_0x0105
        L_0x00e9:
            boolean r9 = r5.f28398p
            boolean r10 = r5.c(r11)
            r5.f28398p = r10
            if (r9 == 0) goto L_0x0104
            if (r10 != 0) goto L_0x0104
            if (r13 == r6) goto L_0x0104
            z4.n$a r9 = r5.f28383a
            int r10 = r5.f28387e
            long r11 = r5.f28391i
            long r11 = x4.f.c(r11)
            r9.b(r10, r11)
        L_0x0104:
            r5 = 1
        L_0x0105:
            if (r5 != 0) goto L_0x0108
            return r7
        L_0x0108:
            java.nio.ByteBuffer r5 = r1.K
            java.lang.String r7 = "DefaultAudioSink"
            if (r5 != 0) goto L_0x0340
            java.nio.ByteOrder r5 = r19.order()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r9) goto L_0x0118
            r5 = 1
            goto L_0x0119
        L_0x0118:
            r5 = 0
        L_0x0119:
            v6.a.a(r5)
            boolean r5 = r19.hasRemaining()
            if (r5 != 0) goto L_0x0123
            return r6
        L_0x0123:
            z4.r$c r5 = r1.f28437r
            int r9 = r5.f28450c
            if (r9 == 0) goto L_0x0290
            int r9 = r1.D
            if (r9 != 0) goto L_0x0290
            int r5 = r5.f28454g
            r9 = 16
            r10 = -1
            r11 = -2
            switch(r5) {
                case 5: goto L_0x024c;
                case 6: goto L_0x024c;
                case 7: goto L_0x01f1;
                case 8: goto L_0x01f1;
                case 9: goto L_0x01cc;
                case 10: goto L_0x01c8;
                case 11: goto L_0x01c4;
                case 12: goto L_0x01c4;
                case 13: goto L_0x0136;
                case 14: goto L_0x015f;
                case 15: goto L_0x015b;
                case 16: goto L_0x01c8;
                case 17: goto L_0x0142;
                case 18: goto L_0x024c;
                default: goto L_0x0136;
            }
        L_0x0136:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected audio encoding: "
            java.lang.String r2 = androidx.appcompat.widget.d0.a(r2, r5)
            r0.<init>(r2)
            throw r0
        L_0x0142:
            byte[] r5 = new byte[r9]
            int r9 = r19.position()
            r0.get(r5)
            r0.position(r9)
            d5.b0 r9 = new d5.b0
            r9.<init>((byte[]) r5, (int) r6, (q.e) r8)
            z4.c$b r5 = z4.c.b(r9)
            int r5 = r5.f28329c
            goto L_0x028b
        L_0x015b:
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x028b
        L_0x015f:
            int r5 = r19.position()
            int r8 = r19.limit()
            int r8 = r8 + -10
            r9 = r5
        L_0x016a:
            if (r9 > r8) goto L_0x018d
            int r11 = r9 + 4
            int r12 = v6.e0.f26436a
            int r11 = r0.getInt(r11)
            java.nio.ByteOrder r12 = r19.order()
            java.nio.ByteOrder r13 = java.nio.ByteOrder.BIG_ENDIAN
            if (r12 != r13) goto L_0x017d
            goto L_0x0181
        L_0x017d:
            int r11 = java.lang.Integer.reverseBytes(r11)
        L_0x0181:
            r11 = r11 & -2
            r12 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r11 != r12) goto L_0x018a
            int r9 = r9 - r5
            goto L_0x018e
        L_0x018a:
            int r9 = r9 + 1
            goto L_0x016a
        L_0x018d:
            r9 = -1
        L_0x018e:
            if (r9 != r10) goto L_0x0193
            r5 = 0
            goto L_0x028b
        L_0x0193:
            int r5 = r19.position()
            int r5 = r5 + r9
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r8 = 187(0xbb, float:2.62E-43)
            if (r5 != r8) goto L_0x01a6
            r5 = 1
            goto L_0x01a7
        L_0x01a6:
            r5 = 0
        L_0x01a7:
            r8 = 40
            int r10 = r19.position()
            int r10 = r10 + r9
            if (r5 == 0) goto L_0x01b3
            r5 = 9
            goto L_0x01b5
        L_0x01b3:
            r5 = 8
        L_0x01b5:
            int r10 = r10 + r5
            byte r5 = r0.get(r10)
            int r5 = r5 >> 4
            r5 = r5 & 7
            int r5 = r8 << r5
            int r5 = r5 * 16
            goto L_0x028b
        L_0x01c4:
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x028b
        L_0x01c8:
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x028b
        L_0x01cc:
            int r5 = r19.position()
            int r8 = v6.e0.f26436a
            int r5 = r0.getInt(r5)
            java.nio.ByteOrder r8 = r19.order()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN
            if (r8 != r9) goto L_0x01df
            goto L_0x01e3
        L_0x01df:
            int r5 = java.lang.Integer.reverseBytes(r5)
        L_0x01e3:
            int r5 = z4.x.d(r5)
            if (r5 == r10) goto L_0x01eb
            goto L_0x028b
        L_0x01eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x01f1:
            int r5 = r19.position()
            byte r8 = r0.get(r5)
            if (r8 == r11) goto L_0x0235
            if (r8 == r10) goto L_0x0222
            r9 = 31
            if (r8 == r9) goto L_0x0211
            int r8 = r5 + 4
            byte r8 = r0.get(r8)
            r8 = r8 & r6
            int r8 = r8 << 6
            int r5 = r5 + 5
            byte r5 = r0.get(r5)
            goto L_0x0244
        L_0x0211:
            int r8 = r5 + 5
            byte r8 = r0.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r5 = r5 + 6
            byte r5 = r0.get(r5)
            goto L_0x0232
        L_0x0222:
            int r8 = r5 + 4
            byte r8 = r0.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
        L_0x0232:
            r5 = r5 & 60
            goto L_0x0246
        L_0x0235:
            int r8 = r5 + 5
            byte r8 = r0.get(r8)
            r8 = r8 & r6
            int r8 = r8 << 6
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
        L_0x0244:
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L_0x0246:
            int r5 = r5 >> r15
            r5 = r5 | r8
            int r5 = r5 + r6
            int r5 = r5 * 32
            goto L_0x028b
        L_0x024c:
            int r5 = r19.position()
            int r5 = r5 + 5
            byte r5 = r0.get(r5)
            r5 = r5 & 248(0xf8, float:3.48E-43)
            r8 = 3
            int r5 = r5 >> r8
            r9 = 10
            if (r5 <= r9) goto L_0x0260
            r5 = 1
            goto L_0x0261
        L_0x0260:
            r5 = 0
        L_0x0261:
            if (r5 == 0) goto L_0x0289
            int r5 = r19.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> 6
            if (r5 != r8) goto L_0x0274
            goto L_0x0282
        L_0x0274:
            int r5 = r19.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 48
            int r8 = r5 >> 4
        L_0x0282:
            int[] r5 = z4.b.f28305a
            r5 = r5[r8]
            int r5 = r5 * 256
            goto L_0x028b
        L_0x0289:
            r5 = 1536(0x600, float:2.152E-42)
        L_0x028b:
            r1.D = r5
            if (r5 != 0) goto L_0x0290
            return r6
        L_0x0290:
            z4.r$e r5 = r1.f28440u
            if (r5 == 0) goto L_0x02a2
            boolean r5 = r18.w()
            if (r5 != 0) goto L_0x029c
            r0 = 0
            return r0
        L_0x029c:
            r1.v(r2)
            r5 = 0
            r1.f28440u = r5
        L_0x02a2:
            long r8 = r1.G
            z4.r$c r5 = r1.f28437r
            int r10 = r5.f28450c
            if (r10 != 0) goto L_0x02b1
            long r10 = r1.f28445z
            int r12 = r5.f28449b
            long r12 = (long) r12
            long r10 = r10 / r12
            goto L_0x02b3
        L_0x02b1:
            long r10 = r1.A
        L_0x02b3:
            z4.c0 r12 = r1.f28424e
            long r12 = r12.f28336o
            long r10 = r10 - r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r12
            x4.b0 r5 = r5.f28448a
            int r5 = r5.H
            long r12 = (long) r5
            long r10 = r10 / r12
            long r10 = r10 + r8
            boolean r5 = r1.E
            if (r5 != 0) goto L_0x02f8
            long r8 = r10 - r2
            long r8 = java.lang.Math.abs(r8)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x02f8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Discontinuity detected [expected "
            r5.append(r8)
            r5.append(r10)
            java.lang.String r8 = ", got "
            r5.append(r8)
            r5.append(r2)
            java.lang.String r8 = "]"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r7, r5)
            r1.E = r6
        L_0x02f8:
            boolean r5 = r1.E
            if (r5 == 0) goto L_0x0321
            boolean r5 = r18.w()
            if (r5 != 0) goto L_0x0304
            r0 = 0
            return r0
        L_0x0304:
            r5 = 0
            long r8 = r2 - r10
            long r10 = r1.G
            long r10 = r10 + r8
            r1.G = r10
            r1.E = r5
            r1.v(r2)
            z4.l$c r5 = r1.f28435p
            if (r5 == 0) goto L_0x0321
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0321
            z4.v$b r5 = (z4.v.b) r5
            z4.v r5 = z4.v.this
            r5.f28479d1 = r6
        L_0x0321:
            z4.r$c r5 = r1.f28437r
            int r5 = r5.f28450c
            if (r5 != 0) goto L_0x0332
            long r8 = r1.f28445z
            int r5 = r19.remaining()
            long r10 = (long) r5
            long r8 = r8 + r10
            r1.f28445z = r8
            goto L_0x033c
        L_0x0332:
            long r8 = r1.A
            int r5 = r1.D
            int r5 = r5 * r4
            long r10 = (long) r5
            long r8 = r8 + r10
            r1.A = r8
        L_0x033c:
            r1.K = r0
            r1.L = r4
        L_0x0340:
            r1.J(r2)
            java.nio.ByteBuffer r0 = r1.K
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0352
            r0 = 0
            r1.K = r0
            r0 = 0
            r1.L = r0
            return r6
        L_0x0352:
            z4.n r0 = r1.f28428i
            long r2 = r18.D()
            long r4 = r0.f28407y
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0378
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0378
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.f28407y
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0378
            r0 = 1
            goto L_0x0379
        L_0x0378:
            r0 = 0
        L_0x0379:
            if (r0 == 0) goto L_0x0384
            java.lang.String r0 = "Resetting stalled audio track"
            android.util.Log.w(r7, r0)
            r18.flush()
            return r6
        L_0x0384:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.n(java.nio.ByteBuffer, long, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ab A[Catch:{ Exception -> 0x01b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long o(boolean r27) {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r26.F()
            if (r1 == 0) goto L_0x02ed
            boolean r1 = r0.F
            if (r1 == 0) goto L_0x000e
            goto L_0x02ed
        L_0x000e:
            z4.n r1 = r0.f28428i
            android.media.AudioTrack r2 = r1.f28385c
            r2.getClass()
            int r2 = r2.getPlayState()
            r3 = 2
            r4 = 3
            r9 = 1
            r10 = 0
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r2 != r4) goto L_0x01ba
            long r5 = r1.b()
            long r24 = r1.a(r5)
            int r2 = (r24 > r10 ? 1 : (r24 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0030
            goto L_0x01ba
        L_0x0030:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 / r13
            long r7 = r1.f28395m
            long r7 = r5 - r7
            r17 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r2 < 0) goto L_0x006f
            long[] r2 = r1.f28384b
            int r7 = r1.f28404v
            long r17 = r24 - r5
            r2[r7] = r17
            int r7 = r7 + r9
            r2 = 10
            int r7 = r7 % r2
            r1.f28404v = r7
            int r7 = r1.f28405w
            if (r7 >= r2) goto L_0x0054
            int r7 = r7 + r9
            r1.f28405w = r7
        L_0x0054:
            r1.f28395m = r5
            r1.f28394l = r10
            r2 = 0
        L_0x0059:
            int r7 = r1.f28405w
            if (r2 >= r7) goto L_0x006f
            long r10 = r1.f28394l
            long[] r8 = r1.f28384b
            r17 = r8[r2]
            long r7 = (long) r7
            long r17 = r17 / r7
            long r7 = r17 + r10
            r1.f28394l = r7
            int r2 = r2 + 1
            r10 = 0
            goto L_0x0059
        L_0x006f:
            boolean r2 = r1.f28390h
            if (r2 == 0) goto L_0x0075
            goto L_0x01ba
        L_0x0075:
            z4.m r2 = r1.f28388f
            r2.getClass()
            z4.m$a r7 = r2.f28372a
            r8 = 4
            if (r7 == 0) goto L_0x010f
            long r10 = r2.f28376e
            long r10 = r5 - r10
            long r12 = r2.f28375d
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x008b
            goto L_0x010f
        L_0x008b:
            r2.f28376e = r5
            android.media.AudioTrack r10 = r7.f28378a
            android.media.AudioTimestamp r11 = r7.f28379b
            boolean r10 = r10.getTimestamp(r11)
            if (r10 == 0) goto L_0x00b4
            android.media.AudioTimestamp r11 = r7.f28379b
            long r11 = r11.framePosition
            long r13 = r7.f28381d
            int r17 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r17 <= 0) goto L_0x00a9
            long r13 = r7.f28380c
            r17 = 1
            long r13 = r13 + r17
            r7.f28380c = r13
        L_0x00a9:
            r7.f28381d = r11
            long r13 = r7.f28380c
            r17 = 32
            long r13 = r13 << r17
            long r11 = r11 + r13
            r7.f28382e = r11
        L_0x00b4:
            int r7 = r2.f28373b
            if (r7 == 0) goto L_0x00e7
            if (r7 == r9) goto L_0x00d3
            if (r7 == r3) goto L_0x00cd
            if (r7 == r4) goto L_0x00c7
            if (r7 != r8) goto L_0x00c1
            goto L_0x0110
        L_0x00c1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00c7:
            if (r10 == 0) goto L_0x0110
            r2.a()
            goto L_0x0110
        L_0x00cd:
            if (r10 != 0) goto L_0x0110
            r2.a()
            goto L_0x0110
        L_0x00d3:
            if (r10 == 0) goto L_0x00e3
            z4.m$a r4 = r2.f28372a
            long r11 = r4.f28382e
            long r13 = r2.f28377f
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0110
            r2.b(r3)
            goto L_0x0110
        L_0x00e3:
            r2.a()
            goto L_0x0110
        L_0x00e7:
            if (r10 == 0) goto L_0x0100
            z4.m$a r4 = r2.f28372a
            android.media.AudioTimestamp r7 = r4.f28379b
            long r11 = r7.nanoTime
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            long r13 = r2.f28374c
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x010f
            long r11 = r4.f28382e
            r2.f28377f = r11
            r2.b(r9)
            goto L_0x0110
        L_0x0100:
            long r11 = r2.f28374c
            long r11 = r5 - r11
            r13 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0110
            r2.b(r4)
            goto L_0x0110
        L_0x010f:
            r10 = 0
        L_0x0110:
            r11 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r10 != 0) goto L_0x0116
            goto L_0x016e
        L_0x0116:
            z4.m$a r4 = r2.f28372a
            if (r4 == 0) goto L_0x0125
            android.media.AudioTimestamp r7 = r4.f28379b
            long r13 = r7.nanoTime
            r17 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r17
            r20 = r13
            goto L_0x012a
        L_0x0125:
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x012a:
            if (r4 == 0) goto L_0x012f
            long r13 = r4.f28382e
            goto L_0x0131
        L_0x012f:
            r13 = -1
        L_0x0131:
            long r17 = r20 - r5
            long r17 = java.lang.Math.abs(r17)
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x014a
            z4.n$a r4 = r1.f28383a
            r17 = r4
            r18 = r13
            r22 = r5
            r17.d(r18, r20, r22, r24)
            r2.b(r8)
            goto L_0x016e
        L_0x014a:
            long r17 = r1.a(r13)
            long r17 = r17 - r24
            long r17 = java.lang.Math.abs(r17)
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0167
            z4.n$a r4 = r1.f28383a
            r17 = r4
            r18 = r13
            r22 = r5
            r17.c(r18, r20, r22, r24)
            r2.b(r8)
            goto L_0x016e
        L_0x0167:
            int r4 = r2.f28373b
            if (r4 != r8) goto L_0x016e
            r2.a()
        L_0x016e:
            boolean r2 = r1.f28399q
            if (r2 == 0) goto L_0x01ba
            java.lang.reflect.Method r2 = r1.f28396n
            if (r2 == 0) goto L_0x01ba
            long r7 = r1.f28400r
            long r7 = r5 - r7
            r13 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x01ba
            android.media.AudioTrack r4 = r1.f28385c     // Catch:{ Exception -> 0x01b5 }
            r4.getClass()     // Catch:{ Exception -> 0x01b5 }
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01b5 }
            java.lang.Object r2 = r2.invoke(r4, r8)     // Catch:{ Exception -> 0x01b5 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x01b5 }
            int r4 = v6.e0.f26436a     // Catch:{ Exception -> 0x01b5 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x01b5 }
            long r13 = (long) r2     // Catch:{ Exception -> 0x01b5 }
            r17 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r17
            long r7 = r1.f28391i     // Catch:{ Exception -> 0x01b5 }
            long r13 = r13 - r7
            r1.f28397o = r13     // Catch:{ Exception -> 0x01b5 }
            r7 = 0
            long r13 = java.lang.Math.max(r13, r7)     // Catch:{ Exception -> 0x01b5 }
            r1.f28397o = r13     // Catch:{ Exception -> 0x01b5 }
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b8
            z4.n$a r2 = r1.f28383a     // Catch:{ Exception -> 0x01b5 }
            r2.e(r13)     // Catch:{ Exception -> 0x01b5 }
            r7 = 0
            r1.f28397o = r7     // Catch:{ Exception -> 0x01b5 }
            goto L_0x01b8
        L_0x01b5:
            r2 = 0
            r1.f28396n = r2
        L_0x01b8:
            r1.f28400r = r5
        L_0x01ba:
            long r4 = java.lang.System.nanoTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            z4.m r2 = r1.f28388f
            r2.getClass()
            int r6 = r2.f28373b
            if (r6 != r3) goto L_0x01cc
            r12 = 1
            goto L_0x01cd
        L_0x01cc:
            r12 = 0
        L_0x01cd:
            if (r12 == 0) goto L_0x01f8
            z4.m$a r3 = r2.f28372a
            if (r3 == 0) goto L_0x01d6
            long r7 = r3.f28382e
            goto L_0x01d8
        L_0x01d6:
            r7 = -1
        L_0x01d8:
            long r6 = r1.a(r7)
            z4.m$a r2 = r2.f28372a
            if (r2 == 0) goto L_0x01e9
            android.media.AudioTimestamp r2 = r2.f28379b
            long r2 = r2.nanoTime
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r10
            r15 = r2
            goto L_0x01ee
        L_0x01e9:
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01ee:
            long r2 = r4 - r15
            float r8 = r1.f28392j
            long r2 = v6.e0.u(r2, r8)
            long r2 = r2 + r6
            goto L_0x0213
        L_0x01f8:
            int r2 = r1.f28405w
            if (r2 != 0) goto L_0x0205
            long r2 = r1.b()
            long r2 = r1.a(r2)
            goto L_0x0208
        L_0x0205:
            long r2 = r1.f28394l
            long r2 = r2 + r4
        L_0x0208:
            if (r27 != 0) goto L_0x0213
            long r6 = r1.f28397o
            long r2 = r2 - r6
            r6 = 0
            long r2 = java.lang.Math.max(r6, r2)
        L_0x0213:
            boolean r6 = r1.D
            if (r6 == r12) goto L_0x021f
            long r6 = r1.C
            r1.F = r6
            long r6 = r1.B
            r1.E = r6
        L_0x021f:
            long r6 = r1.F
            long r6 = r4 - r6
            r10 = 1000000(0xf4240, double:4.940656E-318)
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0241
            long r13 = r1.E
            float r8 = r1.f28392j
            long r15 = v6.e0.u(r6, r8)
            long r15 = r15 + r13
            r13 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r13
            long r6 = r6 / r10
            long r2 = r2 * r6
            long r6 = r13 - r6
            long r6 = r6 * r15
            long r6 = r6 + r2
            long r2 = r6 / r13
        L_0x0241:
            boolean r6 = r1.f28393k
            if (r6 != 0) goto L_0x0267
            long r6 = r1.B
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0267
            r1.f28393k = r9
            long r6 = r2 - r6
            long r6 = x4.f.c(r6)
            float r8 = r1.f28392j
            long r6 = v6.e0.z(r6, r8)
            long r8 = java.lang.System.currentTimeMillis()
            long r6 = x4.f.c(r6)
            long r8 = r8 - r6
            z4.n$a r6 = r1.f28383a
            r6.a(r8)
        L_0x0267:
            r1.C = r4
            r1.B = r2
            r1.D = r12
            z4.r$c r1 = r0.f28437r
            long r4 = r26.D()
            long r4 = r1.c(r4)
            long r1 = java.lang.Math.min(r2, r4)
        L_0x027b:
            java.util.ArrayDeque<z4.r$e> r3 = r0.f28429j
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x029c
            java.util.ArrayDeque<z4.r$e> r3 = r0.f28429j
            java.lang.Object r3 = r3.getFirst()
            z4.r$e r3 = (z4.r.e) r3
            long r3 = r3.f28463d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x029c
            java.util.ArrayDeque<z4.r$e> r3 = r0.f28429j
            java.lang.Object r3 = r3.remove()
            z4.r$e r3 = (z4.r.e) r3
            r0.f28441v = r3
            goto L_0x027b
        L_0x029c:
            z4.r$e r3 = r0.f28441v
            long r4 = r3.f28463d
            long r4 = r1 - r4
            x4.o0 r3 = r3.f28460a
            x4.o0 r6 = x4.o0.f27699d
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x02b2
            z4.r$e r1 = r0.f28441v
            long r1 = r1.f28462c
            long r1 = r1 + r4
            goto L_0x02df
        L_0x02b2:
            java.util.ArrayDeque<z4.r$e> r3 = r0.f28429j
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x02c6
            z4.r$b r1 = r0.f28421b
            long r1 = r1.d(r4)
            z4.r$e r3 = r0.f28441v
            long r3 = r3.f28462c
            long r1 = r1 + r3
            goto L_0x02df
        L_0x02c6:
            java.util.ArrayDeque<z4.r$e> r3 = r0.f28429j
            java.lang.Object r3 = r3.getFirst()
            z4.r$e r3 = (z4.r.e) r3
            long r4 = r3.f28463d
            long r4 = r4 - r1
            z4.r$e r1 = r0.f28441v
            x4.o0 r1 = r1.f28460a
            float r1 = r1.f27700a
            long r1 = v6.e0.u(r4, r1)
            long r3 = r3.f28462c
            long r1 = r3 - r1
        L_0x02df:
            z4.r$c r3 = r0.f28437r
            z4.r$b r4 = r0.f28421b
            long r4 = r4.b()
            long r3 = r3.c(r4)
            long r3 = r3 + r1
            return r3
        L_0x02ed:
            r1 = -9223372036854775808
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.o(boolean):long");
    }

    public void p() {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    public int q(b0 b0Var) {
        boolean z10 = true;
        if ("audio/raw".equals(b0Var.f27408t)) {
            if (!e0.H(b0Var.I)) {
                StringBuilder a10 = android.support.v4.media.a.a("Invalid PCM encoding: ");
                a10.append(b0Var.I);
                Log.w("DefaultAudioSink", a10.toString());
                return 0;
            }
            int i10 = b0Var.I;
            return (i10 == 2 || (this.f28422c && i10 == 4)) ? 2 : 1;
        } else if (this.f28431l && !this.Y && H(b0Var, this.f28439t)) {
            return 2;
        } else {
            if (A(b0Var, this.f28420a) == null) {
                z10 = false;
            }
            return z10 ? 2 : 0;
        }
    }

    public void r(l.c cVar) {
        this.f28435p = cVar;
    }

    public void s(boolean z10) {
        L(z(), z10);
    }

    public void t() {
        this.E = true;
    }

    public void u(float f10) {
        if (this.H != f10) {
            this.H = f10;
            N();
        }
    }

    public final void v(long j10) {
        o0 o0Var;
        k.a aVar;
        Handler handler;
        if (O()) {
            o0Var = this.f28421b.a(z());
        } else {
            o0Var = o0.f27699d;
        }
        o0 o0Var2 = o0Var;
        boolean c10 = O() ? this.f28421b.c(C()) : false;
        this.f28429j.add(new e(o0Var2, c10, Math.max(0, j10), this.f28437r.c(D()), (a) null));
        g[] gVarArr = this.f28437r.f28456i;
        ArrayList arrayList = new ArrayList();
        for (g gVar : gVarArr) {
            if (gVar.a()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.I = (g[]) arrayList.toArray(new g[size]);
        this.J = new ByteBuffer[size];
        x();
        l.c cVar = this.f28435p;
        if (cVar != null && (handler = aVar.f28365a) != null) {
            handler.post(new va.b((aVar = v.this.W0), c10));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w() throws z4.l.d {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.P = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.P
            z4.g[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.e()
        L_0x001f:
            r9.J(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.P
            int r0 = r0 + r2
            r9.P = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L_0x003b
            r9.P(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.w():boolean");
    }

    public final void x() {
        int i10 = 0;
        while (true) {
            g[] gVarArr = this.I;
            if (i10 < gVarArr.length) {
                g gVar = gVarArr[i10];
                gVar.flush();
                this.J[i10] = gVar.c();
                i10++;
            } else {
                return;
            }
        }
    }

    public final o0 z() {
        return B().f28460a;
    }
}
