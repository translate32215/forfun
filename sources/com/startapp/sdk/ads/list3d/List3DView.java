package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.startapp.a0;
import com.startapp.t5;
import com.startapp.u2;
import com.startapp.u5;
import java.util.LinkedList;

/* compiled from: Sta */
public class List3DView extends AdapterView<Adapter> {

    /* renamed from: a  reason: collision with root package name */
    public Adapter f11829a;

    /* renamed from: b  reason: collision with root package name */
    public int f11830b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f11831c;

    /* renamed from: d  reason: collision with root package name */
    public int f11832d;

    /* renamed from: e  reason: collision with root package name */
    public int f11833e;

    /* renamed from: f  reason: collision with root package name */
    public int f11834f;

    /* renamed from: g  reason: collision with root package name */
    public int f11835g;

    /* renamed from: h  reason: collision with root package name */
    public int f11836h;

    /* renamed from: i  reason: collision with root package name */
    public int f11837i;

    /* renamed from: j  reason: collision with root package name */
    public int f11838j;

    /* renamed from: k  reason: collision with root package name */
    public VelocityTracker f11839k;

    /* renamed from: l  reason: collision with root package name */
    public u2 f11840l;

    /* renamed from: m  reason: collision with root package name */
    public Runnable f11841m;

    /* renamed from: n  reason: collision with root package name */
    public final LinkedList<View> f11842n = new LinkedList<>();

    /* renamed from: o  reason: collision with root package name */
    public Runnable f11843o;

    /* renamed from: p  reason: collision with root package name */
    public Rect f11844p;

    /* renamed from: q  reason: collision with root package name */
    public Camera f11845q;

    /* renamed from: r  reason: collision with root package name */
    public Matrix f11846r;

    /* renamed from: s  reason: collision with root package name */
    public Paint f11847s;

    /* renamed from: t  reason: collision with root package name */
    public int f11848t = Integer.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11849u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11850v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11851w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11852x = false;

    public List3DView(Context context, AttributeSet attributeSet, String str, String str2) {
        super(context, (AttributeSet) null);
    }

    public final boolean a() {
        int i10 = a0.f10005a;
        return true;
    }

