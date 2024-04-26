package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.a;
import com.startapp.startappsdk.R;
import e.l;

/* compiled from: DrawerArrowDrawable */
public class f extends Drawable {

    /* renamed from: l  reason: collision with root package name */
    public static final float f18756l = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    public final Paint f18757a;

    /* renamed from: b  reason: collision with root package name */
    public float f18758b;

    /* renamed from: c  reason: collision with root package name */
    public float f18759c;

    /* renamed from: d  reason: collision with root package name */
    public float f18760d;

    /* renamed from: e  reason: collision with root package name */
    public float f18761e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18762f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f18763g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final int f18764h;

    /* renamed from: i  reason: collision with root package name */
    public float f18765i;

    /* renamed from: j  reason: collision with root package name */
    public float f18766j;

    /* renamed from: k  reason: collision with root package name */
    public int f18767k = 2;

    public f(Context context) {
        Paint paint = new Paint();
        this.f18757a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, l.f13514n, R.attr.drawerArrowStyle, 2132082889);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            double d10 = (double) (dimension / 2.0f);
            double cos = Math.cos((double) f18756l);
            Double.isNaN(d10);
            Double.isNaN(d10);
            Double.isNaN(d10);
            this.f18766j = (float) (cos * d10);
            invalidateSelf();
        }
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f18762f != z10) {
            this.f18762f = z10;
            invalidateSelf();
        }
        float round = (float) Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f18761e) {
            this.f18761e = round;
            invalidateSelf();
        }
        this.f18764h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f18759c = (float) Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f18758b = (float) Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f18760d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f10, float f11, float f12) {
        return e.a(f11, f10, f12, f10);
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i10 = this.f18767k;
        boolean z10 = i10 != 0 && (i10 == 1 || (i10 == 3 ? a.e(this) == 0 : a.e(this) == 1));
        float f10 = this.f18758b;
        float a10 = a(this.f18759c, (float) Math.sqrt((double) (f10 * f10 * 2.0f)), this.f18765i);
        float a11 = a(this.f18759c, this.f18760d, this.f18765i);
        float round = (float) Math.round(a(0.0f, this.f18766j, this.f18765i));
        float a12 = a(0.0f, f18756l, this.f18765i);
        float a13 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f18765i);
        double d10 = (double) a10;
        double d11 = (double) a12;
        double cos = Math.cos(d11);
        Double.isNaN(d10);
        float f11 = a13;
        float round2 = (float) Math.round(cos * d10);
        double sin = Math.sin(d11);
        Double.isNaN(d10);
        float round3 = (float) Math.round(sin * d10);
        this.f18763g.rewind();
        float a14 = a(this.f18757a.getStrokeWidth() + this.f18761e, -this.f18766j, this.f18765i);
        float f12 = (-a11) / 2.0f;
        this.f18763g.moveTo(f12 + round, 0.0f);
        this.f18763g.rLineTo(a11 - (round * 2.0f), 0.0f);
        this.f18763g.moveTo(f12, a14);
        this.f18763g.rLineTo(round2, round3);
        this.f18763g.moveTo(f12, -a14);
        this.f18763g.rLineTo(round2, -round3);
        this.f18763g.close();
        canvas.save();
        float strokeWidth = this.f18757a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f13 = this.f18761e;
        canvas2.translate((float) bounds.centerX(), (strokeWidth * 1.5f) + f13 + ((float) ((((int) (height - (2.0f * f13))) / 4) * 2)));
        if (this.f18762f) {
            canvas2.rotate(f11 * ((float) (false ^ z10 ? -1 : 1)));
        } else if (z10) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f18763g, this.f18757a);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.f18764h;
    }

    public int getIntrinsicWidth() {
        return this.f18764h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i10) {
        if (i10 != this.f18757a.getAlpha()) {
            this.f18757a.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f18757a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f18765i != f10) {
            this.f18765i = f10;
            invalidateSelf();
        }
    }
}
