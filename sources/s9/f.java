package s9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import e.d;
import java.util.BitSet;
import s9.j;
import s9.l;

/* compiled from: MaterialShapeDrawable */
public class f extends Drawable implements h0.a, m {
    public static final String F = f.class.getSimpleName();
    public static final Paint G;
    public PorterDuffColorFilter A;
    public PorterDuffColorFilter B;
    public int C;
    public final RectF D;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public b f25079a;

    /* renamed from: b  reason: collision with root package name */
    public final l.f[] f25080b;

    /* renamed from: c  reason: collision with root package name */
    public final l.f[] f25081c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f25082d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25083e;

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f25084f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f25085g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f25086h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f25087i;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f25088r;

    /* renamed from: s  reason: collision with root package name */
    public final Region f25089s;

    /* renamed from: t  reason: collision with root package name */
    public final Region f25090t;

    /* renamed from: u  reason: collision with root package name */
    public i f25091u;

    /* renamed from: v  reason: collision with root package name */
    public final Paint f25092v;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f25093w;

    /* renamed from: x  reason: collision with root package name */
    public final r9.a f25094x;

    /* renamed from: y  reason: collision with root package name */
    public final j.b f25095y;

    /* renamed from: z  reason: collision with root package name */
    public final j f25096z;

    /* compiled from: MaterialShapeDrawable */
    public class a implements j.b {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        G = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.f25079a.f25107j != 1.0f) {
            this.f25084f.reset();
            Matrix matrix = this.f25084f;
            float f10 = this.f25079a.f25107j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f25084f);
        }
        path.computeBounds(this.D, true);
    }

    public final void c(RectF rectF, Path path) {
        j jVar = this.f25096z;
        b bVar = this.f25079a;
        i iVar = bVar.f25098a;
        float f10 = bVar.f25108k;
        jVar.b(iVar, f10, rectF, this.f25095y, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList == null || mode == null) {
            if (z10) {
                int color = paint.getColor();
                int e10 = e(color);
                this.C = e10;
                if (e10 != color) {
                    porterDuffColorFilter = new PorterDuffColorFilter(e10, PorterDuff.Mode.SRC_IN);
                    return porterDuffColorFilter;
                }
            }
            porterDuffColorFilter = null;
            return porterDuffColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = e(colorForState);
        }
        this.C = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ef, code lost:
        if ((r2 < 21 || (!p() && !r10.f25085g.isConvex() && r2 < 29)) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.Paint r0 = r10.f25092v
            android.graphics.PorterDuffColorFilter r1 = r10.A
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r10.f25092v
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r10.f25092v
            s9.f$b r2 = r10.f25079a
            int r2 = r2.f25110m
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r10.f25093w
            android.graphics.PorterDuffColorFilter r2 = r10.B
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r10.f25093w
            s9.f$b r2 = r10.f25079a
            float r2 = r2.f25109l
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r10.f25093w
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r10.f25093w
            s9.f$b r3 = r10.f25079a
            int r3 = r3.f25110m
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r10.f25083e
            r3 = 0
            if (r2 == 0) goto L_0x00c5
            float r2 = r10.l()
            float r2 = -r2
            s9.f$b r4 = r10.f25079a
            s9.i r4 = r4.f25098a
            r4.getClass()
            s9.i$b r5 = new s9.i$b
            r5.<init>(r4)
            s9.c r6 = r4.f25125e
            boolean r7 = r6 instanceof s9.g
            if (r7 == 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            s9.b r7 = new s9.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0066:
            r5.f25137e = r6
            s9.c r6 = r4.f25126f
            boolean r7 = r6 instanceof s9.g
            if (r7 == 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            s9.b r7 = new s9.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0075:
            r5.f25138f = r6
            s9.c r6 = r4.f25128h
            boolean r7 = r6 instanceof s9.g
            if (r7 == 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            s9.b r7 = new s9.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0084:
            r5.f25140h = r6
            s9.c r4 = r4.f25127g
            boolean r6 = r4 instanceof s9.g
            if (r6 == 0) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            s9.b r6 = new s9.b
            r6.<init>(r2, r4)
            r4 = r6
        L_0x0093:
            r5.f25139g = r4
            s9.i r2 = r5.a()
            r10.f25091u = r2
            s9.j r4 = r10.f25096z
            s9.f$b r5 = r10.f25079a
            float r5 = r5.f25108k
            android.graphics.RectF r6 = r10.f25088r
            android.graphics.RectF r7 = r10.i()
            r6.set(r7)
            float r6 = r10.l()
            android.graphics.RectF r7 = r10.f25088r
            r7.inset(r6, r6)
            android.graphics.RectF r6 = r10.f25088r
            android.graphics.Path r7 = r10.f25086h
            r4.a(r2, r5, r6, r7)
            android.graphics.RectF r2 = r10.i()
            android.graphics.Path r4 = r10.f25085g
            r10.b(r2, r4)
            r10.f25083e = r3
        L_0x00c5:
            s9.f$b r2 = r10.f25079a
            int r4 = r2.f25114q
            r5 = 21
            r6 = 2
            r7 = 1
            if (r4 == r7) goto L_0x00f3
            int r2 = r2.f25115r
            if (r2 <= 0) goto L_0x00f3
            if (r4 == r6) goto L_0x00f1
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L_0x00ee
            boolean r4 = r10.p()
            if (r4 != 0) goto L_0x00ec
            android.graphics.Path r4 = r10.f25085g
            boolean r4 = r4.isConvex()
            if (r4 != 0) goto L_0x00ec
            r4 = 29
            if (r2 >= r4) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r2 = 0
            goto L_0x00ef
        L_0x00ee:
            r2 = 1
        L_0x00ef:
            if (r2 == 0) goto L_0x00f3
        L_0x00f1:
            r2 = 1
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            if (r2 != 0) goto L_0x00f8
            goto L_0x01ab
        L_0x00f8:
            r11.save()
            int r2 = r10.j()
            int r4 = r10.k()
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 >= r5) goto L_0x011f
            boolean r5 = r10.E
            if (r5 == 0) goto L_0x011f
            android.graphics.Rect r5 = r11.getClipBounds()
            s9.f$b r8 = r10.f25079a
            int r8 = r8.f25115r
            int r8 = -r8
            r5.inset(r8, r8)
            r5.offset(r2, r4)
            android.graphics.Region$Op r8 = android.graphics.Region.Op.REPLACE
            r11.clipRect(r5, r8)
        L_0x011f:
            float r2 = (float) r2
            float r4 = (float) r4
            r11.translate(r2, r4)
            boolean r2 = r10.E
            if (r2 != 0) goto L_0x0130
            r10.f(r11)
            r11.restore()
            goto L_0x01ab
        L_0x0130:
            android.graphics.RectF r2 = r10.D
            float r2 = r2.width()
            android.graphics.Rect r4 = r10.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            float r2 = r2 - r4
            int r2 = (int) r2
            android.graphics.RectF r4 = r10.D
            float r4 = r4.height()
            android.graphics.Rect r5 = r10.getBounds()
            int r5 = r5.height()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r4 = (int) r4
            if (r2 < 0) goto L_0x01dd
            if (r4 < 0) goto L_0x01dd
            android.graphics.RectF r5 = r10.D
            float r5 = r5.width()
            int r5 = (int) r5
            s9.f$b r8 = r10.f25079a
            int r8 = r8.f25115r
            int r8 = r8 * 2
            int r8 = r8 + r5
            int r8 = r8 + r2
            android.graphics.RectF r5 = r10.D
            float r5 = r5.height()
            int r5 = (int) r5
            s9.f$b r9 = r10.f25079a
            int r9 = r9.f25115r
            int r9 = r9 * 2
            int r9 = r9 + r5
            int r9 = r9 + r4
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r9, r5)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r5)
            android.graphics.Rect r8 = r10.getBounds()
            int r8 = r8.left
            s9.f$b r9 = r10.f25079a
            int r9 = r9.f25115r
            int r8 = r8 - r9
            int r8 = r8 - r2
            float r2 = (float) r8
            android.graphics.Rect r8 = r10.getBounds()
            int r8 = r8.top
            s9.f$b r9 = r10.f25079a
            int r9 = r9.f25115r
            int r8 = r8 - r9
            int r8 = r8 - r4
            float r4 = (float) r8
            float r8 = -r2
            float r9 = -r4
            r6.translate(r8, r9)
            r10.f(r6)
            r6 = 0
            r11.drawBitmap(r5, r2, r4, r6)
            r5.recycle()
            r11.restore()
        L_0x01ab:
            s9.f$b r2 = r10.f25079a
            android.graphics.Paint$Style r4 = r2.f25119v
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r4 == r5) goto L_0x01b7
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            if (r4 != r5) goto L_0x01b8
        L_0x01b7:
            r3 = 1
        L_0x01b8:
            if (r3 == 0) goto L_0x01c9
            android.graphics.Paint r6 = r10.f25092v
            android.graphics.Path r7 = r10.f25085g
            s9.i r8 = r2.f25098a
            android.graphics.RectF r9 = r10.i()
            r4 = r10
            r5 = r11
            r4.g(r5, r6, r7, r8, r9)
        L_0x01c9:
            boolean r2 = r10.n()
            if (r2 == 0) goto L_0x01d2
            r10.h(r11)
        L_0x01d2:
            android.graphics.Paint r11 = r10.f25092v
            r11.setAlpha(r0)
            android.graphics.Paint r11 = r10.f25093w
            r11.setAlpha(r1)
            return
        L_0x01dd:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.f.draw(android.graphics.Canvas):void");
    }

    public int e(int i10) {
        int i11;
        b bVar = this.f25079a;
        float f10 = bVar.f25112o + bVar.f25113p + bVar.f25111n;
        i9.a aVar = bVar.f25099b;
        if (aVar == null || !aVar.f19342a) {
            return i10;
        }
        if (!(g0.a.e(i10, 255) == aVar.f19345d)) {
            return i10;
        }
        float f11 = aVar.f19346e;
        float min = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i10);
        int k10 = d.k(g0.a.e(i10, 255), aVar.f19343b, min);
        if (min > 0.0f && (i11 = aVar.f19344c) != 0) {
            k10 = g0.a.b(g0.a.e(i11, i9.a.f19341f), k10);
        }
        return g0.a.e(k10, alpha);
    }

    public final void f(Canvas canvas) {
        if (this.f25082d.cardinality() > 0) {
            Log.w(F, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f25079a.f25116s != 0) {
            canvas.drawPath(this.f25085g, this.f25094x.f24757a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            l.f fVar = this.f25080b[i10];
            r9.a aVar = this.f25094x;
            int i11 = this.f25079a.f25115r;
            Matrix matrix = l.f.f25182a;
            fVar.a(matrix, aVar, i11, canvas);
            this.f25081c[i10].a(matrix, this.f25094x, this.f25079a.f25115r, canvas);
        }
        if (this.E) {
            int j10 = j();
            int k10 = k();
            canvas.translate((float) (-j10), (float) (-k10));
            canvas.drawPath(this.f25085g, G);
            canvas.translate((float) j10, (float) k10);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (iVar.e(rectF)) {
            float a10 = iVar.f25126f.a(rectF) * this.f25079a.f25108k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public int getAlpha() {
        return this.f25079a.f25110m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f25079a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f25079a.f25114q != 2) {
            if (p()) {
                outline.setRoundRect(getBounds(), m() * this.f25079a.f25108k);
                return;
            }
            b(i(), this.f25085g);
            if (this.f25085g.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f25085g);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f25079a.f25106i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f25089s.set(getBounds());
        b(i(), this.f25085g);
        this.f25090t.setPath(this.f25085g, this.f25089s);
        this.f25089s.op(this.f25090t, Region.Op.DIFFERENCE);
        return this.f25089s;
    }

    public void h(Canvas canvas) {
        Paint paint = this.f25093w;
        Path path = this.f25086h;
        i iVar = this.f25091u;
        this.f25088r.set(i());
        float l10 = l();
        this.f25088r.inset(l10, l10);
        g(canvas, paint, path, iVar, this.f25088r);
    }

    public RectF i() {
        this.f25087i.set(getBounds());
        return this.f25087i;
    }

    public void invalidateSelf() {
        this.f25083e = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f25079a.f25102e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f25079a.f25101d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f25079a.f25104g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f25079a.f25103f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            s9.f$b r0 = r1.f25079a
            android.content.res.ColorStateList r0 = r0.f25104g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            s9.f$b r0 = r1.f25079a
            android.content.res.ColorStateList r0 = r0.f25103f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            s9.f$b r0 = r1.f25079a
            android.content.res.ColorStateList r0 = r0.f25102e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            s9.f$b r0 = r1.f25079a
            android.content.res.ColorStateList r0 = r0.f25101d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.f.isStateful():boolean");
    }

    public int j() {
        b bVar = this.f25079a;
        double d10 = (double) bVar.f25116s;
        double sin = Math.sin(Math.toRadians((double) bVar.f25117t));
        Double.isNaN(d10);
        return (int) (sin * d10);
    }

    public int k() {
        b bVar = this.f25079a;
        double d10 = (double) bVar.f25116s;
        double cos = Math.cos(Math.toRadians((double) bVar.f25117t));
        Double.isNaN(d10);
        return (int) (cos * d10);
    }

    public final float l() {
        if (n()) {
            return this.f25093w.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float m() {
        return this.f25079a.f25098a.f25125e.a(i());
    }

    public Drawable mutate() {
        this.f25079a = new b(this.f25079a);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.f25079a.f25119v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f25093w.getStrokeWidth() > 0.0f;
    }

    public void o(Context context) {
        this.f25079a.f25099b = new i9.a(context);
        z();
    }

    public void onBoundsChange(Rect rect) {
        this.f25083e = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z10 = x(iArr) || y();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public boolean p() {
        return this.f25079a.f25098a.e(i());
    }

    public void q(float f10) {
        b bVar = this.f25079a;
        if (bVar.f25112o != f10) {
            bVar.f25112o = f10;
            z();
        }
    }

    public void r(ColorStateList colorStateList) {
        b bVar = this.f25079a;
        if (bVar.f25101d != colorStateList) {
            bVar.f25101d = colorStateList;
            onStateChange(getState());
        }
    }

    public void s(float f10) {
        b bVar = this.f25079a;
        if (bVar.f25108k != f10) {
            bVar.f25108k = f10;
            this.f25083e = true;
            invalidateSelf();
        }
    }

    public void setAlpha(int i10) {
        b bVar = this.f25079a;
        if (bVar.f25110m != i10) {
            bVar.f25110m = i10;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f25079a.f25100c = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(i iVar) {
        this.f25079a.f25098a = iVar;
        invalidateSelf();
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f25079a.f25104g = colorStateList;
        y();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f25079a;
        if (bVar.f25105h != mode) {
            bVar.f25105h = mode;
            y();
            super.invalidateSelf();
        }
    }

    public void t(int i10) {
        this.f25094x.a(i10);
        this.f25079a.f25118u = false;
        super.invalidateSelf();
    }

    public void u(float f10, int i10) {
        this.f25079a.f25109l = f10;
        invalidateSelf();
        w(ColorStateList.valueOf(i10));
    }

    public void v(float f10, ColorStateList colorStateList) {
        this.f25079a.f25109l = f10;
        invalidateSelf();
        w(colorStateList);
    }

    public void w(ColorStateList colorStateList) {
        b bVar = this.f25079a;
        if (bVar.f25102e != colorStateList) {
            bVar.f25102e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean x(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f25079a.f25101d == null || (color2 = this.f25092v.getColor()) == (colorForState2 = this.f25079a.f25101d.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            this.f25092v.setColor(colorForState2);
            z10 = true;
        }
        if (this.f25079a.f25102e == null || (color = this.f25093w.getColor()) == (colorForState = this.f25079a.f25102e.getColorForState(iArr, color))) {
            return z10;
        }
        this.f25093w.setColor(colorForState);
        return true;
    }

    public final boolean y() {
        PorterDuffColorFilter porterDuffColorFilter = this.A;
        PorterDuffColorFilter porterDuffColorFilter2 = this.B;
        b bVar = this.f25079a;
        this.A = d(bVar.f25104g, bVar.f25105h, this.f25092v, true);
        b bVar2 = this.f25079a;
        this.B = d(bVar2.f25103f, bVar2.f25105h, this.f25093w, false);
        b bVar3 = this.f25079a;
        if (bVar3.f25118u) {
            this.f25094x.a(bVar3.f25104g.getColorForState(getState(), 0));
        }
        if (!n0.b.a(porterDuffColorFilter, this.A) || !n0.b.a(porterDuffColorFilter2, this.B)) {
            return true;
        }
        return false;
    }

    public final void z() {
        b bVar = this.f25079a;
        float f10 = bVar.f25112o + bVar.f25113p;
        bVar.f25115r = (int) Math.ceil((double) (0.75f * f10));
        this.f25079a.f25116s = (int) Math.ceil((double) (f10 * 0.25f));
        y();
        super.invalidateSelf();
    }

    public f(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(i.c(context, (AttributeSet) null, i10, i11).a());
    }

    public f(i iVar) {
        this(new b(iVar, (i9.a) null));
    }

    public f(b bVar) {
        j jVar;
        this.f25080b = new l.f[4];
        this.f25081c = new l.f[4];
        this.f25082d = new BitSet(8);
        this.f25084f = new Matrix();
        this.f25085g = new Path();
        this.f25086h = new Path();
        this.f25087i = new RectF();
        this.f25088r = new RectF();
        this.f25089s = new Region();
        this.f25090t = new Region();
        Paint paint = new Paint(1);
        this.f25092v = paint;
        Paint paint2 = new Paint(1);
        this.f25093w = paint2;
        this.f25094x = new r9.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f25157a;
        } else {
            jVar = new j();
        }
        this.f25096z = jVar;
        this.D = new RectF();
        this.E = true;
        this.f25079a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        y();
        x(getState());
        this.f25095y = new a();
    }

    /* compiled from: MaterialShapeDrawable */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f25098a;

        /* renamed from: b  reason: collision with root package name */
        public i9.a f25099b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f25100c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f25101d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f25102e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f25103f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f25104g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f25105h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        public Rect f25106i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f25107j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f25108k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f25109l;

        /* renamed from: m  reason: collision with root package name */
        public int f25110m = 255;

        /* renamed from: n  reason: collision with root package name */
        public float f25111n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f25112o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public float f25113p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        public int f25114q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f25115r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f25116s = 0;

        /* renamed from: t  reason: collision with root package name */
        public int f25117t = 0;

        /* renamed from: u  reason: collision with root package name */
        public boolean f25118u = false;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f25119v = Paint.Style.FILL_AND_STROKE;

        public b(i iVar, i9.a aVar) {
            this.f25098a = iVar;
            this.f25099b = null;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f25083e = true;
            return fVar;
        }

        public b(b bVar) {
            this.f25098a = bVar.f25098a;
            this.f25099b = bVar.f25099b;
            this.f25109l = bVar.f25109l;
            this.f25100c = bVar.f25100c;
            this.f25101d = bVar.f25101d;
            this.f25102e = bVar.f25102e;
            this.f25105h = bVar.f25105h;
            this.f25104g = bVar.f25104g;
            this.f25110m = bVar.f25110m;
            this.f25107j = bVar.f25107j;
            this.f25116s = bVar.f25116s;
            this.f25114q = bVar.f25114q;
            this.f25118u = bVar.f25118u;
            this.f25108k = bVar.f25108k;
            this.f25111n = bVar.f25111n;
            this.f25112o = bVar.f25112o;
            this.f25113p = bVar.f25113p;
            this.f25115r = bVar.f25115r;
            this.f25117t = bVar.f25117t;
            this.f25103f = bVar.f25103f;
            this.f25119v = bVar.f25119v;
            if (bVar.f25106i != null) {
                this.f25106i = new Rect(bVar.f25106i);
            }
        }
    }
}
