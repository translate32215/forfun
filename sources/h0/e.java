package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState */
public final class e extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f18778a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f18779b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f18780c = null;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f18781d = c.f18770g;

    public e(e eVar) {
        if (eVar != null) {
            this.f18778a = eVar.f18778a;
            this.f18779b = eVar.f18779b;
            this.f18780c = eVar.f18780c;
            this.f18781d = eVar.f18781d;
        }
    }

    public int getChangingConfigurations() {
        int i10 = this.f18778a;
        Drawable.ConstantState constantState = this.f18779b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new d(this, resources);
        }
        return new c(this, resources);
    }
}
