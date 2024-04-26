package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import k.f;

/* compiled from: ForwardingListener */
public abstract class n0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f1026a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1027b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1028c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1029d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f1030e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f1031f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1032g;

    /* renamed from: h  reason: collision with root package name */
    public int f1033h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f1034i = new int[2];

    /* compiled from: ForwardingListener */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ViewParent parent = n0.this.f1029d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            n0 n0Var = n0.this;
            n0Var.a();
            View view = n0Var.f1029d;
            if (view.isEnabled() && !view.isLongClickable() && n0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                n0Var.f1032g = true;
            }
        }
    }

    public n0(View view) {
        this.f1029d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1026a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1027b = tapTimeout;
        this.f1028c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.f1031f;
        if (runnable != null) {
            this.f1029d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1030e;
        if (runnable2 != null) {
            this.f1029d.removeCallbacks(runnable2);
        }
    }

    public abstract f b();

    public abstract boolean c();

    public boolean d() {
        f b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r4 != 3) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f1032g
            r0 = 3
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L_0x0071
            android.view.View r3 = r11.f1029d
            k.f r4 = r11.b()
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.b()
            if (r5 != 0) goto L_0x0016
            goto L_0x0061
        L_0x0016:
            android.widget.ListView r4 = r4.f()
            androidx.appcompat.widget.l0 r4 = (androidx.appcompat.widget.l0) r4
            if (r4 == 0) goto L_0x0061
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L_0x0025
            goto L_0x0061
        L_0x0025:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f1034i
            r3.getLocationOnScreen(r6)
            r3 = r6[r1]
            float r3 = (float) r3
            r6 = r6[r2]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f1034i
            r4.getLocationOnScreen(r3)
            r6 = r3[r1]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r2]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f1033h
            boolean r3 = r4.b(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 == r2) goto L_0x005a
            if (r13 == r0) goto L_0x005a
            r13 = 1
            goto L_0x005b
        L_0x005a:
            r13 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x0061
            r13 = 1
            goto L_0x0062
        L_0x0061:
            r13 = 0
        L_0x0062:
            if (r13 != 0) goto L_0x006e
            boolean r13 = r11.d()
            if (r13 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r13 = 0
            goto L_0x0128
        L_0x006e:
            r13 = 1
            goto L_0x0128
        L_0x0071:
            android.view.View r3 = r11.f1029d
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x007c
        L_0x0079:
            r13 = 0
            goto L_0x0106
        L_0x007c:
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d8
            if (r4 == r2) goto L_0x00d4
            r5 = 2
            if (r4 == r5) goto L_0x008a
            if (r4 == r0) goto L_0x00d4
            goto L_0x0079
        L_0x008a:
            int r0 = r11.f1033h
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0079
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f1026a
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00c5
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00c5
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c5
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c5
            r13 = 1
            goto L_0x00c6
        L_0x00c5:
            r13 = 0
        L_0x00c6:
            if (r13 != 0) goto L_0x0079
            r11.a()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r2)
            r13 = 1
            goto L_0x0106
        L_0x00d4:
            r11.a()
            goto L_0x0079
        L_0x00d8:
            int r13 = r13.getPointerId(r1)
            r11.f1033h = r13
            java.lang.Runnable r13 = r11.f1030e
            if (r13 != 0) goto L_0x00e9
            androidx.appcompat.widget.n0$a r13 = new androidx.appcompat.widget.n0$a
            r13.<init>()
            r11.f1030e = r13
        L_0x00e9:
            java.lang.Runnable r13 = r11.f1030e
            int r0 = r11.f1027b
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.f1031f
            if (r13 != 0) goto L_0x00fc
            androidx.appcompat.widget.n0$b r13 = new androidx.appcompat.widget.n0$b
            r13.<init>()
            r11.f1031f = r13
        L_0x00fc:
            java.lang.Runnable r13 = r11.f1031f
            int r0 = r11.f1028c
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            goto L_0x0079
        L_0x0106:
            if (r13 == 0) goto L_0x0110
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x0110
            r13 = 1
            goto L_0x0111
        L_0x0110:
            r13 = 0
        L_0x0111:
            if (r13 == 0) goto L_0x0128
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f1029d
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x0128:
            r11.f1032g = r13
            if (r13 != 0) goto L_0x012e
            if (r12 == 0) goto L_0x012f
        L_0x012e:
            r1 = 1
        L_0x012f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1032g = false;
        this.f1033h = -1;
        Runnable runnable = this.f1030e;
        if (runnable != null) {
            this.f1029d.removeCallbacks(runnable);
        }
    }
}
