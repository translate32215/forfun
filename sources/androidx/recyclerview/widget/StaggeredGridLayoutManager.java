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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public int A;
    public d B;
    public int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public boolean I;
    public int[] J;
    public final Runnable K;

    /* renamed from: p  reason: collision with root package name */
    public int f2954p = -1;

    /* renamed from: q  reason: collision with root package name */
    public f[] f2955q;

    /* renamed from: r  reason: collision with root package name */
    public q f2956r;

    /* renamed from: s  reason: collision with root package name */
    public q f2957s;

    /* renamed from: t  reason: collision with root package name */
    public int f2958t;

    /* renamed from: u  reason: collision with root package name */
    public int f2959u;

    /* renamed from: v  reason: collision with root package name */
    public final l f2960v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2961w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2962x;

    /* renamed from: y  reason: collision with root package name */
    public BitSet f2963y;

    /* renamed from: z  reason: collision with root package name */
    public int f2964z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.Z0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2966a;

        /* renamed from: b  reason: collision with root package name */
        public int f2967b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2968c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2969d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2970e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f2971f;

        public b() {
            b();
        }

        public void a() {
            int i10;
            if (this.f2968c) {
                i10 = StaggeredGridLayoutManager.this.f2956r.g();
            } else {
                i10 = StaggeredGridLayoutManager.this.f2956r.k();
            }
            this.f2967b = i10;
        }

        public void b() {
            this.f2966a = -1;
            this.f2967b = Integer.MIN_VALUE;
            this.f2968c = false;
            this.f2969d = false;
            this.f2970e = false;
            int[] iArr = this.f2971f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public f f2973e;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2980a;

        /* renamed from: b  reason: collision with root package name */
        public int f2981b;

        /* renamed from: c  reason: collision with root package name */
        public int f2982c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f2983d;

        /* renamed from: e  reason: collision with root package name */
        public int f2984e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f2985f;

        /* renamed from: g  reason: collision with root package name */
        public List<d.a> f2986g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2987h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2988i;

        /* renamed from: r  reason: collision with root package name */
        public boolean f2989r;

        public class a implements Parcelable.Creator<e> {
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2980a);
            parcel.writeInt(this.f2981b);
            parcel.writeInt(this.f2982c);
            if (this.f2982c > 0) {
                parcel.writeIntArray(this.f2983d);
            }
            parcel.writeInt(this.f2984e);
            if (this.f2984e > 0) {
                parcel.writeIntArray(this.f2985f);
            }
            parcel.writeInt(this.f2987h ? 1 : 0);
            parcel.writeInt(this.f2988i ? 1 : 0);
            parcel.writeInt(this.f2989r ? 1 : 0);
            parcel.writeList(this.f2986g);
        }

        public e(Parcel parcel) {
            this.f2980a = parcel.readInt();
            this.f2981b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2982c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2983d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2984e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2985f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f2987h = parcel.readInt() == 1;
            this.f2988i = parcel.readInt() == 1;
            this.f2989r = parcel.readInt() == 1 ? true : z10;
            this.f2986g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2982c = eVar.f2982c;
            this.f2980a = eVar.f2980a;
            this.f2981b = eVar.f2981b;
            this.f2983d = eVar.f2983d;
            this.f2984e = eVar.f2984e;
            this.f2985f = eVar.f2985f;
            this.f2987h = eVar.f2987h;
            this.f2988i = eVar.f2988i;
            this.f2989r = eVar.f2989r;
            this.f2986g = eVar.f2986g;
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f2990a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2991b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f2992c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f2993d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f2994e;

        public f(int i10) {
            this.f2994e = i10;
        }

        public void a(View view) {
            c j10 = j(view);
            j10.f2973e = this;
            this.f2990a.add(view);
            this.f2992c = Integer.MIN_VALUE;
            if (this.f2990a.size() == 1) {
                this.f2991b = Integer.MIN_VALUE;
            }
            if (j10.d() || j10.c()) {
                this.f2993d = StaggeredGridLayoutManager.this.f2956r.c(view) + this.f2993d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.f2990a;
            View view = arrayList.get(arrayList.size() - 1);
            c j10 = j(view);
            this.f2992c = StaggeredGridLayoutManager.this.f2956r.b(view);
            j10.getClass();
        }

        public void c() {
            View view = this.f2990a.get(0);
            c j10 = j(view);
            this.f2991b = StaggeredGridLayoutManager.this.f2956r.e(view);
            j10.getClass();
        }

        public void d() {
            this.f2990a.clear();
            this.f2991b = Integer.MIN_VALUE;
            this.f2992c = Integer.MIN_VALUE;
            this.f2993d = 0;
        }

        public int e() {
            if (StaggeredGridLayoutManager.this.f2961w) {
                return g(this.f2990a.size() - 1, -1, true);
            }
            return g(0, this.f2990a.size(), true);
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.f2961w) {
                return g(0, this.f2990a.size(), true);
            }
            return g(this.f2990a.size() - 1, -1, true);
        }

        public int g(int i10, int i11, boolean z10) {
            int k10 = StaggeredGridLayoutManager.this.f2956r.k();
            int g10 = StaggeredGridLayoutManager.this.f2956r.g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f2990a.get(i10);
                int e10 = StaggeredGridLayoutManager.this.f2956r.e(view);
                int b10 = StaggeredGridLayoutManager.this.f2956r.b(view);
                boolean z11 = false;
                boolean z12 = !z10 ? e10 < g10 : e10 <= g10;
                if (!z10 ? b10 > k10 : b10 >= k10) {
                    z11 = true;
                }
                if (z12 && z11 && (e10 < k10 || b10 > g10)) {
                    return StaggeredGridLayoutManager.this.T(view);
                }
                i10 += i12;
            }
            return -1;
        }

        public int h(int i10) {
            int i11 = this.f2992c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2990a.size() == 0) {
                return i10;
            }
            b();
            return this.f2992c;
        }

        public View i(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f2990a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2990a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2961w && staggeredGridLayoutManager.T(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2961w && staggeredGridLayoutManager2.T(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2990a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f2990a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2961w && staggeredGridLayoutManager3.T(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2961w && staggeredGridLayoutManager4.T(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public c j(View view) {
            return (c) view.getLayoutParams();
        }

        public int k(int i10) {
            int i11 = this.f2991b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2990a.size() == 0) {
                return i10;
            }
            c();
            return this.f2991b;
        }

        public void l() {
            int size = this.f2990a.size();
            View remove = this.f2990a.remove(size - 1);
            c j10 = j(remove);
            j10.f2973e = null;
            if (j10.d() || j10.c()) {
                this.f2993d -= StaggeredGridLayoutManager.this.f2956r.c(remove);
            }
            if (size == 1) {
                this.f2991b = Integer.MIN_VALUE;
            }
            this.f2992c = Integer.MIN_VALUE;
        }

        public void m() {
            View remove = this.f2990a.remove(0);
            c j10 = j(remove);
            j10.f2973e = null;
            if (this.f2990a.size() == 0) {
                this.f2992c = Integer.MIN_VALUE;
            }
            if (j10.d() || j10.c()) {
                this.f2993d -= StaggeredGridLayoutManager.this.f2956r.c(remove);
            }
            this.f2991b = Integer.MIN_VALUE;
        }

        public void n(View view) {
            c j10 = j(view);
            j10.f2973e = this;
            this.f2990a.add(0, view);
            this.f2991b = Integer.MIN_VALUE;
            if (this.f2990a.size() == 1) {
                this.f2992c = Integer.MIN_VALUE;
            }
            if (j10.d() || j10.c()) {
                this.f2993d = StaggeredGridLayoutManager.this.f2956r.c(view) + this.f2993d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2961w = false;
        this.f2962x = false;
        this.f2964z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new d();
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.m.d U = RecyclerView.m.U(context, attributeSet, i10, i11);
        int i12 = U.f2892a;
        if (i12 == 0 || i12 == 1) {
            e((String) null);
            if (i12 != this.f2958t) {
                this.f2958t = i12;
                q qVar = this.f2956r;
                this.f2956r = this.f2957s;
                this.f2957s = qVar;
                I0();
            }
            int i13 = U.f2893b;
            e((String) null);
            if (i13 != this.f2954p) {
                this.B.a();
                I0();
                this.f2954p = i13;
                this.f2963y = new BitSet(this.f2954p);
                this.f2955q = new f[this.f2954p];
                for (int i14 = 0; i14 < this.f2954p; i14++) {
                    this.f2955q[i14] = new f(i14);
                }
                I0();
            }
            boolean z10 = U.f2894c;
            e((String) null);
            e eVar = this.F;
            if (!(eVar == null || eVar.f2987h == z10)) {
                eVar.f2987h = z10;
            }
            this.f2961w = z10;
            I0();
            this.f2960v = new l();
            this.f2956r = q.a(this, this.f2958t);
            this.f2957s = q.a(this, 1 - this.f2958t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1(int r5, androidx.recyclerview.widget.RecyclerView.x r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.l r0 = r4.f2960v
            r1 = 0
            r0.f3115b = r1
            r0.f3116c = r5
            boolean r0 = r4.a0()
            r2 = 1
            if (r0 == 0) goto L_0x002c
            int r6 = r6.f2931a
            r0 = -1
            if (r6 == r0) goto L_0x002c
            boolean r0 = r4.f2962x
            if (r6 >= r5) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r0 != r5) goto L_0x0023
            androidx.recyclerview.widget.q r5 = r4.f2956r
            int r5 = r5.l()
            goto L_0x002d
        L_0x0023:
            androidx.recyclerview.widget.q r5 = r4.f2956r
            int r5 = r5.l()
            r6 = r5
            r5 = 0
            goto L_0x002e
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = 0
        L_0x002e:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f2876b
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.f2808g
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x0052
            androidx.recyclerview.widget.l r0 = r4.f2960v
            androidx.recyclerview.widget.q r3 = r4.f2956r
            int r3 = r3.k()
            int r3 = r3 - r6
            r0.f3119f = r3
            androidx.recyclerview.widget.l r6 = r4.f2960v
            androidx.recyclerview.widget.q r0 = r4.f2956r
            int r0 = r0.g()
            int r0 = r0 + r5
            r6.f3120g = r0
            goto L_0x0062
        L_0x0052:
            androidx.recyclerview.widget.l r0 = r4.f2960v
            androidx.recyclerview.widget.q r3 = r4.f2956r
            int r3 = r3.f()
            int r3 = r3 + r5
            r0.f3120g = r3
            androidx.recyclerview.widget.l r5 = r4.f2960v
            int r6 = -r6
            r5.f3119f = r6
        L_0x0062:
            androidx.recyclerview.widget.l r5 = r4.f2960v
            r5.f3121h = r1
            r5.f3114a = r2
            androidx.recyclerview.widget.q r6 = r4.f2956r
            int r6 = r6.i()
            if (r6 != 0) goto L_0x0079
            androidx.recyclerview.widget.q r6 = r4.f2956r
            int r6 = r6.f()
            if (r6 != 0) goto L_0x0079
            r1 = 1
        L_0x0079:
            r5.f3122i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1(int, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public final void B1(f fVar, int i10, int i11) {
        int i12 = fVar.f2993d;
        if (i10 == -1) {
            int i13 = fVar.f2991b;
            if (i13 == Integer.MIN_VALUE) {
                fVar.c();
                i13 = fVar.f2991b;
            }
            if (i13 + i12 <= i11) {
                this.f2963y.set(fVar.f2994e, false);
                return;
            }
            return;
        }
        int i14 = fVar.f2992c;
        if (i14 == Integer.MIN_VALUE) {
            fVar.b();
            i14 = fVar.f2992c;
        }
        if (i14 - i12 >= i11) {
            this.f2963y.set(fVar.f2994e, false);
        }
    }

    public final int C1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
        }
        return i10;
    }

    public int K0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        return x1(i10, sVar, xVar);
    }

    public void L0(int i10) {
        e eVar = this.F;
        if (!(eVar == null || eVar.f2980a == i10)) {
            eVar.f2983d = null;
            eVar.f2982c = 0;
            eVar.f2980a = -1;
            eVar.f2981b = -1;
        }
        this.f2964z = i10;
        this.A = Integer.MIN_VALUE;
        I0();
    }

    public int M0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        return x1(i10, sVar, xVar);
    }

    public void P0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int R = R() + Q();
        int P = P() + S();
        if (this.f2958t == 1) {
            i13 = RecyclerView.m.j(i11, rect.height() + P, N());
            i12 = RecyclerView.m.j(i10, (this.f2959u * this.f2954p) + R, O());
        } else {
            i12 = RecyclerView.m.j(i10, rect.width() + R, O());
            i13 = RecyclerView.m.j(i11, (this.f2959u * this.f2954p) + P, N());
        }
        this.f2876b.setMeasuredDimension(i12, i13);
    }

    public void V0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        m mVar = new m(recyclerView.getContext());
        mVar.f2916a = i10;
        W0(mVar);
    }

    public boolean X0() {
        return this.F == null;
    }

    public boolean Y() {
        return this.C != 0;
    }

    public final int Y0(int i10) {
        if (A() != 0) {
            if ((i10 < i1()) != this.f2962x) {
                return -1;
            }
            return 1;
        } else if (this.f2962x) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean Z0() {
        int i10;
        if (!(A() == 0 || this.C == 0 || !this.f2881g)) {
            if (this.f2962x) {
                i10 = j1();
                i1();
            } else {
                i10 = i1();
                j1();
            }
            if (i10 == 0 && n1() != null) {
                this.B.a();
                this.f2880f = true;
                I0();
                return true;
            }
        }
        return false;
    }

    public PointF a(int i10) {
        int Y0 = Y0(i10);
        PointF pointF = new PointF();
        if (Y0 == 0) {
            return null;
        }
        if (this.f2958t == 0) {
            pointF.x = (float) Y0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) Y0;
        }
        return pointF;
    }

    public final int a1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        return w.a(xVar, this.f2956r, f1(!this.I), e1(!this.I), this, this.I);
    }

    public final int b1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        return w.b(xVar, this.f2956r, f1(!this.I), e1(!this.I), this, this.I, this.f2962x);
    }

    public void c0(int i10) {
        super.c0(i10);
        for (int i11 = 0; i11 < this.f2954p; i11++) {
            f fVar = this.f2955q[i11];
            int i12 = fVar.f2991b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2991b = i12 + i10;
            }
            int i13 = fVar.f2992c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f2992c = i13 + i10;
            }
        }
    }

    public final int c1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        return w.c(xVar, this.f2956r, f1(!this.I), e1(!this.I), this, this.I);
    }

    public void d0(int i10) {
        super.d0(i10);
        for (int i11 = 0; i11 < this.f2954p; i11++) {
            f fVar = this.f2955q[i11];
            int i12 = fVar.f2991b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2991b = i12 + i10;
            }
            int i13 = fVar.f2992c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f2992c = i13 + i10;
            }
        }
    }

    public final int d1(RecyclerView.s sVar, l lVar, RecyclerView.x xVar) {
        int i10;
        int i11;
        int i12;
        f fVar;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        RecyclerView.s sVar2 = sVar;
        l lVar2 = lVar;
        this.f2963y.set(0, this.f2954p, true);
        if (this.f2960v.f3122i) {
            i10 = lVar2.f3118e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (lVar2.f3118e == 1) {
                i20 = lVar2.f3120g + lVar2.f3115b;
            } else {
                i20 = lVar2.f3119f - lVar2.f3115b;
            }
            i10 = i20;
        }
        z1(lVar2.f3118e, i10);
        if (this.f2962x) {
            i11 = this.f2956r.g();
        } else {
            i11 = this.f2956r.k();
        }
        int i21 = i11;
        boolean z11 = false;
        while (true) {
            int i22 = lVar2.f3116c;
            if ((i22 >= 0 && i22 < xVar.b()) && (this.f2960v.f3122i || !this.f2963y.isEmpty())) {
                View e10 = sVar2.e(lVar2.f3116c);
                lVar2.f3116c += lVar2.f3117d;
                c cVar = (c) e10.getLayoutParams();
                int b10 = cVar.b();
                int[] iArr = this.B.f2974a;
                int i23 = (iArr == null || b10 >= iArr.length) ? -1 : iArr[b10];
                if (i23 == -1) {
                    if (r1(lVar2.f3118e)) {
                        i19 = this.f2954p - 1;
                        i18 = -1;
                        i17 = -1;
                    } else {
                        i18 = this.f2954p;
                        i19 = 0;
                        i17 = 1;
                    }
                    f fVar2 = null;
                    if (lVar2.f3118e == 1) {
                        int k10 = this.f2956r.k();
                        int i24 = Integer.MAX_VALUE;
                        while (i19 != i18) {
                            f fVar3 = this.f2955q[i19];
                            int h10 = fVar3.h(k10);
                            if (h10 < i24) {
                                fVar2 = fVar3;
                                i24 = h10;
                            }
                            i19 += i17;
                        }
                    } else {
                        int g10 = this.f2956r.g();
                        int i25 = Integer.MIN_VALUE;
                        while (i19 != i18) {
                            f fVar4 = this.f2955q[i19];
                            int k11 = fVar4.k(g10);
                            if (k11 > i25) {
                                fVar2 = fVar4;
                                i25 = k11;
                            }
                            i19 += i17;
                        }
                    }
                    fVar = fVar2;
                    d dVar = this.B;
                    dVar.b(b10);
                    dVar.f2974a[b10] = fVar.f2994e;
                } else {
                    fVar = this.f2955q[i23];
                }
                f fVar5 = fVar;
                cVar.f2973e = fVar5;
                if (lVar2.f3118e == 1) {
                    z10 = false;
                    d(e10, -1, false);
                } else {
                    z10 = false;
                    d(e10, 0, false);
                }
                if (this.f2958t == 1) {
                    p1(e10, RecyclerView.m.B(this.f2959u, this.f2886l, z10 ? 1 : 0, cVar.width, z10), RecyclerView.m.B(this.f2889o, this.f2887m, P() + S(), cVar.height, true), z10);
                } else {
                    p1(e10, RecyclerView.m.B(this.f2888n, this.f2886l, R() + Q(), cVar.width, true), RecyclerView.m.B(this.f2959u, this.f2887m, 0, cVar.height, false), false);
                }
                if (lVar2.f3118e == 1) {
                    int h11 = fVar5.h(i21);
                    i14 = h11;
                    i13 = this.f2956r.c(e10) + h11;
                } else {
                    int k12 = fVar5.k(i21);
                    i13 = k12;
                    i14 = k12 - this.f2956r.c(e10);
                }
                if (lVar2.f3118e == 1) {
                    cVar.f2973e.a(e10);
                } else {
                    cVar.f2973e.n(e10);
                }
                if (!o1() || this.f2958t != 1) {
                    i15 = this.f2957s.k() + (fVar5.f2994e * this.f2959u);
                    i16 = this.f2957s.c(e10) + i15;
                } else {
                    i16 = this.f2957s.g() - (((this.f2954p - 1) - fVar5.f2994e) * this.f2959u);
                    i15 = i16 - this.f2957s.c(e10);
                }
                int i26 = i16;
                int i27 = i15;
                if (this.f2958t == 1) {
                    b0(e10, i27, i14, i26, i13);
                } else {
                    b0(e10, i14, i27, i13, i26);
                }
                B1(fVar5, this.f2960v.f3118e, i10);
                t1(sVar2, this.f2960v);
                if (this.f2960v.f3121h && e10.hasFocusable()) {
                    this.f2963y.set(fVar5.f2994e, false);
                }
                z11 = true;
            }
        }
        if (!z11) {
            t1(sVar2, this.f2960v);
        }
        if (this.f2960v.f3118e == -1) {
            i12 = this.f2956r.k() - l1(this.f2956r.k());
        } else {
            i12 = k1(this.f2956r.g()) - this.f2956r.g();
        }
        if (i12 > 0) {
            return Math.min(lVar2.f3115b, i12);
        }
        return 0;
    }

    public void e(String str) {
        RecyclerView recyclerView;
        if (this.F == null && (recyclerView = this.f2876b) != null) {
            recyclerView.i(str);
        }
    }

    public void e0(RecyclerView.e eVar, RecyclerView.e eVar2) {
        this.B.a();
        for (int i10 = 0; i10 < this.f2954p; i10++) {
            this.f2955q[i10].d();
        }
    }

    public View e1(boolean z10) {
        int k10 = this.f2956r.k();
        int g10 = this.f2956r.g();
        View view = null;
        for (int A2 = A() - 1; A2 >= 0; A2--) {
            View z11 = z(A2);
            int e10 = this.f2956r.e(z11);
            int b10 = this.f2956r.b(z11);
            if (b10 > k10 && e10 < g10) {
                if (b10 <= g10 || !z10) {
                    return z11;
                }
                if (view == null) {
                    view = z11;
                }
            }
        }
        return view;
    }

    public View f1(boolean z10) {
        int k10 = this.f2956r.k();
        int g10 = this.f2956r.g();
        int A2 = A();
        View view = null;
        for (int i10 = 0; i10 < A2; i10++) {
            View z11 = z(i10);
            int e10 = this.f2956r.e(z11);
            if (this.f2956r.b(z11) > k10 && e10 < g10) {
                if (e10 >= k10 || !z10) {
                    return z11;
                }
                if (view == null) {
                    view = z11;
                }
            }
        }
        return view;
    }

    public boolean g() {
        return this.f2958t == 0;
    }

    public void g0(RecyclerView recyclerView, RecyclerView.s sVar) {
        Runnable runnable = this.K;
        RecyclerView recyclerView2 = this.f2876b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i10 = 0; i10 < this.f2954p; i10++) {
            this.f2955q[i10].d();
        }
        recyclerView.requestLayout();
    }

    public final void g1(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int g10;
        int k12 = k1(Integer.MIN_VALUE);
        if (k12 != Integer.MIN_VALUE && (g10 = this.f2956r.g() - k12) > 0) {
            int i10 = g10 - (-x1(-g10, sVar, xVar));
            if (z10 && i10 > 0) {
                this.f2956r.p(i10);
            }
        }
    }

    public boolean h() {
        return this.f2958t == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.f2958t == 1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.f2958t == 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (o1() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        if (o1() == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View h0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.s r11, androidx.recyclerview.widget.RecyclerView.x r12) {
        /*
            r8 = this;
            int r0 = r8.A()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.u(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.w1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r10 == r3) goto L_0x004f
            r4 = 2
            if (r10 == r4) goto L_0x0043
            r4 = 17
            if (r10 == r4) goto L_0x003b
            r4 = 33
            if (r10 == r4) goto L_0x0036
            r4 = 66
            if (r10 == r4) goto L_0x0031
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            int r10 = r8.f2958t
            if (r10 != r3) goto L_0x0040
            goto L_0x005a
        L_0x0031:
            int r10 = r8.f2958t
            if (r10 != 0) goto L_0x0040
            goto L_0x005a
        L_0x0036:
            int r10 = r8.f2958t
            if (r10 != r3) goto L_0x0040
            goto L_0x005c
        L_0x003b:
            int r10 = r8.f2958t
            if (r10 != 0) goto L_0x0040
            goto L_0x005c
        L_0x0040:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005d
        L_0x0043:
            int r10 = r8.f2958t
            if (r10 != r3) goto L_0x0048
            goto L_0x005a
        L_0x0048:
            boolean r10 = r8.o1()
            if (r10 == 0) goto L_0x005a
            goto L_0x005c
        L_0x004f:
            int r10 = r8.f2958t
            if (r10 != r3) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            boolean r10 = r8.o1()
            if (r10 == 0) goto L_0x005c
        L_0x005a:
            r10 = 1
            goto L_0x005d
        L_0x005c:
            r10 = -1
        L_0x005d:
            if (r10 != r0) goto L_0x0060
            return r1
        L_0x0060:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
            r0.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f2973e
            if (r10 != r3) goto L_0x0072
            int r4 = r8.j1()
            goto L_0x0076
        L_0x0072:
            int r4 = r8.i1()
        L_0x0076:
            r8.A1(r4, r12)
            r8.y1(r10)
            androidx.recyclerview.widget.l r5 = r8.f2960v
            int r6 = r5.f3117d
            int r6 = r6 + r4
            r5.f3116c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.q r7 = r8.f2956r
            int r7 = r7.l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f3115b = r6
            androidx.recyclerview.widget.l r5 = r8.f2960v
            r5.f3121h = r3
            r6 = 0
            r5.f3114a = r6
            r8.d1(r11, r5, r12)
            boolean r11 = r8.f2962x
            r8.D = r11
            android.view.View r11 = r0.i(r4, r10)
            if (r11 == 0) goto L_0x00a9
            if (r11 == r9) goto L_0x00a9
            return r11
        L_0x00a9:
            boolean r11 = r8.r1(r10)
            if (r11 == 0) goto L_0x00c4
            int r11 = r8.f2954p
            int r11 = r11 - r3
        L_0x00b2:
            if (r11 < 0) goto L_0x00d9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2955q
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00c1
            if (r12 == r9) goto L_0x00c1
            return r12
        L_0x00c1:
            int r11 = r11 + -1
            goto L_0x00b2
        L_0x00c4:
            r11 = 0
        L_0x00c5:
            int r12 = r8.f2954p
            if (r11 >= r12) goto L_0x00d9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2955q
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00d6
            if (r12 == r9) goto L_0x00d6
            return r12
        L_0x00d6:
            int r11 = r11 + 1
            goto L_0x00c5
        L_0x00d9:
            boolean r11 = r8.f2961w
            r11 = r11 ^ r3
            if (r10 != r2) goto L_0x00e0
            r12 = 1
            goto L_0x00e1
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            if (r11 != r12) goto L_0x00e5
            r11 = 1
            goto L_0x00e6
        L_0x00e5:
            r11 = 0
        L_0x00e6:
            if (r11 == 0) goto L_0x00ed
            int r12 = r0.e()
            goto L_0x00f1
        L_0x00ed:
            int r12 = r0.f()
        L_0x00f1:
            android.view.View r12 = r8.v(r12)
            if (r12 == 0) goto L_0x00fa
            if (r12 == r9) goto L_0x00fa
            return r12
        L_0x00fa:
            boolean r10 = r8.r1(r10)
            if (r10 == 0) goto L_0x0129
            int r10 = r8.f2954p
            int r10 = r10 - r3
        L_0x0103:
            if (r10 < 0) goto L_0x014c
            int r12 = r0.f2994e
            if (r10 != r12) goto L_0x010a
            goto L_0x0126
        L_0x010a:
            if (r11 == 0) goto L_0x0115
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2955q
            r12 = r12[r10]
            int r12 = r12.e()
            goto L_0x011d
        L_0x0115:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2955q
            r12 = r12[r10]
            int r12 = r12.f()
        L_0x011d:
            android.view.View r12 = r8.v(r12)
            if (r12 == 0) goto L_0x0126
            if (r12 == r9) goto L_0x0126
            return r12
        L_0x0126:
            int r10 = r10 + -1
            goto L_0x0103
        L_0x0129:
            int r10 = r8.f2954p
            if (r6 >= r10) goto L_0x014c
            if (r11 == 0) goto L_0x0138
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f2955q
            r10 = r10[r6]
            int r10 = r10.e()
            goto L_0x0140
        L_0x0138:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f2955q
            r10 = r10[r6]
            int r10 = r10.f()
        L_0x0140:
            android.view.View r10 = r8.v(r10)
            if (r10 == 0) goto L_0x0149
            if (r10 == r9) goto L_0x0149
            return r10
        L_0x0149:
            int r6 = r6 + 1
            goto L_0x0129
        L_0x014c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.h0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public final void h1(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int k10;
        int l12 = l1(Integer.MAX_VALUE);
        if (l12 != Integer.MAX_VALUE && (k10 = l12 - this.f2956r.k()) > 0) {
            int x12 = k10 - x1(k10, sVar, xVar);
            if (z10 && x12 > 0) {
                this.f2956r.p(-x12);
            }
        }
    }

    public boolean i(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    public void i0(AccessibilityEvent accessibilityEvent) {
        super.i0(accessibilityEvent);
        if (A() > 0) {
            View f12 = f1(false);
            View e12 = e1(false);
            if (f12 != null && e12 != null) {
                int T = T(f12);
                int T2 = T(e12);
                if (T < T2) {
                    accessibilityEvent.setFromIndex(T);
                    accessibilityEvent.setToIndex(T2);
                    return;
                }
                accessibilityEvent.setFromIndex(T2);
                accessibilityEvent.setToIndex(T);
            }
        }
    }

    public int i1() {
        if (A() == 0) {
            return 0;
        }
        return T(z(0));
    }

    public int j1() {
        int A2 = A();
        if (A2 == 0) {
            return 0;
        }
        return T(z(A2 - 1));
    }

    public void k(int i10, int i11, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        int i12;
        int i13;
        if (this.f2958t != 0) {
            i10 = i11;
        }
        if (A() != 0 && i10 != 0) {
            s1(i10, xVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f2954p) {
                this.J = new int[this.f2954p];
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f2954p; i15++) {
                l lVar = this.f2960v;
                if (lVar.f3117d == -1) {
                    i13 = lVar.f3119f;
                    i12 = this.f2955q[i15].k(i13);
                } else {
                    i13 = this.f2955q[i15].h(lVar.f3120g);
                    i12 = this.f2960v.f3120g;
                }
                int i16 = i13 - i12;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
            }
            Arrays.sort(this.J, 0, i14);
            int i17 = 0;
            while (i17 < i14) {
                int i18 = this.f2960v.f3116c;
                if (i18 >= 0 && i18 < xVar.b()) {
                    ((k.b) cVar).a(this.f2960v.f3116c, this.J[i17]);
                    l lVar2 = this.f2960v;
                    lVar2.f3116c += lVar2.f3117d;
                    i17++;
                } else {
                    return;
                }
            }
        }
    }

    public final int k1(int i10) {
        int h10 = this.f2955q[0].h(i10);
        for (int i11 = 1; i11 < this.f2954p; i11++) {
            int h11 = this.f2955q[i11].h(i10);
            if (h11 > h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    public final int l1(int i10) {
        int k10 = this.f2955q[0].k(i10);
        for (int i11 = 1; i11 < this.f2954p; i11++) {
            int k11 = this.f2955q[i11].k(i10);
            if (k11 < k10) {
                k10 = k11;
            }
        }
        return k10;
    }

    public int m(RecyclerView.x xVar) {
        return a1(xVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2962x
            if (r0 == 0) goto L_0x0009
            int r0 = r6.j1()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.i1()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.B
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.B
            r7.e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f2962x
            if (r7 == 0) goto L_0x004d
            int r7 = r6.i1()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.j1()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.I0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m1(int, int, int):void");
    }

    public int n(RecyclerView.x xVar) {
        return b1(xVar);
    }

    public void n0(RecyclerView recyclerView, int i10, int i11) {
        m1(i10, i11, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        if (r10 == r11) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r10 == r11) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View n1() {
        /*
            r12 = this;
            int r0 = r12.A()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2954p
            r2.<init>(r3)
            int r3 = r12.f2954p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2958t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.o1()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2962x
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00f4
            android.view.View r7 = r12.z(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2973e
            int r9 = r9.f2994e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2973e
            boolean r10 = r12.f2962x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x0073
            int r10 = r9.f2992c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.b()
            int r10 = r9.f2992c
        L_0x0056:
            androidx.recyclerview.widget.q r11 = r12.f2956r
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x0096
            java.util.ArrayList<android.view.View> r10 = r9.f2990a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.j(r10)
            r9.getClass()
            goto L_0x0094
        L_0x0073:
            int r10 = r9.f2991b
            if (r10 == r11) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            r9.c()
            int r10 = r9.f2991b
        L_0x007d:
            androidx.recyclerview.widget.q r11 = r12.f2956r
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x0096
            java.util.ArrayList<android.view.View> r10 = r9.f2990a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.j(r10)
            r9.getClass()
        L_0x0094:
            r9 = 1
            goto L_0x0097
        L_0x0096:
            r9 = 0
        L_0x0097:
            if (r9 == 0) goto L_0x009a
            return r7
        L_0x009a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2973e
            int r9 = r9.f2994e
            r2.clear(r9)
        L_0x00a1:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00f1
            android.view.View r9 = r12.z(r9)
            boolean r10 = r12.f2962x
            if (r10 == 0) goto L_0x00bf
            androidx.recyclerview.widget.q r10 = r12.f2956r
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.q r11 = r12.f2956r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00bc
            return r7
        L_0x00bc:
            if (r10 != r11) goto L_0x00d2
            goto L_0x00d0
        L_0x00bf:
            androidx.recyclerview.widget.q r10 = r12.f2956r
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.q r11 = r12.f2956r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00ce
            return r7
        L_0x00ce:
            if (r10 != r11) goto L_0x00d2
        L_0x00d0:
            r10 = 1
            goto L_0x00d3
        L_0x00d2:
            r10 = 0
        L_0x00d3:
            if (r10 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2973e
            int r8 = r8.f2994e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2973e
            int r9 = r9.f2994e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00e8
            r8 = 1
            goto L_0x00e9
        L_0x00e8:
            r8 = 0
        L_0x00e9:
            if (r3 >= 0) goto L_0x00ed
            r9 = 1
            goto L_0x00ee
        L_0x00ed:
            r9 = 0
        L_0x00ee:
            if (r8 == r9) goto L_0x00f1
            return r7
        L_0x00f1:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00f4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.n1():android.view.View");
    }

    public int o(RecyclerView.x xVar) {
        return c1(xVar);
    }

    public void o0(RecyclerView recyclerView) {
        this.B.a();
        I0();
    }

    public boolean o1() {
        return M() == 1;
    }

    public int p(RecyclerView.x xVar) {
        return a1(xVar);
    }

    public void p0(RecyclerView recyclerView, int i10, int i11, int i12) {
        m1(i10, i11, 8);
    }

    public final void p1(View view, int i10, int i11, boolean z10) {
        boolean z11;
        f(view, this.G);
        c cVar = (c) view.getLayoutParams();
        int i12 = cVar.leftMargin;
        Rect rect = this.G;
        int C1 = C1(i10, i12 + rect.left, cVar.rightMargin + rect.right);
        int i13 = cVar.topMargin;
        Rect rect2 = this.G;
        int C12 = C1(i11, i13 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z10) {
            z11 = U0(view, C1, C12, cVar);
        } else {
            z11 = S0(view, C1, C12, cVar);
        }
        if (z11) {
            view.measure(C1, C12);
        }
    }

    public int q(RecyclerView.x xVar) {
        return b1(xVar);
    }

    public void q0(RecyclerView recyclerView, int i10, int i11) {
        m1(i10, i11, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0411, code lost:
        if (Z0() != false) goto L_0x0415;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q1(androidx.recyclerview.widget.RecyclerView.s r12, androidx.recyclerview.widget.RecyclerView.x r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.F
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f2964z
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.b()
            if (r1 != 0) goto L_0x0018
            r11.B0(r12)
            r0.b()
            return
        L_0x0018:
            boolean r1 = r0.f2970e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f2964z
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.F
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01f8
            r0.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 == 0) goto L_0x00ba
            int r7 = r6.f2982c
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.f2954p
            if (r7 != r9) goto L_0x006f
            r6 = 0
        L_0x003f:
            int r7 = r11.f2954p
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2955q
            r7 = r7[r6]
            r7.d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            int[] r9 = r7.f2983d
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.f2988i
            if (r7 == 0) goto L_0x005d
            androidx.recyclerview.widget.q r7 = r11.f2956r
            int r7 = r7.g()
            goto L_0x0063
        L_0x005d:
            androidx.recyclerview.widget.q r7 = r11.f2956r
            int r7 = r7.k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2955q
            r7 = r7[r6]
            r7.f2991b = r9
            r7.f2992c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.f2983d = r8
            r6.f2982c = r4
            r6.f2984e = r4
            r6.f2985f = r8
            r6.f2986g = r8
            int r7 = r6.f2981b
            r6.f2980a = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            boolean r7 = r6.f2989r
            r11.E = r7
            boolean r6 = r6.f2987h
            r11.e(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.f2987h
            if (r8 == r6) goto L_0x0092
            r7.f2987h = r6
        L_0x0092:
            r11.f2961w = r6
            r11.I0()
            r11.w1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            int r7 = r6.f2980a
            if (r7 == r2) goto L_0x00a7
            r11.f2964z = r7
            boolean r7 = r6.f2988i
            r0.f2968c = r7
            goto L_0x00ab
        L_0x00a7:
            boolean r7 = r11.f2962x
            r0.f2968c = r7
        L_0x00ab:
            int r7 = r6.f2984e
            if (r7 <= r3) goto L_0x00c1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r11.B
            int[] r8 = r6.f2985f
            r7.f2974a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r6 = r6.f2986g
            r7.f2975b = r6
            goto L_0x00c1
        L_0x00ba:
            r11.w1()
            boolean r6 = r11.f2962x
            r0.f2968c = r6
        L_0x00c1:
            boolean r6 = r13.f2937g
            if (r6 != 0) goto L_0x01b5
            int r6 = r11.f2964z
            if (r6 != r2) goto L_0x00cb
            goto L_0x01b5
        L_0x00cb:
            if (r6 < 0) goto L_0x01b1
            int r7 = r13.b()
            if (r6 < r7) goto L_0x00d5
            goto L_0x01b1
        L_0x00d5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 == 0) goto L_0x00ea
            int r7 = r6.f2980a
            if (r7 == r2) goto L_0x00ea
            int r6 = r6.f2982c
            if (r6 >= r3) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            r0.f2967b = r5
            int r6 = r11.f2964z
            r0.f2966a = r6
            goto L_0x01af
        L_0x00ea:
            int r6 = r11.f2964z
            android.view.View r6 = r11.v(r6)
            if (r6 == 0) goto L_0x017b
            boolean r7 = r11.f2962x
            if (r7 == 0) goto L_0x00fb
            int r7 = r11.j1()
            goto L_0x00ff
        L_0x00fb:
            int r7 = r11.i1()
        L_0x00ff:
            r0.f2966a = r7
            int r7 = r11.A
            if (r7 == r5) goto L_0x0131
            boolean r7 = r0.f2968c
            if (r7 == 0) goto L_0x011d
            androidx.recyclerview.widget.q r7 = r11.f2956r
            int r7 = r7.g()
            int r8 = r11.A
            int r7 = r7 - r8
            androidx.recyclerview.widget.q r8 = r11.f2956r
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            r0.f2967b = r7
            goto L_0x01af
        L_0x011d:
            androidx.recyclerview.widget.q r7 = r11.f2956r
            int r7 = r7.k()
            int r8 = r11.A
            int r7 = r7 + r8
            androidx.recyclerview.widget.q r8 = r11.f2956r
            int r6 = r8.e(r6)
            int r7 = r7 - r6
            r0.f2967b = r7
            goto L_0x01af
        L_0x0131:
            androidx.recyclerview.widget.q r7 = r11.f2956r
            int r7 = r7.c(r6)
            androidx.recyclerview.widget.q r8 = r11.f2956r
            int r8 = r8.l()
            if (r7 <= r8) goto L_0x0153
            boolean r6 = r0.f2968c
            if (r6 == 0) goto L_0x014a
            androidx.recyclerview.widget.q r6 = r11.f2956r
            int r6 = r6.g()
            goto L_0x0150
        L_0x014a:
            androidx.recyclerview.widget.q r6 = r11.f2956r
            int r6 = r6.k()
        L_0x0150:
            r0.f2967b = r6
            goto L_0x01af
        L_0x0153:
            androidx.recyclerview.widget.q r7 = r11.f2956r
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.q r8 = r11.f2956r
            int r8 = r8.k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x0166
            int r6 = -r7
            r0.f2967b = r6
            goto L_0x01af
        L_0x0166:
            androidx.recyclerview.widget.q r7 = r11.f2956r
            int r7 = r7.g()
            androidx.recyclerview.widget.q r8 = r11.f2956r
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x0178
            r0.f2967b = r7
            goto L_0x01af
        L_0x0178:
            r0.f2967b = r5
            goto L_0x01af
        L_0x017b:
            int r6 = r11.f2964z
            r0.f2966a = r6
            int r7 = r11.A
            if (r7 != r5) goto L_0x0192
            int r6 = r11.Y0(r6)
            if (r6 != r3) goto L_0x018b
            r6 = 1
            goto L_0x018c
        L_0x018b:
            r6 = 0
        L_0x018c:
            r0.f2968c = r6
            r0.a()
            goto L_0x01ad
        L_0x0192:
            boolean r6 = r0.f2968c
            if (r6 == 0) goto L_0x01a2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r6 = r6.f2956r
            int r6 = r6.g()
            int r6 = r6 - r7
            r0.f2967b = r6
            goto L_0x01ad
        L_0x01a2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r6 = r6.f2956r
            int r6 = r6.k()
            int r6 = r6 + r7
            r0.f2967b = r6
        L_0x01ad:
            r0.f2969d = r3
        L_0x01af:
            r6 = 1
            goto L_0x01b6
        L_0x01b1:
            r11.f2964z = r2
            r11.A = r5
        L_0x01b5:
            r6 = 0
        L_0x01b6:
            if (r6 == 0) goto L_0x01b9
            goto L_0x01f6
        L_0x01b9:
            boolean r6 = r11.D
            if (r6 == 0) goto L_0x01d5
            int r6 = r13.b()
            int r7 = r11.A()
        L_0x01c5:
            int r7 = r7 + r2
            if (r7 < 0) goto L_0x01f1
            android.view.View r8 = r11.z(r7)
            int r8 = r11.T(r8)
            if (r8 < 0) goto L_0x01c5
            if (r8 >= r6) goto L_0x01c5
            goto L_0x01f2
        L_0x01d5:
            int r6 = r13.b()
            int r7 = r11.A()
            r8 = 0
        L_0x01de:
            if (r8 >= r7) goto L_0x01f1
            android.view.View r9 = r11.z(r8)
            int r9 = r11.T(r9)
            if (r9 < 0) goto L_0x01ee
            if (r9 >= r6) goto L_0x01ee
            r8 = r9
            goto L_0x01f2
        L_0x01ee:
            int r8 = r8 + 1
            goto L_0x01de
        L_0x01f1:
            r8 = 0
        L_0x01f2:
            r0.f2966a = r8
            r0.f2967b = r5
        L_0x01f6:
            r0.f2970e = r3
        L_0x01f8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 != 0) goto L_0x0215
            int r6 = r11.f2964z
            if (r6 != r2) goto L_0x0215
            boolean r6 = r0.f2968c
            boolean r7 = r11.D
            if (r6 != r7) goto L_0x020e
            boolean r6 = r11.o1()
            boolean r7 = r11.E
            if (r6 == r7) goto L_0x0215
        L_0x020e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r6 = r11.B
            r6.a()
            r0.f2969d = r3
        L_0x0215:
            int r6 = r11.A()
            if (r6 <= 0) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 == 0) goto L_0x0223
            int r6 = r6.f2982c
            if (r6 >= r3) goto L_0x02cd
        L_0x0223:
            boolean r6 = r0.f2969d
            if (r6 == 0) goto L_0x0242
            r1 = 0
        L_0x0228:
            int r6 = r11.f2954p
            if (r1 >= r6) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2955q
            r6 = r6[r1]
            r6.d()
            int r6 = r0.f2967b
            if (r6 == r5) goto L_0x023f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f2955q
            r7 = r7[r1]
            r7.f2991b = r6
            r7.f2992c = r6
        L_0x023f:
            int r1 = r1 + 1
            goto L_0x0228
        L_0x0242:
            if (r1 != 0) goto L_0x0264
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.H
            int[] r1 = r1.f2971f
            if (r1 != 0) goto L_0x024b
            goto L_0x0264
        L_0x024b:
            r1 = 0
        L_0x024c:
            int r6 = r11.f2954p
            if (r1 >= r6) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2955q
            r6 = r6[r1]
            r6.d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.H
            int[] r7 = r7.f2971f
            r7 = r7[r1]
            r6.f2991b = r7
            r6.f2992c = r7
            int r1 = r1 + 1
            goto L_0x024c
        L_0x0264:
            r1 = 0
        L_0x0265:
            int r6 = r11.f2954p
            if (r1 >= r6) goto L_0x02a5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2955q
            r6 = r6[r1]
            boolean r7 = r11.f2962x
            int r8 = r0.f2967b
            if (r7 == 0) goto L_0x0278
            int r9 = r6.h(r5)
            goto L_0x027c
        L_0x0278:
            int r9 = r6.k(r5)
        L_0x027c:
            r6.d()
            if (r9 != r5) goto L_0x0282
            goto L_0x02a2
        L_0x0282:
            if (r7 == 0) goto L_0x028e
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r10 = r10.f2956r
            int r10 = r10.g()
            if (r9 < r10) goto L_0x02a2
        L_0x028e:
            if (r7 != 0) goto L_0x029b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.q r7 = r7.f2956r
            int r7 = r7.k()
            if (r9 <= r7) goto L_0x029b
            goto L_0x02a2
        L_0x029b:
            if (r8 == r5) goto L_0x029e
            int r9 = r9 + r8
        L_0x029e:
            r6.f2992c = r9
            r6.f2991b = r9
        L_0x02a2:
            int r1 = r1 + 1
            goto L_0x0265
        L_0x02a5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f2955q
            r1.getClass()
            int r7 = r6.length
            int[] r8 = r1.f2971f
            if (r8 == 0) goto L_0x02b4
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02bd
        L_0x02b4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f2955q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f2971f = r8
        L_0x02bd:
            r8 = 0
        L_0x02be:
            if (r8 >= r7) goto L_0x02cd
            int[] r9 = r1.f2971f
            r10 = r6[r8]
            int r10 = r10.k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02be
        L_0x02cd:
            r11.s(r12)
            androidx.recyclerview.widget.l r1 = r11.f2960v
            r1.f3114a = r4
            androidx.recyclerview.widget.q r1 = r11.f2957s
            int r1 = r1.l()
            int r6 = r11.f2954p
            int r6 = r1 / r6
            r11.f2959u = r6
            androidx.recyclerview.widget.q r6 = r11.f2957s
            int r6 = r6.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = r0.f2966a
            r11.A1(r1, r13)
            boolean r1 = r0.f2968c
            if (r1 == 0) goto L_0x030a
            r11.y1(r2)
            androidx.recyclerview.widget.l r1 = r11.f2960v
            r11.d1(r12, r1, r13)
            r11.y1(r3)
            androidx.recyclerview.widget.l r1 = r11.f2960v
            int r2 = r0.f2966a
            int r6 = r1.f3117d
            int r2 = r2 + r6
            r1.f3116c = r2
            r11.d1(r12, r1, r13)
            goto L_0x0321
        L_0x030a:
            r11.y1(r3)
            androidx.recyclerview.widget.l r1 = r11.f2960v
            r11.d1(r12, r1, r13)
            r11.y1(r2)
            androidx.recyclerview.widget.l r1 = r11.f2960v
            int r2 = r0.f2966a
            int r6 = r1.f3117d
            int r2 = r2 + r6
            r1.f3116c = r2
            r11.d1(r12, r1, r13)
        L_0x0321:
            androidx.recyclerview.widget.q r1 = r11.f2957s
            int r1 = r1.i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x032d
            goto L_0x03d2
        L_0x032d:
            r1 = 0
            int r2 = r11.A()
            r6 = 0
        L_0x0333:
            if (r6 >= r2) goto L_0x0355
            android.view.View r7 = r11.z(r6)
            androidx.recyclerview.widget.q r8 = r11.f2957s
            int r8 = r8.c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0345
            goto L_0x0352
        L_0x0345:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            r7.getClass()
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0352:
            int r6 = r6 + 1
            goto L_0x0333
        L_0x0355:
            int r6 = r11.f2959u
            int r7 = r11.f2954p
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.q r7 = r11.f2957s
            int r7 = r7.i()
            if (r7 != r5) goto L_0x0372
            androidx.recyclerview.widget.q r5 = r11.f2957s
            int r5 = r5.l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0372:
            int r5 = r11.f2954p
            int r5 = r1 / r5
            r11.f2959u = r5
            androidx.recyclerview.widget.q r5 = r11.f2957s
            int r5 = r5.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r1 = r11.f2959u
            if (r1 != r6) goto L_0x0386
            goto L_0x03d2
        L_0x0386:
            r1 = 0
        L_0x0387:
            if (r1 >= r2) goto L_0x03d2
            android.view.View r5 = r11.z(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            r7.getClass()
            boolean r8 = r11.o1()
            if (r8 == 0) goto L_0x03b8
            int r8 = r11.f2958t
            if (r8 != r3) goto L_0x03b8
            int r8 = r11.f2954p
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f2973e
            int r7 = r7.f2994e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f2959u
            int r9 = r9 * r10
            int r8 = r8 - r3
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03cf
        L_0x03b8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f2973e
            int r7 = r7.f2994e
            int r8 = r11.f2959u
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f2958t
            if (r9 != r3) goto L_0x03cb
            int r8 = r8 - r7
            r5.offsetLeftAndRight(r8)
            goto L_0x03cf
        L_0x03cb:
            int r8 = r8 - r7
            r5.offsetTopAndBottom(r8)
        L_0x03cf:
            int r1 = r1 + 1
            goto L_0x0387
        L_0x03d2:
            int r1 = r11.A()
            if (r1 <= 0) goto L_0x03e9
            boolean r1 = r11.f2962x
            if (r1 == 0) goto L_0x03e3
            r11.g1(r12, r13, r3)
            r11.h1(r12, r13, r4)
            goto L_0x03e9
        L_0x03e3:
            r11.h1(r12, r13, r3)
            r11.g1(r12, r13, r4)
        L_0x03e9:
            if (r14 == 0) goto L_0x0414
            boolean r14 = r13.f2937g
            if (r14 != 0) goto L_0x0414
            int r14 = r11.C
            if (r14 == 0) goto L_0x0401
            int r14 = r11.A()
            if (r14 <= 0) goto L_0x0401
            android.view.View r14 = r11.n1()
            if (r14 == 0) goto L_0x0401
            r14 = 1
            goto L_0x0402
        L_0x0401:
            r14 = 0
        L_0x0402:
            if (r14 == 0) goto L_0x0414
            java.lang.Runnable r14 = r11.K
            androidx.recyclerview.widget.RecyclerView r1 = r11.f2876b
            if (r1 == 0) goto L_0x040d
            r1.removeCallbacks(r14)
        L_0x040d:
            boolean r14 = r11.Z0()
            if (r14 == 0) goto L_0x0414
            goto L_0x0415
        L_0x0414:
            r3 = 0
        L_0x0415:
            boolean r14 = r13.f2937g
            if (r14 == 0) goto L_0x041e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.H
            r14.b()
        L_0x041e:
            boolean r14 = r0.f2968c
            r11.D = r14
            boolean r14 = r11.o1()
            r11.E = r14
            if (r3 == 0) goto L_0x0432
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.H
            r14.b()
            r11.q1(r12, r13, r4)
        L_0x0432:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    public int r(RecyclerView.x xVar) {
        return c1(xVar);
    }

    public final boolean r1(int i10) {
        if (this.f2958t == 0) {
            if ((i10 == -1) != this.f2962x) {
                return true;
            }
            return false;
        }
        if (((i10 == -1) == this.f2962x) == o1()) {
            return true;
        }
        return false;
    }

    public void s0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        m1(i10, i11, 4);
    }

    public void s1(int i10, RecyclerView.x xVar) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = j1();
            i11 = 1;
        } else {
            i12 = i1();
            i11 = -1;
        }
        this.f2960v.f3114a = true;
        A1(i12, xVar);
        y1(i11);
        l lVar = this.f2960v;
        lVar.f3116c = i12 + lVar.f3117d;
        lVar.f3115b = Math.abs(i10);
    }

    public void t0(RecyclerView.s sVar, RecyclerView.x xVar) {
        q1(sVar, xVar, true);
    }

    public final void t1(RecyclerView.s sVar, l lVar) {
        int i10;
        int i11;
        if (lVar.f3114a && !lVar.f3122i) {
            if (lVar.f3115b != 0) {
                int i12 = 1;
                if (lVar.f3118e == -1) {
                    int i13 = lVar.f3119f;
                    int k10 = this.f2955q[0].k(i13);
                    while (i12 < this.f2954p) {
                        int k11 = this.f2955q[i12].k(i13);
                        if (k11 > k10) {
                            k10 = k11;
                        }
                        i12++;
                    }
                    int i14 = i13 - k10;
                    if (i14 < 0) {
                        i11 = lVar.f3120g;
                    } else {
                        i11 = lVar.f3120g - Math.min(i14, lVar.f3115b);
                    }
                    u1(sVar, i11);
                    return;
                }
                int i15 = lVar.f3120g;
                int h10 = this.f2955q[0].h(i15);
                while (i12 < this.f2954p) {
                    int h11 = this.f2955q[i12].h(i15);
                    if (h11 < h10) {
                        h10 = h11;
                    }
                    i12++;
                }
                int i16 = h10 - lVar.f3120g;
                if (i16 < 0) {
                    i10 = lVar.f3119f;
                } else {
                    i10 = Math.min(i16, lVar.f3115b) + lVar.f3119f;
                }
                v1(sVar, i10);
            } else if (lVar.f3118e == -1) {
                u1(sVar, lVar.f3120g);
            } else {
                v1(sVar, lVar.f3119f);
            }
        }
    }

    public void u0(RecyclerView.x xVar) {
        this.f2964z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.b();
    }

    public final void u1(RecyclerView.s sVar, int i10) {
        int A2 = A() - 1;
        while (A2 >= 0) {
            View z10 = z(A2);
            if (this.f2956r.e(z10) >= i10 && this.f2956r.o(z10) >= i10) {
                c cVar = (c) z10.getLayoutParams();
                cVar.getClass();
                if (cVar.f2973e.f2990a.size() != 1) {
                    cVar.f2973e.l();
                    D0(z10, sVar);
                    A2--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void v1(RecyclerView.s sVar, int i10) {
        while (A() > 0) {
            View z10 = z(0);
            if (this.f2956r.b(z10) <= i10 && this.f2956r.n(z10) <= i10) {
                c cVar = (c) z10.getLayoutParams();
                cVar.getClass();
                if (cVar.f2973e.f2990a.size() != 1) {
                    cVar.f2973e.m();
                    D0(z10, sVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public RecyclerView.n w() {
        if (this.f2958t == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public final void w1() {
        if (this.f2958t == 1 || !o1()) {
            this.f2962x = this.f2961w;
        } else {
            this.f2962x = !this.f2961w;
        }
    }

    public RecyclerView.n x(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void x0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.f2964z != -1) {
                eVar.f2983d = null;
                eVar.f2982c = 0;
                eVar.f2980a = -1;
                eVar.f2981b = -1;
                eVar.f2983d = null;
                eVar.f2982c = 0;
                eVar.f2984e = 0;
                eVar.f2985f = null;
                eVar.f2986g = null;
            }
            I0();
        }
    }

    public int x1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (A() == 0 || i10 == 0) {
            return 0;
        }
        s1(i10, xVar);
        int d12 = d1(sVar, this.f2960v, xVar);
        if (this.f2960v.f3115b >= d12) {
            i10 = i10 < 0 ? -d12 : d12;
        }
        this.f2956r.p(-i10);
        this.D = this.f2962x;
        l lVar = this.f2960v;
        lVar.f3115b = 0;
        t1(sVar, lVar);
        return i10;
    }

    public RecyclerView.n y(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public Parcelable y0() {
        int i10;
        View view;
        int i11;
        int i12;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f2987h = this.f2961w;
        eVar2.f2988i = this.D;
        eVar2.f2989r = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f2974a) == null) {
            eVar2.f2984e = 0;
        } else {
            eVar2.f2985f = iArr;
            eVar2.f2984e = iArr.length;
            eVar2.f2986g = dVar.f2975b;
        }
        int i13 = -1;
        if (A() > 0) {
            if (this.D) {
                i10 = j1();
            } else {
                i10 = i1();
            }
            eVar2.f2980a = i10;
            if (this.f2962x) {
                view = e1(true);
            } else {
                view = f1(true);
            }
            if (view != null) {
                i13 = T(view);
            }
            eVar2.f2981b = i13;
            int i14 = this.f2954p;
            eVar2.f2982c = i14;
            eVar2.f2983d = new int[i14];
            for (int i15 = 0; i15 < this.f2954p; i15++) {
                if (this.D) {
                    i11 = this.f2955q[i15].h(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f2956r.g();
                    } else {
                        eVar2.f2983d[i15] = i11;
                    }
                } else {
                    i11 = this.f2955q[i15].k(Integer.MIN_VALUE);
                    if (i11 != Integer.MIN_VALUE) {
                        i12 = this.f2956r.k();
                    } else {
                        eVar2.f2983d[i15] = i11;
                    }
                }
                i11 -= i12;
                eVar2.f2983d[i15] = i11;
            }
        } else {
            eVar2.f2980a = -1;
            eVar2.f2981b = -1;
            eVar2.f2982c = 0;
        }
        return eVar2;
    }

    public final void y1(int i10) {
        l lVar = this.f2960v;
        lVar.f3118e = i10;
        int i11 = 1;
        if (this.f2962x != (i10 == -1)) {
            i11 = -1;
        }
        lVar.f3117d = i11;
    }

    public void z0(int i10) {
        if (i10 == 0) {
            Z0();
        }
    }

    public final void z1(int i10, int i11) {
        for (int i12 = 0; i12 < this.f2954p; i12++) {
            if (!this.f2955q[i12].f2990a.isEmpty()) {
                B1(this.f2955q[i12], i10, i11);
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2974a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f2975b;

        public void a() {
            int[] iArr = this.f2974a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2975b = null;
        }

        public void b(int i10) {
            int[] iArr = this.f2974a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f2974a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2974a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2974a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public a c(int i10) {
            List<a> list = this.f2975b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2975b.get(size);
                if (aVar.f2976a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f2974a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2975b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = -1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f2975b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2975b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2975b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f2976a
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = -1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2975b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2975b
                r3.remove(r2)
                int r0 = r0.f2976a
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f2974a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f2974a
                int r5 = r5.length
                return r5
            L_0x0052:
                int r0 = r0 + 1
                int[] r2 = r4.f2974a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.f2974a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        public void e(int i10, int i11) {
            int[] iArr = this.f2974a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f2974a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f2974a, i10, i12, -1);
                List<a> list = this.f2975b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f2975b.get(size);
                        int i13 = aVar.f2976a;
                        if (i13 >= i10) {
                            aVar.f2976a = i13 + i11;
                        }
                    }
                }
            }
        }

        public void f(int i10, int i11) {
            int[] iArr = this.f2974a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f2974a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f2974a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                List<a> list = this.f2975b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f2975b.get(size);
                        int i13 = aVar.f2976a;
                        if (i13 >= i10) {
                            if (i13 < i12) {
                                this.f2975b.remove(size);
                            } else {
                                aVar.f2976a = i13 - i11;
                            }
                        }
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0035a();

            /* renamed from: a  reason: collision with root package name */
            public int f2976a;

            /* renamed from: b  reason: collision with root package name */
            public int f2977b;

            /* renamed from: c  reason: collision with root package name */
            public int[] f2978c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f2979d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public class C0035a implements Parcelable.Creator<a> {
                public Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public Object[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a(Parcel parcel) {
                this.f2976a = parcel.readInt();
                this.f2977b = parcel.readInt();
                this.f2979d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2978c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("FullSpanItem{mPosition=");
                a10.append(this.f2976a);
                a10.append(", mGapDir=");
                a10.append(this.f2977b);
                a10.append(", mHasUnwantedGapAfter=");
                a10.append(this.f2979d);
                a10.append(", mGapPerSpan=");
                a10.append(Arrays.toString(this.f2978c));
                a10.append('}');
                return a10.toString();
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2976a);
                parcel.writeInt(this.f2977b);
                parcel.writeInt(this.f2979d ? 1 : 0);
                int[] iArr = this.f2978c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2978c);
            }

            public a() {
            }
        }
    }
}
