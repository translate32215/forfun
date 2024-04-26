package androidx.leanback.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.d0;
import androidx.leanback.widget.o;
import androidx.leanback.widget.t1;
import androidx.leanback.widget.y;
import androidx.leanback.widget.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.q;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.reflect.KProperty;
import o0.c0;
import p0.c;
import s.g;
import ud.k;

/* compiled from: GridLayoutManager */
public final class p extends RecyclerView.m {

    /* renamed from: h0  reason: collision with root package name */
    public static final Rect f2460h0 = new Rect();

    /* renamed from: i0  reason: collision with root package name */
    public static int[] f2461i0 = new int[2];
    public j0 A = null;
    public ArrayList<k0> B = null;
    public i0 C = null;
    public int D = -1;
    public int E = 0;
    public c F;
    public e G;
    public int H = 0;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T = 8388659;
    public int U;
    public int V = 1;
    public o W;
    public int X = 0;
    public final t1 Y = new t1();
    public final y Z = new y();

    /* renamed from: a0  reason: collision with root package name */
    public int f2462a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2463b0;

    /* renamed from: c0  reason: collision with root package name */
    public int[] f2464c0 = new int[2];

    /* renamed from: d0  reason: collision with root package name */
    public final s1 f2465d0 = new s1();

    /* renamed from: e0  reason: collision with root package name */
    public l f2466e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Runnable f2467f0 = new a();

    /* renamed from: g0  reason: collision with root package name */
    public o.b f2468g0 = new b();

    /* renamed from: p  reason: collision with root package name */
    public int f2469p = 10;

    /* renamed from: q  reason: collision with root package name */
    public final e f2470q;

    /* renamed from: r  reason: collision with root package name */
    public int f2471r = 0;

    /* renamed from: s  reason: collision with root package name */
    public q f2472s = new androidx.recyclerview.widget.o(this);

    /* renamed from: t  reason: collision with root package name */
    public RecyclerView.x f2473t;

    /* renamed from: u  reason: collision with root package name */
    public int f2474u;

    /* renamed from: v  reason: collision with root package name */
    public int f2475v;

    /* renamed from: w  reason: collision with root package name */
    public final SparseIntArray f2476w = new SparseIntArray();

    /* renamed from: x  reason: collision with root package name */
    public int[] f2477x;

    /* renamed from: y  reason: collision with root package name */
    public RecyclerView.s f2478y;

    /* renamed from: z  reason: collision with root package name */
    public int f2479z = 221696;

