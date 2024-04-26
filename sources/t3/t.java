package t3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import m3.s;
import m3.w;

/* compiled from: LazyBitmapDrawableResource */
public final class t implements w<BitmapDrawable>, s {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f25671a;

    /* renamed from: b  reason: collision with root package name */
    public final w<Bitmap> f25672b;

    public t(Resources resources, w<Bitmap> wVar) {
        if (resources != null) {
            this.f25671a = resources;
            this.f25672b = wVar;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public static w<BitmapDrawable> d(Resources resources, w<Bitmap> wVar) {
        if (wVar == null) {
            return null;
        }
        return new t(resources, wVar);
    }

    public void P() {
        w<Bitmap> wVar = this.f25672b;
        if (wVar instanceof s) {
            ((s) wVar).P();
        }
    }

    public int a() {
        return this.f25672b.a();
    }

    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    public void c() {
        this.f25672b.c();
    }

    public Object get() {
        return new BitmapDrawable(this.f25671a, this.f25672b.get());
    }
}
