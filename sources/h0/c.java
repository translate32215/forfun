package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* compiled from: WrappedDrawableApi14 */
public class c extends Drawable implements Drawable.Callback, b, a {

    /* renamed from: g  reason: collision with root package name */
    public static final PorterDuff.Mode f18770g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f18771a;

    /* renamed from: b  reason: collision with root package name */
    public PorterDuff.Mode f18772b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18773c;

    /* renamed from: d  reason: collision with root package name */
    public e f18774d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18775e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f18776f;

    public c(e eVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f18774d = eVar;
        if (eVar != null && (constantState = eVar.f18779b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f18776f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f18776f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            e eVar = this.f18774d;
            if (eVar != null) {
                eVar.f18779b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f18776f;
    }

    public boolean c() {
        return true;
    }

    public final boolean d(int[] iArr) {
        if (!c()) {
            return false;
        }
        e eVar = this.f18774d;
        ColorStateList colorStateList = eVar.f18780c;
        PorterDuff.Mode mode = eVar.f18781d;
        if (colorStateList == null || mode == null) {
            this.f18773c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f18773c && colorForState == this.f18771a && mode == this.f18772b)) {
                setColorFilter(colorForState, mode);
                this.f18771a = colorForState;
                this.f18772b = mode;
                this.f18773c = true;
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        this.f18776f.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        e eVar = this.f18774d;
        return changingConfigurations | (eVar != null ? eVar.getChangingConfigurations() : 0) | this.f18776f.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        e eVar = this.f18774d;
        if (eVar == null) {
            return null;
        }
        if (!(eVar.f18779b != null)) {
            return null;
        }
        eVar.f18778a = getChangingConfigurations();
        return this.f18774d;
    }

    public Drawable getCurrent() {
        return this.f18776f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f18776f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f18776f.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.e(this.f18776f);
    }

    public int getMinimumHeight() {
        return this.f18776f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f18776f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f18776f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f18776f.getPadding(rect);
    }

    public int[] getState() {
        return this.f18776f.getState();
    }

    public Region getTransparentRegion() {
        return this.f18776f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.f(this.f18776f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f18774d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            h0.e r0 = r1.f18774d
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f18780c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f18776f
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.c.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f18776f.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f18775e && super.mutate() == this) {
            this.f18774d = new e(this.f18774d);
            Drawable drawable = this.f18776f;
            if (drawable != null) {
                drawable.mutate();
            }
            e eVar = this.f18774d;
            if (eVar != null) {
                Drawable drawable2 = this.f18776f;
                eVar.f18779b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f18775e = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18776f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        return a.j(this.f18776f, i10);
    }

    public boolean onLevelChange(int i10) {
        return this.f18776f.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f18776f.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        a.g(this.f18776f, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f18776f.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f18776f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f18776f.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f18776f.setFilterBitmap(z10);
    }

    public boolean setState(int[] iArr) {
        return d(iArr) || this.f18776f.setState(iArr);
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f18774d.f18780c = colorStateList;
        d(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f18774d.f18781d = mode;
        d(getState());
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f18776f.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public c(Drawable drawable) {
        this.f18774d = new e(this.f18774d);
        a(drawable);
    }
}
