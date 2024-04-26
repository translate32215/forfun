package x4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import b2.t;
import ba.o0;
import ba.q;
import ba.s;
import com.startapp.b4;
import h6.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import q5.a;
import r6.h;
import r6.n;
import u6.i;
import v6.e0;
import v6.p;
import x4.c1;
import x4.e0;
import x4.k;
import x4.l0;
import x4.s0;
import y4.v;
import z5.b0;
import z5.c0;
import z5.d0;
import z5.g0;
import z5.o;
import z5.r;

/* compiled from: ExoPlayerImplInternal */
public final class y implements Handler.Callback, o.a, n.a, l0.d, k.a, s0.a {
    public final l0 A;
    public final d0 B;
    public final long C;
    public z0 D;
    public n0 E;
    public d F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public g R;
    public long S;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public final v0[] f27764a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f27765a0;

    /* renamed from: b  reason: collision with root package name */
    public final w0[] f27766b;

    /* renamed from: b0  reason: collision with root package name */
    public m f27767b0;

    /* renamed from: c  reason: collision with root package name */
    public final n f27768c;

    /* renamed from: d  reason: collision with root package name */
    public final r6.o f27769d;

    /* renamed from: e  reason: collision with root package name */
    public final j f27770e;

    /* renamed from: f  reason: collision with root package name */
    public final u6.b f27771f;

    /* renamed from: g  reason: collision with root package name */
    public final t f27772g;

    /* renamed from: h  reason: collision with root package name */
    public final HandlerThread f27773h;

    /* renamed from: i  reason: collision with root package name */
    public final Looper f27774i;

    /* renamed from: r  reason: collision with root package name */
    public final c1.c f27775r;

    /* renamed from: s  reason: collision with root package name */
    public final c1.b f27776s;

    /* renamed from: t  reason: collision with root package name */
    public final long f27777t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f27778u = false;

    /* renamed from: v  reason: collision with root package name */
    public final k f27779v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<c> f27780w;

    /* renamed from: x  reason: collision with root package name */
    public final v6.b f27781x;

    /* renamed from: y  reason: collision with root package name */
    public final e f27782y;

    /* renamed from: z  reason: collision with root package name */
    public final i0 f27783z;

    /* compiled from: ExoPlayerImplInternal */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<l0.c> f27784a;

        /* renamed from: b  reason: collision with root package name */
        public final d0 f27785b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27786c;

        /* renamed from: d  reason: collision with root package name */
        public final long f27787d;

