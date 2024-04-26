package n3;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter */
public class f implements e {
    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    public void c(int i10) {
    }

    public void d() {
    }

    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }
}