    /* compiled from: GridLayoutManager */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            p.this.I0();
        }
    }

    /* compiled from: GridLayoutManager */
    public class b implements o.b {
        public b() {
        }

        public void a(Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            e eVar;
            int i16;
            SparseArray d10;
            View view = (View) obj;
            if (i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
                p pVar = p.this;
                boolean z10 = pVar.W.f2441c;
                t1 t1Var = pVar.Y;
                if (!z10) {
                    i13 = t1Var.f2531c.f2542j;
                } else {
                    t1.a aVar = t1Var.f2531c;
                    i13 = aVar.f2541i - aVar.f2543k;
                }
            }
            p pVar2 = p.this;
            if (!pVar2.W.f2441c) {
                i14 = i11 + i13;
                i15 = i13;
            } else {
                i15 = i13 - i11;
                i14 = i13;
            }
            int k12 = pVar2.k1(i12);
            p pVar3 = p.this;
            int i17 = (k12 + pVar3.Y.f2532d.f2542j) - pVar3.K;
            s1 s1Var = pVar3.f2465d0;
            if (!(s1Var.f2523c == null || (d10 = s1Var.f2523c.d(Integer.toString(i10))) == null)) {
                view.restoreHierarchyState(d10);
            }
            p.this.y1(i12, view, i15, i14, i17);
            p pVar4 = p.this;
            if (!pVar4.f2473t.f2937g) {
                pVar4.V1();
            }
            p pVar5 = p.this;
            if (!((pVar5.f2479z & 3) == 1 || (eVar = pVar5.G) == null)) {
                if (eVar.f2492s && (i16 = eVar.f2493t) != 0) {
                    eVar.f2493t = p.this.E1(true, i16);
                }
                int i18 = eVar.f2493t;
                if (i18 == 0 || ((i18 > 0 && p.this.v1()) || (eVar.f2493t < 0 && p.this.u1()))) {
                    eVar.f2916a = p.this.D;
                    eVar.f();
                }
            }
            p pVar6 = p.this;
            if (pVar6.C != null) {
                RecyclerView.a0 K = pVar6.f2470q.K(view);
                p pVar7 = p.this;
                i0 i0Var = pVar7.C;
                e eVar2 = pVar7.f2470q;
                bc.c cVar = (bc.c) ((r0.b) i0Var).f24479b;
                KProperty<Object>[] kPropertyArr = bc.c.f3871y0;
                k.f(cVar, "this$0");
                if (i10 == 0) {
                    cVar.t0();
                }
            }
        }

        /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object[]] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d4 A[ADDED_TO_REGION] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(int r9, boolean r10, java.lang.Object[] r11, boolean r12) {
            /*
                r8 = this;
                androidx.leanback.widget.p r0 = androidx.leanback.widget.p.this
                int r1 = r0.f2474u
                int r1 = r9 - r1
                androidx.recyclerview.widget.RecyclerView$s r0 = r0.f2478y
                r2 = 0
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.l(r1, r2, r3)
                android.view.View r0 = r0.f2842a
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                androidx.leanback.widget.p$d r1 = (androidx.leanback.widget.p.d) r1
                androidx.leanback.widget.p r3 = androidx.leanback.widget.p.this
                androidx.leanback.widget.e r3 = r3.f2470q
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.K(r0)
                androidx.leanback.widget.p r4 = androidx.leanback.widget.p.this
                java.lang.Class<androidx.leanback.widget.z> r5 = androidx.leanback.widget.z.class
                r4.getClass()
                boolean r6 = r3 instanceof androidx.leanback.widget.k
                r7 = 0
                if (r6 == 0) goto L_0x0036
                r6 = r3
                androidx.leanback.widget.k r6 = (androidx.leanback.widget.k) r6
                java.lang.Object r6 = r6.a(r5)
                goto L_0x0037
            L_0x0036:
                r6 = r7
            L_0x0037:
                if (r6 != 0) goto L_0x0049
                androidx.leanback.widget.l r4 = r4.f2466e0
                if (r4 == 0) goto L_0x0049
                int r3 = r3.f2847f
                androidx.leanback.widget.k r3 = r4.a(r3)
                if (r3 == 0) goto L_0x0049
                java.lang.Object r6 = r3.a(r5)
            L_0x0049:
                androidx.leanback.widget.z r6 = (androidx.leanback.widget.z) r6
                r1.f2491l = r6
                boolean r1 = r1.d()
                if (r1 != 0) goto L_0x014a
                r1 = -1
                r3 = 1
                if (r12 == 0) goto L_0x0065
                if (r10 == 0) goto L_0x005f
                androidx.leanback.widget.p r10 = androidx.leanback.widget.p.this
                r10.d(r0, r1, r3)
                goto L_0x0072
            L_0x005f:
                androidx.leanback.widget.p r10 = androidx.leanback.widget.p.this
                r10.d(r0, r2, r3)
                goto L_0x0072
            L_0x0065:
                if (r10 == 0) goto L_0x006d
                androidx.leanback.widget.p r10 = androidx.leanback.widget.p.this
                r10.d(r0, r1, r2)
                goto L_0x0072
            L_0x006d:
                androidx.leanback.widget.p r10 = androidx.leanback.widget.p.this
                r10.d(r0, r2, r2)
            L_0x0072:
                androidx.leanback.widget.p r10 = androidx.leanback.widget.p.this
                int r10 = r10.J
                if (r10 == r1) goto L_0x007b
                r0.setVisibility(r10)
            L_0x007b:
                androidx.leanback.widget.p r10 = androidx.leanback.widget.p.this
                androidx.leanback.widget.p$e r10 = r10.G
                if (r10 == 0) goto L_0x00f2
                boolean r12 = r10.f2492s
                if (r12 != 0) goto L_0x00f2
                int r12 = r10.f2493t
                if (r12 != 0) goto L_0x008b
                goto L_0x00f2
            L_0x008b:
                if (r12 <= 0) goto L_0x0095
                androidx.leanback.widget.p r12 = androidx.leanback.widget.p.this
                int r1 = r12.D
                int r12 = r12.U
                r4 = r8
                goto L_0x00cd
            L_0x0095:
                androidx.leanback.widget.p r12 = androidx.leanback.widget.p.this
                int r1 = r12.D
                int r12 = r12.U
                r4 = r8
            L_0x009c:
                int r1 = r1 - r12
            L_0x009d:
                int r12 = r10.f2493t
                if (r12 == 0) goto L_0x00d4
                android.view.View r12 = r10.b(r1)
                if (r12 != 0) goto L_0x00a8
                goto L_0x00d4
            L_0x00a8:
                androidx.leanback.widget.p r5 = androidx.leanback.widget.p.this
                boolean r5 = r5.Z0(r12)
                if (r5 != 0) goto L_0x00b1
                goto L_0x00c5
            L_0x00b1:
                androidx.leanback.widget.p r5 = androidx.leanback.widget.p.this
                r5.D = r1
                r5.E = r2
                int r5 = r10.f2493t
                if (r5 <= 0) goto L_0x00c0
                int r5 = r5 + -1
                r10.f2493t = r5
                goto L_0x00c4
            L_0x00c0:
                int r5 = r5 + 1
                r10.f2493t = r5
            L_0x00c4:
                r7 = r12
            L_0x00c5:
                int r12 = r10.f2493t
                if (r12 <= 0) goto L_0x00cf
                androidx.leanback.widget.p r12 = androidx.leanback.widget.p.this
                int r12 = r12.U
            L_0x00cd:
                int r1 = r1 + r12
                goto L_0x009d
            L_0x00cf:
                androidx.leanback.widget.p r12 = androidx.leanback.widget.p.this
                int r12 = r12.U
                goto L_0x009c
            L_0x00d4:
                if (r7 == 0) goto L_0x00f3
                androidx.leanback.widget.p r12 = androidx.leanback.widget.p.this
                boolean r12 = r12.X()
                if (r12 == 0) goto L_0x00f3
                androidx.leanback.widget.p r12 = androidx.leanback.widget.p.this
                int r1 = r12.f2479z
                r1 = r1 | 32
                r12.f2479z = r1
                r7.requestFocus()
                androidx.leanback.widget.p r10 = androidx.leanback.widget.p.this
                int r12 = r10.f2479z
                r12 = r12 & -33
                r10.f2479z = r12
                goto L_0x00f3
            L_0x00f2:
                r4 = r8
            L_0x00f3:
                androidx.leanback.widget.p r10 = androidx.leanback.widget.p.this
                android.view.View r12 = r0.findFocus()
                int r10 = r10.o1(r0, r12)
                androidx.leanback.widget.p r12 = androidx.leanback.widget.p.this
                int r1 = r12.f2479z
                r5 = r1 & 3
                if (r5 == r3) goto L_0x0115
                int r1 = r12.D
                if (r9 != r1) goto L_0x0144
                int r9 = r12.E
                if (r10 != r9) goto L_0x0144
                androidx.leanback.widget.p$e r9 = r12.G
                if (r9 != 0) goto L_0x0144
                r12.a1()
                goto L_0x0144
            L_0x0115:
                r3 = r1 & 4
                if (r3 != 0) goto L_0x0144
                r1 = r1 & 16
                if (r1 != 0) goto L_0x0129
                int r3 = r12.D
                if (r9 != r3) goto L_0x0129
                int r3 = r12.E
                if (r10 != r3) goto L_0x0129
                r12.a1()
                goto L_0x0144
            L_0x0129:
                if (r1 == 0) goto L_0x0144
                int r12 = r12.D
                if (r9 < r12) goto L_0x0144
                boolean r12 = r0.hasFocusable()
                if (r12 == 0) goto L_0x0144
                androidx.leanback.widget.p r12 = androidx.leanback.widget.p.this
                r12.D = r9
                r12.E = r10
                int r9 = r12.f2479z
                r9 = r9 & -17
                r12.f2479z = r9
                r12.a1()
            L_0x0144:
                androidx.leanback.widget.p r9 = androidx.leanback.widget.p.this
                r9.A1(r0)
                goto L_0x014b
            L_0x014a:
                r4 = r8
            L_0x014b:
                r11[r2] = r0
                androidx.leanback.widget.p r9 = androidx.leanback.widget.p.this
                int r10 = r9.f2471r
                if (r10 != 0) goto L_0x0158
                int r9 = r9.h1(r0)
                goto L_0x015c
            L_0x0158:
                int r9 = r9.g1(r0)
            L_0x015c:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.b.b(int, boolean, java.lang.Object[], boolean):int");
        }

        public int c() {
            return p.this.f2473t.b() + p.this.f2474u;
        }

        public int d(int i10) {
            p pVar = p.this;
            View v10 = pVar.v(i10 - pVar.f2474u);
            p pVar2 = p.this;
            return (pVar2.f2479z & 262144) != 0 ? pVar2.s1(v10) : pVar2.t1(v10);
        }

        public int e(int i10) {
            p pVar = p.this;
            View v10 = pVar.v(i10 - pVar.f2474u);
            Rect rect = p.f2460h0;
            pVar.E(v10, rect);
            return pVar.f2471r == 0 ? rect.width() : rect.height();
        }

        public void f(int i10) {
            p pVar = p.this;
            View v10 = pVar.v(i10 - pVar.f2474u);
            p pVar2 = p.this;
            if ((pVar2.f2479z & 3) == 1) {
                pVar2.t(v10, pVar2.f2478y);
            } else {
                pVar2.D0(v10, pVar2.f2478y);
            }
        }
    }

    /* compiled from: GridLayoutManager */
    public abstract class c extends m {

        /* renamed from: q  reason: collision with root package name */
        public boolean f2482q;

        public c() {
            super(p.this.f2470q.getContext());
        }

        public void d() {
            this.f3130p = 0;
            this.f3129o = 0;
            this.f3125k = null;
            if (!this.f2482q) {
                l();
            }
            p pVar = p.this;
            if (pVar.F == this) {
                pVar.F = null;
            }
            if (pVar.G == this) {
                pVar.G = null;
            }
        }

        public void e(View view, RecyclerView.x xVar, RecyclerView.w.a aVar) {
            int i10;
            int i11;
            if (p.this.l1(view, (View) null, p.f2461i0)) {
                if (p.this.f2471r == 0) {
                    int[] iArr = p.f2461i0;
                    i10 = iArr[0];
                    i11 = iArr[1];
                } else {
                    int[] iArr2 = p.f2461i0;
                    int i12 = iArr2[1];
                    i11 = iArr2[0];
                    i10 = i12;
                }
                aVar.b(i10, i11, i((int) Math.sqrt((double) ((i11 * i11) + (i10 * i10)))), this.f3124j);
            }
        }

        public int j(int i10) {
            int j10 = super.j(i10);
            int i11 = p.this.Y.f2531c.f2541i;
            if (i11 <= 0) {
                return j10;
            }
            float f10 = (30.0f / ((float) i11)) * ((float) i10);
            return ((float) j10) < f10 ? (int) f10 : j10;
        }

        public void l() {
            View b10 = b(this.f2916a);
            if (b10 == null) {
                int i10 = this.f2916a;
                if (i10 >= 0) {
                    p.this.K1(i10, 0, false, 0);
                    return;
                }
                return;
            }
            p pVar = p.this;
            int i11 = pVar.D;
            int i12 = this.f2916a;
            if (i11 != i12) {
                pVar.D = i12;
            }
            if (pVar.X()) {
                p.this.f2479z |= 32;
                b10.requestFocus();
                p.this.f2479z &= -33;
            }
            p.this.a1();
            p.this.b1();
        }
    }

    /* compiled from: GridLayoutManager */
    public static final class d extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public int f2484e;

        /* renamed from: f  reason: collision with root package name */
        public int f2485f;

        /* renamed from: g  reason: collision with root package name */
        public int f2486g;

        /* renamed from: h  reason: collision with root package name */
        public int f2487h;

        /* renamed from: i  reason: collision with root package name */
        public int f2488i;

        /* renamed from: j  reason: collision with root package name */
        public int f2489j;

        /* renamed from: k  reason: collision with root package name */
        public int[] f2490k;

        /* renamed from: l  reason: collision with root package name */
        public z f2491l;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e(View view) {
            return (view.getWidth() - this.f2484e) - this.f2486g;
        }

        public d(int i10, int i11) {
            super(i10, i11);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(RecyclerView.n nVar) {
            super(nVar);
        }

        public d(d dVar) {
            super((RecyclerView.n) dVar);
        }
    }

    /* compiled from: GridLayoutManager */
    public final class e extends c {

        /* renamed from: s  reason: collision with root package name */
        public final boolean f2492s;

        /* renamed from: t  reason: collision with root package name */
        public int f2493t;

        public e(int i10, boolean z10) {
            super();
            this.f2493t = i10;
            this.f2492s = z10;
            this.f2916a = -2;
        }

        public PointF a(int i10) {
            int i11 = this.f2493t;
            if (i11 == 0) {
                return null;
            }
            p pVar = p.this;
            int i12 = ((pVar.f2479z & 262144) == 0 ? i11 >= 0 : i11 <= 0) ? 1 : -1;
            if (pVar.f2471r == 0) {
                return new PointF((float) i12, 0.0f);
            }
            return new PointF(0.0f, (float) i12);
        }

        public void k(RecyclerView.w.a aVar) {
            if (this.f2493t != 0) {
                super.k(aVar);
            }
        }

        public void l() {
            super.l();
            this.f2493t = 0;
            View b10 = b(this.f2916a);
            if (b10 != null) {
                p.this.M1(b10, true);
            }
        }
    }

    public p(e eVar) {
        this.f2470q = eVar;
        this.J = -1;
        if (this.f2883i) {
            this.f2883i = false;
            this.f2884j = 0;
            RecyclerView recyclerView = this.f2876b;
            if (recyclerView != null) {
                recyclerView.f2798b.n();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r5 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r5 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r7 == p0.c.a.f23761o.a()) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0(androidx.recyclerview.widget.RecyclerView.s r5, androidx.recyclerview.widget.RecyclerView.x r6, int r7, android.os.Bundle r8) {
        /*
            r4 = this;
            int r8 = r4.f2479z
            r0 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 & r0
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x000b
            r8 = 1
            goto L_0x000c
        L_0x000b:
            r8 = 0
        L_0x000c:
            if (r8 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r4.H1(r5, r6)
            int r5 = r4.f2479z
            r6 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 & r6
            if (r5 == 0) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r6 < r8) goto L_0x0057
            int r6 = r4.f2471r
            if (r6 != 0) goto L_0x0045
            p0.c$a r6 = p0.c.a.f23760n
            int r6 = r6.a()
            if (r7 != r6) goto L_0x003a
            if (r5 == 0) goto L_0x0037
        L_0x0034:
            r7 = 4096(0x1000, float:5.74E-42)
            goto L_0x0057
        L_0x0037:
            r7 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0057
        L_0x003a:
            p0.c$a r6 = p0.c.a.f23762p
            int r6 = r6.a()
            if (r7 != r6) goto L_0x0057
            if (r5 == 0) goto L_0x0034
            goto L_0x0037
        L_0x0045:
            p0.c$a r5 = p0.c.a.f23759m
            int r5 = r5.a()
            if (r7 != r5) goto L_0x004e
            goto L_0x0037
        L_0x004e:
            p0.c$a r5 = p0.c.a.f23761o
            int r5 = r5.a()
            if (r7 != r5) goto L_0x0057
            goto L_0x0034
        L_0x0057:
            if (r7 == r3) goto L_0x0064
            if (r7 == r2) goto L_0x005c
            goto L_0x006a
        L_0x005c:
            r4.C1(r0)
            r5 = -1
            r4.E1(r0, r5)
            goto L_0x006a
        L_0x0064:
            r4.C1(r1)
            r4.E1(r0, r1)
        L_0x006a:
            r4.z1()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.A0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, int, android.os.Bundle):boolean");
    }

    public void A1(View view) {
        int i10;
        int i11;
        int i12;
        d dVar = (d) view.getLayoutParams();
        Rect rect = f2460h0;
        f(view, rect);
        int i13 = dVar.leftMargin + dVar.rightMargin + rect.left + rect.right;
        int i14 = dVar.topMargin + dVar.bottomMargin + rect.top + rect.bottom;
        if (this.L == -2) {
            i10 = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            i10 = View.MeasureSpec.makeMeasureSpec(this.M, 1073741824);
        }
        if (this.f2471r == 0) {
            i11 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i13, dVar.width);
            i12 = ViewGroup.getChildMeasureSpec(i10, i14, dVar.height);
        } else {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i14, dVar.height);
            i11 = ViewGroup.getChildMeasureSpec(i10, i13, dVar.width);
            i12 = childMeasureSpec;
        }
        view.measure(i11, i12);
    }

    public void B0(RecyclerView.s sVar) {
        for (int A2 = A() - 1; A2 >= 0; A2--) {
            E0(A2, sVar);
        }
    }

    public final void B1() {
        this.W.n((this.f2479z & 262144) != 0 ? this.f2462a0 + this.f2463b0 + this.f2475v : (-this.f2463b0) - this.f2475v, false);
    }

    public int C(RecyclerView.s sVar, RecyclerView.x xVar) {
        o oVar;
        if (this.f2471r != 1 || (oVar = this.W) == null) {
            return -1;
        }
        return oVar.f2443e;
    }

    public final void C1(boolean z10) {
        if (z10) {
            if (v1()) {
                return;
            }
        } else if (u1()) {
            return;
        }
        e eVar = this.G;
        int i10 = -1;
        boolean z11 = true;
        if (eVar == null) {
            this.f2470q.p0();
            if (z10) {
                i10 = 1;
            }
            if (this.U <= 1) {
                z11 = false;
            }
            e eVar2 = new e(i10, z11);
            this.H = 0;
            W0(eVar2);
        } else if (z10) {
            int i11 = eVar.f2493t;
            if (i11 < p.this.f2469p) {
                eVar.f2493t = i11 + 1;
            }
        } else {
            int i12 = eVar.f2493t;
            if (i12 > (-p.this.f2469p)) {
                eVar.f2493t = i12 - 1;
            }
        }
    }

    public int D(View view) {
        return super.D(view) - ((d) view.getLayoutParams()).f2487h;
    }

    public final boolean D1(boolean z10) {
        s.d[] dVarArr;
        s.d dVar;
        int i10;
        int i11;
        int i12;
        if (this.M != 0 || this.N == null) {
            return false;
        }
        o oVar = this.W;
        if (oVar == null) {
            dVarArr = null;
        } else {
            dVarArr = oVar.j(oVar.f2444f, oVar.f2445g);
        }
        boolean z11 = false;
        int i13 = -1;
        for (int i14 = 0; i14 < this.U; i14++) {
            if (dVarArr == null) {
                dVar = null;
            } else {
                dVar = dVarArr[i14];
            }
            if (dVar == null) {
                i10 = 0;
            } else {
                i10 = dVar.g();
            }
            int i15 = -1;
            for (int i16 = 0; i16 < i10; i16 += 2) {
                int d10 = dVar.d(i16 + 1);
                for (int d11 = dVar.d(i16); d11 <= d10; d11++) {
                    View v10 = v(d11 - this.f2474u);
                    if (v10 != null) {
                        if (z10) {
                            A1(v10);
                        }
                        if (this.f2471r == 0) {
                            i12 = g1(v10);
                        } else {
                            i12 = h1(v10);
                        }
                        if (i12 > i15) {
                            i15 = i12;
                        }
                    }
                }
            }
            int b10 = this.f2473t.b();
            if (!this.f2470q.B && z10 && i15 < 0 && b10 > 0) {
                if (i13 < 0) {
                    int i17 = this.D;
                    if (i17 < 0) {
                        i17 = 0;
                    } else if (i17 >= b10) {
                        i17 = b10 - 1;
                    }
                    if (A() > 0) {
                        int h10 = this.f2470q.K(z(0)).h();
                        int h11 = this.f2470q.K(z(A() - 1)).h();
                        if (i11 >= h10 && i11 <= h11) {
                            i11 = i11 - h10 <= h11 - i11 ? h10 - 1 : h11 + 1;
                            if (i11 < 0 && h11 < b10 - 1) {
                                i11 = h11 + 1;
                            } else if (i11 >= b10 && h10 > 0) {
                                i11 = h10 - 1;
                            }
                        }
                    }
                    if (i11 >= 0 && i11 < b10) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int[] iArr = this.f2464c0;
                        View view = this.f2478y.l(i11, false, Long.MAX_VALUE).f2842a;
                        if (view != null) {
                            d dVar2 = (d) view.getLayoutParams();
                            Rect rect = f2460h0;
                            f(view, rect);
                            view.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, R() + Q() + dVar2.leftMargin + dVar2.rightMargin + rect.left + rect.right, dVar2.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, P() + S() + dVar2.topMargin + dVar2.bottomMargin + rect.top + rect.bottom, dVar2.height));
                            iArr[0] = h1(view);
                            iArr[1] = g1(view);
                            this.f2478y.i(view);
                        }
                        i13 = this.f2471r == 0 ? this.f2464c0[1] : this.f2464c0[0];
                    }
                }
                if (i13 >= 0) {
                    i15 = i13;
                }
            }
            if (i15 < 0) {
                i15 = 0;
            }
            int[] iArr2 = this.N;
            if (iArr2[i14] != i15) {
                iArr2[i14] = i15;
                z11 = true;
            }
        }
        return z11;
    }

    public void E(View view, Rect rect) {
        super.E(view, rect);
        d dVar = (d) view.getLayoutParams();
        rect.left += dVar.f2484e;
        rect.top += dVar.f2485f;
        rect.right -= dVar.f2486g;
        rect.bottom -= dVar.f2487h;
    }

    public int E1(boolean z10, int i10) {
        o oVar = this.W;
        if (oVar == null) {
            return i10;
        }
        int i11 = this.D;
        int l10 = i11 != -1 ? oVar.l(i11) : -1;
        View view = null;
        int A2 = A();
        for (int i12 = 0; i12 < A2 && i10 != 0; i12++) {
            int i13 = i10 > 0 ? i12 : (A2 - 1) - i12;
            View z11 = z(i13);
            if (Z0(z11)) {
                int e12 = e1(i13);
                int l11 = this.W.l(e12);
                if (l10 == -1) {
                    i11 = e12;
                    view = z11;
                    l10 = l11;
                } else if (l11 == l10 && ((i10 > 0 && e12 > i11) || (i10 < 0 && e12 < i11))) {
                    i10 = i10 > 0 ? i10 - 1 : i10 + 1;
                    i11 = e12;
                    view = z11;
                }
            }
        }
        if (view != null) {
            if (z10) {
                if (X()) {
                    this.f2479z |= 32;
                    view.requestFocus();
                    this.f2479z &= -33;
                }
                this.D = i11;
                this.E = 0;
            } else {
                M1(view, true);
            }
        }
        return i10;
    }

    public int F(View view) {
        return super.F(view) + ((d) view.getLayoutParams()).f2484e;
    }

    public final void F1() {
        int i10 = this.f2479z;
        if ((65600 & i10) == 65536) {
            o oVar = this.W;
            int i11 = this.D;
            int i12 = (i10 & 262144) != 0 ? -this.f2463b0 : this.f2462a0 + this.f2463b0;
            while (true) {
                int i13 = oVar.f2445g;
                if (i13 < oVar.f2444f || i13 <= i11) {
                    break;
                }
                boolean z10 = false;
                if (oVar.f2441c ? ((b) oVar.f2440b).d(i13) <= i12 : ((b) oVar.f2440b).d(i13) >= i12) {
                    z10 = true;
                }
                if (!z10) {
                    break;
                }
                ((b) oVar.f2440b).f(oVar.f2445g);
                oVar.f2445g--;
            }
            oVar.o();
        }
    }

    public boolean G0(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if ((((androidx.leanback.widget.p.b) r1.f2440b).d(r1.f2444f) + r3) <= r0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if ((((androidx.leanback.widget.p.b) r1.f2440b).d(r1.f2444f) - r3) >= r0) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G1() {
        /*
            r8 = this;
            int r0 = r8.f2479z
            r1 = 65600(0x10040, float:9.1925E-41)
            r1 = r1 & r0
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 != r2) goto L_0x0062
            androidx.leanback.widget.o r1 = r8.W
            int r2 = r8.D
            r3 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0019
            int r0 = r8.f2462a0
            int r3 = r8.f2463b0
            int r0 = r0 + r3
            goto L_0x001c
        L_0x0019:
            int r0 = r8.f2463b0
            int r0 = -r0
        L_0x001c:
            int r3 = r1.f2445g
            int r4 = r1.f2444f
            if (r3 < r4) goto L_0x005f
            if (r4 >= r2) goto L_0x005f
            androidx.leanback.widget.o$b r3 = r1.f2440b
            androidx.leanback.widget.p$b r3 = (androidx.leanback.widget.p.b) r3
            int r3 = r3.e(r4)
            boolean r4 = r1.f2441c
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L_0x0040
            androidx.leanback.widget.o$b r4 = r1.f2440b
            int r7 = r1.f2444f
            androidx.leanback.widget.p$b r4 = (androidx.leanback.widget.p.b) r4
            int r4 = r4.d(r7)
            int r4 = r4 + r3
            if (r4 > r0) goto L_0x004e
            goto L_0x004d
        L_0x0040:
            androidx.leanback.widget.o$b r4 = r1.f2440b
            int r7 = r1.f2444f
            androidx.leanback.widget.p$b r4 = (androidx.leanback.widget.p.b) r4
            int r4 = r4.d(r7)
            int r4 = r4 - r3
            if (r4 < r0) goto L_0x004e
        L_0x004d:
            r5 = 1
        L_0x004e:
            if (r5 == 0) goto L_0x005f
            androidx.leanback.widget.o$b r3 = r1.f2440b
            int r4 = r1.f2444f
            androidx.leanback.widget.p$b r3 = (androidx.leanback.widget.p.b) r3
            r3.f(r4)
            int r3 = r1.f2444f
            int r3 = r3 + r6
            r1.f2444f = r3
            goto L_0x001c
        L_0x005f:
            r1.o()
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.G1():void");
    }

    public final void H1(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (!(this.f2478y == null && this.f2473t == null)) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.f2478y = sVar;
        this.f2473t = xVar;
        this.f2474u = 0;
        this.f2475v = 0;
    }

    public int I(View view) {
        return super.I(view) - ((d) view.getLayoutParams()).f2486g;
    }

    public final int I1(int i10) {
        int i11;
        int i12 = this.f2479z;
        boolean z10 = true;
        if ((i12 & 64) == 0 && (i12 & 3) != 1 && (i10 <= 0 ? !(i10 >= 0 || this.Y.f2531c.e() || i10 >= (i11 = this.Y.f2531c.f2536d)) : !(this.Y.f2531c.d() || i10 <= (i11 = this.Y.f2531c.f2535c)))) {
            i10 = i11;
        }
        if (i10 == 0) {
            return 0;
        }
        int i13 = -i10;
        int A2 = A();
        if (this.f2471r == 1) {
            for (int i14 = 0; i14 < A2; i14++) {
                z(i14).offsetTopAndBottom(i13);
            }
        } else {
            for (int i15 = 0; i15 < A2; i15++) {
                z(i15).offsetLeftAndRight(i13);
            }
        }
        if ((this.f2479z & 3) == 1) {
            V1();
            return i10;
        }
        int A3 = A();
        if ((this.f2479z & 262144) == 0 ? i10 >= 0 : i10 <= 0) {
            Y0();
        } else {
            B1();
        }
        boolean z11 = A() > A3;
        int A4 = A();
        if ((262144 & this.f2479z) == 0 ? i10 >= 0 : i10 <= 0) {
            G1();
        } else {
            F1();
        }
        if (A() >= A4) {
            z10 = false;
        }
        if (z11 || z10) {
            U1();
        }
        this.f2470q.invalidate();
        V1();
        return i10;
    }

    public int J(View view) {
        return super.J(view) + ((d) view.getLayoutParams()).f2485f;
    }

    public final int J1(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = -i10;
        int A2 = A();
        if (this.f2471r == 0) {
            while (i11 < A2) {
                z(i11).offsetTopAndBottom(i12);
                i11++;
            }
        } else {
            while (i11 < A2) {
                z(i11).offsetLeftAndRight(i12);
                i11++;
            }
        }
        this.K += i10;
        W1();
        this.f2470q.invalidate();
        return i10;
    }

    public int K0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        int i11;
        if ((this.f2479z & 512) == 0 || !w1()) {
            return 0;
        }
        H1(sVar, xVar);
        this.f2479z = (this.f2479z & -4) | 2;
        if (this.f2471r == 0) {
            i11 = I1(i10);
        } else {
            i11 = J1(i10);
        }
        z1();
        this.f2479z &= -4;
        return i11;
    }

    public void K1(int i10, int i11, boolean z10, int i12) {
        this.I = i12;
        View v10 = v(i10);
        boolean z11 = !a0();
        if (!z11 || this.f2470q.isLayoutRequested() || v10 == null || f1(v10) != i10) {
            int i13 = this.f2479z;
            if ((i13 & 512) == 0 || (i13 & 64) != 0) {
                this.D = i10;
                this.E = i11;
                this.H = Integer.MIN_VALUE;
            } else if (!z10 || this.f2470q.isLayoutRequested()) {
                if (!z11) {
                    c cVar = this.F;
                    if (cVar != null) {
                        cVar.f2482q = true;
                    }
                    this.f2470q.p0();
                }
                if (this.f2470q.isLayoutRequested() || v10 == null || f1(v10) != i10) {
                    this.D = i10;
                    this.E = i11;
                    this.H = Integer.MIN_VALUE;
                    this.f2479z |= 256;
                    I0();
                    return;
                }
                this.f2479z |= 32;
                M1(v10, z10);
                this.f2479z &= -33;
            } else {
                this.D = i10;
                this.E = i11;
                this.H = Integer.MIN_VALUE;
                if (!w1()) {
                    StringBuilder a10 = android.support.v4.media.a.a("GridLayoutManager:");
                    a10.append(this.f2470q.getId());
                    Log.w(a10.toString(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                q qVar = new q(this);
                qVar.f2916a = i10;
                W0(qVar);
                int i14 = qVar.f2916a;
                if (i14 != this.D) {
                    this.D = i14;
                    this.E = 0;
                }
            }
        } else {
            this.f2479z |= 32;
            M1(v10, z10);
            this.f2479z &= -33;
        }
    }

    public void L0(int i10) {
        Q1(i10, 0, false, 0);
    }

    public final void L1(View view, View view2, boolean z10, int i10, int i11) {
        if ((this.f2479z & 64) == 0) {
            int f12 = f1(view);
            int o12 = o1(view, view2);
            if (!(f12 == this.D && o12 == this.E)) {
                this.D = f12;
                this.E = o12;
                this.H = 0;
                if ((this.f2479z & 3) != 1) {
                    a1();
                }
                if (this.f2470q.r0()) {
                    this.f2470q.invalidate();
                }
            }
            if (view != null) {
                if (!view.hasFocus() && this.f2470q.hasFocus()) {
                    view.requestFocus();
                }
                if ((this.f2479z & 131072) == 0 && z10) {
                    return;
                }
                if (l1(view, view2, f2461i0) || i10 != 0 || i11 != 0) {
                    int[] iArr = f2461i0;
                    int i12 = iArr[0] + i10;
                    int i13 = iArr[1] + i11;
                    if ((this.f2479z & 3) == 1) {
                        I1(i12);
                        J1(i13);
                        return;
                    }
                    if (this.f2471r != 0) {
                        int i14 = i12;
                        i12 = i13;
                        i13 = i14;
                    }
                    if (z10) {
                        this.f2470q.i0(i12, i13);
                        return;
                    }
                    this.f2470q.scrollBy(i12, i13);
                    b1();
                }
            }
        }
    }

    public int M0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        int i11;
        if ((this.f2479z & 512) == 0 || !w1()) {
            return 0;
        }
        this.f2479z = (this.f2479z & -4) | 2;
        H1(sVar, xVar);
        if (this.f2471r == 1) {
            i11 = I1(i10);
        } else {
            i11 = J1(i10);
        }
        z1();
        this.f2479z &= -4;
        return i11;
    }

    public void M1(View view, boolean z10) {
        L1(view, view.findFocus(), z10, 0, 0);
    }

    public void N1(View view, boolean z10, int i10, int i11) {
        L1(view, view.findFocus(), z10, i10, i11);
    }

    public void O1(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f2471r = i10;
            this.f2472s = q.a(this, i10);
            t1 t1Var = this.Y;
            t1Var.getClass();
            if (i10 == 0) {
                t1Var.f2531c = t1Var.f2530b;
                t1Var.f2532d = t1Var.f2529a;
            } else {
                t1Var.f2531c = t1Var.f2529a;
                t1Var.f2532d = t1Var.f2530b;
            }
            y yVar = this.Z;
            yVar.getClass();
            if (i10 == 0) {
                yVar.f2563c = yVar.f2562b;
            } else {
                yVar.f2563c = yVar.f2561a;
            }
            this.f2479z |= 256;
        }
    }

    public void P1(int i10) {
        if (i10 >= 0 || i10 == -2) {
            this.L = i10;
            return;
        }
        throw new IllegalArgumentException(d0.a("Invalid row height: ", i10));
    }

    public void Q1(int i10, int i11, boolean z10, int i12) {
        if ((this.D != i10 && i10 != -1) || i11 != this.E || i12 != this.I) {
            K1(i10, i11, z10, i12);
        }
    }

    public final void R1() {
        int A2 = A();
        for (int i10 = 0; i10 < A2; i10++) {
            S1(z(i10));
        }
    }

    public final void S1(View view) {
        d dVar = (d) view.getLayoutParams();
        z zVar = dVar.f2491l;
        if (zVar == null) {
            y.a aVar = this.Z.f2562b;
            dVar.f2488i = a0.a(view, aVar, aVar.f2564e);
            y.a aVar2 = this.Z.f2561a;
            dVar.f2489j = a0.a(view, aVar2, aVar2.f2564e);
            return;
        }
        int i10 = this.f2471r;
        z.a[] aVarArr = zVar.f2581a;
        int[] iArr = dVar.f2490k;
        if (iArr == null || iArr.length != aVarArr.length) {
            dVar.f2490k = new int[aVarArr.length];
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            dVar.f2490k[i11] = a0.a(view, aVarArr[i11], i10);
        }
        if (i10 == 0) {
            dVar.f2488i = dVar.f2490k[0];
        } else {
            dVar.f2489j = dVar.f2490k[0];
        }
        if (this.f2471r == 0) {
            y.a aVar3 = this.Z.f2561a;
            dVar.f2489j = a0.a(view, aVar3, aVar3.f2564e);
            return;
        }
        y.a aVar4 = this.Z.f2562b;
        dVar.f2488i = a0.a(view, aVar4, aVar4.f2564e);
    }

    public void T1() {
        if (A() > 0) {
            this.f2474u = this.W.f2444f - ((d) z(0).getLayoutParams()).b();
        } else {
            this.f2474u = 0;
        }
    }

    public final void U1() {
        int i10 = this.f2479z & -1025;
        int i11 = 0;
        if (D1(false)) {
            i11 = 1024;
        }
        int i12 = i10 | i11;
        this.f2479z = i12;
        if ((i12 & 1024) != 0) {
            e eVar = this.f2470q;
            Runnable runnable = this.f2467f0;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.m(eVar, runnable);
        }
    }

    public int V(RecyclerView.s sVar, RecyclerView.x xVar) {
        o oVar;
        if (this.f2471r != 0 || (oVar = this.W) == null) {
            return -1;
        }
        return oVar.f2443e;
    }

    public void V0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        Q1(i10, 0, true, 0);
    }

    public void V1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f2473t.b() != 0) {
            if ((this.f2479z & 262144) == 0) {
                i13 = this.W.f2445g;
                i10 = this.W.f2444f;
                i11 = this.f2473t.b() - 1;
                i12 = 0;
            } else {
                o oVar = this.W;
                int i16 = oVar.f2444f;
                i10 = oVar.f2445g;
                i11 = 0;
                int i17 = i16;
                i12 = this.f2473t.b() - 1;
                i13 = i17;
            }
            if (i13 >= 0 && i10 >= 0) {
                boolean z10 = i13 == i11;
                boolean z11 = i10 == i12;
                if (z10 || !this.Y.f2531c.d() || z11 || !this.Y.f2531c.e()) {
                    int i18 = Integer.MAX_VALUE;
                    if (z10) {
                        i18 = this.W.g(true, f2461i0);
                        View v10 = v(f2461i0[1]);
                        i14 = p1(v10);
                        int[] iArr = ((d) v10.getLayoutParams()).f2490k;
                        if (iArr != null && iArr.length > 0) {
                            i14 = (iArr[iArr.length - 1] - iArr[0]) + i14;
                        }
                    } else {
                        i14 = Integer.MAX_VALUE;
                    }
                    int i19 = Integer.MIN_VALUE;
                    if (z11) {
                        i19 = this.W.i(false, f2461i0);
                        i15 = p1(v(f2461i0[1]));
                    } else {
                        i15 = Integer.MIN_VALUE;
                    }
                    this.Y.f2531c.f(i19, i18, i15, i14);
                }
            }
        }
    }

    public void W0(RecyclerView.w wVar) {
        c cVar = this.F;
        if (cVar != null) {
            cVar.f2482q = true;
        }
        super.W0(wVar);
        if (!wVar.f2920e || !(wVar instanceof c)) {
            this.F = null;
            this.G = null;
            return;
        }
        c cVar2 = (c) wVar;
        this.F = cVar2;
        if (cVar2 instanceof e) {
            this.G = (e) cVar2;
        } else {
            this.G = null;
        }
    }

    public final void W1() {
        t1.a aVar = this.Y.f2532d;
        int i10 = aVar.f2542j - this.K;
        int n12 = n1() + i10;
        aVar.f(i10, n12, i10, n12);
    }

    public final void Y0() {
        this.W.b((this.f2479z & 262144) != 0 ? (-this.f2463b0) - this.f2475v : this.f2462a0 + this.f2463b0 + this.f2475v, false);
    }

    public boolean Z0(View view) {
        return view.getVisibility() == 0 && (!X() || view.hasFocusable());
    }

    public void a1() {
        long j10;
        if (this.A == null) {
            ArrayList<k0> arrayList = this.B;
            if (!(arrayList != null && arrayList.size() > 0)) {
                return;
            }
        }
        int i10 = this.D;
        View v10 = i10 == -1 ? null : v(i10);
        if (v10 != null) {
            RecyclerView.a0 K2 = this.f2470q.K(v10);
            j0 j0Var = this.A;
            if (j0Var != null) {
                e eVar = this.f2470q;
                int i11 = this.D;
                if (K2 == null) {
                    j10 = -1;
                } else {
                    j10 = K2.f2846e;
                }
                j0Var.a(eVar, v10, i11, j10);
            }
            c1(this.f2470q, K2, this.D, this.E);
        } else {
            j0 j0Var2 = this.A;
            if (j0Var2 != null) {
                j0Var2.a(this.f2470q, (View) null, -1, -1);
            }
            c1(this.f2470q, (RecyclerView.a0) null, -1, 0);
        }
        if ((this.f2479z & 3) != 1 && !this.f2470q.isLayoutRequested()) {
            int A2 = A();
            for (int i12 = 0; i12 < A2; i12++) {
                if (z(i12).isLayoutRequested()) {
                    e eVar2 = this.f2470q;
                    Runnable runnable = this.f2467f0;
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    c0.d.m(eVar2, runnable);
                    return;
                }
            }
        }
    }

    public void b1() {
        ArrayList<k0> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            int i10 = this.D;
            View v10 = i10 == -1 ? null : v(i10);
            if (v10 != null) {
                d1(this.f2470q, this.f2470q.K(v10), this.D, this.E);
                return;
            }
            j0 j0Var = this.A;
            if (j0Var != null) {
                j0Var.a(this.f2470q, (View) null, -1, -1);
            }
            d1(this.f2470q, (RecyclerView.a0) null, -1, 0);
        }
    }

    public void c1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10, int i11) {
        ArrayList<k0> arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    this.B.get(size).a(recyclerView, a0Var, i10, i11);
                } else {
                    return;
                }
            }
        }
    }

    public void d1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10, int i11) {
        ArrayList<k0> arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    this.B.get(size).getClass();
                } else {
                    return;
                }
            }
        }
    }

    public void e0(RecyclerView.e eVar, RecyclerView.e eVar2) {
        if (eVar != null) {
            this.W = null;
            this.N = null;
            this.f2479z &= -1025;
            this.D = -1;
            this.H = 0;
            this.f2465d0.b();
        }
        if (eVar2 instanceof l) {
            this.f2466e0 = (l) eVar2;
        } else {
            this.f2466e0 = null;
        }
    }

    public final int e1(int i10) {
        return f1(z(i10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f0(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList<android.view.View> r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            int r4 = r0.f2479z
            r5 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r5
            r5 = 1
            if (r4 == 0) goto L_0x0012
            return r5
        L_0x0012:
            boolean r4 = r18.hasFocus()
            if (r4 == 0) goto L_0x0120
            androidx.leanback.widget.p$e r4 = r0.G
            if (r4 == 0) goto L_0x001d
            return r5
        L_0x001d:
            int r4 = r0.i1(r2)
            android.view.View r7 = r18.findFocus()
            androidx.leanback.widget.e r8 = r0.f2470q
            r9 = -1
            if (r8 == 0) goto L_0x0043
            if (r7 == r8) goto L_0x0043
            android.view.View r7 = r0.u(r7)
            if (r7 == 0) goto L_0x0043
            int r8 = r17.A()
            r10 = 0
        L_0x0037:
            if (r10 >= r8) goto L_0x0043
            android.view.View r11 = r0.z(r10)
            if (r11 != r7) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            int r10 = r10 + 1
            goto L_0x0037
        L_0x0043:
            r10 = -1
        L_0x0044:
            int r7 = r0.e1(r10)
            if (r7 != r9) goto L_0x004c
            r8 = 0
            goto L_0x0050
        L_0x004c:
            android.view.View r8 = r0.v(r7)
        L_0x0050:
            if (r8 == 0) goto L_0x0055
            r8.addFocusables(r1, r2, r3)
        L_0x0055:
            androidx.leanback.widget.o r11 = r0.W
            if (r11 == 0) goto L_0x011f
            int r11 = r17.A()
            if (r11 != 0) goto L_0x0061
            goto L_0x011f
        L_0x0061:
            r11 = 3
            r12 = 2
            if (r4 == r11) goto L_0x0067
            if (r4 != r12) goto L_0x006e
        L_0x0067:
            androidx.leanback.widget.o r13 = r0.W
            int r13 = r13.f2443e
            if (r13 > r5) goto L_0x006e
            return r5
        L_0x006e:
            androidx.leanback.widget.o r13 = r0.W
            if (r13 == 0) goto L_0x007b
            if (r8 == 0) goto L_0x007b
            androidx.leanback.widget.o$a r13 = r13.k(r7)
            int r13 = r13.f2448a
            goto L_0x007c
        L_0x007b:
            r13 = -1
        L_0x007c:
            int r14 = r19.size()
            if (r4 == r5) goto L_0x0087
            if (r4 != r11) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r15 = -1
            goto L_0x0088
        L_0x0087:
            r15 = 1
        L_0x0088:
            if (r15 <= 0) goto L_0x0093
            int r16 = r17.A()
            int r16 = r16 + -1
            r6 = r16
            goto L_0x0094
        L_0x0093:
            r6 = 0
        L_0x0094:
            if (r10 != r9) goto L_0x00a0
            if (r15 <= 0) goto L_0x009a
            r9 = 0
            goto L_0x00a2
        L_0x009a:
            int r9 = r17.A()
            int r9 = r9 - r5
            goto L_0x00a2
        L_0x00a0:
            int r9 = r10 + r15
        L_0x00a2:
            if (r15 <= 0) goto L_0x00a7
            if (r9 > r6) goto L_0x0194
            goto L_0x00a9
        L_0x00a7:
            if (r9 < r6) goto L_0x0194
        L_0x00a9:
            android.view.View r10 = r0.z(r9)
            int r16 = r10.getVisibility()
            if (r16 != 0) goto L_0x011c
            boolean r16 = r10.hasFocusable()
            if (r16 != 0) goto L_0x00bb
            goto L_0x011c
        L_0x00bb:
            if (r8 != 0) goto L_0x00c8
            r10.addFocusables(r1, r2, r3)
            int r10 = r19.size()
            if (r10 <= r14) goto L_0x011c
            goto L_0x0194
        L_0x00c8:
            int r12 = r0.e1(r9)
            androidx.leanback.widget.o r11 = r0.W
            androidx.leanback.widget.o$a r11 = r11.k(r12)
            if (r11 != 0) goto L_0x00d6
        L_0x00d4:
            r12 = 3
            goto L_0x010b
        L_0x00d6:
            if (r4 != r5) goto L_0x00e9
            int r11 = r11.f2448a
            if (r11 != r13) goto L_0x00d4
            if (r12 <= r7) goto L_0x00d4
            r10.addFocusables(r1, r2, r3)
            int r10 = r19.size()
            if (r10 <= r14) goto L_0x00d4
            goto L_0x0194
        L_0x00e9:
            if (r4 != 0) goto L_0x00fc
            int r11 = r11.f2448a
            if (r11 != r13) goto L_0x00d4
            if (r12 >= r7) goto L_0x00d4
            r10.addFocusables(r1, r2, r3)
            int r10 = r19.size()
            if (r10 <= r14) goto L_0x00d4
            goto L_0x0194
        L_0x00fc:
            r12 = 3
            if (r4 != r12) goto L_0x010d
            int r11 = r11.f2448a
            if (r11 != r13) goto L_0x0104
            goto L_0x010b
        L_0x0104:
            if (r11 >= r13) goto L_0x0108
            goto L_0x0194
        L_0x0108:
            r10.addFocusables(r1, r2, r3)
        L_0x010b:
            r12 = 2
            goto L_0x011c
        L_0x010d:
            r12 = 2
            if (r4 != r12) goto L_0x011c
            int r11 = r11.f2448a
            if (r11 != r13) goto L_0x0115
            goto L_0x011c
        L_0x0115:
            if (r11 <= r13) goto L_0x0119
            goto L_0x0194
        L_0x0119:
            r10.addFocusables(r1, r2, r3)
        L_0x011c:
            int r9 = r9 + r15
            r11 = 3
            goto L_0x00a2
        L_0x011f:
            return r5
        L_0x0120:
            int r4 = r19.size()
            int r6 = r0.X
            if (r6 == 0) goto L_0x0177
            androidx.leanback.widget.t1 r6 = r0.Y
            androidx.leanback.widget.t1$a r6 = r6.f2531c
            int r7 = r6.f2542j
            int r6 = r6.b()
            int r6 = r6 + r7
            int r8 = r17.A()
            r9 = 0
        L_0x0138:
            if (r9 >= r8) goto L_0x015a
            android.view.View r10 = r0.z(r9)
            int r11 = r10.getVisibility()
            if (r11 != 0) goto L_0x0157
            androidx.recyclerview.widget.q r11 = r0.f2472s
            int r11 = r11.e(r10)
            if (r11 < r7) goto L_0x0157
            androidx.recyclerview.widget.q r11 = r0.f2472s
            int r11 = r11.b(r10)
            if (r11 > r6) goto L_0x0157
            r10.addFocusables(r1, r2, r3)
        L_0x0157:
            int r9 = r9 + 1
            goto L_0x0138
        L_0x015a:
            int r6 = r19.size()
            if (r6 != r4) goto L_0x0182
            int r6 = r17.A()
            r7 = 0
        L_0x0165:
            if (r7 >= r6) goto L_0x0182
            android.view.View r8 = r0.z(r7)
            int r9 = r8.getVisibility()
            if (r9 != 0) goto L_0x0174
            r8.addFocusables(r1, r2, r3)
        L_0x0174:
            int r7 = r7 + 1
            goto L_0x0165
        L_0x0177:
            int r6 = r0.D
            android.view.View r6 = r0.v(r6)
            if (r6 == 0) goto L_0x0182
            r6.addFocusables(r1, r2, r3)
        L_0x0182:
            int r2 = r19.size()
            if (r2 == r4) goto L_0x0189
            return r5
        L_0x0189:
            boolean r2 = r18.isFocusable()
            if (r2 == 0) goto L_0x0194
            r2 = r18
            r1.add(r2)
        L_0x0194:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.f0(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    public final int f1(View view) {
        d dVar;
        if (view == null || (dVar = (d) view.getLayoutParams()) == null || dVar.d()) {
            return -1;
        }
        return dVar.a();
    }

    public boolean g() {
        return this.f2471r == 0 || this.U > 1;
    }

    public int g1(View view) {
        d dVar = (d) view.getLayoutParams();
        return G(view) + dVar.topMargin + dVar.bottomMargin;
    }

    public boolean h() {
        return this.f2471r == 1 || this.U > 1;
    }

    public int h1(View view) {
        d dVar = (d) view.getLayoutParams();
        return H(view) + dVar.leftMargin + dVar.rightMargin;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i1(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2471r
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 17
            r8 = 1
            if (r0 != 0) goto L_0x002b
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r7) goto L_0x0025
            if (r10 == r3) goto L_0x0023
            if (r10 == r2) goto L_0x001d
            if (r10 == r1) goto L_0x001b
            goto L_0x0046
        L_0x001b:
            r4 = 3
            goto L_0x0048
        L_0x001d:
            int r10 = r9.f2479z
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0048
            goto L_0x0038
        L_0x0023:
            r4 = 2
            goto L_0x0048
        L_0x0025:
            int r10 = r9.f2479z
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0038
            goto L_0x0048
        L_0x002b:
            if (r0 != r8) goto L_0x0046
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r7) goto L_0x0040
            if (r10 == r3) goto L_0x0048
            if (r10 == r2) goto L_0x003a
            if (r10 == r1) goto L_0x0038
            goto L_0x0046
        L_0x0038:
            r4 = 1
            goto L_0x0048
        L_0x003a:
            int r10 = r9.f2479z
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0023
            goto L_0x001b
        L_0x0040:
            int r10 = r9.f2479z
            r10 = r10 & r0
            if (r10 != 0) goto L_0x001b
            goto L_0x0023
        L_0x0046:
            r4 = 17
        L_0x0048:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.i1(int):int");
    }

    public void j0(RecyclerView.s sVar, RecyclerView.x xVar, p0.c cVar) {
        o oVar;
        o oVar2;
        H1(sVar, xVar);
        int b10 = xVar.b();
        boolean z10 = (this.f2479z & 262144) != 0;
        if (b10 > 1 && !x1(0)) {
            if (Build.VERSION.SDK_INT < 23) {
                cVar.f23748a.addAction(8192);
            } else if (this.f2471r == 0) {
                cVar.a(z10 ? c.a.f23762p : c.a.f23760n);
            } else {
                cVar.a(c.a.f23759m);
            }
            cVar.f23748a.setScrollable(true);
        }
        if (b10 > 1 && !x1(b10 - 1)) {
            if (Build.VERSION.SDK_INT < 23) {
                cVar.f23748a.addAction(4096);
            } else if (this.f2471r == 0) {
                cVar.a(z10 ? c.a.f23760n : c.a.f23762p);
            } else {
                cVar.a(c.a.f23761o);
            }
            cVar.f23748a.setScrollable(true);
        }
        int i10 = this.f2471r;
        int i11 = -1;
        int i12 = (i10 != 0 || (oVar2 = this.W) == null) ? -1 : oVar2.f2443e;
        if (i10 == 1 && (oVar = this.W) != null) {
            i11 = oVar.f2443e;
        }
        cVar.m(c.b.a(i12, i11, false, 0));
        z1();
    }

    public final int j1(int i10) {
        int i11 = this.M;
        if (i11 != 0) {
            return i11;
        }
        int[] iArr = this.N;
        if (iArr == null) {
            return 0;
        }
        return iArr[i10];
    }

    public void k(int i10, int i11, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        try {
            H1((RecyclerView.s) null, xVar);
            if (this.f2471r != 0) {
                i10 = i11;
            }
            if (A() != 0) {
                if (i10 != 0) {
                    this.W.e(i10 < 0 ? -this.f2463b0 : this.f2462a0 + this.f2463b0, i10, cVar);
                    z1();
                }
            }
        } finally {
            z1();
        }
    }

    public int k1(int i10) {
        int i11 = 0;
        if ((this.f2479z & 524288) != 0) {
            for (int i12 = this.U - 1; i12 > i10; i12--) {
                i11 += j1(i12) + this.S;
            }
            return i11;
        }
        int i13 = 0;
        while (i11 < i10) {
            i13 += j1(i11) + this.S;
            i11++;
        }
        return i13;
    }

    public void l(int i10, RecyclerView.m.c cVar) {
        int i11 = this.f2470q.f2350c1;
        if (i10 != 0 && i11 != 0) {
            int max = Math.max(0, Math.min(this.D - ((i11 - 1) / 2), i10 - i11));
            int i12 = max;
            while (i12 < i10 && i12 < max + i11) {
                ((k.b) cVar).a(i12, 0);
                i12++;
            }
        }
    }

    public void l0(RecyclerView.s sVar, RecyclerView.x xVar, View view, p0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.W != null && (layoutParams instanceof d)) {
            int a10 = ((d) layoutParams).a();
            int l10 = a10 >= 0 ? this.W.l(a10) : -1;
            if (l10 >= 0) {
                int i10 = a10 / this.W.f2443e;
                if (this.f2471r == 0) {
                    cVar.n(c.C0207c.a(l10, 1, i10, 1, false, false));
                } else {
                    cVar.n(c.C0207c.a(i10, 1, l10, 1, false, false));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l1(android.view.View r12, android.view.View r13, int[] r14) {
        /*
            r11 = this;
            int r0 = r11.X
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0042
            if (r0 == r1) goto L_0x0042
            androidx.leanback.widget.t1 r0 = r11.Y
            androidx.leanback.widget.t1$a r0 = r0.f2531c
            int r1 = r11.p1(r12)
            int r0 = r0.c(r1)
            if (r13 == 0) goto L_0x002b
            int r13 = r11.o1(r12, r13)
            if (r13 == 0) goto L_0x002b
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            androidx.leanback.widget.p$d r1 = (androidx.leanback.widget.p.d) r1
            int[] r1 = r1.f2490k
            r13 = r1[r13]
            r1 = r1[r2]
            int r13 = r13 - r1
            int r0 = r0 + r13
        L_0x002b:
            int r12 = r11.m1(r12)
            int r13 = r11.I
            int r0 = r0 + r13
            if (r0 != 0) goto L_0x003c
            if (r12 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            r14[r2] = r2
            r14[r3] = r2
            goto L_0x0041
        L_0x003c:
            r14[r2] = r0
            r14[r3] = r12
            r2 = 1
        L_0x0041:
            return r2
        L_0x0042:
            int r13 = r11.f1(r12)
            androidx.recyclerview.widget.q r0 = r11.f2472s
            int r0 = r0.e(r12)
            androidx.recyclerview.widget.q r4 = r11.f2472s
            int r4 = r4.b(r12)
            androidx.leanback.widget.t1 r5 = r11.Y
            androidx.leanback.widget.t1$a r5 = r5.f2531c
            int r6 = r5.f2542j
            int r5 = r5.b()
            androidx.leanback.widget.o r7 = r11.W
            int r7 = r7.l(r13)
            r8 = 0
            if (r0 >= r6) goto L_0x00af
            int r0 = r11.X
            if (r0 != r1) goto L_0x00e3
            r0 = r12
        L_0x006a:
            androidx.leanback.widget.o r9 = r11.W
            boolean r10 = r9.f2441c
            if (r10 == 0) goto L_0x0073
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0076
        L_0x0073:
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x0076:
            boolean r9 = r9.n(r10, r3)
            if (r9 == 0) goto L_0x00ac
            androidx.leanback.widget.o r0 = r11.W
            int r9 = r0.f2444f
            s.d[] r0 = r0.j(r9, r13)
            r0 = r0[r7]
            int r9 = r0.d(r2)
            android.view.View r9 = r11.v(r9)
            int r10 = r11.t1(r9)
            int r10 = r4 - r10
            if (r10 <= r5) goto L_0x00aa
            int r13 = r0.g()
            if (r13 <= r1) goto L_0x00a7
            int r13 = r0.d(r1)
            android.view.View r13 = r11.v(r13)
            r1 = r8
            r8 = r13
            goto L_0x00e9
        L_0x00a7:
            r1 = r8
            r8 = r9
            goto L_0x00e9
        L_0x00aa:
            r0 = r9
            goto L_0x006a
        L_0x00ac:
            r1 = r8
            r8 = r0
            goto L_0x00e9
        L_0x00af:
            int r9 = r5 + r6
            if (r4 <= r9) goto L_0x00e8
            int r4 = r11.X
            if (r4 != r1) goto L_0x00e6
        L_0x00b7:
            androidx.leanback.widget.o r1 = r11.W
            int r4 = r1.f2445g
            s.d[] r1 = r1.j(r13, r4)
            r1 = r1[r7]
            int r4 = r1.g()
            int r4 = r4 - r3
            int r1 = r1.d(r4)
            android.view.View r1 = r11.v(r1)
            int r4 = r11.s1(r1)
            int r4 = r4 - r0
            if (r4 <= r5) goto L_0x00d7
            r1 = r8
            goto L_0x00df
        L_0x00d7:
            androidx.leanback.widget.o r4 = r11.W
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x00b7
        L_0x00df:
            if (r1 == 0) goto L_0x00e2
            goto L_0x00e9
        L_0x00e2:
            r8 = r1
        L_0x00e3:
            r1 = r8
            r8 = r12
            goto L_0x00e9
        L_0x00e6:
            r1 = r12
            goto L_0x00e9
        L_0x00e8:
            r1 = r8
        L_0x00e9:
            if (r8 == 0) goto L_0x00f2
            androidx.recyclerview.widget.q r13 = r11.f2472s
            int r13 = r13.e(r8)
            goto L_0x00fb
        L_0x00f2:
            if (r1 == 0) goto L_0x00fd
            androidx.recyclerview.widget.q r13 = r11.f2472s
            int r13 = r13.b(r1)
            int r6 = r6 + r5
        L_0x00fb:
            int r13 = r13 - r6
            goto L_0x00fe
        L_0x00fd:
            r13 = 0
        L_0x00fe:
            if (r8 == 0) goto L_0x0102
            r12 = r8
            goto L_0x0105
        L_0x0102:
            if (r1 == 0) goto L_0x0105
            r12 = r1
        L_0x0105:
            int r12 = r11.m1(r12)
            if (r13 != 0) goto L_0x010d
            if (r12 == 0) goto L_0x0112
        L_0x010d:
            r14[r2] = r13
            r14[r3] = r12
            r2 = 1
        L_0x0112:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.l1(android.view.View, android.view.View, int[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m0(android.view.View r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.f2479z
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0009
            return r8
        L_0x0009:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r9 == r3) goto L_0x001d
            if (r9 != r4) goto L_0x0016
            goto L_0x001d
        L_0x0016:
            androidx.leanback.widget.e r1 = r7.f2470q
            android.view.View r0 = r0.findNextFocus(r1, r8, r9)
            goto L_0x0054
        L_0x001d:
            boolean r5 = r7.h()
            if (r5 == 0) goto L_0x0030
            if (r9 != r3) goto L_0x0028
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x002a
        L_0x0028:
            r1 = 33
        L_0x002a:
            androidx.leanback.widget.e r5 = r7.f2470q
            android.view.View r1 = r0.findNextFocus(r5, r8, r1)
        L_0x0030:
            boolean r5 = r7.g()
            if (r5 == 0) goto L_0x0053
            int r1 = r7.M()
            if (r1 != r4) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r9 != r3) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x004a
            r1 = 66
            goto L_0x004c
        L_0x004a:
            r1 = 17
        L_0x004c:
            androidx.leanback.widget.e r5 = r7.f2470q
            android.view.View r0 = r0.findNextFocus(r5, r8, r1)
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            if (r0 == 0) goto L_0x0057
            return r0
        L_0x0057:
            androidx.leanback.widget.e r1 = r7.f2470q
            int r1 = r1.getDescendantFocusability()
            r5 = 393216(0x60000, float:5.51013E-40)
            if (r1 != r5) goto L_0x006c
            androidx.leanback.widget.e r0 = r7.f2470q
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r8 = r0.focusSearch(r8, r9)
            return r8
        L_0x006c:
            int r1 = r7.i1(r9)
            androidx.leanback.widget.e r5 = r7.f2470q
            int r5 = r5.getScrollState()
            if (r5 == 0) goto L_0x007a
            r5 = 1
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r4) goto L_0x0097
            if (r5 != 0) goto L_0x0087
            int r1 = r7.f2479z
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L_0x0088
        L_0x0087:
            r0 = r8
        L_0x0088:
            int r1 = r7.f2479z
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r7.v1()
            if (r1 != 0) goto L_0x00c8
            r7.C1(r4)
            goto L_0x00c7
        L_0x0097:
            if (r1 != 0) goto L_0x00b1
            if (r5 != 0) goto L_0x00a1
            int r1 = r7.f2479z
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = r8
        L_0x00a2:
            int r1 = r7.f2479z
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r7.u1()
            if (r1 != 0) goto L_0x00c8
            r7.C1(r2)
            goto L_0x00c7
        L_0x00b1:
            r2 = 3
            if (r1 != r2) goto L_0x00bd
            if (r5 != 0) goto L_0x00c7
            int r1 = r7.f2479z
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x00c8
            goto L_0x00c7
        L_0x00bd:
            if (r1 != r3) goto L_0x00c8
            if (r5 != 0) goto L_0x00c7
            int r1 = r7.f2479z
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x00c8
        L_0x00c7:
            r0 = r8
        L_0x00c8:
            if (r0 == 0) goto L_0x00cb
            return r0
        L_0x00cb:
            androidx.leanback.widget.e r0 = r7.f2470q
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r9 = r0.focusSearch(r8, r9)
            if (r9 == 0) goto L_0x00d8
            return r9
        L_0x00d8:
            if (r8 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            androidx.leanback.widget.e r8 = r7.f2470q
        L_0x00dd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.m0(android.view.View, int):android.view.View");
    }

    public final int m1(View view) {
        return this.Y.f2532d.c(this.f2471r == 0 ? r1(view) : q1(view));
    }

    public void n0(RecyclerView recyclerView, int i10, int i11) {
        o oVar;
        int i12;
        int i13 = this.D;
        if (!(i13 == -1 || (oVar = this.W) == null || oVar.f2444f < 0 || (i12 = this.H) == Integer.MIN_VALUE || i10 > i13 + i12)) {
            this.H = i12 + i11;
        }
        this.f2465d0.b();
    }

    public final int n1() {
        int i10 = (this.f2479z & 524288) != 0 ? 0 : this.U - 1;
        return j1(i10) + k1(i10);
    }

    public void o0(RecyclerView recyclerView) {
        this.H = 0;
        this.f2465d0.b();
    }

    public int o1(View view, View view2) {
        z zVar;
        if (view == null || view2 == null || (zVar = ((d) view.getLayoutParams()).f2491l) == null) {
            return 0;
        }
        z.a[] aVarArr = zVar.f2581a;
        if (aVarArr.length <= 1) {
            return 0;
        }
        while (view2 != view) {
            int id2 = view2.getId();
            if (id2 != -1) {
                for (int i10 = 1; i10 < aVarArr.length; i10++) {
                    if (aVarArr[i10].f2582a == id2) {
                        return i10;
                    }
                }
                continue;
            }
            view2 = (View) view2.getParent();
        }
        return 0;
    }

    public void p0(RecyclerView recyclerView, int i10, int i11, int i12) {
        int i13;
        int i14 = this.D;
        if (!(i14 == -1 || (i13 = this.H) == Integer.MIN_VALUE)) {
            int i15 = i14 + i13;
            if (i10 <= i15 && i15 < i10 + i12) {
                this.H = (i11 - i10) + i13;
            } else if (i10 < i15 && i11 > i15 - i12) {
                this.H = i13 - i12;
            } else if (i10 > i15 && i11 < i15) {
                this.H = i13 + i12;
            }
        }
        this.f2465d0.b();
    }

    public final int p1(View view) {
        return this.f2471r == 0 ? q1(view) : r1(view);
    }

    public void q0(RecyclerView recyclerView, int i10, int i11) {
        o oVar;
        int i12;
        int i13;
        int i14 = this.D;
        if (!(i14 == -1 || (oVar = this.W) == null || oVar.f2444f < 0 || (i12 = this.H) == Integer.MIN_VALUE || i10 > (i13 = i14 + i12))) {
            if (i10 + i11 > i13) {
                int i15 = (i10 - i13) + i12;
                this.H = i15;
                this.D = i14 + i15;
                this.H = Integer.MIN_VALUE;
            } else {
                this.H = i12 - i11;
            }
        }
        this.f2465d0.b();
    }

    public final int q1(View view) {
        d dVar = (d) view.getLayoutParams();
        dVar.getClass();
        return view.getLeft() + dVar.f2484e + dVar.f2488i;
    }

    public void r0(RecyclerView recyclerView, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            this.f2465d0.c(i10);
            i10++;
        }
    }

    public final int r1(View view) {
        d dVar = (d) view.getLayoutParams();
        dVar.getClass();
        return view.getTop() + dVar.f2485f + dVar.f2489j;
    }

    public int s1(View view) {
        return this.f2472s.b(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01fa, code lost:
        if (((r1 & 262144) != 0) != r2.f2441c) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ba, code lost:
        r18 = r4;
        r7 = r5;
        r20 = r12;
        r17 = r13;
        r21 = r14;
        r14 = r2;
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0608, code lost:
        if (r1 < 0) goto L_0x0638;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0636, code lost:
        if (r1 < 0) goto L_0x0638;
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03b3 A[LOOP:5: B:159:0x03b3->B:162:0x03bf, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03f7 A[LOOP:6: B:177:0x03f7->B:180:0x0403, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t0(androidx.recyclerview.widget.RecyclerView.s r24, androidx.recyclerview.widget.RecyclerView.x r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r25
            int r0 = r6.U
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r25.b()
            if (r0 >= 0) goto L_0x0010
            return
        L_0x0010:
            int r0 = r6.f2479z
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0023
            int r0 = r23.A()
            if (r0 <= 0) goto L_0x0023
            int r0 = r6.f2479z
            r0 = r0 | 128(0x80, float:1.794E-43)
            r6.f2479z = r0
            return
        L_0x0023:
            int r0 = r6.f2479z
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 != 0) goto L_0x0036
            r1 = 0
            r6.W = r1
            r6.N = r1
            r0 = r0 & -1025(0xfffffffffffffbff, float:NaN)
            r6.f2479z = r0
            r23.B0(r24)
            return
        L_0x0036:
            r0 = r0 & -4
            r8 = 1
            r0 = r0 | r8
            r6.f2479z = r0
            r23.H1(r24, r25)
            boolean r0 = r7.f2937g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = -1
            r10 = 0
            if (r0 == 0) goto L_0x00ec
            r23.T1()
            int r0 = r23.A()
            androidx.leanback.widget.o r3 = r6.W
            if (r3 == 0) goto L_0x00e2
            if (r0 <= 0) goto L_0x00e2
            androidx.leanback.widget.e r3 = r6.f2470q
            android.view.View r4 = r6.z(r10)
            androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.K(r4)
            int r3 = r3.f2845d
            androidx.leanback.widget.e r4 = r6.f2470q
            int r5 = r0 + -1
            android.view.View r5 = r6.z(r5)
            androidx.recyclerview.widget.RecyclerView$a0 r4 = r4.K(r5)
            int r4 = r4.f2845d
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0071:
            if (r10 >= r0) goto L_0x00d7
            android.view.View r5 = r6.z(r10)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.leanback.widget.p$d r7 = (androidx.leanback.widget.p.d) r7
            androidx.leanback.widget.e r8 = r6.f2470q
            r8.getClass()
            androidx.recyclerview.widget.RecyclerView$a0 r8 = androidx.recyclerview.widget.RecyclerView.L(r5)
            if (r8 == 0) goto L_0x008d
            int r8 = r8.f()
            goto L_0x008e
        L_0x008d:
            r8 = -1
        L_0x008e:
            boolean r11 = r7.c()
            if (r11 != 0) goto L_0x00c0
            boolean r11 = r7.d()
            if (r11 != 0) goto L_0x00c0
            boolean r11 = r5.isLayoutRequested()
            if (r11 != 0) goto L_0x00c0
            boolean r11 = r5.hasFocus()
            if (r11 != 0) goto L_0x00ae
            int r11 = r6.D
            int r12 = r7.a()
            if (r11 == r12) goto L_0x00c0
        L_0x00ae:
            boolean r11 = r5.hasFocus()
            if (r11 == 0) goto L_0x00bc
            int r11 = r6.D
            int r7 = r7.a()
            if (r11 != r7) goto L_0x00c0
        L_0x00bc:
            if (r8 < r3) goto L_0x00c0
            if (r8 <= r4) goto L_0x00d4
        L_0x00c0:
            androidx.recyclerview.widget.q r7 = r6.f2472s
            int r7 = r7.e(r5)
            int r1 = java.lang.Math.min(r1, r7)
            androidx.recyclerview.widget.q r7 = r6.f2472s
            int r5 = r7.b(r5)
            int r2 = java.lang.Math.max(r2, r5)
        L_0x00d4:
            int r10 = r10 + 1
            goto L_0x0071
        L_0x00d7:
            if (r2 <= r1) goto L_0x00dc
            int r2 = r2 - r1
            r6.f2475v = r2
        L_0x00dc:
            r23.Y0()
            r23.B1()
        L_0x00e2:
            int r0 = r6.f2479z
            r0 = r0 & -4
            r6.f2479z = r0
            r23.z1()
            return
        L_0x00ec:
            boolean r0 = r7.f2941k
            if (r0 == 0) goto L_0x011c
            android.util.SparseIntArray r0 = r6.f2476w
            r0.clear()
            int r0 = r23.A()
            r3 = 0
        L_0x00fa:
            if (r3 >= r0) goto L_0x011c
            androidx.leanback.widget.e r4 = r6.f2470q
            android.view.View r5 = r6.z(r3)
            androidx.recyclerview.widget.RecyclerView$a0 r4 = r4.K(r5)
            int r4 = r4.f2845d
            if (r4 < 0) goto L_0x0119
            androidx.leanback.widget.o r5 = r6.W
            androidx.leanback.widget.o$a r5 = r5.k(r4)
            if (r5 == 0) goto L_0x0119
            android.util.SparseIntArray r11 = r6.f2476w
            int r5 = r5.f2448a
            r11.put(r4, r5)
        L_0x0119:
            int r3 = r3 + 1
            goto L_0x00fa
        L_0x011c:
            boolean r0 = r23.a0()
            if (r0 != 0) goto L_0x0128
            int r0 = r6.X
            if (r0 != 0) goto L_0x0128
            r11 = 1
            goto L_0x0129
        L_0x0128:
            r11 = 0
        L_0x0129:
            int r0 = r6.D
            if (r0 == r9) goto L_0x0136
            int r3 = r6.H
            if (r3 == r2) goto L_0x0136
            int r0 = r0 + r3
            r6.D = r0
            r6.E = r10
        L_0x0136:
            r6.H = r10
            int r0 = r6.D
            android.view.View r12 = r6.v(r0)
            int r13 = r6.D
            int r14 = r6.E
            androidx.leanback.widget.e r0 = r6.f2470q
            boolean r15 = r0.hasFocus()
            androidx.leanback.widget.o r0 = r6.W
            if (r0 == 0) goto L_0x014f
            int r3 = r0.f2444f
            goto L_0x0150
        L_0x014f:
            r3 = -1
        L_0x0150:
            if (r0 == 0) goto L_0x0155
            int r0 = r0.f2445g
            goto L_0x0156
        L_0x0155:
            r0 = -1
        L_0x0156:
            int r4 = r6.f2471r
            if (r4 != 0) goto L_0x015f
            int r4 = r7.f2945o
            int r5 = r7.f2946p
            goto L_0x0163
        L_0x015f:
            int r5 = r7.f2945o
            int r4 = r7.f2946p
        L_0x0163:
            r22 = r5
            r5 = r4
            r4 = r22
            androidx.recyclerview.widget.RecyclerView$x r1 = r6.f2473t
            int r1 = r1.b()
            if (r1 != 0) goto L_0x0175
            r6.D = r9
            r6.E = r10
            goto L_0x0187
        L_0x0175:
            int r2 = r6.D
            if (r2 < r1) goto L_0x017f
            int r1 = r1 - r8
            r6.D = r1
            r6.E = r10
            goto L_0x0187
        L_0x017f:
            if (r2 != r9) goto L_0x0187
            if (r1 <= 0) goto L_0x0187
            r6.D = r10
            r6.E = r10
        L_0x0187:
            androidx.recyclerview.widget.RecyclerView$x r1 = r6.f2473t
            boolean r1 = r1.f2936f
            r16 = 262144(0x40000, float:3.67342E-40)
            if (r1 != 0) goto L_0x01e1
            androidx.leanback.widget.o r1 = r6.W
            if (r1 == 0) goto L_0x01e1
            int r2 = r1.f2444f
            if (r2 < 0) goto L_0x01e1
            int r2 = r6.f2479z
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x01e1
            int r1 = r1.f2443e
            int r2 = r6.U
            if (r1 != r2) goto L_0x01e1
            androidx.leanback.widget.t1 r1 = r6.Y
            androidx.leanback.widget.t1$a r2 = r1.f2530b
            int r9 = r6.f2888n
            r2.f2541i = r9
            androidx.leanback.widget.t1$a r1 = r1.f2529a
            int r9 = r6.f2889o
            r1.f2541i = r9
            int r1 = r23.Q()
            int r9 = r23.R()
            r2.f2542j = r1
            r2.f2543k = r9
            androidx.leanback.widget.t1 r1 = r6.Y
            androidx.leanback.widget.t1$a r1 = r1.f2529a
            int r2 = r23.S()
            int r9 = r23.P()
            r1.f2542j = r2
            r1.f2543k = r9
            androidx.leanback.widget.t1 r1 = r6.Y
            androidx.leanback.widget.t1$a r1 = r1.f2531c
            int r1 = r1.f2541i
            r6.f2462a0 = r1
            r23.W1()
            androidx.leanback.widget.o r1 = r6.W
            int r2 = r6.R
            r1.f2442d = r2
            r1 = 1
            goto L_0x0287
        L_0x01e1:
            int r1 = r6.f2479z
            r1 = r1 & -257(0xfffffffffffffeff, float:NaN)
            r6.f2479z = r1
            androidx.leanback.widget.o r2 = r6.W
            if (r2 == 0) goto L_0x01fc
            int r9 = r6.U
            int r10 = r2.f2443e
            if (r9 != r10) goto L_0x01fc
            r1 = r1 & r16
            if (r1 == 0) goto L_0x01f7
            r1 = 1
            goto L_0x01f8
        L_0x01f7:
            r1 = 0
        L_0x01f8:
            boolean r2 = r2.f2441c
            if (r1 == r2) goto L_0x0220
        L_0x01fc:
            int r1 = r6.U
            if (r1 != r8) goto L_0x0206
            androidx.leanback.widget.g1 r1 = new androidx.leanback.widget.g1
            r1.<init>()
            goto L_0x020f
        L_0x0206:
            androidx.leanback.widget.j1 r2 = new androidx.leanback.widget.j1
            r2.<init>()
            r2.p(r1)
            r1 = r2
        L_0x020f:
            r6.W = r1
            androidx.leanback.widget.o$b r2 = r6.f2468g0
            r1.f2440b = r2
            int r2 = r6.f2479z
            r2 = r2 & r16
            if (r2 == 0) goto L_0x021d
            r2 = 1
            goto L_0x021e
        L_0x021d:
            r2 = 0
        L_0x021e:
            r1.f2441c = r2
        L_0x0220:
            androidx.leanback.widget.t1 r1 = r6.Y
            androidx.leanback.widget.t1$a r2 = r1.f2531c
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f2534b = r9
            r9 = 2147483647(0x7fffffff, float:NaN)
            r2.f2533a = r9
            androidx.leanback.widget.t1$a r2 = r1.f2530b
            int r9 = r6.f2888n
            r2.f2541i = r9
            androidx.leanback.widget.t1$a r1 = r1.f2529a
            int r9 = r6.f2889o
            r1.f2541i = r9
            int r1 = r23.Q()
            int r9 = r23.R()
            r2.f2542j = r1
            r2.f2543k = r9
            androidx.leanback.widget.t1 r1 = r6.Y
            androidx.leanback.widget.t1$a r1 = r1.f2529a
            int r2 = r23.S()
            int r9 = r23.P()
            r1.f2542j = r2
            r1.f2543k = r9
            androidx.leanback.widget.t1 r1 = r6.Y
            androidx.leanback.widget.t1$a r1 = r1.f2531c
            int r1 = r1.f2541i
            r6.f2462a0 = r1
            r1 = 0
            r6.K = r1
            r23.W1()
            androidx.leanback.widget.o r1 = r6.W
            int r2 = r6.R
            r1.f2442d = r2
            androidx.recyclerview.widget.RecyclerView$s r1 = r6.f2478y
            r6.s(r1)
            androidx.leanback.widget.o r1 = r6.W
            r2 = -1
            r1.f2445g = r2
            r1.f2444f = r2
            androidx.leanback.widget.t1 r1 = r6.Y
            androidx.leanback.widget.t1$a r1 = r1.f2531c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f2534b = r2
            r1.f2536d = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f2533a = r2
            r1.f2535c = r2
            r1 = 0
        L_0x0287:
            if (r1 == 0) goto L_0x03c9
            int r0 = r6.f2479z
            r0 = r0 | 4
            r6.f2479z = r0
            androidx.leanback.widget.o r0 = r6.W
            int r1 = r6.D
            r0.f2447i = r1
            int r10 = r23.A()
            androidx.leanback.widget.o r0 = r6.W
            int r0 = r0.f2444f
            int r1 = r6.f2479z
            r1 = r1 & -9
            r6.f2479z = r1
            r3 = r0
            r2 = 0
        L_0x02a5:
            if (r2 >= r10) goto L_0x0370
            android.view.View r0 = r6.z(r2)
            int r1 = r6.f1(r0)
            if (r3 == r1) goto L_0x02b2
            goto L_0x02ba
        L_0x02b2:
            androidx.leanback.widget.o r1 = r6.W
            androidx.leanback.widget.o$a r1 = r1.k(r3)
            if (r1 != 0) goto L_0x02c7
        L_0x02ba:
            r18 = r4
            r7 = r5
            r20 = r12
            r17 = r13
            r21 = r14
            r14 = r2
            r13 = r3
            goto L_0x035c
        L_0x02c7:
            int r9 = r1.f2448a
            int r9 = r6.k1(r9)
            androidx.leanback.widget.t1 r8 = r6.Y
            androidx.leanback.widget.t1$a r8 = r8.f2532d
            int r8 = r8.f2542j
            int r9 = r9 + r8
            int r8 = r6.K
            int r8 = r9 - r8
            int r9 = r6.t1(r0)
            r17 = r4
            android.graphics.Rect r4 = f2460h0
            r6.E(r0, r4)
            r18 = r5
            int r5 = r6.f2471r
            if (r5 != 0) goto L_0x02ee
            int r4 = r4.width()
            goto L_0x02f2
        L_0x02ee:
            int r4 = r4.height()
        L_0x02f2:
            r5 = r4
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            androidx.leanback.widget.p$d r4 = (androidx.leanback.widget.p.d) r4
            androidx.recyclerview.widget.RecyclerView$a0 r4 = r4.f2896a
            boolean r4 = r4.s()
            if (r4 == 0) goto L_0x0328
            int r4 = r6.f2479z
            r4 = r4 | 8
            r6.f2479z = r4
            androidx.recyclerview.widget.RecyclerView$s r4 = r6.f2478y
            r19 = r5
            androidx.recyclerview.widget.c r5 = r6.f2875a
            int r5 = r5.j(r0)
            r6.J0(r4, r5, r0)
            androidx.recyclerview.widget.RecyclerView$s r0 = r6.f2478y
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r20 = r12
            r12 = 0
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.l(r3, r12, r4)
            android.view.View r0 = r0.f2842a
            r6.d(r0, r2, r12)
            goto L_0x032c
        L_0x0328:
            r19 = r5
            r20 = r12
        L_0x032c:
            r4 = r0
            r6.A1(r4)
            int r0 = r6.f2471r
            if (r0 != 0) goto L_0x0339
            int r0 = r6.h1(r4)
            goto L_0x033d
        L_0x0339:
            int r0 = r6.g1(r4)
        L_0x033d:
            r12 = r0
            int r5 = r9 + r12
            int r1 = r1.f2448a
            r0 = r23
            r21 = r14
            r14 = r2
            r2 = r4
            r4 = r3
            r3 = r9
            r9 = r17
            r17 = r13
            r13 = r4
            r4 = r5
            r7 = r18
            r18 = r9
            r9 = r19
            r5 = r8
            r0.y1(r1, r2, r3, r4, r5)
            if (r9 == r12) goto L_0x035e
        L_0x035c:
            r0 = 1
            goto L_0x037c
        L_0x035e:
            int r2 = r14 + 1
            int r3 = r13 + 1
            r5 = r7
            r13 = r17
            r4 = r18
            r12 = r20
            r14 = r21
            r8 = 1
            r7 = r25
            goto L_0x02a5
        L_0x0370:
            r18 = r4
            r7 = r5
            r20 = r12
            r17 = r13
            r21 = r14
            r14 = r2
            r13 = r3
            r0 = 0
        L_0x037c:
            if (r0 == 0) goto L_0x03c2
            androidx.leanback.widget.o r0 = r6.W
            int r0 = r0.f2445g
            r1 = -1
            int r10 = r10 + r1
        L_0x0384:
            if (r10 < r14) goto L_0x0392
            android.view.View r1 = r6.z(r10)
            androidx.recyclerview.widget.RecyclerView$s r2 = r6.f2478y
            r6.t(r1, r2)
            int r10 = r10 + -1
            goto L_0x0384
        L_0x0392:
            androidx.leanback.widget.o r1 = r6.W
            r1.m(r13)
            int r1 = r6.f2479z
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x03b3
            r23.Y0()
            int r1 = r6.D
            if (r1 < 0) goto L_0x03c2
            if (r1 > r0) goto L_0x03c2
        L_0x03a7:
            androidx.leanback.widget.o r0 = r6.W
            int r1 = r0.f2445g
            int r2 = r6.D
            if (r1 >= r2) goto L_0x03c2
            r0.a()
            goto L_0x03a7
        L_0x03b3:
            androidx.leanback.widget.o r1 = r6.W
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x03c2
            androidx.leanback.widget.o r1 = r6.W
            int r1 = r1.f2445g
            if (r1 >= r0) goto L_0x03c2
            goto L_0x03b3
        L_0x03c2:
            r23.V1()
            r23.W1()
            goto L_0x0406
        L_0x03c9:
            r18 = r4
            r7 = r5
            r20 = r12
            r17 = r13
            r21 = r14
            int r1 = r6.f2479z
            r1 = r1 & -5
            r6.f2479z = r1
            r1 = r1 & -17
            if (r15 == 0) goto L_0x03df
            r2 = 16
            goto L_0x03e0
        L_0x03df:
            r2 = 0
        L_0x03e0:
            r1 = r1 | r2
            r6.f2479z = r1
            if (r11 == 0) goto L_0x03f0
            if (r3 < 0) goto L_0x03ed
            int r1 = r6.D
            if (r1 > r0) goto L_0x03ed
            if (r1 >= r3) goto L_0x03f0
        L_0x03ed:
            int r3 = r6.D
            r0 = r3
        L_0x03f0:
            androidx.leanback.widget.o r1 = r6.W
            r1.f2447i = r3
            r1 = -1
            if (r0 == r1) goto L_0x0406
        L_0x03f7:
            androidx.leanback.widget.o r1 = r6.W
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0406
            android.view.View r1 = r6.v(r0)
            if (r1 != 0) goto L_0x0406
            goto L_0x03f7
        L_0x0406:
            r23.V1()
            androidx.leanback.widget.o r0 = r6.W
            int r1 = r0.f2444f
            int r0 = r0.f2445g
            int r2 = -r7
            r5 = r18
            int r3 = -r5
            int r4 = r6.D
            android.view.View r4 = r6.v(r4)
            if (r4 == 0) goto L_0x0421
            if (r11 == 0) goto L_0x0421
            r8 = 0
            r6.N1(r4, r8, r2, r3)
        L_0x0421:
            if (r4 == 0) goto L_0x042f
            if (r15 == 0) goto L_0x042f
            boolean r8 = r4.hasFocus()
            if (r8 != 0) goto L_0x042f
            r4.requestFocus()
            goto L_0x0471
        L_0x042f:
            if (r15 != 0) goto L_0x0471
            androidx.leanback.widget.e r8 = r6.f2470q
            boolean r8 = r8.hasFocus()
            if (r8 != 0) goto L_0x0471
            if (r4 == 0) goto L_0x0447
            boolean r8 = r4.hasFocusable()
            if (r8 == 0) goto L_0x0447
            androidx.leanback.widget.e r8 = r6.f2470q
            r8.focusableViewAvailable(r4)
            goto L_0x0463
        L_0x0447:
            int r8 = r23.A()
            r9 = 0
        L_0x044c:
            if (r9 >= r8) goto L_0x0463
            android.view.View r4 = r6.z(r9)
            if (r4 == 0) goto L_0x0460
            boolean r10 = r4.hasFocusable()
            if (r10 == 0) goto L_0x0460
            androidx.leanback.widget.e r8 = r6.f2470q
            r8.focusableViewAvailable(r4)
            goto L_0x0463
        L_0x0460:
            int r9 = r9 + 1
            goto L_0x044c
        L_0x0463:
            if (r11 == 0) goto L_0x0471
            if (r4 == 0) goto L_0x0471
            boolean r8 = r4.hasFocus()
            if (r8 == 0) goto L_0x0471
            r8 = 0
            r6.N1(r4, r8, r2, r3)
        L_0x0471:
            r23.Y0()
            r23.B1()
            androidx.leanback.widget.o r2 = r6.W
            int r3 = r2.f2444f
            if (r3 != r1) goto L_0x0646
            int r1 = r2.f2445g
            if (r1 != r0) goto L_0x0646
            r23.G1()
            r23.F1()
            r0 = r25
            boolean r0 = r0.f2941k
            if (r0 == 0) goto L_0x05ab
            androidx.recyclerview.widget.RecyclerView$s r0 = r6.f2478y
            java.util.List<androidx.recyclerview.widget.RecyclerView$a0> r0 = r0.f2909d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0499
            goto L_0x05ab
        L_0x0499:
            int[] r2 = r6.f2477x
            if (r2 == 0) goto L_0x04a0
            int r3 = r2.length
            if (r1 <= r3) goto L_0x04af
        L_0x04a0:
            if (r2 != 0) goto L_0x04a5
            r2 = 16
            goto L_0x04a6
        L_0x04a5:
            int r2 = r2.length
        L_0x04a6:
            if (r2 >= r1) goto L_0x04ab
            int r2 = r2 << 1
            goto L_0x04a6
        L_0x04ab:
            int[] r2 = new int[r2]
            r6.f2477x = r2
        L_0x04af:
            r2 = 0
            r3 = 0
        L_0x04b1:
            if (r2 >= r1) goto L_0x04c9
            java.lang.Object r4 = r0.get(r2)
            androidx.recyclerview.widget.RecyclerView$a0 r4 = (androidx.recyclerview.widget.RecyclerView.a0) r4
            int r4 = r4.g()
            if (r4 < 0) goto L_0x04c6
            int[] r5 = r6.f2477x
            int r7 = r3 + 1
            r5[r3] = r4
            r3 = r7
        L_0x04c6:
            int r2 = r2 + 1
            goto L_0x04b1
        L_0x04c9:
            if (r3 <= 0) goto L_0x05a6
            int[] r0 = r6.f2477x
            r1 = 0
            java.util.Arrays.sort(r0, r1, r3)
            androidx.leanback.widget.o r0 = r6.W
            int[] r2 = r6.f2477x
            android.util.SparseIntArray r4 = r6.f2476w
            int r5 = r0.f2445g
            if (r5 < 0) goto L_0x04e0
            int r7 = java.util.Arrays.binarySearch(r2, r1, r3, r5)
            goto L_0x04e1
        L_0x04e0:
            r7 = 0
        L_0x04e1:
            if (r7 >= 0) goto L_0x054a
            int r1 = -r7
            r7 = 1
            int r1 = r1 - r7
            boolean r7 = r0.f2441c
            if (r7 == 0) goto L_0x04ff
            androidx.leanback.widget.o$b r7 = r0.f2440b
            androidx.leanback.widget.p$b r7 = (androidx.leanback.widget.p.b) r7
            int r7 = r7.d(r5)
            androidx.leanback.widget.o$b r8 = r0.f2440b
            androidx.leanback.widget.p$b r8 = (androidx.leanback.widget.p.b) r8
            int r5 = r8.e(r5)
            int r7 = r7 - r5
            int r5 = r0.f2442d
            int r7 = r7 - r5
            goto L_0x0513
        L_0x04ff:
            androidx.leanback.widget.o$b r7 = r0.f2440b
            androidx.leanback.widget.p$b r7 = (androidx.leanback.widget.p.b) r7
            int r7 = r7.d(r5)
            androidx.leanback.widget.o$b r8 = r0.f2440b
            androidx.leanback.widget.p$b r8 = (androidx.leanback.widget.p.b) r8
            int r5 = r8.e(r5)
            int r5 = r5 + r7
            int r7 = r0.f2442d
            int r7 = r7 + r5
        L_0x0513:
            r5 = r7
        L_0x0514:
            if (r1 >= r3) goto L_0x054a
            r9 = r2[r1]
            int r7 = r4.get(r9)
            if (r7 >= 0) goto L_0x0520
            r11 = 0
            goto L_0x0521
        L_0x0520:
            r11 = r7
        L_0x0521:
            androidx.leanback.widget.o$b r7 = r0.f2440b
            java.lang.Object[] r8 = r0.f2439a
            androidx.leanback.widget.p$b r7 = (androidx.leanback.widget.p.b) r7
            r10 = 1
            int r13 = r7.b(r9, r10, r8, r10)
            androidx.leanback.widget.o$b r7 = r0.f2440b
            java.lang.Object[] r8 = r0.f2439a
            r10 = 0
            r8 = r8[r10]
            androidx.leanback.widget.p$b r7 = (androidx.leanback.widget.p.b) r7
            r10 = r13
            r12 = r5
            r7.a(r8, r9, r10, r11, r12)
            boolean r7 = r0.f2441c
            if (r7 == 0) goto L_0x0543
            int r5 = r5 - r13
            int r7 = r0.f2442d
            int r5 = r5 - r7
            goto L_0x0547
        L_0x0543:
            int r5 = r5 + r13
            int r7 = r0.f2442d
            int r5 = r5 + r7
        L_0x0547:
            int r1 = r1 + 1
            goto L_0x0514
        L_0x054a:
            int r1 = r0.f2444f
            if (r1 < 0) goto L_0x0554
            r5 = 0
            int r3 = java.util.Arrays.binarySearch(r2, r5, r3, r1)
            goto L_0x0555
        L_0x0554:
            r3 = 0
        L_0x0555:
            if (r3 >= 0) goto L_0x05a6
            int r3 = -r3
            int r3 = r3 + -2
            boolean r5 = r0.f2441c
            if (r5 == 0) goto L_0x0567
            androidx.leanback.widget.o$b r5 = r0.f2440b
            androidx.leanback.widget.p$b r5 = (androidx.leanback.widget.p.b) r5
            int r1 = r5.d(r1)
            goto L_0x056f
        L_0x0567:
            androidx.leanback.widget.o$b r5 = r0.f2440b
            androidx.leanback.widget.p$b r5 = (androidx.leanback.widget.p.b) r5
            int r1 = r5.d(r1)
        L_0x056f:
            if (r3 < 0) goto L_0x05a6
            r9 = r2[r3]
            int r5 = r4.get(r9)
            if (r5 >= 0) goto L_0x057b
            r11 = 0
            goto L_0x057c
        L_0x057b:
            r11 = r5
        L_0x057c:
            androidx.leanback.widget.o$b r5 = r0.f2440b
            java.lang.Object[] r7 = r0.f2439a
            androidx.leanback.widget.p$b r5 = (androidx.leanback.widget.p.b) r5
            r8 = 1
            r10 = 0
            int r5 = r5.b(r9, r10, r7, r8)
            boolean r7 = r0.f2441c
            if (r7 == 0) goto L_0x0591
            int r7 = r0.f2442d
            int r1 = r1 + r7
            int r1 = r1 + r5
            goto L_0x0595
        L_0x0591:
            int r7 = r0.f2442d
            int r1 = r1 - r7
            int r1 = r1 - r5
        L_0x0595:
            androidx.leanback.widget.o$b r7 = r0.f2440b
            java.lang.Object[] r8 = r0.f2439a
            r10 = 0
            r8 = r8[r10]
            androidx.leanback.widget.p$b r7 = (androidx.leanback.widget.p.b) r7
            r10 = r5
            r12 = r1
            r7.a(r8, r9, r10, r11, r12)
            int r3 = r3 + -1
            goto L_0x056f
        L_0x05a6:
            android.util.SparseIntArray r0 = r6.f2476w
            r0.clear()
        L_0x05ab:
            int r0 = r6.f2479z
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x05b6
            r0 = r0 & -1025(0xfffffffffffffbff, float:NaN)
            r6.f2479z = r0
            goto L_0x05b9
        L_0x05b6:
            r23.U1()
        L_0x05b9:
            int r0 = r6.f2479z
            r0 = r0 & 4
            if (r0 == 0) goto L_0x05dd
            int r0 = r6.D
            r1 = r17
            if (r0 != r1) goto L_0x05d9
            int r1 = r6.E
            r2 = r21
            if (r1 != r2) goto L_0x05d9
            android.view.View r0 = r6.v(r0)
            r3 = r20
            if (r0 != r3) goto L_0x05d9
            int r0 = r6.f2479z
            r0 = r0 & 8
            if (r0 == 0) goto L_0x05dd
        L_0x05d9:
            r23.a1()
            goto L_0x05e8
        L_0x05dd:
            int r0 = r6.f2479z
            r0 = r0 & 20
            r4 = 16
            if (r0 != r4) goto L_0x05e8
            r23.a1()
        L_0x05e8:
            r23.b1()
            int r0 = r6.f2479z
            r1 = r0 & 64
            if (r1 == 0) goto L_0x063c
            int r1 = r6.f2471r
            r7 = 1
            if (r1 != r7) goto L_0x060b
            int r0 = r6.f2889o
            int r0 = -r0
            int r1 = r23.A()
            if (r1 <= 0) goto L_0x0639
            r1 = 0
            android.view.View r1 = r6.z(r1)
            int r1 = r1.getTop()
            if (r1 >= 0) goto L_0x0639
            goto L_0x0638
        L_0x060b:
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0624
            int r0 = r6.f2888n
            int r1 = r23.A()
            if (r1 <= 0) goto L_0x0639
            r8 = 0
            android.view.View r1 = r6.z(r8)
            int r1 = r1.getRight()
            if (r1 <= r0) goto L_0x0639
            r0 = r1
            goto L_0x0639
        L_0x0624:
            r8 = 0
            int r0 = r6.f2888n
            int r0 = -r0
            int r1 = r23.A()
            if (r1 <= 0) goto L_0x0639
            android.view.View r1 = r6.z(r8)
            int r1 = r1.getLeft()
            if (r1 >= 0) goto L_0x0639
        L_0x0638:
            int r0 = r0 + r1
        L_0x0639:
            r6.I1(r0)
        L_0x063c:
            int r0 = r6.f2479z
            r0 = r0 & -4
            r6.f2479z = r0
            r23.z1()
            return
        L_0x0646:
            r0 = r25
            r9 = r7
            r1 = r17
            r3 = r20
            r2 = r21
            r4 = 16
            r7 = 1
            r8 = 0
            r17 = r1
            r21 = r2
            r20 = r3
            r18 = r5
            r7 = r9
            goto L_0x0406
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.t0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public int t1(View view) {
        return this.f2472s.e(view);
    }

    public void u0(RecyclerView.x xVar) {
    }

    public boolean u1() {
        if (L() == 0 || this.f2470q.G(0) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v0(androidx.recyclerview.widget.RecyclerView.s r7, androidx.recyclerview.widget.RecyclerView.x r8, int r9, int r10) {
        /*
            r6 = this;
            r6.H1(r7, r8)
            int r7 = r6.f2471r
            if (r7 != 0) goto L_0x001c
            int r7 = android.view.View.MeasureSpec.getSize(r9)
            int r8 = android.view.View.MeasureSpec.getSize(r10)
            int r9 = android.view.View.MeasureSpec.getMode(r10)
            int r10 = r6.S()
            int r0 = r6.P()
            goto L_0x0030
        L_0x001c:
            int r8 = android.view.View.MeasureSpec.getSize(r9)
            int r7 = android.view.View.MeasureSpec.getSize(r10)
            int r9 = android.view.View.MeasureSpec.getMode(r9)
            int r10 = r6.Q()
            int r0 = r6.R()
        L_0x0030:
            int r0 = r0 + r10
            r6.O = r8
            int r10 = r6.L
            r1 = -2
            java.lang.String r2 = "wrong spec"
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            if (r10 != r1) goto L_0x0081
            int r8 = r6.V
            if (r8 != 0) goto L_0x0044
            r8 = 1
        L_0x0044:
            r6.U = r8
            r10 = 0
            r6.M = r10
            int[] r10 = r6.N
            if (r10 == 0) goto L_0x0050
            int r10 = r10.length
            if (r10 == r8) goto L_0x0054
        L_0x0050:
            int[] r8 = new int[r8]
            r6.N = r8
        L_0x0054:
            androidx.recyclerview.widget.RecyclerView$x r8 = r6.f2473t
            boolean r8 = r8.f2937g
            if (r8 == 0) goto L_0x005d
            r6.T1()
        L_0x005d:
            r6.D1(r5)
            if (r9 == r4) goto L_0x0075
            if (r9 == 0) goto L_0x0070
            if (r9 != r3) goto L_0x006a
            int r8 = r6.O
            goto L_0x00e6
        L_0x006a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L_0x0070:
            int r8 = r6.n1()
            goto L_0x00a3
        L_0x0075:
            int r8 = r6.n1()
            int r8 = r8 + r0
            int r9 = r6.O
            int r8 = java.lang.Math.min(r8, r9)
            goto L_0x00e6
        L_0x0081:
            if (r9 == r4) goto L_0x00a5
            if (r9 == 0) goto L_0x008e
            if (r9 != r3) goto L_0x0088
            goto L_0x00a5
        L_0x0088:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
            throw r7
        L_0x008e:
            if (r10 != 0) goto L_0x0092
            int r10 = r8 - r0
        L_0x0092:
            r6.M = r10
            int r8 = r6.V
            if (r8 != 0) goto L_0x0099
            r8 = 1
        L_0x0099:
            r6.U = r8
            int r10 = r10 * r8
            int r9 = r6.S
            int r8 = r8 - r5
            int r8 = r8 * r9
            int r8 = r8 + r10
        L_0x00a3:
            int r8 = r8 + r0
            goto L_0x00e6
        L_0x00a5:
            int r1 = r6.V
            if (r1 != 0) goto L_0x00b2
            if (r10 != 0) goto L_0x00b2
            r6.U = r5
            int r10 = r8 - r0
            r6.M = r10
            goto L_0x00d4
        L_0x00b2:
            if (r1 != 0) goto L_0x00bf
            r6.M = r10
            int r1 = r6.S
            int r2 = r8 + r1
            int r10 = r10 + r1
            int r2 = r2 / r10
            r6.U = r2
            goto L_0x00d4
        L_0x00bf:
            if (r10 != 0) goto L_0x00d0
            r6.U = r1
            int r10 = r8 - r0
            int r2 = r6.S
            int r3 = r1 + -1
            int r3 = r3 * r2
            int r10 = r10 - r3
            int r10 = r10 / r1
            r6.M = r10
            goto L_0x00d4
        L_0x00d0:
            r6.U = r1
            r6.M = r10
        L_0x00d4:
            if (r9 != r4) goto L_0x00e6
            int r9 = r6.M
            int r10 = r6.U
            int r9 = r9 * r10
            int r1 = r6.S
            int r10 = r10 - r5
            int r10 = r10 * r1
            int r10 = r10 + r9
            int r10 = r10 + r0
            if (r10 >= r8) goto L_0x00e6
            r8 = r10
        L_0x00e6:
            int r9 = r6.f2471r
            if (r9 != 0) goto L_0x00f0
            androidx.recyclerview.widget.RecyclerView r9 = r6.f2876b
            r9.setMeasuredDimension(r7, r8)
            goto L_0x00f5
        L_0x00f0:
            androidx.recyclerview.widget.RecyclerView r9 = r6.f2876b
            r9.setMeasuredDimension(r8, r7)
        L_0x00f5:
            r6.z1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.v0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, int, int):void");
    }

    public boolean v1() {
        int L2 = L();
        if (L2 == 0 || this.f2470q.G(L2 - 1) != null) {
            return true;
        }
        return false;
    }

    public RecyclerView.n w() {
        return new d(-2, -2);
    }

    public boolean w0(RecyclerView recyclerView, View view, View view2) {
        if ((this.f2479z & 32768) == 0 && f1(view) != -1 && (this.f2479z & 35) == 0) {
            L1(view, view2, true, 0, 0);
        }
        return true;
    }

    public boolean w1() {
        return this.W != null;
    }

    public RecyclerView.n x(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public void x0(Parcelable parcelable) {
        if (parcelable instanceof f) {
            f fVar = (f) parcelable;
            this.D = fVar.f2495a;
            this.H = 0;
            s1 s1Var = this.f2465d0;
            Bundle bundle = fVar.f2496b;
            g<String, SparseArray<Parcelable>> gVar = s1Var.f2523c;
            if (!(gVar == null || bundle == null)) {
                gVar.e(-1);
                for (String str : bundle.keySet()) {
                    s1Var.f2523c.c(str, bundle.getSparseParcelableArray(str));
                }
            }
            this.f2479z |= 256;
            I0();
        }
    }

    public boolean x1(int i10) {
        RecyclerView.a0 G2 = this.f2470q.G(i10);
        if (G2 != null && G2.f2842a.getLeft() >= 0 && G2.f2842a.getRight() <= this.f2470q.getWidth() && G2.f2842a.getTop() >= 0 && G2.f2842a.getBottom() <= this.f2470q.getHeight()) {
            return true;
        }
        return false;
    }

    public RecyclerView.n y(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.n) {
            return new d((RecyclerView.n) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable y0() {
        /*
            r7 = this;
            androidx.leanback.widget.p$f r0 = new androidx.leanback.widget.p$f
            r0.<init>()
            int r1 = r7.D
            r0.f2495a = r1
            androidx.leanback.widget.s1 r1 = r7.f2465d0
            s.g<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r2 = r1.f2523c
            if (r2 == 0) goto L_0x0050
            monitor-enter(r2)
            int r3 = r2.f24823b     // Catch:{ all -> 0x004d }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0016
            goto L_0x0050
        L_0x0016:
            s.g<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r1 = r1.f2523c
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap<K, V> r3 = r1.f24822a     // Catch:{ all -> 0x004a }
            r2.<init>(r3)     // Catch:{ all -> 0x004a }
            monitor-exit(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0051
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            r1.putSparseParcelableArray(r4, r3)
            goto L_0x002e
        L_0x004a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x004d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0050:
            r1 = 0
        L_0x0051:
            r2 = 0
            int r3 = r7.A()
        L_0x0056:
            if (r2 >= r3) goto L_0x0082
            android.view.View r4 = r7.z(r2)
            int r5 = r7.f1(r4)
            r6 = -1
            if (r5 == r6) goto L_0x007f
            androidx.leanback.widget.s1 r6 = r7.f2465d0
            int r6 = r6.f2521a
            if (r6 == 0) goto L_0x007f
            java.lang.String r5 = java.lang.Integer.toString(r5)
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            r4.saveHierarchyState(r6)
            if (r1 != 0) goto L_0x007c
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L_0x007c:
            r1.putSparseParcelableArray(r5, r6)
        L_0x007f:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0082:
            r0.f2496b = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.p.y0():android.os.Parcelable");
    }

    public void y1(int i10, View view, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (this.f2471r == 0) {
            i14 = g1(view);
        } else {
            i14 = h1(view);
        }
        int i17 = this.M;
        if (i17 > 0) {
            i14 = Math.min(i14, i17);
        }
        int i18 = this.T;
        int i19 = i18 & 112;
        int absoluteGravity = (this.f2479z & 786432) != 0 ? Gravity.getAbsoluteGravity(i18 & 8388615, 1) : i18 & 7;
        int i20 = this.f2471r;
        if (!((i20 == 0 && i19 == 48) || (i20 == 1 && absoluteGravity == 3))) {
            if ((i20 == 0 && i19 == 80) || (i20 == 1 && absoluteGravity == 5)) {
                i16 = j1(i10) - i14;
            } else if ((i20 == 0 && i19 == 16) || (i20 == 1 && absoluteGravity == 1)) {
                i16 = (j1(i10) - i14) / 2;
            }
            i13 += i16;
        }
        if (this.f2471r == 0) {
            i15 = i14 + i13;
        } else {
            int i21 = i14 + i13;
            int i22 = i13;
            i13 = i11;
            i11 = i22;
            int i23 = i21;
            i15 = i12;
            i12 = i23;
        }
        d dVar = (d) view.getLayoutParams();
        b0(view, i11, i13, i12, i15);
        Rect rect = f2460h0;
        super.E(view, rect);
        int i24 = i11 - rect.left;
        int i25 = i13 - rect.top;
        int i26 = rect.right - i12;
        dVar.f2484e = i24;
        dVar.f2485f = i25;
        dVar.f2486g = i26;
        dVar.f2487h = rect.bottom - i15;
        S1(view);
    }

    public final void z1() {
        this.f2478y = null;
        this.f2473t = null;
        this.f2474u = 0;
        this.f2475v = 0;
    }

    /* compiled from: GridLayoutManager */
    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2495a;

        /* renamed from: b  reason: collision with root package name */
        public Bundle f2496b = Bundle.EMPTY;

        /* compiled from: GridLayoutManager */
        public static class a implements Parcelable.Creator<f> {
            public Object createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            public Object[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel) {
            this.f2495a = parcel.readInt();
            this.f2496b = parcel.readBundle(p.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2495a);
            parcel.writeBundle(this.f2496b);
        }

        public f() {
        }
    }
}
