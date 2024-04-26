package t3;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import k3.c;
import n3.e;

/* compiled from: FitCenter */
public class p extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f25652b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(c.f19887a);

    public void a(MessageDigest messageDigest) {
        messageDigest.update(f25652b);
    }

    public Bitmap c(e eVar, Bitmap bitmap, int i10, int i11) {
        return y.b(eVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof p;
    }

    public int hashCode() {
        return 1572326941;
    }
}
