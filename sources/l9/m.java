package l9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import g0.b;
import java.util.WeakHashMap;
import o0.c0;
import o0.o0;
import o0.s;

/* compiled from: ScrimInsetsFrameLayout */
public class m extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f21152a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f21153b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f21154c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21155d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21156e;

    /* compiled from: ScrimInsetsFrameLayout */
    public class a implements s {
        public a() {
        }

        public o0 a(View view, o0 o0Var) {
            m mVar = m.this;
            if (mVar.f21153b == null) {
                mVar.f21153b = new Rect();
            }
            m.this.f21153b.set(o0Var.d(), o0Var.f(), o0Var.e(), o0Var.c());
            m.this.a(o0Var);
            m mVar2 = m.this;
            boolean z10 = true;
            if ((!o0Var.f22597a.j().equals(b.f18354e)) && m.this.f21152a != null) {
                z10 = false;
            }
            mVar2.setWillNotDraw(z10);
            m mVar3 = m.this;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.k(mVar3);
            return o0Var.a();
        }
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(o0 o0Var) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f21153b != null && this.f21152a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f21155d) {
                this.f21154c.set(0, 0, width, this.f21153b.top);
                this.f21152a.setBounds(this.f21154c);
                this.f21152a.draw(canvas);
            }
            if (this.f21156e) {
                this.f21154c.set(0, height - this.f21153b.bottom, width, height);
                this.f21152a.setBounds(this.f21154c);
                this.f21152a.draw(canvas);
            }
            Rect rect = this.f21154c;
            Rect rect2 = this.f21153b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f21152a.setBounds(this.f21154c);
            this.f21152a.draw(canvas);
            Rect rect3 = this.f21154c;
            Rect rect4 = this.f21153b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f21152a.setBounds(this.f21154c);
            this.f21152a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f21152a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f21152a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f21156e = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f21155d = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f21152a = drawable;
    }

    public m(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21154c = new Rect();
        this.f21155d = true;
        this.f21156e = true;
        int[] iArr = t8.a.E;
        r.a(context, attributeSet, i10, 2132083559);
        r.b(context, attributeSet, iArr, i10, 2132083559, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 2132083559);
        this.f21152a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        c0.J(this, new a());
    }
}
