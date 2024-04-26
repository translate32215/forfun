package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.startapp.startappsdk.R;

/* compiled from: ShadowOverlayContainer */
public class d1 extends FrameLayout {

    /* renamed from: r  reason: collision with root package name */
    public static final Rect f2338r = new Rect();

    /* renamed from: a  reason: collision with root package name */
    public boolean f2339a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2340b;

    /* renamed from: c  reason: collision with root package name */
    public View f2341c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2342d;

    /* renamed from: e  reason: collision with root package name */
    public int f2343e = 1;

    /* renamed from: f  reason: collision with root package name */
    public float f2344f;

    /* renamed from: g  reason: collision with root package name */
    public float f2345g;

    /* renamed from: h  reason: collision with root package name */
    public Paint f2346h;

    /* renamed from: i  reason: collision with root package name */
    public int f2347i;

    public d1(Context context, int i10, boolean z10, float f10, float f11, int i11) {
        super(context);
        k1 k1Var;
        this.f2344f = f10;
        this.f2345g = f11;
        if (!this.f2339a) {
            this.f2339a = true;
            this.f2342d = i11 > 0;
            this.f2343e = i10;
            if (i10 == 2) {
                if (Build.VERSION.SDK_INT >= 21) {
                    setLayoutMode(1);
                    LayoutInflater.from(getContext()).inflate(R.layout.lb_shadow, this, true);
                    k1Var = new k1();
                    k1Var.f2408a = findViewById(R.id.lb_shadow_normal);
                    k1Var.f2409b = findViewById(R.id.lb_shadow_focused);
                } else {
                    k1Var = null;
                }
                this.f2340b = k1Var;
            } else if (i10 == 3) {
                this.f2340b = b1.a(this, f10, f11, i11);
            }
            if (z10) {
                setWillNotDraw(false);
                this.f2347i = 0;
                Paint paint = new Paint();
                this.f2346h = paint;
                paint.setColor(this.f2347i);
                this.f2346h.setStyle(Paint.Style.FILL);
                return;
            }
            setWillNotDraw(true);
            this.f2346h = null;
            return;
        }
        throw new IllegalStateException();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2346h != null && this.f2347i != 0) {
            canvas.drawRect((float) this.f2341c.getLeft(), (float) this.f2341c.getTop(), (float) this.f2341c.getRight(), (float) this.f2341c.getBottom(), this.f2346h);
        }
    }

    public int getShadowType() {
        return this.f2343e;
    }

    public View getWrappedView() {
        return this.f2341c;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && (view = this.f2341c) != null) {
            Rect rect = f2338r;
            rect.left = (int) view.getPivotX();
            rect.top = (int) this.f2341c.getPivotY();
            offsetDescendantRectToMyCoords(this.f2341c, rect);
            setPivotX((float) rect.left);
            setPivotY((float) rect.top);
        }
    }

    public void setOverlayColor(int i10) {
        Paint paint = this.f2346h;
        if (paint != null && i10 != this.f2347i) {
            this.f2347i = i10;
            paint.setColor(i10);
            invalidate();
        }
    }

    public void setShadowFocusLevel(float f10) {
        Object obj = this.f2340b;
        if (obj != null) {
            e1.c(obj, this.f2343e, f10);
        }
    }
}
