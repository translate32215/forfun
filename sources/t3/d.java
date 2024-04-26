package t3;

import android.graphics.Bitmap;
import g4.j;
import m3.s;
import m3.w;
import n3.e;

/* compiled from: BitmapResource */
public class d implements w<Bitmap>, s {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f25618a;

    /* renamed from: b  reason: collision with root package name */
    public final e f25619b;

    public d(Bitmap bitmap, e eVar) {
        if (bitmap != null) {
            this.f25618a = bitmap;
            if (eVar != null) {
                this.f25619b = eVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static d d(Bitmap bitmap, e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new d(bitmap, eVar);
    }

    public void P() {
        this.f25618a.prepareToDraw();
    }

    public int a() {
        return j.d(this.f25618a);
    }

    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    public void c() {
        this.f25619b.b(this.f25618a);
    }

    public Object get() {
        return this.f25618a;
    }
}
