package v;

import android.support.v4.media.a;
import androidx.activity.e;
import com.startapp.b4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n2.g;
import v.d;
import w.c;
import w.l;
import w.n;

/* compiled from: ConstraintWidget */
public class f {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public d J;
    public d K;
    public d L;
    public d M;
    public d N;
    public d O;
    public d P;
    public d Q;
    public d[] R;
    public ArrayList<d> S;
    public boolean[] T;
    public int[] U;
    public f V;
    public int W;
    public int X;
    public float Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26247a = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f26248a0;

    /* renamed from: b  reason: collision with root package name */
    public c f26249b;

    /* renamed from: b0  reason: collision with root package name */
    public int f26250b0;

    /* renamed from: c  reason: collision with root package name */
    public c f26251c;

    /* renamed from: c0  reason: collision with root package name */
    public int f26252c0;

    /* renamed from: d  reason: collision with root package name */
    public l f26253d = null;

    /* renamed from: d0  reason: collision with root package name */
    public int f26254d0;

    /* renamed from: e  reason: collision with root package name */
    public n f26255e = null;

    /* renamed from: e0  reason: collision with root package name */
    public int f26256e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f26257f = {true, true};

    /* renamed from: f0  reason: collision with root package name */
    public float f26258f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f26259g = true;

    /* renamed from: g0  reason: collision with root package name */
    public float f26260g0;

    /* renamed from: h  reason: collision with root package name */
    public int f26261h = -1;

    /* renamed from: h0  reason: collision with root package name */
    public Object f26262h0;

    /* renamed from: i  reason: collision with root package name */
    public int f26263i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f26264i0;

    /* renamed from: j  reason: collision with root package name */
    public String f26265j;

    /* renamed from: j0  reason: collision with root package name */
    public String f26266j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f26267k;

    /* renamed from: k0  reason: collision with root package name */
    public int f26268k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f26269l;

    /* renamed from: l0  reason: collision with root package name */
    public int f26270l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f26271m;

    /* renamed from: m0  reason: collision with root package name */
    public float[] f26272m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f26273n;

    /* renamed from: n0  reason: collision with root package name */
    public f[] f26274n0;

    /* renamed from: o  reason: collision with root package name */
    public int f26275o;

    /* renamed from: o0  reason: collision with root package name */
    public f[] f26276o0;

    /* renamed from: p  reason: collision with root package name */
    public int f26277p;

    /* renamed from: p0  reason: collision with root package name */
    public int f26278p0;

    /* renamed from: q  reason: collision with root package name */
    public int f26279q;

    /* renamed from: q0  reason: collision with root package name */
    public int f26280q0;

    /* renamed from: r  reason: collision with root package name */
    public int f26281r;

    /* renamed from: s  reason: collision with root package name */
    public int f26282s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f26283t;

    /* renamed from: u  reason: collision with root package name */
    public int f26284u;

    /* renamed from: v  reason: collision with root package name */
    public int f26285v;

    /* renamed from: w  reason: collision with root package name */
    public float f26286w;

    /* renamed from: x  reason: collision with root package name */
    public int f26287x;

    /* renamed from: y  reason: collision with root package name */
    public int f26288y;

    /* renamed from: z  reason: collision with root package name */
    public float f26289z;

