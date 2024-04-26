package v3;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import m3.s;
import m3.w;
import x3.c;

/* compiled from: DrawableResource */
public abstract class b<T extends Drawable> implements w<T>, s {

    /* renamed from: a  reason: collision with root package name */
    public final T f26373a;

    public b(T t10) {
        if (t10 != null) {
            this.f26373a = t10;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void P() {
        T t10 = this.f26373a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof c) {
            ((c) t10).b().prepareToDraw();
        }
    }

    public Object get() {
        Drawable.ConstantState constantState = this.f26373a.getConstantState();
        if (constantState == null) {
            return this.f26373a;
        }
        return constantState.newDrawable();
    }
}