    public int b(int i10, int i11) {
        if (this.f11844p == null) {
            this.f11844p = new Rect();
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).getHitRect(this.f11844p);
            if (this.f11844p.contains(i10, i11)) {
                return i12;
            }
        }
        return -1;
    }

    public final int c(View view) {
        return (int) ((((float) view.getMeasuredHeight()) * 0.35000002f) / 2.0f);
    }

    public int d(View view) {
        return view.getTop() - c(view);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j10);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = (float) (getHeight() / 2);
        float f10 = (((float) (top + height)) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos((double) f10)) * 0.15000000596046448d));
        float f11 = (((float) this.f11836h) - (f10 * 20.0f)) % 90.0f;
        if (f11 < 0.0f) {
            f11 += 90.0f;
        }
        float f12 = f11;
        if (f12 < 45.0f) {
            Canvas canvas2 = canvas;
            Bitmap bitmap = drawingCache;
            int i10 = top;
            int i11 = left;
            int i12 = width;
            int i13 = height;
            float f13 = cos;
            a(canvas2, bitmap, i10, i11, i12, i13, f13, f12 - 90.0f);
            a(canvas2, bitmap, i10, i11, i12, i13, f13, f12);
            return false;
        }
        Canvas canvas3 = canvas;
        Bitmap bitmap2 = drawingCache;
        int i14 = top;
        int i15 = left;
        int i16 = width;
        int i17 = height;
        float f14 = cos;
        a(canvas3, bitmap2, i14, i15, i16, i17, f14, f12);
        a(canvas3, bitmap2, i14, i15, i16, i17, f14, f12 - 90.0f);
        return false;
    }

    public Adapter getAdapter() {
        return this.f11829a;
    }

    public View getSelectedView() {
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f11841m);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f11849u && this.f11829a != null) {
            if (getChildCount() == 0) {
                if (this.f11851w) {
                    this.f11834f = getHeight() / 3;
                }
                this.f11838j = -1;
                a(this.f11834f, 0);
            } else {
                int d10 = (this.f11834f + this.f11835g) - d(getChildAt(0));
                int childCount = getChildCount();
                if (this.f11838j != this.f11829a.getCount() - 1 && childCount > 1) {
                    View childAt = getChildAt(0);
                    while (childAt != null && a(childAt) + d10 < 0) {
                        removeViewInLayout(childAt);
                        childCount--;
                        this.f11842n.addLast(childAt);
                        this.f11837i++;
                        this.f11835g = b(childAt) + this.f11835g;
                        childAt = childCount > 1 ? getChildAt(0) : null;
                    }
                }
                if (this.f11837i != 0 && childCount > 1) {
                    View childAt2 = getChildAt(childCount - 1);
                    while (childAt2 != null && d(childAt2) + d10 > getHeight()) {
                        removeViewInLayout(childAt2);
                        childCount--;
                        this.f11842n.addLast(childAt2);
                        this.f11838j--;
                        childAt2 = childCount > 1 ? getChildAt(childCount - 1) : null;
                    }
                }
                a(a(getChildAt(getChildCount() - 1)), d10);
                int d11 = d(getChildAt(0));
                while (d11 + d10 > 0 && (i14 = this.f11837i) > 0) {
                    int i15 = i14 - 1;
                    this.f11837i = i15;
                    View view = this.f11829a.getView(i15, this.f11842n.size() != 0 ? this.f11842n.removeFirst() : null, this);
                    a(view, 1);
                    int b10 = b(view);
                    d11 -= b10;
                    this.f11835g -= b10;
                }
            }
            int i16 = this.f11834f + this.f11835g;
            float width = ((float) getWidth()) * 0.0f;
            float height = 1.0f / (((float) getHeight()) * 0.9f);
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt3 = getChildAt(i17);
                double d12 = (double) width;
                double d13 = (double) height;
                Double.isNaN(d13);
                double d14 = (double) i16;
                Double.isNaN(d14);
                double sin = Math.sin(d13 * 6.283185307179586d * d14);
                Double.isNaN(d12);
                int i18 = (int) (sin * d12);
                int measuredWidth = childAt3.getMeasuredWidth();
                int measuredHeight = childAt3.getMeasuredHeight();
                int width2 = ((getWidth() - measuredWidth) / 2) + i18;
                int c10 = c(childAt3);
                int i19 = i16 + c10;
                childAt3.layout(width2, i19, measuredWidth + width2, i19 + measuredHeight);
                i16 += (c10 * 2) + measuredHeight;
            }
            if (this.f11851w && !this.f11852x) {
                this.f11852x = true;
                dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
                postDelayed(new t5(this), 5);
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 <= (r0 + 10)) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r7.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x0097
            r1 = 0
            r3 = 2
            if (r0 == r2) goto L_0x0059
            if (r0 == r3) goto L_0x001a
            r6.a((float) r1)
            goto L_0x00f3
        L_0x001a:
            int r0 = r6.f11830b
            if (r0 != r2) goto L_0x0043
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r4 = r6.f11831c
            int r5 = r4 + -10
            if (r0 < r5) goto L_0x003c
            int r4 = r4 + 10
            if (r0 > r4) goto L_0x003c
            int r0 = r6.f11832d
            int r4 = r0 + -10
            if (r1 < r4) goto L_0x003c
            int r0 = r0 + 10
            if (r1 <= r0) goto L_0x0043
        L_0x003c:
            java.lang.Runnable r0 = r6.f11843o
            r6.removeCallbacks(r0)
            r6.f11830b = r3
        L_0x0043:
            int r0 = r6.f11830b
            if (r0 != r3) goto L_0x00f3
            android.view.VelocityTracker r0 = r6.f11839k
            r0.addMovement(r7)
            float r7 = r7.getY()
            int r7 = (int) r7
            int r0 = r6.f11832d
            int r7 = r7 - r0
            r6.a((int) r7)
            goto L_0x00f3
        L_0x0059:
            int r0 = r6.f11830b
            if (r0 != r2) goto L_0x007f
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            int r7 = (int) r7
            int r7 = r6.b(r0, r7)
            r0 = -1
            if (r7 == r0) goto L_0x0093
            android.view.View r0 = r6.getChildAt(r7)
            int r3 = r6.f11837i
            int r3 = r3 + r7
            android.widget.Adapter r7 = r6.f11829a
            long r4 = r7.getItemId(r3)
            r6.performItemClick(r0, r3, r4)
            goto L_0x0093
        L_0x007f:
            if (r0 != r3) goto L_0x0093
            android.view.VelocityTracker r0 = r6.f11839k
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r6.f11839k
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r6.f11839k
            float r1 = r7.getYVelocity()
        L_0x0093:
            r6.a((float) r1)
            goto L_0x00f3
        L_0x0097:
            boolean r0 = r6.a()
            if (r0 == 0) goto L_0x00b3
            r3 = 1500(0x5dc, double:7.41E-321)
            int r0 = com.startapp.a0.f10005a
            android.view.ViewPropertyAnimator r0 = r6.animate()
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            r3 = 0
            r0.setListener(r3)
        L_0x00b3:
            java.lang.Runnable r0 = r6.f11841m
            r6.removeCallbacks(r0)
            float r0 = r7.getX()
            int r0 = (int) r0
            r6.f11831c = r0
            float r0 = r7.getY()
            int r0 = (int) r0
            r6.f11832d = r0
            android.view.View r0 = r6.getChildAt(r1)
            int r0 = r6.d(r0)
            int r1 = r6.f11835g
            int r0 = r0 - r1
            r6.f11833e = r0
            java.lang.Runnable r0 = r6.f11843o
            if (r0 != 0) goto L_0x00de
            com.startapp.v5 r0 = new com.startapp.v5
            r0.<init>(r6)
            r6.f11843o = r0
        L_0x00de:
            java.lang.Runnable r0 = r6.f11843o
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            long r3 = (long) r1
            r6.postDelayed(r0, r3)
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f11839k = r0
            r0.addMovement(r7)
            r6.f11830b = r2
        L_0x00f3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAdapter(Adapter adapter) {
        if (a() && this.f11850v) {
            int i10 = a0.f10005a;
            setAlpha(0.0f);
        }
        this.f11829a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(u2 u2Var) {
        u2 u2Var2 = this.f11840l;
        if (u2Var2 != null) {
            float f10 = u2Var2.f12643a;
            float f11 = u2Var2.f12644b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            u2Var.f12644b = f11;
            u2Var.f12643a = f10;
            u2Var.f12647e = currentAnimationTimeMillis;
        }
        this.f11840l = u2Var;
    }

    public void setFade(boolean z10) {
        this.f11850v = z10;
    }

    public void setHint(boolean z10) {
        this.f11851w = z10;
    }

    public void setSelection(int i10) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f11849u = true;
    }

    public void setTag(String str) {
    }

    public final void a(Canvas canvas, Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, float f11) {
        if (this.f11845q == null) {
            this.f11845q = new Camera();
        }
        this.f11845q.save();
        this.f11845q.translate(0.0f, 0.0f, (float) i13);
        this.f11845q.rotateX(f11);
        float f12 = (float) (-i13);
        this.f11845q.translate(0.0f, 0.0f, f12);
        if (this.f11846r == null) {
            this.f11846r = new Matrix();
        }
        this.f11845q.getMatrix(this.f11846r);
        this.f11845q.restore();
        this.f11846r.preTranslate((float) (-i12), f12);
        this.f11846r.postScale(f10, f10);
        this.f11846r.postTranslate((float) (i11 + i12), (float) (i10 + i13));
        if (this.f11847s == null) {
            Paint paint = new Paint();
            this.f11847s = paint;
            paint.setAntiAlias(true);
            this.f11847s.setFilterBitmap(true);
        }
        Paint paint2 = this.f11847s;
        double d10 = (double) f11;
        Double.isNaN(d10);
        double cos = Math.cos((d10 * 3.141592653589793d) / 180.0d);
        int i14 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i14 > 255) {
            i14 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i14, i14, i14), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.f11846r, this.f11847s);
    }

    public final int b(View view) {
        return (c(view) * 2) + view.getMeasuredHeight();
    }

    public final void a(float f10) {
        VelocityTracker velocityTracker = this.f11839k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11839k = null;
            removeCallbacks(this.f11843o);
            if (this.f11841m == null) {
                this.f11841m = new u5(this);
            }
            u2 u2Var = this.f11840l;
            if (u2Var != null) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                u2Var.f12644b = f10;
                u2Var.f12643a = (float) this.f11834f;
                u2Var.f12647e = currentAnimationTimeMillis;
                post(this.f11841m);
            }
            this.f11830b = 0;
        }
    }

    public void a(int i10) {
        int i11;
        int i12 = this.f11833e + i10;
        this.f11834f = i12;
        int height = (-(i12 * 270)) / getHeight();
        this.f11836h = height;
        int i13 = height % 90;
        if (i13 < 45) {
            i11 = (getHeight() * (-(height - i13))) / 270;
        } else {
            i11 = (getHeight() * (-((height + 90) - i13))) / 270;
        }
        if (this.f11848t == Integer.MIN_VALUE && this.f11838j == this.f11829a.getCount() - 1 && a(getChildAt(getChildCount() - 1)) < getHeight()) {
            this.f11848t = i11;
        }
        if (i11 > 0) {
            i11 = 0;
        } else {
            int i14 = this.f11848t;
            if (i11 < i14) {
                i11 = i14;
            }
        }
        u2 u2Var = this.f11840l;
        float f10 = (float) i11;
        u2Var.f12645c = f10;
        u2Var.f12646d = f10;
        requestLayout();
    }

    public final void a(int i10, int i11) {
        while (i10 + i11 < getHeight() && this.f11838j < this.f11829a.getCount() - 1) {
            int i12 = this.f11838j + 1;
            this.f11838j = i12;
            View view = this.f11829a.getView(i12, this.f11842n.size() != 0 ? this.f11842n.removeFirst() : null, this);
            a(view, 0);
            i10 += b(view);
        }
    }

    public final void a(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i11 = i10 == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i11, layoutParams, true);
        view.measure(((int) (((float) getWidth()) * 0.85f)) | 1073741824, 0);
    }

    public final int a(View view) {
        return c(view) + view.getBottom();
    }
}
