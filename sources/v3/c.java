package v3;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource */
public final class c extends b<Drawable> {
    public c(Drawable drawable) {
        super(drawable);
    }

    public int a() {
        return Math.max(1, this.f26373a.getIntrinsicHeight() * this.f26373a.getIntrinsicWidth() * 4);
    }

    public Class<Drawable> b() {
        return this.f26373a.getClass();
    }

    public void c() {
    }
}
