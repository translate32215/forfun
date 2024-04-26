package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.d0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public final a A;
    public final b B;
    public int C;
    public int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f2761p;

    /* renamed from: q  reason: collision with root package name */
    public c f2762q;

    /* renamed from: r  reason: collision with root package name */
    public q f2763r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2764s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2765t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2766u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2767v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2768w;

    /* renamed from: x  reason: collision with root package name */
    public int f2769x;

    /* renamed from: y  reason: collision with root package name */
    public int f2770y;

    /* renamed from: z  reason: collision with root package name */
    public d f2771z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public q f2772a;

        /* renamed from: b  reason: collision with root package name */
        public int f2773b;

        /* renamed from: c  reason: collision with root package name */
        public int f2774c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2775d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2776e;

        public a() {
            d();
        }

        public void a() {
            int i10;
            if (this.f2775d) {
                i10 = this.f2772a.g();
            } else {
                i10 = this.f2772a.k();
            }
            this.f2774c = i10;
        }

        public void b(View view, int i10) {
            if (this.f2775d) {
                this.f2774c = this.f2772a.m() + this.f2772a.b(view);
            } else {
                this.f2774c = this.f2772a.e(view);
            }
            this.f2773b = i10;
        }

        public void c(View view, int i10) {
            int m10 = this.f2772a.m();
            if (m10 >= 0) {
                b(view, i10);
                return;
            }
            this.f2773b = i10;
            if (this.f2775d) {
                int g10 = (this.f2772a.g() - m10) - this.f2772a.b(view);
                this.f2774c = this.f2772a.g() - g10;
                if (g10 > 0) {
                    int c10 = this.f2774c - this.f2772a.c(view);
                    int k10 = this.f2772a.k();
                    int min = c10 - (Math.min(this.f2772a.e(view) - k10, 0) + k10);
                    if (min < 0) {
                        this.f2774c = Math.min(g10, -min) + this.f2774c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e10 = this.f2772a.e(view);
            int k11 = e10 - this.f2772a.k();
            this.f2774c = e10;
            if (k11 > 0) {
                int g11 = (this.f2772a.g() - Math.min(0, (this.f2772a.g() - m10) - this.f2772a.b(view))) - (this.f2772a.c(view) + e10);
                if (g11 < 0) {
                    this.f2774c -= Math.min(k11, -g11);
                }
            }
        }

        public void d() {
            this.f2773b = -1;
            this.f2774c = Integer.MIN_VALUE;
            this.f2775d = false;
            this.f2776e = false;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("AnchorInfo{mPosition=");
            a10.append(this.f2773b);
            a10.append(", mCoordinate=");
            a10.append(this.f2774c);
            a10.append(", mLayoutFromEnd=");
            a10.append(this.f2775d);
            a10.append(", mValid=");
            a10.append(this.f2776e);
            a10.append('}');
            return a10.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2777a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2778b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2779c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2780d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2781a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f2782b;

        /* renamed from: c  reason: collision with root package name */
        public int f2783c;

        /* renamed from: d  reason: collision with root package name */
        public int f2784d;

        /* renamed from: e  reason: collision with root package name */
        public int f2785e;

        /* renamed from: f  reason: collision with root package name */
        public int f2786f;

        /* renamed from: g  reason: collision with root package name */
        public int f2787g;

        /* renamed from: h  reason: collision with root package name */
        public int f2788h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2789i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f2790j;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.a0> f2791k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2792l;

        public void a(View view) {
            int b10;
            int size = this.f2791k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2791k.get(i11).f2842a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.d() && (b10 = (nVar.b() - this.f2784d) * this.f2785e) >= 0 && b10 < i10) {
                    view2 = view3;
                    if (b10 == 0) {
                        break;
                    }
                    i10 = b10;
                }
            }
            if (view2 == null) {
                this.f2784d = -1;
            } else {
                this.f2784d = ((RecyclerView.n) view2.getLayoutParams()).b();
            }
        }

        public boolean b(RecyclerView.x xVar) {
            int i10 = this.f2784d;
            return i10 >= 0 && i10 < xVar.b();
        }

        public View c(RecyclerView.s sVar) {
            List<RecyclerView.a0> list = this.f2791k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f2791k.get(i10).f2842a;
                    RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                    if (!nVar.d() && this.f2784d == nVar.b()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View e10 = sVar.e(this.f2784d);
            this.f2784d += this.f2785e;
            return e10;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2793a;

        /* renamed from: b  reason: collision with root package name */
        public int f2794b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2795c;

        public class a implements Parcelable.Creator<d> {
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public Object[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.f2793a >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2793a);
            parcel.writeInt(this.f2794b);
            parcel.writeInt(this.f2795c ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f2793a = parcel.readInt();
            this.f2794b = parcel.readInt();
            this.f2795c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f2793a = dVar.f2793a;
            this.f2794b = dVar.f2794b;
            this.f2795c = dVar.f2795c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    public void A1(boolean z10) {
        e((String) null);
        if (this.f2767v != z10) {
            this.f2767v = z10;
            I0();
        }
    }

    public final void B1(int i10, int i11, boolean z10, RecyclerView.x xVar) {
        int i12;
        this.f2762q.f2792l = w1();
        this.f2762q.f2786f = i10;
        int[] iArr = this.D;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        Y0(xVar, iArr);
        int max = Math.max(0, this.D[0]);
        int max2 = Math.max(0, this.D[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.f2762q;
        int i14 = z11 ? max2 : max;
        cVar.f2788h = i14;
        if (!z11) {
            max = max2;
        }
        cVar.f2789i = max;
        if (z11) {
            cVar.f2788h = this.f2763r.h() + i14;
            View p12 = p1();
            c cVar2 = this.f2762q;
            if (this.f2766u) {
                i13 = -1;
            }
            cVar2.f2785e = i13;
            int T = T(p12);
            c cVar3 = this.f2762q;
            cVar2.f2784d = T + cVar3.f2785e;
            cVar3.f2782b = this.f2763r.b(p12);
            i12 = this.f2763r.b(p12) - this.f2763r.g();
        } else {
            View q12 = q1();
            c cVar4 = this.f2762q;
            cVar4.f2788h = this.f2763r.k() + cVar4.f2788h;
            c cVar5 = this.f2762q;
            if (!this.f2766u) {
                i13 = -1;
            }
            cVar5.f2785e = i13;
            int T2 = T(q12);
            c cVar6 = this.f2762q;
            cVar5.f2784d = T2 + cVar6.f2785e;
            cVar6.f2782b = this.f2763r.e(q12);
            i12 = (-this.f2763r.e(q12)) + this.f2763r.k();
        }
        c cVar7 = this.f2762q;
        cVar7.f2783c = i11;
        if (z10) {
            cVar7.f2783c = i11 - i12;
        }
        cVar7.f2787g = i12;
    }

    public final void C1(int i10, int i11) {
        this.f2762q.f2783c = this.f2763r.g() - i11;
        c cVar = this.f2762q;
        cVar.f2785e = this.f2766u ? -1 : 1;
        cVar.f2784d = i10;
        cVar.f2786f = 1;
        cVar.f2782b = i11;
        cVar.f2787g = Integer.MIN_VALUE;
    }

    public final void D1(int i10, int i11) {
        this.f2762q.f2783c = i11 - this.f2763r.k();
        c cVar = this.f2762q;
        cVar.f2784d = i10;
        cVar.f2785e = this.f2766u ? 1 : -1;
        cVar.f2786f = -1;
        cVar.f2782b = i11;
        cVar.f2787g = Integer.MIN_VALUE;
    }

    public int K0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f2761p == 1) {
            return 0;
        }
        return y1(i10, sVar, xVar);
    }

    public void L0(int i10) {
        this.f2769x = i10;
        this.f2770y = Integer.MIN_VALUE;
        d dVar = this.f2771z;
        if (dVar != null) {
            dVar.f2793a = -1;
        }
        I0();
    }

    public int M0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f2761p == 0) {
            return 0;
        }
        return y1(i10, sVar, xVar);
    }

    public boolean T0() {
        boolean z10;
        if (!(this.f2887m == 1073741824 || this.f2886l == 1073741824)) {
            int A2 = A();
            int i10 = 0;
            while (true) {
                if (i10 >= A2) {
                    z10 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = z(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public void V0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        m mVar = new m(recyclerView.getContext());
        mVar.f2916a = i10;
        W0(mVar);
    }

    public boolean X0() {
        return this.f2771z == null && this.f2764s == this.f2767v;
    }

    public boolean Y() {
        return true;
    }

    public void Y0(RecyclerView.x xVar, int[] iArr) {
        int i10;
        int l10 = xVar.f2931a != -1 ? this.f2763r.l() : 0;
        if (this.f2762q.f2786f == -1) {
            i10 = 0;
        } else {
            i10 = l10;
            l10 = 0;
        }
        iArr[0] = l10;
        iArr[1] = i10;
    }

    public void Z0(RecyclerView.x xVar, c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f2784d;
        if (i10 >= 0 && i10 < xVar.b()) {
            ((k.b) cVar2).a(i10, Math.max(0, cVar.f2787g));
        }
    }

    public PointF a(int i10) {
        if (A() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < T(z(0))) {
            z10 = true;
        }
        if (z10 != this.f2766u) {
            i11 = -1;
        }
        if (this.f2761p == 0) {
            return new PointF((float) i11, 0.0f);
        }
        return new PointF(0.0f, (float) i11);
    }

    public final int a1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        e1();
        q qVar = this.f2763r;
        View h12 = h1(!this.f2768w, true);
        return w.a(xVar, qVar, h12, g1(!this.f2768w, true), this, this.f2768w);
    }

    public final int b1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        e1();
        q qVar = this.f2763r;
        View h12 = h1(!this.f2768w, true);
        return w.b(xVar, qVar, h12, g1(!this.f2768w, true), this, this.f2768w, this.f2766u);
    }

    public final int c1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        e1();
        q qVar = this.f2763r;
        View h12 = h1(!this.f2768w, true);
        return w.c(xVar, qVar, h12, g1(!this.f2768w, true), this, this.f2768w);
    }

    public int d1(int i10) {
        if (i10 == 1) {
            return (this.f2761p != 1 && r1()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f2761p != 1 && r1()) ? -1 : 1;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    return (i10 == 130 && this.f2761p == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.f2761p == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.f2761p == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f2761p == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public void e(String str) {
        RecyclerView recyclerView;
        if (this.f2771z == null && (recyclerView = this.f2876b) != null) {
            recyclerView.i(str);
        }
    }

    public void e1() {
        if (this.f2762q == null) {
            this.f2762q = new c();
        }
    }

    public int f1(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z10) {
        int i10 = cVar.f2783c;
        int i11 = cVar.f2787g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2787g = i11 + i10;
            }
            u1(sVar, cVar);
        }
        int i12 = cVar.f2783c + cVar.f2788h;
        b bVar = this.B;
        while (true) {
            if ((!cVar.f2792l && i12 <= 0) || !cVar.b(xVar)) {
                break;
            }
            bVar.f2777a = 0;
            bVar.f2778b = false;
            bVar.f2779c = false;
            bVar.f2780d = false;
            s1(sVar, xVar, cVar, bVar);
            if (!bVar.f2778b) {
                int i13 = cVar.f2782b;
                int i14 = bVar.f2777a;
                cVar.f2782b = (cVar.f2786f * i14) + i13;
                if (!bVar.f2779c || cVar.f2791k != null || !xVar.f2937g) {
                    cVar.f2783c -= i14;
                    i12 -= i14;
                }
                int i15 = cVar.f2787g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    cVar.f2787g = i16;
                    int i17 = cVar.f2783c;
                    if (i17 < 0) {
                        cVar.f2787g = i16 + i17;
                    }
                    u1(sVar, cVar);
                }
                if (z10 && bVar.f2780d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2783c;
    }

    public boolean g() {
        return this.f2761p == 0;
    }

    public void g0(RecyclerView recyclerView, RecyclerView.s sVar) {
    }

    public View g1(boolean z10, boolean z11) {
        if (this.f2766u) {
            return l1(0, A(), z10, z11);
        }
        return l1(A() - 1, -1, z10, z11);
    }

    public boolean h() {
        return this.f2761p == 1;
    }

    public View h0(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        int d12;
        View view2;
        View view3;
        x1();
        if (A() == 0 || (d12 = d1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        e1();
        B1(d12, (int) (((float) this.f2763r.l()) * 0.33333334f), false, xVar);
        c cVar = this.f2762q;
        cVar.f2787g = Integer.MIN_VALUE;
        cVar.f2781a = false;
        f1(sVar, cVar, xVar, true);
        if (d12 == -1) {
            if (this.f2766u) {
                view2 = k1(A() - 1, -1);
            } else {
                view2 = k1(0, A());
            }
        } else if (this.f2766u) {
            view2 = k1(0, A());
        } else {
            view2 = k1(A() - 1, -1);
        }
        if (d12 == -1) {
            view3 = q1();
        } else {
            view3 = p1();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public View h1(boolean z10, boolean z11) {
        if (this.f2766u) {
            return l1(A() - 1, -1, z10, z11);
        }
        return l1(0, A(), z10, z11);
    }

    public void i0(AccessibilityEvent accessibilityEvent) {
        super.i0(accessibilityEvent);
        if (A() > 0) {
            accessibilityEvent.setFromIndex(i1());
            accessibilityEvent.setToIndex(j1());
        }
    }

    public int i1() {
        View l12 = l1(0, A(), false, true);
        if (l12 == null) {
            return -1;
        }
        return T(l12);
    }

    public int j1() {
        View l12 = l1(A() - 1, -1, false, true);
        if (l12 == null) {
            return -1;
        }
        return T(l12);
    }

    public void k(int i10, int i11, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        if (this.f2761p != 0) {
            i10 = i11;
        }
        if (A() != 0 && i10 != 0) {
            e1();
            B1(i10 > 0 ? 1 : -1, Math.abs(i10), true, xVar);
            Z0(xVar, this.f2762q, cVar);
        }
    }

    public View k1(int i10, int i11) {
        int i12;
        int i13;
        e1();
        if ((i11 > i10 ? 1 : i11 < i10 ? (char) 65535 : 0) == 0) {
            return z(i10);
        }
        if (this.f2763r.e(z(i10)) < this.f2763r.k()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        if (this.f2761p == 0) {
            return this.f2877c.a(i10, i11, i13, i12);
        }
        return this.f2878d.a(i10, i11, i13, i12);
    }

    public void l(int i10, RecyclerView.m.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f2771z;
        int i12 = -1;
        if (dVar == null || !dVar.a()) {
            x1();
            z10 = this.f2766u;
            i11 = this.f2769x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f2771z;
            z10 = dVar2.f2795c;
            i11 = dVar2.f2793a;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            ((k.b) cVar).a(i11, 0);
            i11 += i12;
        }
    }

    public View l1(int i10, int i11, boolean z10, boolean z11) {
        e1();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        if (this.f2761p == 0) {
            return this.f2877c.a(i10, i11, i13, i12);
        }
        return this.f2878d.a(i10, i11, i13, i12);
    }

    public int m(RecyclerView.x xVar) {
        return a1(xVar);
    }

    public View m1(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        e1();
        int A2 = A();
        int i12 = -1;
        if (z11) {
            i11 = A() - 1;
            i10 = -1;
        } else {
            i12 = A2;
            i11 = 0;
            i10 = 1;
        }
        int b10 = xVar.b();
        int k10 = this.f2763r.k();
        int g10 = this.f2763r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i12) {
            View z12 = z(i11);
            int T = T(z12);
            int e10 = this.f2763r.e(z12);
            int b11 = this.f2763r.b(z12);
            if (T >= 0 && T < b10) {
                if (!((RecyclerView.n) z12.getLayoutParams()).d()) {
                    boolean z13 = b11 <= k10 && e10 < k10;
                    boolean z14 = e10 >= g10 && b11 > g10;
                    if (!z13 && !z14) {
                        return z12;
                    }
                    if (z10) {
                        if (!z14) {
                            if (view != null) {
                            }
                            view = z12;
                        }
                    } else if (!z13) {
                        if (view != null) {
                        }
                        view = z12;
                    }
                    view2 = z12;
                } else if (view3 == null) {
                    view3 = z12;
                }
            }
            i11 += i10;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public int n(RecyclerView.x xVar) {
        return b1(xVar);
    }

    public final int n1(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int g10;
        int g11 = this.f2763r.g() - i10;
        if (g11 <= 0) {
            return 0;
        }
        int i11 = -y1(-g11, sVar, xVar);
        int i12 = i10 + i11;
        if (!z10 || (g10 = this.f2763r.g() - i12) <= 0) {
            return i11;
        }
        this.f2763r.p(g10);
        return g10 + i11;
    }

    public int o(RecyclerView.x xVar) {
        return c1(xVar);
    }

    public final int o1(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int k10;
        int k11 = i10 - this.f2763r.k();
        if (k11 <= 0) {
            return 0;
        }
        int i11 = -y1(k11, sVar, xVar);
        int i12 = i10 + i11;
        if (!z10 || (k10 = i12 - this.f2763r.k()) <= 0) {
            return i11;
        }
        this.f2763r.p(-k10);
        return i11 - k10;
    }

    public int p(RecyclerView.x xVar) {
        return a1(xVar);
    }

    public final View p1() {
        return z(this.f2766u ? 0 : A() - 1);
    }

    public int q(RecyclerView.x xVar) {
        return b1(xVar);
    }

    public final View q1() {
        return z(this.f2766u ? A() - 1 : 0);
    }

    public int r(RecyclerView.x xVar) {
        return c1(xVar);
    }

    public boolean r1() {
        return M() == 1;
    }

    public void s1(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View c10 = cVar.c(sVar);
        if (c10 == null) {
            bVar.f2778b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) c10.getLayoutParams();
        if (cVar.f2791k == null) {
            if (this.f2766u == (cVar.f2786f == -1)) {
                d(c10, -1, false);
            } else {
                d(c10, 0, false);
            }
        } else {
            if (this.f2766u == (cVar.f2786f == -1)) {
                d(c10, -1, true);
            } else {
                d(c10, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) c10.getLayoutParams();
        Rect M = this.f2876b.M(c10);
        int B2 = RecyclerView.m.B(this.f2888n, this.f2886l, R() + Q() + nVar2.leftMargin + nVar2.rightMargin + M.left + M.right + 0, nVar2.width, g());
        int B3 = RecyclerView.m.B(this.f2889o, this.f2887m, P() + S() + nVar2.topMargin + nVar2.bottomMargin + M.top + M.bottom + 0, nVar2.height, h());
        if (S0(c10, B2, B3, nVar2)) {
            c10.measure(B2, B3);
        }
        bVar.f2777a = this.f2763r.c(c10);
        if (this.f2761p == 1) {
            if (r1()) {
                i14 = this.f2888n - R();
                i13 = i14 - this.f2763r.d(c10);
            } else {
                i13 = Q();
                i14 = this.f2763r.d(c10) + i13;
            }
            if (cVar.f2786f == -1) {
                int i15 = cVar.f2782b;
                i10 = i15;
                i11 = i14;
                i12 = i15 - bVar.f2777a;
            } else {
                int i16 = cVar.f2782b;
                i12 = i16;
                i11 = i14;
                i10 = bVar.f2777a + i16;
            }
        } else {
            int S = S();
            int d10 = this.f2763r.d(c10) + S;
            if (cVar.f2786f == -1) {
                int i17 = cVar.f2782b;
                i11 = i17;
                i12 = S;
                i10 = d10;
                i13 = i17 - bVar.f2777a;
            } else {
                int i18 = cVar.f2782b;
                i12 = S;
                i11 = bVar.f2777a + i18;
                i10 = d10;
                i13 = i18;
            }
        }
        b0(c10, i13, i12, i11, i10);
        if (nVar.d() || nVar.c()) {
            bVar.f2779c = true;
        }
        bVar.f2780d = c10.hasFocusable();
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t0(androidx.recyclerview.widget.RecyclerView.s r17, androidx.recyclerview.widget.RecyclerView.x r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f2771z
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f2769x
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x0019
            r16.B0(r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f2771z
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f2771z
            int r3 = r3.f2793a
            r0.f2769x = r3
        L_0x0029:
            r16.e1()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            r5 = 0
            r3.f2781a = r5
            r16.x1()
            android.view.View r3 = r16.K()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.A
            boolean r7 = r6.f2776e
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            if (r7 == 0) goto L_0x0073
            int r7 = r0.f2769x
            if (r7 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f2771z
            if (r7 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x0222
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.e(r3)
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.g()
            if (r6 >= r7) goto L_0x0068
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.b(r3)
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.k()
            if (r6 > r7) goto L_0x0222
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.A
            int r7 = r0.T(r3)
            r6.c(r3, r7)
            goto L_0x0222
        L_0x0073:
            r6.d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            boolean r6 = r0.f2766u
            boolean r7 = r0.f2767v
            r6 = r6 ^ r7
            r3.f2775d = r6
            boolean r6 = r2.f2937g
            if (r6 != 0) goto L_0x017b
            int r6 = r0.f2769x
            if (r6 != r4) goto L_0x0089
            goto L_0x017b
        L_0x0089:
            if (r6 < 0) goto L_0x0177
            int r7 = r18.b()
            if (r6 < r7) goto L_0x0093
            goto L_0x0177
        L_0x0093:
            int r6 = r0.f2769x
            r3.f2773b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f2771z
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00c7
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f2771z
            boolean r6 = r6.f2795c
            r3.f2775d = r6
            if (r6 == 0) goto L_0x00b8
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.g()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f2771z
            int r7 = r7.f2794b
            int r6 = r6 - r7
            r3.f2774c = r6
            goto L_0x0175
        L_0x00b8:
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.k()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f2771z
            int r7 = r7.f2794b
            int r6 = r6 + r7
            r3.f2774c = r6
            goto L_0x0175
        L_0x00c7:
            int r6 = r0.f2770y
            if (r6 != r8) goto L_0x0158
            int r6 = r0.f2769x
            android.view.View r6 = r0.v(r6)
            if (r6 == 0) goto L_0x0136
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.c(r6)
            androidx.recyclerview.widget.q r10 = r0.f2763r
            int r10 = r10.l()
            if (r7 <= r10) goto L_0x00e6
            r3.a()
            goto L_0x0175
        L_0x00e6:
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.q r10 = r0.f2763r
            int r10 = r10.k()
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x0101
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.k()
            r3.f2774c = r6
            r3.f2775d = r5
            goto L_0x0175
        L_0x0101:
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.g()
            androidx.recyclerview.widget.q r10 = r0.f2763r
            int r10 = r10.b(r6)
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x011b
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.g()
            r3.f2774c = r6
            r3.f2775d = r9
            goto L_0x0175
        L_0x011b:
            boolean r7 = r3.f2775d
            if (r7 == 0) goto L_0x012d
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r6 = r7.b(r6)
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.m()
            int r7 = r7 + r6
            goto L_0x0133
        L_0x012d:
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.e(r6)
        L_0x0133:
            r3.f2774c = r7
            goto L_0x0175
        L_0x0136:
            int r6 = r16.A()
            if (r6 <= 0) goto L_0x0154
            android.view.View r6 = r0.z(r5)
            int r6 = r0.T(r6)
            int r7 = r0.f2769x
            if (r7 >= r6) goto L_0x014a
            r6 = 1
            goto L_0x014b
        L_0x014a:
            r6 = 0
        L_0x014b:
            boolean r7 = r0.f2766u
            if (r6 != r7) goto L_0x0151
            r6 = 1
            goto L_0x0152
        L_0x0151:
            r6 = 0
        L_0x0152:
            r3.f2775d = r6
        L_0x0154:
            r3.a()
            goto L_0x0175
        L_0x0158:
            boolean r6 = r0.f2766u
            r3.f2775d = r6
            if (r6 == 0) goto L_0x016a
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.g()
            int r7 = r0.f2770y
            int r6 = r6 - r7
            r3.f2774c = r6
            goto L_0x0175
        L_0x016a:
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.k()
            int r7 = r0.f2770y
            int r6 = r6 + r7
            r3.f2774c = r6
        L_0x0175:
            r6 = 1
            goto L_0x017c
        L_0x0177:
            r0.f2769x = r4
            r0.f2770y = r8
        L_0x017b:
            r6 = 0
        L_0x017c:
            if (r6 == 0) goto L_0x0180
            goto L_0x021e
        L_0x0180:
            int r6 = r16.A()
            if (r6 != 0) goto L_0x0188
            goto L_0x020a
        L_0x0188:
            android.view.View r6 = r16.K()
            if (r6 == 0) goto L_0x01b7
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r7 = (androidx.recyclerview.widget.RecyclerView.n) r7
            boolean r10 = r7.d()
            if (r10 != 0) goto L_0x01ac
            int r10 = r7.b()
            if (r10 < 0) goto L_0x01ac
            int r7 = r7.b()
            int r10 = r18.b()
            if (r7 >= r10) goto L_0x01ac
            r7 = 1
            goto L_0x01ad
        L_0x01ac:
            r7 = 0
        L_0x01ad:
            if (r7 == 0) goto L_0x01b7
            int r7 = r0.T(r6)
            r3.c(r6, r7)
            goto L_0x0208
        L_0x01b7:
            boolean r6 = r0.f2764s
            boolean r7 = r0.f2767v
            if (r6 == r7) goto L_0x01be
            goto L_0x020a
        L_0x01be:
            boolean r6 = r3.f2775d
            android.view.View r6 = r0.m1(r1, r2, r6, r7)
            if (r6 == 0) goto L_0x020a
            int r7 = r0.T(r6)
            r3.b(r6, r7)
            boolean r7 = r2.f2937g
            if (r7 != 0) goto L_0x0208
            boolean r7 = r16.X0()
            if (r7 == 0) goto L_0x0208
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.q r10 = r0.f2763r
            int r6 = r10.b(r6)
            androidx.recyclerview.widget.q r10 = r0.f2763r
            int r10 = r10.k()
            androidx.recyclerview.widget.q r11 = r0.f2763r
            int r11 = r11.g()
            if (r6 > r10) goto L_0x01f5
            if (r7 >= r10) goto L_0x01f5
            r12 = 1
            goto L_0x01f6
        L_0x01f5:
            r12 = 0
        L_0x01f6:
            if (r7 < r11) goto L_0x01fc
            if (r6 <= r11) goto L_0x01fc
            r6 = 1
            goto L_0x01fd
        L_0x01fc:
            r6 = 0
        L_0x01fd:
            if (r12 != 0) goto L_0x0201
            if (r6 == 0) goto L_0x0208
        L_0x0201:
            boolean r6 = r3.f2775d
            if (r6 == 0) goto L_0x0206
            r10 = r11
        L_0x0206:
            r3.f2774c = r10
        L_0x0208:
            r6 = 1
            goto L_0x020b
        L_0x020a:
            r6 = 0
        L_0x020b:
            if (r6 == 0) goto L_0x020e
            goto L_0x021e
        L_0x020e:
            r3.a()
            boolean r6 = r0.f2767v
            if (r6 == 0) goto L_0x021b
            int r6 = r18.b()
            int r6 = r6 + r4
            goto L_0x021c
        L_0x021b:
            r6 = 0
        L_0x021c:
            r3.f2773b = r6
        L_0x021e:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            r3.f2776e = r9
        L_0x0222:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            int r6 = r3.f2790j
            if (r6 < 0) goto L_0x022a
            r6 = 1
            goto L_0x022b
        L_0x022a:
            r6 = -1
        L_0x022b:
            r3.f2786f = r6
            int[] r3 = r0.D
            r3[r5] = r5
            r3[r9] = r5
            r0.Y0(r2, r3)
            int[] r3 = r0.D
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.q r6 = r0.f2763r
            int r6 = r6.k()
            int r6 = r6 + r3
            int[] r3 = r0.D
            r3 = r3[r9]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.q r7 = r0.f2763r
            int r7 = r7.h()
            int r7 = r7 + r3
            boolean r3 = r2.f2937g
            if (r3 == 0) goto L_0x028f
            int r3 = r0.f2769x
            if (r3 == r4) goto L_0x028f
            int r10 = r0.f2770y
            if (r10 == r8) goto L_0x028f
            android.view.View r3 = r0.v(r3)
            if (r3 == 0) goto L_0x028f
            boolean r8 = r0.f2766u
            if (r8 == 0) goto L_0x027a
            androidx.recyclerview.widget.q r8 = r0.f2763r
            int r8 = r8.g()
            androidx.recyclerview.widget.q r10 = r0.f2763r
            int r3 = r10.b(r3)
            int r8 = r8 - r3
            int r3 = r0.f2770y
            goto L_0x0289
        L_0x027a:
            androidx.recyclerview.widget.q r8 = r0.f2763r
            int r3 = r8.e(r3)
            androidx.recyclerview.widget.q r8 = r0.f2763r
            int r8 = r8.k()
            int r3 = r3 - r8
            int r8 = r0.f2770y
        L_0x0289:
            int r8 = r8 - r3
            if (r8 <= 0) goto L_0x028e
            int r6 = r6 + r8
            goto L_0x028f
        L_0x028e:
            int r7 = r7 - r8
        L_0x028f:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            boolean r8 = r3.f2775d
            if (r8 == 0) goto L_0x029a
            boolean r8 = r0.f2766u
            if (r8 == 0) goto L_0x029e
            goto L_0x02a0
        L_0x029a:
            boolean r8 = r0.f2766u
            if (r8 == 0) goto L_0x02a0
        L_0x029e:
            r8 = -1
            goto L_0x02a1
        L_0x02a0:
            r8 = 1
        L_0x02a1:
            r0.t1(r1, r2, r3, r8)
            r16.s(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            boolean r8 = r16.w1()
            r3.f2792l = r8
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            r3.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            r3.f2789i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            boolean r8 = r3.f2775d
            if (r8 == 0) goto L_0x0305
            int r8 = r3.f2773b
            int r3 = r3.f2774c
            r0.D1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            r3.f2788h = r6
            r0.f1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            int r6 = r3.f2782b
            int r8 = r3.f2784d
            int r3 = r3.f2783c
            if (r3 <= 0) goto L_0x02d7
            int r7 = r7 + r3
        L_0x02d7:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            int r10 = r3.f2773b
            int r3 = r3.f2774c
            r0.C1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            r3.f2788h = r7
            int r7 = r3.f2784d
            int r10 = r3.f2785e
            int r7 = r7 + r10
            r3.f2784d = r7
            r0.f1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            int r7 = r3.f2782b
            int r3 = r3.f2783c
            if (r3 <= 0) goto L_0x034b
            r0.D1(r8, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.f2762q
            r6.f2788h = r3
            r0.f1(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            int r6 = r3.f2782b
            goto L_0x034b
        L_0x0305:
            int r8 = r3.f2773b
            int r3 = r3.f2774c
            r0.C1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            r3.f2788h = r7
            r0.f1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            int r7 = r3.f2782b
            int r8 = r3.f2784d
            int r3 = r3.f2783c
            if (r3 <= 0) goto L_0x031e
            int r6 = r6 + r3
        L_0x031e:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            int r10 = r3.f2773b
            int r3 = r3.f2774c
            r0.D1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            r3.f2788h = r6
            int r6 = r3.f2784d
            int r10 = r3.f2785e
            int r6 = r6 + r10
            r3.f2784d = r6
            r0.f1(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            int r6 = r3.f2782b
            int r3 = r3.f2783c
            if (r3 <= 0) goto L_0x034b
            r0.C1(r8, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f2762q
            r7.f2788h = r3
            r0.f1(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2762q
            int r7 = r3.f2782b
        L_0x034b:
            int r3 = r16.A()
            if (r3 <= 0) goto L_0x036f
            boolean r3 = r0.f2766u
            boolean r8 = r0.f2767v
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0363
            int r3 = r0.n1(r7, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.o1(r6, r1, r2, r5)
            goto L_0x036d
        L_0x0363:
            int r3 = r0.o1(r6, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.n1(r7, r1, r2, r5)
        L_0x036d:
            int r6 = r6 + r3
            int r7 = r7 + r3
        L_0x036f:
            boolean r3 = r2.f2941k
            if (r3 == 0) goto L_0x040d
            int r3 = r16.A()
            if (r3 == 0) goto L_0x040d
            boolean r3 = r2.f2937g
            if (r3 != 0) goto L_0x040d
            boolean r3 = r16.X0()
            if (r3 != 0) goto L_0x0385
            goto L_0x040d
        L_0x0385:
            java.util.List<androidx.recyclerview.widget.RecyclerView$a0> r3 = r1.f2909d
            int r8 = r3.size()
            android.view.View r10 = r0.z(r5)
            int r10 = r0.T(r10)
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0396:
            if (r11 >= r8) goto L_0x03ce
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$a0 r14 = (androidx.recyclerview.widget.RecyclerView.a0) r14
            boolean r15 = r14.o()
            if (r15 == 0) goto L_0x03a5
            goto L_0x03ca
        L_0x03a5:
            int r15 = r14.h()
            if (r15 >= r10) goto L_0x03ad
            r15 = 1
            goto L_0x03ae
        L_0x03ad:
            r15 = 0
        L_0x03ae:
            boolean r9 = r0.f2766u
            if (r15 == r9) goto L_0x03b4
            r9 = -1
            goto L_0x03b5
        L_0x03b4:
            r9 = 1
        L_0x03b5:
            if (r9 != r4) goto L_0x03c1
            androidx.recyclerview.widget.q r9 = r0.f2763r
            android.view.View r14 = r14.f2842a
            int r9 = r9.c(r14)
            int r12 = r12 + r9
            goto L_0x03ca
        L_0x03c1:
            androidx.recyclerview.widget.q r9 = r0.f2763r
            android.view.View r14 = r14.f2842a
            int r9 = r9.c(r14)
            int r13 = r13 + r9
        L_0x03ca:
            int r11 = r11 + 1
            r9 = 1
            goto L_0x0396
        L_0x03ce:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2762q
            r4.f2791k = r3
            r3 = 0
            if (r12 <= 0) goto L_0x03ee
            android.view.View r4 = r16.q1()
            int r4 = r0.T(r4)
            r0.D1(r4, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2762q
            r4.f2788h = r12
            r4.f2783c = r5
            r4.a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2762q
            r0.f1(r1, r4, r2, r5)
        L_0x03ee:
            if (r13 <= 0) goto L_0x0409
            android.view.View r4 = r16.p1()
            int r4 = r0.T(r4)
            r0.C1(r4, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2762q
            r4.f2788h = r13
            r4.f2783c = r5
            r4.a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2762q
            r0.f1(r1, r4, r2, r5)
        L_0x0409:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f2762q
            r1.f2791k = r3
        L_0x040d:
            boolean r1 = r2.f2937g
            if (r1 != 0) goto L_0x041a
            androidx.recyclerview.widget.q r1 = r0.f2763r
            int r2 = r1.l()
            r1.f3133b = r2
            goto L_0x041f
        L_0x041a:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.A
            r1.d()
        L_0x041f:
            boolean r1 = r0.f2767v
            r0.f2764s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.t0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public void t1(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i10) {
    }

    public void u0(RecyclerView.x xVar) {
        this.f2771z = null;
        this.f2769x = -1;
        this.f2770y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void u1(RecyclerView.s sVar, c cVar) {
        if (cVar.f2781a && !cVar.f2792l) {
            int i10 = cVar.f2787g;
            int i11 = cVar.f2789i;
            if (cVar.f2786f == -1) {
                int A2 = A();
                if (i10 >= 0) {
                    int f10 = (this.f2763r.f() - i10) + i11;
                    if (this.f2766u) {
                        for (int i12 = 0; i12 < A2; i12++) {
                            View z10 = z(i12);
                            if (this.f2763r.e(z10) < f10 || this.f2763r.o(z10) < f10) {
                                v1(sVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = A2 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View z11 = z(i14);
                        if (this.f2763r.e(z11) < f10 || this.f2763r.o(z11) < f10) {
                            v1(sVar, i13, i14);
                            return;
                        }
                    }
                }
            } else if (i10 >= 0) {
                int i15 = i10 - i11;
                int A3 = A();
                if (this.f2766u) {
                    int i16 = A3 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View z12 = z(i17);
                        if (this.f2763r.b(z12) > i15 || this.f2763r.n(z12) > i15) {
                            v1(sVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                for (int i18 = 0; i18 < A3; i18++) {
                    View z13 = z(i18);
                    if (this.f2763r.b(z13) > i15 || this.f2763r.n(z13) > i15) {
                        v1(sVar, 0, i18);
                        return;
                    }
                }
            }
        }
    }

    public View v(int i10) {
        int A2 = A();
        if (A2 == 0) {
            return null;
        }
        int T = i10 - T(z(0));
        if (T >= 0 && T < A2) {
            View z10 = z(T);
            if (T(z10) == i10) {
                return z10;
            }
        }
        return super.v(i10);
    }

    public final void v1(RecyclerView.s sVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    E0(i12, sVar);
                }
                return;
            }
            while (i10 > i11) {
                E0(i10, sVar);
                i10--;
            }
        }
    }

    public RecyclerView.n w() {
        return new RecyclerView.n(-2, -2);
    }

    public boolean w1() {
        return this.f2763r.i() == 0 && this.f2763r.f() == 0;
    }

    public void x0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f2771z = dVar;
            if (this.f2769x != -1) {
                dVar.f2793a = -1;
            }
            I0();
        }
    }

    public final void x1() {
        if (this.f2761p == 1 || !r1()) {
            this.f2766u = this.f2765t;
        } else {
            this.f2766u = !this.f2765t;
        }
    }

    public Parcelable y0() {
        d dVar = this.f2771z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (A() > 0) {
            e1();
            boolean z10 = this.f2764s ^ this.f2766u;
            dVar2.f2795c = z10;
            if (z10) {
                View p12 = p1();
                dVar2.f2794b = this.f2763r.g() - this.f2763r.b(p12);
                dVar2.f2793a = T(p12);
            } else {
                View q12 = q1();
                dVar2.f2793a = T(q12);
                dVar2.f2794b = this.f2763r.e(q12) - this.f2763r.k();
            }
        } else {
            dVar2.f2793a = -1;
        }
        return dVar2;
    }

    public int y1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (A() == 0 || i10 == 0) {
            return 0;
        }
        e1();
        this.f2762q.f2781a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        B1(i11, abs, true, xVar);
        c cVar = this.f2762q;
        int f12 = f1(sVar, cVar, xVar, false) + cVar.f2787g;
        if (f12 < 0) {
            return 0;
        }
        if (abs > f12) {
            i10 = i11 * f12;
        }
        this.f2763r.p(-i10);
        this.f2762q.f2790j = i10;
        return i10;
    }

    public void z1(int i10) {
        if (i10 == 0 || i10 == 1) {
            e((String) null);
            if (i10 != this.f2761p || this.f2763r == null) {
                q a10 = q.a(this, i10);
                this.f2763r = a10;
                this.A.f2772a = a10;
                this.f2761p = i10;
                I0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(d0.a("invalid orientation:", i10));
    }

    public LinearLayoutManager(int i10, boolean z10) {
        this.f2761p = 1;
        this.f2765t = false;
        this.f2766u = false;
        this.f2767v = false;
        this.f2768w = true;
        this.f2769x = -1;
        this.f2770y = Integer.MIN_VALUE;
        this.f2771z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        z1(i10);
        e((String) null);
        if (z10 != this.f2765t) {
            this.f2765t = z10;
            I0();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2761p = 1;
        this.f2765t = false;
        this.f2766u = false;
        this.f2767v = false;
        this.f2768w = true;
        this.f2769x = -1;
        this.f2770y = Integer.MIN_VALUE;
        this.f2771z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.m.d U = RecyclerView.m.U(context, attributeSet, i10, i11);
        z1(U.f2892a);
        boolean z10 = U.f2894c;
        e((String) null);
        if (z10 != this.f2765t) {
            this.f2765t = z10;
            I0();
        }
        A1(U.f2895d);
    }
}
