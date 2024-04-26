package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import f0.j;
import java.util.Arrays;
import p0.c;
import v.e;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public c K = new a();
    public final Rect L = new Rect();

    public static final class a extends c {
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f2759a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f2760b = new SparseIntArray();

        public int a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        M1(RecyclerView.m.U(context, attributeSet, i10, i11).f2893b);
    }

    public void A1(boolean z10) {
        if (!z10) {
            e((String) null);
            if (this.f2767v) {
                this.f2767v = false;
                I0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public int C(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f2761p == 1) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return H1(sVar, xVar, xVar.b() - 1) + 1;
    }

    public final void E1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (!(iArr != null && iArr.length == i12 + 1 && iArr[iArr.length - 1] == i10)) {
            iArr = new int[(i12 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final void F1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public int G1(int i10, int i11) {
        if (this.f2761p != 1 || !r1()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int H1(RecyclerView.s sVar, RecyclerView.x xVar, int i10) {
        if (!xVar.f2937g) {
            return this.K.a(i10, this.F);
        }
        int c10 = sVar.c(i10);
        if (c10 != -1) {
            return this.K.a(c10, this.F);
        }
        j.a("Cannot find span size for pre layout position. ", i10, "GridLayoutManager");
        return 0;
    }

    public final int I1(RecyclerView.s sVar, RecyclerView.x xVar, int i10) {
        if (!xVar.f2937g) {
            c cVar = this.K;
            int i11 = this.F;
            cVar.getClass();
            return i10 % i11;
        }
        int i12 = this.J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int c10 = sVar.c(i10);
        if (c10 == -1) {
            j.a("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i10, "GridLayoutManager");
            return 0;
        }
        c cVar2 = this.K;
        int i13 = this.F;
        cVar2.getClass();
        return c10 % i13;
    }

    public final int J1(RecyclerView.s sVar, RecyclerView.x xVar, int i10) {
        if (!xVar.f2937g) {
            this.K.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (sVar.c(i10) == -1) {
            j.a("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i10, "GridLayoutManager");
            return 1;
        }
        this.K.getClass();
        return 1;
    }

    public int K0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        N1();
        F1();
        if (this.f2761p == 1) {
            return 0;
        }
        return y1(i10, sVar, xVar);
    }

    public final void K1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2897b;
        int i13 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i14 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int G1 = G1(bVar.f2757e, bVar.f2758f);
        if (this.f2761p == 1) {
            i11 = RecyclerView.m.B(G1, i10, i14, bVar.width, false);
            i12 = RecyclerView.m.B(this.f2763r.l(), this.f2887m, i13, bVar.height, true);
        } else {
            int B = RecyclerView.m.B(G1, i10, i13, bVar.height, false);
            int B2 = RecyclerView.m.B(this.f2763r.l(), this.f2886l, i14, bVar.width, true);
            i12 = B;
            i11 = B2;
        }
        L1(view, i11, i12, z10);
    }

    public final void L1(View view, int i10, int i11, boolean z10) {
        boolean z11;
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z10) {
            z11 = U0(view, i10, i11, nVar);
        } else {
            z11 = S0(view, i10, i11, nVar);
        }
        if (z11) {
            view.measure(i10, i11);
        }
    }

    public int M0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        N1();
        F1();
        if (this.f2761p == 0) {
            return 0;
        }
        return y1(i10, sVar, xVar);
    }

    public void M1(int i10) {
        if (i10 != this.F) {
            this.E = true;
            if (i10 >= 1) {
                this.F = i10;
                this.K.f2759a.clear();
                I0();
                return;
            }
            throw new IllegalArgumentException(d0.a("Span count should be at least 1. Provided ", i10));
        }
    }

    public final void N1() {
        int i10;
        int i11;
        if (this.f2761p == 1) {
            i11 = this.f2888n - R();
            i10 = Q();
        } else {
            i11 = this.f2889o - P();
            i10 = S();
        }
        E1(i11 - i10);
    }

    public void P0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.G == null) {
            super.P0(rect, i10, i11);
        }
        int R = R() + Q();
        int P = P() + S();
        if (this.f2761p == 1) {
            i13 = RecyclerView.m.j(i11, rect.height() + P, N());
            int[] iArr = this.G;
            i12 = RecyclerView.m.j(i10, iArr[iArr.length - 1] + R, O());
        } else {
            i12 = RecyclerView.m.j(i10, rect.width() + R, O());
            int[] iArr2 = this.G;
            i13 = RecyclerView.m.j(i11, iArr2[iArr2.length - 1] + P, N());
        }
        this.f2876b.setMeasuredDimension(i12, i13);
    }

    public int V(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f2761p == 0) {
            return this.F;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return H1(sVar, xVar, xVar.b() - 1) + 1;
    }

    public boolean X0() {
        return this.f2771z == null && !this.E;
    }

    public void Z0(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F && cVar.b(xVar) && i10 > 0; i11++) {
            ((k.b) cVar2).a(cVar.f2784d, Math.max(0, cVar.f2787g));
            this.K.getClass();
            i10--;
            cVar.f2784d += cVar.f2785e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        if (r13 == (r2 > r15)) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fe, code lost:
        if (r13 == (r2 > r8)) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View h0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.u(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f2757e
            int r5 = r5.f2758f
            int r5 = r5 + r6
            android.view.View r7 = super.h0(r23, r24, r25, r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.d1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f2766u
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r22.A()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r22.A()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f2761p
            if (r13 != r9) goto L_0x0051
            boolean r13 = r22.r1()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.H1(r1, r2, r7)
            r10 = r7
            r16 = r12
            r8 = -1
            r9 = 0
            r12 = 0
            r15 = -1
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0144
            r17 = r11
            int r11 = r0.H1(r1, r2, r10)
            android.view.View r1 = r0.z(r10)
            if (r1 != r3) goto L_0x006e
            goto L_0x0144
        L_0x006e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r11 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x007a
            goto L_0x0144
        L_0x007a:
            r18 = r3
            r21 = r7
            r19 = r9
            r20 = r14
            r14 = 1
            goto L_0x0132
        L_0x0085:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r2 = r11.f2757e
            r18 = r3
            int r3 = r11.f2758f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b0
            if (r7 != 0) goto L_0x00b0
        L_0x00ad:
            r21 = r7
            goto L_0x00ce
        L_0x00b0:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d5
            if (r7 <= r9) goto L_0x00c5
            goto L_0x00ce
        L_0x00c5:
            if (r7 != r9) goto L_0x0102
            if (r2 <= r15) goto L_0x00cb
            r7 = 1
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            if (r13 != r7) goto L_0x0102
        L_0x00ce:
            r19 = r9
            r20 = r14
            r7 = 1
            r14 = 1
            goto L_0x0108
        L_0x00d5:
            if (r4 != 0) goto L_0x0102
            r19 = r9
            androidx.recyclerview.widget.z r9 = r0.f2877c
            r20 = r14
            r14 = 24579(0x6003, float:3.4443E-41)
            boolean r9 = r9.b(r1, r14)
            if (r9 == 0) goto L_0x00ef
            androidx.recyclerview.widget.z r9 = r0.f2878d
            boolean r9 = r9.b(r1, r14)
            if (r9 == 0) goto L_0x00ef
            r9 = 1
            goto L_0x00f0
        L_0x00ef:
            r9 = 0
        L_0x00f0:
            r14 = 1
            r9 = r9 ^ r14
            if (r9 == 0) goto L_0x0107
            if (r7 <= r12) goto L_0x00f7
            goto L_0x0100
        L_0x00f7:
            if (r7 != r12) goto L_0x0107
            if (r2 <= r8) goto L_0x00fd
            r7 = 1
            goto L_0x00fe
        L_0x00fd:
            r7 = 0
        L_0x00fe:
            if (r13 != r7) goto L_0x0107
        L_0x0100:
            r7 = 1
            goto L_0x0108
        L_0x0102:
            r19 = r9
            r20 = r14
            r14 = 1
        L_0x0107:
            r7 = 0
        L_0x0108:
            if (r7 == 0) goto L_0x0132
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x0121
            int r4 = r11.f2757e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r9 = r3 - r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L_0x0136
        L_0x0121:
            int r7 = r11.f2757e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r8 = r7
            r9 = r19
            r7 = r1
            goto L_0x0136
        L_0x0132:
            r9 = r19
            r7 = r21
        L_0x0136:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            r14 = r20
            goto L_0x005e
        L_0x0144:
            r21 = r7
            if (r4 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r4 = r21
        L_0x014b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.h0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public boolean i(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    public void l0(RecyclerView.s sVar, RecyclerView.x xVar, View view, p0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            k0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int H1 = H1(sVar, xVar, bVar.b());
        if (this.f2761p == 0) {
            cVar.n(c.C0207c.a(bVar.f2757e, bVar.f2758f, H1, 1, false, false));
            return;
        }
        cVar.n(c.C0207c.a(H1, 1, bVar.f2757e, bVar.f2758f, false, false));
    }

    public View m1(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10, boolean z11) {
        int i10;
        int A = A();
        int i11 = -1;
        int i12 = 1;
        if (z11) {
            i10 = A() - 1;
            i12 = -1;
        } else {
            i11 = A;
            i10 = 0;
        }
        int b10 = xVar.b();
        e1();
        int k10 = this.f2763r.k();
        int g10 = this.f2763r.g();
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View z12 = z(i10);
            int T = T(z12);
            if (T >= 0 && T < b10 && I1(sVar, xVar, T) == 0) {
                if (((RecyclerView.n) z12.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = z12;
                    }
                } else if (this.f2763r.e(z12) < g10 && this.f2763r.b(z12) >= k10) {
                    return z12;
                } else {
                    if (view == null) {
                        view = z12;
                    }
                }
            }
            i10 += i12;
        }
        return view != null ? view : view2;
    }

    public int n(RecyclerView.x xVar) {
        return b1(xVar);
    }

    public void n0(RecyclerView recyclerView, int i10, int i11) {
        this.K.f2759a.clear();
        this.K.f2760b.clear();
    }

    public int o(RecyclerView.x xVar) {
        return c1(xVar);
    }

    public void o0(RecyclerView recyclerView) {
        this.K.f2759a.clear();
        this.K.f2760b.clear();
    }

    public void p0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.K.f2759a.clear();
        this.K.f2760b.clear();
    }

    public int q(RecyclerView.x xVar) {
        return b1(xVar);
    }

    public void q0(RecyclerView recyclerView, int i10, int i11) {
        this.K.f2759a.clear();
        this.K.f2760b.clear();
    }

    public int r(RecyclerView.x xVar) {
        return c1(xVar);
    }

    public void s0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.K.f2759a.clear();
        this.K.f2760b.clear();
    }

    public void s1(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int Q;
        int d10;
        int i20;
        int i21;
        boolean z10;
        View c10;
        RecyclerView.s sVar2 = sVar;
        RecyclerView.x xVar2 = xVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int j10 = this.f2763r.j();
        boolean z11 = j10 != 1073741824;
        int i22 = A() > 0 ? this.G[this.F] : 0;
        if (z11) {
            N1();
        }
        boolean z12 = cVar2.f2785e == 1;
        int i23 = this.F;
        if (!z12) {
            i23 = I1(sVar2, xVar2, cVar2.f2784d) + J1(sVar2, xVar2, cVar2.f2784d);
        }
        int i24 = 0;
        while (i24 < this.F && cVar2.b(xVar2) && i23 > 0) {
            int i25 = cVar2.f2784d;
            int J1 = J1(sVar2, xVar2, i25);
            if (J1 <= this.F) {
                i23 -= J1;
                if (i23 < 0 || (c10 = cVar2.c(sVar2)) == null) {
                    break;
                }
                this.H[i24] = c10;
                i24++;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Item at position ");
                sb2.append(i25);
                sb2.append(" requires ");
                sb2.append(J1);
                sb2.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(e.a(sb2, this.F, " spans."));
            }
        }
        if (i24 == 0) {
            bVar2.f2778b = true;
            return;
        }
        if (z12) {
            i13 = 0;
            i12 = i24;
            i11 = 0;
            i10 = 1;
        } else {
            i13 = i24 - 1;
            i12 = -1;
            i11 = 0;
            i10 = -1;
        }
        while (i13 != i12) {
            View view = this.H[i13];
            b bVar3 = (b) view.getLayoutParams();
            int J12 = J1(sVar2, xVar2, T(view));
            bVar3.f2758f = J12;
            bVar3.f2757e = i11;
            i11 += J12;
            i13 += i10;
        }
        float f10 = 0.0f;
        int i26 = 0;
        for (int i27 = 0; i27 < i24; i27++) {
            View view2 = this.H[i27];
            if (cVar2.f2791k != null) {
                z10 = false;
                if (z12) {
                    b(view2);
                } else {
                    d(view2, 0, true);
                }
            } else if (z12) {
                c(view2);
                z10 = false;
            } else {
                z10 = false;
                d(view2, 0, false);
            }
            f(view2, this.L);
            K1(view2, j10, z10);
            int c11 = this.f2763r.c(view2);
            if (c11 > i26) {
                i26 = c11;
            }
            float d11 = (((float) this.f2763r.d(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f2758f);
            if (d11 > f10) {
                f10 = d11;
            }
        }
        if (z11) {
            E1(Math.max(Math.round(f10 * ((float) this.F)), i22));
            i26 = 0;
            for (int i28 = 0; i28 < i24; i28++) {
                View view3 = this.H[i28];
                K1(view3, 1073741824, true);
                int c12 = this.f2763r.c(view3);
                if (c12 > i26) {
                    i26 = c12;
                }
            }
        }
        for (int i29 = 0; i29 < i24; i29++) {
            View view4 = this.H[i29];
            if (this.f2763r.c(view4) != i26) {
                b bVar4 = (b) view4.getLayoutParams();
                Rect rect = bVar4.f2897b;
                int i30 = rect.top + rect.bottom + bVar4.topMargin + bVar4.bottomMargin;
                int i31 = rect.left + rect.right + bVar4.leftMargin + bVar4.rightMargin;
                int G1 = G1(bVar4.f2757e, bVar4.f2758f);
                if (this.f2761p == 1) {
                    i21 = RecyclerView.m.B(G1, 1073741824, i31, bVar4.width, false);
                    i20 = View.MeasureSpec.makeMeasureSpec(i26 - i30, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i31, 1073741824);
                    i20 = RecyclerView.m.B(G1, 1073741824, i30, bVar4.height, false);
                    i21 = makeMeasureSpec;
                }
                L1(view4, i21, i20, true);
            }
        }
        bVar2.f2777a = i26;
        if (this.f2761p == 1) {
            if (cVar2.f2786f == -1) {
                i17 = cVar2.f2782b;
                i16 = i17 - i26;
            } else {
                i16 = cVar2.f2782b;
                i17 = i26 + i16;
            }
            i15 = 0;
            i14 = 0;
        } else {
            if (cVar2.f2786f == -1) {
                int i32 = cVar2.f2782b;
                i15 = i32;
                i14 = i32 - i26;
            } else {
                int i33 = cVar2.f2782b;
                i14 = i33;
                i15 = i26 + i33;
            }
            i16 = 0;
            i17 = 0;
        }
        int i34 = 0;
        while (i34 < i24) {
            View view5 = this.H[i34];
            b bVar5 = (b) view5.getLayoutParams();
            if (this.f2761p == 1) {
                if (r1()) {
                    d10 = Q() + this.G[this.F - bVar5.f2757e];
                    Q = d10 - this.f2763r.d(view5);
                } else {
                    Q = this.G[bVar5.f2757e] + Q();
                    d10 = this.f2763r.d(view5) + Q;
                }
                i19 = i17;
                i18 = i16;
            } else {
                int S = S() + this.G[bVar5.f2757e];
                i18 = S;
                i19 = this.f2763r.d(view5) + S;
            }
            int i35 = i15;
            int i36 = i14;
            b0(view5, i36, i18, i35, i19);
            if (bVar5.d() || bVar5.c()) {
                bVar2.f2779c = true;
            }
            bVar2.f2780d |= view5.hasFocusable();
            i34++;
            i17 = i19;
            i16 = i18;
            i15 = i35;
            i14 = i36;
        }
        Arrays.fill(this.H, (Object) null);
    }

    public void t0(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (xVar.f2937g) {
            int A = A();
            for (int i10 = 0; i10 < A; i10++) {
                b bVar = (b) z(i10).getLayoutParams();
                int b10 = bVar.b();
                this.I.put(b10, bVar.f2758f);
                this.J.put(b10, bVar.f2757e);
            }
        }
        super.t0(sVar, xVar);
        this.I.clear();
        this.J.clear();
    }

    public void t1(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i10) {
        N1();
        if (xVar.b() > 0 && !xVar.f2937g) {
            boolean z10 = i10 == 1;
            int I1 = I1(sVar, xVar, aVar.f2773b);
            if (z10) {
                while (I1 > 0) {
                    int i11 = aVar.f2773b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f2773b = i12;
                    I1 = I1(sVar, xVar, i12);
                }
            } else {
                int b10 = xVar.b() - 1;
                int i13 = aVar.f2773b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int I12 = I1(sVar, xVar, i14);
                    if (I12 <= I1) {
                        break;
                    }
                    i13 = i14;
                    I1 = I12;
                }
                aVar.f2773b = i13;
            }
        }
        F1();
    }

    public void u0(RecyclerView.x xVar) {
        this.f2771z = null;
        this.f2769x = -1;
        this.f2770y = Integer.MIN_VALUE;
        this.A.d();
        this.E = false;
    }

    public RecyclerView.n w() {
        if (this.f2761p == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.n x(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.n y(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public static class b extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public int f2757e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2758f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(i11, z10);
        M1(i10);
    }

    public GridLayoutManager(Context context, int i10) {
        super(1, false);
        M1(i10);
    }
}
