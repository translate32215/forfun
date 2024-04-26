package t3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import k3.c;
import n3.e;

/* compiled from: CenterCrop */
public class h extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f25622b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(c.f19887a);

    public void a(MessageDigest messageDigest) {
        messageDigest.update(f25622b);
    }

    public Bitmap c(e eVar, Bitmap bitmap, int i10, int i11) {
        float f10;
        float f11;
        Paint paint = y.f25686a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            f11 = ((float) i11) / ((float) bitmap.getHeight());
            f12 = (((float) i10) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i10) / ((float) bitmap.getWidth());
            f10 = (((float) i11) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        Bitmap a10 = eVar.a(i10, i11, y.c(bitmap));
        a10.setHasAlpha(bitmap.hasAlpha());
        y.a(bitmap, a10, matrix);
        return a10;
    }

    public boolean equals(Object obj) {
        return obj instanceof h;
    }

    public int hashCode() {
        return -599754482;
    }
}
