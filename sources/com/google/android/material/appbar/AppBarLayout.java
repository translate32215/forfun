package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o0.c0;
import o0.m;
import o0.o0;
import p0.c;
import s.i;
import s9.f;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public int f8881a;

    /* renamed from: b  reason: collision with root package name */
    public int f8882b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f8883c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f8884d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8885e;

    /* renamed from: f  reason: collision with root package name */
    public int f8886f = 0;

    /* renamed from: g  reason: collision with root package name */
    public o0 f8887g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8888h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8889i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8890r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8891s;

    /* renamed from: t  reason: collision with root package name */
    public int f8892t;

    /* renamed from: u  reason: collision with root package name */
    public WeakReference<View> f8893u;

    /* renamed from: v  reason: collision with root package name */
    public ValueAnimator f8894v;

    /* renamed from: w  reason: collision with root package name */
    public final List<d> f8895w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public int[] f8896x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f8897y;

    /* renamed from: z  reason: collision with root package name */
    public Behavior f8898z;

    public static class BaseBehavior<T extends AppBarLayout> extends v8.b<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f8899j;

        /* renamed from: k  reason: collision with root package name */
        public int f8900k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f8901l;

        /* renamed from: m  reason: collision with root package name */
        public a f8902m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f8903n;

        public BaseBehavior() {
        }

        public static boolean A(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        public final View B(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof m) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    int i13 = -appBarLayout.getTotalScrollRange();
                    i12 = i13;
                    i11 = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    i11 = 0;
                }
                if (i12 != i11) {
                    iArr[1] = w(coordinatorLayout, appBarLayout, i10, i12, i11);
                }
            }
            if (appBarLayout.f8891s) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        public a D(Parcelable parcelable, T t10) {
            int s10 = s();
            int childCount = t10.getChildCount();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 > 0 || bottom < 0) {
                    i10++;
                } else {
                    if (parcelable == null) {
                        parcelable = u0.a.f25914b;
                    }
                    a aVar = new a(parcelable);
                    boolean z11 = s10 == 0;
                    aVar.f8905d = z11;
                    aVar.f8904c = !z11 && (-s10) >= t10.getTotalScrollRange();
                    aVar.f8906e = i10;
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    if (bottom == t10.getTopInset() + c0.d.d(childAt)) {
                        z10 = true;
                    }
                    aVar.f8908g = z10;
                    aVar.f8907f = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return null;
        }

        public final void E(CoordinatorLayout coordinatorLayout, T t10) {
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int v10 = v() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t10.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (A(cVar.f8911a, 32)) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i11 = -v10;
                if (top <= i11 && bottom >= i11) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i12 = cVar2.f8911a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, String> weakHashMap = c0.f22553a;
                        if (c0.d.b(t10) && c0.d.b(childAt2)) {
                            i13 -= t10.getTopInset();
                        }
                    }
                    if (A(i12, 2)) {
                        WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                        i14 += c0.d.d(childAt2);
                    } else if (A(i12, 5)) {
                        WeakHashMap<View, String> weakHashMap3 = c0.f22553a;
                        int d10 = c0.d.d(childAt2) + i14;
                        if (v10 < d10) {
                            i13 = d10;
                        } else {
                            i14 = d10;
                        }
                    }
                    if (A(i12, 32)) {
                        i13 += cVar2.topMargin;
                        i14 -= cVar2.bottomMargin;
                    }
                    if (v10 < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    z(coordinatorLayout, t10, b8.a.c(i13 + paddingTop, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void F(CoordinatorLayout coordinatorLayout, T t10) {
            c.a aVar = c.a.f23754h;
            c0.x(coordinatorLayout, aVar.a());
            c.a aVar2 = c.a.f23755i;
            c0.x(coordinatorLayout, aVar2.a());
            View B = B(coordinatorLayout);
            if (B != null && t10.getTotalScrollRange() != 0 && (((CoordinatorLayout.f) B.getLayoutParams()).f1353a instanceof ScrollingViewBehavior)) {
                if (v() != (-t10.getTotalScrollRange()) && B.canScrollVertically(1)) {
                    c0.z(coordinatorLayout, aVar, (CharSequence) null, new d(this, t10, false));
                }
                if (v() == 0) {
                    return;
                }
                if (B.canScrollVertically(-1)) {
                    int i10 = -t10.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        c0.z(coordinatorLayout, aVar2, (CharSequence) null, new c(this, coordinatorLayout, t10, B, i10));
                        return;
                    }
                    return;
                }
                c0.z(coordinatorLayout, aVar2, (CharSequence) null, new d(this, t10, true));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void G(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                r0 = 1
                if (r4 == 0) goto L_0x005d
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f8911a
                r3 = r1 & 1
                if (r3 == 0) goto L_0x005d
                java.util.WeakHashMap<android.view.View, java.lang.String> r3 = o0.c0.f22553a
                int r3 = o0.c0.d.d(r4)
                if (r10 <= 0) goto L_0x004a
                r10 = r1 & 12
                if (r10 == 0) goto L_0x004a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005d
                goto L_0x005b
            L_0x004a:
                r10 = r1 & 2
                if (r10 == 0) goto L_0x005d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005d
            L_0x005b:
                r9 = 1
                goto L_0x005e
            L_0x005d:
                r9 = 0
            L_0x005e:
                boolean r10 = r8.f8891s
                if (r10 == 0) goto L_0x006a
                android.view.View r9 = r6.B(r7)
                boolean r9 = r8.e(r9)
            L_0x006a:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto L_0x009c
                if (r9 == 0) goto L_0x009f
                java.util.List r7 = r7.e(r8)
                int r9 = r7.size()
                r10 = 0
            L_0x007b:
                if (r10 >= r9) goto L_0x009a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1353a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x0097
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f26623f
                if (r7 == 0) goto L_0x009a
                r2 = 1
                goto L_0x009a
            L_0x0097:
                int r10 = r10 + 1
                goto L_0x007b
            L_0x009a:
                if (r2 == 0) goto L_0x009f
            L_0x009c:
                r8.jumpDrawablesToCurrentState()
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            a aVar = this.f8902m;
            if (aVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i12 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            z(coordinatorLayout, appBarLayout, i12, 0.0f);
                        } else {
                            x(coordinatorLayout, appBarLayout, i12);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            x(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (aVar.f8904c) {
                x(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (aVar.f8905d) {
                x(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(aVar.f8906e);
                int i13 = -childAt.getBottom();
                if (this.f8902m.f8908g) {
                    i11 = appBarLayout.getTopInset() + c0.d.d(childAt) + i13;
                } else {
                    i11 = Math.round(((float) childAt.getHeight()) * this.f8902m.f8907f) + i13;
                }
                x(coordinatorLayout, appBarLayout, i11);
            }
            appBarLayout.f8886f = 0;
            this.f8902m = null;
            u(b8.a.c(s(), -appBarLayout.getTotalScrollRange(), 0));
            G(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f8881a = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                c0.d.k(appBarLayout);
            }
            F(coordinatorLayout, appBarLayout);
            return true;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        public /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            C(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i13 < 0) {
                iArr[1] = w(coordinatorLayout, appBarLayout, i13, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                F(coordinatorLayout, appBarLayout);
            }
        }

        public void n(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof a) {
                this.f8902m = (a) parcelable;
            } else {
                this.f8902m = null;
            }
        }

        public Parcelable o(CoordinatorLayout coordinatorLayout, View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            a D = D(absSavedState, (AppBarLayout) view);
            return D == null ? absSavedState : D;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f8891s
                if (r5 != 0) goto L_0x002d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = 1
                goto L_0x0015
            L_0x0014:
                r5 = 0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = 1
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r6 = 0
            L_0x002d:
                if (r6 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.f8901l
                if (r2 == 0) goto L_0x0036
                r2.cancel()
            L_0x0036:
                r2 = 0
                r1.f8903n = r2
                r1.f8900k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f8900k == 0 || i10 == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.f8891s) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.f8903n = new WeakReference<>(view2);
        }

        public int v() {
            return s() + this.f8899j;
        }

        public int y(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int i13;
            List list;
            int i14;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            int i15 = i11;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int v10 = v();
            int i16 = 0;
            if (i15 == 0 || v10 < i15 || v10 > i12) {
                this.f8899j = 0;
            } else {
                int c10 = b8.a.c(i10, i11, i12);
                if (v10 != c10) {
                    if (appBarLayout.f8885e) {
                        int abs = Math.abs(c10);
                        int childCount = appBarLayout.getChildCount();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i17);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f8913c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i17++;
                            } else if (interpolator != null) {
                                int i18 = cVar.f8911a;
                                if ((i18 & 1) != 0) {
                                    i14 = childAt.getHeight() + cVar.topMargin + cVar.bottomMargin + 0;
                                    if ((i18 & 2) != 0) {
                                        WeakHashMap<View, String> weakHashMap = c0.f22553a;
                                        i14 -= c0.d.d(childAt);
                                    }
                                } else {
                                    i14 = 0;
                                }
                                WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                                if (c0.d.b(childAt)) {
                                    i14 -= appBarLayout.getTopInset();
                                }
                                if (i14 > 0) {
                                    float f10 = (float) i14;
                                    i13 = (childAt.getTop() + Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f10) * f10)) * Integer.signum(c10);
                                }
                            }
                        }
                    }
                    i13 = c10;
                    boolean u10 = u(i13);
                    int i19 = v10 - c10;
                    this.f8899j = c10 - i13;
                    if (u10) {
                        for (int i20 = 0; i20 < appBarLayout.getChildCount(); i20++) {
                            c cVar2 = (c) appBarLayout.getChildAt(i20).getLayoutParams();
                            a aVar = cVar2.f8912b;
                            if (!(aVar == null || (cVar2.f8911a & 1) == 0)) {
                                View childAt2 = appBarLayout.getChildAt(i20);
                                b bVar = (b) aVar;
                                Rect rect = bVar.f8909a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((float) bVar.f8909a.top) - Math.abs((float) s());
                                float f11 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / ((float) bVar.f8909a.height()));
                                    if (abs3 >= 0.0f) {
                                        f11 = abs3 > 1.0f ? 1.0f : abs3;
                                    }
                                    float f12 = 1.0f - f11;
                                    float height = (-abs2) - ((((float) bVar.f8909a.height()) * 0.3f) * (1.0f - (f12 * f12)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(bVar.f8910b);
                                    bVar.f8910b.offset(0, (int) (-height));
                                    c0.G(childAt2, bVar.f8910b);
                                } else {
                                    c0.G(childAt2, (Rect) null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!u10 && appBarLayout.f8885e && (list = (List) ((i) coordinatorLayout2.f1334b.f23741b).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                        while (i16 < list.size()) {
                            View view2 = (View) list.get(i16);
                            CoordinatorLayout.c cVar3 = ((CoordinatorLayout.f) view2.getLayoutParams()).f1353a;
                            if (cVar3 != null) {
                                cVar3.d(coordinatorLayout2, view2, appBarLayout);
                            }
                            i16++;
                        }
                    }
                    appBarLayout.f8881a = s();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap<View, String> weakHashMap3 = c0.f22553a;
                        c0.d.k(appBarLayout);
                    }
                    G(coordinatorLayout, appBarLayout, c10, c10 < v10 ? -1 : 1, false);
                    i16 = i19;
                }
            }
            F(coordinatorLayout2, appBarLayout);
            return i16;
        }

        public final void z(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int i11;
            int abs = Math.abs(v() - i10);
            float abs2 = Math.abs(f10);
            if (abs2 > 0.0f) {
                i11 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i11 = (int) (((((float) abs) / ((float) t10.getHeight())) + 1.0f) * 150.0f);
            }
            int v10 = v();
            if (v10 == i10) {
                ValueAnimator valueAnimator = this.f8901l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f8901l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f8901l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f8901l = valueAnimator3;
                valueAnimator3.setInterpolator(u8.a.f26152e);
                this.f8901l.addUpdateListener(new b(this, coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f8901l.setDuration((long) Math.min(i11, 600));
            this.f8901l.setIntValues(new int[]{v10, i10});
            this.f8901l.start();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class a extends u0.a {
            public static final Parcelable.Creator<a> CREATOR = new C0091a();

            /* renamed from: c  reason: collision with root package name */
            public boolean f8904c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f8905d;

            /* renamed from: e  reason: collision with root package name */
            public int f8906e;

            /* renamed from: f  reason: collision with root package name */
            public float f8907f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f8908g;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            public class C0091a implements Parcelable.ClassLoaderCreator<a> {
                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                public Object[] newArray(int i10) {
                    return new a[i10];
                }

                public Object createFromParcel(Parcel parcel) {
                    return new a(parcel, (ClassLoader) null);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10 = true;
                this.f8904c = parcel.readByte() != 0;
                this.f8905d = parcel.readByte() != 0;
                this.f8906e = parcel.readInt();
                this.f8907f = parcel.readFloat();
                this.f8908g = parcel.readByte() == 0 ? false : z10;
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f25915a, i10);
                parcel.writeByte(this.f8904c ? (byte) 1 : 0);
                parcel.writeByte(this.f8905d ? (byte) 1 : 0);
                parcel.writeInt(this.f8906e);
                parcel.writeFloat(this.f8907f);
                parcel.writeByte(this.f8908g ? (byte) 1 : 0);
            }

            public a(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends v8.c {
        public ScrollingViewBehavior() {
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1353a;
            if (cVar instanceof BaseBehavior) {
                c0.u(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f8899j) + this.f26622e) - v(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f8891s) {
                return false;
            }
            appBarLayout.d(appBarLayout.e(view));
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                c0.x(coordinatorLayout, c.a.f23754h.a());
                c0.x(coordinatorLayout, c.a.f23755i.a());
            }
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout w10 = w(coordinatorLayout.d(view));
            if (w10 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f26620c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    w10.c(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        public AppBarLayout w(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.F);
            this.f26623f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f8909a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f8910b = new Rect();
    }

    public interface d {
        void a(float f10, int i10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r16, android.util.AttributeSet r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            r2 = 2132083553(0x7f150361, float:1.9807252E38)
            r3 = 2130968637(0x7f04003d, float:1.7545933E38)
            r4 = r16
            android.content.Context r2 = w9.a.a(r4, r0, r3, r2)
            r15.<init>(r2, r0, r3)
            r8 = -1
            r1.f8882b = r8
            r1.f8883c = r8
            r1.f8884d = r8
            r9 = 0
            r1.f8886f = r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f8895w = r2
            android.content.Context r10 = r15.getContext()
            r11 = 1
            r15.setOrientation(r11)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 21
            if (r12 < r13) goto L_0x006d
            android.view.ViewOutlineProvider r2 = r15.getOutlineProvider()
            android.view.ViewOutlineProvider r3 = android.view.ViewOutlineProvider.BACKGROUND
            if (r2 != r3) goto L_0x003e
            android.view.ViewOutlineProvider r2 = android.view.ViewOutlineProvider.BOUNDS
            r15.setOutlineProvider(r2)
        L_0x003e:
            r6 = 2132083553(0x7f150361, float:1.9807252E38)
            android.content.Context r14 = r15.getContext()
            int[] r4 = v8.f.f26631a
            int[] r7 = new int[r9]
            r5 = 2130968637(0x7f04003d, float:1.7545933E38)
            r2 = r14
            r3 = r17
            android.content.res.TypedArray r2 = l9.r.d(r2, r3, r4, r5, r6, r7)
            boolean r3 = r2.hasValue(r9)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0064
            int r3 = r2.getResourceId(r9, r9)     // Catch:{ all -> 0x0068 }
            android.animation.StateListAnimator r3 = android.animation.AnimatorInflater.loadStateListAnimator(r14, r3)     // Catch:{ all -> 0x0068 }
            r15.setStateListAnimator(r3)     // Catch:{ all -> 0x0068 }
        L_0x0064:
            r2.recycle()
            goto L_0x006d
        L_0x0068:
            r0 = move-exception
            r2.recycle()
            throw r0
        L_0x006d:
            int[] r4 = t8.a.f25834a
            r6 = 2132083553(0x7f150361, float:1.9807252E38)
            int[] r7 = new int[r9]
            r5 = 2130968637(0x7f04003d, float:1.7545933E38)
            r2 = r10
            r3 = r17
            android.content.res.TypedArray r0 = l9.r.d(r2, r3, r4, r5, r6, r7)
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r9)
            java.util.WeakHashMap<android.view.View, java.lang.String> r3 = o0.c0.f22553a
            o0.c0.d.q(r15, r2)
            android.graphics.drawable.Drawable r2 = r15.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x00b4
            android.graphics.drawable.Drawable r2 = r15.getBackground()
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            s9.f r3 = new s9.f
            r3.<init>()
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r3.r(r2)
            s9.f$b r2 = r3.f25079a
            i9.a r4 = new i9.a
            r4.<init>(r10)
            r2.f25099b = r4
            r3.z()
            o0.c0.d.q(r15, r3)
        L_0x00b4:
            r2 = 4
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00c2
            boolean r2 = r0.getBoolean(r2, r9)
            r15.c(r2, r9, r9)
        L_0x00c2:
            if (r12 < r13) goto L_0x00d3
            r2 = 3
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00d3
            int r2 = r0.getDimensionPixelSize(r2, r9)
            float r2 = (float) r2
            v8.f.a(r15, r2)
        L_0x00d3:
            r2 = 26
            if (r12 < r2) goto L_0x00f2
            r2 = 2
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L_0x00e5
            boolean r2 = r0.getBoolean(r2, r9)
            r15.setKeyboardNavigationCluster(r2)
        L_0x00e5:
            boolean r2 = r0.hasValue(r11)
            if (r2 == 0) goto L_0x00f2
            boolean r2 = r0.getBoolean(r11, r9)
            r15.setTouchscreenBlocksFocus(r2)
        L_0x00f2:
            r2 = 5
            boolean r2 = r0.getBoolean(r2, r9)
            r1.f8891s = r2
            r2 = 6
            int r2 = r0.getResourceId(r2, r8)
            r1.f8892t = r2
            r2 = 7
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r15.setStatusBarForeground(r2)
            r0.recycle()
            v8.a r0 = new v8.a
            r0.<init>(r15)
            o0.c0.J(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new c((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public final void b() {
        Behavior behavior = this.f8898z;
        BaseBehavior.a D = (behavior == null || this.f8882b == -1 || this.f8886f != 0) ? null : behavior.D(u0.a.f25914b, this);
        this.f8882b = -1;
        this.f8883c = -1;
        this.f8884d = -1;
        if (D != null) {
            Behavior behavior2 = this.f8898z;
            if (behavior2.f8902m == null) {
                behavior2.f8902m = D;
            }
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i10 = 0;
        int i11 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i10 = 8;
        }
        this.f8886f = i11 | i10;
        requestLayout();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean d(boolean z10) {
        if (!(!this.f8888h) || this.f8890r == z10) {
            return false;
        }
        this.f8890r = z10;
        refreshDrawableState();
        if (!this.f8891s || !(getBackground() instanceof f)) {
            return true;
        }
        f fVar = (f) getBackground();
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f8894v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, dimension});
        this.f8894v = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.f8894v.setInterpolator(u8.a.f26148a);
        this.f8894v.addUpdateListener(new a(this, fVar));
        this.f8894v.start();
        return true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8897y != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f8881a));
            this.f8897y.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8897y;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f8893u
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0031
            int r0 = r4.f8892t
            if (r0 == r2) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.f8892t
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.f8893u = r3
        L_0x0031:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f8893u
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.canScrollVertically(r2)
            if (r0 != 0) goto L_0x004e
            int r5 = r5.getScrollY()
            if (r5 <= 0) goto L_0x0050
        L_0x004e:
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.e(android.view.View):boolean");
    }

    public final boolean f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (!c0.d.b(childAt)) {
            return true;
        }
        return false;
    }

    public final void g() {
        setWillNotDraw(!(this.f8897y != null && getTopInset() > 0));
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f8898z = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i10;
        int i11 = this.f8883c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = cVar.f8911a;
            if ((i13 & 5) == 5) {
                int i14 = cVar.topMargin + cVar.bottomMargin;
                if ((i13 & 8) != 0) {
                    WeakHashMap<View, String> weakHashMap = c0.f22553a;
                    i10 = i14 + c0.d.d(childAt);
                } else if ((i13 & 2) != 0) {
                    WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                    i10 = i14 + (measuredHeight - c0.d.d(childAt));
                } else {
                    i10 = i14 + measuredHeight;
                }
                if (childCount == 0) {
                    WeakHashMap<View, String> weakHashMap3 = c0.f22553a;
                    if (c0.d.b(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                }
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.f8883c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f8884d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = cVar.topMargin + cVar.bottomMargin + childAt.getMeasuredHeight();
            int i13 = cVar.f8911a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                i12 -= c0.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f8884d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f8892t;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        int d10 = c0.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            d10 = childCount >= 1 ? c0.d.d(getChildAt(childCount - 1)) : 0;
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f8886f;
    }

    public Drawable getStatusBarForeground() {
        return this.f8897y;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        o0 o0Var = this.f8887g;
        if (o0Var != null) {
            return o0Var.f();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f8882b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = cVar.f8911a;
            if ((i13 & 1) == 0) {
                break;
            }
            int i14 = measuredHeight + cVar.topMargin + cVar.bottomMargin + i12;
            if (i11 == 0) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                if (c0.d.b(childAt)) {
                    i14 -= getTopInset();
                }
            }
            i12 = i14;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
                i12 -= c0.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f8882b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f) {
            q.d.d(this, (f) background);
        }
    }

    public int[] onCreateDrawableState(int i10) {
        if (this.f8896x == null) {
            this.f8896x = new int[4];
        }
        int[] iArr = this.f8896x;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f8889i;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969734;
        iArr[1] = (!z10 || !this.f8890r) ? -2130969735 : R.attr.state_lifted;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969732;
        iArr[3] = (!z10 || !this.f8890r) ? -2130969731 : R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f8893u;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8893u = null;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        boolean z12 = true;
        if (c0.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                c0.u(getChildAt(childCount), topInset);
            }
        }
        b();
        this.f8885e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((c) getChildAt(i14).getLayoutParams()).f8913c != null) {
                this.f8885e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f8897y;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f8888h) {
            if (!this.f8891s) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= childCount3) {
                        z11 = false;
                        break;
                    }
                    int i16 = ((c) getChildAt(i15).getLayoutParams()).f8911a;
                    if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                        z11 = true;
                        break;
                    }
                    i15++;
                }
                if (!z11) {
                    z12 = false;
                }
            }
            if (this.f8889i != z12) {
                this.f8889i = z12;
                refreshDrawableState();
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (c0.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = b8.a.c(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        q.d.c(this, f10);
    }

    public void setExpanded(boolean z10) {
        c(z10, c0.r(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f8891s = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f8892t = i10;
        WeakReference<View> weakReference = this.f8893u;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8893u = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f8888h = z10;
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f8897y;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f8897y = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f8897y.setState(getDrawableState());
                }
                Drawable drawable4 = this.f8897y;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                androidx.core.graphics.drawable.a.j(drawable4, c0.e.d(this));
                this.f8897y.setVisible(getVisibility() == 0, false);
                this.f8897y.setCallback(this);
            }
            g();
            WeakHashMap<View, String> weakHashMap2 = c0.f22553a;
            c0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(g.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            v8.f.a(this, f10);
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f8897y;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8897y;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m16generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m17generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f8911a = 1;

        /* renamed from: b  reason: collision with root package name */
        public a f8912b;

        /* renamed from: c  reason: collision with root package name */
        public Interpolator f8913c;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            b bVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.f25835b);
            this.f8911a = obtainStyledAttributes.getInt(1, 0);
            if (obtainStyledAttributes.getInt(0, 0) != 1) {
                bVar = null;
            } else {
                bVar = new b();
            }
            this.f8912b = bVar;
            if (obtainStyledAttributes.hasValue(2)) {
                this.f8913c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
