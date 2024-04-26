package x3;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import java.security.MessageDigest;
import k3.g;
import m3.w;
import t3.d;

/* compiled from: GifDrawableTransformation */
public class f implements g<c> {

    /* renamed from: b  reason: collision with root package name */
    public final g<Bitmap> f27316b;

    public f(g<Bitmap> gVar) {
        if (gVar != null) {
            this.f27316b = gVar;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public void a(MessageDigest messageDigest) {
        this.f27316b.a(messageDigest);
    }

    public w<c> b(Context context, w<c> wVar, int i10, int i11) {
        c cVar = wVar.get();
        d dVar = new d(cVar.b(), b.b(context).f4883a);
        w<Bitmap> b10 = this.f27316b.b(context, dVar, i10, i11);
        if (!dVar.equals(b10)) {
            dVar.c();
        }
        g<Bitmap> gVar = this.f27316b;
        cVar.f27305a.f27315a.c(gVar, b10.get());
        return wVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f27316b.equals(((f) obj).f27316b);
        }
        return false;
    }

    public int hashCode() {
        return this.f27316b.hashCode();
    }
}
