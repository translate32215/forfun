package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.d0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.startapp.startappsdk.R;
import f0.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import l9.u;
import o0.c0;
import o0.m;
import p0.c;
import p0.g;
import s9.f;
import s9.i;
import v0.d;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int A;
    public int B;
    public int C;
    public float D = 0.5f;
    public int E;
    public float F = -1.0f;
    public boolean G;
    public boolean H;
    public boolean I = true;
    public int J = 4;
    public v0.d K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public WeakReference<V> R;
    public WeakReference<View> S;
    public final ArrayList<c> T = new ArrayList<>();
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;
    public Map<View, Integer> Y;
    public int Z = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f8970a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public final d.c f8971a0 = new b();

    /* renamed from: b  reason: collision with root package name */
    public boolean f8972b = true;

    /* renamed from: c  reason: collision with root package name */
    public float f8973c;

    /* renamed from: d  reason: collision with root package name */
    public int f8974d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8975e;

    /* renamed from: f  reason: collision with root package name */
    public int f8976f;

    /* renamed from: g  reason: collision with root package name */
    public int f8977g;

    /* renamed from: h  reason: collision with root package name */
    public f f8978h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f8979i;

    /* renamed from: j  reason: collision with root package name */
    public int f8980j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f8981k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f8982l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8983m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8984n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8985o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8986p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8987q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8988r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8989s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8990t;

    /* renamed from: u  reason: collision with root package name */
    public int f8991u;

    /* renamed from: v  reason: collision with root package name */
    public int f8992v;

    /* renamed from: w  reason: collision with root package name */
    public i f8993w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8994x;

    /* renamed from: y  reason: collision with root package name */
    public final BottomSheetBehavior<V>.e f8995y = new e((a) null);

    /* renamed from: z  reason: collision with root package name */
    public ValueAnimator f8996z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8997a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f8998b;

        public a(View view, int i10) {
            this.f8997a = view;
            this.f8998b = i10;
        }

        public void run() {
            BottomSheetBehavior.this.H(this.f8997a, this.f8998b, false);
        }
    }

    public class b extends d.c {
        public b() {
        }

        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        public int b(View view, int i10, int i11) {
            int z10 = BottomSheetBehavior.this.z();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b8.a.c(i10, z10, bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E);
        }

        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.G) {
                return bottomSheetBehavior.Q;
            }
            return bottomSheetBehavior.E;
        }

        public void h(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.I) {
                    bottomSheetBehavior.F(1);
                }
            }
        }

        public void i(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.v(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r4.f9000a.z()) < java.lang.Math.abs(r5.getTop() - r4.f9000a.C)) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
            if (java.lang.Math.abs(r6 - r7.B) < java.lang.Math.abs(r6 - r4.f9000a.E)) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
            if (r6 > r4.f9000a.C) goto L_0x0101;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void j(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x0022
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f8972b
                if (r6 == 0) goto L_0x000e
                goto L_0x00e3
            L_0x000e:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.getClass()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.C
                if (r6 <= r7) goto L_0x00e3
                goto L_0x0101
            L_0x0022:
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r3 = r2.G
                if (r3 == 0) goto L_0x0080
                boolean r2 = r2.G(r5, r7)
                if (r2 == 0) goto L_0x0080
                float r6 = java.lang.Math.abs(r6)
                float r1 = java.lang.Math.abs(r7)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L_0x0040
                r6 = 1140457472(0x43fa0000, float:500.0)
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L_0x0056
            L_0x0040:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r7.Q
                int r7 = r7.z()
                int r7 = r7 + r1
                int r7 = r7 / 2
                if (r6 <= r7) goto L_0x0053
                r6 = 1
                goto L_0x0054
            L_0x0053:
                r6 = 0
            L_0x0054:
                if (r6 == 0) goto L_0x0059
            L_0x0056:
                r6 = 5
                goto L_0x0104
            L_0x0059:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f8972b
                if (r6 == 0) goto L_0x0061
                goto L_0x00e3
            L_0x0061:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.z()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.C
                int r7 = r7 - r1
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x0101
                goto L_0x00e3
            L_0x0080:
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x00b7
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0091
                goto L_0x00b7
            L_0x0091:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f8972b
                if (r6 == 0) goto L_0x0098
                goto L_0x0103
            L_0x0098:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.C
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0103
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
                goto L_0x0101
            L_0x00b7:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r1 = r7.f8972b
                if (r1 == 0) goto L_0x00d5
                int r7 = r7.B
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0103
                goto L_0x00e3
            L_0x00d5:
                int r1 = r7.C
                if (r6 >= r1) goto L_0x00eb
                int r7 = r7.E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00e5
            L_0x00e3:
                r6 = 3
                goto L_0x0104
            L_0x00e5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
                goto L_0x0101
            L_0x00eb:
                int r7 = r6 - r1
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x0103
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.getClass()
            L_0x0101:
                r6 = 6
                goto L_0x0104
            L_0x0103:
                r6 = 4
            L_0x0104:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.getClass()
                r7.H(r5, r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.j(android.view.View, float, float):void");
        }

        public boolean k(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.J;
            if (i11 == 1 || bottomSheetBehavior.X) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.V == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.S;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.R;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    public static abstract class c {
        public void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f9006a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9007b;

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f9008c = new a();

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f9007b = false;
                v0.d dVar = BottomSheetBehavior.this.K;
                if (dVar == null || !dVar.i(true)) {
                    e eVar2 = e.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.J == 2) {
                        bottomSheetBehavior.F(eVar2.f9006a);
                        return;
                    }
                    return;
                }
                e eVar3 = e.this;
                eVar3.a(eVar3.f9006a);
            }
        }

        public e(a aVar) {
        }

        public void a(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.R;
            if (weakReference != null && weakReference.get() != null) {
                this.f9006a = i10;
                if (!this.f9007b) {
                    Runnable runnable = this.f9008c;
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    c0.d.m((View) BottomSheetBehavior.this.R.get(), runnable);
                    this.f9007b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public static <V extends View> BottomSheetBehavior<V> x(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f1353a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final int A(int i10) {
        if (i10 == 3) {
            return z();
        }
        if (i10 == 4) {
            return this.E;
        }
        if (i10 == 5) {
            return this.Q;
        }
        if (i10 == 6) {
            return this.C;
        }
        throw new IllegalArgumentException(d0.a("Invalid state to get top offset: ", i10));
    }

    public final void B(V v10, c.a aVar, int i10) {
        c0.z(v10, aVar, (CharSequence) null, new z8.c(this, i10));
    }

    public void C(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (!z10 && this.J == 5) {
                E(4);
            }
            I();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f8975e
            if (r4 != 0) goto L_0x0015
            r3.f8975e = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f8975e
            if (r1 != 0) goto L_0x0017
            int r1 = r3.f8974d
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f8975e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f8974d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.L(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(int):void");
    }

    public void E(int i10) {
        boolean z10 = true;
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(androidx.activity.e.a(android.support.v4.media.a.a("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        } else if (this.G || i10 != 5) {
            int i11 = (i10 != 6 || !this.f8972b || A(i10) > this.B) ? i10 : 3;
            WeakReference<V> weakReference = this.R;
            if (weakReference == null || weakReference.get() == null) {
                F(i10);
                return;
            }
            View view = (View) this.R.get();
            a aVar = new a(view, i11);
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !c0.q(view)) {
                z10 = false;
            }
            if (z10) {
                view.post(aVar);
            } else {
                aVar.run();
            }
        } else {
            j.a("Cannot set state: ", i10, "BottomSheetBehavior");
        }
    }

    public void F(int i10) {
        View view;
        if (this.J != i10) {
            this.J = i10;
            if (!(i10 == 4 || i10 == 3 || i10 == 6)) {
                boolean z10 = this.G;
            }
            WeakReference<V> weakReference = this.R;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i10 == 3) {
                    K(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    K(false);
                }
                J(i10);
                for (int i11 = 0; i11 < this.T.size(); i11++) {
                    this.T.get(i11).c(view, i10);
                }
                I();
            }
        }
    }

    public boolean G(View view, float f10) {
        if (this.H) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        if (Math.abs(((f10 * 0.1f) + ((float) view.getTop())) - ((float) this.E)) / ((float) u()) > 0.5f) {
            return true;
        }
        return false;
    }

    public final void H(View view, int i10, boolean z10) {
        int A2 = A(i10);
        v0.d dVar = this.K;
        if (dVar != null && (!z10 ? dVar.x(view, view.getLeft(), A2) : dVar.v(view.getLeft(), A2))) {
            F(2);
            J(i10);
            this.f8995y.a(i10);
            return;
        }
        F(i10);
    }

    public final void I() {
        View view;
        int i10;
        WeakReference<V> weakReference = this.R;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            c0.x(view, 524288);
            c0.x(view, 262144);
            c0.x(view, 1048576);
            int i11 = this.Z;
            if (i11 != -1) {
                c0.x(view, i11);
            }
            int i12 = 6;
            if (!this.f8972b && this.J != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                z8.c cVar = new z8.c(this, 6);
                List<c.a> j10 = c0.j(view);
                int i13 = 0;
                while (true) {
                    if (i13 >= j10.size()) {
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            int[] iArr = c0.f22558f;
                            if (i15 >= iArr.length || i14 != -1) {
                                i10 = i14;
                            } else {
                                int i16 = iArr[i15];
                                boolean z10 = true;
                                for (int i17 = 0; i17 < j10.size(); i17++) {
                                    z10 &= j10.get(i17).a() != i16;
                                }
                                if (z10) {
                                    i14 = i16;
                                }
                                i15++;
                            }
                        }
                        i10 = i14;
                    } else if (TextUtils.equals(string, j10.get(i13).b())) {
                        i10 = j10.get(i13).a();
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i10 != -1) {
                    c0.a(view, new c.a((Object) null, i10, string, cVar, (Class<? extends g.a>) null));
                }
                this.Z = i10;
            }
            if (this.G && this.J != 5) {
                B(view, c.a.f23758l, 5);
            }
            int i18 = this.J;
            if (i18 == 3) {
                if (this.f8972b) {
                    i12 = 4;
                }
                B(view, c.a.f23757k, i12);
            } else if (i18 == 4) {
                if (this.f8972b) {
                    i12 = 3;
                }
                B(view, c.a.f23756j, i12);
            } else if (i18 == 6) {
                B(view, c.a.f23757k, 4);
                B(view, c.a.f23756j, 3);
            }
        }
    }

    public final void J(int i10) {
        ValueAnimator valueAnimator;
        if (i10 != 2) {
            boolean z10 = i10 == 3;
            if (this.f8994x != z10) {
                this.f8994x = z10;
                if (this.f8978h != null && (valueAnimator = this.f8996z) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f8996z.reverse();
                        return;
                    }
                    float f10 = z10 ? 0.0f : 1.0f;
                    this.f8996z.setFloatValues(new float[]{1.0f - f10, f10});
                    this.f8996z.start();
                }
            }
        }
    }

    public final void K(boolean z10) {
        WeakReference<V> weakReference = this.R;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.Y == null) {
                        this.Y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.R.get() && z10) {
                        this.Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z10) {
                    this.Y = null;
                }
            }
        }
    }

    public final void L(boolean z10) {
        View view;
        if (this.R != null) {
            t();
            if (this.J == 4 && (view = (View) this.R.get()) != null) {
                if (z10) {
                    E(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public void c(CoordinatorLayout.f fVar) {
        this.R = null;
        this.K = null;
    }

    public void f() {
        this.R = null;
        this.K = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r9.I
            if (r0 != 0) goto L_0x000e
            goto L_0x00d8
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0021
            r9.V = r4
            android.view.VelocityTracker r5 = r9.U
            if (r5 == 0) goto L_0x0021
            r5.recycle()
            r9.U = r3
        L_0x0021:
            android.view.VelocityTracker r5 = r9.U
            if (r5 != 0) goto L_0x002b
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.U = r5
        L_0x002b:
            android.view.VelocityTracker r5 = r9.U
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0044
            if (r0 == r2) goto L_0x0039
            r11 = 3
            if (r0 == r11) goto L_0x0039
            goto L_0x0087
        L_0x0039:
            r9.X = r1
            r9.V = r4
            boolean r11 = r9.L
            if (r11 == 0) goto L_0x0087
            r9.L = r1
            return r1
        L_0x0044:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.W = r7
            int r7 = r9.J
            if (r7 == r5) goto L_0x0076
            java.lang.ref.WeakReference<android.view.View> r7 = r9.S
            if (r7 == 0) goto L_0x005f
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            if (r7 == 0) goto L_0x0076
            int r8 = r9.W
            boolean r7 = r10.p(r7, r6, r8)
            if (r7 == 0) goto L_0x0076
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.V = r7
            r9.X = r2
        L_0x0076:
            int r7 = r9.V
            if (r7 != r4) goto L_0x0084
            int r4 = r9.W
            boolean r11 = r10.p(r11, r6, r4)
            if (r11 != 0) goto L_0x0084
            r11 = 1
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            r9.L = r11
        L_0x0087:
            boolean r11 = r9.L
            if (r11 != 0) goto L_0x0096
            v0.d r11 = r9.K
            if (r11 == 0) goto L_0x0096
            boolean r11 = r11.w(r12)
            if (r11 == 0) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.S
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a1:
            if (r0 != r5) goto L_0x00d7
            if (r3 == 0) goto L_0x00d7
            boolean r11 = r9.L
            if (r11 != 0) goto L_0x00d7
            int r11 = r9.J
            if (r11 == r2) goto L_0x00d7
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.p(r3, r11, r0)
            if (r10 != 0) goto L_0x00d7
            v0.d r10 = r9.K
            if (r10 == 0) goto L_0x00d7
            int r10 = r9.W
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            v0.d r11 = r9.K
            int r11 = r11.f26328b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d7
            r1 = 1
        L_0x00d7:
            return r1
        L_0x00d8:
            r9.L = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (c0.d.b(coordinatorLayout) && !c0.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.R == null) {
            this.f8976f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = Build.VERSION.SDK_INT >= 29 && !this.f8983m && !this.f8975e;
            if (this.f8984n || this.f8985o || this.f8986p || this.f8988r || this.f8989s || this.f8990t || z10) {
                u.a(v10, new z8.b(this, z10));
            }
            this.R = new WeakReference<>(v10);
            f fVar = this.f8978h;
            if (fVar != null) {
                c0.d.q(v10, fVar);
                f fVar2 = this.f8978h;
                float f10 = this.F;
                if (f10 == -1.0f) {
                    f10 = c0.l(v10);
                }
                fVar2.q(f10);
                boolean z11 = this.J == 3;
                this.f8994x = z11;
                this.f8978h.s(z11 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f8979i;
                if (colorStateList != null) {
                    c0.F(v10, colorStateList);
                }
            }
            I();
            if (c0.d.c(v10) == 0) {
                c0.I(v10, 1);
            }
        }
        if (this.K == null) {
            this.K = new v0.d(coordinatorLayout.getContext(), coordinatorLayout, this.f8971a0);
        }
        int top = v10.getTop();
        coordinatorLayout.r(v10, i10);
        this.P = coordinatorLayout.getWidth();
        this.Q = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.O = height;
        int i11 = this.Q;
        int i12 = i11 - height;
        int i13 = this.f8992v;
        if (i12 < i13) {
            if (this.f8987q) {
                this.O = i11;
            } else {
                this.O = i11 - i13;
            }
        }
        this.B = Math.max(0, i11 - this.O);
        this.C = (int) ((1.0f - this.D) * ((float) this.Q));
        t();
        int i14 = this.J;
        if (i14 == 3) {
            c0.u(v10, z());
        } else if (i14 == 6) {
            c0.u(v10, this.C);
        } else if (this.G && i14 == 5) {
            c0.u(v10, this.Q);
        } else if (i14 == 4) {
            c0.u(v10, this.E);
        } else if (i14 == 1 || i14 == 2) {
            c0.u(v10, top - v10.getTop());
        }
        this.S = new WeakReference<>(w(v10));
        for (int i15 = 0; i15 < this.T.size(); i15++) {
            this.T.get(i15).a(v10);
        }
        return true;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(y(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f8980j, marginLayoutParams.width), y(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f8981k, marginLayoutParams.height));
        return true;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference = this.S;
        return (weakReference == null || view != weakReference.get() || this.J == 3) ? false : true;
    }

    public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 != 1) {
            WeakReference<View> weakReference = this.S;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v10.getTop();
                int i13 = top - i11;
                if (i11 > 0) {
                    if (i13 < z()) {
                        iArr[1] = top - z();
                        c0.u(v10, -iArr[1]);
                        F(3);
                    } else if (this.I) {
                        iArr[1] = i11;
                        c0.u(v10, -i11);
                        F(1);
                    } else {
                        return;
                    }
                } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                    int i14 = this.E;
                    if (i13 > i14 && !this.G) {
                        iArr[1] = top - i14;
                        c0.u(v10, -iArr[1]);
                        F(4);
                    } else if (this.I) {
                        iArr[1] = i11;
                        c0.u(v10, -i11);
                        F(1);
                    } else {
                        return;
                    }
                }
                v(v10.getTop());
                this.M = i11;
                this.N = true;
            }
        }
    }

    public void l(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public void n(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f8970a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f8974d = dVar.f9002d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f8972b = dVar.f9003e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.G = dVar.f9004f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.H = dVar.f9005g;
            }
        }
        int i11 = dVar.f9001c;
        if (i11 == 1 || i11 == 2) {
            this.J = 4;
        } else {
            this.J = i11;
        }
    }

    public Parcelable o(CoordinatorLayout coordinatorLayout, V v10) {
        return new d((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.M = 0;
        this.N = false;
        if ((i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3.getTop() <= r1.C) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (java.lang.Math.abs(r2 - r1.B) < java.lang.Math.abs(r2 - r1.E)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.E)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.E)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.C) < java.lang.Math.abs(r2 - r1.E)) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.z()
            r0 = 3
            if (r2 != r5) goto L_0x000f
            r1.F(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.S
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto L_0x00b4
            boolean r2 = r1.N
            if (r2 != 0) goto L_0x001f
            goto L_0x00b4
        L_0x001f:
            int r2 = r1.M
            if (r2 <= 0) goto L_0x0033
            boolean r2 = r1.f8972b
            if (r2 == 0) goto L_0x0029
            goto L_0x00ae
        L_0x0029:
            int r2 = r3.getTop()
            int r4 = r1.C
            if (r2 <= r4) goto L_0x00ae
            goto L_0x00ab
        L_0x0033:
            boolean r2 = r1.G
            if (r2 == 0) goto L_0x0054
            android.view.VelocityTracker r2 = r1.U
            if (r2 != 0) goto L_0x003d
            r2 = 0
            goto L_0x004c
        L_0x003d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f8973c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.U
            int r4 = r1.V
            float r2 = r2.getYVelocity(r4)
        L_0x004c:
            boolean r2 = r1.G(r3, r2)
            if (r2 == 0) goto L_0x0054
            r0 = 5
            goto L_0x00ae
        L_0x0054:
            int r2 = r1.M
            if (r2 != 0) goto L_0x0091
            int r2 = r3.getTop()
            boolean r4 = r1.f8972b
            if (r4 == 0) goto L_0x0072
            int r4 = r1.B
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
            goto L_0x00ae
        L_0x0072:
            int r4 = r1.C
            if (r2 >= r4) goto L_0x0081
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto L_0x00ab
            goto L_0x00ae
        L_0x0081:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
            goto L_0x00ab
        L_0x0091:
            boolean r2 = r1.f8972b
            if (r2 == 0) goto L_0x0096
            goto L_0x00ad
        L_0x0096:
            int r2 = r3.getTop()
            int r4 = r1.C
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
        L_0x00ab:
            r0 = 6
            goto L_0x00ae
        L_0x00ad:
            r0 = 4
        L_0x00ae:
            r2 = 0
            r1.H(r3, r0, r2)
            r1.N = r2
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.J;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        v0.d dVar = this.K;
        if (dVar != null && (this.I || i10 == 1)) {
            dVar.p(motionEvent);
        }
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (this.K != null && (this.I || this.J == 1)) {
            z10 = true;
        }
        if (z10 && actionMasked == 2 && !this.L) {
            float abs = Math.abs(((float) this.W) - motionEvent.getY());
            v0.d dVar2 = this.K;
            if (abs > ((float) dVar2.f26328b)) {
                dVar2.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.L;
    }

    public void s(c cVar) {
        if (!this.T.contains(cVar)) {
            this.T.add(cVar);
        }
    }

    public final void t() {
        int u10 = u();
        if (this.f8972b) {
            this.E = Math.max(this.Q - u10, this.B);
        } else {
            this.E = this.Q - u10;
        }
    }

    public final int u() {
        int i10;
        if (this.f8975e) {
            return Math.min(Math.max(this.f8976f, this.Q - ((this.P * 9) / 16)), this.O) + this.f8991u;
        }
        if (this.f8983m || this.f8984n || (i10 = this.f8982l) <= 0) {
            return this.f8974d + this.f8991u;
        }
        return Math.max(this.f8974d, i10 + this.f8977g);
    }

    public void v(int i10) {
        float f10;
        float f11;
        View view = (View) this.R.get();
        if (view != null && !this.T.isEmpty()) {
            int i11 = this.E;
            if (i10 > i11 || i11 == z()) {
                int i12 = this.E;
                f10 = (float) (i12 - i10);
                f11 = (float) (this.Q - i12);
            } else {
                int i13 = this.E;
                f10 = (float) (i13 - i10);
                f11 = (float) (i13 - z());
            }
            float f12 = f10 / f11;
            for (int i14 = 0; i14 < this.T.size(); i14++) {
                this.T.get(i14).b(view, f12);
            }
        }
    }

    public View w(View view) {
        boolean z10;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (Build.VERSION.SDK_INT >= 21) {
            z10 = c0.i.p(view);
        } else {
            z10 = view instanceof m ? ((m) view).isNestedScrollingEnabled() : false;
        }
        if (z10) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View w10 = w(viewGroup.getChildAt(i10));
            if (w10 != null) {
                return w10;
            }
        }
        return null;
    }

    public final int y(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public int z() {
        if (this.f8972b) {
            return this.B;
        }
        return Math.max(this.A, this.f8987q ? 0 : this.f8992v);
    }

    public static class d extends u0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f9001c;

        /* renamed from: d  reason: collision with root package name */
        public int f9002d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9003e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9004f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9005g;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            public Object[] newArray(int i10) {
                return new d[i10];
            }

            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9001c = parcel.readInt();
            this.f9002d = parcel.readInt();
            boolean z10 = false;
            this.f9003e = parcel.readInt() == 1;
            this.f9004f = parcel.readInt() == 1;
            this.f9005g = parcel.readInt() == 1 ? true : z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f25915a, i10);
            parcel.writeInt(this.f9001c);
            parcel.writeInt(this.f9002d);
            parcel.writeInt(this.f9003e ? 1 : 0);
            parcel.writeInt(this.f9004f ? 1 : 0);
            parcel.writeInt(this.f9005g ? 1 : 0);
        }

        public d(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f9001c = bottomSheetBehavior.J;
            this.f9002d = bottomSheetBehavior.f8974d;
            this.f9003e = bottomSheetBehavior.f8972b;
            this.f9004f = bottomSheetBehavior.G;
            this.f9005g = bottomSheetBehavior.H;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f8977g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.f25838e);
        int i11 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f8979i = p9.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.f8993w = i.c(context, attributeSet, R.attr.bottomSheetStyle, 2132083555).a();
        }
        if (this.f8993w != null) {
            f fVar = new f(this.f8993w);
            this.f8978h = fVar;
            fVar.f25079a.f25099b = new i9.a(context);
            fVar.z();
            ColorStateList colorStateList = this.f8979i;
            if (colorStateList != null) {
                this.f8978h.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f8978h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f8996z = ofFloat;
        ofFloat.setDuration(500);
        this.f8996z.addUpdateListener(new z8.a(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.F = obtainStyledAttributes.getDimension(2, -1.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f8980j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f8981k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            D(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            D(i10);
        }
        C(obtainStyledAttributes.getBoolean(8, false));
        this.f8983m = obtainStyledAttributes.getBoolean(12, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f8972b != z10) {
            this.f8972b = z10;
            if (this.R != null) {
                t();
            }
            F((!this.f8972b || this.J != 6) ? this.J : i11);
            I();
        }
        this.H = obtainStyledAttributes.getBoolean(11, false);
        this.I = obtainStyledAttributes.getBoolean(4, true);
        this.f8970a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.D = f10;
        if (this.R != null) {
            this.C = (int) ((1.0f - f10) * ((float) this.Q));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.A = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i12 = peekValue2.data;
            if (i12 >= 0) {
                this.A = i12;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f8984n = obtainStyledAttributes.getBoolean(16, false);
        this.f8985o = obtainStyledAttributes.getBoolean(17, false);
        this.f8986p = obtainStyledAttributes.getBoolean(18, false);
        this.f8987q = obtainStyledAttributes.getBoolean(19, true);
        this.f8988r = obtainStyledAttributes.getBoolean(13, false);
        this.f8989s = obtainStyledAttributes.getBoolean(14, false);
        this.f8990t = obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.recycle();
        this.f8973c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
