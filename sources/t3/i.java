package t3;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import k3.c;
import n3.e;

/* compiled from: CenterInside */
public class i extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f25623b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(c.f19887a);

    public void a(MessageDigest messageDigest) {
        messageDigest.update(f25623b);
    }

    public Bitmap c(e eVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = y.f25686a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return y.b(eVar, bitmap, i10, i11);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    public int hashCode() {
        return -670243078;
    }
}
