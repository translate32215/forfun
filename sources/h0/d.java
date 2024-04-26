package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21 */
public class d extends c {

    /* renamed from: h  reason: collision with root package name */
    public static Method f18777h;

    public d(Drawable drawable) {
        super(drawable);
        e();
    }

    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f18776f;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (f18777h == null) {
            try {
                f18777h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    public Rect getDirtyBounds() {
        return this.f18776f.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f18776f.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f18776f;
        if (!(drawable == null || (method = f18777h) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
            }
        }
        return false;
    }

    public void setHotspot(float f10, float f11) {
        this.f18776f.setHotspot(f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f18776f.setHotspotBounds(i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.f18776f.setTint(i10);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            this.f18774d.f18780c = colorStateList;
            d(getState());
            return;
        }
        this.f18776f.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.f18774d.f18781d = mode;
            d(getState());
            return;
        }
        this.f18776f.setTintMode(mode);
    }

    public d(e eVar, Resources resources) {
        super(eVar, resources);
        e();
    }
}
