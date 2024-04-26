package x3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import e.e;
import x3.g;

/* compiled from: GifDrawable */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final a f27305a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27306b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27307c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27308d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27309e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f27310f;

    /* renamed from: g  reason: collision with root package name */
    public int f27311g = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f27312h;

    /* renamed from: i  reason: collision with root package name */
    public Paint f27313i;

    /* renamed from: r  reason: collision with root package name */
    public Rect f27314r;

    /* compiled from: GifDrawable */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final g f27315a;

        public a(g gVar) {
            this.f27315a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new c(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(a aVar) {
        this.f27305a = aVar;
    }

    public void a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        g gVar = this.f27305a.f27315a;
        g.a aVar = gVar.f27325i;
        if ((aVar != null ? aVar.f27335e : -1) == gVar.f27317a.d() - 1) {
            this.f27310f++;
        }
        int i10 = this.f27311g;
        if (i10 != -1 && this.f27310f >= i10) {
            stop();
        }
    }

    public Bitmap b() {
        return this.f27305a.f27315a.f27328l;
    }

    public final Paint c() {
        if (this.f27313i == null) {
            this.f27313i = new Paint(2);
        }
        return this.f27313i;
    }

    public final void d() {
        e.a(!this.f27308d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f27305a.f27315a.f27317a.d() == 1) {
            invalidateSelf();
        } else if (!this.f27306b) {
            this.f27306b = true;
            g gVar = this.f27305a.f27315a;
            if (gVar.f27326j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!gVar.f27319c.contains(this)) {
                boolean isEmpty = gVar.f27319c.isEmpty();
                gVar.f27319c.add(this);
                if (isEmpty && !gVar.f27322f) {
                    gVar.f27322f = true;
                    gVar.f27326j = false;
                    gVar.a();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f27308d) {
            if (this.f27312h) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f27314r == null) {
                    this.f27314r = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f27314r);
                this.f27312h = false;
            }
            g gVar = this.f27305a.f27315a;
            g.a aVar = gVar.f27325i;
            if (aVar != null) {
                bitmap = aVar.f27337g;
            } else {
                bitmap = gVar.f27328l;
            }
            if (this.f27314r == null) {
                this.f27314r = new Rect();
            }
            canvas.drawBitmap(bitmap, (Rect) null, this.f27314r, c());
        }
    }

    public final void e() {
        this.f27306b = false;
        g gVar = this.f27305a.f27315a;
        gVar.f27319c.remove(this);
        if (gVar.f27319c.isEmpty()) {
            gVar.f27322f = false;
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f27305a;
    }

    public int getIntrinsicHeight() {
        return this.f27305a.f27315a.f27333q;
    }

    public int getIntrinsicWidth() {
        return this.f27305a.f27315a.f27332p;
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f27306b;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27312h = true;
    }

    public void setAlpha(int i10) {
        c().setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        e.a(!this.f27308d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f27309e = z10;
        if (!z10) {
            e();
        } else if (this.f27307c) {
            d();
        }
        return super.setVisible(z10, z11);
    }

    public void start() {
        this.f27307c = true;
        this.f27310f = 0;
        if (this.f27309e) {
            d();
        }
    }

    public void stop() {
        this.f27307c = false;
        e();
    }
}
