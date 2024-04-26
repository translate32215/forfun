package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.appcompat.widget.d0;
import b6.e;
import c5.j;
import c5.l;
import com.google.android.exoplayer2.source.hls.b;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.r;
import d5.a0;
import d5.k;
import d5.x;
import d5.z;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import q5.a;
import u6.h;
import v6.e0;
import v6.s;
import x4.b0;
import z5.a0;
import z5.c0;
import z5.f0;
import z5.g0;
import z5.v;

/* compiled from: HlsSampleStreamWrapper */
public final class f implements n.b<e>, n.f, c0, k, a0.b {

    /* renamed from: l0  reason: collision with root package name */
    public static final Set<Integer> f5224l0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    public final Map<String, c5.f> A;
    public e B;
    public d[] C;
    public int[] D = new int[0];
    public Set<Integer> E;
    public SparseIntArray F;
    public d5.a0 G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public b0 M;
    public b0 N;
    public boolean O;
    public g0 P;
    public Set<f0> Q;
    public int[] R;
    public int S;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f5225a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean[] f5226a0;

    /* renamed from: b  reason: collision with root package name */
    public final b f5227b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean[] f5228b0;

    /* renamed from: c  reason: collision with root package name */
    public final b f5229c;

    /* renamed from: c0  reason: collision with root package name */
    public long f5230c0;

    /* renamed from: d  reason: collision with root package name */
    public final u6.f f5231d;

    /* renamed from: d0  reason: collision with root package name */
    public long f5232d0;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f5233e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f5234e0;

    /* renamed from: f  reason: collision with root package name */
    public final l f5235f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f5236f0;

    /* renamed from: g  reason: collision with root package name */
    public final j.a f5237g;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5238g0;

    /* renamed from: h  reason: collision with root package name */
    public final h f5239h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5240h0;

    /* renamed from: i  reason: collision with root package name */
    public final n f5241i = new n("Loader:HlsSampleStreamWrapper");

    /* renamed from: i0  reason: collision with root package name */
    public long f5242i0;

    /* renamed from: j0  reason: collision with root package name */
    public c5.f f5243j0;

    /* renamed from: k0  reason: collision with root package name */
    public c f5244k0;

    /* renamed from: r  reason: collision with root package name */
    public final v.a f5245r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5246s;

    /* renamed from: t  reason: collision with root package name */
    public final b.C0077b f5247t = new b.C0077b();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<c> f5248u;

    /* renamed from: v  reason: collision with root package name */
    public final List<c> f5249v;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f5250w;

    /* renamed from: x  reason: collision with root package name */
    public final Runnable f5251x;

    /* renamed from: y  reason: collision with root package name */
    public final Handler f5252y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<e> f5253z;

    /* compiled from: HlsSampleStreamWrapper */
    public interface b extends c0.a<f> {
    }

    /* compiled from: HlsSampleStreamWrapper */
    public static class c implements d5.a0 {

        /* renamed from: g  reason: collision with root package name */
        public static final b0 f5254g;

        /* renamed from: h  reason: collision with root package name */
        public static final b0 f5255h;

        /* renamed from: a  reason: collision with root package name */
        public final s5.b f5256a = new s5.b();

        /* renamed from: b  reason: collision with root package name */
        public final d5.a0 f5257b;

        /* renamed from: c  reason: collision with root package name */
        public final b0 f5258c;

        /* renamed from: d  reason: collision with root package name */
        public b0 f5259d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f5260e;

        /* renamed from: f  reason: collision with root package name */
        public int f5261f;

        static {
            b0.b bVar = new b0.b();
            bVar.f27425k = "application/id3";
            f5254g = bVar.a();
            b0.b bVar2 = new b0.b();
            bVar2.f27425k = "application/x-emsg";
            f5255h = bVar2.a();
        }

        public c(d5.a0 a0Var, int i10) {
            this.f5257b = a0Var;
            if (i10 == 1) {
                this.f5258c = f5254g;
            } else if (i10 == 3) {
                this.f5258c = f5255h;
            } else {
                throw new IllegalArgumentException(d0.a("Unknown metadataType: ", i10));
            }
            this.f5260e = new byte[0];
            this.f5261f = 0;
        }

