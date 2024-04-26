package t3;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import g4.j;
import k3.g;
import m3.w;

/* compiled from: BitmapTransformation */
public abstract class e implements g<Bitmap> {
    public final w<Bitmap> b(Context context, w<Bitmap> wVar, int i10, int i11) {
        if (j.j(i10, i11)) {
            n3.e eVar = b.b(context).f4883a;
            Bitmap bitmap = wVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(eVar, bitmap, i10, i11);
            return bitmap.equals(c10) ? wVar : d.d(c10, eVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(n3.e eVar, Bitmap bitmap, int i10, int i11);
}