    public f() {
        new HashMap();
        this.f26267k = false;
        this.f26269l = false;
        this.f26271m = false;
        this.f26273n = false;
        this.f26275o = -1;
        this.f26277p = -1;
        this.f26279q = 0;
        this.f26281r = 0;
        this.f26282s = 0;
        this.f26283t = new int[2];
        this.f26284u = 0;
        this.f26285v = 0;
        this.f26286w = 1.0f;
        this.f26287x = 0;
        this.f26288y = 0;
        this.f26289z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        d dVar = new d(this, d.a.LEFT);
        this.J = dVar;
        d dVar2 = new d(this, d.a.TOP);
        this.K = dVar2;
        d dVar3 = new d(this, d.a.RIGHT);
        this.L = dVar3;
        d dVar4 = new d(this, d.a.BOTTOM);
        this.M = dVar4;
        d dVar5 = new d(this, d.a.BASELINE);
        this.N = dVar5;
        this.O = new d(this, d.a.CENTER_X);
        this.P = new d(this, d.a.CENTER_Y);
        d dVar6 = new d(this, d.a.CENTER);
        this.Q = dVar6;
        this.R = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar6};
        ArrayList<d> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        this.U = new int[]{1, 1};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f26248a0 = 0;
        this.f26250b0 = 0;
        this.f26252c0 = 0;
        this.f26258f0 = 0.5f;
        this.f26260g0 = 0.5f;
        this.f26264i0 = 0;
        this.f26266j0 = null;
        this.f26268k0 = 0;
        this.f26270l0 = 0;
        this.f26272m0 = new float[]{-1.0f, -1.0f};
        this.f26274n0 = new f[]{null, null};
        this.f26276o0 = new f[]{null, null};
        this.f26278p0 = -1;
        this.f26280q0 = -1;
        arrayList.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.M);
        this.S.add(this.O);
        this.S.add(this.P);
        this.S.add(this.Q);
        this.S.add(this.N);
    }

    public boolean A() {
        d dVar = this.J;
        d dVar2 = dVar.f26234f;
        if (dVar2 != null && dVar2.f26234f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f26234f;
        return dVar4 != null && dVar4.f26234f == dVar3;
    }

    public boolean B() {
        d dVar = this.K;
        d dVar2 = dVar.f26234f;
        if (dVar2 != null && dVar2.f26234f == dVar) {
            return true;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f26234f;
        return dVar4 != null && dVar4.f26234f == dVar3;
    }

    public boolean C() {
        return this.f26259g && this.f26264i0 != 8;
    }

    public boolean D() {
        return this.f26267k || (this.J.f26231c && this.L.f26231c);
    }

    public boolean E() {
        return this.f26269l || (this.K.f26231c && this.M.f26231c);
    }

    public void F() {
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.N.h();
        this.O.h();
        this.P.h();
        this.Q.h();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f26248a0 = 0;
        this.f26250b0 = 0;
        this.f26252c0 = 0;
        this.f26254d0 = 0;
        this.f26256e0 = 0;
        this.f26258f0 = 0.5f;
        this.f26260g0 = 0.5f;
        int[] iArr = this.U;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f26262h0 = null;
        this.f26264i0 = 0;
        this.f26268k0 = 0;
        this.f26270l0 = 0;
        float[] fArr = this.f26272m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f26275o = -1;
        this.f26277p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f26281r = 0;
        this.f26282s = 0;
        this.f26286w = 1.0f;
        this.f26289z = 1.0f;
        this.f26285v = Integer.MAX_VALUE;
        this.f26288y = Integer.MAX_VALUE;
        this.f26284u = 0;
        this.f26287x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f26257f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f26259g = true;
        int[] iArr3 = this.f26283t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f26261h = -1;
        this.f26263i = -1;
    }

    public void G() {
        this.f26267k = false;
        this.f26269l = false;
        this.f26271m = false;
        this.f26273n = false;
        int size = this.S.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = this.S.get(i10);
            dVar.f26231c = false;
            dVar.f26230b = 0;
        }
    }

    public void H(g gVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    public final void I(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 != f11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(f10);
            sb2.append(",\n");
        }
    }

    public final void J(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 != i11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(i10);
            sb2.append(",\n");
        }
    }

    public void K(int i10) {
        this.f26252c0 = i10;
        this.E = i10 > 0;
    }

    public void L(int i10, int i11) {
        if (!this.f26267k) {
            d dVar = this.J;
            dVar.f26230b = i10;
            dVar.f26231c = true;
            d dVar2 = this.L;
            dVar2.f26230b = i11;
            dVar2.f26231c = true;
            this.f26248a0 = i10;
            this.W = i11 - i10;
            this.f26267k = true;
        }
    }

    public void M(int i10, int i11) {
        if (!this.f26269l) {
            d dVar = this.K;
            dVar.f26230b = i10;
            dVar.f26231c = true;
            d dVar2 = this.M;
            dVar2.f26230b = i11;
            dVar2.f26231c = true;
            this.f26250b0 = i10;
            this.X = i11 - i10;
            if (this.E) {
                this.N.j(i10 + this.f26252c0);
            }
            this.f26269l = true;
        }
    }

    public void N(int i10) {
        this.X = i10;
        int i11 = this.f26256e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public void O(int i10) {
        this.U[0] = i10;
    }

    public void P(int i10) {
        if (i10 < 0) {
            this.f26256e0 = 0;
        } else {
            this.f26256e0 = i10;
        }
    }

    public void Q(int i10) {
        if (i10 < 0) {
            this.f26254d0 = 0;
        } else {
            this.f26254d0 = i10;
        }
    }

    public void R(int i10) {
        this.U[1] = i10;
    }

    public void S(int i10) {
        this.W = i10;
        int i11 = this.f26254d0;
        if (i10 < i11) {
            this.W = i11;
        }
    }

    public void T(boolean z10, boolean z11) {
        int i10;
        int i11;
        l lVar = this.f26253d;
        boolean z12 = z10 & lVar.f26855g;
        n nVar = this.f26255e;
        boolean z13 = z11 & nVar.f26855g;
        int i12 = lVar.f26856h.f26818g;
        int i13 = nVar.f26856h.f26818g;
        int i14 = lVar.f26857i.f26818g;
        int i15 = nVar.f26857i.f26818g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f26248a0 = i12;
        }
        if (z13) {
            this.f26250b0 = i13;
        }
        if (this.f26264i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z12) {
            if (this.U[0] == 1 && i17 < (i11 = this.W)) {
                i17 = i11;
            }
            this.W = i17;
            int i19 = this.f26254d0;
            if (i17 < i19) {
                this.W = i19;
            }
        }
        if (z13) {
            if (this.U[1] == 1 && i18 < (i10 = this.X)) {
                i18 = i10;
            }
            this.X = i18;
            int i20 = this.f26256e0;
            if (i18 < i20) {
                this.X = i20;
            }
        }
    }

    public void U(t.c cVar, boolean z10) {
        int i10;
        int i11;
        n nVar;
        l lVar;
        int o10 = cVar.o(this.J);
        int o11 = cVar.o(this.K);
        int o12 = cVar.o(this.L);
        int o13 = cVar.o(this.M);
        if (z10 && (lVar = this.f26253d) != null) {
            w.f fVar = lVar.f26856h;
            if (fVar.f26821j) {
                w.f fVar2 = lVar.f26857i;
                if (fVar2.f26821j) {
                    o10 = fVar.f26818g;
                    o12 = fVar2.f26818g;
                }
            }
        }
        if (z10 && (nVar = this.f26255e) != null) {
            w.f fVar3 = nVar.f26856h;
            if (fVar3.f26821j) {
                w.f fVar4 = nVar.f26857i;
                if (fVar4.f26821j) {
                    o11 = fVar3.f26818g;
                    o13 = fVar4.f26818g;
                }
            }
        }
        int i12 = o13 - o11;
        if (o12 - o10 < 0 || i12 < 0 || o10 == Integer.MIN_VALUE || o10 == Integer.MAX_VALUE || o11 == Integer.MIN_VALUE || o11 == Integer.MAX_VALUE || o12 == Integer.MIN_VALUE || o12 == Integer.MAX_VALUE || o13 == Integer.MIN_VALUE || o13 == Integer.MAX_VALUE) {
            o13 = 0;
            o10 = 0;
            o11 = 0;
            o12 = 0;
        }
        int i13 = o12 - o10;
        int i14 = o13 - o11;
        this.f26248a0 = o10;
        this.f26250b0 = o11;
        if (this.f26264i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int[] iArr = this.U;
        if (iArr[0] == 1 && i13 < (i11 = this.W)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.X)) {
            i14 = i10;
        }
        this.W = i13;
        this.X = i14;
        int i15 = this.f26256e0;
        if (i14 < i15) {
            this.X = i15;
        }
        int i16 = this.f26254d0;
        if (i13 < i16) {
            this.W = i16;
        }
        int i17 = this.f26285v;
        if (i17 > 0 && iArr[0] == 3) {
            this.W = Math.min(this.W, i17);
        }
        int i18 = this.f26288y;
        if (i18 > 0 && this.U[1] == 3) {
            this.X = Math.min(this.X, i18);
        }
        int i19 = this.W;
        if (i13 != i19) {
            this.f26261h = i19;
        }
        int i20 = this.X;
        if (i14 != i20) {
            this.f26263i = i20;
        }
    }

    public void b(g gVar, t.c cVar, HashSet<f> hashSet, int i10, boolean z10) {
        if (z10) {
            if (hashSet.contains(this)) {
                k.a(gVar, cVar, this);
                hashSet.remove(this);
                d(cVar, gVar.f0(64));
            } else {
                return;
            }
        }
        if (i10 == 0) {
            HashSet<d> hashSet2 = this.J.f26229a;
            if (hashSet2 != null) {
                Iterator<d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f26232d.b(gVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<d> hashSet3 = this.L.f26229a;
            if (hashSet3 != null) {
                Iterator<d> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f26232d.b(gVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSet4 = this.K.f26229a;
        if (hashSet4 != null) {
            Iterator<d> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f26232d.b(gVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSet5 = this.M.f26229a;
        if (hashSet5 != null) {
            Iterator<d> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f26232d.b(gVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSet6 = this.N.f26229a;
        if (hashSet6 != null) {
            Iterator<d> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f26232d.b(gVar, cVar, hashSet, i10, true);
            }
        }
    }

    public boolean c() {
        return (this instanceof l) || (this instanceof h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(t.c r49, boolean r50) {
        /*
            r48 = this;
            r15 = r48
            r14 = r49
            v.d r0 = r15.J
            t.h r13 = r14.l(r0)
            v.d r0 = r15.L
            t.h r12 = r14.l(r0)
            v.d r0 = r15.K
            t.h r11 = r14.l(r0)
            v.d r0 = r15.M
            t.h r10 = r14.l(r0)
            v.d r0 = r15.N
            t.h r9 = r14.l(r0)
            v.f r0 = r15.V
            r8 = 2
            r7 = 3
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x004c
            int[] r0 = r0.U
            r1 = r0[r5]
            if (r1 != r8) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            r0 = r0[r6]
            if (r0 != r8) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            int r2 = r15.f26279q
            if (r2 == r6) goto L_0x0047
            if (r2 == r8) goto L_0x004d
            if (r2 == r7) goto L_0x004c
            r28 = r0
            r29 = r1
            goto L_0x0051
        L_0x0047:
            r29 = r1
            r28 = 0
            goto L_0x0051
        L_0x004c:
            r0 = 0
        L_0x004d:
            r28 = r0
            r29 = 0
        L_0x0051:
            int r0 = r15.f26264i0
            r4 = 8
            if (r0 != r4) goto L_0x0081
            java.util.ArrayList<v.d> r0 = r15.S
            int r0 = r0.size()
            r1 = 0
        L_0x005e:
            if (r1 >= r0) goto L_0x0073
            java.util.ArrayList<v.d> r2 = r15.S
            java.lang.Object r2 = r2.get(r1)
            v.d r2 = (v.d) r2
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0074
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x005e
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 != 0) goto L_0x0081
            boolean[] r0 = r15.T
            boolean r1 = r0[r5]
            if (r1 != 0) goto L_0x0081
            boolean r0 = r0[r6]
            if (r0 != 0) goto L_0x0081
            return
        L_0x0081:
            boolean r0 = r15.f26267k
            if (r0 != 0) goto L_0x0089
            boolean r1 = r15.f26269l
            if (r1 == 0) goto L_0x00ea
        L_0x0089:
            if (r0 == 0) goto L_0x00aa
            int r0 = r15.f26248a0
            r14.e(r13, r0)
            int r0 = r15.f26248a0
            int r1 = r15.W
            int r0 = r0 + r1
            r14.e(r12, r0)
            if (r29 == 0) goto L_0x00aa
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x00aa
            v.g r0 = (v.g) r0
            v.d r1 = r15.J
            r0.Z(r1)
            v.d r1 = r15.L
            r0.Y(r1)
        L_0x00aa:
            boolean r0 = r15.f26269l
            if (r0 == 0) goto L_0x00dd
            int r0 = r15.f26250b0
            r14.e(r11, r0)
            int r0 = r15.f26250b0
            int r1 = r15.X
            int r0 = r0 + r1
            r14.e(r10, r0)
            v.d r0 = r15.N
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00cb
            int r0 = r15.f26250b0
            int r1 = r15.f26252c0
            int r0 = r0 + r1
            r14.e(r9, r0)
        L_0x00cb:
            if (r28 == 0) goto L_0x00dd
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x00dd
            v.g r0 = (v.g) r0
            v.d r1 = r15.K
            r0.b0(r1)
            v.d r1 = r15.M
            r0.a0(r1)
        L_0x00dd:
            boolean r0 = r15.f26267k
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r15.f26269l
            if (r0 == 0) goto L_0x00ea
            r15.f26267k = r5
            r15.f26269l = r5
            return
        L_0x00ea:
            if (r50 == 0) goto L_0x0170
            w.l r0 = r15.f26253d
            if (r0 == 0) goto L_0x0170
            w.n r1 = r15.f26255e
            if (r1 == 0) goto L_0x0170
            w.f r2 = r0.f26856h
            boolean r3 = r2.f26821j
            if (r3 == 0) goto L_0x0170
            w.f r0 = r0.f26857i
            boolean r0 = r0.f26821j
            if (r0 == 0) goto L_0x0170
            w.f r0 = r1.f26856h
            boolean r0 = r0.f26821j
            if (r0 == 0) goto L_0x0170
            w.f r0 = r1.f26857i
            boolean r0 = r0.f26821j
            if (r0 == 0) goto L_0x0170
            int r0 = r2.f26818g
            r14.e(r13, r0)
            w.l r0 = r15.f26253d
            w.f r0 = r0.f26857i
            int r0 = r0.f26818g
            r14.e(r12, r0)
            w.n r0 = r15.f26255e
            w.f r0 = r0.f26856h
            int r0 = r0.f26818g
            r14.e(r11, r0)
            w.n r0 = r15.f26255e
            w.f r0 = r0.f26857i
            int r0 = r0.f26818g
            r14.e(r10, r0)
            w.n r0 = r15.f26255e
            w.f r0 = r0.f26841k
            int r0 = r0.f26818g
            r14.e(r9, r0)
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x016b
            if (r29 == 0) goto L_0x0152
            boolean[] r0 = r15.f26257f
            boolean r0 = r0[r5]
            if (r0 == 0) goto L_0x0152
            boolean r0 = r48.A()
            if (r0 != 0) goto L_0x0152
            v.f r0 = r15.V
            v.d r0 = r0.L
            t.h r0 = r14.l(r0)
            r14.f(r0, r12, r5, r4)
        L_0x0152:
            if (r28 == 0) goto L_0x016b
            boolean[] r0 = r15.f26257f
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x016b
            boolean r0 = r48.B()
            if (r0 != 0) goto L_0x016b
            v.f r0 = r15.V
            v.d r0 = r0.M
            t.h r0 = r14.l(r0)
            r14.f(r0, r10, r5, r4)
        L_0x016b:
            r15.f26267k = r5
            r15.f26269l = r5
            return
        L_0x0170:
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x01e1
            boolean r0 = r15.z(r5)
            if (r0 == 0) goto L_0x0183
            v.f r0 = r15.V
            v.g r0 = (v.g) r0
            r0.W(r15, r5)
            r0 = 1
            goto L_0x0187
        L_0x0183:
            boolean r0 = r48.A()
        L_0x0187:
            boolean r1 = r15.z(r6)
            if (r1 == 0) goto L_0x0196
            v.f r1 = r15.V
            v.g r1 = (v.g) r1
            r1.W(r15, r6)
            r1 = 1
            goto L_0x019a
        L_0x0196:
            boolean r1 = r48.B()
        L_0x019a:
            if (r0 != 0) goto L_0x01b9
            if (r29 == 0) goto L_0x01b9
            int r2 = r15.f26264i0
            if (r2 == r4) goto L_0x01b9
            v.d r2 = r15.J
            v.d r2 = r2.f26234f
            if (r2 != 0) goto L_0x01b9
            v.d r2 = r15.L
            v.d r2 = r2.f26234f
            if (r2 != 0) goto L_0x01b9
            v.f r2 = r15.V
            v.d r2 = r2.L
            t.h r2 = r14.l(r2)
            r14.f(r2, r12, r5, r6)
        L_0x01b9:
            if (r1 != 0) goto L_0x01dc
            if (r28 == 0) goto L_0x01dc
            int r2 = r15.f26264i0
            if (r2 == r4) goto L_0x01dc
            v.d r2 = r15.K
            v.d r2 = r2.f26234f
            if (r2 != 0) goto L_0x01dc
            v.d r2 = r15.M
            v.d r2 = r2.f26234f
            if (r2 != 0) goto L_0x01dc
            v.d r2 = r15.N
            if (r2 != 0) goto L_0x01dc
            v.f r2 = r15.V
            v.d r2 = r2.M
            t.h r2 = r14.l(r2)
            r14.f(r2, r10, r5, r6)
        L_0x01dc:
            r31 = r0
            r30 = r1
            goto L_0x01e5
        L_0x01e1:
            r30 = 0
            r31 = 0
        L_0x01e5:
            int r0 = r15.W
            int r1 = r15.f26254d0
            if (r0 >= r1) goto L_0x01ec
            goto L_0x01ed
        L_0x01ec:
            r1 = r0
        L_0x01ed:
            int r2 = r15.X
            int r3 = r15.f26256e0
            if (r2 >= r3) goto L_0x01f4
            goto L_0x01f5
        L_0x01f4:
            r3 = r2
        L_0x01f5:
            int[] r8 = r15.U
            r4 = r8[r5]
            if (r4 == r7) goto L_0x01fd
            r4 = 1
            goto L_0x01fe
        L_0x01fd:
            r4 = 0
        L_0x01fe:
            r5 = r8[r6]
            if (r5 == r7) goto L_0x0204
            r5 = 1
            goto L_0x0205
        L_0x0204:
            r5 = 0
        L_0x0205:
            int r6 = r15.Z
            r15.A = r6
            float r7 = r15.Y
            r15.B = r7
            r21 = r1
            int r1 = r15.f26281r
            r22 = r3
            int r3 = r15.f26282s
            r23 = 0
            r24 = 4
            r27 = r9
            int r23 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r23 <= 0) goto L_0x035c
            int r9 = r15.f26264i0
            r32 = r10
            r10 = 8
            if (r9 == r10) goto L_0x035e
            r9 = 0
            r10 = r8[r9]
            r9 = 3
            if (r10 != r9) goto L_0x0233
            if (r1 != 0) goto L_0x0233
            r33 = r11
            r1 = 3
            goto L_0x0235
        L_0x0233:
            r33 = r11
        L_0x0235:
            r10 = 1
            r11 = r8[r10]
            if (r11 != r9) goto L_0x023d
            if (r3 != 0) goto L_0x023d
            r3 = 3
        L_0x023d:
            r11 = 0
            r10 = r8[r11]
            r25 = 1065353216(0x3f800000, float:1.0)
            if (r10 != r9) goto L_0x0308
            r10 = 1
            r11 = r8[r10]
            if (r11 != r9) goto L_0x0308
            if (r1 != r9) goto L_0x0308
            if (r3 != r9) goto L_0x0308
            r9 = -1
            if (r6 != r9) goto L_0x0265
            if (r4 == 0) goto L_0x0258
            if (r5 != 0) goto L_0x0258
            r0 = 0
            r15.A = r0
            goto L_0x0265
        L_0x0258:
            if (r4 != 0) goto L_0x0265
            if (r5 == 0) goto L_0x0265
            r0 = 1
            r15.A = r0
            if (r6 != r9) goto L_0x0265
            float r0 = r25 / r7
            r15.B = r0
        L_0x0265:
            int r0 = r15.A
            if (r0 != 0) goto L_0x027d
            v.d r0 = r15.K
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0279
            v.d r0 = r15.M
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x027d
        L_0x0279:
            r0 = 1
            r15.A = r0
            goto L_0x0295
        L_0x027d:
            r0 = 1
            int r2 = r15.A
            if (r2 != r0) goto L_0x0295
            v.d r0 = r15.J
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0292
            v.d r0 = r15.L
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0295
        L_0x0292:
            r0 = 0
            r15.A = r0
        L_0x0295:
            int r0 = r15.A
            r2 = -1
            if (r0 != r2) goto L_0x02e7
            v.d r0 = r15.K
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02ba
            v.d r0 = r15.M
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02ba
            v.d r0 = r15.J
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02ba
            v.d r0 = r15.L
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x02e7
        L_0x02ba:
            v.d r0 = r15.K
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02ce
            v.d r0 = r15.M
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02ce
            r0 = 0
            r15.A = r0
            goto L_0x02e7
        L_0x02ce:
            v.d r0 = r15.J
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02e7
            v.d r0 = r15.L
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02e7
            float r0 = r15.B
            float r0 = r25 / r0
            r15.B = r0
            r0 = 1
            r15.A = r0
        L_0x02e7:
            int r0 = r15.A
            r2 = -1
            if (r0 != r2) goto L_0x0351
            int r0 = r15.f26284u
            if (r0 <= 0) goto L_0x02f8
            int r2 = r15.f26287x
            if (r2 != 0) goto L_0x02f8
            r2 = 0
            r15.A = r2
            goto L_0x0351
        L_0x02f8:
            if (r0 != 0) goto L_0x0351
            int r0 = r15.f26287x
            if (r0 <= 0) goto L_0x0351
            float r0 = r15.B
            float r0 = r25 / r0
            r15.B = r0
            r0 = 1
            r15.A = r0
            goto L_0x0351
        L_0x0308:
            r4 = 0
            r5 = r8[r4]
            r9 = 3
            if (r5 != r9) goto L_0x0328
            if (r1 != r9) goto L_0x0328
            r15.A = r4
            float r0 = (float) r2
            float r7 = r7 * r0
            int r0 = (int) r7
            r2 = 1
            r4 = r8[r2]
            if (r4 == r9) goto L_0x0325
            r1 = r0
            r36 = r3
            r34 = r22
            r35 = 0
            r37 = 4
            goto L_0x036a
        L_0x0325:
            r21 = r0
            goto L_0x0351
        L_0x0328:
            r2 = 1
            r4 = r8[r2]
            if (r4 != r9) goto L_0x0351
            if (r3 != r9) goto L_0x0351
            r15.A = r2
            r2 = -1
            if (r6 != r2) goto L_0x0338
            float r2 = r25 / r7
            r15.B = r2
        L_0x0338:
            float r2 = r15.B
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            r2 = 0
            r4 = r8[r2]
            r2 = 3
            if (r4 == r2) goto L_0x034f
            r34 = r0
            r37 = r1
            r1 = r21
            r35 = 0
            r36 = 4
            goto L_0x036a
        L_0x034f:
            r22 = r0
        L_0x0351:
            r37 = r1
            r36 = r3
            r1 = r21
            r34 = r22
            r35 = 1
            goto L_0x036a
        L_0x035c:
            r32 = r10
        L_0x035e:
            r33 = r11
            r37 = r1
            r36 = r3
            r1 = r21
            r34 = r22
            r35 = 0
        L_0x036a:
            int[] r0 = r15.f26283t
            r2 = 0
            r0[r2] = r37
            r2 = 1
            r0[r2] = r36
            if (r35 == 0) goto L_0x037e
            int r0 = r15.A
            r2 = -1
            if (r0 == 0) goto L_0x037b
            if (r0 != r2) goto L_0x037f
        L_0x037b:
            r21 = 1
            goto L_0x0381
        L_0x037e:
            r2 = -1
        L_0x037f:
            r21 = 0
        L_0x0381:
            if (r35 == 0) goto L_0x038d
            int r0 = r15.A
            r3 = 1
            if (r0 == r3) goto L_0x038a
            if (r0 != r2) goto L_0x038d
        L_0x038a:
            r38 = 1
            goto L_0x038f
        L_0x038d:
            r38 = 0
        L_0x038f:
            int[] r0 = r15.U
            r2 = 0
            r0 = r0[r2]
            r2 = 2
            if (r0 != r2) goto L_0x039d
            boolean r0 = r15 instanceof v.g
            if (r0 == 0) goto L_0x039d
            r9 = 1
            goto L_0x039e
        L_0x039d:
            r9 = 0
        L_0x039e:
            if (r9 == 0) goto L_0x03a3
            r22 = 0
            goto L_0x03a5
        L_0x03a3:
            r22 = r1
        L_0x03a5:
            v.d r0 = r15.Q
            boolean r0 = r0.g()
            r1 = 1
            r39 = r0 ^ 1
            boolean[] r0 = r15.T
            r2 = 0
            boolean r23 = r0[r2]
            boolean r40 = r0[r1]
            int r0 = r15.f26275o
            r41 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0406
            boolean r0 = r15.f26267k
            if (r0 != 0) goto L_0x0406
            if (r50 == 0) goto L_0x0412
            w.l r0 = r15.f26253d
            if (r0 == 0) goto L_0x0412
            w.f r1 = r0.f26856h
            boolean r2 = r1.f26821j
            if (r2 == 0) goto L_0x0412
            w.f r0 = r0.f26857i
            boolean r0 = r0.f26821j
            if (r0 != 0) goto L_0x03d3
            goto L_0x0412
        L_0x03d3:
            if (r50 == 0) goto L_0x0406
            int r0 = r1.f26818g
            r14.e(r13, r0)
            w.l r0 = r15.f26253d
            w.f r0 = r0.f26857i
            int r0 = r0.f26818g
            r14.e(r12, r0)
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x0404
            if (r29 == 0) goto L_0x0404
            boolean[] r0 = r15.f26257f
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0404
            boolean r0 = r48.A()
            if (r0 != 0) goto L_0x0404
            v.f r0 = r15.V
            v.d r0 = r0.L
            t.h r0 = r14.l(r0)
            r4 = 8
            r14.f(r0, r12, r1, r4)
            goto L_0x0406
        L_0x0404:
            r4 = 8
        L_0x0406:
            r47 = r27
            r45 = r32
            r46 = r33
            r32 = r12
            r33 = r13
            goto L_0x04a3
        L_0x0412:
            r4 = 8
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x0420
            v.d r0 = r0.L
            t.h r0 = r14.l(r0)
            r7 = r0
            goto L_0x0422
        L_0x0420:
            r7 = r41
        L_0x0422:
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x042e
            v.d r0 = r0.J
            t.h r0 = r14.l(r0)
            r6 = r0
            goto L_0x0430
        L_0x042e:
            r6 = r41
        L_0x0430:
            boolean[] r0 = r15.f26257f
            r5 = 0
            boolean r10 = r0[r5]
            int[] r0 = r15.U
            r11 = r0[r5]
            v.d r3 = r15.J
            v.d r1 = r15.L
            int r2 = r15.f26248a0
            r16 = r2
            int r2 = r15.f26254d0
            int[] r4 = r15.C
            r18 = r4[r5]
            float r4 = r15.f26258f0
            r19 = 1
            r0 = r0[r19]
            r8 = 3
            if (r0 != r8) goto L_0x0453
            r20 = 1
            goto L_0x0455
        L_0x0453:
            r20 = 0
        L_0x0455:
            int r0 = r15.f26284u
            r24 = r0
            int r0 = r15.f26285v
            r25 = r0
            float r0 = r15.f26286w
            r26 = r0
            r0 = 1
            r42 = r2
            r2 = r0
            r0 = r48
            r43 = r1
            r1 = r49
            r44 = r3
            r3 = r29
            r17 = r4
            r4 = r28
            r5 = r10
            r10 = 1
            r8 = r11
            r11 = r27
            r45 = r32
            r10 = r44
            r47 = r11
            r46 = r33
            r11 = r43
            r32 = r12
            r12 = r16
            r33 = r13
            r13 = r22
            r14 = r42
            r15 = r18
            r16 = r17
            r17 = r21
            r18 = r20
            r19 = r31
            r20 = r30
            r21 = r23
            r22 = r37
            r23 = r36
            r27 = r39
            r0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x04a3:
            if (r50 == 0) goto L_0x0509
            r15 = r48
            w.n r0 = r15.f26255e
            if (r0 == 0) goto L_0x04fc
            w.f r1 = r0.f26856h
            boolean r2 = r1.f26821j
            if (r2 == 0) goto L_0x04fc
            w.f r0 = r0.f26857i
            boolean r0 = r0.f26821j
            if (r0 == 0) goto L_0x04fc
            int r0 = r1.f26818g
            r14 = r49
            r13 = r46
            r14.e(r13, r0)
            w.n r0 = r15.f26255e
            w.f r0 = r0.f26857i
            int r0 = r0.f26818g
            r12 = r45
            r14.e(r12, r0)
            w.n r0 = r15.f26255e
            w.f r0 = r0.f26841k
            int r0 = r0.f26818g
            r1 = r47
            r14.e(r1, r0)
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x04f6
            if (r30 != 0) goto L_0x04f6
            if (r28 == 0) goto L_0x04f6
            boolean[] r2 = r15.f26257f
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x04f2
            v.d r0 = r0.M
            t.h r0 = r14.l(r0)
            r2 = 8
            r10 = 0
            r14.f(r0, r12, r10, r2)
            goto L_0x04fa
        L_0x04f2:
            r2 = 8
            r10 = 0
            goto L_0x04fa
        L_0x04f6:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x04fa:
            r6 = 0
            goto L_0x0518
        L_0x04fc:
            r14 = r49
            r12 = r45
            r13 = r46
            r1 = r47
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x0517
        L_0x0509:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r48
            r14 = r49
            r12 = r45
            r13 = r46
            r1 = r47
        L_0x0517:
            r6 = 1
        L_0x0518:
            int r0 = r15.f26277p
            r3 = 2
            if (r0 != r3) goto L_0x051f
            r5 = 0
            goto L_0x0520
        L_0x051f:
            r5 = r6
        L_0x0520:
            if (r5 == 0) goto L_0x05f6
            boolean r0 = r15.f26269l
            if (r0 != 0) goto L_0x05f6
            int[] r0 = r15.U
            r0 = r0[r11]
            if (r0 != r3) goto L_0x0532
            boolean r0 = r15 instanceof v.g
            if (r0 == 0) goto L_0x0532
            r9 = 1
            goto L_0x0533
        L_0x0532:
            r9 = 0
        L_0x0533:
            if (r9 == 0) goto L_0x0537
            r34 = 0
        L_0x0537:
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x0543
            v.d r0 = r0.M
            t.h r0 = r14.l(r0)
            r7 = r0
            goto L_0x0545
        L_0x0543:
            r7 = r41
        L_0x0545:
            v.f r0 = r15.V
            if (r0 == 0) goto L_0x0551
            v.d r0 = r0.K
            t.h r0 = r14.l(r0)
            r6 = r0
            goto L_0x0553
        L_0x0551:
            r6 = r41
        L_0x0553:
            int r0 = r15.f26252c0
            if (r0 > 0) goto L_0x055b
            int r3 = r15.f26264i0
            if (r3 != r2) goto L_0x0593
        L_0x055b:
            v.d r3 = r15.N
            v.d r4 = r3.f26234f
            if (r4 == 0) goto L_0x0584
            r14.d(r1, r13, r0, r2)
            v.d r0 = r15.N
            v.d r0 = r0.f26234f
            t.h r0 = r14.l(r0)
            v.d r3 = r15.N
            int r3 = r3.d()
            r14.d(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x0581
            v.d r0 = r15.M
            t.h r0 = r14.l(r0)
            r1 = 5
            r14.f(r7, r0, r10, r1)
        L_0x0581:
            r27 = 0
            goto L_0x0595
        L_0x0584:
            int r4 = r15.f26264i0
            if (r4 != r2) goto L_0x0590
            int r0 = r3.d()
            r14.d(r1, r13, r0, r2)
            goto L_0x0593
        L_0x0590:
            r14.d(r1, r13, r0, r2)
        L_0x0593:
            r27 = r39
        L_0x0595:
            boolean[] r0 = r15.f26257f
            boolean r5 = r0[r11]
            int[] r0 = r15.U
            r8 = r0[r11]
            v.d r4 = r15.K
            v.d r3 = r15.M
            int r1 = r15.f26250b0
            int r2 = r15.f26256e0
            int[] r10 = r15.C
            r16 = r10[r11]
            float r10 = r15.f26260g0
            r17 = 0
            r0 = r0[r17]
            r11 = 3
            if (r0 != r11) goto L_0x05b5
            r18 = 1
            goto L_0x05b7
        L_0x05b5:
            r18 = 0
        L_0x05b7:
            int r0 = r15.f26287x
            r24 = r0
            int r0 = r15.f26288y
            r25 = r0
            float r0 = r15.f26289z
            r26 = r0
            r0 = 0
            r20 = r2
            r2 = r0
            r0 = r48
            r21 = r1
            r1 = r49
            r11 = r3
            r3 = r28
            r22 = r4
            r4 = r29
            r17 = r10
            r10 = r22
            r28 = r12
            r12 = r21
            r29 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r38
            r19 = r30
            r20 = r31
            r21 = r40
            r22 = r36
            r23 = r37
            r0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05fa
        L_0x05f6:
            r28 = r12
            r29 = r13
        L_0x05fa:
            if (r35 == 0) goto L_0x0627
            r6 = 8
            r7 = r48
            int r0 = r7.A
            r1 = 1
            if (r0 != r1) goto L_0x0615
            float r5 = r7.B
            r0 = r49
            r1 = r28
            r2 = r29
            r3 = r32
            r4 = r33
            r0.h(r1, r2, r3, r4, r5, r6)
            goto L_0x0629
        L_0x0615:
            float r5 = r7.B
            r6 = 8
            r0 = r49
            r1 = r32
            r2 = r33
            r3 = r28
            r4 = r29
            r0.h(r1, r2, r3, r4, r5, r6)
            goto L_0x0629
        L_0x0627:
            r7 = r48
        L_0x0629:
            v.d r0 = r7.Q
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x06d4
            v.d r0 = r7.Q
            v.d r0 = r0.f26234f
            v.f r0 = r0.f26232d
            float r1 = r7.D
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            v.d r2 = r7.Q
            int r2 = r2.d()
            v.d$a r3 = v.d.a.LEFT
            v.d r4 = r7.i(r3)
            r5 = r49
            t.h r9 = r5.l(r4)
            v.d$a r4 = v.d.a.TOP
            v.d r6 = r7.i(r4)
            t.h r11 = r5.l(r6)
            v.d$a r6 = v.d.a.RIGHT
            v.d r8 = r7.i(r6)
            t.h r16 = r5.l(r8)
            v.d$a r8 = v.d.a.BOTTOM
            v.d r10 = r7.i(r8)
            t.h r12 = r5.l(r10)
            v.d r3 = r0.i(r3)
            t.h r3 = r5.l(r3)
            v.d r4 = r0.i(r4)
            t.h r13 = r5.l(r4)
            v.d r4 = r0.i(r6)
            t.h r4 = r5.l(r4)
            v.d r0 = r0.i(r8)
            t.h r14 = r5.l(r0)
            t.b r0 = r49.m()
            double r6 = (double) r1
            double r17 = java.lang.Math.sin(r6)
            double r1 = (double) r2
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            r50 = r3
            r19 = r4
            double r3 = r17 * r1
            float r15 = (float) r3
            r10 = r0
            r10.g(r11, r12, r13, r14, r15)
            r5.c(r0)
            t.b r0 = r49.m()
            double r3 = java.lang.Math.cos(r6)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r1)
            double r3 = r3 * r1
            float r13 = (float) r3
            r8 = r0
            r10 = r16
            r11 = r50
            r12 = r19
            r8.g(r9, r10, r11, r12, r13)
            r5.c(r0)
        L_0x06d4:
            r1 = 0
            r0 = r48
            r0.f26267k = r1
            r0.f26269l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.d(t.c, boolean):void");
    }

    public boolean e() {
        return this.f26264i0 != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x039c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x041a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x04eb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:343:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(t.c r35, boolean r36, boolean r37, boolean r38, boolean r39, t.h r40, t.h r41, int r42, boolean r43, v.d r44, v.d r45, int r46, int r47, int r48, int r49, float r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, int r56, int r57, int r58, int r59, float r60, boolean r61) {
        /*
            r34 = this;
            r0 = r34
            r10 = r35
            r11 = r40
            r12 = r41
            r13 = r44
            r14 = r45
            r15 = r48
            r1 = r49
            r2 = r57
            r3 = r58
            r4 = r59
            v.d$a r5 = v.d.a.BOTTOM
            t.h r9 = r10.l(r13)
            t.h r8 = r10.l(r14)
            v.d r6 = r13.f26234f
            t.h r7 = r10.l(r6)
            v.d r6 = r14.f26234f
            t.h r6 = r10.l(r6)
            boolean r22 = r44.g()
            boolean r23 = r45.g()
            v.d r12 = r0.Q
            boolean r12 = r12.g()
            if (r23 == 0) goto L_0x003f
            int r16 = r22 + 1
            goto L_0x0041
        L_0x003f:
            r16 = r22
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r16 = r16 + 1
        L_0x0045:
            r2 = r16
            if (r51 == 0) goto L_0x004b
            r14 = 3
            goto L_0x004d
        L_0x004b:
            r14 = r56
        L_0x004d:
            int r11 = t.g.f(r42)
            r24 = r6
            r6 = 1
            if (r11 == 0) goto L_0x0061
            if (r11 == r6) goto L_0x0061
            r6 = 2
            if (r11 == r6) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            r6 = 4
            if (r14 == r6) goto L_0x0061
            r11 = 1
            goto L_0x0062
        L_0x0061:
            r11 = 0
        L_0x0062:
            int r6 = r0.f26261h
            r16 = r11
            r11 = -1
            if (r6 == r11) goto L_0x0071
            if (r36 == 0) goto L_0x0071
            r0.f26261h = r11
            r47 = r6
            r16 = 0
        L_0x0071:
            int r6 = r0.f26263i
            if (r6 == r11) goto L_0x007c
            if (r36 != 0) goto L_0x007c
            r0.f26263i = r11
            r16 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r47
        L_0x007e:
            int r11 = r0.f26264i0
            r47 = r6
            r6 = 8
            if (r11 != r6) goto L_0x008a
            r11 = 0
            r28 = 0
            goto L_0x008e
        L_0x008a:
            r11 = r47
            r28 = r16
        L_0x008e:
            if (r61 == 0) goto L_0x00ac
            if (r22 != 0) goto L_0x009c
            if (r23 != 0) goto L_0x009c
            if (r12 != 0) goto L_0x009c
            r6 = r46
            r10.e(r9, r6)
            goto L_0x00ac
        L_0x009c:
            if (r22 == 0) goto L_0x00ac
            if (r23 != 0) goto L_0x00ac
            int r6 = r44.d()
            r29 = r12
            r12 = 8
            r10.d(r9, r7, r6, r12)
            goto L_0x00b0
        L_0x00ac:
            r29 = r12
            r12 = 8
        L_0x00b0:
            if (r28 != 0) goto L_0x00d1
            if (r43 == 0) goto L_0x00c7
            r5 = 3
            r6 = 0
            r10.d(r8, r9, r6, r5)
            if (r15 <= 0) goto L_0x00be
            r10.f(r8, r9, r15, r12)
        L_0x00be:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00cb
            r10.g(r8, r9, r1, r12)
            goto L_0x00cb
        L_0x00c7:
            r5 = 3
            r10.d(r8, r9, r11, r12)
        L_0x00cb:
            r11 = r39
            r12 = r3
            r1 = 3
            goto L_0x019d
        L_0x00d1:
            r1 = 3
            r6 = 2
            if (r2 == r6) goto L_0x00f2
            if (r51 != 0) goto L_0x00f2
            r6 = 1
            if (r14 == r6) goto L_0x00dc
            if (r14 != 0) goto L_0x00f2
        L_0x00dc:
            int r5 = java.lang.Math.max(r3, r11)
            if (r4 <= 0) goto L_0x00e6
            int r5 = java.lang.Math.min(r4, r5)
        L_0x00e6:
            r6 = 8
            r10.d(r8, r9, r5, r6)
            r11 = r39
            r12 = r3
            r28 = 0
            goto L_0x019d
        L_0x00f2:
            r6 = -2
            if (r3 != r6) goto L_0x00f6
            r3 = r11
        L_0x00f6:
            if (r4 != r6) goto L_0x00f9
            r4 = r11
        L_0x00f9:
            if (r11 <= 0) goto L_0x00ff
            r6 = 1
            if (r14 == r6) goto L_0x00ff
            r11 = 0
        L_0x00ff:
            if (r3 <= 0) goto L_0x010a
            r6 = 8
            r10.f(r8, r9, r3, r6)
            int r11 = java.lang.Math.max(r11, r3)
        L_0x010a:
            if (r4 <= 0) goto L_0x0123
            if (r37 == 0) goto L_0x0113
            r6 = 1
            if (r14 != r6) goto L_0x0113
            r6 = 0
            goto L_0x0114
        L_0x0113:
            r6 = 1
        L_0x0114:
            if (r6 == 0) goto L_0x011c
            r6 = 8
            r10.g(r8, r9, r4, r6)
            goto L_0x011e
        L_0x011c:
            r6 = 8
        L_0x011e:
            int r11 = java.lang.Math.min(r11, r4)
            goto L_0x0125
        L_0x0123:
            r6 = 8
        L_0x0125:
            r12 = 1
            if (r14 != r12) goto L_0x0143
            if (r37 == 0) goto L_0x012e
            r10.d(r8, r9, r11, r6)
            goto L_0x013f
        L_0x012e:
            if (r53 == 0) goto L_0x0138
            r5 = 5
            r10.d(r8, r9, r11, r5)
            r10.g(r8, r9, r11, r6)
            goto L_0x013f
        L_0x0138:
            r5 = 5
            r10.d(r8, r9, r11, r5)
            r10.g(r8, r9, r11, r6)
        L_0x013f:
            r11 = r39
            r12 = r3
            goto L_0x019d
        L_0x0143:
            r6 = 2
            if (r14 != r6) goto L_0x019b
            v.d$a r6 = r13.f26233e
            v.d$a r11 = v.d.a.TOP
            if (r6 == r11) goto L_0x016c
            if (r6 != r5) goto L_0x014f
            goto L_0x016c
        L_0x014f:
            v.f r5 = r0.V
            v.d$a r6 = v.d.a.LEFT
            v.d r5 = r5.i(r6)
            t.h r5 = r10.l(r5)
            v.f r6 = r0.V
            v.d$a r11 = v.d.a.RIGHT
            v.d r6 = r6.i(r11)
            t.h r6 = r10.l(r6)
            r20 = r5
            r19 = r6
            goto L_0x0184
        L_0x016c:
            v.f r6 = r0.V
            v.d r6 = r6.i(r11)
            t.h r6 = r10.l(r6)
            v.f r11 = r0.V
            v.d r5 = r11.i(r5)
            t.h r5 = r10.l(r5)
            r19 = r5
            r20 = r6
        L_0x0184:
            t.b r5 = r35.m()
            r16 = r5
            r17 = r8
            r18 = r9
            r21 = r60
            r16.d(r17, r18, r19, r20, r21)
            r10.c(r5)
            if (r37 == 0) goto L_0x013f
            r28 = 0
            goto L_0x013f
        L_0x019b:
            r12 = r3
            r11 = 1
        L_0x019d:
            if (r61 == 0) goto L_0x04ff
            if (r53 == 0) goto L_0x01b2
            r3 = r41
            r4 = r2
            r7 = r8
            r5 = r9
            r39 = r11
            r1 = 0
            r6 = 2
            r12 = 8
            r25 = 1
            r2 = r40
            goto L_0x050e
        L_0x01b2:
            if (r22 != 0) goto L_0x01c1
            if (r23 != 0) goto L_0x01c1
            if (r29 != 0) goto L_0x01c1
            r7 = r8
            r39 = r11
            r2 = r24
        L_0x01bd:
            r1 = 0
            r3 = 5
            goto L_0x04e6
        L_0x01c1:
            if (r22 == 0) goto L_0x01dd
            if (r23 != 0) goto L_0x01dd
            v.d r1 = r13.f26234f
            v.f r1 = r1.f26232d
            if (r37 == 0) goto L_0x01d2
            boolean r1 = r1 instanceof v.a
            if (r1 == 0) goto L_0x01d2
            r6 = 8
            goto L_0x01d3
        L_0x01d2:
            r6 = 5
        L_0x01d3:
            r20 = r37
            r7 = r8
            r39 = r11
            r2 = r24
            r1 = 0
            goto L_0x04e9
        L_0x01dd:
            if (r22 != 0) goto L_0x01f8
            if (r23 == 0) goto L_0x01f8
            int r1 = r45.d()
            int r1 = -r1
            r6 = r24
            r2 = 8
            r10.d(r8, r6, r1, r2)
            if (r37 == 0) goto L_0x04e0
            r3 = r40
            r1 = 5
            r5 = 0
            r10.f(r9, r3, r5, r1)
            goto L_0x04e0
        L_0x01f8:
            r3 = r40
            r6 = r24
            r5 = 0
            if (r22 == 0) goto L_0x04e0
            if (r23 == 0) goto L_0x04e0
            v.d r2 = r13.f26234f
            v.f r2 = r2.f26232d
            r1 = r45
            r13 = 3
            v.d r5 = r1.f26234f
            v.f r5 = r5.f26232d
            v.f r13 = r0.V
            r16 = 6
            if (r28 == 0) goto L_0x0346
            if (r14 != 0) goto L_0x0275
            if (r4 != 0) goto L_0x023f
            if (r12 != 0) goto L_0x023f
            boolean r4 = r7.f25317f
            if (r4 == 0) goto L_0x0232
            boolean r4 = r6.f25317f
            if (r4 == 0) goto L_0x0232
            int r2 = r44.d()
            r4 = 8
            r10.d(r9, r7, r2, r4)
            int r1 = r45.d()
            int r1 = -r1
            r10.d(r8, r6, r1, r4)
            return
        L_0x0232:
            r4 = 8
            r17 = 8
            r18 = 8
            r19 = 1
            r20 = 0
            r21 = 0
            goto L_0x024b
        L_0x023f:
            r4 = 8
            r17 = 5
            r18 = 5
            r19 = 0
            r20 = 1
            r21 = 1
        L_0x024b:
            boolean r4 = r2 instanceof v.a
            if (r4 != 0) goto L_0x0263
            boolean r4 = r5 instanceof v.a
            if (r4 == 0) goto L_0x0254
            goto L_0x0263
        L_0x0254:
            r23 = r18
            r26 = r20
            r4 = 5
            r15 = 1
            r22 = 6
            r18 = r14
            r20 = r17
            r17 = 8
            goto L_0x02ae
        L_0x0263:
            r18 = r14
            r26 = r20
            r4 = 5
            r15 = 1
            r22 = 6
            r23 = 4
            r14 = r41
            r20 = r17
            r17 = 8
            goto L_0x039a
        L_0x0275:
            r15 = 2
            r17 = 8
            if (r14 != r15) goto L_0x029b
            boolean r4 = r2 instanceof v.a
            if (r4 != 0) goto L_0x0292
            boolean r4 = r5 instanceof v.a
            if (r4 == 0) goto L_0x0283
            goto L_0x0292
        L_0x0283:
            r18 = r14
            r4 = 5
            r15 = 1
            r19 = 0
            r20 = 5
            r21 = 1
            r22 = 6
            r23 = 5
            goto L_0x02ac
        L_0x0292:
            r18 = r14
            r4 = 5
            r15 = 1
            r19 = 0
            r20 = 5
            goto L_0x02a6
        L_0x029b:
            r15 = 1
            if (r14 != r15) goto L_0x02b2
            r18 = r14
            r4 = 5
            r15 = 1
            r19 = 0
            r20 = 8
        L_0x02a6:
            r21 = 1
            r22 = 6
            r23 = 4
        L_0x02ac:
            r26 = 1
        L_0x02ae:
            r14 = r41
            goto L_0x039a
        L_0x02b2:
            r15 = 3
            if (r14 != r15) goto L_0x0333
            int r15 = r0.A
            r18 = r14
            r14 = -1
            if (r15 != r14) goto L_0x02d6
            r14 = r41
            r4 = 5
            r15 = 1
            r19 = 1
            r20 = 8
            r21 = 1
            if (r54 == 0) goto L_0x02d0
            if (r37 == 0) goto L_0x02cd
            r22 = 5
            goto L_0x02d2
        L_0x02cd:
            r22 = 4
            goto L_0x02d2
        L_0x02d0:
            r22 = 8
        L_0x02d2:
            r23 = 5
            goto L_0x0398
        L_0x02d6:
            if (r51 == 0) goto L_0x02f9
            r14 = r57
            r15 = 2
            if (r14 == r15) goto L_0x02e3
            r15 = 1
            if (r14 != r15) goto L_0x02e1
            goto L_0x02e4
        L_0x02e1:
            r4 = 0
            goto L_0x02e5
        L_0x02e3:
            r15 = 1
        L_0x02e4:
            r4 = 1
        L_0x02e5:
            if (r4 != 0) goto L_0x02eb
            r4 = 8
            r14 = 5
            goto L_0x02ed
        L_0x02eb:
            r4 = 5
            r14 = 4
        L_0x02ed:
            r20 = r4
            r23 = r14
            r4 = 5
            r19 = 1
            r21 = 1
            r22 = 6
            goto L_0x02ac
        L_0x02f9:
            r15 = 1
            if (r4 <= 0) goto L_0x0308
            r14 = r41
            r4 = 5
            r19 = 1
            r20 = 5
            r21 = 1
            r22 = 6
            goto L_0x02d2
        L_0x0308:
            if (r4 != 0) goto L_0x032d
            if (r12 != 0) goto L_0x032d
            if (r54 != 0) goto L_0x031d
            r14 = r41
            r4 = 5
            r19 = 1
            r20 = 5
            r21 = 1
            r22 = 6
            r23 = 8
            goto L_0x0398
        L_0x031d:
            if (r2 == r13) goto L_0x0323
            if (r5 == r13) goto L_0x0323
            r4 = 4
            goto L_0x0324
        L_0x0323:
            r4 = 5
        L_0x0324:
            r14 = r41
            r20 = r4
            r4 = 5
            r19 = 1
            goto L_0x0392
        L_0x032d:
            r14 = r41
            r4 = 5
            r19 = 1
            goto L_0x0390
        L_0x0333:
            r18 = r14
            r15 = 1
            r14 = r41
            r4 = 5
            r19 = 0
            r20 = 5
            r21 = 0
            r22 = 6
            r23 = 4
            r26 = 0
            goto L_0x039a
        L_0x0346:
            r18 = r14
            r15 = 1
            r17 = 8
            boolean r4 = r7.f25317f
            if (r4 == 0) goto L_0x038b
            boolean r4 = r6.f25317f
            if (r4 == 0) goto L_0x038b
            int r2 = r44.d()
            int r3 = r45.d()
            r4 = 8
            r51 = r35
            r52 = r9
            r53 = r7
            r54 = r2
            r55 = r50
            r56 = r6
            r57 = r8
            r58 = r3
            r59 = r4
            r51.b(r52, r53, r54, r55, r56, r57, r58, r59)
            if (r37 == 0) goto L_0x038a
            if (r11 == 0) goto L_0x038a
            v.d r2 = r1.f26234f
            if (r2 == 0) goto L_0x0381
            int r1 = r45.d()
            r14 = r41
            goto L_0x0384
        L_0x0381:
            r14 = r41
            r1 = 0
        L_0x0384:
            if (r6 == r14) goto L_0x038a
            r4 = 5
            r10.f(r14, r8, r1, r4)
        L_0x038a:
            return
        L_0x038b:
            r14 = r41
            r4 = 5
            r19 = 0
        L_0x0390:
            r20 = 5
        L_0x0392:
            r21 = 1
            r22 = 6
            r23 = 4
        L_0x0398:
            r26 = 1
        L_0x039a:
            if (r26 == 0) goto L_0x03a5
            if (r7 != r6) goto L_0x03a5
            if (r2 == r13) goto L_0x03a5
            r24 = 0
            r26 = 0
            goto L_0x03a7
        L_0x03a5:
            r24 = 1
        L_0x03a7:
            if (r21 == 0) goto L_0x03f5
            if (r28 != 0) goto L_0x03bc
            if (r52 != 0) goto L_0x03bc
            if (r54 != 0) goto L_0x03bc
            if (r7 != r3) goto L_0x03bc
            if (r6 != r14) goto L_0x03bc
            r20 = 0
            r21 = 8
            r22 = 8
            r24 = 0
            goto L_0x03c0
        L_0x03bc:
            r21 = r20
            r20 = r37
        L_0x03c0:
            int r27 = r44.d()
            int r29 = r45.d()
            r15 = r1
            r1 = r35
            r14 = r2
            r2 = r9
            r15 = r3
            r3 = r7
            r30 = 5
            r4 = r27
            r39 = r11
            r25 = 0
            r11 = r5
            r5 = r50
            r36 = r6
            r42 = r12
            r12 = 8
            r17 = 4
            r25 = 1
            r31 = r7
            r7 = r8
            r32 = r8
            r8 = r29
            r33 = r9
            r9 = r22
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r24
            goto L_0x0410
        L_0x03f5:
            r14 = r2
            r15 = r3
            r36 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r39 = r11
            r42 = r12
            r12 = 8
            r17 = 4
            r25 = 1
            r11 = r5
            r21 = r20
            r6 = r24
            r20 = r37
        L_0x0410:
            int r1 = r0.f26264i0
            if (r1 != r12) goto L_0x041b
            boolean r1 = r45.f()
            if (r1 != 0) goto L_0x041b
            return
        L_0x041b:
            if (r26 == 0) goto L_0x044d
            if (r20 == 0) goto L_0x0431
            r2 = r36
            r1 = r31
            if (r1 == r2) goto L_0x0435
            if (r28 != 0) goto L_0x0435
            boolean r3 = r14 instanceof v.a
            if (r3 != 0) goto L_0x042f
            boolean r3 = r11 instanceof v.a
            if (r3 == 0) goto L_0x0435
        L_0x042f:
            r3 = 6
            goto L_0x0437
        L_0x0431:
            r2 = r36
            r1 = r31
        L_0x0435:
            r3 = r21
        L_0x0437:
            int r4 = r44.d()
            r5 = r33
            r10.f(r5, r1, r4, r3)
            int r4 = r45.d()
            int r4 = -r4
            r7 = r32
            r10.g(r7, r2, r4, r3)
            r21 = r3
            goto L_0x0455
        L_0x044d:
            r2 = r36
            r1 = r31
            r7 = r32
            r5 = r33
        L_0x0455:
            if (r20 == 0) goto L_0x0467
            if (r55 == 0) goto L_0x0467
            boolean r3 = r14 instanceof v.a
            if (r3 != 0) goto L_0x0467
            boolean r3 = r11 instanceof v.a
            if (r3 != 0) goto L_0x0467
            if (r11 == r13) goto L_0x0467
            r3 = 6
            r4 = 6
            r6 = 1
            goto L_0x046b
        L_0x0467:
            r3 = r21
            r4 = r23
        L_0x046b:
            if (r6 == 0) goto L_0x04b3
            if (r19 == 0) goto L_0x0494
            if (r54 == 0) goto L_0x0473
            if (r38 == 0) goto L_0x0494
        L_0x0473:
            if (r14 == r13) goto L_0x047a
            if (r11 != r13) goto L_0x0478
            goto L_0x047a
        L_0x0478:
            r6 = r4
            goto L_0x047b
        L_0x047a:
            r6 = 6
        L_0x047b:
            boolean r8 = r14 instanceof v.h
            if (r8 != 0) goto L_0x0483
            boolean r8 = r11 instanceof v.h
            if (r8 == 0) goto L_0x0484
        L_0x0483:
            r6 = 5
        L_0x0484:
            boolean r8 = r14 instanceof v.a
            if (r8 != 0) goto L_0x048c
            boolean r8 = r11 instanceof v.a
            if (r8 == 0) goto L_0x048d
        L_0x048c:
            r6 = 5
        L_0x048d:
            if (r54 == 0) goto L_0x0490
            r6 = 5
        L_0x0490:
            int r4 = java.lang.Math.max(r6, r4)
        L_0x0494:
            r6 = r4
            if (r20 == 0) goto L_0x04a4
            int r6 = java.lang.Math.min(r3, r6)
            if (r51 == 0) goto L_0x04a4
            if (r54 != 0) goto L_0x04a4
            if (r14 == r13) goto L_0x04a3
            if (r11 != r13) goto L_0x04a4
        L_0x04a3:
            r6 = 4
        L_0x04a4:
            int r3 = r44.d()
            r10.d(r5, r1, r3, r6)
            int r3 = r45.d()
            int r3 = -r3
            r10.d(r7, r2, r3, r6)
        L_0x04b3:
            if (r20 == 0) goto L_0x04c3
            if (r15 != r1) goto L_0x04bc
            int r6 = r44.d()
            goto L_0x04bd
        L_0x04bc:
            r6 = 0
        L_0x04bd:
            if (r1 == r15) goto L_0x04c3
            r1 = 5
            r10.f(r5, r15, r6, r1)
        L_0x04c3:
            if (r20 == 0) goto L_0x04dd
            if (r28 == 0) goto L_0x04dd
            if (r48 != 0) goto L_0x04dd
            if (r42 != 0) goto L_0x04dd
            if (r28 == 0) goto L_0x04d7
            r14 = r18
            r1 = 3
            if (r14 != r1) goto L_0x04d7
            r1 = 0
            r10.f(r7, r5, r1, r12)
            goto L_0x04de
        L_0x04d7:
            r1 = 0
            r3 = 5
            r10.f(r7, r5, r1, r3)
            goto L_0x04e8
        L_0x04dd:
            r1 = 0
        L_0x04de:
            r3 = 5
            goto L_0x04e8
        L_0x04e0:
            r2 = r6
            r7 = r8
            r39 = r11
            goto L_0x01bd
        L_0x04e6:
            r20 = r37
        L_0x04e8:
            r6 = 5
        L_0x04e9:
            if (r20 == 0) goto L_0x04fe
            if (r39 == 0) goto L_0x04fe
            r3 = r45
            v.d r4 = r3.f26234f
            if (r4 == 0) goto L_0x04f7
            int r1 = r45.d()
        L_0x04f7:
            r3 = r41
            if (r2 == r3) goto L_0x04fe
            r10.f(r3, r7, r1, r6)
        L_0x04fe:
            return
        L_0x04ff:
            r3 = r41
            r4 = r2
            r7 = r8
            r5 = r9
            r39 = r11
            r1 = 0
            r12 = 8
            r25 = 1
            r2 = r40
            r6 = 2
        L_0x050e:
            if (r4 >= r6) goto L_0x0547
            if (r37 == 0) goto L_0x0547
            if (r39 == 0) goto L_0x0547
            r10.f(r5, r2, r1, r12)
            if (r36 != 0) goto L_0x0522
            v.d r2 = r0.N
            v.d r2 = r2.f26234f
            if (r2 != 0) goto L_0x0520
            goto L_0x0522
        L_0x0520:
            r6 = 0
            goto L_0x0523
        L_0x0522:
            r6 = 1
        L_0x0523:
            if (r36 != 0) goto L_0x0542
            v.d r2 = r0.N
            v.d r2 = r2.f26234f
            if (r2 == 0) goto L_0x0542
            v.f r2 = r2.f26232d
            float r4 = r2.Y
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0541
            int[] r2 = r2.U
            r4 = r2[r1]
            r5 = 3
            if (r4 != r5) goto L_0x0541
            r2 = r2[r25]
            if (r2 != r5) goto L_0x0541
            r6 = 1
            goto L_0x0542
        L_0x0541:
            r6 = 0
        L_0x0542:
            if (r6 == 0) goto L_0x0547
            r10.f(r3, r7, r1, r12)
        L_0x0547:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.f(t.c, boolean, boolean, boolean, boolean, t.h, t.h, int, boolean, v.d, v.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void g(t.c cVar) {
        cVar.l(this.J);
        cVar.l(this.K);
        cVar.l(this.L);
        cVar.l(this.M);
        if (this.f26252c0 > 0) {
            cVar.l(this.N);
        }
    }

    public void h() {
        if (this.f26253d == null) {
            this.f26253d = new l(this);
        }
        if (this.f26255e == null) {
            this.f26255e = new n(this);
        }
    }

    public d i(d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case b4.f10106f:
                return this.P;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public int j() {
        return w() + this.X;
    }

    public int k(int i10) {
        if (i10 == 0) {
            return m();
        }
        if (i10 == 1) {
            return t();
        }
        return 0;
    }

    public int l() {
        if (this.f26264i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public int m() {
        return this.U[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.M;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v.f n(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            v.d r3 = r2.L
            v.d r0 = r3.f26234f
            if (r0 == 0) goto L_0x001f
            v.d r1 = r0.f26234f
            if (r1 != r3) goto L_0x001f
            v.f r3 = r0.f26232d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            v.d r3 = r2.M
            v.d r0 = r3.f26234f
            if (r0 == 0) goto L_0x001f
            v.d r1 = r0.f26234f
            if (r1 != r3) goto L_0x001f
            v.f r3 = r0.f26232d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.n(int):v.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v.f o(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            v.d r3 = r2.J
            v.d r0 = r3.f26234f
            if (r0 == 0) goto L_0x001f
            v.d r1 = r0.f26234f
            if (r1 != r3) goto L_0x001f
            v.f r3 = r0.f26232d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            v.d r3 = r2.K
            v.d r0 = r3.f26234f
            if (r0 == 0) goto L_0x001f
            v.d r1 = r0.f26234f
            if (r1 != r3) goto L_0x001f
            v.f r3 = r0.f26232d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.o(int):v.f");
    }

    public int p() {
        return v() + this.W;
    }

    public void q(StringBuilder sb2) {
        StringBuilder a10 = a.a("  ");
        a10.append(this.f26265j);
        a10.append(":{\n");
        sb2.append(a10.toString());
        sb2.append("    actualWidth:" + this.W);
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.X);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f26248a0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f26250b0);
        sb2.append("\n");
        s(sb2, "left", this.J);
        s(sb2, "top", this.K);
        s(sb2, "right", this.L);
        s(sb2, "bottom", this.M);
        s(sb2, "baseline", this.N);
        s(sb2, "centerX", this.O);
        s(sb2, "centerY", this.P);
        int i10 = this.W;
        int i11 = this.f26254d0;
        int i12 = this.C[0];
        int i13 = this.f26284u;
        int i14 = this.f26281r;
        float f10 = this.f26286w;
        float f11 = this.f26272m0[0];
        r(sb2, "    width", i10, i11, i12, i13, i14, f10);
        int i15 = this.X;
        int i16 = this.f26256e0;
        int i17 = this.C[1];
        int i18 = this.f26287x;
        int i19 = this.f26282s;
        float f12 = this.f26289z;
        float f13 = this.f26272m0[1];
        r(sb2, "    height", i15, i16, i17, i18, i19, f12);
        float f14 = this.Y;
        int i20 = this.Z;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        I(sb2, "    horizontalBias", this.f26258f0, 0.5f);
        I(sb2, "    verticalBias", this.f26260g0, 0.5f);
        J(sb2, "    horizontalChainStyle", this.f26268k0, 0);
        J(sb2, "    verticalChainStyle", this.f26270l0, 0);
        sb2.append("  }");
    }

    public final void r(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        J(sb2, "      size", i10, 0);
        J(sb2, "      min", i11, 0);
        J(sb2, "      max", i12, Integer.MAX_VALUE);
        J(sb2, "      matchMin", i13, 0);
        J(sb2, "      matchDef", i14, 0);
        I(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public final void s(StringBuilder sb2, String str, d dVar) {
        if (dVar.f26234f != null) {
            sb2.append("    ");
            sb2.append(str);
            sb2.append(" : [ '");
            sb2.append(dVar.f26234f);
            sb2.append("'");
            if (!(dVar.f26236h == Integer.MIN_VALUE && dVar.f26235g == 0)) {
                sb2.append(",");
                sb2.append(dVar.f26235g);
                if (dVar.f26236h != Integer.MIN_VALUE) {
                    sb2.append(",");
                    sb2.append(dVar.f26236h);
                    sb2.append(",");
                }
            }
            sb2.append(" ] ,\n");
        }
    }

    public int t() {
        return this.U[1];
    }

    public String toString() {
        String str = "";
        StringBuilder a10 = a.a(str);
        if (this.f26266j0 != null) {
            str = e.a(a.a("id: "), this.f26266j0, " ");
        }
        a10.append(str);
        a10.append("(");
        a10.append(this.f26248a0);
        a10.append(", ");
        a10.append(this.f26250b0);
        a10.append(") - (");
        a10.append(this.W);
        a10.append(" x ");
        return e.a(a10, this.X, ")");
    }

    public int u() {
        if (this.f26264i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public int v() {
        f fVar = this.V;
        if (fVar == null || !(fVar instanceof g)) {
            return this.f26248a0;
        }
        return ((g) fVar).f26296y0 + this.f26248a0;
    }

    public int w() {
        f fVar = this.V;
        if (fVar == null || !(fVar instanceof g)) {
            return this.f26250b0;
        }
        return ((g) fVar).f26297z0 + this.f26250b0;
    }

    public boolean x(int i10) {
        if (i10 == 0) {
            return (this.J.f26234f != null ? 1 : 0) + (this.L.f26234f != null ? 1 : 0) < 2;
        }
        if ((this.K.f26234f != null ? 1 : 0) + (this.M.f26234f != null ? 1 : 0) + (this.N.f26234f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public boolean y(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.J.f26234f;
            if (dVar3 != null && dVar3.f26231c && (dVar2 = this.L.f26234f) != null && dVar2.f26231c) {
                if ((dVar2.c() - this.L.d()) - (this.J.d() + this.J.f26234f.c()) >= i11) {
                    return true;
                }
                return false;
            }
        } else {
            d dVar4 = this.K.f26234f;
            if (dVar4 != null && dVar4.f26231c && (dVar = this.M.f26234f) != null && dVar.f26231c) {
                if ((dVar.c() - this.M.d()) - (this.K.d() + this.K.f26234f.c()) >= i11) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean z(int i10) {
        int i11 = i10 * 2;
        d[] dVarArr = this.R;
        if (!(dVarArr[i11].f26234f == null || dVarArr[i11].f26234f.f26234f == dVarArr[i11])) {
            int i12 = i11 + 1;
            return dVarArr[i12].f26234f != null && dVarArr[i12].f26234f.f26234f == dVarArr[i12];
        }
    }
}