        public int a(com.google.android.exoplayer2.upstream.c cVar, int i10, boolean z10, int i11) throws IOException {
            int i12 = this.f5261f + i10;
            byte[] bArr = this.f5260e;
            if (bArr.length < i12) {
                this.f5260e = Arrays.copyOf(bArr, (i12 / 2) + i12);
            }
            int a10 = cVar.a(this.f5260e, this.f5261f, i10);
            if (a10 != -1) {
                this.f5261f += a10;
                return a10;
            } else if (z10) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        public /* synthetic */ void b(v6.v vVar, int i10) {
            z.b(this, vVar, i10);
        }

        public void c(b0 b0Var) {
            this.f5259d = b0Var;
            this.f5257b.c(this.f5258c);
        }

        public void d(long j10, int i10, int i11, int i12, a0.a aVar) {
            this.f5259d.getClass();
            int i13 = this.f5261f - i12;
            v6.v vVar = new v6.v(Arrays.copyOfRange(this.f5260e, i13 - i11, i13));
            byte[] bArr = this.f5260e;
            System.arraycopy(bArr, i13, bArr, 0, i12);
            this.f5261f = i12;
            if (!e0.a(this.f5259d.f27408t, this.f5258c.f27408t)) {
                if ("application/x-emsg".equals(this.f5259d.f27408t)) {
                    s5.a c10 = this.f5256a.c(vVar);
                    b0 F = c10.F();
                    if (!(F != null && e0.a(this.f5258c.f27408t, F.f27408t))) {
                        Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f5258c.f27408t, c10.F()}));
                        return;
                    }
                    byte[] bArr2 = c10.F() != null ? c10.f24961e : null;
                    bArr2.getClass();
                    vVar = new v6.v(bArr2);
                } else {
                    StringBuilder a10 = android.support.v4.media.a.a("Ignoring sample for unsupported format: ");
                    a10.append(this.f5259d.f27408t);
                    Log.w("EmsgUnwrappingTrackOutput", a10.toString());
                    return;
                }
            }
            int a11 = vVar.a();
            this.f5257b.b(vVar, a11);
            this.f5257b.d(j10, i10, a11, i12, aVar);
        }

        public void e(v6.v vVar, int i10, int i11) {
            int i12 = this.f5261f + i10;
            byte[] bArr = this.f5260e;
            if (bArr.length < i12) {
                this.f5260e = Arrays.copyOf(bArr, (i12 / 2) + i12);
            }
            vVar.e(this.f5260e, this.f5261f, i10);
            this.f5261f += i10;
        }

        public /* synthetic */ int f(com.google.android.exoplayer2.upstream.c cVar, int i10, boolean z10) {
            return z.a(this, cVar, i10, z10);
        }
    }

    /* compiled from: HlsSampleStreamWrapper */
    public static final class d extends z5.a0 {
        public final Map<String, c5.f> J;
        public c5.f K;

        public d(u6.f fVar, Looper looper, l lVar, j.a aVar, Map map, a aVar2) {
            super(fVar, looper, lVar, aVar);
            this.J = map;
        }

        public void d(long j10, int i10, int i11, int i12, a0.a aVar) {
            super.d(j10, i10, i11, i12, aVar);
        }

        public b0 m(b0 b0Var) {
            c5.f fVar;
            c5.f fVar2 = this.K;
            if (fVar2 == null) {
                fVar2 = b0Var.f27411w;
            }
            if (!(fVar2 == null || (fVar = this.J.get(fVar2.f4317c)) == null)) {
                fVar2 = fVar;
            }
            q5.a aVar = b0Var.f27406r;
            if (aVar != null) {
                int length = aVar.f24150a.length;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    }
                    a.b bVar = aVar.f24150a[i11];
                    if ((bVar instanceof v5.k) && "com.apple.streaming.transportStreamTimestamp".equals(((v5.k) bVar).f26414b)) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1) {
                    if (length != 1) {
                        a.b[] bVarArr = new a.b[(length - 1)];
                        while (i10 < length) {
                            if (i10 != i11) {
                                bVarArr[i10 < i11 ? i10 : i10 - 1] = aVar.f24150a[i10];
                            }
                            i10++;
                        }
                        aVar = new q5.a(bVarArr);
                    }
                }
                if (!(fVar2 == b0Var.f27411w && aVar == b0Var.f27406r)) {
                    b0.b a10 = b0Var.a();
                    a10.f27428n = fVar2;
                    a10.f27423i = aVar;
                    b0Var = a10.a();
                }
                return super.m(b0Var);
            }
            aVar = null;
            b0.b a102 = b0Var.a();
            a102.f27428n = fVar2;
            a102.f27423i = aVar;
            b0Var = a102.a();
            return super.m(b0Var);
        }
    }

    public f(int i10, b bVar, b bVar2, Map<String, c5.f> map, u6.f fVar, long j10, b0 b0Var, l lVar, j.a aVar, h hVar, v.a aVar2, int i11) {
        this.f5225a = i10;
        this.f5227b = bVar;
        this.f5229c = bVar2;
        this.A = map;
        this.f5231d = fVar;
        this.f5233e = b0Var;
        this.f5235f = lVar;
        this.f5237g = aVar;
        this.f5239h = hVar;
        this.f5245r = aVar2;
        this.f5246s = i11;
        Set<Integer> set = f5224l0;
        this.E = new HashSet(set.size());
        this.F = new SparseIntArray(set.size());
        this.C = new d[0];
        this.f5228b0 = new boolean[0];
        this.f5226a0 = new boolean[0];
        ArrayList<c> arrayList = new ArrayList<>();
        this.f5248u = arrayList;
        this.f5249v = Collections.unmodifiableList(arrayList);
        this.f5253z = new ArrayList<>();
        this.f5250w = new androidx.activity.f(this);
        this.f5251x = new androidx.activity.c(this);
        this.f5252y = e0.l();
        this.f5230c0 = j10;
        this.f5232d0 = j10;
    }

    public static d5.h q(int i10, int i11) {
        Log.w("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new d5.h();
    }

    public static b0 t(b0 b0Var, b0 b0Var2, boolean z10) {
        String str;
        String str2;
        if (b0Var == null) {
            return b0Var2;
        }
        int i10 = s.i(b0Var2.f27408t);
        if (e0.r(b0Var.f27405i, i10) == 1) {
            str2 = e0.s(b0Var.f27405i, i10);
            str = s.e(str2);
        } else {
            str2 = s.c(b0Var.f27405i, b0Var2.f27408t);
            str = b0Var2.f27408t;
        }
        b0.b a10 = b0Var2.a();
        a10.f27415a = b0Var.f27397a;
        a10.f27416b = b0Var.f27398b;
        a10.f27417c = b0Var.f27399c;
        a10.f27418d = b0Var.f27400d;
        a10.f27419e = b0Var.f27401e;
        a10.f27420f = z10 ? b0Var.f27402f : -1;
        a10.f27421g = z10 ? b0Var.f27403g : -1;
        a10.f27422h = str2;
        a10.f27430p = b0Var.f27413y;
        a10.f27431q = b0Var.f27414z;
        if (str != null) {
            a10.f27425k = str;
        }
        int i11 = b0Var.G;
        if (i11 != -1) {
            a10.f27438x = i11;
        }
        q5.a aVar = b0Var.f27406r;
        if (aVar != null) {
            q5.a aVar2 = b0Var2.f27406r;
            if (aVar2 != null) {
                aVar = aVar2.b(aVar);
            }
            a10.f27423i = aVar;
        }
        return a10.a();
    }

    public static int x(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void B() {
        if (!this.O && this.R == null && this.J) {
            d[] dVarArr = this.C;
            int length = dVarArr.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                if (dVarArr[i10].s() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            g0 g0Var = this.P;
            if (g0Var != null) {
                int i11 = g0Var.f28589a;
                int[] iArr = new int[i11];
                this.R = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        d[] dVarArr2 = this.C;
                        if (i13 >= dVarArr2.length) {
                            break;
                        }
                        b0 s10 = dVarArr2[i13].s();
                        v6.a.f(s10);
                        b0 b0Var = this.P.f28590b[i12].f28584b[0];
                        String str = s10.f27408t;
                        String str2 = b0Var.f27408t;
                        int i14 = s.i(str);
                        if (i14 == 3 ? e0.a(str, str2) && ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || s10.L == b0Var.L) : i14 == s.i(str2)) {
                            this.R[i12] = i13;
                            break;
                        }
                        i13++;
                    }
                }
                Iterator<e> it = this.f5253z.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                return;
            }
            int length2 = this.C.length;
            int i15 = 0;
            int i16 = 7;
            int i17 = -1;
            while (true) {
                int i18 = 2;
                if (i15 >= length2) {
                    break;
                }
                b0 s11 = this.C[i15].s();
                v6.a.f(s11);
                String str3 = s11.f27408t;
                if (!s.m(str3)) {
                    if (s.k(str3)) {
                        i18 = 1;
                    } else {
                        i18 = s.l(str3) ? 3 : 7;
                    }
                }
                if (x(i18) > x(i16)) {
                    i17 = i15;
                    i16 = i18;
                } else if (i18 == i16 && i17 != -1) {
                    i17 = -1;
                }
                i15++;
            }
            f0 f0Var = this.f5229c.f5166h;
            int i19 = f0Var.f28583a;
            this.S = -1;
            this.R = new int[length2];
            for (int i20 = 0; i20 < length2; i20++) {
                this.R[i20] = i20;
            }
            f0[] f0VarArr = new f0[length2];
            for (int i21 = 0; i21 < length2; i21++) {
                b0 s12 = this.C[i21].s();
                v6.a.f(s12);
                if (i21 == i17) {
                    b0[] b0VarArr = new b0[i19];
                    if (i19 == 1) {
                        b0VarArr[0] = s12.g(f0Var.f28584b[0]);
                    } else {
                        for (int i22 = 0; i22 < i19; i22++) {
                            b0VarArr[i22] = t(f0Var.f28584b[i22], s12, true);
                        }
                    }
                    f0VarArr[i21] = new f0(b0VarArr);
                    this.S = i21;
                } else {
                    f0VarArr[i21] = new f0(t((i16 != 2 || !s.k(s12.f27408t)) ? null : this.f5233e, s12, false));
                }
            }
            this.P = s(f0VarArr);
            if (this.Q == null) {
                z10 = true;
            }
            v6.a.d(z10);
            this.Q = Collections.emptySet();
            this.K = true;
            ((d) this.f5227b).n();
        }
    }

    public void C() throws IOException {
        this.f5241i.f(Integer.MIN_VALUE);
        b bVar = this.f5229c;
        IOException iOException = bVar.f5171m;
        if (iOException == null) {
            Uri uri = bVar.f5172n;
            if (uri != null && bVar.f5176r) {
                bVar.f5165g.f(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void F(f0[] f0VarArr, int i10, int... iArr) {
        this.P = s(f0VarArr);
        this.Q = new HashSet();
        for (int i11 : iArr) {
            this.Q.add(this.P.f28590b[i11]);
        }
        this.S = i10;
        Handler handler = this.f5252y;
        b bVar = this.f5227b;
        bVar.getClass();
        handler.post(new androidx.activity.f(bVar));
        this.K = true;
    }

    public final void G() {
        for (d D2 : this.C) {
            D2.D(this.f5234e0);
        }
        this.f5234e0 = false;
    }

    public boolean H(long j10, boolean z10) {
        boolean z11;
        this.f5230c0 = j10;
        if (z()) {
            this.f5232d0 = j10;
            return true;
        }
        if (this.J && !z10) {
            int length = this.C.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z11 = true;
                    break;
                } else if (this.C[i10].F(j10, false) || (!this.f5228b0[i10] && this.Z)) {
                    i10++;
                }
            }
            z11 = false;
            if (z11) {
                return false;
            }
        }
        this.f5232d0 = j10;
        this.f5238g0 = false;
        this.f5248u.clear();
        if (this.f5241i.e()) {
            if (this.J) {
                for (d i11 : this.C) {
                    i11.i();
                }
            }
            this.f5241i.a();
        } else {
            this.f5241i.f5533c = null;
            G();
        }
        return true;
    }

    public void I(long j10) {
        if (this.f5242i0 != j10) {
            this.f5242i0 = j10;
            for (d dVar : this.C) {
                if (dVar.H != j10) {
                    dVar.H = j10;
                    dVar.A = true;
                }
            }
        }
    }

    public long a() {
        if (z()) {
            return this.f5232d0;
        }
        if (this.f5238g0) {
            return Long.MIN_VALUE;
        }
        return w().f3596h;
    }

    public void b(x xVar) {
    }

    public void d() {
        this.f5240h0 = true;
        this.f5252y.post(this.f5251x);
    }

    public long e() {
        if (this.f5238g0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.f5232d0;
        }
        long j10 = this.f5230c0;
        c w10 = w();
        if (!w10.H) {
            if (this.f5248u.size() > 1) {
                ArrayList<c> arrayList = this.f5248u;
                w10 = arrayList.get(arrayList.size() - 2);
            } else {
                w10 = null;
            }
        }
        if (w10 != null) {
            j10 = Math.max(j10, w10.f3596h);
        }
        if (this.J) {
            for (d n10 : this.C) {
                j10 = Math.max(j10, n10.n());
            }
        }
        return j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0280  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(long r60) {
        /*
            r59 = this;
            r0 = r59
            boolean r1 = r0.f5238g0
            if (r1 != 0) goto L_0x0539
            com.google.android.exoplayer2.upstream.n r1 = r0.f5241i
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x0539
            com.google.android.exoplayer2.upstream.n r1 = r0.f5241i
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0018
            goto L_0x0539
        L_0x0018:
            boolean r1 = r59.z()
            if (r1 == 0) goto L_0x0033
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.f5232d0
            com.google.android.exoplayer2.source.hls.f$d[] r4 = r0.C
            int r5 = r4.length
            r6 = 0
        L_0x0028:
            if (r6 >= r5) goto L_0x0048
            r7 = r4[r6]
            long r8 = r0.f5232d0
            r7.f28535u = r8
            int r6 = r6 + 1
            goto L_0x0028
        L_0x0033:
            java.util.List<com.google.android.exoplayer2.source.hls.c> r1 = r0.f5249v
            com.google.android.exoplayer2.source.hls.c r2 = r59.w()
            boolean r3 = r2.H
            if (r3 == 0) goto L_0x0040
            long r2 = r2.f3596h
            goto L_0x0048
        L_0x0040:
            long r3 = r0.f5230c0
            long r5 = r2.f3595g
            long r2 = java.lang.Math.max(r3, r5)
        L_0x0048:
            r8 = r1
            r14 = r2
            com.google.android.exoplayer2.source.hls.b r13 = r0.f5229c
            boolean r1 = r0.K
            if (r1 != 0) goto L_0x005a
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            r19 = 0
            goto L_0x005c
        L_0x005a:
            r19 = 1
        L_0x005c:
            com.google.android.exoplayer2.source.hls.b$b r11 = r0.f5247t
            r13.getClass()
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0069
            r6 = 0
            goto L_0x0070
        L_0x0069:
            java.lang.Object r1 = ba.y.b(r8)
            com.google.android.exoplayer2.source.hls.c r1 = (com.google.android.exoplayer2.source.hls.c) r1
            r6 = r1
        L_0x0070:
            if (r6 != 0) goto L_0x0074
            r4 = -1
            goto L_0x007d
        L_0x0074:
            z5.f0 r1 = r13.f5166h
            x4.b0 r2 = r6.f3592d
            int r1 = r1.a(r2)
            r4 = r1
        L_0x007d:
            long r1 = r14 - r60
            long r9 = r13.f5175q
            r17 = r13
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x008e
            r3 = 1
            goto L_0x008f
        L_0x008e:
            r3 = 0
        L_0x008f:
            if (r3 == 0) goto L_0x0094
            long r9 = r9 - r60
            goto L_0x0095
        L_0x0094:
            r9 = r12
        L_0x0095:
            if (r6 == 0) goto L_0x00c0
            r5 = r17
            boolean r3 = r5.f5173o
            if (r3 != 0) goto L_0x00bb
            r17 = r8
            long r7 = r6.f3596h
            long r12 = r6.f3595g
            long r7 = r7 - r12
            long r1 = r1 - r7
            r12 = 0
            long r1 = java.lang.Math.max(r12, r1)
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r3 == 0) goto L_0x00c6
            long r9 = r9 - r7
            long r7 = java.lang.Math.max(r12, r9)
            r9 = r7
            goto L_0x00c6
        L_0x00bb:
            r17 = r8
            r22 = r12
            goto L_0x00c6
        L_0x00c0:
            r22 = r12
            r5 = r17
            r17 = r8
        L_0x00c6:
            r7 = r1
            b6.n[] r12 = r5.a(r6, r14)
            r6.h r1 = r5.f5174p
            r2 = r60
            r13 = r4
            r24 = r14
            r14 = r5
            r4 = r7
            r15 = r6
            r8 = -1
            r6 = r9
            r10 = -1
            r8 = r17
            r9 = r12
            r1.h(r2, r4, r6, r8, r9)
            r6.h r1 = r14.f5174p
            int r4 = r1.i()
            if (r13 == r4) goto L_0x00e8
            r1 = 1
            goto L_0x00e9
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            android.net.Uri[] r2 = r14.f5163e
            r2 = r2[r4]
            f6.i r3 = r14.f5165g
            boolean r3 = r3.c(r2)
            if (r3 != 0) goto L_0x0106
            r11.f5180c = r2
            boolean r1 = r14.f5176r
            android.net.Uri r3 = r14.f5172n
            boolean r3 = r2.equals(r3)
            r1 = r1 & r3
            r14.f5176r = r1
            r14.f5172n = r2
            goto L_0x045f
        L_0x0106:
            f6.i r3 = r14.f5165g
            r5 = 1
            f6.e r3 = r3.i(r2, r5)
            r3.getClass()
            boolean r6 = r3.f18218c
            r14.f5173o = r6
            boolean r6 = r3.f18186m
            if (r6 == 0) goto L_0x011b
            r6 = r22
            goto L_0x0126
        L_0x011b:
            long r6 = r3.b()
            f6.i r8 = r14.f5165g
            long r8 = r8.l()
            long r6 = r6 - r8
        L_0x0126:
            r14.f5175q = r6
            long r6 = r3.f18179f
            f6.i r8 = r14.f5165g
            long r8 = r8.l()
            long r6 = r6 - r8
            r8 = r11
            r11 = r14
            r12 = r15
            r21 = r13
            r9 = r14
            r13 = r1
            r22 = r24
            r14 = r3
            r10 = r15
            r15 = r6
            r17 = r22
            android.util.Pair r11 = r11.c(r12, r13, r14, r15, r17)
            java.lang.Object r12 = r11.first
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            java.lang.Object r11 = r11.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            long r14 = r3.f18182i
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0191
            if (r10 == 0) goto L_0x0191
            if (r1 == 0) goto L_0x0191
            android.net.Uri[] r1 = r9.f5163e
            r2 = r1[r21]
            f6.i r1 = r9.f5165g
            f6.e r3 = r1.i(r2, r5)
            r3.getClass()
            long r6 = r3.f18179f
            f6.i r1 = r9.f5165g
            long r11 = r1.l()
            long r6 = r6 - r11
            r13 = 0
            r11 = r9
            r12 = r10
            r14 = r3
            r15 = r6
            r17 = r22
            android.util.Pair r1 = r11.c(r12, r13, r14, r15, r17)
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r12 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r21
            goto L_0x0192
        L_0x0191:
            r1 = r11
        L_0x0192:
            long r14 = r3.f18182i
            int r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r11 >= 0) goto L_0x01a1
            z5.b r1 = new z5.b
            r1.<init>()
            r9.f5171m = r1
            goto L_0x045f
        L_0x01a1:
            long r14 = r12 - r14
            int r11 = (int) r14
            java.util.List<f6.e$d> r14 = r3.f18189p
            int r14 = r14.size()
            if (r11 != r14) goto L_0x01c7
            r14 = -1
            if (r1 == r14) goto L_0x01b0
            goto L_0x01b1
        L_0x01b0:
            r1 = 0
        L_0x01b1:
            java.util.List<f6.e$b> r11 = r3.f18190q
            int r11 = r11.size()
            if (r1 >= r11) goto L_0x0224
            com.google.android.exoplayer2.source.hls.b$e r11 = new com.google.android.exoplayer2.source.hls.b$e
            java.util.List<f6.e$b> r14 = r3.f18190q
            java.lang.Object r14 = r14.get(r1)
            f6.e$e r14 = (f6.e.C0139e) r14
            r11.<init>(r14, r12, r1)
            goto L_0x01ed
        L_0x01c7:
            java.util.List<f6.e$d> r14 = r3.f18189p
            java.lang.Object r14 = r14.get(r11)
            f6.e$d r14 = (f6.e.d) r14
            r15 = -1
            if (r1 != r15) goto L_0x01d8
            com.google.android.exoplayer2.source.hls.b$e r1 = new com.google.android.exoplayer2.source.hls.b$e
            r1.<init>(r14, r12, r15)
            goto L_0x0225
        L_0x01d8:
            java.util.List<f6.e$b> r15 = r14.f18199u
            int r15 = r15.size()
            if (r1 >= r15) goto L_0x01ef
            com.google.android.exoplayer2.source.hls.b$e r11 = new com.google.android.exoplayer2.source.hls.b$e
            java.util.List<f6.e$b> r14 = r14.f18199u
            java.lang.Object r14 = r14.get(r1)
            f6.e$e r14 = (f6.e.C0139e) r14
            r11.<init>(r14, r12, r1)
        L_0x01ed:
            r1 = r11
            goto L_0x0225
        L_0x01ef:
            int r11 = r11 + r5
            java.util.List<f6.e$d> r1 = r3.f18189p
            int r1 = r1.size()
            if (r11 >= r1) goto L_0x020a
            com.google.android.exoplayer2.source.hls.b$e r1 = new com.google.android.exoplayer2.source.hls.b$e
            java.util.List<f6.e$d> r14 = r3.f18189p
            java.lang.Object r11 = r14.get(r11)
            f6.e$e r11 = (f6.e.C0139e) r11
            r14 = 1
            long r12 = r12 + r14
            r5 = -1
            r1.<init>(r11, r12, r5)
            goto L_0x0225
        L_0x020a:
            r14 = 1
            java.util.List<f6.e$b> r1 = r3.f18190q
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0224
            com.google.android.exoplayer2.source.hls.b$e r1 = new com.google.android.exoplayer2.source.hls.b$e
            java.util.List<f6.e$b> r5 = r3.f18190q
            r11 = 0
            java.lang.Object r5 = r5.get(r11)
            f6.e$e r5 = (f6.e.C0139e) r5
            long r12 = r12 + r14
            r1.<init>(r5, r12, r11)
            goto L_0x0225
        L_0x0224:
            r1 = 0
        L_0x0225:
            if (r1 != 0) goto L_0x0268
            boolean r1 = r3.f18186m
            if (r1 != 0) goto L_0x023c
            r8.f5180c = r2
            boolean r1 = r9.f5176r
            android.net.Uri r3 = r9.f5172n
            boolean r3 = r2.equals(r3)
            r1 = r1 & r3
            r9.f5176r = r1
            r9.f5172n = r2
            goto L_0x045f
        L_0x023c:
            if (r19 != 0) goto L_0x0263
            java.util.List<f6.e$d> r1 = r3.f18189p
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0247
            goto L_0x0263
        L_0x0247:
            com.google.android.exoplayer2.source.hls.b$e r1 = new com.google.android.exoplayer2.source.hls.b$e
            java.util.List<f6.e$d> r5 = r3.f18189p
            java.lang.Object r5 = ba.y.b(r5)
            f6.e$e r5 = (f6.e.C0139e) r5
            long r11 = r3.f18182i
            java.util.List<f6.e$d> r13 = r3.f18189p
            int r13 = r13.size()
            long r13 = (long) r13
            long r11 = r11 + r13
            r13 = 1
            long r11 = r11 - r13
            r13 = -1
            r1.<init>(r5, r11, r13)
            goto L_0x0268
        L_0x0263:
            r1 = 1
            r8.f5179b = r1
            goto L_0x045f
        L_0x0268:
            r5 = 0
            r9.f5176r = r5
            r5 = 0
            r9.f5172n = r5
            f6.e$e r11 = r1.f5183a
            f6.e$d r11 = r11.f18201b
            if (r11 == 0) goto L_0x0280
            java.lang.String r11 = r11.f18206g
            if (r11 != 0) goto L_0x0279
            goto L_0x0280
        L_0x0279:
            java.lang.String r12 = r3.f18216a
            android.net.Uri r11 = v6.c0.d(r12, r11)
            goto L_0x0281
        L_0x0280:
            r11 = r5
        L_0x0281:
            b6.e r12 = r9.d(r11, r4)
            r8.f5178a = r12
            if (r12 == 0) goto L_0x028b
            goto L_0x045f
        L_0x028b:
            f6.e$e r12 = r1.f5183a
            if (r12 == 0) goto L_0x029b
            java.lang.String r12 = r12.f18206g
            if (r12 != 0) goto L_0x0294
            goto L_0x029b
        L_0x0294:
            java.lang.String r13 = r3.f18216a
            android.net.Uri r12 = v6.c0.d(r13, r12)
            goto L_0x029c
        L_0x029b:
            r12 = r5
        L_0x029c:
            b6.e r13 = r9.d(r12, r4)
            r8.f5178a = r13
            if (r13 == 0) goto L_0x02a6
            goto L_0x045f
        L_0x02a6:
            e6.f r13 = r9.f5159a
            com.google.android.exoplayer2.upstream.e r14 = r9.f5160b
            x4.b0[] r15 = r9.f5164f
            r33 = r15[r4]
            java.util.List<x4.b0> r4 = r9.f5167i
            r6.h r15 = r9.f5174p
            int r40 = r15.l()
            r6.h r15 = r9.f5174p
            java.lang.Object r41 = r15.p()
            boolean r15 = r9.f5169k
            b2.t r5 = r9.f5162d
            e6.d r0 = r9.f5168j
            r0.getClass()
            if (r12 != 0) goto L_0x02c9
            r0 = 0
            goto L_0x02d1
        L_0x02c9:
            java.util.LinkedHashMap<android.net.Uri, byte[]> r0 = r0.f13616a
            java.lang.Object r0 = r0.get(r12)
            byte[] r0 = (byte[]) r0
        L_0x02d1:
            e6.d r9 = r9.f5168j
            r9.getClass()
            if (r11 != 0) goto L_0x02da
            r9 = 0
            goto L_0x02e2
        L_0x02da:
            java.util.LinkedHashMap<android.net.Uri, byte[]> r9 = r9.f13616a
            java.lang.Object r9 = r9.get(r11)
            byte[] r9 = (byte[]) r9
        L_0x02e2:
            java.util.concurrent.atomic.AtomicInteger r11 = com.google.android.exoplayer2.source.hls.c.L
            f6.e$e r11 = r1.f5183a
            r46 = 1
            java.util.Map r48 = java.util.Collections.emptyMap()
            java.lang.String r12 = r3.f18216a
            r16 = r8
            java.lang.String r8 = r11.f18200a
            android.net.Uri r8 = v6.c0.d(r12, r8)
            r17 = r13
            long r12 = r11.f18208i
            r19 = r4
            r21 = r5
            long r4 = r11.f18209r
            r22 = r15
            boolean r15 = r1.f5186d
            if (r15 == 0) goto L_0x030b
            r15 = 8
            r54 = 8
            goto L_0x030d
        L_0x030b:
            r54 = 0
        L_0x030d:
            java.lang.String r15 = "The uri must be set."
            v6.a.g(r8, r15)
            u6.e r32 = new u6.e
            r44 = 0
            r47 = 0
            r53 = 0
            r55 = 0
            r42 = r32
            r43 = r8
            r49 = r12
            r51 = r4
            r42.<init>(r43, r44, r46, r47, r48, r49, r51, r53, r54, r55)
            if (r0 == 0) goto L_0x032c
            r34 = 1
            goto L_0x032e
        L_0x032c:
            r34 = 0
        L_0x032e:
            if (r34 == 0) goto L_0x033a
            java.lang.String r4 = r11.f18207h
            r4.getClass()
            byte[] r4 = com.google.android.exoplayer2.source.hls.c.f(r4)
            goto L_0x033b
        L_0x033a:
            r4 = 0
        L_0x033b:
            if (r0 == 0) goto L_0x0348
            r4.getClass()
            com.google.android.exoplayer2.source.hls.a r5 = new com.google.android.exoplayer2.source.hls.a
            r5.<init>(r14, r0, r4)
            r31 = r5
            goto L_0x034a
        L_0x0348:
            r31 = r14
        L_0x034a:
            f6.e$d r0 = r11.f18201b
            if (r0 == 0) goto L_0x038e
            if (r9 == 0) goto L_0x0352
            r12 = 1
            goto L_0x0353
        L_0x0352:
            r12 = 0
        L_0x0353:
            if (r12 == 0) goto L_0x035f
            java.lang.String r4 = r0.f18207h
            r4.getClass()
            byte[] r4 = com.google.android.exoplayer2.source.hls.c.f(r4)
            goto L_0x0360
        L_0x035f:
            r4 = 0
        L_0x0360:
            java.lang.String r5 = r3.f18216a
            java.lang.String r8 = r0.f18200a
            android.net.Uri r43 = v6.c0.d(r5, r8)
            u6.e r5 = new u6.e
            r60 = r12
            long r12 = r0.f18208i
            r8 = r1
            long r0 = r0.f18209r
            r42 = r5
            r44 = r12
            r46 = r0
            r42.<init>(r43, r44, r46)
            if (r9 == 0) goto L_0x0386
            r4.getClass()
            com.google.android.exoplayer2.source.hls.a r0 = new com.google.android.exoplayer2.source.hls.a
            r0.<init>(r14, r9, r4)
            r9 = r0
            goto L_0x0387
        L_0x0386:
            r9 = r14
        L_0x0387:
            r37 = r60
            r36 = r5
            r35 = r9
            goto L_0x0395
        L_0x038e:
            r8 = r1
            r35 = 0
            r36 = 0
            r37 = 0
        L_0x0395:
            long r0 = r11.f18204e
            long r42 = r6 + r0
            long r0 = r11.f18202c
            long r44 = r42 + r0
            int r0 = r3.f18181h
            int r1 = r11.f18203d
            int r0 = r0 + r1
            if (r10 == 0) goto L_0x03fe
            android.net.Uri r1 = r10.f5189m
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03b2
            boolean r1 = r10.H
            if (r1 == 0) goto L_0x03b2
            r12 = 1
            goto L_0x03b3
        L_0x03b2:
            r12 = 0
        L_0x03b3:
            v5.g r1 = r10.f5201y
            v6.v r4 = r10.f5202z
            f6.e$e r5 = r8.f5183a
            boolean r6 = r5 instanceof f6.e.b
            if (r6 == 0) goto L_0x03d0
            f6.e$b r5 = (f6.e.b) r5
            boolean r5 = r5.f18194t
            if (r5 != 0) goto L_0x03ce
            int r5 = r8.f5185c
            if (r5 != 0) goto L_0x03cc
            boolean r3 = r3.f18218c
            if (r3 == 0) goto L_0x03cc
            goto L_0x03ce
        L_0x03cc:
            r3 = 0
            goto L_0x03d2
        L_0x03ce:
            r3 = 1
            goto L_0x03d2
        L_0x03d0:
            boolean r3 = r3.f18218c
        L_0x03d2:
            if (r12 != 0) goto L_0x03e1
            if (r3 == 0) goto L_0x03dd
            long r5 = r10.f3596h
            int r3 = (r42 > r5 ? 1 : (r42 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x03dd
            goto L_0x03e1
        L_0x03dd:
            r3 = 1
            r18 = 0
            goto L_0x03e4
        L_0x03e1:
            r3 = 1
            r18 = 1
        L_0x03e4:
            r5 = r18 ^ 1
            if (r12 == 0) goto L_0x03f4
            boolean r3 = r10.J
            if (r3 != 0) goto L_0x03f4
            int r3 = r10.f5188l
            if (r3 != r0) goto L_0x03f4
            e6.g r3 = r10.C
            r9 = r3
            goto L_0x03f5
        L_0x03f4:
            r9 = 0
        L_0x03f5:
            r56 = r1
            r57 = r4
            r58 = r5
            r55 = r9
            goto L_0x0412
        L_0x03fe:
            v5.g r1 = new v5.g
            r1.<init>()
            v6.v r3 = new v6.v
            r4 = 10
            r3.<init>((int) r4)
            r56 = r1
            r57 = r3
            r55 = 0
            r58 = 0
        L_0x0412:
            com.google.android.exoplayer2.source.hls.c r1 = new com.google.android.exoplayer2.source.hls.c
            long r3 = r8.f5184b
            int r5 = r8.f5185c
            boolean r6 = r8.f5186d
            r7 = 1
            r49 = r6 ^ 1
            boolean r6 = r11.f18210s
            r7 = r21
            java.lang.Object r8 = r7.f3445b
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            java.lang.Object r8 = r8.get(r0)
            v6.b0 r8 = (v6.b0) r8
            if (r8 != 0) goto L_0x043e
            v6.b0 r8 = new v6.b0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.<init>(r9)
            java.lang.Object r7 = r7.f3445b
            android.util.SparseArray r7 = (android.util.SparseArray) r7
            r7.put(r0, r8)
        L_0x043e:
            r53 = r8
            c5.f r7 = r11.f18205f
            r54 = r7
            r29 = r1
            r30 = r17
            r38 = r2
            r39 = r19
            r46 = r3
            r48 = r5
            r50 = r0
            r51 = r6
            r52 = r22
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r0 = r16
            r0.f5178a = r1
            r0 = r59
        L_0x045f:
            com.google.android.exoplayer2.source.hls.b$b r1 = r0.f5247t
            boolean r2 = r1.f5179b
            b6.e r3 = r1.f5178a
            android.net.Uri r4 = r1.f5180c
            r5 = 0
            r1.f5178a = r5
            r6 = 0
            r1.f5179b = r6
            r1.f5180c = r5
            if (r2 == 0) goto L_0x047c
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f5232d0 = r1
            r1 = 1
            r0.f5238g0 = r1
            return r1
        L_0x047c:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x0490
            if (r4 == 0) goto L_0x048e
            com.google.android.exoplayer2.source.hls.f$b r1 = r0.f5227b
            com.google.android.exoplayer2.source.hls.d r1 = (com.google.android.exoplayer2.source.hls.d) r1
            f6.i r1 = r1.f5204b
            r1.h(r4)
        L_0x048e:
            r1 = 0
            return r1
        L_0x0490:
            boolean r4 = r3 instanceof com.google.android.exoplayer2.source.hls.c
            if (r4 == 0) goto L_0x04f7
            r4 = r3
            com.google.android.exoplayer2.source.hls.c r4 = (com.google.android.exoplayer2.source.hls.c) r4
            r0.f5244k0 = r4
            x4.b0 r5 = r4.f3592d
            r0.M = r5
            r0.f5232d0 = r1
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r1 = r0.f5248u
            r1.add(r4)
            ba.a<java.lang.Object> r1 = ba.s.f3795b
            r1 = 4
            java.lang.String r2 = "initialCapacity"
            ba.h.b(r1, r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.exoplayer2.source.hls.f$d[] r2 = r0.C
            int r5 = r2.length
            r6 = 0
            r11 = 0
        L_0x04b3:
            if (r11 >= r5) goto L_0x04d6
            r7 = r2[r11]
            int r7 = r7.t()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r7.getClass()
            int r8 = r6 + 1
            int r9 = r1.length
            if (r9 >= r8) goto L_0x04d0
            int r9 = r1.length
            int r9 = ba.q.b.a(r9, r8)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r9)
        L_0x04d0:
            r1[r6] = r7
            int r11 = r11 + 1
            r6 = r8
            goto L_0x04b3
        L_0x04d6:
            ba.s r1 = ba.s.x(r1, r6)
            r4.D = r0
            r4.I = r1
            com.google.android.exoplayer2.source.hls.f$d[] r1 = r0.C
            int r2 = r1.length
            r10 = 0
        L_0x04e2:
            if (r10 >= r2) goto L_0x04f7
            r5 = r1[r10]
            r5.getClass()
            int r6 = r4.f5187k
            r5.E = r6
            boolean r6 = r4.f5190n
            if (r6 == 0) goto L_0x04f4
            r6 = 1
            r5.I = r6
        L_0x04f4:
            int r10 = r10 + 1
            goto L_0x04e2
        L_0x04f7:
            r0.B = r3
            com.google.android.exoplayer2.upstream.n r1 = r0.f5241i
            u6.h r2 = r0.f5239h
            int r4 = r3.f3591c
            com.google.android.exoplayer2.upstream.k r2 = (com.google.android.exoplayer2.upstream.k) r2
            int r2 = r2.a(r4)
            long r8 = r1.h(r3, r0, r2)
            z5.v$a r1 = r0.f5245r
            z5.k r20 = new z5.k
            long r5 = r3.f3589a
            u6.e r7 = r3.f3590b
            r4 = r20
            r4.<init>(r5, r7, r8)
            int r2 = r3.f3591c
            int r4 = r0.f5225a
            x4.b0 r5 = r3.f3592d
            int r6 = r3.f3593e
            java.lang.Object r7 = r3.f3594f
            long r8 = r3.f3595g
            long r10 = r3.f3596h
            r19 = r1
            r21 = r2
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19.n(r20, r21, r22, r23, r24, r25, r26, r28)
            r1 = 1
            return r1
        L_0x0539:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.f.f(long):boolean");
    }

    public void g(long j10) {
        int i10;
        boolean z10;
        if (!this.f5241i.d() && !z()) {
            if (this.f5241i.e()) {
                this.B.getClass();
                b bVar = this.f5229c;
                e eVar = this.B;
                List<c> list = this.f5249v;
                if (bVar.f5171m != null) {
                    z10 = false;
                } else {
                    z10 = bVar.f5174p.r(j10, eVar, list);
                }
                if (z10) {
                    this.f5241i.a();
                    return;
                }
                return;
            }
            int size = this.f5249v.size();
            while (size > 0 && this.f5229c.b(this.f5249v.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.f5249v.size()) {
                u(size);
            }
            b bVar2 = this.f5229c;
            List<c> list2 = this.f5249v;
            if (bVar2.f5171m != null || bVar2.f5174p.length() < 2) {
                i10 = list2.size();
            } else {
                i10 = bVar2.f5174p.g(j10, list2);
            }
            if (i10 < this.f5248u.size()) {
                u(i10);
            }
        }
    }

    public void h() {
        for (d C2 : this.C) {
            C2.C();
        }
    }

    public boolean j() {
        return this.f5241i.e();
    }

    public void k(n.e eVar, long j10, long j11, boolean z10) {
        e eVar2 = (e) eVar;
        this.B = null;
        long j12 = eVar2.f3589a;
        u6.e eVar3 = eVar2.f3590b;
        r rVar = eVar2.f3597i;
        z5.k kVar = new z5.k(j12, eVar3, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f5239h.getClass();
        this.f5245r.e(kVar, eVar2.f3591c, this.f5225a, eVar2.f3592d, eVar2.f3593e, eVar2.f3594f, eVar2.f3595g, eVar2.f3596h);
        if (!z10) {
            if (z() || this.L == 0) {
                G();
            }
            if (this.L > 0) {
                ((d) this.f5227b).d(this);
            }
        }
    }

    public d5.a0 l(int i10, int i11) {
        d5.a0 a0Var;
        Set<Integer> set = f5224l0;
        boolean z10 = false;
        d dVar = null;
        if (set.contains(Integer.valueOf(i11))) {
            v6.a.a(set.contains(Integer.valueOf(i11)));
            int i12 = this.F.get(i11, -1);
            if (i12 != -1) {
                if (this.E.add(Integer.valueOf(i11))) {
                    this.D[i12] = i10;
                }
                if (this.D[i12] == i10) {
                    a0Var = this.C[i12];
                } else {
                    a0Var = q(i10, i11);
                }
                dVar = a0Var;
            }
        } else {
            int i13 = 0;
            while (true) {
                d[] dVarArr = this.C;
                if (i13 >= dVarArr.length) {
                    break;
                } else if (this.D[i13] == i10) {
                    dVar = dVarArr[i13];
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (dVar == null) {
            if (this.f5240h0) {
                return q(i10, i11);
            }
            int length = this.C.length;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
            d dVar2 = new d(this.f5231d, this.f5252y.getLooper(), this.f5235f, this.f5237g, this.A, (a) null);
            dVar2.f28535u = this.f5230c0;
            if (z10) {
                dVar2.K = this.f5243j0;
                dVar2.A = true;
            }
            dVar2.G(this.f5242i0);
            c cVar = this.f5244k0;
            if (cVar != null) {
                dVar2.E = cVar.f5187k;
            }
            dVar2.f28520f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.D, i14);
            this.D = copyOf;
            copyOf[length] = i10;
            d[] dVarArr2 = this.C;
            int i15 = e0.f26436a;
            Object[] copyOf2 = Arrays.copyOf(dVarArr2, dVarArr2.length + 1);
            copyOf2[dVarArr2.length] = dVar2;
            this.C = (d[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f5228b0, i14);
            this.f5228b0 = copyOf3;
            copyOf3[length] = z10;
            this.Z = copyOf3[length] | this.Z;
            this.E.add(Integer.valueOf(i11));
            this.F.append(i11, length);
            if (x(i11) > x(this.H)) {
                this.I = length;
                this.H = i11;
            }
            this.f5226a0 = Arrays.copyOf(this.f5226a0, i14);
            dVar = dVar2;
        }
        if (i11 != 5) {
            return dVar;
        }
        if (this.G == null) {
            this.G = new c(dVar, this.f5246s);
        }
        return this.G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        r8 = ((com.google.android.exoplayer2.upstream.m.f) r12).f5524a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.upstream.n.c m(com.google.android.exoplayer2.upstream.n.e r26, long r27, long r29, java.io.IOException r31, int r32) {
        /*
            r25 = this;
            r0 = r25
            r12 = r31
            r1 = r26
            b6.e r1 = (b6.e) r1
            boolean r2 = r1 instanceof com.google.android.exoplayer2.source.hls.c
            r3 = 410(0x19a, float:5.75E-43)
            r4 = 404(0x194, float:5.66E-43)
            if (r2 == 0) goto L_0x0028
            r5 = r1
            com.google.android.exoplayer2.source.hls.c r5 = (com.google.android.exoplayer2.source.hls.c) r5
            boolean r5 = r5.K
            if (r5 != 0) goto L_0x0028
            boolean r5 = r12 instanceof com.google.android.exoplayer2.upstream.m.f
            if (r5 == 0) goto L_0x0028
            r5 = r12
            com.google.android.exoplayer2.upstream.m$f r5 = (com.google.android.exoplayer2.upstream.m.f) r5
            int r5 = r5.f5524a
            if (r5 == r3) goto L_0x0024
            if (r5 != r4) goto L_0x0028
        L_0x0024:
            com.google.android.exoplayer2.upstream.n$c r1 = com.google.android.exoplayer2.upstream.n.f5528d
            goto L_0x0142
        L_0x0028:
            com.google.android.exoplayer2.upstream.r r5 = r1.f3597i
            long r5 = r5.f5558b
            z5.k r7 = new z5.k
            long r14 = r1.f3589a
            u6.e r8 = r1.f3590b
            com.google.android.exoplayer2.upstream.r r9 = r1.f3597i
            android.net.Uri r10 = r9.f5559c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9 = r9.f5560d
            r13 = r7
            r16 = r8
            r17 = r10
            r18 = r9
            r19 = r27
            r21 = r29
            r23 = r5
            r13.<init>(r14, r16, r17, r18, r19, r21, r23)
            long r8 = r1.f3595g
            x4.f.c(r8)
            long r8 = r1.f3596h
            x4.f.c(r8)
            u6.h r8 = r0.f5239h
            com.google.android.exoplayer2.upstream.k r8 = (com.google.android.exoplayer2.upstream.k) r8
            boolean r8 = r12 instanceof com.google.android.exoplayer2.upstream.m.f
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x007c
            r8 = r12
            com.google.android.exoplayer2.upstream.m$f r8 = (com.google.android.exoplayer2.upstream.m.f) r8
            int r8 = r8.f5524a
            r11 = 403(0x193, float:5.65E-43)
            if (r8 == r11) goto L_0x0078
            if (r8 == r4) goto L_0x0078
            if (r8 == r3) goto L_0x0078
            r3 = 416(0x1a0, float:5.83E-43)
            if (r8 == r3) goto L_0x0078
            r3 = 500(0x1f4, float:7.0E-43)
            if (r8 == r3) goto L_0x0078
            r3 = 503(0x1f7, float:7.05E-43)
            if (r8 != r3) goto L_0x007c
        L_0x0078:
            r3 = 60000(0xea60, double:2.9644E-319)
            goto L_0x007d
        L_0x007c:
            r3 = r9
        L_0x007d:
            r8 = 0
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0098
            com.google.android.exoplayer2.source.hls.b r11 = r0.f5229c
            r6.h r13 = r11.f5174p
            z5.f0 r11 = r11.f5166h
            x4.b0 r14 = r1.f3592d
            int r11 = r11.a(r14)
            int r11 = r13.t(r11)
            boolean r3 = r13.a(r11, r3)
            r14 = r3
            goto L_0x009a
        L_0x0098:
            r3 = 0
            r14 = 0
        L_0x009a:
            r3 = 1
            if (r14 == 0) goto L_0x00d3
            if (r2 == 0) goto L_0x00cf
            r9 = 0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00cf
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r2 = r0.f5248u
            int r4 = r2.size()
            int r4 = r4 - r3
            java.lang.Object r2 = r2.remove(r4)
            com.google.android.exoplayer2.source.hls.c r2 = (com.google.android.exoplayer2.source.hls.c) r2
            if (r2 != r1) goto L_0x00b5
            r8 = 1
        L_0x00b5:
            v6.a.d(r8)
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r2 = r0.f5248u
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00c5
            long r2 = r0.f5230c0
            r0.f5232d0 = r2
            goto L_0x00cf
        L_0x00c5:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r2 = r0.f5248u
            java.lang.Object r2 = ba.y.b(r2)
            com.google.android.exoplayer2.source.hls.c r2 = (com.google.android.exoplayer2.source.hls.c) r2
            r2.J = r3
        L_0x00cf:
            com.google.android.exoplayer2.upstream.n$c r2 = com.google.android.exoplayer2.upstream.n.f5529e
        L_0x00d1:
            r15 = r2
            goto L_0x0102
        L_0x00d3:
            u6.h r2 = r0.f5239h
            com.google.android.exoplayer2.upstream.k r2 = (com.google.android.exoplayer2.upstream.k) r2
            boolean r2 = r12 instanceof x4.m0
            if (r2 != 0) goto L_0x00f5
            boolean r2 = r12 instanceof java.io.FileNotFoundException
            if (r2 != 0) goto L_0x00f5
            boolean r2 = r12 instanceof com.google.android.exoplayer2.upstream.m.b
            if (r2 != 0) goto L_0x00f5
            boolean r2 = r12 instanceof com.google.android.exoplayer2.upstream.n.h
            if (r2 == 0) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            r2 = -1
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 5000(0x1388, float:7.006E-42)
            r5 = r32
            int r2 = c5.c.a(r5, r2, r3, r4)
            long r2 = (long) r2
            goto L_0x00f6
        L_0x00f5:
            r2 = r9
        L_0x00f6:
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x00ff
            com.google.android.exoplayer2.upstream.n$c r2 = com.google.android.exoplayer2.upstream.n.c(r8, r2)
            goto L_0x00d1
        L_0x00ff:
            com.google.android.exoplayer2.upstream.n$c r2 = com.google.android.exoplayer2.upstream.n.f5530f
            goto L_0x00d1
        L_0x0102:
            boolean r2 = r15.a()
            r16 = r2 ^ 1
            z5.v$a r2 = r0.f5245r
            int r3 = r1.f3591c
            int r4 = r0.f5225a
            x4.b0 r5 = r1.f3592d
            int r6 = r1.f3593e
            java.lang.Object r8 = r1.f3594f
            long r9 = r1.f3595g
            long r11 = r1.f3596h
            r1 = r2
            r2 = r7
            r7 = r8
            r8 = r9
            r10 = r11
            r12 = r31
            r13 = r16
            r1.j(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r16 == 0) goto L_0x012e
            r1 = 0
            r0.B = r1
            u6.h r1 = r0.f5239h
            r1.getClass()
        L_0x012e:
            if (r14 == 0) goto L_0x0141
            boolean r1 = r0.K
            if (r1 != 0) goto L_0x013a
            long r1 = r0.f5230c0
            r0.f(r1)
            goto L_0x0141
        L_0x013a:
            com.google.android.exoplayer2.source.hls.f$b r1 = r0.f5227b
            com.google.android.exoplayer2.source.hls.d r1 = (com.google.android.exoplayer2.source.hls.d) r1
            r1.d(r0)
        L_0x0141:
            r1 = r15
        L_0x0142:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.f.m(com.google.android.exoplayer2.upstream.n$e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.n$c");
    }

    public void n(n.e eVar, long j10, long j11) {
        e eVar2 = (e) eVar;
        this.B = null;
        b bVar = this.f5229c;
        bVar.getClass();
        if (eVar2 instanceof b.a) {
            b.a aVar = (b.a) eVar2;
            bVar.f5170l = aVar.f3629j;
            e6.d dVar = bVar.f5168j;
            Uri uri = aVar.f3590b.f26048a;
            byte[] bArr = aVar.f5177l;
            bArr.getClass();
            LinkedHashMap<Uri, byte[]> linkedHashMap = dVar.f13616a;
            uri.getClass();
            byte[] bArr2 = (byte[]) linkedHashMap.put(uri, bArr);
        }
        long j12 = eVar2.f3589a;
        u6.e eVar3 = eVar2.f3590b;
        r rVar = eVar2.f3597i;
        z5.k kVar = new z5.k(j12, eVar3, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f5239h.getClass();
        this.f5245r.h(kVar, eVar2.f3591c, this.f5225a, eVar2.f3592d, eVar2.f3593e, eVar2.f3594f, eVar2.f3595g, eVar2.f3596h);
        if (!this.K) {
            f(this.f5230c0);
        } else {
            ((d) this.f5227b).d(this);
        }
    }

    public void o(b0 b0Var) {
        this.f5252y.post(this.f5250w);
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    public final void p() {
        v6.a.d(this.K);
        this.P.getClass();
        this.Q.getClass();
    }

    public final g0 s(f0[] f0VarArr) {
        for (int i10 = 0; i10 < f0VarArr.length; i10++) {
            f0 f0Var = f0VarArr[i10];
            b0[] b0VarArr = new b0[f0Var.f28583a];
            for (int i11 = 0; i11 < f0Var.f28583a; i11++) {
                b0 b0Var = f0Var.f28584b[i11];
                b0VarArr[i11] = b0Var.b(this.f5235f.c(b0Var));
            }
            f0VarArr[i10] = new f0(b0VarArr);
        }
        return new g0(f0VarArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(int r11) {
        /*
            r10 = this;
            com.google.android.exoplayer2.upstream.n r0 = r10.f5241i
            boolean r0 = r0.e()
            r1 = 1
            r0 = r0 ^ r1
            v6.a.d(r0)
        L_0x000b:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r0 = r10.f5248u
            int r0 = r0.size()
            r2 = -1
            r3 = 0
            if (r11 >= r0) goto L_0x0056
            r0 = r11
        L_0x0016:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r4 = r10.f5248u
            int r4 = r4.size()
            if (r0 >= r4) goto L_0x002e
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r4 = r10.f5248u
            java.lang.Object r4 = r4.get(r0)
            com.google.android.exoplayer2.source.hls.c r4 = (com.google.android.exoplayer2.source.hls.c) r4
            boolean r4 = r4.f5190n
            if (r4 == 0) goto L_0x002b
            goto L_0x004a
        L_0x002b:
            int r0 = r0 + 1
            goto L_0x0016
        L_0x002e:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r0 = r10.f5248u
            java.lang.Object r0 = r0.get(r11)
            com.google.android.exoplayer2.source.hls.c r0 = (com.google.android.exoplayer2.source.hls.c) r0
            r4 = 0
        L_0x0037:
            com.google.android.exoplayer2.source.hls.f$d[] r5 = r10.C
            int r5 = r5.length
            if (r4 >= r5) goto L_0x004f
            int r5 = r0.g(r4)
            com.google.android.exoplayer2.source.hls.f$d[] r6 = r10.C
            r6 = r6[r4]
            int r6 = r6.p()
            if (r6 <= r5) goto L_0x004c
        L_0x004a:
            r0 = 0
            goto L_0x0050
        L_0x004c:
            int r4 = r4 + 1
            goto L_0x0037
        L_0x004f:
            r0 = 1
        L_0x0050:
            if (r0 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            int r11 = r11 + 1
            goto L_0x000b
        L_0x0056:
            r11 = -1
        L_0x0057:
            if (r11 != r2) goto L_0x005a
            return
        L_0x005a:
            com.google.android.exoplayer2.source.hls.c r0 = r10.w()
            long r8 = r0.f3596h
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r0 = r10.f5248u
            java.lang.Object r0 = r0.get(r11)
            com.google.android.exoplayer2.source.hls.c r0 = (com.google.android.exoplayer2.source.hls.c) r0
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r2 = r10.f5248u
            int r4 = r2.size()
            v6.e0.O(r2, r11, r4)
            r11 = 0
        L_0x0072:
            com.google.android.exoplayer2.source.hls.f$d[] r2 = r10.C
            int r2 = r2.length
            if (r11 >= r2) goto L_0x0085
            int r2 = r0.g(r11)
            com.google.android.exoplayer2.source.hls.f$d[] r4 = r10.C
            r4 = r4[r11]
            r4.k(r2)
            int r11 = r11 + 1
            goto L_0x0072
        L_0x0085:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r11 = r10.f5248u
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0092
            long r1 = r10.f5230c0
            r10.f5232d0 = r1
            goto L_0x009c
        L_0x0092:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.c> r11 = r10.f5248u
            java.lang.Object r11 = ba.y.b(r11)
            com.google.android.exoplayer2.source.hls.c r11 = (com.google.android.exoplayer2.source.hls.c) r11
            r11.J = r1
        L_0x009c:
            r10.f5238g0 = r3
            z5.v$a r4 = r10.f5245r
            int r5 = r10.H
            long r6 = r0.f3595g
            r4.p(r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.f.u(int):void");
    }

    public final c w() {
        ArrayList<c> arrayList = this.f5248u;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean z() {
        return this.f5232d0 != -9223372036854775807L;
    }
}
