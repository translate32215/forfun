package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.startapp.startappsdk.R;

public final class SeekBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f2255a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f2256b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public final RectF f2257c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public final Paint f2258d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f2259e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f2260f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f2261g;

    /* renamed from: h  reason: collision with root package name */
    public int f2262h;

    /* renamed from: i  reason: collision with root package name */
    public int f2263i;

    /* renamed from: r  reason: collision with root package name */
    public int f2264r;

    /* renamed from: s  reason: collision with root package name */
    public int f2265s;

    /* renamed from: t  reason: collision with root package name */
    public int f2266t;

    /* renamed from: u  reason: collision with root package name */
    public int f2267u;

    /* renamed from: v  reason: collision with root package name */
    public int f2268v;

    public static abstract class a {
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f2258d = paint;
        Paint paint2 = new Paint(1);
        this.f2259e = paint2;
        Paint paint3 = new Paint(1);
        this.f2260f = paint3;
        Paint paint4 = new Paint(1);
        this.f2261g = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.f2267u = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.f2268v = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.f2266t = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    public final void a() {
        int i10 = isFocused() ? this.f2268v : this.f2267u;
        int width = getWidth();
        int height = getHeight();
        int i11 = (height - i10) / 2;
        RectF rectF = this.f2257c;
        int i12 = this.f2267u;
        float f10 = (float) i11;
        float f11 = (float) (height - i11);
        rectF.set((float) (i12 / 2), f10, (float) (width - (i12 / 2)), f11);
        int i13 = isFocused() ? this.f2266t : this.f2267u / 2;
        float f12 = (float) (width - (i13 * 2));
        float f13 = (((float) this.f2262h) / ((float) this.f2264r)) * f12;
        RectF rectF2 = this.f2255a;
        int i14 = this.f2267u;
        rectF2.set((float) (i14 / 2), f10, ((float) (i14 / 2)) + f13, f11);
        this.f2256b.set(this.f2255a.right, f10, ((float) (this.f2267u / 2)) + ((((float) this.f2263i) / ((float) this.f2264r)) * f12), f11);
        this.f2265s = i13 + ((int) f13);
        invalidate();
    }

    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f2264r;
    }

    public int getProgress() {
        return this.f2262h;
    }

    public int getSecondProgress() {
        return this.f2263i;
    }

    public int getSecondaryProgressColor() {
        return this.f2258d.getColor();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = (float) (isFocused() ? this.f2266t : this.f2267u / 2);
        canvas.drawRoundRect(this.f2257c, f10, f10, this.f2260f);
        RectF rectF = this.f2256b;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f10, f10, this.f2258d);
        }
        canvas.drawRoundRect(this.f2255a, f10, f10, this.f2259e);
        canvas.drawCircle((float) this.f2265s, (float) (getHeight() / 2), f10, this.f2261g);
    }

    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a();
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAccessibilitySeekListener(a aVar) {
    }

    public void setActiveBarHeight(int i10) {
        this.f2268v = i10;
        a();
    }

    public void setActiveRadius(int i10) {
        this.f2266t = i10;
        a();
    }

    public void setBarHeight(int i10) {
        this.f2267u = i10;
        a();
    }

    public void setMax(int i10) {
        this.f2264r = i10;
        a();
    }

    public void setProgress(int i10) {
        int i11 = this.f2264r;
        if (i10 > i11) {
            i10 = i11;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f2262h = i10;
        a();
    }

    public void setProgressColor(int i10) {
        this.f2259e.setColor(i10);
    }

    public void setSecondaryProgress(int i10) {
        int i11 = this.f2264r;
        if (i10 > i11) {
            i10 = i11;
        } else if (i10 < 0) {
            i10 = 0;
        }
        this.f2263i = i10;
        a();
    }

    public void setSecondaryProgressColor(int i10) {
        this.f2258d.setColor(i10);
    }
}
