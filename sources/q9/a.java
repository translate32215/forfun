package q9;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import s9.f;
import s9.i;
import s9.m;

/* compiled from: RippleDrawableCompat */
public class a extends Drawable implements m, h0.a {

    /* renamed from: a  reason: collision with root package name */
    public b f24229a;

    public a(i iVar) {
        this.f24229a = new b(new f(iVar));
    }

    public void draw(Canvas canvas) {
        b bVar = this.f24229a;
        if (bVar.f24231b) {
            bVar.f24230a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f24229a;
    }

    public int getOpacity() {
        return this.f24229a.f24230a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        this.f24229a = new b(this.f24229a);
        return this;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f24229a.f24230a.setBounds(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f24229a.f24230a.setState(iArr)) {
            onStateChange = true;
        }
        boolean d10 = b.d(iArr);
        b bVar = this.f24229a;
        if (bVar.f24231b == d10) {
            return onStateChange;
        }
        bVar.f24231b = d10;
        return true;
    }

    public void setAlpha(int i10) {
        this.f24229a.f24230a.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24229a.f24230a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(i iVar) {
        f fVar = this.f24229a.f24230a;
        fVar.f25079a.f25098a = iVar;
        fVar.invalidateSelf();
    }

    public void setTint(int i10) {
        this.f24229a.f24230a.setTint(i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f24229a.f24230a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f24229a.f24230a.setTintMode(mode);
    }

    /* compiled from: RippleDrawableCompat */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public f f24230a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f24231b;

        public b(f fVar) {
            this.f24230a = fVar;
            this.f24231b = false;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new a(new b(this), (C0226a) null);
        }

        public b(b bVar) {
            this.f24230a = (f) bVar.f24230a.f25079a.newDrawable();
            this.f24231b = bVar.f24231b;
        }
    }

    public a(b bVar, C0226a aVar) {
        this.f24229a = bVar;
    }
}
