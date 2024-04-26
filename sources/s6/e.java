package s6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

/* compiled from: SubtitlePainter */
public final class e {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a  reason: collision with root package name */
    public final float f24972a;

    /* renamed from: b  reason: collision with root package name */
    public final float f24973b;

    /* renamed from: c  reason: collision with root package name */
    public final float f24974c;

    /* renamed from: d  reason: collision with root package name */
    public final float f24975d;

    /* renamed from: e  reason: collision with root package name */
    public final float f24976e;

    /* renamed from: f  reason: collision with root package name */
    public final TextPaint f24977f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f24978g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f24979h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f24980i;

    /* renamed from: j  reason: collision with root package name */
    public Layout.Alignment f24981j;

    /* renamed from: k  reason: collision with root package name */
    public Bitmap f24982k;

    /* renamed from: l  reason: collision with root package name */
    public float f24983l;

    /* renamed from: m  reason: collision with root package name */
    public int f24984m;

    /* renamed from: n  reason: collision with root package name */
    public int f24985n;

    /* renamed from: o  reason: collision with root package name */
    public float f24986o;

    /* renamed from: p  reason: collision with root package name */
    public int f24987p;

    /* renamed from: q  reason: collision with root package name */
    public float f24988q;

    /* renamed from: r  reason: collision with root package name */
    public float f24989r;

    /* renamed from: s  reason: collision with root package name */
    public int f24990s;

    /* renamed from: t  reason: collision with root package name */
    public int f24991t;

    /* renamed from: u  reason: collision with root package name */
    public int f24992u;

    /* renamed from: v  reason: collision with root package name */
    public int f24993v;

    /* renamed from: w  reason: collision with root package name */
    public int f24994w;

    /* renamed from: x  reason: collision with root package name */
    public float f24995x;

    /* renamed from: y  reason: collision with root package name */
    public float f24996y;

    /* renamed from: z  reason: collision with root package name */
    public float f24997z;

    public e(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f24976e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f24975d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f24972a = round;
        this.f24973b = round;
        this.f24974c = round;
        TextPaint textPaint = new TextPaint();
        this.f24977f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f24978g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f24979h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        int i10;
        if (z10) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate((float) this.G, (float) this.H);
                if (Color.alpha(this.f24992u) > 0) {
                    this.f24978g.setColor(this.f24992u);
                    canvas.drawRect((float) (-this.I), 0.0f, (float) (staticLayout.getWidth() + this.I), (float) staticLayout.getHeight(), this.f24978g);
                }
                int i11 = this.f24994w;
                boolean z11 = true;
                if (i11 == 1) {
                    this.f24977f.setStrokeJoin(Paint.Join.ROUND);
                    this.f24977f.setStrokeWidth(this.f24972a);
                    this.f24977f.setColor(this.f24993v);
                    this.f24977f.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else if (i11 == 2) {
                    TextPaint textPaint = this.f24977f;
                    float f10 = this.f24973b;
                    float f11 = this.f24974c;
                    textPaint.setShadowLayer(f10, f11, f11, this.f24993v);
                } else if (i11 == 3 || i11 == 4) {
                    if (i11 != 3) {
                        z11 = false;
                    }
                    int i12 = -1;
                    if (z11) {
                        i10 = -1;
                    } else {
                        i10 = this.f24993v;
                    }
                    if (z11) {
                        i12 = this.f24993v;
                    }
                    float f12 = this.f24973b / 2.0f;
                    this.f24977f.setColor(this.f24990s);
                    this.f24977f.setStyle(Paint.Style.FILL);
                    float f13 = -f12;
                    this.f24977f.setShadowLayer(this.f24973b, f13, f13, i10);
                    staticLayout2.draw(canvas);
                    this.f24977f.setShadowLayer(this.f24973b, f12, f12, i12);
                }
                this.f24977f.setColor(this.f24990s);
                this.f24977f.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                this.f24977f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.f24982k.getClass();
        canvas.drawBitmap(this.f24982k, (Rect) null, this.J, this.f24979h);
    }
}
