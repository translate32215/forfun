package v8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import o0.c0;

/* compiled from: HeaderBehavior */
public abstract class b<V extends View> extends d<V> {

    /* renamed from: c  reason: collision with root package name */
    public Runnable f26610c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f26611d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26612e;

    /* renamed from: f  reason: collision with root package name */
    public int f26613f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f26614g;

    /* renamed from: h  reason: collision with root package name */
    public int f26615h = -1;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f26616i;

    /* compiled from: HeaderBehavior */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final CoordinatorLayout f26617a;

        /* renamed from: b  reason: collision with root package name */
        public final V f26618b;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f26617a = coordinatorLayout;
            this.f26618b = v10;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f26618b != null && (overScroller = b.this.f26611d) != null) {
                if (overScroller.computeScrollOffset()) {
                    b bVar = b.this;
                    bVar.x(this.f26617a, this.f26618b, bVar.f26611d.getCurrY());
                    c0.d.m(this.f26618b, this);
                    return;
                }
                b bVar2 = b.this;
                CoordinatorLayout coordinatorLayout = this.f26617a;
                V v10 = this.f26618b;
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) bVar2;
                baseBehavior.getClass();
                AppBarLayout appBarLayout = (AppBarLayout) v10;
                baseBehavior.E(coordinatorLayout, appBarLayout);
                if (appBarLayout.f8891s) {
                    appBarLayout.d(appBarLayout.e(baseBehavior.B(coordinatorLayout)));
                }
            }
        }
    }

    public b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r5 = (android.view.View) r5.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.f26615h
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.f26615h = r0
        L_0x0012:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0040
            boolean r0 = r7.f26612e
            if (r0 == 0) goto L_0x0040
            int r0 = r7.f26613f
            if (r0 != r2) goto L_0x0025
            return r3
        L_0x0025:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r2) goto L_0x002c
            return r3
        L_0x002c:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.f26614g
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.f26615h
            if (r1 <= r5) goto L_0x0040
            r7.f26614g = r0
            return r4
        L_0x0040:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x00a5
            r7.f26613f = r2
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference<android.view.View> r5 = r5.f8903n
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0071
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L_0x0071
            boolean r2 = r5.canScrollVertically(r2)
            if (r2 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r2 = 0
            goto L_0x0074
        L_0x0073:
            r2 = 1
        L_0x0074:
            if (r2 == 0) goto L_0x007e
            boolean r8 = r8.p(r9, r0, r1)
            if (r8 == 0) goto L_0x007e
            r8 = 1
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            r7.f26612e = r8
            if (r8 == 0) goto L_0x00a5
            r7.f26614g = r1
            int r8 = r10.getPointerId(r3)
            r7.f26613f = r8
            android.view.VelocityTracker r8 = r7.f26616i
            if (r8 != 0) goto L_0x0095
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.f26616i = r8
        L_0x0095:
            android.widget.OverScroller r8 = r7.f26611d
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto L_0x00a5
            android.widget.OverScroller r8 = r7.f26611d
            r8.abortAnimation()
            return r4
        L_0x00a5:
            android.view.VelocityTracker r8 = r7.f26616i
            if (r8 == 0) goto L_0x00ac
            r8.addMovement(r10)
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            r20 = this;
            r6 = r20
            r1 = r21
            r2 = r22
            r7 = r23
            int r0 = r23.getActionMasked()
            r8 = 1
            r9 = 0
            r3 = 0
            r4 = -1
            if (r0 == r8) goto L_0x005e
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00d7
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005b
        L_0x001c:
            int r0 = r23.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f26613f = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f26614g = r0
            goto L_0x005b
        L_0x0036:
            int r0 = r6.f26613f
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f26614g
            int r3 = r3 - r0
            r6.f26614g = r0
            r0 = r2
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r4 = -r0
            r5 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r0.w(r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = 0
            goto L_0x00e5
        L_0x005e:
            android.view.VelocityTracker r0 = r6.f26616i
            if (r0 == 0) goto L_0x00d7
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f26616i
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f26616i
            int r5 = r6.f26613f
            float r0 = r0.getYVelocity(r5)
            r5 = r2
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            int r10 = r5.getTotalScrollRange()
            int r10 = -r10
            r19 = 0
            java.lang.Runnable r11 = r6.f26610c
            if (r11 == 0) goto L_0x0087
            r2.removeCallbacks(r11)
            r6.f26610c = r3
        L_0x0087:
            android.widget.OverScroller r11 = r6.f26611d
            if (r11 != 0) goto L_0x0096
            android.widget.OverScroller r11 = new android.widget.OverScroller
            android.content.Context r12 = r22.getContext()
            r11.<init>(r12)
            r6.f26611d = r11
        L_0x0096:
            android.widget.OverScroller r11 = r6.f26611d
            r12 = 0
            int r13 = r20.s()
            r14 = 0
            int r15 = java.lang.Math.round(r0)
            r16 = 0
            r17 = 0
            r18 = r10
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.OverScroller r0 = r6.f26611d
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00c0
            v8.b$a r0 = new v8.b$a
            r0.<init>(r1, r2)
            r6.f26610c = r0
            java.util.WeakHashMap<android.view.View, java.lang.String> r1 = o0.c0.f22553a
            o0.c0.d.m(r2, r0)
            goto L_0x00d5
        L_0x00c0:
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            r0.E(r1, r5)
            boolean r2 = r5.f8891s
            if (r2 == 0) goto L_0x00d5
            android.view.View r0 = r0.B(r1)
            boolean r0 = r5.e(r0)
            r5.d(r0)
        L_0x00d5:
            r0 = 1
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            r6.f26612e = r9
            r6.f26613f = r4
            android.view.VelocityTracker r1 = r6.f26616i
            if (r1 == 0) goto L_0x00e5
            r1.recycle()
            r6.f26616i = r3
        L_0x00e5:
            android.view.VelocityTracker r1 = r6.f26616i
            if (r1 == 0) goto L_0x00ec
            r1.addMovement(r7)
        L_0x00ec:
            boolean r1 = r6.f26612e
            if (r1 != 0) goto L_0x00f4
            if (r0 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r8 = 0
        L_0x00f4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int v();

    public final int w(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return y(coordinatorLayout, v10, v() - i10, i11, i12);
    }

    public int x(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return y(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int y(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12);

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
