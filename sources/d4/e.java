package d4;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import e4.b;

/* compiled from: ImageViewTarget */
public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: c  reason: collision with root package name */
    public Animatable f12965c;

    public e(ImageView imageView) {
        super(imageView);
    }

    public void Z() {
        Animatable animatable = this.f12965c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void c(Drawable drawable) {
        j((Object) null);
        ((ImageView) this.f12966a).setImageDrawable(drawable);
    }

    public void d(Z z10, b<? super Z> bVar) {
        j(z10);
    }

    public void e(Drawable drawable) {
        j((Object) null);
        ((ImageView) this.f12966a).setImageDrawable(drawable);
    }

    public void h(Drawable drawable) {
        this.f12967b.a();
        Animatable animatable = this.f12965c;
        if (animatable != null) {
            animatable.stop();
        }
        j((Object) null);
        ((ImageView) this.f12966a).setImageDrawable(drawable);
    }

    public abstract void i(Z z10);

    public final void j(Z z10) {
        i(z10);
        if (z10 instanceof Animatable) {
            Animatable animatable = (Animatable) z10;
            this.f12965c = animatable;
            animatable.start();
            return;
        }
        this.f12965c = null;
    }

    public void v0() {
        Animatable animatable = this.f12965c;
        if (animatable != null) {
            animatable.start();
        }
    }
}
