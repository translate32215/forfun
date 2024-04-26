package v0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import o0.c0;

/* compiled from: ViewDragHelper */
public class d {

    /* renamed from: x  reason: collision with root package name */
    public static final Interpolator f26326x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f26327a;

    /* renamed from: b  reason: collision with root package name */
    public int f26328b;

    /* renamed from: c  reason: collision with root package name */
    public int f26329c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f26330d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f26331e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f26332f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f26333g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f26334h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f26335i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f26336j;

    /* renamed from: k  reason: collision with root package name */
    public int f26337k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f26338l;

    /* renamed from: m  reason: collision with root package name */
    public float f26339m;

    /* renamed from: n  reason: collision with root package name */
    public float f26340n;

    /* renamed from: o  reason: collision with root package name */
    public int f26341o;

    /* renamed from: p  reason: collision with root package name */
    public final int f26342p;

    /* renamed from: q  reason: collision with root package name */
    public int f26343q;

    /* renamed from: r  reason: collision with root package name */
    public OverScroller f26344r;

    /* renamed from: s  reason: collision with root package name */
    public final c f26345s;

    /* renamed from: t  reason: collision with root package name */
    public View f26346t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f26347u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f26348v;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f26349w = new b();

    /* compiled from: ViewDragHelper */
    public class a implements Interpolator {
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            d.this.u(0);
        }
    }

    /* compiled from: ViewDragHelper */
    public static abstract class c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(int i10, int i11) {
        }

        public void f(int i10, int i11) {
        }

        public void g(View view, int i10) {
        }

        public abstract void h(int i10);

        public abstract void i(View view, int i10, int i11, int i12, int i13);

        public abstract void j(View view, float f10, float f11);

        public abstract boolean k(View view, int i10);
    }

    public d(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar != null) {
            this.f26348v = viewGroup;
            this.f26345s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f26342p = i10;
            this.f26341o = i10;
            this.f26328b = viewConfiguration.getScaledTouchSlop();
            this.f26339m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f26340n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f26344r = new OverScroller(context, f26326x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public static d j(ViewGroup viewGroup, float f10, c cVar) {
        d dVar = new d(viewGroup.getContext(), viewGroup, cVar);
        dVar.f26328b = (int) ((1.0f / f10) * ((float) dVar.f26328b));
        return dVar;
    }

    public void a() {
        this.f26329c = -1;
        float[] fArr = this.f26330d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f26331e, 0.0f);
            Arrays.fill(this.f26332f, 0.0f);
            Arrays.fill(this.f26333g, 0.0f);
            Arrays.fill(this.f26334h, 0);
            Arrays.fill(this.f26335i, 0);
            Arrays.fill(this.f26336j, 0);
            this.f26337k = 0;
        }
        VelocityTracker velocityTracker = this.f26338l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f26338l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f26348v) {
            this.f26346t = view;
            this.f26329c = i10;
            this.f26345s.g(view, i10);
            u(1);
            return;
        }
        StringBuilder a10 = android.support.v4.media.a.a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        a10.append(this.f26348v);
        a10.append(")");
        throw new IllegalArgumentException(a10.toString());
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f26334h[i10] & i11) != i11 || (this.f26343q & i11) == 0 || (this.f26336j[i10] & i11) == i11 || (this.f26335i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f26328b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f26345s.getClass();
        }
        if ((this.f26335i[i10] & i11) != 0 || abs <= ((float) this.f26328b)) {
            return false;
        }
        return true;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f26345s.c(view) > 0;
        boolean z11 = this.f26345s.d(view) > 0;
        if (z10 && z11) {
            float f12 = f11 * f11;
            int i10 = this.f26328b;
            if (f12 + (f10 * f10) > ((float) (i10 * i10))) {
                return true;
            }
            return false;
        } else if (z10) {
            if (Math.abs(f10) > ((float) this.f26328b)) {
                return true;
            }
            return false;
        } else if (!z11 || Math.abs(f11) <= ((float) this.f26328b)) {
            return false;
        } else {
            return true;
        }
    }

    public final float e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        if (abs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    public final int f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        if (abs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    public final void g(int i10) {
        if (this.f26330d != null && n(i10)) {
            this.f26330d[i10] = 0.0f;
            this.f26331e[i10] = 0.0f;
            this.f26332f[i10] = 0.0f;
            this.f26333g[i10] = 0.0f;
            this.f26334h[i10] = 0;
            this.f26335i[i10] = 0;
            this.f26336j[i10] = 0;
            this.f26337k = ((1 << i10) ^ -1) & this.f26337k;
        }
    }

    public final int h(int i10, int i11, int i12) {
        int i13;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f26348v.getWidth();
        float f10 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width)) - 0.5f) * 0.47123894f))) * f10) + f10;
        int abs = Math.abs(i11);
        if (abs > 0) {
            i13 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i13 = (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f);
        }
        return Math.min(i13, 600);
    }

    public boolean i(boolean z10) {
        if (this.f26327a == 2) {
            boolean computeScrollOffset = this.f26344r.computeScrollOffset();
            int currX = this.f26344r.getCurrX();
            int currY = this.f26344r.getCurrY();
            int left = currX - this.f26346t.getLeft();
            int top = currY - this.f26346t.getTop();
            if (left != 0) {
                c0.t(this.f26346t, left);
            }
            if (top != 0) {
                c0.u(this.f26346t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f26345s.i(this.f26346t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f26344r.getFinalX() && currY == this.f26344r.getFinalY()) {
                this.f26344r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f26348v.post(this.f26349w);
                } else {
                    u(0);
                }
            }
        }
        if (this.f26327a == 2) {
            return true;
        }
        return false;
    }

    public final void k(float f10, float f11) {
        this.f26347u = true;
        this.f26345s.j(this.f26346t, f10, f11);
        this.f26347u = false;
        if (this.f26327a == 1) {
            u(0);
        }
    }

    public View l(int i10, int i11) {
        for (int childCount = this.f26348v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f26348v;
            this.f26345s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean m(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f26346t.getLeft();
        int top = this.f26346t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f26344r.abortAnimation();
            u(0);
            return false;
        }
        View view = this.f26346t;
        int f14 = f(i12, (int) this.f26340n, (int) this.f26339m);
        int f15 = f(i13, (int) this.f26340n, (int) this.f26339m);
        int abs = Math.abs(i14);
        int abs2 = Math.abs(i15);
        int abs3 = Math.abs(f14);
        int abs4 = Math.abs(f15);
        int i16 = abs3 + abs4;
        int i17 = abs + abs2;
        if (f14 != 0) {
            f10 = (float) abs3;
            f11 = (float) i16;
        } else {
            f10 = (float) abs;
            f11 = (float) i17;
        }
        float f16 = f10 / f11;
        if (f15 != 0) {
            f13 = (float) abs4;
            f12 = (float) i16;
        } else {
            f13 = (float) abs2;
            f12 = (float) i17;
        }
        int h10 = h(i14, f14, this.f26345s.c(view));
        float h11 = ((float) h(i15, f15, this.f26345s.d(view))) * (f13 / f12);
        this.f26344r.startScroll(left, top, i14, i15, (int) (h11 + (((float) h10) * f16)));
        u(2);
        return true;
    }

    public boolean n(int i10) {
        return ((1 << i10) & this.f26337k) != 0;
    }

    public final boolean o(int i10) {
        if (n(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void p(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f26338l == null) {
            this.f26338l = VelocityTracker.obtain();
        }
        this.f26338l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View l10 = l((int) x10, (int) y10);
            s(x10, y10, pointerId);
            y(l10, pointerId);
            int i12 = this.f26334h[pointerId];
            int i13 = this.f26343q;
            if ((i12 & i13) != 0) {
                this.f26345s.f(i12 & i13, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f26327a == 1) {
                q();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f26327a == 1) {
                    k(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                s(x11, y11, pointerId2);
                if (this.f26327a == 0) {
                    y(l((int) x11, (int) y11), pointerId2);
                    int i14 = this.f26334h[pointerId2];
                    int i15 = this.f26343q;
                    if ((i14 & i15) != 0) {
                        this.f26345s.f(i14 & i15, pointerId2);
                        return;
                    }
                    return;
                }
                int i16 = (int) x11;
                int i17 = (int) y11;
                View view = this.f26346t;
                if (view != null && i16 >= view.getLeft() && i16 < view.getRight() && i17 >= view.getTop() && i17 < view.getBottom()) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    y(this.f26346t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f26327a == 1 && pointerId3 == this.f26329c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount) {
                            i10 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (pointerId4 != this.f26329c) {
                            View l11 = l((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view2 = this.f26346t;
                            if (l11 == view2 && y(view2, pointerId4)) {
                                i10 = this.f26329c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        q();
                    }
                }
                g(pointerId3);
            }
        } else if (this.f26327a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i11 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i11);
                if (o(pointerId5)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f26330d[pointerId5];
                    float f11 = y12 - this.f26331e[pointerId5];
                    r(f10, f11, pointerId5);
                    if (this.f26327a != 1) {
                        View l12 = l((int) x12, (int) y12);
                        if (d(l12, f10, f11) && y(l12, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            t(motionEvent);
        } else if (o(this.f26329c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f26329c);
            float x13 = motionEvent.getX(findPointerIndex);
            float y13 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f26332f;
            int i18 = this.f26329c;
            int i19 = (int) (x13 - fArr[i18]);
            int i20 = (int) (y13 - this.f26333g[i18]);
            int left = this.f26346t.getLeft() + i19;
            int top = this.f26346t.getTop() + i20;
            int left2 = this.f26346t.getLeft();
            int top2 = this.f26346t.getTop();
            if (i19 != 0) {
                left = this.f26345s.a(this.f26346t, left, i19);
                c0.t(this.f26346t, left - left2);
            }
            int i21 = left;
            if (i20 != 0) {
                top = this.f26345s.b(this.f26346t, top, i20);
                c0.u(this.f26346t, top - top2);
            }
            int i22 = top;
            if (!(i19 == 0 && i20 == 0)) {
                this.f26345s.i(this.f26346t, i21, i22, i21 - left2, i22 - top2);
            }
            t(motionEvent);
        }
    }

    public final void q() {
        this.f26338l.computeCurrentVelocity(1000, this.f26339m);
        k(e(this.f26338l.getXVelocity(this.f26329c), this.f26340n, this.f26339m), e(this.f26338l.getYVelocity(this.f26329c), this.f26340n, this.f26339m));
    }

    public final void r(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c10 |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.f26335i;
            iArr[i10] = iArr[i10] | c10;
            this.f26345s.e(c10 ? 1 : 0, i10);
        }
    }

    public final void s(float f10, float f11, int i10) {
        float[] fArr = this.f26330d;
        int i11 = 0;
        if (fArr == null || fArr.length <= i10) {
            int i12 = i10 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f26331e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f26332f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f26333g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f26334h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f26335i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f26336j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f26330d = fArr2;
            this.f26331e = fArr3;
            this.f26332f = fArr4;
            this.f26333g = fArr5;
            this.f26334h = iArr;
            this.f26335i = iArr2;
            this.f26336j = iArr3;
        }
        float[] fArr9 = this.f26330d;
        this.f26332f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f26331e;
        this.f26333g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f26334h;
        int i13 = (int) f10;
        int i14 = (int) f11;
        if (i13 < this.f26348v.getLeft() + this.f26341o) {
            i11 = 1;
        }
        if (i14 < this.f26348v.getTop() + this.f26341o) {
            i11 |= 4;
        }
        if (i13 > this.f26348v.getRight() - this.f26341o) {
            i11 |= 2;
        }
        if (i14 > this.f26348v.getBottom() - this.f26341o) {
            i11 |= 8;
        }
        iArr7[i10] = i11;
        this.f26337k |= 1 << i10;
    }

    public final void t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (o(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f26332f[pointerId] = x10;
                this.f26333g[pointerId] = y10;
            }
        }
    }

    public void u(int i10) {
        this.f26348v.removeCallbacks(this.f26349w);
        if (this.f26327a != i10) {
            this.f26327a = i10;
            this.f26345s.h(i10);
            if (this.f26327a == 0) {
                this.f26346t = null;
            }
        }
    }

    public boolean v(int i10, int i11) {
        if (this.f26347u) {
            return m(i10, i11, (int) this.f26338l.getXVelocity(this.f26329c), (int) this.f26338l.getYVelocity(this.f26329c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        if (r12 != r11) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean w(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f26338l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f26338l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f26338l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x0102
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.g(r1)
            goto L_0x0102
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.s(r7, r1, r2)
            int r3 = r0.f26327a
            if (r3 != 0) goto L_0x005f
            int[] r1 = r0.f26334h
            r1 = r1[r2]
            int r3 = r0.f26343q
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0102
            v0.d$c r3 = r0.f26345s
            r3.f(r1, r2)
            goto L_0x0102
        L_0x005f:
            if (r3 != r4) goto L_0x0102
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.l(r3, r1)
            android.view.View r3 = r0.f26346t
            if (r1 != r3) goto L_0x0102
            r0.y(r1, r2)
            goto L_0x0102
        L_0x0070:
            float[] r2 = r0.f26330d
            if (r2 == 0) goto L_0x0102
            float[] r2 = r0.f26331e
            if (r2 != 0) goto L_0x007a
            goto L_0x0102
        L_0x007a:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x00fb
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.o(r4)
            if (r7 != 0) goto L_0x008d
            goto L_0x00f8
        L_0x008d:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f26330d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f26331e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.l(r7, r8)
            if (r7 == 0) goto L_0x00b1
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b1
            r8 = 1
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            if (r8 == 0) goto L_0x00e7
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            v0.d$c r14 = r0.f26345s
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            v0.d$c r5 = r0.f26345s
            int r5 = r5.b(r7, r15, r14)
            v0.d$c r14 = r0.f26345s
            int r14 = r14.c(r7)
            v0.d$c r15 = r0.f26345s
            int r15 = r15.d(r7)
            if (r14 == 0) goto L_0x00e0
            if (r14 <= 0) goto L_0x00e7
            if (r12 != r11) goto L_0x00e7
        L_0x00e0:
            if (r15 == 0) goto L_0x00fb
            if (r15 <= 0) goto L_0x00e7
            if (r5 != r13) goto L_0x00e7
            goto L_0x00fb
        L_0x00e7:
            r0.r(r9, r10, r4)
            int r5 = r0.f26327a
            if (r5 != r6) goto L_0x00ef
            goto L_0x00fb
        L_0x00ef:
            if (r8 == 0) goto L_0x00f8
            boolean r4 = r0.y(r7, r4)
            if (r4 == 0) goto L_0x00f8
            goto L_0x00fb
        L_0x00f8:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x00fb:
            r16.t(r17)
            goto L_0x0102
        L_0x00ff:
            r16.a()
        L_0x0102:
            r5 = 0
            goto L_0x0133
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.s(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.l(r2, r3)
            android.view.View r3 = r0.f26346t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f26327a
            if (r3 != r4) goto L_0x0125
            r0.y(r2, r1)
        L_0x0125:
            int[] r2 = r0.f26334h
            r2 = r2[r1]
            int r3 = r0.f26343q
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0133
            v0.d$c r3 = r0.f26345s
            r3.f(r2, r1)
        L_0x0133:
            int r1 = r0.f26327a
            if (r1 != r6) goto L_0x0138
            r5 = 1
        L_0x0138:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.w(android.view.MotionEvent):boolean");
    }

    public boolean x(View view, int i10, int i11) {
        this.f26346t = view;
        this.f26329c = -1;
        boolean m10 = m(i10, i11, 0, 0);
        if (!m10 && this.f26327a == 0 && this.f26346t != null) {
            this.f26346t = null;
        }
        return m10;
    }

    public boolean y(View view, int i10) {
        if (view == this.f26346t && this.f26329c == i10) {
            return true;
        }
        if (view == null || !this.f26345s.k(view, i10)) {
            return false;
        }
        this.f26329c = i10;
        b(view, i10);
        return true;
    }
}
