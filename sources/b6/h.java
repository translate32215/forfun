package b6;

import a5.f;
import android.os.Looper;
import b6.i;
import c5.j;
import c5.l;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.t;
import v6.e0;
import z5.a0;
import z5.b0;
import z5.c0;
import z5.k;
import z5.v;

/* compiled from: ChunkSampleStream */
public class h<T extends i> implements b0, c0, n.b<e>, n.f {
    public long A;
    public long B;
    public int C;
    public a D;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public final int f3600a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f3601b;

    /* renamed from: c  reason: collision with root package name */
    public final x4.b0[] f3602c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f3603d;

    /* renamed from: e  reason: collision with root package name */
    public final T f3604e;

    /* renamed from: f  reason: collision with root package name */
    public final c0.a<h<T>> f3605f;

    /* renamed from: g  reason: collision with root package name */
    public final v.a f3606g;

    /* renamed from: h  reason: collision with root package name */
    public final u6.h f3607h;

    /* renamed from: i  reason: collision with root package name */
    public final n f3608i;

    /* renamed from: r  reason: collision with root package name */
    public final g f3609r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList<a> f3610s;

    /* renamed from: t  reason: collision with root package name */
    public final List<a> f3611t;

    /* renamed from: u  reason: collision with root package name */
    public final a0 f3612u;

    /* renamed from: v  reason: collision with root package name */
    public final a0[] f3613v;

    /* renamed from: w  reason: collision with root package name */
    public final c f3614w;

    /* renamed from: x  reason: collision with root package name */
    public e f3615x;

    /* renamed from: y  reason: collision with root package name */
    public x4.b0 f3616y;

    /* renamed from: z  reason: collision with root package name */
    public b<T> f3617z;

    /* compiled from: ChunkSampleStream */
    public final class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        public final h<T> f3618a;

        /* renamed from: b  reason: collision with root package name */
        public final a0 f3619b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3620c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3621d;

        public a(h<T> hVar, a0 a0Var, int i10) {
            this.f3618a = hVar;
            this.f3619b = a0Var;
            this.f3620c = i10;
        }

        public final void a() {
            if (!this.f3621d) {
                h hVar = h.this;
                v.a aVar = hVar.f3606g;
                int[] iArr = hVar.f3601b;
                int i10 = this.f3620c;
                aVar.b(iArr[i10], hVar.f3602c[i10], 0, (Object) null, hVar.B);
                this.f3621d = true;
            }
        }

        public void b() {
        }

        public void c() {
            v6.a.d(h.this.f3603d[this.f3620c]);
            h.this.f3603d[this.f3620c] = false;
        }

        public int d(t tVar, f fVar, boolean z10) {
            if (h.this.s()) {
                return -3;
            }
            a aVar = h.this.D;
            if (aVar != null && aVar.e(this.f3620c + 1) <= this.f3619b.p()) {
                return -3;
            }
            a();
            return this.f3619b.B(tVar, fVar, z10, h.this.E);
        }

        public boolean isReady() {
            return !h.this.s() && this.f3619b.v(h.this.E);
        }

