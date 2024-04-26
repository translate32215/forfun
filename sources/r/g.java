package r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
public class g extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f24448a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f24449b;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f24450c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f24451d;

    /* renamed from: e  reason: collision with root package name */
    public float f24452e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24453f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24454g = true;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f24455h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f24456i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f24457j;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f24458k = PorterDuff.Mode.SRC_IN;

    public g(ColorStateList colorStateList, float f10) {
        this.f24448a = f10;
        this.f24449b = new Paint(5);
        b(colorStateList);
        this.f24450c = new RectF();
        this.f24451d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f24455h = colorStateList;
        this.f24449b.setColor(colorStateList.getColorForState(getState(), this.f24455h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f24450c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f24451d.set(rect);
        if (this.f24453f) {
            float b10 = h.b(this.f24452e, this.f24448a, this.f24454g);
            this.f24451d.inset((int) Math.ceil((double) h.a(this.f24452e, this.f24448a, this.f24454g)), (int) Math.ceil((double) b10));
            this.f24450c.set(this.f24451d);
        }
    }

    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f24449b;
        if (this.f24456i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f24456i);
            z10 = true;
        }
        RectF rectF = this.f24450c;
        float f10 = this.f24448a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f24451d, this.f24448a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f24455h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f24457j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f24455h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.g.isStateful():boolean");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f24455h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f24449b.getColor();
        if (z10) {
            this.f24449b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f24457j;
        if (colorStateList2 == null || (mode = this.f24458k) == null) {
            return z10;
        }
        this.f24456i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i10) {
        this.f24449b.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24449b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f24457j = colorStateList;
        this.f24456i = a(colorStateList, this.f24458k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f24458k = mode;
        this.f24456i = a(this.f24457j, mode);
        invalidateSelf();
    }
}
