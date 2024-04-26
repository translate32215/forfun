package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.f;
import com.google.android.exoplayer2.ui.d;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import s6.c;
import v6.a;
import v6.e0;

public class DefaultTimeBar extends View implements d {

    /* renamed from: c0  reason: collision with root package name */
    public static final /* synthetic */ int f5321c0 = 0;
    public final int A;
    public final int B;
    public final StringBuilder C;
    public final Formatter D;
    public final Runnable E;
    public final CopyOnWriteArraySet<d.a> F;
    public final Point G;
    public final float H;
    public int I;
    public long J;
    public int K;
    public Rect L;
    public float M;
    public boolean N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f5322a;

    /* renamed from: a0  reason: collision with root package name */
    public long[] f5323a0;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f5324b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean[] f5325b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f5326c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f5327d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f5328e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f5329f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f5330g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f5331h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f5332i;

    /* renamed from: r  reason: collision with root package name */
    public final Paint f5333r;

    /* renamed from: s  reason: collision with root package name */
    public final Drawable f5334s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5335t;

    /* renamed from: u  reason: collision with root package name */
    public final int f5336u;

    /* renamed from: v  reason: collision with root package name */
    public final int f5337v;

    /* renamed from: w  reason: collision with root package name */
    public final int f5338w;

    /* renamed from: x  reason: collision with root package name */
    public final int f5339x;

    /* renamed from: y  reason: collision with root package name */
    public final int f5340y;