        public int l(long j10) {
            if (h.this.s()) {
                return 0;
            }
            int r10 = this.f3619b.r(j10, h.this.E);
            a aVar = h.this.D;
            if (aVar != null) {
                r10 = Math.min(r10, aVar.e(this.f3620c + 1) - this.f3619b.p());
            }
            this.f3619b.H(r10);
            if (r10 > 0) {
                a();
            }
            return r10;
        }
    }

    /* compiled from: ChunkSampleStream */
    public interface b<T extends i> {
    }

    public h(int i10, int[] iArr, x4.b0[] b0VarArr, T t10, c0.a<h<T>> aVar, u6.f fVar, long j10, l lVar, j.a aVar2, u6.h hVar, v.a aVar3) {
        this.f3600a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f3601b = iArr;
        this.f3602c = b0VarArr == null ? new x4.b0[0] : b0VarArr;
        this.f3604e = t10;
        this.f3605f = aVar;
        this.f3606g = aVar3;
        this.f3607h = hVar;
        this.f3608i = new n("Loader:ChunkSampleStream");
        this.f3609r = new g();
        ArrayList<a> arrayList = new ArrayList<>();
        this.f3610s = arrayList;
        this.f3611t = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f3613v = new a0[length];
        this.f3603d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        a0[] a0VarArr = new a0[i12];
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        lVar.getClass();
        aVar2.getClass();
        a0 a0Var = new a0(fVar, myLooper, lVar, aVar2);
        this.f3612u = a0Var;
        iArr2[0] = i10;
        a0VarArr[0] = a0Var;
        while (i11 < length) {
            a0 a0Var2 = new a0(fVar, (Looper) null, (l) null, (j.a) null);
            this.f3613v[i11] = a0Var2;
            int i13 = i11 + 1;
            a0VarArr[i13] = a0Var2;
            iArr2[i13] = this.f3601b[i11];
            i11 = i13;
        }
        this.f3614w = new c(iArr2, a0VarArr);
        this.A = j10;
        this.B = j10;
    }

    public void A(long j10, boolean z10) {
        long j11;
        if (!s()) {
            a0 a0Var = this.f3612u;
            int i10 = a0Var.f28532r;
            a0Var.h(j10, z10, true);
            a0 a0Var2 = this.f3612u;
            int i11 = a0Var2.f28532r;
            if (i11 > i10) {
                synchronized (a0Var2) {
                    j11 = a0Var2.f28531q == 0 ? Long.MIN_VALUE : a0Var2.f28528n[a0Var2.f28533s];
                }
                int i12 = 0;
                while (true) {
                    a0[] a0VarArr = this.f3613v;
                    if (i12 >= a0VarArr.length) {
                        break;
                    }
                    a0VarArr[i12].h(j11, z10, this.f3603d[i12]);
                    i12++;
                }
            }
            int min = Math.min(u(i11, 0), this.C);
            if (min > 0) {
                e0.O(this.f3610s, 0, min);
                this.C -= min;
            }
        }
    }

    public long a() {
        if (s()) {
            return this.A;
        }
        if (this.E) {
            return Long.MIN_VALUE;
        }
        return p().f3596h;
    }

    public void b() throws IOException {
        this.f3608i.f(Integer.MIN_VALUE);
        this.f3612u.x();
        if (!this.f3608i.e()) {
            this.f3604e.b();
        }
    }

    public int d(t tVar, f fVar, boolean z10) {
        if (s()) {
            return -3;
        }
        a aVar = this.D;
        if (aVar != null && aVar.e(0) <= this.f3612u.p()) {
            return -3;
        }
        t();
        return this.f3612u.B(tVar, fVar, z10, this.E);
    }

    public long e() {
        if (this.E) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.A;
        }
        long j10 = this.B;
        a p10 = p();
        if (!p10.d()) {
            if (this.f3610s.size() > 1) {
                ArrayList<a> arrayList = this.f3610s;
                p10 = arrayList.get(arrayList.size() - 2);
            } else {
                p10 = null;
            }
        }
        if (p10 != null) {
            j10 = Math.max(j10, p10.f3596h);
        }
        return Math.max(j10, this.f3612u.n());
    }

    public boolean f(long j10) {
        long j11;
        List<a> list;
        int i10 = 0;
        if (this.E || this.f3608i.e() || this.f3608i.d()) {
            return false;
        }
        boolean s10 = s();
        if (s10) {
            list = Collections.emptyList();
            j11 = this.A;
        } else {
            list = this.f3611t;
            j11 = p().f3596h;
        }
        this.f3604e.j(j10, j11, list, this.f3609r);
        g gVar = this.f3609r;
        boolean z10 = gVar.f3599b;
        e eVar = (e) gVar.f3598a;
        gVar.f3598a = null;
        gVar.f3599b = false;
        if (z10) {
            this.A = -9223372036854775807L;
            this.E = true;
            return true;
        } else if (eVar == null) {
            return false;
        } else {
            this.f3615x = eVar;
            if (eVar instanceof a) {
                a aVar = (a) eVar;
                if (s10) {
                    long j12 = aVar.f3595g;
                    long j13 = this.A;
                    if (j12 != j13) {
                        this.f3612u.f28535u = j13;
                        for (a0 a0Var : this.f3613v) {
                            a0Var.f28535u = this.A;
                        }
                    }
                    this.A = -9223372036854775807L;
                }
                c cVar = this.f3614w;
                aVar.f3568m = cVar;
                int[] iArr = new int[cVar.f3571b.length];
                while (true) {
                    a0[] a0VarArr = cVar.f3571b;
                    if (i10 >= a0VarArr.length) {
                        break;
                    }
                    iArr[i10] = a0VarArr[i10].t();
                    i10++;
                }
                aVar.f3569n = iArr;
                this.f3610s.add(aVar);
            } else if (eVar instanceof l) {
                ((l) eVar).f3632k = this.f3614w;
            }
            this.f3606g.n(new k(eVar.f3589a, eVar.f3590b, this.f3608i.h(eVar, this, ((com.google.android.exoplayer2.upstream.k) this.f3607h).a(eVar.f3591c))), eVar.f3591c, this.f3600a, eVar.f3592d, eVar.f3593e, eVar.f3594f, eVar.f3595g, eVar.f3596h);
            return true;
        }
    }

    public void g(long j10) {
        if (!this.f3608i.d() && !s()) {
            if (this.f3608i.e()) {
                e eVar = this.f3615x;
                eVar.getClass();
                boolean z10 = eVar instanceof a;
                if ((!z10 || !q(this.f3610s.size() - 1)) && this.f3604e.e(j10, eVar, this.f3611t)) {
                    this.f3608i.a();
                    if (z10) {
                        this.D = (a) eVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int i10 = this.f3604e.i(j10, this.f3611t);
            if (i10 < this.f3610s.size()) {
                v6.a.d(!this.f3608i.e());
                int size = this.f3610s.size();
                while (true) {
                    if (i10 >= size) {
                        i10 = -1;
                        break;
                    } else if (!q(i10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    long j11 = p().f3596h;
                    a o10 = o(i10);
                    if (this.f3610s.isEmpty()) {
                        this.A = this.B;
                    }
                    this.E = false;
                    this.f3606g.p(this.f3600a, o10.f3595g, j11);
                }
            }
        }
    }

    public void h() {
        this.f3612u.C();
        for (a0 C2 : this.f3613v) {
            C2.C();
        }
        this.f3604e.a();
        b<T> bVar = this.f3617z;
        if (bVar != null) {
            com.google.android.exoplayer2.source.dash.b bVar2 = (com.google.android.exoplayer2.source.dash.b) bVar;
            synchronized (bVar2) {
                e.c remove = bVar2.f5076u.remove(this);
                if (remove != null) {
                    remove.f5127a.C();
                }
            }
        }
    }

    public boolean isReady() {
        return !s() && this.f3612u.v(this.E);
    }

    public boolean j() {
        return this.f3608i.e();
    }

    public void k(n.e eVar, long j10, long j11, boolean z10) {
        e eVar2 = (e) eVar;
        this.f3615x = null;
        this.D = null;
        long j12 = eVar2.f3589a;
        u6.e eVar3 = eVar2.f3590b;
        r rVar = eVar2.f3597i;
        k kVar = new k(j12, eVar3, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f3607h.getClass();
        this.f3606g.e(kVar, eVar2.f3591c, this.f3600a, eVar2.f3592d, eVar2.f3593e, eVar2.f3594f, eVar2.f3595g, eVar2.f3596h);
        if (!z10) {
            if (s()) {
                x();
            } else if (eVar2 instanceof a) {
                o(this.f3610s.size() - 1);
                if (this.f3610s.isEmpty()) {
                    this.A = this.B;
                }
            }
            this.f3605f.d(this);
        }
    }

    public int l(long j10) {
        if (s()) {
            return 0;
        }
        int r10 = this.f3612u.r(j10, this.E);
        a aVar = this.D;
        if (aVar != null) {
            r10 = Math.min(r10, aVar.e(0) - this.f3612u.p());
        }
        this.f3612u.H(r10);
        t();
        return r10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.upstream.n.c m(com.google.android.exoplayer2.upstream.n.e r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r12 = r32
            r7 = r27
            b6.e r7 = (b6.e) r7
            com.google.android.exoplayer2.upstream.r r1 = r7.f3597i
            long r1 = r1.f5558b
            boolean r8 = r7 instanceof b6.a
            java.util.ArrayList<b6.a> r3 = r0.f3610s
            int r3 = r3.size()
            int r9 = r3 + -1
            r3 = 0
            r10 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0029
            if (r8 == 0) goto L_0x0029
            boolean r3 = r0.q(r9)
            if (r3 != 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r3 = 0
            r11 = 0
            goto L_0x002b
        L_0x0029:
            r3 = 1
            r11 = 1
        L_0x002b:
            z5.k r25 = new z5.k
            long r14 = r7.f3589a
            u6.e r3 = r7.f3590b
            com.google.android.exoplayer2.upstream.r r4 = r7.f3597i
            android.net.Uri r5 = r4.f5559c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r4.f5560d
            r13 = r25
            r16 = r3
            r17 = r5
            r18 = r4
            r19 = r28
            r21 = r30
            r23 = r1
            r13.<init>(r14, r16, r17, r18, r19, r21, r23)
            long r1 = r7.f3595g
            x4.f.c(r1)
            long r1 = r7.f3596h
            x4.f.c(r1)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 == 0) goto L_0x0085
            u6.h r1 = r0.f3607h
            com.google.android.exoplayer2.upstream.k r1 = (com.google.android.exoplayer2.upstream.k) r1
            boolean r1 = r12 instanceof com.google.android.exoplayer2.upstream.m.f
            if (r1 == 0) goto L_0x0082
            r1 = r12
            com.google.android.exoplayer2.upstream.m$f r1 = (com.google.android.exoplayer2.upstream.m.f) r1
            int r1 = r1.f5524a
            r2 = 403(0x193, float:5.65E-43)
            if (r1 == r2) goto L_0x007e
            r2 = 404(0x194, float:5.66E-43)
            if (r1 == r2) goto L_0x007e
            r2 = 410(0x19a, float:5.75E-43)
            if (r1 == r2) goto L_0x007e
            r2 = 416(0x1a0, float:5.83E-43)
            if (r1 == r2) goto L_0x007e
            r2 = 500(0x1f4, float:7.0E-43)
            if (r1 == r2) goto L_0x007e
            r2 = 503(0x1f7, float:7.05E-43)
            if (r1 != r2) goto L_0x0082
        L_0x007e:
            r1 = 60000(0xea60, double:2.9644E-319)
            goto L_0x0083
        L_0x0082:
            r1 = r13
        L_0x0083:
            r5 = r1
            goto L_0x0086
        L_0x0085:
            r5 = r13
        L_0x0086:
            T r1 = r0.f3604e
            r2 = r7
            r3 = r11
            r4 = r32
            boolean r1 = r1.g(r2, r3, r4, r5)
            r15 = 0
            if (r1 == 0) goto L_0x00b9
            if (r11 == 0) goto L_0x00b2
            com.google.android.exoplayer2.upstream.n$c r1 = com.google.android.exoplayer2.upstream.n.f5529e
            if (r8 == 0) goto L_0x00ba
            b6.a r2 = r0.o(r9)
            if (r2 != r7) goto L_0x00a1
            r2 = 1
            goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            v6.a.d(r2)
            java.util.ArrayList<b6.a> r2 = r0.f3610s
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00ba
            long r2 = r0.B
            r0.A = r2
            goto L_0x00ba
        L_0x00b2:
            java.lang.String r1 = "ChunkSampleStream"
            java.lang.String r2 = "Ignoring attempt to cancel non-cancelable load."
            android.util.Log.w(r1, r2)
        L_0x00b9:
            r1 = r15
        L_0x00ba:
            if (r1 != 0) goto L_0x00ea
            u6.h r1 = r0.f3607h
            com.google.android.exoplayer2.upstream.k r1 = (com.google.android.exoplayer2.upstream.k) r1
            boolean r1 = r12 instanceof x4.m0
            if (r1 != 0) goto L_0x00de
            boolean r1 = r12 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L_0x00de
            boolean r1 = r12 instanceof com.google.android.exoplayer2.upstream.m.b
            if (r1 != 0) goto L_0x00de
            boolean r1 = r12 instanceof com.google.android.exoplayer2.upstream.n.h
            if (r1 == 0) goto L_0x00d1
            goto L_0x00de
        L_0x00d1:
            r1 = -1
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 5000(0x1388, float:7.006E-42)
            r4 = r33
            int r1 = c5.c.a(r4, r1, r2, r3)
            long r1 = (long) r1
            goto L_0x00df
        L_0x00de:
            r1 = r13
        L_0x00df:
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x00e8
            com.google.android.exoplayer2.upstream.n$c r1 = com.google.android.exoplayer2.upstream.n.c(r10, r1)
            goto L_0x00ea
        L_0x00e8:
            com.google.android.exoplayer2.upstream.n$c r1 = com.google.android.exoplayer2.upstream.n.f5530f
        L_0x00ea:
            r14 = r1
            boolean r1 = r14.a()
            r16 = r1 ^ 1
            z5.v$a r1 = r0.f3606g
            int r3 = r7.f3591c
            int r4 = r0.f3600a
            x4.b0 r5 = r7.f3592d
            int r6 = r7.f3593e
            java.lang.Object r8 = r7.f3594f
            long r9 = r7.f3595g
            long r11 = r7.f3596h
            r2 = r25
            r7 = r8
            r8 = r9
            r10 = r11
            r12 = r32
            r13 = r16
            r1.j(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r16 == 0) goto L_0x011b
            r0.f3615x = r15
            u6.h r1 = r0.f3607h
            r1.getClass()
            z5.c0$a<b6.h<T>> r1 = r0.f3605f
            r1.d(r0)
        L_0x011b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.h.m(com.google.android.exoplayer2.upstream.n$e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.n$c");
    }

    public void n(n.e eVar, long j10, long j11) {
        e eVar2 = (e) eVar;
        this.f3615x = null;
        this.f3604e.k(eVar2);
        long j12 = eVar2.f3589a;
        u6.e eVar3 = eVar2.f3590b;
        r rVar = eVar2.f3597i;
        k kVar = new k(j12, eVar3, rVar.f5559c, rVar.f5560d, j10, j11, rVar.f5558b);
        this.f3607h.getClass();
        this.f3606g.h(kVar, eVar2.f3591c, this.f3600a, eVar2.f3592d, eVar2.f3593e, eVar2.f3594f, eVar2.f3595g, eVar2.f3596h);
        this.f3605f.d(this);
    }

    public final a o(int i10) {
        a aVar = this.f3610s.get(i10);
        ArrayList<a> arrayList = this.f3610s;
        e0.O(arrayList, i10, arrayList.size());
        this.C = Math.max(this.C, this.f3610s.size());
        int i11 = 0;
        this.f3612u.k(aVar.e(0));
        while (true) {
            a0[] a0VarArr = this.f3613v;
            if (i11 >= a0VarArr.length) {
                return aVar;
            }
            a0 a0Var = a0VarArr[i11];
            i11++;
            a0Var.k(aVar.e(i11));
        }
    }

    public final a p() {
        ArrayList<a> arrayList = this.f3610s;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean q(int i10) {
        int p10;
        a aVar = this.f3610s.get(i10);
        if (this.f3612u.p() > aVar.e(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a0[] a0VarArr = this.f3613v;
            if (i11 >= a0VarArr.length) {
                return false;
            }
            p10 = a0VarArr[i11].p();
            i11++;
        } while (p10 <= aVar.e(i11));
        return true;
    }

    public boolean s() {
        return this.A != -9223372036854775807L;
    }

    public final void t() {
        int u10 = u(this.f3612u.p(), this.C - 1);
        while (true) {
            int i10 = this.C;
            if (i10 <= u10) {
                this.C = i10 + 1;
                a aVar = this.f3610s.get(i10);
                x4.b0 b0Var = aVar.f3592d;
                if (!b0Var.equals(this.f3616y)) {
                    this.f3606g.b(this.f3600a, b0Var, aVar.f3593e, aVar.f3594f, aVar.f3595g);
                }
                this.f3616y = b0Var;
            } else {
                return;
            }
        }
    }

    public final int u(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f3610s.size()) {
                return this.f3610s.size() - 1;
            }
        } while (this.f3610s.get(i11).e(0) <= i10);
        return i11 - 1;
    }

    public void w(b<T> bVar) {
        this.f3617z = bVar;
        this.f3612u.A();
        for (a0 A2 : this.f3613v) {
            A2.A();
        }
        this.f3608i.g(this);
    }

    public final void x() {
        this.f3612u.D(false);
        for (a0 D2 : this.f3613v) {
            D2.D(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r2 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(long r12) {
        /*
            r11 = this;
            r11.B = r12
            boolean r0 = r11.s()
            if (r0 == 0) goto L_0x000b
            r11.A = r12
            return
        L_0x000b:
            r0 = 0
            r1 = 0
        L_0x000d:
            java.util.ArrayList<b6.a> r2 = r11.f3610s
            int r2 = r2.size()
            r3 = 0
            if (r1 >= r2) goto L_0x0038
            java.util.ArrayList<b6.a> r2 = r11.f3610s
            java.lang.Object r2 = r2.get(r1)
            b6.a r2 = (b6.a) r2
            long r4 = r2.f3595g
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0030
            long r6 = r2.f3566k
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0038:
            r2 = r3
        L_0x0039:
            r1 = 1
            if (r2 == 0) goto L_0x0060
            z5.a0 r4 = r11.f3612u
            int r2 = r2.e(r0)
            monitor-enter(r4)
            r4.E()     // Catch:{ all -> 0x005d }
            int r5 = r4.f28532r     // Catch:{ all -> 0x005d }
            if (r2 < r5) goto L_0x005a
            int r6 = r4.f28531q     // Catch:{ all -> 0x005d }
            int r6 = r6 + r5
            if (r2 <= r6) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            r6 = -9223372036854775808
            r4.f28535u = r6     // Catch:{ all -> 0x005d }
            int r2 = r2 - r5
            r4.f28534t = r2     // Catch:{ all -> 0x005d }
            monitor-exit(r4)
            r2 = 1
            goto L_0x0071
        L_0x005a:
            monitor-exit(r4)
            r2 = 0
            goto L_0x0071
        L_0x005d:
            r12 = move-exception
            monitor-exit(r4)
            throw r12
        L_0x0060:
            z5.a0 r2 = r11.f3612u
            long r4 = r11.a()
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x006c
            r4 = 1
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            boolean r2 = r2.F(r12, r4)
        L_0x0071:
            if (r2 == 0) goto L_0x008c
            z5.a0 r2 = r11.f3612u
            int r2 = r2.p()
            int r2 = r11.u(r2, r0)
            r11.C = r2
            z5.a0[] r2 = r11.f3613v
            int r3 = r2.length
        L_0x0082:
            if (r0 >= r3) goto L_0x00be
            r4 = r2[r0]
            r4.F(r12, r1)
            int r0 = r0 + 1
            goto L_0x0082
        L_0x008c:
            r11.A = r12
            r11.E = r0
            java.util.ArrayList<b6.a> r12 = r11.f3610s
            r12.clear()
            r11.C = r0
            com.google.android.exoplayer2.upstream.n r12 = r11.f3608i
            boolean r12 = r12.e()
            if (r12 == 0) goto L_0x00b7
            z5.a0 r12 = r11.f3612u
            r12.i()
            z5.a0[] r12 = r11.f3613v
            int r13 = r12.length
        L_0x00a7:
            if (r0 >= r13) goto L_0x00b1
            r1 = r12[r0]
            r1.i()
            int r0 = r0 + 1
            goto L_0x00a7
        L_0x00b1:
            com.google.android.exoplayer2.upstream.n r12 = r11.f3608i
            r12.a()
            goto L_0x00be
        L_0x00b7:
            com.google.android.exoplayer2.upstream.n r12 = r11.f3608i
            r12.f5533c = r3
            r11.x()
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.h.z(long):void");
    }
}
