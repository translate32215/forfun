package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.List;
import o0.c0;

class ClockHandView extends View {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f9575w = 0;

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f9576a;

    /* renamed from: b  reason: collision with root package name */
    public float f9577b;

    /* renamed from: c  reason: collision with root package name */
    public float f9578c;

    /* renamed from: d  reason: collision with root package name */
    public int f9579d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c> f9580e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final int f9581f;

    /* renamed from: g  reason: collision with root package name */
    public final float f9582g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f9583h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f9584i;

    /* renamed from: r  reason: collision with root package name */
    public final int f9585r;

    /* renamed from: s  reason: collision with root package name */
    public float f9586s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9587t;

    /* renamed from: u  reason: collision with root package name */
    public double f9588u;

    /* renamed from: v  reason: collision with root package name */
    public int f9589v;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i10 = ClockHandView.f9575w;
            clockHandView.c(floatValue, true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f9583h = paint;
        this.f9584i = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.f25843j, R.attr.materialClockStyle, 2132083888);
        this.f9589v = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f9581f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f9585r = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f9582g = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f, false);
        this.f9579d = ViewConfiguration.get(context).getScaledTouchSlop();
        c0.I(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f11 - ((float) (getHeight() / 2))), (double) (f10 - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public void b(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f9576a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            c(f10, false);
            return;
        }
        float f11 = this.f9586s;
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f11), Float.valueOf(f10));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()});
        this.f9576a = ofFloat;
        ofFloat.setDuration(200);
        this.f9576a.addUpdateListener(new a());
        this.f9576a.addListener(new b(this));
        this.f9576a.start();
    }

    public final void c(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f9586s = f11;
        this.f9588u = Math.toRadians((double) (f11 - 90.0f));
        float cos = (((float) this.f9589v) * ((float) Math.cos(this.f9588u))) + ((float) (getWidth() / 2));
        float sin = (((float) this.f9589v) * ((float) Math.sin(this.f9588u))) + ((float) (getHeight() / 2));
        RectF rectF = this.f9584i;
        int i10 = this.f9581f;
        rectF.set(cos - ((float) i10), sin - ((float) i10), cos + ((float) i10), sin + ((float) i10));
        for (c a10 : this.f9580e) {
            a10.a(f11, z10);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = (float) width;
        float f11 = (float) height;
        this.f9583h.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f9589v) * ((float) Math.cos(this.f9588u))) + f10, (((float) this.f9589v) * ((float) Math.sin(this.f9588u))) + f11, (float) this.f9581f, this.f9583h);
        double sin = Math.sin(this.f9588u);
        double cos = Math.cos(this.f9588u);
        double d10 = (double) ((float) (this.f9589v - this.f9581f));
        Double.isNaN(d10);
        Double.isNaN(d10);
        float f12 = (float) (width + ((int) (cos * d10)));
        Double.isNaN(d10);
        Double.isNaN(d10);
        float f13 = (float) (height + ((int) (d10 * sin)));
        this.f9583h.setStrokeWidth((float) this.f9585r);
        canvas.drawLine(f10, f11, f12, f13, this.f9583h);
        canvas.drawCircle(f10, f11, this.f9582g, this.f9583h);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b(this.f9586s, false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z11 = this.f9587t;
            } else {
                z11 = false;
            }
            z10 = false;
        } else {
            this.f9577b = x10;
            this.f9578c = y10;
            this.f9587t = false;
            z11 = false;
            z10 = true;
        }
        boolean z13 = this.f9587t;
        float a10 = (float) a(x10, y10);
        boolean z14 = this.f9586s != a10;
        if (!z10 || !z14) {
            if (z14 || z11) {
                b(a10, false);
            }
            this.f9587t = z13 | z12;
            return true;
        }
        z12 = true;
        this.f9587t = z13 | z12;
        return true;
    }
}
