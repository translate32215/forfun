package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import u8.g;
import u8.h;
import u8.i;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f9605c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f9606d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f9607e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f9608f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public float f9609g;

    /* renamed from: h  reason: collision with root package name */
    public float f9610h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9611a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f9612b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f9613c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z10, View view, View view2) {
            this.f9611a = z10;
            this.f9612b = view;
            this.f9613c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f9611a) {
                this.f9612b.setVisibility(4);
                this.f9613c.setAlpha(1.0f);
                this.f9613c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f9611a) {
                this.f9612b.setVisibility(0);
                this.f9613c.setAlpha(0.0f);
                this.f9613c.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f9614a;

        /* renamed from: b  reason: collision with root package name */
        public i f9615b;
    }

    public FabTransformationBehavior() {
    }

    public final void A(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j10 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j10);
            list.add(createCircularReveal);
        }
    }

    public abstract b B(Context context, boolean z10);

    public final ViewGroup C(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public void c(CoordinatorLayout.f fVar) {
        if (fVar.f1360h == 0) {
            fVar.f1360h = 80;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03f3 A[LOOP:1: B:109:0x03f1->B:110:0x03f3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0387  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet u(android.view.View r30, android.view.View r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            android.content.Context r0 = r31.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r12 = r8.B(r0, r11)
            if (r11 == 0) goto L_0x001e
            float r0 = r30.getTranslationX()
            r8.f9609g = r0
            float r0 = r30.getTranslationY()
            r8.f9610h = r0
        L_0x001e:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r15 = 21
            r7 = 0
            r6 = 1
            r5 = 0
            if (r0 < r15) goto L_0x0066
            float r0 = o0.c0.l(r31)
            float r1 = o0.c0.l(r30)
            float r0 = r0 - r1
            if (r11 == 0) goto L_0x004d
            if (r33 != 0) goto L_0x0042
            float r0 = -r0
            r10.setTranslationZ(r0)
        L_0x0042:
            android.util.Property r0 = android.view.View.TRANSLATION_Z
            float[] r1 = new float[r6]
            r1[r5] = r7
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r0, r1)
            goto L_0x0058
        L_0x004d:
            android.util.Property r1 = android.view.View.TRANSLATION_Z
            float[] r2 = new float[r6]
            float r0 = -r0
            r2[r5] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r1, r2)
        L_0x0058:
            u8.g r1 = r12.f9614a
            java.lang.String r2 = "elevation"
            u8.h r1 = r1.d(r2)
            r1.a(r0)
            r13.add(r0)
        L_0x0066:
            android.graphics.RectF r0 = r8.f9606d
            u8.i r1 = r12.f9615b
            float r1 = r8.w(r9, r10, r1)
            u8.i r2 = r12.f9615b
            float r2 = r8.x(r9, r10, r2)
            android.util.Pair r3 = r8.v(r1, r2, r11, r12)
            java.lang.Object r4 = r3.first
            u8.h r4 = (u8.h) r4
            java.lang.Object r3 = r3.second
            u8.h r3 = (u8.h) r3
            if (r11 == 0) goto L_0x00ca
            if (r33 != 0) goto L_0x008c
            float r15 = -r1
            r10.setTranslationX(r15)
            float r15 = -r2
            r10.setTranslationY(r15)
        L_0x008c:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r17 = r14
            float[] r14 = new float[r6]
            r14[r5] = r7
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r10, r15, r14)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r18 = r14
            float[] r14 = new float[r6]
            r14[r5] = r7
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r10, r15, r14)
            float r1 = -r1
            float r2 = -r2
            float r1 = r8.y(r12, r4, r1, r7)
            float r2 = r8.y(r12, r3, r2, r7)
            android.graphics.Rect r15 = r8.f9605c
            r10.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r7 = r8.f9606d
            r7.set(r15)
            android.graphics.RectF r15 = r8.f9607e
            r8.z(r10, r15)
            r15.offset(r1, r2)
            r15.intersect(r7)
            r0.set(r15)
            r1 = r14
            r14 = r18
            goto L_0x00e2
        L_0x00ca:
            r17 = r14
            android.util.Property r7 = android.view.View.TRANSLATION_X
            float[] r14 = new float[r6]
            float r1 = -r1
            r14[r5] = r1
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r10, r7, r14)
            android.util.Property r1 = android.view.View.TRANSLATION_Y
            float[] r7 = new float[r6]
            float r2 = -r2
            r7[r5] = r2
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r10, r1, r7)
        L_0x00e2:
            r4.a(r14)
            r3.a(r1)
            r13.add(r14)
            r13.add(r1)
            float r1 = r0.width()
            float r0 = r0.height()
            u8.i r2 = r12.f9615b
            float r2 = r8.w(r9, r10, r2)
            u8.i r3 = r12.f9615b
            float r3 = r8.x(r9, r10, r3)
            android.util.Pair r4 = r8.v(r2, r3, r11, r12)
            java.lang.Object r7 = r4.first
            u8.h r7 = (u8.h) r7
            java.lang.Object r4 = r4.second
            u8.h r4 = (u8.h) r4
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r6]
            if (r11 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            float r2 = r8.f9609g
        L_0x0117:
            r15[r5] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r9, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r6]
            if (r11 == 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            float r3 = r8.f9610h
        L_0x0126:
            r15[r5] = r3
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r9, r14, r15)
            r7.a(r2)
            r4.a(r3)
            r13.add(r2)
            r13.add(r3)
            boolean r14 = r10 instanceof e9.e
            if (r14 == 0) goto L_0x0190
            boolean r2 = r9 instanceof android.widget.ImageView
            if (r2 != 0) goto L_0x0141
            goto L_0x0190
        L_0x0141:
            r2 = r10
            e9.e r2 = (e9.e) r2
            r3 = r9
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r3 = r3.getDrawable()
            if (r3 != 0) goto L_0x014e
            goto L_0x0190
        L_0x014e:
            r3.mutate()
            r4 = 255(0xff, float:3.57E-43)
            if (r11 == 0) goto L_0x0165
            if (r33 != 0) goto L_0x015a
            r3.setAlpha(r4)
        L_0x015a:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r4 = u8.d.f26155b
            int[] r7 = new int[r6]
            r7[r5] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofInt(r3, r4, r7)
            goto L_0x016f
        L_0x0165:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r7 = u8.d.f26155b
            int[] r15 = new int[r6]
            r15[r5] = r4
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofInt(r3, r7, r15)
        L_0x016f:
            com.google.android.material.transformation.a r7 = new com.google.android.material.transformation.a
            r7.<init>(r8, r10)
            r4.addUpdateListener(r7)
            u8.g r7 = r12.f9614a
            java.lang.String r15 = "iconFade"
            u8.h r7 = r7.d(r15)
            r7.a(r4)
            r13.add(r4)
            com.google.android.material.transformation.b r4 = new com.google.android.material.transformation.b
            r4.<init>(r8, r2, r3)
            r15 = r17
            r15.add(r4)
            goto L_0x0192
        L_0x0190:
            r15 = r17
        L_0x0192:
            if (r14 != 0) goto L_0x019c
            r25 = r12
            r20 = r14
            r18 = 0
            goto L_0x030d
        L_0x019c:
            r7 = r10
            e9.e r7 = (e9.e) r7
            u8.i r2 = r12.f9615b
            android.graphics.RectF r3 = r8.f9606d
            android.graphics.RectF r4 = r8.f9607e
            r8.z(r9, r3)
            float r5 = r8.f9609g
            float r6 = r8.f9610h
            r3.offset(r5, r6)
            r8.z(r10, r4)
            float r2 = r8.w(r9, r10, r2)
            float r2 = -r2
            r5 = 0
            r4.offset(r2, r5)
            float r2 = r3.centerX()
            float r3 = r4.left
            float r2 = r2 - r3
            u8.i r3 = r12.f9615b
            android.graphics.RectF r4 = r8.f9606d
            android.graphics.RectF r5 = r8.f9607e
            r8.z(r9, r4)
            float r6 = r8.f9609g
            r20 = r14
            float r14 = r8.f9610h
            r4.offset(r6, r14)
            r8.z(r10, r5)
            float r3 = r8.x(r9, r10, r3)
            float r3 = -r3
            r6 = 0
            r5.offset(r6, r3)
            float r3 = r4.centerY()
            float r4 = r5.top
            float r3 = r3 - r4
            r4 = r9
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            android.graphics.Rect r5 = r8.f9605c
            r4.g(r5)
            android.graphics.Rect r4 = r8.f9605c
            int r4 = r4.width()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r14 = r4 / r5
            u8.g r4 = r12.f9614a
            java.lang.String r5 = "expansion"
            u8.h r6 = r4.d(r5)
            if (r11 == 0) goto L_0x027e
            if (r33 != 0) goto L_0x020e
            e9.e$e r4 = new e9.e$e
            r4.<init>(r2, r3, r14)
            r7.setRevealInfo(r4)
        L_0x020e:
            if (r33 == 0) goto L_0x0217
            e9.e$e r4 = r7.getRevealInfo()
            float r4 = r4.f17812c
            r14 = r4
        L_0x0217:
            r5 = 0
            float r4 = androidx.appcompat.widget.p.e(r2, r3, r5, r5)
            float r16 = androidx.appcompat.widget.p.e(r2, r3, r1, r5)
            float r1 = androidx.appcompat.widget.p.e(r2, r3, r1, r0)
            float r0 = androidx.appcompat.widget.p.e(r2, r3, r5, r0)
            int r19 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r19 <= 0) goto L_0x0235
            int r19 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r19 <= 0) goto L_0x0235
            int r19 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r19 <= 0) goto L_0x0235
            goto L_0x0247
        L_0x0235:
            int r4 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0240
            int r4 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0240
            r4 = r16
            goto L_0x0247
        L_0x0240:
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0246
            r4 = r1
            goto L_0x0247
        L_0x0246:
            r4 = r0
        L_0x0247:
            android.animation.Animator r4 = e9.b.a(r7, r2, r3, r4)
            com.google.android.material.transformation.c r0 = new com.google.android.material.transformation.c
            r0.<init>(r8, r7)
            r4.addListener(r0)
            long r0 = r6.f26163a
            int r2 = (int) r2
            int r3 = (int) r3
            r21 = r0
            r0 = r29
            r1 = r31
            r16 = r2
            r19 = r3
            r2 = r21
            r21 = r4
            r4 = r16
            r9 = 0
            r16 = 0
            r5 = r19
            r9 = r6
            r8 = 1
            r6 = r14
            r14 = r7
            r18 = 0
            r7 = r13
            r0.A(r1, r2, r4, r5, r6, r7)
            r25 = r12
            r24 = r14
            r4 = r21
            goto L_0x02fd
        L_0x027e:
            r9 = r6
            r8 = 1
            r18 = 0
            e9.e$e r0 = r7.getRevealInfo()
            float r6 = r0.f17812c
            android.animation.Animator r19 = e9.b.a(r7, r2, r3, r14)
            long r4 = r9.f26163a
            int r2 = (int) r2
            int r3 = (int) r3
            r0 = r29
            r1 = r31
            r21 = r2
            r22 = r3
            r2 = r4
            r4 = r21
            r5 = r22
            r8 = r7
            r7 = r13
            r0.A(r1, r2, r4, r5, r6, r7)
            long r0 = r9.f26163a
            long r2 = r9.f26164b
            u8.g r4 = r12.f9614a
            s.i<java.lang.String, u8.h> r5 = r4.f26161a
            int r5 = r5.f24851c
            r6 = 0
            r27 = r6
            r7 = r12
            r11 = r27
            r6 = 0
        L_0x02b4:
            if (r6 >= r5) goto L_0x02da
            r23 = r5
            s.i<java.lang.String, u8.h> r5 = r4.f26161a
            java.lang.Object r5 = r5.l(r6)
            u8.h r5 = (u8.h) r5
            r25 = r7
            r24 = r8
            long r7 = r5.f26163a
            r26 = r4
            long r4 = r5.f26164b
            long r7 = r7 + r4
            long r11 = java.lang.Math.max(r11, r7)
            int r6 = r6 + 1
            r5 = r23
            r8 = r24
            r7 = r25
            r4 = r26
            goto L_0x02b4
        L_0x02da:
            r25 = r7
            r24 = r8
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r4 < r5) goto L_0x02fb
            long r0 = r0 + r2
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x02fb
            r2 = r21
            r3 = r22
            android.animation.Animator r2 = android.view.ViewAnimationUtils.createCircularReveal(r10, r2, r3, r14, r14)
            r2.setStartDelay(r0)
            long r11 = r11 - r0
            r2.setDuration(r11)
            r13.add(r2)
        L_0x02fb:
            r4 = r19
        L_0x02fd:
            r9.a(r4)
            r13.add(r4)
            e9.a r0 = new e9.a
            r1 = r24
            r0.<init>(r1)
            r15.add(r0)
        L_0x030d:
            if (r20 != 0) goto L_0x0315
            r2 = r32
            r1 = r25
            r4 = 1
            goto L_0x0367
        L_0x0315:
            r0 = r10
            e9.e r0 = (e9.e) r0
            android.content.res.ColorStateList r1 = o0.c0.k(r30)
            if (r1 == 0) goto L_0x032b
            int[] r2 = r30.getDrawableState()
            int r3 = r1.getDefaultColor()
            int r5 = r1.getColorForState(r2, r3)
            goto L_0x032c
        L_0x032b:
            r5 = 0
        L_0x032c:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r5
            r2 = r32
            if (r2 == 0) goto L_0x0346
            if (r33 != 0) goto L_0x0339
            r0.setCircularRevealScrimColor(r5)
        L_0x0339:
            android.util.Property<e9.e, java.lang.Integer> r3 = e9.e.d.f17809a
            r4 = 1
            int[] r5 = new int[r4]
            r6 = 0
            r5[r6] = r1
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r3, r5)
            goto L_0x0352
        L_0x0346:
            r4 = 1
            r6 = 0
            android.util.Property<e9.e, java.lang.Integer> r1 = e9.e.d.f17809a
            int[] r3 = new int[r4]
            r3[r6] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r1, r3)
        L_0x0352:
            u8.b r1 = u8.b.f26153a
            r0.setEvaluator(r1)
            r1 = r25
            u8.g r3 = r1.f9614a
            java.lang.String r5 = "color"
            u8.h r3 = r3.d(r5)
            r3.a(r0)
            r13.add(r0)
        L_0x0367:
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0370
        L_0x036b:
            r3 = r29
        L_0x036d:
            r7 = 0
            goto L_0x03da
        L_0x0370:
            if (r20 == 0) goto L_0x0377
            int r0 = e9.d.f17805a
            if (r0 != 0) goto L_0x0377
            goto L_0x036b
        L_0x0377:
            r0 = 2131427864(0x7f0b0218, float:1.8477356E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 == 0) goto L_0x0387
            r3 = r29
            android.view.ViewGroup r0 = r3.C(r0)
            goto L_0x03a3
        L_0x0387:
            r3 = r29
            boolean r0 = r10 instanceof x9.b
            if (r0 != 0) goto L_0x0397
            boolean r0 = r10 instanceof x9.a
            if (r0 == 0) goto L_0x0392
            goto L_0x0397
        L_0x0392:
            android.view.ViewGroup r0 = r3.C(r10)
            goto L_0x03a3
        L_0x0397:
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = 0
            android.view.View r0 = r0.getChildAt(r5)
            android.view.ViewGroup r0 = r3.C(r0)
        L_0x03a3:
            if (r0 != 0) goto L_0x03a6
            goto L_0x036d
        L_0x03a6:
            if (r2 == 0) goto L_0x03c1
            if (r33 != 0) goto L_0x03b3
            android.util.Property<android.view.ViewGroup, java.lang.Float> r5 = u8.c.f26154a
            java.lang.Float r6 = java.lang.Float.valueOf(r18)
            r5.set(r0, r6)
        L_0x03b3:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r5 = u8.c.f26154a
            float[] r4 = new float[r4]
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r4[r7] = r6
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r5, r4)
            goto L_0x03cc
        L_0x03c1:
            r7 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r5 = u8.c.f26154a
            float[] r4 = new float[r4]
            r4[r7] = r18
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r5, r4)
        L_0x03cc:
            u8.g r1 = r1.f9614a
            java.lang.String r4 = "contentFade"
            u8.h r1 = r1.d(r4)
            r1.a(r0)
            r13.add(r0)
        L_0x03da:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            e.b.b(r0, r13)
            com.google.android.material.transformation.FabTransformationBehavior$a r1 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r30
            r5 = 0
            r1.<init>(r3, r2, r10, r4)
            r0.addListener(r1)
            int r1 = r15.size()
        L_0x03f1:
            if (r5 >= r1) goto L_0x03ff
            java.lang.Object r2 = r15.get(r5)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r5 = r5 + 1
            goto L_0x03f1
        L_0x03ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.u(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final Pair<h, h> v(float f10, float f11, boolean z10, b bVar) {
        h hVar;
        h hVar2;
        if (f10 == 0.0f || f11 == 0.0f) {
            hVar2 = bVar.f9614a.d("translationXLinear");
            hVar = bVar.f9614a.d("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            hVar2 = bVar.f9614a.d("translationXCurveDownwards");
            hVar = bVar.f9614a.d("translationYCurveDownwards");
        } else {
            hVar2 = bVar.f9614a.d("translationXCurveUpwards");
            hVar = bVar.f9614a.d("translationYCurveUpwards");
        }
        return new Pair<>(hVar2, hVar);
    }

    public final float w(View view, View view2, i iVar) {
        RectF rectF = this.f9606d;
        RectF rectF2 = this.f9607e;
        z(view, rectF);
        rectF.offset(this.f9609g, this.f9610h);
        z(view2, rectF2);
        iVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float x(View view, View view2, i iVar) {
        RectF rectF = this.f9606d;
        RectF rectF2 = this.f9607e;
        z(view, rectF);
        rectF.offset(this.f9609g, this.f9610h);
        z(view2, rectF2);
        iVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float y(b bVar, h hVar, float f10, float f11) {
        long j10 = hVar.f26163a;
        long j11 = hVar.f26164b;
        h d10 = bVar.f9614a.d("expansion");
        return u8.a.a(f10, f11, hVar.b().getInterpolation(((float) (((d10.f26163a + d10.f26164b) + 17) - j10)) / ((float) j11)));
    }

    public final void z(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f9608f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