        public a(List list, d0 d0Var, int i10, long j10, x xVar) {
            this.f27784a = list;
            this.f27785b = d0Var;
            this.f27786c = i10;
            this.f27787d = j10;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    public static class b {
    }

    /* compiled from: ExoPlayerImplInternal */
    public static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f27788a;

        /* renamed from: b  reason: collision with root package name */
        public int f27789b;

        /* renamed from: c  reason: collision with root package name */
        public long f27790c;

        /* renamed from: d  reason: collision with root package name */
        public Object f27791d;

        public void a(int i10, long j10, Object obj) {
            this.f27789b = i10;
            this.f27790c = j10;
            this.f27791d = obj;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r0 != null) goto L_0x0017;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compareTo(java.lang.Object r9) {
            /*
                r8 = this;
                x4.y$c r9 = (x4.y.c) r9
                java.lang.Object r0 = r8.f27791d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000a
                r3 = 1
                goto L_0x000b
            L_0x000a:
                r3 = 0
            L_0x000b:
                java.lang.Object r4 = r9.f27791d
                if (r4 != 0) goto L_0x0011
                r4 = 1
                goto L_0x0012
            L_0x0011:
                r4 = 0
            L_0x0012:
                r5 = -1
                if (r3 == r4) goto L_0x001a
                if (r0 == 0) goto L_0x0018
            L_0x0017:
                r1 = -1
            L_0x0018:
                r2 = r1
                goto L_0x0037
            L_0x001a:
                if (r0 != 0) goto L_0x001d
                goto L_0x0037
            L_0x001d:
                int r0 = r8.f27789b
                int r3 = r9.f27789b
                int r0 = r0 - r3
                if (r0 == 0) goto L_0x0026
                r2 = r0
                goto L_0x0037
            L_0x0026:
                long r3 = r8.f27790c
                long r6 = r9.f27790c
                int r9 = v6.e0.f26436a
                int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r9 >= 0) goto L_0x0031
                goto L_0x0017
            L_0x0031:
                int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r9 != 0) goto L_0x0018
                r1 = 0
                goto L_0x0018
            L_0x0037:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: x4.y.c.compareTo(java.lang.Object):int");
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27792a;

        /* renamed from: b  reason: collision with root package name */
        public n0 f27793b;

        /* renamed from: c  reason: collision with root package name */
        public int f27794c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27795d;

        /* renamed from: e  reason: collision with root package name */
        public int f27796e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f27797f;

        /* renamed from: g  reason: collision with root package name */
        public int f27798g;

        public d(n0 n0Var) {
            this.f27793b = n0Var;
        }

        public void a(int i10) {
            this.f27792a |= i10 > 0;
            this.f27794c += i10;
        }

        public void b(int i10) {
            boolean z10 = true;
            if (!this.f27795d || this.f27796e == 4) {
                this.f27792a = true;
                this.f27795d = true;
                this.f27796e = i10;
                return;
            }
            if (i10 != 4) {
                z10 = false;
            }
            v6.a.a(z10);
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    public interface e {
    }

    /* compiled from: ExoPlayerImplInternal */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final r.a f27799a;

        /* renamed from: b  reason: collision with root package name */
        public final long f27800b;

        /* renamed from: c  reason: collision with root package name */
        public final long f27801c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27802d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f27803e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f27804f;

        public f(r.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f27799a = aVar;
            this.f27800b = j10;
            this.f27801c = j11;
            this.f27802d = z10;
            this.f27803e = z11;
            this.f27804f = z12;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final c1 f27805a;

        /* renamed from: b  reason: collision with root package name */
        public final int f27806b;

        /* renamed from: c  reason: collision with root package name */
        public final long f27807c;

        public g(c1 c1Var, int i10, long j10) {
            this.f27805a = c1Var;
            this.f27806b = i10;
            this.f27807c = j10;
        }
    }

    public y(v0[] v0VarArr, n nVar, r6.o oVar, j jVar, u6.b bVar, int i10, boolean z10, v vVar, z0 z0Var, d0 d0Var, long j10, boolean z11, Looper looper, v6.b bVar2, e eVar) {
        v0[] v0VarArr2 = v0VarArr;
        n nVar2 = nVar;
        j jVar2 = jVar;
        u6.b bVar3 = bVar;
        v vVar2 = vVar;
        v6.b bVar4 = bVar2;
        this.f27782y = eVar;
        this.f27764a = v0VarArr2;
        this.f27768c = nVar2;
        this.f27769d = oVar;
        this.f27770e = jVar2;
        this.f27771f = bVar3;
        this.L = i10;
        this.M = z10;
        this.D = z0Var;
        this.B = d0Var;
        this.C = j10;
        this.H = z11;
        this.f27781x = bVar4;
        this.f27777t = jVar2.f27632g;
        n0 i11 = n0.i(oVar);
        this.E = i11;
        this.F = new d(i11);
        this.f27766b = new w0[v0VarArr2.length];
        for (int i12 = 0; i12 < v0VarArr2.length; i12++) {
            v0VarArr2[i12].c(i12);
            this.f27766b[i12] = v0VarArr2[i12].w();
        }
        this.f27779v = new k(this, bVar4);
        this.f27780w = new ArrayList<>();
        this.f27775r = new c1.c();
        this.f27776s = new c1.b();
        nVar2.f24678a = this;
        nVar2.f24679b = bVar3;
        this.f27765a0 = true;
        Handler handler = new Handler(looper);
        this.f27783z = new i0(vVar2, handler);
        this.A = new l0(this, vVar2, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f27773h = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f27774i = looper2;
        this.f27772g = bVar4.c(looper2, this);
    }

    public static boolean I(c cVar, c1 c1Var, c1 c1Var2, int i10, boolean z10, c1.c cVar2, c1.b bVar) {
        c cVar3 = cVar;
        c1 c1Var3 = c1Var;
        c1 c1Var4 = c1Var2;
        c1.b bVar2 = bVar;
        Object obj = cVar3.f27791d;
        if (obj == null) {
            cVar3.f27788a.getClass();
            cVar3.f27788a.getClass();
            long b10 = f.b(-9223372036854775807L);
            s0 s0Var = cVar3.f27788a;
            Pair<Object, Long> K2 = K(c1Var, new g(s0Var.f27716d, s0Var.f27720h, b10), false, i10, z10, cVar2, bVar);
            if (K2 == null) {
                return false;
            }
            cVar.a(c1Var.b(K2.first), ((Long) K2.second).longValue(), K2.first);
            cVar3.f27788a.getClass();
            return true;
        }
        int b11 = c1Var.b(obj);
        if (b11 == -1) {
            return false;
        }
        cVar3.f27788a.getClass();
        cVar3.f27789b = b11;
        c1Var2.h(cVar3.f27791d, bVar2);
        if (c1Var2.n(bVar2.f27464c, cVar2).f27481l) {
            long j10 = cVar3.f27790c + bVar2.f27466e;
            Pair<Object, Long> j11 = c1Var.j(cVar2, bVar, c1Var.h(cVar3.f27791d, bVar2).f27464c, j10);
            cVar.a(c1Var.b(j11.first), ((Long) j11.second).longValue(), j11.first);
        }
        return true;
    }

    public static Pair<Object, Long> K(c1 c1Var, g gVar, boolean z10, int i10, boolean z11, c1.c cVar, c1.b bVar) {
        Object L2;
        c1 c1Var2 = c1Var;
        g gVar2 = gVar;
        c1.b bVar2 = bVar;
        c1 c1Var3 = gVar2.f27805a;
        if (c1Var.q()) {
            return null;
        }
        c1 c1Var4 = c1Var3.q() ? c1Var2 : c1Var3;
        try {
            Pair<Object, Long> j10 = c1Var4.j(cVar, bVar, gVar2.f27806b, gVar2.f27807c);
            if (c1Var.equals(c1Var4)) {
                return j10;
            }
            if (c1Var.b(j10.first) != -1) {
                c1Var4.h(j10.first, bVar2);
                if (!c1Var4.n(bVar2.f27464c, cVar).f27481l) {
                    return j10;
                }
                return c1Var.j(cVar, bVar, c1Var.h(j10.first, bVar2).f27464c, gVar2.f27807c);
            }
            c1.c cVar2 = cVar;
            if (z10 && (L2 = L(cVar, bVar, i10, z11, j10.first, c1Var4, c1Var)) != null) {
                return c1Var.j(cVar, bVar, c1Var.h(L2, bVar2).f27464c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object L(c1.c cVar, c1.b bVar, int i10, boolean z10, Object obj, c1 c1Var, c1 c1Var2) {
        int b10 = c1Var.b(obj);
        int i11 = c1Var.i();
        int i12 = b10;
        int i13 = -1;
        for (int i14 = 0; i14 < i11 && i13 == -1; i14++) {
            i12 = c1Var.d(i12, bVar, cVar, i10, z10);
            if (i12 == -1) {
                break;
            }
            i13 = c1Var2.b(c1Var.m(i12));
        }
        if (i13 == -1) {
            return null;
        }
        return c1Var2.m(i13);
    }

    public static boolean g0(n0 n0Var, c1.b bVar, c1.c cVar) {
        r.a aVar = n0Var.f27680b;
        c1 c1Var = n0Var.f27679a;
        return aVar.a() || c1Var.q() || c1Var.n(c1Var.h(aVar.f28627a, bVar).f27464c, cVar).f27481l;
    }

    public static b0[] i(h hVar) {
        int length = hVar != null ? hVar.length() : 0;
        b0[] b0VarArr = new b0[length];
        for (int i10 = 0; i10 < length; i10++) {
            b0VarArr[i10] = hVar.c(i10);
        }
        return b0VarArr;
    }

    public static boolean w(v0 v0Var) {
        return v0Var.getState() != 0;
    }

    public final void A(b bVar) throws m {
        boolean z10 = true;
        this.F.a(1);
        l0 l0Var = this.A;
        bVar.getClass();
        l0Var.getClass();
        if (l0Var.e() < 0) {
            z10 = false;
        }
        v6.a.a(z10);
        l0Var.f27653i = null;
        r(l0Var.c());
    }

    public final void B() {
        this.F.a(1);
        F(false, false, false, true);
        this.f27770e.b(false);
        d0(this.E.f27679a.q() ? 4 : 2);
        l0 l0Var = this.A;
        i a10 = this.f27771f.a();
        v6.a.d(!l0Var.f27654j);
        l0Var.f27655k = a10;
        for (int i10 = 0; i10 < l0Var.f27645a.size(); i10++) {
            l0.c cVar = l0Var.f27645a.get(i10);
            l0Var.g(cVar);
            l0Var.f27652h.add(cVar);
        }
        l0Var.f27654j = true;
        this.f27772g.U(2);
    }

    public final void C() {
        F(true, false, true, false);
        this.f27770e.b(true);
        d0(1);
        this.f27773h.quit();
        synchronized (this) {
            this.G = true;
            notifyAll();
        }
    }

    public final void D(int i10, int i11, d0 d0Var) throws m {
        boolean z10 = true;
        this.F.a(1);
        l0 l0Var = this.A;
        l0Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > l0Var.e()) {
            z10 = false;
        }
        v6.a.a(z10);
        l0Var.f27653i = d0Var;
        l0Var.i(i10, i11);
        r(l0Var.c());
    }

    public final void E() throws m {
        boolean z10;
        int i10;
        float f10 = this.f27779v.f().f27700a;
        i0 i0Var = this.f27783z;
        g0 g0Var = i0Var.f27620h;
        g0 g0Var2 = i0Var.f27621i;
        g0 g0Var3 = g0Var;
        boolean z11 = true;
        while (g0Var3 != null && g0Var3.f27575d) {
            r6.o i11 = g0Var3.i(f10, this.E.f27679a);
            r6.o oVar = g0Var3.f27585n;
            int i12 = 0;
            if (oVar != null && oVar.f24682c.length == i11.f24682c.length) {
                int i13 = 0;
                while (true) {
                    if (i13 >= i11.f24682c.length) {
                        z10 = true;
                        break;
                    } else if (!i11.a(oVar, i13)) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                if (z11) {
                    i0 i0Var2 = this.f27783z;
                    g0 g0Var4 = i0Var2.f27620h;
                    boolean m10 = i0Var2.m(g0Var4);
                    boolean[] zArr = new boolean[this.f27764a.length];
                    long a10 = g0Var4.a(i11, this.E.f27696r, m10, zArr);
                    n0 n0Var = this.E;
                    boolean[] zArr2 = zArr;
                    i10 = 4;
                    n0 u10 = u(n0Var.f27680b, a10, n0Var.f27681c);
                    this.E = u10;
                    if (!(u10.f27682d == 4 || a10 == u10.f27696r)) {
                        this.F.b(4);
                        H(a10);
                    }
                    boolean[] zArr3 = new boolean[this.f27764a.length];
                    while (true) {
                        v0[] v0VarArr = this.f27764a;
                        if (i12 >= v0VarArr.length) {
                            break;
                        }
                        v0 v0Var = v0VarArr[i12];
                        zArr3[i12] = w(v0Var);
                        b0 b0Var = g0Var4.f27574c[i12];
                        if (zArr3[i12]) {
                            if (b0Var != v0Var.o()) {
                                e(v0Var);
                            } else if (zArr2[i12]) {
                                v0Var.t(this.S);
                            }
                        }
                        i12++;
                    }
                    h(zArr3);
                } else {
                    i10 = 4;
                    this.f27783z.m(g0Var3);
                    if (g0Var3.f27575d) {
                        g0Var3.a(i11, Math.max(g0Var3.f27577f.f27591b, this.S - g0Var3.f27586o), false, new boolean[g0Var3.f27580i.length]);
                    }
                }
                q(true);
                if (this.E.f27682d != i10) {
                    y();
                    n0();
                    this.f27772g.U(2);
                    return;
                }
                return;
            }
            if (g0Var3 == g0Var2) {
                z11 = false;
            }
            g0Var3 = g0Var3.f27583l;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            r32 = this;
            r1 = r32
            b2.t r0 = r1.f27772g
            r2 = 2
            r0.S(r2)
            r2 = 0
            r1.J = r2
            x4.k r0 = r1.f27779v
            r0.f27640f = r2
            v6.y r0 = r0.f27635a
            boolean r3 = r0.f26539b
            if (r3 == 0) goto L_0x001e
            long r3 = r0.x()
            r0.a(r3)
            r0.f26539b = r2
        L_0x001e:
            r3 = 0
            r1.S = r3
            x4.v0[] r3 = r1.f27764a
            int r4 = r3.length
            r5 = 0
        L_0x0026:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x003b
            r0 = r3[r5]
            r1.e(r0)     // Catch:{ m -> 0x0032, RuntimeException -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r0 = move-exception
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            java.lang.String r7 = "Disable failed."
            v6.p.b(r6, r7, r0)
        L_0x0038:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x003b:
            if (r33 == 0) goto L_0x0053
            x4.v0[] r3 = r1.f27764a
            int r4 = r3.length
            r5 = 0
        L_0x0041:
            if (r5 >= r4) goto L_0x0053
            r0 = r3[r5]
            r0.b()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            v6.p.b(r6, r0, r7)
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x0041
        L_0x0053:
            r1.Q = r2
            x4.n0 r0 = r1.E
            z5.r$a r3 = r0.f27680b
            long r4 = r0.f27696r
            x4.n0 r0 = r1.E
            x4.c1$b r6 = r1.f27776s
            x4.c1$c r7 = r1.f27775r
            boolean r0 = g0(r0, r6, r7)
            if (r0 == 0) goto L_0x006c
            x4.n0 r0 = r1.E
            long r6 = r0.f27681c
            goto L_0x0070
        L_0x006c:
            x4.n0 r0 = r1.E
            long r6 = r0.f27696r
        L_0x0070:
            r8 = 0
            if (r34 == 0) goto L_0x009f
            r1.R = r8
            x4.n0 r0 = r1.E
            x4.c1 r0 = r0.f27679a
            android.util.Pair r0 = r1.m(r0)
            java.lang.Object r3 = r0.first
            z5.r$a r3 = (z5.r.a) r3
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            x4.n0 r0 = r1.E
            z5.r$a r0 = r0.f27680b
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x009f
            r0 = 1
            r20 = r3
            r28 = r4
            r12 = r6
            goto L_0x00a5
        L_0x009f:
            r20 = r3
            r28 = r4
            r12 = r6
            r0 = 0
        L_0x00a5:
            x4.i0 r3 = r1.f27783z
            r3.b()
            r1.K = r2
            x4.n0 r3 = new x4.n0
            x4.n0 r4 = r1.E
            x4.c1 r10 = r4.f27679a
            int r14 = r4.f27682d
            if (r36 == 0) goto L_0x00b8
            r15 = r8
            goto L_0x00bb
        L_0x00b8:
            x4.m r5 = r4.f27683e
            r15 = r5
        L_0x00bb:
            r16 = 0
            if (r0 == 0) goto L_0x00c2
            z5.g0 r5 = z5.g0.f28588d
            goto L_0x00c4
        L_0x00c2:
            z5.g0 r5 = r4.f27685g
        L_0x00c4:
            r17 = r5
            if (r0 == 0) goto L_0x00cb
            r6.o r5 = r1.f27769d
            goto L_0x00cd
        L_0x00cb:
            r6.o r5 = r4.f27686h
        L_0x00cd:
            r18 = r5
            if (r0 == 0) goto L_0x00d6
            ba.a<java.lang.Object> r0 = ba.s.f3795b
            ba.s<java.lang.Object> r0 = ba.o0.f3765e
            goto L_0x00d8
        L_0x00d6:
            java.util.List<q5.a> r0 = r4.f27687i
        L_0x00d8:
            r19 = r0
            boolean r0 = r4.f27689k
            r21 = r0
            int r0 = r4.f27690l
            r22 = r0
            x4.o0 r0 = r4.f27691m
            r23 = r0
            r26 = 0
            boolean r0 = r1.P
            r30 = r0
            r31 = 0
            r9 = r3
            r11 = r20
            r24 = r28
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31)
            r1.E = r3
            if (r35 == 0) goto L_0x0137
            x4.l0 r3 = r1.A
            java.util.HashMap<x4.l0$c, x4.l0$b> r0 = r3.f27651g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x0106:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x012b
            java.lang.Object r0 = r4.next()
            r5 = r0
            x4.l0$b r5 = (x4.l0.b) r5
            z5.r r0 = r5.f27660a     // Catch:{ RuntimeException -> 0x011b }
            z5.r$b r6 = r5.f27661b     // Catch:{ RuntimeException -> 0x011b }
            r0.b(r6)     // Catch:{ RuntimeException -> 0x011b }
            goto L_0x0123
        L_0x011b:
            r0 = move-exception
            java.lang.String r6 = "MediaSourceList"
            java.lang.String r7 = "Failed to release child source."
            v6.p.b(r6, r7, r0)
        L_0x0123:
            z5.r r0 = r5.f27660a
            z5.v r5 = r5.f27662c
            r0.l(r5)
            goto L_0x0106
        L_0x012b:
            java.util.HashMap<x4.l0$c, x4.l0$b> r0 = r3.f27651g
            r0.clear()
            java.util.Set<x4.l0$c> r0 = r3.f27652h
            r0.clear()
            r3.f27654j = r2
        L_0x0137:
            r1.f27767b0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.y.F(boolean, boolean, boolean, boolean):void");
    }

    public final void G() {
        g0 g0Var = this.f27783z.f27620h;
        this.I = g0Var != null && g0Var.f27577f.f27596g && this.H;
    }

    public final void H(long j10) throws m {
        g0 g0Var = this.f27783z.f27620h;
        if (g0Var != null) {
            j10 += g0Var.f27586o;
        }
        this.S = j10;
        this.f27779v.f27635a.a(j10);
        for (v0 v0Var : this.f27764a) {
            if (w(v0Var)) {
                v0Var.t(this.S);
            }
        }
        for (g0 g0Var2 = this.f27783z.f27620h; g0Var2 != null; g0Var2 = g0Var2.f27583l) {
            for (h hVar : g0Var2.f27585n.f24682c) {
                if (hVar != null) {
                    hVar.q();
                }
            }
        }
    }

    public final void J(c1 c1Var, c1 c1Var2) {
        if (!c1Var.q() || !c1Var2.q()) {
            int size = this.f27780w.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (!I(this.f27780w.get(size), c1Var, c1Var2, this.L, this.M, this.f27775r, this.f27776s)) {
                        this.f27780w.get(size).f27788a.c(false);
                        this.f27780w.remove(size);
                    }
                } else {
                    Collections.sort(this.f27780w);
                    return;
                }
            }
        }
    }

    public final void M(long j10, long j11) {
        this.f27772g.S(2);
        ((Handler) this.f27772g.f3445b).sendEmptyMessageAtTime(2, j10 + j11);
    }

    public final void N(boolean z10) throws m {
        r.a aVar = this.f27783z.f27620h.f27577f.f27590a;
        long Q2 = Q(aVar, this.E.f27696r, true, false);
        if (Q2 != this.E.f27696r) {
            this.E = u(aVar, Q2, this.E.f27681c);
            if (z10) {
                this.F.b(4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(x4.y.g r19) throws x4.m {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            x4.y$d r1 = r8.F
            r9 = 1
            r1.a(r9)
            x4.n0 r1 = r8.E
            x4.c1 r1 = r1.f27679a
            int r4 = r8.L
            boolean r5 = r8.M
            x4.c1$c r6 = r8.f27775r
            x4.c1$b r7 = r8.f27776s
            r3 = 1
            r2 = r19
            android.util.Pair r1 = K(r1, r2, r3, r4, r5, r6, r7)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x0044
            x4.n0 r7 = r8.E
            x4.c1 r7 = r7.f27679a
            android.util.Pair r7 = r8.m(r7)
            java.lang.Object r10 = r7.first
            z5.r$a r10 = (z5.r.a) r10
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r11 = r7.longValue()
            x4.n0 r7 = r8.E
            x4.c1 r7 = r7.f27679a
            boolean r7 = r7.q()
            r7 = r7 ^ r9
            r13 = r4
            goto L_0x0096
        L_0x0044:
            java.lang.Object r7 = r1.first
            java.lang.Object r10 = r1.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r11 = r10.longValue()
            long r13 = r0.f27807c
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0056
            r13 = r4
            goto L_0x0057
        L_0x0056:
            r13 = r11
        L_0x0057:
            x4.i0 r10 = r8.f27783z
            x4.n0 r15 = r8.E
            x4.c1 r15 = r15.f27679a
            z5.r$a r7 = r10.n(r15, r7, r11)
            boolean r10 = r7.a()
            if (r10 == 0) goto L_0x008b
            x4.n0 r4 = r8.E
            x4.c1 r4 = r4.f27679a
            java.lang.Object r5 = r7.f28627a
            x4.c1$b r10 = r8.f27776s
            r4.h(r5, r10)
            x4.c1$b r4 = r8.f27776s
            int r5 = r7.f28628b
            int r4 = r4.e(r5)
            int r5 = r7.f28629c
            if (r4 != r5) goto L_0x0086
            x4.c1$b r4 = r8.f27776s
            a6.a r4 = r4.f27467f
            long r4 = r4.f117e
            r11 = r4
            goto L_0x0088
        L_0x0086:
            r11 = 0
        L_0x0088:
            r10 = r7
            r7 = 1
            goto L_0x0096
        L_0x008b:
            long r2 = r0.f27807c
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0093
            r2 = 1
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            r10 = r7
            r7 = r2
        L_0x0096:
            r5 = 2
            x4.n0 r2 = r8.E     // Catch:{ all -> 0x0155 }
            x4.c1 r2 = r2.f27679a     // Catch:{ all -> 0x0155 }
            boolean r2 = r2.q()     // Catch:{ all -> 0x0155 }
            if (r2 == 0) goto L_0x00a9
            r8.R = r0     // Catch:{ all -> 0x00a4 }
            goto L_0x00b8
        L_0x00a4:
            r0 = move-exception
            r3 = r11
            r15 = 2
            goto L_0x0158
        L_0x00a9:
            r0 = 4
            if (r1 != 0) goto L_0x00bc
            x4.n0 r1 = r8.E     // Catch:{ all -> 0x00a4 }
            int r1 = r1.f27682d     // Catch:{ all -> 0x00a4 }
            if (r1 == r9) goto L_0x00b5
            r8.d0(r0)     // Catch:{ all -> 0x00a4 }
        L_0x00b5:
            r8.F(r6, r9, r6, r9)     // Catch:{ all -> 0x00a4 }
        L_0x00b8:
            r3 = r11
            r15 = 2
            goto L_0x013c
        L_0x00bc:
            x4.n0 r1 = r8.E     // Catch:{ all -> 0x0155 }
            z5.r$a r1 = r1.f27680b     // Catch:{ all -> 0x0155 }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x0155 }
            if (r1 == 0) goto L_0x0114
            x4.i0 r1 = r8.f27783z     // Catch:{ all -> 0x0155 }
            x4.g0 r1 = r1.f27620h     // Catch:{ all -> 0x0155 }
            if (r1 == 0) goto L_0x00df
            boolean r2 = r1.f27575d     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x00df
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00df
            z5.o r1 = r1.f27572a     // Catch:{ all -> 0x00a4 }
            x4.z0 r2 = r8.D     // Catch:{ all -> 0x00a4 }
            long r1 = r1.c(r11, r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x00e0
        L_0x00df:
            r1 = r11
        L_0x00e0:
            long r3 = x4.f.c(r1)     // Catch:{ all -> 0x0155 }
            x4.n0 r15 = r8.E     // Catch:{ all -> 0x0155 }
            r16 = r1
            long r0 = r15.f27696r     // Catch:{ all -> 0x0155 }
            long r0 = x4.f.c(r0)     // Catch:{ all -> 0x0155 }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0110
            x4.n0 r0 = r8.E     // Catch:{ all -> 0x0155 }
            int r1 = r0.f27682d     // Catch:{ all -> 0x0155 }
            if (r1 == r5) goto L_0x00fb
            r2 = 3
            if (r1 != r2) goto L_0x0110
        L_0x00fb:
            long r3 = r0.f27696r     // Catch:{ all -> 0x0155 }
            r1 = r18
            r2 = r10
            r15 = 2
            r5 = r13
            x4.n0 r0 = r1.u(r2, r3, r5)
            r8.E = r0
            if (r7 == 0) goto L_0x010f
            x4.y$d r0 = r8.F
            r0.b(r15)
        L_0x010f:
            return
        L_0x0110:
            r15 = 2
            r1 = r16
            goto L_0x0116
        L_0x0114:
            r15 = 2
            r1 = r11
        L_0x0116:
            x4.n0 r0 = r8.E     // Catch:{ all -> 0x0153 }
            int r0 = r0.f27682d     // Catch:{ all -> 0x0153 }
            r3 = 4
            if (r0 != r3) goto L_0x011f
            r0 = 1
            goto L_0x0120
        L_0x011f:
            r0 = 0
        L_0x0120:
            long r16 = r8.P(r10, r1, r0)     // Catch:{ all -> 0x0153 }
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r9 = 0
        L_0x012a:
            r9 = r9 | r7
            x4.n0 r0 = r8.E     // Catch:{ all -> 0x014e }
            x4.c1 r4 = r0.f27679a     // Catch:{ all -> 0x014e }
            z5.r$a r5 = r0.f27680b     // Catch:{ all -> 0x014e }
            r1 = r18
            r2 = r4
            r3 = r10
            r6 = r13
            r1.l0(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x014e }
            r7 = r9
            r3 = r16
        L_0x013c:
            r1 = r18
            r2 = r10
            r5 = r13
            x4.n0 r0 = r1.u(r2, r3, r5)
            r8.E = r0
            if (r7 == 0) goto L_0x014d
            x4.y$d r0 = r8.F
            r0.b(r15)
        L_0x014d:
            return
        L_0x014e:
            r0 = move-exception
            r7 = r9
            r3 = r16
            goto L_0x0158
        L_0x0153:
            r0 = move-exception
            goto L_0x0157
        L_0x0155:
            r0 = move-exception
            r15 = 2
        L_0x0157:
            r3 = r11
        L_0x0158:
            r1 = r18
            r2 = r10
            r5 = r13
            x4.n0 r1 = r1.u(r2, r3, r5)
            r8.E = r1
            if (r7 == 0) goto L_0x0169
            x4.y$d r1 = r8.F
            r1.b(r15)
        L_0x0169:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.y.O(x4.y$g):void");
    }

    public final long P(r.a aVar, long j10, boolean z10) throws m {
        i0 i0Var = this.f27783z;
        return Q(aVar, j10, i0Var.f27620h != i0Var.f27621i, z10);
    }

    public final long Q(r.a aVar, long j10, boolean z10, boolean z11) throws m {
        i0 i0Var;
        j0();
        this.J = false;
        if (z11 || this.E.f27682d == 3) {
            d0(2);
        }
        g0 g0Var = this.f27783z.f27620h;
        g0 g0Var2 = g0Var;
        while (g0Var2 != null && !aVar.equals(g0Var2.f27577f.f27590a)) {
            g0Var2 = g0Var2.f27583l;
        }
        if (z10 || g0Var != g0Var2 || (g0Var2 != null && g0Var2.f27586o + j10 < 0)) {
            for (v0 e10 : this.f27764a) {
                e(e10);
            }
            if (g0Var2 != null) {
                while (true) {
                    i0Var = this.f27783z;
                    if (i0Var.f27620h == g0Var2) {
                        break;
                    }
                    i0Var.a();
                }
                i0Var.m(g0Var2);
                g0Var2.f27586o = 0;
                g();
            }
        }
        if (g0Var2 != null) {
            this.f27783z.m(g0Var2);
            if (!g0Var2.f27575d) {
                g0Var2.f27577f = g0Var2.f27577f.b(j10);
            } else {
                long j11 = g0Var2.f27577f.f27594e;
                if (j11 != -9223372036854775807L && j10 >= j11) {
                    j10 = Math.max(0, j11 - 1);
                }
                if (g0Var2.f27576e) {
                    long D2 = g0Var2.f27572a.D(j10);
                    g0Var2.f27572a.A(D2 - this.f27777t, this.f27778u);
                    j10 = D2;
                }
            }
            H(j10);
            y();
        } else {
            this.f27783z.b();
            H(j10);
        }
        q(false);
        this.f27772g.U(2);
        return j10;
    }

    public final void R(s0 s0Var) throws m {
        if (s0Var.f27719g == this.f27774i) {
            c(s0Var);
            int i10 = this.E.f27682d;
            if (i10 == 3 || i10 == 2) {
                this.f27772g.U(2);
                return;
            }
            return;
        }
        this.f27772g.Q(15, s0Var).sendToTarget();
    }

    public final void S(s0 s0Var) {
        Looper looper = s0Var.f27719g;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            s0Var.c(false);
            return;
        }
        t c10 = this.f27781x.c(looper, (Handler.Callback) null);
        ((Handler) c10.f3445b).post(new c1.c(this, s0Var));
    }

    public final void T(v0 v0Var, long j10) {
        v0Var.p();
        if (v0Var instanceof l) {
            l lVar = (l) v0Var;
            v6.a.d(lVar.f27501r);
            lVar.H = j10;
        }
    }

    public final void U(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.N != z10) {
            this.N = z10;
            if (!z10) {
                for (v0 v0Var : this.f27764a) {
                    if (!w(v0Var)) {
                        v0Var.b();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void V(a aVar) throws m {
        this.F.a(1);
        if (aVar.f27786c != -1) {
            this.R = new g(new t0(aVar.f27784a, aVar.f27785b), aVar.f27786c, aVar.f27787d);
        }
        l0 l0Var = this.A;
        List<l0.c> list = aVar.f27784a;
        d0 d0Var = aVar.f27785b;
        l0Var.i(0, l0Var.f27645a.size());
        r(l0Var.a(l0Var.f27645a.size(), list, d0Var));
    }

    public final void W(boolean z10) {
        if (z10 != this.P) {
            this.P = z10;
            n0 n0Var = this.E;
            int i10 = n0Var.f27682d;
            if (z10 || i10 == 4 || i10 == 1) {
                this.E = n0Var.c(z10);
            } else {
                this.f27772g.U(2);
            }
        }
    }

    public final void X(boolean z10) throws m {
        this.H = z10;
        G();
        if (this.I) {
            i0 i0Var = this.f27783z;
            if (i0Var.f27621i != i0Var.f27620h) {
                N(true);
                q(false);
            }
        }
    }

    public final void Y(boolean z10, int i10, boolean z11, int i11) throws m {
        this.F.a(z11 ? 1 : 0);
        d dVar = this.F;
        dVar.f27792a = true;
        dVar.f27797f = true;
        dVar.f27798g = i11;
        this.E = this.E.d(z10, i10);
        this.J = false;
        for (g0 g0Var = this.f27783z.f27620h; g0Var != null; g0Var = g0Var.f27583l) {
            for (h hVar : g0Var.f27585n.f24682c) {
                if (hVar != null) {
                    hVar.b(z10);
                }
            }
        }
        if (!e0()) {
            j0();
            n0();
            return;
        }
        int i12 = this.E.f27682d;
        if (i12 == 3) {
            h0();
            this.f27772g.U(2);
        } else if (i12 == 2) {
            this.f27772g.U(2);
        }
    }

    public final void Z(o0 o0Var) throws m {
        this.f27779v.i(o0Var);
        o0 f10 = this.f27779v.f();
        t(f10, f10.f27700a, true, true);
    }

    public final void a(a aVar, int i10) throws m {
        this.F.a(1);
        l0 l0Var = this.A;
        if (i10 == -1) {
            i10 = l0Var.e();
        }
        r(l0Var.a(i10, aVar.f27784a, aVar.f27785b));
    }

    public final void a0(int i10) throws m {
        this.L = i10;
        i0 i0Var = this.f27783z;
        c1 c1Var = this.E.f27679a;
        i0Var.f27618f = i10;
        if (!i0Var.p(c1Var)) {
            N(true);
        }
        q(false);
    }

    public final void b(m mVar) throws m {
        v6.a.a(mVar.f27675h && mVar.f27668a == 1);
        try {
            N(true);
        } catch (Exception unused) {
            throw mVar;
        }
    }

    public final void b0(boolean z10) throws m {
        this.M = z10;
        i0 i0Var = this.f27783z;
        c1 c1Var = this.E.f27679a;
        i0Var.f27619g = z10;
        if (!i0Var.p(c1Var)) {
            N(true);
        }
        q(false);
    }

    public final void c(s0 s0Var) throws m {
        s0Var.b();
        try {
            s0Var.f27713a.n(s0Var.f27717e, s0Var.f27718f);
        } finally {
            s0Var.c(true);
        }
    }

    public final void c0(d0 d0Var) throws m {
        this.F.a(1);
        l0 l0Var = this.A;
        int e10 = l0Var.e();
        if (d0Var.b() != e10) {
            d0Var = d0Var.h().d(0, e10);
        }
        l0Var.f27653i = d0Var;
        r(l0Var.c());
    }

    public void d(c0 c0Var) {
        this.f27772g.Q(9, (o) c0Var).sendToTarget();
    }

    public final void d0(int i10) {
        n0 n0Var = this.E;
        if (n0Var.f27682d != i10) {
            this.E = n0Var.g(i10);
        }
    }

    public final void e(v0 v0Var) throws m {
        if (v0Var.getState() != 0) {
            k kVar = this.f27779v;
            if (v0Var == kVar.f27637c) {
                kVar.f27638d = null;
                kVar.f27637c = null;
                kVar.f27639e = true;
            }
            if (v0Var.getState() == 2) {
                v0Var.stop();
            }
            v0Var.e();
            this.Q--;
        }
    }

    public final boolean e0() {
        n0 n0Var = this.E;
        return n0Var.f27689k && n0Var.f27690l == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r7 != -9223372036854775807L) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x029b A[EDGE_INSN: B:398:0x029b->B:153:0x029b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x031e A[EDGE_INSN: B:404:0x031e->B:180:0x031e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() throws x4.m, java.io.IOException {
        /*
            r34 = this;
            r8 = r34
            v6.b r0 = r8.f27781x
            long r9 = r0.b()
            x4.n0 r0 = r8.E
            x4.c1 r0 = r0.f27679a
            boolean r0 = r0.q()
            r11 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = 1
            if (r0 != 0) goto L_0x031d
            x4.l0 r0 = r8.A
            boolean r0 = r0.f27654j
            if (r0 != 0) goto L_0x0021
            goto L_0x031d
        L_0x0021:
            x4.i0 r0 = r8.f27783z
            long r1 = r8.S
            r0.l(r1)
            x4.i0 r0 = r8.f27783z
            x4.g0 r1 = r0.f27622j
            if (r1 == 0) goto L_0x004d
            x4.h0 r2 = r1.f27577f
            boolean r2 = r2.f27597h
            if (r2 != 0) goto L_0x004b
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x004b
            x4.g0 r1 = r0.f27622j
            x4.h0 r1 = r1.f27577f
            long r1 = r1.f27594e
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x004b
            int r0 = r0.f27623k
            r1 = 100
            if (r0 >= r1) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = 0
            goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            if (r0 == 0) goto L_0x00f9
            x4.i0 r0 = r8.f27783z
            long r1 = r8.S
            x4.n0 r3 = r8.E
            x4.g0 r4 = r0.f27622j
            if (r4 != 0) goto L_0x0071
            x4.c1 r1 = r3.f27679a
            z5.r$a r2 = r3.f27680b
            long r12 = r3.f27681c
            long r3 = r3.f27696r
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r12
            r21 = r3
            x4.h0 r0 = r16.d(r17, r18, r19, r21)
            goto L_0x0077
        L_0x0071:
            x4.c1 r3 = r3.f27679a
            x4.h0 r0 = r0.c(r3, r4, r1)
        L_0x0077:
            if (r0 == 0) goto L_0x00f9
            x4.i0 r1 = r8.f27783z
            x4.w0[] r2 = r8.f27766b
            r6.n r3 = r8.f27768c
            x4.j r4 = r8.f27770e
            u6.f r4 = r4.f27626a
            x4.l0 r12 = r8.A
            r6.o r13 = r8.f27769d
            x4.g0 r14 = r1.f27622j
            if (r14 != 0) goto L_0x009d
            z5.r$a r14 = r0.f27590a
            boolean r14 = r14.a()
            if (r14 == 0) goto L_0x009a
            long r7 = r0.f27592c
            int r14 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x009a
            goto L_0x00a7
        L_0x009a:
            r27 = 0
            goto L_0x00a9
        L_0x009d:
            long r7 = r14.f27586o
            x4.h0 r14 = r14.f27577f
            long r5 = r14.f27594e
            long r7 = r7 + r5
            long r5 = r0.f27591b
            long r7 = r7 - r5
        L_0x00a7:
            r27 = r7
        L_0x00a9:
            x4.g0 r5 = new x4.g0
            r25 = r5
            r26 = r2
            r29 = r3
            r30 = r4
            r31 = r12
            r32 = r0
            r33 = r13
            r25.<init>(r26, r27, r29, r30, r31, r32, r33)
            x4.g0 r2 = r1.f27622j
            if (r2 == 0) goto L_0x00ce
            x4.g0 r3 = r2.f27583l
            if (r5 != r3) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            r2.b()
            r2.f27583l = r5
            r2.c()
            goto L_0x00d2
        L_0x00ce:
            r1.f27620h = r5
            r1.f27621i = r5
        L_0x00d2:
            r1.f27624l = r11
            r1.f27622j = r5
            int r2 = r1.f27623k
            int r2 = r2 + r15
            r1.f27623k = r2
            r1.k()
            z5.o r1 = r5.f27572a
            long r2 = r0.f27591b
            r8 = r34
            r1.E(r8, r2)
            x4.i0 r0 = r8.f27783z
            x4.g0 r0 = r0.f27620h
            if (r0 != r5) goto L_0x00f4
            long r0 = r5.e()
            r8.H(r0)
        L_0x00f4:
            r0 = 0
            r8.q(r0)
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            boolean r1 = r8.K
            if (r1 == 0) goto L_0x0108
            boolean r1 = r34.v()
            r8.K = r1
            r34.k0()
            goto L_0x010b
        L_0x0108:
            r34.y()
        L_0x010b:
            x4.i0 r1 = r8.f27783z
            x4.g0 r1 = r1.f27621i
            if (r1 != 0) goto L_0x0118
        L_0x0111:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0236
        L_0x0118:
            x4.g0 r2 = r1.f27583l
            if (r2 == 0) goto L_0x01ee
            boolean r2 = r8.I
            if (r2 == 0) goto L_0x0122
            goto L_0x01ee
        L_0x0122:
            boolean r2 = r1.f27575d
            if (r2 != 0) goto L_0x0127
            goto L_0x0145
        L_0x0127:
            r2 = 0
        L_0x0128:
            x4.v0[] r3 = r8.f27764a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0147
            r3 = r3[r2]
            z5.b0[] r4 = r1.f27574c
            r4 = r4[r2]
            z5.b0 r5 = r3.o()
            if (r5 != r4) goto L_0x0145
            if (r4 == 0) goto L_0x0142
            boolean r3 = r3.k()
            if (r3 != 0) goto L_0x0142
            goto L_0x0145
        L_0x0142:
            int r2 = r2 + 1
            goto L_0x0128
        L_0x0145:
            r2 = 0
            goto L_0x0148
        L_0x0147:
            r2 = 1
        L_0x0148:
            if (r2 != 0) goto L_0x014b
            goto L_0x0111
        L_0x014b:
            x4.g0 r2 = r1.f27583l
            boolean r3 = r2.f27575d
            if (r3 != 0) goto L_0x015c
            long r3 = r8.S
            long r5 = r2.e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x015c
            goto L_0x0111
        L_0x015c:
            r6.o r1 = r1.f27585n
            x4.i0 r2 = r8.f27783z
            x4.g0 r3 = r2.f27621i
            if (r3 == 0) goto L_0x016a
            x4.g0 r3 = r3.f27583l
            if (r3 == 0) goto L_0x016a
            r3 = 1
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            v6.a.d(r3)
            x4.g0 r3 = r2.f27621i
            x4.g0 r3 = r3.f27583l
            r2.f27621i = r3
            r2.k()
            x4.g0 r2 = r2.f27621i
            r6.o r3 = r2.f27585n
            boolean r4 = r2.f27575d
            if (r4 == 0) goto L_0x01a6
            z5.o r4 = r2.f27572a
            long r4 = r4.r()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x01a6
            long r1 = r2.e()
            x4.v0[] r3 = r8.f27764a
            int r4 = r3.length
            r5 = 0
        L_0x0196:
            if (r5 >= r4) goto L_0x0111
            r6 = r3[r5]
            z5.b0 r7 = r6.o()
            if (r7 == 0) goto L_0x01a3
            r8.T(r6, r1)
        L_0x01a3:
            int r5 = r5 + 1
            goto L_0x0196
        L_0x01a6:
            r4 = 0
        L_0x01a7:
            x4.v0[] r5 = r8.f27764a
            int r5 = r5.length
            if (r4 >= r5) goto L_0x0111
            boolean r5 = r1.b(r4)
            boolean r6 = r3.b(r4)
            if (r5 == 0) goto L_0x01eb
            x4.v0[] r5 = r8.f27764a
            r5 = r5[r4]
            boolean r5 = r5.u()
            if (r5 != 0) goto L_0x01eb
            x4.w0[] r5 = r8.f27766b
            r5 = r5[r4]
            x4.e r5 = (x4.e) r5
            int r5 = r5.f27492a
            r7 = 7
            if (r5 != r7) goto L_0x01cd
            r5 = 1
            goto L_0x01ce
        L_0x01cd:
            r5 = 0
        L_0x01ce:
            x4.x0[] r7 = r1.f24681b
            r7 = r7[r4]
            x4.x0[] r12 = r3.f24681b
            r12 = r12[r4]
            if (r6 == 0) goto L_0x01e0
            boolean r6 = r12.equals(r7)
            if (r6 == 0) goto L_0x01e0
            if (r5 == 0) goto L_0x01eb
        L_0x01e0:
            x4.v0[] r5 = r8.f27764a
            r5 = r5[r4]
            long r6 = r2.e()
            r8.T(r5, r6)
        L_0x01eb:
            int r4 = r4 + 1
            goto L_0x01a7
        L_0x01ee:
            x4.h0 r2 = r1.f27577f
            boolean r2 = r2.f27597h
            if (r2 != 0) goto L_0x01f8
            boolean r2 = r8.I
            if (r2 == 0) goto L_0x0111
        L_0x01f8:
            r2 = 0
        L_0x01f9:
            x4.v0[] r3 = r8.f27764a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0111
            r3 = r3[r2]
            z5.b0[] r4 = r1.f27574c
            r4 = r4[r2]
            if (r4 == 0) goto L_0x022e
            z5.b0 r5 = r3.o()
            if (r5 != r4) goto L_0x022e
            boolean r4 = r3.k()
            if (r4 == 0) goto L_0x022e
            x4.h0 r4 = r1.f27577f
            long r4 = r4.f27594e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0229
            r12 = -9223372036854775808
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0229
            long r12 = r1.f27586o
            long r4 = r4 + r12
            goto L_0x022a
        L_0x0229:
            r4 = r6
        L_0x022a:
            r8.T(r3, r4)
            goto L_0x0233
        L_0x022e:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0233:
            int r2 = r2 + 1
            goto L_0x01f9
        L_0x0236:
            x4.i0 r1 = r8.f27783z
            x4.g0 r2 = r1.f27621i
            if (r2 == 0) goto L_0x02a2
            x4.g0 r1 = r1.f27620h
            if (r1 == r2) goto L_0x02a2
            boolean r1 = r2.f27578g
            if (r1 == 0) goto L_0x0245
            goto L_0x02a2
        L_0x0245:
            r6.o r1 = r2.f27585n
            r3 = 0
            r4 = 0
        L_0x0249:
            x4.v0[] r5 = r8.f27764a
            int r12 = r5.length
            if (r3 >= r12) goto L_0x029b
            r5 = r5[r3]
            boolean r12 = w(r5)
            if (r12 != 0) goto L_0x0257
            goto L_0x0298
        L_0x0257:
            z5.b0 r12 = r5.o()
            z5.b0[] r13 = r2.f27574c
            r13 = r13[r3]
            if (r12 == r13) goto L_0x0263
            r12 = 1
            goto L_0x0264
        L_0x0263:
            r12 = 0
        L_0x0264:
            boolean r13 = r1.b(r3)
            if (r13 == 0) goto L_0x026d
            if (r12 != 0) goto L_0x026d
            goto L_0x0298
        L_0x026d:
            boolean r12 = r5.u()
            if (r12 != 0) goto L_0x028d
            r6.h[] r12 = r1.f24682c
            r12 = r12[r3]
            x4.b0[] r26 = i(r12)
            z5.b0[] r12 = r2.f27574c
            r27 = r12[r3]
            long r28 = r2.e()
            long r12 = r2.f27586o
            r25 = r5
            r30 = r12
            r25.r(r26, r27, r28, r30)
            goto L_0x0298
        L_0x028d:
            boolean r12 = r5.d()
            if (r12 == 0) goto L_0x0297
            r8.e(r5)
            goto L_0x0298
        L_0x0297:
            r4 = 1
        L_0x0298:
            int r3 = r3 + 1
            goto L_0x0249
        L_0x029b:
            r1 = r4 ^ 1
            if (r1 == 0) goto L_0x02a2
            r34.g()
        L_0x02a2:
            r1 = 0
        L_0x02a3:
            boolean r2 = r34.e0()
            if (r2 != 0) goto L_0x02aa
            goto L_0x02ca
        L_0x02aa:
            boolean r2 = r8.I
            if (r2 == 0) goto L_0x02af
            goto L_0x02ca
        L_0x02af:
            x4.i0 r2 = r8.f27783z
            x4.g0 r2 = r2.f27620h
            if (r2 != 0) goto L_0x02b6
            goto L_0x02ca
        L_0x02b6:
            x4.g0 r2 = r2.f27583l
            if (r2 == 0) goto L_0x02ca
            long r3 = r8.S
            long r12 = r2.e()
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x02ca
            boolean r2 = r2.f27578g
            if (r2 == 0) goto L_0x02ca
            r2 = 1
            goto L_0x02cb
        L_0x02ca:
            r2 = 0
        L_0x02cb:
            if (r2 == 0) goto L_0x031e
            if (r1 == 0) goto L_0x02d2
            r34.z()
        L_0x02d2:
            x4.i0 r1 = r8.f27783z
            x4.g0 r12 = r1.f27620h
            x4.g0 r13 = r1.a()
            x4.h0 r1 = r13.f27577f
            z5.r$a r2 = r1.f27590a
            long r3 = r1.f27591b
            long r6 = r1.f27592c
            r1 = r34
            r5 = r6
            x4.n0 r1 = r1.u(r2, r3, r5)
            r8.E = r1
            x4.h0 r1 = r12.f27577f
            boolean r1 = r1.f27595f
            if (r1 == 0) goto L_0x02f3
            r1 = 0
            goto L_0x02f4
        L_0x02f3:
            r1 = 3
        L_0x02f4:
            x4.y$d r2 = r8.F
            r2.b(r1)
            x4.n0 r1 = r8.E
            x4.c1 r4 = r1.f27679a
            x4.h0 r1 = r13.f27577f
            z5.r$a r3 = r1.f27590a
            x4.h0 r1 = r12.f27577f
            z5.r$a r5 = r1.f27590a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r34
            r2 = r4
            r1.l0(r2, r3, r4, r5, r6)
            r34.G()
            r34.n0()
            r1 = 1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x02a3
        L_0x031d:
            r0 = 0
        L_0x031e:
            x4.n0 r1 = r8.E
            int r1 = r1.f27682d
            if (r1 == r15) goto L_0x0608
            r3 = 4
            if (r1 != r3) goto L_0x0329
            goto L_0x0608
        L_0x0329:
            x4.i0 r1 = r8.f27783z
            x4.g0 r1 = r1.f27620h
            r4 = 10
            if (r1 != 0) goto L_0x0335
            r8.M(r9, r4)
            return
        L_0x0335:
            java.lang.String r6 = "doSomeWork"
            androidx.appcompat.widget.p.a(r6)
            r34.n0()
            boolean r6 = r1.f27575d
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x03b6
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 * r12
            z5.o r14 = r1.f27572a
            x4.n0 r12 = r8.E
            long r12 = r12.f27696r
            long r4 = r8.f27777t
            long r12 = r12 - r4
            boolean r4 = r8.f27778u
            r14.A(r12, r4)
            r4 = 0
            r5 = 1
            r12 = 1
        L_0x035a:
            x4.v0[] r13 = r8.f27764a
            int r14 = r13.length
            if (r4 >= r14) goto L_0x03bd
            r13 = r13[r4]
            boolean r14 = w(r13)
            if (r14 != 0) goto L_0x0368
            goto L_0x03b2
        L_0x0368:
            long r2 = r8.S
            r13.m(r2, r6)
            if (r5 == 0) goto L_0x0377
            boolean r2 = r13.d()
            if (r2 == 0) goto L_0x0377
            r2 = 1
            goto L_0x0378
        L_0x0377:
            r2 = 0
        L_0x0378:
            z5.b0[] r3 = r1.f27574c
            r3 = r3[r4]
            z5.b0 r5 = r13.o()
            if (r3 == r5) goto L_0x0384
            r3 = 1
            goto L_0x0385
        L_0x0384:
            r3 = 0
        L_0x0385:
            if (r3 != 0) goto L_0x038f
            boolean r5 = r13.k()
            if (r5 == 0) goto L_0x038f
            r5 = 1
            goto L_0x0390
        L_0x038f:
            r5 = 0
        L_0x0390:
            if (r3 != 0) goto L_0x03a3
            if (r5 != 0) goto L_0x03a3
            boolean r3 = r13.isReady()
            if (r3 != 0) goto L_0x03a3
            boolean r3 = r13.d()
            if (r3 == 0) goto L_0x03a1
            goto L_0x03a3
        L_0x03a1:
            r3 = 0
            goto L_0x03a4
        L_0x03a3:
            r3 = 1
        L_0x03a4:
            if (r12 == 0) goto L_0x03aa
            if (r3 == 0) goto L_0x03aa
            r5 = 1
            goto L_0x03ab
        L_0x03aa:
            r5 = 0
        L_0x03ab:
            if (r3 != 0) goto L_0x03b0
            r13.q()
        L_0x03b0:
            r12 = r5
            r5 = r2
        L_0x03b2:
            int r4 = r4 + 1
            r3 = 4
            goto L_0x035a
        L_0x03b6:
            z5.o r2 = r1.f27572a
            r2.y()
            r5 = 1
            r12 = 1
        L_0x03bd:
            x4.h0 r2 = r1.f27577f
            long r2 = r2.f27594e
            if (r5 == 0) goto L_0x03da
            boolean r4 = r1.f27575d
            if (r4 == 0) goto L_0x03da
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x03d8
            x4.n0 r6 = r8.E
            long r6 = r6.f27696r
            int r13 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r13 > 0) goto L_0x03df
        L_0x03d8:
            r7 = 1
            goto L_0x03e0
        L_0x03da:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x03df:
            r7 = 0
        L_0x03e0:
            if (r7 == 0) goto L_0x03f0
            boolean r2 = r8.I
            if (r2 == 0) goto L_0x03f0
            r8.I = r0
            x4.n0 r2 = r8.E
            int r2 = r2.f27690l
            r3 = 5
            r8.Y(r0, r2, r0, r3)
        L_0x03f0:
            if (r7 == 0) goto L_0x0402
            x4.h0 r2 = r1.f27577f
            boolean r2 = r2.f27597h
            if (r2 == 0) goto L_0x0402
            r2 = 4
            r8.d0(r2)
            r34.j0()
            r13 = r1
            goto L_0x0523
        L_0x0402:
            x4.n0 r2 = r8.E
            int r3 = r2.f27682d
            r6 = 2
            if (r3 != r6) goto L_0x04c4
            int r3 = r8.Q
            if (r3 != 0) goto L_0x0415
            boolean r7 = r34.x()
            r13 = r1
            r0 = r7
            goto L_0x04b2
        L_0x0415:
            if (r12 != 0) goto L_0x041a
            r13 = r1
            goto L_0x04b2
        L_0x041a:
            boolean r3 = r2.f27684f
            if (r3 != 0) goto L_0x0421
        L_0x041e:
            r13 = r1
            goto L_0x04b1
        L_0x0421:
            x4.c1 r2 = r2.f27679a
            x4.i0 r3 = r8.f27783z
            x4.g0 r3 = r3.f27620h
            x4.h0 r3 = r3.f27577f
            z5.r$a r3 = r3.f27590a
            boolean r2 = r8.f0(r2, r3)
            if (r2 == 0) goto L_0x0438
            x4.d0 r2 = r8.B
            x4.i r2 = (x4.i) r2
            long r2 = r2.f27606i
            goto L_0x0439
        L_0x0438:
            r2 = r4
        L_0x0439:
            x4.i0 r6 = r8.f27783z
            x4.g0 r6 = r6.f27622j
            boolean r7 = r6.f()
            if (r7 == 0) goto L_0x044b
            x4.h0 r7 = r6.f27577f
            boolean r7 = r7.f27597h
            if (r7 == 0) goto L_0x044b
            r7 = 1
            goto L_0x044c
        L_0x044b:
            r7 = 0
        L_0x044c:
            x4.h0 r13 = r6.f27577f
            z5.r$a r13 = r13.f27590a
            boolean r13 = r13.a()
            if (r13 == 0) goto L_0x045c
            boolean r6 = r6.f27575d
            if (r6 != 0) goto L_0x045c
            r6 = 1
            goto L_0x045d
        L_0x045c:
            r6 = 0
        L_0x045d:
            if (r7 != 0) goto L_0x041e
            if (r6 != 0) goto L_0x041e
            x4.j r6 = r8.f27770e
            long r14 = r34.n()
            x4.k r7 = r8.f27779v
            x4.o0 r7 = r7.f()
            float r7 = r7.f27700a
            boolean r13 = r8.J
            r6.getClass()
            long r14 = v6.e0.z(r14, r7)
            if (r13 == 0) goto L_0x047e
            r13 = r1
            long r0 = r6.f27630e
            goto L_0x0481
        L_0x047e:
            r13 = r1
            long r0 = r6.f27629d
        L_0x0481:
            int r26 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r26 == 0) goto L_0x048d
            r26 = 2
            long r2 = r2 / r26
            long r0 = java.lang.Math.min(r2, r0)
        L_0x048d:
            r2 = 0
            int r23 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r23 <= 0) goto L_0x04ab
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x04ab
            u6.f r1 = r6.f27626a
            monitor-enter(r1)
            int r0 = r1.f26064g     // Catch:{ all -> 0x04a8 }
            int r2 = r1.f26060c     // Catch:{ all -> 0x04a8 }
            int r0 = r0 * r2
            monitor-exit(r1)
            int r1 = r6.f27633h
            if (r0 < r1) goto L_0x04a6
            goto L_0x04ab
        L_0x04a6:
            r0 = 0
            goto L_0x04ac
        L_0x04a8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x04ab:
            r0 = 1
        L_0x04ac:
            if (r0 == 0) goto L_0x04af
            goto L_0x04b1
        L_0x04af:
            r0 = 0
            goto L_0x04b2
        L_0x04b1:
            r0 = 1
        L_0x04b2:
            if (r0 == 0) goto L_0x04c5
            r0 = 3
            r8.d0(r0)
            r8.f27767b0 = r11
            boolean r1 = r34.e0()
            if (r1 == 0) goto L_0x0523
            r34.h0()
            goto L_0x0523
        L_0x04c4:
            r13 = r1
        L_0x04c5:
            r0 = 3
            x4.n0 r1 = r8.E
            int r1 = r1.f27682d
            if (r1 != r0) goto L_0x0523
            int r0 = r8.Q
            if (r0 != 0) goto L_0x04d7
            boolean r0 = r34.x()
            if (r0 == 0) goto L_0x04d9
            goto L_0x0523
        L_0x04d7:
            if (r12 != 0) goto L_0x0523
        L_0x04d9:
            boolean r0 = r34.e0()
            r8.J = r0
            r0 = 2
            r8.d0(r0)
            boolean r0 = r8.J
            if (r0 == 0) goto L_0x0520
            x4.i0 r0 = r8.f27783z
            x4.g0 r0 = r0.f27620h
        L_0x04eb:
            if (r0 == 0) goto L_0x0502
            r6.o r1 = r0.f27585n
            r6.h[] r1 = r1.f24682c
            int r2 = r1.length
            r3 = 0
        L_0x04f3:
            if (r3 >= r2) goto L_0x04ff
            r6 = r1[r3]
            if (r6 == 0) goto L_0x04fc
            r6.s()
        L_0x04fc:
            int r3 = r3 + 1
            goto L_0x04f3
        L_0x04ff:
            x4.g0 r0 = r0.f27583l
            goto L_0x04eb
        L_0x0502:
            x4.d0 r0 = r8.B
            x4.i r0 = (x4.i) r0
            long r1 = r0.f27606i
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x050d
            goto L_0x0520
        L_0x050d:
            long r11 = r0.f27599b
            long r1 = r1 + r11
            r0.f27606i = r1
            long r11 = r0.f27605h
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x051e
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x051e
            r0.f27606i = r11
        L_0x051e:
            r0.f27610m = r4
        L_0x0520:
            r34.j0()
        L_0x0523:
            x4.n0 r0 = r8.E
            int r0 = r0.f27682d
            r1 = 2
            if (r0 != r1) goto L_0x056e
            r0 = 0
        L_0x052b:
            x4.v0[] r1 = r8.f27764a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0550
            r1 = r1[r0]
            boolean r1 = w(r1)
            if (r1 == 0) goto L_0x054d
            x4.v0[] r1 = r8.f27764a
            r1 = r1[r0]
            z5.b0 r1 = r1.o()
            z5.b0[] r2 = r13.f27574c
            r2 = r2[r0]
            if (r1 != r2) goto L_0x054d
            x4.v0[] r1 = r8.f27764a
            r1 = r1[r0]
            r1.q()
        L_0x054d:
            int r0 = r0 + 1
            goto L_0x052b
        L_0x0550:
            x4.n0 r0 = r8.E
            boolean r1 = r0.f27684f
            if (r1 != 0) goto L_0x056e
            long r0 = r0.f27695q
            r2 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x056e
            boolean r0 = r34.v()
            if (r0 != 0) goto L_0x0566
            goto L_0x056e
        L_0x0566:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x056e:
            boolean r0 = r8.P
            x4.n0 r1 = r8.E
            boolean r2 = r1.f27692n
            if (r0 == r2) goto L_0x057c
            x4.n0 r0 = r1.c(r0)
            r8.E = r0
        L_0x057c:
            boolean r0 = r34.e0()
            if (r0 == 0) goto L_0x0589
            x4.n0 r0 = r8.E
            int r0 = r0.f27682d
            r1 = 3
            if (r0 == r1) goto L_0x0590
        L_0x0589:
            x4.n0 r0 = r8.E
            int r0 = r0.f27682d
            r1 = 2
            if (r0 != r1) goto L_0x05a3
        L_0x0590:
            boolean r0 = r8.P
            if (r0 == 0) goto L_0x059a
            boolean r0 = r8.O
            if (r0 == 0) goto L_0x059a
            r0 = 0
            goto L_0x05a0
        L_0x059a:
            r0 = 10
            r8.M(r9, r0)
            r0 = 1
        L_0x05a0:
            r1 = 1
            r0 = r0 ^ r1
            goto L_0x05b7
        L_0x05a3:
            int r1 = r8.Q
            if (r1 == 0) goto L_0x05b0
            r1 = 4
            if (r0 == r1) goto L_0x05b0
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.M(r9, r0)
            goto L_0x05b6
        L_0x05b0:
            b2.t r0 = r8.f27772g
            r1 = 2
            r0.S(r1)
        L_0x05b6:
            r0 = 0
        L_0x05b7:
            x4.n0 r1 = r8.E
            boolean r2 = r1.f27693o
            if (r2 == r0) goto L_0x0601
            x4.n0 r2 = new x4.n0
            r9 = r2
            x4.c1 r10 = r1.f27679a
            z5.r$a r11 = r1.f27680b
            long r12 = r1.f27681c
            int r14 = r1.f27682d
            x4.m r15 = r1.f27683e
            boolean r3 = r1.f27684f
            r16 = r3
            z5.g0 r3 = r1.f27685g
            r17 = r3
            r6.o r3 = r1.f27686h
            r18 = r3
            java.util.List<q5.a> r3 = r1.f27687i
            r19 = r3
            z5.r$a r3 = r1.f27688j
            r20 = r3
            boolean r3 = r1.f27689k
            r21 = r3
            int r3 = r1.f27690l
            r22 = r3
            x4.o0 r3 = r1.f27691m
            r23 = r3
            long r3 = r1.f27694p
            r24 = r3
            long r3 = r1.f27695q
            r26 = r3
            long r3 = r1.f27696r
            r28 = r3
            boolean r1 = r1.f27692n
            r30 = r1
            r31 = r0
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30, r31)
            r8.E = r2
        L_0x0601:
            r0 = 0
            r8.O = r0
            androidx.appcompat.widget.p.f()
            return
        L_0x0608:
            b2.t r0 = r8.f27772g
            r1 = 2
            r0.S(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.y.f():void");
    }

    public final boolean f0(c1 c1Var, r.a aVar) {
        if (aVar.a() || c1Var.q()) {
            return false;
        }
        c1Var.n(c1Var.h(aVar.f28627a, this.f27776s).f27464c, this.f27775r);
        if (!this.f27775r.c()) {
            return false;
        }
        c1.c cVar = this.f27775r;
        if (!cVar.f27478i || cVar.f27475f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void g() throws m {
        h(new boolean[this.f27764a.length]);
    }

    public final void h(boolean[] zArr) throws m {
        v6.r rVar;
        g0 g0Var = this.f27783z.f27621i;
        r6.o oVar = g0Var.f27585n;
        for (int i10 = 0; i10 < this.f27764a.length; i10++) {
            if (!oVar.b(i10)) {
                this.f27764a[i10].b();
            }
        }
        for (int i11 = 0; i11 < this.f27764a.length; i11++) {
            if (oVar.b(i11)) {
                boolean z10 = zArr[i11];
                v0 v0Var = this.f27764a[i11];
                if (!w(v0Var)) {
                    i0 i0Var = this.f27783z;
                    g0 g0Var2 = i0Var.f27621i;
                    boolean z11 = g0Var2 == i0Var.f27620h;
                    r6.o oVar2 = g0Var2.f27585n;
                    x0 x0Var = oVar2.f24681b[i11];
                    b0[] i12 = i(oVar2.f24682c[i11]);
                    boolean z12 = e0() && this.E.f27682d == 3;
                    boolean z13 = !z10 && z12;
                    this.Q++;
                    v0Var.j(x0Var, i12, g0Var2.f27574c[i11], this.S, z13, z11, g0Var2.e(), g0Var2.f27586o);
                    v0Var.n(103, new x(this));
                    k kVar = this.f27779v;
                    kVar.getClass();
                    v6.r v10 = v0Var.v();
                    if (!(v10 == null || v10 == (rVar = kVar.f27638d))) {
                        if (rVar == null) {
                            kVar.f27638d = v10;
                            kVar.f27637c = v0Var;
                            v10.i(kVar.f27635a.f26542e);
                        } else {
                            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z12) {
                        v0Var.start();
                    }
                } else {
                    continue;
                }
            }
        }
        g0Var.f27578g = true;
    }

    public final void h0() throws m {
        this.J = false;
        k kVar = this.f27779v;
        kVar.f27640f = true;
        kVar.f27635a.b();
        for (v0 v0Var : this.f27764a) {
            if (w(v0Var)) {
                v0Var.start();
            }
        }
    }

    public boolean handleMessage(Message message) {
        g0 g0Var;
        try {
            switch (message.what) {
                case 0:
                    B();
                    break;
                case 1:
                    Y(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    O((g) message.obj);
                    break;
                case 4:
                    Z((o0) message.obj);
                    break;
                case 5:
                    this.D = (z0) message.obj;
                    break;
                case 6:
                    i0(false, true);
                    break;
                case 7:
                    C();
                    return true;
                case b4.f10106f:
                    s((o) message.obj);
                    break;
                case 9:
                    p((o) message.obj);
                    break;
                case 10:
                    E();
                    break;
                case 11:
                    a0(message.arg1);
                    break;
                case 12:
                    b0(message.arg1 != 0);
                    break;
                case 13:
                    U(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    s0 s0Var = (s0) message.obj;
                    s0Var.getClass();
                    R(s0Var);
                    break;
                case 15:
                    S((s0) message.obj);
                    break;
                case 16:
                    o0 o0Var = (o0) message.obj;
                    t(o0Var, o0Var.f27700a, true, false);
                    break;
                case 17:
                    V((a) message.obj);
                    break;
                case 18:
                    a((a) message.obj, message.arg1);
                    break;
                case 19:
                    A((b) message.obj);
                    break;
                case 20:
                    D(message.arg1, message.arg2, (d0) message.obj);
                    break;
                case 21:
                    c0((d0) message.obj);
                    break;
                case 22:
                    r(this.A.c());
                    break;
                case 23:
                    X(message.arg1 != 0);
                    break;
                case 24:
                    W(message.arg1 == 1);
                    break;
                case 25:
                    b((m) message.obj);
                    break;
                default:
                    return false;
            }
            z();
        } catch (m e10) {
            e = e10;
            if (e.f27668a == 1 && (g0Var = this.f27783z.f27621i) != null) {
                e = e.a(g0Var.f27577f.f27590a);
            }
            if (!e.f27675h || this.f27767b0 != null) {
                if (this.f27767b0 != null) {
                    this.f27767b0 = null;
                }
                p.b("ExoPlayerImplInternal", "Playback error", e);
                i0(true, false);
                this.E = this.E.e(e);
            } else {
                p.d("ExoPlayerImplInternal", "Recoverable playback error", e);
                this.f27767b0 = e;
                Message Q2 = this.f27772g.Q(25, e);
                Q2.getTarget().sendMessageAtFrontOfQueue(Q2);
            }
            z();
        } catch (IOException e11) {
            m mVar = new m(0, e11);
            g0 g0Var2 = this.f27783z.f27620h;
            if (g0Var2 != null) {
                mVar = mVar.a(g0Var2.f27577f.f27590a);
            }
            p.b("ExoPlayerImplInternal", "Playback error", mVar);
            i0(false, false);
            this.E = this.E.e(mVar);
            z();
        } catch (RuntimeException e12) {
            m mVar2 = new m(2, e12);
            p.b("ExoPlayerImplInternal", "Playback error", mVar2);
            i0(true, false);
            this.E = this.E.e(mVar2);
            z();
        }
        return true;
    }

    public final void i0(boolean z10, boolean z11) {
        F(z10 || !this.N, false, true, false);
        this.F.a(z11 ? 1 : 0);
        this.f27770e.b(true);
        d0(1);
    }

    public final long j(c1 c1Var, Object obj, long j10) {
        c1Var.n(c1Var.h(obj, this.f27776s).f27464c, this.f27775r);
        c1.c cVar = this.f27775r;
        if (cVar.f27475f != -9223372036854775807L && cVar.c()) {
            c1.c cVar2 = this.f27775r;
            if (cVar2.f27478i) {
                return f.b(e0.w(cVar2.f27476g) - this.f27775r.f27475f) - (j10 + this.f27776s.f27466e);
            }
        }
        return -9223372036854775807L;
    }

    public final void j0() throws m {
        k kVar = this.f27779v;
        kVar.f27640f = false;
        v6.y yVar = kVar.f27635a;
        if (yVar.f26539b) {
            yVar.a(yVar.x());
            yVar.f26539b = false;
        }
        for (v0 v0Var : this.f27764a) {
            if (w(v0Var) && v0Var.getState() == 2) {
                v0Var.stop();
            }
        }
    }

    public void k(o oVar) {
        this.f27772g.Q(8, oVar).sendToTarget();
    }

    public final void k0() {
        g0 g0Var = this.f27783z.f27622j;
        boolean z10 = this.K || (g0Var != null && g0Var.f27572a.j());
        n0 n0Var = this.E;
        if (z10 != n0Var.f27684f) {
            n0 n0Var2 = r2;
            n0 n0Var3 = new n0(n0Var.f27679a, n0Var.f27680b, n0Var.f27681c, n0Var.f27682d, n0Var.f27683e, z10, n0Var.f27685g, n0Var.f27686h, n0Var.f27687i, n0Var.f27688j, n0Var.f27689k, n0Var.f27690l, n0Var.f27691m, n0Var.f27694p, n0Var.f27695q, n0Var.f27696r, n0Var.f27692n, n0Var.f27693o);
            this.E = n0Var2;
        }
    }

    public final long l() {
        g0 g0Var = this.f27783z.f27621i;
        if (g0Var == null) {
            return 0;
        }
        long j10 = g0Var.f27586o;
        if (!g0Var.f27575d) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            v0[] v0VarArr = this.f27764a;
            if (i10 >= v0VarArr.length) {
                return j10;
            }
            if (w(v0VarArr[i10]) && this.f27764a[i10].o() == g0Var.f27574c[i10]) {
                long s10 = this.f27764a[i10].s();
                if (s10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j10 = Math.max(s10, j10);
            }
            i10++;
        }
    }

    public final void l0(c1 c1Var, r.a aVar, c1 c1Var2, r.a aVar2, long j10) {
        if (c1Var.q() || !f0(c1Var, aVar)) {
            float f10 = this.f27779v.f().f27700a;
            o0 o0Var = this.E.f27691m;
            if (f10 != o0Var.f27700a) {
                this.f27779v.i(o0Var);
                return;
            }
            return;
        }
        c1Var.n(c1Var.h(aVar.f28627a, this.f27776s).f27464c, this.f27775r);
        d0 d0Var = this.B;
        e0.f fVar = this.f27775r.f27480k;
        int i10 = v6.e0.f26436a;
        i iVar = (i) d0Var;
        iVar.getClass();
        iVar.f27601d = f.b(fVar.f27549a);
        iVar.f27604g = f.b(fVar.f27550b);
        iVar.f27605h = f.b(fVar.f27551c);
        float f11 = fVar.f27552d;
        if (f11 == -3.4028235E38f) {
            f11 = 0.97f;
        }
        iVar.f27608k = f11;
        float f12 = fVar.f27553e;
        if (f12 == -3.4028235E38f) {
            f12 = 1.03f;
        }
        iVar.f27607j = f12;
        iVar.a();
        if (j10 != -9223372036854775807L) {
            i iVar2 = (i) this.B;
            iVar2.f27602e = j(c1Var, aVar.f28627a, j10);
            iVar2.a();
            return;
        }
        Object obj = this.f27775r.f27470a;
        Object obj2 = null;
        if (!c1Var2.q()) {
            obj2 = c1Var2.n(c1Var2.h(aVar2.f28627a, this.f27776s).f27464c, this.f27775r).f27470a;
        }
        if (!v6.e0.a(obj2, obj)) {
            i iVar3 = (i) this.B;
            iVar3.f27602e = -9223372036854775807L;
            iVar3.a();
        }
    }

    public final Pair<r.a, Long> m(c1 c1Var) {
        long j10 = 0;
        if (c1Var.q()) {
            r.a aVar = n0.f27678s;
            return Pair.create(n0.f27678s, 0L);
        }
        c1 c1Var2 = c1Var;
        Pair<Object, Long> j11 = c1Var2.j(this.f27775r, this.f27776s, c1Var.a(this.M), -9223372036854775807L);
        r.a n10 = this.f27783z.n(c1Var, j11.first, 0);
        long longValue = ((Long) j11.second).longValue();
        if (n10.a()) {
            c1Var.h(n10.f28627a, this.f27776s);
            if (n10.f28629c == this.f27776s.e(n10.f28628b)) {
                j10 = this.f27776s.f27467f.f117e;
            }
            longValue = j10;
        }
        return Pair.create(n10, Long.valueOf(longValue));
    }

    public final void m0(g0 g0Var, r6.o oVar) {
        j jVar = this.f27770e;
        v0[] v0VarArr = this.f27764a;
        h[] hVarArr = oVar.f24682c;
        int i10 = jVar.f27631f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 >= v0VarArr.length) {
                    i10 = Math.max(13107200, i12);
                    break;
                }
                if (hVarArr[i11] != null) {
                    int g10 = v0VarArr[i11].g();
                    if (g10 == 0) {
                        i13 = 144310272;
                    } else if (g10 != 1) {
                        if (g10 == 2) {
                            i13 = 131072000;
                        } else if (g10 == 3 || g10 == 5 || g10 == 6) {
                            i13 = 131072;
                        } else if (g10 == 7) {
                            i13 = 0;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    i12 += i13;
                }
                i11++;
            }
        }
        jVar.f27633h = i10;
        jVar.f27626a.c(i10);
    }

    public final long n() {
        return o(this.E.f27694p);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x016b A[EDGE_INSN: B:149:0x016b->B:70:0x016b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0199 A[LOOP:1: B:74:0x017d->B:84:0x0199, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n0() throws x4.m {
        /*
            r23 = this;
            r7 = r23
            x4.i0 r0 = r7.f27783z
            x4.g0 r0 = r0.f27620h
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f27575d
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            z5.o r1 = r0.f27572a
            long r1 = r1.r()
            r3 = r1
            goto L_0x001b
        L_0x001a:
            r3 = r8
        L_0x001b:
            r10 = 0
            r11 = 1
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0045
            r7.H(r3)
            x4.n0 r0 = r7.E
            long r0 = r0.f27696r
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0040
            x4.n0 r0 = r7.E
            z5.r$a r2 = r0.f27680b
            long r5 = r0.f27681c
            r1 = r23
            x4.n0 r0 = r1.u(r2, r3, r5)
            r7.E = r0
            x4.y$d r0 = r7.F
            r1 = 4
            r0.b(r1)
        L_0x0040:
            r0 = r7
            r16 = r0
            goto L_0x01f9
        L_0x0045:
            x4.k r1 = r7.f27779v
            x4.i0 r2 = r7.f27783z
            x4.g0 r2 = r2.f27621i
            if (r0 == r2) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            x4.v0 r3 = r1.f27637c
            if (r3 == 0) goto L_0x006f
            boolean r3 = r3.d()
            if (r3 != 0) goto L_0x006f
            x4.v0 r3 = r1.f27637c
            boolean r3 = r3.isReady()
            if (r3 != 0) goto L_0x006d
            if (r2 != 0) goto L_0x006f
            x4.v0 r2 = r1.f27637c
            boolean r2 = r2.k()
            if (r2 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r2 = 0
            goto L_0x0070
        L_0x006f:
            r2 = 1
        L_0x0070:
            if (r2 == 0) goto L_0x007e
            r1.f27639e = r11
            boolean r2 = r1.f27640f
            if (r2 == 0) goto L_0x00e1
            v6.y r2 = r1.f27635a
            r2.b()
            goto L_0x00e1
        L_0x007e:
            v6.r r2 = r1.f27638d
            r2.getClass()
            long r3 = r2.x()
            boolean r5 = r1.f27639e
            if (r5 == 0) goto L_0x00b0
            v6.y r5 = r1.f27635a
            long r5 = r5.x()
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x00a5
            v6.y r2 = r1.f27635a
            boolean r3 = r2.f26539b
            if (r3 == 0) goto L_0x00e1
            long r3 = r2.x()
            r2.a(r3)
            r2.f26539b = r10
            goto L_0x00e1
        L_0x00a5:
            r1.f27639e = r10
            boolean r5 = r1.f27640f
            if (r5 == 0) goto L_0x00b0
            v6.y r5 = r1.f27635a
            r5.b()
        L_0x00b0:
            v6.y r5 = r1.f27635a
            r5.a(r3)
            x4.o0 r2 = r2.f()
            v6.y r3 = r1.f27635a
            x4.o0 r3 = r3.f26542e
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00e1
            v6.y r3 = r1.f27635a
            boolean r4 = r3.f26539b
            if (r4 == 0) goto L_0x00d0
            long r4 = r3.x()
            r3.a(r4)
        L_0x00d0:
            r3.f26542e = r2
            x4.k$a r3 = r1.f27636b
            x4.y r3 = (x4.y) r3
            b2.t r3 = r3.f27772g
            r4 = 16
            android.os.Message r2 = r3.Q(r4, r2)
            r2.sendToTarget()
        L_0x00e1:
            long r1 = r1.x()
            r7.S = r1
            long r3 = r0.f27586o
            long r1 = r1 - r3
            x4.n0 r0 = r7.E
            long r3 = r0.f27696r
            java.util.ArrayList<x4.y$c> r0 = r7.f27780w
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01f1
            x4.n0 r0 = r7.E
            z5.r$a r0 = r0.f27680b
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0102
            goto L_0x01f1
        L_0x0102:
            boolean r0 = r7.f27765a0
            if (r0 == 0) goto L_0x010b
            r5 = 1
            long r3 = r3 - r5
            r7.f27765a0 = r10
        L_0x010b:
            x4.n0 r0 = r7.E
            x4.c1 r5 = r0.f27679a
            z5.r$a r0 = r0.f27680b
            java.lang.Object r0 = r0.f28627a
            int r0 = r5.b(r0)
            int r5 = r7.Z
            java.util.ArrayList<x4.y$c> r6 = r7.f27780w
            int r6 = r6.size()
            int r5 = java.lang.Math.min(r5, r6)
            if (r5 <= 0) goto L_0x0137
            java.util.ArrayList<x4.y$c> r12 = r7.f27780w
            int r13 = r5 + -1
            java.lang.Object r12 = r12.get(r13)
            x4.y$c r12 = (x4.y.c) r12
            r13 = r3
            r15 = r7
            r16 = r15
            r17 = r16
            r3 = r1
            goto L_0x0144
        L_0x0137:
            r12 = r3
            r14 = r7
            r15 = r14
            r16 = r15
            r3 = r1
        L_0x013d:
            r17 = r16
            r16 = r15
            r15 = r14
            r13 = r12
            r12 = 0
        L_0x0144:
            if (r12 == 0) goto L_0x016b
            int r6 = r12.f27789b
            if (r6 > r0) goto L_0x0152
            if (r6 != r0) goto L_0x016b
            long r11 = r12.f27790c
            int r19 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r19 <= 0) goto L_0x016b
        L_0x0152:
            int r5 = r5 + -1
            if (r5 <= 0) goto L_0x0163
            java.util.ArrayList<x4.y$c> r11 = r15.f27780w
            int r12 = r5 + -1
            java.lang.Object r11 = r11.get(r12)
            r12 = r11
            x4.y$c r12 = (x4.y.c) r12
            r11 = 1
            goto L_0x0144
        L_0x0163:
            r12 = r13
            r14 = r15
            r15 = r16
            r16 = r17
            r11 = 1
            goto L_0x013d
        L_0x016b:
            java.util.ArrayList<x4.y$c> r11 = r15.f27780w
            int r11 = r11.size()
            if (r5 >= r11) goto L_0x017c
            java.util.ArrayList<x4.y$c> r11 = r15.f27780w
            java.lang.Object r11 = r11.get(r5)
            x4.y$c r11 = (x4.y.c) r11
            goto L_0x017d
        L_0x017c:
            r11 = 0
        L_0x017d:
            if (r11 == 0) goto L_0x01a8
            java.lang.Object r12 = r11.f27791d
            if (r12 == 0) goto L_0x01a8
            int r12 = r11.f27789b
            if (r12 < r0) goto L_0x018f
            if (r12 != r0) goto L_0x01a8
            long r6 = r11.f27790c
            int r19 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r19 > 0) goto L_0x01a8
        L_0x018f:
            int r5 = r5 + 1
            java.util.ArrayList<x4.y$c> r6 = r15.f27780w
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x01a5
            java.util.ArrayList<x4.y$c> r6 = r15.f27780w
            java.lang.Object r6 = r6.get(r5)
            r11 = r6
            x4.y$c r11 = (x4.y.c) r11
            r7 = r23
            goto L_0x017d
        L_0x01a5:
            r7 = r23
            goto L_0x017c
        L_0x01a8:
            if (r11 == 0) goto L_0x01eb
            java.lang.Object r6 = r11.f27791d
            if (r6 == 0) goto L_0x01eb
            int r6 = r11.f27789b
            if (r6 != r0) goto L_0x01eb
            long r6 = r11.f27790c
            int r19 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r19 <= 0) goto L_0x01eb
            int r19 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r19 > 0) goto L_0x01eb
            x4.s0 r6 = r11.f27788a     // Catch:{ all -> 0x01df }
            r15.R(r6)     // Catch:{ all -> 0x01df }
            x4.s0 r6 = r11.f27788a
            r6.getClass()
            java.util.ArrayList<x4.y$c> r6 = r15.f27780w
            r6.remove(r5)
            java.util.ArrayList<x4.y$c> r6 = r15.f27780w
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x01dd
            java.util.ArrayList<x4.y$c> r6 = r15.f27780w
            java.lang.Object r6 = r6.get(r5)
            r11 = r6
            x4.y$c r11 = (x4.y.c) r11
            goto L_0x01a8
        L_0x01dd:
            r11 = 0
            goto L_0x01a8
        L_0x01df:
            r0 = move-exception
            x4.s0 r1 = r11.f27788a
            r1.getClass()
            java.util.ArrayList<x4.y$c> r1 = r15.f27780w
            r1.remove(r5)
            throw r0
        L_0x01eb:
            r15.Z = r5
            r1 = r3
            r0 = r17
            goto L_0x01f5
        L_0x01f1:
            r0 = r23
            r16 = r0
        L_0x01f5:
            x4.n0 r3 = r0.E
            r3.f27696r = r1
        L_0x01f9:
            x4.i0 r1 = r0.f27783z
            x4.g0 r1 = r1.f27622j
            x4.n0 r2 = r0.E
            long r3 = r1.d()
            r2.f27694p = r3
            x4.n0 r1 = r0.E
            long r2 = r16.n()
            r1.f27695q = r2
            x4.n0 r1 = r0.E
            boolean r2 = r1.f27689k
            if (r2 == 0) goto L_0x0357
            int r2 = r1.f27682d
            r3 = 3
            if (r2 != r3) goto L_0x0357
            x4.c1 r2 = r1.f27679a
            z5.r$a r1 = r1.f27680b
            boolean r1 = r0.f0(r2, r1)
            if (r1 == 0) goto L_0x0357
            x4.n0 r1 = r0.E
            x4.o0 r2 = r1.f27691m
            float r2 = r2.f27700a
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0357
            x4.d0 r2 = r0.B
            x4.c1 r5 = r1.f27679a
            z5.r$a r6 = r1.f27680b
            java.lang.Object r6 = r6.f28627a
            long r13 = r1.f27696r
            long r5 = r0.j(r5, r6, r13)
            long r13 = r16.n()
            x4.i r2 = (x4.i) r2
            long r10 = r2.f27601d
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x024a
            goto L_0x032b
        L_0x024a:
            long r10 = r5 - r13
            long r13 = r2.f27611n
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0259
            r2.f27611n = r10
            r10 = 0
            r2.f27612o = r10
            goto L_0x0280
        L_0x0259:
            float r7 = r2.f27600c
            float r13 = (float) r13
            float r13 = r13 * r7
            float r7 = r4 - r7
            float r14 = (float) r10
            float r7 = r7 * r14
            float r7 = r7 + r13
            long r13 = (long) r7
            long r13 = java.lang.Math.max(r10, r13)
            r2.f27611n = r13
            long r10 = r10 - r13
            long r10 = java.lang.Math.abs(r10)
            long r13 = r2.f27612o
            float r7 = r2.f27600c
            float r13 = (float) r13
            float r13 = r13 * r7
            float r7 = r4 - r7
            float r10 = (float) r10
            float r7 = r7 * r10
            float r7 = r7 + r13
            long r10 = (long) r7
            r2.f27612o = r10
        L_0x0280:
            long r10 = r2.f27610m
            r13 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0297
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r8 = r2.f27610m
            long r10 = r10 - r8
            int r7 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r7 >= 0) goto L_0x0297
            float r4 = r2.f27609l
            goto L_0x032b
        L_0x0297:
            long r7 = android.os.SystemClock.elapsedRealtime()
            r2.f27610m = r7
            long r7 = r2.f27611n
            long r9 = r2.f27612o
            r17 = 3
            long r9 = r9 * r17
            long r21 = r9 + r7
            long r7 = r2.f27606i
            r9 = 869711765(0x33d6bf95, float:1.0E-7)
            int r10 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r10 <= 0) goto L_0x02e4
            long r7 = x4.f.b(r13)
            float r10 = r2.f27609l
            float r10 = r10 - r4
            float r7 = (float) r7
            float r10 = r10 * r7
            long r10 = (long) r10
            float r8 = r2.f27607j
            float r8 = r8 - r4
            float r8 = r8 * r7
            long r7 = (long) r8
            long r10 = r10 + r7
            long[] r7 = new long[r3]
            r1 = 0
            r7[r1] = r21
            long r13 = r2.f27603f
            r8 = 1
            r7[r8] = r13
            r12 = 2
            long r13 = r2.f27606i
            long r13 = r13 - r10
            r7[r12] = r13
            r10 = r7[r1]
        L_0x02d4:
            if (r8 >= r3) goto L_0x02e1
            r12 = r7[r8]
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x02de
            r10 = r7[r8]
        L_0x02de:
            int r8 = r8 + 1
            goto L_0x02d4
        L_0x02e1:
            r2.f27606i = r10
            goto L_0x030b
        L_0x02e4:
            r3 = 0
            float r7 = r2.f27609l
            float r7 = r7 - r4
            float r3 = java.lang.Math.max(r3, r7)
            float r3 = r3 / r9
            long r7 = (long) r3
            long r17 = r5 - r7
            long r7 = r2.f27606i
            r19 = r7
            long r7 = v6.e0.j(r17, r19, r21)
            r2.f27606i = r7
            long r10 = r2.f27605h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x030b
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x030b
            r2.f27606i = r10
        L_0x030b:
            long r7 = r2.f27606i
            long r5 = r5 - r7
            long r7 = java.lang.Math.abs(r5)
            long r10 = r2.f27598a
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x031b
            r2.f27609l = r4
            goto L_0x0329
        L_0x031b:
            float r3 = (float) r5
            float r9 = r9 * r3
            float r9 = r9 + r4
            float r3 = r2.f27608k
            float r4 = r2.f27607j
            float r3 = v6.e0.h(r9, r3, r4)
            r2.f27609l = r3
        L_0x0329:
            float r4 = r2.f27609l
        L_0x032b:
            x4.k r2 = r0.f27779v
            x4.o0 r2 = r2.f()
            float r2 = r2.f27700a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0357
            x4.k r2 = r0.f27779v
            x4.n0 r3 = r0.E
            x4.o0 r3 = r3.f27691m
            x4.o0 r5 = new x4.o0
            float r3 = r3.f27701b
            r5.<init>(r4, r3)
            r2.i(r5)
            x4.n0 r2 = r0.E
            x4.o0 r2 = r2.f27691m
            x4.k r3 = r0.f27779v
            x4.o0 r3 = r3.f()
            float r3 = r3.f27700a
            r1 = 0
            r0.t(r2, r3, r1, r1)
        L_0x0357:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.y.n0():void");
    }

    public final long o(long j10) {
        g0 g0Var = this.f27783z.f27622j;
        if (g0Var == null) {
            return 0;
        }
        return Math.max(0, j10 - (this.S - g0Var.f27586o));
    }

    public final void p(o oVar) {
        i0 i0Var = this.f27783z;
        g0 g0Var = i0Var.f27622j;
        if (g0Var != null && g0Var.f27572a == oVar) {
            i0Var.l(this.S);
            y();
        }
    }

    public final void q(boolean z10) {
        long j10;
        g0 g0Var = this.f27783z.f27622j;
        r.a aVar = g0Var == null ? this.E.f27680b : g0Var.f27577f.f27590a;
        boolean z11 = !this.E.f27688j.equals(aVar);
        if (z11) {
            this.E = this.E.a(aVar);
        }
        n0 n0Var = this.E;
        if (g0Var == null) {
            j10 = n0Var.f27696r;
        } else {
            j10 = g0Var.d();
        }
        n0Var.f27694p = j10;
        this.E.f27695q = n();
        if ((z11 || z10) && g0Var != null && g0Var.f27575d) {
            m0(g0Var.f27584m, g0Var.f27585n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(x4.c1 r40) throws x4.m {
        /*
            r39 = this;
            r8 = r39
            r9 = r40
            x4.n0 r0 = r8.E
            x4.y$g r10 = r8.R
            x4.i0 r11 = r8.f27783z
            int r4 = r8.L
            boolean r12 = r8.M
            x4.c1$c r13 = r8.f27775r
            x4.c1$b r14 = r8.f27776s
            boolean r1 = r40.q()
            r15 = 4
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x0039
            x4.y$f r0 = new x4.y$f
            z5.r$a r1 = x4.n0.f27678s
            z5.r$a r19 = x4.n0.f27678s
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r25 = 1
            r26 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
        L_0x0036:
            r7 = r0
            goto L_0x01ae
        L_0x0039:
            z5.r$a r5 = r0.f27680b
            java.lang.Object r3 = r5.f28627a
            boolean r1 = g0(r0, r14, r13)
            if (r1 == 0) goto L_0x0046
            long r6 = r0.f27681c
            goto L_0x0048
        L_0x0046:
            long r6 = r0.f27696r
        L_0x0048:
            r20 = r6
            r7 = -1
            if (r10 == 0) goto L_0x0099
            r6 = 1
            r1 = r40
            r2 = r10
            r27 = r3
            r3 = r6
            r6 = r5
            r5 = r12
            r28 = r6
            r6 = r13
            r7 = r14
            android.util.Pair r1 = K(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x006a
            int r1 = r9.a(r12)
            r3 = r27
            r2 = 0
            r6 = 0
            r7 = 1
            goto L_0x0092
        L_0x006a:
            long r2 = r10.f27807c
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x007d
            java.lang.Object r1 = r1.first
            x4.c1$b r1 = r9.h(r1, r14)
            int r7 = r1.f27464c
            r1 = r7
            r3 = r27
            r7 = 0
            goto L_0x0089
        L_0x007d:
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            r1 = -1
            r7 = 1
        L_0x0089:
            int r2 = r0.f27682d
            if (r2 != r15) goto L_0x008f
            r2 = 1
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            r6 = r7
            r7 = 0
        L_0x0092:
            r15 = -1
            r38 = r6
            r6 = r2
            r2 = r38
            goto L_0x00d7
        L_0x0099:
            r27 = r3
            r28 = r5
            x4.c1 r2 = r0.f27679a
            boolean r2 = r2.q()
            if (r2 == 0) goto L_0x00ae
            int r1 = r9.a(r12)
            r7 = r1
            r10 = r27
            r15 = -1
            goto L_0x00ef
        L_0x00ae:
            r10 = r27
            int r2 = r9.b(r10)
            r7 = -1
            if (r2 != r7) goto L_0x00e1
            x4.c1 r6 = r0.f27679a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r12
            r5 = r10
            r15 = -1
            r7 = r40
            java.lang.Object r1 = L(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00cd
            int r1 = r9.a(r12)
            r7 = 1
            goto L_0x00d4
        L_0x00cd:
            x4.c1$b r1 = r9.h(r1, r14)
            int r1 = r1.f27464c
            r7 = 0
        L_0x00d4:
            r3 = r10
            r2 = 0
            r6 = 0
        L_0x00d7:
            r4 = r1
            r37 = r2
            r35 = r6
            r36 = r7
            r7 = r28
            goto L_0x0127
        L_0x00e1:
            r15 = -1
            if (r1 == 0) goto L_0x011b
            int r1 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00f3
            x4.c1$b r1 = r9.h(r10, r14)
            int r1 = r1.f27464c
            r7 = r1
        L_0x00ef:
            r1 = r7
            r7 = r28
            goto L_0x011e
        L_0x00f3:
            x4.c1 r1 = r0.f27679a
            r7 = r28
            java.lang.Object r2 = r7.f28627a
            r1.h(r2, r14)
            long r1 = r14.f27466e
            long r5 = r20 + r1
            x4.c1$b r1 = r9.h(r10, r14)
            int r4 = r1.f27464c
            r1 = r40
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            r1 = -1
            r2 = 1
            goto L_0x0120
        L_0x011b:
            r7 = r28
            r1 = -1
        L_0x011e:
            r3 = r10
            r2 = 0
        L_0x0120:
            r4 = r1
            r37 = r2
            r35 = 0
            r36 = 0
        L_0x0127:
            if (r4 == r15) goto L_0x0145
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r40
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            r33 = r16
            r1 = r20
            goto L_0x0149
        L_0x0145:
            r1 = r20
            r33 = r1
        L_0x0149:
            z5.r$a r5 = r11.n(r9, r3, r1)
            int r4 = r5.f28631e
            if (r4 == r15) goto L_0x015c
            int r4 = r7.f28631e
            if (r4 == r15) goto L_0x015a
            int r6 = r5.f28628b
            if (r6 < r4) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r4 = 0
            goto L_0x015d
        L_0x015c:
            r4 = 1
        L_0x015d:
            java.lang.Object r6 = r7.f28627a
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0175
            boolean r3 = r7.a()
            if (r3 != 0) goto L_0x0175
            boolean r3 = r5.a()
            if (r3 != 0) goto L_0x0175
            if (r4 == 0) goto L_0x0175
            r3 = 1
            goto L_0x0176
        L_0x0175:
            r3 = 0
        L_0x0176:
            if (r3 == 0) goto L_0x0179
            r5 = r7
        L_0x0179:
            boolean r3 = r5.a()
            if (r3 == 0) goto L_0x01a1
            boolean r1 = r5.equals(r7)
            if (r1 == 0) goto L_0x018a
            long r0 = r0.f27696r
        L_0x0187:
            r31 = r0
            goto L_0x01a3
        L_0x018a:
            java.lang.Object r0 = r5.f28627a
            r9.h(r0, r14)
            int r0 = r5.f28629c
            int r1 = r5.f28628b
            int r1 = r14.e(r1)
            if (r0 != r1) goto L_0x019e
            a6.a r0 = r14.f27467f
            long r0 = r0.f117e
            goto L_0x0187
        L_0x019e:
            r0 = 0
            goto L_0x0187
        L_0x01a1:
            r31 = r1
        L_0x01a3:
            x4.y$f r0 = new x4.y$f
            r29 = r0
            r30 = r5
            r29.<init>(r30, r31, r33, r35, r36, r37)
            goto L_0x0036
        L_0x01ae:
            z5.r$a r10 = r7.f27799a
            long r11 = r7.f27801c
            boolean r0 = r7.f27802d
            long r13 = r7.f27800b
            x4.n0 r1 = r8.E
            z5.r$a r1 = r1.f27680b
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x01cb
            x4.n0 r1 = r8.E
            long r1 = r1.f27696r
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01c9
            goto L_0x01cb
        L_0x01c9:
            r15 = 0
            goto L_0x01cc
        L_0x01cb:
            r15 = 1
        L_0x01cc:
            r5 = 0
            boolean r1 = r7.f27803e     // Catch:{ all -> 0x0276 }
            if (r1 == 0) goto L_0x01e1
            x4.n0 r1 = r8.E     // Catch:{ all -> 0x0276 }
            int r1 = r1.f27682d     // Catch:{ all -> 0x0276 }
            r2 = 1
            if (r1 == r2) goto L_0x01dc
            r1 = 4
            r8.d0(r1)     // Catch:{ all -> 0x0276 }
        L_0x01dc:
            r6 = 0
            r8.F(r6, r6, r6, r2)     // Catch:{ all -> 0x0276 }
            goto L_0x01e2
        L_0x01e1:
            r6 = 0
        L_0x01e2:
            if (r15 != 0) goto L_0x01fd
            x4.i0 r1 = r8.f27783z     // Catch:{ all -> 0x0276 }
            long r3 = r8.S     // Catch:{ all -> 0x0276 }
            long r18 = r39.l()     // Catch:{ all -> 0x0276 }
            r2 = r40
            r20 = r11
            r11 = 0
            r5 = r18
            boolean r0 = r1.q(r2, r3, r5)     // Catch:{ all -> 0x0273 }
            if (r0 != 0) goto L_0x0228
            r8.N(r11)     // Catch:{ all -> 0x0273 }
            goto L_0x0228
        L_0x01fd:
            r20 = r11
            r11 = 0
            boolean r1 = r40.q()     // Catch:{ all -> 0x0273 }
            if (r1 != 0) goto L_0x0228
            x4.i0 r1 = r8.f27783z     // Catch:{ all -> 0x0273 }
            x4.g0 r1 = r1.f27620h     // Catch:{ all -> 0x0273 }
        L_0x020a:
            if (r1 == 0) goto L_0x0223
            x4.h0 r2 = r1.f27577f     // Catch:{ all -> 0x0273 }
            z5.r$a r2 = r2.f27590a     // Catch:{ all -> 0x0273 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x0273 }
            if (r2 == 0) goto L_0x0220
            x4.i0 r2 = r8.f27783z     // Catch:{ all -> 0x0273 }
            x4.h0 r3 = r1.f27577f     // Catch:{ all -> 0x0273 }
            x4.h0 r2 = r2.g(r9, r3)     // Catch:{ all -> 0x0273 }
            r1.f27577f = r2     // Catch:{ all -> 0x0273 }
        L_0x0220:
            x4.g0 r1 = r1.f27583l     // Catch:{ all -> 0x0273 }
            goto L_0x020a
        L_0x0223:
            long r0 = r8.P(r10, r13, r0)     // Catch:{ all -> 0x0273 }
            r13 = r0
        L_0x0228:
            x4.n0 r0 = r8.E
            x4.c1 r4 = r0.f27679a
            z5.r$a r5 = r0.f27680b
            boolean r0 = r7.f27804f
            if (r0 == 0) goto L_0x0234
            r6 = r13
            goto L_0x0236
        L_0x0234:
            r6 = r16
        L_0x0236:
            r1 = r39
            r2 = r40
            r3 = r10
            r1.l0(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x0248
            x4.n0 r0 = r8.E
            long r0 = r0.f27681c
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0254
        L_0x0248:
            r1 = r39
            r2 = r10
            r3 = r13
            r5 = r20
            x4.n0 r0 = r1.u(r2, r3, r5)
            r8.E = r0
        L_0x0254:
            r39.G()
            x4.n0 r0 = r8.E
            x4.c1 r0 = r0.f27679a
            r8.J(r9, r0)
            x4.n0 r0 = r8.E
            x4.n0 r0 = r0.h(r9)
            r8.E = r0
            boolean r0 = r40.q()
            if (r0 != 0) goto L_0x026f
            r12 = 0
            r8.R = r12
        L_0x026f:
            r8.q(r11)
            return
        L_0x0273:
            r0 = move-exception
            r12 = 0
            goto L_0x027b
        L_0x0276:
            r0 = move-exception
            r20 = r11
            r11 = 0
            r12 = r5
        L_0x027b:
            x4.n0 r1 = r8.E
            x4.c1 r4 = r1.f27679a
            z5.r$a r5 = r1.f27680b
            boolean r1 = r7.f27804f
            if (r1 == 0) goto L_0x0287
            r6 = r13
            goto L_0x0289
        L_0x0287:
            r6 = r16
        L_0x0289:
            r1 = r39
            r2 = r40
            r3 = r10
            r1.l0(r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x029b
            x4.n0 r1 = r8.E
            long r1 = r1.f27681c
            int r3 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x02a7
        L_0x029b:
            r1 = r39
            r2 = r10
            r3 = r13
            r5 = r20
            x4.n0 r1 = r1.u(r2, r3, r5)
            r8.E = r1
        L_0x02a7:
            r39.G()
            x4.n0 r1 = r8.E
            x4.c1 r1 = r1.f27679a
            r8.J(r9, r1)
            x4.n0 r1 = r8.E
            x4.n0 r1 = r1.h(r9)
            r8.E = r1
            boolean r1 = r40.q()
            if (r1 != 0) goto L_0x02c1
            r8.R = r12
        L_0x02c1:
            r8.q(r11)
            goto L_0x02c6
        L_0x02c5:
            throw r0
        L_0x02c6:
            goto L_0x02c5
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.y.r(x4.c1):void");
    }

    public final void s(o oVar) throws m {
        g0 g0Var = this.f27783z.f27622j;
        if (g0Var != null && g0Var.f27572a == oVar) {
            float f10 = this.f27779v.f().f27700a;
            c1 c1Var = this.E.f27679a;
            g0Var.f27575d = true;
            g0Var.f27584m = g0Var.f27572a.v();
            r6.o i10 = g0Var.i(f10, c1Var);
            h0 h0Var = g0Var.f27577f;
            long j10 = h0Var.f27591b;
            long j11 = h0Var.f27594e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0, j11 - 1);
            }
            long a10 = g0Var.a(i10, j10, false, new boolean[g0Var.f27580i.length]);
            long j12 = g0Var.f27586o;
            h0 h0Var2 = g0Var.f27577f;
            g0Var.f27586o = (h0Var2.f27591b - a10) + j12;
            g0Var.f27577f = h0Var2.b(a10);
            m0(g0Var.f27584m, g0Var.f27585n);
            if (g0Var == this.f27783z.f27620h) {
                H(g0Var.f27577f.f27591b);
                g();
                n0 n0Var = this.E;
                this.E = u(n0Var.f27680b, g0Var.f27577f.f27591b, n0Var.f27681c);
            }
            y();
        }
    }

    public final void t(o0 o0Var, float f10, boolean z10, boolean z11) throws m {
        int i10;
        if (z10) {
            if (z11) {
                this.F.a(1);
            }
            this.E = this.E.f(o0Var);
        }
        float f11 = o0Var.f27700a;
        g0 g0Var = this.f27783z.f27620h;
        while (true) {
            i10 = 0;
            if (g0Var == null) {
                break;
            }
            h[] hVarArr = g0Var.f27585n.f24682c;
            int length = hVarArr.length;
            while (i10 < length) {
                h hVar = hVarArr[i10];
                if (hVar != null) {
                    hVar.n(f11);
                }
                i10++;
            }
            g0Var = g0Var.f27583l;
        }
        v0[] v0VarArr = this.f27764a;
        int length2 = v0VarArr.length;
        while (i10 < length2) {
            v0 v0Var = v0VarArr[i10];
            if (v0Var != null) {
                v0Var.y(f10, o0Var.f27700a);
            }
            i10++;
        }
    }

    public final n0 u(r.a aVar, long j10, long j11) {
        s<Object> sVar;
        r6.o oVar;
        g0 g0Var;
        g0 g0Var2;
        r6.o oVar2;
        s<Object> sVar2;
        r.a aVar2 = aVar;
        long j12 = j11;
        int i10 = 0;
        this.f27765a0 = this.f27765a0 || j10 != this.E.f27696r || !aVar2.equals(this.E.f27680b);
        G();
        n0 n0Var = this.E;
        g0 g0Var3 = n0Var.f27685g;
        r6.o oVar3 = n0Var.f27686h;
        List<q5.a> list = n0Var.f27687i;
        if (this.A.f27654j) {
            g0 g0Var4 = this.f27783z.f27620h;
            if (g0Var4 == null) {
                g0Var2 = g0.f28588d;
            } else {
                g0Var2 = g0Var4.f27584m;
            }
            if (g0Var4 == null) {
                oVar2 = this.f27769d;
            } else {
                oVar2 = g0Var4.f27585n;
            }
            h[] hVarArr = oVar2.f24682c;
            ba.h.b(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int length = hVarArr.length;
            int i11 = 0;
            boolean z10 = false;
            int i12 = 0;
            while (i11 < length) {
                h hVar = hVarArr[i11];
                if (hVar != null) {
                    q5.a aVar3 = hVar.c(i10).f27406r;
                    if (aVar3 == null) {
                        q5.a aVar4 = new q5.a(new a.b[i10]);
                        int i13 = i12 + 1;
                        if (objArr.length < i13) {
                            objArr = Arrays.copyOf(objArr, q.b.a(objArr.length, i13));
                        }
                        objArr[i12] = aVar4;
                        i12 = i13;
                    } else {
                        int i14 = i12 + 1;
                        if (objArr.length < i14) {
                            objArr = Arrays.copyOf(objArr, q.b.a(objArr.length, i14));
                        }
                        objArr[i12] = aVar3;
                        i12 = i14;
                        z10 = true;
                    }
                }
                i11++;
                i10 = 0;
            }
            if (z10) {
                sVar2 = s.x(objArr, i12);
            } else {
                ba.a<Object> aVar5 = s.f3795b;
                sVar2 = o0.f3765e;
            }
            if (g0Var4 != null) {
                h0 h0Var = g0Var4.f27577f;
                if (h0Var.f27592c != j12) {
                    g0Var4.f27577f = h0Var.a(j12);
                }
            }
            sVar = sVar2;
            g0Var = g0Var2;
            oVar = oVar2;
        } else if (!aVar2.equals(n0Var.f27680b)) {
            g0 g0Var5 = g0.f28588d;
            r6.o oVar4 = this.f27769d;
            ba.a<Object> aVar6 = s.f3795b;
            g0Var = g0Var5;
            oVar = oVar4;
            sVar = o0.f3765e;
        } else {
            oVar = oVar3;
            sVar = list;
            g0Var = g0Var3;
        }
        return this.E.b(aVar, j10, j11, n(), g0Var, oVar, sVar);
    }

    public final boolean v() {
        g0 g0Var = this.f27783z.f27622j;
        if (g0Var == null) {
            return false;
        }
        if ((!g0Var.f27575d ? 0 : g0Var.f27572a.a()) == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean x() {
        g0 g0Var = this.f27783z.f27620h;
        long j10 = g0Var.f27577f.f27594e;
        return g0Var.f27575d && (j10 == -9223372036854775807L || this.E.f27696r < j10 || !e0());
    }

    public final void y() {
        int i10;
        boolean z10 = false;
        if (v()) {
            g0 g0Var = this.f27783z.f27622j;
            long o10 = o(!g0Var.f27575d ? 0 : g0Var.f27572a.a());
            if (g0Var != this.f27783z.f27620h) {
                long j10 = g0Var.f27577f.f27591b;
            }
            j jVar = this.f27770e;
            float f10 = this.f27779v.f().f27700a;
            u6.f fVar = jVar.f27626a;
            synchronized (fVar) {
                i10 = fVar.f26064g * fVar.f26060c;
            }
            boolean z11 = i10 >= jVar.f27633h;
            long j11 = jVar.f27627b;
            if (f10 > 1.0f) {
                j11 = Math.min(v6.e0.u(j11, f10), jVar.f27628c);
            }
            if (o10 < Math.max(j11, 500000)) {
                boolean z12 = !z11;
                jVar.f27634i = z12;
                if (!z12 && o10 < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (o10 >= jVar.f27628c || z11) {
                jVar.f27634i = false;
            }
            z10 = jVar.f27634i;
        }
        this.K = z10;
        if (z10) {
            g0 g0Var2 = this.f27783z.f27622j;
            long j12 = this.S;
            v6.a.d(g0Var2.g());
            g0Var2.f27572a.f(j12 - g0Var2.f27586o);
        }
        k0();
    }

    public final void z() {
        d dVar = this.F;
        n0 n0Var = this.E;
        boolean z10 = dVar.f27792a | (dVar.f27793b != n0Var);
        dVar.f27792a = z10;
        dVar.f27793b = n0Var;
        if (z10) {
            w wVar = (w) ((r0.b) this.f27782y).f24479b;
            ((Handler) wVar.f27737e.f3445b).post(new c1.b(wVar, dVar));
            this.F = new d(this.E);
        }
    }
}
