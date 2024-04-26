package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import b2.j;

/* compiled from: Visibility */
public abstract class h0 extends j {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public int F = 3;

    /* compiled from: Visibility */
    public static class a extends AnimatorListenerAdapter implements j.d, a {

        /* renamed from: a  reason: collision with root package name */
        public final View f3389a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3390b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f3391c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3392d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3393e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3394f = false;

        public a(View view, int i10, boolean z10) {
            this.f3389a = view;
            this.f3390b = i10;
            this.f3391c = (ViewGroup) view.getParent();
            this.f3392d = z10;
            g(true);
        }

        public void a(j jVar) {
        }

        public void b(j jVar) {
        }

        public void c(j jVar) {
            g(false);
        }

        public void d(j jVar) {
            g(true);
        }

        public void e(j jVar) {
            f();
            jVar.x(this);
        }

        public final void f() {
            if (!this.f3394f) {
                z.f3458a.f(this.f3389a, this.f3390b);
                ViewGroup viewGroup = this.f3391c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z10) {
            ViewGroup viewGroup;
            if (this.f3392d && this.f3393e != z10 && (viewGroup = this.f3391c) != null) {
                this.f3393e = z10;
                v.b(viewGroup, z10);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f3394f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f3394f) {
                z.f3458a.f(this.f3389a, this.f3390b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f3394f) {
                z.f3458a.f(this.f3389a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3395a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3396b;

        /* renamed from: c  reason: collision with root package name */
        public int f3397c;

        /* renamed from: d  reason: collision with root package name */
        public int f3398d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f3399e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f3400f;
    }

    public final void K(r rVar) {
        rVar.f3441a.put("android:visibility:visibility", Integer.valueOf(rVar.f3442b.getVisibility()));
        rVar.f3441a.put("android:visibility:parent", rVar.f3442b.getParent());
        int[] iArr = new int[2];
        rVar.f3442b.getLocationOnScreen(iArr);
        rVar.f3441a.put("android:visibility:screenLocation", iArr);
    }

    public final b L(r rVar, r rVar2) {
        b bVar = new b();
        bVar.f3395a = false;
        bVar.f3396b = false;
        if (rVar == null || !rVar.f3441a.containsKey("android:visibility:visibility")) {
            bVar.f3397c = -1;
            bVar.f3399e = null;
        } else {
            bVar.f3397c = ((Integer) rVar.f3441a.get("android:visibility:visibility")).intValue();
            bVar.f3399e = (ViewGroup) rVar.f3441a.get("android:visibility:parent");
        }
        if (rVar2 == null || !rVar2.f3441a.containsKey("android:visibility:visibility")) {
            bVar.f3398d = -1;
            bVar.f3400f = null;
        } else {
            bVar.f3398d = ((Integer) rVar2.f3441a.get("android:visibility:visibility")).intValue();
            bVar.f3400f = (ViewGroup) rVar2.f3441a.get("android:visibility:parent");
        }
        if (rVar != null && rVar2 != null) {
            int i10 = bVar.f3397c;
            int i11 = bVar.f3398d;
            if (i10 == i11 && bVar.f3399e == bVar.f3400f) {
                return bVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    bVar.f3396b = false;
                    bVar.f3395a = true;
                } else if (i11 == 0) {
                    bVar.f3396b = true;
                    bVar.f3395a = true;
                }
            } else if (bVar.f3400f == null) {
                bVar.f3396b = false;
                bVar.f3395a = true;
            } else if (bVar.f3399e == null) {
                bVar.f3396b = true;
                bVar.f3395a = true;
            }
        } else if (rVar == null && bVar.f3398d == 0) {
            bVar.f3396b = true;
            bVar.f3395a = true;
        } else if (rVar2 == null && bVar.f3397c == 0) {
            bVar.f3396b = false;
            bVar.f3395a = true;
        }
        return bVar;
    }

    public abstract Animator O(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public void d(r rVar) {
        K(rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: android.widget.ImageView} */
    /* JADX WARNING: type inference failed for: r16v7, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (L(o(r1, false), r(r1, false)).f3395a != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r2 = (java.lang.Float) r2.f3441a.get("android:fade:transitionAlpha");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator l(android.view.ViewGroup r22, b2.r r23, b2.r r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            b2.h0$b r4 = r0.L(r2, r3)
            boolean r5 = r4.f3395a
            if (r5 == 0) goto L_0x02b3
            android.view.ViewGroup r5 = r4.f3399e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f3400f
            if (r5 == 0) goto L_0x02b3
        L_0x0018:
            boolean r5 = r4.f3396b
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L_0x006a
            int r1 = r0.F
            r1 = r1 & r9
            if (r1 != r9) goto L_0x0068
            if (r3 != 0) goto L_0x0029
            goto L_0x0068
        L_0x0029:
            if (r2 != 0) goto L_0x0044
            android.view.View r1 = r3.f3442b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            b2.r r4 = r0.o(r1, r10)
            b2.r r1 = r0.r(r1, r10)
            b2.h0$b r1 = r0.L(r4, r1)
            boolean r1 = r1.f3395a
            if (r1 == 0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            android.view.View r1 = r3.f3442b
            r3 = r0
            b2.d r3 = (b2.d) r3
            if (r2 == 0) goto L_0x005c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f3441a
            java.lang.String r4 = "android:fade:transitionAlpha"
            java.lang.Object r2 = r2.get(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x005c
            float r2 = r2.floatValue()
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r8 = r2
        L_0x0063:
            android.animation.Animator r6 = r3.P(r1, r8, r7)
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            return r6
        L_0x006a:
            int r4 = r4.f3398d
            int r5 = r0.F
            r11 = 2
            r5 = r5 & r11
            if (r5 == r11) goto L_0x0076
        L_0x0072:
            r2 = r0
        L_0x0073:
            r6 = 0
            goto L_0x02b2
        L_0x0076:
            if (r2 != 0) goto L_0x0079
            goto L_0x0072
        L_0x0079:
            android.view.View r5 = r2.f3442b
            if (r3 == 0) goto L_0x0080
            android.view.View r12 = r3.f3442b
            goto L_0x0081
        L_0x0080:
            r12 = 0
        L_0x0081:
            r13 = 2131427975(0x7f0b0287, float:1.8477581E38)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0091
            r19 = r4
            r12 = 0
            goto L_0x0223
        L_0x0091:
            if (r12 == 0) goto L_0x00a2
            android.view.ViewParent r14 = r12.getParent()
            if (r14 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            r14 = 4
            if (r4 != r14) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            if (r5 != r12) goto L_0x00a8
        L_0x00a0:
            r14 = 0
            goto L_0x00a6
        L_0x00a2:
            if (r12 == 0) goto L_0x00a8
            r14 = r12
            r12 = 0
        L_0x00a6:
            r15 = 0
            goto L_0x00ab
        L_0x00a8:
            r12 = 0
            r14 = 0
            r15 = 1
        L_0x00ab:
            if (r15 == 0) goto L_0x021b
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto L_0x00b9
            r19 = r4
            r14 = r5
        L_0x00b6:
            r9 = 0
            goto L_0x0223
        L_0x00b9:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x021b
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            b2.r r6 = r0.r(r15, r9)
            b2.r r13 = r0.o(r15, r9)
            b2.h0$b r6 = r0.L(r6, r13)
            boolean r6 = r6.f3395a
            if (r6 != 0) goto L_0x0206
            boolean r6 = b2.q.f3438a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            b2.f0 r13 = b2.z.f3458a
            r13.g(r5, r6)
            r13.h(r1, r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r8, r8, r14, r15)
            r6.mapRect(r13)
            float r8 = r13.left
            int r8 = java.lang.Math.round(r8)
            float r14 = r13.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.right
            int r15 = java.lang.Math.round(r15)
            float r11 = r13.bottom
            int r11 = java.lang.Math.round(r11)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r7 = r5.getContext()
            r10.<init>(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r7)
            boolean r7 = b2.q.f3438a
            if (r7 == 0) goto L_0x013e
            boolean r7 = r5.isAttachedToWindow()
            r7 = r7 ^ r9
            if (r1 != 0) goto L_0x0139
            goto L_0x013f
        L_0x0139:
            boolean r16 = r22.isAttachedToWindow()
            goto L_0x0141
        L_0x013e:
            r7 = 0
        L_0x013f:
            r16 = 0
        L_0x0141:
            boolean r17 = b2.q.f3439b
            if (r17 == 0) goto L_0x016e
            if (r7 == 0) goto L_0x016e
            if (r16 != 0) goto L_0x0150
            r19 = r4
            r16 = r12
            r0 = 0
            goto L_0x01eb
        L_0x0150:
            android.view.ViewParent r16 = r5.getParent()
            r9 = r16
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r16 = r9.indexOfChild(r5)
            r18 = r9
            android.view.ViewGroupOverlay r9 = r22.getOverlay()
            r9.add(r5)
            r9 = r18
            r20 = r16
            r16 = r12
            r12 = r20
            goto L_0x0172
        L_0x016e:
            r16 = r12
            r9 = 0
            r12 = 0
        L_0x0172:
            float r18 = r13.width()
            r19 = r4
            int r4 = java.lang.Math.round(r18)
            float r18 = r13.height()
            int r0 = java.lang.Math.round(r18)
            if (r4 <= 0) goto L_0x01dc
            if (r0 <= 0) goto L_0x01dc
            r18 = 1233125376(0x49800000, float:1048576.0)
            int r3 = r4 * r0
            float r3 = (float) r3
            float r3 = r18 / r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = (float) r4
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float r4 = r13.left
            float r4 = -r4
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r4, r13)
            r6.postScale(r2, r2)
            boolean r2 = b2.q.f3440c
            if (r2 == 0) goto L_0x01ca
            android.graphics.Picture r2 = new android.graphics.Picture
            r2.<init>()
            android.graphics.Canvas r0 = r2.beginRecording(r3, r0)
            r0.concat(r6)
            r5.draw(r0)
            r2.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2)
            goto L_0x01dd
        L_0x01ca:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r0, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r6)
            r5.draw(r2)
            goto L_0x01dd
        L_0x01dc:
            r0 = 0
        L_0x01dd:
            if (r17 == 0) goto L_0x01eb
            if (r7 == 0) goto L_0x01eb
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.remove(r5)
            r9.addView(r5, r12)
        L_0x01eb:
            if (r0 == 0) goto L_0x01f0
            r10.setImageBitmap(r0)
        L_0x01f0:
            int r0 = r15 - r8
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r11 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r0, r2)
            r10.layout(r8, r14, r15, r11)
            r14 = r10
            goto L_0x021f
        L_0x0206:
            r19 = r4
            r16 = r12
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x021f
            r2 = -1
            if (r0 == r2) goto L_0x021f
            r1.findViewById(r0)
            goto L_0x021f
        L_0x021b:
            r19 = r4
            r16 = r12
        L_0x021f:
            r12 = r16
            goto L_0x00b6
        L_0x0223:
            if (r14 == 0) goto L_0x027f
            r0 = r23
            if (r9 != 0) goto L_0x025c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f3441a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r7 = 2
            int[] r7 = new int[r7]
            r1.getLocationOnScreen(r7)
            r3 = r7[r3]
            int r4 = r4 - r3
            int r3 = r14.getLeft()
            int r4 = r4 - r3
            r14.offsetLeftAndRight(r4)
            r3 = r7[r6]
            int r2 = r2 - r3
            int r3 = r14.getTop()
            int r2 = r2 - r3
            r14.offsetTopAndBottom(r2)
            b2.u r2 = b2.v.a(r22)
            r2.b(r14)
        L_0x025c:
            r2 = r21
            r3 = r24
            android.animation.Animator r6 = r2.O(r1, r14, r0, r3)
            if (r9 != 0) goto L_0x02b2
            if (r6 != 0) goto L_0x0270
            b2.u r0 = b2.v.a(r22)
            r0.z(r14)
            goto L_0x02b2
        L_0x0270:
            r0 = 2131427975(0x7f0b0287, float:1.8477581E38)
            r5.setTag(r0, r14)
            b2.g0 r0 = new b2.g0
            r0.<init>(r2, r1, r14, r5)
            r2.a(r0)
            goto L_0x02b2
        L_0x027f:
            r2 = r21
            r0 = r23
            r3 = r24
            if (r12 == 0) goto L_0x0073
            int r4 = r12.getVisibility()
            b2.f0 r5 = b2.z.f3458a
            r6 = 0
            r5.f(r12, r6)
            android.animation.Animator r6 = r2.O(r1, r12, r0, r3)
            if (r6 == 0) goto L_0x02af
            b2.h0$a r0 = new b2.h0$a
            r1 = r19
            r3 = 1
            r0.<init>(r12, r1, r3)
            r6.addListener(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r1 < r3) goto L_0x02ab
            r6.addPauseListener(r0)
        L_0x02ab:
            r2.a(r0)
            goto L_0x02b2
        L_0x02af:
            r5.f(r12, r4)
        L_0x02b2:
            return r6
        L_0x02b3:
            r2 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.h0.l(android.view.ViewGroup, b2.r, b2.r):android.animation.Animator");
    }

    public String[] q() {
        return G;
    }

    public boolean t(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.f3441a.containsKey("android:visibility:visibility") != rVar.f3441a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b L = L(rVar, rVar2);
        if (!L.f3395a) {
            return false;
        }
        if (L.f3397c == 0 || L.f3398d == 0) {
            return true;
        }
        return false;
    }
}