    /* renamed from: z  reason: collision with root package name */
    public final int f5341z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, attributeSet);
    }

    public static int c(float f10, int i10) {
        return (int) ((((float) i10) * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.J;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = this.P;
        if (j11 == -9223372036854775807L) {
            return 0;
        }
        return j11 / ((long) this.I);
    }

    private String getProgressText() {
        return e0.B(this.C, this.D, this.Q);
    }

    private long getScrubberPosition() {
        if (this.f5324b.width() <= 0 || this.P == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f5327d.width()) * this.P) / ((long) this.f5324b.width());
    }

    public void a(long[] jArr, boolean[] zArr, int i10) {
        a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.S = i10;
        this.f5323a0 = jArr;
        this.f5325b0 = zArr;
        h();
    }

    public void b(d.a aVar) {
        this.F.add(aVar);
    }

    public final void d(float f10) {
        Rect rect = this.f5327d;
        Rect rect2 = this.f5324b;
        rect.right = e0.i((int) f10, rect2.left, rect2.right);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        i();
    }

    public final boolean e(long j10) {
        long j11 = this.P;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.N ? this.O : this.Q;
        long j13 = e0.j(j12 + j10, 0, j11);
        if (j13 == j12) {
            return false;
        }
        if (!this.N) {
            f(j13);
        } else {
            j(j13);
        }
        h();
        return true;
    }

    public final void f(long j10) {
        this.O = j10;
        this.N = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<d.a> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().d(this, j10);
        }
    }

    public final void g(boolean z10) {
        removeCallbacks(this.E);
        this.N = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<d.a> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().h(this, this.O, z10);
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (((float) this.f5324b.width()) / this.H);
        if (width != 0) {
            long j10 = this.P;
            if (!(j10 == 0 || j10 == -9223372036854775807L)) {
                return j10 / ((long) width);
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h() {
        this.f5326c.set(this.f5324b);
        this.f5327d.set(this.f5324b);
        long j10 = this.N ? this.O : this.Q;
        if (this.P > 0) {
            int width = (int) ((((long) this.f5324b.width()) * this.R) / this.P);
            Rect rect = this.f5326c;
            Rect rect2 = this.f5324b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((((long) this.f5324b.width()) * j10) / this.P);
            Rect rect3 = this.f5327d;
            Rect rect4 = this.f5324b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f5326c;
            int i10 = this.f5324b.left;
            rect5.right = i10;
            this.f5327d.right = i10;
        }
        invalidate(this.f5322a);
    }

    public final void i() {
        Drawable drawable = this.f5334s;
        if (drawable != null && drawable.isStateful() && this.f5334s.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void j(long j10) {
        if (this.O != j10) {
            this.O = j10;
            Iterator<d.a> it = this.F.iterator();
            while (it.hasNext()) {
                it.next().a(this, j10);
            }
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5334s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2 = canvas;
        canvas.save();
        int height = this.f5324b.height();
        int centerY = this.f5324b.centerY() - (height / 2);
        int i11 = height + centerY;
        if (this.P <= 0) {
            Rect rect = this.f5324b;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i11, this.f5330g);
        } else {
            Rect rect2 = this.f5326c;
            int i12 = rect2.left;
            int i13 = rect2.right;
            int max = Math.max(Math.max(this.f5324b.left, i13), this.f5327d.right);
            int i14 = this.f5324b.right;
            if (max < i14) {
                canvas.drawRect((float) max, (float) centerY, (float) i14, (float) i11, this.f5330g);
            }
            int max2 = Math.max(i12, this.f5327d.right);
            if (i13 > max2) {
                canvas.drawRect((float) max2, (float) centerY, (float) i13, (float) i11, this.f5329f);
            }
            if (this.f5327d.width() > 0) {
                Rect rect3 = this.f5327d;
                canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i11, this.f5328e);
            }
            if (this.S != 0) {
                long[] jArr = this.f5323a0;
                jArr.getClass();
                boolean[] zArr = this.f5325b0;
                zArr.getClass();
                int i15 = this.f5338w / 2;
                for (int i16 = 0; i16 < this.S; i16++) {
                    long j10 = e0.j(jArr[i16], 0, this.P);
                    Rect rect4 = this.f5324b;
                    int min = Math.min(rect4.width() - this.f5338w, Math.max(0, ((int) ((((long) this.f5324b.width()) * j10) / this.P)) - i15)) + rect4.left;
                    canvas.drawRect((float) min, (float) centerY, (float) (min + this.f5338w), (float) i11, zArr[i16] ? this.f5332i : this.f5331h);
                }
            }
        }
        if (this.P > 0) {
            Rect rect5 = this.f5327d;
            int i17 = e0.i(rect5.right, rect5.left, this.f5324b.right);
            int centerY2 = this.f5327d.centerY();
            Drawable drawable = this.f5334s;
            if (drawable == null) {
                if (this.N || isFocused()) {
                    i10 = this.f5341z;
                } else {
                    i10 = isEnabled() ? this.f5339x : this.f5340y;
                }
                canvas2.drawCircle((float) i17, (float) centerY2, (float) ((int) ((((float) i10) * this.M) / 2.0f)), this.f5333r);
            } else {
                int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.M)) / 2;
                int intrinsicHeight = ((int) (((float) this.f5334s.getIntrinsicHeight()) * this.M)) / 2;
                this.f5334s.setBounds(i17 - intrinsicWidth, centerY2 - intrinsicHeight, i17 + intrinsicWidth, centerY2 + intrinsicHeight);
                this.f5334s.draw(canvas2);
            }
        }
        canvas.restore();
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.N && !z10) {
            g(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.P > 0) {
            if (e0.f26436a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (e(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.E);
        postDelayed(r4.E, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.e(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.E
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.E
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.N
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.g(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        Rect rect;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.A;
        if (this.f5337v == 1) {
            i15 = (i17 - getPaddingBottom()) - this.f5336u;
            int i19 = this.f5335t;
            i14 = ((i17 - getPaddingBottom()) - i19) - Math.max(i18 - (i19 / 2), 0);
        } else {
            i15 = (i17 - this.f5336u) / 2;
            i14 = (i17 - this.f5335t) / 2;
        }
        this.f5322a.set(paddingLeft, i15, paddingRight, this.f5336u + i15);
        Rect rect2 = this.f5324b;
        Rect rect3 = this.f5322a;
        rect2.set(rect3.left + i18, i14, rect3.right - i18, this.f5335t + i14);
        if (e0.f26436a >= 29 && !((rect = this.L) != null && rect.width() == i16 && this.L.height() == i17)) {
            Rect rect4 = new Rect(0, 0, i16, i17);
            this.L = rect4;
            setSystemGestureExclusionRects(Collections.singletonList(rect4));
        }
        h();
    }

    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f5336u;
        } else if (mode != 1073741824) {
            size = Math.min(this.f5336u, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        i();
    }

    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f5334s;
        if (drawable != null) {
            if (e0.f26436a >= 23 && drawable.setLayoutDirection(i10)) {
                invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r3 != 3) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0088
            long r2 = r7.P
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            goto L_0x0088
        L_0x0011:
            android.graphics.Point r0 = r7.G
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.G
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x006b
            r5 = 3
            if (r3 == r4) goto L_0x005c
            r6 = 2
            if (r3 == r6) goto L_0x0036
            if (r3 == r5) goto L_0x005c
            goto L_0x0088
        L_0x0036:
            boolean r8 = r7.N
            if (r8 == 0) goto L_0x0088
            int r8 = r7.B
            if (r0 >= r8) goto L_0x0048
            int r8 = r7.K
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            float r8 = (float) r2
            r7.d(r8)
            goto L_0x004e
        L_0x0048:
            r7.K = r2
            float r8 = (float) r2
            r7.d(r8)
        L_0x004e:
            long r0 = r7.getScrubberPosition()
            r7.j(r0)
            r7.h()
            r7.invalidate()
            return r4
        L_0x005c:
            boolean r0 = r7.N
            if (r0 == 0) goto L_0x0088
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0067
            r1 = 1
        L_0x0067:
            r7.g(r1)
            return r4
        L_0x006b:
            float r8 = (float) r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.f5322a
            int r3 = (int) r8
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L_0x0088
            r7.d(r8)
            long r0 = r7.getScrubberPosition()
            r7.f(r0)
            r7.h()
            r7.invalidate()
            return r4
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.P <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (e(-getPositionIncrement())) {
                g(false);
            }
        } else if (i10 != 4096) {
            return false;
        } else {
            if (e(getPositionIncrement())) {
                g(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f5331h.setColor(i10);
        invalidate(this.f5322a);
    }

    public void setBufferedColor(int i10) {
        this.f5329f.setColor(i10);
        invalidate(this.f5322a);
    }

    public void setBufferedPosition(long j10) {
        this.R = j10;
        h();
    }

    public void setDuration(long j10) {
        this.P = j10;
        if (this.N && j10 == -9223372036854775807L) {
            g(true);
        }
        h();
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.N && !z10) {
            g(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        a.a(i10 > 0);
        this.I = i10;
        this.J = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        a.a(j10 > 0);
        this.I = -1;
        this.J = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.f5332i.setColor(i10);
        invalidate(this.f5322a);
    }

    public void setPlayedColor(int i10) {
        this.f5328e.setColor(i10);
        invalidate(this.f5322a);
    }

    public void setPosition(long j10) {
        this.Q = j10;
        setContentDescription(getProgressText());
        h();
    }

    public void setScrubberColor(int i10) {
        this.f5333r.setColor(i10);
        invalidate(this.f5322a);
    }

    public void setUnplayedColor(int i10) {
        this.f5330g.setColor(i10);
        invalidate(this.f5322a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        AttributeSet attributeSet3 = attributeSet2;
        this.f5322a = new Rect();
        this.f5324b = new Rect();
        this.f5326c = new Rect();
        this.f5327d = new Rect();
        Paint paint = new Paint();
        this.f5328e = paint;
        Paint paint2 = new Paint();
        this.f5329f = paint2;
        Paint paint3 = new Paint();
        this.f5330g = paint3;
        Paint paint4 = new Paint();
        this.f5331h = paint4;
        Paint paint5 = new Paint();
        this.f5332i = paint5;
        Paint paint6 = new Paint();
        this.f5333r = paint6;
        paint6.setAntiAlias(true);
        this.F = new CopyOnWriteArraySet<>();
        this.G = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.H = f10;
        this.B = c(f10, -50);
        int c10 = c(f10, 4);
        int c11 = c(f10, 26);
        int c12 = c(f10, 4);
        int c13 = c(f10, 12);
        int c14 = c(f10, 0);
        int c15 = c(f10, 16);
        if (attributeSet3 != null) {
            Paint paint7 = paint5;
            Paint paint8 = paint4;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, c.f24968b, i10, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f5334s = drawable;
                if (drawable != null) {
                    int i11 = e0.f26436a;
                    if (i11 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i11 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    c11 = Math.max(drawable.getMinimumHeight(), c11);
                }
                this.f5335t = obtainStyledAttributes.getDimensionPixelSize(3, c10);
                this.f5336u = obtainStyledAttributes.getDimensionPixelSize(12, c11);
                this.f5337v = obtainStyledAttributes.getInt(2, 0);
                this.f5338w = obtainStyledAttributes.getDimensionPixelSize(1, c12);
                this.f5339x = obtainStyledAttributes.getDimensionPixelSize(11, c13);
                this.f5340y = obtainStyledAttributes.getDimensionPixelSize(8, c14);
                this.f5341z = obtainStyledAttributes.getDimensionPixelSize(9, c15);
                int i12 = obtainStyledAttributes.getInt(6, -1);
                int i13 = obtainStyledAttributes.getInt(7, -1);
                int i14 = obtainStyledAttributes.getInt(4, -855638017);
                int i15 = obtainStyledAttributes.getInt(13, 872415231);
                int i16 = obtainStyledAttributes.getInt(0, -1291845888);
                int i17 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i12);
                paint6.setColor(i13);
                paint2.setColor(i14);
                paint3.setColor(i15);
                paint8.setColor(i16);
                paint7.setColor(i17);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f5335t = c10;
            this.f5336u = c11;
            this.f5337v = 0;
            this.f5338w = c12;
            this.f5339x = c13;
            this.f5340y = c14;
            this.f5341z = c15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f5334s = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.C = sb2;
        this.D = new Formatter(sb2, Locale.getDefault());
        this.E = new f(this);
        Drawable drawable2 = this.f5334s;
        if (drawable2 != null) {
            this.A = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.A = (Math.max(this.f5340y, Math.max(this.f5339x, this.f5341z)) + 1) / 2;
        }
        this.M = 1.0f;
        new ValueAnimator().addUpdateListener(new s6.a(this));
        this.P = -9223372036854775807L;
        this.J = -9223372036854775807L;
        this.I = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
