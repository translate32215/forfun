package h;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* compiled from: DrawableWrapper */
public class d extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f18755a;

    public d(Drawable drawable) {
        Drawable drawable2 = this.f18755a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f18755a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public int getChangingConfigurations() {
        return this.f18755a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f18755a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f18755a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f18755a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f18755a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f18755a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f18755a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f18755a.getPadding(rect);
    }

    public int[] getState() {
        return this.f18755a.getState();
    }

    public Region getTransparentRegion() {
        return this.f18755a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.f(this.f18755a);
    }

    public boolean isStateful() {
        return this.f18755a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f18755a.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f18755a.setBounds(rect);
    }

    public boolean onLevelChange(int i10) {
        return this.f18755a.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f18755a.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        a.g(this.f18755a, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f18755a.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f18755a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f18755a.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f18755a.setFilterBitmap(z10);
    }

    public void setTint(int i10) {
        a.k(this.f18755a, i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.l(this.f18755a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.m(this.f18755a, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f18755a.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
