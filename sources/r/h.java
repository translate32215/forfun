package r;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.startapp.startappsdk.R;

/* compiled from: RoundRectDrawableWithShadow */
public class h extends Drawable {

    /* renamed from: q  reason: collision with root package name */
    public static final double f24459q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r  reason: collision with root package name */
    public static a f24460r;

    /* renamed from: a  reason: collision with root package name */
    public final int f24461a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f24462b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f24463c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f24464d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f24465e;

    /* renamed from: f  reason: collision with root package name */
    public float f24466f;

    /* renamed from: g  reason: collision with root package name */
    public Path f24467g;

    /* renamed from: h  reason: collision with root package name */
    public float f24468h;

    /* renamed from: i  reason: collision with root package name */
    public float f24469i;

    /* renamed from: j  reason: collision with root package name */
    public float f24470j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f24471k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f24472l = true;

    /* renamed from: m  reason: collision with root package name */
    public final int f24473m;

    /* renamed from: n  reason: collision with root package name */
    public final int f24474n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f24475o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f24476p = false;

    /* compiled from: RoundRectDrawableWithShadow */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    public h(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f24473m = resources.getColor(R.color.cardview_shadow_start_color);
        this.f24474n = resources.getColor(R.color.cardview_shadow_end_color);
        this.f24461a = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        this.f24462b = new Paint(5);
        c(colorStateList);
        Paint paint = new Paint(5);
        this.f24463c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f24466f = (float) ((int) (f10 + 0.5f));
        this.f24465e = new RectF();
        Paint paint2 = new Paint(this.f24463c);
        this.f24464d = paint2;
        paint2.setAntiAlias(false);
        d(f11, f12);
    }

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10;
        }
        double d10 = (double) f10;
        double d11 = (double) f11;
        Double.isNaN(d11);
        Double.isNaN(d10);
        return (float) (((1.0d - f24459q) * d11) + d10);
    }

    public static float b(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10 * 1.5f;
        }
        double d10 = (double) (f10 * 1.5f);
        double d11 = (double) f11;
        Double.isNaN(d11);
        Double.isNaN(d10);
        return (float) (((1.0d - f24459q) * d11) + d10);
    }

    public final void c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f24471k = colorStateList;
        this.f24462b.setColor(colorStateList.getColorForState(getState(), this.f24471k.getDefaultColor()));
    }

    public final void d(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        } else if (f11 >= 0.0f) {
            int i10 = (int) (f10 + 0.5f);
            if (i10 % 2 == 1) {
                i10--;
            }
            float f12 = (float) i10;
            int i11 = (int) (f11 + 0.5f);
            if (i11 % 2 == 1) {
                i11--;
            }
            float f13 = (float) i11;
            if (f12 > f13) {
                if (!this.f24476p) {
                    this.f24476p = true;
                }
                f12 = f13;
            }
            if (this.f24470j != f12 || this.f24468h != f13) {
                this.f24470j = f12;
                this.f24468h = f13;
                this.f24469i = (float) ((int) ((f12 * 1.5f) + ((float) this.f24461a) + 0.5f));
                this.f24472l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
    }

    public void draw(Canvas canvas) {
        int i10;
        Canvas canvas2 = canvas;
        if (this.f24472l) {
            Rect bounds = getBounds();
            float f10 = this.f24468h;
            float f11 = 1.5f * f10;
            this.f24465e.set(((float) bounds.left) + f10, ((float) bounds.top) + f11, ((float) bounds.right) - f10, ((float) bounds.bottom) - f11);
            float f12 = this.f24466f;
            float f13 = -f12;
            RectF rectF = new RectF(f13, f13, f12, f12);
            RectF rectF2 = new RectF(rectF);
            float f14 = -this.f24469i;
            rectF2.inset(f14, f14);
            Path path = this.f24467g;
            if (path == null) {
                this.f24467g = new Path();
            } else {
                path.reset();
            }
            this.f24467g.setFillType(Path.FillType.EVEN_ODD);
            this.f24467g.moveTo(-this.f24466f, 0.0f);
            this.f24467g.rLineTo(-this.f24469i, 0.0f);
            this.f24467g.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f24467g.arcTo(rectF, 270.0f, -90.0f, false);
            this.f24467g.close();
            float f15 = this.f24466f;
            float f16 = f15 / (this.f24469i + f15);
            Paint paint = this.f24463c;
            float f17 = this.f24466f + this.f24469i;
            int i11 = this.f24473m;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f17, new int[]{i11, i11, this.f24474n}, new float[]{0.0f, f16, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f24464d;
            float f18 = -this.f24466f;
            float f19 = this.f24469i;
            float f20 = f18 + f19;
            float f21 = f18 - f19;
            int i12 = this.f24473m;
            paint2.setShader(new LinearGradient(0.0f, f20, 0.0f, f21, new int[]{i12, i12, this.f24474n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f24464d.setAntiAlias(false);
            this.f24472l = false;
        }
        canvas2.translate(0.0f, this.f24470j / 2.0f);
        float f22 = this.f24466f;
        float f23 = (-f22) - this.f24469i;
        float f24 = (this.f24470j / 2.0f) + f22 + ((float) this.f24461a);
        float f25 = f24 * 2.0f;
        boolean z10 = this.f24465e.width() - f25 > 0.0f;
        boolean z11 = this.f24465e.height() - f25 > 0.0f;
        int save = canvas.save();
        RectF rectF3 = this.f24465e;
        canvas2.translate(rectF3.left + f24, rectF3.top + f24);
        canvas2.drawPath(this.f24467g, this.f24463c);
        if (z10) {
            i10 = save;
            canvas.drawRect(0.0f, f23, this.f24465e.width() - f25, -this.f24466f, this.f24464d);
        } else {
            i10 = save;
        }
        canvas2.restoreToCount(i10);
        int save2 = canvas.save();
        RectF rectF4 = this.f24465e;
        canvas2.translate(rectF4.right - f24, rectF4.bottom - f24);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f24467g, this.f24463c);
        if (z10) {
            canvas.drawRect(0.0f, f23, this.f24465e.width() - f25, (-this.f24466f) + this.f24469i, this.f24464d);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF5 = this.f24465e;
        canvas2.translate(rectF5.left + f24, rectF5.bottom - f24);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f24467g, this.f24463c);
        if (z11) {
            canvas.drawRect(0.0f, f23, this.f24465e.height() - f25, -this.f24466f, this.f24464d);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF6 = this.f24465e;
        canvas2.translate(rectF6.right - f24, rectF6.top + f24);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f24467g, this.f24463c);
        if (z11) {
            canvas.drawRect(0.0f, f23, this.f24465e.height() - f25, -this.f24466f, this.f24464d);
        }
        canvas2.restoreToCount(save4);
        canvas2.translate(0.0f, (-this.f24470j) / 2.0f);
        f24460r.a(canvas2, this.f24465e, this.f24466f, this.f24462b);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) b(this.f24468h, this.f24466f, this.f24475o));
        int ceil2 = (int) Math.ceil((double) a(this.f24468h, this.f24466f, this.f24475o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f24471k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f24472l = true;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f24471k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f24462b.getColor() == colorForState) {
            return false;
        }
        this.f24462b.setColor(colorForState);
        this.f24472l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i10) {
        this.f24462b.setAlpha(i10);
        this.f24463c.setAlpha(i10);
        this.f24464d.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24462b.setColorFilter(colorFilter);
    }
}
