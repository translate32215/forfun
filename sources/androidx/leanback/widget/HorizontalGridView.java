package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import e1.a;

public class HorizontalGridView extends e {

    /* renamed from: d1  reason: collision with root package name */
    public boolean f2133d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f2134e1;

    /* renamed from: f1  reason: collision with root package name */
    public Paint f2135f1 = new Paint();

    /* renamed from: g1  reason: collision with root package name */
    public Bitmap f2136g1;

    /* renamed from: h1  reason: collision with root package name */
    public LinearGradient f2137h1;

    /* renamed from: i1  reason: collision with root package name */
    public int f2138i1;

    /* renamed from: j1  reason: collision with root package name */
    public int f2139j1;

    /* renamed from: k1  reason: collision with root package name */
    public Bitmap f2140k1;

    /* renamed from: l1  reason: collision with root package name */
    public LinearGradient f2141l1;

    /* renamed from: m1  reason: collision with root package name */
    public int f2142m1;

    /* renamed from: n1  reason: collision with root package name */
    public int f2143n1;

    /* renamed from: o1  reason: collision with root package name */
    public Rect f2144o1 = new Rect();

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.T0.O1(0);
        q0(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13534h);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(0, 1));
        obtainStyledAttributes.recycle();
        s0();
        Paint paint = new Paint();
        this.f2135f1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f2140k1;
        if (!(bitmap != null && bitmap.getWidth() == this.f2142m1 && this.f2140k1.getHeight() == getHeight())) {
            this.f2140k1 = Bitmap.createBitmap(this.f2142m1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f2140k1;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f2136g1;
        if (!(bitmap != null && bitmap.getWidth() == this.f2138i1 && this.f2136g1.getHeight() == getHeight())) {
            this.f2136g1 = Bitmap.createBitmap(this.f2138i1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f2136g1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.f2133d1
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x000c
        L_0x000a:
            r2 = 0
            goto L_0x003a
        L_0x000c:
            int r2 = r18.getChildCount()
            r5 = 0
        L_0x0011:
            if (r5 >= r2) goto L_0x000a
            android.view.View r6 = r0.getChildAt(r5)
            androidx.leanback.widget.p r7 = r0.T0
            r7.getClass()
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.leanback.widget.p$d r7 = (androidx.leanback.widget.p.d) r7
            r7.getClass()
            int r6 = r6.getLeft()
            int r7 = r7.f2484e
            int r6 = r6 + r7
            int r7 = r18.getPaddingLeft()
            int r8 = r0.f2139j1
            int r7 = r7 - r8
            if (r6 >= r7) goto L_0x0037
            r2 = 1
            goto L_0x003a
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x003a:
            boolean r5 = r0.f2134e1
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r3 = 0
            goto L_0x0072
        L_0x0040:
            int r5 = r18.getChildCount()
            int r5 = r5 - r3
        L_0x0045:
            if (r5 < 0) goto L_0x003e
            android.view.View r6 = r0.getChildAt(r5)
            androidx.leanback.widget.p r7 = r0.T0
            r7.getClass()
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.leanback.widget.p$d r7 = (androidx.leanback.widget.p.d) r7
            r7.getClass()
            int r6 = r6.getRight()
            int r7 = r7.f2486g
            int r6 = r6 - r7
            int r7 = r18.getWidth()
            int r8 = r18.getPaddingRight()
            int r7 = r7 - r8
            int r8 = r0.f2143n1
            int r7 = r7 + r8
            if (r6 <= r7) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            int r5 = r5 + -1
            goto L_0x0045
        L_0x0072:
            r5 = 0
            if (r2 != 0) goto L_0x0077
            r0.f2136g1 = r5
        L_0x0077:
            if (r3 != 0) goto L_0x007b
            r0.f2140k1 = r5
        L_0x007b:
            if (r2 != 0) goto L_0x0083
            if (r3 != 0) goto L_0x0083
            super.draw(r19)
            return
        L_0x0083:
            boolean r6 = r0.f2133d1
            if (r6 == 0) goto L_0x0092
            int r6 = r18.getPaddingLeft()
            int r7 = r0.f2139j1
            int r6 = r6 - r7
            int r7 = r0.f2138i1
            int r6 = r6 - r7
            goto L_0x0093
        L_0x0092:
            r6 = 0
        L_0x0093:
            boolean r7 = r0.f2134e1
            if (r7 == 0) goto L_0x00a7
            int r7 = r18.getWidth()
            int r8 = r18.getPaddingRight()
            int r7 = r7 - r8
            int r8 = r0.f2143n1
            int r7 = r7 + r8
            int r8 = r0.f2142m1
            int r7 = r7 + r8
            goto L_0x00ab
        L_0x00a7:
            int r7 = r18.getWidth()
        L_0x00ab:
            int r8 = r19.save()
            boolean r9 = r0.f2133d1
            if (r9 == 0) goto L_0x00b6
            int r9 = r0.f2138i1
            goto L_0x00b7
        L_0x00b6:
            r9 = 0
        L_0x00b7:
            int r9 = r9 + r6
            boolean r10 = r0.f2134e1
            if (r10 == 0) goto L_0x00bf
            int r10 = r0.f2142m1
            goto L_0x00c0
        L_0x00bf:
            r10 = 0
        L_0x00c0:
            int r10 = r7 - r10
            int r11 = r18.getHeight()
            r1.clipRect(r9, r4, r10, r11)
            super.draw(r19)
            r1.restoreToCount(r8)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>()
            android.graphics.Rect r9 = r0.f2144o1
            r9.top = r4
            int r10 = r18.getHeight()
            r9.bottom = r10
            r9 = 0
            if (r2 == 0) goto L_0x0136
            int r2 = r0.f2138i1
            if (r2 <= 0) goto L_0x0136
            android.graphics.Bitmap r2 = r18.getTempBitmapLow()
            r2.eraseColor(r4)
            r8.setBitmap(r2)
            int r10 = r8.save()
            int r11 = r0.f2138i1
            int r12 = r18.getHeight()
            r8.clipRect(r4, r4, r11, r12)
            int r11 = -r6
            float r11 = (float) r11
            r8.translate(r11, r9)
            super.draw(r8)
            r8.restoreToCount(r10)
            android.graphics.Paint r10 = r0.f2135f1
            android.graphics.LinearGradient r12 = r0.f2137h1
            r10.setShader(r12)
            r13 = 0
            r14 = 0
            int r10 = r0.f2138i1
            float r15 = (float) r10
            int r10 = r18.getHeight()
            float r10 = (float) r10
            android.graphics.Paint r12 = r0.f2135f1
            r17 = r12
            r12 = r8
            r16 = r10
            r12.drawRect(r13, r14, r15, r16, r17)
            android.graphics.Rect r10 = r0.f2144o1
            r10.left = r4
            int r12 = r0.f2138i1
            r10.right = r12
            float r6 = (float) r6
            r1.translate(r6, r9)
            android.graphics.Rect r6 = r0.f2144o1
            r1.drawBitmap(r2, r6, r6, r5)
            r1.translate(r11, r9)
        L_0x0136:
            if (r3 == 0) goto L_0x0198
            int r2 = r0.f2142m1
            if (r2 <= 0) goto L_0x0198
            android.graphics.Bitmap r2 = r18.getTempBitmapHigh()
            r2.eraseColor(r4)
            r8.setBitmap(r2)
            int r3 = r8.save()
            int r6 = r0.f2142m1
            int r10 = r18.getHeight()
            r8.clipRect(r4, r4, r6, r10)
            int r6 = r0.f2142m1
            int r6 = r7 - r6
            int r6 = -r6
            float r6 = (float) r6
            r8.translate(r6, r9)
            super.draw(r8)
            r8.restoreToCount(r3)
            android.graphics.Paint r3 = r0.f2135f1
            android.graphics.LinearGradient r6 = r0.f2141l1
            r3.setShader(r6)
            r13 = 0
            r14 = 0
            int r3 = r0.f2142m1
            float r15 = (float) r3
            int r3 = r18.getHeight()
            float r3 = (float) r3
            android.graphics.Paint r6 = r0.f2135f1
            r12 = r8
            r16 = r3
            r17 = r6
            r12.drawRect(r13, r14, r15, r16, r17)
            android.graphics.Rect r3 = r0.f2144o1
            r3.left = r4
            int r4 = r0.f2142m1
            r3.right = r4
            int r3 = r7 - r4
            float r3 = (float) r3
            r1.translate(r3, r9)
            android.graphics.Rect r3 = r0.f2144o1
            r1.drawBitmap(r2, r3, r3, r5)
            int r2 = r0.f2142m1
            int r7 = r7 - r2
            int r2 = -r7
            float r2 = (float) r2
            r1.translate(r2, r9)
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.HorizontalGridView.draw(android.graphics.Canvas):void");
    }

    public final boolean getFadingLeftEdge() {
        return this.f2133d1;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f2138i1;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f2139j1;
    }

    public final boolean getFadingRightEdge() {
        return this.f2134e1;
    }

    public final int getFadingRightEdgeLength() {
        return this.f2142m1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f2143n1;
    }

    public final void s0() {
        if (this.f2133d1 || this.f2134e1) {
            setLayerType(2, (Paint) null);
            setWillNotDraw(false);
            return;
        }
        setLayerType(0, (Paint) null);
        setWillNotDraw(true);
    }

    public final void setFadingLeftEdge(boolean z10) {
        if (this.f2133d1 != z10) {
            this.f2133d1 = z10;
            if (!z10) {
                this.f2136g1 = null;
            }
            invalidate();
            s0();
        }
    }

    public final void setFadingLeftEdgeLength(int i10) {
        if (this.f2138i1 != i10) {
            this.f2138i1 = i10;
            if (i10 != 0) {
                this.f2137h1 = new LinearGradient(0.0f, 0.0f, (float) this.f2138i1, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.f2137h1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i10) {
        if (this.f2139j1 != i10) {
            this.f2139j1 = i10;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z10) {
        if (this.f2134e1 != z10) {
            this.f2134e1 = z10;
            if (!z10) {
                this.f2140k1 = null;
            }
            invalidate();
            s0();
        }
    }

    public final void setFadingRightEdgeLength(int i10) {
        if (this.f2142m1 != i10) {
            this.f2142m1 = i10;
            if (i10 != 0) {
                this.f2141l1 = new LinearGradient(0.0f, 0.0f, (float) this.f2142m1, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            } else {
                this.f2141l1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i10) {
        if (this.f2143n1 != i10) {
            this.f2143n1 = i10;
            invalidate();
        }
    }

    public void setNumRows(int i10) {
        p pVar = this.T0;
        pVar.getClass();
        if (i10 >= 0) {
            pVar.V = i10;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(1) != null) {
            setRowHeight(typedArray.getLayoutDimension(1, 0));
        }
    }

    public void setRowHeight(int i10) {
        this.T0.P1(i10);
        requestLayout();
    }
}
