package t3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import java.security.MessageDigest;
import k3.g;
import m3.w;
import n3.e;

/* compiled from: DrawableTransformation */
public class n implements g<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final g<Bitmap> f25650b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f25651c;

    public n(g<Bitmap> gVar, boolean z10) {
        this.f25650b = gVar;
        this.f25651c = z10;
    }

    public void a(MessageDigest messageDigest) {
        this.f25650b.a(messageDigest);
    }

    public w<Drawable> b(Context context, w<Drawable> wVar, int i10, int i11) {
        e eVar = b.b(context).f4883a;
        Drawable drawable = wVar.get();
        w<Bitmap> a10 = m.a(eVar, drawable, i10, i11);
        if (a10 != null) {
            w<Bitmap> b10 = this.f25650b.b(context, a10, i10, i11);
            if (!b10.equals(a10)) {
                return t.d(context.getResources(), b10);
            }
            b10.c();
            return wVar;
        } else if (!this.f25651c) {
            return wVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f25650b.equals(((n) obj).f25650b);
        }
        return false;
    }

    public int hashCode() {
        return this.f25650b.hashCode();
    }
}
